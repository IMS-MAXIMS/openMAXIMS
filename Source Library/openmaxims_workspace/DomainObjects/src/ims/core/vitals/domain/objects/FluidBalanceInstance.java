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


public class FluidBalanceInstance extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1022100016;
	private static final long serialVersionUID = 1022100016L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** AuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** Total Input (per hour) */
	private Integer totalInput;
	/** Total Output (per hour) */
	private Integer totalOutput;
	/** Balance (calculated field) */
	private Integer balance;
	/** Fluid Intake
	  * Collection of ims.core.vitals.domain.objects.FluidsBalanceDetails.
	  */
	private java.util.Set fluidIntake;
	/** Fluid Output
	  * Collection of ims.core.vitals.domain.objects.FluidsBalanceDetails.
	  */
	private java.util.Set fluidOutput;
	/** Linked Ventillation Chart ID */
	private ims.core.vitals.domain.objects.VentilationChart ventilationChart;
	/** Fluid Balance Date */
	private java.util.Date fluidBalanceDate;
	/** Start Time */
	private String startTime;
	/** EndTime */
	private String endTime;
	/** Comments */
	private String comments;
	/** Confirming Date/Time */
	private java.util.Date confirmingDateTime;
	/** Confirming HCP  */
	private ims.core.resource.people.domain.objects.Hcp confirmingHCP;
	/** isConfirmed */
	private Boolean isConfirmed;
	/** IrrigationIn */
	private Integer irrigationIn;
	/** IrrigationOut */
	private Integer irrigationOut;
	/** Time Period */
	private ims.domain.lookups.LookupInstance timePeriod;
	/** SignatoryShift */
	private ims.core.vitals.domain.objects.SignatoryShiftDetails signatoryShift;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public FluidBalanceInstance (Integer id, int ver)
    {
    	super(id, ver);
    }
    public FluidBalanceInstance ()
    {
    	super();
    }
    public FluidBalanceInstance (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.vitals.domain.objects.FluidBalanceInstance.class;
	}


	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
	}

	public Integer getTotalInput() {
		return totalInput;
	}
	public void setTotalInput(Integer totalInput) {
		this.totalInput = totalInput;
	}

	public Integer getTotalOutput() {
		return totalOutput;
	}
	public void setTotalOutput(Integer totalOutput) {
		this.totalOutput = totalOutput;
	}

	public Integer getBalance() {
		return balance;
	}
	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public java.util.Set getFluidIntake() {
		if ( null == fluidIntake ) {
			fluidIntake = new java.util.HashSet();
		}
		return fluidIntake;
	}
	public void setFluidIntake(java.util.Set paramValue) {
		this.fluidIntake = paramValue;
	}

	public java.util.Set getFluidOutput() {
		if ( null == fluidOutput ) {
			fluidOutput = new java.util.HashSet();
		}
		return fluidOutput;
	}
	public void setFluidOutput(java.util.Set paramValue) {
		this.fluidOutput = paramValue;
	}

	public ims.core.vitals.domain.objects.VentilationChart getVentilationChart() {
		return ventilationChart;
	}
	public void setVentilationChart(ims.core.vitals.domain.objects.VentilationChart ventilationChart) {
		this.ventilationChart = ventilationChart;
	}

	public java.util.Date getFluidBalanceDate() {
		return fluidBalanceDate;
	}
	public void setFluidBalanceDate(java.util.Date fluidBalanceDate) {
		this.fluidBalanceDate = fluidBalanceDate;
	}

	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}

	public java.util.Date getConfirmingDateTime() {
		return confirmingDateTime;
	}
	public void setConfirmingDateTime(java.util.Date confirmingDateTime) {
		this.confirmingDateTime = confirmingDateTime;
	}

	public ims.core.resource.people.domain.objects.Hcp getConfirmingHCP() {
		return confirmingHCP;
	}
	public void setConfirmingHCP(ims.core.resource.people.domain.objects.Hcp confirmingHCP) {
		this.confirmingHCP = confirmingHCP;
	}

	public Boolean isIsConfirmed() {
		return isConfirmed;
	}
	public void setIsConfirmed(Boolean isConfirmed) {
		this.isConfirmed = isConfirmed;
	}

	public Integer getIrrigationIn() {
		return irrigationIn;
	}
	public void setIrrigationIn(Integer irrigationIn) {
		this.irrigationIn = irrigationIn;
	}

	public Integer getIrrigationOut() {
		return irrigationOut;
	}
	public void setIrrigationOut(Integer irrigationOut) {
		this.irrigationOut = irrigationOut;
	}

	public ims.domain.lookups.LookupInstance getTimePeriod() {
		return timePeriod;
	}
	public void setTimePeriod(ims.domain.lookups.LookupInstance timePeriod) {
		this.timePeriod = timePeriod;
	}

	public ims.core.vitals.domain.objects.SignatoryShiftDetails getSignatoryShift() {
		return signatoryShift;
	}
	public void setSignatoryShift(ims.core.vitals.domain.objects.SignatoryShiftDetails signatoryShift) {
		this.signatoryShift = signatoryShift;
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
		
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*totalInput* :");
		auditStr.append(totalInput);
	    auditStr.append("; ");
		auditStr.append("\r\n*totalOutput* :");
		auditStr.append(totalOutput);
	    auditStr.append("; ");
		auditStr.append("\r\n*balance* :");
		auditStr.append(balance);
	    auditStr.append("; ");
		auditStr.append("\r\n*fluidIntake* :");
		if (fluidIntake != null)
		{
			java.util.Iterator it5 = fluidIntake.iterator();
			int i5=0;
			while (it5.hasNext())
			{
				if (i5 > 0)
					auditStr.append(",");
				ims.core.vitals.domain.objects.FluidsBalanceDetails obj = (ims.core.vitals.domain.objects.FluidsBalanceDetails)it5.next();
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
		auditStr.append("\r\n*fluidOutput* :");
		if (fluidOutput != null)
		{
			java.util.Iterator it6 = fluidOutput.iterator();
			int i6=0;
			while (it6.hasNext())
			{
				if (i6 > 0)
					auditStr.append(",");
				ims.core.vitals.domain.objects.FluidsBalanceDetails obj = (ims.core.vitals.domain.objects.FluidsBalanceDetails)it6.next();
		if (obj != null)
		{
		   if (i6 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i6++;
		}
		if (i6 > 0)
			auditStr.append("] " + i6);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*ventilationChart* :");
		if (ventilationChart != null)
		{
			auditStr.append(toShortClassName(ventilationChart));
				
		    auditStr.append(ventilationChart.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*fluidBalanceDate* :");
		auditStr.append(fluidBalanceDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*startTime* :");
		auditStr.append(startTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*endTime* :");
		auditStr.append(endTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*comments* :");
		auditStr.append(comments);
	    auditStr.append("; ");
		auditStr.append("\r\n*confirmingDateTime* :");
		auditStr.append(confirmingDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*confirmingHCP* :");
		if (confirmingHCP != null)
		{
			auditStr.append(toShortClassName(confirmingHCP));
				
		    auditStr.append(confirmingHCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isConfirmed* :");
		auditStr.append(isConfirmed);
	    auditStr.append("; ");
		auditStr.append("\r\n*irrigationIn* :");
		auditStr.append(irrigationIn);
	    auditStr.append("; ");
		auditStr.append("\r\n*irrigationOut* :");
		auditStr.append(irrigationOut);
	    auditStr.append("; ");
		auditStr.append("\r\n*timePeriod* :");
		if (timePeriod != null)
			auditStr.append(timePeriod.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*signatoryShift* :");
		if (signatoryShift != null)
		{
			auditStr.append(toShortClassName(signatoryShift));
				
		    auditStr.append(signatoryShift.getId());
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
		
		String keyClassName = "FluidBalanceInstance";
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
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
		}
		if (this.getTotalInput() != null)
		{
			sb.append("<totalInput>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTotalInput().toString()));
			sb.append("</totalInput>");		
		}
		if (this.getTotalOutput() != null)
		{
			sb.append("<totalOutput>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTotalOutput().toString()));
			sb.append("</totalOutput>");		
		}
		if (this.getBalance() != null)
		{
			sb.append("<balance>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getBalance().toString()));
			sb.append("</balance>");		
		}
		if (this.getFluidIntake() != null)
		{
			if (this.getFluidIntake().size() > 0 )
			{
			sb.append("<fluidIntake>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getFluidIntake(), domMap));
			sb.append("</fluidIntake>");		
			}
		}
		if (this.getFluidOutput() != null)
		{
			if (this.getFluidOutput().size() > 0 )
			{
			sb.append("<fluidOutput>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getFluidOutput(), domMap));
			sb.append("</fluidOutput>");		
			}
		}
		if (this.getVentilationChart() != null)
		{
			sb.append("<ventilationChart>");
			sb.append(this.getVentilationChart().toXMLString(domMap)); 	
			sb.append("</ventilationChart>");		
		}
		if (this.getFluidBalanceDate() != null)
		{
			sb.append("<fluidBalanceDate>");
			sb.append(new ims.framework.utils.DateTime(this.getFluidBalanceDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</fluidBalanceDate>");		
		}
		if (this.getStartTime() != null)
		{
			sb.append("<startTime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getStartTime().toString()));
			sb.append("</startTime>");		
		}
		if (this.getEndTime() != null)
		{
			sb.append("<endTime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getEndTime().toString()));
			sb.append("</endTime>");		
		}
		if (this.getComments() != null)
		{
			sb.append("<comments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComments().toString()));
			sb.append("</comments>");		
		}
		if (this.getConfirmingDateTime() != null)
		{
			sb.append("<confirmingDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getConfirmingDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</confirmingDateTime>");		
		}
		if (this.getConfirmingHCP() != null)
		{
			sb.append("<confirmingHCP>");
			sb.append(this.getConfirmingHCP().toXMLString(domMap)); 	
			sb.append("</confirmingHCP>");		
		}
		if (this.isIsConfirmed() != null)
		{
			sb.append("<isConfirmed>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsConfirmed().toString()));
			sb.append("</isConfirmed>");		
		}
		if (this.getIrrigationIn() != null)
		{
			sb.append("<irrigationIn>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getIrrigationIn().toString()));
			sb.append("</irrigationIn>");		
		}
		if (this.getIrrigationOut() != null)
		{
			sb.append("<irrigationOut>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getIrrigationOut().toString()));
			sb.append("</irrigationOut>");		
		}
		if (this.getTimePeriod() != null)
		{
			sb.append("<timePeriod>");
			sb.append(this.getTimePeriod().toXMLString()); 
			sb.append("</timePeriod>");		
		}
		if (this.getSignatoryShift() != null)
		{
			sb.append("<signatoryShift>");
			sb.append(this.getSignatoryShift().toXMLString(domMap)); 	
			sb.append("</signatoryShift>");		
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
			FluidBalanceInstance domainObject = getFluidBalanceInstancefromXML(itemEl, factory, domMap);

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
			FluidBalanceInstance domainObject = getFluidBalanceInstancefromXML(itemEl, factory, domMap);

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
		
	public static FluidBalanceInstance getFluidBalanceInstancefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getFluidBalanceInstancefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static FluidBalanceInstance getFluidBalanceInstancefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!FluidBalanceInstance.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!FluidBalanceInstance.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the FluidBalanceInstance class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (FluidBalanceInstance)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(FluidBalanceInstance.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		FluidBalanceInstance ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (FluidBalanceInstance)factory.getImportedDomainObject(FluidBalanceInstance.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new FluidBalanceInstance();
		}
		String keyClassName = "FluidBalanceInstance";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (FluidBalanceInstance)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, FluidBalanceInstance obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("totalInput");
		if(fldEl != null)
		{	
    		obj.setTotalInput(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("totalOutput");
		if(fldEl != null)
		{	
    		obj.setTotalOutput(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("balance");
		if(fldEl != null)
		{	
    		obj.setBalance(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("fluidIntake");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setFluidIntake(ims.core.vitals.domain.objects.FluidsBalanceDetails.fromSetXMLString(fldEl, factory, obj.getFluidIntake(), domMap));
		}
		fldEl = el.element("fluidOutput");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setFluidOutput(ims.core.vitals.domain.objects.FluidsBalanceDetails.fromSetXMLString(fldEl, factory, obj.getFluidOutput(), domMap));
		}
		fldEl = el.element("ventilationChart");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setVentilationChart(ims.core.vitals.domain.objects.VentilationChart.getVentilationChartfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("fluidBalanceDate");
		if(fldEl != null)
		{	
    		obj.setFluidBalanceDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("startTime");
		if(fldEl != null)
		{	
    		obj.setStartTime(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("endTime");
		if(fldEl != null)
		{	
    		obj.setEndTime(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("comments");
		if(fldEl != null)
		{	
    		obj.setComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("confirmingDateTime");
		if(fldEl != null)
		{	
    		obj.setConfirmingDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("confirmingHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setConfirmingHCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isConfirmed");
		if(fldEl != null)
		{	
    		obj.setIsConfirmed(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("irrigationIn");
		if(fldEl != null)
		{	
    		obj.setIrrigationIn(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("irrigationOut");
		if(fldEl != null)
		{	
    		obj.setIrrigationOut(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("timePeriod");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTimePeriod(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("signatoryShift");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSignatoryShift(ims.core.vitals.domain.objects.SignatoryShiftDetails.getSignatoryShiftDetailsfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "fluidIntake"
		, "fluidOutput"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String AuthoringInformation = "authoringInformation";
		public static final String TotalInput = "totalInput";
		public static final String TotalOutput = "totalOutput";
		public static final String Balance = "balance";
		public static final String FluidIntake = "fluidIntake";
		public static final String FluidOutput = "fluidOutput";
		public static final String VentilationChart = "ventilationChart";
		public static final String FluidBalanceDate = "fluidBalanceDate";
		public static final String StartTime = "startTime";
		public static final String EndTime = "endTime";
		public static final String Comments = "comments";
		public static final String ConfirmingDateTime = "confirmingDateTime";
		public static final String ConfirmingHCP = "confirmingHCP";
		public static final String IsConfirmed = "isConfirmed";
		public static final String IrrigationIn = "irrigationIn";
		public static final String IrrigationOut = "irrigationOut";
		public static final String TimePeriod = "timePeriod";
		public static final String SignatoryShift = "signatoryShift";
	}
}

