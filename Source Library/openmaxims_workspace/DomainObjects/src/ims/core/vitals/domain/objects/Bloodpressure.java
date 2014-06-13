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
 * @author Kevin O'Carroll
 * Generated.
 */


public class Bloodpressure extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1022100001;
	private static final long serialVersionUID = 1022100001L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** First Systolic Reading */
	private java.lang.Float bPSittingSys;
	/** First Diastolic Reading */
	private java.lang.Float bPSittingDias;
	/** Second Systolic Reading */
	private java.lang.Float bPStandingSys;
	/** Second Diastolic Reading */
	private java.lang.Float bPStandingDias;
	/** Interval In Minutes */
	private Integer timeInterval;
	/** Lying Systolic Reading */
	private java.lang.Float bPLyingSys;
	/** Lying Diastolic Reading */
	private java.lang.Float bPLyingDias;
	/** Comment */
	private String comment;
    public Bloodpressure (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Bloodpressure ()
    {
    	super();
    }
    public Bloodpressure (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.vitals.domain.objects.Bloodpressure.class;
	}


	public java.lang.Float getBPSittingSys() {
		return bPSittingSys;
	}
	public void setBPSittingSys(java.lang.Float bPSittingSys) {
		this.bPSittingSys = bPSittingSys;
	}

	public java.lang.Float getBPSittingDias() {
		return bPSittingDias;
	}
	public void setBPSittingDias(java.lang.Float bPSittingDias) {
		this.bPSittingDias = bPSittingDias;
	}

	public java.lang.Float getBPStandingSys() {
		return bPStandingSys;
	}
	public void setBPStandingSys(java.lang.Float bPStandingSys) {
		this.bPStandingSys = bPStandingSys;
	}

	public java.lang.Float getBPStandingDias() {
		return bPStandingDias;
	}
	public void setBPStandingDias(java.lang.Float bPStandingDias) {
		this.bPStandingDias = bPStandingDias;
	}

	public Integer getTimeInterval() {
		return timeInterval;
	}
	public void setTimeInterval(Integer timeInterval) {
		this.timeInterval = timeInterval;
	}

	public java.lang.Float getBPLyingSys() {
		return bPLyingSys;
	}
	public void setBPLyingSys(java.lang.Float bPLyingSys) {
		this.bPLyingSys = bPLyingSys;
	}

	public java.lang.Float getBPLyingDias() {
		return bPLyingDias;
	}
	public void setBPLyingDias(java.lang.Float bPLyingDias) {
		this.bPLyingDias = bPLyingDias;
	}

	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		if ( null != comment && comment.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for comment. Tried to set value: "+
				comment);
		}
		this.comment = comment;
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
		
		auditStr.append("\r\n*bPSittingSys* :");
		auditStr.append(bPSittingSys);
	    auditStr.append("; ");
		auditStr.append("\r\n*bPSittingDias* :");
		auditStr.append(bPSittingDias);
	    auditStr.append("; ");
		auditStr.append("\r\n*bPStandingSys* :");
		auditStr.append(bPStandingSys);
	    auditStr.append("; ");
		auditStr.append("\r\n*bPStandingDias* :");
		auditStr.append(bPStandingDias);
	    auditStr.append("; ");
		auditStr.append("\r\n*timeInterval* :");
		auditStr.append(timeInterval);
	    auditStr.append("; ");
		auditStr.append("\r\n*bPLyingSys* :");
		auditStr.append(bPLyingSys);
	    auditStr.append("; ");
		auditStr.append("\r\n*bPLyingDias* :");
		auditStr.append(bPLyingDias);
	    auditStr.append("; ");
		auditStr.append("\r\n*comment* :");
		auditStr.append(comment);
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
		
		String keyClassName = "Bloodpressure";
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
		if (this.getBPSittingSys() != null)
		{
			sb.append("<bPSittingSys>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getBPSittingSys().toString()));
			sb.append("</bPSittingSys>");		
		}
		if (this.getBPSittingDias() != null)
		{
			sb.append("<bPSittingDias>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getBPSittingDias().toString()));
			sb.append("</bPSittingDias>");		
		}
		if (this.getBPStandingSys() != null)
		{
			sb.append("<bPStandingSys>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getBPStandingSys().toString()));
			sb.append("</bPStandingSys>");		
		}
		if (this.getBPStandingDias() != null)
		{
			sb.append("<bPStandingDias>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getBPStandingDias().toString()));
			sb.append("</bPStandingDias>");		
		}
		if (this.getTimeInterval() != null)
		{
			sb.append("<timeInterval>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTimeInterval().toString()));
			sb.append("</timeInterval>");		
		}
		if (this.getBPLyingSys() != null)
		{
			sb.append("<bPLyingSys>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getBPLyingSys().toString()));
			sb.append("</bPLyingSys>");		
		}
		if (this.getBPLyingDias() != null)
		{
			sb.append("<bPLyingDias>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getBPLyingDias().toString()));
			sb.append("</bPLyingDias>");		
		}
		if (this.getComment() != null)
		{
			sb.append("<comment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComment().toString()));
			sb.append("</comment>");		
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
			Bloodpressure domainObject = getBloodpressurefromXML(itemEl, factory, domMap);

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
			Bloodpressure domainObject = getBloodpressurefromXML(itemEl, factory, domMap);

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
		
	public static Bloodpressure getBloodpressurefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getBloodpressurefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Bloodpressure getBloodpressurefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Bloodpressure.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Bloodpressure.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Bloodpressure class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Bloodpressure)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Bloodpressure.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Bloodpressure ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Bloodpressure)factory.getImportedDomainObject(Bloodpressure.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Bloodpressure();
		}
		String keyClassName = "Bloodpressure";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Bloodpressure)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Bloodpressure obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("bPSittingSys");
		if(fldEl != null)
		{	
    		obj.setBPSittingSys(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("bPSittingDias");
		if(fldEl != null)
		{	
    		obj.setBPSittingDias(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("bPStandingSys");
		if(fldEl != null)
		{	
    		obj.setBPStandingSys(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("bPStandingDias");
		if(fldEl != null)
		{	
    		obj.setBPStandingDias(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("timeInterval");
		if(fldEl != null)
		{	
    		obj.setTimeInterval(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("bPLyingSys");
		if(fldEl != null)
		{	
    		obj.setBPLyingSys(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("bPLyingDias");
		if(fldEl != null)
		{	
    		obj.setBPLyingDias(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("comment");
		if(fldEl != null)
		{	
    		obj.setComment(new String(fldEl.getTextTrim()));	
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
		public static final String BPSittingSys = "bPSittingSys";
		public static final String BPSittingDias = "bPSittingDias";
		public static final String BPStandingSys = "bPStandingSys";
		public static final String BPStandingDias = "bPStandingDias";
		public static final String TimeInterval = "timeInterval";
		public static final String BPLyingSys = "bPLyingSys";
		public static final String BPLyingDias = "bPLyingDias";
		public static final String Comment = "comment";
	}
}

