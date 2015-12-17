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


public class BowelComponent extends ims.nursing.assessment.domain.objects.AssessmentComponent implements java.io.Serializable {
	public static final int CLASSID = 1012100008;
	private static final long serialVersionUID = 1012100008L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private ims.nursing.assessment.domain.objects.BowelOstomy bowelOstomy;
	private ims.coe.assessment.domain.objects.BowelDiarrhoea diarrhoea;
	private ims.domain.lookups.LookupInstance bowelsOpen;
	private ims.coe.assessment.domain.objects.BowelConstipation constipation;
	/** 
	  * Collection of ims.coe.assessment.domain.objects.BowelMedication.
	  */
	private java.util.List bowelMedication;
	private String alternativesUsed;
    public BowelComponent (Integer id, int ver)
    {
    	super(id, ver);
    }
    public BowelComponent ()
    {
    	super();
    }
    public BowelComponent (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.coe.assessment.domain.objects.BowelComponent.class;
	}


	public ims.nursing.assessment.domain.objects.BowelOstomy getBowelOstomy() {
		return bowelOstomy;
	}
	public void setBowelOstomy(ims.nursing.assessment.domain.objects.BowelOstomy bowelOstomy) {
		this.bowelOstomy = bowelOstomy;
	}

	public ims.coe.assessment.domain.objects.BowelDiarrhoea getDiarrhoea() {
		return diarrhoea;
	}
	public void setDiarrhoea(ims.coe.assessment.domain.objects.BowelDiarrhoea diarrhoea) {
		this.diarrhoea = diarrhoea;
	}

	public ims.domain.lookups.LookupInstance getBowelsOpen() {
		return bowelsOpen;
	}
	public void setBowelsOpen(ims.domain.lookups.LookupInstance bowelsOpen) {
		this.bowelsOpen = bowelsOpen;
	}

	public ims.coe.assessment.domain.objects.BowelConstipation getConstipation() {
		return constipation;
	}
	public void setConstipation(ims.coe.assessment.domain.objects.BowelConstipation constipation) {
		this.constipation = constipation;
	}

	public java.util.List getBowelMedication() {
		if ( null == bowelMedication ) {
			bowelMedication = new java.util.ArrayList();
		}
		return bowelMedication;
	}
	public void setBowelMedication(java.util.List paramValue) {
		this.bowelMedication = paramValue;
	}

	public String getAlternativesUsed() {
		return alternativesUsed;
	}
	public void setAlternativesUsed(String alternativesUsed) {
		this.alternativesUsed = alternativesUsed;
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
		
		auditStr.append(super.toAuditString());
		auditStr.append("\r\n*bowelOstomy* :");
		if (bowelOstomy != null)
		{
			auditStr.append(toShortClassName(bowelOstomy));
				
		    auditStr.append(bowelOstomy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*diarrhoea* :");
		if (diarrhoea != null)
		{
			auditStr.append(toShortClassName(diarrhoea));
				
		    auditStr.append(diarrhoea.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*bowelsOpen* :");
		if (bowelsOpen != null)
			auditStr.append(bowelsOpen.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*constipation* :");
		if (constipation != null)
		{
			auditStr.append(toShortClassName(constipation));
				
		    auditStr.append(constipation.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*bowelMedication* :");
		if (bowelMedication != null)
		{
		int i5=0;
		for (i5=0; i5<bowelMedication.size(); i5++)
		{
			if (i5 > 0)
				auditStr.append(",");
			ims.coe.assessment.domain.objects.BowelMedication obj = (ims.coe.assessment.domain.objects.BowelMedication)bowelMedication.get(i5);
		    if (obj != null)
			{
				if (i5 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i5 > 0)
			auditStr.append("] " + i5);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*alternativesUsed* :");
		auditStr.append(alternativesUsed);
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
		
		String keyClassName = "BowelComponent";
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
		sb.append(super.fieldsToXMLString(domMap));
		if (this.getBowelOstomy() != null)
		{
			sb.append("<bowelOstomy>");
			sb.append(this.getBowelOstomy().toXMLString(domMap)); 	
			sb.append("</bowelOstomy>");		
		}
		if (this.getDiarrhoea() != null)
		{
			sb.append("<diarrhoea>");
			sb.append(this.getDiarrhoea().toXMLString(domMap)); 	
			sb.append("</diarrhoea>");		
		}
		if (this.getBowelsOpen() != null)
		{
			sb.append("<bowelsOpen>");
			sb.append(this.getBowelsOpen().toXMLString()); 
			sb.append("</bowelsOpen>");		
		}
		if (this.getConstipation() != null)
		{
			sb.append("<constipation>");
			sb.append(this.getConstipation().toXMLString(domMap)); 	
			sb.append("</constipation>");		
		}
		if (this.getBowelMedication() != null)
		{
			if (this.getBowelMedication().size() > 0 )
			{
			sb.append("<bowelMedication>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getBowelMedication(), domMap));
			sb.append("</bowelMedication>");		
			}
		}
		if (this.getAlternativesUsed() != null)
		{
			sb.append("<alternativesUsed>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAlternativesUsed().toString()));
			sb.append("</alternativesUsed>");		
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
			BowelComponent domainObject = getBowelComponentfromXML(itemEl, factory, domMap);

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
			BowelComponent domainObject = getBowelComponentfromXML(itemEl, factory, domMap);

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
		
	public static BowelComponent getBowelComponentfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getBowelComponentfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static BowelComponent getBowelComponentfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!BowelComponent.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!BowelComponent.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the BowelComponent class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (BowelComponent)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(BowelComponent.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		BowelComponent ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (BowelComponent)factory.getImportedDomainObject(BowelComponent.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new BowelComponent();
		}
		String keyClassName = "BowelComponent";
		Class clz = ret.getClass().getSuperclass();
		while (!clz.equals(ims.domain.DomainObject.class))
		{
			int dotIndex = clz.getName().lastIndexOf(".") + 1;
			keyClassName = clz.getName().substring(dotIndex); 
			clz = clz.getSuperclass();
		}

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (BowelComponent)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, BowelComponent obj, java.util.HashMap domMap) throws Exception
	{
		ims.nursing.assessment.domain.objects.AssessmentComponent.fillFieldsfromXML(el, factory, obj, domMap);
		org.dom4j.Element fldEl;
		fldEl = el.element("bowelOstomy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setBowelOstomy(ims.nursing.assessment.domain.objects.BowelOstomy.getBowelOstomyfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("diarrhoea");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setDiarrhoea(ims.coe.assessment.domain.objects.BowelDiarrhoea.getBowelDiarrhoeafromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("bowelsOpen");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setBowelsOpen(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("constipation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setConstipation(ims.coe.assessment.domain.objects.BowelConstipation.getBowelConstipationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("bowelMedication");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setBowelMedication(ims.coe.assessment.domain.objects.BowelMedication.fromListXMLString(fldEl, factory, obj.getBowelMedication(), domMap));
		}
		fldEl = el.element("alternativesUsed");
		if(fldEl != null)
		{	
    		obj.setAlternativesUsed(new String(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "bowelMedication"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String BowelOstomy = "bowelOstomy";
		public static final String Diarrhoea = "diarrhoea";
		public static final String BowelsOpen = "bowelsOpen";
		public static final String Constipation = "constipation";
		public static final String BowelMedication = "bowelMedication";
		public static final String AlternativesUsed = "alternativesUsed";
	}
}

