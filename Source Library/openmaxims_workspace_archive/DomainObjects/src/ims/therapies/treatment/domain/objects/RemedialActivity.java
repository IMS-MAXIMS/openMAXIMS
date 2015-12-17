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
 * @author Joan Heelan
 * Generated.
 */


public class RemedialActivity extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1019100010;
	private static final long serialVersionUID = 1019100010L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Activity */
	private ims.domain.lookups.LookupInstance activity;
	/** Patient Position */
	private ims.domain.lookups.LookupInstance patientPosition;
	/** Activity Position */
	private ims.domain.lookups.LookupInstance activityPosition;
	/** Sequence */
	private ims.domain.lookups.LookupInstance sequence;
	/** Duration */
	private Integer duration;
	/** Activity Height in cms */
	private Integer activityHeight;
	/** Number Pauses */
	private String numberPauses;
	/** Rest Period in minutes */
	private Integer restPeriod;
	/** Average Pause in seconds */
	private Integer averagePause;
	/** Independence */
	private ims.domain.lookups.LookupInstance independence;
	/** Subjective Obs */
	private ims.domain.lookups.LookupInstance subjectiveObs;
	/** NB. Configuration based on Activity
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List technique;
	/** NB. Configuration based on Activity
	  * Collection of ims.therapies.treatment.domain.objects.RemedialMaterial.
	  */
	private java.util.Set material;
    public RemedialActivity (Integer id, int ver)
    {
    	super(id, ver);
    }
    public RemedialActivity ()
    {
    	super();
    }
    public RemedialActivity (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.therapies.treatment.domain.objects.RemedialActivity.class;
	}


	public ims.domain.lookups.LookupInstance getActivity() {
		return activity;
	}
	public void setActivity(ims.domain.lookups.LookupInstance activity) {
		this.activity = activity;
	}

	public ims.domain.lookups.LookupInstance getPatientPosition() {
		return patientPosition;
	}
	public void setPatientPosition(ims.domain.lookups.LookupInstance patientPosition) {
		this.patientPosition = patientPosition;
	}

	public ims.domain.lookups.LookupInstance getActivityPosition() {
		return activityPosition;
	}
	public void setActivityPosition(ims.domain.lookups.LookupInstance activityPosition) {
		this.activityPosition = activityPosition;
	}

	public ims.domain.lookups.LookupInstance getSequence() {
		return sequence;
	}
	public void setSequence(ims.domain.lookups.LookupInstance sequence) {
		this.sequence = sequence;
	}

	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Integer getActivityHeight() {
		return activityHeight;
	}
	public void setActivityHeight(Integer activityHeight) {
		this.activityHeight = activityHeight;
	}

	public String getNumberPauses() {
		return numberPauses;
	}
	public void setNumberPauses(String numberPauses) {
		if ( null != numberPauses && numberPauses.length() > 30 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for numberPauses. Tried to set value: "+
				numberPauses);
		}
		this.numberPauses = numberPauses;
	}

	public Integer getRestPeriod() {
		return restPeriod;
	}
	public void setRestPeriod(Integer restPeriod) {
		this.restPeriod = restPeriod;
	}

	public Integer getAveragePause() {
		return averagePause;
	}
	public void setAveragePause(Integer averagePause) {
		this.averagePause = averagePause;
	}

	public ims.domain.lookups.LookupInstance getIndependence() {
		return independence;
	}
	public void setIndependence(ims.domain.lookups.LookupInstance independence) {
		this.independence = independence;
	}

	public ims.domain.lookups.LookupInstance getSubjectiveObs() {
		return subjectiveObs;
	}
	public void setSubjectiveObs(ims.domain.lookups.LookupInstance subjectiveObs) {
		this.subjectiveObs = subjectiveObs;
	}

	public java.util.List getTechnique() {
		if ( null == technique ) {
			technique = new java.util.ArrayList();
		}
		return technique;
	}
	public void setTechnique(java.util.List paramValue) {
		this.technique = paramValue;
	}

	public java.util.Set getMaterial() {
		if ( null == material ) {
			material = new java.util.HashSet();
		}
		return material;
	}
	public void setMaterial(java.util.Set paramValue) {
		this.material = paramValue;
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
		
		auditStr.append("\r\n*activity* :");
		if (activity != null)
			auditStr.append(activity.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*patientPosition* :");
		if (patientPosition != null)
			auditStr.append(patientPosition.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*activityPosition* :");
		if (activityPosition != null)
			auditStr.append(activityPosition.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*sequence* :");
		if (sequence != null)
			auditStr.append(sequence.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*duration* :");
		auditStr.append(duration);
	    auditStr.append("; ");
		auditStr.append("\r\n*activityHeight* :");
		auditStr.append(activityHeight);
	    auditStr.append("; ");
		auditStr.append("\r\n*numberPauses* :");
		auditStr.append(numberPauses);
	    auditStr.append("; ");
		auditStr.append("\r\n*restPeriod* :");
		auditStr.append(restPeriod);
	    auditStr.append("; ");
		auditStr.append("\r\n*averagePause* :");
		auditStr.append(averagePause);
	    auditStr.append("; ");
		auditStr.append("\r\n*independence* :");
		if (independence != null)
			auditStr.append(independence.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*subjectiveObs* :");
		if (subjectiveObs != null)
			auditStr.append(subjectiveObs.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*technique* :");
		if (technique != null)
		{
			java.util.Iterator it12 = technique.iterator();
			int i12=0;
			while (it12.hasNext())
			{
				if (i12 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it12.next();
			auditStr.append(obj.getText());
			i12++;
		}
		if (i12 > 0)
			auditStr.append("] " + i12);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*material* :");
		if (material != null)
		{
			java.util.Iterator it13 = material.iterator();
			int i13=0;
			while (it13.hasNext())
			{
				if (i13 > 0)
					auditStr.append(",");
				ims.therapies.treatment.domain.objects.RemedialMaterial obj = (ims.therapies.treatment.domain.objects.RemedialMaterial)it13.next();
		if (obj != null)
		{
		   if (i13 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i13++;
		}
		if (i13 > 0)
			auditStr.append("] " + i13);
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
		
		String keyClassName = "RemedialActivity";
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
		if (this.getActivity() != null)
		{
			sb.append("<activity>");
			sb.append(this.getActivity().toXMLString()); 
			sb.append("</activity>");		
		}
		if (this.getPatientPosition() != null)
		{
			sb.append("<patientPosition>");
			sb.append(this.getPatientPosition().toXMLString()); 
			sb.append("</patientPosition>");		
		}
		if (this.getActivityPosition() != null)
		{
			sb.append("<activityPosition>");
			sb.append(this.getActivityPosition().toXMLString()); 
			sb.append("</activityPosition>");		
		}
		if (this.getSequence() != null)
		{
			sb.append("<sequence>");
			sb.append(this.getSequence().toXMLString()); 
			sb.append("</sequence>");		
		}
		if (this.getDuration() != null)
		{
			sb.append("<duration>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDuration().toString()));
			sb.append("</duration>");		
		}
		if (this.getActivityHeight() != null)
		{
			sb.append("<activityHeight>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getActivityHeight().toString()));
			sb.append("</activityHeight>");		
		}
		if (this.getNumberPauses() != null)
		{
			sb.append("<numberPauses>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNumberPauses().toString()));
			sb.append("</numberPauses>");		
		}
		if (this.getRestPeriod() != null)
		{
			sb.append("<restPeriod>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRestPeriod().toString()));
			sb.append("</restPeriod>");		
		}
		if (this.getAveragePause() != null)
		{
			sb.append("<averagePause>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAveragePause().toString()));
			sb.append("</averagePause>");		
		}
		if (this.getIndependence() != null)
		{
			sb.append("<independence>");
			sb.append(this.getIndependence().toXMLString()); 
			sb.append("</independence>");		
		}
		if (this.getSubjectiveObs() != null)
		{
			sb.append("<subjectiveObs>");
			sb.append(this.getSubjectiveObs().toXMLString()); 
			sb.append("</subjectiveObs>");		
		}
		if (this.getTechnique() != null)
		{
			if (this.getTechnique().size() > 0 )
			{
			sb.append("<technique>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getTechnique())); 
			sb.append("</technique>");		
			}
		}
		if (this.getMaterial() != null)
		{
			if (this.getMaterial().size() > 0 )
			{
			sb.append("<material>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getMaterial(), domMap));
			sb.append("</material>");		
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
			RemedialActivity domainObject = getRemedialActivityfromXML(itemEl, factory, domMap);

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
			RemedialActivity domainObject = getRemedialActivityfromXML(itemEl, factory, domMap);

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
		
	public static RemedialActivity getRemedialActivityfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getRemedialActivityfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static RemedialActivity getRemedialActivityfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!RemedialActivity.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!RemedialActivity.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the RemedialActivity class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (RemedialActivity)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(RemedialActivity.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		RemedialActivity ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (RemedialActivity)factory.getImportedDomainObject(RemedialActivity.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new RemedialActivity();
		}
		String keyClassName = "RemedialActivity";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (RemedialActivity)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, RemedialActivity obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("activity");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setActivity(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("patientPosition");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPatientPosition(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("activityPosition");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setActivityPosition(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("sequence");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSequence(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("duration");
		if(fldEl != null)
		{	
    		obj.setDuration(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("activityHeight");
		if(fldEl != null)
		{	
    		obj.setActivityHeight(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("numberPauses");
		if(fldEl != null)
		{	
    		obj.setNumberPauses(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("restPeriod");
		if(fldEl != null)
		{	
    		obj.setRestPeriod(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("averagePause");
		if(fldEl != null)
		{	
    		obj.setAveragePause(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("independence");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setIndependence(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("subjectiveObs");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSubjectiveObs(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("technique");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setTechnique(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getTechnique())); 
		}
		fldEl = el.element("material");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setMaterial(ims.therapies.treatment.domain.objects.RemedialMaterial.fromSetXMLString(fldEl, factory, obj.getMaterial(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "technique"
		, "material"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Activity = "activity";
		public static final String PatientPosition = "patientPosition";
		public static final String ActivityPosition = "activityPosition";
		public static final String Sequence = "sequence";
		public static final String Duration = "duration";
		public static final String ActivityHeight = "activityHeight";
		public static final String NumberPauses = "numberPauses";
		public static final String RestPeriod = "restPeriod";
		public static final String AveragePause = "averagePause";
		public static final String Independence = "independence";
		public static final String SubjectiveObs = "subjectiveObs";
		public static final String Technique = "technique";
		public static final String Material = "material";
	}
}

