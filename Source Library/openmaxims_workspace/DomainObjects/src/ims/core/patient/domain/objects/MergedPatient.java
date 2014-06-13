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
package ims.core.patient.domain.objects;

/**
 * 
 * @author Cristian Belciug
 * Generated.
 */


public class MergedPatient extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1001100014;
	private static final long serialVersionUID = 1001100014L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Patient Name */
	private ims.core.generic.domain.objects.PersonName name;
	/** Sex */
	private ims.domain.lookups.LookupInstance sex;
	/** Partial Date as not always fully known */
	private Integer dob;
	/** Date of Death */
	private java.util.Date dod;
	/** Patient Address */
	private ims.core.generic.domain.objects.Address address;
	/** Identifier's associated with Patient
	  * Collection of ims.core.patient.domain.objects.PatientId.
	  */
	private java.util.List identifiers;
	/** Patient's GP */
	private ims.core.resource.people.domain.objects.Gp gp;
	/** Surgery at which Patient Attends */
	private ims.core.resource.place.domain.objects.LocSite gpSurgery;
	/** Patient's Next of Kin */
	private ims.core.patient.domain.objects.NextOfKin nok;
	/** Ethnic Origin Lookup */
	private ims.domain.lookups.LookupInstance ethnicOrigin;
	/** Religion Lookup */
	private ims.domain.lookups.LookupInstance religion;
	/** Marital Status Lookup */
	private ims.domain.lookups.LookupInstance maritalStatus;
	/** Occupation Lookup */
	private ims.domain.lookups.LookupInstance occupation;
	/** Language Lookup */
	private ims.domain.lookups.LookupInstance language;
	/** Communication Channels
	  * Collection of ims.core.generic.domain.objects.CommunicationChannel.
	  */
	private java.util.List commChannels;
	/** Patient Medical Insurance Details */
	private ims.core.patient.domain.objects.Insurance insurance;
	/** Collection of Patient Addresses
	  * Collection of ims.core.generic.domain.objects.Address.
	  */
	private java.util.List addresses;
	/** DestiantionPatient */
	private ims.core.patient.domain.objects.Patient destiantionPatient;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public MergedPatient (Integer id, int ver)
    {
    	super(id, ver);
    }
    public MergedPatient ()
    {
    	super();
    }
    public MergedPatient (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.patient.domain.objects.MergedPatient.class;
	}


	public ims.core.generic.domain.objects.PersonName getName() {
		return name;
	}
	public void setName(ims.core.generic.domain.objects.PersonName name) {
		this.name = name;
	}

	public ims.domain.lookups.LookupInstance getSex() {
		return sex;
	}
	public void setSex(ims.domain.lookups.LookupInstance sex) {
		this.sex = sex;
	}

	public Integer getDob() {
		return dob;
	}
	public void setDob(Integer dob) {
		this.dob = dob;
	}

	public java.util.Date getDod() {
		return dod;
	}
	public void setDod(java.util.Date dod) {
		this.dod = dod;
	}

	public ims.core.generic.domain.objects.Address getAddress() {
		return address;
	}
	public void setAddress(ims.core.generic.domain.objects.Address address) {
		this.address = address;
	}

	public java.util.List getIdentifiers() {
		if ( null == identifiers ) {
			identifiers = new java.util.ArrayList();
		}
		return identifiers;
	}
	public void setIdentifiers(java.util.List paramValue) {
		this.identifiers = paramValue;
	}

	public ims.core.resource.people.domain.objects.Gp getGp() {
		return gp;
	}
	public void setGp(ims.core.resource.people.domain.objects.Gp gp) {
		this.gp = gp;
	}

	public ims.core.resource.place.domain.objects.LocSite getGpSurgery() {
		return gpSurgery;
	}
	public void setGpSurgery(ims.core.resource.place.domain.objects.LocSite gpSurgery) {
		this.gpSurgery = gpSurgery;
	}

	public ims.core.patient.domain.objects.NextOfKin getNok() {
		return nok;
	}
	public void setNok(ims.core.patient.domain.objects.NextOfKin nok) {
		this.nok = nok;
	}

	public ims.domain.lookups.LookupInstance getEthnicOrigin() {
		return ethnicOrigin;
	}
	public void setEthnicOrigin(ims.domain.lookups.LookupInstance ethnicOrigin) {
		this.ethnicOrigin = ethnicOrigin;
	}

	public ims.domain.lookups.LookupInstance getReligion() {
		return religion;
	}
	public void setReligion(ims.domain.lookups.LookupInstance religion) {
		this.religion = religion;
	}

	public ims.domain.lookups.LookupInstance getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(ims.domain.lookups.LookupInstance maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public ims.domain.lookups.LookupInstance getOccupation() {
		return occupation;
	}
	public void setOccupation(ims.domain.lookups.LookupInstance occupation) {
		this.occupation = occupation;
	}

	public ims.domain.lookups.LookupInstance getLanguage() {
		return language;
	}
	public void setLanguage(ims.domain.lookups.LookupInstance language) {
		this.language = language;
	}

	public java.util.List getCommChannels() {
		if ( null == commChannels ) {
			commChannels = new java.util.ArrayList();
		}
		return commChannels;
	}
	public void setCommChannels(java.util.List paramValue) {
		this.commChannels = paramValue;
	}

	public ims.core.patient.domain.objects.Insurance getInsurance() {
		return insurance;
	}
	public void setInsurance(ims.core.patient.domain.objects.Insurance insurance) {
		this.insurance = insurance;
	}

	public java.util.List getAddresses() {
		if ( null == addresses ) {
			addresses = new java.util.ArrayList();
		}
		return addresses;
	}
	public void setAddresses(java.util.List paramValue) {
		this.addresses = paramValue;
	}

	public ims.core.patient.domain.objects.Patient getDestiantionPatient() {
		return destiantionPatient;
	}
	public void setDestiantionPatient(ims.core.patient.domain.objects.Patient destiantionPatient) {
		this.destiantionPatient = destiantionPatient;
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
		
		auditStr.append("\r\n*name* :");
		if (name != null)
		{
			auditStr.append(toShortClassName(name));
				
		    auditStr.append(name.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*sex* :");
		if (sex != null)
			auditStr.append(sex.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*dob* :");
		auditStr.append(dob);
	    auditStr.append("; ");
		auditStr.append("\r\n*dod* :");
		auditStr.append(dod);
	    auditStr.append("; ");
		auditStr.append("\r\n*address* :");
		if (address != null)
		{
			auditStr.append(toShortClassName(address));
				
		    auditStr.append(address.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*identifiers* :");
		if (identifiers != null)
		{
		int i6=0;
		for (i6=0; i6<identifiers.size(); i6++)
		{
			if (i6 > 0)
				auditStr.append(",");
			ims.core.patient.domain.objects.PatientId obj = (ims.core.patient.domain.objects.PatientId)identifiers.get(i6);
		    if (obj != null)
			{
				if (i6 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i6 > 0)
			auditStr.append("] " + i6);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*gp* :");
		if (gp != null)
		{
			auditStr.append(toShortClassName(gp));
				
		    auditStr.append(gp.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*gpSurgery* :");
		if (gpSurgery != null)
		{
			auditStr.append(toShortClassName(gpSurgery));
				
		    auditStr.append(gpSurgery.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*nok* :");
		if (nok != null)
		{
			auditStr.append(toShortClassName(nok));
				
		    auditStr.append(nok.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*ethnicOrigin* :");
		if (ethnicOrigin != null)
			auditStr.append(ethnicOrigin.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*religion* :");
		if (religion != null)
			auditStr.append(religion.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*maritalStatus* :");
		if (maritalStatus != null)
			auditStr.append(maritalStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*occupation* :");
		if (occupation != null)
			auditStr.append(occupation.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*language* :");
		if (language != null)
			auditStr.append(language.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*commChannels* :");
		if (commChannels != null)
		{
		int i15=0;
		for (i15=0; i15<commChannels.size(); i15++)
		{
			if (i15 > 0)
				auditStr.append(",");
			ims.core.generic.domain.objects.CommunicationChannel obj = (ims.core.generic.domain.objects.CommunicationChannel)commChannels.get(i15);
		    if (obj != null)
			{
				if (i15 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i15 > 0)
			auditStr.append("] " + i15);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*insurance* :");
		if (insurance != null)
		{
			auditStr.append(toShortClassName(insurance));
				
		    auditStr.append(insurance.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*addresses* :");
		if (addresses != null)
		{
		int i17=0;
		for (i17=0; i17<addresses.size(); i17++)
		{
			if (i17 > 0)
				auditStr.append(",");
			ims.core.generic.domain.objects.Address obj = (ims.core.generic.domain.objects.Address)addresses.get(i17);
		    if (obj != null)
			{
				if (i17 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i17 > 0)
			auditStr.append("] " + i17);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*destiantionPatient* :");
		if (destiantionPatient != null)
		{
			auditStr.append(toShortClassName(destiantionPatient));
				
		    auditStr.append(destiantionPatient.getId());
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
		
		String keyClassName = "MergedPatient";
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
		if (this.getName() != null)
		{
			sb.append("<name>");
			sb.append(this.getName().toXMLString(domMap)); 	
			sb.append("</name>");		
		}
		if (this.getSex() != null)
		{
			sb.append("<sex>");
			sb.append(this.getSex().toXMLString()); 
			sb.append("</sex>");		
		}
		if (this.getDob() != null)
		{
			sb.append("<dob>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDob().toString()));
			sb.append("</dob>");		
		}
		if (this.getDod() != null)
		{
			sb.append("<dod>");
			sb.append(new ims.framework.utils.DateTime(this.getDod()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dod>");		
		}
		if (this.getAddress() != null)
		{
			sb.append("<address>");
			sb.append(this.getAddress().toXMLString(domMap)); 	
			sb.append("</address>");		
		}
		if (this.getIdentifiers() != null)
		{
			if (this.getIdentifiers().size() > 0 )
			{
			sb.append("<identifiers>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getIdentifiers(), domMap));
			sb.append("</identifiers>");		
			}
		}
		if (this.getGp() != null)
		{
			sb.append("<gp>");
			sb.append(this.getGp().toXMLString(domMap)); 	
			sb.append("</gp>");		
		}
		if (this.getGpSurgery() != null)
		{
			sb.append("<gpSurgery>");
			sb.append(this.getGpSurgery().toXMLString(domMap)); 	
			sb.append("</gpSurgery>");		
		}
		if (this.getNok() != null)
		{
			sb.append("<nok>");
			sb.append(this.getNok().toXMLString(domMap)); 	
			sb.append("</nok>");		
		}
		if (this.getEthnicOrigin() != null)
		{
			sb.append("<ethnicOrigin>");
			sb.append(this.getEthnicOrigin().toXMLString()); 
			sb.append("</ethnicOrigin>");		
		}
		if (this.getReligion() != null)
		{
			sb.append("<religion>");
			sb.append(this.getReligion().toXMLString()); 
			sb.append("</religion>");		
		}
		if (this.getMaritalStatus() != null)
		{
			sb.append("<maritalStatus>");
			sb.append(this.getMaritalStatus().toXMLString()); 
			sb.append("</maritalStatus>");		
		}
		if (this.getOccupation() != null)
		{
			sb.append("<occupation>");
			sb.append(this.getOccupation().toXMLString()); 
			sb.append("</occupation>");		
		}
		if (this.getLanguage() != null)
		{
			sb.append("<language>");
			sb.append(this.getLanguage().toXMLString()); 
			sb.append("</language>");		
		}
		if (this.getCommChannels() != null)
		{
			if (this.getCommChannels().size() > 0 )
			{
			sb.append("<commChannels>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getCommChannels(), domMap));
			sb.append("</commChannels>");		
			}
		}
		if (this.getInsurance() != null)
		{
			sb.append("<insurance>");
			sb.append(this.getInsurance().toXMLString(domMap)); 	
			sb.append("</insurance>");		
		}
		if (this.getAddresses() != null)
		{
			if (this.getAddresses().size() > 0 )
			{
			sb.append("<addresses>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAddresses(), domMap));
			sb.append("</addresses>");		
			}
		}
		if (this.getDestiantionPatient() != null)
		{
			sb.append("<destiantionPatient>");
			sb.append(this.getDestiantionPatient().toXMLString(domMap)); 	
			sb.append("</destiantionPatient>");		
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
			MergedPatient domainObject = getMergedPatientfromXML(itemEl, factory, domMap);

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
			MergedPatient domainObject = getMergedPatientfromXML(itemEl, factory, domMap);

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
		
	public static MergedPatient getMergedPatientfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getMergedPatientfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static MergedPatient getMergedPatientfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!MergedPatient.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!MergedPatient.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the MergedPatient class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (MergedPatient)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(MergedPatient.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		MergedPatient ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (MergedPatient)factory.getImportedDomainObject(MergedPatient.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new MergedPatient();
		}
		String keyClassName = "MergedPatient";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (MergedPatient)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, MergedPatient obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("name");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setName(ims.core.generic.domain.objects.PersonName.getPersonNamefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("sex");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSex(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("dob");
		if(fldEl != null)
		{	
    		obj.setDob(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dod");
		if(fldEl != null)
		{	
    		obj.setDod(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("address");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAddress(ims.core.generic.domain.objects.Address.getAddressfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("identifiers");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setIdentifiers(ims.core.patient.domain.objects.PatientId.fromListXMLString(fldEl, factory, obj.getIdentifiers(), domMap));
		}
		fldEl = el.element("gp");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setGp(ims.core.resource.people.domain.objects.Gp.getGpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("gpSurgery");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setGpSurgery(ims.core.resource.place.domain.objects.LocSite.getLocSitefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("nok");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setNok(ims.core.patient.domain.objects.NextOfKin.getNextOfKinfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("ethnicOrigin");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setEthnicOrigin(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("religion");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReligion(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("maritalStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMaritalStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("occupation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOccupation(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("language");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setLanguage(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("commChannels");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setCommChannels(ims.core.generic.domain.objects.CommunicationChannel.fromListXMLString(fldEl, factory, obj.getCommChannels(), domMap));
		}
		fldEl = el.element("insurance");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setInsurance(ims.core.patient.domain.objects.Insurance.getInsurancefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("addresses");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setAddresses(ims.core.generic.domain.objects.Address.fromListXMLString(fldEl, factory, obj.getAddresses(), domMap));
		}
		fldEl = el.element("destiantionPatient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setDestiantionPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "identifiers"
		, "commChannels"
		, "addresses"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Name = "name";
		public static final String Sex = "sex";
		public static final String Dob = "dob";
		public static final String Dod = "dod";
		public static final String Address = "address";
		public static final String Identifiers = "identifiers";
		public static final String Gp = "gp";
		public static final String GpSurgery = "gpSurgery";
		public static final String Nok = "nok";
		public static final String EthnicOrigin = "ethnicOrigin";
		public static final String Religion = "religion";
		public static final String MaritalStatus = "maritalStatus";
		public static final String Occupation = "occupation";
		public static final String Language = "language";
		public static final String CommChannels = "commChannels";
		public static final String Insurance = "insurance";
		public static final String Addresses = "addresses";
		public static final String DestiantionPatient = "destiantionPatient";
	}
}

