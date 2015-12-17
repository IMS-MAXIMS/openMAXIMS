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
package ims.core.clinical.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class ClinicalNoteNoteStatus extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1003100078;
	private static final long serialVersionUID = 1003100078L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Status */
	private ims.domain.lookups.LookupInstance status;
	/** MOS */
	private ims.core.resource.people.domain.objects.MemberOfStaff mOS;
	/** DateTime */
	private java.util.Date dateTime;
	/** Clinical Note */
	private String clinicalNote;
	/** CorrectionReason */
	private String correctionReason;
	/** CorrectionConfirmed */
	private Boolean correctionConfirmed;
	/** CorrectedBy */
	private ims.core.resource.people.domain.objects.MemberOfStaff correctedBy;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ClinicalNoteNoteStatus (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ClinicalNoteNoteStatus ()
    {
    	super();
    }
    public ClinicalNoteNoteStatus (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.ClinicalNoteNoteStatus.class;
	}


	public ims.domain.lookups.LookupInstance getStatus() {
		return status;
	}
	public void setStatus(ims.domain.lookups.LookupInstance status) {
		this.status = status;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getMOS() {
		return mOS;
	}
	public void setMOS(ims.core.resource.people.domain.objects.MemberOfStaff mOS) {
		this.mOS = mOS;
	}

	public java.util.Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(java.util.Date dateTime) {
		this.dateTime = dateTime;
	}

	public String getClinicalNote() {
		return clinicalNote;
	}
	public void setClinicalNote(String clinicalNote) {
		this.clinicalNote = clinicalNote;
	}

	public String getCorrectionReason() {
		return correctionReason;
	}
	public void setCorrectionReason(String correctionReason) {
		this.correctionReason = correctionReason;
	}

	public Boolean isCorrectionConfirmed() {
		return correctionConfirmed;
	}
	public void setCorrectionConfirmed(Boolean correctionConfirmed) {
		this.correctionConfirmed = correctionConfirmed;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getCorrectedBy() {
		return correctedBy;
	}
	public void setCorrectedBy(ims.core.resource.people.domain.objects.MemberOfStaff correctedBy) {
		this.correctedBy = correctedBy;
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
		auditStr.append("\r\n*mOS* :");
		if (mOS != null)
		{
			auditStr.append(toShortClassName(mOS));
				
		    auditStr.append(mOS.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*dateTime* :");
		auditStr.append(dateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalNote* :");
		auditStr.append(clinicalNote);
	    auditStr.append("; ");
		auditStr.append("\r\n*correctionReason* :");
		auditStr.append(correctionReason);
	    auditStr.append("; ");
		auditStr.append("\r\n*correctionConfirmed* :");
		auditStr.append(correctionConfirmed);
	    auditStr.append("; ");
		auditStr.append("\r\n*correctedBy* :");
		if (correctedBy != null)
		{
			auditStr.append(toShortClassName(correctedBy));
				
		    auditStr.append(correctedBy.getId());
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
		
		String keyClassName = "ClinicalNoteNoteStatus";
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
		if (this.getMOS() != null)
		{
			sb.append("<mOS>");
			sb.append(this.getMOS().toXMLString(domMap)); 	
			sb.append("</mOS>");		
		}
		if (this.getDateTime() != null)
		{
			sb.append("<dateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateTime>");		
		}
		if (this.getClinicalNote() != null)
		{
			sb.append("<clinicalNote>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getClinicalNote().toString()));
			sb.append("</clinicalNote>");		
		}
		if (this.getCorrectionReason() != null)
		{
			sb.append("<correctionReason>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCorrectionReason().toString()));
			sb.append("</correctionReason>");		
		}
		if (this.isCorrectionConfirmed() != null)
		{
			sb.append("<correctionConfirmed>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isCorrectionConfirmed().toString()));
			sb.append("</correctionConfirmed>");		
		}
		if (this.getCorrectedBy() != null)
		{
			sb.append("<correctedBy>");
			sb.append(this.getCorrectedBy().toXMLString(domMap)); 	
			sb.append("</correctedBy>");		
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
			ClinicalNoteNoteStatus domainObject = getClinicalNoteNoteStatusfromXML(itemEl, factory, domMap);

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
			ClinicalNoteNoteStatus domainObject = getClinicalNoteNoteStatusfromXML(itemEl, factory, domMap);

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
		
	public static ClinicalNoteNoteStatus getClinicalNoteNoteStatusfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getClinicalNoteNoteStatusfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ClinicalNoteNoteStatus getClinicalNoteNoteStatusfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ClinicalNoteNoteStatus.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ClinicalNoteNoteStatus.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ClinicalNoteNoteStatus class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ClinicalNoteNoteStatus)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ClinicalNoteNoteStatus.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ClinicalNoteNoteStatus ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ClinicalNoteNoteStatus)factory.getImportedDomainObject(ClinicalNoteNoteStatus.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ClinicalNoteNoteStatus();
		}
		String keyClassName = "ClinicalNoteNoteStatus";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ClinicalNoteNoteStatus)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ClinicalNoteNoteStatus obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("status");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("mOS");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setMOS(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("dateTime");
		if(fldEl != null)
		{	
    		obj.setDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("clinicalNote");
		if(fldEl != null)
		{	
    		obj.setClinicalNote(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("correctionReason");
		if(fldEl != null)
		{	
    		obj.setCorrectionReason(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("correctionConfirmed");
		if(fldEl != null)
		{	
    		obj.setCorrectionConfirmed(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("correctedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCorrectedBy(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
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
		public static final String MOS = "mOS";
		public static final String DateTime = "dateTime";
		public static final String ClinicalNote = "clinicalNote";
		public static final String CorrectionReason = "correctionReason";
		public static final String CorrectionConfirmed = "correctionConfirmed";
		public static final String CorrectedBy = "correctedBy";
	}
}

