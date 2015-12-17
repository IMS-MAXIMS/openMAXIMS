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
package ims.clinical.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class PerfProcAndSignOutIntraOp extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100150;
	private static final long serialVersionUID = 1072100150L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Theatre Appointment */
	private ims.scheduling.domain.objects.Booking_Appointment theatreAppointment;
	/** UnplannedReturnToTheatre */
	private Boolean unplannedreturntotheatre;
	/** It has been confirmed that instruments, swabs and sharps counts are complete */
	private Boolean confirmedCountsComplete;
	/** Did antibiotics become surgically indicated after knife to skin */
	private ims.domain.lookups.LookupInstance antibioticsAfterKnifeToSkin;
	/** Time intra-operative antibiotics given */
	private java.util.Date timeIntraOpAntibioticsGiven;
	/** The administration record has been completed for medications, blood and fluids */
	private Boolean administrationRecordCompleted;
	/** Any specimens have been labelled  */
	private Boolean anySpecimensHaveBeenLabelled;
	/** Have any equipment problems been identified that need to be addressed */
	private ims.domain.lookups.LookupInstance anyEquipmentProblemsAddressed;
	/** Surgeon, Anaesthetist, Registered Practitioner and/or recovery staff have documented and communicated the key concerns for recovery and management of this patient */
	private Boolean keyConcernsDocumented;
	/** Signature by registered practitioner */
	private ims.core.resource.people.domain.objects.Hcp signatureByRegisteredPractitioner;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PerfProcAndSignOutIntraOp (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PerfProcAndSignOutIntraOp ()
    {
    	super();
    }
    public PerfProcAndSignOutIntraOp (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.domain.objects.PerfProcAndSignOutIntraOp.class;
	}


	public ims.scheduling.domain.objects.Booking_Appointment getTheatreAppointment() {
		return theatreAppointment;
	}
	public static PerfProcAndSignOutIntraOp getPerfProcAndSignOutIntraOpFromTheatreAppointment(ims.domain.ILightweightDomainFactory factory, Integer id)
	{
		java.util.List l = factory.find("from PerfProcAndSignOutIntraOp c where c.theatreAppointment.id = " + id);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. PerfProcAndSignOutIntraOp.theatreAppointment.id = " + id + " returned " + l.size() + " records. " );
		return (PerfProcAndSignOutIntraOp)l.get(0);
	}
	public void setTheatreAppointment(ims.scheduling.domain.objects.Booking_Appointment theatreAppointment) {
		this.theatreAppointment = theatreAppointment;
	}

	public Boolean isUnplannedreturntotheatre() {
		return unplannedreturntotheatre;
	}
	public void setUnplannedreturntotheatre(Boolean unplannedreturntotheatre) {
		this.unplannedreturntotheatre = unplannedreturntotheatre;
	}

	public Boolean isConfirmedCountsComplete() {
		return confirmedCountsComplete;
	}
	public void setConfirmedCountsComplete(Boolean confirmedCountsComplete) {
		this.confirmedCountsComplete = confirmedCountsComplete;
	}

	public ims.domain.lookups.LookupInstance getAntibioticsAfterKnifeToSkin() {
		return antibioticsAfterKnifeToSkin;
	}
	public void setAntibioticsAfterKnifeToSkin(ims.domain.lookups.LookupInstance antibioticsAfterKnifeToSkin) {
		this.antibioticsAfterKnifeToSkin = antibioticsAfterKnifeToSkin;
	}

	public java.util.Date getTimeIntraOpAntibioticsGiven() {
		return timeIntraOpAntibioticsGiven;
	}
	public void setTimeIntraOpAntibioticsGiven(java.util.Date timeIntraOpAntibioticsGiven) {
		this.timeIntraOpAntibioticsGiven = timeIntraOpAntibioticsGiven;
	}

	public Boolean isAdministrationRecordCompleted() {
		return administrationRecordCompleted;
	}
	public void setAdministrationRecordCompleted(Boolean administrationRecordCompleted) {
		this.administrationRecordCompleted = administrationRecordCompleted;
	}

	public Boolean isAnySpecimensHaveBeenLabelled() {
		return anySpecimensHaveBeenLabelled;
	}
	public void setAnySpecimensHaveBeenLabelled(Boolean anySpecimensHaveBeenLabelled) {
		this.anySpecimensHaveBeenLabelled = anySpecimensHaveBeenLabelled;
	}

	public ims.domain.lookups.LookupInstance getAnyEquipmentProblemsAddressed() {
		return anyEquipmentProblemsAddressed;
	}
	public void setAnyEquipmentProblemsAddressed(ims.domain.lookups.LookupInstance anyEquipmentProblemsAddressed) {
		this.anyEquipmentProblemsAddressed = anyEquipmentProblemsAddressed;
	}

	public Boolean isKeyConcernsDocumented() {
		return keyConcernsDocumented;
	}
	public void setKeyConcernsDocumented(Boolean keyConcernsDocumented) {
		this.keyConcernsDocumented = keyConcernsDocumented;
	}

	public ims.core.resource.people.domain.objects.Hcp getSignatureByRegisteredPractitioner() {
		return signatureByRegisteredPractitioner;
	}
	public void setSignatureByRegisteredPractitioner(ims.core.resource.people.domain.objects.Hcp signatureByRegisteredPractitioner) {
		this.signatureByRegisteredPractitioner = signatureByRegisteredPractitioner;
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
		
		auditStr.append("\r\n*theatreAppointment* :");
		if (theatreAppointment != null)
		{
			auditStr.append(toShortClassName(theatreAppointment));
				
		    auditStr.append(theatreAppointment.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*unplannedreturntotheatre* :");
		auditStr.append(unplannedreturntotheatre);
	    auditStr.append("; ");
		auditStr.append("\r\n*confirmedCountsComplete* :");
		auditStr.append(confirmedCountsComplete);
	    auditStr.append("; ");
		auditStr.append("\r\n*antibioticsAfterKnifeToSkin* :");
		if (antibioticsAfterKnifeToSkin != null)
			auditStr.append(antibioticsAfterKnifeToSkin.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*timeIntraOpAntibioticsGiven* :");
		auditStr.append(timeIntraOpAntibioticsGiven);
	    auditStr.append("; ");
		auditStr.append("\r\n*administrationRecordCompleted* :");
		auditStr.append(administrationRecordCompleted);
	    auditStr.append("; ");
		auditStr.append("\r\n*anySpecimensHaveBeenLabelled* :");
		auditStr.append(anySpecimensHaveBeenLabelled);
	    auditStr.append("; ");
		auditStr.append("\r\n*anyEquipmentProblemsAddressed* :");
		if (anyEquipmentProblemsAddressed != null)
			auditStr.append(anyEquipmentProblemsAddressed.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*keyConcernsDocumented* :");
		auditStr.append(keyConcernsDocumented);
	    auditStr.append("; ");
		auditStr.append("\r\n*signatureByRegisteredPractitioner* :");
		if (signatureByRegisteredPractitioner != null)
		{
			auditStr.append(toShortClassName(signatureByRegisteredPractitioner));
				
		    auditStr.append(signatureByRegisteredPractitioner.getId());
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
		
		String keyClassName = "PerfProcAndSignOutIntraOp";
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
		if (this.getTheatreAppointment() != null)
		{
			sb.append("<theatreAppointment>");
			sb.append(this.getTheatreAppointment().toXMLString(domMap)); 	
			sb.append("</theatreAppointment>");		
		}
		if (this.isUnplannedreturntotheatre() != null)
		{
			sb.append("<unplannedreturntotheatre>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isUnplannedreturntotheatre().toString()));
			sb.append("</unplannedreturntotheatre>");		
		}
		if (this.isConfirmedCountsComplete() != null)
		{
			sb.append("<confirmedCountsComplete>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isConfirmedCountsComplete().toString()));
			sb.append("</confirmedCountsComplete>");		
		}
		if (this.getAntibioticsAfterKnifeToSkin() != null)
		{
			sb.append("<antibioticsAfterKnifeToSkin>");
			sb.append(this.getAntibioticsAfterKnifeToSkin().toXMLString()); 
			sb.append("</antibioticsAfterKnifeToSkin>");		
		}
		if (this.getTimeIntraOpAntibioticsGiven() != null)
		{
			sb.append("<timeIntraOpAntibioticsGiven>");
			sb.append(new ims.framework.utils.DateTime(this.getTimeIntraOpAntibioticsGiven()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</timeIntraOpAntibioticsGiven>");		
		}
		if (this.isAdministrationRecordCompleted() != null)
		{
			sb.append("<administrationRecordCompleted>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isAdministrationRecordCompleted().toString()));
			sb.append("</administrationRecordCompleted>");		
		}
		if (this.isAnySpecimensHaveBeenLabelled() != null)
		{
			sb.append("<anySpecimensHaveBeenLabelled>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isAnySpecimensHaveBeenLabelled().toString()));
			sb.append("</anySpecimensHaveBeenLabelled>");		
		}
		if (this.getAnyEquipmentProblemsAddressed() != null)
		{
			sb.append("<anyEquipmentProblemsAddressed>");
			sb.append(this.getAnyEquipmentProblemsAddressed().toXMLString()); 
			sb.append("</anyEquipmentProblemsAddressed>");		
		}
		if (this.isKeyConcernsDocumented() != null)
		{
			sb.append("<keyConcernsDocumented>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isKeyConcernsDocumented().toString()));
			sb.append("</keyConcernsDocumented>");		
		}
		if (this.getSignatureByRegisteredPractitioner() != null)
		{
			sb.append("<signatureByRegisteredPractitioner>");
			sb.append(this.getSignatureByRegisteredPractitioner().toXMLString(domMap)); 	
			sb.append("</signatureByRegisteredPractitioner>");		
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
			PerfProcAndSignOutIntraOp domainObject = getPerfProcAndSignOutIntraOpfromXML(itemEl, factory, domMap);

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
			PerfProcAndSignOutIntraOp domainObject = getPerfProcAndSignOutIntraOpfromXML(itemEl, factory, domMap);

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
		
	public static PerfProcAndSignOutIntraOp getPerfProcAndSignOutIntraOpfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPerfProcAndSignOutIntraOpfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PerfProcAndSignOutIntraOp getPerfProcAndSignOutIntraOpfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PerfProcAndSignOutIntraOp.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PerfProcAndSignOutIntraOp.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PerfProcAndSignOutIntraOp class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PerfProcAndSignOutIntraOp)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PerfProcAndSignOutIntraOp.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PerfProcAndSignOutIntraOp ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PerfProcAndSignOutIntraOp)factory.getImportedDomainObject(PerfProcAndSignOutIntraOp.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PerfProcAndSignOutIntraOp();
		}
		String keyClassName = "PerfProcAndSignOutIntraOp";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PerfProcAndSignOutIntraOp)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PerfProcAndSignOutIntraOp obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("theatreAppointment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTheatreAppointment(ims.scheduling.domain.objects.Booking_Appointment.getBooking_AppointmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("unplannedreturntotheatre");
		if(fldEl != null)
		{	
    		obj.setUnplannedreturntotheatre(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("confirmedCountsComplete");
		if(fldEl != null)
		{	
    		obj.setConfirmedCountsComplete(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("antibioticsAfterKnifeToSkin");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAntibioticsAfterKnifeToSkin(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("timeIntraOpAntibioticsGiven");
		if(fldEl != null)
		{	
    		obj.setTimeIntraOpAntibioticsGiven(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("administrationRecordCompleted");
		if(fldEl != null)
		{	
    		obj.setAdministrationRecordCompleted(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("anySpecimensHaveBeenLabelled");
		if(fldEl != null)
		{	
    		obj.setAnySpecimensHaveBeenLabelled(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("anyEquipmentProblemsAddressed");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAnyEquipmentProblemsAddressed(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("keyConcernsDocumented");
		if(fldEl != null)
		{	
    		obj.setKeyConcernsDocumented(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("signatureByRegisteredPractitioner");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSignatureByRegisteredPractitioner(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
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
		public static final String TheatreAppointment = "theatreAppointment";
		public static final String Unplannedreturntotheatre = "unplannedreturntotheatre";
		public static final String ConfirmedCountsComplete = "confirmedCountsComplete";
		public static final String AntibioticsAfterKnifeToSkin = "antibioticsAfterKnifeToSkin";
		public static final String TimeIntraOpAntibioticsGiven = "timeIntraOpAntibioticsGiven";
		public static final String AdministrationRecordCompleted = "administrationRecordCompleted";
		public static final String AnySpecimensHaveBeenLabelled = "anySpecimensHaveBeenLabelled";
		public static final String AnyEquipmentProblemsAddressed = "anyEquipmentProblemsAddressed";
		public static final String KeyConcernsDocumented = "keyConcernsDocumented";
		public static final String SignatureByRegisteredPractitioner = "signatureByRegisteredPractitioner";
	}
}

