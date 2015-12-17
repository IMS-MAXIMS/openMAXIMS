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


public class OPDSpasticityAssessTreat extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1031100005;
	private static final long serialVersionUID = 1031100005L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** CareContext */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** TreatGoals
	  * Collection of ims.medical.domain.objects.OPDSpasAssessTreatGoal.
	  */
	private java.util.Set treatGoals;
	/** TreatmentPlan
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List treatmentPlan;
	/** BotulismTreat
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List botulismTreatment;
	/** JointContracture */
	private String jointContracture;
	/** LimbFinding
	  * Collection of ims.medical.domain.objects.OPDSpasAssLimbs.
	  */
	private java.util.Set limbFinding;
	/** AuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public OPDSpasticityAssessTreat (Integer id, int ver)
    {
    	super(id, ver);
    }
    public OPDSpasticityAssessTreat ()
    {
    	super();
    }
    public OPDSpasticityAssessTreat (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.medical.domain.objects.OPDSpasticityAssessTreat.class;
	}


	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public java.util.Set getTreatGoals() {
		if ( null == treatGoals ) {
			treatGoals = new java.util.HashSet();
		}
		return treatGoals;
	}
	public void setTreatGoals(java.util.Set paramValue) {
		this.treatGoals = paramValue;
	}

	public java.util.List getTreatmentPlan() {
		if ( null == treatmentPlan ) {
			treatmentPlan = new java.util.ArrayList();
		}
		return treatmentPlan;
	}
	public void setTreatmentPlan(java.util.List paramValue) {
		this.treatmentPlan = paramValue;
	}

	public java.util.List getBotulismTreatment() {
		if ( null == botulismTreatment ) {
			botulismTreatment = new java.util.ArrayList();
		}
		return botulismTreatment;
	}
	public void setBotulismTreatment(java.util.List paramValue) {
		this.botulismTreatment = paramValue;
	}

	public String getJointContracture() {
		return jointContracture;
	}
	public void setJointContracture(String jointContracture) {
		if ( null != jointContracture && jointContracture.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for jointContracture. Tried to set value: "+
				jointContracture);
		}
		this.jointContracture = jointContracture;
	}

	public java.util.Set getLimbFinding() {
		if ( null == limbFinding ) {
			limbFinding = new java.util.HashSet();
		}
		return limbFinding;
	}
	public void setLimbFinding(java.util.Set paramValue) {
		this.limbFinding = paramValue;
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
		
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*treatGoals* :");
		if (treatGoals != null)
		{
			java.util.Iterator it2 = treatGoals.iterator();
			int i2=0;
			while (it2.hasNext())
			{
				if (i2 > 0)
					auditStr.append(",");
				ims.medical.domain.objects.OPDSpasAssessTreatGoal obj = (ims.medical.domain.objects.OPDSpasAssessTreatGoal)it2.next();
		if (obj != null)
		{
		   if (i2 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i2++;
		}
		if (i2 > 0)
			auditStr.append("] " + i2);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*treatmentPlan* :");
		if (treatmentPlan != null)
		{
			java.util.Iterator it3 = treatmentPlan.iterator();
			int i3=0;
			while (it3.hasNext())
			{
				if (i3 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it3.next();
			auditStr.append(obj.getText());
			i3++;
		}
		if (i3 > 0)
			auditStr.append("] " + i3);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*botulismTreatment* :");
		if (botulismTreatment != null)
		{
			java.util.Iterator it4 = botulismTreatment.iterator();
			int i4=0;
			while (it4.hasNext())
			{
				if (i4 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it4.next();
			auditStr.append(obj.getText());
			i4++;
		}
		if (i4 > 0)
			auditStr.append("] " + i4);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*jointContracture* :");
		auditStr.append(jointContracture);
	    auditStr.append("; ");
		auditStr.append("\r\n*limbFinding* :");
		if (limbFinding != null)
		{
			java.util.Iterator it6 = limbFinding.iterator();
			int i6=0;
			while (it6.hasNext())
			{
				if (i6 > 0)
					auditStr.append(",");
				ims.medical.domain.objects.OPDSpasAssLimbs obj = (ims.medical.domain.objects.OPDSpasAssLimbs)it6.next();
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
		
		String keyClassName = "OPDSpasticityAssessTreat";
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
		if (this.getTreatGoals() != null)
		{
			if (this.getTreatGoals().size() > 0 )
			{
			sb.append("<treatGoals>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getTreatGoals(), domMap));
			sb.append("</treatGoals>");		
			}
		}
		if (this.getTreatmentPlan() != null)
		{
			if (this.getTreatmentPlan().size() > 0 )
			{
			sb.append("<treatmentPlan>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getTreatmentPlan())); 
			sb.append("</treatmentPlan>");		
			}
		}
		if (this.getBotulismTreatment() != null)
		{
			if (this.getBotulismTreatment().size() > 0 )
			{
			sb.append("<botulismTreatment>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getBotulismTreatment())); 
			sb.append("</botulismTreatment>");		
			}
		}
		if (this.getJointContracture() != null)
		{
			sb.append("<jointContracture>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getJointContracture().toString()));
			sb.append("</jointContracture>");		
		}
		if (this.getLimbFinding() != null)
		{
			if (this.getLimbFinding().size() > 0 )
			{
			sb.append("<limbFinding>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getLimbFinding(), domMap));
			sb.append("</limbFinding>");		
			}
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
			OPDSpasticityAssessTreat domainObject = getOPDSpasticityAssessTreatfromXML(itemEl, factory, domMap);

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
			OPDSpasticityAssessTreat domainObject = getOPDSpasticityAssessTreatfromXML(itemEl, factory, domMap);

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
		
	public static OPDSpasticityAssessTreat getOPDSpasticityAssessTreatfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getOPDSpasticityAssessTreatfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static OPDSpasticityAssessTreat getOPDSpasticityAssessTreatfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!OPDSpasticityAssessTreat.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!OPDSpasticityAssessTreat.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the OPDSpasticityAssessTreat class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (OPDSpasticityAssessTreat)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(OPDSpasticityAssessTreat.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		OPDSpasticityAssessTreat ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (OPDSpasticityAssessTreat)factory.getImportedDomainObject(OPDSpasticityAssessTreat.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new OPDSpasticityAssessTreat();
		}
		String keyClassName = "OPDSpasticityAssessTreat";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (OPDSpasticityAssessTreat)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, OPDSpasticityAssessTreat obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("treatGoals");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setTreatGoals(ims.medical.domain.objects.OPDSpasAssessTreatGoal.fromSetXMLString(fldEl, factory, obj.getTreatGoals(), domMap));
		}
		fldEl = el.element("treatmentPlan");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setTreatmentPlan(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getTreatmentPlan())); 
		}
		fldEl = el.element("botulismTreatment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setBotulismTreatment(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getBotulismTreatment())); 
		}
		fldEl = el.element("jointContracture");
		if(fldEl != null)
		{	
    		obj.setJointContracture(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("limbFinding");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setLimbFinding(ims.medical.domain.objects.OPDSpasAssLimbs.fromSetXMLString(fldEl, factory, obj.getLimbFinding(), domMap));
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
		 "treatGoals"
		, "treatmentPlan"
		, "botulismTreatment"
		, "limbFinding"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String CareContext = "careContext";
		public static final String TreatGoals = "treatGoals";
		public static final String TreatmentPlan = "treatmentPlan";
		public static final String BotulismTreatment = "botulismTreatment";
		public static final String JointContracture = "jointContracture";
		public static final String LimbFinding = "limbFinding";
		public static final String AuthoringInformation = "authoringInformation";
	}
}

