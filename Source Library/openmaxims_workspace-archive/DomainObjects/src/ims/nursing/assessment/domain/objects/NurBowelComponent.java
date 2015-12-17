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


public class NurBowelComponent extends ims.nursing.assessment.domain.objects.AssessmentComponent implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1015100018;
	private static final long serialVersionUID = 1015100018L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Usual Bowel Pattern */
	private ims.domain.lookups.LookupInstance usualBowelPattern;
	/** Time Of Day */
	private ims.domain.lookups.LookupInstance timeOfDay;
	/** Bowel Routine Performed In - location */
	private ims.domain.lookups.LookupInstance bowelRoutinePerformedIn;
	/** Bowel Routine Performed By */
	private ims.domain.lookups.LookupInstance bowelRoutinePerformedBy;
	/** Bowels Open Spontaneously */
	private ims.domain.lookups.LookupInstance bowelsOpenSpontaneously;
	/** Notes */
	private String notes;
	/** Bowel  Medication
	  * Collection of ims.core.clinical.domain.objects.PatientMedication.
	  */
	private java.util.Set bowelMedication;
	/** Ostomy Details */
	private ims.nursing.assessment.domain.objects.BowelOstomy ostomyDetails;
	/** Does the patient suffer from - diarrhoea / constipation
	  * Collection of ims.nursing.assessment.domain.objects.BowelDiarrhoeaConstipation.
	  */
	private java.util.Set sufferFrom;
	/** Bowel Regime
	  * Collection of ims.nursing.assessment.domain.objects.BowelRegime.
	  */
	private java.util.Set bowelRegime;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public NurBowelComponent (Integer id, int ver)
    {
    	super(id, ver);
    }
    public NurBowelComponent ()
    {
    	super();
    }
    public NurBowelComponent (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.nursing.assessment.domain.objects.NurBowelComponent.class;
	}


	public ims.domain.lookups.LookupInstance getUsualBowelPattern() {
		return usualBowelPattern;
	}
	public void setUsualBowelPattern(ims.domain.lookups.LookupInstance usualBowelPattern) {
		this.usualBowelPattern = usualBowelPattern;
	}

	public ims.domain.lookups.LookupInstance getTimeOfDay() {
		return timeOfDay;
	}
	public void setTimeOfDay(ims.domain.lookups.LookupInstance timeOfDay) {
		this.timeOfDay = timeOfDay;
	}

	public ims.domain.lookups.LookupInstance getBowelRoutinePerformedIn() {
		return bowelRoutinePerformedIn;
	}
	public void setBowelRoutinePerformedIn(ims.domain.lookups.LookupInstance bowelRoutinePerformedIn) {
		this.bowelRoutinePerformedIn = bowelRoutinePerformedIn;
	}

	public ims.domain.lookups.LookupInstance getBowelRoutinePerformedBy() {
		return bowelRoutinePerformedBy;
	}
	public void setBowelRoutinePerformedBy(ims.domain.lookups.LookupInstance bowelRoutinePerformedBy) {
		this.bowelRoutinePerformedBy = bowelRoutinePerformedBy;
	}

	public ims.domain.lookups.LookupInstance getBowelsOpenSpontaneously() {
		return bowelsOpenSpontaneously;
	}
	public void setBowelsOpenSpontaneously(ims.domain.lookups.LookupInstance bowelsOpenSpontaneously) {
		this.bowelsOpenSpontaneously = bowelsOpenSpontaneously;
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

	public java.util.Set getBowelMedication() {
		if ( null == bowelMedication ) {
			bowelMedication = new java.util.HashSet();
		}
		return bowelMedication;
	}
	public void setBowelMedication(java.util.Set paramValue) {
		this.bowelMedication = paramValue;
	}

	public ims.nursing.assessment.domain.objects.BowelOstomy getOstomyDetails() {
		return ostomyDetails;
	}
	public void setOstomyDetails(ims.nursing.assessment.domain.objects.BowelOstomy ostomyDetails) {
		this.ostomyDetails = ostomyDetails;
	}

	public java.util.Set getSufferFrom() {
		if ( null == sufferFrom ) {
			sufferFrom = new java.util.HashSet();
		}
		return sufferFrom;
	}
	public void setSufferFrom(java.util.Set paramValue) {
		this.sufferFrom = paramValue;
	}

	public java.util.Set getBowelRegime() {
		if ( null == bowelRegime ) {
			bowelRegime = new java.util.HashSet();
		}
		return bowelRegime;
	}
	public void setBowelRegime(java.util.Set paramValue) {
		this.bowelRegime = paramValue;
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
		
		auditStr.append(super.toAuditString());
		auditStr.append("\r\n*usualBowelPattern* :");
		if (usualBowelPattern != null)
			auditStr.append(usualBowelPattern.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*timeOfDay* :");
		if (timeOfDay != null)
			auditStr.append(timeOfDay.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*bowelRoutinePerformedIn* :");
		if (bowelRoutinePerformedIn != null)
			auditStr.append(bowelRoutinePerformedIn.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*bowelRoutinePerformedBy* :");
		if (bowelRoutinePerformedBy != null)
			auditStr.append(bowelRoutinePerformedBy.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*bowelsOpenSpontaneously* :");
		if (bowelsOpenSpontaneously != null)
			auditStr.append(bowelsOpenSpontaneously.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*notes* :");
		auditStr.append(notes);
	    auditStr.append("; ");
		auditStr.append("\r\n*bowelMedication* :");
		if (bowelMedication != null)
		{
			java.util.Iterator it7 = bowelMedication.iterator();
			int i7=0;
			while (it7.hasNext())
			{
				if (i7 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.PatientMedication obj = (ims.core.clinical.domain.objects.PatientMedication)it7.next();
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
		auditStr.append("\r\n*ostomyDetails* :");
		if (ostomyDetails != null)
		{
			auditStr.append(toShortClassName(ostomyDetails));
				
		    auditStr.append(ostomyDetails.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*sufferFrom* :");
		if (sufferFrom != null)
		{
			java.util.Iterator it9 = sufferFrom.iterator();
			int i9=0;
			while (it9.hasNext())
			{
				if (i9 > 0)
					auditStr.append(",");
				ims.nursing.assessment.domain.objects.BowelDiarrhoeaConstipation obj = (ims.nursing.assessment.domain.objects.BowelDiarrhoeaConstipation)it9.next();
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
		auditStr.append("\r\n*bowelRegime* :");
		if (bowelRegime != null)
		{
			java.util.Iterator it10 = bowelRegime.iterator();
			int i10=0;
			while (it10.hasNext())
			{
				if (i10 > 0)
					auditStr.append(",");
				ims.nursing.assessment.domain.objects.BowelRegime obj = (ims.nursing.assessment.domain.objects.BowelRegime)it10.next();
		if (obj != null)
		{
		   if (i10 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i10++;
		}
		if (i10 > 0)
			auditStr.append("] " + i10);
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
		
		String keyClassName = "NurBowelComponent";
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
		if (this.getUsualBowelPattern() != null)
		{
			sb.append("<usualBowelPattern>");
			sb.append(this.getUsualBowelPattern().toXMLString()); 
			sb.append("</usualBowelPattern>");		
		}
		if (this.getTimeOfDay() != null)
		{
			sb.append("<timeOfDay>");
			sb.append(this.getTimeOfDay().toXMLString()); 
			sb.append("</timeOfDay>");		
		}
		if (this.getBowelRoutinePerformedIn() != null)
		{
			sb.append("<bowelRoutinePerformedIn>");
			sb.append(this.getBowelRoutinePerformedIn().toXMLString()); 
			sb.append("</bowelRoutinePerformedIn>");		
		}
		if (this.getBowelRoutinePerformedBy() != null)
		{
			sb.append("<bowelRoutinePerformedBy>");
			sb.append(this.getBowelRoutinePerformedBy().toXMLString()); 
			sb.append("</bowelRoutinePerformedBy>");		
		}
		if (this.getBowelsOpenSpontaneously() != null)
		{
			sb.append("<bowelsOpenSpontaneously>");
			sb.append(this.getBowelsOpenSpontaneously().toXMLString()); 
			sb.append("</bowelsOpenSpontaneously>");		
		}
		if (this.getNotes() != null)
		{
			sb.append("<notes>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNotes().toString()));
			sb.append("</notes>");		
		}
		if (this.getBowelMedication() != null)
		{
			if (this.getBowelMedication().size() > 0 )
			{
			sb.append("<bowelMedication>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getBowelMedication(), domMap));
			sb.append("</bowelMedication>");		
			}
		}
		if (this.getOstomyDetails() != null)
		{
			sb.append("<ostomyDetails>");
			sb.append(this.getOstomyDetails().toXMLString(domMap)); 	
			sb.append("</ostomyDetails>");		
		}
		if (this.getSufferFrom() != null)
		{
			if (this.getSufferFrom().size() > 0 )
			{
			sb.append("<sufferFrom>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getSufferFrom(), domMap));
			sb.append("</sufferFrom>");		
			}
		}
		if (this.getBowelRegime() != null)
		{
			if (this.getBowelRegime().size() > 0 )
			{
			sb.append("<bowelRegime>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getBowelRegime(), domMap));
			sb.append("</bowelRegime>");		
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
			NurBowelComponent domainObject = getNurBowelComponentfromXML(itemEl, factory, domMap);

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
			NurBowelComponent domainObject = getNurBowelComponentfromXML(itemEl, factory, domMap);

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
		
	public static NurBowelComponent getNurBowelComponentfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getNurBowelComponentfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static NurBowelComponent getNurBowelComponentfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!NurBowelComponent.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!NurBowelComponent.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the NurBowelComponent class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (NurBowelComponent)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(NurBowelComponent.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		NurBowelComponent ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (NurBowelComponent)factory.getImportedDomainObject(NurBowelComponent.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new NurBowelComponent();
		}
		String keyClassName = "NurBowelComponent";
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
			return (NurBowelComponent)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, NurBowelComponent obj, java.util.HashMap domMap) throws Exception
	{
		ims.nursing.assessment.domain.objects.AssessmentComponent.fillFieldsfromXML(el, factory, obj, domMap);
		org.dom4j.Element fldEl;
		fldEl = el.element("usualBowelPattern");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setUsualBowelPattern(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("timeOfDay");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTimeOfDay(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("bowelRoutinePerformedIn");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setBowelRoutinePerformedIn(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("bowelRoutinePerformedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setBowelRoutinePerformedBy(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("bowelsOpenSpontaneously");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setBowelsOpenSpontaneously(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("notes");
		if(fldEl != null)
		{	
    		obj.setNotes(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("bowelMedication");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setBowelMedication(ims.core.clinical.domain.objects.PatientMedication.fromSetXMLString(fldEl, factory, obj.getBowelMedication(), domMap));
		}
		fldEl = el.element("ostomyDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setOstomyDetails(ims.nursing.assessment.domain.objects.BowelOstomy.getBowelOstomyfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("sufferFrom");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setSufferFrom(ims.nursing.assessment.domain.objects.BowelDiarrhoeaConstipation.fromSetXMLString(fldEl, factory, obj.getSufferFrom(), domMap));
		}
		fldEl = el.element("bowelRegime");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setBowelRegime(ims.nursing.assessment.domain.objects.BowelRegime.fromSetXMLString(fldEl, factory, obj.getBowelRegime(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "bowelMedication"
		, "sufferFrom"
		, "bowelRegime"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String UsualBowelPattern = "usualBowelPattern";
		public static final String TimeOfDay = "timeOfDay";
		public static final String BowelRoutinePerformedIn = "bowelRoutinePerformedIn";
		public static final String BowelRoutinePerformedBy = "bowelRoutinePerformedBy";
		public static final String BowelsOpenSpontaneously = "bowelsOpenSpontaneously";
		public static final String Notes = "notes";
		public static final String BowelMedication = "bowelMedication";
		public static final String OstomyDetails = "ostomyDetails";
		public static final String SufferFrom = "sufferFrom";
		public static final String BowelRegime = "bowelRegime";
	}
}

