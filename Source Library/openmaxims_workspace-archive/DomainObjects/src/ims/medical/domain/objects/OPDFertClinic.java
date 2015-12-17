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
package ims.medical.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class OPDFertClinic extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1023100027;
	private static final long serialVersionUID = 1023100027L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Can Patient Achieve Erection? */
	private ims.domain.lookups.LookupInstance achieveErection;
	/** Erectile Dysfunction treatments
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List erectDysfxTreatments;
	/** Sex Drive? */
	private ims.domain.lookups.LookupInstance sexDrive;
	/** Ejaculation */
	private ims.domain.lookups.LookupInstance ejaculation;
	/** Bladder Drainage
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List bladderDrainage;
	/** Bladder Drainage Text */
	private String bladderDrainagetxt;
	/** Testicular Atrophy */
	private ims.domain.lookups.LookupInstance testAtrophy;
	/** Endocrine Evaluation Performed?
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List endoEvalPerf;
	/** Infection Screening
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List infxnScreening;
	/** Consent for Screening */
	private ims.domain.lookups.LookupInstance screenConsent;
	/** Semen Culture */
	private ims.domain.lookups.LookupInstance semenCulture;
	/** Semen Analysis
	  * Collection of ims.medical.domain.objects.OPDFertClinicSemenAna.
	  */
	private java.util.Set semenFindings;
	/** Elisa */
	private ims.domain.lookups.LookupInstance elisa;
	/** Success With
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List methodssuccessWith;
	/** Sperm Frozen */
	private ims.domain.lookups.LookupInstance spermFrozen;
	/** Treatements Offered
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List treatmentsoffered;
	/** CareContext */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** AuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public OPDFertClinic (Integer id, int ver)
    {
    	super(id, ver);
    }
    public OPDFertClinic ()
    {
    	super();
    }
    public OPDFertClinic (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.medical.domain.objects.OPDFertClinic.class;
	}


	public ims.domain.lookups.LookupInstance getAchieveErection() {
		return achieveErection;
	}
	public void setAchieveErection(ims.domain.lookups.LookupInstance achieveErection) {
		this.achieveErection = achieveErection;
	}

	public java.util.List getErectDysfxTreatments() {
		if ( null == erectDysfxTreatments ) {
			erectDysfxTreatments = new java.util.ArrayList();
		}
		return erectDysfxTreatments;
	}
	public void setErectDysfxTreatments(java.util.List paramValue) {
		this.erectDysfxTreatments = paramValue;
	}

	public ims.domain.lookups.LookupInstance getSexDrive() {
		return sexDrive;
	}
	public void setSexDrive(ims.domain.lookups.LookupInstance sexDrive) {
		this.sexDrive = sexDrive;
	}

	public ims.domain.lookups.LookupInstance getEjaculation() {
		return ejaculation;
	}
	public void setEjaculation(ims.domain.lookups.LookupInstance ejaculation) {
		this.ejaculation = ejaculation;
	}

	public java.util.List getBladderDrainage() {
		if ( null == bladderDrainage ) {
			bladderDrainage = new java.util.ArrayList();
		}
		return bladderDrainage;
	}
	public void setBladderDrainage(java.util.List paramValue) {
		this.bladderDrainage = paramValue;
	}

	public String getBladderDrainagetxt() {
		return bladderDrainagetxt;
	}
	public void setBladderDrainagetxt(String bladderDrainagetxt) {
		if ( null != bladderDrainagetxt && bladderDrainagetxt.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for bladderDrainagetxt. Tried to set value: "+
				bladderDrainagetxt);
		}
		this.bladderDrainagetxt = bladderDrainagetxt;
	}

	public ims.domain.lookups.LookupInstance getTestAtrophy() {
		return testAtrophy;
	}
	public void setTestAtrophy(ims.domain.lookups.LookupInstance testAtrophy) {
		this.testAtrophy = testAtrophy;
	}

	public java.util.List getEndoEvalPerf() {
		if ( null == endoEvalPerf ) {
			endoEvalPerf = new java.util.ArrayList();
		}
		return endoEvalPerf;
	}
	public void setEndoEvalPerf(java.util.List paramValue) {
		this.endoEvalPerf = paramValue;
	}

	public java.util.List getInfxnScreening() {
		if ( null == infxnScreening ) {
			infxnScreening = new java.util.ArrayList();
		}
		return infxnScreening;
	}
	public void setInfxnScreening(java.util.List paramValue) {
		this.infxnScreening = paramValue;
	}

	public ims.domain.lookups.LookupInstance getScreenConsent() {
		return screenConsent;
	}
	public void setScreenConsent(ims.domain.lookups.LookupInstance screenConsent) {
		this.screenConsent = screenConsent;
	}

	public ims.domain.lookups.LookupInstance getSemenCulture() {
		return semenCulture;
	}
	public void setSemenCulture(ims.domain.lookups.LookupInstance semenCulture) {
		this.semenCulture = semenCulture;
	}

	public java.util.Set getSemenFindings() {
		if ( null == semenFindings ) {
			semenFindings = new java.util.HashSet();
		}
		return semenFindings;
	}
	public void setSemenFindings(java.util.Set paramValue) {
		this.semenFindings = paramValue;
	}

	public ims.domain.lookups.LookupInstance getElisa() {
		return elisa;
	}
	public void setElisa(ims.domain.lookups.LookupInstance elisa) {
		this.elisa = elisa;
	}

	public java.util.List getMethodssuccessWith() {
		if ( null == methodssuccessWith ) {
			methodssuccessWith = new java.util.ArrayList();
		}
		return methodssuccessWith;
	}
	public void setMethodssuccessWith(java.util.List paramValue) {
		this.methodssuccessWith = paramValue;
	}

	public ims.domain.lookups.LookupInstance getSpermFrozen() {
		return spermFrozen;
	}
	public void setSpermFrozen(ims.domain.lookups.LookupInstance spermFrozen) {
		this.spermFrozen = spermFrozen;
	}

	public java.util.List getTreatmentsoffered() {
		if ( null == treatmentsoffered ) {
			treatmentsoffered = new java.util.ArrayList();
		}
		return treatmentsoffered;
	}
	public void setTreatmentsoffered(java.util.List paramValue) {
		this.treatmentsoffered = paramValue;
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
		
		auditStr.append("\r\n*achieveErection* :");
		if (achieveErection != null)
			auditStr.append(achieveErection.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*erectDysfxTreatments* :");
		if (erectDysfxTreatments != null)
		{
			java.util.Iterator it2 = erectDysfxTreatments.iterator();
			int i2=0;
			while (it2.hasNext())
			{
				if (i2 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it2.next();
			auditStr.append(obj.getText());
			i2++;
		}
		if (i2 > 0)
			auditStr.append("] " + i2);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*sexDrive* :");
		if (sexDrive != null)
			auditStr.append(sexDrive.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*ejaculation* :");
		if (ejaculation != null)
			auditStr.append(ejaculation.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*bladderDrainage* :");
		if (bladderDrainage != null)
		{
			java.util.Iterator it5 = bladderDrainage.iterator();
			int i5=0;
			while (it5.hasNext())
			{
				if (i5 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it5.next();
			auditStr.append(obj.getText());
			i5++;
		}
		if (i5 > 0)
			auditStr.append("] " + i5);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*bladderDrainagetxt* :");
		auditStr.append(bladderDrainagetxt);
	    auditStr.append("; ");
		auditStr.append("\r\n*testAtrophy* :");
		if (testAtrophy != null)
			auditStr.append(testAtrophy.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*endoEvalPerf* :");
		if (endoEvalPerf != null)
		{
			java.util.Iterator it8 = endoEvalPerf.iterator();
			int i8=0;
			while (it8.hasNext())
			{
				if (i8 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it8.next();
			auditStr.append(obj.getText());
			i8++;
		}
		if (i8 > 0)
			auditStr.append("] " + i8);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*infxnScreening* :");
		if (infxnScreening != null)
		{
			java.util.Iterator it9 = infxnScreening.iterator();
			int i9=0;
			while (it9.hasNext())
			{
				if (i9 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it9.next();
			auditStr.append(obj.getText());
			i9++;
		}
		if (i9 > 0)
			auditStr.append("] " + i9);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*screenConsent* :");
		if (screenConsent != null)
			auditStr.append(screenConsent.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*semenCulture* :");
		if (semenCulture != null)
			auditStr.append(semenCulture.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*semenFindings* :");
		if (semenFindings != null)
		{
			java.util.Iterator it12 = semenFindings.iterator();
			int i12=0;
			while (it12.hasNext())
			{
				if (i12 > 0)
					auditStr.append(",");
				ims.medical.domain.objects.OPDFertClinicSemenAna obj = (ims.medical.domain.objects.OPDFertClinicSemenAna)it12.next();
		if (obj != null)
		{
		   if (i12 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i12++;
		}
		if (i12 > 0)
			auditStr.append("] " + i12);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*elisa* :");
		if (elisa != null)
			auditStr.append(elisa.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*methodssuccessWith* :");
		if (methodssuccessWith != null)
		{
			java.util.Iterator it14 = methodssuccessWith.iterator();
			int i14=0;
			while (it14.hasNext())
			{
				if (i14 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it14.next();
			auditStr.append(obj.getText());
			i14++;
		}
		if (i14 > 0)
			auditStr.append("] " + i14);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*spermFrozen* :");
		if (spermFrozen != null)
			auditStr.append(spermFrozen.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*treatmentsoffered* :");
		if (treatmentsoffered != null)
		{
			java.util.Iterator it16 = treatmentsoffered.iterator();
			int i16=0;
			while (it16.hasNext())
			{
				if (i16 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it16.next();
			auditStr.append(obj.getText());
			i16++;
		}
		if (i16 > 0)
			auditStr.append("] " + i16);
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
		
		String keyClassName = "OPDFertClinic";
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
		if (this.getAchieveErection() != null)
		{
			sb.append("<achieveErection>");
			sb.append(this.getAchieveErection().toXMLString()); 
			sb.append("</achieveErection>");		
		}
		if (this.getErectDysfxTreatments() != null)
		{
			if (this.getErectDysfxTreatments().size() > 0 )
			{
			sb.append("<erectDysfxTreatments>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getErectDysfxTreatments())); 
			sb.append("</erectDysfxTreatments>");		
			}
		}
		if (this.getSexDrive() != null)
		{
			sb.append("<sexDrive>");
			sb.append(this.getSexDrive().toXMLString()); 
			sb.append("</sexDrive>");		
		}
		if (this.getEjaculation() != null)
		{
			sb.append("<ejaculation>");
			sb.append(this.getEjaculation().toXMLString()); 
			sb.append("</ejaculation>");		
		}
		if (this.getBladderDrainage() != null)
		{
			if (this.getBladderDrainage().size() > 0 )
			{
			sb.append("<bladderDrainage>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getBladderDrainage())); 
			sb.append("</bladderDrainage>");		
			}
		}
		if (this.getBladderDrainagetxt() != null)
		{
			sb.append("<bladderDrainagetxt>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getBladderDrainagetxt().toString()));
			sb.append("</bladderDrainagetxt>");		
		}
		if (this.getTestAtrophy() != null)
		{
			sb.append("<testAtrophy>");
			sb.append(this.getTestAtrophy().toXMLString()); 
			sb.append("</testAtrophy>");		
		}
		if (this.getEndoEvalPerf() != null)
		{
			if (this.getEndoEvalPerf().size() > 0 )
			{
			sb.append("<endoEvalPerf>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getEndoEvalPerf())); 
			sb.append("</endoEvalPerf>");		
			}
		}
		if (this.getInfxnScreening() != null)
		{
			if (this.getInfxnScreening().size() > 0 )
			{
			sb.append("<infxnScreening>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getInfxnScreening())); 
			sb.append("</infxnScreening>");		
			}
		}
		if (this.getScreenConsent() != null)
		{
			sb.append("<screenConsent>");
			sb.append(this.getScreenConsent().toXMLString()); 
			sb.append("</screenConsent>");		
		}
		if (this.getSemenCulture() != null)
		{
			sb.append("<semenCulture>");
			sb.append(this.getSemenCulture().toXMLString()); 
			sb.append("</semenCulture>");		
		}
		if (this.getSemenFindings() != null)
		{
			if (this.getSemenFindings().size() > 0 )
			{
			sb.append("<semenFindings>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getSemenFindings(), domMap));
			sb.append("</semenFindings>");		
			}
		}
		if (this.getElisa() != null)
		{
			sb.append("<elisa>");
			sb.append(this.getElisa().toXMLString()); 
			sb.append("</elisa>");		
		}
		if (this.getMethodssuccessWith() != null)
		{
			if (this.getMethodssuccessWith().size() > 0 )
			{
			sb.append("<methodssuccessWith>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getMethodssuccessWith())); 
			sb.append("</methodssuccessWith>");		
			}
		}
		if (this.getSpermFrozen() != null)
		{
			sb.append("<spermFrozen>");
			sb.append(this.getSpermFrozen().toXMLString()); 
			sb.append("</spermFrozen>");		
		}
		if (this.getTreatmentsoffered() != null)
		{
			if (this.getTreatmentsoffered().size() > 0 )
			{
			sb.append("<treatmentsoffered>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getTreatmentsoffered())); 
			sb.append("</treatmentsoffered>");		
			}
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
			OPDFertClinic domainObject = getOPDFertClinicfromXML(itemEl, factory, domMap);

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
			OPDFertClinic domainObject = getOPDFertClinicfromXML(itemEl, factory, domMap);

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
		
	public static OPDFertClinic getOPDFertClinicfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getOPDFertClinicfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static OPDFertClinic getOPDFertClinicfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!OPDFertClinic.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!OPDFertClinic.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the OPDFertClinic class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (OPDFertClinic)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(OPDFertClinic.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		OPDFertClinic ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (OPDFertClinic)factory.getImportedDomainObject(OPDFertClinic.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new OPDFertClinic();
		}
		String keyClassName = "OPDFertClinic";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (OPDFertClinic)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, OPDFertClinic obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("achieveErection");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAchieveErection(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("erectDysfxTreatments");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setErectDysfxTreatments(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getErectDysfxTreatments())); 
		}
		fldEl = el.element("sexDrive");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSexDrive(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("ejaculation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setEjaculation(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("bladderDrainage");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setBladderDrainage(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getBladderDrainage())); 
		}
		fldEl = el.element("bladderDrainagetxt");
		if(fldEl != null)
		{	
    		obj.setBladderDrainagetxt(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("testAtrophy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTestAtrophy(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("endoEvalPerf");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setEndoEvalPerf(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getEndoEvalPerf())); 
		}
		fldEl = el.element("infxnScreening");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setInfxnScreening(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getInfxnScreening())); 
		}
		fldEl = el.element("screenConsent");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setScreenConsent(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("semenCulture");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSemenCulture(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("semenFindings");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setSemenFindings(ims.medical.domain.objects.OPDFertClinicSemenAna.fromSetXMLString(fldEl, factory, obj.getSemenFindings(), domMap));
		}
		fldEl = el.element("elisa");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setElisa(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("methodssuccessWith");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setMethodssuccessWith(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getMethodssuccessWith())); 
		}
		fldEl = el.element("spermFrozen");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSpermFrozen(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("treatmentsoffered");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setTreatmentsoffered(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getTreatmentsoffered())); 
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
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "erectDysfxTreatments"
		, "bladderDrainage"
		, "endoEvalPerf"
		, "infxnScreening"
		, "semenFindings"
		, "methodssuccessWith"
		, "treatmentsoffered"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String AchieveErection = "achieveErection";
		public static final String ErectDysfxTreatments = "erectDysfxTreatments";
		public static final String SexDrive = "sexDrive";
		public static final String Ejaculation = "ejaculation";
		public static final String BladderDrainage = "bladderDrainage";
		public static final String BladderDrainagetxt = "bladderDrainagetxt";
		public static final String TestAtrophy = "testAtrophy";
		public static final String EndoEvalPerf = "endoEvalPerf";
		public static final String InfxnScreening = "infxnScreening";
		public static final String ScreenConsent = "screenConsent";
		public static final String SemenCulture = "semenCulture";
		public static final String SemenFindings = "semenFindings";
		public static final String Elisa = "elisa";
		public static final String MethodssuccessWith = "methodssuccessWith";
		public static final String SpermFrozen = "spermFrozen";
		public static final String Treatmentsoffered = "treatmentsoffered";
		public static final String CareContext = "careContext";
		public static final String AuthoringInformation = "authoringInformation";
	}
}

