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


public class ClientScheduleStage extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1091100008;
	private static final long serialVersionUID = 1091100008L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Stage */
	private ims.pci.domain.objects.StageConfiguration stage;
	/** Vaccine Details
	  * Collection of ims.pci.domain.objects.ClientScheduleStageVaccine.
	  */
	private java.util.Set vaccines;
	/** was schedule deleted */
	private Boolean isDeleted;
	/** Campaign Start Date */
	private java.util.Date campaignStartDate;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ClientScheduleStage (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ClientScheduleStage ()
    {
    	super();
    }
    public ClientScheduleStage (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.pci.domain.objects.ClientScheduleStage.class;
	}


	public ims.pci.domain.objects.StageConfiguration getStage() {
		return stage;
	}
	public void setStage(ims.pci.domain.objects.StageConfiguration stage) {
		this.stage = stage;
	}

	public java.util.Set getVaccines() {
		if ( null == vaccines ) {
			vaccines = new java.util.HashSet();
		}
		return vaccines;
	}
	public void setVaccines(java.util.Set paramValue) {
		this.vaccines = paramValue;
	}

	public Boolean isIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public java.util.Date getCampaignStartDate() {
		return campaignStartDate;
	}
	public void setCampaignStartDate(java.util.Date campaignStartDate) {
		this.campaignStartDate = campaignStartDate;
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
		
		auditStr.append("\r\n*stage* :");
		if (stage != null)
		{
			auditStr.append(toShortClassName(stage));
				
		    auditStr.append(stage.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*vaccines* :");
		if (vaccines != null)
		{
			java.util.Iterator it2 = vaccines.iterator();
			int i2=0;
			while (it2.hasNext())
			{
				if (i2 > 0)
					auditStr.append(",");
				ims.pci.domain.objects.ClientScheduleStageVaccine obj = (ims.pci.domain.objects.ClientScheduleStageVaccine)it2.next();
		if (obj != null)
		{
		   if (i2 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i2++;
		}
		if (i2 > 0)
			auditStr.append("] " + i2);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isDeleted* :");
		auditStr.append(isDeleted);
	    auditStr.append("; ");
		auditStr.append("\r\n*campaignStartDate* :");
		auditStr.append(campaignStartDate);
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
		
		String keyClassName = "ClientScheduleStage";
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
		if (this.getStage() != null)
		{
			sb.append("<stage>");
			sb.append(this.getStage().toXMLString(domMap)); 	
			sb.append("</stage>");		
		}
		if (this.getVaccines() != null)
		{
			if (this.getVaccines().size() > 0 )
			{
			sb.append("<vaccines>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getVaccines(), domMap));
			sb.append("</vaccines>");		
			}
		}
		if (this.isIsDeleted() != null)
		{
			sb.append("<isDeleted>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsDeleted().toString()));
			sb.append("</isDeleted>");		
		}
		if (this.getCampaignStartDate() != null)
		{
			sb.append("<campaignStartDate>");
			sb.append(new ims.framework.utils.DateTime(this.getCampaignStartDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</campaignStartDate>");		
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
			ClientScheduleStage domainObject = getClientScheduleStagefromXML(itemEl, factory, domMap);

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
			ClientScheduleStage domainObject = getClientScheduleStagefromXML(itemEl, factory, domMap);

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
		
	public static ClientScheduleStage getClientScheduleStagefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getClientScheduleStagefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ClientScheduleStage getClientScheduleStagefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ClientScheduleStage.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ClientScheduleStage.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ClientScheduleStage class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ClientScheduleStage)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ClientScheduleStage.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ClientScheduleStage ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ClientScheduleStage)factory.getImportedDomainObject(ClientScheduleStage.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ClientScheduleStage();
		}
		String keyClassName = "ClientScheduleStage";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ClientScheduleStage)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ClientScheduleStage obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("stage");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setStage(ims.pci.domain.objects.StageConfiguration.getStageConfigurationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("vaccines");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setVaccines(ims.pci.domain.objects.ClientScheduleStageVaccine.fromSetXMLString(fldEl, factory, obj.getVaccines(), domMap));
		}
		fldEl = el.element("isDeleted");
		if(fldEl != null)
		{	
    		obj.setIsDeleted(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("campaignStartDate");
		if(fldEl != null)
		{	
    		obj.setCampaignStartDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "vaccines"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Stage = "stage";
		public static final String Vaccines = "vaccines";
		public static final String IsDeleted = "isDeleted";
		public static final String CampaignStartDate = "campaignStartDate";
	}
}

