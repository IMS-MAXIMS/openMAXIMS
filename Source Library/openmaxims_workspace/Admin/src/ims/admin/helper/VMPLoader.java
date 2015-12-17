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

import ims.clinical.vo.VMPVo;
import ims.configuration.gen.ConfigFlag;
import ims.configuration.EnvironmentConfig;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.exceptions.UniqueKeyViolationException;
import ims.domain.exceptions.UnqViolationUncheckedException;

public class VMPLoader extends DefaultHandler
{
	private VMPVo vmp = null;
	private String currentElement = null;
	private ims.admin.domain.DMDAdmin domainDMD;
	private static boolean loadErrors;
	File vmpLogFile;
	FileWriter vmpout;

  public VMPLoader() 
  {
	super();
	vmp = new VMPVo();
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
	vmpLogFile = new File(tempDir + "/vmploadLog.log");
	if (!vmpLogFile.exists())
		vmpLogFile.createNewFile();
	vmpout = new FileWriter(vmpLogFile);
	
	parser.parse(file, this);
	currentElement = "";
	loadErrors=false;

  }

private void logVMPLoadError(String errorMessage) throws SAXException {
	try {
		vmpout.write(errorMessage + "\r\n");
	} catch (IOException e1) {
		throw new SAXException(e1);
	}
}

  public void characters(char[] ch, int start, int length) throws SAXException
  {
	  String value = new String( ch , start , length );
	  if(!value.trim().equals("")) 
	  {
		  if( currentElement.equalsIgnoreCase("VPID"))
		  {
			  if (vmp==null)
				  vmp = new VMPVo();
			  vmp.setProductIdentifier(value);
		  }
		  else if( currentElement.equalsIgnoreCase("NM") )
		  {
			  vmp.setName(value);
		  }		  
		  else if( currentElement.equalsIgnoreCase("VTMID") ) 
		  {
			  try {
				  ims.clinical.vo.VTMVo vtm = domainDMD.getVTM(value);
				  if (vtm != null)
					  vmp.setVTM(vtm.toVTMRefVo());
			} catch (DomainInterfaceException e) {
				logVMPLoadError(e.getMessage());
			}			
		  }
		  else if( currentElement.equalsIgnoreCase("INVALID") ) 
		  {
			  if (value.equalsIgnoreCase("1"))
				  vmp.setInvalid(true);
			  else
				  vmp.setInvalid(false);
		  }		  		  		  
	  }
	  currentElement="";
  }

  public void endDocument() throws SAXException
  {	  
	  currentElement="";
	  if (loadErrors)
	  {
		  logVMPLoadError("Finished Load VMP with errors. Please refer to server log for more information");
		  closeVMPLoadLog();
		  domainDMD.closeLogFiles();		  
		  throw new SAXException("Finished Load VMP with errors. Please refer to server log for more information");
	  }
	  else
	  {
		  logVMPLoadError("Finished Load VMP Success.");
		  closeVMPLoadLog();
		  domainDMD.closeLogFiles();
		  throw new SAXException("Finished Load VMP Success.");
	  }	  	  
  }
  
  private void closeVMPLoadLog() throws SAXException 
  {
	try {
		vmpout.flush();
		vmpout.close();
		
	} catch (IOException e) {			
			throw new SAXException(e.getMessage());
	}

  }


  public void endElement(String uri, String localName, String qName) throws SAXException
  {
	  //clear current element for next chars
	  currentElement="";
	  if( qName.equalsIgnoreCase("VMP") )
	  {
		try {
			String[] arrErrors = saveVMP();
			if (arrErrors != null && arrErrors.length > 0)
			{
				StringBuffer sError = new StringBuffer();
				if (vmp.getNameIsNotNull())
					sError.append(vmp.getName());
				if (vmp.getProductIdentifierIsNotNull())
					sError.append(":" + vmp.getProductIdentifier()+ ":");
				logVMPLoadError(sError + arrErrors[0]);
				loadErrors=true;
			}
		} catch (DomainInterfaceException e) {
			logVMPLoadError(e.getMessage());
			loadErrors=true;
		} catch (UniqueKeyViolationException e) {
			logVMPLoadError(e.getMessage());
			loadErrors=true;
		} catch (StaleObjectException e) {
			logVMPLoadError(e.getMessage());
			loadErrors=true;
		}
		clearVMP();
	  }
  }
  
  private void clearVMP() 
  {
	  vmp.setAbbreviatedName(null);
	  vmp.setID_VMP(null);
	  vmp.setInvalid(null);
	  vmp.setIsRIE(null);
	  vmp.setName(null);
	  vmp.setProductIdentifier(null);
	  vmp.setVTM(null);	
  }

private String[] saveVMP() throws UniqueKeyViolationException,DomainInterfaceException,StaleObjectException
  {
	  	if (vmp.getInvalid() == null)
	  		vmp.setInvalid(false); //invalid not supplied in data element so default to false
	  	
		String[] arrErrors = vmp.validate();
		if (arrErrors != null)
		{
			return arrErrors;
		}
		
		try
		{
			domainDMD.saveVMP(vmp);
		} catch (UnqViolationUncheckedException e)
		{
			throw new UniqueKeyViolationException(e);
		}
		
		return null;
}

  public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException
  {

	  if( qName.equalsIgnoreCase("VMP") )
	  {
		  currentElement = "VMP";	  
	  }
	  else if (qName.equals ("VPID"))
      {
    	  currentElement = "VPID";
      }	  
	  else if (qName.equals ("NM"))
      {
    	  currentElement = "NM";
      }   
	  else if (qName.equals ("VTMID"))
      {
    	  currentElement = "VTMID";
      }  
	  else
		  currentElement = "";
  }
}
