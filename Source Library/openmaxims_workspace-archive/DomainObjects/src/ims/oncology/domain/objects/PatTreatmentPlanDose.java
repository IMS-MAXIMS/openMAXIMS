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
 * @author Sean Nesbitt
 * Generated.
 */


public class PatTreatmentPlanDose extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1105100041;
	private static final long serialVersionUID = 1105100041L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Flag to indicate Dose has a booking against it (Y/N) */
	private String edisbooked;
	/** External Beam Act Status */
	private Integer edoseastat;
	/** External Beam Duration */
	private Integer ebdur;
	/** External Beam Fractions */
	private Integer ebfractions;
	/** External Beam Dose */
	private Integer ebdose;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatTreatmentPlanDose (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatTreatmentPlanDose ()
    {
    	super();
    }
    public PatTreatmentPlanDose (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.oncology.domain.objects.PatTreatmentPlanDose.class;
	}


	public String getEdisbooked() {
		return edisbooked;
	}
	public void setEdisbooked(String edisbooked) {
		if ( null != edisbooked && edisbooked.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for edisbooked. Tried to set value: "+
				edisbooked);
		}
		this.edisbooked = edisbooked;
	}

	public Integer getEdoseastat() {
		return edoseastat;
	}
	public void setEdoseastat(Integer edoseastat) {
		this.edoseastat = edoseastat;
	}

	public Integer getEbdur() {
		return ebdur;
	}
	public void setEbdur(Integer ebdur) {
		this.ebdur = ebdur;
	}

	public Integer getEbfractions() {
		return ebfractions;
	}
	public void setEbfractions(Integer ebfractions) {
		this.ebfractions = ebfractions;
	}

	public Integer getEbdose() {
		return ebdose;
	}
	public void setEbdose(Integer ebdose) {
		this.ebdose = ebdose;
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
		
		auditStr.append("\r\n*edisbooked* :");
		auditStr.append(edisbooked);
	    auditStr.append("; ");
		auditStr.append("\r\n*edoseastat* :");
		auditStr.append(edoseastat);
	    auditStr.append("; ");
		auditStr.append("\r\n*ebdur* :");
		auditStr.append(ebdur);
	    auditStr.append("; ");
		auditStr.append("\r\n*ebfractions* :");
		auditStr.append(ebfractions);
	    auditStr.append("; ");
		auditStr.append("\r\n*ebdose* :");
		auditStr.append(ebdose);
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
		
		String keyClassName = "PatTreatmentPlanDose";
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
		if (this.getEdisbooked() != null)
		{
			sb.append("<edisbooked>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getEdisbooked().toString()));
			sb.append("</edisbooked>");		
		}
		if (this.getEdoseastat() != null)
		{
			sb.append("<edoseastat>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getEdoseastat().toString()));
			sb.append("</edoseastat>");		
		}
		if (this.getEbdur() != null)
		{
			sb.append("<ebdur>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getEbdur().toString()));
			sb.append("</ebdur>");		
		}
		if (this.getEbfractions() != null)
		{
			sb.append("<ebfractions>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getEbfractions().toString()));
			sb.append("</ebfractions>");		
		}
		if (this.getEbdose() != null)
		{
			sb.append("<ebdose>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getEbdose().toString()));
			sb.append("</ebdose>");		
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
			PatTreatmentPlanDose domainObject = getPatTreatmentPlanDosefromXML(itemEl, factory, domMap);

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
			PatTreatmentPlanDose domainObject = getPatTreatmentPlanDosefromXML(itemEl, factory, domMap);

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
		
	public static PatTreatmentPlanDose getPatTreatmentPlanDosefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatTreatmentPlanDosefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatTreatmentPlanDose getPatTreatmentPlanDosefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatTreatmentPlanDose.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatTreatmentPlanDose.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatTreatmentPlanDose class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatTreatmentPlanDose)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatTreatmentPlanDose.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatTreatmentPlanDose ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatTreatmentPlanDose)factory.getImportedDomainObject(PatTreatmentPlanDose.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatTreatmentPlanDose();
		}
		String keyClassName = "PatTreatmentPlanDose";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatTreatmentPlanDose)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatTreatmentPlanDose obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("edisbooked");
		if(fldEl != null)
		{	
    		obj.setEdisbooked(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("edoseastat");
		if(fldEl != null)
		{	
    		obj.setEdoseastat(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("ebdur");
		if(fldEl != null)
		{	
    		obj.setEbdur(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("ebfractions");
		if(fldEl != null)
		{	
    		obj.setEbfractions(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("ebdose");
		if(fldEl != null)
		{	
    		obj.setEbdose(new Integer(fldEl.getTextTrim()));	
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
		public static final String Edisbooked = "edisbooked";
		public static final String Edoseastat = "edoseastat";
		public static final String Ebdur = "ebdur";
		public static final String Ebfractions = "ebfractions";
		public static final String Ebdose = "ebdose";
	}
}

