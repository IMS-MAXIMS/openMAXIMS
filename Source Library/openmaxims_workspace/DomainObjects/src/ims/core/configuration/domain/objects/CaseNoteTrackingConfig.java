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
package ims.core.configuration.domain.objects;

/**
 * 
 * @author Cristian Belciug
 * Generated.
 */


public class CaseNoteTrackingConfig extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1028100083;
	private static final long serialVersionUID = 1028100083L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Close requests older than X days old */
	private Integer requestsOlderThan;
	/** In Hours */
	private Integer caseNoteRequestOffset;
	private Integer trackingIdNoOfDigits;
	private String automaticBatchPrintTime;
	private Integer automaticBatchPrintDaysAhead;
	private ims.domain.lookups.LookupInstance defaultFolderForAutomaticCaseNote;
	private Integer pullCaseNotesRequestsOffset;
	/** Default Case Note Folder Location for case notes that require creation */
	private ims.core.resource.place.domain.objects.Location defaultCaseNoteFolderLocation;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public CaseNoteTrackingConfig (Integer id, int ver)
    {
    	super(id, ver);
    }
    public CaseNoteTrackingConfig ()
    {
    	super();
    }
    public CaseNoteTrackingConfig (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.configuration.domain.objects.CaseNoteTrackingConfig.class;
	}


	public Integer getRequestsOlderThan() {
		return requestsOlderThan;
	}
	public void setRequestsOlderThan(Integer requestsOlderThan) {
		this.requestsOlderThan = requestsOlderThan;
	}

	public Integer getCaseNoteRequestOffset() {
		return caseNoteRequestOffset;
	}
	public void setCaseNoteRequestOffset(Integer caseNoteRequestOffset) {
		this.caseNoteRequestOffset = caseNoteRequestOffset;
	}

	public Integer getTrackingIdNoOfDigits() {
		return trackingIdNoOfDigits;
	}
	public void setTrackingIdNoOfDigits(Integer trackingIdNoOfDigits) {
		this.trackingIdNoOfDigits = trackingIdNoOfDigits;
	}

	public String getAutomaticBatchPrintTime() {
		return automaticBatchPrintTime;
	}
	public void setAutomaticBatchPrintTime(String automaticBatchPrintTime) {
		this.automaticBatchPrintTime = automaticBatchPrintTime;
	}

	public Integer getAutomaticBatchPrintDaysAhead() {
		return automaticBatchPrintDaysAhead;
	}
	public void setAutomaticBatchPrintDaysAhead(Integer automaticBatchPrintDaysAhead) {
		this.automaticBatchPrintDaysAhead = automaticBatchPrintDaysAhead;
	}

	public ims.domain.lookups.LookupInstance getDefaultFolderForAutomaticCaseNote() {
		return defaultFolderForAutomaticCaseNote;
	}
	public void setDefaultFolderForAutomaticCaseNote(ims.domain.lookups.LookupInstance defaultFolderForAutomaticCaseNote) {
		this.defaultFolderForAutomaticCaseNote = defaultFolderForAutomaticCaseNote;
	}

	public Integer getPullCaseNotesRequestsOffset() {
		return pullCaseNotesRequestsOffset;
	}
	public void setPullCaseNotesRequestsOffset(Integer pullCaseNotesRequestsOffset) {
		this.pullCaseNotesRequestsOffset = pullCaseNotesRequestsOffset;
	}

	public ims.core.resource.place.domain.objects.Location getDefaultCaseNoteFolderLocation() {
		return defaultCaseNoteFolderLocation;
	}
	public void setDefaultCaseNoteFolderLocation(ims.core.resource.place.domain.objects.Location defaultCaseNoteFolderLocation) {
		this.defaultCaseNoteFolderLocation = defaultCaseNoteFolderLocation;
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
		
		auditStr.append("\r\n*requestsOlderThan* :");
		auditStr.append(requestsOlderThan);
	    auditStr.append("; ");
		auditStr.append("\r\n*caseNoteRequestOffset* :");
		auditStr.append(caseNoteRequestOffset);
	    auditStr.append("; ");
		auditStr.append("\r\n*trackingIdNoOfDigits* :");
		auditStr.append(trackingIdNoOfDigits);
	    auditStr.append("; ");
		auditStr.append("\r\n*automaticBatchPrintTime* :");
		auditStr.append(automaticBatchPrintTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*automaticBatchPrintDaysAhead* :");
		auditStr.append(automaticBatchPrintDaysAhead);
	    auditStr.append("; ");
		auditStr.append("\r\n*defaultFolderForAutomaticCaseNote* :");
		if (defaultFolderForAutomaticCaseNote != null)
			auditStr.append(defaultFolderForAutomaticCaseNote.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*pullCaseNotesRequestsOffset* :");
		auditStr.append(pullCaseNotesRequestsOffset);
	    auditStr.append("; ");
		auditStr.append("\r\n*defaultCaseNoteFolderLocation* :");
		if (defaultCaseNoteFolderLocation != null)
		{
			auditStr.append(toShortClassName(defaultCaseNoteFolderLocation));
				
		    auditStr.append(defaultCaseNoteFolderLocation.getId());
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
		
		String keyClassName = "CaseNoteTrackingConfig";
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
		if (this.getRequestsOlderThan() != null)
		{
			sb.append("<requestsOlderThan>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRequestsOlderThan().toString()));
			sb.append("</requestsOlderThan>");		
		}
		if (this.getCaseNoteRequestOffset() != null)
		{
			sb.append("<caseNoteRequestOffset>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCaseNoteRequestOffset().toString()));
			sb.append("</caseNoteRequestOffset>");		
		}
		if (this.getTrackingIdNoOfDigits() != null)
		{
			sb.append("<trackingIdNoOfDigits>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTrackingIdNoOfDigits().toString()));
			sb.append("</trackingIdNoOfDigits>");		
		}
		if (this.getAutomaticBatchPrintTime() != null)
		{
			sb.append("<automaticBatchPrintTime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAutomaticBatchPrintTime().toString()));
			sb.append("</automaticBatchPrintTime>");		
		}
		if (this.getAutomaticBatchPrintDaysAhead() != null)
		{
			sb.append("<automaticBatchPrintDaysAhead>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAutomaticBatchPrintDaysAhead().toString()));
			sb.append("</automaticBatchPrintDaysAhead>");		
		}
		if (this.getDefaultFolderForAutomaticCaseNote() != null)
		{
			sb.append("<defaultFolderForAutomaticCaseNote>");
			sb.append(this.getDefaultFolderForAutomaticCaseNote().toXMLString()); 
			sb.append("</defaultFolderForAutomaticCaseNote>");		
		}
		if (this.getPullCaseNotesRequestsOffset() != null)
		{
			sb.append("<pullCaseNotesRequestsOffset>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPullCaseNotesRequestsOffset().toString()));
			sb.append("</pullCaseNotesRequestsOffset>");		
		}
		if (this.getDefaultCaseNoteFolderLocation() != null)
		{
			sb.append("<defaultCaseNoteFolderLocation>");
			sb.append(this.getDefaultCaseNoteFolderLocation().toXMLString(domMap)); 	
			sb.append("</defaultCaseNoteFolderLocation>");		
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
			CaseNoteTrackingConfig domainObject = getCaseNoteTrackingConfigfromXML(itemEl, factory, domMap);

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
			CaseNoteTrackingConfig domainObject = getCaseNoteTrackingConfigfromXML(itemEl, factory, domMap);

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
		
	public static CaseNoteTrackingConfig getCaseNoteTrackingConfigfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getCaseNoteTrackingConfigfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static CaseNoteTrackingConfig getCaseNoteTrackingConfigfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!CaseNoteTrackingConfig.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!CaseNoteTrackingConfig.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the CaseNoteTrackingConfig class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (CaseNoteTrackingConfig)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(CaseNoteTrackingConfig.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		CaseNoteTrackingConfig ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (CaseNoteTrackingConfig)factory.getImportedDomainObject(CaseNoteTrackingConfig.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new CaseNoteTrackingConfig();
		}
		String keyClassName = "CaseNoteTrackingConfig";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (CaseNoteTrackingConfig)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, CaseNoteTrackingConfig obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("requestsOlderThan");
		if(fldEl != null)
		{	
    		obj.setRequestsOlderThan(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("caseNoteRequestOffset");
		if(fldEl != null)
		{	
    		obj.setCaseNoteRequestOffset(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("trackingIdNoOfDigits");
		if(fldEl != null)
		{	
    		obj.setTrackingIdNoOfDigits(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("automaticBatchPrintTime");
		if(fldEl != null)
		{	
    		obj.setAutomaticBatchPrintTime(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("automaticBatchPrintDaysAhead");
		if(fldEl != null)
		{	
    		obj.setAutomaticBatchPrintDaysAhead(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("defaultFolderForAutomaticCaseNote");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDefaultFolderForAutomaticCaseNote(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("pullCaseNotesRequestsOffset");
		if(fldEl != null)
		{	
    		obj.setPullCaseNotesRequestsOffset(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("defaultCaseNoteFolderLocation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setDefaultCaseNoteFolderLocation(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
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
		public static final String RequestsOlderThan = "requestsOlderThan";
		public static final String CaseNoteRequestOffset = "caseNoteRequestOffset";
		public static final String TrackingIdNoOfDigits = "trackingIdNoOfDigits";
		public static final String AutomaticBatchPrintTime = "automaticBatchPrintTime";
		public static final String AutomaticBatchPrintDaysAhead = "automaticBatchPrintDaysAhead";
		public static final String DefaultFolderForAutomaticCaseNote = "defaultFolderForAutomaticCaseNote";
		public static final String PullCaseNotesRequestsOffset = "pullCaseNotesRequestsOffset";
		public static final String DefaultCaseNoteFolderLocation = "defaultCaseNoteFolderLocation";
	}
}

