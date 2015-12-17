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


public class FinalCountIntraOp extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100152;
	private static final long serialVersionUID = 1072100152L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Theatre Appointment */
	private ims.scheduling.domain.objects.Booking_Appointment theatreAppointment;
	/** Procedure */
	private ims.core.clinical.domain.objects.PatientProcedure procedure;
	/** Swabs Accountable Items correct */
	private ims.domain.lookups.LookupInstance swabsAccountableItemscorrect;
	/** Instruments Correct */
	private ims.domain.lookups.LookupInstance instrumentsCorrect;
	/** Sharps Other Correct and removed from set */
	private ims.domain.lookups.LookupInstance sharpsOtherCorrectAndRemovedFromSet;
	/** Verified By 1 */
	private ims.core.resource.people.domain.objects.Nurse verifiedBy1;
	/** Verified By 2 */
	private ims.core.resource.people.domain.objects.Hcp verifiedBy2;
	/** MissingItems
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List missingItems;
	/** Other Missing Items */
	private String otherMissingItems;
	/** Actions Taken
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List actionsTaken;
	/** Other ActionaTaken */
	private String otherActionsTaken;
	/** Verified By */
	private ims.core.resource.people.domain.objects.Hcp verifiedBy;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public FinalCountIntraOp (Integer id, int ver)
    {
    	super(id, ver);
    }
    public FinalCountIntraOp ()
    {
    	super();
    }
    public FinalCountIntraOp (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.domain.objects.FinalCountIntraOp.class;
	}


	public ims.scheduling.domain.objects.Booking_Appointment getTheatreAppointment() {
		return theatreAppointment;
	}
	public void setTheatreAppointment(ims.scheduling.domain.objects.Booking_Appointment theatreAppointment) {
		this.theatreAppointment = theatreAppointment;
	}

	public ims.core.clinical.domain.objects.PatientProcedure getProcedure() {
		return procedure;
	}
	public void setProcedure(ims.core.clinical.domain.objects.PatientProcedure procedure) {
		this.procedure = procedure;
	}

	public ims.domain.lookups.LookupInstance getSwabsAccountableItemscorrect() {
		return swabsAccountableItemscorrect;
	}
	public void setSwabsAccountableItemscorrect(ims.domain.lookups.LookupInstance swabsAccountableItemscorrect) {
		this.swabsAccountableItemscorrect = swabsAccountableItemscorrect;
	}

	public ims.domain.lookups.LookupInstance getInstrumentsCorrect() {
		return instrumentsCorrect;
	}
	public void setInstrumentsCorrect(ims.domain.lookups.LookupInstance instrumentsCorrect) {
		this.instrumentsCorrect = instrumentsCorrect;
	}

	public ims.domain.lookups.LookupInstance getSharpsOtherCorrectAndRemovedFromSet() {
		return sharpsOtherCorrectAndRemovedFromSet;
	}
	public void setSharpsOtherCorrectAndRemovedFromSet(ims.domain.lookups.LookupInstance sharpsOtherCorrectAndRemovedFromSet) {
		this.sharpsOtherCorrectAndRemovedFromSet = sharpsOtherCorrectAndRemovedFromSet;
	}

	public ims.core.resource.people.domain.objects.Nurse getVerifiedBy1() {
		return verifiedBy1;
	}
	public void setVerifiedBy1(ims.core.resource.people.domain.objects.Nurse verifiedBy1) {
		this.verifiedBy1 = verifiedBy1;
	}

	public ims.core.resource.people.domain.objects.Hcp getVerifiedBy2() {
		return verifiedBy2;
	}
	public void setVerifiedBy2(ims.core.resource.people.domain.objects.Hcp verifiedBy2) {
		this.verifiedBy2 = verifiedBy2;
	}

	public java.util.List getMissingItems() {
		if ( null == missingItems ) {
			missingItems = new java.util.ArrayList();
		}
		return missingItems;
	}
	public void setMissingItems(java.util.List paramValue) {
		this.missingItems = paramValue;
	}

	public String getOtherMissingItems() {
		return otherMissingItems;
	}
	public void setOtherMissingItems(String otherMissingItems) {
		if ( null != otherMissingItems && otherMissingItems.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for otherMissingItems. Tried to set value: "+
				otherMissingItems);
		}
		this.otherMissingItems = otherMissingItems;
	}

	public java.util.List getActionsTaken() {
		if ( null == actionsTaken ) {
			actionsTaken = new java.util.ArrayList();
		}
		return actionsTaken;
	}
	public void setActionsTaken(java.util.List paramValue) {
		this.actionsTaken = paramValue;
	}

	public String getOtherActionsTaken() {
		return otherActionsTaken;
	}
	public void setOtherActionsTaken(String otherActionsTaken) {
		if ( null != otherActionsTaken && otherActionsTaken.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for otherActionsTaken. Tried to set value: "+
				otherActionsTaken);
		}
		this.otherActionsTaken = otherActionsTaken;
	}

	public ims.core.resource.people.domain.objects.Hcp getVerifiedBy() {
		return verifiedBy;
	}
	public void setVerifiedBy(ims.core.resource.people.domain.objects.Hcp verifiedBy) {
		this.verifiedBy = verifiedBy;
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
		auditStr.append("\r\n*procedure* :");
		if (procedure != null)
		{
			auditStr.append(toShortClassName(procedure));
				
		    auditStr.append(procedure.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*swabsAccountableItemscorrect* :");
		if (swabsAccountableItemscorrect != null)
			auditStr.append(swabsAccountableItemscorrect.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*instrumentsCorrect* :");
		if (instrumentsCorrect != null)
			auditStr.append(instrumentsCorrect.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*sharpsOtherCorrectAndRemovedFromSet* :");
		if (sharpsOtherCorrectAndRemovedFromSet != null)
			auditStr.append(sharpsOtherCorrectAndRemovedFromSet.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*verifiedBy1* :");
		if (verifiedBy1 != null)
		{
			auditStr.append(toShortClassName(verifiedBy1));
				
		    auditStr.append(verifiedBy1.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*verifiedBy2* :");
		if (verifiedBy2 != null)
		{
			auditStr.append(toShortClassName(verifiedBy2));
				
		    auditStr.append(verifiedBy2.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*missingItems* :");
		if (missingItems != null)
		{
		int i8=0;
		for (i8=0; i8<missingItems.size(); i8++)
		{
			if (i8 > 0)
				auditStr.append(",");
			ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)missingItems.get(i8);
			auditStr.append(obj.getText());
		}
		if (i8 > 0)
			auditStr.append("] " + i8);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*otherMissingItems* :");
		auditStr.append(otherMissingItems);
	    auditStr.append("; ");
		auditStr.append("\r\n*actionsTaken* :");
		if (actionsTaken != null)
		{
		int i10=0;
		for (i10=0; i10<actionsTaken.size(); i10++)
		{
			if (i10 > 0)
				auditStr.append(",");
			ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)actionsTaken.get(i10);
			auditStr.append(obj.getText());
		}
		if (i10 > 0)
			auditStr.append("] " + i10);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*otherActionsTaken* :");
		auditStr.append(otherActionsTaken);
	    auditStr.append("; ");
		auditStr.append("\r\n*verifiedBy* :");
		if (verifiedBy != null)
		{
			auditStr.append(toShortClassName(verifiedBy));
				
		    auditStr.append(verifiedBy.getId());
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
		
		String keyClassName = "FinalCountIntraOp";
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
		if (this.getProcedure() != null)
		{
			sb.append("<procedure>");
			sb.append(this.getProcedure().toXMLString(domMap)); 	
			sb.append("</procedure>");		
		}
		if (this.getSwabsAccountableItemscorrect() != null)
		{
			sb.append("<swabsAccountableItemscorrect>");
			sb.append(this.getSwabsAccountableItemscorrect().toXMLString()); 
			sb.append("</swabsAccountableItemscorrect>");		
		}
		if (this.getInstrumentsCorrect() != null)
		{
			sb.append("<instrumentsCorrect>");
			sb.append(this.getInstrumentsCorrect().toXMLString()); 
			sb.append("</instrumentsCorrect>");		
		}
		if (this.getSharpsOtherCorrectAndRemovedFromSet() != null)
		{
			sb.append("<sharpsOtherCorrectAndRemovedFromSet>");
			sb.append(this.getSharpsOtherCorrectAndRemovedFromSet().toXMLString()); 
			sb.append("</sharpsOtherCorrectAndRemovedFromSet>");		
		}
		if (this.getVerifiedBy1() != null)
		{
			sb.append("<verifiedBy1>");
			sb.append(this.getVerifiedBy1().toXMLString(domMap)); 	
			sb.append("</verifiedBy1>");		
		}
		if (this.getVerifiedBy2() != null)
		{
			sb.append("<verifiedBy2>");
			sb.append(this.getVerifiedBy2().toXMLString(domMap)); 	
			sb.append("</verifiedBy2>");		
		}
		if (this.getMissingItems() != null)
		{
			if (this.getMissingItems().size() > 0 )
			{
			sb.append("<missingItems>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getMissingItems())); 
			sb.append("</missingItems>");		
			}
		}
		if (this.getOtherMissingItems() != null)
		{
			sb.append("<otherMissingItems>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOtherMissingItems().toString()));
			sb.append("</otherMissingItems>");		
		}
		if (this.getActionsTaken() != null)
		{
			if (this.getActionsTaken().size() > 0 )
			{
			sb.append("<actionsTaken>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getActionsTaken())); 
			sb.append("</actionsTaken>");		
			}
		}
		if (this.getOtherActionsTaken() != null)
		{
			sb.append("<otherActionsTaken>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOtherActionsTaken().toString()));
			sb.append("</otherActionsTaken>");		
		}
		if (this.getVerifiedBy() != null)
		{
			sb.append("<verifiedBy>");
			sb.append(this.getVerifiedBy().toXMLString(domMap)); 	
			sb.append("</verifiedBy>");		
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
			FinalCountIntraOp domainObject = getFinalCountIntraOpfromXML(itemEl, factory, domMap);

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
			FinalCountIntraOp domainObject = getFinalCountIntraOpfromXML(itemEl, factory, domMap);

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
		
	public static FinalCountIntraOp getFinalCountIntraOpfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getFinalCountIntraOpfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static FinalCountIntraOp getFinalCountIntraOpfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!FinalCountIntraOp.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!FinalCountIntraOp.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the FinalCountIntraOp class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (FinalCountIntraOp)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(FinalCountIntraOp.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		FinalCountIntraOp ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (FinalCountIntraOp)factory.getImportedDomainObject(FinalCountIntraOp.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new FinalCountIntraOp();
		}
		String keyClassName = "FinalCountIntraOp";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (FinalCountIntraOp)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, FinalCountIntraOp obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("theatreAppointment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTheatreAppointment(ims.scheduling.domain.objects.Booking_Appointment.getBooking_AppointmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("procedure");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setProcedure(ims.core.clinical.domain.objects.PatientProcedure.getPatientProcedurefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("swabsAccountableItemscorrect");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSwabsAccountableItemscorrect(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("instrumentsCorrect");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setInstrumentsCorrect(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("sharpsOtherCorrectAndRemovedFromSet");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSharpsOtherCorrectAndRemovedFromSet(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("verifiedBy1");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setVerifiedBy1(ims.core.resource.people.domain.objects.Nurse.getNursefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("verifiedBy2");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setVerifiedBy2(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("missingItems");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setMissingItems(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getMissingItems())); 
		}
		fldEl = el.element("otherMissingItems");
		if(fldEl != null)
		{	
    		obj.setOtherMissingItems(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("actionsTaken");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setActionsTaken(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getActionsTaken())); 
		}
		fldEl = el.element("otherActionsTaken");
		if(fldEl != null)
		{	
    		obj.setOtherActionsTaken(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("verifiedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setVerifiedBy(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "missingItems"
		, "actionsTaken"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String TheatreAppointment = "theatreAppointment";
		public static final String Procedure = "procedure";
		public static final String SwabsAccountableItemscorrect = "swabsAccountableItemscorrect";
		public static final String InstrumentsCorrect = "instrumentsCorrect";
		public static final String SharpsOtherCorrectAndRemovedFromSet = "sharpsOtherCorrectAndRemovedFromSet";
		public static final String VerifiedBy1 = "verifiedBy1";
		public static final String VerifiedBy2 = "verifiedBy2";
		public static final String MissingItems = "missingItems";
		public static final String OtherMissingItems = "otherMissingItems";
		public static final String ActionsTaken = "actionsTaken";
		public static final String OtherActionsTaken = "otherActionsTaken";
		public static final String VerifiedBy = "verifiedBy";
	}
}

