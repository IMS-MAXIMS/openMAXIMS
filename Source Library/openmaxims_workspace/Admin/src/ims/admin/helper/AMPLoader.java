//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
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
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
package ims.admin.helper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler; 

import ims.clinical.vo.AMPVo;
import ims.clinical.vo.VMPVo;
import ims.configuration.gen.ConfigFlag;
import ims.configuration.EnvironmentConfig;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.exceptions.UniqueKeyViolationException;

public class AMPLoader extends DefaultHandler
{
	private AMPVo amp = null;
	private String currentElement = null;
	private ims.admin.domain.DMDAdmin domainDMD;
	private static boolean loadErrors;
	File ampLogFile;
	FileWriter ampout;
	
  public AMPLoader() 
  {
	super();
	amp = new AMPVo();
	loadErrors=false;
  }

public void loadFile(ims.admin.domain.DMDAdmin domain,String file) throws ParserConfigurationException, SAXException, IOException
  {
	domainDMD = domain;
	domainDMD.openLogFiles();	
	
	currentElement = "";
	
	//setup SAX parser
	System.setProperty("javax.xml.parsers.SAXParserFactory", "org.apache.xerces.jaxp.SAXParserFactoryImpl");
	SAXParserFactory parserFactory = SAXParserFactory.newInstance();
	parserFactory.setValidating(true);
	parserFactory.setNamespaceAware(true);
	parserFactory.setFeature("http://xml.org/sax/features/namespace-prefixes",true);
	SAXParser parser = parserFactory.newSAXParser();
	
	//setup log file
	String tempDir = EnvironmentConfig.getBaseUri() + ConfigFlag.GEN.FILE_UPLOAD_DIR.getValue() + "/log";
	File flDir = new File(tempDir);
	if (!flDir.exists())
		flDir.mkdirs();
	ampLogFile = new File(tempDir + "/amploadLog.log");
	if (!ampLogFile.exists())
		ampLogFile.createNewFile();
	ampout = new FileWriter(ampLogFile);
	
	ampout.write("Load Start: " + new ims.framework.utils.Date().toString());
	//Parse xml
	parser.parse(file, this);
	currentElement = "";
	loadErrors=false;

  }
  public void characters(char[] ch, int start, int length) throws SAXException
  {
	  String value = new String( ch , start , length );
	  if(!value.trim().equals("")) 
	  {
		  if( currentElement.equalsIgnoreCase("APID") ) 
		  {
			  amp.setProductIdentifier(value);
		  }
		  else if( currentElement.equalsIgnoreCase("DESC") ) 
		  {
			  amp.setName(value);
		  }
		  else if( currentElement.equalsIgnoreCase("VPID") ) 
		  {
			  try {
				  VMPVo ampVo = domainDMD.getVMP(value);
				  if (ampVo != null)
					  amp.setVMP(ampVo.toVMPRefVo());
			} catch (DomainInterfaceException e) {
				logAMPLoadError(e.getMessage());
				loadErrors=true;
			}
		  }		  
		  else if( currentElement.equalsIgnoreCase("INVALID") ) 
		  {
			  if (value.equalsIgnoreCase("1"))
				  amp.setInvalid(true);
			  else
				  amp.setInvalid(false);
		  }		  		  		  		  
	  }
	  currentElement="";
  }

  public void endDocument() throws SAXException
  {	  	  
	  currentElement="";
	  try {
		ampout.write("Load End: " + new ims.framework.utils.Date().toString());
	  } catch (IOException e) {
		  throw new SAXException(e.getMessage());
	  }
	  if (loadErrors)
	  {
		  logAMPLoadError("Finished Load AMP with errors. Please refer to server log for more information");
		  closeAMPLoadLog();
		  domainDMD.closeLogFiles();		  
		  throw new SAXException("Finished Load AMP with errors. Please refer to server log for more information");
	  }
	  else
	  {
		  logAMPLoadError("Finished Load AMP Success.");
		  closeAMPLoadLog();
		  domainDMD.closeLogFiles();
		  throw new SAXException("Finished Load AMP Success.");
	  }	  
  }

  private void closeAMPLoadLog() throws SAXException 
  {
	try {
		ampout.flush();
		ampout.close();
	} catch (IOException e) {			
			throw new SAXException(e.getMessage());
		}

  }

public void endElement(String uri, String localName, String qName) throws SAXException
  {
	currentElement="";
	if( qName.equalsIgnoreCase("AMP") )
	{
		try {
			String[] arrErrors = saveAMP();
			if (arrErrors != null && arrErrors.length > 0)
			{
				StringBuffer sError = new StringBuffer();
				if (amp.getNameIsNotNull())
					sError.append(amp.getName());
				if (amp.getProductIdentifierIsNotNull())
					sError.append(":" + amp.getProductIdentifier()+ ":");
				logAMPLoadError(sError + arrErrors[0]);
				loadErrors=true;
			}
		} catch (DomainInterfaceException e) {
			logAMPLoadError(e.getMessage());			
			loadErrors=true;
		} catch (UniqueKeyViolationException e) {
			logAMPLoadError(e.getMessage());
			loadErrors=true;
		} catch (StaleObjectException e) {
			logAMPLoadError(e.getMessage());										
			loadErrors=true;
		}		
		//clearout Vo for next element
		clearAmp();
	}
  }

private void logAMPLoadError(String errorMessage) throws SAXException {
	try {
		ampout.write(errorMessage + "\r\n");
	} catch (IOException e1) {
		throw new SAXException(e1);
	}
}
  
private void clearAmp() 
{
	amp.setID_AMP(null);
	amp.setAbbreviatedName(null);
	amp.setInvalid(null);
	amp.setIsRIE(null);
	amp.setName(null);
	amp.setProductIdentifier(null);
	amp.setVMP(null);
	
}

private String[] saveAMP() throws UniqueKeyViolationException,DomainInterfaceException,StaleObjectException
{
	  	if (amp.getInvalid() == null)
	  		amp.setInvalid(false); //invalid not supplied in data element so default to false
	  	
		String[] arrErrors = amp.validate();
		if (arrErrors != null)
		{
			return arrErrors;
		}
		
		domainDMD.saveAMP(amp);
		
		return null;
}

  public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException
  {
	  if( qName.equalsIgnoreCase("AMP") )
	  {		  
		  currentElement = "AMP";
	  }	  
	  else if (qName.equals ("APID"))
      {
    	  currentElement = "APID";
      }
	  else if (qName.equals ("VPID"))
      {
    	  currentElement = "VPID";
      }	  
	  else if (qName.equals ("DESC"))
      {
    	  currentElement = "DESC";
      }    
	  else
		  currentElement = "";
  }
}
