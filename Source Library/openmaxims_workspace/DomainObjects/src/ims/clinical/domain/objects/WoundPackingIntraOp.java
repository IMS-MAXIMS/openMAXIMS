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


public class WoundPackingIntraOp extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100144;
	private static final long serialVersionUID = 1072100144L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Theatre Appointment */
	private ims.scheduling.domain.objects.Booking_Appointment theatreAppointment;
	/** PatientProcedure */
	private ims.core.clinical.domain.objects.PatientProcedure patientProcedure;
	/** Packing Site */
	private String packingSite;
	/** Packing Site Comments */
	private String packingSiteComments;
	/** Packing Type */
	private ims.domain.lookups.LookupInstance packingType;
	/** Packing Type Comments */
	private String packingTypeComments;
	/** In Place on Departure */
	private ims.domain.lookups.LookupInstance inPlaceOnDeparture;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public WoundPackingIntraOp (Integer id, int ver)
    {
    	super(id, ver);
    }
    public WoundPackingIntraOp ()
    {
    	super();
    }
    public WoundPackingIntraOp (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.domain.objects.WoundPackingIntraOp.class;
	}


	public ims.scheduling.domain.objects.Booking_Appointment getTheatreAppointment() {
		return theatreAppointment;
	}
	public void setTheatreAppointment(ims.scheduling.domain.objects.Booking_Appointment theatreAppointment) {
		this.theatreAppointment = theatreAppointment;
	}

	public ims.core.clinical.domain.objects.PatientProcedure getPatientProcedure() {
		return patientProcedure;
	}
	public void setPatientProcedure(ims.core.clinical.domain.objects.PatientProcedure patientProcedure) {
		this.patientProcedure = patientProcedure;
	}

	public String getPackingSite() {
		return packingSite;
	}
	public void setPackingSite(String packingSite) {
		if ( null != packingSite && packingSite.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for packingSite. Tried to set value: "+
				packingSite);
		}
		this.packingSite = packingSite;
	}

	public String getPackingSiteComments() {
		return packingSiteComments;
	}
	public void setPackingSiteComments(String packingSiteComments) {
		if ( null != packingSiteComments && packingSiteComments.length() > 250 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for packingSiteComments. Tried to set value: "+
				packingSiteComments);
		}
		this.packingSiteComments = packingSiteComments;
	}

	public ims.domain.lookups.LookupInstance getPackingType() {
		return packingType;
	}
	public void setPackingType(ims.domain.lookups.LookupInstance packingType) {
		this.packingType = packingType;
	}

	public String getPackingTypeComments() {
		return packingTypeComments;
	}
	public void setPackingTypeComments(String packingTypeComments) {
		if ( null != packingTypeComments && packingTypeComments.length() > 250 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for packingTypeComments. Tried to set value: "+
				packingTypeComments);
		}
		this.packingTypeComments = packingTypeComments;
	}

	public ims.domain.lookups.LookupInstance getInPlaceOnDeparture() {
		return inPlaceOnDeparture;
	}
	public void setInPlaceOnDeparture(ims.domain.lookups.LookupInstance inPlaceOnDeparture) {
		this.inPlaceOnDeparture = inPlaceOnDeparture;
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
		auditStr.append("\r\n*patientProcedure* :");
		if (patientProcedure != null)
		{
			auditStr.append(toShortClassName(patientProcedure));
				
		    auditStr.append(patientProcedure.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*packingSite* :");
		auditStr.append(packingSite);
	    auditStr.append("; ");
		auditStr.append("\r\n*packingSiteComments* :");
		auditStr.append(packingSiteComments);
	    auditStr.append("; ");
		auditStr.append("\r\n*packingType* :");
		if (packingType != null)
			auditStr.append(packingType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*packingTypeComments* :");
		auditStr.append(packingTypeComments);
	    auditStr.append("; ");
		auditStr.append("\r\n*inPlaceOnDeparture* :");
		if (inPlaceOnDeparture != null)
			auditStr.append(inPlaceOnDeparture.getText());
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
		
		String keyClassName = "WoundPackingIntraOp";
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
		if (this.getPatientProcedure() != null)
		{
			sb.append("<patientProcedure>");
			sb.append(this.getPatientProcedure().toXMLString(domMap)); 	
			sb.append("</patientProcedure>");		
		}
		if (this.getPackingSite() != null)
		{
			sb.append("<packingSite>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPackingSite().toString()));
			sb.append("</packingSite>");		
		}
		if (this.getPackingSiteComments() != null)
		{
			sb.append("<packingSiteComments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPackingSiteComments().toString()));
			sb.append("</packingSiteComments>");		
		}
		if (this.getPackingType() != null)
		{
			sb.append("<packingType>");
			sb.append(this.getPackingType().toXMLString()); 
			sb.append("</packingType>");		
		}
		if (this.getPackingTypeComments() != null)
		{
			sb.append("<packingTypeComments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPackingTypeComments().toString()));
			sb.append("</packingTypeComments>");		
		}
		if (this.getInPlaceOnDeparture() != null)
		{
			sb.append("<inPlaceOnDeparture>");
			sb.append(this.getInPlaceOnDeparture().toXMLString()); 
			sb.append("</inPlaceOnDeparture>");		
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
			WoundPackingIntraOp domainObject = getWoundPackingIntraOpfromXML(itemEl, factory, domMap);

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
			WoundPackingIntraOp domainObject = getWoundPackingIntraOpfromXML(itemEl, factory, domMap);

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
		
	public static WoundPackingIntraOp getWoundPackingIntraOpfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getWoundPackingIntraOpfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static WoundPackingIntraOp getWoundPackingIntraOpfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!WoundPackingIntraOp.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!WoundPackingIntraOp.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the WoundPackingIntraOp class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (WoundPackingIntraOp)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(WoundPackingIntraOp.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		WoundPackingIntraOp ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (WoundPackingIntraOp)factory.getImportedDomainObject(WoundPackingIntraOp.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new WoundPackingIntraOp();
		}
		String keyClassName = "WoundPackingIntraOp";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (WoundPackingIntraOp)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, WoundPackingIntraOp obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("theatreAppointment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTheatreAppointment(ims.scheduling.domain.objects.Booking_Appointment.getBooking_AppointmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("patientProcedure");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatientProcedure(ims.core.clinical.domain.objects.PatientProcedure.getPatientProcedurefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("packingSite");
		if(fldEl != null)
		{	
    		obj.setPackingSite(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("packingSiteComments");
		if(fldEl != null)
		{	
    		obj.setPackingSiteComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("packingType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPackingType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("packingTypeComments");
		if(fldEl != null)
		{	
    		obj.setPackingTypeComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("inPlaceOnDeparture");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setInPlaceOnDeparture(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		public static final String PatientProcedure = "patientProcedure";
		public static final String PackingSite = "packingSite";
		public static final String PackingSiteComments = "packingSiteComments";
		public static final String PackingType = "packingType";
		public static final String PackingTypeComments = "packingTypeComments";
		public static final String InPlaceOnDeparture = "inPlaceOnDeparture";
	}
}

