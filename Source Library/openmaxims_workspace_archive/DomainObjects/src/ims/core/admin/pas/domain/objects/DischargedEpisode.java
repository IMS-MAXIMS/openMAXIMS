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
package ims.core.admin.pas.domain.objects;

/**
 * 
 * @author John MacEnri
 * Generated.
 */


public class DischargedEpisode extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1014100006;
	private static final long serialVersionUID = 1014100006L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private ims.core.admin.pas.domain.objects.PASEvent pasEvent;
	/** 
	  * Collection of ims.core.admin.pas.domain.objects.WardStay.
	  */
	private java.util.Set wardStays;
	/** 
	  * Collection of ims.core.admin.pas.domain.objects.ConsultantStay.
	  */
	private java.util.Set consultantStays;
	private java.util.Date dischargeDateTime;
	private Boolean isActive;
	/** DischargeDestination */
	private ims.domain.lookups.LookupInstance dischargeDestination;
	private ims.domain.lookups.LookupInstance methodOfDischarge;
	/** WasTreatmentDeferred */
	private Boolean wasTreatmentDeferred;
	/** Treatment Deferred Reason */
	private ims.domain.lookups.LookupInstance treatmentDeferredReason;
	/** Eighteen Week Clock Stopped */
	private Boolean eighteenWeekClockStopped;
	/** Admission Type */
	private ims.domain.lookups.LookupInstance admissionType;
	/** ReadmissionType */
	private ims.domain.lookups.LookupInstance readmissionType;
	/** DischargeReadyDate */
	private java.util.Date dischargeReadyDate;
	/** HomeLeaves
	  * Collection of ims.core.admin.pas.domain.objects.HomeLeave.
	  */
	private java.util.List homeLeaves;
	/** VTE Assessment Status */
	private ims.domain.lookups.LookupInstance vTEAssessmentStatus;
	/** VTE Risk Assessment */
	private ims.core.clinical.domain.objects.VTERiskAssessment vTERiskAssessment;
	/** Details of admission. */
	private ims.core.admin.pas.domain.objects.AdmissionDetail admissionDetail;
	/** ExtendedDetails */
	private ims.core.admin.pas.domain.objects.ExtendedDischargeDetail extendedDetails;
	private Boolean isCoded;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public DischargedEpisode (Integer id, int ver)
    {
    	super(id, ver);
    }
    public DischargedEpisode ()
    {
    	super();
    }
    public DischargedEpisode (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.admin.pas.domain.objects.DischargedEpisode.class;
	}


	public ims.core.admin.pas.domain.objects.PASEvent getPasEvent() {
		return pasEvent;
	}
	public void setPasEvent(ims.core.admin.pas.domain.objects.PASEvent pasEvent) {
		this.pasEvent = pasEvent;
	}

	public java.util.Set getWardStays() {
		if ( null == wardStays ) {
			wardStays = new java.util.HashSet();
		}
		return wardStays;
	}
	public void setWardStays(java.util.Set paramValue) {
		this.wardStays = paramValue;
	}

	public java.util.Set getConsultantStays() {
		if ( null == consultantStays ) {
			consultantStays = new java.util.HashSet();
		}
		return consultantStays;
	}
	public void setConsultantStays(java.util.Set paramValue) {
		this.consultantStays = paramValue;
	}

	public java.util.Date getDischargeDateTime() {
		return dischargeDateTime;
	}
	public void setDischargeDateTime(java.util.Date dischargeDateTime) {
		this.dischargeDateTime = dischargeDateTime;
	}

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public ims.domain.lookups.LookupInstance getDischargeDestination() {
		return dischargeDestination;
	}
	public void setDischargeDestination(ims.domain.lookups.LookupInstance dischargeDestination) {
		this.dischargeDestination = dischargeDestination;
	}

	public ims.domain.lookups.LookupInstance getMethodOfDischarge() {
		return methodOfDischarge;
	}
	public void setMethodOfDischarge(ims.domain.lookups.LookupInstance methodOfDischarge) {
		this.methodOfDischarge = methodOfDischarge;
	}

	public Boolean isWasTreatmentDeferred() {
		return wasTreatmentDeferred;
	}
	public void setWasTreatmentDeferred(Boolean wasTreatmentDeferred) {
		this.wasTreatmentDeferred = wasTreatmentDeferred;
	}

	public ims.domain.lookups.LookupInstance getTreatmentDeferredReason() {
		return treatmentDeferredReason;
	}
	public void setTreatmentDeferredReason(ims.domain.lookups.LookupInstance treatmentDeferredReason) {
		this.treatmentDeferredReason = treatmentDeferredReason;
	}

	public Boolean isEighteenWeekClockStopped() {
		return eighteenWeekClockStopped;
	}
	public void setEighteenWeekClockStopped(Boolean eighteenWeekClockStopped) {
		this.eighteenWeekClockStopped = eighteenWeekClockStopped;
	}

	public ims.domain.lookups.LookupInstance getAdmissionType() {
		return admissionType;
	}
	public void setAdmissionType(ims.domain.lookups.LookupInstance admissionType) {
		this.admissionType = admissionType;
	}

	public ims.domain.lookups.LookupInstance getReadmissionType() {
		return readmissionType;
	}
	public void setReadmissionType(ims.domain.lookups.LookupInstance readmissionType) {
		this.readmissionType = readmissionType;
	}

	public java.util.Date getDischargeReadyDate() {
		return dischargeReadyDate;
	}
	public void setDischargeReadyDate(java.util.Date dischargeReadyDate) {
		this.dischargeReadyDate = dischargeReadyDate;
	}

	public java.util.List getHomeLeaves() {
		if ( null == homeLeaves ) {
			homeLeaves = new java.util.ArrayList();
		}
		return homeLeaves;
	}
	public void setHomeLeaves(java.util.List paramValue) {
		this.homeLeaves = paramValue;
	}

	public ims.domain.lookups.LookupInstance getVTEAssessmentStatus() {
		return vTEAssessmentStatus;
	}
	public void setVTEAssessmentStatus(ims.domain.lookups.LookupInstance vTEAssessmentStatus) {
		this.vTEAssessmentStatus = vTEAssessmentStatus;
	}

	public ims.core.clinical.domain.objects.VTERiskAssessment getVTERiskAssessment() {
		return vTERiskAssessment;
	}
	public void setVTERiskAssessment(ims.core.clinical.domain.objects.VTERiskAssessment vTERiskAssessment) {
		this.vTERiskAssessment = vTERiskAssessment;
	}

	public ims.core.admin.pas.domain.objects.AdmissionDetail getAdmissionDetail() {
		return admissionDetail;
	}
	public void setAdmissionDetail(ims.core.admin.pas.domain.objects.AdmissionDetail admissionDetail) {
		this.admissionDetail = admissionDetail;
	}

	public ims.core.admin.pas.domain.objects.ExtendedDischargeDetail getExtendedDetails() {
		return extendedDetails;
	}
	public void setExtendedDetails(ims.core.admin.pas.domain.objects.ExtendedDischargeDetail extendedDetails) {
		this.extendedDetails = extendedDetails;
	}

	public Boolean isIsCoded() {
		return isCoded;
	}
	public void setIsCoded(Boolean isCoded) {
		this.isCoded = isCoded;
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
		
		auditStr.append("\r\n*pasEvent* :");
		if (pasEvent != null)
		{
			auditStr.append(toShortClassName(pasEvent));
				
		    auditStr.append(pasEvent.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*wardStays* :");
		if (wardStays != null)
		{
			java.util.Iterator it2 = wardStays.iterator();
			int i2=0;
			while (it2.hasNext())
			{
				if (i2 > 0)
					auditStr.append(",");
				ims.core.admin.pas.domain.objects.WardStay obj = (ims.core.admin.pas.domain.objects.WardStay)it2.next();
		if (obj != null)
		{
		   if (i2 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i2++;
		}
		if (i2 > 0)
			auditStr.append("] " + i2);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*consultantStays* :");
		if (consultantStays != null)
		{
			java.util.Iterator it3 = consultantStays.iterator();
			int i3=0;
			while (it3.hasNext())
			{
				if (i3 > 0)
					auditStr.append(",");
				ims.core.admin.pas.domain.objects.ConsultantStay obj = (ims.core.admin.pas.domain.objects.ConsultantStay)it3.next();
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
		auditStr.append("\r\n*dischargeDateTime* :");
		auditStr.append(dischargeDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeDestination* :");
		if (dischargeDestination != null)
			auditStr.append(dischargeDestination.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*methodOfDischarge* :");
		if (methodOfDischarge != null)
			auditStr.append(methodOfDischarge.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*wasTreatmentDeferred* :");
		auditStr.append(wasTreatmentDeferred);
	    auditStr.append("; ");
		auditStr.append("\r\n*treatmentDeferredReason* :");
		if (treatmentDeferredReason != null)
			auditStr.append(treatmentDeferredReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*eighteenWeekClockStopped* :");
		auditStr.append(eighteenWeekClockStopped);
	    auditStr.append("; ");
		auditStr.append("\r\n*admissionType* :");
		if (admissionType != null)
			auditStr.append(admissionType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*readmissionType* :");
		if (readmissionType != null)
			auditStr.append(readmissionType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeReadyDate* :");
		auditStr.append(dischargeReadyDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*homeLeaves* :");
		if (homeLeaves != null)
		{
		int i14=0;
		for (i14=0; i14<homeLeaves.size(); i14++)
		{
			if (i14 > 0)
				auditStr.append(",");
			ims.core.admin.pas.domain.objects.HomeLeave obj = (ims.core.admin.pas.domain.objects.HomeLeave)homeLeaves.get(i14);
		    if (obj != null)
			{
				if (i14 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i14 > 0)
			auditStr.append("] " + i14);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*vTEAssessmentStatus* :");
		if (vTEAssessmentStatus != null)
			auditStr.append(vTEAssessmentStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*vTERiskAssessment* :");
		if (vTERiskAssessment != null)
		{
			auditStr.append(toShortClassName(vTERiskAssessment));
				
		    auditStr.append(vTERiskAssessment.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*admissionDetail* :");
		if (admissionDetail != null)
		{
			auditStr.append(toShortClassName(admissionDetail));
				
		    auditStr.append(admissionDetail.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*extendedDetails* :");
		if (extendedDetails != null)
		{
			auditStr.append(toShortClassName(extendedDetails));
				
		    auditStr.append(extendedDetails.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isCoded* :");
		auditStr.append(isCoded);
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
		
		String keyClassName = "DischargedEpisode";
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
		if (this.getPasEvent() != null)
		{
			sb.append("<pasEvent>");
			sb.append(this.getPasEvent().toXMLString(domMap)); 	
			sb.append("</pasEvent>");		
		}
		if (this.getWardStays() != null)
		{
			if (this.getWardStays().size() > 0 )
			{
			sb.append("<wardStays>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getWardStays(), domMap));
			sb.append("</wardStays>");		
			}
		}
		if (this.getConsultantStays() != null)
		{
			if (this.getConsultantStays().size() > 0 )
			{
			sb.append("<consultantStays>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getConsultantStays(), domMap));
			sb.append("</consultantStays>");		
			}
		}
		if (this.getDischargeDateTime() != null)
		{
			sb.append("<dischargeDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getDischargeDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dischargeDateTime>");		
		}
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
		}
		if (this.getDischargeDestination() != null)
		{
			sb.append("<dischargeDestination>");
			sb.append(this.getDischargeDestination().toXMLString()); 
			sb.append("</dischargeDestination>");		
		}
		if (this.getMethodOfDischarge() != null)
		{
			sb.append("<methodOfDischarge>");
			sb.append(this.getMethodOfDischarge().toXMLString()); 
			sb.append("</methodOfDischarge>");		
		}
		if (this.isWasTreatmentDeferred() != null)
		{
			sb.append("<wasTreatmentDeferred>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWasTreatmentDeferred().toString()));
			sb.append("</wasTreatmentDeferred>");		
		}
		if (this.getTreatmentDeferredReason() != null)
		{
			sb.append("<treatmentDeferredReason>");
			sb.append(this.getTreatmentDeferredReason().toXMLString()); 
			sb.append("</treatmentDeferredReason>");		
		}
		if (this.isEighteenWeekClockStopped() != null)
		{
			sb.append("<eighteenWeekClockStopped>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isEighteenWeekClockStopped().toString()));
			sb.append("</eighteenWeekClockStopped>");		
		}
		if (this.getAdmissionType() != null)
		{
			sb.append("<admissionType>");
			sb.append(this.getAdmissionType().toXMLString()); 
			sb.append("</admissionType>");		
		}
		if (this.getReadmissionType() != null)
		{
			sb.append("<readmissionType>");
			sb.append(this.getReadmissionType().toXMLString()); 
			sb.append("</readmissionType>");		
		}
		if (this.getDischargeReadyDate() != null)
		{
			sb.append("<dischargeReadyDate>");
			sb.append(new ims.framework.utils.DateTime(this.getDischargeReadyDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dischargeReadyDate>");		
		}
		if (this.getHomeLeaves() != null)
		{
			if (this.getHomeLeaves().size() > 0 )
			{
			sb.append("<homeLeaves>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getHomeLeaves(), domMap));
			sb.append("</homeLeaves>");		
			}
		}
		if (this.getVTEAssessmentStatus() != null)
		{
			sb.append("<vTEAssessmentStatus>");
			sb.append(this.getVTEAssessmentStatus().toXMLString()); 
			sb.append("</vTEAssessmentStatus>");		
		}
		if (this.getVTERiskAssessment() != null)
		{
			sb.append("<vTERiskAssessment>");
			sb.append(this.getVTERiskAssessment().toXMLString(domMap)); 	
			sb.append("</vTERiskAssessment>");		
		}
		if (this.getAdmissionDetail() != null)
		{
			sb.append("<admissionDetail>");
			sb.append(this.getAdmissionDetail().toXMLString(domMap)); 	
			sb.append("</admissionDetail>");		
		}
		if (this.getExtendedDetails() != null)
		{
			sb.append("<extendedDetails>");
			sb.append(this.getExtendedDetails().toXMLString(domMap)); 	
			sb.append("</extendedDetails>");		
		}
		if (this.isIsCoded() != null)
		{
			sb.append("<isCoded>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsCoded().toString()));
			sb.append("</isCoded>");		
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
			DischargedEpisode domainObject = getDischargedEpisodefromXML(itemEl, factory, domMap);

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
			DischargedEpisode domainObject = getDischargedEpisodefromXML(itemEl, factory, domMap);

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
		
	public static DischargedEpisode getDischargedEpisodefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getDischargedEpisodefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static DischargedEpisode getDischargedEpisodefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!DischargedEpisode.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!DischargedEpisode.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the DischargedEpisode class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (DischargedEpisode)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(DischargedEpisode.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		DischargedEpisode ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (DischargedEpisode)factory.getImportedDomainObject(DischargedEpisode.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new DischargedEpisode();
		}
		String keyClassName = "DischargedEpisode";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (DischargedEpisode)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, DischargedEpisode obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("pasEvent");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPasEvent(ims.core.admin.pas.domain.objects.PASEvent.getPASEventfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("wardStays");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setWardStays(ims.core.admin.pas.domain.objects.WardStay.fromSetXMLString(fldEl, factory, obj.getWardStays(), domMap));
		}
		fldEl = el.element("consultantStays");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setConsultantStays(ims.core.admin.pas.domain.objects.ConsultantStay.fromSetXMLString(fldEl, factory, obj.getConsultantStays(), domMap));
		}
		fldEl = el.element("dischargeDateTime");
		if(fldEl != null)
		{	
    		obj.setDischargeDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dischargeDestination");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDischargeDestination(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("methodOfDischarge");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMethodOfDischarge(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("wasTreatmentDeferred");
		if(fldEl != null)
		{	
    		obj.setWasTreatmentDeferred(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("treatmentDeferredReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTreatmentDeferredReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("eighteenWeekClockStopped");
		if(fldEl != null)
		{	
    		obj.setEighteenWeekClockStopped(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("admissionType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAdmissionType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("readmissionType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReadmissionType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("dischargeReadyDate");
		if(fldEl != null)
		{	
    		obj.setDischargeReadyDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("homeLeaves");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setHomeLeaves(ims.core.admin.pas.domain.objects.HomeLeave.fromListXMLString(fldEl, factory, obj.getHomeLeaves(), domMap));
		}
		fldEl = el.element("vTEAssessmentStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setVTEAssessmentStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("vTERiskAssessment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setVTERiskAssessment(ims.core.clinical.domain.objects.VTERiskAssessment.getVTERiskAssessmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("admissionDetail");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAdmissionDetail(ims.core.admin.pas.domain.objects.AdmissionDetail.getAdmissionDetailfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("extendedDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setExtendedDetails(ims.core.admin.pas.domain.objects.ExtendedDischargeDetail.getExtendedDischargeDetailfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isCoded");
		if(fldEl != null)
		{	
    		obj.setIsCoded(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "wardStays"
		, "consultantStays"
		, "homeLeaves"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String PasEvent = "pasEvent";
		public static final String WardStays = "wardStays";
		public static final String ConsultantStays = "consultantStays";
		public static final String DischargeDateTime = "dischargeDateTime";
		public static final String IsActive = "isActive";
		public static final String DischargeDestination = "dischargeDestination";
		public static final String MethodOfDischarge = "methodOfDischarge";
		public static final String WasTreatmentDeferred = "wasTreatmentDeferred";
		public static final String TreatmentDeferredReason = "treatmentDeferredReason";
		public static final String EighteenWeekClockStopped = "eighteenWeekClockStopped";
		public static final String AdmissionType = "admissionType";
		public static final String ReadmissionType = "readmissionType";
		public static final String DischargeReadyDate = "dischargeReadyDate";
		public static final String HomeLeaves = "homeLeaves";
		public static final String VTEAssessmentStatus = "vTEAssessmentStatus";
		public static final String VTERiskAssessment = "vTERiskAssessment";
		public static final String AdmissionDetail = "admissionDetail";
		public static final String ExtendedDetails = "extendedDetails";
		public static final String IsCoded = "isCoded";
	}
}

