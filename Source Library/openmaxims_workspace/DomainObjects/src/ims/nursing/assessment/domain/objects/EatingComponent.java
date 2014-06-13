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


public class EatingComponent extends ims.nursing.assessment.domain.objects.AssessmentComponent implements java.io.Serializable {
	public static final int CLASSID = 1012100022;
	private static final long serialVersionUID = 1012100022L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** 
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List nutritionalMethod;
	/** 
	  * Collection of ims.nursing.assessment.domain.objects.EatingOralAssessment.
	  */
	private java.util.Set oralAssessment;
	private ims.domain.lookups.LookupInstance difficultiesWithSwallowing;
	/** 
	  * Collection of ims.nursing.assessment.domain.objects.EatingSwallowingDetails.
	  */
	private java.util.Set swallowing;
	/** 
	  * Collection of ims.nursing.assessment.domain.objects.EatingManualDexterity.
	  */
	private java.util.Set manualDexterity;
	private ims.domain.lookups.LookupInstance describeAppetite;
	private ims.domain.lookups.LookupInstance anySpecialDiet;
	private ims.domain.lookups.LookupInstance specialDiet;
	private String foodPatientLikes;
	private String foodPatientDislikes;
	private String foodPatientFavourite;
	private ims.domain.lookups.LookupInstance requireAssistance;
	private ims.nursing.assessmenttools.domain.objects.MiniNutritionalAssessment miniNutritionalAssessment;
	/** MNA Score */
	private java.lang.Float mNAScore;
    public EatingComponent (Integer id, int ver)
    {
    	super(id, ver);
    }
    public EatingComponent ()
    {
    	super();
    }
    public EatingComponent (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.nursing.assessment.domain.objects.EatingComponent.class;
	}


	public java.util.List getNutritionalMethod() {
		if ( null == nutritionalMethod ) {
			nutritionalMethod = new java.util.ArrayList();
		}
		return nutritionalMethod;
	}
	public void setNutritionalMethod(java.util.List paramValue) {
		this.nutritionalMethod = paramValue;
	}

	public java.util.Set getOralAssessment() {
		if ( null == oralAssessment ) {
			oralAssessment = new java.util.HashSet();
		}
		return oralAssessment;
	}
	public void setOralAssessment(java.util.Set paramValue) {
		this.oralAssessment = paramValue;
	}

	public ims.domain.lookups.LookupInstance getDifficultiesWithSwallowing() {
		return difficultiesWithSwallowing;
	}
	public void setDifficultiesWithSwallowing(ims.domain.lookups.LookupInstance difficultiesWithSwallowing) {
		this.difficultiesWithSwallowing = difficultiesWithSwallowing;
	}

	public java.util.Set getSwallowing() {
		if ( null == swallowing ) {
			swallowing = new java.util.HashSet();
		}
		return swallowing;
	}
	public void setSwallowing(java.util.Set paramValue) {
		this.swallowing = paramValue;
	}

	public java.util.Set getManualDexterity() {
		if ( null == manualDexterity ) {
			manualDexterity = new java.util.HashSet();
		}
		return manualDexterity;
	}
	public void setManualDexterity(java.util.Set paramValue) {
		this.manualDexterity = paramValue;
	}

	public ims.domain.lookups.LookupInstance getDescribeAppetite() {
		return describeAppetite;
	}
	public void setDescribeAppetite(ims.domain.lookups.LookupInstance describeAppetite) {
		this.describeAppetite = describeAppetite;
	}

	public ims.domain.lookups.LookupInstance getAnySpecialDiet() {
		return anySpecialDiet;
	}
	public void setAnySpecialDiet(ims.domain.lookups.LookupInstance anySpecialDiet) {
		this.anySpecialDiet = anySpecialDiet;
	}

	public ims.domain.lookups.LookupInstance getSpecialDiet() {
		return specialDiet;
	}
	public void setSpecialDiet(ims.domain.lookups.LookupInstance specialDiet) {
		this.specialDiet = specialDiet;
	}

	public String getFoodPatientLikes() {
		return foodPatientLikes;
	}
	public void setFoodPatientLikes(String foodPatientLikes) {
		this.foodPatientLikes = foodPatientLikes;
	}

	public String getFoodPatientDislikes() {
		return foodPatientDislikes;
	}
	public void setFoodPatientDislikes(String foodPatientDislikes) {
		this.foodPatientDislikes = foodPatientDislikes;
	}

	public String getFoodPatientFavourite() {
		return foodPatientFavourite;
	}
	public void setFoodPatientFavourite(String foodPatientFavourite) {
		this.foodPatientFavourite = foodPatientFavourite;
	}

	public ims.domain.lookups.LookupInstance getRequireAssistance() {
		return requireAssistance;
	}
	public void setRequireAssistance(ims.domain.lookups.LookupInstance requireAssistance) {
		this.requireAssistance = requireAssistance;
	}

	public ims.nursing.assessmenttools.domain.objects.MiniNutritionalAssessment getMiniNutritionalAssessment() {
		return miniNutritionalAssessment;
	}
	public void setMiniNutritionalAssessment(ims.nursing.assessmenttools.domain.objects.MiniNutritionalAssessment miniNutritionalAssessment) {
		this.miniNutritionalAssessment = miniNutritionalAssessment;
	}

	public java.lang.Float getMNAScore() {
		return mNAScore;
	}
	public void setMNAScore(java.lang.Float mNAScore) {
		this.mNAScore = mNAScore;
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
		auditStr.append("\r\n*nutritionalMethod* :");
		if (nutritionalMethod != null)
		{
			java.util.Iterator it1 = nutritionalMethod.iterator();
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
		auditStr.append("\r\n*oralAssessment* :");
		if (oralAssessment != null)
		{
			java.util.Iterator it2 = oralAssessment.iterator();
			int i2=0;
			while (it2.hasNext())
			{
				if (i2 > 0)
					auditStr.append(",");
				ims.nursing.assessment.domain.objects.EatingOralAssessment obj = (ims.nursing.assessment.domain.objects.EatingOralAssessment)it2.next();
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
		auditStr.append("\r\n*difficultiesWithSwallowing* :");
		if (difficultiesWithSwallowing != null)
			auditStr.append(difficultiesWithSwallowing.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*swallowing* :");
		if (swallowing != null)
		{
			java.util.Iterator it4 = swallowing.iterator();
			int i4=0;
			while (it4.hasNext())
			{
				if (i4 > 0)
					auditStr.append(",");
				ims.nursing.assessment.domain.objects.EatingSwallowingDetails obj = (ims.nursing.assessment.domain.objects.EatingSwallowingDetails)it4.next();
		if (obj != null)
		{
		   if (i4 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i4++;
		}
		if (i4 > 0)
			auditStr.append("] " + i4);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*manualDexterity* :");
		if (manualDexterity != null)
		{
			java.util.Iterator it5 = manualDexterity.iterator();
			int i5=0;
			while (it5.hasNext())
			{
				if (i5 > 0)
					auditStr.append(",");
				ims.nursing.assessment.domain.objects.EatingManualDexterity obj = (ims.nursing.assessment.domain.objects.EatingManualDexterity)it5.next();
		if (obj != null)
		{
		   if (i5 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i5++;
		}
		if (i5 > 0)
			auditStr.append("] " + i5);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*describeAppetite* :");
		if (describeAppetite != null)
			auditStr.append(describeAppetite.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*anySpecialDiet* :");
		if (anySpecialDiet != null)
			auditStr.append(anySpecialDiet.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*specialDiet* :");
		if (specialDiet != null)
			auditStr.append(specialDiet.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*foodPatientLikes* :");
		auditStr.append(foodPatientLikes);
	    auditStr.append("; ");
		auditStr.append("\r\n*foodPatientDislikes* :");
		auditStr.append(foodPatientDislikes);
	    auditStr.append("; ");
		auditStr.append("\r\n*foodPatientFavourite* :");
		auditStr.append(foodPatientFavourite);
	    auditStr.append("; ");
		auditStr.append("\r\n*requireAssistance* :");
		if (requireAssistance != null)
			auditStr.append(requireAssistance.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*miniNutritionalAssessment* :");
		if (miniNutritionalAssessment != null)
		{
			auditStr.append(toShortClassName(miniNutritionalAssessment));
				
		    auditStr.append(miniNutritionalAssessment.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*mNAScore* :");
		auditStr.append(mNAScore);
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
		
		String keyClassName = "EatingComponent";
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
		if (this.getNutritionalMethod() != null)
		{
			if (this.getNutritionalMethod().size() > 0 )
			{
			sb.append("<nutritionalMethod>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getNutritionalMethod())); 
			sb.append("</nutritionalMethod>");		
			}
		}
		if (this.getOralAssessment() != null)
		{
			if (this.getOralAssessment().size() > 0 )
			{
			sb.append("<oralAssessment>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getOralAssessment(), domMap));
			sb.append("</oralAssessment>");		
			}
		}
		if (this.getDifficultiesWithSwallowing() != null)
		{
			sb.append("<difficultiesWithSwallowing>");
			sb.append(this.getDifficultiesWithSwallowing().toXMLString()); 
			sb.append("</difficultiesWithSwallowing>");		
		}
		if (this.getSwallowing() != null)
		{
			if (this.getSwallowing().size() > 0 )
			{
			sb.append("<swallowing>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getSwallowing(), domMap));
			sb.append("</swallowing>");		
			}
		}
		if (this.getManualDexterity() != null)
		{
			if (this.getManualDexterity().size() > 0 )
			{
			sb.append("<manualDexterity>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getManualDexterity(), domMap));
			sb.append("</manualDexterity>");		
			}
		}
		if (this.getDescribeAppetite() != null)
		{
			sb.append("<describeAppetite>");
			sb.append(this.getDescribeAppetite().toXMLString()); 
			sb.append("</describeAppetite>");		
		}
		if (this.getAnySpecialDiet() != null)
		{
			sb.append("<anySpecialDiet>");
			sb.append(this.getAnySpecialDiet().toXMLString()); 
			sb.append("</anySpecialDiet>");		
		}
		if (this.getSpecialDiet() != null)
		{
			sb.append("<specialDiet>");
			sb.append(this.getSpecialDiet().toXMLString()); 
			sb.append("</specialDiet>");		
		}
		if (this.getFoodPatientLikes() != null)
		{
			sb.append("<foodPatientLikes>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFoodPatientLikes().toString()));
			sb.append("</foodPatientLikes>");		
		}
		if (this.getFoodPatientDislikes() != null)
		{
			sb.append("<foodPatientDislikes>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFoodPatientDislikes().toString()));
			sb.append("</foodPatientDislikes>");		
		}
		if (this.getFoodPatientFavourite() != null)
		{
			sb.append("<foodPatientFavourite>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFoodPatientFavourite().toString()));
			sb.append("</foodPatientFavourite>");		
		}
		if (this.getRequireAssistance() != null)
		{
			sb.append("<requireAssistance>");
			sb.append(this.getRequireAssistance().toXMLString()); 
			sb.append("</requireAssistance>");		
		}
		if (this.getMiniNutritionalAssessment() != null)
		{
			sb.append("<miniNutritionalAssessment>");
			sb.append(this.getMiniNutritionalAssessment().toXMLString(domMap)); 	
			sb.append("</miniNutritionalAssessment>");		
		}
		if (this.getMNAScore() != null)
		{
			sb.append("<mNAScore>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMNAScore().toString()));
			sb.append("</mNAScore>");		
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
			EatingComponent domainObject = getEatingComponentfromXML(itemEl, factory, domMap);

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
			EatingComponent domainObject = getEatingComponentfromXML(itemEl, factory, domMap);

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
		
	public static EatingComponent getEatingComponentfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getEatingComponentfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static EatingComponent getEatingComponentfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!EatingComponent.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!EatingComponent.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the EatingComponent class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (EatingComponent)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(EatingComponent.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		EatingComponent ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (EatingComponent)factory.getImportedDomainObject(EatingComponent.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new EatingComponent();
		}
		String keyClassName = "EatingComponent";
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
			return (EatingComponent)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, EatingComponent obj, java.util.HashMap domMap) throws Exception
	{
		ims.nursing.assessment.domain.objects.AssessmentComponent.fillFieldsfromXML(el, factory, obj, domMap);
		org.dom4j.Element fldEl;
		fldEl = el.element("nutritionalMethod");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setNutritionalMethod(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getNutritionalMethod())); 
		}
		fldEl = el.element("oralAssessment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setOralAssessment(ims.nursing.assessment.domain.objects.EatingOralAssessment.fromSetXMLString(fldEl, factory, obj.getOralAssessment(), domMap));
		}
		fldEl = el.element("difficultiesWithSwallowing");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDifficultiesWithSwallowing(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("swallowing");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setSwallowing(ims.nursing.assessment.domain.objects.EatingSwallowingDetails.fromSetXMLString(fldEl, factory, obj.getSwallowing(), domMap));
		}
		fldEl = el.element("manualDexterity");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setManualDexterity(ims.nursing.assessment.domain.objects.EatingManualDexterity.fromSetXMLString(fldEl, factory, obj.getManualDexterity(), domMap));
		}
		fldEl = el.element("describeAppetite");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDescribeAppetite(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("anySpecialDiet");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAnySpecialDiet(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("specialDiet");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSpecialDiet(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("foodPatientLikes");
		if(fldEl != null)
		{	
    		obj.setFoodPatientLikes(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("foodPatientDislikes");
		if(fldEl != null)
		{	
    		obj.setFoodPatientDislikes(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("foodPatientFavourite");
		if(fldEl != null)
		{	
    		obj.setFoodPatientFavourite(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("requireAssistance");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRequireAssistance(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("miniNutritionalAssessment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setMiniNutritionalAssessment(ims.nursing.assessmenttools.domain.objects.MiniNutritionalAssessment.getMiniNutritionalAssessmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("mNAScore");
		if(fldEl != null)
		{	
    		obj.setMNAScore(new java.lang.Float(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "nutritionalMethod"
		, "oralAssessment"
		, "swallowing"
		, "manualDexterity"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String NutritionalMethod = "nutritionalMethod";
		public static final String OralAssessment = "oralAssessment";
		public static final String DifficultiesWithSwallowing = "difficultiesWithSwallowing";
		public static final String Swallowing = "swallowing";
		public static final String ManualDexterity = "manualDexterity";
		public static final String DescribeAppetite = "describeAppetite";
		public static final String AnySpecialDiet = "anySpecialDiet";
		public static final String SpecialDiet = "specialDiet";
		public static final String FoodPatientLikes = "foodPatientLikes";
		public static final String FoodPatientDislikes = "foodPatientDislikes";
		public static final String FoodPatientFavourite = "foodPatientFavourite";
		public static final String RequireAssistance = "requireAssistance";
		public static final String MiniNutritionalAssessment = "miniNutritionalAssessment";
		public static final String MNAScore = "mNAScore";
	}
}

