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
package ims.coe.assessment.domain.objects;

/**
 * 
 * @author Sinead McDermott
 * Generated.
 */


public class BowelConstipation extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1012100017;
	private static final long serialVersionUID = 1012100017L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private ims.domain.lookups.LookupInstance proneToConstipation;
	private ims.domain.lookups.LookupInstance stainingOfFaeces;
	private ims.domain.lookups.LookupInstance leakageOfFaecesAtPresent;
	private ims.domain.lookups.LookupInstance leakageOfFaecesPast;
	private String howLongAgo;
	private ims.domain.lookups.LookupInstance takingLaxatives;
    public BowelConstipation (Integer id, int ver)
    {
    	super(id, ver);
    }
    public BowelConstipation ()
    {
    	super();
    }
    public BowelConstipation (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.coe.assessment.domain.objects.BowelConstipation.class;
	}


	public ims.domain.lookups.LookupInstance getProneToConstipation() {
		return proneToConstipation;
	}
	public void setProneToConstipation(ims.domain.lookups.LookupInstance proneToConstipation) {
		this.proneToConstipation = proneToConstipation;
	}

	public ims.domain.lookups.LookupInstance getStainingOfFaeces() {
		return stainingOfFaeces;
	}
	public void setStainingOfFaeces(ims.domain.lookups.LookupInstance stainingOfFaeces) {
		this.stainingOfFaeces = stainingOfFaeces;
	}

	public ims.domain.lookups.LookupInstance getLeakageOfFaecesAtPresent() {
		return leakageOfFaecesAtPresent;
	}
	public void setLeakageOfFaecesAtPresent(ims.domain.lookups.LookupInstance leakageOfFaecesAtPresent) {
		this.leakageOfFaecesAtPresent = leakageOfFaecesAtPresent;
	}

	public ims.domain.lookups.LookupInstance getLeakageOfFaecesPast() {
		return leakageOfFaecesPast;
	}
	public void setLeakageOfFaecesPast(ims.domain.lookups.LookupInstance leakageOfFaecesPast) {
		this.leakageOfFaecesPast = leakageOfFaecesPast;
	}

	public String getHowLongAgo() {
		return howLongAgo;
	}
	public void setHowLongAgo(String howLongAgo) {
		this.howLongAgo = howLongAgo;
	}

	public ims.domain.lookups.LookupInstance getTakingLaxatives() {
		return takingLaxatives;
	}
	public void setTakingLaxatives(ims.domain.lookups.LookupInstance takingLaxatives) {
		this.takingLaxatives = takingLaxatives;
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
		
		auditStr.append("\r\n*proneToConstipation* :");
		if (proneToConstipation != null)
			auditStr.append(proneToConstipation.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*stainingOfFaeces* :");
		if (stainingOfFaeces != null)
			auditStr.append(stainingOfFaeces.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*leakageOfFaecesAtPresent* :");
		if (leakageOfFaecesAtPresent != null)
			auditStr.append(leakageOfFaecesAtPresent.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*leakageOfFaecesPast* :");
		if (leakageOfFaecesPast != null)
			auditStr.append(leakageOfFaecesPast.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*howLongAgo* :");
		auditStr.append(howLongAgo);
	    auditStr.append("; ");
		auditStr.append("\r\n*takingLaxatives* :");
		if (takingLaxatives != null)
			auditStr.append(takingLaxatives.getText());
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
		
		String keyClassName = "BowelConstipation";
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
		if (this.getProneToConstipation() != null)
		{
			sb.append("<proneToConstipation>");
			sb.append(this.getProneToConstipation().toXMLString()); 
			sb.append("</proneToConstipation>");		
		}
		if (this.getStainingOfFaeces() != null)
		{
			sb.append("<stainingOfFaeces>");
			sb.append(this.getStainingOfFaeces().toXMLString()); 
			sb.append("</stainingOfFaeces>");		
		}
		if (this.getLeakageOfFaecesAtPresent() != null)
		{
			sb.append("<leakageOfFaecesAtPresent>");
			sb.append(this.getLeakageOfFaecesAtPresent().toXMLString()); 
			sb.append("</leakageOfFaecesAtPresent>");		
		}
		if (this.getLeakageOfFaecesPast() != null)
		{
			sb.append("<leakageOfFaecesPast>");
			sb.append(this.getLeakageOfFaecesPast().toXMLString()); 
			sb.append("</leakageOfFaecesPast>");		
		}
		if (this.getHowLongAgo() != null)
		{
			sb.append("<howLongAgo>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getHowLongAgo().toString()));
			sb.append("</howLongAgo>");		
		}
		if (this.getTakingLaxatives() != null)
		{
			sb.append("<takingLaxatives>");
			sb.append(this.getTakingLaxatives().toXMLString()); 
			sb.append("</takingLaxatives>");		
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
			BowelConstipation domainObject = getBowelConstipationfromXML(itemEl, factory, domMap);

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
			BowelConstipation domainObject = getBowelConstipationfromXML(itemEl, factory, domMap);

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
		
	public static BowelConstipation getBowelConstipationfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getBowelConstipationfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static BowelConstipation getBowelConstipationfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!BowelConstipation.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!BowelConstipation.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the BowelConstipation class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (BowelConstipation)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(BowelConstipation.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		BowelConstipation ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (BowelConstipation)factory.getImportedDomainObject(BowelConstipation.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new BowelConstipation();
		}
		String keyClassName = "BowelConstipation";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (BowelConstipation)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, BowelConstipation obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("proneToConstipation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setProneToConstipation(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("stainingOfFaeces");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setStainingOfFaeces(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("leakageOfFaecesAtPresent");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setLeakageOfFaecesAtPresent(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("leakageOfFaecesPast");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setLeakageOfFaecesPast(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("howLongAgo");
		if(fldEl != null)
		{	
    		obj.setHowLongAgo(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("takingLaxatives");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTakingLaxatives(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		public static final String ProneToConstipation = "proneToConstipation";
		public static final String StainingOfFaeces = "stainingOfFaeces";
		public static final String LeakageOfFaecesAtPresent = "leakageOfFaecesAtPresent";
		public static final String LeakageOfFaecesPast = "leakageOfFaecesPast";
		public static final String HowLongAgo = "howLongAgo";
		public static final String TakingLaxatives = "takingLaxatives";
	}
}

