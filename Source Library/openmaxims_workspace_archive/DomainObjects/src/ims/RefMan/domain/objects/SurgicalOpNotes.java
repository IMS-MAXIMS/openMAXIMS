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


public class SurgicalOpNotes extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1096100053;
	private static final long serialVersionUID = 1096100053L;
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
	/** Intra Operative Care Record */
	private ims.core.clinical.domain.objects.IntraOperativeCareRecord intraOperativeCareRecord;
	/** PreOperative Diagnosis */
	private String preOperativeDiagnosis;
	/** Antibiotics */
	private String antibiotics;
	/** VTE */
	private String vTE;
	/** Incision  */
	private String incision;
	/** Findings                         */
	private String findings;
	/** Procedure */
	private String procedure;
	/** Complications */
	private String complications;
	/** Closure                          */
	private String closure;
	/** LA Infiltration */
	private String lAInfiltration;
	/** PostOpInstructions */
	private String postOpInstructions;
	/** EBI mls */
	private String eBI;
	/** FollowUp Type */
	private ims.domain.lookups.LookupInstance followUpType;
	/** FollowUp Type In */
	private ims.domain.lookups.LookupInstance followUpTypeIn;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public SurgicalOpNotes (Integer id, int ver)
    {
    	super(id, ver);
    }
    public SurgicalOpNotes ()
    {
    	super();
    }
    public SurgicalOpNotes (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.RefMan.domain.objects.SurgicalOpNotes.class;
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

	public ims.core.clinical.domain.objects.IntraOperativeCareRecord getIntraOperativeCareRecord() {
		return intraOperativeCareRecord;
	}
	public void setIntraOperativeCareRecord(ims.core.clinical.domain.objects.IntraOperativeCareRecord intraOperativeCareRecord) {
		this.intraOperativeCareRecord = intraOperativeCareRecord;
	}

	public String getPreOperativeDiagnosis() {
		return preOperativeDiagnosis;
	}
	public void setPreOperativeDiagnosis(String preOperativeDiagnosis) {
		if ( null != preOperativeDiagnosis && preOperativeDiagnosis.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for preOperativeDiagnosis. Tried to set value: "+
				preOperativeDiagnosis);
		}
		this.preOperativeDiagnosis = preOperativeDiagnosis;
	}

	public String getAntibiotics() {
		return antibiotics;
	}
	public void setAntibiotics(String antibiotics) {
		if ( null != antibiotics && antibiotics.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for antibiotics. Tried to set value: "+
				antibiotics);
		}
		this.antibiotics = antibiotics;
	}

	public String getVTE() {
		return vTE;
	}
	public void setVTE(String vTE) {
		if ( null != vTE && vTE.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for vTE. Tried to set value: "+
				vTE);
		}
		this.vTE = vTE;
	}

	public String getIncision() {
		return incision;
	}
	public void setIncision(String incision) {
		this.incision = incision;
	}

	public String getFindings() {
		return findings;
	}
	public void setFindings(String findings) {
		this.findings = findings;
	}

	public String getProcedure() {
		return procedure;
	}
	public void setProcedure(String procedure) {
		this.procedure = procedure;
	}

	public String getComplications() {
		return complications;
	}
	public void setComplications(String complications) {
		this.complications = complications;
	}

	public String getClosure() {
		return closure;
	}
	public void setClosure(String closure) {
		this.closure = closure;
	}

	public String getLAInfiltration() {
		return lAInfiltration;
	}
	public void setLAInfiltration(String lAInfiltration) {
		if ( null != lAInfiltration && lAInfiltration.length() > 2000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for lAInfiltration. Tried to set value: "+
				lAInfiltration);
		}
		this.lAInfiltration = lAInfiltration;
	}

	public String getPostOpInstructions() {
		return postOpInstructions;
	}
	public void setPostOpInstructions(String postOpInstructions) {
		this.postOpInstructions = postOpInstructions;
	}

	public String getEBI() {
		return eBI;
	}
	public void setEBI(String eBI) {
		if ( null != eBI && eBI.length() > 10 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for eBI. Tried to set value: "+
				eBI);
		}
		this.eBI = eBI;
	}

	public ims.domain.lookups.LookupInstance getFollowUpType() {
		return followUpType;
	}
	public void setFollowUpType(ims.domain.lookups.LookupInstance followUpType) {
		this.followUpType = followUpType;
	}

	public ims.domain.lookups.LookupInstance getFollowUpTypeIn() {
		return followUpTypeIn;
	}
	public void setFollowUpTypeIn(ims.domain.lookups.LookupInstance followUpTypeIn) {
		this.followUpTypeIn = followUpTypeIn;
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
		auditStr.append("\r\n*intraOperativeCareRecord* :");
		if (intraOperativeCareRecord != null)
		{
			auditStr.append(toShortClassName(intraOperativeCareRecord));
				
		    auditStr.append(intraOperativeCareRecord.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*preOperativeDiagnosis* :");
		auditStr.append(preOperativeDiagnosis);
	    auditStr.append("; ");
		auditStr.append("\r\n*antibiotics* :");
		auditStr.append(antibiotics);
	    auditStr.append("; ");
		auditStr.append("\r\n*vTE* :");
		auditStr.append(vTE);
	    auditStr.append("; ");
		auditStr.append("\r\n*incision* :");
		auditStr.append(incision);
	    auditStr.append("; ");
		auditStr.append("\r\n*findings* :");
		auditStr.append(findings);
	    auditStr.append("; ");
		auditStr.append("\r\n*procedure* :");
		auditStr.append(procedure);
	    auditStr.append("; ");
		auditStr.append("\r\n*complications* :");
		auditStr.append(complications);
	    auditStr.append("; ");
		auditStr.append("\r\n*closure* :");
		auditStr.append(closure);
	    auditStr.append("; ");
		auditStr.append("\r\n*lAInfiltration* :");
		auditStr.append(lAInfiltration);
	    auditStr.append("; ");
		auditStr.append("\r\n*postOpInstructions* :");
		auditStr.append(postOpInstructions);
	    auditStr.append("; ");
		auditStr.append("\r\n*eBI* :");
		auditStr.append(eBI);
	    auditStr.append("; ");
		auditStr.append("\r\n*followUpType* :");
		if (followUpType != null)
			auditStr.append(followUpType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*followUpTypeIn* :");
		if (followUpTypeIn != null)
			auditStr.append(followUpTypeIn.getText());
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
		
		String keyClassName = "SurgicalOpNotes";
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
		if (this.getIntraOperativeCareRecord() != null)
		{
			sb.append("<intraOperativeCareRecord>");
			sb.append(this.getIntraOperativeCareRecord().toXMLString(domMap)); 	
			sb.append("</intraOperativeCareRecord>");		
		}
		if (this.getPreOperativeDiagnosis() != null)
		{
			sb.append("<preOperativeDiagnosis>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPreOperativeDiagnosis().toString()));
			sb.append("</preOperativeDiagnosis>");		
		}
		if (this.getAntibiotics() != null)
		{
			sb.append("<antibiotics>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAntibiotics().toString()));
			sb.append("</antibiotics>");		
		}
		if (this.getVTE() != null)
		{
			sb.append("<vTE>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getVTE().toString()));
			sb.append("</vTE>");		
		}
		if (this.getIncision() != null)
		{
			sb.append("<incision>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getIncision().toString()));
			sb.append("</incision>");		
		}
		if (this.getFindings() != null)
		{
			sb.append("<findings>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFindings().toString()));
			sb.append("</findings>");		
		}
		if (this.getProcedure() != null)
		{
			sb.append("<procedure>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getProcedure().toString()));
			sb.append("</procedure>");		
		}
		if (this.getComplications() != null)
		{
			sb.append("<complications>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComplications().toString()));
			sb.append("</complications>");		
		}
		if (this.getClosure() != null)
		{
			sb.append("<closure>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getClosure().toString()));
			sb.append("</closure>");		
		}
		if (this.getLAInfiltration() != null)
		{
			sb.append("<lAInfiltration>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLAInfiltration().toString()));
			sb.append("</lAInfiltration>");		
		}
		if (this.getPostOpInstructions() != null)
		{
			sb.append("<postOpInstructions>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPostOpInstructions().toString()));
			sb.append("</postOpInstructions>");		
		}
		if (this.getEBI() != null)
		{
			sb.append("<eBI>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getEBI().toString()));
			sb.append("</eBI>");		
		}
		if (this.getFollowUpType() != null)
		{
			sb.append("<followUpType>");
			sb.append(this.getFollowUpType().toXMLString()); 
			sb.append("</followUpType>");		
		}
		if (this.getFollowUpTypeIn() != null)
		{
			sb.append("<followUpTypeIn>");
			sb.append(this.getFollowUpTypeIn().toXMLString()); 
			sb.append("</followUpTypeIn>");		
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
			SurgicalOpNotes domainObject = getSurgicalOpNotesfromXML(itemEl, factory, domMap);

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
			SurgicalOpNotes domainObject = getSurgicalOpNotesfromXML(itemEl, factory, domMap);

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
		
	public static SurgicalOpNotes getSurgicalOpNotesfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getSurgicalOpNotesfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static SurgicalOpNotes getSurgicalOpNotesfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!SurgicalOpNotes.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!SurgicalOpNotes.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the SurgicalOpNotes class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (SurgicalOpNotes)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(SurgicalOpNotes.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		SurgicalOpNotes ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (SurgicalOpNotes)factory.getImportedDomainObject(SurgicalOpNotes.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new SurgicalOpNotes();
		}
		String keyClassName = "SurgicalOpNotes";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (SurgicalOpNotes)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, SurgicalOpNotes obj, java.util.HashMap domMap) throws Exception
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
		fldEl = el.element("intraOperativeCareRecord");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setIntraOperativeCareRecord(ims.core.clinical.domain.objects.IntraOperativeCareRecord.getIntraOperativeCareRecordfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("preOperativeDiagnosis");
		if(fldEl != null)
		{	
    		obj.setPreOperativeDiagnosis(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("antibiotics");
		if(fldEl != null)
		{	
    		obj.setAntibiotics(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("vTE");
		if(fldEl != null)
		{	
    		obj.setVTE(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("incision");
		if(fldEl != null)
		{	
    		obj.setIncision(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("findings");
		if(fldEl != null)
		{	
    		obj.setFindings(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("procedure");
		if(fldEl != null)
		{	
    		obj.setProcedure(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("complications");
		if(fldEl != null)
		{	
    		obj.setComplications(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("closure");
		if(fldEl != null)
		{	
    		obj.setClosure(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("lAInfiltration");
		if(fldEl != null)
		{	
    		obj.setLAInfiltration(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("postOpInstructions");
		if(fldEl != null)
		{	
    		obj.setPostOpInstructions(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("eBI");
		if(fldEl != null)
		{	
    		obj.setEBI(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("followUpType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setFollowUpType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("followUpTypeIn");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setFollowUpTypeIn(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		public static final String CareContext = "careContext";
		public static final String AuthoringInformation = "authoringInformation";
		public static final String IntraOperativeCareRecord = "intraOperativeCareRecord";
		public static final String PreOperativeDiagnosis = "preOperativeDiagnosis";
		public static final String Antibiotics = "antibiotics";
		public static final String VTE = "vTE";
		public static final String Incision = "incision";
		public static final String Findings = "findings";
		public static final String Procedure = "procedure";
		public static final String Complications = "complications";
		public static final String Closure = "closure";
		public static final String LAInfiltration = "lAInfiltration";
		public static final String PostOpInstructions = "postOpInstructions";
		public static final String EBI = "eBI";
		public static final String FollowUpType = "followUpType";
		public static final String FollowUpTypeIn = "followUpTypeIn";
	}
}

