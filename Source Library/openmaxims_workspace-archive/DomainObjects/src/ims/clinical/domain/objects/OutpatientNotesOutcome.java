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
package ims.clinical.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class OutpatientNotesOutcome extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100046;
	private static final long serialVersionUID = 1072100046L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** ClinicalNote */
	private ims.clinical.domain.objects.SoapNote clinicalNote;
	/** InstructionNextClinic */
	private String instructionNextClinic;
	/** Outcome */
	private ims.domain.lookups.LookupInstance outcome;
	/** ReviewIn */
	private Integer reviewIn;
	/** ReviewinUnits */
	private ims.domain.lookups.LookupInstance reviewinUnits;
	/** CareContext */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** Clinical Contact */
	private ims.core.admin.domain.objects.ClinicalContact clinicalContact;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public OutpatientNotesOutcome (Integer id, int ver)
    {
    	super(id, ver);
    }
    public OutpatientNotesOutcome ()
    {
    	super();
    }
    public OutpatientNotesOutcome (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.domain.objects.OutpatientNotesOutcome.class;
	}


	public ims.clinical.domain.objects.SoapNote getClinicalNote() {
		return clinicalNote;
	}
	public void setClinicalNote(ims.clinical.domain.objects.SoapNote clinicalNote) {
		this.clinicalNote = clinicalNote;
	}

	public String getInstructionNextClinic() {
		return instructionNextClinic;
	}
	public void setInstructionNextClinic(String instructionNextClinic) {
		this.instructionNextClinic = instructionNextClinic;
	}

	public ims.domain.lookups.LookupInstance getOutcome() {
		return outcome;
	}
	public void setOutcome(ims.domain.lookups.LookupInstance outcome) {
		this.outcome = outcome;
	}

	public Integer getReviewIn() {
		return reviewIn;
	}
	public void setReviewIn(Integer reviewIn) {
		this.reviewIn = reviewIn;
	}

	public ims.domain.lookups.LookupInstance getReviewinUnits() {
		return reviewinUnits;
	}
	public void setReviewinUnits(ims.domain.lookups.LookupInstance reviewinUnits) {
		this.reviewinUnits = reviewinUnits;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.core.admin.domain.objects.ClinicalContact getClinicalContact() {
		return clinicalContact;
	}
	public void setClinicalContact(ims.core.admin.domain.objects.ClinicalContact clinicalContact) {
		this.clinicalContact = clinicalContact;
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
		
		auditStr.append("\r\n*clinicalNote* :");
		if (clinicalNote != null)
		{
			auditStr.append(toShortClassName(clinicalNote));
				
		    auditStr.append(clinicalNote.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*instructionNextClinic* :");
		auditStr.append(instructionNextClinic);
	    auditStr.append("; ");
		auditStr.append("\r\n*outcome* :");
		if (outcome != null)
			auditStr.append(outcome.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*reviewIn* :");
		auditStr.append(reviewIn);
	    auditStr.append("; ");
		auditStr.append("\r\n*reviewinUnits* :");
		if (reviewinUnits != null)
			auditStr.append(reviewinUnits.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalContact* :");
		if (clinicalContact != null)
		{
			auditStr.append(toShortClassName(clinicalContact));
				
		    auditStr.append(clinicalContact.getId());
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
		
		String keyClassName = "OutpatientNotesOutcome";
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
		if (this.getClinicalNote() != null)
		{
			sb.append("<clinicalNote>");
			sb.append(this.getClinicalNote().toXMLString(domMap)); 	
			sb.append("</clinicalNote>");		
		}
		if (this.getInstructionNextClinic() != null)
		{
			sb.append("<instructionNextClinic>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getInstructionNextClinic().toString()));
			sb.append("</instructionNextClinic>");		
		}
		if (this.getOutcome() != null)
		{
			sb.append("<outcome>");
			sb.append(this.getOutcome().toXMLString()); 
			sb.append("</outcome>");		
		}
		if (this.getReviewIn() != null)
		{
			sb.append("<reviewIn>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReviewIn().toString()));
			sb.append("</reviewIn>");		
		}
		if (this.getReviewinUnits() != null)
		{
			sb.append("<reviewinUnits>");
			sb.append(this.getReviewinUnits().toXMLString()); 
			sb.append("</reviewinUnits>");		
		}
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getClinicalContact() != null)
		{
			sb.append("<clinicalContact>");
			sb.append(this.getClinicalContact().toXMLString(domMap)); 	
			sb.append("</clinicalContact>");		
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
			OutpatientNotesOutcome domainObject = getOutpatientNotesOutcomefromXML(itemEl, factory, domMap);

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
			OutpatientNotesOutcome domainObject = getOutpatientNotesOutcomefromXML(itemEl, factory, domMap);

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
		
	public static OutpatientNotesOutcome getOutpatientNotesOutcomefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getOutpatientNotesOutcomefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static OutpatientNotesOutcome getOutpatientNotesOutcomefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!OutpatientNotesOutcome.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!OutpatientNotesOutcome.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the OutpatientNotesOutcome class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (OutpatientNotesOutcome)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(OutpatientNotesOutcome.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		OutpatientNotesOutcome ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (OutpatientNotesOutcome)factory.getImportedDomainObject(OutpatientNotesOutcome.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new OutpatientNotesOutcome();
		}
		String keyClassName = "OutpatientNotesOutcome";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (OutpatientNotesOutcome)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, OutpatientNotesOutcome obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("clinicalNote");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClinicalNote(ims.clinical.domain.objects.SoapNote.getSoapNotefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("instructionNextClinic");
		if(fldEl != null)
		{	
    		obj.setInstructionNextClinic(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("outcome");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOutcome(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("reviewIn");
		if(fldEl != null)
		{	
    		obj.setReviewIn(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("reviewinUnits");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReviewinUnits(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("clinicalContact");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClinicalContact(ims.core.admin.domain.objects.ClinicalContact.getClinicalContactfromXML(fldEl, factory, domMap)); 
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
		public static final String ClinicalNote = "clinicalNote";
		public static final String InstructionNextClinic = "instructionNextClinic";
		public static final String Outcome = "outcome";
		public static final String ReviewIn = "reviewIn";
		public static final String ReviewinUnits = "reviewinUnits";
		public static final String CareContext = "careContext";
		public static final String ClinicalContact = "clinicalContact";
	}
}

