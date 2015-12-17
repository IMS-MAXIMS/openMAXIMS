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
package ims.choose_book.domain.objects;

/**
 * Choose and Book Conversation BO
 * @author Barbara Worwood
 * Generated.
 */


public class Conversation extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1069100004;
	private static final long serialVersionUID = 1069100004L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private ims.choose_book.domain.objects.ConvId cid;
	/** Current Sequence Point */
	private ims.choose_book.domain.objects.SeqPoint current;
	/** List of SeqPoints associated with this conversation
	  * Collection of ims.choose_book.domain.objects.ConvPoint.
	  */
	private java.util.List points;
	/** Message Id's associated with this conversation
	  * Collection of ims.choose_book.domain.objects.ConvUid.
	  */
	private java.util.List msgUids;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public Conversation (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Conversation ()
    {
    	super();
    }
    public Conversation (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.choose_book.domain.objects.Conversation.class;
	}


	public ims.choose_book.domain.objects.ConvId getCid() {
		return cid;
	}
	public static Conversation getConversationFromCid(ims.domain.ILightweightDomainFactory factory, Integer id)
	{
		java.util.List l = factory.find("from Conversation c where c.cid.id = " + id);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. Conversation.cid.id = " + id + " returned " + l.size() + " records. " );
		return (Conversation)l.get(0);
	}
	public void setCid(ims.choose_book.domain.objects.ConvId cid) {
		this.cid = cid;
	}

	public ims.choose_book.domain.objects.SeqPoint getCurrent() {
		return current;
	}
	public void setCurrent(ims.choose_book.domain.objects.SeqPoint current) {
		this.current = current;
	}

	public java.util.List getPoints() {
		if ( null == points ) {
			points = new java.util.ArrayList();
		}
		return points;
	}
	public void setPoints(java.util.List paramValue) {
		this.points = paramValue;
	}

	public java.util.List getMsgUids() {
		if ( null == msgUids ) {
			msgUids = new java.util.ArrayList();
		}
		return msgUids;
	}
	public void setMsgUids(java.util.List paramValue) {
		this.msgUids = paramValue;
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
		
		auditStr.append("\r\n*cid* :");
		if (cid != null)
		{
			auditStr.append(toShortClassName(cid));
				
		    auditStr.append(cid.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*current* :");
		if (current != null)
		{
			auditStr.append(toShortClassName(current));
				
		    auditStr.append(current.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*points* :");
		if (points != null)
		{
		int i3=0;
		for (i3=0; i3<points.size(); i3++)
		{
			if (i3 > 0)
				auditStr.append(",");
			ims.choose_book.domain.objects.ConvPoint obj = (ims.choose_book.domain.objects.ConvPoint)points.get(i3);
		    if (obj != null)
			{
				if (i3 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i3 > 0)
			auditStr.append("] " + i3);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*msgUids* :");
		if (msgUids != null)
		{
		int i4=0;
		for (i4=0; i4<msgUids.size(); i4++)
		{
			if (i4 > 0)
				auditStr.append(",");
			ims.choose_book.domain.objects.ConvUid obj = (ims.choose_book.domain.objects.ConvUid)msgUids.get(i4);
		    if (obj != null)
			{
				if (i4 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i4 > 0)
			auditStr.append("] " + i4);
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
		
		String keyClassName = "Conversation";
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
		if (this.getCid() != null)
		{
			sb.append("<cid>");
			sb.append(this.getCid().toXMLString(domMap)); 	
			sb.append("</cid>");		
		}
		if (this.getCurrent() != null)
		{
			sb.append("<current>");
			sb.append(this.getCurrent().toXMLString(domMap)); 	
			sb.append("</current>");		
		}
		if (this.getPoints() != null)
		{
			if (this.getPoints().size() > 0 )
			{
			sb.append("<points>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPoints(), domMap));
			sb.append("</points>");		
			}
		}
		if (this.getMsgUids() != null)
		{
			if (this.getMsgUids().size() > 0 )
			{
			sb.append("<msgUids>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getMsgUids(), domMap));
			sb.append("</msgUids>");		
			}
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
			Conversation domainObject = getConversationfromXML(itemEl, factory, domMap);

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
			Conversation domainObject = getConversationfromXML(itemEl, factory, domMap);

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
		
	public static Conversation getConversationfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getConversationfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Conversation getConversationfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Conversation.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Conversation.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Conversation class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Conversation)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Conversation.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Conversation ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Conversation)factory.getImportedDomainObject(Conversation.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Conversation();
		}
		String keyClassName = "Conversation";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Conversation)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Conversation obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("cid");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCid(ims.choose_book.domain.objects.ConvId.getConvIdfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("current");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrent(ims.choose_book.domain.objects.SeqPoint.getSeqPointfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("points");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setPoints(ims.choose_book.domain.objects.ConvPoint.fromListXMLString(fldEl, factory, obj.getPoints(), domMap));
		}
		fldEl = el.element("msgUids");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setMsgUids(ims.choose_book.domain.objects.ConvUid.fromListXMLString(fldEl, factory, obj.getMsgUids(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "points"
		, "msgUids"
		};
	}

	/**
	Has this conversation been terminated
	*/
public boolean isTerminated()
{
	if (current == null) 
		return false;

	return current.isTerminal().booleanValue();
}

	

	/**
	Has this conversation already been started
	*/
public boolean isStarted()
{
	return (current != null);
}



	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Cid = "cid";
		public static final String Current = "current";
		public static final String Points = "points";
		public static final String MsgUids = "msgUids";
	}
}

