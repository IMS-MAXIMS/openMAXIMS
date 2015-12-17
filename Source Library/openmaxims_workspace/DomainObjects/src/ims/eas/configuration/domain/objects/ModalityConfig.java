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
package ims.eas.configuration.domain.objects;

/**
 * 
 * @author Barbara Worwood
 * Generated.
 */


public class ModalityConfig extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1114100005;
	private static final long serialVersionUID = 1114100005L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private ims.domain.lookups.LookupInstance modality;
	private java.lang.Float energy;
	private ims.domain.lookups.LookupInstance unit;
	private Boolean active;
    public ModalityConfig (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ModalityConfig ()
    {
    	super();
    }
    public ModalityConfig (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.eas.configuration.domain.objects.ModalityConfig.class;
	}


	public ims.domain.lookups.LookupInstance getModality() {
		return modality;
	}
	public void setModality(ims.domain.lookups.LookupInstance modality) {
		this.modality = modality;
	}

	public java.lang.Float getEnergy() {
		return energy;
	}
	public void setEnergy(java.lang.Float energy) {
		this.energy = energy;
	}

	public ims.domain.lookups.LookupInstance getUnit() {
		return unit;
	}
	public void setUnit(ims.domain.lookups.LookupInstance unit) {
		this.unit = unit;
	}

	public Boolean isActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}

	/**
	 * isConfigurationObject
	 * Taken from the Usage property of the business object, this method will return
	 * a boolean indicating whether this is a configuration object or not
	 * Configuration = true, Instantiation = false
	 */
	public static boolean isConfigurationObject()
	{
		if ( "Configuration".equals("Configuration") )
			return true;
		else
			return false;
	}
	// method generated based on 'modunitengidx' unique index.
	public static boolean recordExistForModalityAndEnergyAndUnit(ims.domain.ILightweightDomainFactory factory,
		 ims.domain.lookups.LookupInstance modality
	,
	 java.lang.Float energy
	,
	 ims.domain.lookups.LookupInstance unit
	)	
	{
		return recordExistForModalityAndEnergyAndUnit(factory, modality, energy, unit, null);
	}	

	// method generated based on 'modunitengidx' unique index.
	public static boolean recordExistForModalityAndEnergyAndUnit(ims.domain.ILightweightDomainFactory factory,
		 ims.domain.lookups.LookupInstance modality
	,
	 java.lang.Float energy
	,
	 ims.domain.lookups.LookupInstance unit
	, Integer recordId)	
	{
		String[] names = new String[3];
		Object[] values = new Object[3];
		StringBuffer hql = new StringBuffer();
		
		hql.append("from ModalityConfig c where ");
		hql.append(" c.modality = :modality ");
		names[0] = "modality";
		values[0] = modality;		
		hql.append(" and "); 
		hql.append(" c.energy = :energy ");
		names[1] = "energy";
		values[1] = energy;		
		hql.append(" and "); 
		hql.append(" c.unit = :unit ");
		names[2] = "unit";
		values[2] = unit;		
		if(recordId != null)
		{
			hql.append(" and c.id <> " + recordId);
		}
		
		return factory.count(hql.toString(), names, values) > 0;				
	}	

	// method generated based on 'modunitengidx' unique index.
	public static ModalityConfig getRecordByModalityAndEnergyAndUnit(ims.domain.ILightweightDomainFactory factory,
	 ims.domain.lookups.LookupInstance modality
	,
	 java.lang.Float energy
	,
	 ims.domain.lookups.LookupInstance unit
	)
	{
		String[] names = new String[3];
		Object[] values = new Object[3];
		StringBuffer hql = new StringBuffer();
		hql.append("from ModalityConfig c where ");
		hql.append(" c.modality = :modality ");
		names[0] = "modality";
		values[0] = modality;		
		hql.append(" and "); 
		hql.append(" c.energy = :energy ");
		names[1] = "energy";
		values[1] = energy;		
		hql.append(" and "); 
		hql.append(" c.unit = :unit ");
		names[2] = "unit";
		values[2] = unit;		
		java.util.List l = factory.find(hql.toString(), names, values);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. " + hql + " returned " + l.size() + " records. " );
		return (ModalityConfig)l.get(0);
	}

	public static ModalityConfig getModalityConfigFrommodunitengidx(ims.domain.ILightweightDomainFactory factory,
	 ims.domain.lookups.LookupInstance modality
	,
	 java.lang.Float energy
	,
	 ims.domain.lookups.LookupInstance unit
	)
	{
		String[] names = new String[3];
		Object[] values = new Object[3];
		StringBuffer hql = new StringBuffer();
		hql.append("from ModalityConfig c where ");
		hql.append(" c.modality = :modality ");
		names[0] = "modality";
		values[0] = modality;		
		hql.append(" and "); 
		hql.append(" c.energy = :energy ");
		names[1] = "energy";
		values[1] = energy;		
		hql.append(" and "); 
		hql.append(" c.unit = :unit ");
		names[2] = "unit";
		values[2] = unit;		
		java.util.List l = factory.find(hql.toString(), names, values);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. " + hql + " returned " + l.size() + " records. " );
		return (ModalityConfig)l.get(0);
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
		
		auditStr.append("\r\n*modality* :");
		if (modality != null)
			auditStr.append(modality.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*energy* :");
		auditStr.append(energy);
	    auditStr.append("; ");
		auditStr.append("\r\n*unit* :");
		if (unit != null)
			auditStr.append(unit.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*active* :");
		auditStr.append(active);
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
		
		String keyClassName = "ModalityConfig";
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
		if (this.getModality() != null)
		{
			sb.append("<modality>");
			sb.append(this.getModality().toXMLString()); 
			sb.append("</modality>");		
		}
		if (this.getEnergy() != null)
		{
			sb.append("<energy>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getEnergy().toString()));
			sb.append("</energy>");		
		}
		if (this.getUnit() != null)
		{
			sb.append("<unit>");
			sb.append(this.getUnit().toXMLString()); 
			sb.append("</unit>");		
		}
		if (this.isActive() != null)
		{
			sb.append("<active>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isActive().toString()));
			sb.append("</active>");		
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
			ModalityConfig domainObject = getModalityConfigfromXML(itemEl, factory, domMap);

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
			ModalityConfig domainObject = getModalityConfigfromXML(itemEl, factory, domMap);

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
		
	public static ModalityConfig getModalityConfigfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getModalityConfigfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ModalityConfig getModalityConfigfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ModalityConfig.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ModalityConfig.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ModalityConfig class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ModalityConfig)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ModalityConfig.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ModalityConfig ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ModalityConfig)factory.getImportedDomainObject(ModalityConfig.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ModalityConfig();
		}
		String keyClassName = "ModalityConfig";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ModalityConfig)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ModalityConfig obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("modality");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setModality(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("energy");
		if(fldEl != null)
		{	
    		obj.setEnergy(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("unit");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setUnit(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("active");
		if(fldEl != null)
		{	
    		obj.setActive(new Boolean(fldEl.getTextTrim()));	
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
		public static final String Modality = "modality";
		public static final String Energy = "energy";
		public static final String Unit = "unit";
		public static final String Active = "active";
	}
}

