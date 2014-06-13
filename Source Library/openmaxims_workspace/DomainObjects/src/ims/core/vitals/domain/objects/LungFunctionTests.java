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
package ims.core.vitals.domain.objects;

/**
 * 
 * @author Sinead McDermott
 * Generated.
 */


public class LungFunctionTests extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1022100006;
	private static final long serialVersionUID = 1022100006L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Peak Flow - Pre neb - int 0 - 1000 */
	private Integer peakFlowPre;
	/** Peak Flow - Post neb */
	private Integer peakFlowPost;
	/** Time Interval */
	private Integer timeInterval;
	/** Vital Capacity (VC) - litres */
	private java.lang.Float vitalCapacity;
	/** TidalVolume (TV) - ml/kg */
	private Integer tidalVolume;
	/** Incentive Spirometer - litres */
	private Integer incentiveSpirometer;
	/** Total Lung Capacity (TLC) - - litres */
	private Integer totalLungCapacity;
	/** Functional Residual Capacity (FRC) - litres */
	private Integer functionalResidualCapacity;
	/** Forced Expiratory Volume (FEV) - litres */
	private Integer forcedExpiratoryVolume;
	/** Forced Vital Capacity (FVC) */
	private Integer forcedVitalCapacity;
	/** Minute Respiratory Volume (MV) - litres */
	private Integer minuteVolume;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public LungFunctionTests (Integer id, int ver)
    {
    	super(id, ver);
    }
    public LungFunctionTests ()
    {
    	super();
    }
    public LungFunctionTests (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.vitals.domain.objects.LungFunctionTests.class;
	}


	public Integer getPeakFlowPre() {
		return peakFlowPre;
	}
	public void setPeakFlowPre(Integer peakFlowPre) {
		this.peakFlowPre = peakFlowPre;
	}

	public Integer getPeakFlowPost() {
		return peakFlowPost;
	}
	public void setPeakFlowPost(Integer peakFlowPost) {
		this.peakFlowPost = peakFlowPost;
	}

	public Integer getTimeInterval() {
		return timeInterval;
	}
	public void setTimeInterval(Integer timeInterval) {
		this.timeInterval = timeInterval;
	}

	public java.lang.Float getVitalCapacity() {
		return vitalCapacity;
	}
	public void setVitalCapacity(java.lang.Float vitalCapacity) {
		this.vitalCapacity = vitalCapacity;
	}

	public Integer getTidalVolume() {
		return tidalVolume;
	}
	public void setTidalVolume(Integer tidalVolume) {
		this.tidalVolume = tidalVolume;
	}

	public Integer getIncentiveSpirometer() {
		return incentiveSpirometer;
	}
	public void setIncentiveSpirometer(Integer incentiveSpirometer) {
		this.incentiveSpirometer = incentiveSpirometer;
	}

	public Integer getTotalLungCapacity() {
		return totalLungCapacity;
	}
	public void setTotalLungCapacity(Integer totalLungCapacity) {
		this.totalLungCapacity = totalLungCapacity;
	}

	public Integer getFunctionalResidualCapacity() {
		return functionalResidualCapacity;
	}
	public void setFunctionalResidualCapacity(Integer functionalResidualCapacity) {
		this.functionalResidualCapacity = functionalResidualCapacity;
	}

	public Integer getForcedExpiratoryVolume() {
		return forcedExpiratoryVolume;
	}
	public void setForcedExpiratoryVolume(Integer forcedExpiratoryVolume) {
		this.forcedExpiratoryVolume = forcedExpiratoryVolume;
	}

	public Integer getForcedVitalCapacity() {
		return forcedVitalCapacity;
	}
	public void setForcedVitalCapacity(Integer forcedVitalCapacity) {
		this.forcedVitalCapacity = forcedVitalCapacity;
	}

	public Integer getMinuteVolume() {
		return minuteVolume;
	}
	public void setMinuteVolume(Integer minuteVolume) {
		this.minuteVolume = minuteVolume;
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
		
		auditStr.append("\r\n*peakFlowPre* :");
		auditStr.append(peakFlowPre);
	    auditStr.append("; ");
		auditStr.append("\r\n*peakFlowPost* :");
		auditStr.append(peakFlowPost);
	    auditStr.append("; ");
		auditStr.append("\r\n*timeInterval* :");
		auditStr.append(timeInterval);
	    auditStr.append("; ");
		auditStr.append("\r\n*vitalCapacity* :");
		auditStr.append(vitalCapacity);
	    auditStr.append("; ");
		auditStr.append("\r\n*tidalVolume* :");
		auditStr.append(tidalVolume);
	    auditStr.append("; ");
		auditStr.append("\r\n*incentiveSpirometer* :");
		auditStr.append(incentiveSpirometer);
	    auditStr.append("; ");
		auditStr.append("\r\n*totalLungCapacity* :");
		auditStr.append(totalLungCapacity);
	    auditStr.append("; ");
		auditStr.append("\r\n*functionalResidualCapacity* :");
		auditStr.append(functionalResidualCapacity);
	    auditStr.append("; ");
		auditStr.append("\r\n*forcedExpiratoryVolume* :");
		auditStr.append(forcedExpiratoryVolume);
	    auditStr.append("; ");
		auditStr.append("\r\n*forcedVitalCapacity* :");
		auditStr.append(forcedVitalCapacity);
	    auditStr.append("; ");
		auditStr.append("\r\n*minuteVolume* :");
		auditStr.append(minuteVolume);
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
		
		String keyClassName = "LungFunctionTests";
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
		if (this.getPeakFlowPre() != null)
		{
			sb.append("<peakFlowPre>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPeakFlowPre().toString()));
			sb.append("</peakFlowPre>");		
		}
		if (this.getPeakFlowPost() != null)
		{
			sb.append("<peakFlowPost>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPeakFlowPost().toString()));
			sb.append("</peakFlowPost>");		
		}
		if (this.getTimeInterval() != null)
		{
			sb.append("<timeInterval>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTimeInterval().toString()));
			sb.append("</timeInterval>");		
		}
		if (this.getVitalCapacity() != null)
		{
			sb.append("<vitalCapacity>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getVitalCapacity().toString()));
			sb.append("</vitalCapacity>");		
		}
		if (this.getTidalVolume() != null)
		{
			sb.append("<tidalVolume>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTidalVolume().toString()));
			sb.append("</tidalVolume>");		
		}
		if (this.getIncentiveSpirometer() != null)
		{
			sb.append("<incentiveSpirometer>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getIncentiveSpirometer().toString()));
			sb.append("</incentiveSpirometer>");		
		}
		if (this.getTotalLungCapacity() != null)
		{
			sb.append("<totalLungCapacity>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTotalLungCapacity().toString()));
			sb.append("</totalLungCapacity>");		
		}
		if (this.getFunctionalResidualCapacity() != null)
		{
			sb.append("<functionalResidualCapacity>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFunctionalResidualCapacity().toString()));
			sb.append("</functionalResidualCapacity>");		
		}
		if (this.getForcedExpiratoryVolume() != null)
		{
			sb.append("<forcedExpiratoryVolume>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getForcedExpiratoryVolume().toString()));
			sb.append("</forcedExpiratoryVolume>");		
		}
		if (this.getForcedVitalCapacity() != null)
		{
			sb.append("<forcedVitalCapacity>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getForcedVitalCapacity().toString()));
			sb.append("</forcedVitalCapacity>");		
		}
		if (this.getMinuteVolume() != null)
		{
			sb.append("<minuteVolume>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMinuteVolume().toString()));
			sb.append("</minuteVolume>");		
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
			LungFunctionTests domainObject = getLungFunctionTestsfromXML(itemEl, factory, domMap);

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
			LungFunctionTests domainObject = getLungFunctionTestsfromXML(itemEl, factory, domMap);

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
		
	public static LungFunctionTests getLungFunctionTestsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getLungFunctionTestsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static LungFunctionTests getLungFunctionTestsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!LungFunctionTests.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!LungFunctionTests.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the LungFunctionTests class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (LungFunctionTests)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(LungFunctionTests.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		LungFunctionTests ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (LungFunctionTests)factory.getImportedDomainObject(LungFunctionTests.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new LungFunctionTests();
		}
		String keyClassName = "LungFunctionTests";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (LungFunctionTests)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, LungFunctionTests obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("peakFlowPre");
		if(fldEl != null)
		{	
    		obj.setPeakFlowPre(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("peakFlowPost");
		if(fldEl != null)
		{	
    		obj.setPeakFlowPost(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("timeInterval");
		if(fldEl != null)
		{	
    		obj.setTimeInterval(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("vitalCapacity");
		if(fldEl != null)
		{	
    		obj.setVitalCapacity(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("tidalVolume");
		if(fldEl != null)
		{	
    		obj.setTidalVolume(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("incentiveSpirometer");
		if(fldEl != null)
		{	
    		obj.setIncentiveSpirometer(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("totalLungCapacity");
		if(fldEl != null)
		{	
    		obj.setTotalLungCapacity(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("functionalResidualCapacity");
		if(fldEl != null)
		{	
    		obj.setFunctionalResidualCapacity(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("forcedExpiratoryVolume");
		if(fldEl != null)
		{	
    		obj.setForcedExpiratoryVolume(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("forcedVitalCapacity");
		if(fldEl != null)
		{	
    		obj.setForcedVitalCapacity(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("minuteVolume");
		if(fldEl != null)
		{	
    		obj.setMinuteVolume(new Integer(fldEl.getTextTrim()));	
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
		public static final String PeakFlowPre = "peakFlowPre";
		public static final String PeakFlowPost = "peakFlowPost";
		public static final String TimeInterval = "timeInterval";
		public static final String VitalCapacity = "vitalCapacity";
		public static final String TidalVolume = "tidalVolume";
		public static final String IncentiveSpirometer = "incentiveSpirometer";
		public static final String TotalLungCapacity = "totalLungCapacity";
		public static final String FunctionalResidualCapacity = "functionalResidualCapacity";
		public static final String ForcedExpiratoryVolume = "forcedExpiratoryVolume";
		public static final String ForcedVitalCapacity = "forcedVitalCapacity";
		public static final String MinuteVolume = "minuteVolume";
	}
}

