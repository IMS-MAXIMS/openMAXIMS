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
package ims.core.patient.domain.objects;

/**
 * 
 * @author Sean Nesbitt
 * Generated.
 */


public class PDSGeneralUpdateRequest extends ims.core.patient.domain.objects.PDSAsyncRequest implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1001100019;
	private static final long serialVersionUID = 1001100019L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Patient reference */
	private ims.core.patient.domain.objects.Patient patient;
	/** code and/or description of error */
	private String pDSAckException;
	/** number of retries */
	private Integer retryCount;
	/** PDS Request Status */
	private ims.domain.lookups.LookupInstance status;
	/** The type of update. */
	private ims.domain.lookups.LookupInstance updateType;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PDSGeneralUpdateRequest (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PDSGeneralUpdateRequest ()
    {
    	super();
    }
    public PDSGeneralUpdateRequest (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.patient.domain.objects.PDSGeneralUpdateRequest.class;
	}


	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public String getPDSAckException() {
		return pDSAckException;
	}
	public void setPDSAckException(String pDSAckException) {
		if ( null != pDSAckException && pDSAckException.length() > 200 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for pDSAckException. Tried to set value: "+
				pDSAckException);
		}
		this.pDSAckException = pDSAckException;
	}

	public Integer getRetryCount() {
		return retryCount;
	}
	public void setRetryCount(Integer retryCount) {
		this.retryCount = retryCount;
	}

	public ims.domain.lookups.LookupInstance getStatus() {
		return status;
	}
	public void setStatus(ims.domain.lookups.LookupInstance status) {
		this.status = status;
	}

	public ims.domain.lookups.LookupInstance getUpdateType() {
		return updateType;
	}
	public void setUpdateType(ims.domain.lookups.LookupInstance updateType) {
		this.updateType = updateType;
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
		
		auditStr.append(super.toAuditString());
		auditStr.append("\r\n*patient* :");
		if (patient != null)
		{
			auditStr.append(toShortClassName(patient));
				
		    auditStr.append(patient.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*pDSAckException* :");
		auditStr.append(pDSAckException);
	    auditStr.append("; ");
		auditStr.append("\r\n*retryCount* :");
		auditStr.append(retryCount);
	    auditStr.append("; ");
		auditStr.append("\r\n*status* :");
		if (status != null)
			auditStr.append(status.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*updateType* :");
		if (updateType != null)
			auditStr.append(updateType.getText());
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
		
		String keyClassName = "PDSGeneralUpdateRequest";
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
		sb.append(super.fieldsToXMLString(domMap));
		if (this.getPatient() != null)
		{
			sb.append("<patient>");
			sb.append(this.getPatient().toXMLString(domMap)); 	
			sb.append("</patient>");		
		}
		if (this.getPDSAckException() != null)
		{
			sb.append("<pDSAckException>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPDSAckException().toString()));
			sb.append("</pDSAckException>");		
		}
		if (this.getRetryCount() != null)
		{
			sb.append("<retryCount>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRetryCount().toString()));
			sb.append("</retryCount>");		
		}
		if (this.getStatus() != null)
		{
			sb.append("<status>");
			sb.append(this.getStatus().toXMLString()); 
			sb.append("</status>");		
		}
		if (this.getUpdateType() != null)
		{
			sb.append("<updateType>");
			sb.append(this.getUpdateType().toXMLString()); 
			sb.append("</updateType>");		
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
			PDSGeneralUpdateRequest domainObject = getPDSGeneralUpdateRequestfromXML(itemEl, factory, domMap);

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
			PDSGeneralUpdateRequest domainObject = getPDSGeneralUpdateRequestfromXML(itemEl, factory, domMap);

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
		
	public static PDSGeneralUpdateRequest getPDSGeneralUpdateRequestfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPDSGeneralUpdateRequestfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PDSGeneralUpdateRequest getPDSGeneralUpdateRequestfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PDSGeneralUpdateRequest.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PDSGeneralUpdateRequest.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PDSGeneralUpdateRequest class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PDSGeneralUpdateRequest)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PDSGeneralUpdateRequest.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PDSGeneralUpdateRequest ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PDSGeneralUpdateRequest)factory.getImportedDomainObject(PDSGeneralUpdateRequest.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PDSGeneralUpdateRequest();
		}
		String keyClassName = "PDSGeneralUpdateRequest";
		Class clz = ret.getClass().getSuperclass();
		while (!clz.equals(ims.domain.DomainObject.class))
		{
			int dotIndex = clz.getName().lastIndexOf(".") + 1;
			keyClassName = clz.getName().substring(dotIndex); 
			clz = clz.getSuperclass();
		}

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PDSGeneralUpdateRequest)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PDSGeneralUpdateRequest obj, java.util.HashMap domMap) throws Exception
	{
		ims.core.patient.domain.objects.PDSAsyncRequest.fillFieldsfromXML(el, factory, obj, domMap);
		org.dom4j.Element fldEl;
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("pDSAckException");
		if(fldEl != null)
		{	
    		obj.setPDSAckException(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("retryCount");
		if(fldEl != null)
		{	
    		obj.setRetryCount(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("status");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("updateType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setUpdateType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		public static final String Patient = "patient";
		public static final String PDSAckException = "pDSAckException";
		public static final String RetryCount = "retryCount";
		public static final String Status = "status";
		public static final String UpdateType = "updateType";
	}
}

