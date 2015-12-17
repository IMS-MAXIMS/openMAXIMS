//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
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
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5589.25814)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 12/10/2015, 13:28
 *
 */
package ims.nursing.domain.objects;

/**
 * 
 * @author Joan Heelan
 * Generated.
 */


public class RepositioningPlan extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1009100006;
	private static final long serialVersionUID = 1009100006L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Clinical Contact */
	private ims.core.admin.domain.objects.ClinicalContact clinicalContact;
	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** Authoring Information */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** Positioning Frequency */
	private ims.domain.lookups.LookupInstance positioningFreq;
	/** Position
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List position;
	/** Skin Tolerance Test performed? */
	private ims.domain.lookups.LookupInstance skinToleranceTest;
	/** Blanching / Non-blanching erythema */
	private ims.domain.lookups.LookupInstance blanching;
	/** Positioning Suitable */
	private ims.domain.lookups.LookupInstance positioningSuitable;
	/** Comment */
	private String comment;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public RepositioningPlan (Integer id, int ver)
    {
    	super(id, ver);
    }
    public RepositioningPlan ()
    {
    	super();
    }
    public RepositioningPlan (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.nursing.domain.objects.RepositioningPlan.class;
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

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
	}

	public ims.domain.lookups.LookupInstance getPositioningFreq() {
		return positioningFreq;
	}
	public void setPositioningFreq(ims.domain.lookups.LookupInstance positioningFreq) {
		this.positioningFreq = positioningFreq;
	}

	public java.util.List getPosition() {
		if ( null == position ) {
			position = new java.util.ArrayList();
		}
		return position;
	}
	public void setPosition(java.util.List paramValue) {
		this.position = paramValue;
	}

	public ims.domain.lookups.LookupInstance getSkinToleranceTest() {
		return skinToleranceTest;
	}
	public void setSkinToleranceTest(ims.domain.lookups.LookupInstance skinToleranceTest) {
		this.skinToleranceTest = skinToleranceTest;
	}

	public ims.domain.lookups.LookupInstance getBlanching() {
		return blanching;
	}
	public void setBlanching(ims.domain.lookups.LookupInstance blanching) {
		this.blanching = blanching;
	}

	public ims.domain.lookups.LookupInstance getPositioningSuitable() {
		return positioningSuitable;
	}
	public void setPositioningSuitable(ims.domain.lookups.LookupInstance positioningSuitable) {
		this.positioningSuitable = positioningSuitable;
	}

	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		if ( null != comment && comment.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for comment. Tried to set value: "+
				comment);
		}
		this.comment = comment;
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
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*positioningFreq* :");
		if (positioningFreq != null)
			auditStr.append(positioningFreq.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*position* :");
		if (position != null)
		{
			java.util.Iterator it5 = position.iterator();
			int i5=0;
			while (it5.hasNext())
			{
				if (i5 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it5.next();
			auditStr.append(obj.getText());
			i5++;
		}
		if (i5 > 0)
			auditStr.append("] " + i5);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*skinToleranceTest* :");
		if (skinToleranceTest != null)
			auditStr.append(skinToleranceTest.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*blanching* :");
		if (blanching != null)
			auditStr.append(blanching.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*positioningSuitable* :");
		if (positioningSuitable != null)
			auditStr.append(positioningSuitable.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*comment* :");
		auditStr.append(comment);
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
		
		String keyClassName = "RepositioningPlan";
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
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
		}
		if (this.getPositioningFreq() != null)
		{
			sb.append("<positioningFreq>");
			sb.append(this.getPositioningFreq().toXMLString()); 
			sb.append("</positioningFreq>");		
		}
		if (this.getPosition() != null)
		{
			if (this.getPosition().size() > 0 )
			{
			sb.append("<position>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getPosition())); 
			sb.append("</position>");		
			}
		}
		if (this.getSkinToleranceTest() != null)
		{
			sb.append("<skinToleranceTest>");
			sb.append(this.getSkinToleranceTest().toXMLString()); 
			sb.append("</skinToleranceTest>");		
		}
		if (this.getBlanching() != null)
		{
			sb.append("<blanching>");
			sb.append(this.getBlanching().toXMLString()); 
			sb.append("</blanching>");		
		}
		if (this.getPositioningSuitable() != null)
		{
			sb.append("<positioningSuitable>");
			sb.append(this.getPositioningSuitable().toXMLString()); 
			sb.append("</positioningSuitable>");		
		}
		if (this.getComment() != null)
		{
			sb.append("<comment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComment().toString()));
			sb.append("</comment>");		
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
			RepositioningPlan domainObject = getRepositioningPlanfromXML(itemEl, factory, domMap);

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
			RepositioningPlan domainObject = getRepositioningPlanfromXML(itemEl, factory, domMap);

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
		
	public static RepositioningPlan getRepositioningPlanfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getRepositioningPlanfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static RepositioningPlan getRepositioningPlanfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!RepositioningPlan.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!RepositioningPlan.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the RepositioningPlan class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (RepositioningPlan)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(RepositioningPlan.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		RepositioningPlan ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (RepositioningPlan)factory.getImportedDomainObject(RepositioningPlan.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new RepositioningPlan();
		}
		String keyClassName = "RepositioningPlan";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (RepositioningPlan)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, RepositioningPlan obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
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
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("positioningFreq");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPositioningFreq(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("position");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setPosition(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getPosition())); 
		}
		fldEl = el.element("skinToleranceTest");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSkinToleranceTest(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("blanching");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setBlanching(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("positioningSuitable");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPositioningSuitable(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("comment");
		if(fldEl != null)
		{	
    		obj.setComment(new String(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "position"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String ClinicalContact = "clinicalContact";
		public static final String CareContext = "careContext";
		public static final String AuthoringInformation = "authoringInformation";
		public static final String PositioningFreq = "positioningFreq";
		public static final String Position = "position";
		public static final String SkinToleranceTest = "skinToleranceTest";
		public static final String Blanching = "blanching";
		public static final String PositioningSuitable = "positioningSuitable";
		public static final String Comment = "comment";
	}
}

