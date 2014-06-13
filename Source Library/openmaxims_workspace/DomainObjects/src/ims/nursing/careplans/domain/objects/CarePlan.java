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
package ims.nursing.careplans.domain.objects;

/**
 * 
 * @author Sinead McDermott
 * Generated.
 */


public class CarePlan extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1010100003;
	private static final long serialVersionUID = 1010100003L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private String title;
	private String objective;
	/** 
	  * Collection of ims.nursing.careplans.domain.objects.CarePlanIntervention.
	  */
	private java.util.Set interventions;
	/** Mandatory field for COE */
	private java.util.Date nextEvaluationDate;
	/** Not required for COE, Mandatory for Middlesbrough */
	private String nextEvaluationTime;
	private ims.core.resource.people.domain.objects.Hcp confirmedBy;
	private java.util.Date confirmedDateTime;
	/** COE only
	  * Collection of ims.nursing.careplans.domain.objects.CarePlanReview.
	  */
	private java.util.Set reviews;
	private ims.nursing.careplans.domain.objects.CarePlanTemplate template;
	private ims.nursing.assessment.domain.objects.AssessmentComponent assessmentComponent;
	private java.util.Date lastReviewedDate;
	private ims.core.resource.people.domain.objects.Hcp lastReviewedBy;
	/** Care Plan Status History
	  * Collection of ims.nursing.careplans.domain.objects.CarePlanStatus.
	  */
	private java.util.Set carePlanStatus;
	/** Current Care Plan Status */
	private ims.nursing.careplans.domain.objects.CarePlanStatus currentCarePlanStatus;
	/** Clinical Contact */
	private ims.core.admin.domain.objects.ClinicalContact clinicalContact;
	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** RecordingInformation */
	private ims.core.clinical.domain.objects.RecordingUserInformation recordingInformation;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public CarePlan (Integer id, int ver)
    {
    	super(id, ver);
    }
    public CarePlan ()
    {
    	super();
    }
    public CarePlan (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.nursing.careplans.domain.objects.CarePlan.class;
	}


	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		if ( null != title && title.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for title. Tried to set value: "+
				title);
		}
		this.title = title;
	}

	public String getObjective() {
		return objective;
	}
	public void setObjective(String objective) {
		if ( null != objective && objective.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for objective. Tried to set value: "+
				objective);
		}
		this.objective = objective;
	}

	public java.util.Set getInterventions() {
		if ( null == interventions ) {
			interventions = new java.util.HashSet();
		}
		return interventions;
	}
	public void setInterventions(java.util.Set paramValue) {
		this.interventions = paramValue;
	}

	public java.util.Date getNextEvaluationDate() {
		return nextEvaluationDate;
	}
	public void setNextEvaluationDate(java.util.Date nextEvaluationDate) {
		this.nextEvaluationDate = nextEvaluationDate;
	}

	public String getNextEvaluationTime() {
		return nextEvaluationTime;
	}
	public void setNextEvaluationTime(String nextEvaluationTime) {
		this.nextEvaluationTime = nextEvaluationTime;
	}

	public ims.core.resource.people.domain.objects.Hcp getConfirmedBy() {
		return confirmedBy;
	}
	public void setConfirmedBy(ims.core.resource.people.domain.objects.Hcp confirmedBy) {
		this.confirmedBy = confirmedBy;
	}

	public java.util.Date getConfirmedDateTime() {
		return confirmedDateTime;
	}
	public void setConfirmedDateTime(java.util.Date confirmedDateTime) {
		this.confirmedDateTime = confirmedDateTime;
	}

	public java.util.Set getReviews() {
		if ( null == reviews ) {
			reviews = new java.util.HashSet();
		}
		return reviews;
	}
	public void setReviews(java.util.Set paramValue) {
		this.reviews = paramValue;
	}

	public ims.nursing.careplans.domain.objects.CarePlanTemplate getTemplate() {
		return template;
	}
	public void setTemplate(ims.nursing.careplans.domain.objects.CarePlanTemplate template) {
		this.template = template;
	}

	public ims.nursing.assessment.domain.objects.AssessmentComponent getAssessmentComponent() {
		return assessmentComponent;
	}
	public void setAssessmentComponent(ims.nursing.assessment.domain.objects.AssessmentComponent assessmentComponent) {
		this.assessmentComponent = assessmentComponent;
	}

	public java.util.Date getLastReviewedDate() {
		return lastReviewedDate;
	}
	public void setLastReviewedDate(java.util.Date lastReviewedDate) {
		this.lastReviewedDate = lastReviewedDate;
	}

	public ims.core.resource.people.domain.objects.Hcp getLastReviewedBy() {
		return lastReviewedBy;
	}
	public void setLastReviewedBy(ims.core.resource.people.domain.objects.Hcp lastReviewedBy) {
		this.lastReviewedBy = lastReviewedBy;
	}

	public java.util.Set getCarePlanStatus() {
		if ( null == carePlanStatus ) {
			carePlanStatus = new java.util.HashSet();
		}
		return carePlanStatus;
	}
	public void setCarePlanStatus(java.util.Set paramValue) {
		this.carePlanStatus = paramValue;
	}

	public ims.nursing.careplans.domain.objects.CarePlanStatus getCurrentCarePlanStatus() {
		return currentCarePlanStatus;
	}
	public void setCurrentCarePlanStatus(ims.nursing.careplans.domain.objects.CarePlanStatus currentCarePlanStatus) {
		this.currentCarePlanStatus = currentCarePlanStatus;
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

	public ims.core.clinical.domain.objects.RecordingUserInformation getRecordingInformation() {
		return recordingInformation;
	}
	public void setRecordingInformation(ims.core.clinical.domain.objects.RecordingUserInformation recordingInformation) {
		this.recordingInformation = recordingInformation;
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
		
		auditStr.append("\r\n*title* :");
		auditStr.append(title);
	    auditStr.append("; ");
		auditStr.append("\r\n*objective* :");
		auditStr.append(objective);
	    auditStr.append("; ");
		auditStr.append("\r\n*interventions* :");
		if (interventions != null)
		{
			java.util.Iterator it3 = interventions.iterator();
			int i3=0;
			while (it3.hasNext())
			{
				if (i3 > 0)
					auditStr.append(",");
				ims.nursing.careplans.domain.objects.CarePlanIntervention obj = (ims.nursing.careplans.domain.objects.CarePlanIntervention)it3.next();
		if (obj != null)
		{
		   if (i3 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i3++;
		}
		if (i3 > 0)
			auditStr.append("] " + i3);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*nextEvaluationDate* :");
		auditStr.append(nextEvaluationDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*nextEvaluationTime* :");
		auditStr.append(nextEvaluationTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*confirmedBy* :");
		if (confirmedBy != null)
		{
			auditStr.append(toShortClassName(confirmedBy));
				
		    auditStr.append(confirmedBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*confirmedDateTime* :");
		auditStr.append(confirmedDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*reviews* :");
		if (reviews != null)
		{
			java.util.Iterator it8 = reviews.iterator();
			int i8=0;
			while (it8.hasNext())
			{
				if (i8 > 0)
					auditStr.append(",");
				ims.nursing.careplans.domain.objects.CarePlanReview obj = (ims.nursing.careplans.domain.objects.CarePlanReview)it8.next();
		if (obj != null)
		{
		   if (i8 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i8++;
		}
		if (i8 > 0)
			auditStr.append("] " + i8);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*template* :");
		if (template != null)
		{
			auditStr.append(toShortClassName(template));
				
		    auditStr.append(template.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*assessmentComponent* :");
		if (assessmentComponent != null)
		{
			auditStr.append(toShortClassName(assessmentComponent));
				
		    auditStr.append(assessmentComponent.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*lastReviewedDate* :");
		auditStr.append(lastReviewedDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*lastReviewedBy* :");
		if (lastReviewedBy != null)
		{
			auditStr.append(toShortClassName(lastReviewedBy));
				
		    auditStr.append(lastReviewedBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*carePlanStatus* :");
		if (carePlanStatus != null)
		{
			java.util.Iterator it13 = carePlanStatus.iterator();
			int i13=0;
			while (it13.hasNext())
			{
				if (i13 > 0)
					auditStr.append(",");
				ims.nursing.careplans.domain.objects.CarePlanStatus obj = (ims.nursing.careplans.domain.objects.CarePlanStatus)it13.next();
		if (obj != null)
		{
		   if (i13 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i13++;
		}
		if (i13 > 0)
			auditStr.append("] " + i13);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*currentCarePlanStatus* :");
		if (currentCarePlanStatus != null)
		{
			auditStr.append(toShortClassName(currentCarePlanStatus));
				
		    auditStr.append(currentCarePlanStatus.getId());
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
		auditStr.append("\r\n*recordingInformation* :");
		if (recordingInformation != null)
		{
			auditStr.append(toShortClassName(recordingInformation));
				
		    auditStr.append(recordingInformation.toString());
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
		
		String keyClassName = "CarePlan";
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
		if (this.getTitle() != null)
		{
			sb.append("<title>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTitle().toString()));
			sb.append("</title>");		
		}
		if (this.getObjective() != null)
		{
			sb.append("<objective>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getObjective().toString()));
			sb.append("</objective>");		
		}
		if (this.getInterventions() != null)
		{
			if (this.getInterventions().size() > 0 )
			{
			sb.append("<interventions>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getInterventions(), domMap));
			sb.append("</interventions>");		
			}
		}
		if (this.getNextEvaluationDate() != null)
		{
			sb.append("<nextEvaluationDate>");
			sb.append(new ims.framework.utils.DateTime(this.getNextEvaluationDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</nextEvaluationDate>");		
		}
		if (this.getNextEvaluationTime() != null)
		{
			sb.append("<nextEvaluationTime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNextEvaluationTime().toString()));
			sb.append("</nextEvaluationTime>");		
		}
		if (this.getConfirmedBy() != null)
		{
			sb.append("<confirmedBy>");
			sb.append(this.getConfirmedBy().toXMLString(domMap)); 	
			sb.append("</confirmedBy>");		
		}
		if (this.getConfirmedDateTime() != null)
		{
			sb.append("<confirmedDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getConfirmedDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</confirmedDateTime>");		
		}
		if (this.getReviews() != null)
		{
			if (this.getReviews().size() > 0 )
			{
			sb.append("<reviews>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getReviews(), domMap));
			sb.append("</reviews>");		
			}
		}
		if (this.getTemplate() != null)
		{
			sb.append("<template>");
			sb.append(this.getTemplate().toXMLString(domMap)); 	
			sb.append("</template>");		
		}
		if (this.getAssessmentComponent() != null)
		{
			sb.append("<assessmentComponent>");
			sb.append(this.getAssessmentComponent().toXMLString(domMap)); 	
			sb.append("</assessmentComponent>");		
		}
		if (this.getLastReviewedDate() != null)
		{
			sb.append("<lastReviewedDate>");
			sb.append(new ims.framework.utils.DateTime(this.getLastReviewedDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</lastReviewedDate>");		
		}
		if (this.getLastReviewedBy() != null)
		{
			sb.append("<lastReviewedBy>");
			sb.append(this.getLastReviewedBy().toXMLString(domMap)); 	
			sb.append("</lastReviewedBy>");		
		}
		if (this.getCarePlanStatus() != null)
		{
			if (this.getCarePlanStatus().size() > 0 )
			{
			sb.append("<carePlanStatus>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getCarePlanStatus(), domMap));
			sb.append("</carePlanStatus>");		
			}
		}
		if (this.getCurrentCarePlanStatus() != null)
		{
			sb.append("<currentCarePlanStatus>");
			sb.append(this.getCurrentCarePlanStatus().toXMLString(domMap)); 	
			sb.append("</currentCarePlanStatus>");		
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
		if (this.getRecordingInformation() != null)
		{
			sb.append("<recordingInformation>");
			sb.append(this.getRecordingInformation().toXMLString(domMap)); 	
			sb.append("</recordingInformation>");		
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
			CarePlan domainObject = getCarePlanfromXML(itemEl, factory, domMap);

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
			CarePlan domainObject = getCarePlanfromXML(itemEl, factory, domMap);

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
		
	public static CarePlan getCarePlanfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getCarePlanfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static CarePlan getCarePlanfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!CarePlan.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!CarePlan.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the CarePlan class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (CarePlan)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(CarePlan.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		CarePlan ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (CarePlan)factory.getImportedDomainObject(CarePlan.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new CarePlan();
		}
		String keyClassName = "CarePlan";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (CarePlan)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, CarePlan obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("title");
		if(fldEl != null)
		{	
    		obj.setTitle(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("objective");
		if(fldEl != null)
		{	
    		obj.setObjective(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("interventions");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setInterventions(ims.nursing.careplans.domain.objects.CarePlanIntervention.fromSetXMLString(fldEl, factory, obj.getInterventions(), domMap));
		}
		fldEl = el.element("nextEvaluationDate");
		if(fldEl != null)
		{	
    		obj.setNextEvaluationDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("nextEvaluationTime");
		if(fldEl != null)
		{	
    		obj.setNextEvaluationTime(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("confirmedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setConfirmedBy(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("confirmedDateTime");
		if(fldEl != null)
		{	
    		obj.setConfirmedDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("reviews");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setReviews(ims.nursing.careplans.domain.objects.CarePlanReview.fromSetXMLString(fldEl, factory, obj.getReviews(), domMap));
		}
		fldEl = el.element("template");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTemplate(ims.nursing.careplans.domain.objects.CarePlanTemplate.getCarePlanTemplatefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("assessmentComponent");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAssessmentComponent(ims.nursing.assessment.domain.objects.AssessmentComponent.getAssessmentComponentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("lastReviewedDate");
		if(fldEl != null)
		{	
    		obj.setLastReviewedDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("lastReviewedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setLastReviewedBy(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("carePlanStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setCarePlanStatus(ims.nursing.careplans.domain.objects.CarePlanStatus.fromSetXMLString(fldEl, factory, obj.getCarePlanStatus(), domMap));
		}
		fldEl = el.element("currentCarePlanStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentCarePlanStatus(ims.nursing.careplans.domain.objects.CarePlanStatus.getCarePlanStatusfromXML(fldEl, factory, domMap)); 
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
		fldEl = el.element("recordingInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRecordingInformation(ims.core.clinical.domain.objects.RecordingUserInformation.getRecordingUserInformationfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "interventions"
		, "reviews"
		, "carePlanStatus"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Title = "title";
		public static final String Objective = "objective";
		public static final String Interventions = "interventions";
		public static final String NextEvaluationDate = "nextEvaluationDate";
		public static final String NextEvaluationTime = "nextEvaluationTime";
		public static final String ConfirmedBy = "confirmedBy";
		public static final String ConfirmedDateTime = "confirmedDateTime";
		public static final String Reviews = "reviews";
		public static final String Template = "template";
		public static final String AssessmentComponent = "assessmentComponent";
		public static final String LastReviewedDate = "lastReviewedDate";
		public static final String LastReviewedBy = "lastReviewedBy";
		public static final String CarePlanStatus = "carePlanStatus";
		public static final String CurrentCarePlanStatus = "currentCarePlanStatus";
		public static final String ClinicalContact = "clinicalContact";
		public static final String CareContext = "careContext";
		public static final String RecordingInformation = "recordingInformation";
	}
}

