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
package ims.pathways.configuration.domain.objects;

/**
 * 
 * @author Barbara Worwood
 * Generated.
 */


public class PathwayTarget extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1089100003;
	private static final long serialVersionUID = 1089100003L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Pathway */
	private ims.pathways.configuration.domain.objects.Pathway pathway;
	/** Target */
	private ims.pathways.configuration.domain.objects.Target target;
	/** Day/Week Number of the target for the Patway */
	private Integer targetPeriod;
	/** Pathway Status inactive, preactive or active */
	private ims.domain.lookups.LookupInstance status;
	/** Activate the target in the PatientPathwayJourney by default */
	private Boolean activateTarget;
	/** Indicate this target as requireing Action within X days/weeks of the target Date */
	private Integer warningIndicatorPeriod;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PathwayTarget (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PathwayTarget ()
    {
    	super();
    }
    public PathwayTarget (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.pathways.configuration.domain.objects.PathwayTarget.class;
	}


	public ims.pathways.configuration.domain.objects.Pathway getPathway() {
		return pathway;
	}
	public void setPathway(ims.pathways.configuration.domain.objects.Pathway pathway) {
		this.pathway = pathway;
	}

	public ims.pathways.configuration.domain.objects.Target getTarget() {
		return target;
	}
	public void setTarget(ims.pathways.configuration.domain.objects.Target target) {
		this.target = target;
	}

	public Integer getTargetPeriod() {
		return targetPeriod;
	}
	public void setTargetPeriod(Integer targetPeriod) {
		this.targetPeriod = targetPeriod;
	}

	public ims.domain.lookups.LookupInstance getStatus() {
		return status;
	}
	public void setStatus(ims.domain.lookups.LookupInstance status) {
		this.status = status;
	}

	public Boolean isActivateTarget() {
		return activateTarget;
	}
	public void setActivateTarget(Boolean activateTarget) {
		this.activateTarget = activateTarget;
	}

	public Integer getWarningIndicatorPeriod() {
		return warningIndicatorPeriod;
	}
	public void setWarningIndicatorPeriod(Integer warningIndicatorPeriod) {
		this.warningIndicatorPeriod = warningIndicatorPeriod;
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
	// method generated based on 'pathtarg_unq1' unique index.
	public static boolean recordExistForPathwayAndTarget(ims.domain.ILightweightDomainFactory factory,
		 ims.pathways.configuration.domain.objects.Pathway pathway
	,
	 ims.pathways.configuration.domain.objects.Target target
	)	
	{
		return recordExistForPathwayAndTarget(factory, pathway, target, null);
	}	

	// method generated based on 'pathtarg_unq1' unique index.
	public static boolean recordExistForPathwayAndTarget(ims.domain.ILightweightDomainFactory factory,
		 ims.pathways.configuration.domain.objects.Pathway pathway
	,
	 ims.pathways.configuration.domain.objects.Target target
	, Integer recordId)	
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		
		hql.append("from PathwayTarget c where ");
		hql.append(" c.pathway = :pathway ");
		names[0] = "pathway";
		values[0] = pathway;		
		hql.append(" and "); 
		hql.append(" c.target = :target ");
		names[1] = "target";
		values[1] = target;		
		if(recordId != null)
		{
			hql.append(" and c.id <> " + recordId);
		}
		
		return factory.count(hql.toString(), names, values) > 0;				
	}	

	// method generated based on 'pathtarg_unq1' unique index.
	public static PathwayTarget getRecordByPathwayAndTarget(ims.domain.ILightweightDomainFactory factory,
	 ims.pathways.configuration.domain.objects.Pathway pathway
	,
	 ims.pathways.configuration.domain.objects.Target target
	)
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		hql.append("from PathwayTarget c where ");
		hql.append(" c.pathway = :pathway ");
		names[0] = "pathway";
		values[0] = pathway;		
		hql.append(" and "); 
		hql.append(" c.target = :target ");
		names[1] = "target";
		values[1] = target;		
		java.util.List l = factory.find(hql.toString(), names, values);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. " + hql + " returned " + l.size() + " records. " );
		return (PathwayTarget)l.get(0);
	}

	public static PathwayTarget getPathwayTargetFrompathtarg_unq1(ims.domain.ILightweightDomainFactory factory,
	 ims.pathways.configuration.domain.objects.Pathway pathway
	,
	 ims.pathways.configuration.domain.objects.Target target
	)
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		hql.append("from PathwayTarget c where ");
		hql.append(" c.pathway = :pathway ");
		names[0] = "pathway";
		values[0] = pathway;		
		hql.append(" and "); 
		hql.append(" c.target = :target ");
		names[1] = "target";
		values[1] = target;		
		java.util.List l = factory.find(hql.toString(), names, values);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. " + hql + " returned " + l.size() + " records. " );
		return (PathwayTarget)l.get(0);
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
		
		auditStr.append("\r\n*pathway* :");
		if (pathway != null)
		{
			auditStr.append(toShortClassName(pathway));
				
		    auditStr.append(pathway.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*target* :");
		if (target != null)
		{
			auditStr.append(toShortClassName(target));
				
		    auditStr.append(target.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*targetPeriod* :");
		auditStr.append(targetPeriod);
	    auditStr.append("; ");
		auditStr.append("\r\n*status* :");
		if (status != null)
			auditStr.append(status.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*activateTarget* :");
		auditStr.append(activateTarget);
	    auditStr.append("; ");
		auditStr.append("\r\n*warningIndicatorPeriod* :");
		auditStr.append(warningIndicatorPeriod);
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
		
		String keyClassName = "PathwayTarget";
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
		if (this.getPathway() != null)
		{
			sb.append("<pathway>");
			sb.append(this.getPathway().toXMLString(domMap)); 	
			sb.append("</pathway>");		
		}
		if (this.getTarget() != null)
		{
			sb.append("<target>");
			sb.append(this.getTarget().toXMLString(domMap)); 	
			sb.append("</target>");		
		}
		if (this.getTargetPeriod() != null)
		{
			sb.append("<targetPeriod>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTargetPeriod().toString()));
			sb.append("</targetPeriod>");		
		}
		if (this.getStatus() != null)
		{
			sb.append("<status>");
			sb.append(this.getStatus().toXMLString()); 
			sb.append("</status>");		
		}
		if (this.isActivateTarget() != null)
		{
			sb.append("<activateTarget>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isActivateTarget().toString()));
			sb.append("</activateTarget>");		
		}
		if (this.getWarningIndicatorPeriod() != null)
		{
			sb.append("<warningIndicatorPeriod>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getWarningIndicatorPeriod().toString()));
			sb.append("</warningIndicatorPeriod>");		
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
			PathwayTarget domainObject = getPathwayTargetfromXML(itemEl, factory, domMap);

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
			PathwayTarget domainObject = getPathwayTargetfromXML(itemEl, factory, domMap);

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
		
	public static PathwayTarget getPathwayTargetfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPathwayTargetfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PathwayTarget getPathwayTargetfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PathwayTarget.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PathwayTarget.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PathwayTarget class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PathwayTarget)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PathwayTarget.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PathwayTarget ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PathwayTarget)factory.getImportedDomainObject(PathwayTarget.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PathwayTarget();
		}
		String keyClassName = "PathwayTarget";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PathwayTarget)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PathwayTarget obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("pathway");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPathway(ims.pathways.configuration.domain.objects.Pathway.getPathwayfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("target");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTarget(ims.pathways.configuration.domain.objects.Target.getTargetfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("targetPeriod");
		if(fldEl != null)
		{	
    		obj.setTargetPeriod(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("status");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("activateTarget");
		if(fldEl != null)
		{	
    		obj.setActivateTarget(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("warningIndicatorPeriod");
		if(fldEl != null)
		{	
    		obj.setWarningIndicatorPeriod(new Integer(fldEl.getTextTrim()));	
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
		public static final String Pathway = "pathway";
		public static final String Target = "target";
		public static final String TargetPeriod = "targetPeriod";
		public static final String Status = "status";
		public static final String ActivateTarget = "activateTarget";
		public static final String WarningIndicatorPeriod = "warningIndicatorPeriod";
	}
}

