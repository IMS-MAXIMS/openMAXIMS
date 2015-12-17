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
package ims.coe.assessment.domain.objects;

/**
 * 
 * @author Sinead McDermott
 * Generated.
 */


public class BowelDiarrhoea extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1012100018;
	private static final long serialVersionUID = 1012100018L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private ims.domain.lookups.LookupInstance proneToDiarrhoea;
	private ims.domain.lookups.LookupInstance frequency;
	private ims.domain.lookups.LookupInstance consistency;
	private ims.domain.lookups.LookupInstance odour;
	private ims.domain.lookups.LookupInstance colour;
	private ims.domain.lookups.LookupInstance amount;
    public BowelDiarrhoea (Integer id, int ver)
    {
    	super(id, ver);
    }
    public BowelDiarrhoea ()
    {
    	super();
    }
    public BowelDiarrhoea (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.coe.assessment.domain.objects.BowelDiarrhoea.class;
	}


	public ims.domain.lookups.LookupInstance getProneToDiarrhoea() {
		return proneToDiarrhoea;
	}
	public void setProneToDiarrhoea(ims.domain.lookups.LookupInstance proneToDiarrhoea) {
		this.proneToDiarrhoea = proneToDiarrhoea;
	}

	public ims.domain.lookups.LookupInstance getFrequency() {
		return frequency;
	}
	public void setFrequency(ims.domain.lookups.LookupInstance frequency) {
		this.frequency = frequency;
	}

	public ims.domain.lookups.LookupInstance getConsistency() {
		return consistency;
	}
	public void setConsistency(ims.domain.lookups.LookupInstance consistency) {
		this.consistency = consistency;
	}

	public ims.domain.lookups.LookupInstance getOdour() {
		return odour;
	}
	public void setOdour(ims.domain.lookups.LookupInstance odour) {
		this.odour = odour;
	}

	public ims.domain.lookups.LookupInstance getColour() {
		return colour;
	}
	public void setColour(ims.domain.lookups.LookupInstance colour) {
		this.colour = colour;
	}

	public ims.domain.lookups.LookupInstance getAmount() {
		return amount;
	}
	public void setAmount(ims.domain.lookups.LookupInstance amount) {
		this.amount = amount;
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
		
		auditStr.append("\r\n*proneToDiarrhoea* :");
		if (proneToDiarrhoea != null)
			auditStr.append(proneToDiarrhoea.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*frequency* :");
		if (frequency != null)
			auditStr.append(frequency.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*consistency* :");
		if (consistency != null)
			auditStr.append(consistency.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*odour* :");
		if (odour != null)
			auditStr.append(odour.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*colour* :");
		if (colour != null)
			auditStr.append(colour.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*amount* :");
		if (amount != null)
			auditStr.append(amount.getText());
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
		
		String keyClassName = "BowelDiarrhoea";
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
		if (this.getProneToDiarrhoea() != null)
		{
			sb.append("<proneToDiarrhoea>");
			sb.append(this.getProneToDiarrhoea().toXMLString()); 
			sb.append("</proneToDiarrhoea>");		
		}
		if (this.getFrequency() != null)
		{
			sb.append("<frequency>");
			sb.append(this.getFrequency().toXMLString()); 
			sb.append("</frequency>");		
		}
		if (this.getConsistency() != null)
		{
			sb.append("<consistency>");
			sb.append(this.getConsistency().toXMLString()); 
			sb.append("</consistency>");		
		}
		if (this.getOdour() != null)
		{
			sb.append("<odour>");
			sb.append(this.getOdour().toXMLString()); 
			sb.append("</odour>");		
		}
		if (this.getColour() != null)
		{
			sb.append("<colour>");
			sb.append(this.getColour().toXMLString()); 
			sb.append("</colour>");		
		}
		if (this.getAmount() != null)
		{
			sb.append("<amount>");
			sb.append(this.getAmount().toXMLString()); 
			sb.append("</amount>");		
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
			BowelDiarrhoea domainObject = getBowelDiarrhoeafromXML(itemEl, factory, domMap);

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
			BowelDiarrhoea domainObject = getBowelDiarrhoeafromXML(itemEl, factory, domMap);

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
		
	public static BowelDiarrhoea getBowelDiarrhoeafromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getBowelDiarrhoeafromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static BowelDiarrhoea getBowelDiarrhoeafromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!BowelDiarrhoea.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!BowelDiarrhoea.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the BowelDiarrhoea class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (BowelDiarrhoea)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(BowelDiarrhoea.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		BowelDiarrhoea ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (BowelDiarrhoea)factory.getImportedDomainObject(BowelDiarrhoea.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new BowelDiarrhoea();
		}
		String keyClassName = "BowelDiarrhoea";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (BowelDiarrhoea)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, BowelDiarrhoea obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("proneToDiarrhoea");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setProneToDiarrhoea(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("frequency");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setFrequency(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("consistency");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setConsistency(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("odour");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOdour(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("colour");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setColour(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("amount");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAmount(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		public static final String ProneToDiarrhoea = "proneToDiarrhoea";
		public static final String Frequency = "frequency";
		public static final String Consistency = "consistency";
		public static final String Odour = "odour";
		public static final String Colour = "colour";
		public static final String Amount = "amount";
	}
}

