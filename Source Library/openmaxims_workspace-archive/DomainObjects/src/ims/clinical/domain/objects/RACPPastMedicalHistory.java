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
package ims.clinical.domain.objects;

/**
 * 
 * @author Joan Heelan
 * Generated.
 */


public class RACPPastMedicalHistory extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100075;
	private static final long serialVersionUID = 1072100075L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** PMH Flag (True = None) */
	private Boolean pMHFlag;
	/** PMH - Relevant Diagnosis
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List relevantDiagnosis;
	/** PMH Notes */
	private String pMHNotes;
	/** Vital Signs - BP */
	private ims.core.vitals.domain.objects.Bloodpressure vSBP;
	/** Vital Signs - Heart Rate */
	private ims.core.vitals.domain.objects.Pulse vSPulse;
	/** Height Weight */
	private ims.core.vitals.domain.objects.Metrics heightWeight;
	/** Exam Findings
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List examFindings;
	/** Exam Notes */
	private String examNotes;
	/** ECG Findings
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List eCGFindings;
	/** ECG Notes */
	private String eCGNotes;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public RACPPastMedicalHistory (Integer id, int ver)
    {
    	super(id, ver);
    }
    public RACPPastMedicalHistory ()
    {
    	super();
    }
    public RACPPastMedicalHistory (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.domain.objects.RACPPastMedicalHistory.class;
	}


	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public Boolean isPMHFlag() {
		return pMHFlag;
	}
	public void setPMHFlag(Boolean pMHFlag) {
		this.pMHFlag = pMHFlag;
	}

	public java.util.List getRelevantDiagnosis() {
		if ( null == relevantDiagnosis ) {
			relevantDiagnosis = new java.util.ArrayList();
		}
		return relevantDiagnosis;
	}
	public void setRelevantDiagnosis(java.util.List paramValue) {
		this.relevantDiagnosis = paramValue;
	}

	public String getPMHNotes() {
		return pMHNotes;
	}
	public void setPMHNotes(String pMHNotes) {
		if ( null != pMHNotes && pMHNotes.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for pMHNotes. Tried to set value: "+
				pMHNotes);
		}
		this.pMHNotes = pMHNotes;
	}

	public ims.core.vitals.domain.objects.Bloodpressure getVSBP() {
		return vSBP;
	}
	public void setVSBP(ims.core.vitals.domain.objects.Bloodpressure vSBP) {
		this.vSBP = vSBP;
	}

	public ims.core.vitals.domain.objects.Pulse getVSPulse() {
		return vSPulse;
	}
	public void setVSPulse(ims.core.vitals.domain.objects.Pulse vSPulse) {
		this.vSPulse = vSPulse;
	}

	public ims.core.vitals.domain.objects.Metrics getHeightWeight() {
		return heightWeight;
	}
	public void setHeightWeight(ims.core.vitals.domain.objects.Metrics heightWeight) {
		this.heightWeight = heightWeight;
	}

	public java.util.List getExamFindings() {
		if ( null == examFindings ) {
			examFindings = new java.util.ArrayList();
		}
		return examFindings;
	}
	public void setExamFindings(java.util.List paramValue) {
		this.examFindings = paramValue;
	}

	public String getExamNotes() {
		return examNotes;
	}
	public void setExamNotes(String examNotes) {
		if ( null != examNotes && examNotes.length() > 1500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for examNotes. Tried to set value: "+
				examNotes);
		}
		this.examNotes = examNotes;
	}

	public java.util.List getECGFindings() {
		if ( null == eCGFindings ) {
			eCGFindings = new java.util.ArrayList();
		}
		return eCGFindings;
	}
	public void setECGFindings(java.util.List paramValue) {
		this.eCGFindings = paramValue;
	}

	public String getECGNotes() {
		return eCGNotes;
	}
	public void setECGNotes(String eCGNotes) {
		if ( null != eCGNotes && eCGNotes.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for eCGNotes. Tried to set value: "+
				eCGNotes);
		}
		this.eCGNotes = eCGNotes;
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
		auditStr.append("\r\n*pMHFlag* :");
		auditStr.append(pMHFlag);
	    auditStr.append("; ");
		auditStr.append("\r\n*relevantDiagnosis* :");
		if (relevantDiagnosis != null)
		{
			java.util.Iterator it3 = relevantDiagnosis.iterator();
			int i3=0;
			while (it3.hasNext())
			{
				if (i3 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it3.next();
			auditStr.append(obj.getText());
			i3++;
		}
		if (i3 > 0)
			auditStr.append("] " + i3);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*pMHNotes* :");
		auditStr.append(pMHNotes);
	    auditStr.append("; ");
		auditStr.append("\r\n*vSBP* :");
		if (vSBP != null)
		{
			auditStr.append(toShortClassName(vSBP));
				
		    auditStr.append(vSBP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*vSPulse* :");
		if (vSPulse != null)
		{
			auditStr.append(toShortClassName(vSPulse));
				
		    auditStr.append(vSPulse.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*heightWeight* :");
		if (heightWeight != null)
		{
			auditStr.append(toShortClassName(heightWeight));
				
		    auditStr.append(heightWeight.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*examFindings* :");
		if (examFindings != null)
		{
			java.util.Iterator it8 = examFindings.iterator();
			int i8=0;
			while (it8.hasNext())
			{
				if (i8 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it8.next();
			auditStr.append(obj.getText());
			i8++;
		}
		if (i8 > 0)
			auditStr.append("] " + i8);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*examNotes* :");
		auditStr.append(examNotes);
	    auditStr.append("; ");
		auditStr.append("\r\n*eCGFindings* :");
		if (eCGFindings != null)
		{
			java.util.Iterator it10 = eCGFindings.iterator();
			int i10=0;
			while (it10.hasNext())
			{
				if (i10 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it10.next();
			auditStr.append(obj.getText());
			i10++;
		}
		if (i10 > 0)
			auditStr.append("] " + i10);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*eCGNotes* :");
		auditStr.append(eCGNotes);
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
		
		String keyClassName = "RACPPastMedicalHistory";
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
		if (this.isPMHFlag() != null)
		{
			sb.append("<pMHFlag>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isPMHFlag().toString()));
			sb.append("</pMHFlag>");		
		}
		if (this.getRelevantDiagnosis() != null)
		{
			if (this.getRelevantDiagnosis().size() > 0 )
			{
			sb.append("<relevantDiagnosis>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getRelevantDiagnosis())); 
			sb.append("</relevantDiagnosis>");		
			}
		}
		if (this.getPMHNotes() != null)
		{
			sb.append("<pMHNotes>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPMHNotes().toString()));
			sb.append("</pMHNotes>");		
		}
		if (this.getVSBP() != null)
		{
			sb.append("<vSBP>");
			sb.append(this.getVSBP().toXMLString(domMap)); 	
			sb.append("</vSBP>");		
		}
		if (this.getVSPulse() != null)
		{
			sb.append("<vSPulse>");
			sb.append(this.getVSPulse().toXMLString(domMap)); 	
			sb.append("</vSPulse>");		
		}
		if (this.getHeightWeight() != null)
		{
			sb.append("<heightWeight>");
			sb.append(this.getHeightWeight().toXMLString(domMap)); 	
			sb.append("</heightWeight>");		
		}
		if (this.getExamFindings() != null)
		{
			if (this.getExamFindings().size() > 0 )
			{
			sb.append("<examFindings>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getExamFindings())); 
			sb.append("</examFindings>");		
			}
		}
		if (this.getExamNotes() != null)
		{
			sb.append("<examNotes>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getExamNotes().toString()));
			sb.append("</examNotes>");		
		}
		if (this.getECGFindings() != null)
		{
			if (this.getECGFindings().size() > 0 )
			{
			sb.append("<eCGFindings>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getECGFindings())); 
			sb.append("</eCGFindings>");		
			}
		}
		if (this.getECGNotes() != null)
		{
			sb.append("<eCGNotes>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getECGNotes().toString()));
			sb.append("</eCGNotes>");		
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
			RACPPastMedicalHistory domainObject = getRACPPastMedicalHistoryfromXML(itemEl, factory, domMap);

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
			RACPPastMedicalHistory domainObject = getRACPPastMedicalHistoryfromXML(itemEl, factory, domMap);

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
		
	public static RACPPastMedicalHistory getRACPPastMedicalHistoryfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getRACPPastMedicalHistoryfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static RACPPastMedicalHistory getRACPPastMedicalHistoryfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!RACPPastMedicalHistory.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!RACPPastMedicalHistory.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the RACPPastMedicalHistory class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (RACPPastMedicalHistory)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(RACPPastMedicalHistory.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		RACPPastMedicalHistory ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (RACPPastMedicalHistory)factory.getImportedDomainObject(RACPPastMedicalHistory.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new RACPPastMedicalHistory();
		}
		String keyClassName = "RACPPastMedicalHistory";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (RACPPastMedicalHistory)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, RACPPastMedicalHistory obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("pMHFlag");
		if(fldEl != null)
		{	
    		obj.setPMHFlag(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("relevantDiagnosis");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setRelevantDiagnosis(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getRelevantDiagnosis())); 
		}
		fldEl = el.element("pMHNotes");
		if(fldEl != null)
		{	
    		obj.setPMHNotes(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("vSBP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setVSBP(ims.core.vitals.domain.objects.Bloodpressure.getBloodpressurefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("vSPulse");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setVSPulse(ims.core.vitals.domain.objects.Pulse.getPulsefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("heightWeight");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setHeightWeight(ims.core.vitals.domain.objects.Metrics.getMetricsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("examFindings");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setExamFindings(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getExamFindings())); 
		}
		fldEl = el.element("examNotes");
		if(fldEl != null)
		{	
    		obj.setExamNotes(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("eCGFindings");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setECGFindings(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getECGFindings())); 
		}
		fldEl = el.element("eCGNotes");
		if(fldEl != null)
		{	
    		obj.setECGNotes(new String(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "relevantDiagnosis"
		, "examFindings"
		, "eCGFindings"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String CareContext = "careContext";
		public static final String PMHFlag = "pMHFlag";
		public static final String RelevantDiagnosis = "relevantDiagnosis";
		public static final String PMHNotes = "pMHNotes";
		public static final String VSBP = "vSBP";
		public static final String VSPulse = "vSPulse";
		public static final String HeightWeight = "heightWeight";
		public static final String ExamFindings = "examFindings";
		public static final String ExamNotes = "examNotes";
		public static final String ECGFindings = "eCGFindings";
		public static final String ECGNotes = "eCGNotes";
	}
}

