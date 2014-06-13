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
package ims.therapies.hand.domain.objects;

/**
 * 
 * @author Joan Heelan
 * Generated.
 */


public class HandTest extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1019100058;
	private static final long serialVersionUID = 1019100058L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Authoring Date Time */
	private java.util.Date authoringDateTime;
	/** Authoring Care Professional */
	private ims.core.resource.people.domain.objects.Hcp authoringCP;
	/** DominantHand */
	private ims.domain.lookups.LookupInstance dominantHand;
	/** LeftThumb Index Span Extension */
	private java.lang.Float leftThumbIndexSpanExtension;
	/** RightThumb Index Span Extension */
	private java.lang.Float rightThumbIndexSpanExtension;
	/** Left Bulb Dynamometer */
	private Integer leftBulbDynamometer;
	/** Right Bulb Dynamometer */
	private Integer rightBulbDynamometer;
	/** Left Pinch Strength */
	private Integer leftPinchStrength;
	/** Right Pinch Strength */
	private Integer rightPinchStrength;
	/** GripStrength
	  * Collection of ims.therapies.hand.domain.objects.HandJaymar.
	  */
	private java.util.Set gripStrength;
	/** ClinicalContact */
	private ims.core.admin.domain.objects.ClinicalContact clinicalContact;
	/** CareContext */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public HandTest (Integer id, int ver)
    {
    	super(id, ver);
    }
    public HandTest ()
    {
    	super();
    }
    public HandTest (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.therapies.hand.domain.objects.HandTest.class;
	}


	public java.util.Date getAuthoringDateTime() {
		return authoringDateTime;
	}
	public void setAuthoringDateTime(java.util.Date authoringDateTime) {
		this.authoringDateTime = authoringDateTime;
	}

	public ims.core.resource.people.domain.objects.Hcp getAuthoringCP() {
		return authoringCP;
	}
	public void setAuthoringCP(ims.core.resource.people.domain.objects.Hcp authoringCP) {
		this.authoringCP = authoringCP;
	}

	public ims.domain.lookups.LookupInstance getDominantHand() {
		return dominantHand;
	}
	public void setDominantHand(ims.domain.lookups.LookupInstance dominantHand) {
		this.dominantHand = dominantHand;
	}

	public java.lang.Float getLeftThumbIndexSpanExtension() {
		return leftThumbIndexSpanExtension;
	}
	public void setLeftThumbIndexSpanExtension(java.lang.Float leftThumbIndexSpanExtension) {
		this.leftThumbIndexSpanExtension = leftThumbIndexSpanExtension;
	}

	public java.lang.Float getRightThumbIndexSpanExtension() {
		return rightThumbIndexSpanExtension;
	}
	public void setRightThumbIndexSpanExtension(java.lang.Float rightThumbIndexSpanExtension) {
		this.rightThumbIndexSpanExtension = rightThumbIndexSpanExtension;
	}

	public Integer getLeftBulbDynamometer() {
		return leftBulbDynamometer;
	}
	public void setLeftBulbDynamometer(Integer leftBulbDynamometer) {
		this.leftBulbDynamometer = leftBulbDynamometer;
	}

	public Integer getRightBulbDynamometer() {
		return rightBulbDynamometer;
	}
	public void setRightBulbDynamometer(Integer rightBulbDynamometer) {
		this.rightBulbDynamometer = rightBulbDynamometer;
	}

	public Integer getLeftPinchStrength() {
		return leftPinchStrength;
	}
	public void setLeftPinchStrength(Integer leftPinchStrength) {
		this.leftPinchStrength = leftPinchStrength;
	}

	public Integer getRightPinchStrength() {
		return rightPinchStrength;
	}
	public void setRightPinchStrength(Integer rightPinchStrength) {
		this.rightPinchStrength = rightPinchStrength;
	}

	public java.util.Set getGripStrength() {
		if ( null == gripStrength ) {
			gripStrength = new java.util.HashSet();
		}
		return gripStrength;
	}
	public void setGripStrength(java.util.Set paramValue) {
		this.gripStrength = paramValue;
	}

	public ims.core.admin.domain.objects.ClinicalContact getClinicalContact() {
		return clinicalContact;
	}
	public void setClinicalContact(ims.core.admin.domain.objects.ClinicalContact clinicalContact) {
		this.clinicalContact = clinicalContact;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
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
		
		auditStr.append("\r\n*authoringDateTime* :");
		auditStr.append(authoringDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringCP* :");
		if (authoringCP != null)
		{
			auditStr.append(toShortClassName(authoringCP));
				
		    auditStr.append(authoringCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*dominantHand* :");
		if (dominantHand != null)
			auditStr.append(dominantHand.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*leftThumbIndexSpanExtension* :");
		auditStr.append(leftThumbIndexSpanExtension);
	    auditStr.append("; ");
		auditStr.append("\r\n*rightThumbIndexSpanExtension* :");
		auditStr.append(rightThumbIndexSpanExtension);
	    auditStr.append("; ");
		auditStr.append("\r\n*leftBulbDynamometer* :");
		auditStr.append(leftBulbDynamometer);
	    auditStr.append("; ");
		auditStr.append("\r\n*rightBulbDynamometer* :");
		auditStr.append(rightBulbDynamometer);
	    auditStr.append("; ");
		auditStr.append("\r\n*leftPinchStrength* :");
		auditStr.append(leftPinchStrength);
	    auditStr.append("; ");
		auditStr.append("\r\n*rightPinchStrength* :");
		auditStr.append(rightPinchStrength);
	    auditStr.append("; ");
		auditStr.append("\r\n*gripStrength* :");
		if (gripStrength != null)
		{
			java.util.Iterator it10 = gripStrength.iterator();
			int i10=0;
			while (it10.hasNext())
			{
				if (i10 > 0)
					auditStr.append(",");
				ims.therapies.hand.domain.objects.HandJaymar obj = (ims.therapies.hand.domain.objects.HandJaymar)it10.next();
		if (obj != null)
		{
		   if (i10 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i10++;
		}
		if (i10 > 0)
			auditStr.append("] " + i10);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalContact* :");
		if (clinicalContact != null)
		{
			auditStr.append(toShortClassName(clinicalContact));
				
		    auditStr.append(clinicalContact.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
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
		
		String keyClassName = "HandTest";
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
		if (this.getAuthoringDateTime() != null)
		{
			sb.append("<authoringDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getAuthoringDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</authoringDateTime>");		
		}
		if (this.getAuthoringCP() != null)
		{
			sb.append("<authoringCP>");
			sb.append(this.getAuthoringCP().toXMLString(domMap)); 	
			sb.append("</authoringCP>");		
		}
		if (this.getDominantHand() != null)
		{
			sb.append("<dominantHand>");
			sb.append(this.getDominantHand().toXMLString()); 
			sb.append("</dominantHand>");		
		}
		if (this.getLeftThumbIndexSpanExtension() != null)
		{
			sb.append("<leftThumbIndexSpanExtension>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLeftThumbIndexSpanExtension().toString()));
			sb.append("</leftThumbIndexSpanExtension>");		
		}
		if (this.getRightThumbIndexSpanExtension() != null)
		{
			sb.append("<rightThumbIndexSpanExtension>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRightThumbIndexSpanExtension().toString()));
			sb.append("</rightThumbIndexSpanExtension>");		
		}
		if (this.getLeftBulbDynamometer() != null)
		{
			sb.append("<leftBulbDynamometer>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLeftBulbDynamometer().toString()));
			sb.append("</leftBulbDynamometer>");		
		}
		if (this.getRightBulbDynamometer() != null)
		{
			sb.append("<rightBulbDynamometer>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRightBulbDynamometer().toString()));
			sb.append("</rightBulbDynamometer>");		
		}
		if (this.getLeftPinchStrength() != null)
		{
			sb.append("<leftPinchStrength>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLeftPinchStrength().toString()));
			sb.append("</leftPinchStrength>");		
		}
		if (this.getRightPinchStrength() != null)
		{
			sb.append("<rightPinchStrength>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRightPinchStrength().toString()));
			sb.append("</rightPinchStrength>");		
		}
		if (this.getGripStrength() != null)
		{
			if (this.getGripStrength().size() > 0 )
			{
			sb.append("<gripStrength>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getGripStrength(), domMap));
			sb.append("</gripStrength>");		
			}
		}
		if (this.getClinicalContact() != null)
		{
			sb.append("<clinicalContact>");
			sb.append(this.getClinicalContact().toXMLString(domMap)); 	
			sb.append("</clinicalContact>");		
		}
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
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
			HandTest domainObject = getHandTestfromXML(itemEl, factory, domMap);

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
			HandTest domainObject = getHandTestfromXML(itemEl, factory, domMap);

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
		
	public static HandTest getHandTestfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getHandTestfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static HandTest getHandTestfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!HandTest.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!HandTest.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the HandTest class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (HandTest)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(HandTest.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		HandTest ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (HandTest)factory.getImportedDomainObject(HandTest.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new HandTest();
		}
		String keyClassName = "HandTest";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (HandTest)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, HandTest obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("authoringDateTime");
		if(fldEl != null)
		{	
    		obj.setAuthoringDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("authoringCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("dominantHand");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDominantHand(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("leftThumbIndexSpanExtension");
		if(fldEl != null)
		{	
    		obj.setLeftThumbIndexSpanExtension(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("rightThumbIndexSpanExtension");
		if(fldEl != null)
		{	
    		obj.setRightThumbIndexSpanExtension(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("leftBulbDynamometer");
		if(fldEl != null)
		{	
    		obj.setLeftBulbDynamometer(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("rightBulbDynamometer");
		if(fldEl != null)
		{	
    		obj.setRightBulbDynamometer(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("leftPinchStrength");
		if(fldEl != null)
		{	
    		obj.setLeftPinchStrength(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("rightPinchStrength");
		if(fldEl != null)
		{	
    		obj.setRightPinchStrength(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("gripStrength");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setGripStrength(ims.therapies.hand.domain.objects.HandJaymar.fromSetXMLString(fldEl, factory, obj.getGripStrength(), domMap));
		}
		fldEl = el.element("clinicalContact");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClinicalContact(ims.core.admin.domain.objects.ClinicalContact.getClinicalContactfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "gripStrength"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String AuthoringDateTime = "authoringDateTime";
		public static final String AuthoringCP = "authoringCP";
		public static final String DominantHand = "dominantHand";
		public static final String LeftThumbIndexSpanExtension = "leftThumbIndexSpanExtension";
		public static final String RightThumbIndexSpanExtension = "rightThumbIndexSpanExtension";
		public static final String LeftBulbDynamometer = "leftBulbDynamometer";
		public static final String RightBulbDynamometer = "rightBulbDynamometer";
		public static final String LeftPinchStrength = "leftPinchStrength";
		public static final String RightPinchStrength = "rightPinchStrength";
		public static final String GripStrength = "gripStrength";
		public static final String ClinicalContact = "clinicalContact";
		public static final String CareContext = "careContext";
	}
}

