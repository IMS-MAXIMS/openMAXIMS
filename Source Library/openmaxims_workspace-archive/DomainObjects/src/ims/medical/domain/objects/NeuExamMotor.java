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


public class NeuExamMotor extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1023100005;
	private static final long serialVersionUID = 1023100005L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Authoring Care Professional */
	private ims.core.resource.people.domain.objects.Hcp authoringCP;
	/** Authoring Date and Time */
	private java.util.Date authoringDateTime;
	/** ClinicalContact */
	private ims.core.admin.domain.objects.ClinicalContact clinicalContact;
	/** Collection of Findings
	  * Collection of ims.medical.domain.objects.NeuRootMotorFind.
	  */
	private java.util.Set rootFinding;
	/** Overall Right Sided Motor Area */
	private ims.core.clinical.domain.objects.VertebralLevels rightMotorLevel;
	/** Overall Left Sided Motor Area */
	private ims.core.clinical.domain.objects.VertebralLevels leftMotorLevel;
	/** Problem Created */
	private Boolean isProblem;
	/** OverallAsiaRight */
	private Integer overallAsiaRight;
	/** OverAllAsiaLeft */
	private Integer overAllAsiaLeft;
	/** LLAsiaRight */
	private Integer lLAsiaRight;
	/** LLAsiaLeft */
	private Integer lLAsiaLeft;
	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** MotorAreaFindings
	  * Collection of ims.medical.domain.objects.NeuroMotorAreaFinding.
	  */
	private java.util.Set motorAreaFindings;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public NeuExamMotor (Integer id, int ver)
    {
    	super(id, ver);
    }
    public NeuExamMotor ()
    {
    	super();
    }
    public NeuExamMotor (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.medical.domain.objects.NeuExamMotor.class;
	}


	public ims.core.resource.people.domain.objects.Hcp getAuthoringCP() {
		return authoringCP;
	}
	public void setAuthoringCP(ims.core.resource.people.domain.objects.Hcp authoringCP) {
		this.authoringCP = authoringCP;
	}

	public java.util.Date getAuthoringDateTime() {
		return authoringDateTime;
	}
	public void setAuthoringDateTime(java.util.Date authoringDateTime) {
		this.authoringDateTime = authoringDateTime;
	}

	public ims.core.admin.domain.objects.ClinicalContact getClinicalContact() {
		return clinicalContact;
	}
	public void setClinicalContact(ims.core.admin.domain.objects.ClinicalContact clinicalContact) {
		this.clinicalContact = clinicalContact;
	}

	public java.util.Set getRootFinding() {
		if ( null == rootFinding ) {
			rootFinding = new java.util.HashSet();
		}
		return rootFinding;
	}
	public void setRootFinding(java.util.Set paramValue) {
		this.rootFinding = paramValue;
	}

	public ims.core.clinical.domain.objects.VertebralLevels getRightMotorLevel() {
		return rightMotorLevel;
	}
	public void setRightMotorLevel(ims.core.clinical.domain.objects.VertebralLevels rightMotorLevel) {
		this.rightMotorLevel = rightMotorLevel;
	}

	public ims.core.clinical.domain.objects.VertebralLevels getLeftMotorLevel() {
		return leftMotorLevel;
	}
	public void setLeftMotorLevel(ims.core.clinical.domain.objects.VertebralLevels leftMotorLevel) {
		this.leftMotorLevel = leftMotorLevel;
	}

	public Boolean isIsProblem() {
		return isProblem;
	}
	public void setIsProblem(Boolean isProblem) {
		this.isProblem = isProblem;
	}

	public Integer getOverallAsiaRight() {
		return overallAsiaRight;
	}
	public void setOverallAsiaRight(Integer overallAsiaRight) {
		this.overallAsiaRight = overallAsiaRight;
	}

	public Integer getOverAllAsiaLeft() {
		return overAllAsiaLeft;
	}
	public void setOverAllAsiaLeft(Integer overAllAsiaLeft) {
		this.overAllAsiaLeft = overAllAsiaLeft;
	}

	public Integer getLLAsiaRight() {
		return lLAsiaRight;
	}
	public void setLLAsiaRight(Integer lLAsiaRight) {
		this.lLAsiaRight = lLAsiaRight;
	}

	public Integer getLLAsiaLeft() {
		return lLAsiaLeft;
	}
	public void setLLAsiaLeft(Integer lLAsiaLeft) {
		this.lLAsiaLeft = lLAsiaLeft;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public java.util.Set getMotorAreaFindings() {
		if ( null == motorAreaFindings ) {
			motorAreaFindings = new java.util.HashSet();
		}
		return motorAreaFindings;
	}
	public void setMotorAreaFindings(java.util.Set paramValue) {
		this.motorAreaFindings = paramValue;
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
		
		auditStr.append("\r\n*authoringCP* :");
		if (authoringCP != null)
		{
			auditStr.append(toShortClassName(authoringCP));
				
		    auditStr.append(authoringCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringDateTime* :");
		auditStr.append(authoringDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalContact* :");
		if (clinicalContact != null)
		{
			auditStr.append(toShortClassName(clinicalContact));
				
		    auditStr.append(clinicalContact.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*rootFinding* :");
		if (rootFinding != null)
		{
			java.util.Iterator it4 = rootFinding.iterator();
			int i4=0;
			while (it4.hasNext())
			{
				if (i4 > 0)
					auditStr.append(",");
				ims.medical.domain.objects.NeuRootMotorFind obj = (ims.medical.domain.objects.NeuRootMotorFind)it4.next();
		if (obj != null)
		{
		   if (i4 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i4++;
		}
		if (i4 > 0)
			auditStr.append("] " + i4);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*rightMotorLevel* :");
		if (rightMotorLevel != null)
		{
			auditStr.append(toShortClassName(rightMotorLevel));
				
		    auditStr.append(rightMotorLevel.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*leftMotorLevel* :");
		if (leftMotorLevel != null)
		{
			auditStr.append(toShortClassName(leftMotorLevel));
				
		    auditStr.append(leftMotorLevel.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isProblem* :");
		auditStr.append(isProblem);
	    auditStr.append("; ");
		auditStr.append("\r\n*overallAsiaRight* :");
		auditStr.append(overallAsiaRight);
	    auditStr.append("; ");
		auditStr.append("\r\n*overAllAsiaLeft* :");
		auditStr.append(overAllAsiaLeft);
	    auditStr.append("; ");
		auditStr.append("\r\n*lLAsiaRight* :");
		auditStr.append(lLAsiaRight);
	    auditStr.append("; ");
		auditStr.append("\r\n*lLAsiaLeft* :");
		auditStr.append(lLAsiaLeft);
	    auditStr.append("; ");
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*motorAreaFindings* :");
		if (motorAreaFindings != null)
		{
			java.util.Iterator it13 = motorAreaFindings.iterator();
			int i13=0;
			while (it13.hasNext())
			{
				if (i13 > 0)
					auditStr.append(",");
				ims.medical.domain.objects.NeuroMotorAreaFinding obj = (ims.medical.domain.objects.NeuroMotorAreaFinding)it13.next();
		if (obj != null)
		{
		   if (i13 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i13++;
		}
		if (i13 > 0)
			auditStr.append("] " + i13);
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
		
		String keyClassName = "NeuExamMotor";
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
		if (this.getAuthoringCP() != null)
		{
			sb.append("<authoringCP>");
			sb.append(this.getAuthoringCP().toXMLString(domMap)); 	
			sb.append("</authoringCP>");		
		}
		if (this.getAuthoringDateTime() != null)
		{
			sb.append("<authoringDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getAuthoringDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</authoringDateTime>");		
		}
		if (this.getClinicalContact() != null)
		{
			sb.append("<clinicalContact>");
			sb.append(this.getClinicalContact().toXMLString(domMap)); 	
			sb.append("</clinicalContact>");		
		}
		if (this.getRootFinding() != null)
		{
			if (this.getRootFinding().size() > 0 )
			{
			sb.append("<rootFinding>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getRootFinding(), domMap));
			sb.append("</rootFinding>");		
			}
		}
		if (this.getRightMotorLevel() != null)
		{
			sb.append("<rightMotorLevel>");
			sb.append(this.getRightMotorLevel().toXMLString(domMap)); 	
			sb.append("</rightMotorLevel>");		
		}
		if (this.getLeftMotorLevel() != null)
		{
			sb.append("<leftMotorLevel>");
			sb.append(this.getLeftMotorLevel().toXMLString(domMap)); 	
			sb.append("</leftMotorLevel>");		
		}
		if (this.isIsProblem() != null)
		{
			sb.append("<isProblem>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsProblem().toString()));
			sb.append("</isProblem>");		
		}
		if (this.getOverallAsiaRight() != null)
		{
			sb.append("<overallAsiaRight>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOverallAsiaRight().toString()));
			sb.append("</overallAsiaRight>");		
		}
		if (this.getOverAllAsiaLeft() != null)
		{
			sb.append("<overAllAsiaLeft>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOverAllAsiaLeft().toString()));
			sb.append("</overAllAsiaLeft>");		
		}
		if (this.getLLAsiaRight() != null)
		{
			sb.append("<lLAsiaRight>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLLAsiaRight().toString()));
			sb.append("</lLAsiaRight>");		
		}
		if (this.getLLAsiaLeft() != null)
		{
			sb.append("<lLAsiaLeft>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLLAsiaLeft().toString()));
			sb.append("</lLAsiaLeft>");		
		}
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getMotorAreaFindings() != null)
		{
			if (this.getMotorAreaFindings().size() > 0 )
			{
			sb.append("<motorAreaFindings>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getMotorAreaFindings(), domMap));
			sb.append("</motorAreaFindings>");		
			}
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
			NeuExamMotor domainObject = getNeuExamMotorfromXML(itemEl, factory, domMap);

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
			NeuExamMotor domainObject = getNeuExamMotorfromXML(itemEl, factory, domMap);

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
		
	public static NeuExamMotor getNeuExamMotorfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getNeuExamMotorfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static NeuExamMotor getNeuExamMotorfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!NeuExamMotor.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!NeuExamMotor.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the NeuExamMotor class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (NeuExamMotor)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(NeuExamMotor.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		NeuExamMotor ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (NeuExamMotor)factory.getImportedDomainObject(NeuExamMotor.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new NeuExamMotor();
		}
		String keyClassName = "NeuExamMotor";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (NeuExamMotor)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, NeuExamMotor obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("authoringCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringDateTime");
		if(fldEl != null)
		{	
    		obj.setAuthoringDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("clinicalContact");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClinicalContact(ims.core.admin.domain.objects.ClinicalContact.getClinicalContactfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("rootFinding");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setRootFinding(ims.medical.domain.objects.NeuRootMotorFind.fromSetXMLString(fldEl, factory, obj.getRootFinding(), domMap));
		}
		fldEl = el.element("rightMotorLevel");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRightMotorLevel(ims.core.clinical.domain.objects.VertebralLevels.getVertebralLevelsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("leftMotorLevel");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setLeftMotorLevel(ims.core.clinical.domain.objects.VertebralLevels.getVertebralLevelsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isProblem");
		if(fldEl != null)
		{	
    		obj.setIsProblem(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("overallAsiaRight");
		if(fldEl != null)
		{	
    		obj.setOverallAsiaRight(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("overAllAsiaLeft");
		if(fldEl != null)
		{	
    		obj.setOverAllAsiaLeft(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("lLAsiaRight");
		if(fldEl != null)
		{	
    		obj.setLLAsiaRight(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("lLAsiaLeft");
		if(fldEl != null)
		{	
    		obj.setLLAsiaLeft(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("motorAreaFindings");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setMotorAreaFindings(ims.medical.domain.objects.NeuroMotorAreaFinding.fromSetXMLString(fldEl, factory, obj.getMotorAreaFindings(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "rootFinding"
		, "motorAreaFindings"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String AuthoringCP = "authoringCP";
		public static final String AuthoringDateTime = "authoringDateTime";
		public static final String ClinicalContact = "clinicalContact";
		public static final String RootFinding = "rootFinding";
		public static final String RightMotorLevel = "rightMotorLevel";
		public static final String LeftMotorLevel = "leftMotorLevel";
		public static final String IsProblem = "isProblem";
		public static final String OverallAsiaRight = "overallAsiaRight";
		public static final String OverAllAsiaLeft = "overAllAsiaLeft";
		public static final String LLAsiaRight = "lLAsiaRight";
		public static final String LLAsiaLeft = "lLAsiaLeft";
		public static final String CareContext = "careContext";
		public static final String MotorAreaFindings = "motorAreaFindings";
	}
}

