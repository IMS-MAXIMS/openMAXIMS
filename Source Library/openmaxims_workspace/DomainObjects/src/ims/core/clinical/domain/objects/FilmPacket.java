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
package ims.core.clinical.domain.objects;

/**
 * 
 * @author Rory Fitzpatrick
 * Generated.
 */


public class FilmPacket extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1003100115;
	private static final long serialVersionUID = 1003100115L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** MediaType */
	private ims.domain.lookups.LookupInstance mediaType;
	/** RecordingUser */
	private ims.core.resource.people.domain.objects.MemberOfStaff recordingUser;
	/** RecordingDateTime */
	private java.util.Date recordingDateTime;
	/** Transfer History
	  * Collection of ims.core.clinical.domain.objects.FilmPacketTransfer.
	  */
	private java.util.List transferHistory;
	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** Hospital */
	private String hospital;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public FilmPacket (Integer id, int ver)
    {
    	super(id, ver);
    }
    public FilmPacket ()
    {
    	super();
    }
    public FilmPacket (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.FilmPacket.class;
	}


	public ims.domain.lookups.LookupInstance getMediaType() {
		return mediaType;
	}
	public void setMediaType(ims.domain.lookups.LookupInstance mediaType) {
		this.mediaType = mediaType;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getRecordingUser() {
		return recordingUser;
	}
	public void setRecordingUser(ims.core.resource.people.domain.objects.MemberOfStaff recordingUser) {
		this.recordingUser = recordingUser;
	}

	public java.util.Date getRecordingDateTime() {
		return recordingDateTime;
	}
	public void setRecordingDateTime(java.util.Date recordingDateTime) {
		this.recordingDateTime = recordingDateTime;
	}

	public java.util.List getTransferHistory() {
		if ( null == transferHistory ) {
			transferHistory = new java.util.ArrayList();
		}
		return transferHistory;
	}
	public void setTransferHistory(java.util.List paramValue) {
		this.transferHistory = paramValue;
	}

	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public String getHospital() {
		return hospital;
	}
	public void setHospital(String hospital) {
		if ( null != hospital && hospital.length() > 60 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for hospital. Tried to set value: "+
				hospital);
		}
		this.hospital = hospital;
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
		
		auditStr.append("\r\n*mediaType* :");
		if (mediaType != null)
			auditStr.append(mediaType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*recordingUser* :");
		if (recordingUser != null)
		{
			auditStr.append(toShortClassName(recordingUser));
				
		    auditStr.append(recordingUser.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*recordingDateTime* :");
		auditStr.append(recordingDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*transferHistory* :");
		if (transferHistory != null)
		{
		int i4=0;
		for (i4=0; i4<transferHistory.size(); i4++)
		{
			if (i4 > 0)
				auditStr.append(",");
			ims.core.clinical.domain.objects.FilmPacketTransfer obj = (ims.core.clinical.domain.objects.FilmPacketTransfer)transferHistory.get(i4);
		    if (obj != null)
			{
				if (i4 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i4 > 0)
			auditStr.append("] " + i4);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*patient* :");
		if (patient != null)
		{
			auditStr.append(toShortClassName(patient));
				
		    auditStr.append(patient.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*hospital* :");
		auditStr.append(hospital);
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
		
		String keyClassName = "FilmPacket";
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
		if (this.getMediaType() != null)
		{
			sb.append("<mediaType>");
			sb.append(this.getMediaType().toXMLString()); 
			sb.append("</mediaType>");		
		}
		if (this.getRecordingUser() != null)
		{
			sb.append("<recordingUser>");
			sb.append(this.getRecordingUser().toXMLString(domMap)); 	
			sb.append("</recordingUser>");		
		}
		if (this.getRecordingDateTime() != null)
		{
			sb.append("<recordingDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getRecordingDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</recordingDateTime>");		
		}
		if (this.getTransferHistory() != null)
		{
			if (this.getTransferHistory().size() > 0 )
			{
			sb.append("<transferHistory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getTransferHistory(), domMap));
			sb.append("</transferHistory>");		
			}
		}
		if (this.getPatient() != null)
		{
			sb.append("<patient>");
			sb.append(this.getPatient().toXMLString(domMap)); 	
			sb.append("</patient>");		
		}
		if (this.getHospital() != null)
		{
			sb.append("<hospital>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getHospital().toString()));
			sb.append("</hospital>");		
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
			FilmPacket domainObject = getFilmPacketfromXML(itemEl, factory, domMap);

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
			FilmPacket domainObject = getFilmPacketfromXML(itemEl, factory, domMap);

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
		
	public static FilmPacket getFilmPacketfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getFilmPacketfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static FilmPacket getFilmPacketfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!FilmPacket.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!FilmPacket.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the FilmPacket class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (FilmPacket)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(FilmPacket.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		FilmPacket ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (FilmPacket)factory.getImportedDomainObject(FilmPacket.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new FilmPacket();
		}
		String keyClassName = "FilmPacket";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (FilmPacket)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, FilmPacket obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("mediaType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMediaType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("recordingUser");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRecordingUser(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("recordingDateTime");
		if(fldEl != null)
		{	
    		obj.setRecordingDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("transferHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setTransferHistory(ims.core.clinical.domain.objects.FilmPacketTransfer.fromListXMLString(fldEl, factory, obj.getTransferHistory(), domMap));
		}
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("hospital");
		if(fldEl != null)
		{	
    		obj.setHospital(new String(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "transferHistory"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String MediaType = "mediaType";
		public static final String RecordingUser = "recordingUser";
		public static final String RecordingDateTime = "recordingDateTime";
		public static final String TransferHistory = "transferHistory";
		public static final String Patient = "patient";
		public static final String Hospital = "hospital";
	}
}

