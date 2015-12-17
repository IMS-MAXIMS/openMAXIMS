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
 * @author Joan Heelan
 * Generated.
 */


public class PatientPMHChecklist extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100015;
	private static final long serialVersionUID = 1072100015L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** Clinical Contact */
	private ims.core.admin.domain.objects.ClinicalContact clinicalContact;
	/** PMH Information */
	private String pMHInfoText;
	/** Presenting Complaint Information */
	private String presComplaint;
	/** Patient Positive Diagnosis
	  * Collection of ims.core.clinical.domain.objects.PatientDiagnosis.
	  */
	private java.util.Set positiveDiagnosis;
	/** Patient Positive Procedures
	  * Collection of ims.core.clinical.domain.objects.PatientProcedure.
	  */
	private java.util.Set positiveProcedure;
	/** Excluded Diagnosis
	  * Collection of ims.clinical.domain.objects.PatientPMHChecklistDiagnosis.
	  */
	private java.util.Set otherDiagnosis;
	/** Excluded Procedures
	  * Collection of ims.clinical.domain.objects.PatientPMHChecklistProcedure.
	  */
	private java.util.Set otherProcedure;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatientPMHChecklist (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientPMHChecklist ()
    {
    	super();
    }
    public PatientPMHChecklist (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.domain.objects.PatientPMHChecklist.class;
	}


	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public static PatientPMHChecklist getPatientPMHChecklistFromCareContext(ims.domain.ILightweightDomainFactory factory, Integer id)
	{
		java.util.List l = factory.find("from PatientPMHChecklist c where c.careContext.id = " + id);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. PatientPMHChecklist.careContext.id = " + id + " returned " + l.size() + " records. " );
		return (PatientPMHChecklist)l.get(0);
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

	public String getPMHInfoText() {
		return pMHInfoText;
	}
	public void setPMHInfoText(String pMHInfoText) {
		if ( null != pMHInfoText && pMHInfoText.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for pMHInfoText. Tried to set value: "+
				pMHInfoText);
		}
		this.pMHInfoText = pMHInfoText;
	}

	public String getPresComplaint() {
		return presComplaint;
	}
	public void setPresComplaint(String presComplaint) {
		if ( null != presComplaint && presComplaint.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for presComplaint. Tried to set value: "+
				presComplaint);
		}
		this.presComplaint = presComplaint;
	}

	public java.util.Set getPositiveDiagnosis() {
		if ( null == positiveDiagnosis ) {
			positiveDiagnosis = new java.util.HashSet();
		}
		return positiveDiagnosis;
	}
	public void setPositiveDiagnosis(java.util.Set paramValue) {
		this.positiveDiagnosis = paramValue;
	}

	public java.util.Set getPositiveProcedure() {
		if ( null == positiveProcedure ) {
			positiveProcedure = new java.util.HashSet();
		}
		return positiveProcedure;
	}
	public void setPositiveProcedure(java.util.Set paramValue) {
		this.positiveProcedure = paramValue;
	}

	public java.util.Set getOtherDiagnosis() {
		if ( null == otherDiagnosis ) {
			otherDiagnosis = new java.util.HashSet();
		}
		return otherDiagnosis;
	}
	public void setOtherDiagnosis(java.util.Set paramValue) {
		this.otherDiagnosis = paramValue;
	}

	public java.util.Set getOtherProcedure() {
		if ( null == otherProcedure ) {
			otherProcedure = new java.util.HashSet();
		}
		return otherProcedure;
	}
	public void setOtherProcedure(java.util.Set paramValue) {
		this.otherProcedure = paramValue;
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
		auditStr.append("\r\n*pMHInfoText* :");
		auditStr.append(pMHInfoText);
	    auditStr.append("; ");
		auditStr.append("\r\n*presComplaint* :");
		auditStr.append(presComplaint);
	    auditStr.append("; ");
		auditStr.append("\r\n*positiveDiagnosis* :");
		if (positiveDiagnosis != null)
		{
			java.util.Iterator it5 = positiveDiagnosis.iterator();
			int i5=0;
			while (it5.hasNext())
			{
				if (i5 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.PatientDiagnosis obj = (ims.core.clinical.domain.objects.PatientDiagnosis)it5.next();
		if (obj != null)
		{
		   if (i5 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i5++;
		}
		if (i5 > 0)
			auditStr.append("] " + i5);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*positiveProcedure* :");
		if (positiveProcedure != null)
		{
			java.util.Iterator it6 = positiveProcedure.iterator();
			int i6=0;
			while (it6.hasNext())
			{
				if (i6 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.PatientProcedure obj = (ims.core.clinical.domain.objects.PatientProcedure)it6.next();
		if (obj != null)
		{
		   if (i6 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i6++;
		}
		if (i6 > 0)
			auditStr.append("] " + i6);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*otherDiagnosis* :");
		if (otherDiagnosis != null)
		{
			java.util.Iterator it7 = otherDiagnosis.iterator();
			int i7=0;
			while (it7.hasNext())
			{
				if (i7 > 0)
					auditStr.append(",");
				ims.clinical.domain.objects.PatientPMHChecklistDiagnosis obj = (ims.clinical.domain.objects.PatientPMHChecklistDiagnosis)it7.next();
		if (obj != null)
		{
		   if (i7 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i7++;
		}
		if (i7 > 0)
			auditStr.append("] " + i7);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*otherProcedure* :");
		if (otherProcedure != null)
		{
			java.util.Iterator it8 = otherProcedure.iterator();
			int i8=0;
			while (it8.hasNext())
			{
				if (i8 > 0)
					auditStr.append(",");
				ims.clinical.domain.objects.PatientPMHChecklistProcedure obj = (ims.clinical.domain.objects.PatientPMHChecklistProcedure)it8.next();
		if (obj != null)
		{
		   if (i8 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i8++;
		}
		if (i8 > 0)
			auditStr.append("] " + i8);
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
		
		String keyClassName = "PatientPMHChecklist";
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
		if (this.getPMHInfoText() != null)
		{
			sb.append("<pMHInfoText>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPMHInfoText().toString()));
			sb.append("</pMHInfoText>");		
		}
		if (this.getPresComplaint() != null)
		{
			sb.append("<presComplaint>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPresComplaint().toString()));
			sb.append("</presComplaint>");		
		}
		if (this.getPositiveDiagnosis() != null)
		{
			if (this.getPositiveDiagnosis().size() > 0 )
			{
			sb.append("<positiveDiagnosis>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPositiveDiagnosis(), domMap));
			sb.append("</positiveDiagnosis>");		
			}
		}
		if (this.getPositiveProcedure() != null)
		{
			if (this.getPositiveProcedure().size() > 0 )
			{
			sb.append("<positiveProcedure>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPositiveProcedure(), domMap));
			sb.append("</positiveProcedure>");		
			}
		}
		if (this.getOtherDiagnosis() != null)
		{
			if (this.getOtherDiagnosis().size() > 0 )
			{
			sb.append("<otherDiagnosis>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getOtherDiagnosis(), domMap));
			sb.append("</otherDiagnosis>");		
			}
		}
		if (this.getOtherProcedure() != null)
		{
			if (this.getOtherProcedure().size() > 0 )
			{
			sb.append("<otherProcedure>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getOtherProcedure(), domMap));
			sb.append("</otherProcedure>");		
			}
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
			PatientPMHChecklist domainObject = getPatientPMHChecklistfromXML(itemEl, factory, domMap);

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
			PatientPMHChecklist domainObject = getPatientPMHChecklistfromXML(itemEl, factory, domMap);

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
		
	public static PatientPMHChecklist getPatientPMHChecklistfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientPMHChecklistfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientPMHChecklist getPatientPMHChecklistfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientPMHChecklist.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientPMHChecklist.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientPMHChecklist class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientPMHChecklist)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientPMHChecklist.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientPMHChecklist ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientPMHChecklist)factory.getImportedDomainObject(PatientPMHChecklist.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientPMHChecklist();
		}
		String keyClassName = "PatientPMHChecklist";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientPMHChecklist)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientPMHChecklist obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
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
		fldEl = el.element("pMHInfoText");
		if(fldEl != null)
		{	
    		obj.setPMHInfoText(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("presComplaint");
		if(fldEl != null)
		{	
    		obj.setPresComplaint(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("positiveDiagnosis");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setPositiveDiagnosis(ims.core.clinical.domain.objects.PatientDiagnosis.fromSetXMLString(fldEl, factory, obj.getPositiveDiagnosis(), domMap));
		}
		fldEl = el.element("positiveProcedure");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setPositiveProcedure(ims.core.clinical.domain.objects.PatientProcedure.fromSetXMLString(fldEl, factory, obj.getPositiveProcedure(), domMap));
		}
		fldEl = el.element("otherDiagnosis");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setOtherDiagnosis(ims.clinical.domain.objects.PatientPMHChecklistDiagnosis.fromSetXMLString(fldEl, factory, obj.getOtherDiagnosis(), domMap));
		}
		fldEl = el.element("otherProcedure");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setOtherProcedure(ims.clinical.domain.objects.PatientPMHChecklistProcedure.fromSetXMLString(fldEl, factory, obj.getOtherProcedure(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "positiveDiagnosis"
		, "positiveProcedure"
		, "otherDiagnosis"
		, "otherProcedure"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String CareContext = "careContext";
		public static final String ClinicalContact = "clinicalContact";
		public static final String PMHInfoText = "pMHInfoText";
		public static final String PresComplaint = "presComplaint";
		public static final String PositiveDiagnosis = "positiveDiagnosis";
		public static final String PositiveProcedure = "positiveProcedure";
		public static final String OtherDiagnosis = "otherDiagnosis";
		public static final String OtherProcedure = "otherProcedure";
	}
}

