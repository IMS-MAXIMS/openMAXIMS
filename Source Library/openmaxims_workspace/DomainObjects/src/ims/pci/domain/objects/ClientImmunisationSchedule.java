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
package ims.pci.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class ClientImmunisationSchedule extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1091100006;
	private static final long serialVersionUID = 1091100006L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Client */
	private ims.core.patient.domain.objects.Patient client;
	/** ScheduleProfiles
	  * Collection of ims.pci.domain.objects.ClientPCIScheduleProfile.
	  */
	private java.util.Set scheduleProfiles;
	/** Stages
	  * Collection of ims.pci.domain.objects.ClientScheduleStage.
	  */
	private java.util.Set stages;
	/** Vaccine Summary Status
	  * Collection of ims.pci.domain.objects.ClientVaccineSummary.
	  */
	private java.util.Set vaccineSummaryStatus;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ClientImmunisationSchedule (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ClientImmunisationSchedule ()
    {
    	super();
    }
    public ClientImmunisationSchedule (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.pci.domain.objects.ClientImmunisationSchedule.class;
	}


	public ims.core.patient.domain.objects.Patient getClient() {
		return client;
	}
	public void setClient(ims.core.patient.domain.objects.Patient client) {
		this.client = client;
	}

	public java.util.Set getScheduleProfiles() {
		if ( null == scheduleProfiles ) {
			scheduleProfiles = new java.util.HashSet();
		}
		return scheduleProfiles;
	}
	public void setScheduleProfiles(java.util.Set paramValue) {
		this.scheduleProfiles = paramValue;
	}

	public java.util.Set getStages() {
		if ( null == stages ) {
			stages = new java.util.HashSet();
		}
		return stages;
	}
	public void setStages(java.util.Set paramValue) {
		this.stages = paramValue;
	}

	public java.util.Set getVaccineSummaryStatus() {
		if ( null == vaccineSummaryStatus ) {
			vaccineSummaryStatus = new java.util.HashSet();
		}
		return vaccineSummaryStatus;
	}
	public void setVaccineSummaryStatus(java.util.Set paramValue) {
		this.vaccineSummaryStatus = paramValue;
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
		
		auditStr.append("\r\n*client* :");
		if (client != null)
		{
			auditStr.append(toShortClassName(client));
				
		    auditStr.append(client.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*scheduleProfiles* :");
		if (scheduleProfiles != null)
		{
			java.util.Iterator it2 = scheduleProfiles.iterator();
			int i2=0;
			while (it2.hasNext())
			{
				if (i2 > 0)
					auditStr.append(",");
				ims.pci.domain.objects.ClientPCIScheduleProfile obj = (ims.pci.domain.objects.ClientPCIScheduleProfile)it2.next();
		if (obj != null)
		{
		   if (i2 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i2++;
		}
		if (i2 > 0)
			auditStr.append("] " + i2);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*stages* :");
		if (stages != null)
		{
			java.util.Iterator it3 = stages.iterator();
			int i3=0;
			while (it3.hasNext())
			{
				if (i3 > 0)
					auditStr.append(",");
				ims.pci.domain.objects.ClientScheduleStage obj = (ims.pci.domain.objects.ClientScheduleStage)it3.next();
		if (obj != null)
		{
		   if (i3 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i3++;
		}
		if (i3 > 0)
			auditStr.append("] " + i3);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*vaccineSummaryStatus* :");
		if (vaccineSummaryStatus != null)
		{
			java.util.Iterator it4 = vaccineSummaryStatus.iterator();
			int i4=0;
			while (it4.hasNext())
			{
				if (i4 > 0)
					auditStr.append(",");
				ims.pci.domain.objects.ClientVaccineSummary obj = (ims.pci.domain.objects.ClientVaccineSummary)it4.next();
		if (obj != null)
		{
		   if (i4 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i4++;
		}
		if (i4 > 0)
			auditStr.append("] " + i4);
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
		
		String keyClassName = "ClientImmunisationSchedule";
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
		if (this.getClient() != null)
		{
			sb.append("<client>");
			sb.append(this.getClient().toXMLString(domMap)); 	
			sb.append("</client>");		
		}
		if (this.getScheduleProfiles() != null)
		{
			if (this.getScheduleProfiles().size() > 0 )
			{
			sb.append("<scheduleProfiles>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getScheduleProfiles(), domMap));
			sb.append("</scheduleProfiles>");		
			}
		}
		if (this.getStages() != null)
		{
			if (this.getStages().size() > 0 )
			{
			sb.append("<stages>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getStages(), domMap));
			sb.append("</stages>");		
			}
		}
		if (this.getVaccineSummaryStatus() != null)
		{
			if (this.getVaccineSummaryStatus().size() > 0 )
			{
			sb.append("<vaccineSummaryStatus>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getVaccineSummaryStatus(), domMap));
			sb.append("</vaccineSummaryStatus>");		
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
			ClientImmunisationSchedule domainObject = getClientImmunisationSchedulefromXML(itemEl, factory, domMap);

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
			ClientImmunisationSchedule domainObject = getClientImmunisationSchedulefromXML(itemEl, factory, domMap);

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
		
	public static ClientImmunisationSchedule getClientImmunisationSchedulefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getClientImmunisationSchedulefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ClientImmunisationSchedule getClientImmunisationSchedulefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ClientImmunisationSchedule.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ClientImmunisationSchedule.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ClientImmunisationSchedule class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ClientImmunisationSchedule)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ClientImmunisationSchedule.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ClientImmunisationSchedule ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ClientImmunisationSchedule)factory.getImportedDomainObject(ClientImmunisationSchedule.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ClientImmunisationSchedule();
		}
		String keyClassName = "ClientImmunisationSchedule";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ClientImmunisationSchedule)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ClientImmunisationSchedule obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("client");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("scheduleProfiles");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setScheduleProfiles(ims.pci.domain.objects.ClientPCIScheduleProfile.fromSetXMLString(fldEl, factory, obj.getScheduleProfiles(), domMap));
		}
		fldEl = el.element("stages");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setStages(ims.pci.domain.objects.ClientScheduleStage.fromSetXMLString(fldEl, factory, obj.getStages(), domMap));
		}
		fldEl = el.element("vaccineSummaryStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setVaccineSummaryStatus(ims.pci.domain.objects.ClientVaccineSummary.fromSetXMLString(fldEl, factory, obj.getVaccineSummaryStatus(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "scheduleProfiles"
		, "stages"
		, "vaccineSummaryStatus"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Client = "client";
		public static final String ScheduleProfiles = "scheduleProfiles";
		public static final String Stages = "stages";
		public static final String VaccineSummaryStatus = "vaccineSummaryStatus";
	}
}

