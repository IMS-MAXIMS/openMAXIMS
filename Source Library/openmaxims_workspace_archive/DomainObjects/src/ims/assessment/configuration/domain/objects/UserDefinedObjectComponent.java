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
package ims.assessment.configuration.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class UserDefinedObjectComponent extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1028100005;
	private static final long serialVersionUID = 1028100005L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** UserAssessments */
	private ims.assessment.configuration.domain.objects.UserAssessment userAssessments;
	/** Graphic */
	private ims.assessment.configuration.domain.objects.GraphicAssessment graphic;
	/** ActiveStatus */
	private ims.domain.lookups.LookupInstance activeStatus;
	/** Sequence No - Order of the layers for the UDO */
	private Integer seqNo;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public UserDefinedObjectComponent (Integer id, int ver)
    {
    	super(id, ver);
    }
    public UserDefinedObjectComponent ()
    {
    	super();
    }
    public UserDefinedObjectComponent (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.assessment.configuration.domain.objects.UserDefinedObjectComponent.class;
	}


	public ims.assessment.configuration.domain.objects.UserAssessment getUserAssessments() {
		return userAssessments;
	}
	public void setUserAssessments(ims.assessment.configuration.domain.objects.UserAssessment userAssessments) {
		this.userAssessments = userAssessments;
	}

	public ims.assessment.configuration.domain.objects.GraphicAssessment getGraphic() {
		return graphic;
	}
	public void setGraphic(ims.assessment.configuration.domain.objects.GraphicAssessment graphic) {
		this.graphic = graphic;
	}

	public ims.domain.lookups.LookupInstance getActiveStatus() {
		return activeStatus;
	}
	public void setActiveStatus(ims.domain.lookups.LookupInstance activeStatus) {
		this.activeStatus = activeStatus;
	}

	public Integer getSeqNo() {
		return seqNo;
	}
	public void setSeqNo(Integer seqNo) {
		this.seqNo = seqNo;
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
		if ( "Configuration".equals("Configuration") )
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
		
		auditStr.append("\r\n*userAssessments* :");
		if (userAssessments != null)
		{
			auditStr.append(toShortClassName(userAssessments));
				
		    auditStr.append(userAssessments.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*graphic* :");
		if (graphic != null)
		{
			auditStr.append(toShortClassName(graphic));
				
		    auditStr.append(graphic.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*activeStatus* :");
		if (activeStatus != null)
			auditStr.append(activeStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*seqNo* :");
		auditStr.append(seqNo);
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
		
		String keyClassName = "UserDefinedObjectComponent";
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
		if (this.getUserAssessments() != null)
		{
			sb.append("<userAssessments>");
			sb.append(this.getUserAssessments().toXMLString(domMap)); 	
			sb.append("</userAssessments>");		
		}
		if (this.getGraphic() != null)
		{
			sb.append("<graphic>");
			sb.append(this.getGraphic().toXMLString(domMap)); 	
			sb.append("</graphic>");		
		}
		if (this.getActiveStatus() != null)
		{
			sb.append("<activeStatus>");
			sb.append(this.getActiveStatus().toXMLString()); 
			sb.append("</activeStatus>");		
		}
		if (this.getSeqNo() != null)
		{
			sb.append("<seqNo>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSeqNo().toString()));
			sb.append("</seqNo>");		
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
			UserDefinedObjectComponent domainObject = getUserDefinedObjectComponentfromXML(itemEl, factory, domMap);

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
			UserDefinedObjectComponent domainObject = getUserDefinedObjectComponentfromXML(itemEl, factory, domMap);

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
		
	public static UserDefinedObjectComponent getUserDefinedObjectComponentfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getUserDefinedObjectComponentfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static UserDefinedObjectComponent getUserDefinedObjectComponentfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!UserDefinedObjectComponent.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!UserDefinedObjectComponent.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the UserDefinedObjectComponent class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (UserDefinedObjectComponent)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(UserDefinedObjectComponent.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		UserDefinedObjectComponent ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (UserDefinedObjectComponent)factory.getImportedDomainObject(UserDefinedObjectComponent.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new UserDefinedObjectComponent();
		}
		String keyClassName = "UserDefinedObjectComponent";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (UserDefinedObjectComponent)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, UserDefinedObjectComponent obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("userAssessments");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setUserAssessments(ims.assessment.configuration.domain.objects.UserAssessment.getUserAssessmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("graphic");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setGraphic(ims.assessment.configuration.domain.objects.GraphicAssessment.getGraphicAssessmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("activeStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setActiveStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("seqNo");
		if(fldEl != null)
		{	
    		obj.setSeqNo(new Integer(fldEl.getTextTrim()));	
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
		public static final String UserAssessments = "userAssessments";
		public static final String Graphic = "graphic";
		public static final String ActiveStatus = "activeStatus";
		public static final String SeqNo = "seqNo";
	}
}

