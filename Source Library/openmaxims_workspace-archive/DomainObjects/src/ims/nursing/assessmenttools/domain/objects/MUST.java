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
package ims.nursing.assessmenttools.domain.objects;

/**
 * 
 * @author Sinead McDermott
 * Generated.
 */


public class MUST extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1016100016;
	private static final long serialVersionUID = 1016100016L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Authoring Information */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** Clinical Contact */
	private ims.core.admin.domain.objects.ClinicalContact clinicalContact;
	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** Previous healthy weight */
	private java.lang.Float previousHealthyWeight;
	/** Acutely Ill */
	private Boolean acutelyIll;
	/** Action Taken */
	private String actionTaken;
	/** Weight Loss Reason */
	private String weightLossReason;
	/** Management */
	private ims.domain.lookups.LookupInstance management;
	/** VitalSign */
	private ims.core.vitals.domain.objects.VitalSigns vitalSign;
	/** Score  (calculated field) */
	private Integer bMIScore;
	/** Unplanned Weight Loss Score  (calculated field) */
	private Integer uWLScore;
	/** Acute Disease Efftect Score  (calculated field) */
	private Integer aDEScore;
	/** Overall Risk of Malnutrition Score  (calculated field) */
	private Integer oRMScore;
	/** Metrics record (only recorded  in CCO / where SHOW_VITAL_SIGNS_METRIC_CONTROLS is false) */
	private ims.core.vitals.domain.objects.Metrics metrics;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public MUST (Integer id, int ver)
    {
    	super(id, ver);
    }
    public MUST ()
    {
    	super();
    }
    public MUST (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.nursing.assessmenttools.domain.objects.MUST.class;
	}


	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
	}

	public ims.core.admin.domain.objects.ClinicalContact getClinicalContact() {
		return clinicalContact;
	}
	public void setClinicalContact(ims.core.admin.domain.objects.ClinicalContact clinicalContact) {
		this.clinicalContact = clinicalContact;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public java.lang.Float getPreviousHealthyWeight() {
		return previousHealthyWeight;
	}
	public void setPreviousHealthyWeight(java.lang.Float previousHealthyWeight) {
		this.previousHealthyWeight = previousHealthyWeight;
	}

	public Boolean isAcutelyIll() {
		return acutelyIll;
	}
	public void setAcutelyIll(Boolean acutelyIll) {
		this.acutelyIll = acutelyIll;
	}

	public String getActionTaken() {
		return actionTaken;
	}
	public void setActionTaken(String actionTaken) {
		if ( null != actionTaken && actionTaken.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for actionTaken. Tried to set value: "+
				actionTaken);
		}
		this.actionTaken = actionTaken;
	}

	public String getWeightLossReason() {
		return weightLossReason;
	}
	public void setWeightLossReason(String weightLossReason) {
		if ( null != weightLossReason && weightLossReason.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for weightLossReason. Tried to set value: "+
				weightLossReason);
		}
		this.weightLossReason = weightLossReason;
	}

	public ims.domain.lookups.LookupInstance getManagement() {
		return management;
	}
	public void setManagement(ims.domain.lookups.LookupInstance management) {
		this.management = management;
	}

	public ims.core.vitals.domain.objects.VitalSigns getVitalSign() {
		return vitalSign;
	}
	public void setVitalSign(ims.core.vitals.domain.objects.VitalSigns vitalSign) {
		this.vitalSign = vitalSign;
	}

	public Integer getBMIScore() {
		return bMIScore;
	}
	public void setBMIScore(Integer bMIScore) {
		this.bMIScore = bMIScore;
	}

	public Integer getUWLScore() {
		return uWLScore;
	}
	public void setUWLScore(Integer uWLScore) {
		this.uWLScore = uWLScore;
	}

	public Integer getADEScore() {
		return aDEScore;
	}
	public void setADEScore(Integer aDEScore) {
		this.aDEScore = aDEScore;
	}

	public Integer getORMScore() {
		return oRMScore;
	}
	public void setORMScore(Integer oRMScore) {
		this.oRMScore = oRMScore;
	}

	public ims.core.vitals.domain.objects.Metrics getMetrics() {
		return metrics;
	}
	public void setMetrics(ims.core.vitals.domain.objects.Metrics metrics) {
		this.metrics = metrics;
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
		
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalContact* :");
		if (clinicalContact != null)
		{
			auditStr.append(toShortClassName(clinicalContact));
				
		    auditStr.append(clinicalContact.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*previousHealthyWeight* :");
		auditStr.append(previousHealthyWeight);
	    auditStr.append("; ");
		auditStr.append("\r\n*acutelyIll* :");
		auditStr.append(acutelyIll);
	    auditStr.append("; ");
		auditStr.append("\r\n*actionTaken* :");
		auditStr.append(actionTaken);
	    auditStr.append("; ");
		auditStr.append("\r\n*weightLossReason* :");
		auditStr.append(weightLossReason);
	    auditStr.append("; ");
		auditStr.append("\r\n*management* :");
		if (management != null)
			auditStr.append(management.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*vitalSign* :");
		if (vitalSign != null)
		{
			auditStr.append(toShortClassName(vitalSign));
				
		    auditStr.append(vitalSign.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*bMIScore* :");
		auditStr.append(bMIScore);
	    auditStr.append("; ");
		auditStr.append("\r\n*uWLScore* :");
		auditStr.append(uWLScore);
	    auditStr.append("; ");
		auditStr.append("\r\n*aDEScore* :");
		auditStr.append(aDEScore);
	    auditStr.append("; ");
		auditStr.append("\r\n*oRMScore* :");
		auditStr.append(oRMScore);
	    auditStr.append("; ");
		auditStr.append("\r\n*metrics* :");
		if (metrics != null)
		{
			auditStr.append(toShortClassName(metrics));
				
		    auditStr.append(metrics.getId());
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
		
		String keyClassName = "MUST";
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
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
		}
		if (this.getClinicalContact() != null)
		{
			sb.append("<clinicalContact>");
			sb.append(this.getClinicalContact().toXMLString(domMap)); 	
			sb.append("</clinicalContact>");		
		}
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getPreviousHealthyWeight() != null)
		{
			sb.append("<previousHealthyWeight>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPreviousHealthyWeight().toString()));
			sb.append("</previousHealthyWeight>");		
		}
		if (this.isAcutelyIll() != null)
		{
			sb.append("<acutelyIll>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isAcutelyIll().toString()));
			sb.append("</acutelyIll>");		
		}
		if (this.getActionTaken() != null)
		{
			sb.append("<actionTaken>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getActionTaken().toString()));
			sb.append("</actionTaken>");		
		}
		if (this.getWeightLossReason() != null)
		{
			sb.append("<weightLossReason>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getWeightLossReason().toString()));
			sb.append("</weightLossReason>");		
		}
		if (this.getManagement() != null)
		{
			sb.append("<management>");
			sb.append(this.getManagement().toXMLString()); 
			sb.append("</management>");		
		}
		if (this.getVitalSign() != null)
		{
			sb.append("<vitalSign>");
			sb.append(this.getVitalSign().toXMLString(domMap)); 	
			sb.append("</vitalSign>");		
		}
		if (this.getBMIScore() != null)
		{
			sb.append("<bMIScore>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getBMIScore().toString()));
			sb.append("</bMIScore>");		
		}
		if (this.getUWLScore() != null)
		{
			sb.append("<uWLScore>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getUWLScore().toString()));
			sb.append("</uWLScore>");		
		}
		if (this.getADEScore() != null)
		{
			sb.append("<aDEScore>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getADEScore().toString()));
			sb.append("</aDEScore>");		
		}
		if (this.getORMScore() != null)
		{
			sb.append("<oRMScore>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getORMScore().toString()));
			sb.append("</oRMScore>");		
		}
		if (this.getMetrics() != null)
		{
			sb.append("<metrics>");
			sb.append(this.getMetrics().toXMLString(domMap)); 	
			sb.append("</metrics>");		
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
			MUST domainObject = getMUSTfromXML(itemEl, factory, domMap);

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
			MUST domainObject = getMUSTfromXML(itemEl, factory, domMap);

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
		
	public static MUST getMUSTfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getMUSTfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static MUST getMUSTfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!MUST.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!MUST.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the MUST class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (MUST)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(MUST.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		MUST ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (MUST)factory.getImportedDomainObject(MUST.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new MUST();
		}
		String keyClassName = "MUST";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (MUST)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, MUST obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("clinicalContact");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClinicalContact(ims.core.admin.domain.objects.ClinicalContact.getClinicalContactfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("previousHealthyWeight");
		if(fldEl != null)
		{	
    		obj.setPreviousHealthyWeight(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("acutelyIll");
		if(fldEl != null)
		{	
    		obj.setAcutelyIll(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("actionTaken");
		if(fldEl != null)
		{	
    		obj.setActionTaken(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("weightLossReason");
		if(fldEl != null)
		{	
    		obj.setWeightLossReason(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("management");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setManagement(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("vitalSign");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setVitalSign(ims.core.vitals.domain.objects.VitalSigns.getVitalSignsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("bMIScore");
		if(fldEl != null)
		{	
    		obj.setBMIScore(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("uWLScore");
		if(fldEl != null)
		{	
    		obj.setUWLScore(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("aDEScore");
		if(fldEl != null)
		{	
    		obj.setADEScore(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("oRMScore");
		if(fldEl != null)
		{	
    		obj.setORMScore(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("metrics");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setMetrics(ims.core.vitals.domain.objects.Metrics.getMetricsfromXML(fldEl, factory, domMap)); 
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
		public static final String AuthoringInformation = "authoringInformation";
		public static final String ClinicalContact = "clinicalContact";
		public static final String CareContext = "careContext";
		public static final String PreviousHealthyWeight = "previousHealthyWeight";
		public static final String AcutelyIll = "acutelyIll";
		public static final String ActionTaken = "actionTaken";
		public static final String WeightLossReason = "weightLossReason";
		public static final String Management = "management";
		public static final String VitalSign = "vitalSign";
		public static final String BMIScore = "bMIScore";
		public static final String UWLScore = "uWLScore";
		public static final String ADEScore = "aDEScore";
		public static final String ORMScore = "oRMScore";
		public static final String Metrics = "metrics";
	}
}

