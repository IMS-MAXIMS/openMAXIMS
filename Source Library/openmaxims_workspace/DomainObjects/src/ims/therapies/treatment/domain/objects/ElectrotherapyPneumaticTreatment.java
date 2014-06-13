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
package ims.therapies.treatment.domain.objects;

/**
 * 
 * @author Joan Heelan
 * Generated.
 */


public class ElectrotherapyPneumaticTreatment extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1019100025;
	private static final long serialVersionUID = 1019100025L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Machine Used */
	private ims.therapies.admin.domain.objects.TreatmentEquipmentConfig machineUsed;
	/** Starting Position */
	private ims.domain.lookups.LookupInstance startingPosition;
	/** Laterality */
	private ims.domain.lookups.LookupInstance laterality;
	/** Area */
	private ims.domain.lookups.LookupInstance area;
	/** Splints */
	private ims.domain.lookups.LookupInstance splints;
	/** Cycle */
	private ims.domain.lookups.LookupInstance cycle;
	/** Duration (mins) */
	private Integer duration;
	/** Pressure (mmHg) */
	private Integer pressure;
	/** Min Pressure (mmHg) */
	private Integer minPressure;
	/** Max Pressure (mmHg) */
	private Integer maxPressure;
	/** Inflation (min) */
	private Integer inflation;
	/** Rest Time (min) */
	private Integer restTime;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ElectrotherapyPneumaticTreatment (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ElectrotherapyPneumaticTreatment ()
    {
    	super();
    }
    public ElectrotherapyPneumaticTreatment (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.therapies.treatment.domain.objects.ElectrotherapyPneumaticTreatment.class;
	}


	public ims.therapies.admin.domain.objects.TreatmentEquipmentConfig getMachineUsed() {
		return machineUsed;
	}
	public void setMachineUsed(ims.therapies.admin.domain.objects.TreatmentEquipmentConfig machineUsed) {
		this.machineUsed = machineUsed;
	}

	public ims.domain.lookups.LookupInstance getStartingPosition() {
		return startingPosition;
	}
	public void setStartingPosition(ims.domain.lookups.LookupInstance startingPosition) {
		this.startingPosition = startingPosition;
	}

	public ims.domain.lookups.LookupInstance getLaterality() {
		return laterality;
	}
	public void setLaterality(ims.domain.lookups.LookupInstance laterality) {
		this.laterality = laterality;
	}

	public ims.domain.lookups.LookupInstance getArea() {
		return area;
	}
	public void setArea(ims.domain.lookups.LookupInstance area) {
		this.area = area;
	}

	public ims.domain.lookups.LookupInstance getSplints() {
		return splints;
	}
	public void setSplints(ims.domain.lookups.LookupInstance splints) {
		this.splints = splints;
	}

	public ims.domain.lookups.LookupInstance getCycle() {
		return cycle;
	}
	public void setCycle(ims.domain.lookups.LookupInstance cycle) {
		this.cycle = cycle;
	}

	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Integer getPressure() {
		return pressure;
	}
	public void setPressure(Integer pressure) {
		this.pressure = pressure;
	}

	public Integer getMinPressure() {
		return minPressure;
	}
	public void setMinPressure(Integer minPressure) {
		this.minPressure = minPressure;
	}

	public Integer getMaxPressure() {
		return maxPressure;
	}
	public void setMaxPressure(Integer maxPressure) {
		this.maxPressure = maxPressure;
	}

	public Integer getInflation() {
		return inflation;
	}
	public void setInflation(Integer inflation) {
		this.inflation = inflation;
	}

	public Integer getRestTime() {
		return restTime;
	}
	public void setRestTime(Integer restTime) {
		this.restTime = restTime;
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
		
		auditStr.append("\r\n*machineUsed* :");
		if (machineUsed != null)
		{
			auditStr.append(toShortClassName(machineUsed));
				
		    auditStr.append(machineUsed.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*startingPosition* :");
		if (startingPosition != null)
			auditStr.append(startingPosition.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*laterality* :");
		if (laterality != null)
			auditStr.append(laterality.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*area* :");
		if (area != null)
			auditStr.append(area.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*splints* :");
		if (splints != null)
			auditStr.append(splints.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*cycle* :");
		if (cycle != null)
			auditStr.append(cycle.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*duration* :");
		auditStr.append(duration);
	    auditStr.append("; ");
		auditStr.append("\r\n*pressure* :");
		auditStr.append(pressure);
	    auditStr.append("; ");
		auditStr.append("\r\n*minPressure* :");
		auditStr.append(minPressure);
	    auditStr.append("; ");
		auditStr.append("\r\n*maxPressure* :");
		auditStr.append(maxPressure);
	    auditStr.append("; ");
		auditStr.append("\r\n*inflation* :");
		auditStr.append(inflation);
	    auditStr.append("; ");
		auditStr.append("\r\n*restTime* :");
		auditStr.append(restTime);
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
		
		String keyClassName = "ElectrotherapyPneumaticTreatment";
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
		if (this.getMachineUsed() != null)
		{
			sb.append("<machineUsed>");
			sb.append(this.getMachineUsed().toXMLString(domMap)); 	
			sb.append("</machineUsed>");		
		}
		if (this.getStartingPosition() != null)
		{
			sb.append("<startingPosition>");
			sb.append(this.getStartingPosition().toXMLString()); 
			sb.append("</startingPosition>");		
		}
		if (this.getLaterality() != null)
		{
			sb.append("<laterality>");
			sb.append(this.getLaterality().toXMLString()); 
			sb.append("</laterality>");		
		}
		if (this.getArea() != null)
		{
			sb.append("<area>");
			sb.append(this.getArea().toXMLString()); 
			sb.append("</area>");		
		}
		if (this.getSplints() != null)
		{
			sb.append("<splints>");
			sb.append(this.getSplints().toXMLString()); 
			sb.append("</splints>");		
		}
		if (this.getCycle() != null)
		{
			sb.append("<cycle>");
			sb.append(this.getCycle().toXMLString()); 
			sb.append("</cycle>");		
		}
		if (this.getDuration() != null)
		{
			sb.append("<duration>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDuration().toString()));
			sb.append("</duration>");		
		}
		if (this.getPressure() != null)
		{
			sb.append("<pressure>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPressure().toString()));
			sb.append("</pressure>");		
		}
		if (this.getMinPressure() != null)
		{
			sb.append("<minPressure>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMinPressure().toString()));
			sb.append("</minPressure>");		
		}
		if (this.getMaxPressure() != null)
		{
			sb.append("<maxPressure>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMaxPressure().toString()));
			sb.append("</maxPressure>");		
		}
		if (this.getInflation() != null)
		{
			sb.append("<inflation>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getInflation().toString()));
			sb.append("</inflation>");		
		}
		if (this.getRestTime() != null)
		{
			sb.append("<restTime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRestTime().toString()));
			sb.append("</restTime>");		
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
			ElectrotherapyPneumaticTreatment domainObject = getElectrotherapyPneumaticTreatmentfromXML(itemEl, factory, domMap);

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
			ElectrotherapyPneumaticTreatment domainObject = getElectrotherapyPneumaticTreatmentfromXML(itemEl, factory, domMap);

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
		
	public static ElectrotherapyPneumaticTreatment getElectrotherapyPneumaticTreatmentfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getElectrotherapyPneumaticTreatmentfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ElectrotherapyPneumaticTreatment getElectrotherapyPneumaticTreatmentfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ElectrotherapyPneumaticTreatment.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ElectrotherapyPneumaticTreatment.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ElectrotherapyPneumaticTreatment class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ElectrotherapyPneumaticTreatment)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ElectrotherapyPneumaticTreatment.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ElectrotherapyPneumaticTreatment ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ElectrotherapyPneumaticTreatment)factory.getImportedDomainObject(ElectrotherapyPneumaticTreatment.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ElectrotherapyPneumaticTreatment();
		}
		String keyClassName = "ElectrotherapyPneumaticTreatment";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ElectrotherapyPneumaticTreatment)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ElectrotherapyPneumaticTreatment obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("machineUsed");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setMachineUsed(ims.therapies.admin.domain.objects.TreatmentEquipmentConfig.getTreatmentEquipmentConfigfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("startingPosition");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setStartingPosition(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("laterality");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setLaterality(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("area");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setArea(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("splints");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSplints(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("cycle");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCycle(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("duration");
		if(fldEl != null)
		{	
    		obj.setDuration(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pressure");
		if(fldEl != null)
		{	
    		obj.setPressure(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("minPressure");
		if(fldEl != null)
		{	
    		obj.setMinPressure(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("maxPressure");
		if(fldEl != null)
		{	
    		obj.setMaxPressure(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("inflation");
		if(fldEl != null)
		{	
    		obj.setInflation(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("restTime");
		if(fldEl != null)
		{	
    		obj.setRestTime(new Integer(fldEl.getTextTrim()));	
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
		public static final String MachineUsed = "machineUsed";
		public static final String StartingPosition = "startingPosition";
		public static final String Laterality = "laterality";
		public static final String Area = "area";
		public static final String Splints = "splints";
		public static final String Cycle = "cycle";
		public static final String Duration = "duration";
		public static final String Pressure = "pressure";
		public static final String MinPressure = "minPressure";
		public static final String MaxPressure = "maxPressure";
		public static final String Inflation = "inflation";
		public static final String RestTime = "restTime";
	}
}

