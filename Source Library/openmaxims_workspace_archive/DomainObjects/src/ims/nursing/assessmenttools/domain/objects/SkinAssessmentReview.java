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
package ims.nursing.assessmenttools.domain.objects;

/**
 * 
 * @author Sinead McDermott
 * Generated.
 */


public class SkinAssessmentReview extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1016100004;
	private static final long serialVersionUID = 1016100004L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Date Time Review */
	private java.util.Date dateTimeReview;
	/** HCP Review */
	private ims.core.resource.people.domain.objects.Hcp hCPReview;
	private String siteDetails;
	/** How Long Is It Present */
	private String howLongIsItPresent;
	private ims.domain.lookups.LookupInstance pressureSoreGrade;
	private java.lang.Float length;
	private java.lang.Float width;
	private java.lang.Float depth;
	private ims.domain.lookups.LookupInstance woundBed;
	private ims.domain.lookups.LookupInstance surroundingSkin;
	private ims.domain.lookups.LookupInstance exudateAmount;
	private ims.domain.lookups.LookupInstance exudateType;
	private ims.domain.lookups.LookupInstance odour;
	private ims.domain.lookups.LookupInstance pain;
	private Boolean infectionSuspected;
	private Boolean swabTaken;
	private Boolean woundTraced;
	private ims.domain.lookups.LookupInstance cleansedWith;
	private ims.domain.lookups.LookupInstance primaryDressing;
	private ims.domain.lookups.LookupInstance secondaryDressing;
	private ims.domain.lookups.LookupInstance frequencyOfChange;
	private String comment;
    public SkinAssessmentReview (Integer id, int ver)
    {
    	super(id, ver);
    }
    public SkinAssessmentReview ()
    {
    	super();
    }
    public SkinAssessmentReview (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.nursing.assessmenttools.domain.objects.SkinAssessmentReview.class;
	}


	public java.util.Date getDateTimeReview() {
		return dateTimeReview;
	}
	public void setDateTimeReview(java.util.Date dateTimeReview) {
		this.dateTimeReview = dateTimeReview;
	}

	public ims.core.resource.people.domain.objects.Hcp getHCPReview() {
		return hCPReview;
	}
	public void setHCPReview(ims.core.resource.people.domain.objects.Hcp hCPReview) {
		this.hCPReview = hCPReview;
	}

	public String getSiteDetails() {
		return siteDetails;
	}
	public void setSiteDetails(String siteDetails) {
		this.siteDetails = siteDetails;
	}

	public String getHowLongIsItPresent() {
		return howLongIsItPresent;
	}
	public void setHowLongIsItPresent(String howLongIsItPresent) {
		this.howLongIsItPresent = howLongIsItPresent;
	}

	public ims.domain.lookups.LookupInstance getPressureSoreGrade() {
		return pressureSoreGrade;
	}
	public void setPressureSoreGrade(ims.domain.lookups.LookupInstance pressureSoreGrade) {
		this.pressureSoreGrade = pressureSoreGrade;
	}

	public java.lang.Float getLength() {
		return length;
	}
	public void setLength(java.lang.Float length) {
		this.length = length;
	}

	public java.lang.Float getWidth() {
		return width;
	}
	public void setWidth(java.lang.Float width) {
		this.width = width;
	}

	public java.lang.Float getDepth() {
		return depth;
	}
	public void setDepth(java.lang.Float depth) {
		this.depth = depth;
	}

	public ims.domain.lookups.LookupInstance getWoundBed() {
		return woundBed;
	}
	public void setWoundBed(ims.domain.lookups.LookupInstance woundBed) {
		this.woundBed = woundBed;
	}

	public ims.domain.lookups.LookupInstance getSurroundingSkin() {
		return surroundingSkin;
	}
	public void setSurroundingSkin(ims.domain.lookups.LookupInstance surroundingSkin) {
		this.surroundingSkin = surroundingSkin;
	}

	public ims.domain.lookups.LookupInstance getExudateAmount() {
		return exudateAmount;
	}
	public void setExudateAmount(ims.domain.lookups.LookupInstance exudateAmount) {
		this.exudateAmount = exudateAmount;
	}

	public ims.domain.lookups.LookupInstance getExudateType() {
		return exudateType;
	}
	public void setExudateType(ims.domain.lookups.LookupInstance exudateType) {
		this.exudateType = exudateType;
	}

	public ims.domain.lookups.LookupInstance getOdour() {
		return odour;
	}
	public void setOdour(ims.domain.lookups.LookupInstance odour) {
		this.odour = odour;
	}

	public ims.domain.lookups.LookupInstance getPain() {
		return pain;
	}
	public void setPain(ims.domain.lookups.LookupInstance pain) {
		this.pain = pain;
	}

	public Boolean isInfectionSuspected() {
		return infectionSuspected;
	}
	public void setInfectionSuspected(Boolean infectionSuspected) {
		this.infectionSuspected = infectionSuspected;
	}

	public Boolean isSwabTaken() {
		return swabTaken;
	}
	public void setSwabTaken(Boolean swabTaken) {
		this.swabTaken = swabTaken;
	}

	public Boolean isWoundTraced() {
		return woundTraced;
	}
	public void setWoundTraced(Boolean woundTraced) {
		this.woundTraced = woundTraced;
	}

	public ims.domain.lookups.LookupInstance getCleansedWith() {
		return cleansedWith;
	}
	public void setCleansedWith(ims.domain.lookups.LookupInstance cleansedWith) {
		this.cleansedWith = cleansedWith;
	}

	public ims.domain.lookups.LookupInstance getPrimaryDressing() {
		return primaryDressing;
	}
	public void setPrimaryDressing(ims.domain.lookups.LookupInstance primaryDressing) {
		this.primaryDressing = primaryDressing;
	}

	public ims.domain.lookups.LookupInstance getSecondaryDressing() {
		return secondaryDressing;
	}
	public void setSecondaryDressing(ims.domain.lookups.LookupInstance secondaryDressing) {
		this.secondaryDressing = secondaryDressing;
	}

	public ims.domain.lookups.LookupInstance getFrequencyOfChange() {
		return frequencyOfChange;
	}
	public void setFrequencyOfChange(ims.domain.lookups.LookupInstance frequencyOfChange) {
		this.frequencyOfChange = frequencyOfChange;
	}

	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
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
		
		auditStr.append("\r\n*dateTimeReview* :");
		auditStr.append(dateTimeReview);
	    auditStr.append("; ");
		auditStr.append("\r\n*hCPReview* :");
		if (hCPReview != null)
		{
			auditStr.append(toShortClassName(hCPReview));
				
		    auditStr.append(hCPReview.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*siteDetails* :");
		auditStr.append(siteDetails);
	    auditStr.append("; ");
		auditStr.append("\r\n*howLongIsItPresent* :");
		auditStr.append(howLongIsItPresent);
	    auditStr.append("; ");
		auditStr.append("\r\n*pressureSoreGrade* :");
		if (pressureSoreGrade != null)
			auditStr.append(pressureSoreGrade.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*length* :");
		auditStr.append(length);
	    auditStr.append("; ");
		auditStr.append("\r\n*width* :");
		auditStr.append(width);
	    auditStr.append("; ");
		auditStr.append("\r\n*depth* :");
		auditStr.append(depth);
	    auditStr.append("; ");
		auditStr.append("\r\n*woundBed* :");
		if (woundBed != null)
			auditStr.append(woundBed.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*surroundingSkin* :");
		if (surroundingSkin != null)
			auditStr.append(surroundingSkin.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*exudateAmount* :");
		if (exudateAmount != null)
			auditStr.append(exudateAmount.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*exudateType* :");
		if (exudateType != null)
			auditStr.append(exudateType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*odour* :");
		if (odour != null)
			auditStr.append(odour.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*pain* :");
		if (pain != null)
			auditStr.append(pain.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*infectionSuspected* :");
		auditStr.append(infectionSuspected);
	    auditStr.append("; ");
		auditStr.append("\r\n*swabTaken* :");
		auditStr.append(swabTaken);
	    auditStr.append("; ");
		auditStr.append("\r\n*woundTraced* :");
		auditStr.append(woundTraced);
	    auditStr.append("; ");
		auditStr.append("\r\n*cleansedWith* :");
		if (cleansedWith != null)
			auditStr.append(cleansedWith.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*primaryDressing* :");
		if (primaryDressing != null)
			auditStr.append(primaryDressing.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*secondaryDressing* :");
		if (secondaryDressing != null)
			auditStr.append(secondaryDressing.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*frequencyOfChange* :");
		if (frequencyOfChange != null)
			auditStr.append(frequencyOfChange.getText());
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
		
		String keyClassName = "SkinAssessmentReview";
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
		if (this.getDateTimeReview() != null)
		{
			sb.append("<dateTimeReview>");
			sb.append(new ims.framework.utils.DateTime(this.getDateTimeReview()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateTimeReview>");		
		}
		if (this.getHCPReview() != null)
		{
			sb.append("<hCPReview>");
			sb.append(this.getHCPReview().toXMLString(domMap)); 	
			sb.append("</hCPReview>");		
		}
		if (this.getSiteDetails() != null)
		{
			sb.append("<siteDetails>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSiteDetails().toString()));
			sb.append("</siteDetails>");		
		}
		if (this.getHowLongIsItPresent() != null)
		{
			sb.append("<howLongIsItPresent>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getHowLongIsItPresent().toString()));
			sb.append("</howLongIsItPresent>");		
		}
		if (this.getPressureSoreGrade() != null)
		{
			sb.append("<pressureSoreGrade>");
			sb.append(this.getPressureSoreGrade().toXMLString()); 
			sb.append("</pressureSoreGrade>");		
		}
		if (this.getLength() != null)
		{
			sb.append("<length>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLength().toString()));
			sb.append("</length>");		
		}
		if (this.getWidth() != null)
		{
			sb.append("<width>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getWidth().toString()));
			sb.append("</width>");		
		}
		if (this.getDepth() != null)
		{
			sb.append("<depth>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDepth().toString()));
			sb.append("</depth>");		
		}
		if (this.getWoundBed() != null)
		{
			sb.append("<woundBed>");
			sb.append(this.getWoundBed().toXMLString()); 
			sb.append("</woundBed>");		
		}
		if (this.getSurroundingSkin() != null)
		{
			sb.append("<surroundingSkin>");
			sb.append(this.getSurroundingSkin().toXMLString()); 
			sb.append("</surroundingSkin>");		
		}
		if (this.getExudateAmount() != null)
		{
			sb.append("<exudateAmount>");
			sb.append(this.getExudateAmount().toXMLString()); 
			sb.append("</exudateAmount>");		
		}
		if (this.getExudateType() != null)
		{
			sb.append("<exudateType>");
			sb.append(this.getExudateType().toXMLString()); 
			sb.append("</exudateType>");		
		}
		if (this.getOdour() != null)
		{
			sb.append("<odour>");
			sb.append(this.getOdour().toXMLString()); 
			sb.append("</odour>");		
		}
		if (this.getPain() != null)
		{
			sb.append("<pain>");
			sb.append(this.getPain().toXMLString()); 
			sb.append("</pain>");		
		}
		if (this.isInfectionSuspected() != null)
		{
			sb.append("<infectionSuspected>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isInfectionSuspected().toString()));
			sb.append("</infectionSuspected>");		
		}
		if (this.isSwabTaken() != null)
		{
			sb.append("<swabTaken>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isSwabTaken().toString()));
			sb.append("</swabTaken>");		
		}
		if (this.isWoundTraced() != null)
		{
			sb.append("<woundTraced>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWoundTraced().toString()));
			sb.append("</woundTraced>");		
		}
		if (this.getCleansedWith() != null)
		{
			sb.append("<cleansedWith>");
			sb.append(this.getCleansedWith().toXMLString()); 
			sb.append("</cleansedWith>");		
		}
		if (this.getPrimaryDressing() != null)
		{
			sb.append("<primaryDressing>");
			sb.append(this.getPrimaryDressing().toXMLString()); 
			sb.append("</primaryDressing>");		
		}
		if (this.getSecondaryDressing() != null)
		{
			sb.append("<secondaryDressing>");
			sb.append(this.getSecondaryDressing().toXMLString()); 
			sb.append("</secondaryDressing>");		
		}
		if (this.getFrequencyOfChange() != null)
		{
			sb.append("<frequencyOfChange>");
			sb.append(this.getFrequencyOfChange().toXMLString()); 
			sb.append("</frequencyOfChange>");		
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
			SkinAssessmentReview domainObject = getSkinAssessmentReviewfromXML(itemEl, factory, domMap);

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
			SkinAssessmentReview domainObject = getSkinAssessmentReviewfromXML(itemEl, factory, domMap);

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
		
	public static SkinAssessmentReview getSkinAssessmentReviewfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getSkinAssessmentReviewfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static SkinAssessmentReview getSkinAssessmentReviewfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!SkinAssessmentReview.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!SkinAssessmentReview.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the SkinAssessmentReview class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (SkinAssessmentReview)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(SkinAssessmentReview.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		SkinAssessmentReview ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (SkinAssessmentReview)factory.getImportedDomainObject(SkinAssessmentReview.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new SkinAssessmentReview();
		}
		String keyClassName = "SkinAssessmentReview";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (SkinAssessmentReview)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, SkinAssessmentReview obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("dateTimeReview");
		if(fldEl != null)
		{	
    		obj.setDateTimeReview(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("hCPReview");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setHCPReview(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("siteDetails");
		if(fldEl != null)
		{	
    		obj.setSiteDetails(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("howLongIsItPresent");
		if(fldEl != null)
		{	
    		obj.setHowLongIsItPresent(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pressureSoreGrade");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPressureSoreGrade(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("length");
		if(fldEl != null)
		{	
    		obj.setLength(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("width");
		if(fldEl != null)
		{	
    		obj.setWidth(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("depth");
		if(fldEl != null)
		{	
    		obj.setDepth(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("woundBed");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setWoundBed(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("surroundingSkin");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSurroundingSkin(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("exudateAmount");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setExudateAmount(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("exudateType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setExudateType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("odour");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOdour(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("pain");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPain(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("infectionSuspected");
		if(fldEl != null)
		{	
    		obj.setInfectionSuspected(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("swabTaken");
		if(fldEl != null)
		{	
    		obj.setSwabTaken(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("woundTraced");
		if(fldEl != null)
		{	
    		obj.setWoundTraced(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("cleansedWith");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCleansedWith(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("primaryDressing");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPrimaryDressing(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("secondaryDressing");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSecondaryDressing(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("frequencyOfChange");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setFrequencyOfChange(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		public static final String DateTimeReview = "dateTimeReview";
		public static final String HCPReview = "hCPReview";
		public static final String SiteDetails = "siteDetails";
		public static final String HowLongIsItPresent = "howLongIsItPresent";
		public static final String PressureSoreGrade = "pressureSoreGrade";
		public static final String Length = "length";
		public static final String Width = "width";
		public static final String Depth = "depth";
		public static final String WoundBed = "woundBed";
		public static final String SurroundingSkin = "surroundingSkin";
		public static final String ExudateAmount = "exudateAmount";
		public static final String ExudateType = "exudateType";
		public static final String Odour = "odour";
		public static final String Pain = "pain";
		public static final String InfectionSuspected = "infectionSuspected";
		public static final String SwabTaken = "swabTaken";
		public static final String WoundTraced = "woundTraced";
		public static final String CleansedWith = "cleansedWith";
		public static final String PrimaryDressing = "primaryDressing";
		public static final String SecondaryDressing = "secondaryDressing";
		public static final String FrequencyOfChange = "frequencyOfChange";
		public static final String Comment = "comment";
	}
}

