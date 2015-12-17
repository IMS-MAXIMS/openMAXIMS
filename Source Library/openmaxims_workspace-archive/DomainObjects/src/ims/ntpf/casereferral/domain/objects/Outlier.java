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
package ims.ntpf.casereferral.domain.objects;

/**
 * 
 * @author Joan Heelan
 * Generated.
 */


public class Outlier extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1035100004;
	private static final long serialVersionUID = 1035100004L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Outlier Type: Clinical will be a negative lookup */
	private ims.domain.lookups.LookupInstance outlierType;
	/** Comments */
	private String comments;
	/** Date Of Surgery */
	private java.util.Date dateOfSurgery;
	/** Clinical Complication: If Outlier Type is Clinical */
	private ims.domain.lookups.LookupInstance clinicalComplication;
	/** Extra Length Of Stay */
	private Integer extraLengthOfStay;
	/** Extra Length Of Stay Unit */
	private ims.domain.lookups.LookupInstance extraLengthOfStayUnit;
	/** Extra Procedure Investigations */
	private String extraProcedureInvestigations;
	/** Case */
	private ims.ntpf.casereferral.domain.objects.CaseReferral assocCase;
	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** Comments Collection
	  * Collection of ims.ntpf.common.domain.objects.Comment.
	  */
	private java.util.Set outlierComments;
	private Boolean isLinkedToCase;
	/** True if comments recorded against outlier */
	private Boolean hasComments;
	/** Treating Hospital */
	private ims.core.resource.place.domain.objects.Location treatingHospital;
	/** Treating Consultant */
	private ims.core.resource.people.domain.objects.Medic treatingConsultant;
	/** Specialty */
	private ims.core.clinical.domain.objects.Service specialty;
	/** Procedure */
	private ims.core.clinical.domain.objects.Procedure procedure;
	/** For Review? */
	private Boolean forReview;
	/** Outlier Subtype 1 */
	private ims.domain.lookups.LookupInstance outlierSubType1;
	/** Outlier Subtype 2 */
	private ims.domain.lookups.LookupInstance outlierSubType2;
	/** Procedure Name */
	private String procedureName;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public Outlier (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Outlier ()
    {
    	super();
    }
    public Outlier (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.ntpf.casereferral.domain.objects.Outlier.class;
	}


	public ims.domain.lookups.LookupInstance getOutlierType() {
		return outlierType;
	}
	public void setOutlierType(ims.domain.lookups.LookupInstance outlierType) {
		this.outlierType = outlierType;
	}

	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}

	public java.util.Date getDateOfSurgery() {
		return dateOfSurgery;
	}
	public void setDateOfSurgery(java.util.Date dateOfSurgery) {
		this.dateOfSurgery = dateOfSurgery;
	}

	public ims.domain.lookups.LookupInstance getClinicalComplication() {
		return clinicalComplication;
	}
	public void setClinicalComplication(ims.domain.lookups.LookupInstance clinicalComplication) {
		this.clinicalComplication = clinicalComplication;
	}

	public Integer getExtraLengthOfStay() {
		return extraLengthOfStay;
	}
	public void setExtraLengthOfStay(Integer extraLengthOfStay) {
		this.extraLengthOfStay = extraLengthOfStay;
	}

	public ims.domain.lookups.LookupInstance getExtraLengthOfStayUnit() {
		return extraLengthOfStayUnit;
	}
	public void setExtraLengthOfStayUnit(ims.domain.lookups.LookupInstance extraLengthOfStayUnit) {
		this.extraLengthOfStayUnit = extraLengthOfStayUnit;
	}

	public String getExtraProcedureInvestigations() {
		return extraProcedureInvestigations;
	}
	public void setExtraProcedureInvestigations(String extraProcedureInvestigations) {
		if ( null != extraProcedureInvestigations && extraProcedureInvestigations.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for extraProcedureInvestigations. Tried to set value: "+
				extraProcedureInvestigations);
		}
		this.extraProcedureInvestigations = extraProcedureInvestigations;
	}

	public ims.ntpf.casereferral.domain.objects.CaseReferral getAssocCase() {
		return assocCase;
	}
	public void setAssocCase(ims.ntpf.casereferral.domain.objects.CaseReferral assocCase) {
		this.assocCase = assocCase;
	}

	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public java.util.Set getOutlierComments() {
		if ( null == outlierComments ) {
			outlierComments = new java.util.HashSet();
		}
		return outlierComments;
	}
	public void setOutlierComments(java.util.Set paramValue) {
		this.outlierComments = paramValue;
	}

	public Boolean isIsLinkedToCase() {
		return isLinkedToCase;
	}
	public void setIsLinkedToCase(Boolean isLinkedToCase) {
		this.isLinkedToCase = isLinkedToCase;
	}

	public Boolean isHasComments() {
		return hasComments;
	}
	public void setHasComments(Boolean hasComments) {
		this.hasComments = hasComments;
	}

	public ims.core.resource.place.domain.objects.Location getTreatingHospital() {
		return treatingHospital;
	}
	public void setTreatingHospital(ims.core.resource.place.domain.objects.Location treatingHospital) {
		this.treatingHospital = treatingHospital;
	}

	public ims.core.resource.people.domain.objects.Medic getTreatingConsultant() {
		return treatingConsultant;
	}
	public void setTreatingConsultant(ims.core.resource.people.domain.objects.Medic treatingConsultant) {
		this.treatingConsultant = treatingConsultant;
	}

	public ims.core.clinical.domain.objects.Service getSpecialty() {
		return specialty;
	}
	public void setSpecialty(ims.core.clinical.domain.objects.Service specialty) {
		this.specialty = specialty;
	}

	public ims.core.clinical.domain.objects.Procedure getProcedure() {
		return procedure;
	}
	public void setProcedure(ims.core.clinical.domain.objects.Procedure procedure) {
		this.procedure = procedure;
	}

	public Boolean isForReview() {
		return forReview;
	}
	public void setForReview(Boolean forReview) {
		this.forReview = forReview;
	}

	public ims.domain.lookups.LookupInstance getOutlierSubType1() {
		return outlierSubType1;
	}
	public void setOutlierSubType1(ims.domain.lookups.LookupInstance outlierSubType1) {
		this.outlierSubType1 = outlierSubType1;
	}

	public ims.domain.lookups.LookupInstance getOutlierSubType2() {
		return outlierSubType2;
	}
	public void setOutlierSubType2(ims.domain.lookups.LookupInstance outlierSubType2) {
		this.outlierSubType2 = outlierSubType2;
	}

	public String getProcedureName() {
		return procedureName;
	}
	public void setProcedureName(String procedureName) {
		if ( null != procedureName && procedureName.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for procedureName. Tried to set value: "+
				procedureName);
		}
		this.procedureName = procedureName;
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
		
		auditStr.append("\r\n*outlierType* :");
		if (outlierType != null)
			auditStr.append(outlierType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*comments* :");
		auditStr.append(comments);
	    auditStr.append("; ");
		auditStr.append("\r\n*dateOfSurgery* :");
		auditStr.append(dateOfSurgery);
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalComplication* :");
		if (clinicalComplication != null)
			auditStr.append(clinicalComplication.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*extraLengthOfStay* :");
		auditStr.append(extraLengthOfStay);
	    auditStr.append("; ");
		auditStr.append("\r\n*extraLengthOfStayUnit* :");
		if (extraLengthOfStayUnit != null)
			auditStr.append(extraLengthOfStayUnit.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*extraProcedureInvestigations* :");
		auditStr.append(extraProcedureInvestigations);
	    auditStr.append("; ");
		auditStr.append("\r\n*assocCase* :");
		if (assocCase != null)
		{
			auditStr.append(toShortClassName(assocCase));
				
		    auditStr.append(assocCase.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*patient* :");
		if (patient != null)
		{
			auditStr.append(toShortClassName(patient));
				
		    auditStr.append(patient.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*outlierComments* :");
		if (outlierComments != null)
		{
			java.util.Iterator it10 = outlierComments.iterator();
			int i10=0;
			while (it10.hasNext())
			{
				if (i10 > 0)
					auditStr.append(",");
				ims.ntpf.common.domain.objects.Comment obj = (ims.ntpf.common.domain.objects.Comment)it10.next();
		if (obj != null)
		{
		   if (i10 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i10++;
		}
		if (i10 > 0)
			auditStr.append("] " + i10);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isLinkedToCase* :");
		auditStr.append(isLinkedToCase);
	    auditStr.append("; ");
		auditStr.append("\r\n*hasComments* :");
		auditStr.append(hasComments);
	    auditStr.append("; ");
		auditStr.append("\r\n*treatingHospital* :");
		if (treatingHospital != null)
		{
			auditStr.append(toShortClassName(treatingHospital));
				
		    auditStr.append(treatingHospital.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*treatingConsultant* :");
		if (treatingConsultant != null)
		{
			auditStr.append(toShortClassName(treatingConsultant));
				
		    auditStr.append(treatingConsultant.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*specialty* :");
		if (specialty != null)
		{
			auditStr.append(toShortClassName(specialty));
				
		    auditStr.append(specialty.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*procedure* :");
		if (procedure != null)
		{
			auditStr.append(toShortClassName(procedure));
				
		    auditStr.append(procedure.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*forReview* :");
		auditStr.append(forReview);
	    auditStr.append("; ");
		auditStr.append("\r\n*outlierSubType1* :");
		if (outlierSubType1 != null)
			auditStr.append(outlierSubType1.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*outlierSubType2* :");
		if (outlierSubType2 != null)
			auditStr.append(outlierSubType2.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*procedureName* :");
		auditStr.append(procedureName);
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
		
		String keyClassName = "Outlier";
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
		if (this.getOutlierType() != null)
		{
			sb.append("<outlierType>");
			sb.append(this.getOutlierType().toXMLString()); 
			sb.append("</outlierType>");		
		}
		if (this.getComments() != null)
		{
			sb.append("<comments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComments().toString()));
			sb.append("</comments>");		
		}
		if (this.getDateOfSurgery() != null)
		{
			sb.append("<dateOfSurgery>");
			sb.append(new ims.framework.utils.DateTime(this.getDateOfSurgery()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateOfSurgery>");		
		}
		if (this.getClinicalComplication() != null)
		{
			sb.append("<clinicalComplication>");
			sb.append(this.getClinicalComplication().toXMLString()); 
			sb.append("</clinicalComplication>");		
		}
		if (this.getExtraLengthOfStay() != null)
		{
			sb.append("<extraLengthOfStay>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getExtraLengthOfStay().toString()));
			sb.append("</extraLengthOfStay>");		
		}
		if (this.getExtraLengthOfStayUnit() != null)
		{
			sb.append("<extraLengthOfStayUnit>");
			sb.append(this.getExtraLengthOfStayUnit().toXMLString()); 
			sb.append("</extraLengthOfStayUnit>");		
		}
		if (this.getExtraProcedureInvestigations() != null)
		{
			sb.append("<extraProcedureInvestigations>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getExtraProcedureInvestigations().toString()));
			sb.append("</extraProcedureInvestigations>");		
		}
		if (this.getAssocCase() != null)
		{
			sb.append("<assocCase>");
			sb.append(this.getAssocCase().toXMLString(domMap)); 	
			sb.append("</assocCase>");		
		}
		if (this.getPatient() != null)
		{
			sb.append("<patient>");
			sb.append(this.getPatient().toXMLString(domMap)); 	
			sb.append("</patient>");		
		}
		if (this.getOutlierComments() != null)
		{
			if (this.getOutlierComments().size() > 0 )
			{
			sb.append("<outlierComments>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getOutlierComments(), domMap));
			sb.append("</outlierComments>");		
			}
		}
		if (this.isIsLinkedToCase() != null)
		{
			sb.append("<isLinkedToCase>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsLinkedToCase().toString()));
			sb.append("</isLinkedToCase>");		
		}
		if (this.isHasComments() != null)
		{
			sb.append("<hasComments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasComments().toString()));
			sb.append("</hasComments>");		
		}
		if (this.getTreatingHospital() != null)
		{
			sb.append("<treatingHospital>");
			sb.append(this.getTreatingHospital().toXMLString(domMap)); 	
			sb.append("</treatingHospital>");		
		}
		if (this.getTreatingConsultant() != null)
		{
			sb.append("<treatingConsultant>");
			sb.append(this.getTreatingConsultant().toXMLString(domMap)); 	
			sb.append("</treatingConsultant>");		
		}
		if (this.getSpecialty() != null)
		{
			sb.append("<specialty>");
			sb.append(this.getSpecialty().toXMLString(domMap)); 	
			sb.append("</specialty>");		
		}
		if (this.getProcedure() != null)
		{
			sb.append("<procedure>");
			sb.append(this.getProcedure().toXMLString(domMap)); 	
			sb.append("</procedure>");		
		}
		if (this.isForReview() != null)
		{
			sb.append("<forReview>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isForReview().toString()));
			sb.append("</forReview>");		
		}
		if (this.getOutlierSubType1() != null)
		{
			sb.append("<outlierSubType1>");
			sb.append(this.getOutlierSubType1().toXMLString()); 
			sb.append("</outlierSubType1>");		
		}
		if (this.getOutlierSubType2() != null)
		{
			sb.append("<outlierSubType2>");
			sb.append(this.getOutlierSubType2().toXMLString()); 
			sb.append("</outlierSubType2>");		
		}
		if (this.getProcedureName() != null)
		{
			sb.append("<procedureName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getProcedureName().toString()));
			sb.append("</procedureName>");		
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
			Outlier domainObject = getOutlierfromXML(itemEl, factory, domMap);

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
			Outlier domainObject = getOutlierfromXML(itemEl, factory, domMap);

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
		
	public static Outlier getOutlierfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getOutlierfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Outlier getOutlierfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Outlier.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Outlier.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Outlier class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Outlier)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Outlier.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Outlier ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Outlier)factory.getImportedDomainObject(Outlier.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Outlier();
		}
		String keyClassName = "Outlier";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Outlier)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Outlier obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("outlierType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOutlierType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("comments");
		if(fldEl != null)
		{	
    		obj.setComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dateOfSurgery");
		if(fldEl != null)
		{	
    		obj.setDateOfSurgery(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("clinicalComplication");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setClinicalComplication(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("extraLengthOfStay");
		if(fldEl != null)
		{	
    		obj.setExtraLengthOfStay(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("extraLengthOfStayUnit");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setExtraLengthOfStayUnit(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("extraProcedureInvestigations");
		if(fldEl != null)
		{	
    		obj.setExtraProcedureInvestigations(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("assocCase");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAssocCase(ims.ntpf.casereferral.domain.objects.CaseReferral.getCaseReferralfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("outlierComments");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setOutlierComments(ims.ntpf.common.domain.objects.Comment.fromSetXMLString(fldEl, factory, obj.getOutlierComments(), domMap));
		}
		fldEl = el.element("isLinkedToCase");
		if(fldEl != null)
		{	
    		obj.setIsLinkedToCase(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hasComments");
		if(fldEl != null)
		{	
    		obj.setHasComments(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("treatingHospital");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTreatingHospital(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("treatingConsultant");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTreatingConsultant(ims.core.resource.people.domain.objects.Medic.getMedicfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("specialty");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSpecialty(ims.core.clinical.domain.objects.Service.getServicefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("procedure");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setProcedure(ims.core.clinical.domain.objects.Procedure.getProcedurefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("forReview");
		if(fldEl != null)
		{	
    		obj.setForReview(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("outlierSubType1");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOutlierSubType1(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("outlierSubType2");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOutlierSubType2(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("procedureName");
		if(fldEl != null)
		{	
    		obj.setProcedureName(new String(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "outlierComments"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String OutlierType = "outlierType";
		public static final String Comments = "comments";
		public static final String DateOfSurgery = "dateOfSurgery";
		public static final String ClinicalComplication = "clinicalComplication";
		public static final String ExtraLengthOfStay = "extraLengthOfStay";
		public static final String ExtraLengthOfStayUnit = "extraLengthOfStayUnit";
		public static final String ExtraProcedureInvestigations = "extraProcedureInvestigations";
		public static final String AssocCase = "assocCase";
		public static final String Patient = "patient";
		public static final String OutlierComments = "outlierComments";
		public static final String IsLinkedToCase = "isLinkedToCase";
		public static final String HasComments = "hasComments";
		public static final String TreatingHospital = "treatingHospital";
		public static final String TreatingConsultant = "treatingConsultant";
		public static final String Specialty = "specialty";
		public static final String Procedure = "procedure";
		public static final String ForReview = "forReview";
		public static final String OutlierSubType1 = "outlierSubType1";
		public static final String OutlierSubType2 = "outlierSubType2";
		public static final String ProcedureName = "procedureName";
	}
}

