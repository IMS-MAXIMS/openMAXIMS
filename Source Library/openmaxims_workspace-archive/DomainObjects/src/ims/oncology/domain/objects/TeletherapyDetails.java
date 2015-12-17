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
package ims.oncology.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class TeletherapyDetails extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1074100030;
	private static final long serialVersionUID = 1074100030L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Phase Details
	  * Collection of ims.oncology.domain.objects.TeletherapyPhase.
	  */
	private java.util.List phaseDetails;
	/** Teletherapy Prescription Point */
	private Integer perscriptionPoint;
	/** Total Actual Dose */
	private java.lang.Float actualDose;
	/** Total Actual Fractions */
	private Integer actualFractions;
	/** Total Actual Phases */
	private Integer actualPhases;
	/** ActualDuration */
	private Integer actualDuration;
	/** Anterior Split or Supraqclavicular details? */
	private ims.domain.lookups.LookupInstance anterior;
	/** Anterior Split or Supraqclavicular dose */
	private java.lang.Float anteriorDose;
	/** Anterior Split or Supraqclavicular fractions */
	private Integer anteriorFractions;
	/** Adjacent Fields? */
	private ims.domain.lookups.LookupInstance hasAdjacentFields;
	/** Adjacent Fields Details
	  * Collection of ims.oncology.domain.objects.AdjacentFieldPhase.
	  */
	private java.util.List adjacentFieldDetails;
	/** Retreatment? */
	private ims.domain.lookups.LookupInstance retreatment;
	/** Hyperfractionation */
	private ims.domain.lookups.LookupInstance hyperfractionation;
	/** Special Technique */
	private ims.domain.lookups.LookupInstance specialTechnique;
	/** Preoperative? */
	private ims.domain.lookups.LookupInstance preoperative;
	/** General Anaesthetic? */
	private ims.domain.lookups.LookupInstance generalAnaesthetic;
	/** Radiation Type */
	private ims.domain.lookups.LookupInstance beamType;
	/** BeamEnergy */
	private ims.domain.lookups.LookupInstance beamEnergy;
	/** NoOfFields */
	private ims.domain.lookups.LookupInstance noOfFields;
	/** ComplexityGroup */
	private ims.domain.lookups.LookupInstance complexityGroup;
	/** MultiplePlanning */
	private ims.domain.lookups.LookupInstance multiplePlanning;
	/** AnaestheticReq */
	private ims.domain.lookups.LookupInstance anaestheticReq;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public TeletherapyDetails (Integer id, int ver)
    {
    	super(id, ver);
    }
    public TeletherapyDetails ()
    {
    	super();
    }
    public TeletherapyDetails (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.oncology.domain.objects.TeletherapyDetails.class;
	}


	public java.util.List getPhaseDetails() {
		if ( null == phaseDetails ) {
			phaseDetails = new java.util.ArrayList();
		}
		return phaseDetails;
	}
	public void setPhaseDetails(java.util.List paramValue) {
		this.phaseDetails = paramValue;
	}

	public Integer getPerscriptionPoint() {
		return perscriptionPoint;
	}
	public void setPerscriptionPoint(Integer perscriptionPoint) {
		this.perscriptionPoint = perscriptionPoint;
	}

	public java.lang.Float getActualDose() {
		return actualDose;
	}
	public void setActualDose(java.lang.Float actualDose) {
		this.actualDose = actualDose;
	}

	public Integer getActualFractions() {
		return actualFractions;
	}
	public void setActualFractions(Integer actualFractions) {
		this.actualFractions = actualFractions;
	}

	public Integer getActualPhases() {
		return actualPhases;
	}
	public static java.util.List listTeletherapyDetailsByActualPhases(ims.domain.ILightweightDomainFactory factory, Integer val)
	{
		String hql = "from TeletherapyDetails c where c.actualPhases = :actualPhases";		
		return factory.find(hql, new String[]{"actualPhases"}, new Object[]{val});		
	}
	public void setActualPhases(Integer actualPhases) {
		this.actualPhases = actualPhases;
	}

	public Integer getActualDuration() {
		return actualDuration;
	}
	public void setActualDuration(Integer actualDuration) {
		this.actualDuration = actualDuration;
	}

	public ims.domain.lookups.LookupInstance getAnterior() {
		return anterior;
	}
	public void setAnterior(ims.domain.lookups.LookupInstance anterior) {
		this.anterior = anterior;
	}

	public java.lang.Float getAnteriorDose() {
		return anteriorDose;
	}
	public void setAnteriorDose(java.lang.Float anteriorDose) {
		this.anteriorDose = anteriorDose;
	}

	public Integer getAnteriorFractions() {
		return anteriorFractions;
	}
	public void setAnteriorFractions(Integer anteriorFractions) {
		this.anteriorFractions = anteriorFractions;
	}

	public ims.domain.lookups.LookupInstance getHasAdjacentFields() {
		return hasAdjacentFields;
	}
	public void setHasAdjacentFields(ims.domain.lookups.LookupInstance hasAdjacentFields) {
		this.hasAdjacentFields = hasAdjacentFields;
	}

	public java.util.List getAdjacentFieldDetails() {
		if ( null == adjacentFieldDetails ) {
			adjacentFieldDetails = new java.util.ArrayList();
		}
		return adjacentFieldDetails;
	}
	public void setAdjacentFieldDetails(java.util.List paramValue) {
		this.adjacentFieldDetails = paramValue;
	}

	public ims.domain.lookups.LookupInstance getRetreatment() {
		return retreatment;
	}
	public void setRetreatment(ims.domain.lookups.LookupInstance retreatment) {
		this.retreatment = retreatment;
	}

	public ims.domain.lookups.LookupInstance getHyperfractionation() {
		return hyperfractionation;
	}
	public void setHyperfractionation(ims.domain.lookups.LookupInstance hyperfractionation) {
		this.hyperfractionation = hyperfractionation;
	}

	public ims.domain.lookups.LookupInstance getSpecialTechnique() {
		return specialTechnique;
	}
	public void setSpecialTechnique(ims.domain.lookups.LookupInstance specialTechnique) {
		this.specialTechnique = specialTechnique;
	}

	public ims.domain.lookups.LookupInstance getPreoperative() {
		return preoperative;
	}
	public void setPreoperative(ims.domain.lookups.LookupInstance preoperative) {
		this.preoperative = preoperative;
	}

	public ims.domain.lookups.LookupInstance getGeneralAnaesthetic() {
		return generalAnaesthetic;
	}
	public void setGeneralAnaesthetic(ims.domain.lookups.LookupInstance generalAnaesthetic) {
		this.generalAnaesthetic = generalAnaesthetic;
	}

	public ims.domain.lookups.LookupInstance getBeamType() {
		return beamType;
	}
	public void setBeamType(ims.domain.lookups.LookupInstance beamType) {
		this.beamType = beamType;
	}

	public ims.domain.lookups.LookupInstance getBeamEnergy() {
		return beamEnergy;
	}
	public void setBeamEnergy(ims.domain.lookups.LookupInstance beamEnergy) {
		this.beamEnergy = beamEnergy;
	}

	public ims.domain.lookups.LookupInstance getNoOfFields() {
		return noOfFields;
	}
	public void setNoOfFields(ims.domain.lookups.LookupInstance noOfFields) {
		this.noOfFields = noOfFields;
	}

	public ims.domain.lookups.LookupInstance getComplexityGroup() {
		return complexityGroup;
	}
	public void setComplexityGroup(ims.domain.lookups.LookupInstance complexityGroup) {
		this.complexityGroup = complexityGroup;
	}

	public ims.domain.lookups.LookupInstance getMultiplePlanning() {
		return multiplePlanning;
	}
	public void setMultiplePlanning(ims.domain.lookups.LookupInstance multiplePlanning) {
		this.multiplePlanning = multiplePlanning;
	}

	public ims.domain.lookups.LookupInstance getAnaestheticReq() {
		return anaestheticReq;
	}
	public void setAnaestheticReq(ims.domain.lookups.LookupInstance anaestheticReq) {
		this.anaestheticReq = anaestheticReq;
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
		
		auditStr.append("\r\n*phaseDetails* :");
		if (phaseDetails != null)
		{
		int i1=0;
		for (i1=0; i1<phaseDetails.size(); i1++)
		{
			if (i1 > 0)
				auditStr.append(",");
			ims.oncology.domain.objects.TeletherapyPhase obj = (ims.oncology.domain.objects.TeletherapyPhase)phaseDetails.get(i1);
		    if (obj != null)
			{
				if (i1 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i1 > 0)
			auditStr.append("] " + i1);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*perscriptionPoint* :");
		auditStr.append(perscriptionPoint);
	    auditStr.append("; ");
		auditStr.append("\r\n*actualDose* :");
		auditStr.append(actualDose);
	    auditStr.append("; ");
		auditStr.append("\r\n*actualFractions* :");
		auditStr.append(actualFractions);
	    auditStr.append("; ");
		auditStr.append("\r\n*actualPhases* :");
		auditStr.append(actualPhases);
	    auditStr.append("; ");
		auditStr.append("\r\n*actualDuration* :");
		auditStr.append(actualDuration);
	    auditStr.append("; ");
		auditStr.append("\r\n*anterior* :");
		if (anterior != null)
			auditStr.append(anterior.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*anteriorDose* :");
		auditStr.append(anteriorDose);
	    auditStr.append("; ");
		auditStr.append("\r\n*anteriorFractions* :");
		auditStr.append(anteriorFractions);
	    auditStr.append("; ");
		auditStr.append("\r\n*hasAdjacentFields* :");
		if (hasAdjacentFields != null)
			auditStr.append(hasAdjacentFields.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*adjacentFieldDetails* :");
		if (adjacentFieldDetails != null)
		{
		int i11=0;
		for (i11=0; i11<adjacentFieldDetails.size(); i11++)
		{
			if (i11 > 0)
				auditStr.append(",");
			ims.oncology.domain.objects.AdjacentFieldPhase obj = (ims.oncology.domain.objects.AdjacentFieldPhase)adjacentFieldDetails.get(i11);
		    if (obj != null)
			{
				if (i11 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i11 > 0)
			auditStr.append("] " + i11);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*retreatment* :");
		if (retreatment != null)
			auditStr.append(retreatment.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*hyperfractionation* :");
		if (hyperfractionation != null)
			auditStr.append(hyperfractionation.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*specialTechnique* :");
		if (specialTechnique != null)
			auditStr.append(specialTechnique.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*preoperative* :");
		if (preoperative != null)
			auditStr.append(preoperative.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*generalAnaesthetic* :");
		if (generalAnaesthetic != null)
			auditStr.append(generalAnaesthetic.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*beamType* :");
		if (beamType != null)
			auditStr.append(beamType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*beamEnergy* :");
		if (beamEnergy != null)
			auditStr.append(beamEnergy.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*noOfFields* :");
		if (noOfFields != null)
			auditStr.append(noOfFields.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*complexityGroup* :");
		if (complexityGroup != null)
			auditStr.append(complexityGroup.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*multiplePlanning* :");
		if (multiplePlanning != null)
			auditStr.append(multiplePlanning.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*anaestheticReq* :");
		if (anaestheticReq != null)
			auditStr.append(anaestheticReq.getText());
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
		
		String keyClassName = "TeletherapyDetails";
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
		if (this.getPhaseDetails() != null)
		{
			if (this.getPhaseDetails().size() > 0 )
			{
			sb.append("<phaseDetails>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPhaseDetails(), domMap));
			sb.append("</phaseDetails>");		
			}
		}
		if (this.getPerscriptionPoint() != null)
		{
			sb.append("<perscriptionPoint>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPerscriptionPoint().toString()));
			sb.append("</perscriptionPoint>");		
		}
		if (this.getActualDose() != null)
		{
			sb.append("<actualDose>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getActualDose().toString()));
			sb.append("</actualDose>");		
		}
		if (this.getActualFractions() != null)
		{
			sb.append("<actualFractions>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getActualFractions().toString()));
			sb.append("</actualFractions>");		
		}
		if (this.getActualPhases() != null)
		{
			sb.append("<actualPhases>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getActualPhases().toString()));
			sb.append("</actualPhases>");		
		}
		if (this.getActualDuration() != null)
		{
			sb.append("<actualDuration>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getActualDuration().toString()));
			sb.append("</actualDuration>");		
		}
		if (this.getAnterior() != null)
		{
			sb.append("<anterior>");
			sb.append(this.getAnterior().toXMLString()); 
			sb.append("</anterior>");		
		}
		if (this.getAnteriorDose() != null)
		{
			sb.append("<anteriorDose>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAnteriorDose().toString()));
			sb.append("</anteriorDose>");		
		}
		if (this.getAnteriorFractions() != null)
		{
			sb.append("<anteriorFractions>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAnteriorFractions().toString()));
			sb.append("</anteriorFractions>");		
		}
		if (this.getHasAdjacentFields() != null)
		{
			sb.append("<hasAdjacentFields>");
			sb.append(this.getHasAdjacentFields().toXMLString()); 
			sb.append("</hasAdjacentFields>");		
		}
		if (this.getAdjacentFieldDetails() != null)
		{
			if (this.getAdjacentFieldDetails().size() > 0 )
			{
			sb.append("<adjacentFieldDetails>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAdjacentFieldDetails(), domMap));
			sb.append("</adjacentFieldDetails>");		
			}
		}
		if (this.getRetreatment() != null)
		{
			sb.append("<retreatment>");
			sb.append(this.getRetreatment().toXMLString()); 
			sb.append("</retreatment>");		
		}
		if (this.getHyperfractionation() != null)
		{
			sb.append("<hyperfractionation>");
			sb.append(this.getHyperfractionation().toXMLString()); 
			sb.append("</hyperfractionation>");		
		}
		if (this.getSpecialTechnique() != null)
		{
			sb.append("<specialTechnique>");
			sb.append(this.getSpecialTechnique().toXMLString()); 
			sb.append("</specialTechnique>");		
		}
		if (this.getPreoperative() != null)
		{
			sb.append("<preoperative>");
			sb.append(this.getPreoperative().toXMLString()); 
			sb.append("</preoperative>");		
		}
		if (this.getGeneralAnaesthetic() != null)
		{
			sb.append("<generalAnaesthetic>");
			sb.append(this.getGeneralAnaesthetic().toXMLString()); 
			sb.append("</generalAnaesthetic>");		
		}
		if (this.getBeamType() != null)
		{
			sb.append("<beamType>");
			sb.append(this.getBeamType().toXMLString()); 
			sb.append("</beamType>");		
		}
		if (this.getBeamEnergy() != null)
		{
			sb.append("<beamEnergy>");
			sb.append(this.getBeamEnergy().toXMLString()); 
			sb.append("</beamEnergy>");		
		}
		if (this.getNoOfFields() != null)
		{
			sb.append("<noOfFields>");
			sb.append(this.getNoOfFields().toXMLString()); 
			sb.append("</noOfFields>");		
		}
		if (this.getComplexityGroup() != null)
		{
			sb.append("<complexityGroup>");
			sb.append(this.getComplexityGroup().toXMLString()); 
			sb.append("</complexityGroup>");		
		}
		if (this.getMultiplePlanning() != null)
		{
			sb.append("<multiplePlanning>");
			sb.append(this.getMultiplePlanning().toXMLString()); 
			sb.append("</multiplePlanning>");		
		}
		if (this.getAnaestheticReq() != null)
		{
			sb.append("<anaestheticReq>");
			sb.append(this.getAnaestheticReq().toXMLString()); 
			sb.append("</anaestheticReq>");		
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
			TeletherapyDetails domainObject = getTeletherapyDetailsfromXML(itemEl, factory, domMap);

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
			TeletherapyDetails domainObject = getTeletherapyDetailsfromXML(itemEl, factory, domMap);

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
		
	public static TeletherapyDetails getTeletherapyDetailsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getTeletherapyDetailsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static TeletherapyDetails getTeletherapyDetailsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!TeletherapyDetails.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!TeletherapyDetails.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the TeletherapyDetails class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (TeletherapyDetails)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(TeletherapyDetails.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		TeletherapyDetails ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (TeletherapyDetails)factory.getImportedDomainObject(TeletherapyDetails.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new TeletherapyDetails();
		}
		String keyClassName = "TeletherapyDetails";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (TeletherapyDetails)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, TeletherapyDetails obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("phaseDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setPhaseDetails(ims.oncology.domain.objects.TeletherapyPhase.fromListXMLString(fldEl, factory, obj.getPhaseDetails(), domMap));
		}
		fldEl = el.element("perscriptionPoint");
		if(fldEl != null)
		{	
    		obj.setPerscriptionPoint(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("actualDose");
		if(fldEl != null)
		{	
    		obj.setActualDose(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("actualFractions");
		if(fldEl != null)
		{	
    		obj.setActualFractions(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("actualPhases");
		if(fldEl != null)
		{	
    		obj.setActualPhases(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("actualDuration");
		if(fldEl != null)
		{	
    		obj.setActualDuration(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("anterior");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAnterior(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("anteriorDose");
		if(fldEl != null)
		{	
    		obj.setAnteriorDose(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("anteriorFractions");
		if(fldEl != null)
		{	
    		obj.setAnteriorFractions(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hasAdjacentFields");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setHasAdjacentFields(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("adjacentFieldDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setAdjacentFieldDetails(ims.oncology.domain.objects.AdjacentFieldPhase.fromListXMLString(fldEl, factory, obj.getAdjacentFieldDetails(), domMap));
		}
		fldEl = el.element("retreatment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRetreatment(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("hyperfractionation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setHyperfractionation(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("specialTechnique");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSpecialTechnique(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("preoperative");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPreoperative(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("generalAnaesthetic");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setGeneralAnaesthetic(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("beamType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setBeamType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("beamEnergy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setBeamEnergy(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("noOfFields");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setNoOfFields(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("complexityGroup");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setComplexityGroup(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("multiplePlanning");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMultiplePlanning(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("anaestheticReq");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAnaestheticReq(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "phaseDetails"
		, "adjacentFieldDetails"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String PhaseDetails = "phaseDetails";
		public static final String PerscriptionPoint = "perscriptionPoint";
		public static final String ActualDose = "actualDose";
		public static final String ActualFractions = "actualFractions";
		public static final String ActualPhases = "actualPhases";
		public static final String ActualDuration = "actualDuration";
		public static final String Anterior = "anterior";
		public static final String AnteriorDose = "anteriorDose";
		public static final String AnteriorFractions = "anteriorFractions";
		public static final String HasAdjacentFields = "hasAdjacentFields";
		public static final String AdjacentFieldDetails = "adjacentFieldDetails";
		public static final String Retreatment = "retreatment";
		public static final String Hyperfractionation = "hyperfractionation";
		public static final String SpecialTechnique = "specialTechnique";
		public static final String Preoperative = "preoperative";
		public static final String GeneralAnaesthetic = "generalAnaesthetic";
		public static final String BeamType = "beamType";
		public static final String BeamEnergy = "beamEnergy";
		public static final String NoOfFields = "noOfFields";
		public static final String ComplexityGroup = "complexityGroup";
		public static final String MultiplePlanning = "multiplePlanning";
		public static final String AnaestheticReq = "anaestheticReq";
	}
}

