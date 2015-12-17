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
package ims.emergency.domain.objects;

/**
 * 
 * @author Rory Fitzpatrick
 * Generated.
 */


public class PostDischargeLiaison extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1086100052;
	private static final long serialVersionUID = 1086100052L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** ContactedBy */
	private ims.core.clinical.domain.objects.AuthoringInformation contactedBy;
	/** PersonContacted */
	private ims.domain.lookups.LookupInstance personContacted;
	/** PersonContactedText */
	private String personContactedText;
	/** ReasonForContact */
	private ims.domain.lookups.LookupInstance reasonForContact;
	/** ContactMethod */
	private ims.domain.lookups.LookupInstance contactMethod;
	/** Comments */
	private String comments;
	/** LetterReviewStatus */
	private ims.domain.lookups.LookupInstance letterReviewStatus;
	/** AllocateToHCP */
	private ims.core.resource.people.domain.objects.Hcp allocateToHCP;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PostDischargeLiaison (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PostDischargeLiaison ()
    {
    	super();
    }
    public PostDischargeLiaison (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.emergency.domain.objects.PostDischargeLiaison.class;
	}


	public ims.core.clinical.domain.objects.AuthoringInformation getContactedBy() {
		return contactedBy;
	}
	public void setContactedBy(ims.core.clinical.domain.objects.AuthoringInformation contactedBy) {
		this.contactedBy = contactedBy;
	}

	public ims.domain.lookups.LookupInstance getPersonContacted() {
		return personContacted;
	}
	public void setPersonContacted(ims.domain.lookups.LookupInstance personContacted) {
		this.personContacted = personContacted;
	}

	public String getPersonContactedText() {
		return personContactedText;
	}
	public void setPersonContactedText(String personContactedText) {
		if ( null != personContactedText && personContactedText.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for personContactedText. Tried to set value: "+
				personContactedText);
		}
		this.personContactedText = personContactedText;
	}

	public ims.domain.lookups.LookupInstance getReasonForContact() {
		return reasonForContact;
	}
	public void setReasonForContact(ims.domain.lookups.LookupInstance reasonForContact) {
		this.reasonForContact = reasonForContact;
	}

	public ims.domain.lookups.LookupInstance getContactMethod() {
		return contactMethod;
	}
	public void setContactMethod(ims.domain.lookups.LookupInstance contactMethod) {
		this.contactMethod = contactMethod;
	}

	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}

	public ims.domain.lookups.LookupInstance getLetterReviewStatus() {
		return letterReviewStatus;
	}
	public void setLetterReviewStatus(ims.domain.lookups.LookupInstance letterReviewStatus) {
		this.letterReviewStatus = letterReviewStatus;
	}

	public ims.core.resource.people.domain.objects.Hcp getAllocateToHCP() {
		return allocateToHCP;
	}
	public void setAllocateToHCP(ims.core.resource.people.domain.objects.Hcp allocateToHCP) {
		this.allocateToHCP = allocateToHCP;
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
		
		auditStr.append("\r\n*contactedBy* :");
		if (contactedBy != null)
		{
			auditStr.append(toShortClassName(contactedBy));
				
		    auditStr.append(contactedBy.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*personContacted* :");
		if (personContacted != null)
			auditStr.append(personContacted.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*personContactedText* :");
		auditStr.append(personContactedText);
	    auditStr.append("; ");
		auditStr.append("\r\n*reasonForContact* :");
		if (reasonForContact != null)
			auditStr.append(reasonForContact.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*contactMethod* :");
		if (contactMethod != null)
			auditStr.append(contactMethod.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*comments* :");
		auditStr.append(comments);
	    auditStr.append("; ");
		auditStr.append("\r\n*letterReviewStatus* :");
		if (letterReviewStatus != null)
			auditStr.append(letterReviewStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*allocateToHCP* :");
		if (allocateToHCP != null)
		{
			auditStr.append(toShortClassName(allocateToHCP));
				
		    auditStr.append(allocateToHCP.getId());
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
		
		String keyClassName = "PostDischargeLiaison";
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
		if (this.getContactedBy() != null)
		{
			sb.append("<contactedBy>");
			sb.append(this.getContactedBy().toXMLString(domMap)); 	
			sb.append("</contactedBy>");		
		}
		if (this.getPersonContacted() != null)
		{
			sb.append("<personContacted>");
			sb.append(this.getPersonContacted().toXMLString()); 
			sb.append("</personContacted>");		
		}
		if (this.getPersonContactedText() != null)
		{
			sb.append("<personContactedText>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPersonContactedText().toString()));
			sb.append("</personContactedText>");		
		}
		if (this.getReasonForContact() != null)
		{
			sb.append("<reasonForContact>");
			sb.append(this.getReasonForContact().toXMLString()); 
			sb.append("</reasonForContact>");		
		}
		if (this.getContactMethod() != null)
		{
			sb.append("<contactMethod>");
			sb.append(this.getContactMethod().toXMLString()); 
			sb.append("</contactMethod>");		
		}
		if (this.getComments() != null)
		{
			sb.append("<comments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComments().toString()));
			sb.append("</comments>");		
		}
		if (this.getLetterReviewStatus() != null)
		{
			sb.append("<letterReviewStatus>");
			sb.append(this.getLetterReviewStatus().toXMLString()); 
			sb.append("</letterReviewStatus>");		
		}
		if (this.getAllocateToHCP() != null)
		{
			sb.append("<allocateToHCP>");
			sb.append(this.getAllocateToHCP().toXMLString(domMap)); 	
			sb.append("</allocateToHCP>");		
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
			PostDischargeLiaison domainObject = getPostDischargeLiaisonfromXML(itemEl, factory, domMap);

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
			PostDischargeLiaison domainObject = getPostDischargeLiaisonfromXML(itemEl, factory, domMap);

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
		
	public static PostDischargeLiaison getPostDischargeLiaisonfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPostDischargeLiaisonfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PostDischargeLiaison getPostDischargeLiaisonfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PostDischargeLiaison.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PostDischargeLiaison.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PostDischargeLiaison class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PostDischargeLiaison)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PostDischargeLiaison.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PostDischargeLiaison ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PostDischargeLiaison)factory.getImportedDomainObject(PostDischargeLiaison.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PostDischargeLiaison();
		}
		String keyClassName = "PostDischargeLiaison";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PostDischargeLiaison)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PostDischargeLiaison obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("contactedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setContactedBy(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("personContacted");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPersonContacted(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("personContactedText");
		if(fldEl != null)
		{	
    		obj.setPersonContactedText(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("reasonForContact");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReasonForContact(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("contactMethod");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setContactMethod(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("comments");
		if(fldEl != null)
		{	
    		obj.setComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("letterReviewStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setLetterReviewStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("allocateToHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAllocateToHCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
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
		public static final String ContactedBy = "contactedBy";
		public static final String PersonContacted = "personContacted";
		public static final String PersonContactedText = "personContactedText";
		public static final String ReasonForContact = "reasonForContact";
		public static final String ContactMethod = "contactMethod";
		public static final String Comments = "comments";
		public static final String LetterReviewStatus = "letterReviewStatus";
		public static final String AllocateToHCP = "allocateToHCP";
	}
}

