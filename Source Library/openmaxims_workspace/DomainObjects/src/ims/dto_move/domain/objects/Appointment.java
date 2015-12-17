//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
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
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5589.25814)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 12/10/2015, 13:28
 *
 */
package ims.dto_move.domain.objects;

/**
 * 
 * @author Sean Nesbitt
 * Generated.
 */


public class Appointment extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1105100030;
	private static final long serialVersionUID = 1105100030L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Patient Identifier - dto value */
	private Integer pkey;
	/** Maybe we could have link to our patient too */
	private ims.core.patient.domain.objects.Patient patient;
	/** As component, hold id only */
	private Integer firstApptId;
	/** As component, hold id only */
	private Integer lastApptId;
	private Integer numCancelled;
	private Integer numDNA;
	private Integer bookingSysType;
	private ims.dto_move.domain.objects.Appointment relatedAppointment;
	private String patientLetter;
	private String gpLetter;
	private String comments;
	private ims.core.resource.people.domain.objects.MemberOfStaff hcpBooking;
	private java.util.Date dateBooked;
	private java.util.Date priorDateOffered;
	private Integer headStatus;
	/** Treatment Plan Action Id */
	private Integer treatPlanActionId;
	private String transportRequired;
	private String transportComment;
	private Integer patStat;
	private Integer episode;
	/** 
	  * Collection of ims.dto_move.domain.objects.AppointmentDetail.
	  */
	private java.util.List apptDetail;
	/** 
	  * Collection of ims.dto_move.domain.objects.AppointmentAction.
	  */
	private java.util.List apptActions;
	/** 
	  * Collection of ims.dto_move.domain.objects.AppointmentHistory.
	  */
	private java.util.List apptHistory;
	/** 
	  * Collection of ims.dto_move.domain.objects.AppointmentTransport.
	  */
	private java.util.List transport;
	/** 
	  * Collection of ims.dto_move.domain.objects.AppointmentSpecReq.
	  */
	private java.util.List specialRequirements;
    public Appointment (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Appointment ()
    {
    	super();
    }
    public Appointment (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.dto_move.domain.objects.Appointment.class;
	}


	public Integer getPkey() {
		return pkey;
	}
	public void setPkey(Integer pkey) {
		this.pkey = pkey;
	}

	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public Integer getFirstApptId() {
		return firstApptId;
	}
	public void setFirstApptId(Integer firstApptId) {
		this.firstApptId = firstApptId;
	}

	public Integer getLastApptId() {
		return lastApptId;
	}
	public void setLastApptId(Integer lastApptId) {
		this.lastApptId = lastApptId;
	}

	public Integer getNumCancelled() {
		return numCancelled;
	}
	public void setNumCancelled(Integer numCancelled) {
		this.numCancelled = numCancelled;
	}

	public Integer getNumDNA() {
		return numDNA;
	}
	public void setNumDNA(Integer numDNA) {
		this.numDNA = numDNA;
	}

	public Integer getBookingSysType() {
		return bookingSysType;
	}
	public void setBookingSysType(Integer bookingSysType) {
		this.bookingSysType = bookingSysType;
	}

	public ims.dto_move.domain.objects.Appointment getRelatedAppointment() {
		return relatedAppointment;
	}
	public void setRelatedAppointment(ims.dto_move.domain.objects.Appointment relatedAppointment) {
		this.relatedAppointment = relatedAppointment;
	}

	public String getPatientLetter() {
		return patientLetter;
	}
	public void setPatientLetter(String patientLetter) {
		if ( null != patientLetter && patientLetter.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for patientLetter. Tried to set value: "+
				patientLetter);
		}
		this.patientLetter = patientLetter;
	}

	public String getGpLetter() {
		return gpLetter;
	}
	public void setGpLetter(String gpLetter) {
		if ( null != gpLetter && gpLetter.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for gpLetter. Tried to set value: "+
				gpLetter);
		}
		this.gpLetter = gpLetter;
	}

	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		if ( null != comments && comments.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for comments. Tried to set value: "+
				comments);
		}
		this.comments = comments;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getHcpBooking() {
		return hcpBooking;
	}
	public void setHcpBooking(ims.core.resource.people.domain.objects.MemberOfStaff hcpBooking) {
		this.hcpBooking = hcpBooking;
	}

	public java.util.Date getDateBooked() {
		return dateBooked;
	}
	public void setDateBooked(java.util.Date dateBooked) {
		this.dateBooked = dateBooked;
	}

	public java.util.Date getPriorDateOffered() {
		return priorDateOffered;
	}
	public void setPriorDateOffered(java.util.Date priorDateOffered) {
		this.priorDateOffered = priorDateOffered;
	}

	public Integer getHeadStatus() {
		return headStatus;
	}
	public void setHeadStatus(Integer headStatus) {
		this.headStatus = headStatus;
	}

	public Integer getTreatPlanActionId() {
		return treatPlanActionId;
	}
	public void setTreatPlanActionId(Integer treatPlanActionId) {
		this.treatPlanActionId = treatPlanActionId;
	}

	public String getTransportRequired() {
		return transportRequired;
	}
	public void setTransportRequired(String transportRequired) {
		if ( null != transportRequired && transportRequired.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for transportRequired. Tried to set value: "+
				transportRequired);
		}
		this.transportRequired = transportRequired;
	}

	public String getTransportComment() {
		return transportComment;
	}
	public void setTransportComment(String transportComment) {
		if ( null != transportComment && transportComment.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for transportComment. Tried to set value: "+
				transportComment);
		}
		this.transportComment = transportComment;
	}

	public Integer getPatStat() {
		return patStat;
	}
	public void setPatStat(Integer patStat) {
		this.patStat = patStat;
	}

	public Integer getEpisode() {
		return episode;
	}
	public void setEpisode(Integer episode) {
		this.episode = episode;
	}

	public java.util.List getApptDetail() {
		if ( null == apptDetail ) {
			apptDetail = new java.util.ArrayList();
		}
		return apptDetail;
	}
	public void setApptDetail(java.util.List paramValue) {
		this.apptDetail = paramValue;
	}

	public java.util.List getApptActions() {
		if ( null == apptActions ) {
			apptActions = new java.util.ArrayList();
		}
		return apptActions;
	}
	public void setApptActions(java.util.List paramValue) {
		this.apptActions = paramValue;
	}

	public java.util.List getApptHistory() {
		if ( null == apptHistory ) {
			apptHistory = new java.util.ArrayList();
		}
		return apptHistory;
	}
	public void setApptHistory(java.util.List paramValue) {
		this.apptHistory = paramValue;
	}

	public java.util.List getTransport() {
		if ( null == transport ) {
			transport = new java.util.ArrayList();
		}
		return transport;
	}
	public void setTransport(java.util.List paramValue) {
		this.transport = paramValue;
	}

	public java.util.List getSpecialRequirements() {
		if ( null == specialRequirements ) {
			specialRequirements = new java.util.ArrayList();
		}
		return specialRequirements;
	}
	public void setSpecialRequirements(java.util.List paramValue) {
		this.specialRequirements = paramValue;
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
		
		auditStr.append("\r\n*pkey* :");
		auditStr.append(pkey);
	    auditStr.append("; ");
		auditStr.append("\r\n*patient* :");
		if (patient != null)
		{
			auditStr.append(toShortClassName(patient));
				
		    auditStr.append(patient.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*firstApptId* :");
		auditStr.append(firstApptId);
	    auditStr.append("; ");
		auditStr.append("\r\n*lastApptId* :");
		auditStr.append(lastApptId);
	    auditStr.append("; ");
		auditStr.append("\r\n*numCancelled* :");
		auditStr.append(numCancelled);
	    auditStr.append("; ");
		auditStr.append("\r\n*numDNA* :");
		auditStr.append(numDNA);
	    auditStr.append("; ");
		auditStr.append("\r\n*bookingSysType* :");
		auditStr.append(bookingSysType);
	    auditStr.append("; ");
		auditStr.append("\r\n*relatedAppointment* :");
		if (relatedAppointment != null)
		{
			auditStr.append(toShortClassName(relatedAppointment));
				
		    auditStr.append(relatedAppointment.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*patientLetter* :");
		auditStr.append(patientLetter);
	    auditStr.append("; ");
		auditStr.append("\r\n*gpLetter* :");
		auditStr.append(gpLetter);
	    auditStr.append("; ");
		auditStr.append("\r\n*comments* :");
		auditStr.append(comments);
	    auditStr.append("; ");
		auditStr.append("\r\n*hcpBooking* :");
		if (hcpBooking != null)
		{
			auditStr.append(toShortClassName(hcpBooking));
				
		    auditStr.append(hcpBooking.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*dateBooked* :");
		auditStr.append(dateBooked);
	    auditStr.append("; ");
		auditStr.append("\r\n*priorDateOffered* :");
		auditStr.append(priorDateOffered);
	    auditStr.append("; ");
		auditStr.append("\r\n*headStatus* :");
		auditStr.append(headStatus);
	    auditStr.append("; ");
		auditStr.append("\r\n*treatPlanActionId* :");
		auditStr.append(treatPlanActionId);
	    auditStr.append("; ");
		auditStr.append("\r\n*transportRequired* :");
		auditStr.append(transportRequired);
	    auditStr.append("; ");
		auditStr.append("\r\n*transportComment* :");
		auditStr.append(transportComment);
	    auditStr.append("; ");
		auditStr.append("\r\n*patStat* :");
		auditStr.append(patStat);
	    auditStr.append("; ");
		auditStr.append("\r\n*episode* :");
		auditStr.append(episode);
	    auditStr.append("; ");
		auditStr.append("\r\n*apptDetail* :");
		if (apptDetail != null)
		{
		int i21=0;
		for (i21=0; i21<apptDetail.size(); i21++)
		{
			if (i21 > 0)
				auditStr.append(",");
			ims.dto_move.domain.objects.AppointmentDetail obj = (ims.dto_move.domain.objects.AppointmentDetail)apptDetail.get(i21);
		    if (obj != null)
			{
				if (i21 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i21 > 0)
			auditStr.append("] " + i21);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*apptActions* :");
		if (apptActions != null)
		{
		int i22=0;
		for (i22=0; i22<apptActions.size(); i22++)
		{
			if (i22 > 0)
				auditStr.append(",");
			ims.dto_move.domain.objects.AppointmentAction obj = (ims.dto_move.domain.objects.AppointmentAction)apptActions.get(i22);
		    if (obj != null)
			{
				if (i22 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i22 > 0)
			auditStr.append("] " + i22);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*apptHistory* :");
		if (apptHistory != null)
		{
		int i23=0;
		for (i23=0; i23<apptHistory.size(); i23++)
		{
			if (i23 > 0)
				auditStr.append(",");
			ims.dto_move.domain.objects.AppointmentHistory obj = (ims.dto_move.domain.objects.AppointmentHistory)apptHistory.get(i23);
		    if (obj != null)
			{
				if (i23 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i23 > 0)
			auditStr.append("] " + i23);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*transport* :");
		if (transport != null)
		{
		int i24=0;
		for (i24=0; i24<transport.size(); i24++)
		{
			if (i24 > 0)
				auditStr.append(",");
			ims.dto_move.domain.objects.AppointmentTransport obj = (ims.dto_move.domain.objects.AppointmentTransport)transport.get(i24);
		    if (obj != null)
			{
				if (i24 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i24 > 0)
			auditStr.append("] " + i24);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*specialRequirements* :");
		if (specialRequirements != null)
		{
		int i25=0;
		for (i25=0; i25<specialRequirements.size(); i25++)
		{
			if (i25 > 0)
				auditStr.append(",");
			ims.dto_move.domain.objects.AppointmentSpecReq obj = (ims.dto_move.domain.objects.AppointmentSpecReq)specialRequirements.get(i25);
		    if (obj != null)
			{
				if (i25 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i25 > 0)
			auditStr.append("] " + i25);
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
		
		String keyClassName = "Appointment";
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
		if (this.getPkey() != null)
		{
			sb.append("<pkey>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPkey().toString()));
			sb.append("</pkey>");		
		}
		if (this.getPatient() != null)
		{
			sb.append("<patient>");
			sb.append(this.getPatient().toXMLString(domMap)); 	
			sb.append("</patient>");		
		}
		if (this.getFirstApptId() != null)
		{
			sb.append("<firstApptId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFirstApptId().toString()));
			sb.append("</firstApptId>");		
		}
		if (this.getLastApptId() != null)
		{
			sb.append("<lastApptId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLastApptId().toString()));
			sb.append("</lastApptId>");		
		}
		if (this.getNumCancelled() != null)
		{
			sb.append("<numCancelled>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNumCancelled().toString()));
			sb.append("</numCancelled>");		
		}
		if (this.getNumDNA() != null)
		{
			sb.append("<numDNA>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNumDNA().toString()));
			sb.append("</numDNA>");		
		}
		if (this.getBookingSysType() != null)
		{
			sb.append("<bookingSysType>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getBookingSysType().toString()));
			sb.append("</bookingSysType>");		
		}
		if (this.getRelatedAppointment() != null)
		{
			sb.append("<relatedAppointment>");
			sb.append(this.getRelatedAppointment().toXMLString(domMap)); 	
			sb.append("</relatedAppointment>");		
		}
		if (this.getPatientLetter() != null)
		{
			sb.append("<patientLetter>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPatientLetter().toString()));
			sb.append("</patientLetter>");		
		}
		if (this.getGpLetter() != null)
		{
			sb.append("<gpLetter>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getGpLetter().toString()));
			sb.append("</gpLetter>");		
		}
		if (this.getComments() != null)
		{
			sb.append("<comments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComments().toString()));
			sb.append("</comments>");		
		}
		if (this.getHcpBooking() != null)
		{
			sb.append("<hcpBooking>");
			sb.append(this.getHcpBooking().toXMLString(domMap)); 	
			sb.append("</hcpBooking>");		
		}
		if (this.getDateBooked() != null)
		{
			sb.append("<dateBooked>");
			sb.append(new ims.framework.utils.DateTime(this.getDateBooked()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateBooked>");		
		}
		if (this.getPriorDateOffered() != null)
		{
			sb.append("<priorDateOffered>");
			sb.append(new ims.framework.utils.DateTime(this.getPriorDateOffered()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</priorDateOffered>");		
		}
		if (this.getHeadStatus() != null)
		{
			sb.append("<headStatus>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getHeadStatus().toString()));
			sb.append("</headStatus>");		
		}
		if (this.getTreatPlanActionId() != null)
		{
			sb.append("<treatPlanActionId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTreatPlanActionId().toString()));
			sb.append("</treatPlanActionId>");		
		}
		if (this.getTransportRequired() != null)
		{
			sb.append("<transportRequired>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTransportRequired().toString()));
			sb.append("</transportRequired>");		
		}
		if (this.getTransportComment() != null)
		{
			sb.append("<transportComment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTransportComment().toString()));
			sb.append("</transportComment>");		
		}
		if (this.getPatStat() != null)
		{
			sb.append("<patStat>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPatStat().toString()));
			sb.append("</patStat>");		
		}
		if (this.getEpisode() != null)
		{
			sb.append("<episode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getEpisode().toString()));
			sb.append("</episode>");		
		}
		if (this.getApptDetail() != null)
		{
			if (this.getApptDetail().size() > 0 )
			{
			sb.append("<apptDetail>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getApptDetail(), domMap));
			sb.append("</apptDetail>");		
			}
		}
		if (this.getApptActions() != null)
		{
			if (this.getApptActions().size() > 0 )
			{
			sb.append("<apptActions>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getApptActions(), domMap));
			sb.append("</apptActions>");		
			}
		}
		if (this.getApptHistory() != null)
		{
			if (this.getApptHistory().size() > 0 )
			{
			sb.append("<apptHistory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getApptHistory(), domMap));
			sb.append("</apptHistory>");		
			}
		}
		if (this.getTransport() != null)
		{
			if (this.getTransport().size() > 0 )
			{
			sb.append("<transport>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getTransport(), domMap));
			sb.append("</transport>");		
			}
		}
		if (this.getSpecialRequirements() != null)
		{
			if (this.getSpecialRequirements().size() > 0 )
			{
			sb.append("<specialRequirements>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getSpecialRequirements(), domMap));
			sb.append("</specialRequirements>");		
			}
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
			Appointment domainObject = getAppointmentfromXML(itemEl, factory, domMap);

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
			Appointment domainObject = getAppointmentfromXML(itemEl, factory, domMap);

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
		
	public static Appointment getAppointmentfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getAppointmentfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Appointment getAppointmentfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Appointment.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Appointment.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Appointment class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Appointment)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Appointment.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Appointment ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Appointment)factory.getImportedDomainObject(Appointment.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Appointment();
		}
		String keyClassName = "Appointment";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Appointment)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Appointment obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("pkey");
		if(fldEl != null)
		{	
    		obj.setPkey(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("firstApptId");
		if(fldEl != null)
		{	
    		obj.setFirstApptId(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("lastApptId");
		if(fldEl != null)
		{	
    		obj.setLastApptId(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("numCancelled");
		if(fldEl != null)
		{	
    		obj.setNumCancelled(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("numDNA");
		if(fldEl != null)
		{	
    		obj.setNumDNA(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("bookingSysType");
		if(fldEl != null)
		{	
    		obj.setBookingSysType(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("relatedAppointment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRelatedAppointment(ims.dto_move.domain.objects.Appointment.getAppointmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("patientLetter");
		if(fldEl != null)
		{	
    		obj.setPatientLetter(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("gpLetter");
		if(fldEl != null)
		{	
    		obj.setGpLetter(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("comments");
		if(fldEl != null)
		{	
    		obj.setComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hcpBooking");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setHcpBooking(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("dateBooked");
		if(fldEl != null)
		{	
    		obj.setDateBooked(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("priorDateOffered");
		if(fldEl != null)
		{	
    		obj.setPriorDateOffered(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("headStatus");
		if(fldEl != null)
		{	
    		obj.setHeadStatus(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("treatPlanActionId");
		if(fldEl != null)
		{	
    		obj.setTreatPlanActionId(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("transportRequired");
		if(fldEl != null)
		{	
    		obj.setTransportRequired(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("transportComment");
		if(fldEl != null)
		{	
    		obj.setTransportComment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("patStat");
		if(fldEl != null)
		{	
    		obj.setPatStat(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("episode");
		if(fldEl != null)
		{	
    		obj.setEpisode(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("apptDetail");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setApptDetail(ims.dto_move.domain.objects.AppointmentDetail.fromListXMLString(fldEl, factory, obj.getApptDetail(), domMap));
		}
		fldEl = el.element("apptActions");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setApptActions(ims.dto_move.domain.objects.AppointmentAction.fromListXMLString(fldEl, factory, obj.getApptActions(), domMap));
		}
		fldEl = el.element("apptHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setApptHistory(ims.dto_move.domain.objects.AppointmentHistory.fromListXMLString(fldEl, factory, obj.getApptHistory(), domMap));
		}
		fldEl = el.element("transport");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setTransport(ims.dto_move.domain.objects.AppointmentTransport.fromListXMLString(fldEl, factory, obj.getTransport(), domMap));
		}
		fldEl = el.element("specialRequirements");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setSpecialRequirements(ims.dto_move.domain.objects.AppointmentSpecReq.fromListXMLString(fldEl, factory, obj.getSpecialRequirements(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "apptDetail"
		, "apptActions"
		, "apptHistory"
		, "transport"
		, "specialRequirements"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Pkey = "pkey";
		public static final String Patient = "patient";
		public static final String FirstApptId = "firstApptId";
		public static final String LastApptId = "lastApptId";
		public static final String NumCancelled = "numCancelled";
		public static final String NumDNA = "numDNA";
		public static final String BookingSysType = "bookingSysType";
		public static final String RelatedAppointment = "relatedAppointment";
		public static final String PatientLetter = "patientLetter";
		public static final String GpLetter = "gpLetter";
		public static final String Comments = "comments";
		public static final String HcpBooking = "hcpBooking";
		public static final String DateBooked = "dateBooked";
		public static final String PriorDateOffered = "priorDateOffered";
		public static final String HeadStatus = "headStatus";
		public static final String TreatPlanActionId = "treatPlanActionId";
		public static final String TransportRequired = "transportRequired";
		public static final String TransportComment = "transportComment";
		public static final String PatStat = "patStat";
		public static final String Episode = "episode";
		public static final String ApptDetail = "apptDetail";
		public static final String ApptActions = "apptActions";
		public static final String ApptHistory = "apptHistory";
		public static final String Transport = "transport";
		public static final String SpecialRequirements = "specialRequirements";
	}
}

