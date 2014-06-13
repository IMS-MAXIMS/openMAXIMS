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
package ims.oncology.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class WaitingTimesAdjustmentsandReasons extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1074100019;
	private static final long serialVersionUID = 1074100019L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** EpisodeofCare */
	private ims.core.admin.domain.objects.EpisodeOfCare episodeofCare;
	/** CareContext */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** AdjReferralFirstSeen */
	private Integer adjReferralFirstSeen;
	/** ReasReferralFirstSeen */
	private ims.domain.lookups.LookupInstance reasReferralFirstSeen;
	/** AdjFirstSeenDecTreat */
	private Integer adjFirstSeenDecTreat;
	/** ReasFirstSeenDecTreat */
	private ims.domain.lookups.LookupInstance reasFirstSeenDecTreat;
	/** AdjDecTreatTreatment */
	private Integer adjDecTreatTreatment;
	/** ReasDecTreatTreatment */
	private ims.domain.lookups.LookupInstance reasDecTreatTreatment;
	/** DelayReasReferralTreat */
	private ims.domain.lookups.LookupInstance delayReasReferralTreat;
	/** NotesReferralTreat */
	private String notesReferralTreat;
	/** DelayReasDecTreatTreat */
	private ims.domain.lookups.LookupInstance delayReasDecTreatTreat;
	/** NotesDecTreatTreat */
	private String notesDecTreatTreat;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public WaitingTimesAdjustmentsandReasons (Integer id, int ver)
    {
    	super(id, ver);
    }
    public WaitingTimesAdjustmentsandReasons ()
    {
    	super();
    }
    public WaitingTimesAdjustmentsandReasons (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.oncology.domain.objects.WaitingTimesAdjustmentsandReasons.class;
	}


	public ims.core.admin.domain.objects.EpisodeOfCare getEpisodeofCare() {
		return episodeofCare;
	}
	public void setEpisodeofCare(ims.core.admin.domain.objects.EpisodeOfCare episodeofCare) {
		this.episodeofCare = episodeofCare;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public Integer getAdjReferralFirstSeen() {
		return adjReferralFirstSeen;
	}
	public void setAdjReferralFirstSeen(Integer adjReferralFirstSeen) {
		this.adjReferralFirstSeen = adjReferralFirstSeen;
	}

	public ims.domain.lookups.LookupInstance getReasReferralFirstSeen() {
		return reasReferralFirstSeen;
	}
	public void setReasReferralFirstSeen(ims.domain.lookups.LookupInstance reasReferralFirstSeen) {
		this.reasReferralFirstSeen = reasReferralFirstSeen;
	}

	public Integer getAdjFirstSeenDecTreat() {
		return adjFirstSeenDecTreat;
	}
	public void setAdjFirstSeenDecTreat(Integer adjFirstSeenDecTreat) {
		this.adjFirstSeenDecTreat = adjFirstSeenDecTreat;
	}

	public ims.domain.lookups.LookupInstance getReasFirstSeenDecTreat() {
		return reasFirstSeenDecTreat;
	}
	public void setReasFirstSeenDecTreat(ims.domain.lookups.LookupInstance reasFirstSeenDecTreat) {
		this.reasFirstSeenDecTreat = reasFirstSeenDecTreat;
	}

	public Integer getAdjDecTreatTreatment() {
		return adjDecTreatTreatment;
	}
	public void setAdjDecTreatTreatment(Integer adjDecTreatTreatment) {
		this.adjDecTreatTreatment = adjDecTreatTreatment;
	}

	public ims.domain.lookups.LookupInstance getReasDecTreatTreatment() {
		return reasDecTreatTreatment;
	}
	public void setReasDecTreatTreatment(ims.domain.lookups.LookupInstance reasDecTreatTreatment) {
		this.reasDecTreatTreatment = reasDecTreatTreatment;
	}

	public ims.domain.lookups.LookupInstance getDelayReasReferralTreat() {
		return delayReasReferralTreat;
	}
	public void setDelayReasReferralTreat(ims.domain.lookups.LookupInstance delayReasReferralTreat) {
		this.delayReasReferralTreat = delayReasReferralTreat;
	}

	public String getNotesReferralTreat() {
		return notesReferralTreat;
	}
	public void setNotesReferralTreat(String notesReferralTreat) {
		if ( null != notesReferralTreat && notesReferralTreat.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for notesReferralTreat. Tried to set value: "+
				notesReferralTreat);
		}
		this.notesReferralTreat = notesReferralTreat;
	}

	public ims.domain.lookups.LookupInstance getDelayReasDecTreatTreat() {
		return delayReasDecTreatTreat;
	}
	public void setDelayReasDecTreatTreat(ims.domain.lookups.LookupInstance delayReasDecTreatTreat) {
		this.delayReasDecTreatTreat = delayReasDecTreatTreat;
	}

	public String getNotesDecTreatTreat() {
		return notesDecTreatTreat;
	}
	public void setNotesDecTreatTreat(String notesDecTreatTreat) {
		if ( null != notesDecTreatTreat && notesDecTreatTreat.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for notesDecTreatTreat. Tried to set value: "+
				notesDecTreatTreat);
		}
		this.notesDecTreatTreat = notesDecTreatTreat;
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
		
		auditStr.append("\r\n*episodeofCare* :");
		if (episodeofCare != null)
		{
			auditStr.append(toShortClassName(episodeofCare));
				
		    auditStr.append(episodeofCare.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*adjReferralFirstSeen* :");
		auditStr.append(adjReferralFirstSeen);
	    auditStr.append("; ");
		auditStr.append("\r\n*reasReferralFirstSeen* :");
		if (reasReferralFirstSeen != null)
			auditStr.append(reasReferralFirstSeen.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*adjFirstSeenDecTreat* :");
		auditStr.append(adjFirstSeenDecTreat);
	    auditStr.append("; ");
		auditStr.append("\r\n*reasFirstSeenDecTreat* :");
		if (reasFirstSeenDecTreat != null)
			auditStr.append(reasFirstSeenDecTreat.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*adjDecTreatTreatment* :");
		auditStr.append(adjDecTreatTreatment);
	    auditStr.append("; ");
		auditStr.append("\r\n*reasDecTreatTreatment* :");
		if (reasDecTreatTreatment != null)
			auditStr.append(reasDecTreatTreatment.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*delayReasReferralTreat* :");
		if (delayReasReferralTreat != null)
			auditStr.append(delayReasReferralTreat.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*notesReferralTreat* :");
		auditStr.append(notesReferralTreat);
	    auditStr.append("; ");
		auditStr.append("\r\n*delayReasDecTreatTreat* :");
		if (delayReasDecTreatTreat != null)
			auditStr.append(delayReasDecTreatTreat.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*notesDecTreatTreat* :");
		auditStr.append(notesDecTreatTreat);
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
		
		String keyClassName = "WaitingTimesAdjustmentsandReasons";
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
		if (this.getEpisodeofCare() != null)
		{
			sb.append("<episodeofCare>");
			sb.append(this.getEpisodeofCare().toXMLString(domMap)); 	
			sb.append("</episodeofCare>");		
		}
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getAdjReferralFirstSeen() != null)
		{
			sb.append("<adjReferralFirstSeen>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAdjReferralFirstSeen().toString()));
			sb.append("</adjReferralFirstSeen>");		
		}
		if (this.getReasReferralFirstSeen() != null)
		{
			sb.append("<reasReferralFirstSeen>");
			sb.append(this.getReasReferralFirstSeen().toXMLString()); 
			sb.append("</reasReferralFirstSeen>");		
		}
		if (this.getAdjFirstSeenDecTreat() != null)
		{
			sb.append("<adjFirstSeenDecTreat>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAdjFirstSeenDecTreat().toString()));
			sb.append("</adjFirstSeenDecTreat>");		
		}
		if (this.getReasFirstSeenDecTreat() != null)
		{
			sb.append("<reasFirstSeenDecTreat>");
			sb.append(this.getReasFirstSeenDecTreat().toXMLString()); 
			sb.append("</reasFirstSeenDecTreat>");		
		}
		if (this.getAdjDecTreatTreatment() != null)
		{
			sb.append("<adjDecTreatTreatment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAdjDecTreatTreatment().toString()));
			sb.append("</adjDecTreatTreatment>");		
		}
		if (this.getReasDecTreatTreatment() != null)
		{
			sb.append("<reasDecTreatTreatment>");
			sb.append(this.getReasDecTreatTreatment().toXMLString()); 
			sb.append("</reasDecTreatTreatment>");		
		}
		if (this.getDelayReasReferralTreat() != null)
		{
			sb.append("<delayReasReferralTreat>");
			sb.append(this.getDelayReasReferralTreat().toXMLString()); 
			sb.append("</delayReasReferralTreat>");		
		}
		if (this.getNotesReferralTreat() != null)
		{
			sb.append("<notesReferralTreat>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNotesReferralTreat().toString()));
			sb.append("</notesReferralTreat>");		
		}
		if (this.getDelayReasDecTreatTreat() != null)
		{
			sb.append("<delayReasDecTreatTreat>");
			sb.append(this.getDelayReasDecTreatTreat().toXMLString()); 
			sb.append("</delayReasDecTreatTreat>");		
		}
		if (this.getNotesDecTreatTreat() != null)
		{
			sb.append("<notesDecTreatTreat>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNotesDecTreatTreat().toString()));
			sb.append("</notesDecTreatTreat>");		
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
			WaitingTimesAdjustmentsandReasons domainObject = getWaitingTimesAdjustmentsandReasonsfromXML(itemEl, factory, domMap);

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
			WaitingTimesAdjustmentsandReasons domainObject = getWaitingTimesAdjustmentsandReasonsfromXML(itemEl, factory, domMap);

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
		
	public static WaitingTimesAdjustmentsandReasons getWaitingTimesAdjustmentsandReasonsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getWaitingTimesAdjustmentsandReasonsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static WaitingTimesAdjustmentsandReasons getWaitingTimesAdjustmentsandReasonsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!WaitingTimesAdjustmentsandReasons.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!WaitingTimesAdjustmentsandReasons.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the WaitingTimesAdjustmentsandReasons class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (WaitingTimesAdjustmentsandReasons)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(WaitingTimesAdjustmentsandReasons.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		WaitingTimesAdjustmentsandReasons ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (WaitingTimesAdjustmentsandReasons)factory.getImportedDomainObject(WaitingTimesAdjustmentsandReasons.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new WaitingTimesAdjustmentsandReasons();
		}
		String keyClassName = "WaitingTimesAdjustmentsandReasons";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (WaitingTimesAdjustmentsandReasons)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, WaitingTimesAdjustmentsandReasons obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("episodeofCare");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setEpisodeofCare(ims.core.admin.domain.objects.EpisodeOfCare.getEpisodeOfCarefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("adjReferralFirstSeen");
		if(fldEl != null)
		{	
    		obj.setAdjReferralFirstSeen(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("reasReferralFirstSeen");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReasReferralFirstSeen(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("adjFirstSeenDecTreat");
		if(fldEl != null)
		{	
    		obj.setAdjFirstSeenDecTreat(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("reasFirstSeenDecTreat");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReasFirstSeenDecTreat(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("adjDecTreatTreatment");
		if(fldEl != null)
		{	
    		obj.setAdjDecTreatTreatment(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("reasDecTreatTreatment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReasDecTreatTreatment(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("delayReasReferralTreat");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDelayReasReferralTreat(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("notesReferralTreat");
		if(fldEl != null)
		{	
    		obj.setNotesReferralTreat(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("delayReasDecTreatTreat");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDelayReasDecTreatTreat(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("notesDecTreatTreat");
		if(fldEl != null)
		{	
    		obj.setNotesDecTreatTreat(new String(fldEl.getTextTrim()));	
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
		public static final String EpisodeofCare = "episodeofCare";
		public static final String CareContext = "careContext";
		public static final String AdjReferralFirstSeen = "adjReferralFirstSeen";
		public static final String ReasReferralFirstSeen = "reasReferralFirstSeen";
		public static final String AdjFirstSeenDecTreat = "adjFirstSeenDecTreat";
		public static final String ReasFirstSeenDecTreat = "reasFirstSeenDecTreat";
		public static final String AdjDecTreatTreatment = "adjDecTreatTreatment";
		public static final String ReasDecTreatTreatment = "reasDecTreatTreatment";
		public static final String DelayReasReferralTreat = "delayReasReferralTreat";
		public static final String NotesReferralTreat = "notesReferralTreat";
		public static final String DelayReasDecTreatTreat = "delayReasDecTreatTreat";
		public static final String NotesDecTreatTreat = "notesDecTreatTreat";
	}
}

