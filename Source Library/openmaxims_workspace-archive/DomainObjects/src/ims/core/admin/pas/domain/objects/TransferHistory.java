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
package ims.core.admin.pas.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class TransferHistory extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1014100016;
	private static final long serialVersionUID = 1014100016L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Transferring From Ward */
	private ims.core.resource.place.domain.objects.Location transferringFromWard;
	/** Marked for Transfer Out Date Time */
	private java.util.Date markedForTransferOutDateTime;
	/** User who transferred patient out */
	private ims.core.configuration.domain.objects.AppUser transferOutUser;
	/** Accepting or Rejecting Ward */
	private ims.core.resource.place.domain.objects.Location acceptingOrRejectingWard;
	/** Accept Transfer Date Time */
	private java.util.Date acceptTransferDateTime;
	/** User who accepted Transfer In */
	private ims.core.configuration.domain.objects.AppUser acceptingTransferUser;
	/** Reject Transfer DateTime */
	private java.util.Date rejectTransferDateTime;
	/** User who rejected Transfer In */
	private ims.core.configuration.domain.objects.AppUser rejectTransferUser;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public TransferHistory (Integer id, int ver)
    {
    	super(id, ver);
    }
    public TransferHistory ()
    {
    	super();
    }
    public TransferHistory (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.admin.pas.domain.objects.TransferHistory.class;
	}


	public ims.core.resource.place.domain.objects.Location getTransferringFromWard() {
		return transferringFromWard;
	}
	public void setTransferringFromWard(ims.core.resource.place.domain.objects.Location transferringFromWard) {
		this.transferringFromWard = transferringFromWard;
	}

	public java.util.Date getMarkedForTransferOutDateTime() {
		return markedForTransferOutDateTime;
	}
	public void setMarkedForTransferOutDateTime(java.util.Date markedForTransferOutDateTime) {
		this.markedForTransferOutDateTime = markedForTransferOutDateTime;
	}

	public ims.core.configuration.domain.objects.AppUser getTransferOutUser() {
		return transferOutUser;
	}
	public void setTransferOutUser(ims.core.configuration.domain.objects.AppUser transferOutUser) {
		this.transferOutUser = transferOutUser;
	}

	public ims.core.resource.place.domain.objects.Location getAcceptingOrRejectingWard() {
		return acceptingOrRejectingWard;
	}
	public void setAcceptingOrRejectingWard(ims.core.resource.place.domain.objects.Location acceptingOrRejectingWard) {
		this.acceptingOrRejectingWard = acceptingOrRejectingWard;
	}

	public java.util.Date getAcceptTransferDateTime() {
		return acceptTransferDateTime;
	}
	public void setAcceptTransferDateTime(java.util.Date acceptTransferDateTime) {
		this.acceptTransferDateTime = acceptTransferDateTime;
	}

	public ims.core.configuration.domain.objects.AppUser getAcceptingTransferUser() {
		return acceptingTransferUser;
	}
	public void setAcceptingTransferUser(ims.core.configuration.domain.objects.AppUser acceptingTransferUser) {
		this.acceptingTransferUser = acceptingTransferUser;
	}

	public java.util.Date getRejectTransferDateTime() {
		return rejectTransferDateTime;
	}
	public void setRejectTransferDateTime(java.util.Date rejectTransferDateTime) {
		this.rejectTransferDateTime = rejectTransferDateTime;
	}

	public ims.core.configuration.domain.objects.AppUser getRejectTransferUser() {
		return rejectTransferUser;
	}
	public void setRejectTransferUser(ims.core.configuration.domain.objects.AppUser rejectTransferUser) {
		this.rejectTransferUser = rejectTransferUser;
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
		
		auditStr.append("\r\n*transferringFromWard* :");
		if (transferringFromWard != null)
		{
			auditStr.append(toShortClassName(transferringFromWard));
				
		    auditStr.append(transferringFromWard.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*markedForTransferOutDateTime* :");
		auditStr.append(markedForTransferOutDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*transferOutUser* :");
		if (transferOutUser != null)
		{
			auditStr.append(toShortClassName(transferOutUser));
				
		    auditStr.append(transferOutUser.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*acceptingOrRejectingWard* :");
		if (acceptingOrRejectingWard != null)
		{
			auditStr.append(toShortClassName(acceptingOrRejectingWard));
				
		    auditStr.append(acceptingOrRejectingWard.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*acceptTransferDateTime* :");
		auditStr.append(acceptTransferDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*acceptingTransferUser* :");
		if (acceptingTransferUser != null)
		{
			auditStr.append(toShortClassName(acceptingTransferUser));
				
		    auditStr.append(acceptingTransferUser.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*rejectTransferDateTime* :");
		auditStr.append(rejectTransferDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*rejectTransferUser* :");
		if (rejectTransferUser != null)
		{
			auditStr.append(toShortClassName(rejectTransferUser));
				
		    auditStr.append(rejectTransferUser.getId());
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
		
		String keyClassName = "TransferHistory";
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
		if (this.getTransferringFromWard() != null)
		{
			sb.append("<transferringFromWard>");
			sb.append(this.getTransferringFromWard().toXMLString(domMap)); 	
			sb.append("</transferringFromWard>");		
		}
		if (this.getMarkedForTransferOutDateTime() != null)
		{
			sb.append("<markedForTransferOutDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getMarkedForTransferOutDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</markedForTransferOutDateTime>");		
		}
		if (this.getTransferOutUser() != null)
		{
			sb.append("<transferOutUser>");
			sb.append(this.getTransferOutUser().toXMLString(domMap)); 	
			sb.append("</transferOutUser>");		
		}
		if (this.getAcceptingOrRejectingWard() != null)
		{
			sb.append("<acceptingOrRejectingWard>");
			sb.append(this.getAcceptingOrRejectingWard().toXMLString(domMap)); 	
			sb.append("</acceptingOrRejectingWard>");		
		}
		if (this.getAcceptTransferDateTime() != null)
		{
			sb.append("<acceptTransferDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getAcceptTransferDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</acceptTransferDateTime>");		
		}
		if (this.getAcceptingTransferUser() != null)
		{
			sb.append("<acceptingTransferUser>");
			sb.append(this.getAcceptingTransferUser().toXMLString(domMap)); 	
			sb.append("</acceptingTransferUser>");		
		}
		if (this.getRejectTransferDateTime() != null)
		{
			sb.append("<rejectTransferDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getRejectTransferDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</rejectTransferDateTime>");		
		}
		if (this.getRejectTransferUser() != null)
		{
			sb.append("<rejectTransferUser>");
			sb.append(this.getRejectTransferUser().toXMLString(domMap)); 	
			sb.append("</rejectTransferUser>");		
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
			TransferHistory domainObject = getTransferHistoryfromXML(itemEl, factory, domMap);

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
			TransferHistory domainObject = getTransferHistoryfromXML(itemEl, factory, domMap);

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
		
	public static TransferHistory getTransferHistoryfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getTransferHistoryfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static TransferHistory getTransferHistoryfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!TransferHistory.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!TransferHistory.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the TransferHistory class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (TransferHistory)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(TransferHistory.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		TransferHistory ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (TransferHistory)factory.getImportedDomainObject(TransferHistory.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new TransferHistory();
		}
		String keyClassName = "TransferHistory";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (TransferHistory)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, TransferHistory obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("transferringFromWard");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTransferringFromWard(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("markedForTransferOutDateTime");
		if(fldEl != null)
		{	
    		obj.setMarkedForTransferOutDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("transferOutUser");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTransferOutUser(ims.core.configuration.domain.objects.AppUser.getAppUserfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("acceptingOrRejectingWard");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAcceptingOrRejectingWard(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("acceptTransferDateTime");
		if(fldEl != null)
		{	
    		obj.setAcceptTransferDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("acceptingTransferUser");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAcceptingTransferUser(ims.core.configuration.domain.objects.AppUser.getAppUserfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("rejectTransferDateTime");
		if(fldEl != null)
		{	
    		obj.setRejectTransferDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("rejectTransferUser");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRejectTransferUser(ims.core.configuration.domain.objects.AppUser.getAppUserfromXML(fldEl, factory, domMap)); 
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
		public static final String TransferringFromWard = "transferringFromWard";
		public static final String MarkedForTransferOutDateTime = "markedForTransferOutDateTime";
		public static final String TransferOutUser = "transferOutUser";
		public static final String AcceptingOrRejectingWard = "acceptingOrRejectingWard";
		public static final String AcceptTransferDateTime = "acceptTransferDateTime";
		public static final String AcceptingTransferUser = "acceptingTransferUser";
		public static final String RejectTransferDateTime = "rejectTransferDateTime";
		public static final String RejectTransferUser = "rejectTransferUser";
	}
}

