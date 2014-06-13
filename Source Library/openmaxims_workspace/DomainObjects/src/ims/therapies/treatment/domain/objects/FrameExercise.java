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


public class FrameExercise extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1019100073;
	private static final long serialVersionUID = 1019100073L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Support Type */
	private ims.domain.lookups.LookupInstance frameExerciseSupportType;
	/** Frame Exercise Support
	  * Collection of ims.therapies.treatment.domain.objects.FrameExerciseSupport.
	  */
	private java.util.Set frameExerciseSupport;
	/** Frame Exercise Details */
	private String frameExerciseDetails;
    public FrameExercise (Integer id, int ver)
    {
    	super(id, ver);
    }
    public FrameExercise ()
    {
    	super();
    }
    public FrameExercise (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.therapies.treatment.domain.objects.FrameExercise.class;
	}


	public ims.domain.lookups.LookupInstance getFrameExerciseSupportType() {
		return frameExerciseSupportType;
	}
	public void setFrameExerciseSupportType(ims.domain.lookups.LookupInstance frameExerciseSupportType) {
		this.frameExerciseSupportType = frameExerciseSupportType;
	}

	public java.util.Set getFrameExerciseSupport() {
		if ( null == frameExerciseSupport ) {
			frameExerciseSupport = new java.util.HashSet();
		}
		return frameExerciseSupport;
	}
	public void setFrameExerciseSupport(java.util.Set paramValue) {
		this.frameExerciseSupport = paramValue;
	}

	public String getFrameExerciseDetails() {
		return frameExerciseDetails;
	}
	public void setFrameExerciseDetails(String frameExerciseDetails) {
		if ( null != frameExerciseDetails && frameExerciseDetails.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for frameExerciseDetails. Tried to set value: "+
				frameExerciseDetails);
		}
		this.frameExerciseDetails = frameExerciseDetails;
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
		
		auditStr.append("\r\n*frameExerciseSupportType* :");
		if (frameExerciseSupportType != null)
			auditStr.append(frameExerciseSupportType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*frameExerciseSupport* :");
		if (frameExerciseSupport != null)
		{
			java.util.Iterator it2 = frameExerciseSupport.iterator();
			int i2=0;
			while (it2.hasNext())
			{
				if (i2 > 0)
					auditStr.append(",");
				ims.therapies.treatment.domain.objects.FrameExerciseSupport obj = (ims.therapies.treatment.domain.objects.FrameExerciseSupport)it2.next();
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
		auditStr.append("\r\n*frameExerciseDetails* :");
		auditStr.append(frameExerciseDetails);
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
		
		String keyClassName = "FrameExercise";
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
		if (this.getFrameExerciseSupportType() != null)
		{
			sb.append("<frameExerciseSupportType>");
			sb.append(this.getFrameExerciseSupportType().toXMLString()); 
			sb.append("</frameExerciseSupportType>");		
		}
		if (this.getFrameExerciseSupport() != null)
		{
			if (this.getFrameExerciseSupport().size() > 0 )
			{
			sb.append("<frameExerciseSupport>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getFrameExerciseSupport(), domMap));
			sb.append("</frameExerciseSupport>");		
			}
		}
		if (this.getFrameExerciseDetails() != null)
		{
			sb.append("<frameExerciseDetails>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFrameExerciseDetails().toString()));
			sb.append("</frameExerciseDetails>");		
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
			FrameExercise domainObject = getFrameExercisefromXML(itemEl, factory, domMap);

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
			FrameExercise domainObject = getFrameExercisefromXML(itemEl, factory, domMap);

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
		
	public static FrameExercise getFrameExercisefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getFrameExercisefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static FrameExercise getFrameExercisefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!FrameExercise.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!FrameExercise.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the FrameExercise class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (FrameExercise)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(FrameExercise.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		FrameExercise ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (FrameExercise)factory.getImportedDomainObject(FrameExercise.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new FrameExercise();
		}
		String keyClassName = "FrameExercise";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (FrameExercise)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, FrameExercise obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("frameExerciseSupportType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setFrameExerciseSupportType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("frameExerciseSupport");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setFrameExerciseSupport(ims.therapies.treatment.domain.objects.FrameExerciseSupport.fromSetXMLString(fldEl, factory, obj.getFrameExerciseSupport(), domMap));
		}
		fldEl = el.element("frameExerciseDetails");
		if(fldEl != null)
		{	
    		obj.setFrameExerciseDetails(new String(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "frameExerciseSupport"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String FrameExerciseSupportType = "frameExerciseSupportType";
		public static final String FrameExerciseSupport = "frameExerciseSupport";
		public static final String FrameExerciseDetails = "frameExerciseDetails";
	}
}

