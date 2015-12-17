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
package ims.core.clinical.coding.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class Icd10AmProc extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1037100001;
	private static final long serialVersionUID = 1037100001L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** code_id */
	private String code_id;
	/** block */
	private ims.core.clinical.coding.domain.objects.Icd10AmBlock block;
	/** ascii_desc */
	private String ascii_desc;
	/** ascii_short_desc */
	private String ascii_short_desc;
	/** effective_from */
	private java.util.Date effective_from;
	/** inactive */
	private java.util.Date inactive;
	/** sex */
	private Integer sex;
	/** stype */
	private Integer stype;
	/** ageL */
	private Integer ageL;
	/** agelH */
	private Integer agelH;
	/** atype */
	private Integer atype;
    public Icd10AmProc (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Icd10AmProc ()
    {
    	super();
    }
    public Icd10AmProc (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.coding.domain.objects.Icd10AmProc.class;
	}


	public String getCode_id() {
		return code_id;
	}
	public void setCode_id(String code_id) {
		if ( null != code_id && code_id.length() > 10 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for code_id. Tried to set value: "+
				code_id);
		}
		this.code_id = code_id;
	}

	public ims.core.clinical.coding.domain.objects.Icd10AmBlock getBlock() {
		return block;
	}
	public void setBlock(ims.core.clinical.coding.domain.objects.Icd10AmBlock block) {
		this.block = block;
	}

	public String getAscii_desc() {
		return ascii_desc;
	}
	public void setAscii_desc(String ascii_desc) {
		if ( null != ascii_desc && ascii_desc.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for ascii_desc. Tried to set value: "+
				ascii_desc);
		}
		this.ascii_desc = ascii_desc;
	}

	public String getAscii_short_desc() {
		return ascii_short_desc;
	}
	public void setAscii_short_desc(String ascii_short_desc) {
		if ( null != ascii_short_desc && ascii_short_desc.length() > 60 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for ascii_short_desc. Tried to set value: "+
				ascii_short_desc);
		}
		this.ascii_short_desc = ascii_short_desc;
	}

	public java.util.Date getEffective_from() {
		return effective_from;
	}
	public void setEffective_from(java.util.Date effective_from) {
		this.effective_from = effective_from;
	}

	public java.util.Date getInactive() {
		return inactive;
	}
	public void setInactive(java.util.Date inactive) {
		this.inactive = inactive;
	}

	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Integer getStype() {
		return stype;
	}
	public void setStype(Integer stype) {
		this.stype = stype;
	}

	public Integer getAgeL() {
		return ageL;
	}
	public void setAgeL(Integer ageL) {
		this.ageL = ageL;
	}

	public Integer getAgelH() {
		return agelH;
	}
	public void setAgelH(Integer agelH) {
		this.agelH = agelH;
	}

	public Integer getAtype() {
		return atype;
	}
	public void setAtype(Integer atype) {
		this.atype = atype;
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
	// method generated based on 'proccodeunqidx' unique index.
	public static boolean recordExistForCode_id(ims.domain.ILightweightDomainFactory factory,
		 String code_id
	)	
	{
		return recordExistForCode_id(factory, code_id, null);
	}	

	// method generated based on 'proccodeunqidx' unique index.
	public static boolean recordExistForCode_id(ims.domain.ILightweightDomainFactory factory,
		 String code_id
	, Integer recordId)	
	{
		String[] names = new String[1];
		Object[] values = new Object[1];
		StringBuffer hql = new StringBuffer();
		
		hql.append("from Icd10AmProc c where ");
		hql.append(" c.code_id = :code_id ");
		names[0] = "code_id";
		values[0] = code_id;		
		if(recordId != null)
		{
			hql.append(" and c.id <> " + recordId);
		}
		
		return factory.count(hql.toString(), names, values) > 0;				
	}	

	// method generated based on 'proccodeunqidx' unique index.
	public static Icd10AmProc getRecordByCode_id(ims.domain.ILightweightDomainFactory factory,
	 String code_id
	)
	{
		String[] names = new String[1];
		Object[] values = new Object[1];
		StringBuffer hql = new StringBuffer();
		hql.append("from Icd10AmProc c where ");
		hql.append(" c.code_id = :code_id ");
		names[0] = "code_id";
		values[0] = code_id;		
		java.util.List l = factory.find(hql.toString(), names, values);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. " + hql + " returned " + l.size() + " records. " );
		return (Icd10AmProc)l.get(0);
	}

	public static Icd10AmProc getIcd10AmProcFromproccodeunqidx(ims.domain.ILightweightDomainFactory factory,
	 String code_id
	)
	{
		String[] names = new String[1];
		Object[] values = new Object[1];
		StringBuffer hql = new StringBuffer();
		hql.append("from Icd10AmProc c where ");
		hql.append(" c.code_id = :code_id ");
		names[0] = "code_id";
		values[0] = code_id;		
		java.util.List l = factory.find(hql.toString(), names, values);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. " + hql + " returned " + l.size() + " records. " );
		return (Icd10AmProc)l.get(0);
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
		
		auditStr.append("\r\n*code_id* :");
		auditStr.append(code_id);
	    auditStr.append("; ");
		auditStr.append("\r\n*block* :");
		if (block != null)
		{
			auditStr.append(toShortClassName(block));
				
		    auditStr.append(block.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*ascii_desc* :");
		auditStr.append(ascii_desc);
	    auditStr.append("; ");
		auditStr.append("\r\n*ascii_short_desc* :");
		auditStr.append(ascii_short_desc);
	    auditStr.append("; ");
		auditStr.append("\r\n*effective_from* :");
		auditStr.append(effective_from);
	    auditStr.append("; ");
		auditStr.append("\r\n*inactive* :");
		auditStr.append(inactive);
	    auditStr.append("; ");
		auditStr.append("\r\n*sex* :");
		auditStr.append(sex);
	    auditStr.append("; ");
		auditStr.append("\r\n*stype* :");
		auditStr.append(stype);
	    auditStr.append("; ");
		auditStr.append("\r\n*ageL* :");
		auditStr.append(ageL);
	    auditStr.append("; ");
		auditStr.append("\r\n*agelH* :");
		auditStr.append(agelH);
	    auditStr.append("; ");
		auditStr.append("\r\n*atype* :");
		auditStr.append(atype);
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
		
		String keyClassName = "Icd10AmProc";
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
		if (this.getCode_id() != null)
		{
			sb.append("<code_id>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCode_id().toString()));
			sb.append("</code_id>");		
		}
		if (this.getBlock() != null)
		{
			sb.append("<block>");
			sb.append(this.getBlock().toXMLString(domMap)); 	
			sb.append("</block>");		
		}
		if (this.getAscii_desc() != null)
		{
			sb.append("<ascii_desc>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAscii_desc().toString()));
			sb.append("</ascii_desc>");		
		}
		if (this.getAscii_short_desc() != null)
		{
			sb.append("<ascii_short_desc>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAscii_short_desc().toString()));
			sb.append("</ascii_short_desc>");		
		}
		if (this.getEffective_from() != null)
		{
			sb.append("<effective_from>");
			sb.append(new ims.framework.utils.DateTime(this.getEffective_from()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</effective_from>");		
		}
		if (this.getInactive() != null)
		{
			sb.append("<inactive>");
			sb.append(new ims.framework.utils.DateTime(this.getInactive()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</inactive>");		
		}
		if (this.getSex() != null)
		{
			sb.append("<sex>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSex().toString()));
			sb.append("</sex>");		
		}
		if (this.getStype() != null)
		{
			sb.append("<stype>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getStype().toString()));
			sb.append("</stype>");		
		}
		if (this.getAgeL() != null)
		{
			sb.append("<ageL>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAgeL().toString()));
			sb.append("</ageL>");		
		}
		if (this.getAgelH() != null)
		{
			sb.append("<agelH>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAgelH().toString()));
			sb.append("</agelH>");		
		}
		if (this.getAtype() != null)
		{
			sb.append("<atype>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAtype().toString()));
			sb.append("</atype>");		
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
			Icd10AmProc domainObject = getIcd10AmProcfromXML(itemEl, factory, domMap);

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
			Icd10AmProc domainObject = getIcd10AmProcfromXML(itemEl, factory, domMap);

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
		
	public static Icd10AmProc getIcd10AmProcfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getIcd10AmProcfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Icd10AmProc getIcd10AmProcfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Icd10AmProc.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Icd10AmProc.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Icd10AmProc class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Icd10AmProc)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Icd10AmProc.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Icd10AmProc ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Icd10AmProc)factory.getImportedDomainObject(Icd10AmProc.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Icd10AmProc();
		}
		String keyClassName = "Icd10AmProc";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Icd10AmProc)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Icd10AmProc obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("code_id");
		if(fldEl != null)
		{	
    		obj.setCode_id(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("block");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setBlock(ims.core.clinical.coding.domain.objects.Icd10AmBlock.getIcd10AmBlockfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("ascii_desc");
		if(fldEl != null)
		{	
    		obj.setAscii_desc(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("ascii_short_desc");
		if(fldEl != null)
		{	
    		obj.setAscii_short_desc(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("effective_from");
		if(fldEl != null)
		{	
    		obj.setEffective_from(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("inactive");
		if(fldEl != null)
		{	
    		obj.setInactive(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("sex");
		if(fldEl != null)
		{	
    		obj.setSex(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("stype");
		if(fldEl != null)
		{	
    		obj.setStype(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("ageL");
		if(fldEl != null)
		{	
    		obj.setAgeL(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("agelH");
		if(fldEl != null)
		{	
    		obj.setAgelH(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("atype");
		if(fldEl != null)
		{	
    		obj.setAtype(new Integer(fldEl.getTextTrim()));	
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
		public static final String Code_id = "code_id";
		public static final String Block = "block";
		public static final String Ascii_desc = "ascii_desc";
		public static final String Ascii_short_desc = "ascii_short_desc";
		public static final String Effective_from = "effective_from";
		public static final String Inactive = "inactive";
		public static final String Sex = "sex";
		public static final String Stype = "stype";
		public static final String AgeL = "ageL";
		public static final String AgelH = "agelH";
		public static final String Atype = "atype";
	}
}

