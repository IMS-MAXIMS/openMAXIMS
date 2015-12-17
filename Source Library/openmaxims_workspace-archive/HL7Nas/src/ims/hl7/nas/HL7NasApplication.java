//#############################################################################
//#                                                                           #
//#  Copyright (C) <2014>  <IMS MAXIMS>                                       #
//#                                                                           #
//#  This program is free software: you can redistribute it and/or modify     #
//#  it under the terms of the GNU Affero General Public License as           #
//#  published by the Free Software Foundation, either version 3 of the       #
//#  License, or (at your option) any later version.                          # 
//#                                                                           #
//#  This program is distributed in the hope that it will be useful,          #
//#  but WITHOUT ANY WARRANTY; without even the implied warranty of           #
//#  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the            #
//#  GNU Affero General Public License for more details.                      #
//#                                                                           #
//#  You should have received a copy of the GNU Affero General Public License #
//#  along with this program.  If not, see <http://www.gnu.org/licenses/>.    #
//#                                                                           #
//#############################################################################
//#EOH
package ims.hl7.nas;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.log4j.Logger;

import ims.utils.Logging;

import ims.configuration.gen.ConfigFlag;
import ims.framework.utils.DateTime;
import ims.framework.utils.DateTimeFormat;
import ims.hl7.nas.mapping.NasMapper;
import ims.hl7.nas.mapping.V231NasMapper;

import ims.hl7.utils.EvnCodes;
import ims.hl7.utils.HL7Errors;
import ims.hl7.utils.HL7Utils;
import ims.hl7.utils.SegName;
import imsmaxims.common.ImsNasClient;
import imsmaxims.common.ImsNasMsg;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.app.Application;
import ca.uhn.hl7v2.app.ApplicationException;
import ca.uhn.hl7v2.model.Message;

import ca.uhn.hl7v2.parser.GenericParser;

public class HL7NasApplication implements Application
{
	protected static final Logger		LOG		= Logging.getLogger(HL7NasApplication.class);
	protected  static Map nasMappers = new HashMap();
	private static final String     FILE_SEPARATOR = "__";  
	private static final String[] months = {"", "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};

	public HL7NasApplication()
	{
		loadNasMapper(EvnCodes.A01);
		loadNasMapper(EvnCodes.A02);
		loadNasMapper(EvnCodes.A03);
		loadNasMapper(EvnCodes.A04);
		loadNasMapper(EvnCodes.A05);		
		loadNasMapper(EvnCodes.A08);
		loadNasMapper(EvnCodes.A11);
		loadNasMapper(EvnCodes.A12);
		loadNasMapper(EvnCodes.A13);		
		loadNasMapper(EvnCodes.A23);
		loadNasMapper(EvnCodes.A28);
		loadNasMapper(EvnCodes.A29);		
		loadNasMapper(EvnCodes.A31);
		loadNasMapper(EvnCodes.A34);
		loadNasMapper(EvnCodes.A38);		
		loadNasMapper(EvnCodes.A40);
		loadNasMapper(EvnCodes.A47);		
		loadNasMapper(EvnCodes.M01);		
		loadNasMapper(EvnCodes.R01);
		loadNasMapper(EvnCodes.M02);
		loadNasMapper(EvnCodes.M05);
		loadNasMapper(EvnCodes.A60);
		
		loadV231NasMapper(EvnCodes.A19);
		loadV231NasMapper(EvnCodes.A28);
		loadV231NasMapper(EvnCodes.A31);
		loadV231NasMapper(EvnCodes.S12);
		loadV231NasMapper(EvnCodes.S13);
		loadV231NasMapper(EvnCodes.S14);
		loadV231NasMapper(EvnCodes.S15);
		loadV231NasMapper(EvnCodes.S26);
	}

	public synchronized Message processMessage(Message msg) throws ApplicationException, HL7Exception
	{
		GenericParser parser = new GenericParser();
		
		Message ack = null;
		ImsNasMsg nasMsg = null;
		NasMapper mapper = null;
		V231NasMapper v231mapper = null;
		ImsNasClient client = null;
		try
		{
			LOG.info("Start Processing Message. " + msg.getName());
			LOG.debug("Incoming message. " + parser.encode(msg));
			
			if (!HL7Utils.versionSupported(msg))
			{
				ack = HL7Utils.buildRejAck(msg.get(SegName.MSH), "Version " + HL7Utils.getVersion(msg) + " is not supported. ", HL7Errors.UNSUPP_VERSION);
			}
			else
			{
				String evnCode = HL7Utils.getEventCode(msg);				
				String version = HL7Utils.getVersion(msg);
				
				//Mullingar/Kodak PAS Query and CCO Patient Diary interfaces are v2.3.1
				if (version.equals("2.3.1"))
				{
					evnCode = "V231" + evnCode;
					v231mapper = (V231NasMapper)nasMappers.get(evnCode);
				}
				else
				{
					mapper = (NasMapper)nasMappers.get(evnCode);
				}
				if (mapper == null && v231mapper == null)
				{
					ack = HL7Utils.buildRejAck(msg.get(SegName.MSH), "No NAS Mapper found for event code " + evnCode, HL7Errors.UNSUPP_EVN_CODE);				
				}
				else
				{
					client = ConnectionManager.getInstance().getConnection();
					if (mapper != null)
					{
						mapper.setConnection(client);
						nasMsg = mapper.translate(msg);
					}
					else
					{
						v231mapper.setConnection(client);
						nasMsg = v231mapper.translate(msg);
					}
					
					if (nasMsg != null)
					{
						LOG.debug("ImsNasMsg Translated:" + nasMsg.toPrintString());
						StringBuffer outMess = new StringBuffer();
						StringBuffer errMess = new StringBuffer();
						int rv = client.sendClientRequest(nasMsg.toString(), outMess, errMess);
						if (rv < 0)
						{
							ack = HL7Utils.buildRejAck(msg.get(SegName.MSH), "Error occured at NAS server. " + errMess.toString(), rv);									
						}
						else
						{
							ack = HL7Utils.buildPosAck(msg.get(SegName.MSH));
							LOG.debug("NAS response was " + outMess.toString());
						}					
					}
					else if (evnCode.equals("A04") )
					{
						ack = HL7Utils.buildPosAck(msg.get(SegName.MSH));
					}
					else
					{						
						//ack = HL7Utils.buildRejAck(msg.get(SegName.MSH), "Null Message returned from NAS Mapper. Cannot process.", HL7Errors.APP_INT_ERROR);
						ack = HL7Utils.buildPosAck(msg.get(SegName.MSH)); //Nothing to do
					}
				}
				
			}
		}
		catch (HL7Exception hex)
		{
			LOG.info("HL7Exception occured. ",hex);
			try
			{
				ack = HL7Utils.buildRejAck(msg.get(SegName.MSH), "HL7Exception : " + hex.getMessage(), HL7Errors.APP_INT_ERROR);
			}
			catch (HL7Exception e)
			{
				throw new ApplicationException(hex.getMessage());
			}
		}
		catch (Exception ex)
		{
			LOG.info("Exception occured. ",ex);
			try
			{
				ack = HL7Utils.buildRejAck(msg.get(SegName.MSH), "Exception : " + ex.getMessage(), HL7Errors.APP_INT_ERROR);
			}
			catch (HL7Exception e)
			{
				throw new ApplicationException(ex.getMessage());
			}
		}
		finally
		{
			if (mapper != null)
			{
				mapper.setConnection(null);
				ConnectionManager.getInstance().freeConnection(client);
			}
			else if (v231mapper != null)
			{
				v231mapper.setConnection(null);
				ConnectionManager.getInstance().freeConnection(client);
			}
		}

		LOG.info("Finish Processing Message. " + msg.getName());
		
		String ackStr = parser.encode(ack);
		LOG.debug("Outgoing message. " + ackStr);
		int rv = MessageReviewManager.storeMessage(msg, nasMsg, ack);
		LOG.info(rv + " message now in review store.");
		
		if (isMessageToBeLogged())
		{
			String msgLocation = ConfigFlag.HL7.HL7_STORE_INBOUND_LOC.getValue();
						
			logMessage(parser.encode(msg), msg.getName(), msgLocation);
		}
		return ack;
	}
    
	protected boolean isMessageToBeLogged()
    {
    	return ConfigFlag.HL7.HL7_STORE_INBOUND_MSG.getValue();
    }
	
	protected static void logMessage(String message, String msgType, String msgLocation)
    {
    	try
		{
    		// File should be timestamped
    		DateTime tst = new DateTime(); 
    		
    		// WDEV-989 - messages are held in subfolders
	    	String month = months[tst.getDate().getMonth()];
	        String logFolder = msgLocation +  "/" + msgType + "/" +  tst.getDate().getYear() + "/" + month + "/" + tst.getDate().getDay();
	        File fileFolder = new File(logFolder);
	        if (!fileFolder.exists())
	        	fileFolder.mkdirs();
    		
    		String fileName = logFolder + "/" + tst.toString(DateTimeFormat.MILLI) + ".msg";
    		
    		File f = new File(fileName);
    		// Should always be unique, so append _instance until not found
    		int inst=1;
    		while (f.exists())
    		{
    			if (fileName.indexOf(FILE_SEPARATOR) < 0)
    				fileName = fileName.substring(0, fileName.indexOf(".msg")) + FILE_SEPARATOR + inst + ".msg";
    			else
    				fileName = fileName.substring(0, fileName.indexOf(FILE_SEPARATOR)) + FILE_SEPARATOR + inst + ".msg";
    			inst++;

    			f = new File(fileName);
    		}
    		FileOutputStream fout  = new FileOutputStream(f);
    		fout.write(message.getBytes());
			fout.close();
		}
		catch (IOException e)
		{
			LOG.error("IOException occurred storing log message - " + e.getMessage(), e);
		}
		
    }
	
	public boolean canProcess(Message in)
	{
		return true;
	}

	private void loadNasMapper(String eventCode)
	{
		try
		{			
			//Assume V2.4 but create a mapping entry for 2.3.1. anyway			
			Class c = Class.forName("ims.hl7.nas.mapping." + eventCode + "NasMapper");
			NasMapper mapper = (NasMapper)c.newInstance();
			nasMappers.put(eventCode, mapper);
		}
		catch (ClassNotFoundException e)
		{
			LOG.warn("NAS Mapper class not found for event code " + eventCode + ". " + e.getMessage());			
		}
		catch (InstantiationException e)
		{
			LOG.warn("Could not instantiate NAS Mapper class for event code " + eventCode + ". " + e.getMessage(), e);			
		}
		catch (IllegalAccessException e)
		{
			LOG.warn("IllegalAccessException trying to instantiate NAS Mapper class for event code " + eventCode + ". " + e.getMessage(), e);			
		}		
	}
	private void loadV231NasMapper(String eventCode)
	{
		try
		{			
			eventCode = "V231" + eventCode;
			Class c = Class.forName("ims.hl7.nas.mapping." + eventCode + "NasMapper");
			V231NasMapper V231mapper = (V231NasMapper)c.newInstance();
			nasMappers.put(eventCode, V231mapper);
		}
		catch (ClassNotFoundException e)
		{
			LOG.warn("NAS Mapper class not found for event code " + eventCode + ". " + e.getMessage());			
		}
		catch (InstantiationException e)
		{
			LOG.warn("Could not instantiate NAS Mapper class for event code " + eventCode + ". " + e.getMessage(), e);			
		}
		catch (IllegalAccessException e)
		{
			LOG.warn("IllegalAccessException trying to instantiate NAS Mapper class for event code " + eventCode + ". " + e.getMessage(), e);			
		}		
	}
	
	public static NasMapper getNasMapper(String eventCode)
	{
		return (NasMapper)nasMappers.get(eventCode);
	}
	
	public static String[] getMappedEvents()
	{
		String[] ret = new String[nasMappers.size()];
		Iterator iter = nasMappers.keySet().iterator();
		int i = 0;
		while (iter.hasNext())
		{
			String key = (String)iter.next();
			ret[i] = key;
			i++;
		}
		return ret;
	}
}
