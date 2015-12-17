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
package ims.hl7.domain;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import ims.configuration.gen.ConfigFlag;
import ims.core.domain.HL7Query;
import ims.domain.DomainSession;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.impl.DomainImplFlyweightFactory;
import ims.framework.utils.DateTime;
import ims.framework.utils.DateTimeFormat;
import ims.hl7.utils.HL7Utils;
import ims.hl7.vo.HL7InboundSaveVo;
import ims.hl7.vo.HL7InboundVo;

import org.apache.log4j.Logger;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.parser.EncodingNotSupportedException;
import ca.uhn.hl7v2.parser.GenericParser;

public class HL7MessageParser extends GenericParser
{
	private static final Logger		LOG		= Logger.getLogger(HL7MessageParser.class);
	private static final String     FILE_SEPARATOR = "__";  
	private static final String[] months = {"", "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
	
	private DomainSession		sess = DomainSession.getSession();
	private HL7Query			hl7query;
	
	public HL7MessageParser() throws Exception
	{
		super();
		
		try
		{
			hl7query = (HL7Query) getDomainImpl("ims.core.domain.impl.HL7QueryImpl");
		}
		catch(Exception e)
		{
			throw new RuntimeException("Exception occurred creating HL7Query instance - " + e.getMessage(), e);
		}
	}
	
    public Message parse(String message) throws HL7Exception, EncodingNotSupportedException 
    {
		String msgLocation = ConfigFlag.HL7.HL7_STORE_INBOUND_LOC.getValue();

        Message msg;
		try
		{
			msg = super.parse(message);
			
			// FWB-26 Store and log message if requested through config flags
	    	if (isMessageToBeLogged())
	    		logMessage(message, HL7Utils.getMsgType(msg) + "_" + HL7Utils.getEventCode(msg), msgLocation);
	    	
	    	return msg;
		}
		catch (EncodingNotSupportedException e)
		{
			saveInboundMessage(message, e);
			
			if (isMessageToBeLogged())
	    		logMessage(message, "UNKNOWN", msgLocation);
			throw e;
		}
		catch (HL7Exception e)
		{
			saveInboundMessage(message, e);
			
			if (isMessageToBeLogged())
	    		logMessage(message, "UNKNOWN", msgLocation);
			throw e;
		}

    }
    
    private void saveInboundMessage(String message, Exception e) 
    {
    	HL7InboundSaveVo inboundMessage = new HL7InboundSaveVo();
    	
    	inboundMessage.setHL7Message(message);
    	
    	String errorMessage = (e != null ? e.toString() : null);
    	
    	if(errorMessage != null && errorMessage.length() > HL7InboundVo.getFailureMessageMaxLength())
    		inboundMessage.setFailureMessage("Message Rejected: " + errorMessage.substring(0, HL7InboundVo.getFailureMessageMaxLength() -1));
    	else
    		inboundMessage.setFailureMessage("Message Rejected: " + errorMessage);
    	
    	inboundMessage.setMessageDateTime(new DateTime());
    	
    	String[] validateErrors = inboundMessage.validate();
    	
    	if(validateErrors != null && validateErrors.length > 0)
    	{
    		LOG.error("HL7InboundVo has validation errors - " + getErrors(validateErrors));
    		return;
    	}
    	
		try 
		{
			hl7query.saveInboundHL7Message(inboundMessage);
		} 
		catch (DomainInterfaceException e1) 
		{
			LOG.error("DomainInterfaceException while trying to save HL7Inbound message.", e1);
		}
		catch (StaleObjectException e1) 
		{
			LOG.error("StaleObjectException while trying to save HL7Inbound message.", e1);
		}
	}

	private String getErrors(String[] validateErrors) 
	{
		if(validateErrors == null || validateErrors.length == 0)
			return null;
		
		String errors = "";
		
		for(int i=0; i<validateErrors.length; i++)
		{
			errors += validateErrors[i] + " ";
		}
		return errors;
	}

	private boolean isMessageToBeLogged()
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
    
    private Object getDomainImpl(String className) throws Exception
	{
		Class<?> implClass = Class.forName(className);
		DomainImplFlyweightFactory factory = DomainImplFlyweightFactory.getInstance();
		return factory.create(implClass, sess);
	}
}
