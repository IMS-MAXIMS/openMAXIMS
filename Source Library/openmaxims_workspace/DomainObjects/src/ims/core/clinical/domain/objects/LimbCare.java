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


public class LimbCare extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100084;
	private static final long serialVersionUID = 1072100084L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Had Padded arm support Board Left */
	private Boolean hadPaddedArmSupportLeft;
	/** Had Padded arm support Board Right */
	private Boolean hadPaddedArmSupportRight;
	/** Had Left Arm Folded Across Patients Chest */
	private Boolean hadLeftArmFoldedAcrossPatientsChest;
	/** Had Right Arm Folded Across Patients Chest */
	private Boolean hadRightArmFoldedAcrossPatientsChest1;
	/** Had Left Leg DVT Prophylaxsis */
	private Boolean hadLeftLegDVTProphylaxsis;
	/** Had Right Leg DVT Prophylaxsis */
	private Boolean hadRightLegDVTProphylaxsis;
	/** Had Left Leg Gel Pad */
	private Boolean hadLeftLegGelPad;
	/** Had Right Leg Gel Pad */
	private Boolean hadRightLegGelPad;
	/** Had Right Arm Secured By Side */
	private Boolean hasRightArmSecuredBySide;
	/** Had Left Arm Secured By Side */
	private Boolean hasLeftArmSecuredBySide;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public LimbCare (Integer id, int ver)
    {
    	super(id, ver);
    }
    public LimbCare ()
    {
    	super();
    }
    public LimbCare (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.LimbCare.class;
	}


	public Boolean isHadPaddedArmSupportLeft() {
		return hadPaddedArmSupportLeft;
	}
	public void setHadPaddedArmSupportLeft(Boolean hadPaddedArmSupportLeft) {
		this.hadPaddedArmSupportLeft = hadPaddedArmSupportLeft;
	}

	public Boolean isHadPaddedArmSupportRight() {
		return hadPaddedArmSupportRight;
	}
	public void setHadPaddedArmSupportRight(Boolean hadPaddedArmSupportRight) {
		this.hadPaddedArmSupportRight = hadPaddedArmSupportRight;
	}

	public Boolean isHadLeftArmFoldedAcrossPatientsChest() {
		return hadLeftArmFoldedAcrossPatientsChest;
	}
	public void setHadLeftArmFoldedAcrossPatientsChest(Boolean hadLeftArmFoldedAcrossPatientsChest) {
		this.hadLeftArmFoldedAcrossPatientsChest = hadLeftArmFoldedAcrossPatientsChest;
	}

	public Boolean isHadRightArmFoldedAcrossPatientsChest1() {
		return hadRightArmFoldedAcrossPatientsChest1;
	}
	public void setHadRightArmFoldedAcrossPatientsChest1(Boolean hadRightArmFoldedAcrossPatientsChest1) {
		this.hadRightArmFoldedAcrossPatientsChest1 = hadRightArmFoldedAcrossPatientsChest1;
	}

	public Boolean isHadLeftLegDVTProphylaxsis() {
		return hadLeftLegDVTProphylaxsis;
	}
	public void setHadLeftLegDVTProphylaxsis(Boolean hadLeftLegDVTProphylaxsis) {
		this.hadLeftLegDVTProphylaxsis = hadLeftLegDVTProphylaxsis;
	}

	public Boolean isHadRightLegDVTProphylaxsis() {
		return hadRightLegDVTProphylaxsis;
	}
	public void setHadRightLegDVTProphylaxsis(Boolean hadRightLegDVTProphylaxsis) {
		this.hadRightLegDVTProphylaxsis = hadRightLegDVTProphylaxsis;
	}

	public Boolean isHadLeftLegGelPad() {
		return hadLeftLegGelPad;
	}
	public void setHadLeftLegGelPad(Boolean hadLeftLegGelPad) {
		this.hadLeftLegGelPad = hadLeftLegGelPad;
	}

	public Boolean isHadRightLegGelPad() {
		return hadRightLegGelPad;
	}
	public void setHadRightLegGelPad(Boolean hadRightLegGelPad) {
		this.hadRightLegGelPad = hadRightLegGelPad;
	}

	public Boolean isHasRightArmSecuredBySide() {
		return hasRightArmSecuredBySide;
	}
	public void setHasRightArmSecuredBySide(Boolean hasRightArmSecuredBySide) {
		this.hasRightArmSecuredBySide = hasRightArmSecuredBySide;
	}

	public Boolean isHasLeftArmSecuredBySide() {
		return hasLeftArmSecuredBySide;
	}
	public void setHasLeftArmSecuredBySide(Boolean hasLeftArmSecuredBySide) {
		this.hasLeftArmSecuredBySide = hasLeftArmSecuredBySide;
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
		
		auditStr.append("\r\n*hadPaddedArmSupportLeft* :");
		auditStr.append(hadPaddedArmSupportLeft);
	    auditStr.append("; ");
		auditStr.append("\r\n*hadPaddedArmSupportRight* :");
		auditStr.append(hadPaddedArmSupportRight);
	    auditStr.append("; ");
		auditStr.append("\r\n*hadLeftArmFoldedAcrossPatientsChest* :");
		auditStr.append(hadLeftArmFoldedAcrossPatientsChest);
	    auditStr.append("; ");
		auditStr.append("\r\n*hadRightArmFoldedAcrossPatientsChest1* :");
		auditStr.append(hadRightArmFoldedAcrossPatientsChest1);
	    auditStr.append("; ");
		auditStr.append("\r\n*hadLeftLegDVTProphylaxsis* :");
		auditStr.append(hadLeftLegDVTProphylaxsis);
	    auditStr.append("; ");
		auditStr.append("\r\n*hadRightLegDVTProphylaxsis* :");
		auditStr.append(hadRightLegDVTProphylaxsis);
	    auditStr.append("; ");
		auditStr.append("\r\n*hadLeftLegGelPad* :");
		auditStr.append(hadLeftLegGelPad);
	    auditStr.append("; ");
		auditStr.append("\r\n*hadRightLegGelPad* :");
		auditStr.append(hadRightLegGelPad);
	    auditStr.append("; ");
		auditStr.append("\r\n*hasRightArmSecuredBySide* :");
		auditStr.append(hasRightArmSecuredBySide);
	    auditStr.append("; ");
		auditStr.append("\r\n*hasLeftArmSecuredBySide* :");
		auditStr.append(hasLeftArmSecuredBySide);
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
		
		String keyClassName = "LimbCare";
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
		if (this.isHadPaddedArmSupportLeft() != null)
		{
			sb.append("<hadPaddedArmSupportLeft>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHadPaddedArmSupportLeft().toString()));
			sb.append("</hadPaddedArmSupportLeft>");		
		}
		if (this.isHadPaddedArmSupportRight() != null)
		{
			sb.append("<hadPaddedArmSupportRight>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHadPaddedArmSupportRight().toString()));
			sb.append("</hadPaddedArmSupportRight>");		
		}
		if (this.isHadLeftArmFoldedAcrossPatientsChest() != null)
		{
			sb.append("<hadLeftArmFoldedAcrossPatientsChest>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHadLeftArmFoldedAcrossPatientsChest().toString()));
			sb.append("</hadLeftArmFoldedAcrossPatientsChest>");		
		}
		if (this.isHadRightArmFoldedAcrossPatientsChest1() != null)
		{
			sb.append("<hadRightArmFoldedAcrossPatientsChest1>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHadRightArmFoldedAcrossPatientsChest1().toString()));
			sb.append("</hadRightArmFoldedAcrossPatientsChest1>");		
		}
		if (this.isHadLeftLegDVTProphylaxsis() != null)
		{
			sb.append("<hadLeftLegDVTProphylaxsis>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHadLeftLegDVTProphylaxsis().toString()));
			sb.append("</hadLeftLegDVTProphylaxsis>");		
		}
		if (this.isHadRightLegDVTProphylaxsis() != null)
		{
			sb.append("<hadRightLegDVTProphylaxsis>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHadRightLegDVTProphylaxsis().toString()));
			sb.append("</hadRightLegDVTProphylaxsis>");		
		}
		if (this.isHadLeftLegGelPad() != null)
		{
			sb.append("<hadLeftLegGelPad>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHadLeftLegGelPad().toString()));
			sb.append("</hadLeftLegGelPad>");		
		}
		if (this.isHadRightLegGelPad() != null)
		{
			sb.append("<hadRightLegGelPad>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHadRightLegGelPad().toString()));
			sb.append("</hadRightLegGelPad>");		
		}
		if (this.isHasRightArmSecuredBySide() != null)
		{
			sb.append("<hasRightArmSecuredBySide>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasRightArmSecuredBySide().toString()));
			sb.append("</hasRightArmSecuredBySide>");		
		}
		if (this.isHasLeftArmSecuredBySide() != null)
		{
			sb.append("<hasLeftArmSecuredBySide>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasLeftArmSecuredBySide().toString()));
			sb.append("</hasLeftArmSecuredBySide>");		
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
			LimbCare domainObject = getLimbCarefromXML(itemEl, factory, domMap);

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
			LimbCare domainObject = getLimbCarefromXML(itemEl, factory, domMap);

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
		
	public static LimbCare getLimbCarefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getLimbCarefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static LimbCare getLimbCarefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!LimbCare.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!LimbCare.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the LimbCare class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (LimbCare)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(LimbCare.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		LimbCare ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (LimbCare)factory.getImportedDomainObject(LimbCare.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new LimbCare();
		}
		String keyClassName = "LimbCare";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (LimbCare)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, LimbCare obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("hadPaddedArmSupportLeft");
		if(fldEl != null)
		{	
    		obj.setHadPaddedArmSupportLeft(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hadPaddedArmSupportRight");
		if(fldEl != null)
		{	
    		obj.setHadPaddedArmSupportRight(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hadLeftArmFoldedAcrossPatientsChest");
		if(fldEl != null)
		{	
    		obj.setHadLeftArmFoldedAcrossPatientsChest(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hadRightArmFoldedAcrossPatientsChest1");
		if(fldEl != null)
		{	
    		obj.setHadRightArmFoldedAcrossPatientsChest1(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hadLeftLegDVTProphylaxsis");
		if(fldEl != null)
		{	
    		obj.setHadLeftLegDVTProphylaxsis(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hadRightLegDVTProphylaxsis");
		if(fldEl != null)
		{	
    		obj.setHadRightLegDVTProphylaxsis(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hadLeftLegGelPad");
		if(fldEl != null)
		{	
    		obj.setHadLeftLegGelPad(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hadRightLegGelPad");
		if(fldEl != null)
		{	
    		obj.setHadRightLegGelPad(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hasRightArmSecuredBySide");
		if(fldEl != null)
		{	
    		obj.setHasRightArmSecuredBySide(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hasLeftArmSecuredBySide");
		if(fldEl != null)
		{	
    		obj.setHasLeftArmSecuredBySide(new Boolean(fldEl.getTextTrim()));	
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
		public static final String HadPaddedArmSupportLeft = "hadPaddedArmSupportLeft";
		public static final String HadPaddedArmSupportRight = "hadPaddedArmSupportRight";
		public static final String HadLeftArmFoldedAcrossPatientsChest = "hadLeftArmFoldedAcrossPatientsChest";
		public static final String HadRightArmFoldedAcrossPatientsChest1 = "hadRightArmFoldedAcrossPatientsChest1";
		public static final String HadLeftLegDVTProphylaxsis = "hadLeftLegDVTProphylaxsis";
		public static final String HadRightLegDVTProphylaxsis = "hadRightLegDVTProphylaxsis";
		public static final String HadLeftLegGelPad = "hadLeftLegGelPad";
		public static final String HadRightLegGelPad = "hadRightLegGelPad";
		public static final String HasRightArmSecuredBySide = "hasRightArmSecuredBySide";
		public static final String HasLeftArmSecuredBySide = "hasLeftArmSecuredBySide";
	}
}

