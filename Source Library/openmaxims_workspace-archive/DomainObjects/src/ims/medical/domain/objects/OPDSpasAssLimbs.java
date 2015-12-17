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
package ims.medical.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class OPDSpasAssLimbs extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1031100009;
	private static final long serialVersionUID = 1031100009L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Joint */
	private ims.core.clinical.domain.objects.MskJoints joint;
	/** Movement */
	private ims.domain.lookups.LookupInstance movement;
	/** Active Rom Left */
	private Integer activeRomLeft;
	/** Active Rom Right */
	private Integer activeRomRight;
	/** Passive Rom Left */
	private Integer passiveRomLeft;
	/** Passive Rom Right */
	private Integer passiveRomRight;
	/** Tone Left */
	private ims.domain.lookups.LookupInstance toneLeft;
	/** Tone Right */
	private ims.domain.lookups.LookupInstance toneRight;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public OPDSpasAssLimbs (Integer id, int ver)
    {
    	super(id, ver);
    }
    public OPDSpasAssLimbs ()
    {
    	super();
    }
    public OPDSpasAssLimbs (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.medical.domain.objects.OPDSpasAssLimbs.class;
	}


	public ims.core.clinical.domain.objects.MskJoints getJoint() {
		return joint;
	}
	public void setJoint(ims.core.clinical.domain.objects.MskJoints joint) {
		this.joint = joint;
	}

	public ims.domain.lookups.LookupInstance getMovement() {
		return movement;
	}
	public void setMovement(ims.domain.lookups.LookupInstance movement) {
		this.movement = movement;
	}

	public Integer getActiveRomLeft() {
		return activeRomLeft;
	}
	public void setActiveRomLeft(Integer activeRomLeft) {
		this.activeRomLeft = activeRomLeft;
	}

	public Integer getActiveRomRight() {
		return activeRomRight;
	}
	public void setActiveRomRight(Integer activeRomRight) {
		this.activeRomRight = activeRomRight;
	}

	public Integer getPassiveRomLeft() {
		return passiveRomLeft;
	}
	public void setPassiveRomLeft(Integer passiveRomLeft) {
		this.passiveRomLeft = passiveRomLeft;
	}

	public Integer getPassiveRomRight() {
		return passiveRomRight;
	}
	public void setPassiveRomRight(Integer passiveRomRight) {
		this.passiveRomRight = passiveRomRight;
	}

	public ims.domain.lookups.LookupInstance getToneLeft() {
		return toneLeft;
	}
	public void setToneLeft(ims.domain.lookups.LookupInstance toneLeft) {
		this.toneLeft = toneLeft;
	}

	public ims.domain.lookups.LookupInstance getToneRight() {
		return toneRight;
	}
	public void setToneRight(ims.domain.lookups.LookupInstance toneRight) {
		this.toneRight = toneRight;
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
		
		auditStr.append("\r\n*joint* :");
		if (joint != null)
		{
			auditStr.append(toShortClassName(joint));
				
		    auditStr.append(joint.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*movement* :");
		if (movement != null)
			auditStr.append(movement.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*activeRomLeft* :");
		auditStr.append(activeRomLeft);
	    auditStr.append("; ");
		auditStr.append("\r\n*activeRomRight* :");
		auditStr.append(activeRomRight);
	    auditStr.append("; ");
		auditStr.append("\r\n*passiveRomLeft* :");
		auditStr.append(passiveRomLeft);
	    auditStr.append("; ");
		auditStr.append("\r\n*passiveRomRight* :");
		auditStr.append(passiveRomRight);
	    auditStr.append("; ");
		auditStr.append("\r\n*toneLeft* :");
		if (toneLeft != null)
			auditStr.append(toneLeft.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*toneRight* :");
		if (toneRight != null)
			auditStr.append(toneRight.getText());
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
		
		String keyClassName = "OPDSpasAssLimbs";
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
		if (this.getJoint() != null)
		{
			sb.append("<joint>");
			sb.append(this.getJoint().toXMLString(domMap)); 	
			sb.append("</joint>");		
		}
		if (this.getMovement() != null)
		{
			sb.append("<movement>");
			sb.append(this.getMovement().toXMLString()); 
			sb.append("</movement>");		
		}
		if (this.getActiveRomLeft() != null)
		{
			sb.append("<activeRomLeft>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getActiveRomLeft().toString()));
			sb.append("</activeRomLeft>");		
		}
		if (this.getActiveRomRight() != null)
		{
			sb.append("<activeRomRight>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getActiveRomRight().toString()));
			sb.append("</activeRomRight>");		
		}
		if (this.getPassiveRomLeft() != null)
		{
			sb.append("<passiveRomLeft>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPassiveRomLeft().toString()));
			sb.append("</passiveRomLeft>");		
		}
		if (this.getPassiveRomRight() != null)
		{
			sb.append("<passiveRomRight>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPassiveRomRight().toString()));
			sb.append("</passiveRomRight>");		
		}
		if (this.getToneLeft() != null)
		{
			sb.append("<toneLeft>");
			sb.append(this.getToneLeft().toXMLString()); 
			sb.append("</toneLeft>");		
		}
		if (this.getToneRight() != null)
		{
			sb.append("<toneRight>");
			sb.append(this.getToneRight().toXMLString()); 
			sb.append("</toneRight>");		
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
			OPDSpasAssLimbs domainObject = getOPDSpasAssLimbsfromXML(itemEl, factory, domMap);

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
			OPDSpasAssLimbs domainObject = getOPDSpasAssLimbsfromXML(itemEl, factory, domMap);

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
		
	public static OPDSpasAssLimbs getOPDSpasAssLimbsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getOPDSpasAssLimbsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static OPDSpasAssLimbs getOPDSpasAssLimbsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!OPDSpasAssLimbs.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!OPDSpasAssLimbs.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the OPDSpasAssLimbs class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (OPDSpasAssLimbs)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(OPDSpasAssLimbs.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		OPDSpasAssLimbs ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (OPDSpasAssLimbs)factory.getImportedDomainObject(OPDSpasAssLimbs.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new OPDSpasAssLimbs();
		}
		String keyClassName = "OPDSpasAssLimbs";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (OPDSpasAssLimbs)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, OPDSpasAssLimbs obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("joint");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setJoint(ims.core.clinical.domain.objects.MskJoints.getMskJointsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("movement");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMovement(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("activeRomLeft");
		if(fldEl != null)
		{	
    		obj.setActiveRomLeft(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("activeRomRight");
		if(fldEl != null)
		{	
    		obj.setActiveRomRight(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("passiveRomLeft");
		if(fldEl != null)
		{	
    		obj.setPassiveRomLeft(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("passiveRomRight");
		if(fldEl != null)
		{	
    		obj.setPassiveRomRight(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("toneLeft");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setToneLeft(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("toneRight");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setToneRight(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		public static final String Joint = "joint";
		public static final String Movement = "movement";
		public static final String ActiveRomLeft = "activeRomLeft";
		public static final String ActiveRomRight = "activeRomRight";
		public static final String PassiveRomLeft = "passiveRomLeft";
		public static final String PassiveRomRight = "passiveRomRight";
		public static final String ToneLeft = "toneLeft";
		public static final String ToneRight = "toneRight";
	}
}

