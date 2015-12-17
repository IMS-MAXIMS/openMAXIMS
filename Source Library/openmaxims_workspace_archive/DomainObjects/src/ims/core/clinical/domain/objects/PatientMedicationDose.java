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
 * @author Sinead McDermott
 * Generated.
 */


public class PatientMedicationDose extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1003100013;
	private static final long serialVersionUID = 1003100013L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Numeric value 125/250 ( some sites 25mg) */
	private String dose;
	/** Unit e.g mg, microg */
	private ims.domain.lookups.LookupInstance doseUnit;
	/** e.g oral, IV */
	private ims.domain.lookups.LookupInstance adminRoute;
	/** Date */
	private java.util.Date doseStartDate;
	/** HCP who Commenced initially */
	private ims.core.resource.people.domain.objects.Hcp doseStartHcp;
	/** Times of day to be taken
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List adminTimes;
	private Boolean isStopped;
	private java.util.Date isStoppedDate;
	/** StoppedByType */
	private ims.domain.lookups.LookupInstance stoppedByType;
	private ims.core.resource.people.domain.objects.Hcp isStoppedHcp;
	private ims.domain.lookups.LookupInstance isStoppedReason;
	/** isStoppedReasonText */
	private String isStoppedReasonText;
	/** Text of when Taken */
	private String whenTaken;
	/** Duration */
	private Integer duration;
	/** DurationUnits */
	private ims.domain.lookups.LookupInstance durationUnits;
	/** CommencedByType */
	private ims.domain.lookups.LookupInstance commencedByType;
	/** isCopied */
	private Boolean isCopied;
	/** AuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
    public PatientMedicationDose (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientMedicationDose ()
    {
    	super();
    }
    public PatientMedicationDose (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.PatientMedicationDose.class;
	}


	public String getDose() {
		return dose;
	}
	public void setDose(String dose) {
		if ( null != dose && dose.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for dose. Tried to set value: "+
				dose);
		}
		this.dose = dose;
	}

	public ims.domain.lookups.LookupInstance getDoseUnit() {
		return doseUnit;
	}
	public void setDoseUnit(ims.domain.lookups.LookupInstance doseUnit) {
		this.doseUnit = doseUnit;
	}

	public ims.domain.lookups.LookupInstance getAdminRoute() {
		return adminRoute;
	}
	public void setAdminRoute(ims.domain.lookups.LookupInstance adminRoute) {
		this.adminRoute = adminRoute;
	}

	public java.util.Date getDoseStartDate() {
		return doseStartDate;
	}
	public void setDoseStartDate(java.util.Date doseStartDate) {
		this.doseStartDate = doseStartDate;
	}

	public ims.core.resource.people.domain.objects.Hcp getDoseStartHcp() {
		return doseStartHcp;
	}
	public void setDoseStartHcp(ims.core.resource.people.domain.objects.Hcp doseStartHcp) {
		this.doseStartHcp = doseStartHcp;
	}

	public java.util.List getAdminTimes() {
		if ( null == adminTimes ) {
			adminTimes = new java.util.ArrayList();
		}
		return adminTimes;
	}
	public void setAdminTimes(java.util.List paramValue) {
		this.adminTimes = paramValue;
	}

	public Boolean isIsStopped() {
		return isStopped;
	}
	public void setIsStopped(Boolean isStopped) {
		this.isStopped = isStopped;
	}

	public java.util.Date getIsStoppedDate() {
		return isStoppedDate;
	}
	public void setIsStoppedDate(java.util.Date isStoppedDate) {
		this.isStoppedDate = isStoppedDate;
	}

	public ims.domain.lookups.LookupInstance getStoppedByType() {
		return stoppedByType;
	}
	public void setStoppedByType(ims.domain.lookups.LookupInstance stoppedByType) {
		this.stoppedByType = stoppedByType;
	}

	public ims.core.resource.people.domain.objects.Hcp getIsStoppedHcp() {
		return isStoppedHcp;
	}
	public void setIsStoppedHcp(ims.core.resource.people.domain.objects.Hcp isStoppedHcp) {
		this.isStoppedHcp = isStoppedHcp;
	}

	public ims.domain.lookups.LookupInstance getIsStoppedReason() {
		return isStoppedReason;
	}
	public void setIsStoppedReason(ims.domain.lookups.LookupInstance isStoppedReason) {
		this.isStoppedReason = isStoppedReason;
	}

	public String getIsStoppedReasonText() {
		return isStoppedReasonText;
	}
	public void setIsStoppedReasonText(String isStoppedReasonText) {
		if ( null != isStoppedReasonText && isStoppedReasonText.length() > 200 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for isStoppedReasonText. Tried to set value: "+
				isStoppedReasonText);
		}
		this.isStoppedReasonText = isStoppedReasonText;
	}

	public String getWhenTaken() {
		return whenTaken;
	}
	public void setWhenTaken(String whenTaken) {
		if ( null != whenTaken && whenTaken.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for whenTaken. Tried to set value: "+
				whenTaken);
		}
		this.whenTaken = whenTaken;
	}

	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public ims.domain.lookups.LookupInstance getDurationUnits() {
		return durationUnits;
	}
	public void setDurationUnits(ims.domain.lookups.LookupInstance durationUnits) {
		this.durationUnits = durationUnits;
	}

	public ims.domain.lookups.LookupInstance getCommencedByType() {
		return commencedByType;
	}
	public void setCommencedByType(ims.domain.lookups.LookupInstance commencedByType) {
		this.commencedByType = commencedByType;
	}

	public Boolean isIsCopied() {
		return isCopied;
	}
	public void setIsCopied(Boolean isCopied) {
		this.isCopied = isCopied;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
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
		
		auditStr.append("\r\n*dose* :");
		auditStr.append(dose);
	    auditStr.append("; ");
		auditStr.append("\r\n*doseUnit* :");
		if (doseUnit != null)
			auditStr.append(doseUnit.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*adminRoute* :");
		if (adminRoute != null)
			auditStr.append(adminRoute.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*doseStartDate* :");
		auditStr.append(doseStartDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*doseStartHcp* :");
		if (doseStartHcp != null)
		{
			auditStr.append(toShortClassName(doseStartHcp));
				
		    auditStr.append(doseStartHcp.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*adminTimes* :");
		if (adminTimes != null)
		{
			java.util.Iterator it6 = adminTimes.iterator();
			int i6=0;
			while (it6.hasNext())
			{
				if (i6 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it6.next();
			auditStr.append(obj.getText());
			i6++;
		}
		if (i6 > 0)
			auditStr.append("] " + i6);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isStopped* :");
		auditStr.append(isStopped);
	    auditStr.append("; ");
		auditStr.append("\r\n*isStoppedDate* :");
		auditStr.append(isStoppedDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*stoppedByType* :");
		if (stoppedByType != null)
			auditStr.append(stoppedByType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*isStoppedHcp* :");
		if (isStoppedHcp != null)
		{
			auditStr.append(toShortClassName(isStoppedHcp));
				
		    auditStr.append(isStoppedHcp.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isStoppedReason* :");
		if (isStoppedReason != null)
			auditStr.append(isStoppedReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*isStoppedReasonText* :");
		auditStr.append(isStoppedReasonText);
	    auditStr.append("; ");
		auditStr.append("\r\n*whenTaken* :");
		auditStr.append(whenTaken);
	    auditStr.append("; ");
		auditStr.append("\r\n*duration* :");
		auditStr.append(duration);
	    auditStr.append("; ");
		auditStr.append("\r\n*durationUnits* :");
		if (durationUnits != null)
			auditStr.append(durationUnits.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*commencedByType* :");
		if (commencedByType != null)
			auditStr.append(commencedByType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*isCopied* :");
		auditStr.append(isCopied);
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
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
		
		String keyClassName = "PatientMedicationDose";
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
		if (this.getDose() != null)
		{
			sb.append("<dose>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDose().toString()));
			sb.append("</dose>");		
		}
		if (this.getDoseUnit() != null)
		{
			sb.append("<doseUnit>");
			sb.append(this.getDoseUnit().toXMLString()); 
			sb.append("</doseUnit>");		
		}
		if (this.getAdminRoute() != null)
		{
			sb.append("<adminRoute>");
			sb.append(this.getAdminRoute().toXMLString()); 
			sb.append("</adminRoute>");		
		}
		if (this.getDoseStartDate() != null)
		{
			sb.append("<doseStartDate>");
			sb.append(new ims.framework.utils.DateTime(this.getDoseStartDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</doseStartDate>");		
		}
		if (this.getDoseStartHcp() != null)
		{
			sb.append("<doseStartHcp>");
			sb.append(this.getDoseStartHcp().toXMLString(domMap)); 	
			sb.append("</doseStartHcp>");		
		}
		if (this.getAdminTimes() != null)
		{
			if (this.getAdminTimes().size() > 0 )
			{
			sb.append("<adminTimes>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getAdminTimes())); 
			sb.append("</adminTimes>");		
			}
		}
		if (this.isIsStopped() != null)
		{
			sb.append("<isStopped>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsStopped().toString()));
			sb.append("</isStopped>");		
		}
		if (this.getIsStoppedDate() != null)
		{
			sb.append("<isStoppedDate>");
			sb.append(new ims.framework.utils.DateTime(this.getIsStoppedDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</isStoppedDate>");		
		}
		if (this.getStoppedByType() != null)
		{
			sb.append("<stoppedByType>");
			sb.append(this.getStoppedByType().toXMLString()); 
			sb.append("</stoppedByType>");		
		}
		if (this.getIsStoppedHcp() != null)
		{
			sb.append("<isStoppedHcp>");
			sb.append(this.getIsStoppedHcp().toXMLString(domMap)); 	
			sb.append("</isStoppedHcp>");		
		}
		if (this.getIsStoppedReason() != null)
		{
			sb.append("<isStoppedReason>");
			sb.append(this.getIsStoppedReason().toXMLString()); 
			sb.append("</isStoppedReason>");		
		}
		if (this.getIsStoppedReasonText() != null)
		{
			sb.append("<isStoppedReasonText>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getIsStoppedReasonText().toString()));
			sb.append("</isStoppedReasonText>");		
		}
		if (this.getWhenTaken() != null)
		{
			sb.append("<whenTaken>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getWhenTaken().toString()));
			sb.append("</whenTaken>");		
		}
		if (this.getDuration() != null)
		{
			sb.append("<duration>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDuration().toString()));
			sb.append("</duration>");		
		}
		if (this.getDurationUnits() != null)
		{
			sb.append("<durationUnits>");
			sb.append(this.getDurationUnits().toXMLString()); 
			sb.append("</durationUnits>");		
		}
		if (this.getCommencedByType() != null)
		{
			sb.append("<commencedByType>");
			sb.append(this.getCommencedByType().toXMLString()); 
			sb.append("</commencedByType>");		
		}
		if (this.isIsCopied() != null)
		{
			sb.append("<isCopied>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsCopied().toString()));
			sb.append("</isCopied>");		
		}
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
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
			PatientMedicationDose domainObject = getPatientMedicationDosefromXML(itemEl, factory, domMap);

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
			PatientMedicationDose domainObject = getPatientMedicationDosefromXML(itemEl, factory, domMap);

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
		
	public static PatientMedicationDose getPatientMedicationDosefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientMedicationDosefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientMedicationDose getPatientMedicationDosefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientMedicationDose.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientMedicationDose.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientMedicationDose class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientMedicationDose)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientMedicationDose.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientMedicationDose ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientMedicationDose)factory.getImportedDomainObject(PatientMedicationDose.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientMedicationDose();
		}
		String keyClassName = "PatientMedicationDose";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientMedicationDose)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientMedicationDose obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("dose");
		if(fldEl != null)
		{	
    		obj.setDose(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("doseUnit");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDoseUnit(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("adminRoute");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAdminRoute(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("doseStartDate");
		if(fldEl != null)
		{	
    		obj.setDoseStartDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("doseStartHcp");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setDoseStartHcp(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("adminTimes");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setAdminTimes(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getAdminTimes())); 
		}
		fldEl = el.element("isStopped");
		if(fldEl != null)
		{	
    		obj.setIsStopped(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isStoppedDate");
		if(fldEl != null)
		{	
    		obj.setIsStoppedDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("stoppedByType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setStoppedByType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("isStoppedHcp");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setIsStoppedHcp(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isStoppedReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setIsStoppedReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("isStoppedReasonText");
		if(fldEl != null)
		{	
    		obj.setIsStoppedReasonText(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("whenTaken");
		if(fldEl != null)
		{	
    		obj.setWhenTaken(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("duration");
		if(fldEl != null)
		{	
    		obj.setDuration(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("durationUnits");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDurationUnits(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("commencedByType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCommencedByType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("isCopied");
		if(fldEl != null)
		{	
    		obj.setIsCopied(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "adminTimes"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Dose = "dose";
		public static final String DoseUnit = "doseUnit";
		public static final String AdminRoute = "adminRoute";
		public static final String DoseStartDate = "doseStartDate";
		public static final String DoseStartHcp = "doseStartHcp";
		public static final String AdminTimes = "adminTimes";
		public static final String IsStopped = "isStopped";
		public static final String IsStoppedDate = "isStoppedDate";
		public static final String StoppedByType = "stoppedByType";
		public static final String IsStoppedHcp = "isStoppedHcp";
		public static final String IsStoppedReason = "isStoppedReason";
		public static final String IsStoppedReasonText = "isStoppedReasonText";
		public static final String WhenTaken = "whenTaken";
		public static final String Duration = "duration";
		public static final String DurationUnits = "durationUnits";
		public static final String CommencedByType = "commencedByType";
		public static final String IsCopied = "isCopied";
		public static final String AuthoringInformation = "authoringInformation";
	}
}

