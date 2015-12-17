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
package ims.eas.domain.objects;

/**
 * 
 * @author Barbara Worwood
 * Generated.
 */


public class EASStatusRecord extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1113100001;
	private static final long serialVersionUID = 1113100001L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Status of this record */
	private ims.domain.lookups.LookupInstance status;
	/** The MOS who modified the status change */
	private ims.core.resource.people.domain.objects.MemberOfStaff recordingMos;
	/** The time this change was made */
	private java.util.Date recordingDateTime;
	/** Is the TP Created flag set at this stage */
	private Boolean tPCreated;
	/** Is the ActionRequired flag set at this stage */
	private Boolean actionRequired;
	/** Can be used to record such things as Cancellation Reason */
	private String comment;
	/** Has this EAS record been manually removed */
	private Boolean removedStat;
	private ims.domain.lookups.LookupInstance removalReason;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public EASStatusRecord (Integer id, int ver)
    {
    	super(id, ver);
    }
    public EASStatusRecord ()
    {
    	super();
    }
    public EASStatusRecord (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.eas.domain.objects.EASStatusRecord.class;
	}


	public ims.domain.lookups.LookupInstance getStatus() {
		return status;
	}
	public void setStatus(ims.domain.lookups.LookupInstance status) {
		this.status = status;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getRecordingMos() {
		return recordingMos;
	}
	public void setRecordingMos(ims.core.resource.people.domain.objects.MemberOfStaff recordingMos) {
		this.recordingMos = recordingMos;
	}

	public java.util.Date getRecordingDateTime() {
		return recordingDateTime;
	}
	public void setRecordingDateTime(java.util.Date recordingDateTime) {
		this.recordingDateTime = recordingDateTime;
	}

	public Boolean isTPCreated() {
		return tPCreated;
	}
	public void setTPCreated(Boolean tPCreated) {
		this.tPCreated = tPCreated;
	}

	public Boolean isActionRequired() {
		return actionRequired;
	}
	public void setActionRequired(Boolean actionRequired) {
		this.actionRequired = actionRequired;
	}

	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		if ( null != comment && comment.length() > 250 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for comment. Tried to set value: "+
				comment);
		}
		this.comment = comment;
	}

	public Boolean isRemovedStat() {
		return removedStat;
	}
	public void setRemovedStat(Boolean removedStat) {
		this.removedStat = removedStat;
	}

	public ims.domain.lookups.LookupInstance getRemovalReason() {
		return removalReason;
	}
	public void setRemovalReason(ims.domain.lookups.LookupInstance removalReason) {
		this.removalReason = removalReason;
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
		
		auditStr.append("\r\n*status* :");
		if (status != null)
			auditStr.append(status.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*recordingMos* :");
		if (recordingMos != null)
		{
			auditStr.append(toShortClassName(recordingMos));
				
		    auditStr.append(recordingMos.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*recordingDateTime* :");
		auditStr.append(recordingDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*tPCreated* :");
		auditStr.append(tPCreated);
	    auditStr.append("; ");
		auditStr.append("\r\n*actionRequired* :");
		auditStr.append(actionRequired);
	    auditStr.append("; ");
		auditStr.append("\r\n*comment* :");
		auditStr.append(comment);
	    auditStr.append("; ");
		auditStr.append("\r\n*removedStat* :");
		auditStr.append(removedStat);
	    auditStr.append("; ");
		auditStr.append("\r\n*removalReason* :");
		if (removalReason != null)
			auditStr.append(removalReason.getText());
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
		
		String keyClassName = "EASStatusRecord";
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
		if (this.getStatus() != null)
		{
			sb.append("<status>");
			sb.append(this.getStatus().toXMLString()); 
			sb.append("</status>");		
		}
		if (this.getRecordingMos() != null)
		{
			sb.append("<recordingMos>");
			sb.append(this.getRecordingMos().toXMLString(domMap)); 	
			sb.append("</recordingMos>");		
		}
		if (this.getRecordingDateTime() != null)
		{
			sb.append("<recordingDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getRecordingDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</recordingDateTime>");		
		}
		if (this.isTPCreated() != null)
		{
			sb.append("<tPCreated>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isTPCreated().toString()));
			sb.append("</tPCreated>");		
		}
		if (this.isActionRequired() != null)
		{
			sb.append("<actionRequired>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isActionRequired().toString()));
			sb.append("</actionRequired>");		
		}
		if (this.getComment() != null)
		{
			sb.append("<comment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComment().toString()));
			sb.append("</comment>");		
		}
		if (this.isRemovedStat() != null)
		{
			sb.append("<removedStat>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isRemovedStat().toString()));
			sb.append("</removedStat>");		
		}
		if (this.getRemovalReason() != null)
		{
			sb.append("<removalReason>");
			sb.append(this.getRemovalReason().toXMLString()); 
			sb.append("</removalReason>");		
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
			EASStatusRecord domainObject = getEASStatusRecordfromXML(itemEl, factory, domMap);

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
			EASStatusRecord domainObject = getEASStatusRecordfromXML(itemEl, factory, domMap);

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
		
	public static EASStatusRecord getEASStatusRecordfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getEASStatusRecordfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static EASStatusRecord getEASStatusRecordfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!EASStatusRecord.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!EASStatusRecord.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the EASStatusRecord class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (EASStatusRecord)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(EASStatusRecord.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		EASStatusRecord ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (EASStatusRecord)factory.getImportedDomainObject(EASStatusRecord.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new EASStatusRecord();
		}
		String keyClassName = "EASStatusRecord";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (EASStatusRecord)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, EASStatusRecord obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("status");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("recordingMos");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRecordingMos(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("recordingDateTime");
		if(fldEl != null)
		{	
    		obj.setRecordingDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("tPCreated");
		if(fldEl != null)
		{	
    		obj.setTPCreated(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("actionRequired");
		if(fldEl != null)
		{	
    		obj.setActionRequired(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("comment");
		if(fldEl != null)
		{	
    		obj.setComment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("removedStat");
		if(fldEl != null)
		{	
    		obj.setRemovedStat(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("removalReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRemovalReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		public static final String Status = "status";
		public static final String RecordingMos = "recordingMos";
		public static final String RecordingDateTime = "recordingDateTime";
		public static final String TPCreated = "tPCreated";
		public static final String ActionRequired = "actionRequired";
		public static final String Comment = "comment";
		public static final String RemovedStat = "removedStat";
		public static final String RemovalReason = "removalReason";
	}
}

