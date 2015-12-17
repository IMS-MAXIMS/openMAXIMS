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
package ims.emergency.domain.objects;

/**
 * 
 * @author Rory Fitzpatrick
 * Generated.
 */


public class EmergencyAttendanceInvestigationCodingSequenceItem extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1086100041;
	private static final long serialVersionUID = 1086100041L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** OrderInvestigation ID */
	private Integer orderInvestigation;
	/** EmergencyInvestigation */
	private ims.emergency.domain.objects.InvestigationAttendenceDetail emergencyInvestigation;
	/** CodingSequence */
	private Integer codingSequence;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public EmergencyAttendanceInvestigationCodingSequenceItem (Integer id, int ver)
    {
    	super(id, ver);
    }
    public EmergencyAttendanceInvestigationCodingSequenceItem ()
    {
    	super();
    }
    public EmergencyAttendanceInvestigationCodingSequenceItem (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.emergency.domain.objects.EmergencyAttendanceInvestigationCodingSequenceItem.class;
	}


	public Integer getOrderInvestigation() {
		return orderInvestigation;
	}
	public void setOrderInvestigation(Integer orderInvestigation) {
		this.orderInvestigation = orderInvestigation;
	}

	public ims.emergency.domain.objects.InvestigationAttendenceDetail getEmergencyInvestigation() {
		return emergencyInvestigation;
	}
	public void setEmergencyInvestigation(ims.emergency.domain.objects.InvestigationAttendenceDetail emergencyInvestigation) {
		this.emergencyInvestigation = emergencyInvestigation;
	}

	public Integer getCodingSequence() {
		return codingSequence;
	}
	public void setCodingSequence(Integer codingSequence) {
		this.codingSequence = codingSequence;
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
		
		auditStr.append("\r\n*orderInvestigation* :");
		auditStr.append(orderInvestigation);
	    auditStr.append("; ");
		auditStr.append("\r\n*emergencyInvestigation* :");
		if (emergencyInvestigation != null)
		{
			auditStr.append(toShortClassName(emergencyInvestigation));
				
		    auditStr.append(emergencyInvestigation.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*codingSequence* :");
		auditStr.append(codingSequence);
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
		
		String keyClassName = "EmergencyAttendanceInvestigationCodingSequenceItem";
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
		if (this.getOrderInvestigation() != null)
		{
			sb.append("<orderInvestigation>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOrderInvestigation().toString()));
			sb.append("</orderInvestigation>");		
		}
		if (this.getEmergencyInvestigation() != null)
		{
			sb.append("<emergencyInvestigation>");
			sb.append(this.getEmergencyInvestigation().toXMLString(domMap)); 	
			sb.append("</emergencyInvestigation>");		
		}
		if (this.getCodingSequence() != null)
		{
			sb.append("<codingSequence>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCodingSequence().toString()));
			sb.append("</codingSequence>");		
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
			EmergencyAttendanceInvestigationCodingSequenceItem domainObject = getEmergencyAttendanceInvestigationCodingSequenceItemfromXML(itemEl, factory, domMap);

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
			EmergencyAttendanceInvestigationCodingSequenceItem domainObject = getEmergencyAttendanceInvestigationCodingSequenceItemfromXML(itemEl, factory, domMap);

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
		
	public static EmergencyAttendanceInvestigationCodingSequenceItem getEmergencyAttendanceInvestigationCodingSequenceItemfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getEmergencyAttendanceInvestigationCodingSequenceItemfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static EmergencyAttendanceInvestigationCodingSequenceItem getEmergencyAttendanceInvestigationCodingSequenceItemfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!EmergencyAttendanceInvestigationCodingSequenceItem.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!EmergencyAttendanceInvestigationCodingSequenceItem.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the EmergencyAttendanceInvestigationCodingSequenceItem class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (EmergencyAttendanceInvestigationCodingSequenceItem)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(EmergencyAttendanceInvestigationCodingSequenceItem.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		EmergencyAttendanceInvestigationCodingSequenceItem ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (EmergencyAttendanceInvestigationCodingSequenceItem)factory.getImportedDomainObject(EmergencyAttendanceInvestigationCodingSequenceItem.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new EmergencyAttendanceInvestigationCodingSequenceItem();
		}
		String keyClassName = "EmergencyAttendanceInvestigationCodingSequenceItem";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (EmergencyAttendanceInvestigationCodingSequenceItem)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, EmergencyAttendanceInvestigationCodingSequenceItem obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("orderInvestigation");
		if(fldEl != null)
		{	
    		obj.setOrderInvestigation(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("emergencyInvestigation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setEmergencyInvestigation(ims.emergency.domain.objects.InvestigationAttendenceDetail.getInvestigationAttendenceDetailfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("codingSequence");
		if(fldEl != null)
		{	
    		obj.setCodingSequence(new Integer(fldEl.getTextTrim()));	
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
		public static final String OrderInvestigation = "orderInvestigation";
		public static final String EmergencyInvestigation = "emergencyInvestigation";
		public static final String CodingSequence = "codingSequence";
	}
}

