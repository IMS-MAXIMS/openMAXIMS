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
package ims.nursing.assessment.domain.objects;

/**
 * 
 * @author Sinead McDermott
 * Generated.
 */


public class SkinComponent extends ims.nursing.assessment.domain.objects.AssessmentComponent implements java.io.Serializable {
	public static final int CLASSID = 1012100037;
	private static final long serialVersionUID = 1012100037L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Skin Condition
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List skinCondition;
	/** Bed Type */
	private ims.domain.lookups.LookupInstance bedType;
	/** Mattress Type */
	private ims.domain.lookups.LookupInstance mattressType;
	/** Chair Type */
	private ims.domain.lookups.LookupInstance chairType;
	/** Cushion Type */
	private ims.domain.lookups.LookupInstance cushionType;
	/** Frequency Of Turns */
	private ims.domain.lookups.LookupInstance frequencyOfTurns;
	/** Turns Performed By */
	private ims.domain.lookups.LookupInstance turnsPerformedBy;
	/** TurnType */
	private ims.domain.lookups.LookupInstance turnType;
	/** Patient turns
	  * Collection of ims.nursing.assessment.domain.objects.PatientTurns.
	  */
	private java.util.Set turns;
	/** Notes */
	private String notes;
	/** Skin Assessment */
	private ims.nursing.assessmenttools.domain.objects.SkinAssessment skinAssessment;
	/** Braden Scale */
	private ims.nursing.assessmenttools.domain.objects.BradenScale bradenScale;
	/** Braden Scale Score */
	private Integer bradenScaleScore;
	/** Waterlow Assessment */
	private ims.nursing.assessmenttools.domain.objects.Waterlow waterlow;
	/** Waterlow Score */
	private Integer waterlowScore;
    public SkinComponent (Integer id, int ver)
    {
    	super(id, ver);
    }
    public SkinComponent ()
    {
    	super();
    }
    public SkinComponent (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.nursing.assessment.domain.objects.SkinComponent.class;
	}


	public java.util.List getSkinCondition() {
		if ( null == skinCondition ) {
			skinCondition = new java.util.ArrayList();
		}
		return skinCondition;
	}
	public void setSkinCondition(java.util.List paramValue) {
		this.skinCondition = paramValue;
	}

	public ims.domain.lookups.LookupInstance getBedType() {
		return bedType;
	}
	public void setBedType(ims.domain.lookups.LookupInstance bedType) {
		this.bedType = bedType;
	}

	public ims.domain.lookups.LookupInstance getMattressType() {
		return mattressType;
	}
	public void setMattressType(ims.domain.lookups.LookupInstance mattressType) {
		this.mattressType = mattressType;
	}

	public ims.domain.lookups.LookupInstance getChairType() {
		return chairType;
	}
	public void setChairType(ims.domain.lookups.LookupInstance chairType) {
		this.chairType = chairType;
	}

	public ims.domain.lookups.LookupInstance getCushionType() {
		return cushionType;
	}
	public void setCushionType(ims.domain.lookups.LookupInstance cushionType) {
		this.cushionType = cushionType;
	}

	public ims.domain.lookups.LookupInstance getFrequencyOfTurns() {
		return frequencyOfTurns;
	}
	public void setFrequencyOfTurns(ims.domain.lookups.LookupInstance frequencyOfTurns) {
		this.frequencyOfTurns = frequencyOfTurns;
	}

	public ims.domain.lookups.LookupInstance getTurnsPerformedBy() {
		return turnsPerformedBy;
	}
	public void setTurnsPerformedBy(ims.domain.lookups.LookupInstance turnsPerformedBy) {
		this.turnsPerformedBy = turnsPerformedBy;
	}

	public ims.domain.lookups.LookupInstance getTurnType() {
		return turnType;
	}
	public void setTurnType(ims.domain.lookups.LookupInstance turnType) {
		this.turnType = turnType;
	}

	public java.util.Set getTurns() {
		if ( null == turns ) {
			turns = new java.util.HashSet();
		}
		return turns;
	}
	public void setTurns(java.util.Set paramValue) {
		this.turns = paramValue;
	}

	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		if ( null != notes && notes.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for notes. Tried to set value: "+
				notes);
		}
		this.notes = notes;
	}

	public ims.nursing.assessmenttools.domain.objects.SkinAssessment getSkinAssessment() {
		return skinAssessment;
	}
	public void setSkinAssessment(ims.nursing.assessmenttools.domain.objects.SkinAssessment skinAssessment) {
		this.skinAssessment = skinAssessment;
	}

	public ims.nursing.assessmenttools.domain.objects.BradenScale getBradenScale() {
		return bradenScale;
	}
	public void setBradenScale(ims.nursing.assessmenttools.domain.objects.BradenScale bradenScale) {
		this.bradenScale = bradenScale;
	}

	public Integer getBradenScaleScore() {
		return bradenScaleScore;
	}
	public void setBradenScaleScore(Integer bradenScaleScore) {
		this.bradenScaleScore = bradenScaleScore;
	}

	public ims.nursing.assessmenttools.domain.objects.Waterlow getWaterlow() {
		return waterlow;
	}
	public void setWaterlow(ims.nursing.assessmenttools.domain.objects.Waterlow waterlow) {
		this.waterlow = waterlow;
	}

	public Integer getWaterlowScore() {
		return waterlowScore;
	}
	public void setWaterlowScore(Integer waterlowScore) {
		this.waterlowScore = waterlowScore;
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
		
		auditStr.append(super.toAuditString());
		auditStr.append("\r\n*skinCondition* :");
		if (skinCondition != null)
		{
			java.util.Iterator it1 = skinCondition.iterator();
			int i1=0;
			while (it1.hasNext())
			{
				if (i1 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it1.next();
			auditStr.append(obj.getText());
			i1++;
		}
		if (i1 > 0)
			auditStr.append("] " + i1);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*bedType* :");
		if (bedType != null)
			auditStr.append(bedType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*mattressType* :");
		if (mattressType != null)
			auditStr.append(mattressType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*chairType* :");
		if (chairType != null)
			auditStr.append(chairType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*cushionType* :");
		if (cushionType != null)
			auditStr.append(cushionType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*frequencyOfTurns* :");
		if (frequencyOfTurns != null)
			auditStr.append(frequencyOfTurns.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*turnsPerformedBy* :");
		if (turnsPerformedBy != null)
			auditStr.append(turnsPerformedBy.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*turnType* :");
		if (turnType != null)
			auditStr.append(turnType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*turns* :");
		if (turns != null)
		{
			java.util.Iterator it9 = turns.iterator();
			int i9=0;
			while (it9.hasNext())
			{
				if (i9 > 0)
					auditStr.append(",");
				ims.nursing.assessment.domain.objects.PatientTurns obj = (ims.nursing.assessment.domain.objects.PatientTurns)it9.next();
		if (obj != null)
		{
		   if (i9 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i9++;
		}
		if (i9 > 0)
			auditStr.append("] " + i9);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*notes* :");
		auditStr.append(notes);
	    auditStr.append("; ");
		auditStr.append("\r\n*skinAssessment* :");
		if (skinAssessment != null)
		{
			auditStr.append(toShortClassName(skinAssessment));
				
		    auditStr.append(skinAssessment.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*bradenScale* :");
		if (bradenScale != null)
		{
			auditStr.append(toShortClassName(bradenScale));
				
		    auditStr.append(bradenScale.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*bradenScaleScore* :");
		auditStr.append(bradenScaleScore);
	    auditStr.append("; ");
		auditStr.append("\r\n*waterlow* :");
		if (waterlow != null)
		{
			auditStr.append(toShortClassName(waterlow));
				
		    auditStr.append(waterlow.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*waterlowScore* :");
		auditStr.append(waterlowScore);
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
		
		String keyClassName = "SkinComponent";
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
		sb.append(super.fieldsToXMLString(domMap));
		if (this.getSkinCondition() != null)
		{
			if (this.getSkinCondition().size() > 0 )
			{
			sb.append("<skinCondition>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getSkinCondition())); 
			sb.append("</skinCondition>");		
			}
		}
		if (this.getBedType() != null)
		{
			sb.append("<bedType>");
			sb.append(this.getBedType().toXMLString()); 
			sb.append("</bedType>");		
		}
		if (this.getMattressType() != null)
		{
			sb.append("<mattressType>");
			sb.append(this.getMattressType().toXMLString()); 
			sb.append("</mattressType>");		
		}
		if (this.getChairType() != null)
		{
			sb.append("<chairType>");
			sb.append(this.getChairType().toXMLString()); 
			sb.append("</chairType>");		
		}
		if (this.getCushionType() != null)
		{
			sb.append("<cushionType>");
			sb.append(this.getCushionType().toXMLString()); 
			sb.append("</cushionType>");		
		}
		if (this.getFrequencyOfTurns() != null)
		{
			sb.append("<frequencyOfTurns>");
			sb.append(this.getFrequencyOfTurns().toXMLString()); 
			sb.append("</frequencyOfTurns>");		
		}
		if (this.getTurnsPerformedBy() != null)
		{
			sb.append("<turnsPerformedBy>");
			sb.append(this.getTurnsPerformedBy().toXMLString()); 
			sb.append("</turnsPerformedBy>");		
		}
		if (this.getTurnType() != null)
		{
			sb.append("<turnType>");
			sb.append(this.getTurnType().toXMLString()); 
			sb.append("</turnType>");		
		}
		if (this.getTurns() != null)
		{
			if (this.getTurns().size() > 0 )
			{
			sb.append("<turns>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getTurns(), domMap));
			sb.append("</turns>");		
			}
		}
		if (this.getNotes() != null)
		{
			sb.append("<notes>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNotes().toString()));
			sb.append("</notes>");		
		}
		if (this.getSkinAssessment() != null)
		{
			sb.append("<skinAssessment>");
			sb.append(this.getSkinAssessment().toXMLString(domMap)); 	
			sb.append("</skinAssessment>");		
		}
		if (this.getBradenScale() != null)
		{
			sb.append("<bradenScale>");
			sb.append(this.getBradenScale().toXMLString(domMap)); 	
			sb.append("</bradenScale>");		
		}
		if (this.getBradenScaleScore() != null)
		{
			sb.append("<bradenScaleScore>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getBradenScaleScore().toString()));
			sb.append("</bradenScaleScore>");		
		}
		if (this.getWaterlow() != null)
		{
			sb.append("<waterlow>");
			sb.append(this.getWaterlow().toXMLString(domMap)); 	
			sb.append("</waterlow>");		
		}
		if (this.getWaterlowScore() != null)
		{
			sb.append("<waterlowScore>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getWaterlowScore().toString()));
			sb.append("</waterlowScore>");		
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
			SkinComponent domainObject = getSkinComponentfromXML(itemEl, factory, domMap);

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
			SkinComponent domainObject = getSkinComponentfromXML(itemEl, factory, domMap);

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
		
	public static SkinComponent getSkinComponentfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getSkinComponentfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static SkinComponent getSkinComponentfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!SkinComponent.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!SkinComponent.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the SkinComponent class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (SkinComponent)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(SkinComponent.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		SkinComponent ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (SkinComponent)factory.getImportedDomainObject(SkinComponent.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new SkinComponent();
		}
		String keyClassName = "SkinComponent";
		Class clz = ret.getClass().getSuperclass();
		while (!clz.equals(ims.domain.DomainObject.class))
		{
			int dotIndex = clz.getName().lastIndexOf(".") + 1;
			keyClassName = clz.getName().substring(dotIndex); 
			clz = clz.getSuperclass();
		}

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (SkinComponent)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, SkinComponent obj, java.util.HashMap domMap) throws Exception
	{
		ims.nursing.assessment.domain.objects.AssessmentComponent.fillFieldsfromXML(el, factory, obj, domMap);
		org.dom4j.Element fldEl;
		fldEl = el.element("skinCondition");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setSkinCondition(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getSkinCondition())); 
		}
		fldEl = el.element("bedType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setBedType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("mattressType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMattressType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("chairType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setChairType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("cushionType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCushionType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("frequencyOfTurns");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setFrequencyOfTurns(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("turnsPerformedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTurnsPerformedBy(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("turnType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTurnType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("turns");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setTurns(ims.nursing.assessment.domain.objects.PatientTurns.fromSetXMLString(fldEl, factory, obj.getTurns(), domMap));
		}
		fldEl = el.element("notes");
		if(fldEl != null)
		{	
    		obj.setNotes(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("skinAssessment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSkinAssessment(ims.nursing.assessmenttools.domain.objects.SkinAssessment.getSkinAssessmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("bradenScale");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setBradenScale(ims.nursing.assessmenttools.domain.objects.BradenScale.getBradenScalefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("bradenScaleScore");
		if(fldEl != null)
		{	
    		obj.setBradenScaleScore(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("waterlow");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setWaterlow(ims.nursing.assessmenttools.domain.objects.Waterlow.getWaterlowfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("waterlowScore");
		if(fldEl != null)
		{	
    		obj.setWaterlowScore(new Integer(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "skinCondition"
		, "turns"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String SkinCondition = "skinCondition";
		public static final String BedType = "bedType";
		public static final String MattressType = "mattressType";
		public static final String ChairType = "chairType";
		public static final String CushionType = "cushionType";
		public static final String FrequencyOfTurns = "frequencyOfTurns";
		public static final String TurnsPerformedBy = "turnsPerformedBy";
		public static final String TurnType = "turnType";
		public static final String Turns = "turns";
		public static final String Notes = "notes";
		public static final String SkinAssessment = "skinAssessment";
		public static final String BradenScale = "bradenScale";
		public static final String BradenScaleScore = "bradenScaleScore";
		public static final String Waterlow = "waterlow";
		public static final String WaterlowScore = "waterlowScore";
	}
}

