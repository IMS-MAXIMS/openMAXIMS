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


public class FunctionalTransfersTechnique extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1019100030;
	private static final long serialVersionUID = 1019100030L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Start Position */
	private ims.domain.lookups.LookupInstance startPosition;
	/** Start Height (cms) */
	private Integer startHeight;
	/** Start Target (cms) */
	private Integer startTarget;
	/** Finish Position */
	private ims.domain.lookups.LookupInstance finishPosition;
	/** Finish Height (cms) */
	private Integer finishHeight;
	/** Finish Target (cms) */
	private Integer finishTarget;
	/** FIM Score */
	private Integer fIMScore;
	/** Risk */
	private ims.domain.lookups.LookupInstance risk;
	/** Equipment Used
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List equipment;
	/** Technique Used
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List technique;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public FunctionalTransfersTechnique (Integer id, int ver)
    {
    	super(id, ver);
    }
    public FunctionalTransfersTechnique ()
    {
    	super();
    }
    public FunctionalTransfersTechnique (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.therapies.treatment.domain.objects.FunctionalTransfersTechnique.class;
	}


	public ims.domain.lookups.LookupInstance getStartPosition() {
		return startPosition;
	}
	public void setStartPosition(ims.domain.lookups.LookupInstance startPosition) {
		this.startPosition = startPosition;
	}

	public Integer getStartHeight() {
		return startHeight;
	}
	public void setStartHeight(Integer startHeight) {
		this.startHeight = startHeight;
	}

	public Integer getStartTarget() {
		return startTarget;
	}
	public void setStartTarget(Integer startTarget) {
		this.startTarget = startTarget;
	}

	public ims.domain.lookups.LookupInstance getFinishPosition() {
		return finishPosition;
	}
	public void setFinishPosition(ims.domain.lookups.LookupInstance finishPosition) {
		this.finishPosition = finishPosition;
	}

	public Integer getFinishHeight() {
		return finishHeight;
	}
	public void setFinishHeight(Integer finishHeight) {
		this.finishHeight = finishHeight;
	}

	public Integer getFinishTarget() {
		return finishTarget;
	}
	public void setFinishTarget(Integer finishTarget) {
		this.finishTarget = finishTarget;
	}

	public Integer getFIMScore() {
		return fIMScore;
	}
	public void setFIMScore(Integer fIMScore) {
		this.fIMScore = fIMScore;
	}

	public ims.domain.lookups.LookupInstance getRisk() {
		return risk;
	}
	public void setRisk(ims.domain.lookups.LookupInstance risk) {
		this.risk = risk;
	}

	public java.util.List getEquipment() {
		if ( null == equipment ) {
			equipment = new java.util.ArrayList();
		}
		return equipment;
	}
	public void setEquipment(java.util.List paramValue) {
		this.equipment = paramValue;
	}

	public java.util.List getTechnique() {
		if ( null == technique ) {
			technique = new java.util.ArrayList();
		}
		return technique;
	}
	public void setTechnique(java.util.List paramValue) {
		this.technique = paramValue;
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
		
		auditStr.append("\r\n*startPosition* :");
		if (startPosition != null)
			auditStr.append(startPosition.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*startHeight* :");
		auditStr.append(startHeight);
	    auditStr.append("; ");
		auditStr.append("\r\n*startTarget* :");
		auditStr.append(startTarget);
	    auditStr.append("; ");
		auditStr.append("\r\n*finishPosition* :");
		if (finishPosition != null)
			auditStr.append(finishPosition.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*finishHeight* :");
		auditStr.append(finishHeight);
	    auditStr.append("; ");
		auditStr.append("\r\n*finishTarget* :");
		auditStr.append(finishTarget);
	    auditStr.append("; ");
		auditStr.append("\r\n*fIMScore* :");
		auditStr.append(fIMScore);
	    auditStr.append("; ");
		auditStr.append("\r\n*risk* :");
		if (risk != null)
			auditStr.append(risk.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*equipment* :");
		if (equipment != null)
		{
			java.util.Iterator it9 = equipment.iterator();
			int i9=0;
			while (it9.hasNext())
			{
				if (i9 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it9.next();
			auditStr.append(obj.getText());
			i9++;
		}
		if (i9 > 0)
			auditStr.append("] " + i9);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*technique* :");
		if (technique != null)
		{
			java.util.Iterator it10 = technique.iterator();
			int i10=0;
			while (it10.hasNext())
			{
				if (i10 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it10.next();
			auditStr.append(obj.getText());
			i10++;
		}
		if (i10 > 0)
			auditStr.append("] " + i10);
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
		
		String keyClassName = "FunctionalTransfersTechnique";
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
		if (this.getStartPosition() != null)
		{
			sb.append("<startPosition>");
			sb.append(this.getStartPosition().toXMLString()); 
			sb.append("</startPosition>");		
		}
		if (this.getStartHeight() != null)
		{
			sb.append("<startHeight>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getStartHeight().toString()));
			sb.append("</startHeight>");		
		}
		if (this.getStartTarget() != null)
		{
			sb.append("<startTarget>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getStartTarget().toString()));
			sb.append("</startTarget>");		
		}
		if (this.getFinishPosition() != null)
		{
			sb.append("<finishPosition>");
			sb.append(this.getFinishPosition().toXMLString()); 
			sb.append("</finishPosition>");		
		}
		if (this.getFinishHeight() != null)
		{
			sb.append("<finishHeight>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFinishHeight().toString()));
			sb.append("</finishHeight>");		
		}
		if (this.getFinishTarget() != null)
		{
			sb.append("<finishTarget>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFinishTarget().toString()));
			sb.append("</finishTarget>");		
		}
		if (this.getFIMScore() != null)
		{
			sb.append("<fIMScore>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFIMScore().toString()));
			sb.append("</fIMScore>");		
		}
		if (this.getRisk() != null)
		{
			sb.append("<risk>");
			sb.append(this.getRisk().toXMLString()); 
			sb.append("</risk>");		
		}
		if (this.getEquipment() != null)
		{
			if (this.getEquipment().size() > 0 )
			{
			sb.append("<equipment>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getEquipment())); 
			sb.append("</equipment>");		
			}
		}
		if (this.getTechnique() != null)
		{
			if (this.getTechnique().size() > 0 )
			{
			sb.append("<technique>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getTechnique())); 
			sb.append("</technique>");		
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
			FunctionalTransfersTechnique domainObject = getFunctionalTransfersTechniquefromXML(itemEl, factory, domMap);

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
			FunctionalTransfersTechnique domainObject = getFunctionalTransfersTechniquefromXML(itemEl, factory, domMap);

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
		
	public static FunctionalTransfersTechnique getFunctionalTransfersTechniquefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getFunctionalTransfersTechniquefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static FunctionalTransfersTechnique getFunctionalTransfersTechniquefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!FunctionalTransfersTechnique.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!FunctionalTransfersTechnique.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the FunctionalTransfersTechnique class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (FunctionalTransfersTechnique)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(FunctionalTransfersTechnique.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		FunctionalTransfersTechnique ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (FunctionalTransfersTechnique)factory.getImportedDomainObject(FunctionalTransfersTechnique.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new FunctionalTransfersTechnique();
		}
		String keyClassName = "FunctionalTransfersTechnique";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (FunctionalTransfersTechnique)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, FunctionalTransfersTechnique obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("startPosition");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setStartPosition(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("startHeight");
		if(fldEl != null)
		{	
    		obj.setStartHeight(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("startTarget");
		if(fldEl != null)
		{	
    		obj.setStartTarget(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("finishPosition");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setFinishPosition(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("finishHeight");
		if(fldEl != null)
		{	
    		obj.setFinishHeight(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("finishTarget");
		if(fldEl != null)
		{	
    		obj.setFinishTarget(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("fIMScore");
		if(fldEl != null)
		{	
    		obj.setFIMScore(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("risk");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRisk(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("equipment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setEquipment(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getEquipment())); 
		}
		fldEl = el.element("technique");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setTechnique(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getTechnique())); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "equipment"
		, "technique"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String StartPosition = "startPosition";
		public static final String StartHeight = "startHeight";
		public static final String StartTarget = "startTarget";
		public static final String FinishPosition = "finishPosition";
		public static final String FinishHeight = "finishHeight";
		public static final String FinishTarget = "finishTarget";
		public static final String FIMScore = "fIMScore";
		public static final String Risk = "risk";
		public static final String Equipment = "equipment";
		public static final String Technique = "technique";
	}
}

