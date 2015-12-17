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
 * @author Rory Fitzpatrick
 * Generated.
 */


public class PatientNotification extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1003100125;
	private static final long serialVersionUID = 1003100125L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	private ims.core.clinical.domain.objects.PatientOCSNewResults newResults;
	private ims.core.clinical.domain.objects.PatientOCSSeenResults seenResults;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatientNotification (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientNotification ()
    {
    	super();
    }
    public PatientNotification (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.PatientNotification.class;
	}


	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public ims.core.clinical.domain.objects.PatientOCSNewResults getNewResults() {
		return newResults;
	}
	public void setNewResults(ims.core.clinical.domain.objects.PatientOCSNewResults newResults) {
		this.newResults = newResults;
	}

	public ims.core.clinical.domain.objects.PatientOCSSeenResults getSeenResults() {
		return seenResults;
	}
	public void setSeenResults(ims.core.clinical.domain.objects.PatientOCSSeenResults seenResults) {
		this.seenResults = seenResults;
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
	// method generated based on 'ponpatient_idx' unique index.
	public static boolean recordExistForPatient(ims.domain.ILightweightDomainFactory factory,
		 ims.core.patient.domain.objects.Patient patient
	)	
	{
		return recordExistForPatient(factory, patient, null);
	}	

	// method generated based on 'ponpatient_idx' unique index.
	public static boolean recordExistForPatient(ims.domain.ILightweightDomainFactory factory,
		 ims.core.patient.domain.objects.Patient patient
	, Integer recordId)	
	{
		String[] names = new String[1];
		Object[] values = new Object[1];
		StringBuffer hql = new StringBuffer();
		
		hql.append("from PatientNotification c where ");
		hql.append(" c.patient = :patient ");
		names[0] = "patient";
		values[0] = patient;		
		if(recordId != null)
		{
			hql.append(" and c.id <> " + recordId);
		}
		
		return factory.count(hql.toString(), names, values) > 0;				
	}	

	// method generated based on 'ponpatient_idx' unique index.
	public static PatientNotification getRecordByPatient(ims.domain.ILightweightDomainFactory factory,
	 ims.core.patient.domain.objects.Patient patient
	)
	{
		String[] names = new String[1];
		Object[] values = new Object[1];
		StringBuffer hql = new StringBuffer();
		hql.append("from PatientNotification c where ");
		hql.append(" c.patient = :patient ");
		names[0] = "patient";
		values[0] = patient;		
		java.util.List l = factory.find(hql.toString(), names, values);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. " + hql + " returned " + l.size() + " records. " );
		return (PatientNotification)l.get(0);
	}

	public static PatientNotification getPatientNotificationFromponpatient_idx(ims.domain.ILightweightDomainFactory factory,
	 ims.core.patient.domain.objects.Patient patient
	)
	{
		String[] names = new String[1];
		Object[] values = new Object[1];
		StringBuffer hql = new StringBuffer();
		hql.append("from PatientNotification c where ");
		hql.append(" c.patient = :patient ");
		names[0] = "patient";
		values[0] = patient;		
		java.util.List l = factory.find(hql.toString(), names, values);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. " + hql + " returned " + l.size() + " records. " );
		return (PatientNotification)l.get(0);
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
		
		auditStr.append("\r\n*patient* :");
		if (patient != null)
		{
			auditStr.append(toShortClassName(patient));
				
		    auditStr.append(patient.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*newResults* :");
		if (newResults != null)
		{
			auditStr.append(toShortClassName(newResults));
				
		    auditStr.append(newResults.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*seenResults* :");
		if (seenResults != null)
		{
			auditStr.append(toShortClassName(seenResults));
				
		    auditStr.append(seenResults.getId());
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
		
		String keyClassName = "PatientNotification";
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
		if (this.getPatient() != null)
		{
			sb.append("<patient>");
			sb.append(this.getPatient().toXMLString(domMap)); 	
			sb.append("</patient>");		
		}
		if (this.getNewResults() != null)
		{
			sb.append("<newResults>");
			sb.append(this.getNewResults().toXMLString(domMap)); 	
			sb.append("</newResults>");		
		}
		if (this.getSeenResults() != null)
		{
			sb.append("<seenResults>");
			sb.append(this.getSeenResults().toXMLString(domMap)); 	
			sb.append("</seenResults>");		
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
			PatientNotification domainObject = getPatientNotificationfromXML(itemEl, factory, domMap);

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
			PatientNotification domainObject = getPatientNotificationfromXML(itemEl, factory, domMap);

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
		
	public static PatientNotification getPatientNotificationfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientNotificationfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientNotification getPatientNotificationfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientNotification.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientNotification.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientNotification class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientNotification)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientNotification.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientNotification ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientNotification)factory.getImportedDomainObject(PatientNotification.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientNotification();
		}
		String keyClassName = "PatientNotification";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientNotification)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientNotification obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("newResults");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setNewResults(ims.core.clinical.domain.objects.PatientOCSNewResults.getPatientOCSNewResultsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("seenResults");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSeenResults(ims.core.clinical.domain.objects.PatientOCSSeenResults.getPatientOCSSeenResultsfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		};
	}

	/**
	incrementNewResults - Function that increments the New Results value. If the NewResults object is null will return -1. If the NewResults.NewCount is null will return -2. If the functions succeeds it will return the value of NewResults.NewCount
	*/
public int incrementNewResults()
{
	// Error codes
	//	-1 - NewResults object is null
	//	-2 - NewResults.NewCount object is null
		
	if (this.newResults == null)
		return -1;
		
	if (this.newResults.getNewCount() == null)
		return -2;
		
	this.newResults.setNewCount(this.newResults.getNewCount() + 1);
		
	return this.newResults.getNewCount();
}


	/**
	incrementSeenResults - Function that increments the Seen Results value. If the SeenResults object is null will return -1. If the SeenResults.SeenCount is null will return -2. If the functions succeeds it will return the value of SeenResults.SeenCount
	*/
public int incrementSeenResults()
{
	// Error codes
	//	-1 - SeenResults object is null
	//	-2 - SeenResults.SeenCount object is null
	
	if (this.seenResults == null)
		return -1;
	
	if (this.seenResults.getSeenCount() == null)
		return -2;
	
	this.seenResults.setSeenCount(this.seenResults.getSeenCount() + 1);
	
	return this.seenResults.getSeenCount();
}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Patient = "patient";
		public static final String NewResults = "newResults";
		public static final String SeenResults = "seenResults";
	}
}

