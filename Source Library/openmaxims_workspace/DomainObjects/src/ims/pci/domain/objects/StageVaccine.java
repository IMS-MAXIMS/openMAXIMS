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
package ims.pci.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class StageVaccine extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1091100004;
	private static final long serialVersionUID = 1091100004L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Vaccine */
	private ims.core.clinical.domain.objects.Vaccine vaccine;
	/** Can Be Rescheduled */
	private Boolean canBeRescheduled;
	/** PCRS Transaction Code */
	private String pcrsCode;
	/** Shot No */
	private Integer shotNo;
	/** isLastShotForVaccine */
	private Boolean isLastShotForVaccine;
	/** Driver Vaccine Shot */
	private Boolean driver;
	/** minimum interval value in months */
	private Integer intervalMonths;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public StageVaccine (Integer id, int ver)
    {
    	super(id, ver);
    }
    public StageVaccine ()
    {
    	super();
    }
    public StageVaccine (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.pci.domain.objects.StageVaccine.class;
	}


	public ims.core.clinical.domain.objects.Vaccine getVaccine() {
		return vaccine;
	}
	public void setVaccine(ims.core.clinical.domain.objects.Vaccine vaccine) {
		this.vaccine = vaccine;
	}

	public Boolean isCanBeRescheduled() {
		return canBeRescheduled;
	}
	public void setCanBeRescheduled(Boolean canBeRescheduled) {
		this.canBeRescheduled = canBeRescheduled;
	}

	public String getPcrsCode() {
		return pcrsCode;
	}
	public void setPcrsCode(String pcrsCode) {
		if ( null != pcrsCode && pcrsCode.length() > 25 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for pcrsCode. Tried to set value: "+
				pcrsCode);
		}
		this.pcrsCode = pcrsCode;
	}

	public Integer getShotNo() {
		return shotNo;
	}
	public void setShotNo(Integer shotNo) {
		this.shotNo = shotNo;
	}

	public Boolean isIsLastShotForVaccine() {
		return isLastShotForVaccine;
	}
	public void setIsLastShotForVaccine(Boolean isLastShotForVaccine) {
		this.isLastShotForVaccine = isLastShotForVaccine;
	}

	public Boolean isDriver() {
		return driver;
	}
	public void setDriver(Boolean driver) {
		this.driver = driver;
	}

	public Integer getIntervalMonths() {
		return intervalMonths;
	}
	public void setIntervalMonths(Integer intervalMonths) {
		this.intervalMonths = intervalMonths;
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
		
		auditStr.append("\r\n*vaccine* :");
		if (vaccine != null)
		{
			auditStr.append(toShortClassName(vaccine));
				
		    auditStr.append(vaccine.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*canBeRescheduled* :");
		auditStr.append(canBeRescheduled);
	    auditStr.append("; ");
		auditStr.append("\r\n*pcrsCode* :");
		auditStr.append(pcrsCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*shotNo* :");
		auditStr.append(shotNo);
	    auditStr.append("; ");
		auditStr.append("\r\n*isLastShotForVaccine* :");
		auditStr.append(isLastShotForVaccine);
	    auditStr.append("; ");
		auditStr.append("\r\n*driver* :");
		auditStr.append(driver);
	    auditStr.append("; ");
		auditStr.append("\r\n*intervalMonths* :");
		auditStr.append(intervalMonths);
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
		
		String keyClassName = "StageVaccine";
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
		if (this.getVaccine() != null)
		{
			sb.append("<vaccine>");
			sb.append(this.getVaccine().toXMLString(domMap)); 	
			sb.append("</vaccine>");		
		}
		if (this.isCanBeRescheduled() != null)
		{
			sb.append("<canBeRescheduled>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isCanBeRescheduled().toString()));
			sb.append("</canBeRescheduled>");		
		}
		if (this.getPcrsCode() != null)
		{
			sb.append("<pcrsCode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPcrsCode().toString()));
			sb.append("</pcrsCode>");		
		}
		if (this.getShotNo() != null)
		{
			sb.append("<shotNo>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getShotNo().toString()));
			sb.append("</shotNo>");		
		}
		if (this.isIsLastShotForVaccine() != null)
		{
			sb.append("<isLastShotForVaccine>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsLastShotForVaccine().toString()));
			sb.append("</isLastShotForVaccine>");		
		}
		if (this.isDriver() != null)
		{
			sb.append("<driver>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isDriver().toString()));
			sb.append("</driver>");		
		}
		if (this.getIntervalMonths() != null)
		{
			sb.append("<intervalMonths>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getIntervalMonths().toString()));
			sb.append("</intervalMonths>");		
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
			StageVaccine domainObject = getStageVaccinefromXML(itemEl, factory, domMap);

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
			StageVaccine domainObject = getStageVaccinefromXML(itemEl, factory, domMap);

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
		
	public static StageVaccine getStageVaccinefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getStageVaccinefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static StageVaccine getStageVaccinefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!StageVaccine.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!StageVaccine.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the StageVaccine class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (StageVaccine)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(StageVaccine.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		StageVaccine ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (StageVaccine)factory.getImportedDomainObject(StageVaccine.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new StageVaccine();
		}
		String keyClassName = "StageVaccine";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (StageVaccine)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, StageVaccine obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("vaccine");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setVaccine(ims.core.clinical.domain.objects.Vaccine.getVaccinefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("canBeRescheduled");
		if(fldEl != null)
		{	
    		obj.setCanBeRescheduled(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pcrsCode");
		if(fldEl != null)
		{	
    		obj.setPcrsCode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("shotNo");
		if(fldEl != null)
		{	
    		obj.setShotNo(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isLastShotForVaccine");
		if(fldEl != null)
		{	
    		obj.setIsLastShotForVaccine(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("driver");
		if(fldEl != null)
		{	
    		obj.setDriver(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("intervalMonths");
		if(fldEl != null)
		{	
    		obj.setIntervalMonths(new Integer(fldEl.getTextTrim()));	
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
		public static final String Vaccine = "vaccine";
		public static final String CanBeRescheduled = "canBeRescheduled";
		public static final String PcrsCode = "pcrsCode";
		public static final String ShotNo = "shotNo";
		public static final String IsLastShotForVaccine = "isLastShotForVaccine";
		public static final String Driver = "driver";
		public static final String IntervalMonths = "intervalMonths";
	}
}

