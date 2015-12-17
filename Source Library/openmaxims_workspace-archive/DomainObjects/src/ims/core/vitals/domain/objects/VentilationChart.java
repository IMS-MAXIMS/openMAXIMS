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


public class VentilationChart extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1022100018;
	private static final long serialVersionUID = 1022100018L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Suction */
	private ims.domain.lookups.LookupInstance suction;
	/** Physio */
	private ims.domain.lookups.LookupInstance physio;
	/** Mode */
	private ims.domain.lookups.LookupInstance mode;
	/** Peak Pressure */
	private Integer peakPressure;
	/** PEEP / CPAP */
	private String pEEPCPAP;
	/** Resp rate set by ventilator */
	private Integer rate;
	/** Spontaneous MV */
	private Integer spontaneousMV;
	/** Cuff */
	private ims.domain.lookups.LookupInstance cuff;
	/** Humidifier Temp */
	private java.lang.Float humidifierTemp;
	/** Probe Change */
	private ims.domain.lookups.LookupInstance probeChange;
	/** Position */
	private ims.domain.lookups.LookupInstance position;
	/** Fluid Balance */
	private ims.core.vitals.domain.objects.FluidBalanceInstance fluidBalance;
	/** Pain Scale */
	private ims.domain.lookups.LookupInstance painScale;
	/** Daily Fluid Balance */
	private ims.core.vitals.domain.objects.DailyFluidBalance dailyFluidBalance;
	/** Shift Details */
	private ims.core.vitals.domain.objects.ShiftDetails shiftDetails;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public VentilationChart (Integer id, int ver)
    {
    	super(id, ver);
    }
    public VentilationChart ()
    {
    	super();
    }
    public VentilationChart (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.vitals.domain.objects.VentilationChart.class;
	}


	public ims.domain.lookups.LookupInstance getSuction() {
		return suction;
	}
	public void setSuction(ims.domain.lookups.LookupInstance suction) {
		this.suction = suction;
	}

	public ims.domain.lookups.LookupInstance getPhysio() {
		return physio;
	}
	public void setPhysio(ims.domain.lookups.LookupInstance physio) {
		this.physio = physio;
	}

	public ims.domain.lookups.LookupInstance getMode() {
		return mode;
	}
	public void setMode(ims.domain.lookups.LookupInstance mode) {
		this.mode = mode;
	}

	public Integer getPeakPressure() {
		return peakPressure;
	}
	public void setPeakPressure(Integer peakPressure) {
		this.peakPressure = peakPressure;
	}

	public String getPEEPCPAP() {
		return pEEPCPAP;
	}
	public void setPEEPCPAP(String pEEPCPAP) {
		this.pEEPCPAP = pEEPCPAP;
	}

	public Integer getRate() {
		return rate;
	}
	public void setRate(Integer rate) {
		this.rate = rate;
	}

	public Integer getSpontaneousMV() {
		return spontaneousMV;
	}
	public void setSpontaneousMV(Integer spontaneousMV) {
		this.spontaneousMV = spontaneousMV;
	}

	public ims.domain.lookups.LookupInstance getCuff() {
		return cuff;
	}
	public void setCuff(ims.domain.lookups.LookupInstance cuff) {
		this.cuff = cuff;
	}

	public java.lang.Float getHumidifierTemp() {
		return humidifierTemp;
	}
	public void setHumidifierTemp(java.lang.Float humidifierTemp) {
		this.humidifierTemp = humidifierTemp;
	}

	public ims.domain.lookups.LookupInstance getProbeChange() {
		return probeChange;
	}
	public void setProbeChange(ims.domain.lookups.LookupInstance probeChange) {
		this.probeChange = probeChange;
	}

	public ims.domain.lookups.LookupInstance getPosition() {
		return position;
	}
	public void setPosition(ims.domain.lookups.LookupInstance position) {
		this.position = position;
	}

	public ims.core.vitals.domain.objects.FluidBalanceInstance getFluidBalance() {
		return fluidBalance;
	}
	public void setFluidBalance(ims.core.vitals.domain.objects.FluidBalanceInstance fluidBalance) {
		this.fluidBalance = fluidBalance;
	}

	public ims.domain.lookups.LookupInstance getPainScale() {
		return painScale;
	}
	public void setPainScale(ims.domain.lookups.LookupInstance painScale) {
		this.painScale = painScale;
	}

	public ims.core.vitals.domain.objects.DailyFluidBalance getDailyFluidBalance() {
		return dailyFluidBalance;
	}
	public void setDailyFluidBalance(ims.core.vitals.domain.objects.DailyFluidBalance dailyFluidBalance) {
		this.dailyFluidBalance = dailyFluidBalance;
	}

	public ims.core.vitals.domain.objects.ShiftDetails getShiftDetails() {
		return shiftDetails;
	}
	public void setShiftDetails(ims.core.vitals.domain.objects.ShiftDetails shiftDetails) {
		this.shiftDetails = shiftDetails;
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
		
		auditStr.append("\r\n*suction* :");
		if (suction != null)
			auditStr.append(suction.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*physio* :");
		if (physio != null)
			auditStr.append(physio.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*mode* :");
		if (mode != null)
			auditStr.append(mode.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*peakPressure* :");
		auditStr.append(peakPressure);
	    auditStr.append("; ");
		auditStr.append("\r\n*pEEPCPAP* :");
		auditStr.append(pEEPCPAP);
	    auditStr.append("; ");
		auditStr.append("\r\n*rate* :");
		auditStr.append(rate);
	    auditStr.append("; ");
		auditStr.append("\r\n*spontaneousMV* :");
		auditStr.append(spontaneousMV);
	    auditStr.append("; ");
		auditStr.append("\r\n*cuff* :");
		if (cuff != null)
			auditStr.append(cuff.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*humidifierTemp* :");
		auditStr.append(humidifierTemp);
	    auditStr.append("; ");
		auditStr.append("\r\n*probeChange* :");
		if (probeChange != null)
			auditStr.append(probeChange.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*position* :");
		if (position != null)
			auditStr.append(position.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*fluidBalance* :");
		if (fluidBalance != null)
		{
			auditStr.append(toShortClassName(fluidBalance));
				
		    auditStr.append(fluidBalance.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*painScale* :");
		if (painScale != null)
			auditStr.append(painScale.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*dailyFluidBalance* :");
		if (dailyFluidBalance != null)
		{
			auditStr.append(toShortClassName(dailyFluidBalance));
				
		    auditStr.append(dailyFluidBalance.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*shiftDetails* :");
		if (shiftDetails != null)
		{
			auditStr.append(toShortClassName(shiftDetails));
				
		    auditStr.append(shiftDetails.getId());
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
		
		String keyClassName = "VentilationChart";
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
		if (this.getSuction() != null)
		{
			sb.append("<suction>");
			sb.append(this.getSuction().toXMLString()); 
			sb.append("</suction>");		
		}
		if (this.getPhysio() != null)
		{
			sb.append("<physio>");
			sb.append(this.getPhysio().toXMLString()); 
			sb.append("</physio>");		
		}
		if (this.getMode() != null)
		{
			sb.append("<mode>");
			sb.append(this.getMode().toXMLString()); 
			sb.append("</mode>");		
		}
		if (this.getPeakPressure() != null)
		{
			sb.append("<peakPressure>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPeakPressure().toString()));
			sb.append("</peakPressure>");		
		}
		if (this.getPEEPCPAP() != null)
		{
			sb.append("<pEEPCPAP>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPEEPCPAP().toString()));
			sb.append("</pEEPCPAP>");		
		}
		if (this.getRate() != null)
		{
			sb.append("<rate>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRate().toString()));
			sb.append("</rate>");		
		}
		if (this.getSpontaneousMV() != null)
		{
			sb.append("<spontaneousMV>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSpontaneousMV().toString()));
			sb.append("</spontaneousMV>");		
		}
		if (this.getCuff() != null)
		{
			sb.append("<cuff>");
			sb.append(this.getCuff().toXMLString()); 
			sb.append("</cuff>");		
		}
		if (this.getHumidifierTemp() != null)
		{
			sb.append("<humidifierTemp>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getHumidifierTemp().toString()));
			sb.append("</humidifierTemp>");		
		}
		if (this.getProbeChange() != null)
		{
			sb.append("<probeChange>");
			sb.append(this.getProbeChange().toXMLString()); 
			sb.append("</probeChange>");		
		}
		if (this.getPosition() != null)
		{
			sb.append("<position>");
			sb.append(this.getPosition().toXMLString()); 
			sb.append("</position>");		
		}
		if (this.getFluidBalance() != null)
		{
			sb.append("<fluidBalance>");
			sb.append(this.getFluidBalance().toXMLString(domMap)); 	
			sb.append("</fluidBalance>");		
		}
		if (this.getPainScale() != null)
		{
			sb.append("<painScale>");
			sb.append(this.getPainScale().toXMLString()); 
			sb.append("</painScale>");		
		}
		if (this.getDailyFluidBalance() != null)
		{
			sb.append("<dailyFluidBalance>");
			sb.append(this.getDailyFluidBalance().toXMLString(domMap)); 	
			sb.append("</dailyFluidBalance>");		
		}
		if (this.getShiftDetails() != null)
		{
			sb.append("<shiftDetails>");
			sb.append(this.getShiftDetails().toXMLString(domMap)); 	
			sb.append("</shiftDetails>");		
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
			VentilationChart domainObject = getVentilationChartfromXML(itemEl, factory, domMap);

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
			VentilationChart domainObject = getVentilationChartfromXML(itemEl, factory, domMap);

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
		
	public static VentilationChart getVentilationChartfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getVentilationChartfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static VentilationChart getVentilationChartfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!VentilationChart.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!VentilationChart.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the VentilationChart class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (VentilationChart)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(VentilationChart.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		VentilationChart ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (VentilationChart)factory.getImportedDomainObject(VentilationChart.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new VentilationChart();
		}
		String keyClassName = "VentilationChart";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (VentilationChart)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, VentilationChart obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("suction");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSuction(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("physio");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPhysio(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("mode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMode(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("peakPressure");
		if(fldEl != null)
		{	
    		obj.setPeakPressure(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pEEPCPAP");
		if(fldEl != null)
		{	
    		obj.setPEEPCPAP(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("rate");
		if(fldEl != null)
		{	
    		obj.setRate(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("spontaneousMV");
		if(fldEl != null)
		{	
    		obj.setSpontaneousMV(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("cuff");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCuff(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("humidifierTemp");
		if(fldEl != null)
		{	
    		obj.setHumidifierTemp(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("probeChange");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setProbeChange(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("position");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPosition(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("fluidBalance");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setFluidBalance(ims.core.vitals.domain.objects.FluidBalanceInstance.getFluidBalanceInstancefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("painScale");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPainScale(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("dailyFluidBalance");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setDailyFluidBalance(ims.core.vitals.domain.objects.DailyFluidBalance.getDailyFluidBalancefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("shiftDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setShiftDetails(ims.core.vitals.domain.objects.ShiftDetails.getShiftDetailsfromXML(fldEl, factory, domMap)); 
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
		public static final String Suction = "suction";
		public static final String Physio = "physio";
		public static final String Mode = "mode";
		public static final String PeakPressure = "peakPressure";
		public static final String PEEPCPAP = "pEEPCPAP";
		public static final String Rate = "rate";
		public static final String SpontaneousMV = "spontaneousMV";
		public static final String Cuff = "cuff";
		public static final String HumidifierTemp = "humidifierTemp";
		public static final String ProbeChange = "probeChange";
		public static final String Position = "position";
		public static final String FluidBalance = "fluidBalance";
		public static final String PainScale = "painScale";
		public static final String DailyFluidBalance = "dailyFluidBalance";
		public static final String ShiftDetails = "shiftDetails";
	}
}

