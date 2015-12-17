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
import org.xml.sax.SAXException;
import ims.core.helper.SamlHandler;

public class SamlHelper 
{
	private String nhsOcsPrCode; 
	private String uid; 
	private String nhsJobRoleCode;
	
	
	public String getNhsOcsPrCode() {
		return nhsOcsPrCode;
	}
	public void setNhsOcsPrCode(String nhsOcsPrCode) {
		this.nhsOcsPrCode = nhsOcsPrCode;
	}

	public String getUid() {
		return uid;
	}
	
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	public String getNhsJobRoleCode() {
		return nhsJobRoleCode;
	}
	
	public void setNhsJobRoleCode(String nhsJobRoleCode) {
		this.nhsJobRoleCode = nhsJobRoleCode;
	}
	
	public static void main(String[] args) 
	{
		try 
		{
			SamlHandler samlXml = new SamlHandler();
			samlXml.loadFile("sample.xml");
			SamlHelper sampl = samlXml.getResult();
				System.out.println(sampl.nhsJobRoleCode + ", " + sampl.nhsOcsPrCode + ", " + sampl.uid);
		} 
		catch (ParserConfigurationException e) 
			{
				e.printStackTrace();
			} 
		catch (SAXException e)
			{
				e.printStackTrace();
			}
		catch (IOException e)
			{
				e.printStackTrace();
			}
	}
}
