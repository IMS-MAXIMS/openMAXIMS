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


public class SpiritualityComponent extends ims.nursing.assessment.domain.objects.AssessmentComponent implements java.io.Serializable {
	public static final int CLASSID = 1012100041;
	private static final long serialVersionUID = 1012100041L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Read only from Demographics */
	private String religion;
	private ims.domain.lookups.LookupInstance beliefOrFaith;
	private ims.domain.lookups.LookupInstance practicingMember;
	private ims.domain.lookups.LookupInstance continuePracticing;
	private String name;
	private String address;
	private String telephoneNumber;
	private String requirements;
    public SpiritualityComponent (Integer id, int ver)
    {
    	super(id, ver);
    }
    public SpiritualityComponent ()
    {
    	super();
    }
    public SpiritualityComponent (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.coe.assessment.domain.objects.SpiritualityComponent.class;
	}


	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}

	public ims.domain.lookups.LookupInstance getBeliefOrFaith() {
		return beliefOrFaith;
	}
	public void setBeliefOrFaith(ims.domain.lookups.LookupInstance beliefOrFaith) {
		this.beliefOrFaith = beliefOrFaith;
	}

	public ims.domain.lookups.LookupInstance getPracticingMember() {
		return practicingMember;
	}
	public void setPracticingMember(ims.domain.lookups.LookupInstance practicingMember) {
		this.practicingMember = practicingMember;
	}

	public ims.domain.lookups.LookupInstance getContinuePracticing() {
		return continuePracticing;
	}
	public void setContinuePracticing(ims.domain.lookups.LookupInstance continuePracticing) {
		this.continuePracticing = continuePracticing;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(String telephoneNumber) {
		if ( null != telephoneNumber && telephoneNumber.length() > 30 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for telephoneNumber. Tried to set value: "+
				telephoneNumber);
		}
		this.telephoneNumber = telephoneNumber;
	}

	public String getRequirements() {
		return requirements;
	}
	public void setRequirements(String requirements) {
		this.requirements = requirements;
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
		auditStr.append("\r\n*religion* :");
		auditStr.append(religion);
	    auditStr.append("; ");
		auditStr.append("\r\n*beliefOrFaith* :");
		if (beliefOrFaith != null)
			auditStr.append(beliefOrFaith.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*practicingMember* :");
		if (practicingMember != null)
			auditStr.append(practicingMember.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*continuePracticing* :");
		if (continuePracticing != null)
			auditStr.append(continuePracticing.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*name* :");
		auditStr.append(name);
	    auditStr.append("; ");
		auditStr.append("\r\n*address* :");
		auditStr.append(address);
	    auditStr.append("; ");
		auditStr.append("\r\n*telephoneNumber* :");
		auditStr.append(telephoneNumber);
	    auditStr.append("; ");
		auditStr.append("\r\n*requirements* :");
		auditStr.append(requirements);
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
		
		String keyClassName = "SpiritualityComponent";
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
		if (this.getReligion() != null)
		{
			sb.append("<religion>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReligion().toString()));
			sb.append("</religion>");		
		}
		if (this.getBeliefOrFaith() != null)
		{
			sb.append("<beliefOrFaith>");
			sb.append(this.getBeliefOrFaith().toXMLString()); 
			sb.append("</beliefOrFaith>");		
		}
		if (this.getPracticingMember() != null)
		{
			sb.append("<practicingMember>");
			sb.append(this.getPracticingMember().toXMLString()); 
			sb.append("</practicingMember>");		
		}
		if (this.getContinuePracticing() != null)
		{
			sb.append("<continuePracticing>");
			sb.append(this.getContinuePracticing().toXMLString()); 
			sb.append("</continuePracticing>");		
		}
		if (this.getName() != null)
		{
			sb.append("<name>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getName().toString()));
			sb.append("</name>");		
		}
		if (this.getAddress() != null)
		{
			sb.append("<address>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAddress().toString()));
			sb.append("</address>");		
		}
		if (this.getTelephoneNumber() != null)
		{
			sb.append("<telephoneNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTelephoneNumber().toString()));
			sb.append("</telephoneNumber>");		
		}
		if (this.getRequirements() != null)
		{
			sb.append("<requirements>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRequirements().toString()));
			sb.append("</requirements>");		
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
			SpiritualityComponent domainObject = getSpiritualityComponentfromXML(itemEl, factory, domMap);

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
			SpiritualityComponent domainObject = getSpiritualityComponentfromXML(itemEl, factory, domMap);

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
		
	public static SpiritualityComponent getSpiritualityComponentfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getSpiritualityComponentfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static SpiritualityComponent getSpiritualityComponentfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!SpiritualityComponent.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!SpiritualityComponent.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the SpiritualityComponent class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (SpiritualityComponent)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(SpiritualityComponent.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		SpiritualityComponent ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (SpiritualityComponent)factory.getImportedDomainObject(SpiritualityComponent.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new SpiritualityComponent();
		}
		String keyClassName = "SpiritualityComponent";
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
			return (SpiritualityComponent)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, SpiritualityComponent obj, java.util.HashMap domMap) throws Exception
	{
		ims.nursing.assessment.domain.objects.AssessmentComponent.fillFieldsfromXML(el, factory, obj, domMap);
		org.dom4j.Element fldEl;
		fldEl = el.element("religion");
		if(fldEl != null)
		{	
    		obj.setReligion(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("beliefOrFaith");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setBeliefOrFaith(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("practicingMember");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPracticingMember(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("continuePracticing");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setContinuePracticing(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("name");
		if(fldEl != null)
		{	
    		obj.setName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("address");
		if(fldEl != null)
		{	
    		obj.setAddress(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("telephoneNumber");
		if(fldEl != null)
		{	
    		obj.setTelephoneNumber(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("requirements");
		if(fldEl != null)
		{	
    		obj.setRequirements(new String(fldEl.getTextTrim()));	
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
		public static final String Religion = "religion";
		public static final String BeliefOrFaith = "beliefOrFaith";
		public static final String PracticingMember = "practicingMember";
		public static final String ContinuePracticing = "continuePracticing";
		public static final String Name = "name";
		public static final String Address = "address";
		public static final String TelephoneNumber = "telephoneNumber";
		public static final String Requirements = "requirements";
	}
}

