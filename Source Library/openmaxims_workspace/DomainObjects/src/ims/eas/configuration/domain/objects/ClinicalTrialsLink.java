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


public class ClinicalTrialsLink extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1114100001;
	private static final long serialVersionUID = 1114100001L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private ims.domain.lookups.LookupInstance treatmentSite;
	private ims.domain.lookups.LookupInstance clinicalTrial;
    public ClinicalTrialsLink (Integer id, int ver)
    {
    	super(id, ver);
		isComponentClass=true;
    }
    public ClinicalTrialsLink ()
    {
    	super();
		isComponentClass=true;
    }
    public ClinicalTrialsLink (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
		isComponentClass=true;
    }
	public Class getRealDomainClass()
	{
		return ims.eas.configuration.domain.objects.ClinicalTrialsLink.class;
	}


	public ims.domain.lookups.LookupInstance getTreatmentSite() {
		return treatmentSite;
	}
	public void setTreatmentSite(ims.domain.lookups.LookupInstance treatmentSite) {
		this.treatmentSite = treatmentSite;
	}

	public ims.domain.lookups.LookupInstance getClinicalTrial() {
		return clinicalTrial;
	}
	public void setClinicalTrial(ims.domain.lookups.LookupInstance clinicalTrial) {
		this.clinicalTrial = clinicalTrial;
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
		
		auditStr.append("\r\n*treatmentSite* :");
		if (treatmentSite != null)
			auditStr.append(treatmentSite.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalTrial* :");
		if (clinicalTrial != null)
			auditStr.append(clinicalTrial.getText());
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
		if (this.getTreatmentSite() != null)
		{
			sb.append("<treatmentSite>");
			sb.append(this.getTreatmentSite().toXMLString()); 
			sb.append("</treatmentSite>");		
		}
		if (this.getClinicalTrial() != null)
		{
			sb.append("<clinicalTrial>");
			sb.append(this.getClinicalTrial().toXMLString()); 
			sb.append("</clinicalTrial>");		
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
			ClinicalTrialsLink domainObject = getClinicalTrialsLinkfromXML(itemEl, factory, domMap);

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
			ClinicalTrialsLink domainObject = getClinicalTrialsLinkfromXML(itemEl, factory, domMap);

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
		
	public static ClinicalTrialsLink getClinicalTrialsLinkfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getClinicalTrialsLinkfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ClinicalTrialsLink getClinicalTrialsLinkfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ClinicalTrialsLink.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ClinicalTrialsLink.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ClinicalTrialsLink class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ClinicalTrialsLink)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ClinicalTrialsLink.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ClinicalTrialsLink ret = null;
		if (ret == null)
		{
			ret = new ClinicalTrialsLink();
		}
		fillFieldsfromXML(el, factory, ret, domMap);
		return ret;
	}

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ClinicalTrialsLink obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("treatmentSite");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTreatmentSite(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("clinicalTrial");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setClinicalTrial(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		if (null == obj)
		{
			return false;
		}

		if (getId() == ((ClinicalTrialsLink) obj).getId() && (treatmentSite != null && ((ClinicalTrialsLink) obj).getTreatmentSite() != null && treatmentSite.getId() == ((ClinicalTrialsLink) obj).getTreatmentSite().getId()) && clinicalTrial.getId() == ((ClinicalTrialsLink) obj).getClinicalTrial().getId())
			return true;
		return false;
	}


	/**
	hashcode
	*/
	public int hashCode()
	{
		int returnValue = 0;
		if (getId() != null)
			returnValue = getId().hashCode()* 1001;

		if (getTreatmentSite() != null)
			returnValue += this.getTreatmentSite().hashCode() * 10001;

		if (getClinicalTrial() != null)
			returnValue += getClinicalTrial().hashCode();
		return returnValue;
	}



	/**
	toString
	*/
public String toString()
	{	
		StringBuffer objStr = new StringBuffer();
	
		if (getId() != null)
			objStr.append(getId() + "-");

		if (treatmentSite != null)
			objStr.append(treatmentSite.getText() + "-");

		if (clinicalTrial != null)
			objStr.append(clinicalTrial.getText());

		return objStr.toString();
	}



	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String TreatmentSite = "treatmentSite";
		public static final String ClinicalTrial = "clinicalTrial";
	}
}

