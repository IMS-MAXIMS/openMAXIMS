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


public class StrengtheningProgramLimbWeight extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1019100053;
	private static final long serialVersionUID = 1019100053L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Item */
	private ims.domain.lookups.LookupInstance limbType;
	/** Action */
	private ims.domain.lookups.LookupInstance action;
	/** Weight in Kgs */
	private Integer kgs;
	/** Nr Repetitions */
	private Integer repetitions;
    public StrengtheningProgramLimbWeight (Integer id, int ver)
    {
    	super(id, ver);
    }
    public StrengtheningProgramLimbWeight ()
    {
    	super();
    }
    public StrengtheningProgramLimbWeight (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.therapies.treatment.domain.objects.StrengtheningProgramLimbWeight.class;
	}


	public ims.domain.lookups.LookupInstance getLimbType() {
		return limbType;
	}
	public void setLimbType(ims.domain.lookups.LookupInstance limbType) {
		this.limbType = limbType;
	}

	public ims.domain.lookups.LookupInstance getAction() {
		return action;
	}
	public void setAction(ims.domain.lookups.LookupInstance action) {
		this.action = action;
	}

	public Integer getKgs() {
		return kgs;
	}
	public void setKgs(Integer kgs) {
		this.kgs = kgs;
	}

	public Integer getRepetitions() {
		return repetitions;
	}
	public void setRepetitions(Integer repetitions) {
		this.repetitions = repetitions;
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
		
		auditStr.append("\r\n*limbType* :");
		if (limbType != null)
			auditStr.append(limbType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*action* :");
		if (action != null)
			auditStr.append(action.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*kgs* :");
		auditStr.append(kgs);
	    auditStr.append("; ");
		auditStr.append("\r\n*repetitions* :");
		auditStr.append(repetitions);
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
		
		String keyClassName = "StrengtheningProgramLimbWeight";
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
		if (this.getLimbType() != null)
		{
			sb.append("<limbType>");
			sb.append(this.getLimbType().toXMLString()); 
			sb.append("</limbType>");		
		}
		if (this.getAction() != null)
		{
			sb.append("<action>");
			sb.append(this.getAction().toXMLString()); 
			sb.append("</action>");		
		}
		if (this.getKgs() != null)
		{
			sb.append("<kgs>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getKgs().toString()));
			sb.append("</kgs>");		
		}
		if (this.getRepetitions() != null)
		{
			sb.append("<repetitions>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRepetitions().toString()));
			sb.append("</repetitions>");		
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
			StrengtheningProgramLimbWeight domainObject = getStrengtheningProgramLimbWeightfromXML(itemEl, factory, domMap);

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
			StrengtheningProgramLimbWeight domainObject = getStrengtheningProgramLimbWeightfromXML(itemEl, factory, domMap);

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
		
	public static StrengtheningProgramLimbWeight getStrengtheningProgramLimbWeightfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getStrengtheningProgramLimbWeightfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static StrengtheningProgramLimbWeight getStrengtheningProgramLimbWeightfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!StrengtheningProgramLimbWeight.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!StrengtheningProgramLimbWeight.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the StrengtheningProgramLimbWeight class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (StrengtheningProgramLimbWeight)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(StrengtheningProgramLimbWeight.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		StrengtheningProgramLimbWeight ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (StrengtheningProgramLimbWeight)factory.getImportedDomainObject(StrengtheningProgramLimbWeight.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new StrengtheningProgramLimbWeight();
		}
		String keyClassName = "StrengtheningProgramLimbWeight";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (StrengtheningProgramLimbWeight)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, StrengtheningProgramLimbWeight obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("limbType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setLimbType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("action");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAction(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("kgs");
		if(fldEl != null)
		{	
    		obj.setKgs(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("repetitions");
		if(fldEl != null)
		{	
    		obj.setRepetitions(new Integer(fldEl.getTextTrim()));	
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
		public static final String LimbType = "limbType";
		public static final String Action = "action";
		public static final String Kgs = "kgs";
		public static final String Repetitions = "repetitions";
	}
}

