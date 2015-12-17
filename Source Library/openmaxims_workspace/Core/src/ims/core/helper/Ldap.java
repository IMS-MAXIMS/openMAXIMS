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
/*************************************************************
 *  file Ldap.java
 *
 *  Electronic Booking SDS interface
 *
 *  Search SDS and return values
 *
 *  Version  Date     Init   Reason
 *
 *  V001     25/11/05 DRW    Initial Version
 * ***********************************************************/


package ims.core.helper;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;

/*
 * Created on 06-Oct-2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */

/**
 * @author dwest
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class Ldap 
{
	
	private static String host    = "ldap.national.ncrs.nhs.uk";
	private static String port    = "636";
	private static String baseDn  = "o=nhs";
	private static String context = "ou=Organisations";
	private static String filter  = "o=Winchester*";
	private static String[] returnAttributes = null;
	
	private static NamingEnumeration searchResponse = null;
	private static NamingEnumeration searchResults = null;
	
	public static void setHost(String ldapHost){
		host = ldapHost;
	}
	public static void setPort(String ldapPort){
		port = ldapPort;
	}
	public static void setBaseDn(String ldapBaseDn){
		baseDn = ldapBaseDn;
	}
	public static void setContext(String ldapContext){
		context = ldapContext;
	}
	public static void setFilter(String ldapFilter){
		filter = ldapFilter;
	}
	public static void setReturnAttributes(String[] ldapReturnAttributes){
		returnAttributes = ldapReturnAttributes;
	}
	public static String getReturnedValue(NamingEnumeration searchResults, String returnAttribute){
		
		if (searchResults == null)
			return null;

		String returnedValue = null;
		
		while (searchResults.hasMoreElements())
		{
			String returnedElement = searchResults.nextElement().toString();
			
			if (returnedElement.length() > 1)
			{
				int len   = returnedElement.length();
				int colon = returnedElement.indexOf(":");
															
				String returnedAttribute = returnedElement.substring(0, colon);
				if (returnedAttribute.equalsIgnoreCase(returnAttribute))
				{
					returnedValue = returnedElement.substring(colon + 2, len);
					return returnedValue;
				}
			}
		}
		
		return returnedValue;
	}
	
	/*
	 * Search Code
	 */
		
	public static NamingEnumeration getLast() throws NamingException
	{
		Hashtable env = new Hashtable(11);
		env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
		env.put(Context.SECURITY_PROTOCOL, "ssl");		
		env.put(Context.PROVIDER_URL, "ldap://" + host + ":" + port + "/" + baseDn);
		
		SearchControls controls = new SearchControls();
		controls.setReturningAttributes(returnAttributes);
		controls.setSearchScope(SearchControls.SUBTREE_SCOPE);

		DirContext searchContext = new InitialDirContext(env);
		searchResponse = searchContext.search(context, filter, controls);
					
		while (searchResponse != null && searchResponse.hasMoreElements())
		{
			SearchResult item = (SearchResult) searchResponse.next();
			searchResults = item.getAttributes().getAll();
		}
			
		return searchResults;
	}

	public static NamingEnumeration search() throws NamingException
	{
		searchResponse = null;
		
		Hashtable env = new Hashtable(11);
		env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
		env.put(Context.SECURITY_PROTOCOL, "ssl");		
		env.put(Context.PROVIDER_URL, "ldap://" + host + ":" + port + "/" + baseDn);
		
		SearchControls controls = new SearchControls();
		controls.setReturningAttributes(returnAttributes);
		controls.setSearchScope(SearchControls.SUBTREE_SCOPE);

		DirContext searchContext = new InitialDirContext(env);
		searchResponse = searchContext.search(context, filter, controls);
					
		return searchResponse;
	}

	public static void main(String[] args) 
	{
		try
		{
			Ldap.search();
		}catch (NamingException ne)
		{
			ne.printStackTrace();
		}
	}
	
	/**
	 * wdev-6418
	 * When logging sdsRequests, this method is called
	 * @return
	 */
	public static String outputDetails()
	{
		StringBuffer output = new StringBuffer();
		
		output.append("\nHost:").append(host);
		output.append("\nPort:").append(port);
		output.append("\nBaseDn").append(baseDn);
		output.append("\nContext:").append(context);
		output.append("\nFilter:").append(filter);
		output.append("\nReturnedAttributesRequired:");
		if (returnAttributes != null)
		{
			for (int i=0; i<returnAttributes.length; i++)
			{
				output.append("\n\t").append(returnAttributes[i]);
			}
		}
		return output.toString();
	}
}
