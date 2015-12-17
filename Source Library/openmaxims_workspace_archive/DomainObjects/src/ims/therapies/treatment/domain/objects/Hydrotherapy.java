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
 * @author Kevin O'Carroll
 * Generated.
 */


public class Hydrotherapy extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1019100005;
	private static final long serialVersionUID = 1019100005L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Clinical Contact */
	private ims.core.admin.domain.objects.ClinicalContact clinicalContact;
	/** Authoring CP */
	private ims.core.resource.people.domain.objects.Hcp authoringCP;
	/** Authoring DateTime */
	private java.util.Date authoringDateTime;
	/** Level Of Assistance */
	private ims.domain.lookups.LookupInstance levelOfAssistance;
	/** Transfer In */
	private ims.domain.lookups.LookupInstance transferIn;
	/** Transfer Out */
	private ims.domain.lookups.LookupInstance transferOut;
	/** Comment */
	private String comment;
	/** Modalities
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List modalities;
	/** Equipment
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List equipment;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public Hydrotherapy (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Hydrotherapy ()
    {
    	super();
    }
    public Hydrotherapy (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.therapies.treatment.domain.objects.Hydrotherapy.class;
	}


	public ims.core.admin.domain.objects.ClinicalContact getClinicalContact() {
		return clinicalContact;
	}
	public void setClinicalContact(ims.core.admin.domain.objects.ClinicalContact clinicalContact) {
		this.clinicalContact = clinicalContact;
	}

	public ims.core.resource.people.domain.objects.Hcp getAuthoringCP() {
		return authoringCP;
	}
	public void setAuthoringCP(ims.core.resource.people.domain.objects.Hcp authoringCP) {
		this.authoringCP = authoringCP;
	}

	public java.util.Date getAuthoringDateTime() {
		return authoringDateTime;
	}
	public void setAuthoringDateTime(java.util.Date authoringDateTime) {
		this.authoringDateTime = authoringDateTime;
	}

	public ims.domain.lookups.LookupInstance getLevelOfAssistance() {
		return levelOfAssistance;
	}
	public void setLevelOfAssistance(ims.domain.lookups.LookupInstance levelOfAssistance) {
		this.levelOfAssistance = levelOfAssistance;
	}

	public ims.domain.lookups.LookupInstance getTransferIn() {
		return transferIn;
	}
	public void setTransferIn(ims.domain.lookups.LookupInstance transferIn) {
		this.transferIn = transferIn;
	}

	public ims.domain.lookups.LookupInstance getTransferOut() {
		return transferOut;
	}
	public void setTransferOut(ims.domain.lookups.LookupInstance transferOut) {
		this.transferOut = transferOut;
	}

	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		if ( null != comment && comment.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for comment. Tried to set value: "+
				comment);
		}
		this.comment = comment;
	}

	public java.util.List getModalities() {
		if ( null == modalities ) {
			modalities = new java.util.ArrayList();
		}
		return modalities;
	}
	public void setModalities(java.util.List paramValue) {
		this.modalities = paramValue;
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
		
		auditStr.append("\r\n*clinicalContact* :");
		if (clinicalContact != null)
		{
			auditStr.append(toShortClassName(clinicalContact));
				
		    auditStr.append(clinicalContact.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringCP* :");
		if (authoringCP != null)
		{
			auditStr.append(toShortClassName(authoringCP));
				
		    auditStr.append(authoringCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringDateTime* :");
		auditStr.append(authoringDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*levelOfAssistance* :");
		if (levelOfAssistance != null)
			auditStr.append(levelOfAssistance.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*transferIn* :");
		if (transferIn != null)
			auditStr.append(transferIn.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*transferOut* :");
		if (transferOut != null)
			auditStr.append(transferOut.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*comment* :");
		auditStr.append(comment);
	    auditStr.append("; ");
		auditStr.append("\r\n*modalities* :");
		if (modalities != null)
		{
			java.util.Iterator it8 = modalities.iterator();
			int i8=0;
			while (it8.hasNext())
			{
				if (i8 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it8.next();
			auditStr.append(obj.getText());
			i8++;
		}
		if (i8 > 0)
			auditStr.append("] " + i8);
		}
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
		
		String keyClassName = "Hydrotherapy";
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
		if (this.getClinicalContact() != null)
		{
			sb.append("<clinicalContact>");
			sb.append(this.getClinicalContact().toXMLString(domMap)); 	
			sb.append("</clinicalContact>");		
		}
		if (this.getAuthoringCP() != null)
		{
			sb.append("<authoringCP>");
			sb.append(this.getAuthoringCP().toXMLString(domMap)); 	
			sb.append("</authoringCP>");		
		}
		if (this.getAuthoringDateTime() != null)
		{
			sb.append("<authoringDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getAuthoringDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</authoringDateTime>");		
		}
		if (this.getLevelOfAssistance() != null)
		{
			sb.append("<levelOfAssistance>");
			sb.append(this.getLevelOfAssistance().toXMLString()); 
			sb.append("</levelOfAssistance>");		
		}
		if (this.getTransferIn() != null)
		{
			sb.append("<transferIn>");
			sb.append(this.getTransferIn().toXMLString()); 
			sb.append("</transferIn>");		
		}
		if (this.getTransferOut() != null)
		{
			sb.append("<transferOut>");
			sb.append(this.getTransferOut().toXMLString()); 
			sb.append("</transferOut>");		
		}
		if (this.getComment() != null)
		{
			sb.append("<comment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComment().toString()));
			sb.append("</comment>");		
		}
		if (this.getModalities() != null)
		{
			if (this.getModalities().size() > 0 )
			{
			sb.append("<modalities>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getModalities())); 
			sb.append("</modalities>");		
			}
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
			Hydrotherapy domainObject = getHydrotherapyfromXML(itemEl, factory, domMap);

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
			Hydrotherapy domainObject = getHydrotherapyfromXML(itemEl, factory, domMap);

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
		
	public static Hydrotherapy getHydrotherapyfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getHydrotherapyfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Hydrotherapy getHydrotherapyfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Hydrotherapy.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Hydrotherapy.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Hydrotherapy class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Hydrotherapy)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Hydrotherapy.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Hydrotherapy ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Hydrotherapy)factory.getImportedDomainObject(Hydrotherapy.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Hydrotherapy();
		}
		String keyClassName = "Hydrotherapy";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Hydrotherapy)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Hydrotherapy obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("clinicalContact");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClinicalContact(ims.core.admin.domain.objects.ClinicalContact.getClinicalContactfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringDateTime");
		if(fldEl != null)
		{	
    		obj.setAuthoringDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("levelOfAssistance");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setLevelOfAssistance(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("transferIn");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTransferIn(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("transferOut");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTransferOut(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("comment");
		if(fldEl != null)
		{	
    		obj.setComment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("modalities");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setModalities(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getModalities())); 
		}
		fldEl = el.element("equipment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setEquipment(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getEquipment())); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "modalities"
		, "equipment"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String ClinicalContact = "clinicalContact";
		public static final String AuthoringCP = "authoringCP";
		public static final String AuthoringDateTime = "authoringDateTime";
		public static final String LevelOfAssistance = "levelOfAssistance";
		public static final String TransferIn = "transferIn";
		public static final String TransferOut = "transferOut";
		public static final String Comment = "comment";
		public static final String Modalities = "modalities";
		public static final String Equipment = "equipment";
	}
}

