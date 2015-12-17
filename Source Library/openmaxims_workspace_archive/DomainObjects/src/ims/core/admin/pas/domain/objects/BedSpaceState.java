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


public class BedSpaceState extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1014100009;
	private static final long serialVersionUID = 1014100009L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Ward */
	private ims.core.resource.place.domain.objects.Location ward;
	/** Bed */
	private ims.core.layout.domain.objects.BedSpace bedSpace;
	/** Current Bed Status */
	private ims.core.admin.pas.domain.objects.BedSpaceStateStatus currentBedStatus;
	/** Previous Bed Status */
	private ims.core.admin.pas.domain.objects.BedSpaceStateStatus previousBedStatus;
	/** InpatientEpisode */
	private ims.core.admin.pas.domain.objects.InpatientEpisode inpatientEpisode;
	/** is a Maternity bed */
	private Boolean isMaternity;
	/** No of Infants */
	private Integer noOfInfants;
	/** Comment */
	private String comment;
	/** Bay that BedSpsce is currently in */
	private ims.core.resource.place.domain.objects.Location bay;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public BedSpaceState (Integer id, int ver)
    {
    	super(id, ver);
    }
    public BedSpaceState ()
    {
    	super();
    }
    public BedSpaceState (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.admin.pas.domain.objects.BedSpaceState.class;
	}


	public ims.core.resource.place.domain.objects.Location getWard() {
		return ward;
	}
	public void setWard(ims.core.resource.place.domain.objects.Location ward) {
		this.ward = ward;
	}

	public ims.core.layout.domain.objects.BedSpace getBedSpace() {
		return bedSpace;
	}
	public void setBedSpace(ims.core.layout.domain.objects.BedSpace bedSpace) {
		this.bedSpace = bedSpace;
	}

	public ims.core.admin.pas.domain.objects.BedSpaceStateStatus getCurrentBedStatus() {
		return currentBedStatus;
	}
	public void setCurrentBedStatus(ims.core.admin.pas.domain.objects.BedSpaceStateStatus currentBedStatus) {
		this.currentBedStatus = currentBedStatus;
	}

	public ims.core.admin.pas.domain.objects.BedSpaceStateStatus getPreviousBedStatus() {
		return previousBedStatus;
	}
	public void setPreviousBedStatus(ims.core.admin.pas.domain.objects.BedSpaceStateStatus previousBedStatus) {
		this.previousBedStatus = previousBedStatus;
	}

	public ims.core.admin.pas.domain.objects.InpatientEpisode getInpatientEpisode() {
		return inpatientEpisode;
	}
	public void setInpatientEpisode(ims.core.admin.pas.domain.objects.InpatientEpisode inpatientEpisode) {
		this.inpatientEpisode = inpatientEpisode;
	}

	public Boolean isIsMaternity() {
		return isMaternity;
	}
	public void setIsMaternity(Boolean isMaternity) {
		this.isMaternity = isMaternity;
	}

	public Integer getNoOfInfants() {
		return noOfInfants;
	}
	public void setNoOfInfants(Integer noOfInfants) {
		this.noOfInfants = noOfInfants;
	}

	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		if ( null != comment && comment.length() > 1500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for comment. Tried to set value: "+
				comment);
		}
		this.comment = comment;
	}

	public ims.core.resource.place.domain.objects.Location getBay() {
		return bay;
	}
	public void setBay(ims.core.resource.place.domain.objects.Location bay) {
		this.bay = bay;
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
		
		auditStr.append("\r\n*ward* :");
		if (ward != null)
		{
			auditStr.append(toShortClassName(ward));
				
		    auditStr.append(ward.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*bedSpace* :");
		if (bedSpace != null)
		{
			auditStr.append(toShortClassName(bedSpace));
				
		    auditStr.append(bedSpace.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*currentBedStatus* :");
		if (currentBedStatus != null)
		{
			auditStr.append(toShortClassName(currentBedStatus));
				
		    auditStr.append(currentBedStatus.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*previousBedStatus* :");
		if (previousBedStatus != null)
		{
			auditStr.append(toShortClassName(previousBedStatus));
				
		    auditStr.append(previousBedStatus.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*inpatientEpisode* :");
		if (inpatientEpisode != null)
		{
			auditStr.append(toShortClassName(inpatientEpisode));
				
		    auditStr.append(inpatientEpisode.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isMaternity* :");
		auditStr.append(isMaternity);
	    auditStr.append("; ");
		auditStr.append("\r\n*noOfInfants* :");
		auditStr.append(noOfInfants);
	    auditStr.append("; ");
		auditStr.append("\r\n*comment* :");
		auditStr.append(comment);
	    auditStr.append("; ");
		auditStr.append("\r\n*bay* :");
		if (bay != null)
		{
			auditStr.append(toShortClassName(bay));
				
		    auditStr.append(bay.getId());
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
		
		String keyClassName = "BedSpaceState";
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
		if (this.getWard() != null)
		{
			sb.append("<ward>");
			sb.append(this.getWard().toXMLString(domMap)); 	
			sb.append("</ward>");		
		}
		if (this.getBedSpace() != null)
		{
			sb.append("<bedSpace>");
			sb.append(this.getBedSpace().toXMLString(domMap)); 	
			sb.append("</bedSpace>");		
		}
		if (this.getCurrentBedStatus() != null)
		{
			sb.append("<currentBedStatus>");
			sb.append(this.getCurrentBedStatus().toXMLString(domMap)); 	
			sb.append("</currentBedStatus>");		
		}
		if (this.getPreviousBedStatus() != null)
		{
			sb.append("<previousBedStatus>");
			sb.append(this.getPreviousBedStatus().toXMLString(domMap)); 	
			sb.append("</previousBedStatus>");		
		}
		if (this.getInpatientEpisode() != null)
		{
			sb.append("<inpatientEpisode>");
			sb.append(this.getInpatientEpisode().toXMLString(domMap)); 	
			sb.append("</inpatientEpisode>");		
		}
		if (this.isIsMaternity() != null)
		{
			sb.append("<isMaternity>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsMaternity().toString()));
			sb.append("</isMaternity>");		
		}
		if (this.getNoOfInfants() != null)
		{
			sb.append("<noOfInfants>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNoOfInfants().toString()));
			sb.append("</noOfInfants>");		
		}
		if (this.getComment() != null)
		{
			sb.append("<comment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComment().toString()));
			sb.append("</comment>");		
		}
		if (this.getBay() != null)
		{
			sb.append("<bay>");
			sb.append(this.getBay().toXMLString(domMap)); 	
			sb.append("</bay>");		
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
			BedSpaceState domainObject = getBedSpaceStatefromXML(itemEl, factory, domMap);

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
			BedSpaceState domainObject = getBedSpaceStatefromXML(itemEl, factory, domMap);

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
		
	public static BedSpaceState getBedSpaceStatefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getBedSpaceStatefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static BedSpaceState getBedSpaceStatefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!BedSpaceState.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!BedSpaceState.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the BedSpaceState class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (BedSpaceState)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(BedSpaceState.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		BedSpaceState ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (BedSpaceState)factory.getImportedDomainObject(BedSpaceState.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new BedSpaceState();
		}
		String keyClassName = "BedSpaceState";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (BedSpaceState)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, BedSpaceState obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("ward");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setWard(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("bedSpace");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setBedSpace(ims.core.layout.domain.objects.BedSpace.getBedSpacefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("currentBedStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentBedStatus(ims.core.admin.pas.domain.objects.BedSpaceStateStatus.getBedSpaceStateStatusfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("previousBedStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPreviousBedStatus(ims.core.admin.pas.domain.objects.BedSpaceStateStatus.getBedSpaceStateStatusfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("inpatientEpisode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setInpatientEpisode(ims.core.admin.pas.domain.objects.InpatientEpisode.getInpatientEpisodefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isMaternity");
		if(fldEl != null)
		{	
    		obj.setIsMaternity(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("noOfInfants");
		if(fldEl != null)
		{	
    		obj.setNoOfInfants(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("comment");
		if(fldEl != null)
		{	
    		obj.setComment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("bay");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setBay(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
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
		public static final String Ward = "ward";
		public static final String BedSpace = "bedSpace";
		public static final String CurrentBedStatus = "currentBedStatus";
		public static final String PreviousBedStatus = "previousBedStatus";
		public static final String InpatientEpisode = "inpatientEpisode";
		public static final String IsMaternity = "isMaternity";
		public static final String NoOfInfants = "noOfInfants";
		public static final String Comment = "comment";
		public static final String Bay = "bay";
	}
}

