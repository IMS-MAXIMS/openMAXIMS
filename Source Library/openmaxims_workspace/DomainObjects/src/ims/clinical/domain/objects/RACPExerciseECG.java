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
package ims.clinical.domain.objects;

/**
 * 
 * @author Joan Heelan
 * Generated.
 */


public class RACPExerciseECG extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100078;
	private static final long serialVersionUID = 1072100078L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** PreAssesses test of Coronory Heart Disease */
	private ims.domain.lookups.LookupInstance preAssessesCHD;
	/** Protocol */
	private ims.domain.lookups.LookupInstance protocol;
	/** Medication at Test
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List medicationAtTest;
	/** Duration - Minutes */
	private Integer durationMins;
	/** Duration - Seconds */
	private Integer durationSecs;
	/** Vital Signs - Peak Heart Rate */
	private ims.core.vitals.domain.objects.Pulse vSPulse;
	/** Vital Signs - Peak BP */
	private ims.core.vitals.domain.objects.Bloodpressure vSBP;
	/** % Max predictated Heart rate */
	private Integer maxPredHeartRate;
	/** Reasons for stopping
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List stopReasons;
	/** Breating Dysponea */
	private ims.domain.lookups.LookupInstance dysponea;
	/** Earliest Symptom Onset in mins */
	private Integer sympomOnset;
	/** Other Findings
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List otherFindings;
	/** Max ST Change ( mm) */
	private Integer maxSTChangeMM;
	/** Time to One millimeter change minutes */
	private Integer minsTo1mmChange;
	/** Time to One millimeter change seconds */
	private Integer secsTo1mmChange;
	/** Exercise Test Result */
	private ims.domain.lookups.LookupInstance result;
	/** Exercise Test Interpretation */
	private ims.domain.lookups.LookupInstance interpretation;
	/** PainExperienced */
	private ims.domain.lookups.LookupInstance painExperienced;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public RACPExerciseECG (Integer id, int ver)
    {
    	super(id, ver);
    }
    public RACPExerciseECG ()
    {
    	super();
    }
    public RACPExerciseECG (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.domain.objects.RACPExerciseECG.class;
	}


	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.domain.lookups.LookupInstance getPreAssessesCHD() {
		return preAssessesCHD;
	}
	public void setPreAssessesCHD(ims.domain.lookups.LookupInstance preAssessesCHD) {
		this.preAssessesCHD = preAssessesCHD;
	}

	public ims.domain.lookups.LookupInstance getProtocol() {
		return protocol;
	}
	public void setProtocol(ims.domain.lookups.LookupInstance protocol) {
		this.protocol = protocol;
	}

	public java.util.List getMedicationAtTest() {
		if ( null == medicationAtTest ) {
			medicationAtTest = new java.util.ArrayList();
		}
		return medicationAtTest;
	}
	public void setMedicationAtTest(java.util.List paramValue) {
		this.medicationAtTest = paramValue;
	}

	public Integer getDurationMins() {
		return durationMins;
	}
	public void setDurationMins(Integer durationMins) {
		this.durationMins = durationMins;
	}

	public Integer getDurationSecs() {
		return durationSecs;
	}
	public void setDurationSecs(Integer durationSecs) {
		this.durationSecs = durationSecs;
	}

	public ims.core.vitals.domain.objects.Pulse getVSPulse() {
		return vSPulse;
	}
	public void setVSPulse(ims.core.vitals.domain.objects.Pulse vSPulse) {
		this.vSPulse = vSPulse;
	}

	public ims.core.vitals.domain.objects.Bloodpressure getVSBP() {
		return vSBP;
	}
	public void setVSBP(ims.core.vitals.domain.objects.Bloodpressure vSBP) {
		this.vSBP = vSBP;
	}

	public Integer getMaxPredHeartRate() {
		return maxPredHeartRate;
	}
	public void setMaxPredHeartRate(Integer maxPredHeartRate) {
		this.maxPredHeartRate = maxPredHeartRate;
	}

	public java.util.List getStopReasons() {
		if ( null == stopReasons ) {
			stopReasons = new java.util.ArrayList();
		}
		return stopReasons;
	}
	public void setStopReasons(java.util.List paramValue) {
		this.stopReasons = paramValue;
	}

	public ims.domain.lookups.LookupInstance getDysponea() {
		return dysponea;
	}
	public void setDysponea(ims.domain.lookups.LookupInstance dysponea) {
		this.dysponea = dysponea;
	}

	public Integer getSympomOnset() {
		return sympomOnset;
	}
	public void setSympomOnset(Integer sympomOnset) {
		this.sympomOnset = sympomOnset;
	}

	public java.util.List getOtherFindings() {
		if ( null == otherFindings ) {
			otherFindings = new java.util.ArrayList();
		}
		return otherFindings;
	}
	public void setOtherFindings(java.util.List paramValue) {
		this.otherFindings = paramValue;
	}

	public Integer getMaxSTChangeMM() {
		return maxSTChangeMM;
	}
	public void setMaxSTChangeMM(Integer maxSTChangeMM) {
		this.maxSTChangeMM = maxSTChangeMM;
	}

	public Integer getMinsTo1mmChange() {
		return minsTo1mmChange;
	}
	public void setMinsTo1mmChange(Integer minsTo1mmChange) {
		this.minsTo1mmChange = minsTo1mmChange;
	}

	public Integer getSecsTo1mmChange() {
		return secsTo1mmChange;
	}
	public void setSecsTo1mmChange(Integer secsTo1mmChange) {
		this.secsTo1mmChange = secsTo1mmChange;
	}

	public ims.domain.lookups.LookupInstance getResult() {
		return result;
	}
	public void setResult(ims.domain.lookups.LookupInstance result) {
		this.result = result;
	}

	public ims.domain.lookups.LookupInstance getInterpretation() {
		return interpretation;
	}
	public void setInterpretation(ims.domain.lookups.LookupInstance interpretation) {
		this.interpretation = interpretation;
	}

	public ims.domain.lookups.LookupInstance getPainExperienced() {
		return painExperienced;
	}
	public void setPainExperienced(ims.domain.lookups.LookupInstance painExperienced) {
		this.painExperienced = painExperienced;
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
		
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*preAssessesCHD* :");
		if (preAssessesCHD != null)
			auditStr.append(preAssessesCHD.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*protocol* :");
		if (protocol != null)
			auditStr.append(protocol.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*medicationAtTest* :");
		if (medicationAtTest != null)
		{
			java.util.Iterator it4 = medicationAtTest.iterator();
			int i4=0;
			while (it4.hasNext())
			{
				if (i4 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it4.next();
			auditStr.append(obj.getText());
			i4++;
		}
		if (i4 > 0)
			auditStr.append("] " + i4);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*durationMins* :");
		auditStr.append(durationMins);
	    auditStr.append("; ");
		auditStr.append("\r\n*durationSecs* :");
		auditStr.append(durationSecs);
	    auditStr.append("; ");
		auditStr.append("\r\n*vSPulse* :");
		if (vSPulse != null)
		{
			auditStr.append(toShortClassName(vSPulse));
				
		    auditStr.append(vSPulse.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*vSBP* :");
		if (vSBP != null)
		{
			auditStr.append(toShortClassName(vSBP));
				
		    auditStr.append(vSBP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*maxPredHeartRate* :");
		auditStr.append(maxPredHeartRate);
	    auditStr.append("; ");
		auditStr.append("\r\n*stopReasons* :");
		if (stopReasons != null)
		{
			java.util.Iterator it10 = stopReasons.iterator();
			int i10=0;
			while (it10.hasNext())
			{
				if (i10 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it10.next();
			auditStr.append(obj.getText());
			i10++;
		}
		if (i10 > 0)
			auditStr.append("] " + i10);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*dysponea* :");
		if (dysponea != null)
			auditStr.append(dysponea.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*sympomOnset* :");
		auditStr.append(sympomOnset);
	    auditStr.append("; ");
		auditStr.append("\r\n*otherFindings* :");
		if (otherFindings != null)
		{
			java.util.Iterator it13 = otherFindings.iterator();
			int i13=0;
			while (it13.hasNext())
			{
				if (i13 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it13.next();
			auditStr.append(obj.getText());
			i13++;
		}
		if (i13 > 0)
			auditStr.append("] " + i13);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*maxSTChangeMM* :");
		auditStr.append(maxSTChangeMM);
	    auditStr.append("; ");
		auditStr.append("\r\n*minsTo1mmChange* :");
		auditStr.append(minsTo1mmChange);
	    auditStr.append("; ");
		auditStr.append("\r\n*secsTo1mmChange* :");
		auditStr.append(secsTo1mmChange);
	    auditStr.append("; ");
		auditStr.append("\r\n*result* :");
		if (result != null)
			auditStr.append(result.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*interpretation* :");
		if (interpretation != null)
			auditStr.append(interpretation.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*painExperienced* :");
		if (painExperienced != null)
			auditStr.append(painExperienced.getText());
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
		
		String keyClassName = "RACPExerciseECG";
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
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getPreAssessesCHD() != null)
		{
			sb.append("<preAssessesCHD>");
			sb.append(this.getPreAssessesCHD().toXMLString()); 
			sb.append("</preAssessesCHD>");		
		}
		if (this.getProtocol() != null)
		{
			sb.append("<protocol>");
			sb.append(this.getProtocol().toXMLString()); 
			sb.append("</protocol>");		
		}
		if (this.getMedicationAtTest() != null)
		{
			if (this.getMedicationAtTest().size() > 0 )
			{
			sb.append("<medicationAtTest>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getMedicationAtTest())); 
			sb.append("</medicationAtTest>");		
			}
		}
		if (this.getDurationMins() != null)
		{
			sb.append("<durationMins>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDurationMins().toString()));
			sb.append("</durationMins>");		
		}
		if (this.getDurationSecs() != null)
		{
			sb.append("<durationSecs>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDurationSecs().toString()));
			sb.append("</durationSecs>");		
		}
		if (this.getVSPulse() != null)
		{
			sb.append("<vSPulse>");
			sb.append(this.getVSPulse().toXMLString(domMap)); 	
			sb.append("</vSPulse>");		
		}
		if (this.getVSBP() != null)
		{
			sb.append("<vSBP>");
			sb.append(this.getVSBP().toXMLString(domMap)); 	
			sb.append("</vSBP>");		
		}
		if (this.getMaxPredHeartRate() != null)
		{
			sb.append("<maxPredHeartRate>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMaxPredHeartRate().toString()));
			sb.append("</maxPredHeartRate>");		
		}
		if (this.getStopReasons() != null)
		{
			if (this.getStopReasons().size() > 0 )
			{
			sb.append("<stopReasons>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getStopReasons())); 
			sb.append("</stopReasons>");		
			}
		}
		if (this.getDysponea() != null)
		{
			sb.append("<dysponea>");
			sb.append(this.getDysponea().toXMLString()); 
			sb.append("</dysponea>");		
		}
		if (this.getSympomOnset() != null)
		{
			sb.append("<sympomOnset>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSympomOnset().toString()));
			sb.append("</sympomOnset>");		
		}
		if (this.getOtherFindings() != null)
		{
			if (this.getOtherFindings().size() > 0 )
			{
			sb.append("<otherFindings>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getOtherFindings())); 
			sb.append("</otherFindings>");		
			}
		}
		if (this.getMaxSTChangeMM() != null)
		{
			sb.append("<maxSTChangeMM>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMaxSTChangeMM().toString()));
			sb.append("</maxSTChangeMM>");		
		}
		if (this.getMinsTo1mmChange() != null)
		{
			sb.append("<minsTo1mmChange>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMinsTo1mmChange().toString()));
			sb.append("</minsTo1mmChange>");		
		}
		if (this.getSecsTo1mmChange() != null)
		{
			sb.append("<secsTo1mmChange>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSecsTo1mmChange().toString()));
			sb.append("</secsTo1mmChange>");		
		}
		if (this.getResult() != null)
		{
			sb.append("<result>");
			sb.append(this.getResult().toXMLString()); 
			sb.append("</result>");		
		}
		if (this.getInterpretation() != null)
		{
			sb.append("<interpretation>");
			sb.append(this.getInterpretation().toXMLString()); 
			sb.append("</interpretation>");		
		}
		if (this.getPainExperienced() != null)
		{
			sb.append("<painExperienced>");
			sb.append(this.getPainExperienced().toXMLString()); 
			sb.append("</painExperienced>");		
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
			RACPExerciseECG domainObject = getRACPExerciseECGfromXML(itemEl, factory, domMap);

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
			RACPExerciseECG domainObject = getRACPExerciseECGfromXML(itemEl, factory, domMap);

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
		
	public static RACPExerciseECG getRACPExerciseECGfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getRACPExerciseECGfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static RACPExerciseECG getRACPExerciseECGfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!RACPExerciseECG.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!RACPExerciseECG.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the RACPExerciseECG class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (RACPExerciseECG)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(RACPExerciseECG.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		RACPExerciseECG ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (RACPExerciseECG)factory.getImportedDomainObject(RACPExerciseECG.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new RACPExerciseECG();
		}
		String keyClassName = "RACPExerciseECG";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (RACPExerciseECG)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, RACPExerciseECG obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("preAssessesCHD");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPreAssessesCHD(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("protocol");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setProtocol(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("medicationAtTest");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setMedicationAtTest(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getMedicationAtTest())); 
		}
		fldEl = el.element("durationMins");
		if(fldEl != null)
		{	
    		obj.setDurationMins(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("durationSecs");
		if(fldEl != null)
		{	
    		obj.setDurationSecs(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("vSPulse");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setVSPulse(ims.core.vitals.domain.objects.Pulse.getPulsefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("vSBP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setVSBP(ims.core.vitals.domain.objects.Bloodpressure.getBloodpressurefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("maxPredHeartRate");
		if(fldEl != null)
		{	
    		obj.setMaxPredHeartRate(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("stopReasons");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setStopReasons(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getStopReasons())); 
		}
		fldEl = el.element("dysponea");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDysponea(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("sympomOnset");
		if(fldEl != null)
		{	
    		obj.setSympomOnset(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("otherFindings");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setOtherFindings(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getOtherFindings())); 
		}
		fldEl = el.element("maxSTChangeMM");
		if(fldEl != null)
		{	
    		obj.setMaxSTChangeMM(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("minsTo1mmChange");
		if(fldEl != null)
		{	
    		obj.setMinsTo1mmChange(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("secsTo1mmChange");
		if(fldEl != null)
		{	
    		obj.setSecsTo1mmChange(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("result");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setResult(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("interpretation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setInterpretation(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("painExperienced");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPainExperienced(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "medicationAtTest"
		, "stopReasons"
		, "otherFindings"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String CareContext = "careContext";
		public static final String PreAssessesCHD = "preAssessesCHD";
		public static final String Protocol = "protocol";
		public static final String MedicationAtTest = "medicationAtTest";
		public static final String DurationMins = "durationMins";
		public static final String DurationSecs = "durationSecs";
		public static final String VSPulse = "vSPulse";
		public static final String VSBP = "vSBP";
		public static final String MaxPredHeartRate = "maxPredHeartRate";
		public static final String StopReasons = "stopReasons";
		public static final String Dysponea = "dysponea";
		public static final String SympomOnset = "sympomOnset";
		public static final String OtherFindings = "otherFindings";
		public static final String MaxSTChangeMM = "maxSTChangeMM";
		public static final String MinsTo1mmChange = "minsTo1mmChange";
		public static final String SecsTo1mmChange = "secsTo1mmChange";
		public static final String Result = "result";
		public static final String Interpretation = "interpretation";
		public static final String PainExperienced = "painExperienced";
	}
}

