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
 * @author Sinead McDermott
 * Generated.
 */


public class PatientInvasiveDevice extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100043;
	private static final long serialVersionUID = 1072100043L;
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
	/** Invasive Device */
	private ims.clinical.configuration.domain.objects.InvasiveDeviceConfig invasiveDevice;
	/** Type */
	private ims.clinical.configuration.domain.objects.InvasiveDeviceType type;
	/** Size */
	private ims.clinical.configuration.domain.objects.InvasiveDeviceConfigSize size;
	/** Site  */
	private String site;
	/** Comment */
	private String comment;
	/** Inserted Date / Time */
	private java.util.Date insertedDateTime;
	/** Inserted HCP */
	private ims.core.resource.people.domain.objects.Hcp insertedHCP;
	/** Target Removal Date / Time - Calculated */
	private java.util.Date targetRemovalDateTime;
	/** Removal Date / Time */
	private java.util.Date removalDateTime;
	/** Removal HCP */
	private ims.core.resource.people.domain.objects.Hcp removalHCP;
	/** Removal Reason */
	private ims.domain.lookups.LookupInstance removalReason;
	/** Sent For Culture */
	private ims.domain.lookups.LookupInstance sentForCulture;
	/** Result */
	private String result;
	/** VIP Score - Integer value 0 - 5
	  * Collection of ims.clinical.domain.objects.VIPScore.
	  */
	private java.util.List vIPScore;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatientInvasiveDevice (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientInvasiveDevice ()
    {
    	super();
    }
    public PatientInvasiveDevice (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.domain.objects.PatientInvasiveDevice.class;
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

	public ims.clinical.configuration.domain.objects.InvasiveDeviceConfig getInvasiveDevice() {
		return invasiveDevice;
	}
	public void setInvasiveDevice(ims.clinical.configuration.domain.objects.InvasiveDeviceConfig invasiveDevice) {
		this.invasiveDevice = invasiveDevice;
	}

	public ims.clinical.configuration.domain.objects.InvasiveDeviceType getType() {
		return type;
	}
	public void setType(ims.clinical.configuration.domain.objects.InvasiveDeviceType type) {
		this.type = type;
	}

	public ims.clinical.configuration.domain.objects.InvasiveDeviceConfigSize getSize() {
		return size;
	}
	public void setSize(ims.clinical.configuration.domain.objects.InvasiveDeviceConfigSize size) {
		this.size = size;
	}

	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		if ( null != site && site.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for site. Tried to set value: "+
				site);
		}
		this.site = site;
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

	public java.util.Date getInsertedDateTime() {
		return insertedDateTime;
	}
	public void setInsertedDateTime(java.util.Date insertedDateTime) {
		this.insertedDateTime = insertedDateTime;
	}

	public ims.core.resource.people.domain.objects.Hcp getInsertedHCP() {
		return insertedHCP;
	}
	public void setInsertedHCP(ims.core.resource.people.domain.objects.Hcp insertedHCP) {
		this.insertedHCP = insertedHCP;
	}

	public java.util.Date getTargetRemovalDateTime() {
		return targetRemovalDateTime;
	}
	public void setTargetRemovalDateTime(java.util.Date targetRemovalDateTime) {
		this.targetRemovalDateTime = targetRemovalDateTime;
	}

	public java.util.Date getRemovalDateTime() {
		return removalDateTime;
	}
	public void setRemovalDateTime(java.util.Date removalDateTime) {
		this.removalDateTime = removalDateTime;
	}

	public ims.core.resource.people.domain.objects.Hcp getRemovalHCP() {
		return removalHCP;
	}
	public void setRemovalHCP(ims.core.resource.people.domain.objects.Hcp removalHCP) {
		this.removalHCP = removalHCP;
	}

	public ims.domain.lookups.LookupInstance getRemovalReason() {
		return removalReason;
	}
	public void setRemovalReason(ims.domain.lookups.LookupInstance removalReason) {
		this.removalReason = removalReason;
	}

	public ims.domain.lookups.LookupInstance getSentForCulture() {
		return sentForCulture;
	}
	public void setSentForCulture(ims.domain.lookups.LookupInstance sentForCulture) {
		this.sentForCulture = sentForCulture;
	}

	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		if ( null != result && result.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for result. Tried to set value: "+
				result);
		}
		this.result = result;
	}

	public java.util.List getVIPScore() {
		if ( null == vIPScore ) {
			vIPScore = new java.util.ArrayList();
		}
		return vIPScore;
	}
	public void setVIPScore(java.util.List paramValue) {
		this.vIPScore = paramValue;
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
		auditStr.append("\r\n*invasiveDevice* :");
		if (invasiveDevice != null)
		{
			auditStr.append(toShortClassName(invasiveDevice));
				
		    auditStr.append(invasiveDevice.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*type* :");
		if (type != null)
		{
			auditStr.append(toShortClassName(type));
				
		    auditStr.append(type.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*size* :");
		if (size != null)
		{
			auditStr.append(toShortClassName(size));
				
		    auditStr.append(size.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*site* :");
		auditStr.append(site);
	    auditStr.append("; ");
		auditStr.append("\r\n*comment* :");
		auditStr.append(comment);
	    auditStr.append("; ");
		auditStr.append("\r\n*insertedDateTime* :");
		auditStr.append(insertedDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*insertedHCP* :");
		if (insertedHCP != null)
		{
			auditStr.append(toShortClassName(insertedHCP));
				
		    auditStr.append(insertedHCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*targetRemovalDateTime* :");
		auditStr.append(targetRemovalDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*removalDateTime* :");
		auditStr.append(removalDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*removalHCP* :");
		if (removalHCP != null)
		{
			auditStr.append(toShortClassName(removalHCP));
				
		    auditStr.append(removalHCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*removalReason* :");
		if (removalReason != null)
			auditStr.append(removalReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*sentForCulture* :");
		if (sentForCulture != null)
			auditStr.append(sentForCulture.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*result* :");
		auditStr.append(result);
	    auditStr.append("; ");
		auditStr.append("\r\n*vIPScore* :");
		if (vIPScore != null)
		{
		int i17=0;
		for (i17=0; i17<vIPScore.size(); i17++)
		{
			if (i17 > 0)
				auditStr.append(",");
			ims.clinical.domain.objects.VIPScore obj = (ims.clinical.domain.objects.VIPScore)vIPScore.get(i17);
		    if (obj != null)
			{
				if (i17 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i17 > 0)
			auditStr.append("] " + i17);
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
		
		String keyClassName = "PatientInvasiveDevice";
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
		if (this.getInvasiveDevice() != null)
		{
			sb.append("<invasiveDevice>");
			sb.append(this.getInvasiveDevice().toXMLString(domMap)); 	
			sb.append("</invasiveDevice>");		
		}
		if (this.getType() != null)
		{
			sb.append("<type>");
			sb.append(this.getType().toXMLString(domMap)); 	
			sb.append("</type>");		
		}
		if (this.getSize() != null)
		{
			sb.append("<size>");
			sb.append(this.getSize().toXMLString(domMap)); 	
			sb.append("</size>");		
		}
		if (this.getSite() != null)
		{
			sb.append("<site>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSite().toString()));
			sb.append("</site>");		
		}
		if (this.getComment() != null)
		{
			sb.append("<comment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComment().toString()));
			sb.append("</comment>");		
		}
		if (this.getInsertedDateTime() != null)
		{
			sb.append("<insertedDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getInsertedDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</insertedDateTime>");		
		}
		if (this.getInsertedHCP() != null)
		{
			sb.append("<insertedHCP>");
			sb.append(this.getInsertedHCP().toXMLString(domMap)); 	
			sb.append("</insertedHCP>");		
		}
		if (this.getTargetRemovalDateTime() != null)
		{
			sb.append("<targetRemovalDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getTargetRemovalDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</targetRemovalDateTime>");		
		}
		if (this.getRemovalDateTime() != null)
		{
			sb.append("<removalDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getRemovalDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</removalDateTime>");		
		}
		if (this.getRemovalHCP() != null)
		{
			sb.append("<removalHCP>");
			sb.append(this.getRemovalHCP().toXMLString(domMap)); 	
			sb.append("</removalHCP>");		
		}
		if (this.getRemovalReason() != null)
		{
			sb.append("<removalReason>");
			sb.append(this.getRemovalReason().toXMLString()); 
			sb.append("</removalReason>");		
		}
		if (this.getSentForCulture() != null)
		{
			sb.append("<sentForCulture>");
			sb.append(this.getSentForCulture().toXMLString()); 
			sb.append("</sentForCulture>");		
		}
		if (this.getResult() != null)
		{
			sb.append("<result>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getResult().toString()));
			sb.append("</result>");		
		}
		if (this.getVIPScore() != null)
		{
			if (this.getVIPScore().size() > 0 )
			{
			sb.append("<vIPScore>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getVIPScore(), domMap));
			sb.append("</vIPScore>");		
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
			PatientInvasiveDevice domainObject = getPatientInvasiveDevicefromXML(itemEl, factory, domMap);

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
			PatientInvasiveDevice domainObject = getPatientInvasiveDevicefromXML(itemEl, factory, domMap);

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
		
	public static PatientInvasiveDevice getPatientInvasiveDevicefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientInvasiveDevicefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientInvasiveDevice getPatientInvasiveDevicefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientInvasiveDevice.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientInvasiveDevice.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientInvasiveDevice class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientInvasiveDevice)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientInvasiveDevice.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientInvasiveDevice ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientInvasiveDevice)factory.getImportedDomainObject(PatientInvasiveDevice.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientInvasiveDevice();
		}
		String keyClassName = "PatientInvasiveDevice";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientInvasiveDevice)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientInvasiveDevice obj, java.util.HashMap domMap) throws Exception
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
		fldEl = el.element("invasiveDevice");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setInvasiveDevice(ims.clinical.configuration.domain.objects.InvasiveDeviceConfig.getInvasiveDeviceConfigfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("type");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setType(ims.clinical.configuration.domain.objects.InvasiveDeviceType.getInvasiveDeviceTypefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("size");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSize(ims.clinical.configuration.domain.objects.InvasiveDeviceConfigSize.getInvasiveDeviceConfigSizefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("site");
		if(fldEl != null)
		{	
    		obj.setSite(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("comment");
		if(fldEl != null)
		{	
    		obj.setComment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("insertedDateTime");
		if(fldEl != null)
		{	
    		obj.setInsertedDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("insertedHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setInsertedHCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("targetRemovalDateTime");
		if(fldEl != null)
		{	
    		obj.setTargetRemovalDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("removalDateTime");
		if(fldEl != null)
		{	
    		obj.setRemovalDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("removalHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRemovalHCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("removalReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRemovalReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("sentForCulture");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSentForCulture(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("result");
		if(fldEl != null)
		{	
    		obj.setResult(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("vIPScore");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setVIPScore(ims.clinical.domain.objects.VIPScore.fromListXMLString(fldEl, factory, obj.getVIPScore(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "vIPScore"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String ClinicalContact = "clinicalContact";
		public static final String CareContext = "careContext";
		public static final String AuthoringInformation = "authoringInformation";
		public static final String InvasiveDevice = "invasiveDevice";
		public static final String Type = "type";
		public static final String Size = "size";
		public static final String Site = "site";
		public static final String Comment = "comment";
		public static final String InsertedDateTime = "insertedDateTime";
		public static final String InsertedHCP = "insertedHCP";
		public static final String TargetRemovalDateTime = "targetRemovalDateTime";
		public static final String RemovalDateTime = "removalDateTime";
		public static final String RemovalHCP = "removalHCP";
		public static final String RemovalReason = "removalReason";
		public static final String SentForCulture = "sentForCulture";
		public static final String Result = "result";
		public static final String VIPScore = "vIPScore";
	}
}

