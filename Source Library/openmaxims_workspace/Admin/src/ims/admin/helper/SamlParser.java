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

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.Attributes;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Stack;
//import java.nio.charset.StandardCharsets;

public class SamlParser
{      
	SAXParserFactory factory;

	private String fileContent;
	SAXParser parser;

	private static final String attribute = "saml:Attribute";
	
	public static final String UID = "uid";
	public static final String NHSJOBROLECODE = "nhsJobRoleCode";
	public static final String NHSOCSPRCODE = "NhsOcsPrCode";
	
	private String staticXmlContent = "<samlp:Response xmlns:samlp=\"urn:oasis:names:tc:SAML:1.0:protocol\" ResponseID=\"null\" InResponseTo=\"null\" MajorVersion=\"1\" MinorVersion=\"1\" IssueInstant=\"2015-04-09T10:36:35Z\" Recipient=\"172.16.143.51\">\r\n" +
			"    <samlp:Status>\r\n" +
			"        <samlp:StatusCode Value=\"samlp:Success\"/>\r\n" +
			"    </samlp:Status>\r\n" +
			"    <saml:Assertion xmlns:saml=\"urn:oasis:names:tc:SAML:1.0:assertion\" MajorVersion=\"1\" MinorVersion=\"1\" AssertionID=\"dde76e859afd3783b1274ea12950474974765320u\" Issuer=\"http://iam-careid-development:8080\" IssueInstant=\"2015-04-09T10:36:35Z\">\r\n" +
			"        <saml:Conditions NotBefore=\"2015-04-09T09:33:35Z\" NotOnOrAfter=\"2015-04-09T11:37:35Z\"/>\r\n" +
			"        <saml:AttributeStatement>\r\n" +
			"            <saml:Subject>\r\n" +
			"                <saml:NameIdentifier NameQualifier=\"o=nhs\">uid=555006130103,ou=People,o=nhs</saml:NameIdentifier>\r\n" +
			"                <saml:SubjectConfirmation>\r\n" +
			"                    <saml:ConfirmationMethod>urn:com:sun:identity</saml:ConfirmationMethod>\r\n" +
			"                    <saml:SubjectConfirmationData>\r\n" +
			"                        <saml:Assertion MajorVersion=\"1\" MinorVersion=\"1\" AssertionID=\"819f894e55e746e6b8ea52f664159c8479013afbv\" Issuer=\"http://iam-careid-development:8080\" IssueInstant=\"2015-04-09T10:36:35Z\">\r\n" +
			"                            <saml:Conditions NotBefore=\"2015-04-09T09:33:35Z\" NotOnOrAfter=\"2015-04-09T11:37:35Z\"/>\r\n" +
			"                            <saml:AuthenticationStatement AuthenticationInstant=\"2015-04-09T10:26:00Z\" AuthenticationMethod=\"urn:com:sun:identity:ExtendedLoginModule\">\r\n" +
			"                                <saml:Subject>\r\n" +
			"                                    <saml:NameIdentifier NameQualifier=\"o=nhs\">uid=555006130103,ou=People,o=nhs</saml:NameIdentifier>\r\n" +
			"                                    <saml:SubjectConfirmation>\r\n" +
			"                                        <saml:ConfirmationMethod>urn:com:sun:identity</saml:ConfirmationMethod>\r\n" +
			"                                        <saml:SubjectConfirmationData>AQIC5wM2LY4SfcxJ9awHbhOJE5exaHklSPIKkvBTd5XvwGo=@AAJTSQACMDE=#</saml:SubjectConfirmationData>\r\n" +
			"                                    </saml:SubjectConfirmation>\r\n" +
			"                                </saml:Subject>\r\n" +
			"                                <saml:SubjectLocality IPAddress=\"172.16.143.51\"/>\r\n" +
			"                            </saml:AuthenticationStatement>\r\n" +
			"                        </saml:Assertion>\r\n" +
			"                    </saml:SubjectConfirmationData>\r\n" +
			"                </saml:SubjectConfirmation>\r\n" +
			"            </saml:Subject>\r\n" +
			"            <saml:Attribute AttributeName=\"ssbAssertionVersion\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" +
			"                <saml:AttributeValue>1.1</saml:AttributeValue>\r\n" +
			"            </saml:Attribute>\r\n" +
			"            <saml:Attribute AttributeName=\"cn\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" +
			"                <saml:AttributeValue>Downs Michelle Miss</saml:AttributeValue>\r\n" +
			"            </saml:Attribute>\r\n" +
			"            <saml:Attribute AttributeName=\"uid\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" +
			"                <saml:AttributeValue>555006130103</saml:AttributeValue>\r\n" +
			"            </saml:Attribute>\r\n" +
			"            <saml:Attribute AttributeName=\"ssbSessionRoleUid\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" +
			"                <saml:AttributeValue>555006304103</saml:AttributeValue>\r\n" +
			"            </saml:Attribute>\r\n" +
			"            <saml:Attribute AttributeName=\"ssbMode\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" +
			"                <saml:AttributeValue>0</saml:AttributeValue>\r\n" +
			"            </saml:Attribute>\r\n" +
			"            <saml:Attribute AttributeName=\"nhsIdCode\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" +
			"                <saml:AttributeValue>RME</saml:AttributeValue>\r\n" +
			"            </saml:Attribute>\r\n" +
			"            <saml:Attribute AttributeName=\"o\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" +
			"                <saml:AttributeValue>COMMUNICARE NHS TRUST</saml:AttributeValue>\r\n" +
			"            </saml:Attribute>\r\n" +
			"            <saml:Attribute AttributeName=\"nhsBusinessFunctions\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" +
			"                <saml:AttributeValue>Amend Patient Demographics</saml:AttributeValue>\r\n" +
			"                <saml:AttributeValue>Perform Extended Person Trace</saml:AttributeValue>\r\n" +
			"                <saml:AttributeValue>Access DSA</saml:AttributeValue>\r\n" +
			"            </saml:Attribute>\r\n" +
			"            <saml:Attribute AttributeName=\"nhsBusinessFunctionsCodes\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" +
			"                <saml:AttributeValue>B0825</saml:AttributeValue>\r\n" +
			"                <saml:AttributeValue>B0098</saml:AttributeValue>\r\n" +
			"                <saml:AttributeValue>B0089</saml:AttributeValue>\r\n" +
			"            </saml:Attribute>\r\n" +
			"            <saml:Attribute AttributeName=\"nhsJobRole\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" +
			"                <saml:AttributeValue>\"Clinical\":\"Clinical Support\":\"Medical Secretary Access Role\"</saml:AttributeValue>\r\n" +
			"            </saml:Attribute>\r\n" +
			"            <saml:Attribute AttributeName=\"uniqueIdentifier\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" +
			"                <saml:AttributeValue>555006132105</saml:AttributeValue>\r\n" +
			"            </saml:Attribute>\r\n" +
			"            <saml:Attribute AttributeName=\"nhsJobRoleCode\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" +
			"                <saml:AttributeValue>S8000:G8001:R8006</saml:AttributeValue>\r\n" +
			"            </saml:Attribute>\r\n" +
			"            <saml:Attribute AttributeName=\"nhsIdCode\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" +
			"                <saml:AttributeValue>RME</saml:AttributeValue>\r\n" +
			"            </saml:Attribute>\r\n" +
			"            <saml:Attribute AttributeName=\"o\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" +
			"                <saml:AttributeValue>COMMUNICARE NHS TRUST</saml:AttributeValue>\r\n" +
			"            </saml:Attribute>\r\n" +
			"            <saml:Attribute AttributeName=\"nhsAreaOfWorkCodes\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" +
			"                <saml:AttributeValue>P8001:Q8001:T6092</saml:AttributeValue>\r\n" +
			"            </saml:Attribute>\r\n" +
			"            <saml:Attribute AttributeName=\"nhsBusinessFunctions\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" +
			"                <saml:AttributeValue>Manage Patient Duplicate Records</saml:AttributeValue>\r\n" +
			"                <saml:AttributeValue>Access Sensitive(S) Flagged Records</saml:AttributeValue>\r\n" +
			"                <saml:AttributeValue>Access DSA</saml:AttributeValue>\r\n" +
			"            </saml:Attribute>\r\n" +
			"            <saml:Attribute AttributeName=\"nhsBusinessFunctionsCodes\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" +
			"                <saml:AttributeValue>B1680</saml:AttributeValue>\r\n" +
			"                <saml:AttributeValue>B1611</saml:AttributeValue>\r\n" +
			"                <saml:AttributeValue>B0089</saml:AttributeValue>\r\n" +
			"            </saml:Attribute>\r\n" +
			"            <saml:Attribute AttributeName=\"nhsAreaOfWork\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" +
			"                <saml:AttributeValue>\"Secondary Care\":\"Secondary Care\":\"Secondary Care\"</saml:AttributeValue>\r\n" +
			"            </saml:Attribute>\r\n" +
			"            <saml:Attribute AttributeName=\"nhsJobRole\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" +
			"                <saml:AttributeValue>\"Admin &amp; Clerical\":\"Admin\":\"Demographic Administrator\"</saml:AttributeValue>\r\n" +
			"            </saml:Attribute>\r\n" +
			"            <saml:Attribute AttributeName=\"uniqueIdentifier\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" +
			"                <saml:AttributeValue>555006304103</saml:AttributeValue>\r\n" +
			"            </saml:Attribute>\r\n" +
			"            <saml:Attribute AttributeName=\"nhsJobRoleCode\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" +
			"                <saml:AttributeValue>S0080:G0440:R5110</saml:AttributeValue>\r\n" +
			"            </saml:Attribute>\r\n" +
			"            <saml:Attribute AttributeName=\"nhsWorkGroupsCodes\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" +
			"                <saml:AttributeValue>555005330103</saml:AttributeValue>\r\n" +
			"            </saml:Attribute>\r\n" +
			"            <saml:Attribute AttributeName=\"nhsWorkGroups\" AttributeNamespace=\"http://www.syntegra.com\">\r\n" +
			"                <saml:AttributeValue>DemographicWG</saml:AttributeValue>\r\n" +
			"            </saml:Attribute>\r\n" +
			"        </saml:AttributeStatement>\r\n" +
			"    </saml:Assertion>\r\n" +
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
			DefaultHandler handler = new SAMLHandler(attribute,key); 
			parser.parse(new ByteArrayInputStream(fileContent.getBytes("UTF-8")), handler);                    

			SAMLHandler instance = (SAMLHandler)handler;
			if (instance.getTempValue()!=null)
			{
				String result = instance.getTempValue().toString().replace("\n", ":");
				return result;
			}
			
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
		private String key;        

		private final Stack<String> tagsStack = new Stack<String>();
	    private final StringBuilder tempItem = new StringBuilder();
	    private final StringBuilder tempValue = new StringBuilder();
	    
	    public String getTempValue() {
	    	String resultValues = "";
	    	if (tempValue!=null)
	    	{
	    		if (tempValue.length()>0)
	    		{
		    		tempValue.setCharAt(0, ' ');
		    		resultValues = tempValue.toString();
		    		resultValues = tempValue.toString().replaceAll("\r\n", "");
		    		resultValues = tempValue.toString().replaceAll(" ", "");
	    		}
	    	}
			return resultValues;
		}
	    
		public SAMLHandler(String qName,String key) 
		{
			this.key = key;
			tempItem.setLength(0);
			tempValue.setLength(0);
		}

		public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException 
		{             
			if (qName.equalsIgnoreCase(attribute))
			{             
				if(attributes.getValue(0).equals(key))
				{
					pushTag(key);
					
					tempItem.append(attributes.getValue(0));
				}              
			}                           
		}           

		public void characters(char ch[], int start, int length) throws SAXException 
		{           
			String tag = peekTag();
	        if (!key.equals(tag)) {
	            return;
	        }
	        else if (key.equals(tag))
	        {
	        	tempValue.append(ch, start, length);
	        }
		}
		
		public void startDocument() {
	        pushTag("");
	    }
		
		public void endElement(String uri, String localName, String qName) {
	        popTag();
	    }
		
		private void pushTag(String tag) {
	        tagsStack.push(tag);
	    }

	    private String popTag() {
	        return (tagsStack!=null && tagsStack.size()>0?tagsStack.pop():null);
	    }

	    private String peekTag() {
	        return (tagsStack!=null && tagsStack.size()>0?tagsStack.peek():null);
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
