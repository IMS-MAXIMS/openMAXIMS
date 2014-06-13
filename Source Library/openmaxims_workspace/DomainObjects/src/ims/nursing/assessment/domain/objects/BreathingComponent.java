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


public class BreathingComponent extends ims.nursing.assessment.domain.objects.AssessmentComponent implements java.io.Serializable {
	public static final int CLASSID = 1012100010;
	private static final long serialVersionUID = 1012100010L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Difficulty Breathing */
	private ims.domain.lookups.LookupInstance difficultyBreathing;
	/** 
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List breathingDyspnoea;
	private ims.domain.lookups.LookupInstance acuteChronic;
	private ims.core.clinical.domain.objects.Smoking smoking;
	/** Breathing Medication
	  * Collection of ims.core.clinical.domain.objects.PatientMedication.
	  */
	private java.util.Set breathingMedication;
	private ims.nursing.assessment.domain.objects.BreathingCough breathingCough;
	/** Breathing Treatment - eg Chest Physio, Assisted Coughing
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List breathingTreatment;
	/** Ventilation Tracheostomy */
	private ims.core.vitals.domain.objects.VentilationTracheostomy ventilationTracheostomy;
    public BreathingComponent (Integer id, int ver)
    {
    	super(id, ver);
    }
    public BreathingComponent ()
    {
    	super();
    }
    public BreathingComponent (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.nursing.assessment.domain.objects.BreathingComponent.class;
	}


	public ims.domain.lookups.LookupInstance getDifficultyBreathing() {
		return difficultyBreathing;
	}
	public void setDifficultyBreathing(ims.domain.lookups.LookupInstance difficultyBreathing) {
		this.difficultyBreathing = difficultyBreathing;
	}

	public java.util.List getBreathingDyspnoea() {
		if ( null == breathingDyspnoea ) {
			breathingDyspnoea = new java.util.ArrayList();
		}
		return breathingDyspnoea;
	}
	public void setBreathingDyspnoea(java.util.List paramValue) {
		this.breathingDyspnoea = paramValue;
	}

	public ims.domain.lookups.LookupInstance getAcuteChronic() {
		return acuteChronic;
	}
	public void setAcuteChronic(ims.domain.lookups.LookupInstance acuteChronic) {
		this.acuteChronic = acuteChronic;
	}

	public ims.core.clinical.domain.objects.Smoking getSmoking() {
		return smoking;
	}
	public void setSmoking(ims.core.clinical.domain.objects.Smoking smoking) {
		this.smoking = smoking;
	}

	public java.util.Set getBreathingMedication() {
		if ( null == breathingMedication ) {
			breathingMedication = new java.util.HashSet();
		}
		return breathingMedication;
	}
	public void setBreathingMedication(java.util.Set paramValue) {
		this.breathingMedication = paramValue;
	}

	public ims.nursing.assessment.domain.objects.BreathingCough getBreathingCough() {
		return breathingCough;
	}
	public void setBreathingCough(ims.nursing.assessment.domain.objects.BreathingCough breathingCough) {
		this.breathingCough = breathingCough;
	}

	public java.util.List getBreathingTreatment() {
		if ( null == breathingTreatment ) {
			breathingTreatment = new java.util.ArrayList();
		}
		return breathingTreatment;
	}
	public void setBreathingTreatment(java.util.List paramValue) {
		this.breathingTreatment = paramValue;
	}

	public ims.core.vitals.domain.objects.VentilationTracheostomy getVentilationTracheostomy() {
		return ventilationTracheostomy;
	}
	public void setVentilationTracheostomy(ims.core.vitals.domain.objects.VentilationTracheostomy ventilationTracheostomy) {
		this.ventilationTracheostomy = ventilationTracheostomy;
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
		auditStr.append("\r\n*difficultyBreathing* :");
		if (difficultyBreathing != null)
			auditStr.append(difficultyBreathing.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*breathingDyspnoea* :");
		if (breathingDyspnoea != null)
		{
			java.util.Iterator it2 = breathingDyspnoea.iterator();
			int i2=0;
			while (it2.hasNext())
			{
				if (i2 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it2.next();
			auditStr.append(obj.getText());
			i2++;
		}
		if (i2 > 0)
			auditStr.append("] " + i2);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*acuteChronic* :");
		if (acuteChronic != null)
			auditStr.append(acuteChronic.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*smoking* :");
		if (smoking != null)
		{
			auditStr.append(toShortClassName(smoking));
				
		    auditStr.append(smoking.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*breathingMedication* :");
		if (breathingMedication != null)
		{
			java.util.Iterator it5 = breathingMedication.iterator();
			int i5=0;
			while (it5.hasNext())
			{
				if (i5 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.PatientMedication obj = (ims.core.clinical.domain.objects.PatientMedication)it5.next();
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
		auditStr.append("\r\n*breathingCough* :");
		if (breathingCough != null)
		{
			auditStr.append(toShortClassName(breathingCough));
				
		    auditStr.append(breathingCough.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*breathingTreatment* :");
		if (breathingTreatment != null)
		{
			java.util.Iterator it7 = breathingTreatment.iterator();
			int i7=0;
			while (it7.hasNext())
			{
				if (i7 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it7.next();
			auditStr.append(obj.getText());
			i7++;
		}
		if (i7 > 0)
			auditStr.append("] " + i7);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*ventilationTracheostomy* :");
		if (ventilationTracheostomy != null)
		{
			auditStr.append(toShortClassName(ventilationTracheostomy));
				
		    auditStr.append(ventilationTracheostomy.getId());
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
		
		String keyClassName = "BreathingComponent";
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
		if (this.getDifficultyBreathing() != null)
		{
			sb.append("<difficultyBreathing>");
			sb.append(this.getDifficultyBreathing().toXMLString()); 
			sb.append("</difficultyBreathing>");		
		}
		if (this.getBreathingDyspnoea() != null)
		{
			if (this.getBreathingDyspnoea().size() > 0 )
			{
			sb.append("<breathingDyspnoea>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getBreathingDyspnoea())); 
			sb.append("</breathingDyspnoea>");		
			}
		}
		if (this.getAcuteChronic() != null)
		{
			sb.append("<acuteChronic>");
			sb.append(this.getAcuteChronic().toXMLString()); 
			sb.append("</acuteChronic>");		
		}
		if (this.getSmoking() != null)
		{
			sb.append("<smoking>");
			sb.append(this.getSmoking().toXMLString(domMap)); 	
			sb.append("</smoking>");		
		}
		if (this.getBreathingMedication() != null)
		{
			if (this.getBreathingMedication().size() > 0 )
			{
			sb.append("<breathingMedication>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getBreathingMedication(), domMap));
			sb.append("</breathingMedication>");		
			}
		}
		if (this.getBreathingCough() != null)
		{
			sb.append("<breathingCough>");
			sb.append(this.getBreathingCough().toXMLString(domMap)); 	
			sb.append("</breathingCough>");		
		}
		if (this.getBreathingTreatment() != null)
		{
			if (this.getBreathingTreatment().size() > 0 )
			{
			sb.append("<breathingTreatment>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getBreathingTreatment())); 
			sb.append("</breathingTreatment>");		
			}
		}
		if (this.getVentilationTracheostomy() != null)
		{
			sb.append("<ventilationTracheostomy>");
			sb.append(this.getVentilationTracheostomy().toXMLString(domMap)); 	
			sb.append("</ventilationTracheostomy>");		
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
			BreathingComponent domainObject = getBreathingComponentfromXML(itemEl, factory, domMap);

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
			BreathingComponent domainObject = getBreathingComponentfromXML(itemEl, factory, domMap);

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
		
	public static BreathingComponent getBreathingComponentfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getBreathingComponentfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static BreathingComponent getBreathingComponentfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!BreathingComponent.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!BreathingComponent.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the BreathingComponent class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (BreathingComponent)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(BreathingComponent.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		BreathingComponent ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (BreathingComponent)factory.getImportedDomainObject(BreathingComponent.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new BreathingComponent();
		}
		String keyClassName = "BreathingComponent";
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
			return (BreathingComponent)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, BreathingComponent obj, java.util.HashMap domMap) throws Exception
	{
		ims.nursing.assessment.domain.objects.AssessmentComponent.fillFieldsfromXML(el, factory, obj, domMap);
		org.dom4j.Element fldEl;
		fldEl = el.element("difficultyBreathing");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDifficultyBreathing(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("breathingDyspnoea");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setBreathingDyspnoea(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getBreathingDyspnoea())); 
		}
		fldEl = el.element("acuteChronic");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAcuteChronic(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("smoking");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSmoking(ims.core.clinical.domain.objects.Smoking.getSmokingfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("breathingMedication");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setBreathingMedication(ims.core.clinical.domain.objects.PatientMedication.fromSetXMLString(fldEl, factory, obj.getBreathingMedication(), domMap));
		}
		fldEl = el.element("breathingCough");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setBreathingCough(ims.nursing.assessment.domain.objects.BreathingCough.getBreathingCoughfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("breathingTreatment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setBreathingTreatment(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getBreathingTreatment())); 
		}
		fldEl = el.element("ventilationTracheostomy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setVentilationTracheostomy(ims.core.vitals.domain.objects.VentilationTracheostomy.getVentilationTracheostomyfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "breathingDyspnoea"
		, "breathingMedication"
		, "breathingTreatment"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String DifficultyBreathing = "difficultyBreathing";
		public static final String BreathingDyspnoea = "breathingDyspnoea";
		public static final String AcuteChronic = "acuteChronic";
		public static final String Smoking = "smoking";
		public static final String BreathingMedication = "breathingMedication";
		public static final String BreathingCough = "breathingCough";
		public static final String BreathingTreatment = "breathingTreatment";
		public static final String VentilationTracheostomy = "ventilationTracheostomy";
	}
}

