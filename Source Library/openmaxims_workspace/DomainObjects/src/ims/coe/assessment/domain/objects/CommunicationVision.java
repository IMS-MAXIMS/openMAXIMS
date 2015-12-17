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
package ims.coe.assessment.domain.objects;

/**
 * 
 * @author Sinead McDermott
 * Generated.
 */


public class CommunicationVision extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1012100016;
	private static final long serialVersionUID = 1012100016L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private ims.domain.lookups.LookupInstance visualImpairment;
	private ims.domain.lookups.LookupInstance effectedEyes;
	private ims.domain.lookups.LookupInstance wearGlasses;
	private Integer numberOfGlasses;
	private ims.domain.lookups.LookupInstance wearLenses;
	/** Text field to allow user input */
	private String other;
	private Integer yearLastEyeTest;
	private ims.domain.lookups.LookupInstance registeredBlind;
    public CommunicationVision (Integer id, int ver)
    {
    	super(id, ver);
    }
    public CommunicationVision ()
    {
    	super();
    }
    public CommunicationVision (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.coe.assessment.domain.objects.CommunicationVision.class;
	}


	public ims.domain.lookups.LookupInstance getVisualImpairment() {
		return visualImpairment;
	}
	public void setVisualImpairment(ims.domain.lookups.LookupInstance visualImpairment) {
		this.visualImpairment = visualImpairment;
	}

	public ims.domain.lookups.LookupInstance getEffectedEyes() {
		return effectedEyes;
	}
	public void setEffectedEyes(ims.domain.lookups.LookupInstance effectedEyes) {
		this.effectedEyes = effectedEyes;
	}

	public ims.domain.lookups.LookupInstance getWearGlasses() {
		return wearGlasses;
	}
	public void setWearGlasses(ims.domain.lookups.LookupInstance wearGlasses) {
		this.wearGlasses = wearGlasses;
	}

	public Integer getNumberOfGlasses() {
		return numberOfGlasses;
	}
	public void setNumberOfGlasses(Integer numberOfGlasses) {
		this.numberOfGlasses = numberOfGlasses;
	}

	public ims.domain.lookups.LookupInstance getWearLenses() {
		return wearLenses;
	}
	public void setWearLenses(ims.domain.lookups.LookupInstance wearLenses) {
		this.wearLenses = wearLenses;
	}

	public String getOther() {
		return other;
	}
	public void setOther(String other) {
		this.other = other;
	}

	public Integer getYearLastEyeTest() {
		return yearLastEyeTest;
	}
	public void setYearLastEyeTest(Integer yearLastEyeTest) {
		this.yearLastEyeTest = yearLastEyeTest;
	}

	public ims.domain.lookups.LookupInstance getRegisteredBlind() {
		return registeredBlind;
	}
	public void setRegisteredBlind(ims.domain.lookups.LookupInstance registeredBlind) {
		this.registeredBlind = registeredBlind;
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
		
		auditStr.append("\r\n*visualImpairment* :");
		if (visualImpairment != null)
			auditStr.append(visualImpairment.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*effectedEyes* :");
		if (effectedEyes != null)
			auditStr.append(effectedEyes.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*wearGlasses* :");
		if (wearGlasses != null)
			auditStr.append(wearGlasses.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*numberOfGlasses* :");
		auditStr.append(numberOfGlasses);
	    auditStr.append("; ");
		auditStr.append("\r\n*wearLenses* :");
		if (wearLenses != null)
			auditStr.append(wearLenses.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*other* :");
		auditStr.append(other);
	    auditStr.append("; ");
		auditStr.append("\r\n*yearLastEyeTest* :");
		auditStr.append(yearLastEyeTest);
	    auditStr.append("; ");
		auditStr.append("\r\n*registeredBlind* :");
		if (registeredBlind != null)
			auditStr.append(registeredBlind.getText());
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
		
		String keyClassName = "CommunicationVision";
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
		if (this.getVisualImpairment() != null)
		{
			sb.append("<visualImpairment>");
			sb.append(this.getVisualImpairment().toXMLString()); 
			sb.append("</visualImpairment>");		
		}
		if (this.getEffectedEyes() != null)
		{
			sb.append("<effectedEyes>");
			sb.append(this.getEffectedEyes().toXMLString()); 
			sb.append("</effectedEyes>");		
		}
		if (this.getWearGlasses() != null)
		{
			sb.append("<wearGlasses>");
			sb.append(this.getWearGlasses().toXMLString()); 
			sb.append("</wearGlasses>");		
		}
		if (this.getNumberOfGlasses() != null)
		{
			sb.append("<numberOfGlasses>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNumberOfGlasses().toString()));
			sb.append("</numberOfGlasses>");		
		}
		if (this.getWearLenses() != null)
		{
			sb.append("<wearLenses>");
			sb.append(this.getWearLenses().toXMLString()); 
			sb.append("</wearLenses>");		
		}
		if (this.getOther() != null)
		{
			sb.append("<other>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOther().toString()));
			sb.append("</other>");		
		}
		if (this.getYearLastEyeTest() != null)
		{
			sb.append("<yearLastEyeTest>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getYearLastEyeTest().toString()));
			sb.append("</yearLastEyeTest>");		
		}
		if (this.getRegisteredBlind() != null)
		{
			sb.append("<registeredBlind>");
			sb.append(this.getRegisteredBlind().toXMLString()); 
			sb.append("</registeredBlind>");		
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
			CommunicationVision domainObject = getCommunicationVisionfromXML(itemEl, factory, domMap);

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
			CommunicationVision domainObject = getCommunicationVisionfromXML(itemEl, factory, domMap);

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
		
	public static CommunicationVision getCommunicationVisionfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getCommunicationVisionfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static CommunicationVision getCommunicationVisionfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!CommunicationVision.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!CommunicationVision.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the CommunicationVision class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (CommunicationVision)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(CommunicationVision.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		CommunicationVision ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (CommunicationVision)factory.getImportedDomainObject(CommunicationVision.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new CommunicationVision();
		}
		String keyClassName = "CommunicationVision";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (CommunicationVision)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, CommunicationVision obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("visualImpairment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setVisualImpairment(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("effectedEyes");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setEffectedEyes(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("wearGlasses");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setWearGlasses(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("numberOfGlasses");
		if(fldEl != null)
		{	
    		obj.setNumberOfGlasses(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("wearLenses");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setWearLenses(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("other");
		if(fldEl != null)
		{	
    		obj.setOther(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("yearLastEyeTest");
		if(fldEl != null)
		{	
    		obj.setYearLastEyeTest(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("registeredBlind");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRegisteredBlind(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		public static final String VisualImpairment = "visualImpairment";
		public static final String EffectedEyes = "effectedEyes";
		public static final String WearGlasses = "wearGlasses";
		public static final String NumberOfGlasses = "numberOfGlasses";
		public static final String WearLenses = "wearLenses";
		public static final String Other = "other";
		public static final String YearLastEyeTest = "yearLastEyeTest";
		public static final String RegisteredBlind = "registeredBlind";
	}
}

