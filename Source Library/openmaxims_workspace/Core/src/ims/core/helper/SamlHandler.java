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
package ims.core.helper;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import ims.core.helper.SamlHelper;

public class SamlHandler extends DefaultHandler {

	SamlHelper sampl = new SamlHelper();
	String thisElement = ""; 
	String thisAttribute = "";
	
	boolean bNhsOcsPrCode = false;
	boolean bUid = false;
	boolean bNhsJobRoleCode  = false;


	public SamlHelper getResult(){
		return sampl;
	}
	
	public void loadFile(String file) throws ParserConfigurationException, SAXException, IOException
	  {
		thisElement = "";

		//System.setProperty("javax.xml.parsers.SAXParserFactory", "org.apache.xerces.jaxp.SAXParserFactoryImpl");
		SAXParserFactory parserFactory = SAXParserFactory.newInstance();
		parserFactory.setValidating(true);
		parserFactory.setNamespaceAware(true);
		parserFactory.setFeature("http://xml.org/sax/features/namespace-prefixes",true);
		SAXParser parser = parserFactory.newSAXParser();

		parser.parse(file, this);
		thisElement = "";
	  }

	@Override 
	public void startElement (String namespaceURI, String localName, String qName, Attributes atts) throws SAXException 
	{
		thisElement = qName; 
		thisAttribute = atts.getValue(0);
		
		if (thisElement.equalsIgnoreCase("saml:Attribute") && thisAttribute.equalsIgnoreCase("NhsOcsPrCode"))
			bNhsOcsPrCode = true;
		else if (thisElement.equalsIgnoreCase("saml:Attribute") && thisAttribute.equalsIgnoreCase("uid"))
			bUid = true;
		else if (thisElement.equalsIgnoreCase("saml:Attribute") && thisAttribute.equalsIgnoreCase("nhsJobRoleCode"))
			bNhsJobRoleCode = true;
	} 

	@Override 
	public void endElement (String namespaceURI, String localName, String qName) throws SAXException 
	{
		thisElement = ""; 
	} 

	@Override 
	public void characters (char [] ch, int start, int length) throws SAXException 
	{
		
		if (bNhsOcsPrCode){
			if (thisElement.equalsIgnoreCase("saml:AttributeValue"))
			{
				sampl.setNhsOcsPrCode(new String (ch, start, length)); 
				bNhsOcsPrCode = false;
			}
		} else if (bUid){
			if (thisElement.equalsIgnoreCase("saml:AttributeValue"))
			{
				sampl.setUid(new String (ch, start, length)); 
				bUid = false;
			}
		} else if (bNhsJobRoleCode){
			if (thisElement.equalsIgnoreCase("saml:AttributeValue"))
			{
				sampl.setNhsJobRoleCode(new String (ch, start, length)); 
				bNhsJobRoleCode = false;
			}
		}
	}
} 

