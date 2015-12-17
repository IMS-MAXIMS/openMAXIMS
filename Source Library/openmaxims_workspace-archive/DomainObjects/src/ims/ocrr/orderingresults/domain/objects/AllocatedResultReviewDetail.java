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
package ims.ocrr.orderingresults.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class AllocatedResultReviewDetail extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1070100026;
	private static final long serialVersionUID = 1070100026L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Allocated HCP for Review */
	private ims.core.resource.people.domain.objects.Hcp allocatedHCPforReview;
	/** Allocated For Review By */
	private ims.core.resource.people.domain.objects.MemberOfStaff allocatedForReviewBy;
	/** Allocated On */
	private java.util.Date allocatedOn;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public AllocatedResultReviewDetail (Integer id, int ver)
    {
    	super(id, ver);
    }
    public AllocatedResultReviewDetail ()
    {
    	super();
    }
    public AllocatedResultReviewDetail (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.ocrr.orderingresults.domain.objects.AllocatedResultReviewDetail.class;
	}


	public ims.core.resource.people.domain.objects.Hcp getAllocatedHCPforReview() {
		return allocatedHCPforReview;
	}
	public void setAllocatedHCPforReview(ims.core.resource.people.domain.objects.Hcp allocatedHCPforReview) {
		this.allocatedHCPforReview = allocatedHCPforReview;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getAllocatedForReviewBy() {
		return allocatedForReviewBy;
	}
	public void setAllocatedForReviewBy(ims.core.resource.people.domain.objects.MemberOfStaff allocatedForReviewBy) {
		this.allocatedForReviewBy = allocatedForReviewBy;
	}

	public java.util.Date getAllocatedOn() {
		return allocatedOn;
	}
	public void setAllocatedOn(java.util.Date allocatedOn) {
		this.allocatedOn = allocatedOn;
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
		
		auditStr.append("\r\n*allocatedHCPforReview* :");
		if (allocatedHCPforReview != null)
		{
			auditStr.append(toShortClassName(allocatedHCPforReview));
				
		    auditStr.append(allocatedHCPforReview.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*allocatedForReviewBy* :");
		if (allocatedForReviewBy != null)
		{
			auditStr.append(toShortClassName(allocatedForReviewBy));
				
		    auditStr.append(allocatedForReviewBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*allocatedOn* :");
		auditStr.append(allocatedOn);
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
		
		String keyClassName = "AllocatedResultReviewDetail";
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
		if (this.getAllocatedHCPforReview() != null)
		{
			sb.append("<allocatedHCPforReview>");
			sb.append(this.getAllocatedHCPforReview().toXMLString(domMap)); 	
			sb.append("</allocatedHCPforReview>");		
		}
		if (this.getAllocatedForReviewBy() != null)
		{
			sb.append("<allocatedForReviewBy>");
			sb.append(this.getAllocatedForReviewBy().toXMLString(domMap)); 	
			sb.append("</allocatedForReviewBy>");		
		}
		if (this.getAllocatedOn() != null)
		{
			sb.append("<allocatedOn>");
			sb.append(new ims.framework.utils.DateTime(this.getAllocatedOn()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</allocatedOn>");		
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
			AllocatedResultReviewDetail domainObject = getAllocatedResultReviewDetailfromXML(itemEl, factory, domMap);

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
			AllocatedResultReviewDetail domainObject = getAllocatedResultReviewDetailfromXML(itemEl, factory, domMap);

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
		
	public static AllocatedResultReviewDetail getAllocatedResultReviewDetailfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getAllocatedResultReviewDetailfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static AllocatedResultReviewDetail getAllocatedResultReviewDetailfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!AllocatedResultReviewDetail.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!AllocatedResultReviewDetail.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the AllocatedResultReviewDetail class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (AllocatedResultReviewDetail)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(AllocatedResultReviewDetail.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		AllocatedResultReviewDetail ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (AllocatedResultReviewDetail)factory.getImportedDomainObject(AllocatedResultReviewDetail.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new AllocatedResultReviewDetail();
		}
		String keyClassName = "AllocatedResultReviewDetail";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (AllocatedResultReviewDetail)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, AllocatedResultReviewDetail obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("allocatedHCPforReview");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAllocatedHCPforReview(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("allocatedForReviewBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAllocatedForReviewBy(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("allocatedOn");
		if(fldEl != null)
		{	
    		obj.setAllocatedOn(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
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
		public static final String AllocatedHCPforReview = "allocatedHCPforReview";
		public static final String AllocatedForReviewBy = "allocatedForReviewBy";
		public static final String AllocatedOn = "allocatedOn";
	}
}

