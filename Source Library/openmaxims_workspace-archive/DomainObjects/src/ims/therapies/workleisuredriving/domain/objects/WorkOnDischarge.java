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
package ims.therapies.workleisuredriving.domain.objects;

/**
 * 
 * @author Joan Heelan
 * Generated.
 */


public class WorkOnDischarge extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1019100079;
	private static final long serialVersionUID = 1019100079L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** Authoring DateTime */
	private java.util.Date authoringDateTime;
	/** AuthoringCP */
	private ims.core.resource.people.domain.objects.Hcp authoringCP;
	/** Position On Discharge */
	private String positionOnDischarge;
	/** Return To Work Date */
	private java.util.Date returnToWorkDate;
	/** Job Position */
	private String jobPosition;
	/** Hours */
	private String hours;
	/** Reasons For Not Returning To Work */
	private String reasonForNotReturning;
	/** Career Advice */
	private String careerAdvice;
	/** Occupational Psychologist Advice */
	private String occupationalPsychologist;
	/** Higher Education Advice */
	private String higherEducation;
	/** Retraining Advice */
	private String retraining;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public WorkOnDischarge (Integer id, int ver)
    {
    	super(id, ver);
    }
    public WorkOnDischarge ()
    {
    	super();
    }
    public WorkOnDischarge (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.therapies.workleisuredriving.domain.objects.WorkOnDischarge.class;
	}


	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public java.util.Date getAuthoringDateTime() {
		return authoringDateTime;
	}
	public void setAuthoringDateTime(java.util.Date authoringDateTime) {
		this.authoringDateTime = authoringDateTime;
	}

	public ims.core.resource.people.domain.objects.Hcp getAuthoringCP() {
		return authoringCP;
	}
	public void setAuthoringCP(ims.core.resource.people.domain.objects.Hcp authoringCP) {
		this.authoringCP = authoringCP;
	}

	public String getPositionOnDischarge() {
		return positionOnDischarge;
	}
	public void setPositionOnDischarge(String positionOnDischarge) {
		if ( null != positionOnDischarge && positionOnDischarge.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for positionOnDischarge. Tried to set value: "+
				positionOnDischarge);
		}
		this.positionOnDischarge = positionOnDischarge;
	}

	public java.util.Date getReturnToWorkDate() {
		return returnToWorkDate;
	}
	public void setReturnToWorkDate(java.util.Date returnToWorkDate) {
		this.returnToWorkDate = returnToWorkDate;
	}

	public String getJobPosition() {
		return jobPosition;
	}
	public void setJobPosition(String jobPosition) {
		if ( null != jobPosition && jobPosition.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for jobPosition. Tried to set value: "+
				jobPosition);
		}
		this.jobPosition = jobPosition;
	}

	public String getHours() {
		return hours;
	}
	public void setHours(String hours) {
		if ( null != hours && hours.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for hours. Tried to set value: "+
				hours);
		}
		this.hours = hours;
	}

	public String getReasonForNotReturning() {
		return reasonForNotReturning;
	}
	public void setReasonForNotReturning(String reasonForNotReturning) {
		if ( null != reasonForNotReturning && reasonForNotReturning.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for reasonForNotReturning. Tried to set value: "+
				reasonForNotReturning);
		}
		this.reasonForNotReturning = reasonForNotReturning;
	}

	public String getCareerAdvice() {
		return careerAdvice;
	}
	public void setCareerAdvice(String careerAdvice) {
		if ( null != careerAdvice && careerAdvice.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for careerAdvice. Tried to set value: "+
				careerAdvice);
		}
		this.careerAdvice = careerAdvice;
	}

	public String getOccupationalPsychologist() {
		return occupationalPsychologist;
	}
	public void setOccupationalPsychologist(String occupationalPsychologist) {
		if ( null != occupationalPsychologist && occupationalPsychologist.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for occupationalPsychologist. Tried to set value: "+
				occupationalPsychologist);
		}
		this.occupationalPsychologist = occupationalPsychologist;
	}

	public String getHigherEducation() {
		return higherEducation;
	}
	public void setHigherEducation(String higherEducation) {
		if ( null != higherEducation && higherEducation.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for higherEducation. Tried to set value: "+
				higherEducation);
		}
		this.higherEducation = higherEducation;
	}

	public String getRetraining() {
		return retraining;
	}
	public void setRetraining(String retraining) {
		if ( null != retraining && retraining.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for retraining. Tried to set value: "+
				retraining);
		}
		this.retraining = retraining;
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
		auditStr.append("\r\n*authoringDateTime* :");
		auditStr.append(authoringDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringCP* :");
		if (authoringCP != null)
		{
			auditStr.append(toShortClassName(authoringCP));
				
		    auditStr.append(authoringCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*positionOnDischarge* :");
		auditStr.append(positionOnDischarge);
	    auditStr.append("; ");
		auditStr.append("\r\n*returnToWorkDate* :");
		auditStr.append(returnToWorkDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*jobPosition* :");
		auditStr.append(jobPosition);
	    auditStr.append("; ");
		auditStr.append("\r\n*hours* :");
		auditStr.append(hours);
	    auditStr.append("; ");
		auditStr.append("\r\n*reasonForNotReturning* :");
		auditStr.append(reasonForNotReturning);
	    auditStr.append("; ");
		auditStr.append("\r\n*careerAdvice* :");
		auditStr.append(careerAdvice);
	    auditStr.append("; ");
		auditStr.append("\r\n*occupationalPsychologist* :");
		auditStr.append(occupationalPsychologist);
	    auditStr.append("; ");
		auditStr.append("\r\n*higherEducation* :");
		auditStr.append(higherEducation);
	    auditStr.append("; ");
		auditStr.append("\r\n*retraining* :");
		auditStr.append(retraining);
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
		
		String keyClassName = "WorkOnDischarge";
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
		if (this.getAuthoringDateTime() != null)
		{
			sb.append("<authoringDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getAuthoringDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</authoringDateTime>");		
		}
		if (this.getAuthoringCP() != null)
		{
			sb.append("<authoringCP>");
			sb.append(this.getAuthoringCP().toXMLString(domMap)); 	
			sb.append("</authoringCP>");		
		}
		if (this.getPositionOnDischarge() != null)
		{
			sb.append("<positionOnDischarge>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPositionOnDischarge().toString()));
			sb.append("</positionOnDischarge>");		
		}
		if (this.getReturnToWorkDate() != null)
		{
			sb.append("<returnToWorkDate>");
			sb.append(new ims.framework.utils.DateTime(this.getReturnToWorkDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</returnToWorkDate>");		
		}
		if (this.getJobPosition() != null)
		{
			sb.append("<jobPosition>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getJobPosition().toString()));
			sb.append("</jobPosition>");		
		}
		if (this.getHours() != null)
		{
			sb.append("<hours>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getHours().toString()));
			sb.append("</hours>");		
		}
		if (this.getReasonForNotReturning() != null)
		{
			sb.append("<reasonForNotReturning>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReasonForNotReturning().toString()));
			sb.append("</reasonForNotReturning>");		
		}
		if (this.getCareerAdvice() != null)
		{
			sb.append("<careerAdvice>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCareerAdvice().toString()));
			sb.append("</careerAdvice>");		
		}
		if (this.getOccupationalPsychologist() != null)
		{
			sb.append("<occupationalPsychologist>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOccupationalPsychologist().toString()));
			sb.append("</occupationalPsychologist>");		
		}
		if (this.getHigherEducation() != null)
		{
			sb.append("<higherEducation>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getHigherEducation().toString()));
			sb.append("</higherEducation>");		
		}
		if (this.getRetraining() != null)
		{
			sb.append("<retraining>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRetraining().toString()));
			sb.append("</retraining>");		
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
			WorkOnDischarge domainObject = getWorkOnDischargefromXML(itemEl, factory, domMap);

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
			WorkOnDischarge domainObject = getWorkOnDischargefromXML(itemEl, factory, domMap);

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
		
	public static WorkOnDischarge getWorkOnDischargefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getWorkOnDischargefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static WorkOnDischarge getWorkOnDischargefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!WorkOnDischarge.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!WorkOnDischarge.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the WorkOnDischarge class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (WorkOnDischarge)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(WorkOnDischarge.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		WorkOnDischarge ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (WorkOnDischarge)factory.getImportedDomainObject(WorkOnDischarge.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new WorkOnDischarge();
		}
		String keyClassName = "WorkOnDischarge";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (WorkOnDischarge)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, WorkOnDischarge obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringDateTime");
		if(fldEl != null)
		{	
    		obj.setAuthoringDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("authoringCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("positionOnDischarge");
		if(fldEl != null)
		{	
    		obj.setPositionOnDischarge(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("returnToWorkDate");
		if(fldEl != null)
		{	
    		obj.setReturnToWorkDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("jobPosition");
		if(fldEl != null)
		{	
    		obj.setJobPosition(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hours");
		if(fldEl != null)
		{	
    		obj.setHours(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("reasonForNotReturning");
		if(fldEl != null)
		{	
    		obj.setReasonForNotReturning(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("careerAdvice");
		if(fldEl != null)
		{	
    		obj.setCareerAdvice(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("occupationalPsychologist");
		if(fldEl != null)
		{	
    		obj.setOccupationalPsychologist(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("higherEducation");
		if(fldEl != null)
		{	
    		obj.setHigherEducation(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("retraining");
		if(fldEl != null)
		{	
    		obj.setRetraining(new String(fldEl.getTextTrim()));	
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
		public static final String AuthoringDateTime = "authoringDateTime";
		public static final String AuthoringCP = "authoringCP";
		public static final String PositionOnDischarge = "positionOnDischarge";
		public static final String ReturnToWorkDate = "returnToWorkDate";
		public static final String JobPosition = "jobPosition";
		public static final String Hours = "hours";
		public static final String ReasonForNotReturning = "reasonForNotReturning";
		public static final String CareerAdvice = "careerAdvice";
		public static final String OccupationalPsychologist = "occupationalPsychologist";
		public static final String HigherEducation = "higherEducation";
		public static final String Retraining = "retraining";
	}
}

