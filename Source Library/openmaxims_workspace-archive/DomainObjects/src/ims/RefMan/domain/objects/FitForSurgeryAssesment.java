/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 16/04/2014, 12:34
 *
 */
package ims.RefMan.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class FitForSurgeryAssesment extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1096100024;
	private static final long serialVersionUID = 1096100024L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** AuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** ASA Score */
	private Integer aSAScore;
	/** Comments */
	private String comments;
	/** FitForSurgery */
	private Boolean fitForSurgery;
	/** Reason not fit for Surgery */
	private ims.domain.lookups.LookupInstance notFitReason;
	/** Fit For Surgery Comments
	  * Collection of ims.RefMan.domain.objects.FitForSurgeryComment.
	  */
	private java.util.Set fitComments;
	/** Anaesthetic Type  */
	private ims.domain.lookups.LookupInstance anaestheticType;
	/** Linked Outpatient Appt */
	private ims.scheduling.domain.objects.Booking_Appointment oPDAppt;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public FitForSurgeryAssesment (Integer id, int ver)
    {
    	super(id, ver);
    }
    public FitForSurgeryAssesment ()
    {
    	super();
    }
    public FitForSurgeryAssesment (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.RefMan.domain.objects.FitForSurgeryAssesment.class;
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

	public Integer getASAScore() {
		return aSAScore;
	}
	public void setASAScore(Integer aSAScore) {
		this.aSAScore = aSAScore;
	}

	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}

	public Boolean isFitForSurgery() {
		return fitForSurgery;
	}
	public void setFitForSurgery(Boolean fitForSurgery) {
		this.fitForSurgery = fitForSurgery;
	}

	public ims.domain.lookups.LookupInstance getNotFitReason() {
		return notFitReason;
	}
	public void setNotFitReason(ims.domain.lookups.LookupInstance notFitReason) {
		this.notFitReason = notFitReason;
	}

	public java.util.Set getFitComments() {
		if ( null == fitComments ) {
			fitComments = new java.util.HashSet();
		}
		return fitComments;
	}
	public void setFitComments(java.util.Set paramValue) {
		this.fitComments = paramValue;
	}

	public ims.domain.lookups.LookupInstance getAnaestheticType() {
		return anaestheticType;
	}
	public void setAnaestheticType(ims.domain.lookups.LookupInstance anaestheticType) {
		this.anaestheticType = anaestheticType;
	}

	public ims.scheduling.domain.objects.Booking_Appointment getOPDAppt() {
		return oPDAppt;
	}
	public void setOPDAppt(ims.scheduling.domain.objects.Booking_Appointment oPDAppt) {
		this.oPDAppt = oPDAppt;
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
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*aSAScore* :");
		auditStr.append(aSAScore);
	    auditStr.append("; ");
		auditStr.append("\r\n*comments* :");
		auditStr.append(comments);
	    auditStr.append("; ");
		auditStr.append("\r\n*fitForSurgery* :");
		auditStr.append(fitForSurgery);
	    auditStr.append("; ");
		auditStr.append("\r\n*notFitReason* :");
		if (notFitReason != null)
			auditStr.append(notFitReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*fitComments* :");
		if (fitComments != null)
		{
			java.util.Iterator it7 = fitComments.iterator();
			int i7=0;
			while (it7.hasNext())
			{
				if (i7 > 0)
					auditStr.append(",");
				ims.RefMan.domain.objects.FitForSurgeryComment obj = (ims.RefMan.domain.objects.FitForSurgeryComment)it7.next();
		if (obj != null)
		{
		   if (i7 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i7++;
		}
		if (i7 > 0)
			auditStr.append("] " + i7);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*anaestheticType* :");
		if (anaestheticType != null)
			auditStr.append(anaestheticType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*oPDAppt* :");
		if (oPDAppt != null)
		{
			auditStr.append(toShortClassName(oPDAppt));
				
		    auditStr.append(oPDAppt.getId());
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
		
		String keyClassName = "FitForSurgeryAssesment";
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
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
		}
		if (this.getASAScore() != null)
		{
			sb.append("<aSAScore>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getASAScore().toString()));
			sb.append("</aSAScore>");		
		}
		if (this.getComments() != null)
		{
			sb.append("<comments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComments().toString()));
			sb.append("</comments>");		
		}
		if (this.isFitForSurgery() != null)
		{
			sb.append("<fitForSurgery>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isFitForSurgery().toString()));
			sb.append("</fitForSurgery>");		
		}
		if (this.getNotFitReason() != null)
		{
			sb.append("<notFitReason>");
			sb.append(this.getNotFitReason().toXMLString()); 
			sb.append("</notFitReason>");		
		}
		if (this.getFitComments() != null)
		{
			if (this.getFitComments().size() > 0 )
			{
			sb.append("<fitComments>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getFitComments(), domMap));
			sb.append("</fitComments>");		
			}
		}
		if (this.getAnaestheticType() != null)
		{
			sb.append("<anaestheticType>");
			sb.append(this.getAnaestheticType().toXMLString()); 
			sb.append("</anaestheticType>");		
		}
		if (this.getOPDAppt() != null)
		{
			sb.append("<oPDAppt>");
			sb.append(this.getOPDAppt().toXMLString(domMap)); 	
			sb.append("</oPDAppt>");		
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
			FitForSurgeryAssesment domainObject = getFitForSurgeryAssesmentfromXML(itemEl, factory, domMap);

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
			FitForSurgeryAssesment domainObject = getFitForSurgeryAssesmentfromXML(itemEl, factory, domMap);

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
		
	public static FitForSurgeryAssesment getFitForSurgeryAssesmentfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getFitForSurgeryAssesmentfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static FitForSurgeryAssesment getFitForSurgeryAssesmentfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!FitForSurgeryAssesment.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!FitForSurgeryAssesment.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the FitForSurgeryAssesment class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (FitForSurgeryAssesment)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(FitForSurgeryAssesment.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		FitForSurgeryAssesment ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (FitForSurgeryAssesment)factory.getImportedDomainObject(FitForSurgeryAssesment.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new FitForSurgeryAssesment();
		}
		String keyClassName = "FitForSurgeryAssesment";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (FitForSurgeryAssesment)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, FitForSurgeryAssesment obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
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
		fldEl = el.element("aSAScore");
		if(fldEl != null)
		{	
    		obj.setASAScore(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("comments");
		if(fldEl != null)
		{	
    		obj.setComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("fitForSurgery");
		if(fldEl != null)
		{	
    		obj.setFitForSurgery(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("notFitReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setNotFitReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("fitComments");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setFitComments(ims.RefMan.domain.objects.FitForSurgeryComment.fromSetXMLString(fldEl, factory, obj.getFitComments(), domMap));
		}
		fldEl = el.element("anaestheticType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAnaestheticType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("oPDAppt");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setOPDAppt(ims.scheduling.domain.objects.Booking_Appointment.getBooking_AppointmentfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "fitComments"
		};
	}


	public void bringStageIntoScope(ims.domain.DomainFactory factory, ims.rules.engine.RulesRuntimeEngine engine, String stage)
	{	
		// Look up negative instances
            final int CORE_YESNOUNKNOWN_YES = -12;

            // Private keys for engine hash map
            final String IsFitKey = "SuitableForSugery";

            java.util.ArrayList<java.lang.String> keys = new java.util.ArrayList<java.lang.String>();
            java.util.ArrayList<java.lang.Object> values = new java.util.ArrayList<java.lang.Object>();

            keys.add("ID");
            values.add(this.careContext.getId());
            keys.add("DATE");
            values.add(this.authoringInformation.getAuthoringDateTime());

            // Check if the FitForSurgery assessment is in stage
            if (engine.getValue(IsFitKey) == null)
            {
                  // Get latest fit for surgery assessment into engine hash map
                  java.lang.String hqlQuery = "from SuitableForSurgeryAssessment as sfs where (sfs.careContext.id = :ID and sfs.authoringInformation.authoringDateTime <= :DATE and sfs.isRIE is null) order by sfs.authoringInformation.authoringDateTime desc top 1";

                  java.util.List<ims.RefMan.domain.objects.SuitableForSurgeryAssessment> list = factory.find(hqlQuery, keys, values);

                  if (list != null && list.size() != 0)
                  {
                        engine.setValue(IsFitKey, list.get(0));
                  }
            }

            ims.RefMan.domain.objects.SuitableForSurgeryAssessment suitableForSurgery = (ims.RefMan.domain.objects.SuitableForSurgeryAssessment) engine.getValue(IsFitKey);

            // Check if fit for surgery conditions are met
            if (suitableForSurgery == null || !(suitableForSurgery.getSuitableForSurgery().getId() == CORE_YESNOUNKNOWN_YES))
                  return;

            keys.remove("DATE");

            // Get the patient ICP
            java.lang.String hqlIcpQuery = "from PatientICP as icp where (icp.careContext.id = :ID and icp.isRIE is null)";
            java.util.List<ims.icps.instantiation.domain.objects.PatientICP> icps = factory.find(hqlIcpQuery, keys, values);

            // Check if there is an ICP present
            if (icps == null || icps.size() == 0)
                  return;

            // Get an PatientICP
            ims.icps.instantiation.domain.objects.PatientICP patientICP = icps.get(0);

            ims.icps.instantiation.domain.objects.PatientICPAction action = null;

            java.util.Iterator<ims.icps.instantiation.domain.objects.PatientICPStage> stageIterator = patientICP.getStages().iterator();

            while (stageIterator.hasNext())
            {
                  ims.icps.instantiation.domain.objects.PatientICPStage patientStage = stageIterator.next();

                  java.util.Iterator<ims.icps.instantiation.domain.objects.PatientICPPhase> phaseIterator = patientStage.getStagePhases().iterator();

                  while (phaseIterator.hasNext())
                  {
                        ims.icps.instantiation.domain.objects.PatientICPPhase patientPhase = phaseIterator.next();

                        java.util.Iterator<ims.icps.instantiation.domain.objects.PatientICPAction> actionsIterator = patientPhase.getPhaseActions().iterator();

                        while (actionsIterator.hasNext())
                        {
                              action = actionsIterator.next();

                              if (action != null)
                                    break;
                        }

                        if (action != null)
                              break;
                  }

                  if (action != null)
                        break;
            }

            // bring stage into scope
            if (action != null)
            {
                  action.bringStageIntoScope(factory, engine, stage);
            }
	}

	public void bringPhaseIntoScope(ims.domain.DomainFactory factory, ims.rules.engine.RulesRuntimeEngine engine, String phase)
	{	
		// Look up negative instances
            final int CORE_YESNOUNKNOWN_YES = -12;

            // Private keys for engine hash map
            final String IsFitKey = "SuitableForSugery";

            java.util.ArrayList<java.lang.String> keys = new java.util.ArrayList<java.lang.String>();
            java.util.ArrayList<java.lang.Object> values = new java.util.ArrayList<java.lang.Object>();

            keys.add("ID");
            values.add(this.careContext.getId());
            keys.add("DATE");
            values.add(this.authoringInformation.getAuthoringDateTime());

            // Check if the FitForSurgery assessment is in stage
            if (engine.getValue(IsFitKey) == null)
            {
                  // Get latest fit for surgery assessment into engine hash map
                  java.lang.String hqlQuery = "from SuitableForSurgeryAssessment as sfs where (sfs.careContext.id = :ID and sfs.authoringInformation.authoringDateTime <= :DATE and sfs.isRIE is null) order by sfs.authoringInformation.authoringDateTime desc top 1";

                  java.util.List<ims.RefMan.domain.objects.SuitableForSurgeryAssessment> list = factory.find(hqlQuery, keys, values);

                  if (list != null && list.size() != 0)
                  {
                        engine.setValue(IsFitKey, list.get(0));
                  }
            }

            ims.RefMan.domain.objects.SuitableForSurgeryAssessment suitableForSurgery = (ims.RefMan.domain.objects.SuitableForSurgeryAssessment) engine.getValue(IsFitKey);

            // Check if fit for surgery conditions are met
            if (suitableForSurgery == null || !(suitableForSurgery.getSuitableForSurgery().getId() == CORE_YESNOUNKNOWN_YES))
                  return;

            keys.remove("DATE");

            // Get the patient ICP
            java.lang.String hqlIcpQuery = "from PatientICP as icp where (icp.careContext.id = :ID and icp.isRIE is null)";
            java.util.List<ims.icps.instantiation.domain.objects.PatientICP> icps = factory.find(hqlIcpQuery, keys, values);

            // Check if there is an ICP present
            if (icps == null || icps.size() == 0)
                  return;

            // Get an PatientICP
            ims.icps.instantiation.domain.objects.PatientICP patientICP = icps.get(0);

            ims.icps.instantiation.domain.objects.PatientICPAction action = null;

            java.util.Iterator<ims.icps.instantiation.domain.objects.PatientICPStage> stageIterator = patientICP.getStages().iterator();

            while (stageIterator.hasNext())
            {
                  ims.icps.instantiation.domain.objects.PatientICPStage patientStage = stageIterator.next();

                  java.util.Iterator<ims.icps.instantiation.domain.objects.PatientICPPhase> phaseIterator = patientStage.getStagePhases().iterator();

                  while (phaseIterator.hasNext())
                  {
                        ims.icps.instantiation.domain.objects.PatientICPPhase patientPhase = phaseIterator.next();

                        java.util.Iterator<ims.icps.instantiation.domain.objects.PatientICPAction> actionsIterator = patientPhase.getPhaseActions().iterator();

                        while (actionsIterator.hasNext())
                        {
                              action = actionsIterator.next();

                              if (action != null)
                                    break;
                        }

                        if (action != null)
                              break;
                  }

                  if (action != null)
                        break;
            }

            // Bring phase into scope
            if (action != null)
            {
                  action.bringPhaseIntoScope(factory, engine, phase);
            }
	}

	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String CareContext = "careContext";
		public static final String AuthoringInformation = "authoringInformation";
		public static final String ASAScore = "aSAScore";
		public static final String Comments = "comments";
		public static final String FitForSurgery = "fitForSurgery";
		public static final String NotFitReason = "notFitReason";
		public static final String FitComments = "fitComments";
		public static final String AnaestheticType = "anaestheticType";
		public static final String OPDAppt = "oPDAppt";
	}
}

