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
package ims.core.clinical.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class DementiaAssessAndInvestigate extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1003100119;
	private static final long serialVersionUID = 1003100119L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** AuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** Q1 Age */
	private ims.domain.lookups.LookupInstance q1Age;
	/** Q1 DOB */
	private ims.domain.lookups.LookupInstance q2DOB;
	/** Q3 Current Year */
	private ims.domain.lookups.LookupInstance q3CurrentYear;
	/** Q4 Current Time */
	private ims.domain.lookups.LookupInstance q4CurrentTime;
	/** Q5 Name Of Hospital */
	private ims.domain.lookups.LookupInstance q5NameOfHospital;
	/** Q4 Recognise People */
	private ims.domain.lookups.LookupInstance q6RecognisePeople;
	/** Q7 Year WW2 Ended */
	private ims.domain.lookups.LookupInstance q7YearWW2Ended;
	/** Q8 Monarch */
	private ims.domain.lookups.LookupInstance q8Monarch;
	/** Q9 Count Backwards */
	private ims.domain.lookups.LookupInstance q9CountBackwards;
	/** Q10 Recall */
	private ims.domain.lookups.LookupInstance q10Recall;
	/** AMTS Total Score */
	private Integer aMTSScore;
	/** Confirm Trusts Protocol */
	private ims.domain.lookups.LookupInstance confirmTrustsProtocol;
	/** Confirm Medication Review */
	private ims.domain.lookups.LookupInstance confirmMedicationReview;
	/** Step Two Assess Note */
	private ims.core.clinical.domain.objects.DementiaAssessInvestigateNote stepTwoAssessNote;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public DementiaAssessAndInvestigate (Integer id, int ver)
    {
    	super(id, ver);
    }
    public DementiaAssessAndInvestigate ()
    {
    	super();
    }
    public DementiaAssessAndInvestigate (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.DementiaAssessAndInvestigate.class;
	}


	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
	}

	public ims.domain.lookups.LookupInstance getQ1Age() {
		return q1Age;
	}
	public void setQ1Age(ims.domain.lookups.LookupInstance q1Age) {
		this.q1Age = q1Age;
	}

	public ims.domain.lookups.LookupInstance getQ2DOB() {
		return q2DOB;
	}
	public void setQ2DOB(ims.domain.lookups.LookupInstance q2DOB) {
		this.q2DOB = q2DOB;
	}

	public ims.domain.lookups.LookupInstance getQ3CurrentYear() {
		return q3CurrentYear;
	}
	public void setQ3CurrentYear(ims.domain.lookups.LookupInstance q3CurrentYear) {
		this.q3CurrentYear = q3CurrentYear;
	}

	public ims.domain.lookups.LookupInstance getQ4CurrentTime() {
		return q4CurrentTime;
	}
	public void setQ4CurrentTime(ims.domain.lookups.LookupInstance q4CurrentTime) {
		this.q4CurrentTime = q4CurrentTime;
	}

	public ims.domain.lookups.LookupInstance getQ5NameOfHospital() {
		return q5NameOfHospital;
	}
	public void setQ5NameOfHospital(ims.domain.lookups.LookupInstance q5NameOfHospital) {
		this.q5NameOfHospital = q5NameOfHospital;
	}

	public ims.domain.lookups.LookupInstance getQ6RecognisePeople() {
		return q6RecognisePeople;
	}
	public void setQ6RecognisePeople(ims.domain.lookups.LookupInstance q6RecognisePeople) {
		this.q6RecognisePeople = q6RecognisePeople;
	}

	public ims.domain.lookups.LookupInstance getQ7YearWW2Ended() {
		return q7YearWW2Ended;
	}
	public void setQ7YearWW2Ended(ims.domain.lookups.LookupInstance q7YearWW2Ended) {
		this.q7YearWW2Ended = q7YearWW2Ended;
	}

	public ims.domain.lookups.LookupInstance getQ8Monarch() {
		return q8Monarch;
	}
	public void setQ8Monarch(ims.domain.lookups.LookupInstance q8Monarch) {
		this.q8Monarch = q8Monarch;
	}

	public ims.domain.lookups.LookupInstance getQ9CountBackwards() {
		return q9CountBackwards;
	}
	public void setQ9CountBackwards(ims.domain.lookups.LookupInstance q9CountBackwards) {
		this.q9CountBackwards = q9CountBackwards;
	}

	public ims.domain.lookups.LookupInstance getQ10Recall() {
		return q10Recall;
	}
	public void setQ10Recall(ims.domain.lookups.LookupInstance q10Recall) {
		this.q10Recall = q10Recall;
	}

	public Integer getAMTSScore() {
		return aMTSScore;
	}
	public void setAMTSScore(Integer aMTSScore) {
		this.aMTSScore = aMTSScore;
	}

	public ims.domain.lookups.LookupInstance getConfirmTrustsProtocol() {
		return confirmTrustsProtocol;
	}
	public void setConfirmTrustsProtocol(ims.domain.lookups.LookupInstance confirmTrustsProtocol) {
		this.confirmTrustsProtocol = confirmTrustsProtocol;
	}

	public ims.domain.lookups.LookupInstance getConfirmMedicationReview() {
		return confirmMedicationReview;
	}
	public void setConfirmMedicationReview(ims.domain.lookups.LookupInstance confirmMedicationReview) {
		this.confirmMedicationReview = confirmMedicationReview;
	}

	public ims.core.clinical.domain.objects.DementiaAssessInvestigateNote getStepTwoAssessNote() {
		return stepTwoAssessNote;
	}
	public void setStepTwoAssessNote(ims.core.clinical.domain.objects.DementiaAssessInvestigateNote stepTwoAssessNote) {
		this.stepTwoAssessNote = stepTwoAssessNote;
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
		auditStr.append("\r\n*q1Age* :");
		if (q1Age != null)
			auditStr.append(q1Age.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*q2DOB* :");
		if (q2DOB != null)
			auditStr.append(q2DOB.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*q3CurrentYear* :");
		if (q3CurrentYear != null)
			auditStr.append(q3CurrentYear.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*q4CurrentTime* :");
		if (q4CurrentTime != null)
			auditStr.append(q4CurrentTime.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*q5NameOfHospital* :");
		if (q5NameOfHospital != null)
			auditStr.append(q5NameOfHospital.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*q6RecognisePeople* :");
		if (q6RecognisePeople != null)
			auditStr.append(q6RecognisePeople.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*q7YearWW2Ended* :");
		if (q7YearWW2Ended != null)
			auditStr.append(q7YearWW2Ended.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*q8Monarch* :");
		if (q8Monarch != null)
			auditStr.append(q8Monarch.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*q9CountBackwards* :");
		if (q9CountBackwards != null)
			auditStr.append(q9CountBackwards.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*q10Recall* :");
		if (q10Recall != null)
			auditStr.append(q10Recall.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*aMTSScore* :");
		auditStr.append(aMTSScore);
	    auditStr.append("; ");
		auditStr.append("\r\n*confirmTrustsProtocol* :");
		if (confirmTrustsProtocol != null)
			auditStr.append(confirmTrustsProtocol.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*confirmMedicationReview* :");
		if (confirmMedicationReview != null)
			auditStr.append(confirmMedicationReview.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*stepTwoAssessNote* :");
		if (stepTwoAssessNote != null)
		{
			auditStr.append(toShortClassName(stepTwoAssessNote));
				
		    auditStr.append(stepTwoAssessNote.getId());
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
		
		String keyClassName = "DementiaAssessAndInvestigate";
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
		if (this.getQ1Age() != null)
		{
			sb.append("<q1Age>");
			sb.append(this.getQ1Age().toXMLString()); 
			sb.append("</q1Age>");		
		}
		if (this.getQ2DOB() != null)
		{
			sb.append("<q2DOB>");
			sb.append(this.getQ2DOB().toXMLString()); 
			sb.append("</q2DOB>");		
		}
		if (this.getQ3CurrentYear() != null)
		{
			sb.append("<q3CurrentYear>");
			sb.append(this.getQ3CurrentYear().toXMLString()); 
			sb.append("</q3CurrentYear>");		
		}
		if (this.getQ4CurrentTime() != null)
		{
			sb.append("<q4CurrentTime>");
			sb.append(this.getQ4CurrentTime().toXMLString()); 
			sb.append("</q4CurrentTime>");		
		}
		if (this.getQ5NameOfHospital() != null)
		{
			sb.append("<q5NameOfHospital>");
			sb.append(this.getQ5NameOfHospital().toXMLString()); 
			sb.append("</q5NameOfHospital>");		
		}
		if (this.getQ6RecognisePeople() != null)
		{
			sb.append("<q6RecognisePeople>");
			sb.append(this.getQ6RecognisePeople().toXMLString()); 
			sb.append("</q6RecognisePeople>");		
		}
		if (this.getQ7YearWW2Ended() != null)
		{
			sb.append("<q7YearWW2Ended>");
			sb.append(this.getQ7YearWW2Ended().toXMLString()); 
			sb.append("</q7YearWW2Ended>");		
		}
		if (this.getQ8Monarch() != null)
		{
			sb.append("<q8Monarch>");
			sb.append(this.getQ8Monarch().toXMLString()); 
			sb.append("</q8Monarch>");		
		}
		if (this.getQ9CountBackwards() != null)
		{
			sb.append("<q9CountBackwards>");
			sb.append(this.getQ9CountBackwards().toXMLString()); 
			sb.append("</q9CountBackwards>");		
		}
		if (this.getQ10Recall() != null)
		{
			sb.append("<q10Recall>");
			sb.append(this.getQ10Recall().toXMLString()); 
			sb.append("</q10Recall>");		
		}
		if (this.getAMTSScore() != null)
		{
			sb.append("<aMTSScore>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAMTSScore().toString()));
			sb.append("</aMTSScore>");		
		}
		if (this.getConfirmTrustsProtocol() != null)
		{
			sb.append("<confirmTrustsProtocol>");
			sb.append(this.getConfirmTrustsProtocol().toXMLString()); 
			sb.append("</confirmTrustsProtocol>");		
		}
		if (this.getConfirmMedicationReview() != null)
		{
			sb.append("<confirmMedicationReview>");
			sb.append(this.getConfirmMedicationReview().toXMLString()); 
			sb.append("</confirmMedicationReview>");		
		}
		if (this.getStepTwoAssessNote() != null)
		{
			sb.append("<stepTwoAssessNote>");
			sb.append(this.getStepTwoAssessNote().toXMLString(domMap)); 	
			sb.append("</stepTwoAssessNote>");		
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
			DementiaAssessAndInvestigate domainObject = getDementiaAssessAndInvestigatefromXML(itemEl, factory, domMap);

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
			DementiaAssessAndInvestigate domainObject = getDementiaAssessAndInvestigatefromXML(itemEl, factory, domMap);

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
		
	public static DementiaAssessAndInvestigate getDementiaAssessAndInvestigatefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getDementiaAssessAndInvestigatefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static DementiaAssessAndInvestigate getDementiaAssessAndInvestigatefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!DementiaAssessAndInvestigate.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!DementiaAssessAndInvestigate.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the DementiaAssessAndInvestigate class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (DementiaAssessAndInvestigate)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(DementiaAssessAndInvestigate.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		DementiaAssessAndInvestigate ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (DementiaAssessAndInvestigate)factory.getImportedDomainObject(DementiaAssessAndInvestigate.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new DementiaAssessAndInvestigate();
		}
		String keyClassName = "DementiaAssessAndInvestigate";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (DementiaAssessAndInvestigate)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, DementiaAssessAndInvestigate obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("q1Age");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setQ1Age(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("q2DOB");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setQ2DOB(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("q3CurrentYear");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setQ3CurrentYear(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("q4CurrentTime");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setQ4CurrentTime(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("q5NameOfHospital");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setQ5NameOfHospital(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("q6RecognisePeople");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setQ6RecognisePeople(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("q7YearWW2Ended");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setQ7YearWW2Ended(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("q8Monarch");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setQ8Monarch(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("q9CountBackwards");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setQ9CountBackwards(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("q10Recall");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setQ10Recall(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("aMTSScore");
		if(fldEl != null)
		{	
    		obj.setAMTSScore(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("confirmTrustsProtocol");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setConfirmTrustsProtocol(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("confirmMedicationReview");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setConfirmMedicationReview(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("stepTwoAssessNote");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setStepTwoAssessNote(ims.core.clinical.domain.objects.DementiaAssessInvestigateNote.getDementiaAssessInvestigateNotefromXML(fldEl, factory, domMap)); 
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
		public static final String Q1Age = "q1Age";
		public static final String Q2DOB = "q2DOB";
		public static final String Q3CurrentYear = "q3CurrentYear";
		public static final String Q4CurrentTime = "q4CurrentTime";
		public static final String Q5NameOfHospital = "q5NameOfHospital";
		public static final String Q6RecognisePeople = "q6RecognisePeople";
		public static final String Q7YearWW2Ended = "q7YearWW2Ended";
		public static final String Q8Monarch = "q8Monarch";
		public static final String Q9CountBackwards = "q9CountBackwards";
		public static final String Q10Recall = "q10Recall";
		public static final String AMTSScore = "aMTSScore";
		public static final String ConfirmTrustsProtocol = "confirmTrustsProtocol";
		public static final String ConfirmMedicationReview = "confirmMedicationReview";
		public static final String StepTwoAssessNote = "stepTwoAssessNote";
	}
}

