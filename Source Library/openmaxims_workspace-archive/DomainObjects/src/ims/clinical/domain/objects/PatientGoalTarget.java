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
package ims.clinical.domain.objects;

/**
 * 
 * @author Joan Heelan
 * Generated.
 */


public class PatientGoalTarget extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100020;
	private static final long serialVersionUID = 1072100020L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Goal Planning - Target */
	private String target;
	/** Goal Planning Target - Target Date */
	private java.util.Date targetDate;
	/** Goal Planning Target - Date Achieved */
	private java.util.Date dateAchieved;
	/** Goal Planning Target - Level of Achievement */
	private ims.domain.lookups.LookupInstance lOA;
	/** Goal Planning Target - Reason for Non Achievement */
	private String reasonForNonA;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatientGoalTarget (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientGoalTarget ()
    {
    	super();
    }
    public PatientGoalTarget (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.domain.objects.PatientGoalTarget.class;
	}


	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		if ( null != target && target.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for target. Tried to set value: "+
				target);
		}
		this.target = target;
	}

	public java.util.Date getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(java.util.Date targetDate) {
		this.targetDate = targetDate;
	}

	public java.util.Date getDateAchieved() {
		return dateAchieved;
	}
	public void setDateAchieved(java.util.Date dateAchieved) {
		this.dateAchieved = dateAchieved;
	}

	public ims.domain.lookups.LookupInstance getLOA() {
		return lOA;
	}
	public void setLOA(ims.domain.lookups.LookupInstance lOA) {
		this.lOA = lOA;
	}

	public String getReasonForNonA() {
		return reasonForNonA;
	}
	public void setReasonForNonA(String reasonForNonA) {
		if ( null != reasonForNonA && reasonForNonA.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for reasonForNonA. Tried to set value: "+
				reasonForNonA);
		}
		this.reasonForNonA = reasonForNonA;
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
		
		auditStr.append("\r\n*target* :");
		auditStr.append(target);
	    auditStr.append("; ");
		auditStr.append("\r\n*targetDate* :");
		auditStr.append(targetDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*dateAchieved* :");
		auditStr.append(dateAchieved);
	    auditStr.append("; ");
		auditStr.append("\r\n*lOA* :");
		if (lOA != null)
			auditStr.append(lOA.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*reasonForNonA* :");
		auditStr.append(reasonForNonA);
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
		
		String keyClassName = "PatientGoalTarget";
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
		if (this.getTarget() != null)
		{
			sb.append("<target>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTarget().toString()));
			sb.append("</target>");		
		}
		if (this.getTargetDate() != null)
		{
			sb.append("<targetDate>");
			sb.append(new ims.framework.utils.DateTime(this.getTargetDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</targetDate>");		
		}
		if (this.getDateAchieved() != null)
		{
			sb.append("<dateAchieved>");
			sb.append(new ims.framework.utils.DateTime(this.getDateAchieved()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateAchieved>");		
		}
		if (this.getLOA() != null)
		{
			sb.append("<lOA>");
			sb.append(this.getLOA().toXMLString()); 
			sb.append("</lOA>");		
		}
		if (this.getReasonForNonA() != null)
		{
			sb.append("<reasonForNonA>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReasonForNonA().toString()));
			sb.append("</reasonForNonA>");		
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
			PatientGoalTarget domainObject = getPatientGoalTargetfromXML(itemEl, factory, domMap);

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
			PatientGoalTarget domainObject = getPatientGoalTargetfromXML(itemEl, factory, domMap);

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
		
	public static PatientGoalTarget getPatientGoalTargetfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientGoalTargetfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientGoalTarget getPatientGoalTargetfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientGoalTarget.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientGoalTarget.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientGoalTarget class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientGoalTarget)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientGoalTarget.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientGoalTarget ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientGoalTarget)factory.getImportedDomainObject(PatientGoalTarget.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientGoalTarget();
		}
		String keyClassName = "PatientGoalTarget";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientGoalTarget)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientGoalTarget obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("target");
		if(fldEl != null)
		{	
    		obj.setTarget(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("targetDate");
		if(fldEl != null)
		{	
    		obj.setTargetDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("dateAchieved");
		if(fldEl != null)
		{	
    		obj.setDateAchieved(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("lOA");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setLOA(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("reasonForNonA");
		if(fldEl != null)
		{	
    		obj.setReasonForNonA(new String(fldEl.getTextTrim()));	
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
		public static final String Target = "target";
		public static final String TargetDate = "targetDate";
		public static final String DateAchieved = "dateAchieved";
		public static final String LOA = "lOA";
		public static final String ReasonForNonA = "reasonForNonA";
	}
}

