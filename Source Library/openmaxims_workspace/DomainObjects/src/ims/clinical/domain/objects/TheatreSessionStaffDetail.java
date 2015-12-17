//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
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
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5589.25814)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 12/10/2015, 13:28
 *
 */
package ims.clinical.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class TheatreSessionStaffDetail extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100117;
	private static final long serialVersionUID = 1072100117L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Theatre Session */
	private ims.scheduling.domain.objects.Sch_Session theatreSession;
	/** Anaesthetist */
	private ims.core.resource.people.domain.objects.Medic anaesthetist;
	/** Assisting Anaesthetist */
	private ims.core.resource.people.domain.objects.Medic assistingAnaesthetist;
	/** Supervising Anaesthetist */
	private ims.core.resource.people.domain.objects.Medic supervisingAnaesthetist;
	/** Anaesthetic Practioner */
	private ims.core.resource.people.domain.objects.Medic anaestheticPractioner;
	/** Operating Surgeon */
	private ims.core.resource.people.domain.objects.Medic operatingSurgeon;
	/** Supervising Surgeon */
	private ims.core.resource.people.domain.objects.Medic supervisingSurgeon;
	/** Assisting Surgeons
	  * Collection of ims.core.resource.people.domain.objects.Medic.
	  */
	private java.util.List assistingSurgeons;
	/** Circulators Scrub Nurses
	  * Collection of ims.core.resource.people.domain.objects.Nurse.
	  */
	private java.util.List circulatorsScrubNurses;
	/** Other */
	private String other;
	/** No Anaesthetist present for LA cases */
	private Boolean noAnaesthetistPresentLA;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public TheatreSessionStaffDetail (Integer id, int ver)
    {
    	super(id, ver);
    }
    public TheatreSessionStaffDetail ()
    {
    	super();
    }
    public TheatreSessionStaffDetail (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.domain.objects.TheatreSessionStaffDetail.class;
	}


	public ims.scheduling.domain.objects.Sch_Session getTheatreSession() {
		return theatreSession;
	}
	public static TheatreSessionStaffDetail getTheatreSessionStaffDetailFromTheatreSession(ims.domain.ILightweightDomainFactory factory, Integer id)
	{
		java.util.List l = factory.find("from TheatreSessionStaffDetail c where c.theatreSession.id = " + id);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. TheatreSessionStaffDetail.theatreSession.id = " + id + " returned " + l.size() + " records. " );
		return (TheatreSessionStaffDetail)l.get(0);
	}
	public void setTheatreSession(ims.scheduling.domain.objects.Sch_Session theatreSession) {
		this.theatreSession = theatreSession;
	}

	public ims.core.resource.people.domain.objects.Medic getAnaesthetist() {
		return anaesthetist;
	}
	public void setAnaesthetist(ims.core.resource.people.domain.objects.Medic anaesthetist) {
		this.anaesthetist = anaesthetist;
	}

	public ims.core.resource.people.domain.objects.Medic getAssistingAnaesthetist() {
		return assistingAnaesthetist;
	}
	public void setAssistingAnaesthetist(ims.core.resource.people.domain.objects.Medic assistingAnaesthetist) {
		this.assistingAnaesthetist = assistingAnaesthetist;
	}

	public ims.core.resource.people.domain.objects.Medic getSupervisingAnaesthetist() {
		return supervisingAnaesthetist;
	}
	public void setSupervisingAnaesthetist(ims.core.resource.people.domain.objects.Medic supervisingAnaesthetist) {
		this.supervisingAnaesthetist = supervisingAnaesthetist;
	}

	public ims.core.resource.people.domain.objects.Medic getAnaestheticPractioner() {
		return anaestheticPractioner;
	}
	public void setAnaestheticPractioner(ims.core.resource.people.domain.objects.Medic anaestheticPractioner) {
		this.anaestheticPractioner = anaestheticPractioner;
	}

	public ims.core.resource.people.domain.objects.Medic getOperatingSurgeon() {
		return operatingSurgeon;
	}
	public void setOperatingSurgeon(ims.core.resource.people.domain.objects.Medic operatingSurgeon) {
		this.operatingSurgeon = operatingSurgeon;
	}

	public ims.core.resource.people.domain.objects.Medic getSupervisingSurgeon() {
		return supervisingSurgeon;
	}
	public void setSupervisingSurgeon(ims.core.resource.people.domain.objects.Medic supervisingSurgeon) {
		this.supervisingSurgeon = supervisingSurgeon;
	}

	public java.util.List getAssistingSurgeons() {
		if ( null == assistingSurgeons ) {
			assistingSurgeons = new java.util.ArrayList();
		}
		return assistingSurgeons;
	}
	public void setAssistingSurgeons(java.util.List paramValue) {
		this.assistingSurgeons = paramValue;
	}

	public java.util.List getCirculatorsScrubNurses() {
		if ( null == circulatorsScrubNurses ) {
			circulatorsScrubNurses = new java.util.ArrayList();
		}
		return circulatorsScrubNurses;
	}
	public void setCirculatorsScrubNurses(java.util.List paramValue) {
		this.circulatorsScrubNurses = paramValue;
	}

	public String getOther() {
		return other;
	}
	public void setOther(String other) {
		if ( null != other && other.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for other. Tried to set value: "+
				other);
		}
		this.other = other;
	}

	public Boolean isNoAnaesthetistPresentLA() {
		return noAnaesthetistPresentLA;
	}
	public void setNoAnaesthetistPresentLA(Boolean noAnaesthetistPresentLA) {
		this.noAnaesthetistPresentLA = noAnaesthetistPresentLA;
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
		
		auditStr.append("\r\n*theatreSession* :");
		if (theatreSession != null)
		{
			auditStr.append(toShortClassName(theatreSession));
				
		    auditStr.append(theatreSession.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*anaesthetist* :");
		if (anaesthetist != null)
		{
			auditStr.append(toShortClassName(anaesthetist));
				
		    auditStr.append(anaesthetist.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*assistingAnaesthetist* :");
		if (assistingAnaesthetist != null)
		{
			auditStr.append(toShortClassName(assistingAnaesthetist));
				
		    auditStr.append(assistingAnaesthetist.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*supervisingAnaesthetist* :");
		if (supervisingAnaesthetist != null)
		{
			auditStr.append(toShortClassName(supervisingAnaesthetist));
				
		    auditStr.append(supervisingAnaesthetist.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*anaestheticPractioner* :");
		if (anaestheticPractioner != null)
		{
			auditStr.append(toShortClassName(anaestheticPractioner));
				
		    auditStr.append(anaestheticPractioner.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*operatingSurgeon* :");
		if (operatingSurgeon != null)
		{
			auditStr.append(toShortClassName(operatingSurgeon));
				
		    auditStr.append(operatingSurgeon.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*supervisingSurgeon* :");
		if (supervisingSurgeon != null)
		{
			auditStr.append(toShortClassName(supervisingSurgeon));
				
		    auditStr.append(supervisingSurgeon.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*assistingSurgeons* :");
		if (assistingSurgeons != null)
		{
		int i8=0;
		for (i8=0; i8<assistingSurgeons.size(); i8++)
		{
			if (i8 > 0)
				auditStr.append(",");
			ims.core.resource.people.domain.objects.Medic obj = (ims.core.resource.people.domain.objects.Medic)assistingSurgeons.get(i8);
		    if (obj != null)
			{
				if (i8 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i8 > 0)
			auditStr.append("] " + i8);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*circulatorsScrubNurses* :");
		if (circulatorsScrubNurses != null)
		{
		int i9=0;
		for (i9=0; i9<circulatorsScrubNurses.size(); i9++)
		{
			if (i9 > 0)
				auditStr.append(",");
			ims.core.resource.people.domain.objects.Nurse obj = (ims.core.resource.people.domain.objects.Nurse)circulatorsScrubNurses.get(i9);
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
		auditStr.append("\r\n*other* :");
		auditStr.append(other);
	    auditStr.append("; ");
		auditStr.append("\r\n*noAnaesthetistPresentLA* :");
		auditStr.append(noAnaesthetistPresentLA);
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
		
		String keyClassName = "TheatreSessionStaffDetail";
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
		if (this.getTheatreSession() != null)
		{
			sb.append("<theatreSession>");
			sb.append(this.getTheatreSession().toXMLString(domMap)); 	
			sb.append("</theatreSession>");		
		}
		if (this.getAnaesthetist() != null)
		{
			sb.append("<anaesthetist>");
			sb.append(this.getAnaesthetist().toXMLString(domMap)); 	
			sb.append("</anaesthetist>");		
		}
		if (this.getAssistingAnaesthetist() != null)
		{
			sb.append("<assistingAnaesthetist>");
			sb.append(this.getAssistingAnaesthetist().toXMLString(domMap)); 	
			sb.append("</assistingAnaesthetist>");		
		}
		if (this.getSupervisingAnaesthetist() != null)
		{
			sb.append("<supervisingAnaesthetist>");
			sb.append(this.getSupervisingAnaesthetist().toXMLString(domMap)); 	
			sb.append("</supervisingAnaesthetist>");		
		}
		if (this.getAnaestheticPractioner() != null)
		{
			sb.append("<anaestheticPractioner>");
			sb.append(this.getAnaestheticPractioner().toXMLString(domMap)); 	
			sb.append("</anaestheticPractioner>");		
		}
		if (this.getOperatingSurgeon() != null)
		{
			sb.append("<operatingSurgeon>");
			sb.append(this.getOperatingSurgeon().toXMLString(domMap)); 	
			sb.append("</operatingSurgeon>");		
		}
		if (this.getSupervisingSurgeon() != null)
		{
			sb.append("<supervisingSurgeon>");
			sb.append(this.getSupervisingSurgeon().toXMLString(domMap)); 	
			sb.append("</supervisingSurgeon>");		
		}
		if (this.getAssistingSurgeons() != null)
		{
			if (this.getAssistingSurgeons().size() > 0 )
			{
			sb.append("<assistingSurgeons>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAssistingSurgeons(), domMap));
			sb.append("</assistingSurgeons>");		
			}
		}
		if (this.getCirculatorsScrubNurses() != null)
		{
			if (this.getCirculatorsScrubNurses().size() > 0 )
			{
			sb.append("<circulatorsScrubNurses>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getCirculatorsScrubNurses(), domMap));
			sb.append("</circulatorsScrubNurses>");		
			}
		}
		if (this.getOther() != null)
		{
			sb.append("<other>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOther().toString()));
			sb.append("</other>");		
		}
		if (this.isNoAnaesthetistPresentLA() != null)
		{
			sb.append("<noAnaesthetistPresentLA>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isNoAnaesthetistPresentLA().toString()));
			sb.append("</noAnaesthetistPresentLA>");		
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
			TheatreSessionStaffDetail domainObject = getTheatreSessionStaffDetailfromXML(itemEl, factory, domMap);

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
			TheatreSessionStaffDetail domainObject = getTheatreSessionStaffDetailfromXML(itemEl, factory, domMap);

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
		
	public static TheatreSessionStaffDetail getTheatreSessionStaffDetailfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getTheatreSessionStaffDetailfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static TheatreSessionStaffDetail getTheatreSessionStaffDetailfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!TheatreSessionStaffDetail.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!TheatreSessionStaffDetail.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the TheatreSessionStaffDetail class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (TheatreSessionStaffDetail)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(TheatreSessionStaffDetail.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		TheatreSessionStaffDetail ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (TheatreSessionStaffDetail)factory.getImportedDomainObject(TheatreSessionStaffDetail.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new TheatreSessionStaffDetail();
		}
		String keyClassName = "TheatreSessionStaffDetail";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (TheatreSessionStaffDetail)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, TheatreSessionStaffDetail obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("theatreSession");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTheatreSession(ims.scheduling.domain.objects.Sch_Session.getSch_SessionfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("anaesthetist");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAnaesthetist(ims.core.resource.people.domain.objects.Medic.getMedicfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("assistingAnaesthetist");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAssistingAnaesthetist(ims.core.resource.people.domain.objects.Medic.getMedicfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("supervisingAnaesthetist");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSupervisingAnaesthetist(ims.core.resource.people.domain.objects.Medic.getMedicfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("anaestheticPractioner");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAnaestheticPractioner(ims.core.resource.people.domain.objects.Medic.getMedicfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("operatingSurgeon");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setOperatingSurgeon(ims.core.resource.people.domain.objects.Medic.getMedicfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("supervisingSurgeon");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSupervisingSurgeon(ims.core.resource.people.domain.objects.Medic.getMedicfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("assistingSurgeons");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setAssistingSurgeons(ims.core.resource.people.domain.objects.Medic.fromListXMLString(fldEl, factory, obj.getAssistingSurgeons(), domMap));
		}
		fldEl = el.element("circulatorsScrubNurses");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setCirculatorsScrubNurses(ims.core.resource.people.domain.objects.Nurse.fromListXMLString(fldEl, factory, obj.getCirculatorsScrubNurses(), domMap));
		}
		fldEl = el.element("other");
		if(fldEl != null)
		{	
    		obj.setOther(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("noAnaesthetistPresentLA");
		if(fldEl != null)
		{	
    		obj.setNoAnaesthetistPresentLA(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "assistingSurgeons"
		, "circulatorsScrubNurses"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String TheatreSession = "theatreSession";
		public static final String Anaesthetist = "anaesthetist";
		public static final String AssistingAnaesthetist = "assistingAnaesthetist";
		public static final String SupervisingAnaesthetist = "supervisingAnaesthetist";
		public static final String AnaestheticPractioner = "anaestheticPractioner";
		public static final String OperatingSurgeon = "operatingSurgeon";
		public static final String SupervisingSurgeon = "supervisingSurgeon";
		public static final String AssistingSurgeons = "assistingSurgeons";
		public static final String CirculatorsScrubNurses = "circulatorsScrubNurses";
		public static final String Other = "other";
		public static final String NoAnaesthetistPresentLA = "noAnaesthetistPresentLA";
	}
}

