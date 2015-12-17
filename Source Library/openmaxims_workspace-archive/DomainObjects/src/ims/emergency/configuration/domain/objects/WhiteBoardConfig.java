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
package ims.emergency.configuration.domain.objects;

/**
 * 
 * @author Rory Fitzpatrick
 * Generated.
 */


public class WhiteBoardConfig extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1087100018;
	private static final long serialVersionUID = 1087100018L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** ED Location */
	private ims.core.resource.place.domain.objects.Location eDLocation;
	/** Current Area */
	private ims.emergency.configuration.domain.objects.TrackingArea currentArea;
	/** is Active */
	private Boolean isActive;
	/** Show Meds Given Column */
	private Boolean medsGiven;
	/** Show Obs Taken Column */
	private Boolean obsTaken;
	/** Show ECG Column */
	private Boolean eCG;
	/** Show NPO Column */
	private Boolean nPO;
	/** Show Isolation Column */
	private Boolean isolation;
	/** Answer Options
	  * Collection of ims.emergency.configuration.domain.objects.WhiteBoardAssessmentConfig.
	  */
	private java.util.List assessments;
	/** Answer Options
	  * Collection of ims.emergency.configuration.domain.objects.WhiteBoardQuestionConfig.
	  */
	private java.util.List otherQuestions;
	/** Show Comments Column */
	private Boolean comments;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public WhiteBoardConfig (Integer id, int ver)
    {
    	super(id, ver);
    }
    public WhiteBoardConfig ()
    {
    	super();
    }
    public WhiteBoardConfig (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.emergency.configuration.domain.objects.WhiteBoardConfig.class;
	}


	public ims.core.resource.place.domain.objects.Location getEDLocation() {
		return eDLocation;
	}
	public void setEDLocation(ims.core.resource.place.domain.objects.Location eDLocation) {
		this.eDLocation = eDLocation;
	}

	public ims.emergency.configuration.domain.objects.TrackingArea getCurrentArea() {
		return currentArea;
	}
	public void setCurrentArea(ims.emergency.configuration.domain.objects.TrackingArea currentArea) {
		this.currentArea = currentArea;
	}

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean isMedsGiven() {
		return medsGiven;
	}
	public void setMedsGiven(Boolean medsGiven) {
		this.medsGiven = medsGiven;
	}

	public Boolean isObsTaken() {
		return obsTaken;
	}
	public void setObsTaken(Boolean obsTaken) {
		this.obsTaken = obsTaken;
	}

	public Boolean isECG() {
		return eCG;
	}
	public void setECG(Boolean eCG) {
		this.eCG = eCG;
	}

	public Boolean isNPO() {
		return nPO;
	}
	public void setNPO(Boolean nPO) {
		this.nPO = nPO;
	}

	public Boolean isIsolation() {
		return isolation;
	}
	public void setIsolation(Boolean isolation) {
		this.isolation = isolation;
	}

	public java.util.List getAssessments() {
		if ( null == assessments ) {
			assessments = new java.util.ArrayList();
		}
		return assessments;
	}
	public void setAssessments(java.util.List paramValue) {
		this.assessments = paramValue;
	}

	public java.util.List getOtherQuestions() {
		if ( null == otherQuestions ) {
			otherQuestions = new java.util.ArrayList();
		}
		return otherQuestions;
	}
	public void setOtherQuestions(java.util.List paramValue) {
		this.otherQuestions = paramValue;
	}

	public Boolean isComments() {
		return comments;
	}
	public void setComments(Boolean comments) {
		this.comments = comments;
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
		
		auditStr.append("\r\n*eDLocation* :");
		if (eDLocation != null)
		{
			auditStr.append(toShortClassName(eDLocation));
				
		    auditStr.append(eDLocation.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*currentArea* :");
		if (currentArea != null)
		{
			auditStr.append(toShortClassName(currentArea));
				
		    auditStr.append(currentArea.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
	    auditStr.append("; ");
		auditStr.append("\r\n*medsGiven* :");
		auditStr.append(medsGiven);
	    auditStr.append("; ");
		auditStr.append("\r\n*obsTaken* :");
		auditStr.append(obsTaken);
	    auditStr.append("; ");
		auditStr.append("\r\n*eCG* :");
		auditStr.append(eCG);
	    auditStr.append("; ");
		auditStr.append("\r\n*nPO* :");
		auditStr.append(nPO);
	    auditStr.append("; ");
		auditStr.append("\r\n*isolation* :");
		auditStr.append(isolation);
	    auditStr.append("; ");
		auditStr.append("\r\n*assessments* :");
		if (assessments != null)
		{
		int i9=0;
		for (i9=0; i9<assessments.size(); i9++)
		{
			if (i9 > 0)
				auditStr.append(",");
			ims.emergency.configuration.domain.objects.WhiteBoardAssessmentConfig obj = (ims.emergency.configuration.domain.objects.WhiteBoardAssessmentConfig)assessments.get(i9);
		    if (obj != null)
			{
				if (i9 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i9 > 0)
			auditStr.append("] " + i9);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*otherQuestions* :");
		if (otherQuestions != null)
		{
		int i10=0;
		for (i10=0; i10<otherQuestions.size(); i10++)
		{
			if (i10 > 0)
				auditStr.append(",");
			ims.emergency.configuration.domain.objects.WhiteBoardQuestionConfig obj = (ims.emergency.configuration.domain.objects.WhiteBoardQuestionConfig)otherQuestions.get(i10);
		    if (obj != null)
			{
				if (i10 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i10 > 0)
			auditStr.append("] " + i10);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*comments* :");
		auditStr.append(comments);
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
		
		String keyClassName = "WhiteBoardConfig";
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
		if (this.getEDLocation() != null)
		{
			sb.append("<eDLocation>");
			sb.append(this.getEDLocation().toXMLString(domMap)); 	
			sb.append("</eDLocation>");		
		}
		if (this.getCurrentArea() != null)
		{
			sb.append("<currentArea>");
			sb.append(this.getCurrentArea().toXMLString(domMap)); 	
			sb.append("</currentArea>");		
		}
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
		}
		if (this.isMedsGiven() != null)
		{
			sb.append("<medsGiven>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isMedsGiven().toString()));
			sb.append("</medsGiven>");		
		}
		if (this.isObsTaken() != null)
		{
			sb.append("<obsTaken>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isObsTaken().toString()));
			sb.append("</obsTaken>");		
		}
		if (this.isECG() != null)
		{
			sb.append("<eCG>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isECG().toString()));
			sb.append("</eCG>");		
		}
		if (this.isNPO() != null)
		{
			sb.append("<nPO>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isNPO().toString()));
			sb.append("</nPO>");		
		}
		if (this.isIsolation() != null)
		{
			sb.append("<isolation>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsolation().toString()));
			sb.append("</isolation>");		
		}
		if (this.getAssessments() != null)
		{
			if (this.getAssessments().size() > 0 )
			{
			sb.append("<assessments>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAssessments(), domMap));
			sb.append("</assessments>");		
			}
		}
		if (this.getOtherQuestions() != null)
		{
			if (this.getOtherQuestions().size() > 0 )
			{
			sb.append("<otherQuestions>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getOtherQuestions(), domMap));
			sb.append("</otherQuestions>");		
			}
		}
		if (this.isComments() != null)
		{
			sb.append("<comments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isComments().toString()));
			sb.append("</comments>");		
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
			WhiteBoardConfig domainObject = getWhiteBoardConfigfromXML(itemEl, factory, domMap);

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
			WhiteBoardConfig domainObject = getWhiteBoardConfigfromXML(itemEl, factory, domMap);

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
		
	public static WhiteBoardConfig getWhiteBoardConfigfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getWhiteBoardConfigfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static WhiteBoardConfig getWhiteBoardConfigfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!WhiteBoardConfig.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!WhiteBoardConfig.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the WhiteBoardConfig class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (WhiteBoardConfig)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(WhiteBoardConfig.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		WhiteBoardConfig ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (WhiteBoardConfig)factory.getImportedDomainObject(WhiteBoardConfig.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new WhiteBoardConfig();
		}
		String keyClassName = "WhiteBoardConfig";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (WhiteBoardConfig)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, WhiteBoardConfig obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("eDLocation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setEDLocation(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("currentArea");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentArea(ims.emergency.configuration.domain.objects.TrackingArea.getTrackingAreafromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("medsGiven");
		if(fldEl != null)
		{	
    		obj.setMedsGiven(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("obsTaken");
		if(fldEl != null)
		{	
    		obj.setObsTaken(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("eCG");
		if(fldEl != null)
		{	
    		obj.setECG(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("nPO");
		if(fldEl != null)
		{	
    		obj.setNPO(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isolation");
		if(fldEl != null)
		{	
    		obj.setIsolation(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("assessments");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setAssessments(ims.emergency.configuration.domain.objects.WhiteBoardAssessmentConfig.fromListXMLString(fldEl, factory, obj.getAssessments(), domMap));
		}
		fldEl = el.element("otherQuestions");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setOtherQuestions(ims.emergency.configuration.domain.objects.WhiteBoardQuestionConfig.fromListXMLString(fldEl, factory, obj.getOtherQuestions(), domMap));
		}
		fldEl = el.element("comments");
		if(fldEl != null)
		{	
    		obj.setComments(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "assessments"
		, "otherQuestions"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String EDLocation = "eDLocation";
		public static final String CurrentArea = "currentArea";
		public static final String IsActive = "isActive";
		public static final String MedsGiven = "medsGiven";
		public static final String ObsTaken = "obsTaken";
		public static final String ECG = "eCG";
		public static final String NPO = "nPO";
		public static final String Isolation = "isolation";
		public static final String Assessments = "assessments";
		public static final String OtherQuestions = "otherQuestions";
		public static final String Comments = "comments";
	}
}

