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
package ims.medical.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class OPDErectDysfxn extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1031100008;
	private static final long serialVersionUID = 1031100008L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Erection - Subjective */
	private ims.domain.lookups.LookupInstance erectionQual;
	/** ConsetnFormSigned */
	private ims.domain.lookups.LookupInstance consetnFormSigned;
	/** Treatments Dsicussed */
	private ims.domain.lookups.LookupInstance treatDiscussed;
	/** AdvLeafletGiven */
	private ims.domain.lookups.LookupInstance advLeafletGiven;
	/** ActualLeafletsGiven
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List actualLeafletsGiven;
	/** Actual Treatments Discussed
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List actualTreatmentDiscussed;
	/** TreatmentHistory
	  * Collection of ims.medical.domain.objects.OPDErectDysfxTreatments.
	  */
	private java.util.Set treatmentHistory;
	/** CareContext */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** AuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public OPDErectDysfxn (Integer id, int ver)
    {
    	super(id, ver);
    }
    public OPDErectDysfxn ()
    {
    	super();
    }
    public OPDErectDysfxn (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.medical.domain.objects.OPDErectDysfxn.class;
	}


	public ims.domain.lookups.LookupInstance getErectionQual() {
		return erectionQual;
	}
	public void setErectionQual(ims.domain.lookups.LookupInstance erectionQual) {
		this.erectionQual = erectionQual;
	}

	public ims.domain.lookups.LookupInstance getConsetnFormSigned() {
		return consetnFormSigned;
	}
	public void setConsetnFormSigned(ims.domain.lookups.LookupInstance consetnFormSigned) {
		this.consetnFormSigned = consetnFormSigned;
	}

	public ims.domain.lookups.LookupInstance getTreatDiscussed() {
		return treatDiscussed;
	}
	public void setTreatDiscussed(ims.domain.lookups.LookupInstance treatDiscussed) {
		this.treatDiscussed = treatDiscussed;
	}

	public ims.domain.lookups.LookupInstance getAdvLeafletGiven() {
		return advLeafletGiven;
	}
	public void setAdvLeafletGiven(ims.domain.lookups.LookupInstance advLeafletGiven) {
		this.advLeafletGiven = advLeafletGiven;
	}

	public java.util.List getActualLeafletsGiven() {
		if ( null == actualLeafletsGiven ) {
			actualLeafletsGiven = new java.util.ArrayList();
		}
		return actualLeafletsGiven;
	}
	public void setActualLeafletsGiven(java.util.List paramValue) {
		this.actualLeafletsGiven = paramValue;
	}

	public java.util.List getActualTreatmentDiscussed() {
		if ( null == actualTreatmentDiscussed ) {
			actualTreatmentDiscussed = new java.util.ArrayList();
		}
		return actualTreatmentDiscussed;
	}
	public void setActualTreatmentDiscussed(java.util.List paramValue) {
		this.actualTreatmentDiscussed = paramValue;
	}

	public java.util.Set getTreatmentHistory() {
		if ( null == treatmentHistory ) {
			treatmentHistory = new java.util.HashSet();
		}
		return treatmentHistory;
	}
	public void setTreatmentHistory(java.util.Set paramValue) {
		this.treatmentHistory = paramValue;
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
		
		auditStr.append("\r\n*erectionQual* :");
		if (erectionQual != null)
			auditStr.append(erectionQual.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*consetnFormSigned* :");
		if (consetnFormSigned != null)
			auditStr.append(consetnFormSigned.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*treatDiscussed* :");
		if (treatDiscussed != null)
			auditStr.append(treatDiscussed.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*advLeafletGiven* :");
		if (advLeafletGiven != null)
			auditStr.append(advLeafletGiven.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*actualLeafletsGiven* :");
		if (actualLeafletsGiven != null)
		{
			java.util.Iterator it5 = actualLeafletsGiven.iterator();
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
		auditStr.append("\r\n*actualTreatmentDiscussed* :");
		if (actualTreatmentDiscussed != null)
		{
			java.util.Iterator it6 = actualTreatmentDiscussed.iterator();
			int i6=0;
			while (it6.hasNext())
			{
				if (i6 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it6.next();
			auditStr.append(obj.getText());
			i6++;
		}
		if (i6 > 0)
			auditStr.append("] " + i6);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*treatmentHistory* :");
		if (treatmentHistory != null)
		{
			java.util.Iterator it7 = treatmentHistory.iterator();
			int i7=0;
			while (it7.hasNext())
			{
				if (i7 > 0)
					auditStr.append(",");
				ims.medical.domain.objects.OPDErectDysfxTreatments obj = (ims.medical.domain.objects.OPDErectDysfxTreatments)it7.next();
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
		
		String keyClassName = "OPDErectDysfxn";
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
		if (this.getErectionQual() != null)
		{
			sb.append("<erectionQual>");
			sb.append(this.getErectionQual().toXMLString()); 
			sb.append("</erectionQual>");		
		}
		if (this.getConsetnFormSigned() != null)
		{
			sb.append("<consetnFormSigned>");
			sb.append(this.getConsetnFormSigned().toXMLString()); 
			sb.append("</consetnFormSigned>");		
		}
		if (this.getTreatDiscussed() != null)
		{
			sb.append("<treatDiscussed>");
			sb.append(this.getTreatDiscussed().toXMLString()); 
			sb.append("</treatDiscussed>");		
		}
		if (this.getAdvLeafletGiven() != null)
		{
			sb.append("<advLeafletGiven>");
			sb.append(this.getAdvLeafletGiven().toXMLString()); 
			sb.append("</advLeafletGiven>");		
		}
		if (this.getActualLeafletsGiven() != null)
		{
			if (this.getActualLeafletsGiven().size() > 0 )
			{
			sb.append("<actualLeafletsGiven>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getActualLeafletsGiven())); 
			sb.append("</actualLeafletsGiven>");		
			}
		}
		if (this.getActualTreatmentDiscussed() != null)
		{
			if (this.getActualTreatmentDiscussed().size() > 0 )
			{
			sb.append("<actualTreatmentDiscussed>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getActualTreatmentDiscussed())); 
			sb.append("</actualTreatmentDiscussed>");		
			}
		}
		if (this.getTreatmentHistory() != null)
		{
			if (this.getTreatmentHistory().size() > 0 )
			{
			sb.append("<treatmentHistory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getTreatmentHistory(), domMap));
			sb.append("</treatmentHistory>");		
			}
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
			OPDErectDysfxn domainObject = getOPDErectDysfxnfromXML(itemEl, factory, domMap);

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
			OPDErectDysfxn domainObject = getOPDErectDysfxnfromXML(itemEl, factory, domMap);

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
		
	public static OPDErectDysfxn getOPDErectDysfxnfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getOPDErectDysfxnfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static OPDErectDysfxn getOPDErectDysfxnfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!OPDErectDysfxn.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!OPDErectDysfxn.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the OPDErectDysfxn class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (OPDErectDysfxn)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(OPDErectDysfxn.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		OPDErectDysfxn ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (OPDErectDysfxn)factory.getImportedDomainObject(OPDErectDysfxn.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new OPDErectDysfxn();
		}
		String keyClassName = "OPDErectDysfxn";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (OPDErectDysfxn)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, OPDErectDysfxn obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("erectionQual");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setErectionQual(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("consetnFormSigned");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setConsetnFormSigned(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("treatDiscussed");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTreatDiscussed(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("advLeafletGiven");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAdvLeafletGiven(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("actualLeafletsGiven");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setActualLeafletsGiven(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getActualLeafletsGiven())); 
		}
		fldEl = el.element("actualTreatmentDiscussed");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setActualTreatmentDiscussed(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getActualTreatmentDiscussed())); 
		}
		fldEl = el.element("treatmentHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setTreatmentHistory(ims.medical.domain.objects.OPDErectDysfxTreatments.fromSetXMLString(fldEl, factory, obj.getTreatmentHistory(), domMap));
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
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "actualLeafletsGiven"
		, "actualTreatmentDiscussed"
		, "treatmentHistory"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String ErectionQual = "erectionQual";
		public static final String ConsetnFormSigned = "consetnFormSigned";
		public static final String TreatDiscussed = "treatDiscussed";
		public static final String AdvLeafletGiven = "advLeafletGiven";
		public static final String ActualLeafletsGiven = "actualLeafletsGiven";
		public static final String ActualTreatmentDiscussed = "actualTreatmentDiscussed";
		public static final String TreatmentHistory = "treatmentHistory";
		public static final String CareContext = "careContext";
		public static final String AuthoringInformation = "authoringInformation";
	}
}

