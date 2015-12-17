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

import ims.clinical.vo.VTMVo;
import ims.configuration.gen.ConfigFlag;
import ims.configuration.EnvironmentConfig;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.exceptions.UniqueKeyViolationException;

public class VTMLoader extends DefaultHandler
{
	private VTMVo vtm = null;
	private String currentElement = null;
	private ims.admin.domain.DMDAdmin domainDMD;
	private static boolean loadErrors;
	File vtmLogFile;
	FileWriter vtmout;
	
  public VTMLoader() 
  {
	super();
	vtm = new VTMVo();
  }

public void loadFile(ims.admin.domain.DMDAdmin domain,String file) throws ParserConfigurationException, SAXException, IOException
  {
	domainDMD = domain;
	domainDMD.openLogFiles();
	
	currentElement = "";
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
	vtmLogFile = new File(tempDir + "/vtmloadLog.log");
	if (!vtmLogFile.exists())
		vtmLogFile.createNewFile();
	vtmout = new FileWriter(vtmLogFile);
	
	parser.parse(file, this);
	currentElement = "";
	loadErrors=false;

  }

private void closeVTMLoadLog() throws SAXException 
  {
	try {
		vtmout.flush();
		vtmout.close();
	} catch (IOException e) {			
			throw new SAXException(e.getMessage());
		}

  }
  public void characters(char[] ch, int start, int length) throws SAXException
  {
	  String value = new String( ch , start , length );
	  if(!value.trim().equals("")) 
	  {
		  if( currentElement.equalsIgnoreCase("VTMID") ) 
		  {
			  if (vtm==null)
				  vtm = new VTMVo();
			  vtm.setMoietyIdentifier(value);			  
		  }
		  else if( currentElement.equalsIgnoreCase("NM") ) 
		  {
			  vtm.setName(value);
		  }
		  else if( currentElement.equalsIgnoreCase("INVALID") ) 
		  {
			  if (value.equalsIgnoreCase("1"))
				  vtm.setInvalid(true);
			  else
				  vtm.setInvalid(false);
		  }		  		  
	  }
	  currentElement="";
  }

  public void endDocument() throws SAXException
  {	  
	  currentElement="";
	  if (loadErrors)
	  {
		  logVTMLoadError("Finished Load VTM with errors. Please refer to server log for more information");
		  closeVTMLoadLog();
		  domainDMD.closeLogFiles();
		  throw new SAXException("Finished Load VTM with errors. Please refer to server log for more information");
	  }
	  else
	  {
		  logVTMLoadError("Finished Load VTM Success.");
		  closeVTMLoadLog();
		  domainDMD.closeLogFiles();
		  throw new SAXException("Finished Load VTM Success.");
	  }	  
  }

  public void endElement(String uri, String localName, String qName) throws SAXException
  {
	  currentElement="";
	  if( qName.equalsIgnoreCase("VTM") )
	  {
		try {
			String[] arrErrors = saveVTM();
			if (arrErrors != null && arrErrors.length > 0)
			{
				StringBuffer sError = new StringBuffer();
				if (vtm.getNameIsNotNull())
					sError.append(vtm.getName());
				if (vtm.getMoietyIdentifierIsNotNull())
					sError.append(":" + vtm.getMoietyIdentifier()+ ":");				
				logVTMLoadError(sError + arrErrors[0]);
				loadErrors=true;
			}
		} catch (DomainInterfaceException e) {
			logVTMLoadError(e.getMessage());
			loadErrors=true;
		} catch (UniqueKeyViolationException e) {
			logVTMLoadError(e.getMessage());
			loadErrors=true;
		} catch (StaleObjectException e) {
			logVTMLoadError(e.getMessage());
			loadErrors=true;
		}		
		clearVTM();
	  }
  }
  
  private void logVTMLoadError(String errorMessage) throws SAXException {
		try {
			vtmout.write(errorMessage + "\r\n");
		} catch (IOException e1) {
			throw new SAXException(e1);
		}
	}
  
  private void clearVTM() 
  {
	vtm.setAbbreviatedName(null);
	vtm.setID_VTM(null);
	vtm.setInvalid(null);
	vtm.setIsRIE(null);
	vtm.setMoietyIdentifier(null);
	vtm.setName(null);	
}

private String[] saveVTM() throws UniqueKeyViolationException,DomainInterfaceException,StaleObjectException
  {
	  	if (vtm.getInvalid() == null)
	  		vtm.setInvalid(false); //invalid not supplied in data element so default to false
	  	
		String[] arrErrors = vtm.validate();
		if (arrErrors != null)
		{
			return arrErrors;
		}
		
		domainDMD.saveVTM(vtm);
		
		return null;
}

public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException
  {
	  if( qName.equalsIgnoreCase("VTM") )
	  {		  
		  currentElement = "VTM";
	  }	  
	  else if (qName.equals ("VTMID"))
      {
    	  currentElement = "VTMID";
      }
	  else if (qName.equals ("NM"))
      {
    	  currentElement = "NM";
      }    
	  else
		  currentElement = "";
  }
}
