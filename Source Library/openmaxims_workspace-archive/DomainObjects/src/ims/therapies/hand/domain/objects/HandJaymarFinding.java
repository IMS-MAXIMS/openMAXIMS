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
package ims.therapies.hand.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class HandJaymarFinding extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1042100000;
	private static final long serialVersionUID = 1042100000L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Laterality */
	private ims.domain.lookups.LookupInstance laterality;
	/** Test1 */
	private java.lang.Float test1;
	/** Test2 */
	private java.lang.Float test2;
	/** Test3 */
	private java.lang.Float test3;
	/** LevelAverage */
	private java.lang.Float levelAverage;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public HandJaymarFinding (Integer id, int ver)
    {
    	super(id, ver);
    }
    public HandJaymarFinding ()
    {
    	super();
    }
    public HandJaymarFinding (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.therapies.hand.domain.objects.HandJaymarFinding.class;
	}


	public ims.domain.lookups.LookupInstance getLaterality() {
		return laterality;
	}
	public void setLaterality(ims.domain.lookups.LookupInstance laterality) {
		this.laterality = laterality;
	}

	public java.lang.Float getTest1() {
		return test1;
	}
	public void setTest1(java.lang.Float test1) {
		this.test1 = test1;
	}

	public java.lang.Float getTest2() {
		return test2;
	}
	public void setTest2(java.lang.Float test2) {
		this.test2 = test2;
	}

	public java.lang.Float getTest3() {
		return test3;
	}
	public void setTest3(java.lang.Float test3) {
		this.test3 = test3;
	}

	public java.lang.Float getLevelAverage() {
		return levelAverage;
	}
	public void setLevelAverage(java.lang.Float levelAverage) {
		this.levelAverage = levelAverage;
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
		
		auditStr.append("\r\n*laterality* :");
		if (laterality != null)
			auditStr.append(laterality.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*test1* :");
		auditStr.append(test1);
	    auditStr.append("; ");
		auditStr.append("\r\n*test2* :");
		auditStr.append(test2);
	    auditStr.append("; ");
		auditStr.append("\r\n*test3* :");
		auditStr.append(test3);
	    auditStr.append("; ");
		auditStr.append("\r\n*levelAverage* :");
		auditStr.append(levelAverage);
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
		
		String keyClassName = "HandJaymarFinding";
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
		if (this.getLaterality() != null)
		{
			sb.append("<laterality>");
			sb.append(this.getLaterality().toXMLString()); 
			sb.append("</laterality>");		
		}
		if (this.getTest1() != null)
		{
			sb.append("<test1>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTest1().toString()));
			sb.append("</test1>");		
		}
		if (this.getTest2() != null)
		{
			sb.append("<test2>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTest2().toString()));
			sb.append("</test2>");		
		}
		if (this.getTest3() != null)
		{
			sb.append("<test3>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTest3().toString()));
			sb.append("</test3>");		
		}
		if (this.getLevelAverage() != null)
		{
			sb.append("<levelAverage>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLevelAverage().toString()));
			sb.append("</levelAverage>");		
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
			HandJaymarFinding domainObject = getHandJaymarFindingfromXML(itemEl, factory, domMap);

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
			HandJaymarFinding domainObject = getHandJaymarFindingfromXML(itemEl, factory, domMap);

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
		
	public static HandJaymarFinding getHandJaymarFindingfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getHandJaymarFindingfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static HandJaymarFinding getHandJaymarFindingfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!HandJaymarFinding.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!HandJaymarFinding.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the HandJaymarFinding class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (HandJaymarFinding)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(HandJaymarFinding.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		HandJaymarFinding ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (HandJaymarFinding)factory.getImportedDomainObject(HandJaymarFinding.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new HandJaymarFinding();
		}
		String keyClassName = "HandJaymarFinding";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (HandJaymarFinding)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, HandJaymarFinding obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("laterality");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setLaterality(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("test1");
		if(fldEl != null)
		{	
    		obj.setTest1(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("test2");
		if(fldEl != null)
		{	
    		obj.setTest2(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("test3");
		if(fldEl != null)
		{	
    		obj.setTest3(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("levelAverage");
		if(fldEl != null)
		{	
    		obj.setLevelAverage(new java.lang.Float(fldEl.getTextTrim()));	
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
		public static final String Laterality = "laterality";
		public static final String Test1 = "test1";
		public static final String Test2 = "test2";
		public static final String Test3 = "test3";
		public static final String LevelAverage = "levelAverage";
	}
}

