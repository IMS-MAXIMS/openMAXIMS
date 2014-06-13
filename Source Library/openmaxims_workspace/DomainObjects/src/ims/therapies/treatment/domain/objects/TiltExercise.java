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
package ims.therapies.treatment.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class TiltExercise extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1019100074;
	private static final long serialVersionUID = 1019100074L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Support Type (Tilt Table) */
	private ims.domain.lookups.LookupInstance supportType;
	/** Tilt Support Exercise
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List tiltSupportExercise;
	/** Degrees */
	private Integer degrees;
	/** Total Duration in minutes */
	private Integer duration;
	/** Tilt Exercise Details */
	private String tiltExerciseDetails;
    public TiltExercise (Integer id, int ver)
    {
    	super(id, ver);
    }
    public TiltExercise ()
    {
    	super();
    }
    public TiltExercise (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.therapies.treatment.domain.objects.TiltExercise.class;
	}


	public ims.domain.lookups.LookupInstance getSupportType() {
		return supportType;
	}
	public void setSupportType(ims.domain.lookups.LookupInstance supportType) {
		this.supportType = supportType;
	}

	public java.util.List getTiltSupportExercise() {
		if ( null == tiltSupportExercise ) {
			tiltSupportExercise = new java.util.ArrayList();
		}
		return tiltSupportExercise;
	}
	public void setTiltSupportExercise(java.util.List paramValue) {
		this.tiltSupportExercise = paramValue;
	}

	public Integer getDegrees() {
		return degrees;
	}
	public void setDegrees(Integer degrees) {
		this.degrees = degrees;
	}

	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getTiltExerciseDetails() {
		return tiltExerciseDetails;
	}
	public void setTiltExerciseDetails(String tiltExerciseDetails) {
		if ( null != tiltExerciseDetails && tiltExerciseDetails.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for tiltExerciseDetails. Tried to set value: "+
				tiltExerciseDetails);
		}
		this.tiltExerciseDetails = tiltExerciseDetails;
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
		
		auditStr.append("\r\n*supportType* :");
		if (supportType != null)
			auditStr.append(supportType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*tiltSupportExercise* :");
		if (tiltSupportExercise != null)
		{
			java.util.Iterator it2 = tiltSupportExercise.iterator();
			int i2=0;
			while (it2.hasNext())
			{
				if (i2 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it2.next();
			auditStr.append(obj.getText());
			i2++;
		}
		if (i2 > 0)
			auditStr.append("] " + i2);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*degrees* :");
		auditStr.append(degrees);
	    auditStr.append("; ");
		auditStr.append("\r\n*duration* :");
		auditStr.append(duration);
	    auditStr.append("; ");
		auditStr.append("\r\n*tiltExerciseDetails* :");
		auditStr.append(tiltExerciseDetails);
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
		
		String keyClassName = "TiltExercise";
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
		if (this.getSupportType() != null)
		{
			sb.append("<supportType>");
			sb.append(this.getSupportType().toXMLString()); 
			sb.append("</supportType>");		
		}
		if (this.getTiltSupportExercise() != null)
		{
			if (this.getTiltSupportExercise().size() > 0 )
			{
			sb.append("<tiltSupportExercise>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getTiltSupportExercise())); 
			sb.append("</tiltSupportExercise>");		
			}
		}
		if (this.getDegrees() != null)
		{
			sb.append("<degrees>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDegrees().toString()));
			sb.append("</degrees>");		
		}
		if (this.getDuration() != null)
		{
			sb.append("<duration>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDuration().toString()));
			sb.append("</duration>");		
		}
		if (this.getTiltExerciseDetails() != null)
		{
			sb.append("<tiltExerciseDetails>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTiltExerciseDetails().toString()));
			sb.append("</tiltExerciseDetails>");		
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
			TiltExercise domainObject = getTiltExercisefromXML(itemEl, factory, domMap);

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
			TiltExercise domainObject = getTiltExercisefromXML(itemEl, factory, domMap);

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
		
	public static TiltExercise getTiltExercisefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getTiltExercisefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static TiltExercise getTiltExercisefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!TiltExercise.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!TiltExercise.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the TiltExercise class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (TiltExercise)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(TiltExercise.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		TiltExercise ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (TiltExercise)factory.getImportedDomainObject(TiltExercise.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new TiltExercise();
		}
		String keyClassName = "TiltExercise";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (TiltExercise)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, TiltExercise obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("supportType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSupportType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("tiltSupportExercise");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setTiltSupportExercise(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getTiltSupportExercise())); 
		}
		fldEl = el.element("degrees");
		if(fldEl != null)
		{	
    		obj.setDegrees(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("duration");
		if(fldEl != null)
		{	
    		obj.setDuration(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("tiltExerciseDetails");
		if(fldEl != null)
		{	
    		obj.setTiltExerciseDetails(new String(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "tiltSupportExercise"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String SupportType = "supportType";
		public static final String TiltSupportExercise = "tiltSupportExercise";
		public static final String Degrees = "degrees";
		public static final String Duration = "duration";
		public static final String TiltExerciseDetails = "tiltExerciseDetails";
	}
}

