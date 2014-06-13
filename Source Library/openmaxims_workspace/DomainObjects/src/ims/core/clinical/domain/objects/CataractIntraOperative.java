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


public class CataractIntraOperative extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100087;
	private static final long serialVersionUID = 1072100087L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Medications
	  * Collection of ims.core.clinical.domain.objects.PatientMedication.
	  */
	private java.util.Set medications;
	/** Skin Preperation Used
	  * Collection of ims.core.clinical.domain.objects.SkinPreperation.
	  */
	private java.util.Set skinPreperationUsed;
	/** Local Anaesthetic Used
	  * Collection of ims.core.clinical.domain.objects.LocalAnaestheticAdministered.
	  */
	private java.util.Set localAnaestheticUsed;
	/** Dressings
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List dressings;
	/** SwabNeedleCount */
	private Integer swabNeedleCount;
	/** wasSwabNeedleCountCorrect */
	private ims.domain.lookups.LookupInstance wasSwabNeedleCountCorrect;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public CataractIntraOperative (Integer id, int ver)
    {
    	super(id, ver);
    }
    public CataractIntraOperative ()
    {
    	super();
    }
    public CataractIntraOperative (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.CataractIntraOperative.class;
	}


	public java.util.Set getMedications() {
		if ( null == medications ) {
			medications = new java.util.HashSet();
		}
		return medications;
	}
	public void setMedications(java.util.Set paramValue) {
		this.medications = paramValue;
	}

	public java.util.Set getSkinPreperationUsed() {
		if ( null == skinPreperationUsed ) {
			skinPreperationUsed = new java.util.HashSet();
		}
		return skinPreperationUsed;
	}
	public void setSkinPreperationUsed(java.util.Set paramValue) {
		this.skinPreperationUsed = paramValue;
	}

	public java.util.Set getLocalAnaestheticUsed() {
		if ( null == localAnaestheticUsed ) {
			localAnaestheticUsed = new java.util.HashSet();
		}
		return localAnaestheticUsed;
	}
	public void setLocalAnaestheticUsed(java.util.Set paramValue) {
		this.localAnaestheticUsed = paramValue;
	}

	public java.util.List getDressings() {
		if ( null == dressings ) {
			dressings = new java.util.ArrayList();
		}
		return dressings;
	}
	public void setDressings(java.util.List paramValue) {
		this.dressings = paramValue;
	}

	public Integer getSwabNeedleCount() {
		return swabNeedleCount;
	}
	public void setSwabNeedleCount(Integer swabNeedleCount) {
		this.swabNeedleCount = swabNeedleCount;
	}

	public ims.domain.lookups.LookupInstance getWasSwabNeedleCountCorrect() {
		return wasSwabNeedleCountCorrect;
	}
	public void setWasSwabNeedleCountCorrect(ims.domain.lookups.LookupInstance wasSwabNeedleCountCorrect) {
		this.wasSwabNeedleCountCorrect = wasSwabNeedleCountCorrect;
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
		
		auditStr.append("\r\n*medications* :");
		if (medications != null)
		{
			java.util.Iterator it1 = medications.iterator();
			int i1=0;
			while (it1.hasNext())
			{
				if (i1 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.PatientMedication obj = (ims.core.clinical.domain.objects.PatientMedication)it1.next();
		if (obj != null)
		{
		   if (i1 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i1++;
		}
		if (i1 > 0)
			auditStr.append("] " + i1);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*skinPreperationUsed* :");
		if (skinPreperationUsed != null)
		{
			java.util.Iterator it2 = skinPreperationUsed.iterator();
			int i2=0;
			while (it2.hasNext())
			{
				if (i2 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.SkinPreperation obj = (ims.core.clinical.domain.objects.SkinPreperation)it2.next();
		if (obj != null)
		{
		   if (i2 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i2++;
		}
		if (i2 > 0)
			auditStr.append("] " + i2);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*localAnaestheticUsed* :");
		if (localAnaestheticUsed != null)
		{
			java.util.Iterator it3 = localAnaestheticUsed.iterator();
			int i3=0;
			while (it3.hasNext())
			{
				if (i3 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.LocalAnaestheticAdministered obj = (ims.core.clinical.domain.objects.LocalAnaestheticAdministered)it3.next();
		if (obj != null)
		{
		   if (i3 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i3++;
		}
		if (i3 > 0)
			auditStr.append("] " + i3);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*dressings* :");
		if (dressings != null)
		{
			java.util.Iterator it4 = dressings.iterator();
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
		auditStr.append("\r\n*swabNeedleCount* :");
		auditStr.append(swabNeedleCount);
	    auditStr.append("; ");
		auditStr.append("\r\n*wasSwabNeedleCountCorrect* :");
		if (wasSwabNeedleCountCorrect != null)
			auditStr.append(wasSwabNeedleCountCorrect.getText());
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
		
		String keyClassName = "CataractIntraOperative";
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
		if (this.getMedications() != null)
		{
			if (this.getMedications().size() > 0 )
			{
			sb.append("<medications>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getMedications(), domMap));
			sb.append("</medications>");		
			}
		}
		if (this.getSkinPreperationUsed() != null)
		{
			if (this.getSkinPreperationUsed().size() > 0 )
			{
			sb.append("<skinPreperationUsed>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getSkinPreperationUsed(), domMap));
			sb.append("</skinPreperationUsed>");		
			}
		}
		if (this.getLocalAnaestheticUsed() != null)
		{
			if (this.getLocalAnaestheticUsed().size() > 0 )
			{
			sb.append("<localAnaestheticUsed>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getLocalAnaestheticUsed(), domMap));
			sb.append("</localAnaestheticUsed>");		
			}
		}
		if (this.getDressings() != null)
		{
			if (this.getDressings().size() > 0 )
			{
			sb.append("<dressings>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getDressings())); 
			sb.append("</dressings>");		
			}
		}
		if (this.getSwabNeedleCount() != null)
		{
			sb.append("<swabNeedleCount>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSwabNeedleCount().toString()));
			sb.append("</swabNeedleCount>");		
		}
		if (this.getWasSwabNeedleCountCorrect() != null)
		{
			sb.append("<wasSwabNeedleCountCorrect>");
			sb.append(this.getWasSwabNeedleCountCorrect().toXMLString()); 
			sb.append("</wasSwabNeedleCountCorrect>");		
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
			CataractIntraOperative domainObject = getCataractIntraOperativefromXML(itemEl, factory, domMap);

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
			CataractIntraOperative domainObject = getCataractIntraOperativefromXML(itemEl, factory, domMap);

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
		
	public static CataractIntraOperative getCataractIntraOperativefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getCataractIntraOperativefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static CataractIntraOperative getCataractIntraOperativefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!CataractIntraOperative.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!CataractIntraOperative.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the CataractIntraOperative class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (CataractIntraOperative)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(CataractIntraOperative.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		CataractIntraOperative ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (CataractIntraOperative)factory.getImportedDomainObject(CataractIntraOperative.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new CataractIntraOperative();
		}
		String keyClassName = "CataractIntraOperative";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (CataractIntraOperative)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, CataractIntraOperative obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("medications");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setMedications(ims.core.clinical.domain.objects.PatientMedication.fromSetXMLString(fldEl, factory, obj.getMedications(), domMap));
		}
		fldEl = el.element("skinPreperationUsed");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setSkinPreperationUsed(ims.core.clinical.domain.objects.SkinPreperation.fromSetXMLString(fldEl, factory, obj.getSkinPreperationUsed(), domMap));
		}
		fldEl = el.element("localAnaestheticUsed");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setLocalAnaestheticUsed(ims.core.clinical.domain.objects.LocalAnaestheticAdministered.fromSetXMLString(fldEl, factory, obj.getLocalAnaestheticUsed(), domMap));
		}
		fldEl = el.element("dressings");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setDressings(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getDressings())); 
		}
		fldEl = el.element("swabNeedleCount");
		if(fldEl != null)
		{	
    		obj.setSwabNeedleCount(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("wasSwabNeedleCountCorrect");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setWasSwabNeedleCountCorrect(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "medications"
		, "skinPreperationUsed"
		, "localAnaestheticUsed"
		, "dressings"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Medications = "medications";
		public static final String SkinPreperationUsed = "skinPreperationUsed";
		public static final String LocalAnaestheticUsed = "localAnaestheticUsed";
		public static final String Dressings = "dressings";
		public static final String SwabNeedleCount = "swabNeedleCount";
		public static final String WasSwabNeedleCountCorrect = "wasSwabNeedleCountCorrect";
	}
}

