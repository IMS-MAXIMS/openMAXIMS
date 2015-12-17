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
package ims.coe.assessment.domain.objects;

/**
 * 
 * @author Sinead McDermott
 * Generated.
 */


public class CommunicationSpeechAndLanguage extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1012100014;
	private static final long serialVersionUID = 1012100014L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private ims.domain.lookups.LookupInstance speechLanguageDifficulty;
	private ims.domain.lookups.LookupInstance spokenLanguage;
	/** 
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List communicates;
	/** 
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List verbally;
	/** 
	  * Collection of ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguageUnderstanding.
	  */
	private java.util.Set speechAndLanguageUnderstanding;
    public CommunicationSpeechAndLanguage (Integer id, int ver)
    {
    	super(id, ver);
    }
    public CommunicationSpeechAndLanguage ()
    {
    	super();
    }
    public CommunicationSpeechAndLanguage (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguage.class;
	}


	public ims.domain.lookups.LookupInstance getSpeechLanguageDifficulty() {
		return speechLanguageDifficulty;
	}
	public void setSpeechLanguageDifficulty(ims.domain.lookups.LookupInstance speechLanguageDifficulty) {
		this.speechLanguageDifficulty = speechLanguageDifficulty;
	}

	public ims.domain.lookups.LookupInstance getSpokenLanguage() {
		return spokenLanguage;
	}
	public void setSpokenLanguage(ims.domain.lookups.LookupInstance spokenLanguage) {
		this.spokenLanguage = spokenLanguage;
	}

	public java.util.List getCommunicates() {
		if ( null == communicates ) {
			communicates = new java.util.ArrayList();
		}
		return communicates;
	}
	public void setCommunicates(java.util.List paramValue) {
		this.communicates = paramValue;
	}

	public java.util.List getVerbally() {
		if ( null == verbally ) {
			verbally = new java.util.ArrayList();
		}
		return verbally;
	}
	public void setVerbally(java.util.List paramValue) {
		this.verbally = paramValue;
	}

	public java.util.Set getSpeechAndLanguageUnderstanding() {
		if ( null == speechAndLanguageUnderstanding ) {
			speechAndLanguageUnderstanding = new java.util.HashSet();
		}
		return speechAndLanguageUnderstanding;
	}
	public void setSpeechAndLanguageUnderstanding(java.util.Set paramValue) {
		this.speechAndLanguageUnderstanding = paramValue;
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
		
		auditStr.append("\r\n*speechLanguageDifficulty* :");
		if (speechLanguageDifficulty != null)
			auditStr.append(speechLanguageDifficulty.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*spokenLanguage* :");
		if (spokenLanguage != null)
			auditStr.append(spokenLanguage.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*communicates* :");
		if (communicates != null)
		{
			java.util.Iterator it3 = communicates.iterator();
			int i3=0;
			while (it3.hasNext())
			{
				if (i3 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it3.next();
			auditStr.append(obj.getText());
			i3++;
		}
		if (i3 > 0)
			auditStr.append("] " + i3);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*verbally* :");
		if (verbally != null)
		{
			java.util.Iterator it4 = verbally.iterator();
			int i4=0;
			while (it4.hasNext())
			{
				if (i4 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it4.next();
			auditStr.append(obj.getText());
			i4++;
		}
		if (i4 > 0)
			auditStr.append("] " + i4);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*speechAndLanguageUnderstanding* :");
		if (speechAndLanguageUnderstanding != null)
		{
			java.util.Iterator it5 = speechAndLanguageUnderstanding.iterator();
			int i5=0;
			while (it5.hasNext())
			{
				if (i5 > 0)
					auditStr.append(",");
				ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguageUnderstanding obj = (ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguageUnderstanding)it5.next();
		if (obj != null)
		{
		   if (i5 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i5++;
		}
		if (i5 > 0)
			auditStr.append("] " + i5);
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
		
		String keyClassName = "CommunicationSpeechAndLanguage";
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
		if (this.getSpeechLanguageDifficulty() != null)
		{
			sb.append("<speechLanguageDifficulty>");
			sb.append(this.getSpeechLanguageDifficulty().toXMLString()); 
			sb.append("</speechLanguageDifficulty>");		
		}
		if (this.getSpokenLanguage() != null)
		{
			sb.append("<spokenLanguage>");
			sb.append(this.getSpokenLanguage().toXMLString()); 
			sb.append("</spokenLanguage>");		
		}
		if (this.getCommunicates() != null)
		{
			if (this.getCommunicates().size() > 0 )
			{
			sb.append("<communicates>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getCommunicates())); 
			sb.append("</communicates>");		
			}
		}
		if (this.getVerbally() != null)
		{
			if (this.getVerbally().size() > 0 )
			{
			sb.append("<verbally>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getVerbally())); 
			sb.append("</verbally>");		
			}
		}
		if (this.getSpeechAndLanguageUnderstanding() != null)
		{
			if (this.getSpeechAndLanguageUnderstanding().size() > 0 )
			{
			sb.append("<speechAndLanguageUnderstanding>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getSpeechAndLanguageUnderstanding(), domMap));
			sb.append("</speechAndLanguageUnderstanding>");		
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
			CommunicationSpeechAndLanguage domainObject = getCommunicationSpeechAndLanguagefromXML(itemEl, factory, domMap);

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
			CommunicationSpeechAndLanguage domainObject = getCommunicationSpeechAndLanguagefromXML(itemEl, factory, domMap);

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
		
	public static CommunicationSpeechAndLanguage getCommunicationSpeechAndLanguagefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getCommunicationSpeechAndLanguagefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static CommunicationSpeechAndLanguage getCommunicationSpeechAndLanguagefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!CommunicationSpeechAndLanguage.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!CommunicationSpeechAndLanguage.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the CommunicationSpeechAndLanguage class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (CommunicationSpeechAndLanguage)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(CommunicationSpeechAndLanguage.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		CommunicationSpeechAndLanguage ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (CommunicationSpeechAndLanguage)factory.getImportedDomainObject(CommunicationSpeechAndLanguage.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new CommunicationSpeechAndLanguage();
		}
		String keyClassName = "CommunicationSpeechAndLanguage";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (CommunicationSpeechAndLanguage)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, CommunicationSpeechAndLanguage obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("speechLanguageDifficulty");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSpeechLanguageDifficulty(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("spokenLanguage");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSpokenLanguage(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("communicates");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setCommunicates(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getCommunicates())); 
		}
		fldEl = el.element("verbally");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setVerbally(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getVerbally())); 
		}
		fldEl = el.element("speechAndLanguageUnderstanding");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setSpeechAndLanguageUnderstanding(ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguageUnderstanding.fromSetXMLString(fldEl, factory, obj.getSpeechAndLanguageUnderstanding(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "communicates"
		, "verbally"
		, "speechAndLanguageUnderstanding"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String SpeechLanguageDifficulty = "speechLanguageDifficulty";
		public static final String SpokenLanguage = "spokenLanguage";
		public static final String Communicates = "communicates";
		public static final String Verbally = "verbally";
		public static final String SpeechAndLanguageUnderstanding = "speechAndLanguageUnderstanding";
	}
}

