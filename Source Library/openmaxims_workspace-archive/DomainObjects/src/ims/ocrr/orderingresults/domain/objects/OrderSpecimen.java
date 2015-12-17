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
package ims.ocrr.orderingresults.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class OrderSpecimen extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1070100010;
	private static final long serialVersionUID = 1070100010L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Collection Date Time Placer System */
	private java.util.Date collDateTimePlacer;
	/** Collection Date Time Filler System */
	private java.util.Date collDateTimeFiller;
	/** Filler Supplied Collection Time */
	private Boolean colTimeFillerSupplied;
	/** Collection End Date Time Placer System */
	private java.util.Date collEndDateTimePlacer;
	/** Collection End Date Time Filler System */
	private java.util.Date collEndDateTimeFiller;
	/** Collector */
	private ims.core.resource.people.domain.objects.MemberOfStaff collectingMos;
	/** IsPatientCollect */
	private Boolean isPatientCollect;
	/** IsAwaitingCollection */
	private Boolean isAwaitingCollection;
	/** Received Date Time */
	private java.util.Date receivedDateTime;
	/** ReceivedTimeSupplied */
	private Boolean receivedTimeSupplied;
	/** SiteCd */
	private ims.domain.lookups.LookupInstance siteCd;
	/** Site Text */
	private String siteText;
	/** Source Code */
	private ims.domain.lookups.LookupInstance specimenSource;
	/** Lab Supplied Specimen Comments
	  * Collection of ims.ocrr.orderingresults.domain.objects.ResultComment.
	  */
	private java.util.List labSpecComments;
	/** Discipline */
	private ims.core.clinical.domain.objects.Service discipline;
	/** Investigations
	  * Collection of ims.ocrr.orderingresults.domain.objects.OrderInvestigation.
	  */
	private java.util.Set investigations;
	/** Order */
	private ims.ocrr.orderingresults.domain.objects.OcsOrderSession order;
	/** Containers
	  * Collection of ims.ocrr.orderingresults.domain.objects.OrderSpecimenContainer.
	  */
	private java.util.Set containers;
	/** Filler Order Number */
	private String fillerOrdNum;
	/** Allow phlebotomist enter comment at time of specimen collection */
	private String collectorComment;
	/** Notes entered by Orderer as instructions to specimen collector */
	private String instructionsToCollector;
	/** SpecimenCollectionStatus
	  * Collection of ims.ocrr.orderingresults.domain.objects.SpecimenCollectionStatus.
	  */
	private java.util.Set specimenCollectionStatus;
	/** Specifies whether this specimen has been processed by the outbound engine */
	private Boolean wasProcessed;
	/** Now,Patient,Phleb etc. */
	private ims.domain.lookups.LookupInstance requestedType;
	/** The placer number used in the HL7 Messages */
	private String placerOrdNum;
	/** Transient field used by rules engine to know when a patient has been saved */
	private Boolean saveComplete;
	/** ResultConclusionComments
	  * Collection of ims.ocrr.orderingresults.domain.objects.ResultConclusionAndActionComment.
	  */
	private java.util.Set resultConclusionComments;
	/** Result collection for this specimen
	  * Collection of ims.ocrr.orderingresults.domain.objects.PathResultDetails.
	  */
	private java.util.Set pathResult;
	/** Date time the specimen was resulted for a DFT */
	private java.util.Date dftSpecimenResulted;
	/** true if time is included */
	private Boolean dftSpecimenResultedTimeSupplied;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public OrderSpecimen (Integer id, int ver)
    {
    	super(id, ver);
    }
    public OrderSpecimen ()
    {
    	super();
    }
    public OrderSpecimen (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.ocrr.orderingresults.domain.objects.OrderSpecimen.class;
	}


	public java.util.Date getCollDateTimePlacer() {
		return collDateTimePlacer;
	}
	public void setCollDateTimePlacer(java.util.Date collDateTimePlacer) {
		this.collDateTimePlacer = collDateTimePlacer;
	}

	public java.util.Date getCollDateTimeFiller() {
		return collDateTimeFiller;
	}
	public void setCollDateTimeFiller(java.util.Date collDateTimeFiller) {
		this.collDateTimeFiller = collDateTimeFiller;
	}

	public Boolean isColTimeFillerSupplied() {
		return colTimeFillerSupplied;
	}
	public void setColTimeFillerSupplied(Boolean colTimeFillerSupplied) {
		this.colTimeFillerSupplied = colTimeFillerSupplied;
	}

	public java.util.Date getCollEndDateTimePlacer() {
		return collEndDateTimePlacer;
	}
	public void setCollEndDateTimePlacer(java.util.Date collEndDateTimePlacer) {
		this.collEndDateTimePlacer = collEndDateTimePlacer;
	}

	public java.util.Date getCollEndDateTimeFiller() {
		return collEndDateTimeFiller;
	}
	public void setCollEndDateTimeFiller(java.util.Date collEndDateTimeFiller) {
		this.collEndDateTimeFiller = collEndDateTimeFiller;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getCollectingMos() {
		return collectingMos;
	}
	public void setCollectingMos(ims.core.resource.people.domain.objects.MemberOfStaff collectingMos) {
		this.collectingMos = collectingMos;
	}

	public Boolean isIsPatientCollect() {
		return isPatientCollect;
	}
	public void setIsPatientCollect(Boolean isPatientCollect) {
		this.isPatientCollect = isPatientCollect;
	}

	public Boolean isIsAwaitingCollection() {
		return isAwaitingCollection;
	}
	public void setIsAwaitingCollection(Boolean isAwaitingCollection) {
		this.isAwaitingCollection = isAwaitingCollection;
	}

	public java.util.Date getReceivedDateTime() {
		return receivedDateTime;
	}
	public void setReceivedDateTime(java.util.Date receivedDateTime) {
		this.receivedDateTime = receivedDateTime;
	}

	public Boolean isReceivedTimeSupplied() {
		return receivedTimeSupplied;
	}
	public void setReceivedTimeSupplied(Boolean receivedTimeSupplied) {
		this.receivedTimeSupplied = receivedTimeSupplied;
	}

	public ims.domain.lookups.LookupInstance getSiteCd() {
		return siteCd;
	}
	public void setSiteCd(ims.domain.lookups.LookupInstance siteCd) {
		this.siteCd = siteCd;
	}

	public String getSiteText() {
		return siteText;
	}
	public void setSiteText(String siteText) {
		if ( null != siteText && siteText.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for siteText. Tried to set value: "+
				siteText);
		}
		this.siteText = siteText;
	}

	public ims.domain.lookups.LookupInstance getSpecimenSource() {
		return specimenSource;
	}
	public void setSpecimenSource(ims.domain.lookups.LookupInstance specimenSource) {
		this.specimenSource = specimenSource;
	}

	public java.util.List getLabSpecComments() {
		if ( null == labSpecComments ) {
			labSpecComments = new java.util.ArrayList();
		}
		return labSpecComments;
	}
	public void setLabSpecComments(java.util.List paramValue) {
		this.labSpecComments = paramValue;
	}

	public ims.core.clinical.domain.objects.Service getDiscipline() {
		return discipline;
	}
	public void setDiscipline(ims.core.clinical.domain.objects.Service discipline) {
		this.discipline = discipline;
	}

	public java.util.Set getInvestigations() {
		if ( null == investigations ) {
			investigations = new java.util.HashSet();
		}
		return investigations;
	}
	public void setInvestigations(java.util.Set paramValue) {
		this.investigations = paramValue;
	}

	public ims.ocrr.orderingresults.domain.objects.OcsOrderSession getOrder() {
		return order;
	}
	public void setOrder(ims.ocrr.orderingresults.domain.objects.OcsOrderSession order) {
		this.order = order;
	}

	public java.util.Set getContainers() {
		if ( null == containers ) {
			containers = new java.util.HashSet();
		}
		return containers;
	}
	public void setContainers(java.util.Set paramValue) {
		this.containers = paramValue;
	}

	public String getFillerOrdNum() {
		return fillerOrdNum;
	}
	public void setFillerOrdNum(String fillerOrdNum) {
		if ( null != fillerOrdNum && fillerOrdNum.length() > 20 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for fillerOrdNum. Tried to set value: "+
				fillerOrdNum);
		}
		this.fillerOrdNum = fillerOrdNum;
	}

	public String getCollectorComment() {
		return collectorComment;
	}
	public void setCollectorComment(String collectorComment) {
		if ( null != collectorComment && collectorComment.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for collectorComment. Tried to set value: "+
				collectorComment);
		}
		this.collectorComment = collectorComment;
	}

	public String getInstructionsToCollector() {
		return instructionsToCollector;
	}
	public void setInstructionsToCollector(String instructionsToCollector) {
		this.instructionsToCollector = instructionsToCollector;
	}

	public java.util.Set getSpecimenCollectionStatus() {
		if ( null == specimenCollectionStatus ) {
			specimenCollectionStatus = new java.util.HashSet();
		}
		return specimenCollectionStatus;
	}
	public void setSpecimenCollectionStatus(java.util.Set paramValue) {
		this.specimenCollectionStatus = paramValue;
	}

	public Boolean isWasProcessed() {
		return wasProcessed;
	}
	public void setWasProcessed(Boolean wasProcessed) {
		this.wasProcessed = wasProcessed;
	}

	public ims.domain.lookups.LookupInstance getRequestedType() {
		return requestedType;
	}
	public void setRequestedType(ims.domain.lookups.LookupInstance requestedType) {
		this.requestedType = requestedType;
	}

	public String getPlacerOrdNum() {
		return placerOrdNum;
	}
	public void setPlacerOrdNum(String placerOrdNum) {
		if ( null != placerOrdNum && placerOrdNum.length() > 20 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for placerOrdNum. Tried to set value: "+
				placerOrdNum);
		}
		this.placerOrdNum = placerOrdNum;
	}

	public Boolean isSaveComplete() {
		return saveComplete;
	}
	public void setSaveComplete(Boolean saveComplete) {
		this.saveComplete = saveComplete;
	}

	public java.util.Set getResultConclusionComments() {
		if ( null == resultConclusionComments ) {
			resultConclusionComments = new java.util.HashSet();
		}
		return resultConclusionComments;
	}
	public void setResultConclusionComments(java.util.Set paramValue) {
		this.resultConclusionComments = paramValue;
	}

	public java.util.Set getPathResult() {
		if ( null == pathResult ) {
			pathResult = new java.util.HashSet();
		}
		return pathResult;
	}
	public void setPathResult(java.util.Set paramValue) {
		this.pathResult = paramValue;
	}

	public java.util.Date getDftSpecimenResulted() {
		return dftSpecimenResulted;
	}
	public void setDftSpecimenResulted(java.util.Date dftSpecimenResulted) {
		this.dftSpecimenResulted = dftSpecimenResulted;
	}

	public Boolean isDftSpecimenResultedTimeSupplied() {
		return dftSpecimenResultedTimeSupplied;
	}
	public void setDftSpecimenResultedTimeSupplied(Boolean dftSpecimenResultedTimeSupplied) {
		this.dftSpecimenResultedTimeSupplied = dftSpecimenResultedTimeSupplied;
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
		
		auditStr.append("\r\n*collDateTimePlacer* :");
		auditStr.append(collDateTimePlacer);
	    auditStr.append("; ");
		auditStr.append("\r\n*collDateTimeFiller* :");
		auditStr.append(collDateTimeFiller);
	    auditStr.append("; ");
		auditStr.append("\r\n*colTimeFillerSupplied* :");
		auditStr.append(colTimeFillerSupplied);
	    auditStr.append("; ");
		auditStr.append("\r\n*collEndDateTimePlacer* :");
		auditStr.append(collEndDateTimePlacer);
	    auditStr.append("; ");
		auditStr.append("\r\n*collEndDateTimeFiller* :");
		auditStr.append(collEndDateTimeFiller);
	    auditStr.append("; ");
		auditStr.append("\r\n*collectingMos* :");
		if (collectingMos != null)
		{
			auditStr.append(toShortClassName(collectingMos));
				
		    auditStr.append(collectingMos.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isPatientCollect* :");
		auditStr.append(isPatientCollect);
	    auditStr.append("; ");
		auditStr.append("\r\n*isAwaitingCollection* :");
		auditStr.append(isAwaitingCollection);
	    auditStr.append("; ");
		auditStr.append("\r\n*receivedDateTime* :");
		auditStr.append(receivedDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*receivedTimeSupplied* :");
		auditStr.append(receivedTimeSupplied);
	    auditStr.append("; ");
		auditStr.append("\r\n*siteCd* :");
		if (siteCd != null)
			auditStr.append(siteCd.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*siteText* :");
		auditStr.append(siteText);
	    auditStr.append("; ");
		auditStr.append("\r\n*specimenSource* :");
		if (specimenSource != null)
			auditStr.append(specimenSource.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*labSpecComments* :");
		if (labSpecComments != null)
		{
		int i14=0;
		for (i14=0; i14<labSpecComments.size(); i14++)
		{
			if (i14 > 0)
				auditStr.append(",");
			ims.ocrr.orderingresults.domain.objects.ResultComment obj = (ims.ocrr.orderingresults.domain.objects.ResultComment)labSpecComments.get(i14);
		    if (obj != null)
			{
				if (i14 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i14 > 0)
			auditStr.append("] " + i14);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*discipline* :");
		if (discipline != null)
		{
			auditStr.append(toShortClassName(discipline));
				
		    auditStr.append(discipline.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*investigations* :");
		if (investigations != null)
		{
			java.util.Iterator it16 = investigations.iterator();
			int i16=0;
			while (it16.hasNext())
			{
				if (i16 > 0)
					auditStr.append(",");
				ims.ocrr.orderingresults.domain.objects.OrderInvestigation obj = (ims.ocrr.orderingresults.domain.objects.OrderInvestigation)it16.next();
		if (obj != null)
		{
		   if (i16 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i16++;
		}
		if (i16 > 0)
			auditStr.append("] " + i16);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*order* :");
		if (order != null)
		{
			auditStr.append(toShortClassName(order));
				
		    auditStr.append(order.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*containers* :");
		if (containers != null)
		{
			java.util.Iterator it18 = containers.iterator();
			int i18=0;
			while (it18.hasNext())
			{
				if (i18 > 0)
					auditStr.append(",");
				ims.ocrr.orderingresults.domain.objects.OrderSpecimenContainer obj = (ims.ocrr.orderingresults.domain.objects.OrderSpecimenContainer)it18.next();
		if (obj != null)
		{
		   if (i18 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i18++;
		}
		if (i18 > 0)
			auditStr.append("] " + i18);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*fillerOrdNum* :");
		auditStr.append(fillerOrdNum);
	    auditStr.append("; ");
		auditStr.append("\r\n*collectorComment* :");
		auditStr.append(collectorComment);
	    auditStr.append("; ");
		auditStr.append("\r\n*instructionsToCollector* :");
		auditStr.append(instructionsToCollector);
	    auditStr.append("; ");
		auditStr.append("\r\n*specimenCollectionStatus* :");
		if (specimenCollectionStatus != null)
		{
			java.util.Iterator it22 = specimenCollectionStatus.iterator();
			int i22=0;
			while (it22.hasNext())
			{
				if (i22 > 0)
					auditStr.append(",");
				ims.ocrr.orderingresults.domain.objects.SpecimenCollectionStatus obj = (ims.ocrr.orderingresults.domain.objects.SpecimenCollectionStatus)it22.next();
		if (obj != null)
		{
		   if (i22 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i22++;
		}
		if (i22 > 0)
			auditStr.append("] " + i22);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*wasProcessed* :");
		auditStr.append(wasProcessed);
	    auditStr.append("; ");
		auditStr.append("\r\n*requestedType* :");
		if (requestedType != null)
			auditStr.append(requestedType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*placerOrdNum* :");
		auditStr.append(placerOrdNum);
	    auditStr.append("; ");
		auditStr.append("\r\n*saveComplete* :");
		auditStr.append(saveComplete);
	    auditStr.append("; ");
		auditStr.append("\r\n*resultConclusionComments* :");
		if (resultConclusionComments != null)
		{
			java.util.Iterator it27 = resultConclusionComments.iterator();
			int i27=0;
			while (it27.hasNext())
			{
				if (i27 > 0)
					auditStr.append(",");
				ims.ocrr.orderingresults.domain.objects.ResultConclusionAndActionComment obj = (ims.ocrr.orderingresults.domain.objects.ResultConclusionAndActionComment)it27.next();
		if (obj != null)
		{
		   if (i27 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i27++;
		}
		if (i27 > 0)
			auditStr.append("] " + i27);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*pathResult* :");
		if (pathResult != null)
		{
			java.util.Iterator it28 = pathResult.iterator();
			int i28=0;
			while (it28.hasNext())
			{
				if (i28 > 0)
					auditStr.append(",");
				ims.ocrr.orderingresults.domain.objects.PathResultDetails obj = (ims.ocrr.orderingresults.domain.objects.PathResultDetails)it28.next();
		if (obj != null)
		{
		   if (i28 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i28++;
		}
		if (i28 > 0)
			auditStr.append("] " + i28);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*dftSpecimenResulted* :");
		auditStr.append(dftSpecimenResulted);
	    auditStr.append("; ");
		auditStr.append("\r\n*dftSpecimenResultedTimeSupplied* :");
		auditStr.append(dftSpecimenResultedTimeSupplied);
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
		
		String keyClassName = "OrderSpecimen";
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
		if (this.getCollDateTimePlacer() != null)
		{
			sb.append("<collDateTimePlacer>");
			sb.append(new ims.framework.utils.DateTime(this.getCollDateTimePlacer()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</collDateTimePlacer>");		
		}
		if (this.getCollDateTimeFiller() != null)
		{
			sb.append("<collDateTimeFiller>");
			sb.append(new ims.framework.utils.DateTime(this.getCollDateTimeFiller()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</collDateTimeFiller>");		
		}
		if (this.isColTimeFillerSupplied() != null)
		{
			sb.append("<colTimeFillerSupplied>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isColTimeFillerSupplied().toString()));
			sb.append("</colTimeFillerSupplied>");		
		}
		if (this.getCollEndDateTimePlacer() != null)
		{
			sb.append("<collEndDateTimePlacer>");
			sb.append(new ims.framework.utils.DateTime(this.getCollEndDateTimePlacer()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</collEndDateTimePlacer>");		
		}
		if (this.getCollEndDateTimeFiller() != null)
		{
			sb.append("<collEndDateTimeFiller>");
			sb.append(new ims.framework.utils.DateTime(this.getCollEndDateTimeFiller()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</collEndDateTimeFiller>");		
		}
		if (this.getCollectingMos() != null)
		{
			sb.append("<collectingMos>");
			sb.append(this.getCollectingMos().toXMLString(domMap)); 	
			sb.append("</collectingMos>");		
		}
		if (this.isIsPatientCollect() != null)
		{
			sb.append("<isPatientCollect>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsPatientCollect().toString()));
			sb.append("</isPatientCollect>");		
		}
		if (this.isIsAwaitingCollection() != null)
		{
			sb.append("<isAwaitingCollection>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsAwaitingCollection().toString()));
			sb.append("</isAwaitingCollection>");		
		}
		if (this.getReceivedDateTime() != null)
		{
			sb.append("<receivedDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getReceivedDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</receivedDateTime>");		
		}
		if (this.isReceivedTimeSupplied() != null)
		{
			sb.append("<receivedTimeSupplied>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isReceivedTimeSupplied().toString()));
			sb.append("</receivedTimeSupplied>");		
		}
		if (this.getSiteCd() != null)
		{
			sb.append("<siteCd>");
			sb.append(this.getSiteCd().toXMLString()); 
			sb.append("</siteCd>");		
		}
		if (this.getSiteText() != null)
		{
			sb.append("<siteText>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSiteText().toString()));
			sb.append("</siteText>");		
		}
		if (this.getSpecimenSource() != null)
		{
			sb.append("<specimenSource>");
			sb.append(this.getSpecimenSource().toXMLString()); 
			sb.append("</specimenSource>");		
		}
		if (this.getLabSpecComments() != null)
		{
			if (this.getLabSpecComments().size() > 0 )
			{
			sb.append("<labSpecComments>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getLabSpecComments(), domMap));
			sb.append("</labSpecComments>");		
			}
		}
		if (this.getDiscipline() != null)
		{
			sb.append("<discipline>");
			sb.append(this.getDiscipline().toXMLString(domMap)); 	
			sb.append("</discipline>");		
		}
		if (this.getInvestigations() != null)
		{
			if (this.getInvestigations().size() > 0 )
			{
			sb.append("<investigations>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getInvestigations(), domMap));
			sb.append("</investigations>");		
			}
		}
		if (this.getOrder() != null)
		{
			sb.append("<order>");
			sb.append(this.getOrder().toXMLString(domMap)); 	
			sb.append("</order>");		
		}
		if (this.getContainers() != null)
		{
			if (this.getContainers().size() > 0 )
			{
			sb.append("<containers>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getContainers(), domMap));
			sb.append("</containers>");		
			}
		}
		if (this.getFillerOrdNum() != null)
		{
			sb.append("<fillerOrdNum>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFillerOrdNum().toString()));
			sb.append("</fillerOrdNum>");		
		}
		if (this.getCollectorComment() != null)
		{
			sb.append("<collectorComment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCollectorComment().toString()));
			sb.append("</collectorComment>");		
		}
		if (this.getInstructionsToCollector() != null)
		{
			sb.append("<instructionsToCollector>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getInstructionsToCollector().toString()));
			sb.append("</instructionsToCollector>");		
		}
		if (this.getSpecimenCollectionStatus() != null)
		{
			if (this.getSpecimenCollectionStatus().size() > 0 )
			{
			sb.append("<specimenCollectionStatus>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getSpecimenCollectionStatus(), domMap));
			sb.append("</specimenCollectionStatus>");		
			}
		}
		if (this.isWasProcessed() != null)
		{
			sb.append("<wasProcessed>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWasProcessed().toString()));
			sb.append("</wasProcessed>");		
		}
		if (this.getRequestedType() != null)
		{
			sb.append("<requestedType>");
			sb.append(this.getRequestedType().toXMLString()); 
			sb.append("</requestedType>");		
		}
		if (this.getPlacerOrdNum() != null)
		{
			sb.append("<placerOrdNum>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPlacerOrdNum().toString()));
			sb.append("</placerOrdNum>");		
		}
		if (this.isSaveComplete() != null)
		{
			sb.append("<saveComplete>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isSaveComplete().toString()));
			sb.append("</saveComplete>");		
		}
		if (this.getResultConclusionComments() != null)
		{
			if (this.getResultConclusionComments().size() > 0 )
			{
			sb.append("<resultConclusionComments>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getResultConclusionComments(), domMap));
			sb.append("</resultConclusionComments>");		
			}
		}
		if (this.getPathResult() != null)
		{
			if (this.getPathResult().size() > 0 )
			{
			sb.append("<pathResult>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPathResult(), domMap));
			sb.append("</pathResult>");		
			}
		}
		if (this.getDftSpecimenResulted() != null)
		{
			sb.append("<dftSpecimenResulted>");
			sb.append(new ims.framework.utils.DateTime(this.getDftSpecimenResulted()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dftSpecimenResulted>");		
		}
		if (this.isDftSpecimenResultedTimeSupplied() != null)
		{
			sb.append("<dftSpecimenResultedTimeSupplied>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isDftSpecimenResultedTimeSupplied().toString()));
			sb.append("</dftSpecimenResultedTimeSupplied>");		
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
			OrderSpecimen domainObject = getOrderSpecimenfromXML(itemEl, factory, domMap);

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
			OrderSpecimen domainObject = getOrderSpecimenfromXML(itemEl, factory, domMap);

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
		
	public static OrderSpecimen getOrderSpecimenfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getOrderSpecimenfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static OrderSpecimen getOrderSpecimenfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!OrderSpecimen.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!OrderSpecimen.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the OrderSpecimen class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (OrderSpecimen)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(OrderSpecimen.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		OrderSpecimen ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (OrderSpecimen)factory.getImportedDomainObject(OrderSpecimen.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new OrderSpecimen();
		}
		String keyClassName = "OrderSpecimen";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (OrderSpecimen)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, OrderSpecimen obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("collDateTimePlacer");
		if(fldEl != null)
		{	
    		obj.setCollDateTimePlacer(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("collDateTimeFiller");
		if(fldEl != null)
		{	
    		obj.setCollDateTimeFiller(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("colTimeFillerSupplied");
		if(fldEl != null)
		{	
    		obj.setColTimeFillerSupplied(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("collEndDateTimePlacer");
		if(fldEl != null)
		{	
    		obj.setCollEndDateTimePlacer(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("collEndDateTimeFiller");
		if(fldEl != null)
		{	
    		obj.setCollEndDateTimeFiller(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("collectingMos");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCollectingMos(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isPatientCollect");
		if(fldEl != null)
		{	
    		obj.setIsPatientCollect(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isAwaitingCollection");
		if(fldEl != null)
		{	
    		obj.setIsAwaitingCollection(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("receivedDateTime");
		if(fldEl != null)
		{	
    		obj.setReceivedDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("receivedTimeSupplied");
		if(fldEl != null)
		{	
    		obj.setReceivedTimeSupplied(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("siteCd");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSiteCd(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("siteText");
		if(fldEl != null)
		{	
    		obj.setSiteText(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("specimenSource");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSpecimenSource(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("labSpecComments");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setLabSpecComments(ims.ocrr.orderingresults.domain.objects.ResultComment.fromListXMLString(fldEl, factory, obj.getLabSpecComments(), domMap));
		}
		fldEl = el.element("discipline");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setDiscipline(ims.core.clinical.domain.objects.Service.getServicefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("investigations");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setInvestigations(ims.ocrr.orderingresults.domain.objects.OrderInvestigation.fromSetXMLString(fldEl, factory, obj.getInvestigations(), domMap));
		}
		fldEl = el.element("order");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setOrder(ims.ocrr.orderingresults.domain.objects.OcsOrderSession.getOcsOrderSessionfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("containers");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setContainers(ims.ocrr.orderingresults.domain.objects.OrderSpecimenContainer.fromSetXMLString(fldEl, factory, obj.getContainers(), domMap));
		}
		fldEl = el.element("fillerOrdNum");
		if(fldEl != null)
		{	
    		obj.setFillerOrdNum(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("collectorComment");
		if(fldEl != null)
		{	
    		obj.setCollectorComment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("instructionsToCollector");
		if(fldEl != null)
		{	
    		obj.setInstructionsToCollector(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("specimenCollectionStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setSpecimenCollectionStatus(ims.ocrr.orderingresults.domain.objects.SpecimenCollectionStatus.fromSetXMLString(fldEl, factory, obj.getSpecimenCollectionStatus(), domMap));
		}
		fldEl = el.element("wasProcessed");
		if(fldEl != null)
		{	
    		obj.setWasProcessed(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("requestedType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRequestedType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("placerOrdNum");
		if(fldEl != null)
		{	
    		obj.setPlacerOrdNum(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("saveComplete");
		if(fldEl != null)
		{	
    		obj.setSaveComplete(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("resultConclusionComments");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setResultConclusionComments(ims.ocrr.orderingresults.domain.objects.ResultConclusionAndActionComment.fromSetXMLString(fldEl, factory, obj.getResultConclusionComments(), domMap));
		}
		fldEl = el.element("pathResult");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setPathResult(ims.ocrr.orderingresults.domain.objects.PathResultDetails.fromSetXMLString(fldEl, factory, obj.getPathResult(), domMap));
		}
		fldEl = el.element("dftSpecimenResulted");
		if(fldEl != null)
		{	
    		obj.setDftSpecimenResulted(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("dftSpecimenResultedTimeSupplied");
		if(fldEl != null)
		{	
    		obj.setDftSpecimenResultedTimeSupplied(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "labSpecComments"
		, "investigations"
		, "containers"
		, "specimenCollectionStatus"
		, "resultConclusionComments"
		, "pathResult"
		};
	}

	/**
	hasNewOrUpdatedResults
	*/
public boolean hasNewOrUpdatedResults()
{
	if(investigations != null)
	{
		java.util.Iterator i = investigations.iterator();
		while(i.hasNext())
		{
			ims.ocrr.orderingresults.domain.objects.OrderInvestigation investigation = (ims.ocrr.orderingresults.domain.objects.OrderInvestigation)i.next();
			
			if(investigation.hasNewOrUpdatedResults())
				return true;
		}
	}	
	
	return false;
}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String CollDateTimePlacer = "collDateTimePlacer";
		public static final String CollDateTimeFiller = "collDateTimeFiller";
		public static final String ColTimeFillerSupplied = "colTimeFillerSupplied";
		public static final String CollEndDateTimePlacer = "collEndDateTimePlacer";
		public static final String CollEndDateTimeFiller = "collEndDateTimeFiller";
		public static final String CollectingMos = "collectingMos";
		public static final String IsPatientCollect = "isPatientCollect";
		public static final String IsAwaitingCollection = "isAwaitingCollection";
		public static final String ReceivedDateTime = "receivedDateTime";
		public static final String ReceivedTimeSupplied = "receivedTimeSupplied";
		public static final String SiteCd = "siteCd";
		public static final String SiteText = "siteText";
		public static final String SpecimenSource = "specimenSource";
		public static final String LabSpecComments = "labSpecComments";
		public static final String Discipline = "discipline";
		public static final String Investigations = "investigations";
		public static final String Order = "order";
		public static final String Containers = "containers";
		public static final String FillerOrdNum = "fillerOrdNum";
		public static final String CollectorComment = "collectorComment";
		public static final String InstructionsToCollector = "instructionsToCollector";
		public static final String SpecimenCollectionStatus = "specimenCollectionStatus";
		public static final String WasProcessed = "wasProcessed";
		public static final String RequestedType = "requestedType";
		public static final String PlacerOrdNum = "placerOrdNum";
		public static final String SaveComplete = "saveComplete";
		public static final String ResultConclusionComments = "resultConclusionComments";
		public static final String PathResult = "pathResult";
		public static final String DftSpecimenResulted = "dftSpecimenResulted";
		public static final String DftSpecimenResultedTimeSupplied = "dftSpecimenResultedTimeSupplied";
	}
}

