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
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5589.25814)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 12/10/2015, 13:28
 *
 */
package ims.core.generic.domain.objects;

/**
 * 
 * @author John MacEnri
 * Generated.
 */


public class CommunicationChannel extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1002100003;
	private static final long serialVersionUID = 1002100003L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private ims.domain.lookups.LookupInstance channelType;
	private String commValue;
	/** Object identifier - UID */
	private String objectidentifier;
	/** The date from which the alternative identifier has been indicated to be effective. */
	private java.util.Date beffdate;
	/** Beffdate confirmed */
	private Boolean beffdatecnf;
	/** The date until which the alternative identifier has been indicated to be effective. */
	private java.util.Date betdate;
	/** Betdate confirmed */
	private Boolean betdatecnf;
	/** PDS Update Mode */
	private ims.domain.lookups.LookupInstance pdsUpdateMode;
	/** Telecom usage
 */
	private ims.domain.lookups.LookupInstance channelUsage;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public CommunicationChannel (Integer id, int ver)
    {
    	super(id, ver);
		isComponentClass=true;
    }
    public CommunicationChannel ()
    {
    	super();
		isComponentClass=true;
    }
    public CommunicationChannel (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
		isComponentClass=true;
    }
	public Class getRealDomainClass()
	{
		return ims.core.generic.domain.objects.CommunicationChannel.class;
	}


	public ims.domain.lookups.LookupInstance getChannelType() {
		return channelType;
	}
	public void setChannelType(ims.domain.lookups.LookupInstance channelType) {
		this.channelType = channelType;
	}

	public String getCommValue() {
		return commValue;
	}
	public void setCommValue(String commValue) {
		if ( null != commValue && commValue.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for commValue. Tried to set value: "+
				commValue);
		}
		this.commValue = commValue;
	}

	public String getObjectidentifier() {
		return objectidentifier;
	}
	public void setObjectidentifier(String objectidentifier) {
		if ( null != objectidentifier && objectidentifier.length() > 14 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for objectidentifier. Tried to set value: "+
				objectidentifier);
		}
		this.objectidentifier = objectidentifier;
	}

	public java.util.Date getBeffdate() {
		return beffdate;
	}
	public void setBeffdate(java.util.Date beffdate) {
		this.beffdate = beffdate;
	}

	public Boolean isBeffdatecnf() {
		return beffdatecnf;
	}
	public void setBeffdatecnf(Boolean beffdatecnf) {
		this.beffdatecnf = beffdatecnf;
	}

	public java.util.Date getBetdate() {
		return betdate;
	}
	public void setBetdate(java.util.Date betdate) {
		this.betdate = betdate;
	}

	public Boolean isBetdatecnf() {
		return betdatecnf;
	}
	public void setBetdatecnf(Boolean betdatecnf) {
		this.betdatecnf = betdatecnf;
	}

	public ims.domain.lookups.LookupInstance getPdsUpdateMode() {
		return pdsUpdateMode;
	}
	public void setPdsUpdateMode(ims.domain.lookups.LookupInstance pdsUpdateMode) {
		this.pdsUpdateMode = pdsUpdateMode;
	}

	public ims.domain.lookups.LookupInstance getChannelUsage() {
		return channelUsage;
	}
	public void setChannelUsage(ims.domain.lookups.LookupInstance channelUsage) {
		this.channelUsage = channelUsage;
	}

	public ims.domain.SystemInformation getSystemInformation() {
		if (systemInformation == null) systemInformation = new ims.domain.SystemInformation();
		return systemInformation;
	}


	/**
	 * isConfigurationObject
	 * Taken from the Usage property of the business object, this method will return
	 * a boolean indicating whether this is a configuration object or not
	 * Configuration = true, Instantiation = false
	 */
	public static boolean isConfigurationObject()
	{
		if ( "Instantiation".equals("Configuration") )
			return true;
		else
			return false;
	}





	public int getClassId() {
		return CLASSID;
	}

	public String getClassVersion()
	{
		return CLASSVERSION;
	}

	public String toAuditString()
	{
		StringBuffer auditStr = new StringBuffer();
		
		auditStr.append("\r\n*channelType* :");
		if (channelType != null)
			auditStr.append(channelType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*commValue* :");
		auditStr.append(commValue);
	    auditStr.append("; ");
		auditStr.append("\r\n*objectidentifier* :");
		auditStr.append(objectidentifier);
	    auditStr.append("; ");
		auditStr.append("\r\n*beffdate* :");
		auditStr.append(beffdate);
	    auditStr.append("; ");
		auditStr.append("\r\n*beffdatecnf* :");
		auditStr.append(beffdatecnf);
	    auditStr.append("; ");
		auditStr.append("\r\n*betdate* :");
		auditStr.append(betdate);
	    auditStr.append("; ");
		auditStr.append("\r\n*betdatecnf* :");
		auditStr.append(betdatecnf);
	    auditStr.append("; ");
		auditStr.append("\r\n*pdsUpdateMode* :");
		if (pdsUpdateMode != null)
			auditStr.append(pdsUpdateMode.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*channelUsage* :");
		if (channelUsage != null)
			auditStr.append(channelUsage.getText());
	    auditStr.append("; ");
		return auditStr.toString();
	}
	
	public String toXMLString()
	{
		return toXMLString(new java.util.HashMap());
	}
	
	public String toXMLString(java.util.HashMap domMap)
	{
		StringBuffer sb = new StringBuffer();
		sb.append("<class type=\"" + this.getClass().getName() + "\" ");		
		sb.append(" source=\"" + ims.configuration.EnvironmentConfig.getImportExportSourceName() + "\" ");
		sb.append(" classVersion=\"" + this.getClassVersion() + "\" ");
		sb.append(" component=\"" + this.getIsComponentClass() + "\" >");
		
		if (domMap.get(this) == null)
		{
			domMap.put(this, this);
			sb.append(this.fieldsToXMLString(domMap));
		}
		sb.append("</class>");
		
		
		return sb.toString();
	}

	public String fieldsToXMLString(java.util.HashMap domMap)
	{
		StringBuffer sb = new StringBuffer();
		if (this.getChannelType() != null)
		{
			sb.append("<channelType>");
			sb.append(this.getChannelType().toXMLString()); 
			sb.append("</channelType>");		
		}
		if (this.getCommValue() != null)
		{
			sb.append("<commValue>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCommValue().toString()));
			sb.append("</commValue>");		
		}
		if (this.getObjectidentifier() != null)
		{
			sb.append("<objectidentifier>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getObjectidentifier().toString()));
			sb.append("</objectidentifier>");		
		}
		if (this.getBeffdate() != null)
		{
			sb.append("<beffdate>");
			sb.append(new ims.framework.utils.DateTime(this.getBeffdate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</beffdate>");		
		}
		if (this.isBeffdatecnf() != null)
		{
			sb.append("<beffdatecnf>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isBeffdatecnf().toString()));
			sb.append("</beffdatecnf>");		
		}
		if (this.getBetdate() != null)
		{
			sb.append("<betdate>");
			sb.append(new ims.framework.utils.DateTime(this.getBetdate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</betdate>");		
		}
		if (this.isBetdatecnf() != null)
		{
			sb.append("<betdatecnf>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isBetdatecnf().toString()));
			sb.append("</betdatecnf>");		
		}
		if (this.getPdsUpdateMode() != null)
		{
			sb.append("<pdsUpdateMode>");
			sb.append(this.getPdsUpdateMode().toXMLString()); 
			sb.append("</pdsUpdateMode>");		
		}
		if (this.getChannelUsage() != null)
		{
			sb.append("<channelUsage>");
			sb.append(this.getChannelUsage().toXMLString()); 
			sb.append("</channelUsage>");		
		}
		return sb.toString();
	}
		
	public static java.util.List fromListXMLString(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.List list, java.util.HashMap domMap) throws Exception
	{
		if (list == null)
		 list = new java.util.ArrayList();
		fillListFromXMLString(list, el, factory, domMap);
		return list;
	}
	
	public static java.util.Set fromSetXMLString(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.Set set, java.util.HashMap domMap) throws Exception
	{
		if (set == null)
			 set = new java.util.HashSet();
		fillSetFromXMLString(set, el, factory, domMap);
		return set;
	}
	
	private static void fillSetFromXMLString(java.util.Set set, org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return;
		
		java.util.List cl = el.elements("class");
		int size = cl.size();
		
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			org.dom4j.Element itemEl = (org.dom4j.Element)cl.get(i);
			CommunicationChannel domainObject = getCommunicationChannelfromXML(itemEl, factory, domMap);

			if (domainObject == null)
			{
				continue;
			}
			
			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!set.contains(domainObject)) 
				set.add(domainObject);
			newSet.add(domainObject);			
		}
		
		java.util.Set removedSet = new java.util.HashSet();
		java.util.Iterator iter = set.iterator();
		//Find out which objects need to be removed
		while (iter.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet.contains(o))
			{
				removedSet.add(o);
			}
		}
		iter = removedSet.iterator();
		//Remove the unwanted objects
		while (iter.hasNext())
		{
			set.remove(iter.next());
		}		
	}
	
	private static void fillListFromXMLString(java.util.List list, org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return;
		
		java.util.List cl = el.elements("class");
		int size = cl.size();
		
		for(int i=0; i<size; i++) 
		{
			org.dom4j.Element itemEl = (org.dom4j.Element)cl.get(i);
			CommunicationChannel domainObject = getCommunicationChannelfromXML(itemEl, factory, domMap);

			if (domainObject == null)
			{
				continue;
			}

			int domIdx = list.indexOf(domainObject);
			if (domIdx == -1)
			{
				list.add(i, domainObject);
			}
			else if (i != domIdx && i < list.size())
			{
				Object tmp = list.get(i);
				list.set(i, list.get(domIdx));
				list.set(domIdx, tmp);
			}
		}		
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i1=list.size();
		while (i1 > size)
		{
			list.remove(i1-1);
			i1=list.size();
		}
	}
		
	public static CommunicationChannel getCommunicationChannelfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getCommunicationChannelfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static CommunicationChannel getCommunicationChannelfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!CommunicationChannel.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!CommunicationChannel.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the CommunicationChannel class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (CommunicationChannel)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(CommunicationChannel.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		CommunicationChannel ret = null;
		if (ret == null)
		{
			ret = new CommunicationChannel();
		}
		fillFieldsfromXML(el, factory, ret, domMap);
		return ret;
	}

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, CommunicationChannel obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("channelType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setChannelType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("commValue");
		if(fldEl != null)
		{	
    		obj.setCommValue(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("objectidentifier");
		if(fldEl != null)
		{	
    		obj.setObjectidentifier(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("beffdate");
		if(fldEl != null)
		{	
    		obj.setBeffdate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("beffdatecnf");
		if(fldEl != null)
		{	
    		obj.setBeffdatecnf(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("betdate");
		if(fldEl != null)
		{	
    		obj.setBetdate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("betdatecnf");
		if(fldEl != null)
		{	
    		obj.setBetdatecnf(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pdsUpdateMode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPdsUpdateMode(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("channelUsage");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setChannelUsage(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		};
	}

	/**
	Equals - to override base class equals
	*/
public boolean equals(Object obj)
{
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	CommunicationChannel other = (CommunicationChannel) obj;
	if (beffdate == null)
	{
		if (other.beffdate != null)
			return false;
	}
	else if (!beffdate.equals(other.beffdate))
		return false;
	if (beffdatecnf == null)
	{
		if (other.beffdatecnf != null)
			return false;
	}
	else if (!beffdatecnf.equals(other.beffdatecnf))
		return false;
	if (betdate == null)
	{
		if (other.betdate != null)
			return false;
	}
	else if (!betdate.equals(other.betdate))
		return false;
	if (betdatecnf == null)
	{
		if (other.betdatecnf != null)
			return false;
	}
	else if (!betdatecnf.equals(other.betdatecnf))
		return false;
	if (channelType == null)
	{
		if (other.channelType != null)
			return false;
	}
	else if (!channelType.equals(other.channelType))
		return false;
	if (pdsUpdateMode == null)
	{
		if (other.pdsUpdateMode != null)
			return false;
	}
	else if (!pdsUpdateMode.equals(other.pdsUpdateMode))
		return false;
      if (channelUsage == null)
	{
		if (other.channelUsage != null)
			return false;
	}
	else if (!channelUsage.equals(other.channelUsage))
		return false;
	if (commValue == null)
	{
		if (other.commValue != null)
			return false;
	}
	else if (!commValue.equals(other.commValue))
		return false;
	if (objectidentifier == null)
	{
		if (other.objectidentifier != null)
			return false;
	}
	else if (!objectidentifier.equals(other.objectidentifier))
		return false;
	if (systemInformation == null)
	{
		if (other.systemInformation != null)
			return false;
	}
	else if (!systemInformation.equals(other.systemInformation))
		return false;
	return true;
}

	/**
	hashcode:
	*/
public int hashCode()
{
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((beffdate == null) ? 0 : beffdate.hashCode());
	result = prime * result + ((beffdatecnf == null) ? 0 : beffdatecnf.hashCode());
	result = prime * result + ((betdate == null) ? 0 : betdate.hashCode());
	result = prime * result + ((betdatecnf == null) ? 0 : betdatecnf.hashCode());
	result = prime * result + ((pdsUpdateMode== null) ? 0 : pdsUpdateMode.hashCode());
	result = prime * result + ((channelType == null) ? 0 : channelType.hashCode());
	result = prime * result + ((channelUsage== null) ? 0 : channelUsage.hashCode());	
	result = prime * result + ((commValue == null) ? 0 : commValue.hashCode());
	result = prime * result + ((objectidentifier == null) ? 0 : objectidentifier.hashCode());
	return result;
}

	/**
	toString
	*/
public String toString()
	{	
		StringBuffer objStr = new StringBuffer();
	
		if (channelType != null)
			objStr.append(channelType.getText() + "-");
		objStr.append(commValue);
		return objStr.toString();
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String ChannelType = "channelType";
		public static final String CommValue = "commValue";
		public static final String Objectidentifier = "objectidentifier";
		public static final String Beffdate = "beffdate";
		public static final String Beffdatecnf = "beffdatecnf";
		public static final String Betdate = "betdate";
		public static final String Betdatecnf = "betdatecnf";
		public static final String PdsUpdateMode = "pdsUpdateMode";
		public static final String ChannelUsage = "channelUsage";
	}
}

