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
package ims.dto_move.domain.objects;

/**
 * 
 * @author Sean Nesbitt
 * Generated.
 */


public class AppointmentTransport extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1105100035;
	private static final long serialVersionUID = 1105100035L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Inward referance Id */
	private String inwardref;
	/** Outward referance ID */
	private String outwardref;
	/** Appointment start date id refers to */
	private java.util.Date apptrefstart;
	/** Appointment end date id refers to */
	private java.util.Date apprefend;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public AppointmentTransport (Integer id, int ver)
    {
    	super(id, ver);
		isComponentClass=true;
    }
    public AppointmentTransport ()
    {
    	super();
		isComponentClass=true;
    }
    public AppointmentTransport (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
		isComponentClass=true;
    }
	public Class getRealDomainClass()
	{
		return ims.dto_move.domain.objects.AppointmentTransport.class;
	}


	public String getInwardref() {
		return inwardref;
	}
	public void setInwardref(String inwardref) {
		if ( null != inwardref && inwardref.length() > 15 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for inwardref. Tried to set value: "+
				inwardref);
		}
		this.inwardref = inwardref;
	}

	public String getOutwardref() {
		return outwardref;
	}
	public void setOutwardref(String outwardref) {
		if ( null != outwardref && outwardref.length() > 15 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for outwardref. Tried to set value: "+
				outwardref);
		}
		this.outwardref = outwardref;
	}

	public java.util.Date getApptrefstart() {
		return apptrefstart;
	}
	public void setApptrefstart(java.util.Date apptrefstart) {
		this.apptrefstart = apptrefstart;
	}

	public java.util.Date getApprefend() {
		return apprefend;
	}
	public void setApprefend(java.util.Date apprefend) {
		this.apprefend = apprefend;
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
		
		auditStr.append("\r\n*inwardref* :");
		auditStr.append(inwardref);
	    auditStr.append("; ");
		auditStr.append("\r\n*outwardref* :");
		auditStr.append(outwardref);
	    auditStr.append("; ");
		auditStr.append("\r\n*apptrefstart* :");
		auditStr.append(apptrefstart);
	    auditStr.append("; ");
		auditStr.append("\r\n*apprefend* :");
		auditStr.append(apprefend);
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
		if (this.getInwardref() != null)
		{
			sb.append("<inwardref>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getInwardref().toString()));
			sb.append("</inwardref>");		
		}
		if (this.getOutwardref() != null)
		{
			sb.append("<outwardref>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOutwardref().toString()));
			sb.append("</outwardref>");		
		}
		if (this.getApptrefstart() != null)
		{
			sb.append("<apptrefstart>");
			sb.append(new ims.framework.utils.DateTime(this.getApptrefstart()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</apptrefstart>");		
		}
		if (this.getApprefend() != null)
		{
			sb.append("<apprefend>");
			sb.append(new ims.framework.utils.DateTime(this.getApprefend()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</apprefend>");		
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
			AppointmentTransport domainObject = getAppointmentTransportfromXML(itemEl, factory, domMap);

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
			AppointmentTransport domainObject = getAppointmentTransportfromXML(itemEl, factory, domMap);

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
		
	public static AppointmentTransport getAppointmentTransportfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getAppointmentTransportfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static AppointmentTransport getAppointmentTransportfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!AppointmentTransport.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!AppointmentTransport.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the AppointmentTransport class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (AppointmentTransport)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(AppointmentTransport.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		AppointmentTransport ret = null;
		if (ret == null)
		{
			ret = new AppointmentTransport();
		}
		fillFieldsfromXML(el, factory, ret, domMap);
		return ret;
	}

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, AppointmentTransport obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("inwardref");
		if(fldEl != null)
		{	
    		obj.setInwardref(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("outwardref");
		if(fldEl != null)
		{	
    		obj.setOutwardref(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("apptrefstart");
		if(fldEl != null)
		{	
    		obj.setApptrefstart(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("apprefend");
		if(fldEl != null)
		{	
    		obj.setApprefend(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Inwardref = "inwardref";
		public static final String Outwardref = "outwardref";
		public static final String Apptrefstart = "apptrefstart";
		public static final String Apprefend = "apprefend";
	}
}

