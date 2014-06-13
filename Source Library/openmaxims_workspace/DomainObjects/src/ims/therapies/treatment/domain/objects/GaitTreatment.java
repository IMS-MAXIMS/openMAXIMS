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
package ims.therapies.treatment.domain.objects;

/**
 * 
 * @author Joan Heelan
 * Generated.
 */


public class GaitTreatment extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1019100056;
	private static final long serialVersionUID = 1019100056L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Environment */
	private ims.domain.lookups.LookupInstance environment;
	/** Gait Technique */
	private ims.domain.lookups.LookupInstance gaitTechnique;
	/** Orthosis */
	private ims.domain.lookups.LookupInstance orthosis;
	/** Supervision Level */
	private ims.domain.lookups.LookupInstance supervisionLevel;
	/** Walk Test Time */
	private Integer walkTestTime;
	/** Gait Practice */
	private String gaitPractice;
	/** Stair Practice */
	private String stairPractice;
	/** Gait Summary */
	private String gaitSummary;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public GaitTreatment (Integer id, int ver)
    {
    	super(id, ver);
    }
    public GaitTreatment ()
    {
    	super();
    }
    public GaitTreatment (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.therapies.treatment.domain.objects.GaitTreatment.class;
	}


	public ims.domain.lookups.LookupInstance getEnvironment() {
		return environment;
	}
	public void setEnvironment(ims.domain.lookups.LookupInstance environment) {
		this.environment = environment;
	}

	public ims.domain.lookups.LookupInstance getGaitTechnique() {
		return gaitTechnique;
	}
	public void setGaitTechnique(ims.domain.lookups.LookupInstance gaitTechnique) {
		this.gaitTechnique = gaitTechnique;
	}

	public ims.domain.lookups.LookupInstance getOrthosis() {
		return orthosis;
	}
	public void setOrthosis(ims.domain.lookups.LookupInstance orthosis) {
		this.orthosis = orthosis;
	}

	public ims.domain.lookups.LookupInstance getSupervisionLevel() {
		return supervisionLevel;
	}
	public void setSupervisionLevel(ims.domain.lookups.LookupInstance supervisionLevel) {
		this.supervisionLevel = supervisionLevel;
	}

	public Integer getWalkTestTime() {
		return walkTestTime;
	}
	public void setWalkTestTime(Integer walkTestTime) {
		this.walkTestTime = walkTestTime;
	}

	public String getGaitPractice() {
		return gaitPractice;
	}
	public void setGaitPractice(String gaitPractice) {
		if ( null != gaitPractice && gaitPractice.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for gaitPractice. Tried to set value: "+
				gaitPractice);
		}
		this.gaitPractice = gaitPractice;
	}

	public String getStairPractice() {
		return stairPractice;
	}
	public void setStairPractice(String stairPractice) {
		if ( null != stairPractice && stairPractice.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for stairPractice. Tried to set value: "+
				stairPractice);
		}
		this.stairPractice = stairPractice;
	}

	public String getGaitSummary() {
		return gaitSummary;
	}
	public void setGaitSummary(String gaitSummary) {
		if ( null != gaitSummary && gaitSummary.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for gaitSummary. Tried to set value: "+
				gaitSummary);
		}
		this.gaitSummary = gaitSummary;
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
		
		auditStr.append("\r\n*environment* :");
		if (environment != null)
			auditStr.append(environment.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*gaitTechnique* :");
		if (gaitTechnique != null)
			auditStr.append(gaitTechnique.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*orthosis* :");
		if (orthosis != null)
			auditStr.append(orthosis.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*supervisionLevel* :");
		if (supervisionLevel != null)
			auditStr.append(supervisionLevel.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*walkTestTime* :");
		auditStr.append(walkTestTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*gaitPractice* :");
		auditStr.append(gaitPractice);
	    auditStr.append("; ");
		auditStr.append("\r\n*stairPractice* :");
		auditStr.append(stairPractice);
	    auditStr.append("; ");
		auditStr.append("\r\n*gaitSummary* :");
		auditStr.append(gaitSummary);
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
		
		String keyClassName = "GaitTreatment";
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
		if (this.getEnvironment() != null)
		{
			sb.append("<environment>");
			sb.append(this.getEnvironment().toXMLString()); 
			sb.append("</environment>");		
		}
		if (this.getGaitTechnique() != null)
		{
			sb.append("<gaitTechnique>");
			sb.append(this.getGaitTechnique().toXMLString()); 
			sb.append("</gaitTechnique>");		
		}
		if (this.getOrthosis() != null)
		{
			sb.append("<orthosis>");
			sb.append(this.getOrthosis().toXMLString()); 
			sb.append("</orthosis>");		
		}
		if (this.getSupervisionLevel() != null)
		{
			sb.append("<supervisionLevel>");
			sb.append(this.getSupervisionLevel().toXMLString()); 
			sb.append("</supervisionLevel>");		
		}
		if (this.getWalkTestTime() != null)
		{
			sb.append("<walkTestTime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getWalkTestTime().toString()));
			sb.append("</walkTestTime>");		
		}
		if (this.getGaitPractice() != null)
		{
			sb.append("<gaitPractice>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getGaitPractice().toString()));
			sb.append("</gaitPractice>");		
		}
		if (this.getStairPractice() != null)
		{
			sb.append("<stairPractice>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getStairPractice().toString()));
			sb.append("</stairPractice>");		
		}
		if (this.getGaitSummary() != null)
		{
			sb.append("<gaitSummary>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getGaitSummary().toString()));
			sb.append("</gaitSummary>");		
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
			GaitTreatment domainObject = getGaitTreatmentfromXML(itemEl, factory, domMap);

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
			GaitTreatment domainObject = getGaitTreatmentfromXML(itemEl, factory, domMap);

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
		
	public static GaitTreatment getGaitTreatmentfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getGaitTreatmentfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static GaitTreatment getGaitTreatmentfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!GaitTreatment.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!GaitTreatment.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the GaitTreatment class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (GaitTreatment)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(GaitTreatment.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		GaitTreatment ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (GaitTreatment)factory.getImportedDomainObject(GaitTreatment.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new GaitTreatment();
		}
		String keyClassName = "GaitTreatment";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (GaitTreatment)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, GaitTreatment obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("environment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setEnvironment(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("gaitTechnique");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setGaitTechnique(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("orthosis");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOrthosis(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("supervisionLevel");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSupervisionLevel(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("walkTestTime");
		if(fldEl != null)
		{	
    		obj.setWalkTestTime(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("gaitPractice");
		if(fldEl != null)
		{	
    		obj.setGaitPractice(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("stairPractice");
		if(fldEl != null)
		{	
    		obj.setStairPractice(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("gaitSummary");
		if(fldEl != null)
		{	
    		obj.setGaitSummary(new String(fldEl.getTextTrim()));	
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
		public static final String Environment = "environment";
		public static final String GaitTechnique = "gaitTechnique";
		public static final String Orthosis = "orthosis";
		public static final String SupervisionLevel = "supervisionLevel";
		public static final String WalkTestTime = "walkTestTime";
		public static final String GaitPractice = "gaitPractice";
		public static final String StairPractice = "stairPractice";
		public static final String GaitSummary = "gaitSummary";
	}
}

