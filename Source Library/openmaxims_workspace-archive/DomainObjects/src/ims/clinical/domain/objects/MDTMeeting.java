//#############################################################################
//#                                                                           #
//#  Copyright (C) <2014>  <IMS MAXIMS>                                       #
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
//#############################################################################
//#EOH
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 16/04/2014, 12:34
 *
 */
package ims.clinical.domain.objects;

/**
 * 
 * @author Joan Heelan
 * Generated.
 */


public class MDTMeeting extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100024;
	private static final long serialVersionUID = 1072100024L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** MDT Meeting Date */
	private java.util.Date mDTMeetingDate;
	/** MeetingNotes
	  * Collection of ims.clinical.domain.objects.MDTNotes.
	  */
	private java.util.List meetingNotes;
	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** List Patient is On */
	private ims.domain.lookups.LookupInstance listPatientisOn;
	/** KeyDates
	  * Collection of ims.clinical.domain.objects.KeyDates.
	  */
	private java.util.Set keyDates;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public MDTMeeting (Integer id, int ver)
    {
    	super(id, ver);
    }
    public MDTMeeting ()
    {
    	super();
    }
    public MDTMeeting (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.domain.objects.MDTMeeting.class;
	}


	public java.util.Date getMDTMeetingDate() {
		return mDTMeetingDate;
	}
	public void setMDTMeetingDate(java.util.Date mDTMeetingDate) {
		this.mDTMeetingDate = mDTMeetingDate;
	}

	public java.util.List getMeetingNotes() {
		if ( null == meetingNotes ) {
			meetingNotes = new java.util.ArrayList();
		}
		return meetingNotes;
	}
	public void setMeetingNotes(java.util.List paramValue) {
		this.meetingNotes = paramValue;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.domain.lookups.LookupInstance getListPatientisOn() {
		return listPatientisOn;
	}
	public void setListPatientisOn(ims.domain.lookups.LookupInstance listPatientisOn) {
		this.listPatientisOn = listPatientisOn;
	}

	public java.util.Set getKeyDates() {
		if ( null == keyDates ) {
			keyDates = new java.util.HashSet();
		}
		return keyDates;
	}
	public void setKeyDates(java.util.Set paramValue) {
		this.keyDates = paramValue;
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
		
		auditStr.append("\r\n*mDTMeetingDate* :");
		auditStr.append(mDTMeetingDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*meetingNotes* :");
		if (meetingNotes != null)
		{
		int i2=0;
		for (i2=0; i2<meetingNotes.size(); i2++)
		{
			if (i2 > 0)
				auditStr.append(",");
			ims.clinical.domain.objects.MDTNotes obj = (ims.clinical.domain.objects.MDTNotes)meetingNotes.get(i2);
		    if (obj != null)
			{
				if (i2 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i2 > 0)
			auditStr.append("] " + i2);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*listPatientisOn* :");
		if (listPatientisOn != null)
			auditStr.append(listPatientisOn.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*keyDates* :");
		if (keyDates != null)
		{
			java.util.Iterator it5 = keyDates.iterator();
			int i5=0;
			while (it5.hasNext())
			{
				if (i5 > 0)
					auditStr.append(",");
				ims.clinical.domain.objects.KeyDates obj = (ims.clinical.domain.objects.KeyDates)it5.next();
		if (obj != null)
		{
		   if (i5 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i5++;
		}
		if (i5 > 0)
			auditStr.append("] " + i5);
		}
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
		sb.append(" id=\"" + this.getId() + "\""); 
		sb.append(" source=\"" + ims.configuration.EnvironmentConfig.getImportExportSourceName() + "\" ");
		sb.append(" classVersion=\"" + this.getClassVersion() + "\" ");
		sb.append(" component=\"" + this.getIsComponentClass() + "\" >");
		
		if (domMap.get(this) == null)
		{
			domMap.put(this, this);
			sb.append(this.fieldsToXMLString(domMap));
		}
		sb.append("</class>");
		
		String keyClassName = "MDTMeeting";
		String externalSource = ims.configuration.EnvironmentConfig.getImportExportSourceName();
		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + this.getId());
		if (impObj == null)
		{
    		impObj = new ims.configuration.ImportedObject();
    		impObj.setExternalId(this.getId());
    		impObj.setExternalSource(externalSource);
    		impObj.setDomainObject(this);
			impObj.setLocalId(this.getId()); 
    		impObj.setClassName(keyClassName); 
			domMap.put(keyClassName + "_" + externalSource + "_" + this.getId(), impObj);
		}
		
		return sb.toString();
	}

	public String fieldsToXMLString(java.util.HashMap domMap)
	{
		StringBuffer sb = new StringBuffer();
		if (this.getMDTMeetingDate() != null)
		{
			sb.append("<mDTMeetingDate>");
			sb.append(new ims.framework.utils.DateTime(this.getMDTMeetingDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</mDTMeetingDate>");		
		}
		if (this.getMeetingNotes() != null)
		{
			if (this.getMeetingNotes().size() > 0 )
			{
			sb.append("<meetingNotes>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getMeetingNotes(), domMap));
			sb.append("</meetingNotes>");		
			}
		}
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getListPatientisOn() != null)
		{
			sb.append("<listPatientisOn>");
			sb.append(this.getListPatientisOn().toXMLString()); 
			sb.append("</listPatientisOn>");		
		}
		if (this.getKeyDates() != null)
		{
			if (this.getKeyDates().size() > 0 )
			{
			sb.append("<keyDates>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getKeyDates(), domMap));
			sb.append("</keyDates>");		
			}
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
			MDTMeeting domainObject = getMDTMeetingfromXML(itemEl, factory, domMap);

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
			MDTMeeting domainObject = getMDTMeetingfromXML(itemEl, factory, domMap);

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
		
	public static MDTMeeting getMDTMeetingfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getMDTMeetingfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static MDTMeeting getMDTMeetingfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!MDTMeeting.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!MDTMeeting.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the MDTMeeting class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (MDTMeeting)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(MDTMeeting.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		MDTMeeting ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (MDTMeeting)factory.getImportedDomainObject(MDTMeeting.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new MDTMeeting();
		}
		String keyClassName = "MDTMeeting";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (MDTMeeting)impObj.getDomainObject();
		}
		else
		{
    		impObj = new ims.configuration.ImportedObject();
    		impObj.setExternalId(extId);
    		impObj.setExternalSource(externalSource);
    		impObj.setDomainObject(ret);
			domMap.put(keyClassName + "_" + externalSource + "_" + extId, impObj);
		}
		fillFieldsfromXML(el, factory, ret, domMap);
		return ret;
	}

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, MDTMeeting obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("mDTMeetingDate");
		if(fldEl != null)
		{	
    		obj.setMDTMeetingDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("meetingNotes");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setMeetingNotes(ims.clinical.domain.objects.MDTNotes.fromListXMLString(fldEl, factory, obj.getMeetingNotes(), domMap));
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("listPatientisOn");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setListPatientisOn(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("keyDates");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setKeyDates(ims.clinical.domain.objects.KeyDates.fromSetXMLString(fldEl, factory, obj.getKeyDates(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "meetingNotes"
		, "keyDates"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String MDTMeetingDate = "mDTMeetingDate";
		public static final String MeetingNotes = "meetingNotes";
		public static final String CareContext = "careContext";
		public static final String ListPatientisOn = "listPatientisOn";
		public static final String KeyDates = "keyDates";
	}
}

