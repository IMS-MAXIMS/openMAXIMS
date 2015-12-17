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
 * @author Neil McAnaspie
 * Generated.
 */


public class InfectionControlComponent extends ims.nursing.assessment.domain.objects.AssessmentComponent implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1012100029;
	private static final long serialVersionUID = 1012100029L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Has the patient had a previous episode of MRSA */
	private ims.domain.lookups.LookupInstance mRSA;
	/** MRSA Comment */
	private String mRSAComment;
	/** Has the patient had a previous episode of Clostridium */
	private ims.domain.lookups.LookupInstance clostridium;
	/** Clostridium Comment */
	private String clostridiumComment;
	/** Has the patient had a previous episode of VRE */
	private ims.domain.lookups.LookupInstance vRE;
	/** VRE Comment */
	private String vREComment;
	/** Has the patient had a previous episode of ESBC */
	private ims.domain.lookups.LookupInstance eSBC;
	/** ESBC Comment */
	private String eSBCComment;
	/** Has the patient had a previous episode of TB */
	private ims.domain.lookups.LookupInstance tB;
	/** TB Comment */
	private String tBComment;
	/** Has the patient had a previous episode of Norovirus */
	private ims.domain.lookups.LookupInstance norovirus;
	/** Norovirus Comment */
	private String norovirusComment;
	/** Does this person have an infection control requirement */
	private ims.domain.lookups.LookupInstance controlRequirement;
	/** Notes */
	private String notes;
	/** InfectionControlAssessment */
	private ims.coe.assessmenttools.domain.objects.InfectionControlRepeatableAssessment infectionControlAssessment;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public InfectionControlComponent (Integer id, int ver)
    {
    	super(id, ver);
    }
    public InfectionControlComponent ()
    {
    	super();
    }
    public InfectionControlComponent (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.coe.assessment.domain.objects.InfectionControlComponent.class;
	}


	public ims.domain.lookups.LookupInstance getMRSA() {
		return mRSA;
	}
	public void setMRSA(ims.domain.lookups.LookupInstance mRSA) {
		this.mRSA = mRSA;
	}

	public String getMRSAComment() {
		return mRSAComment;
	}
	public void setMRSAComment(String mRSAComment) {
		if ( null != mRSAComment && mRSAComment.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for mRSAComment. Tried to set value: "+
				mRSAComment);
		}
		this.mRSAComment = mRSAComment;
	}

	public ims.domain.lookups.LookupInstance getClostridium() {
		return clostridium;
	}
	public void setClostridium(ims.domain.lookups.LookupInstance clostridium) {
		this.clostridium = clostridium;
	}

	public String getClostridiumComment() {
		return clostridiumComment;
	}
	public void setClostridiumComment(String clostridiumComment) {
		if ( null != clostridiumComment && clostridiumComment.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for clostridiumComment. Tried to set value: "+
				clostridiumComment);
		}
		this.clostridiumComment = clostridiumComment;
	}

	public ims.domain.lookups.LookupInstance getVRE() {
		return vRE;
	}
	public void setVRE(ims.domain.lookups.LookupInstance vRE) {
		this.vRE = vRE;
	}

	public String getVREComment() {
		return vREComment;
	}
	public void setVREComment(String vREComment) {
		if ( null != vREComment && vREComment.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for vREComment. Tried to set value: "+
				vREComment);
		}
		this.vREComment = vREComment;
	}

	public ims.domain.lookups.LookupInstance getESBC() {
		return eSBC;
	}
	public void setESBC(ims.domain.lookups.LookupInstance eSBC) {
		this.eSBC = eSBC;
	}

	public String getESBCComment() {
		return eSBCComment;
	}
	public void setESBCComment(String eSBCComment) {
		if ( null != eSBCComment && eSBCComment.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for eSBCComment. Tried to set value: "+
				eSBCComment);
		}
		this.eSBCComment = eSBCComment;
	}

	public ims.domain.lookups.LookupInstance getTB() {
		return tB;
	}
	public void setTB(ims.domain.lookups.LookupInstance tB) {
		this.tB = tB;
	}

	public String getTBComment() {
		return tBComment;
	}
	public void setTBComment(String tBComment) {
		if ( null != tBComment && tBComment.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for tBComment. Tried to set value: "+
				tBComment);
		}
		this.tBComment = tBComment;
	}

	public ims.domain.lookups.LookupInstance getNorovirus() {
		return norovirus;
	}
	public void setNorovirus(ims.domain.lookups.LookupInstance norovirus) {
		this.norovirus = norovirus;
	}

	public String getNorovirusComment() {
		return norovirusComment;
	}
	public void setNorovirusComment(String norovirusComment) {
		if ( null != norovirusComment && norovirusComment.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for norovirusComment. Tried to set value: "+
				norovirusComment);
		}
		this.norovirusComment = norovirusComment;
	}

	public ims.domain.lookups.LookupInstance getControlRequirement() {
		return controlRequirement;
	}
	public void setControlRequirement(ims.domain.lookups.LookupInstance controlRequirement) {
		this.controlRequirement = controlRequirement;
	}

	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		if ( null != notes && notes.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for notes. Tried to set value: "+
				notes);
		}
		this.notes = notes;
	}

	public ims.coe.assessmenttools.domain.objects.InfectionControlRepeatableAssessment getInfectionControlAssessment() {
		return infectionControlAssessment;
	}
	public void setInfectionControlAssessment(ims.coe.assessmenttools.domain.objects.InfectionControlRepeatableAssessment infectionControlAssessment) {
		this.infectionControlAssessment = infectionControlAssessment;
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
		
		auditStr.append(super.toAuditString());
		auditStr.append("\r\n*mRSA* :");
		if (mRSA != null)
			auditStr.append(mRSA.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*mRSAComment* :");
		auditStr.append(mRSAComment);
	    auditStr.append("; ");
		auditStr.append("\r\n*clostridium* :");
		if (clostridium != null)
			auditStr.append(clostridium.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*clostridiumComment* :");
		auditStr.append(clostridiumComment);
	    auditStr.append("; ");
		auditStr.append("\r\n*vRE* :");
		if (vRE != null)
			auditStr.append(vRE.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*vREComment* :");
		auditStr.append(vREComment);
	    auditStr.append("; ");
		auditStr.append("\r\n*eSBC* :");
		if (eSBC != null)
			auditStr.append(eSBC.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*eSBCComment* :");
		auditStr.append(eSBCComment);
	    auditStr.append("; ");
		auditStr.append("\r\n*tB* :");
		if (tB != null)
			auditStr.append(tB.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*tBComment* :");
		auditStr.append(tBComment);
	    auditStr.append("; ");
		auditStr.append("\r\n*norovirus* :");
		if (norovirus != null)
			auditStr.append(norovirus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*norovirusComment* :");
		auditStr.append(norovirusComment);
	    auditStr.append("; ");
		auditStr.append("\r\n*controlRequirement* :");
		if (controlRequirement != null)
			auditStr.append(controlRequirement.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*notes* :");
		auditStr.append(notes);
	    auditStr.append("; ");
		auditStr.append("\r\n*infectionControlAssessment* :");
		if (infectionControlAssessment != null)
		{
			auditStr.append(toShortClassName(infectionControlAssessment));
				
		    auditStr.append(infectionControlAssessment.getId());
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
		
		String keyClassName = "InfectionControlComponent";
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
		sb.append(super.fieldsToXMLString(domMap));
		if (this.getMRSA() != null)
		{
			sb.append("<mRSA>");
			sb.append(this.getMRSA().toXMLString()); 
			sb.append("</mRSA>");		
		}
		if (this.getMRSAComment() != null)
		{
			sb.append("<mRSAComment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMRSAComment().toString()));
			sb.append("</mRSAComment>");		
		}
		if (this.getClostridium() != null)
		{
			sb.append("<clostridium>");
			sb.append(this.getClostridium().toXMLString()); 
			sb.append("</clostridium>");		
		}
		if (this.getClostridiumComment() != null)
		{
			sb.append("<clostridiumComment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getClostridiumComment().toString()));
			sb.append("</clostridiumComment>");		
		}
		if (this.getVRE() != null)
		{
			sb.append("<vRE>");
			sb.append(this.getVRE().toXMLString()); 
			sb.append("</vRE>");		
		}
		if (this.getVREComment() != null)
		{
			sb.append("<vREComment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getVREComment().toString()));
			sb.append("</vREComment>");		
		}
		if (this.getESBC() != null)
		{
			sb.append("<eSBC>");
			sb.append(this.getESBC().toXMLString()); 
			sb.append("</eSBC>");		
		}
		if (this.getESBCComment() != null)
		{
			sb.append("<eSBCComment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getESBCComment().toString()));
			sb.append("</eSBCComment>");		
		}
		if (this.getTB() != null)
		{
			sb.append("<tB>");
			sb.append(this.getTB().toXMLString()); 
			sb.append("</tB>");		
		}
		if (this.getTBComment() != null)
		{
			sb.append("<tBComment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTBComment().toString()));
			sb.append("</tBComment>");		
		}
		if (this.getNorovirus() != null)
		{
			sb.append("<norovirus>");
			sb.append(this.getNorovirus().toXMLString()); 
			sb.append("</norovirus>");		
		}
		if (this.getNorovirusComment() != null)
		{
			sb.append("<norovirusComment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNorovirusComment().toString()));
			sb.append("</norovirusComment>");		
		}
		if (this.getControlRequirement() != null)
		{
			sb.append("<controlRequirement>");
			sb.append(this.getControlRequirement().toXMLString()); 
			sb.append("</controlRequirement>");		
		}
		if (this.getNotes() != null)
		{
			sb.append("<notes>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNotes().toString()));
			sb.append("</notes>");		
		}
		if (this.getInfectionControlAssessment() != null)
		{
			sb.append("<infectionControlAssessment>");
			sb.append(this.getInfectionControlAssessment().toXMLString(domMap)); 	
			sb.append("</infectionControlAssessment>");		
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
			InfectionControlComponent domainObject = getInfectionControlComponentfromXML(itemEl, factory, domMap);

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
			InfectionControlComponent domainObject = getInfectionControlComponentfromXML(itemEl, factory, domMap);

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
		
	public static InfectionControlComponent getInfectionControlComponentfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getInfectionControlComponentfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static InfectionControlComponent getInfectionControlComponentfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!InfectionControlComponent.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!InfectionControlComponent.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the InfectionControlComponent class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (InfectionControlComponent)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(InfectionControlComponent.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		InfectionControlComponent ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (InfectionControlComponent)factory.getImportedDomainObject(InfectionControlComponent.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new InfectionControlComponent();
		}
		String keyClassName = "InfectionControlComponent";
		Class clz = ret.getClass().getSuperclass();
		while (!clz.equals(ims.domain.DomainObject.class))
		{
			int dotIndex = clz.getName().lastIndexOf(".") + 1;
			keyClassName = clz.getName().substring(dotIndex); 
			clz = clz.getSuperclass();
		}

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (InfectionControlComponent)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, InfectionControlComponent obj, java.util.HashMap domMap) throws Exception
	{
		ims.nursing.assessment.domain.objects.AssessmentComponent.fillFieldsfromXML(el, factory, obj, domMap);
		org.dom4j.Element fldEl;
		fldEl = el.element("mRSA");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMRSA(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("mRSAComment");
		if(fldEl != null)
		{	
    		obj.setMRSAComment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("clostridium");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setClostridium(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("clostridiumComment");
		if(fldEl != null)
		{	
    		obj.setClostridiumComment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("vRE");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setVRE(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("vREComment");
		if(fldEl != null)
		{	
    		obj.setVREComment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("eSBC");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setESBC(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("eSBCComment");
		if(fldEl != null)
		{	
    		obj.setESBCComment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("tB");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTB(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("tBComment");
		if(fldEl != null)
		{	
    		obj.setTBComment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("norovirus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setNorovirus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("norovirusComment");
		if(fldEl != null)
		{	
    		obj.setNorovirusComment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("controlRequirement");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setControlRequirement(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("notes");
		if(fldEl != null)
		{	
    		obj.setNotes(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("infectionControlAssessment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setInfectionControlAssessment(ims.coe.assessmenttools.domain.objects.InfectionControlRepeatableAssessment.getInfectionControlRepeatableAssessmentfromXML(fldEl, factory, domMap)); 
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
		public static final String MRSA = "mRSA";
		public static final String MRSAComment = "mRSAComment";
		public static final String Clostridium = "clostridium";
		public static final String ClostridiumComment = "clostridiumComment";
		public static final String VRE = "vRE";
		public static final String VREComment = "vREComment";
		public static final String ESBC = "eSBC";
		public static final String ESBCComment = "eSBCComment";
		public static final String TB = "tB";
		public static final String TBComment = "tBComment";
		public static final String Norovirus = "norovirus";
		public static final String NorovirusComment = "norovirusComment";
		public static final String ControlRequirement = "controlRequirement";
		public static final String Notes = "notes";
		public static final String InfectionControlAssessment = "infectionControlAssessment";
	}
}

