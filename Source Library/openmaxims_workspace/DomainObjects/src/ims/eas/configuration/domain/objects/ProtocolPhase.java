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
package ims.eas.configuration.domain.objects;

/**
 * 
 * @author Barbara Worwood
 * Generated.
 */


public class ProtocolPhase extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1114100004;
	private static final long serialVersionUID = 1114100004L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Name of this Phase */
	private ims.domain.lookups.LookupInstance phaseName;
	/** Dose Value output on Phase Grid */
	private java.lang.Float dose;
	/** Fractions output on Phase Grid */
	private Integer fractions;
	/** Days value output on Phase Grid */
	private Integer days;
	/** Energy value output on Phase Grid */
	private java.lang.Float energy;
	/** Unit associated with Energy Value */
	private ims.domain.lookups.LookupInstance units;
	/** Modality value output on phase grid */
	private ims.domain.lookups.LookupInstance modality;
	/** Whether this phase will automatically be selected on instantiation */
	private Boolean preferred;
	/** Active Phase */
	private Boolean active;
    public ProtocolPhase (Integer id, int ver)
    {
    	super(id, ver);
		isComponentClass=true;
    }
    public ProtocolPhase ()
    {
    	super();
		isComponentClass=true;
    }
    public ProtocolPhase (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
		isComponentClass=true;
    }
	public Class getRealDomainClass()
	{
		return ims.eas.configuration.domain.objects.ProtocolPhase.class;
	}


	public ims.domain.lookups.LookupInstance getPhaseName() {
		return phaseName;
	}
	public void setPhaseName(ims.domain.lookups.LookupInstance phaseName) {
		this.phaseName = phaseName;
	}

	public java.lang.Float getDose() {
		return dose;
	}
	public void setDose(java.lang.Float dose) {
		this.dose = dose;
	}

	public Integer getFractions() {
		return fractions;
	}
	public void setFractions(Integer fractions) {
		this.fractions = fractions;
	}

	public Integer getDays() {
		return days;
	}
	public void setDays(Integer days) {
		this.days = days;
	}

	public java.lang.Float getEnergy() {
		return energy;
	}
	public void setEnergy(java.lang.Float energy) {
		this.energy = energy;
	}

	public ims.domain.lookups.LookupInstance getUnits() {
		return units;
	}
	public void setUnits(ims.domain.lookups.LookupInstance units) {
		this.units = units;
	}

	public ims.domain.lookups.LookupInstance getModality() {
		return modality;
	}
	public void setModality(ims.domain.lookups.LookupInstance modality) {
		this.modality = modality;
	}

	public Boolean isPreferred() {
		return preferred;
	}
	public void setPreferred(Boolean preferred) {
		this.preferred = preferred;
	}

	public Boolean isActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
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
		
		auditStr.append("\r\n*phaseName* :");
		if (phaseName != null)
			auditStr.append(phaseName.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*dose* :");
		auditStr.append(dose);
	    auditStr.append("; ");
		auditStr.append("\r\n*fractions* :");
		auditStr.append(fractions);
	    auditStr.append("; ");
		auditStr.append("\r\n*days* :");
		auditStr.append(days);
	    auditStr.append("; ");
		auditStr.append("\r\n*energy* :");
		auditStr.append(energy);
	    auditStr.append("; ");
		auditStr.append("\r\n*units* :");
		if (units != null)
			auditStr.append(units.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*modality* :");
		if (modality != null)
			auditStr.append(modality.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*preferred* :");
		auditStr.append(preferred);
	    auditStr.append("; ");
		auditStr.append("\r\n*active* :");
		auditStr.append(active);
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
		sb.append(" source=\"" + ims.configuration.EnvironmentConfig.getImportExportSourceName() + "\" ");
		sb.append(" classVersion=\"" + this.getClassVersion() + "\" ");
		sb.append(" component=\"" + this.getIsComponentClass() + "\" >");
		
		if (domMap.get(this) == null)
		{
			domMap.put(this, this);
			sb.append(this.fieldsToXMLString(domMap));
		}
		sb.append("</class>");
		
		
		return sb.toString();
	}

	public String fieldsToXMLString(java.util.HashMap domMap)
	{
		StringBuffer sb = new StringBuffer();
		if (this.getPhaseName() != null)
		{
			sb.append("<phaseName>");
			sb.append(this.getPhaseName().toXMLString()); 
			sb.append("</phaseName>");		
		}
		if (this.getDose() != null)
		{
			sb.append("<dose>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDose().toString()));
			sb.append("</dose>");		
		}
		if (this.getFractions() != null)
		{
			sb.append("<fractions>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFractions().toString()));
			sb.append("</fractions>");		
		}
		if (this.getDays() != null)
		{
			sb.append("<days>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDays().toString()));
			sb.append("</days>");		
		}
		if (this.getEnergy() != null)
		{
			sb.append("<energy>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getEnergy().toString()));
			sb.append("</energy>");		
		}
		if (this.getUnits() != null)
		{
			sb.append("<units>");
			sb.append(this.getUnits().toXMLString()); 
			sb.append("</units>");		
		}
		if (this.getModality() != null)
		{
			sb.append("<modality>");
			sb.append(this.getModality().toXMLString()); 
			sb.append("</modality>");		
		}
		if (this.isPreferred() != null)
		{
			sb.append("<preferred>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isPreferred().toString()));
			sb.append("</preferred>");		
		}
		if (this.isActive() != null)
		{
			sb.append("<active>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isActive().toString()));
			sb.append("</active>");		
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
			ProtocolPhase domainObject = getProtocolPhasefromXML(itemEl, factory, domMap);

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
			ProtocolPhase domainObject = getProtocolPhasefromXML(itemEl, factory, domMap);

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
		
	public static ProtocolPhase getProtocolPhasefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getProtocolPhasefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ProtocolPhase getProtocolPhasefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ProtocolPhase.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ProtocolPhase.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ProtocolPhase class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ProtocolPhase)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ProtocolPhase.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ProtocolPhase ret = null;
		if (ret == null)
		{
			ret = new ProtocolPhase();
		}
		fillFieldsfromXML(el, factory, ret, domMap);
		return ret;
	}

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ProtocolPhase obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("phaseName");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPhaseName(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("dose");
		if(fldEl != null)
		{	
    		obj.setDose(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("fractions");
		if(fldEl != null)
		{	
    		obj.setFractions(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("days");
		if(fldEl != null)
		{	
    		obj.setDays(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("energy");
		if(fldEl != null)
		{	
    		obj.setEnergy(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("units");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setUnits(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("modality");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setModality(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("preferred");
		if(fldEl != null)
		{	
    		obj.setPreferred(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("active");
		if(fldEl != null)
		{	
    		obj.setActive(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		};
	}

	/**
	equals
	*/
public boolean equals(Object obj)
	{
		if (null == obj)
		{
			return false;
		}

		if (getId() == ((ProtocolPhase) obj).getId() && phaseName.getId() == ((ProtocolPhase) obj).getPhaseName().getId() && dose == ((ProtocolPhase) obj).getDose()
				&& fractions == ((ProtocolPhase) obj).getFractions() && days == ((ProtocolPhase) obj).getDays() && energy == ((ProtocolPhase) obj).getEnergy()
				&& (units != null && ((ProtocolPhase) obj).getUnits() != null && units.getId() == ((ProtocolPhase) obj).getUnits().getId())
				&& (modality != null && ((ProtocolPhase) obj).getModality() != null && modality.getId() == ((ProtocolPhase) obj).getModality().getId()) 
				&& preferred == ((ProtocolPhase) obj).isPreferred() &&  active == ((ProtocolPhase) obj).isActive())
			return true;

		return false;
	}


	/**
	toString
	*/
/**
	toString
	*/
	public String toString()
	{	
		StringBuffer objStr = new StringBuffer();
	
		if (getId() != null)
			objStr.append(getId() + "-");
		
		if (phaseName != null)
			objStr.append(phaseName.getText() + "-");

		if (dose != null)
			objStr.append(dose + "-");
		
		if (fractions != null)
			objStr.append(fractions + "-");

		if (days != null)
			objStr.append(days + "-");
		
		if (energy != null)
			objStr.append(energy + "-");
		
		if (units != null)
			objStr.append(units.getText());

		if (modality != null)
			objStr.append(modality.getText());

		
		return objStr.toString();
	}


	/**
	hashcode
	*/
public int hashCode()
	{
int returnValue = 0;
		if (getId() != null)
			returnValue = getId().hashCode()* 1001;

		if (getPhaseName() != null)
			returnValue += this.getPhaseName().hashCode() * 10001;

		return returnValue;		


	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String PhaseName = "phaseName";
		public static final String Dose = "dose";
		public static final String Fractions = "fractions";
		public static final String Days = "days";
		public static final String Energy = "energy";
		public static final String Units = "units";
		public static final String Modality = "modality";
		public static final String Preferred = "preferred";
		public static final String Active = "active";
	}
}

