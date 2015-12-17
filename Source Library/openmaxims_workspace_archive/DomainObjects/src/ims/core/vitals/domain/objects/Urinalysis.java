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
package ims.core.vitals.domain.objects;

/**
 * 
 * @author Sinead McDermott
 * Generated.
 */


public class Urinalysis extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1022100012;
	private static final long serialVersionUID = 1022100012L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** No Abnormality Detected: disables all other fields if selected */
	private Boolean noAbnormalityDetected;
	/** Leucocytes */
	private ims.domain.lookups.LookupInstance leucocytes;
	/** Protein */
	private ims.domain.lookups.LookupInstance protein;
	/** Blood */
	private ims.domain.lookups.LookupInstance blood;
	/** Ketones */
	private ims.domain.lookups.LookupInstance ketones;
	/** Glucose */
	private ims.domain.lookups.LookupInstance glucose;
	/** Ascorbic Acid */
	private ims.domain.lookups.LookupInstance ascorbicAcid;
	/** Bilirubin */
	private ims.domain.lookups.LookupInstance bilirubin;
	/** Urobilinogen */
	private ims.domain.lookups.LookupInstance urobilinogen;
	/** Nitrate */
	private Boolean nitrate;
	/** pH */
	private ims.domain.lookups.LookupInstance pH;
	/** Specific Gravity */
	private java.lang.Float specificGravity;
	/** Pregnancy indicator: Human Choriogonadotropin */
	private Boolean bHCG;
	/** No Sample */
	private Boolean noSample;
	/** Is Active */
	private Boolean isActive;
	/** ClinicalContact */
	private ims.core.admin.domain.objects.ClinicalContact clinicalContact;
	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** AuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** RecordingInformation */
	private ims.core.clinical.domain.objects.RecordingUserInformation recordingInformation;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public Urinalysis (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Urinalysis ()
    {
    	super();
    }
    public Urinalysis (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.vitals.domain.objects.Urinalysis.class;
	}


	public Boolean isNoAbnormalityDetected() {
		return noAbnormalityDetected;
	}
	public void setNoAbnormalityDetected(Boolean noAbnormalityDetected) {
		this.noAbnormalityDetected = noAbnormalityDetected;
	}

	public ims.domain.lookups.LookupInstance getLeucocytes() {
		return leucocytes;
	}
	public void setLeucocytes(ims.domain.lookups.LookupInstance leucocytes) {
		this.leucocytes = leucocytes;
	}

	public ims.domain.lookups.LookupInstance getProtein() {
		return protein;
	}
	public void setProtein(ims.domain.lookups.LookupInstance protein) {
		this.protein = protein;
	}

	public ims.domain.lookups.LookupInstance getBlood() {
		return blood;
	}
	public void setBlood(ims.domain.lookups.LookupInstance blood) {
		this.blood = blood;
	}

	public ims.domain.lookups.LookupInstance getKetones() {
		return ketones;
	}
	public void setKetones(ims.domain.lookups.LookupInstance ketones) {
		this.ketones = ketones;
	}

	public ims.domain.lookups.LookupInstance getGlucose() {
		return glucose;
	}
	public void setGlucose(ims.domain.lookups.LookupInstance glucose) {
		this.glucose = glucose;
	}

	public ims.domain.lookups.LookupInstance getAscorbicAcid() {
		return ascorbicAcid;
	}
	public void setAscorbicAcid(ims.domain.lookups.LookupInstance ascorbicAcid) {
		this.ascorbicAcid = ascorbicAcid;
	}

	public ims.domain.lookups.LookupInstance getBilirubin() {
		return bilirubin;
	}
	public void setBilirubin(ims.domain.lookups.LookupInstance bilirubin) {
		this.bilirubin = bilirubin;
	}

	public ims.domain.lookups.LookupInstance getUrobilinogen() {
		return urobilinogen;
	}
	public void setUrobilinogen(ims.domain.lookups.LookupInstance urobilinogen) {
		this.urobilinogen = urobilinogen;
	}

	public Boolean isNitrate() {
		return nitrate;
	}
	public void setNitrate(Boolean nitrate) {
		this.nitrate = nitrate;
	}

	public ims.domain.lookups.LookupInstance getPH() {
		return pH;
	}
	public void setPH(ims.domain.lookups.LookupInstance pH) {
		this.pH = pH;
	}

	public java.lang.Float getSpecificGravity() {
		return specificGravity;
	}
	public void setSpecificGravity(java.lang.Float specificGravity) {
		this.specificGravity = specificGravity;
	}

	public Boolean isBHCG() {
		return bHCG;
	}
	public void setBHCG(Boolean bHCG) {
		this.bHCG = bHCG;
	}

	public Boolean isNoSample() {
		return noSample;
	}
	public void setNoSample(Boolean noSample) {
		this.noSample = noSample;
	}

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public ims.core.admin.domain.objects.ClinicalContact getClinicalContact() {
		return clinicalContact;
	}
	public void setClinicalContact(ims.core.admin.domain.objects.ClinicalContact clinicalContact) {
		this.clinicalContact = clinicalContact;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
	}

	public ims.core.clinical.domain.objects.RecordingUserInformation getRecordingInformation() {
		return recordingInformation;
	}
	public void setRecordingInformation(ims.core.clinical.domain.objects.RecordingUserInformation recordingInformation) {
		this.recordingInformation = recordingInformation;
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
		
		auditStr.append("\r\n*noAbnormalityDetected* :");
		auditStr.append(noAbnormalityDetected);
	    auditStr.append("; ");
		auditStr.append("\r\n*leucocytes* :");
		if (leucocytes != null)
			auditStr.append(leucocytes.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*protein* :");
		if (protein != null)
			auditStr.append(protein.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*blood* :");
		if (blood != null)
			auditStr.append(blood.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*ketones* :");
		if (ketones != null)
			auditStr.append(ketones.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*glucose* :");
		if (glucose != null)
			auditStr.append(glucose.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*ascorbicAcid* :");
		if (ascorbicAcid != null)
			auditStr.append(ascorbicAcid.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*bilirubin* :");
		if (bilirubin != null)
			auditStr.append(bilirubin.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*urobilinogen* :");
		if (urobilinogen != null)
			auditStr.append(urobilinogen.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*nitrate* :");
		auditStr.append(nitrate);
	    auditStr.append("; ");
		auditStr.append("\r\n*pH* :");
		if (pH != null)
			auditStr.append(pH.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*specificGravity* :");
		auditStr.append(specificGravity);
	    auditStr.append("; ");
		auditStr.append("\r\n*bHCG* :");
		auditStr.append(bHCG);
	    auditStr.append("; ");
		auditStr.append("\r\n*noSample* :");
		auditStr.append(noSample);
	    auditStr.append("; ");
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalContact* :");
		if (clinicalContact != null)
		{
			auditStr.append(toShortClassName(clinicalContact));
				
		    auditStr.append(clinicalContact.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*recordingInformation* :");
		if (recordingInformation != null)
		{
			auditStr.append(toShortClassName(recordingInformation));
				
		    auditStr.append(recordingInformation.toString());
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
		
		String keyClassName = "Urinalysis";
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
		if (this.isNoAbnormalityDetected() != null)
		{
			sb.append("<noAbnormalityDetected>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isNoAbnormalityDetected().toString()));
			sb.append("</noAbnormalityDetected>");		
		}
		if (this.getLeucocytes() != null)
		{
			sb.append("<leucocytes>");
			sb.append(this.getLeucocytes().toXMLString()); 
			sb.append("</leucocytes>");		
		}
		if (this.getProtein() != null)
		{
			sb.append("<protein>");
			sb.append(this.getProtein().toXMLString()); 
			sb.append("</protein>");		
		}
		if (this.getBlood() != null)
		{
			sb.append("<blood>");
			sb.append(this.getBlood().toXMLString()); 
			sb.append("</blood>");		
		}
		if (this.getKetones() != null)
		{
			sb.append("<ketones>");
			sb.append(this.getKetones().toXMLString()); 
			sb.append("</ketones>");		
		}
		if (this.getGlucose() != null)
		{
			sb.append("<glucose>");
			sb.append(this.getGlucose().toXMLString()); 
			sb.append("</glucose>");		
		}
		if (this.getAscorbicAcid() != null)
		{
			sb.append("<ascorbicAcid>");
			sb.append(this.getAscorbicAcid().toXMLString()); 
			sb.append("</ascorbicAcid>");		
		}
		if (this.getBilirubin() != null)
		{
			sb.append("<bilirubin>");
			sb.append(this.getBilirubin().toXMLString()); 
			sb.append("</bilirubin>");		
		}
		if (this.getUrobilinogen() != null)
		{
			sb.append("<urobilinogen>");
			sb.append(this.getUrobilinogen().toXMLString()); 
			sb.append("</urobilinogen>");		
		}
		if (this.isNitrate() != null)
		{
			sb.append("<nitrate>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isNitrate().toString()));
			sb.append("</nitrate>");		
		}
		if (this.getPH() != null)
		{
			sb.append("<pH>");
			sb.append(this.getPH().toXMLString()); 
			sb.append("</pH>");		
		}
		if (this.getSpecificGravity() != null)
		{
			sb.append("<specificGravity>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSpecificGravity().toString()));
			sb.append("</specificGravity>");		
		}
		if (this.isBHCG() != null)
		{
			sb.append("<bHCG>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isBHCG().toString()));
			sb.append("</bHCG>");		
		}
		if (this.isNoSample() != null)
		{
			sb.append("<noSample>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isNoSample().toString()));
			sb.append("</noSample>");		
		}
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
		}
		if (this.getClinicalContact() != null)
		{
			sb.append("<clinicalContact>");
			sb.append(this.getClinicalContact().toXMLString(domMap)); 	
			sb.append("</clinicalContact>");		
		}
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
		}
		if (this.getRecordingInformation() != null)
		{
			sb.append("<recordingInformation>");
			sb.append(this.getRecordingInformation().toXMLString(domMap)); 	
			sb.append("</recordingInformation>");		
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
			Urinalysis domainObject = getUrinalysisfromXML(itemEl, factory, domMap);

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
			Urinalysis domainObject = getUrinalysisfromXML(itemEl, factory, domMap);

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
		
	public static Urinalysis getUrinalysisfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getUrinalysisfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Urinalysis getUrinalysisfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Urinalysis.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Urinalysis.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Urinalysis class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Urinalysis)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Urinalysis.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Urinalysis ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Urinalysis)factory.getImportedDomainObject(Urinalysis.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Urinalysis();
		}
		String keyClassName = "Urinalysis";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Urinalysis)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Urinalysis obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("noAbnormalityDetected");
		if(fldEl != null)
		{	
    		obj.setNoAbnormalityDetected(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("leucocytes");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setLeucocytes(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("protein");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setProtein(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("blood");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setBlood(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("ketones");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setKetones(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("glucose");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setGlucose(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("ascorbicAcid");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAscorbicAcid(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("bilirubin");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setBilirubin(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("urobilinogen");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setUrobilinogen(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("nitrate");
		if(fldEl != null)
		{	
    		obj.setNitrate(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pH");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPH(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("specificGravity");
		if(fldEl != null)
		{	
    		obj.setSpecificGravity(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("bHCG");
		if(fldEl != null)
		{	
    		obj.setBHCG(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("noSample");
		if(fldEl != null)
		{	
    		obj.setNoSample(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("clinicalContact");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClinicalContact(ims.core.admin.domain.objects.ClinicalContact.getClinicalContactfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("recordingInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRecordingInformation(ims.core.clinical.domain.objects.RecordingUserInformation.getRecordingUserInformationfromXML(fldEl, factory, domMap)); 
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
		public static final String NoAbnormalityDetected = "noAbnormalityDetected";
		public static final String Leucocytes = "leucocytes";
		public static final String Protein = "protein";
		public static final String Blood = "blood";
		public static final String Ketones = "ketones";
		public static final String Glucose = "glucose";
		public static final String AscorbicAcid = "ascorbicAcid";
		public static final String Bilirubin = "bilirubin";
		public static final String Urobilinogen = "urobilinogen";
		public static final String Nitrate = "nitrate";
		public static final String PH = "pH";
		public static final String SpecificGravity = "specificGravity";
		public static final String BHCG = "bHCG";
		public static final String NoSample = "noSample";
		public static final String IsActive = "isActive";
		public static final String ClinicalContact = "clinicalContact";
		public static final String CareContext = "careContext";
		public static final String AuthoringInformation = "authoringInformation";
		public static final String RecordingInformation = "recordingInformation";
	}
}

