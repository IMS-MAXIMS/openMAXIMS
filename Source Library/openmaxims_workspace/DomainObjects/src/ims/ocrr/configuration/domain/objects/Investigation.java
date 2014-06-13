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
package ims.ocrr.configuration.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class Investigation extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1058100001;
	private static final long serialVersionUID = 1058100001L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** ProviderInvCode */
	private String providerInvCode;
	/** ProviderService */
	private ims.ocrr.configuration.domain.objects.LocSvcProviderSys providerService;
	/** Colour */
	private ims.framework.utils.Color colour;
	/** PathInvDetails */
	private ims.ocrr.configuration.domain.objects.PathInvDetails pathInvDetails;
	/** ClinImagInvDetails */
	private ims.ocrr.configuration.domain.objects.ClinImagInvDetails clinImagInvDetails;
	/** AssocQuestionsInfo
	  * Collection of ims.ocrr.configuration.domain.objects.InvestigationQuestion.
	  */
	private java.util.List assocQuestions;
	/** AssocInvestigations
	  * Collection of ims.ocrr.configuration.domain.objects.Investigation.
	  */
	private java.util.Set assocInvestigations;
	/** HelpText
	  * Collection of ims.ocrr.configuration.domain.objects.HelpText.
	  */
	private java.util.List helpText;
	/** Ative Status */
	private ims.domain.lookups.LookupInstance activeStatus;
	/** SeparateOrder */
	private Boolean separateOrder;
	/** Investigation Index */
	private ims.ocrr.configuration.domain.objects.InvestigationIndex investigationIndex;
	/** Is this Investigation only available as an Add On to another Investigation */
	private Boolean isAddon;
	/** MinReorderPeriodVal */
	private Integer minReorderPeriodVal;
	/** MinReorderPeriodUnit */
	private ims.domain.lookups.LookupInstance minReorderPeriodUnit;
	/** FemaleMinReorderPeriodVal */
	private Integer femaleMinReorderPeriodVal;
	/** FemaleMinReorderPeriodUnit */
	private ims.domain.lookups.LookupInstance femaleMinReorderPeriodUnit;
	/** Investigation Type */
	private ims.domain.lookups.LookupInstance type;
	/** Investigation Event Type */
	private ims.domain.lookups.LookupInstance eventType;
	/** Number of label sets to be printed */
	private Integer noLabelSets;
	/** Expected Turnaround Measure */
	private ims.domain.lookups.LookupInstance turnaroundMeasure;
	/** Expected Turnaround Value */
	private Integer expectedTurnaround;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public Investigation (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Investigation ()
    {
    	super();
    }
    public Investigation (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.ocrr.configuration.domain.objects.Investigation.class;
	}


	public String getProviderInvCode() {
		return providerInvCode;
	}
	public void setProviderInvCode(String providerInvCode) {
		if ( null != providerInvCode && providerInvCode.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for providerInvCode. Tried to set value: "+
				providerInvCode);
		}
		this.providerInvCode = providerInvCode;
	}

	public ims.ocrr.configuration.domain.objects.LocSvcProviderSys getProviderService() {
		return providerService;
	}
	public void setProviderService(ims.ocrr.configuration.domain.objects.LocSvcProviderSys providerService) {
		this.providerService = providerService;
	}

	public ims.framework.utils.Color getColour() {
		return colour;
	}
	public void setColour(ims.framework.utils.Color colour) {
		this.colour = colour;
	}

	public ims.ocrr.configuration.domain.objects.PathInvDetails getPathInvDetails() {
		return pathInvDetails;
	}
	public void setPathInvDetails(ims.ocrr.configuration.domain.objects.PathInvDetails pathInvDetails) {
		this.pathInvDetails = pathInvDetails;
	}

	public ims.ocrr.configuration.domain.objects.ClinImagInvDetails getClinImagInvDetails() {
		return clinImagInvDetails;
	}
	public void setClinImagInvDetails(ims.ocrr.configuration.domain.objects.ClinImagInvDetails clinImagInvDetails) {
		this.clinImagInvDetails = clinImagInvDetails;
	}

	public java.util.List getAssocQuestions() {
		if ( null == assocQuestions ) {
			assocQuestions = new java.util.ArrayList();
		}
		return assocQuestions;
	}
	public void setAssocQuestions(java.util.List paramValue) {
		this.assocQuestions = paramValue;
	}

	public java.util.Set getAssocInvestigations() {
		if ( null == assocInvestigations ) {
			assocInvestigations = new java.util.HashSet();
		}
		return assocInvestigations;
	}
	public void setAssocInvestigations(java.util.Set paramValue) {
		this.assocInvestigations = paramValue;
	}

	public java.util.List getHelpText() {
		if ( null == helpText ) {
			helpText = new java.util.ArrayList();
		}
		return helpText;
	}
	public void setHelpText(java.util.List paramValue) {
		this.helpText = paramValue;
	}

	public ims.domain.lookups.LookupInstance getActiveStatus() {
		return activeStatus;
	}
	public void setActiveStatus(ims.domain.lookups.LookupInstance activeStatus) {
		this.activeStatus = activeStatus;
	}

	public Boolean isSeparateOrder() {
		return separateOrder;
	}
	public void setSeparateOrder(Boolean separateOrder) {
		this.separateOrder = separateOrder;
	}

	public ims.ocrr.configuration.domain.objects.InvestigationIndex getInvestigationIndex() {
		return investigationIndex;
	}
	public void setInvestigationIndex(ims.ocrr.configuration.domain.objects.InvestigationIndex investigationIndex) {
		this.investigationIndex = investigationIndex;
	}

	public Boolean isIsAddon() {
		return isAddon;
	}
	public void setIsAddon(Boolean isAddon) {
		this.isAddon = isAddon;
	}

	public Integer getMinReorderPeriodVal() {
		return minReorderPeriodVal;
	}
	public void setMinReorderPeriodVal(Integer minReorderPeriodVal) {
		this.minReorderPeriodVal = minReorderPeriodVal;
	}

	public ims.domain.lookups.LookupInstance getMinReorderPeriodUnit() {
		return minReorderPeriodUnit;
	}
	public void setMinReorderPeriodUnit(ims.domain.lookups.LookupInstance minReorderPeriodUnit) {
		this.minReorderPeriodUnit = minReorderPeriodUnit;
	}

	public Integer getFemaleMinReorderPeriodVal() {
		return femaleMinReorderPeriodVal;
	}
	public void setFemaleMinReorderPeriodVal(Integer femaleMinReorderPeriodVal) {
		this.femaleMinReorderPeriodVal = femaleMinReorderPeriodVal;
	}

	public ims.domain.lookups.LookupInstance getFemaleMinReorderPeriodUnit() {
		return femaleMinReorderPeriodUnit;
	}
	public void setFemaleMinReorderPeriodUnit(ims.domain.lookups.LookupInstance femaleMinReorderPeriodUnit) {
		this.femaleMinReorderPeriodUnit = femaleMinReorderPeriodUnit;
	}

	public ims.domain.lookups.LookupInstance getType() {
		return type;
	}
	public void setType(ims.domain.lookups.LookupInstance type) {
		this.type = type;
	}

	public ims.domain.lookups.LookupInstance getEventType() {
		return eventType;
	}
	public void setEventType(ims.domain.lookups.LookupInstance eventType) {
		this.eventType = eventType;
	}

	public Integer getNoLabelSets() {
		return noLabelSets;
	}
	public void setNoLabelSets(Integer noLabelSets) {
		this.noLabelSets = noLabelSets;
	}

	public ims.domain.lookups.LookupInstance getTurnaroundMeasure() {
		return turnaroundMeasure;
	}
	public void setTurnaroundMeasure(ims.domain.lookups.LookupInstance turnaroundMeasure) {
		this.turnaroundMeasure = turnaroundMeasure;
	}

	public Integer getExpectedTurnaround() {
		return expectedTurnaround;
	}
	public void setExpectedTurnaround(Integer expectedTurnaround) {
		this.expectedTurnaround = expectedTurnaround;
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
		if ( "Configuration".equals("Configuration") )
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
		
		auditStr.append("\r\n*providerInvCode* :");
		auditStr.append(providerInvCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*providerService* :");
		if (providerService != null)
		{
			auditStr.append(toShortClassName(providerService));
				
		    auditStr.append(providerService.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*colour* :");
		auditStr.append(colour);
	    auditStr.append("; ");
		auditStr.append("\r\n*pathInvDetails* :");
		if (pathInvDetails != null)
		{
			auditStr.append(toShortClassName(pathInvDetails));
				
		    auditStr.append(pathInvDetails.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*clinImagInvDetails* :");
		if (clinImagInvDetails != null)
		{
			auditStr.append(toShortClassName(clinImagInvDetails));
				
		    auditStr.append(clinImagInvDetails.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*assocQuestions* :");
		if (assocQuestions != null)
		{
		int i6=0;
		for (i6=0; i6<assocQuestions.size(); i6++)
		{
			if (i6 > 0)
				auditStr.append(",");
			ims.ocrr.configuration.domain.objects.InvestigationQuestion obj = (ims.ocrr.configuration.domain.objects.InvestigationQuestion)assocQuestions.get(i6);
		    if (obj != null)
			{
				if (i6 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i6 > 0)
			auditStr.append("] " + i6);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*assocInvestigations* :");
		if (assocInvestigations != null)
		{
			java.util.Iterator it7 = assocInvestigations.iterator();
			int i7=0;
			while (it7.hasNext())
			{
				if (i7 > 0)
					auditStr.append(",");
				ims.ocrr.configuration.domain.objects.Investigation obj = (ims.ocrr.configuration.domain.objects.Investigation)it7.next();
		if (obj != null)
		{
		   if (i7 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i7++;
		}
		if (i7 > 0)
			auditStr.append("] " + i7);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*helpText* :");
		if (helpText != null)
		{
		int i8=0;
		for (i8=0; i8<helpText.size(); i8++)
		{
			if (i8 > 0)
				auditStr.append(",");
			ims.ocrr.configuration.domain.objects.HelpText obj = (ims.ocrr.configuration.domain.objects.HelpText)helpText.get(i8);
		    if (obj != null)
			{
				if (i8 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i8 > 0)
			auditStr.append("] " + i8);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*activeStatus* :");
		if (activeStatus != null)
			auditStr.append(activeStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*separateOrder* :");
		auditStr.append(separateOrder);
	    auditStr.append("; ");
		auditStr.append("\r\n*investigationIndex* :");
		if (investigationIndex != null)
		{
			auditStr.append(toShortClassName(investigationIndex));
				
		    auditStr.append(investigationIndex.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isAddon* :");
		auditStr.append(isAddon);
	    auditStr.append("; ");
		auditStr.append("\r\n*minReorderPeriodVal* :");
		auditStr.append(minReorderPeriodVal);
	    auditStr.append("; ");
		auditStr.append("\r\n*minReorderPeriodUnit* :");
		if (minReorderPeriodUnit != null)
			auditStr.append(minReorderPeriodUnit.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*femaleMinReorderPeriodVal* :");
		auditStr.append(femaleMinReorderPeriodVal);
	    auditStr.append("; ");
		auditStr.append("\r\n*femaleMinReorderPeriodUnit* :");
		if (femaleMinReorderPeriodUnit != null)
			auditStr.append(femaleMinReorderPeriodUnit.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*type* :");
		if (type != null)
			auditStr.append(type.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*eventType* :");
		if (eventType != null)
			auditStr.append(eventType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*noLabelSets* :");
		auditStr.append(noLabelSets);
	    auditStr.append("; ");
		auditStr.append("\r\n*turnaroundMeasure* :");
		if (turnaroundMeasure != null)
			auditStr.append(turnaroundMeasure.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*expectedTurnaround* :");
		auditStr.append(expectedTurnaround);
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
		
		String keyClassName = "Investigation";
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
		if (this.getProviderInvCode() != null)
		{
			sb.append("<providerInvCode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getProviderInvCode().toString()));
			sb.append("</providerInvCode>");		
		}
		if (this.getProviderService() != null)
		{
			sb.append("<providerService>");
			sb.append(this.getProviderService().toXMLString(domMap)); 	
			sb.append("</providerService>");		
		}
		if (this.getColour() != null)
		{
			sb.append("<colour>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getColour().toString()));
			sb.append("</colour>");		
		}
		if (this.getPathInvDetails() != null)
		{
			sb.append("<pathInvDetails>");
			sb.append(this.getPathInvDetails().toXMLString(domMap)); 	
			sb.append("</pathInvDetails>");		
		}
		if (this.getClinImagInvDetails() != null)
		{
			sb.append("<clinImagInvDetails>");
			sb.append(this.getClinImagInvDetails().toXMLString(domMap)); 	
			sb.append("</clinImagInvDetails>");		
		}
		if (this.getAssocQuestions() != null)
		{
			if (this.getAssocQuestions().size() > 0 )
			{
			sb.append("<assocQuestions>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAssocQuestions(), domMap));
			sb.append("</assocQuestions>");		
			}
		}
		if (this.getAssocInvestigations() != null)
		{
			if (this.getAssocInvestigations().size() > 0 )
			{
			sb.append("<assocInvestigations>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAssocInvestigations(), domMap));
			sb.append("</assocInvestigations>");		
			}
		}
		if (this.getHelpText() != null)
		{
			if (this.getHelpText().size() > 0 )
			{
			sb.append("<helpText>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getHelpText(), domMap));
			sb.append("</helpText>");		
			}
		}
		if (this.getActiveStatus() != null)
		{
			sb.append("<activeStatus>");
			sb.append(this.getActiveStatus().toXMLString()); 
			sb.append("</activeStatus>");		
		}
		if (this.isSeparateOrder() != null)
		{
			sb.append("<separateOrder>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isSeparateOrder().toString()));
			sb.append("</separateOrder>");		
		}
		if (this.getInvestigationIndex() != null)
		{
			sb.append("<investigationIndex>");
			sb.append(this.getInvestigationIndex().toXMLString(domMap)); 	
			sb.append("</investigationIndex>");		
		}
		if (this.isIsAddon() != null)
		{
			sb.append("<isAddon>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsAddon().toString()));
			sb.append("</isAddon>");		
		}
		if (this.getMinReorderPeriodVal() != null)
		{
			sb.append("<minReorderPeriodVal>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMinReorderPeriodVal().toString()));
			sb.append("</minReorderPeriodVal>");		
		}
		if (this.getMinReorderPeriodUnit() != null)
		{
			sb.append("<minReorderPeriodUnit>");
			sb.append(this.getMinReorderPeriodUnit().toXMLString()); 
			sb.append("</minReorderPeriodUnit>");		
		}
		if (this.getFemaleMinReorderPeriodVal() != null)
		{
			sb.append("<femaleMinReorderPeriodVal>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFemaleMinReorderPeriodVal().toString()));
			sb.append("</femaleMinReorderPeriodVal>");		
		}
		if (this.getFemaleMinReorderPeriodUnit() != null)
		{
			sb.append("<femaleMinReorderPeriodUnit>");
			sb.append(this.getFemaleMinReorderPeriodUnit().toXMLString()); 
			sb.append("</femaleMinReorderPeriodUnit>");		
		}
		if (this.getType() != null)
		{
			sb.append("<type>");
			sb.append(this.getType().toXMLString()); 
			sb.append("</type>");		
		}
		if (this.getEventType() != null)
		{
			sb.append("<eventType>");
			sb.append(this.getEventType().toXMLString()); 
			sb.append("</eventType>");		
		}
		if (this.getNoLabelSets() != null)
		{
			sb.append("<noLabelSets>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNoLabelSets().toString()));
			sb.append("</noLabelSets>");		
		}
		if (this.getTurnaroundMeasure() != null)
		{
			sb.append("<turnaroundMeasure>");
			sb.append(this.getTurnaroundMeasure().toXMLString()); 
			sb.append("</turnaroundMeasure>");		
		}
		if (this.getExpectedTurnaround() != null)
		{
			sb.append("<expectedTurnaround>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getExpectedTurnaround().toString()));
			sb.append("</expectedTurnaround>");		
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
			Investigation domainObject = getInvestigationfromXML(itemEl, factory, domMap);

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
			Investigation domainObject = getInvestigationfromXML(itemEl, factory, domMap);

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
		
	public static Investigation getInvestigationfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getInvestigationfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Investigation getInvestigationfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Investigation.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Investigation.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Investigation class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Investigation)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Investigation.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Investigation ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Investigation)factory.getImportedDomainObject(Investigation.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Investigation();
		}
		String keyClassName = "Investigation";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Investigation)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Investigation obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("providerInvCode");
		if(fldEl != null)
		{	
    		obj.setProviderInvCode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("providerService");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setProviderService(ims.ocrr.configuration.domain.objects.LocSvcProviderSys.getLocSvcProviderSysfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("colour");
		if(fldEl != null)
		{	
    		obj.setColour(ims.framework.utils.Color.getColor(fldEl.getTextTrim()));		
		}
		fldEl = el.element("pathInvDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPathInvDetails(ims.ocrr.configuration.domain.objects.PathInvDetails.getPathInvDetailsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("clinImagInvDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClinImagInvDetails(ims.ocrr.configuration.domain.objects.ClinImagInvDetails.getClinImagInvDetailsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("assocQuestions");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setAssocQuestions(ims.ocrr.configuration.domain.objects.InvestigationQuestion.fromListXMLString(fldEl, factory, obj.getAssocQuestions(), domMap));
		}
		fldEl = el.element("assocInvestigations");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setAssocInvestigations(ims.ocrr.configuration.domain.objects.Investigation.fromSetXMLString(fldEl, factory, obj.getAssocInvestigations(), domMap));
		}
		fldEl = el.element("helpText");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setHelpText(ims.ocrr.configuration.domain.objects.HelpText.fromListXMLString(fldEl, factory, obj.getHelpText(), domMap));
		}
		fldEl = el.element("activeStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setActiveStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("separateOrder");
		if(fldEl != null)
		{	
    		obj.setSeparateOrder(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("investigationIndex");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setInvestigationIndex(ims.ocrr.configuration.domain.objects.InvestigationIndex.getInvestigationIndexfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isAddon");
		if(fldEl != null)
		{	
    		obj.setIsAddon(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("minReorderPeriodVal");
		if(fldEl != null)
		{	
    		obj.setMinReorderPeriodVal(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("minReorderPeriodUnit");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMinReorderPeriodUnit(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("femaleMinReorderPeriodVal");
		if(fldEl != null)
		{	
    		obj.setFemaleMinReorderPeriodVal(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("femaleMinReorderPeriodUnit");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setFemaleMinReorderPeriodUnit(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("type");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("eventType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setEventType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("noLabelSets");
		if(fldEl != null)
		{	
    		obj.setNoLabelSets(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("turnaroundMeasure");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTurnaroundMeasure(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("expectedTurnaround");
		if(fldEl != null)
		{	
    		obj.setExpectedTurnaround(new Integer(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "assocQuestions"
		, "assocInvestigations"
		, "helpText"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String ProviderInvCode = "providerInvCode";
		public static final String ProviderService = "providerService";
		public static final String Colour = "colour";
		public static final String PathInvDetails = "pathInvDetails";
		public static final String ClinImagInvDetails = "clinImagInvDetails";
		public static final String AssocQuestions = "assocQuestions";
		public static final String AssocInvestigations = "assocInvestigations";
		public static final String HelpText = "helpText";
		public static final String ActiveStatus = "activeStatus";
		public static final String SeparateOrder = "separateOrder";
		public static final String InvestigationIndex = "investigationIndex";
		public static final String IsAddon = "isAddon";
		public static final String MinReorderPeriodVal = "minReorderPeriodVal";
		public static final String MinReorderPeriodUnit = "minReorderPeriodUnit";
		public static final String FemaleMinReorderPeriodVal = "femaleMinReorderPeriodVal";
		public static final String FemaleMinReorderPeriodUnit = "femaleMinReorderPeriodUnit";
		public static final String Type = "type";
		public static final String EventType = "eventType";
		public static final String NoLabelSets = "noLabelSets";
		public static final String TurnaroundMeasure = "turnaroundMeasure";
		public static final String ExpectedTurnaround = "expectedTurnaround";
	}
}

