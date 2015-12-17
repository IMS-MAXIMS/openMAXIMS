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
package ims.emergency.domain.objects;

/**
 * 
 * @author Rory Fitzpatrick
 * Generated.
 */


public class InterventionTreatmentDetail extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1086100021;
	private static final long serialVersionUID = 1086100021L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** AuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** Treatment Intervention */
	private ims.core.clinical.domain.objects.TreatmentIntervention treatmentIntervention;
	/** TreatmentIntervention Description */
	private String treatmentInterventionDescription;
	/** AddedDuringCoding */
	private Boolean addedDuringCoding;
	/** Coding Sequence set on Coding Form */
	private Integer codingSequence;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public InterventionTreatmentDetail (Integer id, int ver)
    {
    	super(id, ver);
    }
    public InterventionTreatmentDetail ()
    {
    	super();
    }
    public InterventionTreatmentDetail (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.emergency.domain.objects.InterventionTreatmentDetail.class;
	}


	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
	}

	public ims.core.clinical.domain.objects.TreatmentIntervention getTreatmentIntervention() {
		return treatmentIntervention;
	}
	public void setTreatmentIntervention(ims.core.clinical.domain.objects.TreatmentIntervention treatmentIntervention) {
		this.treatmentIntervention = treatmentIntervention;
	}

	public String getTreatmentInterventionDescription() {
		return treatmentInterventionDescription;
	}
	public void setTreatmentInterventionDescription(String treatmentInterventionDescription) {
		if ( null != treatmentInterventionDescription && treatmentInterventionDescription.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for treatmentInterventionDescription. Tried to set value: "+
				treatmentInterventionDescription);
		}
		this.treatmentInterventionDescription = treatmentInterventionDescription;
	}

	public Boolean isAddedDuringCoding() {
		return addedDuringCoding;
	}
	public void setAddedDuringCoding(Boolean addedDuringCoding) {
		this.addedDuringCoding = addedDuringCoding;
	}

	public Integer getCodingSequence() {
		return codingSequence;
	}
	public void setCodingSequence(Integer codingSequence) {
		this.codingSequence = codingSequence;
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
		
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*treatmentIntervention* :");
		if (treatmentIntervention != null)
		{
			auditStr.append(toShortClassName(treatmentIntervention));
				
		    auditStr.append(treatmentIntervention.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*treatmentInterventionDescription* :");
		auditStr.append(treatmentInterventionDescription);
	    auditStr.append("; ");
		auditStr.append("\r\n*addedDuringCoding* :");
		auditStr.append(addedDuringCoding);
	    auditStr.append("; ");
		auditStr.append("\r\n*codingSequence* :");
		auditStr.append(codingSequence);
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
		
		String keyClassName = "InterventionTreatmentDetail";
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
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
		}
		if (this.getTreatmentIntervention() != null)
		{
			sb.append("<treatmentIntervention>");
			sb.append(this.getTreatmentIntervention().toXMLString(domMap)); 	
			sb.append("</treatmentIntervention>");		
		}
		if (this.getTreatmentInterventionDescription() != null)
		{
			sb.append("<treatmentInterventionDescription>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTreatmentInterventionDescription().toString()));
			sb.append("</treatmentInterventionDescription>");		
		}
		if (this.isAddedDuringCoding() != null)
		{
			sb.append("<addedDuringCoding>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isAddedDuringCoding().toString()));
			sb.append("</addedDuringCoding>");		
		}
		if (this.getCodingSequence() != null)
		{
			sb.append("<codingSequence>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCodingSequence().toString()));
			sb.append("</codingSequence>");		
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
			InterventionTreatmentDetail domainObject = getInterventionTreatmentDetailfromXML(itemEl, factory, domMap);

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
			InterventionTreatmentDetail domainObject = getInterventionTreatmentDetailfromXML(itemEl, factory, domMap);

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
		
	public static InterventionTreatmentDetail getInterventionTreatmentDetailfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getInterventionTreatmentDetailfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static InterventionTreatmentDetail getInterventionTreatmentDetailfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!InterventionTreatmentDetail.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!InterventionTreatmentDetail.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the InterventionTreatmentDetail class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (InterventionTreatmentDetail)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(InterventionTreatmentDetail.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		InterventionTreatmentDetail ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (InterventionTreatmentDetail)factory.getImportedDomainObject(InterventionTreatmentDetail.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new InterventionTreatmentDetail();
		}
		String keyClassName = "InterventionTreatmentDetail";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (InterventionTreatmentDetail)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, InterventionTreatmentDetail obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("treatmentIntervention");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTreatmentIntervention(ims.core.clinical.domain.objects.TreatmentIntervention.getTreatmentInterventionfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("treatmentInterventionDescription");
		if(fldEl != null)
		{	
    		obj.setTreatmentInterventionDescription(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("addedDuringCoding");
		if(fldEl != null)
		{	
    		obj.setAddedDuringCoding(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("codingSequence");
		if(fldEl != null)
		{	
    		obj.setCodingSequence(new Integer(fldEl.getTextTrim()));	
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
		public static final String AuthoringInformation = "authoringInformation";
		public static final String TreatmentIntervention = "treatmentIntervention";
		public static final String TreatmentInterventionDescription = "treatmentInterventionDescription";
		public static final String AddedDuringCoding = "addedDuringCoding";
		public static final String CodingSequence = "codingSequence";
	}
}

