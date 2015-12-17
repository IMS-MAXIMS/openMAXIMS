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


public class ElectrotherapyUltrasoundTreatment extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1019100027;
	private static final long serialVersionUID = 1019100027L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Machine */
	private ims.therapies.admin.domain.objects.TreatmentEquipmentConfig machineUsed;
	/** Target */
	private ims.domain.lookups.LookupInstance target;
	/** AreaTreated */
	private ims.domain.lookups.LookupInstance areaTreated;
	/** Muscle Aspect */
	private ims.domain.lookups.LookupInstance muscleAspect;
	/** Laterality */
	private ims.domain.lookups.LookupInstance laterality;
	/** Wave */
	private ims.domain.lookups.LookupInstance wave;
	/** Pulse */
	private ims.domain.lookups.LookupInstance pulse;
	/** Duration (mins) */
	private Integer duration;
	/** Frequency (mHz) */
	private ims.domain.lookups.LookupInstance frequency;
	/** Intensity (w/cm2) */
	private ims.domain.lookups.LookupInstance intensity;
	/** Comment */
	private String comment;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ElectrotherapyUltrasoundTreatment (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ElectrotherapyUltrasoundTreatment ()
    {
    	super();
    }
    public ElectrotherapyUltrasoundTreatment (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.therapies.treatment.domain.objects.ElectrotherapyUltrasoundTreatment.class;
	}


	public ims.therapies.admin.domain.objects.TreatmentEquipmentConfig getMachineUsed() {
		return machineUsed;
	}
	public void setMachineUsed(ims.therapies.admin.domain.objects.TreatmentEquipmentConfig machineUsed) {
		this.machineUsed = machineUsed;
	}

	public ims.domain.lookups.LookupInstance getTarget() {
		return target;
	}
	public void setTarget(ims.domain.lookups.LookupInstance target) {
		this.target = target;
	}

	public ims.domain.lookups.LookupInstance getAreaTreated() {
		return areaTreated;
	}
	public void setAreaTreated(ims.domain.lookups.LookupInstance areaTreated) {
		this.areaTreated = areaTreated;
	}

	public ims.domain.lookups.LookupInstance getMuscleAspect() {
		return muscleAspect;
	}
	public void setMuscleAspect(ims.domain.lookups.LookupInstance muscleAspect) {
		this.muscleAspect = muscleAspect;
	}

	public ims.domain.lookups.LookupInstance getLaterality() {
		return laterality;
	}
	public void setLaterality(ims.domain.lookups.LookupInstance laterality) {
		this.laterality = laterality;
	}

	public ims.domain.lookups.LookupInstance getWave() {
		return wave;
	}
	public void setWave(ims.domain.lookups.LookupInstance wave) {
		this.wave = wave;
	}

	public ims.domain.lookups.LookupInstance getPulse() {
		return pulse;
	}
	public void setPulse(ims.domain.lookups.LookupInstance pulse) {
		this.pulse = pulse;
	}

	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public ims.domain.lookups.LookupInstance getFrequency() {
		return frequency;
	}
	public void setFrequency(ims.domain.lookups.LookupInstance frequency) {
		this.frequency = frequency;
	}

	public ims.domain.lookups.LookupInstance getIntensity() {
		return intensity;
	}
	public void setIntensity(ims.domain.lookups.LookupInstance intensity) {
		this.intensity = intensity;
	}

	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		if ( null != comment && comment.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for comment. Tried to set value: "+
				comment);
		}
		this.comment = comment;
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
		
		auditStr.append("\r\n*machineUsed* :");
		if (machineUsed != null)
		{
			auditStr.append(toShortClassName(machineUsed));
				
		    auditStr.append(machineUsed.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*target* :");
		if (target != null)
			auditStr.append(target.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*areaTreated* :");
		if (areaTreated != null)
			auditStr.append(areaTreated.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*muscleAspect* :");
		if (muscleAspect != null)
			auditStr.append(muscleAspect.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*laterality* :");
		if (laterality != null)
			auditStr.append(laterality.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*wave* :");
		if (wave != null)
			auditStr.append(wave.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*pulse* :");
		if (pulse != null)
			auditStr.append(pulse.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*duration* :");
		auditStr.append(duration);
	    auditStr.append("; ");
		auditStr.append("\r\n*frequency* :");
		if (frequency != null)
			auditStr.append(frequency.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*intensity* :");
		if (intensity != null)
			auditStr.append(intensity.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*comment* :");
		auditStr.append(comment);
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
		
		String keyClassName = "ElectrotherapyUltrasoundTreatment";
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
		if (this.getMachineUsed() != null)
		{
			sb.append("<machineUsed>");
			sb.append(this.getMachineUsed().toXMLString(domMap)); 	
			sb.append("</machineUsed>");		
		}
		if (this.getTarget() != null)
		{
			sb.append("<target>");
			sb.append(this.getTarget().toXMLString()); 
			sb.append("</target>");		
		}
		if (this.getAreaTreated() != null)
		{
			sb.append("<areaTreated>");
			sb.append(this.getAreaTreated().toXMLString()); 
			sb.append("</areaTreated>");		
		}
		if (this.getMuscleAspect() != null)
		{
			sb.append("<muscleAspect>");
			sb.append(this.getMuscleAspect().toXMLString()); 
			sb.append("</muscleAspect>");		
		}
		if (this.getLaterality() != null)
		{
			sb.append("<laterality>");
			sb.append(this.getLaterality().toXMLString()); 
			sb.append("</laterality>");		
		}
		if (this.getWave() != null)
		{
			sb.append("<wave>");
			sb.append(this.getWave().toXMLString()); 
			sb.append("</wave>");		
		}
		if (this.getPulse() != null)
		{
			sb.append("<pulse>");
			sb.append(this.getPulse().toXMLString()); 
			sb.append("</pulse>");		
		}
		if (this.getDuration() != null)
		{
			sb.append("<duration>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDuration().toString()));
			sb.append("</duration>");		
		}
		if (this.getFrequency() != null)
		{
			sb.append("<frequency>");
			sb.append(this.getFrequency().toXMLString()); 
			sb.append("</frequency>");		
		}
		if (this.getIntensity() != null)
		{
			sb.append("<intensity>");
			sb.append(this.getIntensity().toXMLString()); 
			sb.append("</intensity>");		
		}
		if (this.getComment() != null)
		{
			sb.append("<comment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComment().toString()));
			sb.append("</comment>");		
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
			ElectrotherapyUltrasoundTreatment domainObject = getElectrotherapyUltrasoundTreatmentfromXML(itemEl, factory, domMap);

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
			ElectrotherapyUltrasoundTreatment domainObject = getElectrotherapyUltrasoundTreatmentfromXML(itemEl, factory, domMap);

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
		
	public static ElectrotherapyUltrasoundTreatment getElectrotherapyUltrasoundTreatmentfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getElectrotherapyUltrasoundTreatmentfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ElectrotherapyUltrasoundTreatment getElectrotherapyUltrasoundTreatmentfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ElectrotherapyUltrasoundTreatment.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ElectrotherapyUltrasoundTreatment.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ElectrotherapyUltrasoundTreatment class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ElectrotherapyUltrasoundTreatment)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ElectrotherapyUltrasoundTreatment.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ElectrotherapyUltrasoundTreatment ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ElectrotherapyUltrasoundTreatment)factory.getImportedDomainObject(ElectrotherapyUltrasoundTreatment.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ElectrotherapyUltrasoundTreatment();
		}
		String keyClassName = "ElectrotherapyUltrasoundTreatment";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ElectrotherapyUltrasoundTreatment)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ElectrotherapyUltrasoundTreatment obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("machineUsed");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setMachineUsed(ims.therapies.admin.domain.objects.TreatmentEquipmentConfig.getTreatmentEquipmentConfigfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("target");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTarget(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("areaTreated");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAreaTreated(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("muscleAspect");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMuscleAspect(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("laterality");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setLaterality(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("wave");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setWave(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("pulse");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPulse(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("duration");
		if(fldEl != null)
		{	
    		obj.setDuration(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("frequency");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setFrequency(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("intensity");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setIntensity(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("comment");
		if(fldEl != null)
		{	
    		obj.setComment(new String(fldEl.getTextTrim()));	
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
		public static final String MachineUsed = "machineUsed";
		public static final String Target = "target";
		public static final String AreaTreated = "areaTreated";
		public static final String MuscleAspect = "muscleAspect";
		public static final String Laterality = "laterality";
		public static final String Wave = "wave";
		public static final String Pulse = "pulse";
		public static final String Duration = "duration";
		public static final String Frequency = "frequency";
		public static final String Intensity = "intensity";
		public static final String Comment = "comment";
	}
}

