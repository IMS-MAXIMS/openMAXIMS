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
package ims.coe.assessment.domain.objects;

/**
 * 
 * @author Sinead McDermott
 * Generated.
 */


public class SleepingMedication extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1012100040;
	private static final long serialVersionUID = 1012100040L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private ims.domain.lookups.LookupInstance sleepMedication;
	private String other;
	private ims.domain.lookups.LookupInstance route;
	private String dose;
	private ims.domain.lookups.LookupInstance frequency;
	private String takenWhen;
	private String effectiveFor;
	/** Allow the user to inactivate a record */
	private Boolean isCurrentlyActive;
    public SleepingMedication (Integer id, int ver)
    {
    	super(id, ver);
    }
    public SleepingMedication ()
    {
    	super();
    }
    public SleepingMedication (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.coe.assessment.domain.objects.SleepingMedication.class;
	}


	public ims.domain.lookups.LookupInstance getSleepMedication() {
		return sleepMedication;
	}
	public void setSleepMedication(ims.domain.lookups.LookupInstance sleepMedication) {
		this.sleepMedication = sleepMedication;
	}

	public String getOther() {
		return other;
	}
	public void setOther(String other) {
		this.other = other;
	}

	public ims.domain.lookups.LookupInstance getRoute() {
		return route;
	}
	public void setRoute(ims.domain.lookups.LookupInstance route) {
		this.route = route;
	}

	public String getDose() {
		return dose;
	}
	public void setDose(String dose) {
		this.dose = dose;
	}

	public ims.domain.lookups.LookupInstance getFrequency() {
		return frequency;
	}
	public void setFrequency(ims.domain.lookups.LookupInstance frequency) {
		this.frequency = frequency;
	}

	public String getTakenWhen() {
		return takenWhen;
	}
	public void setTakenWhen(String takenWhen) {
		this.takenWhen = takenWhen;
	}

	public String getEffectiveFor() {
		return effectiveFor;
	}
	public void setEffectiveFor(String effectiveFor) {
		this.effectiveFor = effectiveFor;
	}

	public Boolean isIsCurrentlyActive() {
		return isCurrentlyActive;
	}
	public void setIsCurrentlyActive(Boolean isCurrentlyActive) {
		this.isCurrentlyActive = isCurrentlyActive;
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
		
		auditStr.append("\r\n*sleepMedication* :");
		if (sleepMedication != null)
			auditStr.append(sleepMedication.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*other* :");
		auditStr.append(other);
	    auditStr.append("; ");
		auditStr.append("\r\n*route* :");
		if (route != null)
			auditStr.append(route.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*dose* :");
		auditStr.append(dose);
	    auditStr.append("; ");
		auditStr.append("\r\n*frequency* :");
		if (frequency != null)
			auditStr.append(frequency.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*takenWhen* :");
		auditStr.append(takenWhen);
	    auditStr.append("; ");
		auditStr.append("\r\n*effectiveFor* :");
		auditStr.append(effectiveFor);
	    auditStr.append("; ");
		auditStr.append("\r\n*isCurrentlyActive* :");
		auditStr.append(isCurrentlyActive);
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
		
		String keyClassName = "SleepingMedication";
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
		if (this.getSleepMedication() != null)
		{
			sb.append("<sleepMedication>");
			sb.append(this.getSleepMedication().toXMLString()); 
			sb.append("</sleepMedication>");		
		}
		if (this.getOther() != null)
		{
			sb.append("<other>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOther().toString()));
			sb.append("</other>");		
		}
		if (this.getRoute() != null)
		{
			sb.append("<route>");
			sb.append(this.getRoute().toXMLString()); 
			sb.append("</route>");		
		}
		if (this.getDose() != null)
		{
			sb.append("<dose>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDose().toString()));
			sb.append("</dose>");		
		}
		if (this.getFrequency() != null)
		{
			sb.append("<frequency>");
			sb.append(this.getFrequency().toXMLString()); 
			sb.append("</frequency>");		
		}
		if (this.getTakenWhen() != null)
		{
			sb.append("<takenWhen>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTakenWhen().toString()));
			sb.append("</takenWhen>");		
		}
		if (this.getEffectiveFor() != null)
		{
			sb.append("<effectiveFor>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getEffectiveFor().toString()));
			sb.append("</effectiveFor>");		
		}
		if (this.isIsCurrentlyActive() != null)
		{
			sb.append("<isCurrentlyActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsCurrentlyActive().toString()));
			sb.append("</isCurrentlyActive>");		
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
			SleepingMedication domainObject = getSleepingMedicationfromXML(itemEl, factory, domMap);

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
			SleepingMedication domainObject = getSleepingMedicationfromXML(itemEl, factory, domMap);

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
		
	public static SleepingMedication getSleepingMedicationfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getSleepingMedicationfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static SleepingMedication getSleepingMedicationfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!SleepingMedication.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!SleepingMedication.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the SleepingMedication class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (SleepingMedication)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(SleepingMedication.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		SleepingMedication ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (SleepingMedication)factory.getImportedDomainObject(SleepingMedication.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new SleepingMedication();
		}
		String keyClassName = "SleepingMedication";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (SleepingMedication)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, SleepingMedication obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("sleepMedication");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSleepMedication(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("other");
		if(fldEl != null)
		{	
    		obj.setOther(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("route");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRoute(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("dose");
		if(fldEl != null)
		{	
    		obj.setDose(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("frequency");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setFrequency(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("takenWhen");
		if(fldEl != null)
		{	
    		obj.setTakenWhen(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("effectiveFor");
		if(fldEl != null)
		{	
    		obj.setEffectiveFor(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isCurrentlyActive");
		if(fldEl != null)
		{	
    		obj.setIsCurrentlyActive(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String SleepMedication = "sleepMedication";
		public static final String Other = "other";
		public static final String Route = "route";
		public static final String Dose = "dose";
		public static final String Frequency = "frequency";
		public static final String TakenWhen = "takenWhen";
		public static final String EffectiveFor = "effectiveFor";
		public static final String IsCurrentlyActive = "isCurrentlyActive";
	}
}

