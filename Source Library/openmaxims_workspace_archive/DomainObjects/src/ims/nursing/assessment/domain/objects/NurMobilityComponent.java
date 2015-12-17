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
package ims.nursing.assessment.domain.objects;

/**
 * 
 * @author Sinead McDermott
 * Generated.
 */


public class NurMobilityComponent extends ims.nursing.assessment.domain.objects.AssessmentComponent implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1015100013;
	private static final long serialVersionUID = 1015100013L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Mobility Status
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List mobilityStatus;
	/** Orthoses Used
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List orthosesUsed;
	/** Mobility Aids */
	private ims.domain.lookups.LookupInstance mobilityAids;
	/** Transfers
	  * Collection of ims.nursing.assessment.domain.objects.Transfers.
	  */
	private java.util.Set transfers;
	/** Notes */
	private String notes;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public NurMobilityComponent (Integer id, int ver)
    {
    	super(id, ver);
    }
    public NurMobilityComponent ()
    {
    	super();
    }
    public NurMobilityComponent (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.nursing.assessment.domain.objects.NurMobilityComponent.class;
	}


	public java.util.List getMobilityStatus() {
		if ( null == mobilityStatus ) {
			mobilityStatus = new java.util.ArrayList();
		}
		return mobilityStatus;
	}
	public void setMobilityStatus(java.util.List paramValue) {
		this.mobilityStatus = paramValue;
	}

	public java.util.List getOrthosesUsed() {
		if ( null == orthosesUsed ) {
			orthosesUsed = new java.util.ArrayList();
		}
		return orthosesUsed;
	}
	public void setOrthosesUsed(java.util.List paramValue) {
		this.orthosesUsed = paramValue;
	}

	public ims.domain.lookups.LookupInstance getMobilityAids() {
		return mobilityAids;
	}
	public void setMobilityAids(ims.domain.lookups.LookupInstance mobilityAids) {
		this.mobilityAids = mobilityAids;
	}

	public java.util.Set getTransfers() {
		if ( null == transfers ) {
			transfers = new java.util.HashSet();
		}
		return transfers;
	}
	public void setTransfers(java.util.Set paramValue) {
		this.transfers = paramValue;
	}

	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		if ( null != notes && notes.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for notes. Tried to set value: "+
				notes);
		}
		this.notes = notes;
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
		
		auditStr.append(super.toAuditString());
		auditStr.append("\r\n*mobilityStatus* :");
		if (mobilityStatus != null)
		{
			java.util.Iterator it1 = mobilityStatus.iterator();
			int i1=0;
			while (it1.hasNext())
			{
				if (i1 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it1.next();
			auditStr.append(obj.getText());
			i1++;
		}
		if (i1 > 0)
			auditStr.append("] " + i1);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*orthosesUsed* :");
		if (orthosesUsed != null)
		{
			java.util.Iterator it2 = orthosesUsed.iterator();
			int i2=0;
			while (it2.hasNext())
			{
				if (i2 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it2.next();
			auditStr.append(obj.getText());
			i2++;
		}
		if (i2 > 0)
			auditStr.append("] " + i2);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*mobilityAids* :");
		if (mobilityAids != null)
			auditStr.append(mobilityAids.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*transfers* :");
		if (transfers != null)
		{
			java.util.Iterator it4 = transfers.iterator();
			int i4=0;
			while (it4.hasNext())
			{
				if (i4 > 0)
					auditStr.append(",");
				ims.nursing.assessment.domain.objects.Transfers obj = (ims.nursing.assessment.domain.objects.Transfers)it4.next();
		if (obj != null)
		{
		   if (i4 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i4++;
		}
		if (i4 > 0)
			auditStr.append("] " + i4);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*notes* :");
		auditStr.append(notes);
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
		
		String keyClassName = "NurMobilityComponent";
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
		sb.append(super.fieldsToXMLString(domMap));
		if (this.getMobilityStatus() != null)
		{
			if (this.getMobilityStatus().size() > 0 )
			{
			sb.append("<mobilityStatus>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getMobilityStatus())); 
			sb.append("</mobilityStatus>");		
			}
		}
		if (this.getOrthosesUsed() != null)
		{
			if (this.getOrthosesUsed().size() > 0 )
			{
			sb.append("<orthosesUsed>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getOrthosesUsed())); 
			sb.append("</orthosesUsed>");		
			}
		}
		if (this.getMobilityAids() != null)
		{
			sb.append("<mobilityAids>");
			sb.append(this.getMobilityAids().toXMLString()); 
			sb.append("</mobilityAids>");		
		}
		if (this.getTransfers() != null)
		{
			if (this.getTransfers().size() > 0 )
			{
			sb.append("<transfers>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getTransfers(), domMap));
			sb.append("</transfers>");		
			}
		}
		if (this.getNotes() != null)
		{
			sb.append("<notes>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNotes().toString()));
			sb.append("</notes>");		
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
			NurMobilityComponent domainObject = getNurMobilityComponentfromXML(itemEl, factory, domMap);

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
			NurMobilityComponent domainObject = getNurMobilityComponentfromXML(itemEl, factory, domMap);

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
		
	public static NurMobilityComponent getNurMobilityComponentfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getNurMobilityComponentfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static NurMobilityComponent getNurMobilityComponentfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!NurMobilityComponent.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!NurMobilityComponent.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the NurMobilityComponent class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (NurMobilityComponent)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(NurMobilityComponent.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		NurMobilityComponent ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (NurMobilityComponent)factory.getImportedDomainObject(NurMobilityComponent.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new NurMobilityComponent();
		}
		String keyClassName = "NurMobilityComponent";
		Class clz = ret.getClass().getSuperclass();
		while (!clz.equals(ims.domain.DomainObject.class))
		{
			int dotIndex = clz.getName().lastIndexOf(".") + 1;
			keyClassName = clz.getName().substring(dotIndex); 
			clz = clz.getSuperclass();
		}

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (NurMobilityComponent)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, NurMobilityComponent obj, java.util.HashMap domMap) throws Exception
	{
		ims.nursing.assessment.domain.objects.AssessmentComponent.fillFieldsfromXML(el, factory, obj, domMap);
		org.dom4j.Element fldEl;
		fldEl = el.element("mobilityStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setMobilityStatus(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getMobilityStatus())); 
		}
		fldEl = el.element("orthosesUsed");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setOrthosesUsed(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getOrthosesUsed())); 
		}
		fldEl = el.element("mobilityAids");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMobilityAids(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("transfers");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setTransfers(ims.nursing.assessment.domain.objects.Transfers.fromSetXMLString(fldEl, factory, obj.getTransfers(), domMap));
		}
		fldEl = el.element("notes");
		if(fldEl != null)
		{	
    		obj.setNotes(new String(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "mobilityStatus"
		, "orthosesUsed"
		, "transfers"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String MobilityStatus = "mobilityStatus";
		public static final String OrthosesUsed = "orthosesUsed";
		public static final String MobilityAids = "mobilityAids";
		public static final String Transfers = "transfers";
		public static final String Notes = "notes";
	}
}

