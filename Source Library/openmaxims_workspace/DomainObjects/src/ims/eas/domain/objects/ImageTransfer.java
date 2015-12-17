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
package ims.eas.domain.objects;

/**
 * 
 * @author Barbara Worwood
 * Generated.
 */


public class ImageTransfer extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1113100003;
	private static final long serialVersionUID = 1113100003L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private ims.domain.lookups.LookupInstance imageType;
	/** Date or approximate date the image was taken */
	private Integer imageDate;
	/** Location Image was taken */
	private ims.domain.lookups.LookupInstance imageTakenAt;
	/** Image location if not lookup instance */
	private String locationTaken;
	private String anatomicalSite;
	/** Used in the Image Transfer Worklist */
	private Boolean imageRequested;
	/** Has this Image request been manually removed */
	private Boolean removedStat;
	private ims.domain.lookups.LookupInstance removalReason;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ImageTransfer (Integer id, int ver)
    {
    	super(id, ver);
		isComponentClass=true;
    }
    public ImageTransfer ()
    {
    	super();
		isComponentClass=true;
    }
    public ImageTransfer (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
		isComponentClass=true;
    }
	public Class getRealDomainClass()
	{
		return ims.eas.domain.objects.ImageTransfer.class;
	}


	public ims.domain.lookups.LookupInstance getImageType() {
		return imageType;
	}
	public void setImageType(ims.domain.lookups.LookupInstance imageType) {
		this.imageType = imageType;
	}

	public Integer getImageDate() {
		return imageDate;
	}
	public void setImageDate(Integer imageDate) {
		this.imageDate = imageDate;
	}

	public ims.domain.lookups.LookupInstance getImageTakenAt() {
		return imageTakenAt;
	}
	public void setImageTakenAt(ims.domain.lookups.LookupInstance imageTakenAt) {
		this.imageTakenAt = imageTakenAt;
	}

	public String getLocationTaken() {
		return locationTaken;
	}
	public void setLocationTaken(String locationTaken) {
		if ( null != locationTaken && locationTaken.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for locationTaken. Tried to set value: "+
				locationTaken);
		}
		this.locationTaken = locationTaken;
	}

	public String getAnatomicalSite() {
		return anatomicalSite;
	}
	public void setAnatomicalSite(String anatomicalSite) {
		if ( null != anatomicalSite && anatomicalSite.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for anatomicalSite. Tried to set value: "+
				anatomicalSite);
		}
		this.anatomicalSite = anatomicalSite;
	}

	public Boolean isImageRequested() {
		return imageRequested;
	}
	public void setImageRequested(Boolean imageRequested) {
		this.imageRequested = imageRequested;
	}

	public Boolean isRemovedStat() {
		return removedStat;
	}
	public void setRemovedStat(Boolean removedStat) {
		this.removedStat = removedStat;
	}

	public ims.domain.lookups.LookupInstance getRemovalReason() {
		return removalReason;
	}
	public void setRemovalReason(ims.domain.lookups.LookupInstance removalReason) {
		this.removalReason = removalReason;
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
		
		auditStr.append("\r\n*imageType* :");
		if (imageType != null)
			auditStr.append(imageType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*imageDate* :");
		auditStr.append(imageDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*imageTakenAt* :");
		if (imageTakenAt != null)
			auditStr.append(imageTakenAt.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*locationTaken* :");
		auditStr.append(locationTaken);
	    auditStr.append("; ");
		auditStr.append("\r\n*anatomicalSite* :");
		auditStr.append(anatomicalSite);
	    auditStr.append("; ");
		auditStr.append("\r\n*imageRequested* :");
		auditStr.append(imageRequested);
	    auditStr.append("; ");
		auditStr.append("\r\n*removedStat* :");
		auditStr.append(removedStat);
	    auditStr.append("; ");
		auditStr.append("\r\n*removalReason* :");
		if (removalReason != null)
			auditStr.append(removalReason.getText());
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
		sb.append(" source=\"" + ims.configuration.EnvironmentConfig.getImportExportSourceName() + "\" ");
		sb.append(" classVersion=\"" + this.getClassVersion() + "\" ");
		sb.append(" component=\"" + this.getIsComponentClass() + "\" >");
		
		if (domMap.get(this) == null)
		{
			domMap.put(this, this);
			sb.append(this.fieldsToXMLString(domMap));
		}
		sb.append("</class>");
		
		
		return sb.toString();
	}

	public String fieldsToXMLString(java.util.HashMap domMap)
	{
		StringBuffer sb = new StringBuffer();
		if (this.getImageType() != null)
		{
			sb.append("<imageType>");
			sb.append(this.getImageType().toXMLString()); 
			sb.append("</imageType>");		
		}
		if (this.getImageDate() != null)
		{
			sb.append("<imageDate>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getImageDate().toString()));
			sb.append("</imageDate>");		
		}
		if (this.getImageTakenAt() != null)
		{
			sb.append("<imageTakenAt>");
			sb.append(this.getImageTakenAt().toXMLString()); 
			sb.append("</imageTakenAt>");		
		}
		if (this.getLocationTaken() != null)
		{
			sb.append("<locationTaken>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLocationTaken().toString()));
			sb.append("</locationTaken>");		
		}
		if (this.getAnatomicalSite() != null)
		{
			sb.append("<anatomicalSite>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAnatomicalSite().toString()));
			sb.append("</anatomicalSite>");		
		}
		if (this.isImageRequested() != null)
		{
			sb.append("<imageRequested>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isImageRequested().toString()));
			sb.append("</imageRequested>");		
		}
		if (this.isRemovedStat() != null)
		{
			sb.append("<removedStat>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isRemovedStat().toString()));
			sb.append("</removedStat>");		
		}
		if (this.getRemovalReason() != null)
		{
			sb.append("<removalReason>");
			sb.append(this.getRemovalReason().toXMLString()); 
			sb.append("</removalReason>");		
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
			ImageTransfer domainObject = getImageTransferfromXML(itemEl, factory, domMap);

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
			ImageTransfer domainObject = getImageTransferfromXML(itemEl, factory, domMap);

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
		
	public static ImageTransfer getImageTransferfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getImageTransferfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ImageTransfer getImageTransferfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ImageTransfer.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ImageTransfer.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ImageTransfer class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ImageTransfer)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ImageTransfer.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ImageTransfer ret = null;
		if (ret == null)
		{
			ret = new ImageTransfer();
		}
		fillFieldsfromXML(el, factory, ret, domMap);
		return ret;
	}

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ImageTransfer obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("imageType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setImageType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("imageDate");
		if(fldEl != null)
		{	
    		obj.setImageDate(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("imageTakenAt");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setImageTakenAt(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("locationTaken");
		if(fldEl != null)
		{	
    		obj.setLocationTaken(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("anatomicalSite");
		if(fldEl != null)
		{	
    		obj.setAnatomicalSite(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("imageRequested");
		if(fldEl != null)
		{	
    		obj.setImageRequested(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("removedStat");
		if(fldEl != null)
		{	
    		obj.setRemovedStat(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("removalReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRemovalReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		};
	}

	/**
	equals
	*/
	public boolean equals(Object obj)
	{
		if (null == obj) {
			return false;
		}
		if (!(obj instanceof ims.eas.domain.objects.ImageTransfer)) 
		{
			return false;
		}
		ims.eas.domain.objects.ImageTransfer tmp = (ims.eas.domain.objects.ImageTransfer)obj;
		
		if ((imageType != null && tmp.getImageType() != null) && !imageType.equals(tmp.getImageType())) return false;
		if ((imageType != null && tmp.getImageType() == null) || (imageType == null && tmp.getImageType() != null)) return false;

		if ((imageDate != null && tmp.getImageDate() != null) && !imageDate.equals(tmp.getImageDate())) return false;
		if ((imageDate != null && tmp.getImageDate() == null) || (imageDate == null && tmp.getImageDate() != null)) return false;

		if ((imageTakenAt != null && tmp.getImageTakenAt() != null) && !imageTakenAt.equals(tmp.getImageTakenAt())) return false;
		if ((imageTakenAt != null && tmp.getImageTakenAt() == null) || (imageTakenAt == null && tmp.getImageTakenAt() != null)) return false;

		if ((locationTaken != null && tmp.getLocationTaken() != null) && !locationTaken.equals(tmp.getLocationTaken())) return false;
		if ((locationTaken != null && tmp.getLocationTaken() == null) || (locationTaken == null && tmp.getLocationTaken() != null)) return false;
		
		if ((anatomicalSite != null && tmp.getAnatomicalSite() != null) && !anatomicalSite.equals(tmp.getAnatomicalSite())) return false;
		if ((anatomicalSite != null && tmp.getAnatomicalSite() == null) || (anatomicalSite == null && tmp.getAnatomicalSite() != null)) return false;

		if ((imageRequested != null && tmp.isImageRequested() != null) && !imageRequested.equals(tmp.isImageRequested())) return false;
		if ((imageRequested != null && tmp.isImageRequested() == null) || (imageRequested == null && tmp.isImageRequested() != null)) return false;
		
		if ((removedStat != null && tmp.isRemovedStat() != null) && !removedStat.equals(tmp.isRemovedStat())) return false;
		if ((removedStat != null && tmp.isRemovedStat() == null) || (removedStat == null && tmp.isRemovedStat() != null)) return false;
		
		if ((removalReason != null && tmp.getRemovalReason() != null) && !removalReason.equals(tmp.getRemovalReason())) return false;
		if ((removalReason != null && tmp.getRemovalReason() == null) || (removalReason == null && tmp.getRemovalReason() != null)) return false;

		return true;
	}


	/**
	hashcode
	*/
	public int hashCode()
	{
		int hash = 0;

		if (imageType!= null) hash += imageType.hashCode();
		if (imageDate!= null) hash += imageDate.hashCode();
		if (imageTakenAt!= null) hash += imageTakenAt.hashCode();
		if (locationTaken!= null) hash += locationTaken.hashCode();
		if (anatomicalSite!= null) hash += anatomicalSite.hashCode();
		if (imageRequested!= null) hash += imageRequested.hashCode();
		if (removedStat!= null) hash += removedStat.hashCode();
		if (removalReason!= null) hash += removalReason.hashCode();

		return hash;
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String ImageType = "imageType";
		public static final String ImageDate = "imageDate";
		public static final String ImageTakenAt = "imageTakenAt";
		public static final String LocationTaken = "locationTaken";
		public static final String AnatomicalSite = "anatomicalSite";
		public static final String ImageRequested = "imageRequested";
		public static final String RemovedStat = "removedStat";
		public static final String RemovalReason = "removalReason";
	}
}

