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


public class MSkExamJointBonesDetail extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100035;
	private static final long serialVersionUID = 1072100035L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Group */
	private ims.core.clinical.domain.objects.MskGroups group;
	/** isJoint */
	private Boolean isJoint;
	/** Joint */
	private ims.core.clinical.domain.objects.MskJoints joint;
	/** Bones */
	private ims.domain.lookups.LookupInstance bone;
	/** Laterality */
	private ims.domain.lookups.LookupInstance laterality;
	/** Selected Findings
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List generalFindingsBone;
	/** Joints General Findings
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List generalFindingsJoint;
	/** Ligaments and Other Tests */
	private String ligamentsTests;
	/** Interpretation */
	private String interpretation;
	/** SelectedMovements
	  * Collection of ims.medical.domain.objects.MskJointMovement.
	  */
	private java.util.Set selectedMovements;
	/** isProblem */
	private Boolean isProblem;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public MSkExamJointBonesDetail (Integer id, int ver)
    {
    	super(id, ver);
    }
    public MSkExamJointBonesDetail ()
    {
    	super();
    }
    public MSkExamJointBonesDetail (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.medical.domain.objects.MSkExamJointBonesDetail.class;
	}


	public ims.core.clinical.domain.objects.MskGroups getGroup() {
		return group;
	}
	public void setGroup(ims.core.clinical.domain.objects.MskGroups group) {
		this.group = group;
	}

	public Boolean isIsJoint() {
		return isJoint;
	}
	public void setIsJoint(Boolean isJoint) {
		this.isJoint = isJoint;
	}

	public ims.core.clinical.domain.objects.MskJoints getJoint() {
		return joint;
	}
	public void setJoint(ims.core.clinical.domain.objects.MskJoints joint) {
		this.joint = joint;
	}

	public ims.domain.lookups.LookupInstance getBone() {
		return bone;
	}
	public void setBone(ims.domain.lookups.LookupInstance bone) {
		this.bone = bone;
	}

	public ims.domain.lookups.LookupInstance getLaterality() {
		return laterality;
	}
	public void setLaterality(ims.domain.lookups.LookupInstance laterality) {
		this.laterality = laterality;
	}

	public java.util.List getGeneralFindingsBone() {
		if ( null == generalFindingsBone ) {
			generalFindingsBone = new java.util.ArrayList();
		}
		return generalFindingsBone;
	}
	public void setGeneralFindingsBone(java.util.List paramValue) {
		this.generalFindingsBone = paramValue;
	}

	public java.util.List getGeneralFindingsJoint() {
		if ( null == generalFindingsJoint ) {
			generalFindingsJoint = new java.util.ArrayList();
		}
		return generalFindingsJoint;
	}
	public void setGeneralFindingsJoint(java.util.List paramValue) {
		this.generalFindingsJoint = paramValue;
	}

	public String getLigamentsTests() {
		return ligamentsTests;
	}
	public void setLigamentsTests(String ligamentsTests) {
		if ( null != ligamentsTests && ligamentsTests.length() > 200 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for ligamentsTests. Tried to set value: "+
				ligamentsTests);
		}
		this.ligamentsTests = ligamentsTests;
	}

	public String getInterpretation() {
		return interpretation;
	}
	public void setInterpretation(String interpretation) {
		if ( null != interpretation && interpretation.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for interpretation. Tried to set value: "+
				interpretation);
		}
		this.interpretation = interpretation;
	}

	public java.util.Set getSelectedMovements() {
		if ( null == selectedMovements ) {
			selectedMovements = new java.util.HashSet();
		}
		return selectedMovements;
	}
	public void setSelectedMovements(java.util.Set paramValue) {
		this.selectedMovements = paramValue;
	}

	public Boolean isIsProblem() {
		return isProblem;
	}
	public void setIsProblem(Boolean isProblem) {
		this.isProblem = isProblem;
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
		
		auditStr.append("\r\n*group* :");
		if (group != null)
		{
			auditStr.append(toShortClassName(group));
				
		    auditStr.append(group.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isJoint* :");
		auditStr.append(isJoint);
	    auditStr.append("; ");
		auditStr.append("\r\n*joint* :");
		if (joint != null)
		{
			auditStr.append(toShortClassName(joint));
				
		    auditStr.append(joint.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*bone* :");
		if (bone != null)
			auditStr.append(bone.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*laterality* :");
		if (laterality != null)
			auditStr.append(laterality.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*generalFindingsBone* :");
		if (generalFindingsBone != null)
		{
			java.util.Iterator it6 = generalFindingsBone.iterator();
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
		auditStr.append("\r\n*generalFindingsJoint* :");
		if (generalFindingsJoint != null)
		{
			java.util.Iterator it7 = generalFindingsJoint.iterator();
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
		auditStr.append("\r\n*ligamentsTests* :");
		auditStr.append(ligamentsTests);
	    auditStr.append("; ");
		auditStr.append("\r\n*interpretation* :");
		auditStr.append(interpretation);
	    auditStr.append("; ");
		auditStr.append("\r\n*selectedMovements* :");
		if (selectedMovements != null)
		{
			java.util.Iterator it10 = selectedMovements.iterator();
			int i10=0;
			while (it10.hasNext())
			{
				if (i10 > 0)
					auditStr.append(",");
				ims.medical.domain.objects.MskJointMovement obj = (ims.medical.domain.objects.MskJointMovement)it10.next();
		if (obj != null)
		{
		   if (i10 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i10++;
		}
		if (i10 > 0)
			auditStr.append("] " + i10);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isProblem* :");
		auditStr.append(isProblem);
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
		
		String keyClassName = "MSkExamJointBonesDetail";
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
		if (this.getGroup() != null)
		{
			sb.append("<group>");
			sb.append(this.getGroup().toXMLString(domMap)); 	
			sb.append("</group>");		
		}
		if (this.isIsJoint() != null)
		{
			sb.append("<isJoint>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsJoint().toString()));
			sb.append("</isJoint>");		
		}
		if (this.getJoint() != null)
		{
			sb.append("<joint>");
			sb.append(this.getJoint().toXMLString(domMap)); 	
			sb.append("</joint>");		
		}
		if (this.getBone() != null)
		{
			sb.append("<bone>");
			sb.append(this.getBone().toXMLString()); 
			sb.append("</bone>");		
		}
		if (this.getLaterality() != null)
		{
			sb.append("<laterality>");
			sb.append(this.getLaterality().toXMLString()); 
			sb.append("</laterality>");		
		}
		if (this.getGeneralFindingsBone() != null)
		{
			if (this.getGeneralFindingsBone().size() > 0 )
			{
			sb.append("<generalFindingsBone>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getGeneralFindingsBone())); 
			sb.append("</generalFindingsBone>");		
			}
		}
		if (this.getGeneralFindingsJoint() != null)
		{
			if (this.getGeneralFindingsJoint().size() > 0 )
			{
			sb.append("<generalFindingsJoint>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getGeneralFindingsJoint())); 
			sb.append("</generalFindingsJoint>");		
			}
		}
		if (this.getLigamentsTests() != null)
		{
			sb.append("<ligamentsTests>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLigamentsTests().toString()));
			sb.append("</ligamentsTests>");		
		}
		if (this.getInterpretation() != null)
		{
			sb.append("<interpretation>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getInterpretation().toString()));
			sb.append("</interpretation>");		
		}
		if (this.getSelectedMovements() != null)
		{
			if (this.getSelectedMovements().size() > 0 )
			{
			sb.append("<selectedMovements>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getSelectedMovements(), domMap));
			sb.append("</selectedMovements>");		
			}
		}
		if (this.isIsProblem() != null)
		{
			sb.append("<isProblem>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsProblem().toString()));
			sb.append("</isProblem>");		
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
			MSkExamJointBonesDetail domainObject = getMSkExamJointBonesDetailfromXML(itemEl, factory, domMap);

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
			MSkExamJointBonesDetail domainObject = getMSkExamJointBonesDetailfromXML(itemEl, factory, domMap);

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
		
	public static MSkExamJointBonesDetail getMSkExamJointBonesDetailfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getMSkExamJointBonesDetailfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static MSkExamJointBonesDetail getMSkExamJointBonesDetailfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!MSkExamJointBonesDetail.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!MSkExamJointBonesDetail.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the MSkExamJointBonesDetail class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (MSkExamJointBonesDetail)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(MSkExamJointBonesDetail.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		MSkExamJointBonesDetail ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (MSkExamJointBonesDetail)factory.getImportedDomainObject(MSkExamJointBonesDetail.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new MSkExamJointBonesDetail();
		}
		String keyClassName = "MSkExamJointBonesDetail";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (MSkExamJointBonesDetail)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, MSkExamJointBonesDetail obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("group");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setGroup(ims.core.clinical.domain.objects.MskGroups.getMskGroupsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isJoint");
		if(fldEl != null)
		{	
    		obj.setIsJoint(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("joint");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setJoint(ims.core.clinical.domain.objects.MskJoints.getMskJointsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("bone");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setBone(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("laterality");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setLaterality(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("generalFindingsBone");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setGeneralFindingsBone(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getGeneralFindingsBone())); 
		}
		fldEl = el.element("generalFindingsJoint");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setGeneralFindingsJoint(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getGeneralFindingsJoint())); 
		}
		fldEl = el.element("ligamentsTests");
		if(fldEl != null)
		{	
    		obj.setLigamentsTests(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("interpretation");
		if(fldEl != null)
		{	
    		obj.setInterpretation(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("selectedMovements");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setSelectedMovements(ims.medical.domain.objects.MskJointMovement.fromSetXMLString(fldEl, factory, obj.getSelectedMovements(), domMap));
		}
		fldEl = el.element("isProblem");
		if(fldEl != null)
		{	
    		obj.setIsProblem(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "generalFindingsBone"
		, "generalFindingsJoint"
		, "selectedMovements"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Group = "group";
		public static final String IsJoint = "isJoint";
		public static final String Joint = "joint";
		public static final String Bone = "bone";
		public static final String Laterality = "laterality";
		public static final String GeneralFindingsBone = "generalFindingsBone";
		public static final String GeneralFindingsJoint = "generalFindingsJoint";
		public static final String LigamentsTests = "ligamentsTests";
		public static final String Interpretation = "interpretation";
		public static final String SelectedMovements = "selectedMovements";
		public static final String IsProblem = "isProblem";
	}
}

