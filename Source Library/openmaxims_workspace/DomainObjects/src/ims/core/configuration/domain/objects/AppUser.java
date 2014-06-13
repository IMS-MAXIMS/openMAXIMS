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
package ims.core.configuration.domain.objects;

/**
 * 
 * @author John MacEnri
 * Generated.
 */


public class AppUser extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1021100004;
	private static final long serialVersionUID = 1021100004L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private String username;
	private String password;
	private String encodedPassword;
	private String theme;
	private java.util.Date pwdExpDate;
	private java.util.Date effectiveFrom;
	private java.util.Date effectiveTo;
	private Boolean isActive;
	/** 
	  * Collection of ims.core.configuration.domain.objects.AppRole.
	  */
	private java.util.Set roles;
	private ims.core.resource.people.domain.objects.MemberOfStaff mos;
	/** Allows Debug Log for User */
	private Boolean debugMode;
	/** 
	  * Collection of ims.core.configuration.domain.objects.AppUserPassword.
	  */
	private java.util.List previousPasswords;
	private ims.core.admin.domain.objects.UserEmailAccount emailAccount;
	/** User/Pass will use External Authentication */
	private Boolean useExternalAuthentication;
	/** User Notification Details */
	private ims.core.configuration.domain.objects.UserNotificationDetails notificationDetails;
	/** LDAP username */
	private String lDAPUsername;
	/** LDAP password */
	private String lDAPPassword;
	/** User secret key */
	private String secretKey;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public AppUser (Integer id, int ver)
    {
    	super(id, ver);
    }
    public AppUser ()
    {
    	super();
    }
    public AppUser (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.configuration.domain.objects.AppUser.class;
	}


	public String getUsername() {
		return username;
	}
	public static AppUser getAppUserFromUsername(ims.domain.ILightweightDomainFactory factory, String val)
	{
		String hql = "from AppUser c where c.username = :username";		
		java.util.List l = factory.find(hql, new String[]{"username"}, new Object[]{val});
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. AppUser.username = " + val + " returned " + l.size() + " records. " );
		return (AppUser)l.get(0);
	}
	public void setUsername(String username) {
		if ( null != username && username.length() > 30 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for username. Tried to set value: "+
				username);
		}
		this.username = username;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if ( null != password && password.length() > 30 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for password. Tried to set value: "+
				password);
		}
		this.password = password;
	}

	public String getEncodedPassword() {
		return encodedPassword;
	}
	public void setEncodedPassword(String encodedPassword) {
		if ( null != encodedPassword && encodedPassword.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for encodedPassword. Tried to set value: "+
				encodedPassword);
		}
		this.encodedPassword = encodedPassword;
	}

	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		if ( null != theme && theme.length() > 20 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for theme. Tried to set value: "+
				theme);
		}
		this.theme = theme;
	}

	public java.util.Date getPwdExpDate() {
		return pwdExpDate;
	}
	public void setPwdExpDate(java.util.Date pwdExpDate) {
		this.pwdExpDate = pwdExpDate;
	}

	public java.util.Date getEffectiveFrom() {
		return effectiveFrom;
	}
	public void setEffectiveFrom(java.util.Date effectiveFrom) {
		this.effectiveFrom = effectiveFrom;
	}

	public java.util.Date getEffectiveTo() {
		return effectiveTo;
	}
	public void setEffectiveTo(java.util.Date effectiveTo) {
		this.effectiveTo = effectiveTo;
	}

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public java.util.Set getRoles() {
		if ( null == roles ) {
			roles = new java.util.HashSet();
		}
		return roles;
	}
	public void setRoles(java.util.Set paramValue) {
		this.roles = paramValue;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getMos() {
		return mos;
	}
	public void setMos(ims.core.resource.people.domain.objects.MemberOfStaff mos) {
		this.mos = mos;
	}

	public Boolean isDebugMode() {
		return debugMode;
	}
	public void setDebugMode(Boolean debugMode) {
		this.debugMode = debugMode;
	}

	public java.util.List getPreviousPasswords() {
		if ( null == previousPasswords ) {
			previousPasswords = new java.util.ArrayList();
		}
		return previousPasswords;
	}
	public void setPreviousPasswords(java.util.List paramValue) {
		this.previousPasswords = paramValue;
	}

	public ims.core.admin.domain.objects.UserEmailAccount getEmailAccount() {
		return emailAccount;
	}
	public void setEmailAccount(ims.core.admin.domain.objects.UserEmailAccount emailAccount) {
		this.emailAccount = emailAccount;
	}

	public Boolean isUseExternalAuthentication() {
		return useExternalAuthentication;
	}
	public void setUseExternalAuthentication(Boolean useExternalAuthentication) {
		this.useExternalAuthentication = useExternalAuthentication;
	}

	public ims.core.configuration.domain.objects.UserNotificationDetails getNotificationDetails() {
		return notificationDetails;
	}
	public void setNotificationDetails(ims.core.configuration.domain.objects.UserNotificationDetails notificationDetails) {
		this.notificationDetails = notificationDetails;
	}

	public String getLDAPUsername() {
		return lDAPUsername;
	}
	public void setLDAPUsername(String lDAPUsername) {
		if ( null != lDAPUsername && lDAPUsername.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for lDAPUsername. Tried to set value: "+
				lDAPUsername);
		}
		this.lDAPUsername = lDAPUsername;
	}

	public String getLDAPPassword() {
		return lDAPPassword;
	}
	public void setLDAPPassword(String lDAPPassword) {
		if ( null != lDAPPassword && lDAPPassword.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for lDAPPassword. Tried to set value: "+
				lDAPPassword);
		}
		this.lDAPPassword = lDAPPassword;
	}

	public String getSecretKey() {
		return secretKey;
	}
	public void setSecretKey(String secretKey) {
		if ( null != secretKey && secretKey.length() > 32 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for secretKey. Tried to set value: "+
				secretKey);
		}
		this.secretKey = secretKey;
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
		
		auditStr.append("\r\n*username* :");
		auditStr.append(username);
	    auditStr.append("; ");
		auditStr.append("\r\n*password* :");
		auditStr.append(password);
	    auditStr.append("; ");
		auditStr.append("\r\n*encodedPassword* :");
		auditStr.append(encodedPassword);
	    auditStr.append("; ");
		auditStr.append("\r\n*theme* :");
		auditStr.append(theme);
	    auditStr.append("; ");
		auditStr.append("\r\n*pwdExpDate* :");
		auditStr.append(pwdExpDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*effectiveFrom* :");
		auditStr.append(effectiveFrom);
	    auditStr.append("; ");
		auditStr.append("\r\n*effectiveTo* :");
		auditStr.append(effectiveTo);
	    auditStr.append("; ");
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
	    auditStr.append("; ");
		auditStr.append("\r\n*roles* :");
		if (roles != null)
		{
			java.util.Iterator it9 = roles.iterator();
			int i9=0;
			while (it9.hasNext())
			{
				if (i9 > 0)
					auditStr.append(",");
				ims.core.configuration.domain.objects.AppRole obj = (ims.core.configuration.domain.objects.AppRole)it9.next();
		if (obj != null)
		{
		   if (i9 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i9++;
		}
		if (i9 > 0)
			auditStr.append("] " + i9);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*mos* :");
		if (mos != null)
		{
			auditStr.append(toShortClassName(mos));
				
		    auditStr.append(mos.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*debugMode* :");
		auditStr.append(debugMode);
	    auditStr.append("; ");
		auditStr.append("\r\n*previousPasswords* :");
		if (previousPasswords != null)
		{
		int i12=0;
		for (i12=0; i12<previousPasswords.size(); i12++)
		{
			if (i12 > 0)
				auditStr.append(",");
			ims.core.configuration.domain.objects.AppUserPassword obj = (ims.core.configuration.domain.objects.AppUserPassword)previousPasswords.get(i12);
		    if (obj != null)
			{
				if (i12 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i12 > 0)
			auditStr.append("] " + i12);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*emailAccount* :");
		if (emailAccount != null)
		{
			auditStr.append(toShortClassName(emailAccount));
				
		    auditStr.append(emailAccount.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*useExternalAuthentication* :");
		auditStr.append(useExternalAuthentication);
	    auditStr.append("; ");
		auditStr.append("\r\n*notificationDetails* :");
		if (notificationDetails != null)
		{
			auditStr.append(toShortClassName(notificationDetails));
				
		    auditStr.append(notificationDetails.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*lDAPUsername* :");
		auditStr.append(lDAPUsername);
	    auditStr.append("; ");
		auditStr.append("\r\n*lDAPPassword* :");
		auditStr.append(lDAPPassword);
	    auditStr.append("; ");
		auditStr.append("\r\n*secretKey* :");
		auditStr.append(secretKey);
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
		
		String keyClassName = "AppUser";
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
		if (this.getUsername() != null)
		{
			sb.append("<username>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getUsername().toString()));
			sb.append("</username>");		
		}
		if (this.getPassword() != null)
		{
			sb.append("<password>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPassword().toString()));
			sb.append("</password>");		
		}
		if (this.getEncodedPassword() != null)
		{
			sb.append("<encodedPassword>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getEncodedPassword().toString()));
			sb.append("</encodedPassword>");		
		}
		if (this.getTheme() != null)
		{
			sb.append("<theme>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTheme().toString()));
			sb.append("</theme>");		
		}
		if (this.getPwdExpDate() != null)
		{
			sb.append("<pwdExpDate>");
			sb.append(new ims.framework.utils.DateTime(this.getPwdExpDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</pwdExpDate>");		
		}
		if (this.getEffectiveFrom() != null)
		{
			sb.append("<effectiveFrom>");
			sb.append(new ims.framework.utils.DateTime(this.getEffectiveFrom()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</effectiveFrom>");		
		}
		if (this.getEffectiveTo() != null)
		{
			sb.append("<effectiveTo>");
			sb.append(new ims.framework.utils.DateTime(this.getEffectiveTo()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</effectiveTo>");		
		}
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
		}
		if (this.getRoles() != null)
		{
			if (this.getRoles().size() > 0 )
			{
			sb.append("<roles>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getRoles(), domMap));
			sb.append("</roles>");		
			}
		}
		if (this.getMos() != null)
		{
			sb.append("<mos>");
			sb.append(this.getMos().toXMLString(domMap)); 	
			sb.append("</mos>");		
		}
		if (this.isDebugMode() != null)
		{
			sb.append("<debugMode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isDebugMode().toString()));
			sb.append("</debugMode>");		
		}
		if (this.getPreviousPasswords() != null)
		{
			if (this.getPreviousPasswords().size() > 0 )
			{
			sb.append("<previousPasswords>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPreviousPasswords(), domMap));
			sb.append("</previousPasswords>");		
			}
		}
		if (this.getEmailAccount() != null)
		{
			sb.append("<emailAccount>");
			sb.append(this.getEmailAccount().toXMLString(domMap)); 	
			sb.append("</emailAccount>");		
		}
		if (this.isUseExternalAuthentication() != null)
		{
			sb.append("<useExternalAuthentication>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isUseExternalAuthentication().toString()));
			sb.append("</useExternalAuthentication>");		
		}
		if (this.getNotificationDetails() != null)
		{
			sb.append("<notificationDetails>");
			sb.append(this.getNotificationDetails().toXMLString(domMap)); 	
			sb.append("</notificationDetails>");		
		}
		if (this.getLDAPUsername() != null)
		{
			sb.append("<lDAPUsername>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLDAPUsername().toString()));
			sb.append("</lDAPUsername>");		
		}
		if (this.getLDAPPassword() != null)
		{
			sb.append("<lDAPPassword>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLDAPPassword().toString()));
			sb.append("</lDAPPassword>");		
		}
		if (this.getSecretKey() != null)
		{
			sb.append("<secretKey>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSecretKey().toString()));
			sb.append("</secretKey>");		
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
			AppUser domainObject = getAppUserfromXML(itemEl, factory, domMap);

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
			AppUser domainObject = getAppUserfromXML(itemEl, factory, domMap);

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
		
	public static AppUser getAppUserfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getAppUserfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static AppUser getAppUserfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!AppUser.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!AppUser.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the AppUser class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (AppUser)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(AppUser.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		AppUser ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (AppUser)factory.getImportedDomainObject(AppUser.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new AppUser();
		}
		String keyClassName = "AppUser";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (AppUser)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, AppUser obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("username");
		if(fldEl != null)
		{	
    		obj.setUsername(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("password");
		if(fldEl != null)
		{	
    		obj.setPassword(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("encodedPassword");
		if(fldEl != null)
		{	
    		obj.setEncodedPassword(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("theme");
		if(fldEl != null)
		{	
    		obj.setTheme(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pwdExpDate");
		if(fldEl != null)
		{	
    		obj.setPwdExpDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("effectiveFrom");
		if(fldEl != null)
		{	
    		obj.setEffectiveFrom(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("effectiveTo");
		if(fldEl != null)
		{	
    		obj.setEffectiveTo(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("roles");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setRoles(ims.core.configuration.domain.objects.AppRole.fromSetXMLString(fldEl, factory, obj.getRoles(), domMap));
		}
		fldEl = el.element("mos");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setMos(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("debugMode");
		if(fldEl != null)
		{	
    		obj.setDebugMode(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("previousPasswords");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setPreviousPasswords(ims.core.configuration.domain.objects.AppUserPassword.fromListXMLString(fldEl, factory, obj.getPreviousPasswords(), domMap));
		}
		fldEl = el.element("emailAccount");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setEmailAccount(ims.core.admin.domain.objects.UserEmailAccount.getUserEmailAccountfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("useExternalAuthentication");
		if(fldEl != null)
		{	
    		obj.setUseExternalAuthentication(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("notificationDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setNotificationDetails(ims.core.configuration.domain.objects.UserNotificationDetails.getUserNotificationDetailsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("lDAPUsername");
		if(fldEl != null)
		{	
    		obj.setLDAPUsername(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("lDAPPassword");
		if(fldEl != null)
		{	
    		obj.setLDAPPassword(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("secretKey");
		if(fldEl != null)
		{	
    		obj.setSecretKey(new String(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "roles"
		, "previousPasswords"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Username = "username";
		public static final String Password = "password";
		public static final String EncodedPassword = "encodedPassword";
		public static final String Theme = "theme";
		public static final String PwdExpDate = "pwdExpDate";
		public static final String EffectiveFrom = "effectiveFrom";
		public static final String EffectiveTo = "effectiveTo";
		public static final String IsActive = "isActive";
		public static final String Roles = "roles";
		public static final String Mos = "mos";
		public static final String DebugMode = "debugMode";
		public static final String PreviousPasswords = "previousPasswords";
		public static final String EmailAccount = "emailAccount";
		public static final String UseExternalAuthentication = "useExternalAuthentication";
		public static final String NotificationDetails = "notificationDetails";
		public static final String LDAPUsername = "lDAPUsername";
		public static final String LDAPPassword = "lDAPPassword";
		public static final String SecretKey = "secretKey";
	}
}

