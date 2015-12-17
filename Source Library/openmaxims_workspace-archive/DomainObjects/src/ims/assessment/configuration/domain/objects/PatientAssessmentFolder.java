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


public class PatientAssessmentFolder extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1083100006;
	private static final long serialVersionUID = 1083100006L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** FolderName */
	private String folderName;
	/** PatientAssessments
	  * Collection of ims.assessment.configuration.domain.objects.UserAssessment.
	  */
	private java.util.Set patientAssessments;
	/** Graphic Assessments
	  * Collection of ims.assessment.configuration.domain.objects.GraphicAssessment.
	  */
	private java.util.Set graphicAssessments;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatientAssessmentFolder (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientAssessmentFolder ()
    {
    	super();
    }
    public PatientAssessmentFolder (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.assessment.configuration.domain.objects.PatientAssessmentFolder.class;
	}


	public String getFolderName() {
		return folderName;
	}
	public void setFolderName(String folderName) {
		if ( null != folderName && folderName.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for folderName. Tried to set value: "+
				folderName);
		}
		this.folderName = folderName;
	}

	public java.util.Set getPatientAssessments() {
		if ( null == patientAssessments ) {
			patientAssessments = new java.util.HashSet();
		}
		return patientAssessments;
	}
	public void setPatientAssessments(java.util.Set paramValue) {
		this.patientAssessments = paramValue;
	}

	public java.util.Set getGraphicAssessments() {
		if ( null == graphicAssessments ) {
			graphicAssessments = new java.util.HashSet();
		}
		return graphicAssessments;
	}
	public void setGraphicAssessments(java.util.Set paramValue) {
		this.graphicAssessments = paramValue;
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
		
		auditStr.append("\r\n*folderName* :");
		auditStr.append(folderName);
	    auditStr.append("; ");
		auditStr.append("\r\n*patientAssessments* :");
		if (patientAssessments != null)
		{
			java.util.Iterator it2 = patientAssessments.iterator();
			int i2=0;
			while (it2.hasNext())
			{
				if (i2 > 0)
					auditStr.append(",");
				ims.assessment.configuration.domain.objects.UserAssessment obj = (ims.assessment.configuration.domain.objects.UserAssessment)it2.next();
		if (obj != null)
		{
		   if (i2 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i2++;
		}
		if (i2 > 0)
			auditStr.append("] " + i2);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*graphicAssessments* :");
		if (graphicAssessments != null)
		{
			java.util.Iterator it3 = graphicAssessments.iterator();
			int i3=0;
			while (it3.hasNext())
			{
				if (i3 > 0)
					auditStr.append(",");
				ims.assessment.configuration.domain.objects.GraphicAssessment obj = (ims.assessment.configuration.domain.objects.GraphicAssessment)it3.next();
		if (obj != null)
		{
		   if (i3 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i3++;
		}
		if (i3 > 0)
			auditStr.append("] " + i3);
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
		
		String keyClassName = "PatientAssessmentFolder";
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
		if (this.getFolderName() != null)
		{
			sb.append("<folderName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFolderName().toString()));
			sb.append("</folderName>");		
		}
		if (this.getPatientAssessments() != null)
		{
			if (this.getPatientAssessments().size() > 0 )
			{
			sb.append("<patientAssessments>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPatientAssessments(), domMap));
			sb.append("</patientAssessments>");		
			}
		}
		if (this.getGraphicAssessments() != null)
		{
			if (this.getGraphicAssessments().size() > 0 )
			{
			sb.append("<graphicAssessments>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getGraphicAssessments(), domMap));
			sb.append("</graphicAssessments>");		
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
			PatientAssessmentFolder domainObject = getPatientAssessmentFolderfromXML(itemEl, factory, domMap);

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
			PatientAssessmentFolder domainObject = getPatientAssessmentFolderfromXML(itemEl, factory, domMap);

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
		
	public static PatientAssessmentFolder getPatientAssessmentFolderfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientAssessmentFolderfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientAssessmentFolder getPatientAssessmentFolderfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientAssessmentFolder.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientAssessmentFolder.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientAssessmentFolder class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientAssessmentFolder)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientAssessmentFolder.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientAssessmentFolder ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientAssessmentFolder)factory.getImportedDomainObject(PatientAssessmentFolder.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientAssessmentFolder();
		}
		String keyClassName = "PatientAssessmentFolder";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientAssessmentFolder)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientAssessmentFolder obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("folderName");
		if(fldEl != null)
		{	
    		obj.setFolderName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("patientAssessments");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setPatientAssessments(ims.assessment.configuration.domain.objects.UserAssessment.fromSetXMLString(fldEl, factory, obj.getPatientAssessments(), domMap));
		}
		fldEl = el.element("graphicAssessments");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setGraphicAssessments(ims.assessment.configuration.domain.objects.GraphicAssessment.fromSetXMLString(fldEl, factory, obj.getGraphicAssessments(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "patientAssessments"
		, "graphicAssessments"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String FolderName = "folderName";
		public static final String PatientAssessments = "patientAssessments";
		public static final String GraphicAssessments = "graphicAssessments";
	}
}

