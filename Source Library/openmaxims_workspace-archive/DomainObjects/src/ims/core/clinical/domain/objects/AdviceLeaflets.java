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
 * @author Kevin O'Carroll
 * Generated.
 */


public class AdviceLeaflets extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1024100002;
	private static final long serialVersionUID = 1024100002L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Advice Leaflet Given */
	private ims.domain.lookups.LookupInstance adviceLeaflet;
	/** Template */
	private ims.core.admin.domain.objects.TemplateBo template;
	/** Date Given to Person */
	private java.util.Date dateGiven;
	/** Relation Of Person to Patient */
	private ims.domain.lookups.LookupInstance givenTo;
	/** Text Name of patient */
	private String givenToName;
	/** Advice Leaflet Version */
	private String leafletVersion;
	/** CareContext */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** Authoring CP */
	private ims.core.resource.people.domain.objects.Hcp authoringHCP;
	/** Authoring DateTime */
	private java.util.Date authoringDateTime;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public AdviceLeaflets (Integer id, int ver)
    {
    	super(id, ver);
    }
    public AdviceLeaflets ()
    {
    	super();
    }
    public AdviceLeaflets (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.AdviceLeaflets.class;
	}


	public ims.domain.lookups.LookupInstance getAdviceLeaflet() {
		return adviceLeaflet;
	}
	public void setAdviceLeaflet(ims.domain.lookups.LookupInstance adviceLeaflet) {
		this.adviceLeaflet = adviceLeaflet;
	}

	public ims.core.admin.domain.objects.TemplateBo getTemplate() {
		return template;
	}
	public void setTemplate(ims.core.admin.domain.objects.TemplateBo template) {
		this.template = template;
	}

	public java.util.Date getDateGiven() {
		return dateGiven;
	}
	public void setDateGiven(java.util.Date dateGiven) {
		this.dateGiven = dateGiven;
	}

	public ims.domain.lookups.LookupInstance getGivenTo() {
		return givenTo;
	}
	public void setGivenTo(ims.domain.lookups.LookupInstance givenTo) {
		this.givenTo = givenTo;
	}

	public String getGivenToName() {
		return givenToName;
	}
	public void setGivenToName(String givenToName) {
		if ( null != givenToName && givenToName.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for givenToName. Tried to set value: "+
				givenToName);
		}
		this.givenToName = givenToName;
	}

	public String getLeafletVersion() {
		return leafletVersion;
	}
	public void setLeafletVersion(String leafletVersion) {
		if ( null != leafletVersion && leafletVersion.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for leafletVersion. Tried to set value: "+
				leafletVersion);
		}
		this.leafletVersion = leafletVersion;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.core.resource.people.domain.objects.Hcp getAuthoringHCP() {
		return authoringHCP;
	}
	public void setAuthoringHCP(ims.core.resource.people.domain.objects.Hcp authoringHCP) {
		this.authoringHCP = authoringHCP;
	}

	public java.util.Date getAuthoringDateTime() {
		return authoringDateTime;
	}
	public void setAuthoringDateTime(java.util.Date authoringDateTime) {
		this.authoringDateTime = authoringDateTime;
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
		
		auditStr.append("\r\n*adviceLeaflet* :");
		if (adviceLeaflet != null)
			auditStr.append(adviceLeaflet.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*template* :");
		if (template != null)
		{
			auditStr.append(toShortClassName(template));
				
		    auditStr.append(template.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*dateGiven* :");
		auditStr.append(dateGiven);
	    auditStr.append("; ");
		auditStr.append("\r\n*givenTo* :");
		if (givenTo != null)
			auditStr.append(givenTo.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*givenToName* :");
		auditStr.append(givenToName);
	    auditStr.append("; ");
		auditStr.append("\r\n*leafletVersion* :");
		auditStr.append(leafletVersion);
	    auditStr.append("; ");
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringHCP* :");
		if (authoringHCP != null)
		{
			auditStr.append(toShortClassName(authoringHCP));
				
		    auditStr.append(authoringHCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringDateTime* :");
		auditStr.append(authoringDateTime);
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
		
		String keyClassName = "AdviceLeaflets";
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
		if (this.getAdviceLeaflet() != null)
		{
			sb.append("<adviceLeaflet>");
			sb.append(this.getAdviceLeaflet().toXMLString()); 
			sb.append("</adviceLeaflet>");		
		}
		if (this.getTemplate() != null)
		{
			sb.append("<template>");
			sb.append(this.getTemplate().toXMLString(domMap)); 	
			sb.append("</template>");		
		}
		if (this.getDateGiven() != null)
		{
			sb.append("<dateGiven>");
			sb.append(new ims.framework.utils.DateTime(this.getDateGiven()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateGiven>");		
		}
		if (this.getGivenTo() != null)
		{
			sb.append("<givenTo>");
			sb.append(this.getGivenTo().toXMLString()); 
			sb.append("</givenTo>");		
		}
		if (this.getGivenToName() != null)
		{
			sb.append("<givenToName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getGivenToName().toString()));
			sb.append("</givenToName>");		
		}
		if (this.getLeafletVersion() != null)
		{
			sb.append("<leafletVersion>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLeafletVersion().toString()));
			sb.append("</leafletVersion>");		
		}
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getAuthoringHCP() != null)
		{
			sb.append("<authoringHCP>");
			sb.append(this.getAuthoringHCP().toXMLString(domMap)); 	
			sb.append("</authoringHCP>");		
		}
		if (this.getAuthoringDateTime() != null)
		{
			sb.append("<authoringDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getAuthoringDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</authoringDateTime>");		
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
			AdviceLeaflets domainObject = getAdviceLeafletsfromXML(itemEl, factory, domMap);

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
			AdviceLeaflets domainObject = getAdviceLeafletsfromXML(itemEl, factory, domMap);

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
		
	public static AdviceLeaflets getAdviceLeafletsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getAdviceLeafletsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static AdviceLeaflets getAdviceLeafletsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!AdviceLeaflets.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!AdviceLeaflets.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the AdviceLeaflets class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (AdviceLeaflets)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(AdviceLeaflets.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		AdviceLeaflets ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (AdviceLeaflets)factory.getImportedDomainObject(AdviceLeaflets.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new AdviceLeaflets();
		}
		String keyClassName = "AdviceLeaflets";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (AdviceLeaflets)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, AdviceLeaflets obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("adviceLeaflet");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAdviceLeaflet(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("template");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTemplate(ims.core.admin.domain.objects.TemplateBo.getTemplateBofromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("dateGiven");
		if(fldEl != null)
		{	
    		obj.setDateGiven(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("givenTo");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setGivenTo(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("givenToName");
		if(fldEl != null)
		{	
    		obj.setGivenToName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("leafletVersion");
		if(fldEl != null)
		{	
    		obj.setLeafletVersion(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringHCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringDateTime");
		if(fldEl != null)
		{	
    		obj.setAuthoringDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
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
		public static final String AdviceLeaflet = "adviceLeaflet";
		public static final String Template = "template";
		public static final String DateGiven = "dateGiven";
		public static final String GivenTo = "givenTo";
		public static final String GivenToName = "givenToName";
		public static final String LeafletVersion = "leafletVersion";
		public static final String CareContext = "careContext";
		public static final String AuthoringHCP = "authoringHCP";
		public static final String AuthoringDateTime = "authoringDateTime";
	}
}

