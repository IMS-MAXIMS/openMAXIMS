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
 * @author Sean Nesbitt
 * Generated.
 */


public class Opcs4 extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1065100001;
	private static final long serialVersionUID = 1065100001L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Selection Indicators */
	private String selindic;
	/** Operation prefix */
	private String opprefix;
	/** Operation Code */
	private String opcode;
	/** Operation Name (3 Digit) */
	private String opname3;
	/** Operation Name (4 Digit) */
	private String opname4;
	/** sex (absolute) */
	private String sexa;
	/** sex (srutiny) */
	private String sexs;
	/** Status of operation */
	private String opstatus;
	/** Method of Delivery */
	private String delmetod;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public Opcs4 (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Opcs4 ()
    {
    	super();
    }
    public Opcs4 (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.coding.domain.objects.Opcs4.class;
	}


	public String getSelindic() {
		return selindic;
	}
	public void setSelindic(String selindic) {
		if ( null != selindic && selindic.length() > 11 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for selindic. Tried to set value: "+
				selindic);
		}
		this.selindic = selindic;
	}

	public String getOpprefix() {
		return opprefix;
	}
	public void setOpprefix(String opprefix) {
		if ( null != opprefix && opprefix.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for opprefix. Tried to set value: "+
				opprefix);
		}
		this.opprefix = opprefix;
	}

	public String getOpcode() {
		return opcode;
	}
	public void setOpcode(String opcode) {
		if ( null != opcode && opcode.length() > 4 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for opcode. Tried to set value: "+
				opcode);
		}
		this.opcode = opcode;
	}

	public String getOpname3() {
		return opname3;
	}
	public void setOpname3(String opname3) {
		if ( null != opname3 && opname3.length() > 55 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for opname3. Tried to set value: "+
				opname3);
		}
		this.opname3 = opname3;
	}

	public String getOpname4() {
		return opname4;
	}
	public void setOpname4(String opname4) {
		if ( null != opname4 && opname4.length() > 60 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for opname4. Tried to set value: "+
				opname4);
		}
		this.opname4 = opname4;
	}

	public String getSexa() {
		return sexa;
	}
	public void setSexa(String sexa) {
		if ( null != sexa && sexa.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for sexa. Tried to set value: "+
				sexa);
		}
		this.sexa = sexa;
	}

	public String getSexs() {
		return sexs;
	}
	public void setSexs(String sexs) {
		if ( null != sexs && sexs.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for sexs. Tried to set value: "+
				sexs);
		}
		this.sexs = sexs;
	}

	public String getOpstatus() {
		return opstatus;
	}
	public void setOpstatus(String opstatus) {
		if ( null != opstatus && opstatus.length() > 2 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for opstatus. Tried to set value: "+
				opstatus);
		}
		this.opstatus = opstatus;
	}

	public String getDelmetod() {
		return delmetod;
	}
	public void setDelmetod(String delmetod) {
		if ( null != delmetod && delmetod.length() > 24 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for delmetod. Tried to set value: "+
				delmetod);
		}
		this.delmetod = delmetod;
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
		
		auditStr.append("\r\n*selindic* :");
		auditStr.append(selindic);
	    auditStr.append("; ");
		auditStr.append("\r\n*opprefix* :");
		auditStr.append(opprefix);
	    auditStr.append("; ");
		auditStr.append("\r\n*opcode* :");
		auditStr.append(opcode);
	    auditStr.append("; ");
		auditStr.append("\r\n*opname3* :");
		auditStr.append(opname3);
	    auditStr.append("; ");
		auditStr.append("\r\n*opname4* :");
		auditStr.append(opname4);
	    auditStr.append("; ");
		auditStr.append("\r\n*sexa* :");
		auditStr.append(sexa);
	    auditStr.append("; ");
		auditStr.append("\r\n*sexs* :");
		auditStr.append(sexs);
	    auditStr.append("; ");
		auditStr.append("\r\n*opstatus* :");
		auditStr.append(opstatus);
	    auditStr.append("; ");
		auditStr.append("\r\n*delmetod* :");
		auditStr.append(delmetod);
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
		
		String keyClassName = "Opcs4";
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
		if (this.getSelindic() != null)
		{
			sb.append("<selindic>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSelindic().toString()));
			sb.append("</selindic>");		
		}
		if (this.getOpprefix() != null)
		{
			sb.append("<opprefix>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOpprefix().toString()));
			sb.append("</opprefix>");		
		}
		if (this.getOpcode() != null)
		{
			sb.append("<opcode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOpcode().toString()));
			sb.append("</opcode>");		
		}
		if (this.getOpname3() != null)
		{
			sb.append("<opname3>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOpname3().toString()));
			sb.append("</opname3>");		
		}
		if (this.getOpname4() != null)
		{
			sb.append("<opname4>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOpname4().toString()));
			sb.append("</opname4>");		
		}
		if (this.getSexa() != null)
		{
			sb.append("<sexa>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSexa().toString()));
			sb.append("</sexa>");		
		}
		if (this.getSexs() != null)
		{
			sb.append("<sexs>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSexs().toString()));
			sb.append("</sexs>");		
		}
		if (this.getOpstatus() != null)
		{
			sb.append("<opstatus>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOpstatus().toString()));
			sb.append("</opstatus>");		
		}
		if (this.getDelmetod() != null)
		{
			sb.append("<delmetod>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDelmetod().toString()));
			sb.append("</delmetod>");		
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
			Opcs4 domainObject = getOpcs4fromXML(itemEl, factory, domMap);

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
			Opcs4 domainObject = getOpcs4fromXML(itemEl, factory, domMap);

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
		
	public static Opcs4 getOpcs4fromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getOpcs4fromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Opcs4 getOpcs4fromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Opcs4.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Opcs4.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Opcs4 class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Opcs4)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Opcs4.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Opcs4 ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Opcs4)factory.getImportedDomainObject(Opcs4.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Opcs4();
		}
		String keyClassName = "Opcs4";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Opcs4)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Opcs4 obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("selindic");
		if(fldEl != null)
		{	
    		obj.setSelindic(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("opprefix");
		if(fldEl != null)
		{	
    		obj.setOpprefix(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("opcode");
		if(fldEl != null)
		{	
    		obj.setOpcode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("opname3");
		if(fldEl != null)
		{	
    		obj.setOpname3(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("opname4");
		if(fldEl != null)
		{	
    		obj.setOpname4(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("sexa");
		if(fldEl != null)
		{	
    		obj.setSexa(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("sexs");
		if(fldEl != null)
		{	
    		obj.setSexs(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("opstatus");
		if(fldEl != null)
		{	
    		obj.setOpstatus(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("delmetod");
		if(fldEl != null)
		{	
    		obj.setDelmetod(new String(fldEl.getTextTrim()));	
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
		public static final String Selindic = "selindic";
		public static final String Opprefix = "opprefix";
		public static final String Opcode = "opcode";
		public static final String Opname3 = "opname3";
		public static final String Opname4 = "opname4";
		public static final String Sexa = "sexa";
		public static final String Sexs = "sexs";
		public static final String Opstatus = "opstatus";
		public static final String Delmetod = "delmetod";
	}
}

