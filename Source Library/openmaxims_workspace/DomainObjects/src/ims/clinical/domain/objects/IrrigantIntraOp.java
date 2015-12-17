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
package ims.clinical.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class IrrigantIntraOp extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100140;
	private static final long serialVersionUID = 1072100140L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Theatre Appointment */
	private ims.scheduling.domain.objects.Booking_Appointment theatreAppointment;
	/** Estimated Blood Loss */
	private Integer estimatedBloodLoss;
	/** Overall Total Volume In */
	private Integer overallTotalVolumeIn;
	/** Total Volume Out */
	private Integer totalVolumeOut;
	/** Total Volume Difference */
	private Integer totalVolumeDifference;
	/** IrrigationDetails
	  * Collection of ims.clinical.domain.objects.IrrigantDetailIntraOp.
	  */
	private java.util.List irrigationDetails;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public IrrigantIntraOp (Integer id, int ver)
    {
    	super(id, ver);
    }
    public IrrigantIntraOp ()
    {
    	super();
    }
    public IrrigantIntraOp (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.domain.objects.IrrigantIntraOp.class;
	}


	public ims.scheduling.domain.objects.Booking_Appointment getTheatreAppointment() {
		return theatreAppointment;
	}
	public static IrrigantIntraOp getIrrigantIntraOpFromTheatreAppointment(ims.domain.ILightweightDomainFactory factory, Integer id)
	{
		java.util.List l = factory.find("from IrrigantIntraOp c where c.theatreAppointment.id = " + id);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. IrrigantIntraOp.theatreAppointment.id = " + id + " returned " + l.size() + " records. " );
		return (IrrigantIntraOp)l.get(0);
	}
	public void setTheatreAppointment(ims.scheduling.domain.objects.Booking_Appointment theatreAppointment) {
		this.theatreAppointment = theatreAppointment;
	}

	public Integer getEstimatedBloodLoss() {
		return estimatedBloodLoss;
	}
	public void setEstimatedBloodLoss(Integer estimatedBloodLoss) {
		this.estimatedBloodLoss = estimatedBloodLoss;
	}

	public Integer getOverallTotalVolumeIn() {
		return overallTotalVolumeIn;
	}
	public void setOverallTotalVolumeIn(Integer overallTotalVolumeIn) {
		this.overallTotalVolumeIn = overallTotalVolumeIn;
	}

	public Integer getTotalVolumeOut() {
		return totalVolumeOut;
	}
	public void setTotalVolumeOut(Integer totalVolumeOut) {
		this.totalVolumeOut = totalVolumeOut;
	}

	public Integer getTotalVolumeDifference() {
		return totalVolumeDifference;
	}
	public void setTotalVolumeDifference(Integer totalVolumeDifference) {
		this.totalVolumeDifference = totalVolumeDifference;
	}

	public java.util.List getIrrigationDetails() {
		if ( null == irrigationDetails ) {
			irrigationDetails = new java.util.ArrayList();
		}
		return irrigationDetails;
	}
	public void setIrrigationDetails(java.util.List paramValue) {
		this.irrigationDetails = paramValue;
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
		
		auditStr.append("\r\n*theatreAppointment* :");
		if (theatreAppointment != null)
		{
			auditStr.append(toShortClassName(theatreAppointment));
				
		    auditStr.append(theatreAppointment.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*estimatedBloodLoss* :");
		auditStr.append(estimatedBloodLoss);
	    auditStr.append("; ");
		auditStr.append("\r\n*overallTotalVolumeIn* :");
		auditStr.append(overallTotalVolumeIn);
	    auditStr.append("; ");
		auditStr.append("\r\n*totalVolumeOut* :");
		auditStr.append(totalVolumeOut);
	    auditStr.append("; ");
		auditStr.append("\r\n*totalVolumeDifference* :");
		auditStr.append(totalVolumeDifference);
	    auditStr.append("; ");
		auditStr.append("\r\n*irrigationDetails* :");
		if (irrigationDetails != null)
		{
		int i6=0;
		for (i6=0; i6<irrigationDetails.size(); i6++)
		{
			if (i6 > 0)
				auditStr.append(",");
			ims.clinical.domain.objects.IrrigantDetailIntraOp obj = (ims.clinical.domain.objects.IrrigantDetailIntraOp)irrigationDetails.get(i6);
		    if (obj != null)
			{
				if (i6 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i6 > 0)
			auditStr.append("] " + i6);
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
		
		String keyClassName = "IrrigantIntraOp";
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
		if (this.getTheatreAppointment() != null)
		{
			sb.append("<theatreAppointment>");
			sb.append(this.getTheatreAppointment().toXMLString(domMap)); 	
			sb.append("</theatreAppointment>");		
		}
		if (this.getEstimatedBloodLoss() != null)
		{
			sb.append("<estimatedBloodLoss>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getEstimatedBloodLoss().toString()));
			sb.append("</estimatedBloodLoss>");		
		}
		if (this.getOverallTotalVolumeIn() != null)
		{
			sb.append("<overallTotalVolumeIn>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOverallTotalVolumeIn().toString()));
			sb.append("</overallTotalVolumeIn>");		
		}
		if (this.getTotalVolumeOut() != null)
		{
			sb.append("<totalVolumeOut>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTotalVolumeOut().toString()));
			sb.append("</totalVolumeOut>");		
		}
		if (this.getTotalVolumeDifference() != null)
		{
			sb.append("<totalVolumeDifference>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTotalVolumeDifference().toString()));
			sb.append("</totalVolumeDifference>");		
		}
		if (this.getIrrigationDetails() != null)
		{
			if (this.getIrrigationDetails().size() > 0 )
			{
			sb.append("<irrigationDetails>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getIrrigationDetails(), domMap));
			sb.append("</irrigationDetails>");		
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
			IrrigantIntraOp domainObject = getIrrigantIntraOpfromXML(itemEl, factory, domMap);

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
			IrrigantIntraOp domainObject = getIrrigantIntraOpfromXML(itemEl, factory, domMap);

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
		
	public static IrrigantIntraOp getIrrigantIntraOpfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getIrrigantIntraOpfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static IrrigantIntraOp getIrrigantIntraOpfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!IrrigantIntraOp.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!IrrigantIntraOp.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the IrrigantIntraOp class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (IrrigantIntraOp)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(IrrigantIntraOp.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		IrrigantIntraOp ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (IrrigantIntraOp)factory.getImportedDomainObject(IrrigantIntraOp.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new IrrigantIntraOp();
		}
		String keyClassName = "IrrigantIntraOp";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (IrrigantIntraOp)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, IrrigantIntraOp obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("theatreAppointment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTheatreAppointment(ims.scheduling.domain.objects.Booking_Appointment.getBooking_AppointmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("estimatedBloodLoss");
		if(fldEl != null)
		{	
    		obj.setEstimatedBloodLoss(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("overallTotalVolumeIn");
		if(fldEl != null)
		{	
    		obj.setOverallTotalVolumeIn(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("totalVolumeOut");
		if(fldEl != null)
		{	
    		obj.setTotalVolumeOut(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("totalVolumeDifference");
		if(fldEl != null)
		{	
    		obj.setTotalVolumeDifference(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("irrigationDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setIrrigationDetails(ims.clinical.domain.objects.IrrigantDetailIntraOp.fromListXMLString(fldEl, factory, obj.getIrrigationDetails(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "irrigationDetails"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String TheatreAppointment = "theatreAppointment";
		public static final String EstimatedBloodLoss = "estimatedBloodLoss";
		public static final String OverallTotalVolumeIn = "overallTotalVolumeIn";
		public static final String TotalVolumeOut = "totalVolumeOut";
		public static final String TotalVolumeDifference = "totalVolumeDifference";
		public static final String IrrigationDetails = "irrigationDetails";
	}
}

