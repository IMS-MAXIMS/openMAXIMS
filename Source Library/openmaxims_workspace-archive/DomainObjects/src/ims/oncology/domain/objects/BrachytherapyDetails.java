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
package ims.oncology.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class BrachytherapyDetails extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1074100020;
	private static final long serialVersionUID = 1074100020L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** BrachytherapyType */
	private ims.domain.lookups.LookupInstance brachytherapyType;
	/** Prescription Point */
	private ims.domain.lookups.LookupInstance prescriptionPoint;
	/** Unit - Gy / Mbq */
	private ims.domain.lookups.LookupInstance unit;
	/** Treatment Details
	  * Collection of ims.oncology.domain.objects.BrachyTxTreatmentDetails.
	  */
	private java.util.List treatmentDetails;
	/** Actual Nr Treatments */
	private Integer actualNrTreatments;
	/** ActualDoseRate */
	private ims.domain.lookups.LookupInstance actualDoseRate;
	/** Treatment Length */
	private Integer treatmentLength;
	/** BrachyDeliveryType */
	private ims.domain.lookups.LookupInstance brachyDeliveryType;
	/** BrachyTherapyIsotopeType */
	private ims.domain.lookups.LookupInstance brachyTherapyIsotopeType;
	/** BrachyTherapyUnsealedSourceType */
	private ims.domain.lookups.LookupInstance brachyTherapyUnsealedSourceType;
	/** PatientType */
	private ims.domain.lookups.LookupInstance patientType;
	/** ActualDuration */
	private Integer actualDuration;
	/** AnaestheticReq */
	private ims.domain.lookups.LookupInstance anaestheticReq;
	/** Total Dose */
	private java.lang.Float totalDose;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public BrachytherapyDetails (Integer id, int ver)
    {
    	super(id, ver);
    }
    public BrachytherapyDetails ()
    {
    	super();
    }
    public BrachytherapyDetails (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.oncology.domain.objects.BrachytherapyDetails.class;
	}


	public ims.domain.lookups.LookupInstance getBrachytherapyType() {
		return brachytherapyType;
	}
	public void setBrachytherapyType(ims.domain.lookups.LookupInstance brachytherapyType) {
		this.brachytherapyType = brachytherapyType;
	}

	public ims.domain.lookups.LookupInstance getPrescriptionPoint() {
		return prescriptionPoint;
	}
	public void setPrescriptionPoint(ims.domain.lookups.LookupInstance prescriptionPoint) {
		this.prescriptionPoint = prescriptionPoint;
	}

	public ims.domain.lookups.LookupInstance getUnit() {
		return unit;
	}
	public void setUnit(ims.domain.lookups.LookupInstance unit) {
		this.unit = unit;
	}

	public java.util.List getTreatmentDetails() {
		if ( null == treatmentDetails ) {
			treatmentDetails = new java.util.ArrayList();
		}
		return treatmentDetails;
	}
	public void setTreatmentDetails(java.util.List paramValue) {
		this.treatmentDetails = paramValue;
	}

	public Integer getActualNrTreatments() {
		return actualNrTreatments;
	}
	public void setActualNrTreatments(Integer actualNrTreatments) {
		this.actualNrTreatments = actualNrTreatments;
	}

	public ims.domain.lookups.LookupInstance getActualDoseRate() {
		return actualDoseRate;
	}
	public void setActualDoseRate(ims.domain.lookups.LookupInstance actualDoseRate) {
		this.actualDoseRate = actualDoseRate;
	}

	public Integer getTreatmentLength() {
		return treatmentLength;
	}
	public void setTreatmentLength(Integer treatmentLength) {
		this.treatmentLength = treatmentLength;
	}

	public ims.domain.lookups.LookupInstance getBrachyDeliveryType() {
		return brachyDeliveryType;
	}
	public void setBrachyDeliveryType(ims.domain.lookups.LookupInstance brachyDeliveryType) {
		this.brachyDeliveryType = brachyDeliveryType;
	}

	public ims.domain.lookups.LookupInstance getBrachyTherapyIsotopeType() {
		return brachyTherapyIsotopeType;
	}
	public void setBrachyTherapyIsotopeType(ims.domain.lookups.LookupInstance brachyTherapyIsotopeType) {
		this.brachyTherapyIsotopeType = brachyTherapyIsotopeType;
	}

	public ims.domain.lookups.LookupInstance getBrachyTherapyUnsealedSourceType() {
		return brachyTherapyUnsealedSourceType;
	}
	public void setBrachyTherapyUnsealedSourceType(ims.domain.lookups.LookupInstance brachyTherapyUnsealedSourceType) {
		this.brachyTherapyUnsealedSourceType = brachyTherapyUnsealedSourceType;
	}

	public ims.domain.lookups.LookupInstance getPatientType() {
		return patientType;
	}
	public void setPatientType(ims.domain.lookups.LookupInstance patientType) {
		this.patientType = patientType;
	}

	public Integer getActualDuration() {
		return actualDuration;
	}
	public void setActualDuration(Integer actualDuration) {
		this.actualDuration = actualDuration;
	}

	public ims.domain.lookups.LookupInstance getAnaestheticReq() {
		return anaestheticReq;
	}
	public void setAnaestheticReq(ims.domain.lookups.LookupInstance anaestheticReq) {
		this.anaestheticReq = anaestheticReq;
	}

	public java.lang.Float getTotalDose() {
		return totalDose;
	}
	public void setTotalDose(java.lang.Float totalDose) {
		this.totalDose = totalDose;
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
		
		auditStr.append("\r\n*brachytherapyType* :");
		if (brachytherapyType != null)
			auditStr.append(brachytherapyType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*prescriptionPoint* :");
		if (prescriptionPoint != null)
			auditStr.append(prescriptionPoint.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*unit* :");
		if (unit != null)
			auditStr.append(unit.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*treatmentDetails* :");
		if (treatmentDetails != null)
		{
		int i4=0;
		for (i4=0; i4<treatmentDetails.size(); i4++)
		{
			if (i4 > 0)
				auditStr.append(",");
			ims.oncology.domain.objects.BrachyTxTreatmentDetails obj = (ims.oncology.domain.objects.BrachyTxTreatmentDetails)treatmentDetails.get(i4);
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
		auditStr.append("\r\n*actualNrTreatments* :");
		auditStr.append(actualNrTreatments);
	    auditStr.append("; ");
		auditStr.append("\r\n*actualDoseRate* :");
		if (actualDoseRate != null)
			auditStr.append(actualDoseRate.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*treatmentLength* :");
		auditStr.append(treatmentLength);
	    auditStr.append("; ");
		auditStr.append("\r\n*brachyDeliveryType* :");
		if (brachyDeliveryType != null)
			auditStr.append(brachyDeliveryType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*brachyTherapyIsotopeType* :");
		if (brachyTherapyIsotopeType != null)
			auditStr.append(brachyTherapyIsotopeType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*brachyTherapyUnsealedSourceType* :");
		if (brachyTherapyUnsealedSourceType != null)
			auditStr.append(brachyTherapyUnsealedSourceType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*patientType* :");
		if (patientType != null)
			auditStr.append(patientType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*actualDuration* :");
		auditStr.append(actualDuration);
	    auditStr.append("; ");
		auditStr.append("\r\n*anaestheticReq* :");
		if (anaestheticReq != null)
			auditStr.append(anaestheticReq.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*totalDose* :");
		auditStr.append(totalDose);
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
		
		String keyClassName = "BrachytherapyDetails";
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
		if (this.getBrachytherapyType() != null)
		{
			sb.append("<brachytherapyType>");
			sb.append(this.getBrachytherapyType().toXMLString()); 
			sb.append("</brachytherapyType>");		
		}
		if (this.getPrescriptionPoint() != null)
		{
			sb.append("<prescriptionPoint>");
			sb.append(this.getPrescriptionPoint().toXMLString()); 
			sb.append("</prescriptionPoint>");		
		}
		if (this.getUnit() != null)
		{
			sb.append("<unit>");
			sb.append(this.getUnit().toXMLString()); 
			sb.append("</unit>");		
		}
		if (this.getTreatmentDetails() != null)
		{
			if (this.getTreatmentDetails().size() > 0 )
			{
			sb.append("<treatmentDetails>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getTreatmentDetails(), domMap));
			sb.append("</treatmentDetails>");		
			}
		}
		if (this.getActualNrTreatments() != null)
		{
			sb.append("<actualNrTreatments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getActualNrTreatments().toString()));
			sb.append("</actualNrTreatments>");		
		}
		if (this.getActualDoseRate() != null)
		{
			sb.append("<actualDoseRate>");
			sb.append(this.getActualDoseRate().toXMLString()); 
			sb.append("</actualDoseRate>");		
		}
		if (this.getTreatmentLength() != null)
		{
			sb.append("<treatmentLength>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTreatmentLength().toString()));
			sb.append("</treatmentLength>");		
		}
		if (this.getBrachyDeliveryType() != null)
		{
			sb.append("<brachyDeliveryType>");
			sb.append(this.getBrachyDeliveryType().toXMLString()); 
			sb.append("</brachyDeliveryType>");		
		}
		if (this.getBrachyTherapyIsotopeType() != null)
		{
			sb.append("<brachyTherapyIsotopeType>");
			sb.append(this.getBrachyTherapyIsotopeType().toXMLString()); 
			sb.append("</brachyTherapyIsotopeType>");		
		}
		if (this.getBrachyTherapyUnsealedSourceType() != null)
		{
			sb.append("<brachyTherapyUnsealedSourceType>");
			sb.append(this.getBrachyTherapyUnsealedSourceType().toXMLString()); 
			sb.append("</brachyTherapyUnsealedSourceType>");		
		}
		if (this.getPatientType() != null)
		{
			sb.append("<patientType>");
			sb.append(this.getPatientType().toXMLString()); 
			sb.append("</patientType>");		
		}
		if (this.getActualDuration() != null)
		{
			sb.append("<actualDuration>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getActualDuration().toString()));
			sb.append("</actualDuration>");		
		}
		if (this.getAnaestheticReq() != null)
		{
			sb.append("<anaestheticReq>");
			sb.append(this.getAnaestheticReq().toXMLString()); 
			sb.append("</anaestheticReq>");		
		}
		if (this.getTotalDose() != null)
		{
			sb.append("<totalDose>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTotalDose().toString()));
			sb.append("</totalDose>");		
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
			BrachytherapyDetails domainObject = getBrachytherapyDetailsfromXML(itemEl, factory, domMap);

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
			BrachytherapyDetails domainObject = getBrachytherapyDetailsfromXML(itemEl, factory, domMap);

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
		
	public static BrachytherapyDetails getBrachytherapyDetailsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getBrachytherapyDetailsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static BrachytherapyDetails getBrachytherapyDetailsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!BrachytherapyDetails.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!BrachytherapyDetails.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the BrachytherapyDetails class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (BrachytherapyDetails)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(BrachytherapyDetails.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		BrachytherapyDetails ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (BrachytherapyDetails)factory.getImportedDomainObject(BrachytherapyDetails.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new BrachytherapyDetails();
		}
		String keyClassName = "BrachytherapyDetails";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (BrachytherapyDetails)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, BrachytherapyDetails obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("brachytherapyType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setBrachytherapyType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("prescriptionPoint");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPrescriptionPoint(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("unit");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setUnit(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("treatmentDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setTreatmentDetails(ims.oncology.domain.objects.BrachyTxTreatmentDetails.fromListXMLString(fldEl, factory, obj.getTreatmentDetails(), domMap));
		}
		fldEl = el.element("actualNrTreatments");
		if(fldEl != null)
		{	
    		obj.setActualNrTreatments(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("actualDoseRate");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setActualDoseRate(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("treatmentLength");
		if(fldEl != null)
		{	
    		obj.setTreatmentLength(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("brachyDeliveryType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setBrachyDeliveryType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("brachyTherapyIsotopeType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setBrachyTherapyIsotopeType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("brachyTherapyUnsealedSourceType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setBrachyTherapyUnsealedSourceType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("patientType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPatientType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("actualDuration");
		if(fldEl != null)
		{	
    		obj.setActualDuration(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("anaestheticReq");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAnaestheticReq(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("totalDose");
		if(fldEl != null)
		{	
    		obj.setTotalDose(new java.lang.Float(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "treatmentDetails"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String BrachytherapyType = "brachytherapyType";
		public static final String PrescriptionPoint = "prescriptionPoint";
		public static final String Unit = "unit";
		public static final String TreatmentDetails = "treatmentDetails";
		public static final String ActualNrTreatments = "actualNrTreatments";
		public static final String ActualDoseRate = "actualDoseRate";
		public static final String TreatmentLength = "treatmentLength";
		public static final String BrachyDeliveryType = "brachyDeliveryType";
		public static final String BrachyTherapyIsotopeType = "brachyTherapyIsotopeType";
		public static final String BrachyTherapyUnsealedSourceType = "brachyTherapyUnsealedSourceType";
		public static final String PatientType = "patientType";
		public static final String ActualDuration = "actualDuration";
		public static final String AnaestheticReq = "anaestheticReq";
		public static final String TotalDose = "totalDose";
	}
}

