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
package ims.core.clinical.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class MskGroups extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1040100000;
	private static final long serialVersionUID = 1040100000L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Name */
	private String name;
	/** Description */
	private String description;
	/** Indicates that it is currently Active Record */
	private Boolean isActive;
	/** Indicates that Movements may be configured */
	private Boolean isJoint;
	/** Bone General Findings
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List boneGeneralFindings;
	/** Joint General Findings
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List jointGeneralFindings;
	/** Bones in Area
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List bones;
	/** Associated Joints
	  * Collection of ims.core.clinical.domain.objects.MskJoints.
	  */
	private java.util.Set joints;
	/** HandMovementTests
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List handMovementTests;
	/** GroupType ( joints---Central/Digit) */
	private ims.domain.lookups.LookupInstance groupType;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public MskGroups (Integer id, int ver)
    {
    	super(id, ver);
    }
    public MskGroups ()
    {
    	super();
    }
    public MskGroups (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.MskGroups.class;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		if ( null != name && name.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for name. Tried to set value: "+
				name);
		}
		this.name = name;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		if ( null != description && description.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for description. Tried to set value: "+
				description);
		}
		this.description = description;
	}

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean isIsJoint() {
		return isJoint;
	}
	public void setIsJoint(Boolean isJoint) {
		this.isJoint = isJoint;
	}

	public java.util.List getBoneGeneralFindings() {
		if ( null == boneGeneralFindings ) {
			boneGeneralFindings = new java.util.ArrayList();
		}
		return boneGeneralFindings;
	}
	public void setBoneGeneralFindings(java.util.List paramValue) {
		this.boneGeneralFindings = paramValue;
	}

	public java.util.List getJointGeneralFindings() {
		if ( null == jointGeneralFindings ) {
			jointGeneralFindings = new java.util.ArrayList();
		}
		return jointGeneralFindings;
	}
	public void setJointGeneralFindings(java.util.List paramValue) {
		this.jointGeneralFindings = paramValue;
	}

	public java.util.List getBones() {
		if ( null == bones ) {
			bones = new java.util.ArrayList();
		}
		return bones;
	}
	public void setBones(java.util.List paramValue) {
		this.bones = paramValue;
	}

	public java.util.Set getJoints() {
		if ( null == joints ) {
			joints = new java.util.HashSet();
		}
		return joints;
	}
	public void setJoints(java.util.Set paramValue) {
		this.joints = paramValue;
	}

	public java.util.List getHandMovementTests() {
		if ( null == handMovementTests ) {
			handMovementTests = new java.util.ArrayList();
		}
		return handMovementTests;
	}
	public void setHandMovementTests(java.util.List paramValue) {
		this.handMovementTests = paramValue;
	}

	public ims.domain.lookups.LookupInstance getGroupType() {
		return groupType;
	}
	public void setGroupType(ims.domain.lookups.LookupInstance groupType) {
		this.groupType = groupType;
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
		
		auditStr.append("\r\n*name* :");
		auditStr.append(name);
	    auditStr.append("; ");
		auditStr.append("\r\n*description* :");
		auditStr.append(description);
	    auditStr.append("; ");
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
	    auditStr.append("; ");
		auditStr.append("\r\n*isJoint* :");
		auditStr.append(isJoint);
	    auditStr.append("; ");
		auditStr.append("\r\n*boneGeneralFindings* :");
		if (boneGeneralFindings != null)
		{
			java.util.Iterator it5 = boneGeneralFindings.iterator();
			int i5=0;
			while (it5.hasNext())
			{
				if (i5 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it5.next();
			auditStr.append(obj.getText());
			i5++;
		}
		if (i5 > 0)
			auditStr.append("] " + i5);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*jointGeneralFindings* :");
		if (jointGeneralFindings != null)
		{
			java.util.Iterator it6 = jointGeneralFindings.iterator();
			int i6=0;
			while (it6.hasNext())
			{
				if (i6 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it6.next();
			auditStr.append(obj.getText());
			i6++;
		}
		if (i6 > 0)
			auditStr.append("] " + i6);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*bones* :");
		if (bones != null)
		{
			java.util.Iterator it7 = bones.iterator();
			int i7=0;
			while (it7.hasNext())
			{
				if (i7 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it7.next();
			auditStr.append(obj.getText());
			i7++;
		}
		if (i7 > 0)
			auditStr.append("] " + i7);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*joints* :");
		if (joints != null)
		{
			java.util.Iterator it8 = joints.iterator();
			int i8=0;
			while (it8.hasNext())
			{
				if (i8 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.MskJoints obj = (ims.core.clinical.domain.objects.MskJoints)it8.next();
		if (obj != null)
		{
		   if (i8 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i8++;
		}
		if (i8 > 0)
			auditStr.append("] " + i8);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*handMovementTests* :");
		if (handMovementTests != null)
		{
			java.util.Iterator it9 = handMovementTests.iterator();
			int i9=0;
			while (it9.hasNext())
			{
				if (i9 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it9.next();
			auditStr.append(obj.getText());
			i9++;
		}
		if (i9 > 0)
			auditStr.append("] " + i9);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*groupType* :");
		if (groupType != null)
			auditStr.append(groupType.getText());
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
		
		String keyClassName = "MskGroups";
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
		if (this.getName() != null)
		{
			sb.append("<name>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getName().toString()));
			sb.append("</name>");		
		}
		if (this.getDescription() != null)
		{
			sb.append("<description>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDescription().toString()));
			sb.append("</description>");		
		}
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
		}
		if (this.isIsJoint() != null)
		{
			sb.append("<isJoint>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsJoint().toString()));
			sb.append("</isJoint>");		
		}
		if (this.getBoneGeneralFindings() != null)
		{
			if (this.getBoneGeneralFindings().size() > 0 )
			{
			sb.append("<boneGeneralFindings>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getBoneGeneralFindings())); 
			sb.append("</boneGeneralFindings>");		
			}
		}
		if (this.getJointGeneralFindings() != null)
		{
			if (this.getJointGeneralFindings().size() > 0 )
			{
			sb.append("<jointGeneralFindings>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getJointGeneralFindings())); 
			sb.append("</jointGeneralFindings>");		
			}
		}
		if (this.getBones() != null)
		{
			if (this.getBones().size() > 0 )
			{
			sb.append("<bones>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getBones())); 
			sb.append("</bones>");		
			}
		}
		if (this.getJoints() != null)
		{
			if (this.getJoints().size() > 0 )
			{
			sb.append("<joints>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getJoints(), domMap));
			sb.append("</joints>");		
			}
		}
		if (this.getHandMovementTests() != null)
		{
			if (this.getHandMovementTests().size() > 0 )
			{
			sb.append("<handMovementTests>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getHandMovementTests())); 
			sb.append("</handMovementTests>");		
			}
		}
		if (this.getGroupType() != null)
		{
			sb.append("<groupType>");
			sb.append(this.getGroupType().toXMLString()); 
			sb.append("</groupType>");		
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
			MskGroups domainObject = getMskGroupsfromXML(itemEl, factory, domMap);

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
			MskGroups domainObject = getMskGroupsfromXML(itemEl, factory, domMap);

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
		
	public static MskGroups getMskGroupsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getMskGroupsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static MskGroups getMskGroupsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!MskGroups.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!MskGroups.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the MskGroups class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (MskGroups)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(MskGroups.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		MskGroups ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (MskGroups)factory.getImportedDomainObject(MskGroups.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new MskGroups();
		}
		String keyClassName = "MskGroups";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (MskGroups)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, MskGroups obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("name");
		if(fldEl != null)
		{	
    		obj.setName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("description");
		if(fldEl != null)
		{	
    		obj.setDescription(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isJoint");
		if(fldEl != null)
		{	
    		obj.setIsJoint(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("boneGeneralFindings");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setBoneGeneralFindings(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getBoneGeneralFindings())); 
		}
		fldEl = el.element("jointGeneralFindings");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setJointGeneralFindings(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getJointGeneralFindings())); 
		}
		fldEl = el.element("bones");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setBones(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getBones())); 
		}
		fldEl = el.element("joints");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setJoints(ims.core.clinical.domain.objects.MskJoints.fromSetXMLString(fldEl, factory, obj.getJoints(), domMap));
		}
		fldEl = el.element("handMovementTests");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setHandMovementTests(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getHandMovementTests())); 
		}
		fldEl = el.element("groupType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setGroupType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "boneGeneralFindings"
		, "jointGeneralFindings"
		, "bones"
		, "joints"
		, "handMovementTests"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Name = "name";
		public static final String Description = "description";
		public static final String IsActive = "isActive";
		public static final String IsJoint = "isJoint";
		public static final String BoneGeneralFindings = "boneGeneralFindings";
		public static final String JointGeneralFindings = "jointGeneralFindings";
		public static final String Bones = "bones";
		public static final String Joints = "joints";
		public static final String HandMovementTests = "handMovementTests";
		public static final String GroupType = "groupType";
	}
}

