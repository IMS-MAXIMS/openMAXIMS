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


public class ElectrotherapyTensTreatment extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1019100017;
	private static final long serialVersionUID = 1019100017L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Area */
	private ims.domain.lookups.LookupInstance area;
	/** Laterality */
	private ims.domain.lookups.LookupInstance laterality;
	/** Model */
	private ims.domain.lookups.LookupInstance model;
	/** Serial Nr */
	private String serialNr;
	/** Protocol Followed? */
	private ims.domain.lookups.LookupInstance protocolFollowed;
	/** Mode */
	private ims.domain.lookups.LookupInstance mode;
	/** Pulse Rate (Hz) */
	private Integer pulseRate;
	/** Pulse Width (ms) */
	private Integer pulseWidth;
	/** Duration (mins) */
	private Integer duration;
	/** Daily Usage */
	private ims.domain.lookups.LookupInstance dailyUsage;
	/** Electrodes */
	private ims.domain.lookups.LookupInstance electrodes;
	/** Size */
	private ims.domain.lookups.LookupInstance size;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ElectrotherapyTensTreatment (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ElectrotherapyTensTreatment ()
    {
    	super();
    }
    public ElectrotherapyTensTreatment (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.therapies.treatment.domain.objects.ElectrotherapyTensTreatment.class;
	}


	public ims.domain.lookups.LookupInstance getArea() {
		return area;
	}
	public void setArea(ims.domain.lookups.LookupInstance area) {
		this.area = area;
	}

	public ims.domain.lookups.LookupInstance getLaterality() {
		return laterality;
	}
	public void setLaterality(ims.domain.lookups.LookupInstance laterality) {
		this.laterality = laterality;
	}

	public ims.domain.lookups.LookupInstance getModel() {
		return model;
	}
	public void setModel(ims.domain.lookups.LookupInstance model) {
		this.model = model;
	}

	public String getSerialNr() {
		return serialNr;
	}
	public void setSerialNr(String serialNr) {
		if ( null != serialNr && serialNr.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for serialNr. Tried to set value: "+
				serialNr);
		}
		this.serialNr = serialNr;
	}

	public ims.domain.lookups.LookupInstance getProtocolFollowed() {
		return protocolFollowed;
	}
	public void setProtocolFollowed(ims.domain.lookups.LookupInstance protocolFollowed) {
		this.protocolFollowed = protocolFollowed;
	}

	public ims.domain.lookups.LookupInstance getMode() {
		return mode;
	}
	public void setMode(ims.domain.lookups.LookupInstance mode) {
		this.mode = mode;
	}

	public Integer getPulseRate() {
		return pulseRate;
	}
	public void setPulseRate(Integer pulseRate) {
		this.pulseRate = pulseRate;
	}

	public Integer getPulseWidth() {
		return pulseWidth;
	}
	public void setPulseWidth(Integer pulseWidth) {
		this.pulseWidth = pulseWidth;
	}

	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public ims.domain.lookups.LookupInstance getDailyUsage() {
		return dailyUsage;
	}
	public void setDailyUsage(ims.domain.lookups.LookupInstance dailyUsage) {
		this.dailyUsage = dailyUsage;
	}

	public ims.domain.lookups.LookupInstance getElectrodes() {
		return electrodes;
	}
	public void setElectrodes(ims.domain.lookups.LookupInstance electrodes) {
		this.electrodes = electrodes;
	}

	public ims.domain.lookups.LookupInstance getSize() {
		return size;
	}
	public void setSize(ims.domain.lookups.LookupInstance size) {
		this.size = size;
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
		
		auditStr.append("\r\n*area* :");
		if (area != null)
			auditStr.append(area.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*laterality* :");
		if (laterality != null)
			auditStr.append(laterality.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*model* :");
		if (model != null)
			auditStr.append(model.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*serialNr* :");
		auditStr.append(serialNr);
	    auditStr.append("; ");
		auditStr.append("\r\n*protocolFollowed* :");
		if (protocolFollowed != null)
			auditStr.append(protocolFollowed.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*mode* :");
		if (mode != null)
			auditStr.append(mode.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*pulseRate* :");
		auditStr.append(pulseRate);
	    auditStr.append("; ");
		auditStr.append("\r\n*pulseWidth* :");
		auditStr.append(pulseWidth);
	    auditStr.append("; ");
		auditStr.append("\r\n*duration* :");
		auditStr.append(duration);
	    auditStr.append("; ");
		auditStr.append("\r\n*dailyUsage* :");
		if (dailyUsage != null)
			auditStr.append(dailyUsage.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*electrodes* :");
		if (electrodes != null)
			auditStr.append(electrodes.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*size* :");
		if (size != null)
			auditStr.append(size.getText());
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
		
		String keyClassName = "ElectrotherapyTensTreatment";
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
		if (this.getArea() != null)
		{
			sb.append("<area>");
			sb.append(this.getArea().toXMLString()); 
			sb.append("</area>");		
		}
		if (this.getLaterality() != null)
		{
			sb.append("<laterality>");
			sb.append(this.getLaterality().toXMLString()); 
			sb.append("</laterality>");		
		}
		if (this.getModel() != null)
		{
			sb.append("<model>");
			sb.append(this.getModel().toXMLString()); 
			sb.append("</model>");		
		}
		if (this.getSerialNr() != null)
		{
			sb.append("<serialNr>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSerialNr().toString()));
			sb.append("</serialNr>");		
		}
		if (this.getProtocolFollowed() != null)
		{
			sb.append("<protocolFollowed>");
			sb.append(this.getProtocolFollowed().toXMLString()); 
			sb.append("</protocolFollowed>");		
		}
		if (this.getMode() != null)
		{
			sb.append("<mode>");
			sb.append(this.getMode().toXMLString()); 
			sb.append("</mode>");		
		}
		if (this.getPulseRate() != null)
		{
			sb.append("<pulseRate>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPulseRate().toString()));
			sb.append("</pulseRate>");		
		}
		if (this.getPulseWidth() != null)
		{
			sb.append("<pulseWidth>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPulseWidth().toString()));
			sb.append("</pulseWidth>");		
		}
		if (this.getDuration() != null)
		{
			sb.append("<duration>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDuration().toString()));
			sb.append("</duration>");		
		}
		if (this.getDailyUsage() != null)
		{
			sb.append("<dailyUsage>");
			sb.append(this.getDailyUsage().toXMLString()); 
			sb.append("</dailyUsage>");		
		}
		if (this.getElectrodes() != null)
		{
			sb.append("<electrodes>");
			sb.append(this.getElectrodes().toXMLString()); 
			sb.append("</electrodes>");		
		}
		if (this.getSize() != null)
		{
			sb.append("<size>");
			sb.append(this.getSize().toXMLString()); 
			sb.append("</size>");		
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
			ElectrotherapyTensTreatment domainObject = getElectrotherapyTensTreatmentfromXML(itemEl, factory, domMap);

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
			ElectrotherapyTensTreatment domainObject = getElectrotherapyTensTreatmentfromXML(itemEl, factory, domMap);

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
		
	public static ElectrotherapyTensTreatment getElectrotherapyTensTreatmentfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getElectrotherapyTensTreatmentfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ElectrotherapyTensTreatment getElectrotherapyTensTreatmentfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ElectrotherapyTensTreatment.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ElectrotherapyTensTreatment.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ElectrotherapyTensTreatment class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ElectrotherapyTensTreatment)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ElectrotherapyTensTreatment.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ElectrotherapyTensTreatment ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ElectrotherapyTensTreatment)factory.getImportedDomainObject(ElectrotherapyTensTreatment.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ElectrotherapyTensTreatment();
		}
		String keyClassName = "ElectrotherapyTensTreatment";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ElectrotherapyTensTreatment)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ElectrotherapyTensTreatment obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("area");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setArea(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("laterality");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setLaterality(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("model");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setModel(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("serialNr");
		if(fldEl != null)
		{	
    		obj.setSerialNr(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("protocolFollowed");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setProtocolFollowed(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("mode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMode(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("pulseRate");
		if(fldEl != null)
		{	
    		obj.setPulseRate(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pulseWidth");
		if(fldEl != null)
		{	
    		obj.setPulseWidth(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("duration");
		if(fldEl != null)
		{	
    		obj.setDuration(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dailyUsage");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDailyUsage(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("electrodes");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setElectrodes(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("size");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSize(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		public static final String Area = "area";
		public static final String Laterality = "laterality";
		public static final String Model = "model";
		public static final String SerialNr = "serialNr";
		public static final String ProtocolFollowed = "protocolFollowed";
		public static final String Mode = "mode";
		public static final String PulseRate = "pulseRate";
		public static final String PulseWidth = "pulseWidth";
		public static final String Duration = "duration";
		public static final String DailyUsage = "dailyUsage";
		public static final String Electrodes = "electrodes";
		public static final String Size = "size";
	}
}

