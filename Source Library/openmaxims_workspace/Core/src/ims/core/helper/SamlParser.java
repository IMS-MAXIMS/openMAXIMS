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

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.Attributes;

import java.io.ByteArrayInputStream;
import java.io.IOException;
//import java.nio.charset.StandardCharsets;

public class SamlParser
{      
	SAXParserFactory factory;

	private String fileContent;
	SAXParser parser;

	private static final String attribute = "saml:Attribute";
	private static final String attributeValue = "saml:AttributeValue";
	
	public static final String UID = "uid";
	public static final String NHSJOBROLECODE = "nhsJobRoleCode";
	public static final String NHSOCSPRCODE = "NhsOcsPrCode";
	
	private String staticXmlContent = "<samlp:Response xmlns:samlp=\"urn:oasis:names:tc:SAML:1.0:protocol\" ResponseID=\"null\" InResponseTo=\"null\" MajorVersion=\"1\" MinorVersion=\"1\" IssueInstant=\"2014-11-27T13:32:04Z\" Recipient=\"172.16.51.199\">\r\n" + 
			"  <samlp:Status>\r\n" + 
			"    <samlp:StatusCode Value=\"samlp:Success\"/>\r\n" + 
			"  </samlp:Status>\r\n" + 
			"  <saml:Assertion xmlns:saml=\"urn:oasis:names:tc:SAML:1.0:assertion\" MajorVersion=\"1\" MinorVersion=\"1\" AssertionID=\"s9f7b1610af3b68b1fa812f62a2f33d8506fdb741\" Issuer=\"vnisuz015-uklr-ap.hosts.vn4.national.ncrs.nhs.uk:80\" IssueInstant=\"2014-11-27T13:32:04Z\">\r\n" + 
			"    <saml:Conditions NotBefore=\"2014-11-27T13:29:04Z\" NotOnOrAfter=\"2014-11-27T13:39:04Z\"/>\r\n" + 
			"    <saml:AttributeStatement>\r\n" + 
			"      <saml:Subject>\r\n" + 
			"        <saml:NameIdentifier NameQualifier=\"o=nhs\">uid=431820572540,ou=People,o=nhs</saml:NameIdentifier>\r\n" + 
			"        <saml:SubjectConfirmation>\r\n" + 
			"          <saml:ConfirmationMethod>urn:com:sun:identity</saml:ConfirmationMethod>\r\n" + 
			"          <saml:SubjectConfirmationData>\r\n" + 
			"            <saml:Assertion MajorVersion=\"1\" MinorVersion=\"1\" AssertionID=\"sf9331df994244b73db4cbb93214819e0c2e78b4d\" Issuer=\"vnisuz015-uklr-ap.hosts.vn4.national.ncrs.nhs.uk:80\" IssueInstant=\"2014-11-27T13:32:04Z\">\r\n" + 
			"              <saml:Conditions NotBefore=\"2014-11-27T13:29:04Z\" NotOnOrAfter=\"2014-11-27T13:39:04Z\"/>\r\n" + 
			"              <saml:AuthenticationStatement AuthenticationInstant=\"2014-11-27T10:19:58.000Z\" AuthenticationMethod=\"urn:com:sun:identity:ExtendedLoginModule\">\r\n" + 
			"                <saml:Subject>\r\n" + 
			"                  <saml:NameIdentifier NameQualifier=\"o=nhs\">uid=431820572540,ou=People,o=nhs</saml:NameIdentifier>\r\n" + 
			"                  <saml:SubjectConfirmation>\r\n" + 
			"                    <saml:ConfirmationMethod>urn:com:sun:identity</saml:ConfirmationMethod>\r\n" + 
			"                    <saml:SubjectConfirmationData>AQIC5wM2LY4Sfcw3P+2DeLSnpVqVQycNgknrH81v5pBb3ZA=@AAJTSQACMDE=#</saml:SubjectConfirmationData>\r\n" + 
			"                  </saml:SubjectConfirmation>\r\n" + 
			"                </saml:Subject>\r\n" + 
			"                <saml:SubjectLocality IPAddress=\"172.16.51.199\"/>\r\n" + 
			"              </saml:AuthenticationStatement>\r\n" + 
			"            </saml:Assertion>\r\n" + 
			"          </saml:SubjectConfirmationData>\r\n" + 
			"        </saml:SubjectConfirmation>\r\n" + 
			"      </saml:Subject>\r\n" + 
			"      <saml:Attribute AttributeName=\"ssbAssertionVersion\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" + 
			"        <saml:AttributeValue>1.1</saml:AttributeValue>\r\n" + 
			"      </saml:Attribute>\r\n" + 
			"      <saml:Attribute AttributeName=\"cn\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" + 
			"        <saml:AttributeValue>Liz Lovell</saml:AttributeValue>\r\n" + 
			"      </saml:Attribute>\r\n" + 
			"      <saml:Attribute AttributeName=\"uid\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" + 
			"        <saml:AttributeValue>431820572540</saml:AttributeValue>\r\n" + 
			"      </saml:Attribute>\r\n" + 
			"      <saml:Attribute AttributeName=\"ssbSessionRoleUid\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" + 
			"        <saml:AttributeValue>133845777548</saml:AttributeValue>\r\n" + 
			"      </saml:Attribute>\r\n" + 
			"      <saml:Attribute AttributeName=\"ssbMode\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" + 
			"        <saml:AttributeValue>0</saml:AttributeValue>\r\n" + 
			"      </saml:Attribute>\r\n" + 
			"      <saml:Attribute AttributeName=\"nhsIdCode\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" + 
			"        <saml:AttributeValue>RQZ</saml:AttributeValue>\r\n" + 
			"      </saml:Attribute>\r\n" + 
			"      <saml:Attribute AttributeName=\"o\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" + 
			"        <saml:AttributeValue>BOURNEWOOD COMMUNITY AND MENTAL HEALTH NHS TRUST</saml:AttributeValue>\r\n" + 
			"      </saml:Attribute>\r\n" + 
			"      <saml:Attribute AttributeName=\"nhsBusinessFunctions\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" + 
			"        <saml:AttributeValue>Manage Inbound Referrals</saml:AttributeValue>\r\n" + 
			"        <saml:AttributeValue>Maintain Commissioned Services</saml:AttributeValue>\r\n" + 
			"        <saml:AttributeValue>Maintain Service Configurations and Workgroups</saml:AttributeValue>\r\n" + 
			"      </saml:Attribute>\r\n" + 
			"      <saml:Attribute AttributeName=\"nhsBusinessFunctionsCodes\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" + 
			"        <saml:AttributeValue>B1107</saml:AttributeValue>\r\n" + 
			"        <saml:AttributeValue>B1110</saml:AttributeValue>\r\n" + 
			"        <saml:AttributeValue>B1106</saml:AttributeValue>\r\n" + 
			"      </saml:Attribute>\r\n" + 
			"      <saml:Attribute AttributeName=\"nhsJobRole\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" + 
			"        <saml:AttributeValue>\"Admin &amp; Clerical\":\"Management - A &amp; C\":\"Manager\"</saml:AttributeValue>\r\n" + 
			"      </saml:Attribute>\r\n" + 
			"      <saml:Attribute AttributeName=\"uniqueIdentifier\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" + 
			"        <saml:AttributeValue>003421919543</saml:AttributeValue>\r\n" + 
			"      </saml:Attribute>\r\n" + 
			"      <saml:Attribute AttributeName=\"nhsJobRoleCode\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" + 
			"        <saml:AttributeValue>S0080:G0450:R1780</saml:AttributeValue>\r\n" + 
			"      </saml:Attribute>\r\n" + 
			"      <saml:Attribute AttributeName=\"nhsIdCode\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" + 
			"        <saml:AttributeValue>RQZ</saml:AttributeValue>\r\n" + 
			"      </saml:Attribute>\r\n" + 
			"      <saml:Attribute AttributeName=\"o\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" + 
			"        <saml:AttributeValue>BOURNEWOOD COMMUNITY AND MENTAL HEALTH NHS TRUST</saml:AttributeValue>\r\n" + 
			"      </saml:Attribute>\r\n" + 
			"      <saml:Attribute AttributeName=\"nhsBusinessFunctions\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" + 
			"        <saml:AttributeValue>Manage Inbound Referrals</saml:AttributeValue>\r\n" + 
			"      </saml:Attribute>\r\n" + 
			"      <saml:Attribute AttributeName=\"nhsBusinessFunctionsCodes\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" + 
			"        <saml:AttributeValue>B1110</saml:AttributeValue>\r\n" + 
			"      </saml:Attribute>\r\n" + 
			"      <saml:Attribute AttributeName=\"nhsJobRole\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" + 
			"        <saml:AttributeValue>\"M&amp;D\":\"Medical - M&amp;D\":\"Salaried General Practitioner\"</saml:AttributeValue>\r\n" + 
			"      </saml:Attribute>\r\n" + 
			"      <saml:Attribute AttributeName=\"uniqueIdentifier\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" + 
			"        <saml:AttributeValue>861924294544</saml:AttributeValue>\r\n" + 
			"      </saml:Attribute>\r\n" + 
			"      <saml:Attribute AttributeName=\"nhsJobRoleCode\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" + 
			"        <saml:AttributeValue>S0010:G0020:R0270</saml:AttributeValue>\r\n" + 
			"      </saml:Attribute>\r\n" + 
			"      <saml:Attribute AttributeName=\"nhsIdCode\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" + 
			"        <saml:AttributeValue>M92002</saml:AttributeValue>\r\n" + 
			"      </saml:Attribute>\r\n" + 
			"      <saml:Attribute AttributeName=\"o\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" + 
			"        <saml:AttributeValue>THE GROUP PRACTICE ALFRED SQUIRE ROAD</saml:AttributeValue>\r\n" + 
			"      </saml:Attribute>\r\n" + 
			"      <saml:Attribute AttributeName=\"nhsBusinessFunctions\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" + 
			"        <saml:AttributeValue>Administer System (Org Level)</saml:AttributeValue>\r\n" + 
			"        <saml:AttributeValue>Manage Inbound Referrals</saml:AttributeValue>\r\n" + 
			"        <saml:AttributeValue>Maintain Commissioned Services</saml:AttributeValue>\r\n" + 
			"        <saml:AttributeValue>Manage Outbound Referrals</saml:AttributeValue>\r\n" + 
			"      </saml:Attribute>\r\n" + 
			"      <saml:Attribute AttributeName=\"nhsBusinessFunctionsCodes\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" + 
			"        <saml:AttributeValue>B1101</saml:AttributeValue>\r\n" + 
			"        <saml:AttributeValue>B1106</saml:AttributeValue>\r\n" + 
			"        <saml:AttributeValue>B1110</saml:AttributeValue>\r\n" + 
			"        <saml:AttributeValue>B1065</saml:AttributeValue>\r\n" + 
			"      </saml:Attribute>\r\n" + 
			"      <saml:Attribute AttributeName=\"nhsJobRole\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" + 
			"        <saml:AttributeValue>\"Admin &amp; Clerical\":\"Management - A &amp; C\":\"Manager\"</saml:AttributeValue>\r\n" + 
			"      </saml:Attribute>\r\n" + 
			"      <saml:Attribute AttributeName=\"uniqueIdentifier\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" + 
			"        <saml:AttributeValue>007389644548</saml:AttributeValue>\r\n" + 
			"      </saml:Attribute>\r\n" + 
			"      <saml:Attribute AttributeName=\"nhsJobRoleCode\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" + 
			"        <saml:AttributeValue>S0080:G0450:R1780</saml:AttributeValue>\r\n" + 
			"      </saml:Attribute>\r\n" + 
			"      <saml:Attribute AttributeName=\"nhsIdCode\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" + 
			"        <saml:AttributeValue>RN1</saml:AttributeValue>\r\n" + 
			"      </saml:Attribute>\r\n" + 
			"      <saml:Attribute AttributeName=\"o\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" + 
			"        <saml:AttributeValue>WINCHESTER AND EASTLEIGH HEALTHCARE NHS TRUST</saml:AttributeValue>\r\n" + 
			"      </saml:Attribute>\r\n" + 
			"      <saml:Attribute AttributeName=\"nhsBusinessFunctions\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" + 
			"        <saml:AttributeValue>Manage Inbound Referrals</saml:AttributeValue>\r\n" + 
			"        <saml:AttributeValue>Maintain Commissioned Services</saml:AttributeValue>\r\n" + 
			"      </saml:Attribute>\r\n" + 
			"      <saml:Attribute AttributeName=\"nhsBusinessFunctionsCodes\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" + 
			"        <saml:AttributeValue>B1106</saml:AttributeValue>\r\n" + 
			"        <saml:AttributeValue>B1110</saml:AttributeValue>\r\n" + 
			"      </saml:Attribute>\r\n" + 
			"      <saml:Attribute AttributeName=\"nhsJobRole\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" + 
			"        <saml:AttributeValue>\"Admin &amp; Clerical\":\"Management - A &amp; C\":\"Manager\"</saml:AttributeValue>\r\n" + 
			"      </saml:Attribute>\r\n" + 
			"      <saml:Attribute AttributeName=\"uniqueIdentifier\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" + 
			"        <saml:AttributeValue>133845777548</saml:AttributeValue>\r\n" + 
			"      </saml:Attribute>\r\n" + 
			"      <saml:Attribute AttributeName=\"nhsJobRoleCode\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" + 
			"        <saml:AttributeValue>S0080:G0450:R1780</saml:AttributeValue>\r\n" + 
			"      </saml:Attribute>\r\n" + 
			"    </saml:AttributeStatement>\r\n" + 
			"  </saml:Assertion>\r\n" + 
			"</samlp:Response>\r\n" + 
			""; 

	
	
	public SamlParser() throws ParserConfigurationException, SAXException
	{                          
		factory = SAXParserFactory.newInstance();
		factory.setNamespaceAware(true);
		factory.setFeature("http://xml.org/sax/features/namespace-prefixes", true);

		parser = factory.newSAXParser();                              
	}

	public SamlParser loadFileContent(String fileContent)
	{             
		this.fileContent = fileContent;
		return this;
	}

	public String getValueForField(String key) throws SAXException
	{      
		try
		{                          
			DefaultHandler handler = new SAMLHandler(key); 
			parser.parse(new ByteArrayInputStream(fileContent.getBytes("UTF-8")), handler);                    

			return null;
		}
		catch (SAXStopException ex)
		{
			return ex.getMessage();
		}
		catch (SAXException exception)
		{
			throw new SAXException(exception);
		}                 
		catch (IOException exception)
		{
			throw new SAXException(exception);
		}
	}

	private class SAMLHandler extends DefaultHandler
	{
		private String qName;
		private String key;        
		private boolean hasField = false;

		public SAMLHandler(String key) 
		{
			this.key = key;            
		}

		public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException 
		{             
			this.qName = qName;
			if (qName.equals(attribute))
			{             
				if(attributes.getValue(0).equals(key))
				{
					hasField = true;     
				}                                 
			}                           
		}           

		public void characters(char ch[], int start, int length) throws SAXException 
		{           
			if (qName.equals(attributeValue))
			{                                        
				if (hasField) 
				{                                               
					throw new SAXStopException(new String(ch, start, length)); 
				}
			}
		}           
	}

	public class SAXStopException extends SAXException 
	{
		private static final long serialVersionUID = 1L;                     
		public SAXStopException(String value) 
		{                    
			super(value);
		}             
	}

	public String getStaticXmlContent()
	{
		return staticXmlContent;
	}
}
