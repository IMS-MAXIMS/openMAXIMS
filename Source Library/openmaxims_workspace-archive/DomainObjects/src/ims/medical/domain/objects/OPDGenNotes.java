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
package ims.medical.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class OPDGenNotes extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1023100025;
	private static final long serialVersionUID = 1023100025L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** CareContext */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** AutonomicDysreflexia */
	private ims.domain.lookups.LookupInstance autonomicDysreflexia;
	/** ModAshworth */
	private String modAshworth;
	/** SpasType */
	private String spasType;
	/** PainScale */
	private String painScale;
	/** GenNotes */
	private String genNotes;
	/** EvidenceSyringomyelia */
	private String evidenceSyringomyelia;
	/** PlanAction */
	private String planAction;
	/** OPDNext */
	private Integer oPDNext;
	/** OpdNextUnits */
	private ims.domain.lookups.LookupInstance opdNextUnits;
	/** Authoring Information */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public OPDGenNotes (Integer id, int ver)
    {
    	super(id, ver);
    }
    public OPDGenNotes ()
    {
    	super();
    }
    public OPDGenNotes (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.medical.domain.objects.OPDGenNotes.class;
	}


	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.domain.lookups.LookupInstance getAutonomicDysreflexia() {
		return autonomicDysreflexia;
	}
	public void setAutonomicDysreflexia(ims.domain.lookups.LookupInstance autonomicDysreflexia) {
		this.autonomicDysreflexia = autonomicDysreflexia;
	}

	public String getModAshworth() {
		return modAshworth;
	}
	public void setModAshworth(String modAshworth) {
		if ( null != modAshworth && modAshworth.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for modAshworth. Tried to set value: "+
				modAshworth);
		}
		this.modAshworth = modAshworth;
	}

	public String getSpasType() {
		return spasType;
	}
	public void setSpasType(String spasType) {
		this.spasType = spasType;
	}

	public String getPainScale() {
		return painScale;
	}
	public void setPainScale(String painScale) {
		if ( null != painScale && painScale.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for painScale. Tried to set value: "+
				painScale);
		}
		this.painScale = painScale;
	}

	public String getGenNotes() {
		return genNotes;
	}
	public void setGenNotes(String genNotes) {
		if ( null != genNotes && genNotes.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for genNotes. Tried to set value: "+
				genNotes);
		}
		this.genNotes = genNotes;
	}

	public String getEvidenceSyringomyelia() {
		return evidenceSyringomyelia;
	}
	public void setEvidenceSyringomyelia(String evidenceSyringomyelia) {
		if ( null != evidenceSyringomyelia && evidenceSyringomyelia.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for evidenceSyringomyelia. Tried to set value: "+
				evidenceSyringomyelia);
		}
		this.evidenceSyringomyelia = evidenceSyringomyelia;
	}

	public String getPlanAction() {
		return planAction;
	}
	public void setPlanAction(String planAction) {
		if ( null != planAction && planAction.length() > 2000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for planAction. Tried to set value: "+
				planAction);
		}
		this.planAction = planAction;
	}

	public Integer getOPDNext() {
		return oPDNext;
	}
	public void setOPDNext(Integer oPDNext) {
		this.oPDNext = oPDNext;
	}

	public ims.domain.lookups.LookupInstance getOpdNextUnits() {
		return opdNextUnits;
	}
	public void setOpdNextUnits(ims.domain.lookups.LookupInstance opdNextUnits) {
		this.opdNextUnits = opdNextUnits;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
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
		
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*autonomicDysreflexia* :");
		if (autonomicDysreflexia != null)
			auditStr.append(autonomicDysreflexia.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*modAshworth* :");
		auditStr.append(modAshworth);
	    auditStr.append("; ");
		auditStr.append("\r\n*spasType* :");
		auditStr.append(spasType);
	    auditStr.append("; ");
		auditStr.append("\r\n*painScale* :");
		auditStr.append(painScale);
	    auditStr.append("; ");
		auditStr.append("\r\n*genNotes* :");
		auditStr.append(genNotes);
	    auditStr.append("; ");
		auditStr.append("\r\n*evidenceSyringomyelia* :");
		auditStr.append(evidenceSyringomyelia);
	    auditStr.append("; ");
		auditStr.append("\r\n*planAction* :");
		auditStr.append(planAction);
	    auditStr.append("; ");
		auditStr.append("\r\n*oPDNext* :");
		auditStr.append(oPDNext);
	    auditStr.append("; ");
		auditStr.append("\r\n*opdNextUnits* :");
		if (opdNextUnits != null)
			auditStr.append(opdNextUnits.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
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
		
		String keyClassName = "OPDGenNotes";
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
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getAutonomicDysreflexia() != null)
		{
			sb.append("<autonomicDysreflexia>");
			sb.append(this.getAutonomicDysreflexia().toXMLString()); 
			sb.append("</autonomicDysreflexia>");		
		}
		if (this.getModAshworth() != null)
		{
			sb.append("<modAshworth>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getModAshworth().toString()));
			sb.append("</modAshworth>");		
		}
		if (this.getSpasType() != null)
		{
			sb.append("<spasType>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSpasType().toString()));
			sb.append("</spasType>");		
		}
		if (this.getPainScale() != null)
		{
			sb.append("<painScale>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPainScale().toString()));
			sb.append("</painScale>");		
		}
		if (this.getGenNotes() != null)
		{
			sb.append("<genNotes>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getGenNotes().toString()));
			sb.append("</genNotes>");		
		}
		if (this.getEvidenceSyringomyelia() != null)
		{
			sb.append("<evidenceSyringomyelia>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getEvidenceSyringomyelia().toString()));
			sb.append("</evidenceSyringomyelia>");		
		}
		if (this.getPlanAction() != null)
		{
			sb.append("<planAction>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPlanAction().toString()));
			sb.append("</planAction>");		
		}
		if (this.getOPDNext() != null)
		{
			sb.append("<oPDNext>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOPDNext().toString()));
			sb.append("</oPDNext>");		
		}
		if (this.getOpdNextUnits() != null)
		{
			sb.append("<opdNextUnits>");
			sb.append(this.getOpdNextUnits().toXMLString()); 
			sb.append("</opdNextUnits>");		
		}
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
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
			OPDGenNotes domainObject = getOPDGenNotesfromXML(itemEl, factory, domMap);

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
			OPDGenNotes domainObject = getOPDGenNotesfromXML(itemEl, factory, domMap);

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
		
	public static OPDGenNotes getOPDGenNotesfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getOPDGenNotesfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static OPDGenNotes getOPDGenNotesfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!OPDGenNotes.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!OPDGenNotes.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the OPDGenNotes class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (OPDGenNotes)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(OPDGenNotes.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		OPDGenNotes ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (OPDGenNotes)factory.getImportedDomainObject(OPDGenNotes.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new OPDGenNotes();
		}
		String keyClassName = "OPDGenNotes";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (OPDGenNotes)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, OPDGenNotes obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("autonomicDysreflexia");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAutonomicDysreflexia(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("modAshworth");
		if(fldEl != null)
		{	
    		obj.setModAshworth(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("spasType");
		if(fldEl != null)
		{	
    		obj.setSpasType(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("painScale");
		if(fldEl != null)
		{	
    		obj.setPainScale(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("genNotes");
		if(fldEl != null)
		{	
    		obj.setGenNotes(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("evidenceSyringomyelia");
		if(fldEl != null)
		{	
    		obj.setEvidenceSyringomyelia(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("planAction");
		if(fldEl != null)
		{	
    		obj.setPlanAction(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("oPDNext");
		if(fldEl != null)
		{	
    		obj.setOPDNext(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("opdNextUnits");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOpdNextUnits(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
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
		public static final String CareContext = "careContext";
		public static final String AutonomicDysreflexia = "autonomicDysreflexia";
		public static final String ModAshworth = "modAshworth";
		public static final String SpasType = "spasType";
		public static final String PainScale = "painScale";
		public static final String GenNotes = "genNotes";
		public static final String EvidenceSyringomyelia = "evidenceSyringomyelia";
		public static final String PlanAction = "planAction";
		public static final String OPDNext = "oPDNext";
		public static final String OpdNextUnits = "opdNextUnits";
		public static final String AuthoringInformation = "authoringInformation";
	}
}

