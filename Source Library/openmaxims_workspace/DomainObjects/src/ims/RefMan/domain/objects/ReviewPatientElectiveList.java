/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 16/04/2014, 12:34
 *
 */
package ims.RefMan.domain.objects;

/**
 * 
 * @author Rory Fitzpatrick
 * Generated.
 */


public class ReviewPatientElectiveList extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1096100069;
	private static final long serialVersionUID = 1096100069L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Review Type */
	private ims.domain.lookups.LookupInstance reviewType;
	/** ReviewNotes */
	private String reviewNotes;
	/** ReviewedDate */
	private java.util.Date reviewedDate;
	/** Reviewed By */
	private ims.core.resource.people.domain.objects.MemberOfStaff reviewedBy;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ReviewPatientElectiveList (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ReviewPatientElectiveList ()
    {
    	super();
    }
    public ReviewPatientElectiveList (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.RefMan.domain.objects.ReviewPatientElectiveList.class;
	}


	public ims.domain.lookups.LookupInstance getReviewType() {
		return reviewType;
	}
	public void setReviewType(ims.domain.lookups.LookupInstance reviewType) {
		this.reviewType = reviewType;
	}

	public String getReviewNotes() {
		return reviewNotes;
	}
	public void setReviewNotes(String reviewNotes) {
		if ( null != reviewNotes && reviewNotes.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for reviewNotes. Tried to set value: "+
				reviewNotes);
		}
		this.reviewNotes = reviewNotes;
	}

	public java.util.Date getReviewedDate() {
		return reviewedDate;
	}
	public void setReviewedDate(java.util.Date reviewedDate) {
		this.reviewedDate = reviewedDate;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getReviewedBy() {
		return reviewedBy;
	}
	public void setReviewedBy(ims.core.resource.people.domain.objects.MemberOfStaff reviewedBy) {
		this.reviewedBy = reviewedBy;
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
		
		auditStr.append("\r\n*reviewType* :");
		if (reviewType != null)
			auditStr.append(reviewType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*reviewNotes* :");
		auditStr.append(reviewNotes);
	    auditStr.append("; ");
		auditStr.append("\r\n*reviewedDate* :");
		auditStr.append(reviewedDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*reviewedBy* :");
		if (reviewedBy != null)
		{
			auditStr.append(toShortClassName(reviewedBy));
				
		    auditStr.append(reviewedBy.getId());
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
		
		String keyClassName = "ReviewPatientElectiveList";
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
		if (this.getReviewType() != null)
		{
			sb.append("<reviewType>");
			sb.append(this.getReviewType().toXMLString()); 
			sb.append("</reviewType>");		
		}
		if (this.getReviewNotes() != null)
		{
			sb.append("<reviewNotes>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReviewNotes().toString()));
			sb.append("</reviewNotes>");		
		}
		if (this.getReviewedDate() != null)
		{
			sb.append("<reviewedDate>");
			sb.append(new ims.framework.utils.DateTime(this.getReviewedDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</reviewedDate>");		
		}
		if (this.getReviewedBy() != null)
		{
			sb.append("<reviewedBy>");
			sb.append(this.getReviewedBy().toXMLString(domMap)); 	
			sb.append("</reviewedBy>");		
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
			ReviewPatientElectiveList domainObject = getReviewPatientElectiveListfromXML(itemEl, factory, domMap);

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
			ReviewPatientElectiveList domainObject = getReviewPatientElectiveListfromXML(itemEl, factory, domMap);

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
		
	public static ReviewPatientElectiveList getReviewPatientElectiveListfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getReviewPatientElectiveListfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ReviewPatientElectiveList getReviewPatientElectiveListfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ReviewPatientElectiveList.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ReviewPatientElectiveList.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ReviewPatientElectiveList class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ReviewPatientElectiveList)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ReviewPatientElectiveList.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ReviewPatientElectiveList ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ReviewPatientElectiveList)factory.getImportedDomainObject(ReviewPatientElectiveList.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ReviewPatientElectiveList();
		}
		String keyClassName = "ReviewPatientElectiveList";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ReviewPatientElectiveList)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ReviewPatientElectiveList obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("reviewType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReviewType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("reviewNotes");
		if(fldEl != null)
		{	
    		obj.setReviewNotes(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("reviewedDate");
		if(fldEl != null)
		{	
    		obj.setReviewedDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("reviewedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setReviewedBy(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
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
		public static final String ReviewType = "reviewType";
		public static final String ReviewNotes = "reviewNotes";
		public static final String ReviewedDate = "reviewedDate";
		public static final String ReviewedBy = "reviewedBy";
	}
}

