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
package ims.core.clinical.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class DementiaFind extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1003100118;
	private static final long serialVersionUID = 1003100118L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** AuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** Does the patient have a formal diagnosis of Demenia */
	private ims.domain.lookups.LookupInstance hasFormalDiagnosisOfDementia;
	/** CAMS Acute Onset */
	private ims.domain.lookups.LookupInstance cAMSAcuteOnset;
	/** CAMS Inattention */
	private ims.domain.lookups.LookupInstance cAMSInattention;
	/** CAMS Disorganised Thinking */
	private ims.domain.lookups.LookupInstance cAMSDisorganisedThinking;
	/** CAMS Altered Level */
	private ims.domain.lookups.LookupInstance cAMSAlteredLevel;
	/** Delirium Confirmed */
	private ims.domain.lookups.LookupInstance deliriumConfirmed;
	/** Awareness Question */
	private ims.domain.lookups.LookupInstance awarenessQuestion;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public DementiaFind (Integer id, int ver)
    {
    	super(id, ver);
    }
    public DementiaFind ()
    {
    	super();
    }
    public DementiaFind (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.DementiaFind.class;
	}


	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
	}

	public ims.domain.lookups.LookupInstance getHasFormalDiagnosisOfDementia() {
		return hasFormalDiagnosisOfDementia;
	}
	public void setHasFormalDiagnosisOfDementia(ims.domain.lookups.LookupInstance hasFormalDiagnosisOfDementia) {
		this.hasFormalDiagnosisOfDementia = hasFormalDiagnosisOfDementia;
	}

	public ims.domain.lookups.LookupInstance getCAMSAcuteOnset() {
		return cAMSAcuteOnset;
	}
	public void setCAMSAcuteOnset(ims.domain.lookups.LookupInstance cAMSAcuteOnset) {
		this.cAMSAcuteOnset = cAMSAcuteOnset;
	}

	public ims.domain.lookups.LookupInstance getCAMSInattention() {
		return cAMSInattention;
	}
	public void setCAMSInattention(ims.domain.lookups.LookupInstance cAMSInattention) {
		this.cAMSInattention = cAMSInattention;
	}

	public ims.domain.lookups.LookupInstance getCAMSDisorganisedThinking() {
		return cAMSDisorganisedThinking;
	}
	public void setCAMSDisorganisedThinking(ims.domain.lookups.LookupInstance cAMSDisorganisedThinking) {
		this.cAMSDisorganisedThinking = cAMSDisorganisedThinking;
	}

	public ims.domain.lookups.LookupInstance getCAMSAlteredLevel() {
		return cAMSAlteredLevel;
	}
	public void setCAMSAlteredLevel(ims.domain.lookups.LookupInstance cAMSAlteredLevel) {
		this.cAMSAlteredLevel = cAMSAlteredLevel;
	}

	public ims.domain.lookups.LookupInstance getDeliriumConfirmed() {
		return deliriumConfirmed;
	}
	public void setDeliriumConfirmed(ims.domain.lookups.LookupInstance deliriumConfirmed) {
		this.deliriumConfirmed = deliriumConfirmed;
	}

	public ims.domain.lookups.LookupInstance getAwarenessQuestion() {
		return awarenessQuestion;
	}
	public void setAwarenessQuestion(ims.domain.lookups.LookupInstance awarenessQuestion) {
		this.awarenessQuestion = awarenessQuestion;
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
		
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*hasFormalDiagnosisOfDementia* :");
		if (hasFormalDiagnosisOfDementia != null)
			auditStr.append(hasFormalDiagnosisOfDementia.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*cAMSAcuteOnset* :");
		if (cAMSAcuteOnset != null)
			auditStr.append(cAMSAcuteOnset.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*cAMSInattention* :");
		if (cAMSInattention != null)
			auditStr.append(cAMSInattention.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*cAMSDisorganisedThinking* :");
		if (cAMSDisorganisedThinking != null)
			auditStr.append(cAMSDisorganisedThinking.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*cAMSAlteredLevel* :");
		if (cAMSAlteredLevel != null)
			auditStr.append(cAMSAlteredLevel.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*deliriumConfirmed* :");
		if (deliriumConfirmed != null)
			auditStr.append(deliriumConfirmed.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*awarenessQuestion* :");
		if (awarenessQuestion != null)
			auditStr.append(awarenessQuestion.getText());
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
		
		String keyClassName = "DementiaFind";
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
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
		}
		if (this.getHasFormalDiagnosisOfDementia() != null)
		{
			sb.append("<hasFormalDiagnosisOfDementia>");
			sb.append(this.getHasFormalDiagnosisOfDementia().toXMLString()); 
			sb.append("</hasFormalDiagnosisOfDementia>");		
		}
		if (this.getCAMSAcuteOnset() != null)
		{
			sb.append("<cAMSAcuteOnset>");
			sb.append(this.getCAMSAcuteOnset().toXMLString()); 
			sb.append("</cAMSAcuteOnset>");		
		}
		if (this.getCAMSInattention() != null)
		{
			sb.append("<cAMSInattention>");
			sb.append(this.getCAMSInattention().toXMLString()); 
			sb.append("</cAMSInattention>");		
		}
		if (this.getCAMSDisorganisedThinking() != null)
		{
			sb.append("<cAMSDisorganisedThinking>");
			sb.append(this.getCAMSDisorganisedThinking().toXMLString()); 
			sb.append("</cAMSDisorganisedThinking>");		
		}
		if (this.getCAMSAlteredLevel() != null)
		{
			sb.append("<cAMSAlteredLevel>");
			sb.append(this.getCAMSAlteredLevel().toXMLString()); 
			sb.append("</cAMSAlteredLevel>");		
		}
		if (this.getDeliriumConfirmed() != null)
		{
			sb.append("<deliriumConfirmed>");
			sb.append(this.getDeliriumConfirmed().toXMLString()); 
			sb.append("</deliriumConfirmed>");		
		}
		if (this.getAwarenessQuestion() != null)
		{
			sb.append("<awarenessQuestion>");
			sb.append(this.getAwarenessQuestion().toXMLString()); 
			sb.append("</awarenessQuestion>");		
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
			DementiaFind domainObject = getDementiaFindfromXML(itemEl, factory, domMap);

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
			DementiaFind domainObject = getDementiaFindfromXML(itemEl, factory, domMap);

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
		
	public static DementiaFind getDementiaFindfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getDementiaFindfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static DementiaFind getDementiaFindfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!DementiaFind.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!DementiaFind.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the DementiaFind class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (DementiaFind)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(DementiaFind.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		DementiaFind ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (DementiaFind)factory.getImportedDomainObject(DementiaFind.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new DementiaFind();
		}
		String keyClassName = "DementiaFind";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (DementiaFind)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, DementiaFind obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("hasFormalDiagnosisOfDementia");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setHasFormalDiagnosisOfDementia(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("cAMSAcuteOnset");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCAMSAcuteOnset(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("cAMSInattention");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCAMSInattention(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("cAMSDisorganisedThinking");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCAMSDisorganisedThinking(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("cAMSAlteredLevel");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCAMSAlteredLevel(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("deliriumConfirmed");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDeliriumConfirmed(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("awarenessQuestion");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAwarenessQuestion(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		public static final String AuthoringInformation = "authoringInformation";
		public static final String HasFormalDiagnosisOfDementia = "hasFormalDiagnosisOfDementia";
		public static final String CAMSAcuteOnset = "cAMSAcuteOnset";
		public static final String CAMSInattention = "cAMSInattention";
		public static final String CAMSDisorganisedThinking = "cAMSDisorganisedThinking";
		public static final String CAMSAlteredLevel = "cAMSAlteredLevel";
		public static final String DeliriumConfirmed = "deliriumConfirmed";
		public static final String AwarenessQuestion = "awarenessQuestion";
	}
}

