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
 * @author Kevin O'Carroll
 * Generated.
 */


public class DeathDetails extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1003100060;
	private static final long serialVersionUID = 1003100060L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** DeathPlaceofDeath */
	private ims.domain.lookups.LookupInstance deathPlaceofDeath;
	/** DeathCauseEstablished */
	private ims.domain.lookups.LookupInstance deathCauseEstablished;
	/** CancerRelatedDeath */
	private ims.domain.lookups.LookupInstance cancerRelatedDeath;
	/** DeathCodeDiscrepency */
	private ims.domain.lookups.LookupInstance deathCodeDiscrepency;
	/** DeathConditions
	  * Collection of ims.core.clinical.domain.objects.DeathConditions.
	  */
	private java.util.Set deathConditions;
	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** Referred to Coroner? */
	private Boolean referredToCorroner;
	/** Post Mortem */
	private ims.domain.lookups.LookupInstance postMortem;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public DeathDetails (Integer id, int ver)
    {
    	super(id, ver);
    }
    public DeathDetails ()
    {
    	super();
    }
    public DeathDetails (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.DeathDetails.class;
	}


	public ims.domain.lookups.LookupInstance getDeathPlaceofDeath() {
		return deathPlaceofDeath;
	}
	public void setDeathPlaceofDeath(ims.domain.lookups.LookupInstance deathPlaceofDeath) {
		this.deathPlaceofDeath = deathPlaceofDeath;
	}

	public ims.domain.lookups.LookupInstance getDeathCauseEstablished() {
		return deathCauseEstablished;
	}
	public void setDeathCauseEstablished(ims.domain.lookups.LookupInstance deathCauseEstablished) {
		this.deathCauseEstablished = deathCauseEstablished;
	}

	public ims.domain.lookups.LookupInstance getCancerRelatedDeath() {
		return cancerRelatedDeath;
	}
	public void setCancerRelatedDeath(ims.domain.lookups.LookupInstance cancerRelatedDeath) {
		this.cancerRelatedDeath = cancerRelatedDeath;
	}

	public ims.domain.lookups.LookupInstance getDeathCodeDiscrepency() {
		return deathCodeDiscrepency;
	}
	public void setDeathCodeDiscrepency(ims.domain.lookups.LookupInstance deathCodeDiscrepency) {
		this.deathCodeDiscrepency = deathCodeDiscrepency;
	}

	public java.util.Set getDeathConditions() {
		if ( null == deathConditions ) {
			deathConditions = new java.util.HashSet();
		}
		return deathConditions;
	}
	public void setDeathConditions(java.util.Set paramValue) {
		this.deathConditions = paramValue;
	}

	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public Boolean isReferredToCorroner() {
		return referredToCorroner;
	}
	public void setReferredToCorroner(Boolean referredToCorroner) {
		this.referredToCorroner = referredToCorroner;
	}

	public ims.domain.lookups.LookupInstance getPostMortem() {
		return postMortem;
	}
	public void setPostMortem(ims.domain.lookups.LookupInstance postMortem) {
		this.postMortem = postMortem;
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
		
		auditStr.append("\r\n*deathPlaceofDeath* :");
		if (deathPlaceofDeath != null)
			auditStr.append(deathPlaceofDeath.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*deathCauseEstablished* :");
		if (deathCauseEstablished != null)
			auditStr.append(deathCauseEstablished.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*cancerRelatedDeath* :");
		if (cancerRelatedDeath != null)
			auditStr.append(cancerRelatedDeath.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*deathCodeDiscrepency* :");
		if (deathCodeDiscrepency != null)
			auditStr.append(deathCodeDiscrepency.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*deathConditions* :");
		if (deathConditions != null)
		{
			java.util.Iterator it5 = deathConditions.iterator();
			int i5=0;
			while (it5.hasNext())
			{
				if (i5 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.DeathConditions obj = (ims.core.clinical.domain.objects.DeathConditions)it5.next();
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
		auditStr.append("\r\n*patient* :");
		if (patient != null)
		{
			auditStr.append(toShortClassName(patient));
				
		    auditStr.append(patient.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*referredToCorroner* :");
		auditStr.append(referredToCorroner);
	    auditStr.append("; ");
		auditStr.append("\r\n*postMortem* :");
		if (postMortem != null)
			auditStr.append(postMortem.getText());
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
		
		String keyClassName = "DeathDetails";
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
		if (this.getDeathPlaceofDeath() != null)
		{
			sb.append("<deathPlaceofDeath>");
			sb.append(this.getDeathPlaceofDeath().toXMLString()); 
			sb.append("</deathPlaceofDeath>");		
		}
		if (this.getDeathCauseEstablished() != null)
		{
			sb.append("<deathCauseEstablished>");
			sb.append(this.getDeathCauseEstablished().toXMLString()); 
			sb.append("</deathCauseEstablished>");		
		}
		if (this.getCancerRelatedDeath() != null)
		{
			sb.append("<cancerRelatedDeath>");
			sb.append(this.getCancerRelatedDeath().toXMLString()); 
			sb.append("</cancerRelatedDeath>");		
		}
		if (this.getDeathCodeDiscrepency() != null)
		{
			sb.append("<deathCodeDiscrepency>");
			sb.append(this.getDeathCodeDiscrepency().toXMLString()); 
			sb.append("</deathCodeDiscrepency>");		
		}
		if (this.getDeathConditions() != null)
		{
			if (this.getDeathConditions().size() > 0 )
			{
			sb.append("<deathConditions>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getDeathConditions(), domMap));
			sb.append("</deathConditions>");		
			}
		}
		if (this.getPatient() != null)
		{
			sb.append("<patient>");
			sb.append(this.getPatient().toXMLString(domMap)); 	
			sb.append("</patient>");		
		}
		if (this.isReferredToCorroner() != null)
		{
			sb.append("<referredToCorroner>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isReferredToCorroner().toString()));
			sb.append("</referredToCorroner>");		
		}
		if (this.getPostMortem() != null)
		{
			sb.append("<postMortem>");
			sb.append(this.getPostMortem().toXMLString()); 
			sb.append("</postMortem>");		
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
			DeathDetails domainObject = getDeathDetailsfromXML(itemEl, factory, domMap);

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
			DeathDetails domainObject = getDeathDetailsfromXML(itemEl, factory, domMap);

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
		
	public static DeathDetails getDeathDetailsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getDeathDetailsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static DeathDetails getDeathDetailsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!DeathDetails.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!DeathDetails.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the DeathDetails class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (DeathDetails)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(DeathDetails.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		DeathDetails ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (DeathDetails)factory.getImportedDomainObject(DeathDetails.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new DeathDetails();
		}
		String keyClassName = "DeathDetails";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (DeathDetails)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, DeathDetails obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("deathPlaceofDeath");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDeathPlaceofDeath(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("deathCauseEstablished");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDeathCauseEstablished(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("cancerRelatedDeath");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCancerRelatedDeath(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("deathCodeDiscrepency");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDeathCodeDiscrepency(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("deathConditions");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setDeathConditions(ims.core.clinical.domain.objects.DeathConditions.fromSetXMLString(fldEl, factory, obj.getDeathConditions(), domMap));
		}
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("referredToCorroner");
		if(fldEl != null)
		{	
    		obj.setReferredToCorroner(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("postMortem");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPostMortem(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "deathConditions"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String DeathPlaceofDeath = "deathPlaceofDeath";
		public static final String DeathCauseEstablished = "deathCauseEstablished";
		public static final String CancerRelatedDeath = "cancerRelatedDeath";
		public static final String DeathCodeDiscrepency = "deathCodeDiscrepency";
		public static final String DeathConditions = "deathConditions";
		public static final String Patient = "patient";
		public static final String ReferredToCorroner = "referredToCorroner";
		public static final String PostMortem = "postMortem";
	}
}

