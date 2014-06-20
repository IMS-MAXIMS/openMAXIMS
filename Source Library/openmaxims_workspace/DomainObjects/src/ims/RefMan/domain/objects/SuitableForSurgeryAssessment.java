/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 16/04/2014, 12:34
 *
 */
package ims.RefMan.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class SuitableForSurgeryAssessment extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1096100015;
	private static final long serialVersionUID = 1096100015L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** AuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** Procedure */
	private ims.core.clinical.domain.objects.PatientProcedure procedure;
	/** Theatre Type */
	private ims.domain.lookups.LookupInstance theatreType;
	/** History of Presenting Complaint */
	private String historyPresComplaint;
	/** Examination */
	private String examination;
	/** Conclusions */
	private String conclusions;
	/** SuitableForSurgery */
	private ims.domain.lookups.LookupInstance suitableForSurgery;
	/** Reason not suitable for surgery */
	private ims.domain.lookups.LookupInstance reasonNotSuitable;
	/** Not Suitable For Surgey Comments */
	private String notSuitableForSurgeyComments;
	/** Suitable For Surgery Assessment */
	private ims.assessment.instantiation.domain.objects.PatientAssessment suitableForSurgeryAssessment;
	/** Comments
	  * Collection of ims.RefMan.domain.objects.SuitableForSurgeryComment.
	  */
	private java.util.Set comments;
	/** ProcedurePerformed */
	private Boolean procedurePerformed;
	/** Suitable For Surgery Date */
	private java.util.Date suitableForSurgeryDate;
	/** Required Duration In Mins */
	private Integer requiredDurationInMins;
	/** Anaesthetic Type  */
	private ims.domain.lookups.LookupInstance anaestheticType;
	/** Named Surgeon */
	private ims.core.resource.people.domain.objects.Medic namedSurgeon;
	/** Special Equipment Required */
	private Boolean specialEquipmentRequired;
	/** Special Equipment Comments */
	private String specialEquipmentComments;
	/** Special Instructions Required */
	private Boolean specialInstructionsRequired;
	/** Special Instructions Comments */
	private String specialInstructionsComments;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public SuitableForSurgeryAssessment (Integer id, int ver)
    {
    	super(id, ver);
    }
    public SuitableForSurgeryAssessment ()
    {
    	super();
    }
    public SuitableForSurgeryAssessment (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.RefMan.domain.objects.SuitableForSurgeryAssessment.class;
	}


	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
	}

	public ims.core.clinical.domain.objects.PatientProcedure getProcedure() {
		return procedure;
	}
	public void setProcedure(ims.core.clinical.domain.objects.PatientProcedure procedure) {
		this.procedure = procedure;
	}

	public ims.domain.lookups.LookupInstance getTheatreType() {
		return theatreType;
	}
	public void setTheatreType(ims.domain.lookups.LookupInstance theatreType) {
		this.theatreType = theatreType;
	}

	public String getHistoryPresComplaint() {
		return historyPresComplaint;
	}
	public void setHistoryPresComplaint(String historyPresComplaint) {
		this.historyPresComplaint = historyPresComplaint;
	}

	public String getExamination() {
		return examination;
	}
	public void setExamination(String examination) {
		this.examination = examination;
	}

	public String getConclusions() {
		return conclusions;
	}
	public void setConclusions(String conclusions) {
		this.conclusions = conclusions;
	}

	public ims.domain.lookups.LookupInstance getSuitableForSurgery() {
		return suitableForSurgery;
	}
	public void setSuitableForSurgery(ims.domain.lookups.LookupInstance suitableForSurgery) {
		this.suitableForSurgery = suitableForSurgery;
	}

	public ims.domain.lookups.LookupInstance getReasonNotSuitable() {
		return reasonNotSuitable;
	}
	public void setReasonNotSuitable(ims.domain.lookups.LookupInstance reasonNotSuitable) {
		this.reasonNotSuitable = reasonNotSuitable;
	}

	public String getNotSuitableForSurgeyComments() {
		return notSuitableForSurgeyComments;
	}
	public void setNotSuitableForSurgeyComments(String notSuitableForSurgeyComments) {
		this.notSuitableForSurgeyComments = notSuitableForSurgeyComments;
	}

	public ims.assessment.instantiation.domain.objects.PatientAssessment getSuitableForSurgeryAssessment() {
		return suitableForSurgeryAssessment;
	}
	public void setSuitableForSurgeryAssessment(ims.assessment.instantiation.domain.objects.PatientAssessment suitableForSurgeryAssessment) {
		this.suitableForSurgeryAssessment = suitableForSurgeryAssessment;
	}

	public java.util.Set getComments() {
		if ( null == comments ) {
			comments = new java.util.HashSet();
		}
		return comments;
	}
	public void setComments(java.util.Set paramValue) {
		this.comments = paramValue;
	}

	public Boolean isProcedurePerformed() {
		return procedurePerformed;
	}
	public void setProcedurePerformed(Boolean procedurePerformed) {
		this.procedurePerformed = procedurePerformed;
	}

	public java.util.Date getSuitableForSurgeryDate() {
		return suitableForSurgeryDate;
	}
	public void setSuitableForSurgeryDate(java.util.Date suitableForSurgeryDate) {
		this.suitableForSurgeryDate = suitableForSurgeryDate;
	}

	public Integer getRequiredDurationInMins() {
		return requiredDurationInMins;
	}
	public void setRequiredDurationInMins(Integer requiredDurationInMins) {
		this.requiredDurationInMins = requiredDurationInMins;
	}

	public ims.domain.lookups.LookupInstance getAnaestheticType() {
		return anaestheticType;
	}
	public void setAnaestheticType(ims.domain.lookups.LookupInstance anaestheticType) {
		this.anaestheticType = anaestheticType;
	}

	public ims.core.resource.people.domain.objects.Medic getNamedSurgeon() {
		return namedSurgeon;
	}
	public void setNamedSurgeon(ims.core.resource.people.domain.objects.Medic namedSurgeon) {
		this.namedSurgeon = namedSurgeon;
	}

	public Boolean isSpecialEquipmentRequired() {
		return specialEquipmentRequired;
	}
	public void setSpecialEquipmentRequired(Boolean specialEquipmentRequired) {
		this.specialEquipmentRequired = specialEquipmentRequired;
	}

	public String getSpecialEquipmentComments() {
		return specialEquipmentComments;
	}
	public void setSpecialEquipmentComments(String specialEquipmentComments) {
		if ( null != specialEquipmentComments && specialEquipmentComments.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for specialEquipmentComments. Tried to set value: "+
				specialEquipmentComments);
		}
		this.specialEquipmentComments = specialEquipmentComments;
	}

	public Boolean isSpecialInstructionsRequired() {
		return specialInstructionsRequired;
	}
	public void setSpecialInstructionsRequired(Boolean specialInstructionsRequired) {
		this.specialInstructionsRequired = specialInstructionsRequired;
	}

	public String getSpecialInstructionsComments() {
		return specialInstructionsComments;
	}
	public void setSpecialInstructionsComments(String specialInstructionsComments) {
		if ( null != specialInstructionsComments && specialInstructionsComments.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for specialInstructionsComments. Tried to set value: "+
				specialInstructionsComments);
		}
		this.specialInstructionsComments = specialInstructionsComments;
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
		
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*procedure* :");
		if (procedure != null)
		{
			auditStr.append(toShortClassName(procedure));
				
		    auditStr.append(procedure.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*theatreType* :");
		if (theatreType != null)
			auditStr.append(theatreType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*historyPresComplaint* :");
		auditStr.append(historyPresComplaint);
	    auditStr.append("; ");
		auditStr.append("\r\n*examination* :");
		auditStr.append(examination);
	    auditStr.append("; ");
		auditStr.append("\r\n*conclusions* :");
		auditStr.append(conclusions);
	    auditStr.append("; ");
		auditStr.append("\r\n*suitableForSurgery* :");
		if (suitableForSurgery != null)
			auditStr.append(suitableForSurgery.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*reasonNotSuitable* :");
		if (reasonNotSuitable != null)
			auditStr.append(reasonNotSuitable.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*notSuitableForSurgeyComments* :");
		auditStr.append(notSuitableForSurgeyComments);
	    auditStr.append("; ");
		auditStr.append("\r\n*suitableForSurgeryAssessment* :");
		if (suitableForSurgeryAssessment != null)
		{
			auditStr.append(toShortClassName(suitableForSurgeryAssessment));
				
		    auditStr.append(suitableForSurgeryAssessment.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*comments* :");
		if (comments != null)
		{
			java.util.Iterator it12 = comments.iterator();
			int i12=0;
			while (it12.hasNext())
			{
				if (i12 > 0)
					auditStr.append(",");
				ims.RefMan.domain.objects.SuitableForSurgeryComment obj = (ims.RefMan.domain.objects.SuitableForSurgeryComment)it12.next();
		if (obj != null)
		{
		   if (i12 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i12++;
		}
		if (i12 > 0)
			auditStr.append("] " + i12);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*procedurePerformed* :");
		auditStr.append(procedurePerformed);
	    auditStr.append("; ");
		auditStr.append("\r\n*suitableForSurgeryDate* :");
		auditStr.append(suitableForSurgeryDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*requiredDurationInMins* :");
		auditStr.append(requiredDurationInMins);
	    auditStr.append("; ");
		auditStr.append("\r\n*anaestheticType* :");
		if (anaestheticType != null)
			auditStr.append(anaestheticType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*namedSurgeon* :");
		if (namedSurgeon != null)
		{
			auditStr.append(toShortClassName(namedSurgeon));
				
		    auditStr.append(namedSurgeon.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*specialEquipmentRequired* :");
		auditStr.append(specialEquipmentRequired);
	    auditStr.append("; ");
		auditStr.append("\r\n*specialEquipmentComments* :");
		auditStr.append(specialEquipmentComments);
	    auditStr.append("; ");
		auditStr.append("\r\n*specialInstructionsRequired* :");
		auditStr.append(specialInstructionsRequired);
	    auditStr.append("; ");
		auditStr.append("\r\n*specialInstructionsComments* :");
		auditStr.append(specialInstructionsComments);
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
		
		String keyClassName = "SuitableForSurgeryAssessment";
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
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
		}
		if (this.getProcedure() != null)
		{
			sb.append("<procedure>");
			sb.append(this.getProcedure().toXMLString(domMap)); 	
			sb.append("</procedure>");		
		}
		if (this.getTheatreType() != null)
		{
			sb.append("<theatreType>");
			sb.append(this.getTheatreType().toXMLString()); 
			sb.append("</theatreType>");		
		}
		if (this.getHistoryPresComplaint() != null)
		{
			sb.append("<historyPresComplaint>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getHistoryPresComplaint().toString()));
			sb.append("</historyPresComplaint>");		
		}
		if (this.getExamination() != null)
		{
			sb.append("<examination>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getExamination().toString()));
			sb.append("</examination>");		
		}
		if (this.getConclusions() != null)
		{
			sb.append("<conclusions>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getConclusions().toString()));
			sb.append("</conclusions>");		
		}
		if (this.getSuitableForSurgery() != null)
		{
			sb.append("<suitableForSurgery>");
			sb.append(this.getSuitableForSurgery().toXMLString()); 
			sb.append("</suitableForSurgery>");		
		}
		if (this.getReasonNotSuitable() != null)
		{
			sb.append("<reasonNotSuitable>");
			sb.append(this.getReasonNotSuitable().toXMLString()); 
			sb.append("</reasonNotSuitable>");		
		}
		if (this.getNotSuitableForSurgeyComments() != null)
		{
			sb.append("<notSuitableForSurgeyComments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNotSuitableForSurgeyComments().toString()));
			sb.append("</notSuitableForSurgeyComments>");		
		}
		if (this.getSuitableForSurgeryAssessment() != null)
		{
			sb.append("<suitableForSurgeryAssessment>");
			sb.append(this.getSuitableForSurgeryAssessment().toXMLString(domMap)); 	
			sb.append("</suitableForSurgeryAssessment>");		
		}
		if (this.getComments() != null)
		{
			if (this.getComments().size() > 0 )
			{
			sb.append("<comments>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getComments(), domMap));
			sb.append("</comments>");		
			}
		}
		if (this.isProcedurePerformed() != null)
		{
			sb.append("<procedurePerformed>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isProcedurePerformed().toString()));
			sb.append("</procedurePerformed>");		
		}
		if (this.getSuitableForSurgeryDate() != null)
		{
			sb.append("<suitableForSurgeryDate>");
			sb.append(new ims.framework.utils.DateTime(this.getSuitableForSurgeryDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</suitableForSurgeryDate>");		
		}
		if (this.getRequiredDurationInMins() != null)
		{
			sb.append("<requiredDurationInMins>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRequiredDurationInMins().toString()));
			sb.append("</requiredDurationInMins>");		
		}
		if (this.getAnaestheticType() != null)
		{
			sb.append("<anaestheticType>");
			sb.append(this.getAnaestheticType().toXMLString()); 
			sb.append("</anaestheticType>");		
		}
		if (this.getNamedSurgeon() != null)
		{
			sb.append("<namedSurgeon>");
			sb.append(this.getNamedSurgeon().toXMLString(domMap)); 	
			sb.append("</namedSurgeon>");		
		}
		if (this.isSpecialEquipmentRequired() != null)
		{
			sb.append("<specialEquipmentRequired>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isSpecialEquipmentRequired().toString()));
			sb.append("</specialEquipmentRequired>");		
		}
		if (this.getSpecialEquipmentComments() != null)
		{
			sb.append("<specialEquipmentComments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSpecialEquipmentComments().toString()));
			sb.append("</specialEquipmentComments>");		
		}
		if (this.isSpecialInstructionsRequired() != null)
		{
			sb.append("<specialInstructionsRequired>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isSpecialInstructionsRequired().toString()));
			sb.append("</specialInstructionsRequired>");		
		}
		if (this.getSpecialInstructionsComments() != null)
		{
			sb.append("<specialInstructionsComments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSpecialInstructionsComments().toString()));
			sb.append("</specialInstructionsComments>");		
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
			SuitableForSurgeryAssessment domainObject = getSuitableForSurgeryAssessmentfromXML(itemEl, factory, domMap);

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
			SuitableForSurgeryAssessment domainObject = getSuitableForSurgeryAssessmentfromXML(itemEl, factory, domMap);

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
		
	public static SuitableForSurgeryAssessment getSuitableForSurgeryAssessmentfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getSuitableForSurgeryAssessmentfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static SuitableForSurgeryAssessment getSuitableForSurgeryAssessmentfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!SuitableForSurgeryAssessment.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!SuitableForSurgeryAssessment.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the SuitableForSurgeryAssessment class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (SuitableForSurgeryAssessment)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(SuitableForSurgeryAssessment.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		SuitableForSurgeryAssessment ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (SuitableForSurgeryAssessment)factory.getImportedDomainObject(SuitableForSurgeryAssessment.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new SuitableForSurgeryAssessment();
		}
		String keyClassName = "SuitableForSurgeryAssessment";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (SuitableForSurgeryAssessment)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, SuitableForSurgeryAssessment obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("procedure");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setProcedure(ims.core.clinical.domain.objects.PatientProcedure.getPatientProcedurefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("theatreType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTheatreType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("historyPresComplaint");
		if(fldEl != null)
		{	
    		obj.setHistoryPresComplaint(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("examination");
		if(fldEl != null)
		{	
    		obj.setExamination(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("conclusions");
		if(fldEl != null)
		{	
    		obj.setConclusions(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("suitableForSurgery");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSuitableForSurgery(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("reasonNotSuitable");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReasonNotSuitable(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("notSuitableForSurgeyComments");
		if(fldEl != null)
		{	
    		obj.setNotSuitableForSurgeyComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("suitableForSurgeryAssessment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSuitableForSurgeryAssessment(ims.assessment.instantiation.domain.objects.PatientAssessment.getPatientAssessmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("comments");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setComments(ims.RefMan.domain.objects.SuitableForSurgeryComment.fromSetXMLString(fldEl, factory, obj.getComments(), domMap));
		}
		fldEl = el.element("procedurePerformed");
		if(fldEl != null)
		{	
    		obj.setProcedurePerformed(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("suitableForSurgeryDate");
		if(fldEl != null)
		{	
    		obj.setSuitableForSurgeryDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("requiredDurationInMins");
		if(fldEl != null)
		{	
    		obj.setRequiredDurationInMins(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("anaestheticType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAnaestheticType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("namedSurgeon");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setNamedSurgeon(ims.core.resource.people.domain.objects.Medic.getMedicfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("specialEquipmentRequired");
		if(fldEl != null)
		{	
    		obj.setSpecialEquipmentRequired(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("specialEquipmentComments");
		if(fldEl != null)
		{	
    		obj.setSpecialEquipmentComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("specialInstructionsRequired");
		if(fldEl != null)
		{	
    		obj.setSpecialInstructionsRequired(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("specialInstructionsComments");
		if(fldEl != null)
		{	
    		obj.setSpecialInstructionsComments(new String(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "comments"
		};
	}


	public void bringStageIntoScope(ims.domain.DomainFactory factory, ims.rules.engine.RulesRuntimeEngine engine, String stage)
	{	
		// Private keys for engine hash map
            final String IsFitKey = "IsFitForSugery";

            java.util.ArrayList<java.lang.String> keys = new java.util.ArrayList<java.lang.String>();
            java.util.ArrayList<java.lang.Object> values = new java.util.ArrayList<java.lang.Object>();

            keys.add("ID");
            values.add(this.careContext.getId());
            keys.add("DATE");
            values.add(this.authoringInformation.getAuthoringDateTime());

            // Check if the FitForSurgery assessment is in stage
            if (engine.getValue(IsFitKey) == null)
            {
                  // Get latest fit for surgery assessment into engine hash map
                  java.lang.String hqlQuery = "from FitForSurgeryAssesment as fit where (fit.careContext.id = :ID and fit.authoringInformation.authoringDateTime <= :DATE and fit.isRIE is null) order by fit.authoringInformation.authoringDateTime desc top 1";

                  java.util.List<ims.RefMan.domain.objects.FitForSurgeryAssesment> list = factory.find(hqlQuery, keys, values);

                  if (list != null && list.size() != 0)
                  {
                        engine.setValue(IsFitKey, list.get(0));
                  }
            }

            ims.RefMan.domain.objects.FitForSurgeryAssesment fitForSurgery = (ims.RefMan.domain.objects.FitForSurgeryAssesment) engine.getValue(IsFitKey);

            // Check if fit for surgery conditions are met
            if (fitForSurgery == null || !fitForSurgery.isFitForSurgery())
                  return;

            keys.remove("DATE");

            // Get the patient ICP
            java.lang.String hqlIcpQuery = "from PatientICP as icp where (icp.careContext.id = :ID and icp.isRIE is null)";
            java.util.List<ims.icps.instantiation.domain.objects.PatientICP> icps = factory.find(hqlIcpQuery, keys, values);

            // Check if there is an ICP present
            if (icps == null || icps.size() == 0)
                  return;

            // Get an PatientICP
            ims.icps.instantiation.domain.objects.PatientICP patientICP = icps.get(0);

            ims.icps.instantiation.domain.objects.PatientICPAction action = null;

            java.util.Iterator<ims.icps.instantiation.domain.objects.PatientICPStage> stageIterator = patientICP.getStages().iterator();

            while (stageIterator.hasNext())
            {
                  ims.icps.instantiation.domain.objects.PatientICPStage patientStage = stageIterator.next();

                  java.util.Iterator<ims.icps.instantiation.domain.objects.PatientICPPhase> phaseIterator = patientStage.getStagePhases().iterator();

                  while (phaseIterator.hasNext())
                  {
                        ims.icps.instantiation.domain.objects.PatientICPPhase patientPhase = phaseIterator.next();

                        java.util.Iterator<ims.icps.instantiation.domain.objects.PatientICPAction> actionsIterator = patientPhase.getPhaseActions().iterator();

                        while (actionsIterator.hasNext())
                        {
                              action = actionsIterator.next();

                              if (action != null)
                                    break;
                        }

                        if (action != null)
                              break;
                  }

                  if (action != null)
                        break;
            }

            // bring stage into scope
            if (action != null)
            {
                  action.bringStageIntoScope(factory, engine, stage);
            }
	}

	public void bringPhaseIntoScope(ims.domain.DomainFactory factory, ims.rules.engine.RulesRuntimeEngine engine, String phase)
	{	
		// Private keys for engine hash map
            final String IsFitKey = "IsFitForSugery";

            java.util.ArrayList<java.lang.String> keys = new java.util.ArrayList<java.lang.String>();
            java.util.ArrayList<java.lang.Object> values = new java.util.ArrayList<java.lang.Object>();

            keys.add("ID");
            values.add(this.careContext.getId());
            keys.add("DATE");
            values.add(this.authoringInformation.getAuthoringDateTime());

            // Check if the FitForSurgery assessment is in stage
            if (engine.getValue(IsFitKey) == null)
            {
                  // Get latest fit for surgery assessment into engine hash map
                  java.lang.String hqlQuery = "from FitForSurgeryAssesment as fit where (fit.careContext.id = :ID and fit.authoringInformation.authoringDateTime <= :DATE and fit.isRIE is null) order by fit.authoringInformation.authoringDateTime desc top 1";

                  java.util.List<ims.RefMan.domain.objects.FitForSurgeryAssesment> list = factory.find(hqlQuery, keys, values);

                  if (list != null && list.size() != 0)
                  {
                        engine.setValue(IsFitKey, list.get(0));
                  }
            }

            ims.RefMan.domain.objects.FitForSurgeryAssesment fitForSurgery = (ims.RefMan.domain.objects.FitForSurgeryAssesment) engine.getValue(IsFitKey);

            // Check if fit for surgery conditions are met
            if (fitForSurgery == null || !fitForSurgery.isFitForSurgery())
                  return;

            keys.remove("DATE");

            // Get the patient ICP
            java.lang.String hqlIcpQuery = "from PatientICP as icp where (icp.careContext.id = :ID and icp.isRIE is null)";
            java.util.List<ims.icps.instantiation.domain.objects.PatientICP> icps = factory.find(hqlIcpQuery, keys, values);

            // Check if there is an ICP present
            if (icps == null || icps.size() == 0)
                  return;

            // Get an PatientICP
            ims.icps.instantiation.domain.objects.PatientICP patientICP = icps.get(0);

            ims.icps.instantiation.domain.objects.PatientICPAction action = null;

            java.util.Iterator<ims.icps.instantiation.domain.objects.PatientICPStage> stageIterator = patientICP.getStages().iterator();

            while (stageIterator.hasNext())
            {
                  ims.icps.instantiation.domain.objects.PatientICPStage patientStage = stageIterator.next();

                  java.util.Iterator<ims.icps.instantiation.domain.objects.PatientICPPhase> phaseIterator = patientStage.getStagePhases().iterator();

                  while (phaseIterator.hasNext())
                  {
                        ims.icps.instantiation.domain.objects.PatientICPPhase patientPhase = phaseIterator.next();

                        java.util.Iterator<ims.icps.instantiation.domain.objects.PatientICPAction> actionsIterator = patientPhase.getPhaseActions().iterator();

                        while (actionsIterator.hasNext())
                        {
                              action = actionsIterator.next();

                              if (action != null)
                                    break;
                        }

                        if (action != null)
                              break;
                  }

                  if (action != null)
                        break;
            }

            // Bring phase into scope
            if (action != null)
            {
                  action.bringPhaseIntoScope(factory, engine, phase);
            }
	}

	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String CareContext = "careContext";
		public static final String AuthoringInformation = "authoringInformation";
		public static final String Procedure = "procedure";
		public static final String TheatreType = "theatreType";
		public static final String HistoryPresComplaint = "historyPresComplaint";
		public static final String Examination = "examination";
		public static final String Conclusions = "conclusions";
		public static final String SuitableForSurgery = "suitableForSurgery";
		public static final String ReasonNotSuitable = "reasonNotSuitable";
		public static final String NotSuitableForSurgeyComments = "notSuitableForSurgeyComments";
		public static final String SuitableForSurgeryAssessment = "suitableForSurgeryAssessment";
		public static final String Comments = "comments";
		public static final String ProcedurePerformed = "procedurePerformed";
		public static final String SuitableForSurgeryDate = "suitableForSurgeryDate";
		public static final String RequiredDurationInMins = "requiredDurationInMins";
		public static final String AnaestheticType = "anaestheticType";
		public static final String NamedSurgeon = "namedSurgeon";
		public static final String SpecialEquipmentRequired = "specialEquipmentRequired";
		public static final String SpecialEquipmentComments = "specialEquipmentComments";
		public static final String SpecialInstructionsRequired = "specialInstructionsRequired";
		public static final String SpecialInstructionsComments = "specialInstructionsComments";
	}
}

