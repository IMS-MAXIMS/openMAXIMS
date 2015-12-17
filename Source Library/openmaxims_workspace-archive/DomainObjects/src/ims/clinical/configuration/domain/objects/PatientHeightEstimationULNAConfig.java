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
package ims.clinical.configuration.domain.objects;

/**
 * 
 * @author Rory Fitzpatrick
 * Generated.
 */


public class PatientHeightEstimationULNAConfig extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1073100035;
	private static final long serialVersionUID = 1073100035L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private java.lang.Float uLNALengthCM;
	private java.lang.Float menUnder65HeightM;
	private java.lang.Float menOver65HeightM;
	private java.lang.Float womenUnder65HeightM;
	private java.lang.Float womenOver65HeightM;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatientHeightEstimationULNAConfig (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientHeightEstimationULNAConfig ()
    {
    	super();
    }
    public PatientHeightEstimationULNAConfig (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.configuration.domain.objects.PatientHeightEstimationULNAConfig.class;
	}


	public java.lang.Float getULNALengthCM() {
		return uLNALengthCM;
	}
	public void setULNALengthCM(java.lang.Float uLNALengthCM) {
		this.uLNALengthCM = uLNALengthCM;
	}

	public java.lang.Float getMenUnder65HeightM() {
		return menUnder65HeightM;
	}
	public void setMenUnder65HeightM(java.lang.Float menUnder65HeightM) {
		this.menUnder65HeightM = menUnder65HeightM;
	}

	public java.lang.Float getMenOver65HeightM() {
		return menOver65HeightM;
	}
	public void setMenOver65HeightM(java.lang.Float menOver65HeightM) {
		this.menOver65HeightM = menOver65HeightM;
	}

	public java.lang.Float getWomenUnder65HeightM() {
		return womenUnder65HeightM;
	}
	public void setWomenUnder65HeightM(java.lang.Float womenUnder65HeightM) {
		this.womenUnder65HeightM = womenUnder65HeightM;
	}

	public java.lang.Float getWomenOver65HeightM() {
		return womenOver65HeightM;
	}
	public void setWomenOver65HeightM(java.lang.Float womenOver65HeightM) {
		this.womenOver65HeightM = womenOver65HeightM;
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
		
		auditStr.append("\r\n*uLNALengthCM* :");
		auditStr.append(uLNALengthCM);
	    auditStr.append("; ");
		auditStr.append("\r\n*menUnder65HeightM* :");
		auditStr.append(menUnder65HeightM);
	    auditStr.append("; ");
		auditStr.append("\r\n*menOver65HeightM* :");
		auditStr.append(menOver65HeightM);
	    auditStr.append("; ");
		auditStr.append("\r\n*womenUnder65HeightM* :");
		auditStr.append(womenUnder65HeightM);
	    auditStr.append("; ");
		auditStr.append("\r\n*womenOver65HeightM* :");
		auditStr.append(womenOver65HeightM);
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
		
		String keyClassName = "PatientHeightEstimationULNAConfig";
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
		if (this.getULNALengthCM() != null)
		{
			sb.append("<uLNALengthCM>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getULNALengthCM().toString()));
			sb.append("</uLNALengthCM>");		
		}
		if (this.getMenUnder65HeightM() != null)
		{
			sb.append("<menUnder65HeightM>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMenUnder65HeightM().toString()));
			sb.append("</menUnder65HeightM>");		
		}
		if (this.getMenOver65HeightM() != null)
		{
			sb.append("<menOver65HeightM>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMenOver65HeightM().toString()));
			sb.append("</menOver65HeightM>");		
		}
		if (this.getWomenUnder65HeightM() != null)
		{
			sb.append("<womenUnder65HeightM>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getWomenUnder65HeightM().toString()));
			sb.append("</womenUnder65HeightM>");		
		}
		if (this.getWomenOver65HeightM() != null)
		{
			sb.append("<womenOver65HeightM>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getWomenOver65HeightM().toString()));
			sb.append("</womenOver65HeightM>");		
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
			PatientHeightEstimationULNAConfig domainObject = getPatientHeightEstimationULNAConfigfromXML(itemEl, factory, domMap);

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
			PatientHeightEstimationULNAConfig domainObject = getPatientHeightEstimationULNAConfigfromXML(itemEl, factory, domMap);

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
		
	public static PatientHeightEstimationULNAConfig getPatientHeightEstimationULNAConfigfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientHeightEstimationULNAConfigfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientHeightEstimationULNAConfig getPatientHeightEstimationULNAConfigfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientHeightEstimationULNAConfig.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientHeightEstimationULNAConfig.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientHeightEstimationULNAConfig class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientHeightEstimationULNAConfig)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientHeightEstimationULNAConfig.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientHeightEstimationULNAConfig ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientHeightEstimationULNAConfig)factory.getImportedDomainObject(PatientHeightEstimationULNAConfig.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientHeightEstimationULNAConfig();
		}
		String keyClassName = "PatientHeightEstimationULNAConfig";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientHeightEstimationULNAConfig)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientHeightEstimationULNAConfig obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("uLNALengthCM");
		if(fldEl != null)
		{	
    		obj.setULNALengthCM(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("menUnder65HeightM");
		if(fldEl != null)
		{	
    		obj.setMenUnder65HeightM(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("menOver65HeightM");
		if(fldEl != null)
		{	
    		obj.setMenOver65HeightM(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("womenUnder65HeightM");
		if(fldEl != null)
		{	
    		obj.setWomenUnder65HeightM(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("womenOver65HeightM");
		if(fldEl != null)
		{	
    		obj.setWomenOver65HeightM(new java.lang.Float(fldEl.getTextTrim()));	
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
		public static final String ULNALengthCM = "uLNALengthCM";
		public static final String MenUnder65HeightM = "menUnder65HeightM";
		public static final String MenOver65HeightM = "menOver65HeightM";
		public static final String WomenUnder65HeightM = "womenUnder65HeightM";
		public static final String WomenOver65HeightM = "womenOver65HeightM";
	}
}

