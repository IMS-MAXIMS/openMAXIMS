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
/**
 * 
 */
package ims.correspondence.helper;

import ims.configuration.gen.ConfigFlag;

//interfaces
import ims.framework.interfaces.IAttachment;
import ims.framework.interfaces.IEmailAuthentication;
import ims.framework.interfaces.IEmailAuthor;
import ims.vo.interfaces.IRecipientList;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 * @author snesbitt
 *
 */
public class EmailHelper
{		
	IRecipientList recipientList;
	IAttachment attachment;

	Authenticator auth;	
	Properties props;
	Session session;
	String subject;
	String fileName;
		
	/*
	 * This constructor to be used if no specific authentication is specified for the email user
	 */
	public EmailHelper(IEmailAuthor author) throws MessagingException
	{
		if (author != null)
		{
			props = new Properties();

			if (ConfigFlag.FW.SMTP_AUTH.getValue() != null && ConfigFlag.FW.SMTP_AUTH.getValue() != "")
			{
				// username and password specified as username:password in the SMTP_AUTH flag
				auth = new EmailStandardAuthenticator(getUsername(ConfigFlag.FW.SMTP_AUTH.getValue()),getPassword(ConfigFlag.FW.SMTP_AUTH.getValue()));
				props.put("mail.smtp.auth", "true");
			}
			else
			{
				props.put("mail.smtp.auth", "false");
			}
		}		
		else
		{
			throw new MessagingException("Please provide an author.");
		}
		
		setEmailMailServer(ConfigFlag.FW.SMTP_SERVER.getValue());
		setEmailSMTPPort(new Integer(ConfigFlag.FW.SMTP_PORT.getValue()).toString());
	}
	
	/*
	 * This constructor to be used if specific authentication is specified for the email user
	 */
	public EmailHelper(IEmailAuthor author,IEmailAuthentication authentication) throws MessagingException
	{
		if (author != null && authentication != null)
		{
			props = new Properties();
			 
			authentication.setAutentication(authentication.getAuthenticationName(),authentication.getAuthenticationPassword());
			auth = authentication.getAuthentication();
			
			//authentication is set based on authentication name and password being populated.
			if(authentication.getAuthenticationName() != null && authentication.getAuthenticationPassword() != null)
			{
				if(authentication.getAuthenticationName() != null && authentication.getAuthenticationPassword().length() > 0)
				{
					props.put("mail.smtp.auth", "true");
				}
			}
		}		
		else
		{
			throw new MessagingException("Please provide an author and default authentication.");
		}
		
		setEmailMailServer(authentication.getSMTPServer()); //this will implement the switch between using the default or specific to the user
		setEmailSMTPPort(authentication.getSMTPPort());
	}

	private void setEmailSMTPPort(String port) throws MessagingException
	{
    	if(port == null || port == null || port.length() == 0)
    		throw new MessagingException("No SMTP Port Server specified.");
		
		props.put("mail.smtp.port", port);
	}

	private String getPassword(String value) throws MessagingException
	{
		 String patternStr = ":";
		 String[] fields = value.split(patternStr);
		 if (fields.length > 1)
			 return fields[1];
		 else
			 throw new MessagingException("Invalid username:password format or no Password specified for SMTP/POP server authentication.");		 
	}

	private String getUsername(String value) throws MessagingException 
	{
		 String patternStr = ":";
		 String[] fields = value.split(patternStr);
		 if (fields.length > 0)
			 return fields[0];
		 else
			 throw new MessagingException("Invalid username:password format or no Username specified for SMTP/POP server authentication.");		 
	}
		
	public void addRecipients(IRecipientList recipientList)
	{
		this.recipientList = recipientList;
	}

	public boolean sendEmail() throws AddressException, MessagingException, SecurityException
	{
				
		this.setSession(Session.getInstance(props, auth));
		MimeMessage message = new MimeMessage(this.getSession());
		
		for (int i =0; i < getRecipientList().getRecipients().length; i++)
		{
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(getRecipientList().getRecipients()[i].getEmailAddress()));
		}
		
		if (this.subject == null)
			throw new MessagingException("No subject supplied");
		
		message.setSubject(this.subject);
	
		MimeBodyPart bp = getAttach().getBody();
		Multipart mp = new MimeMultipart("alternative");
		mp.addBodyPart(bp);
		
		// Put parts in message
		message.setContent(mp);
		Transport.send(message);
								
		return true;		
	}

	private void setEmailMailServer(String mailServer) throws MessagingException 
	{
    	if(mailServer == null || mailServer == null || mailServer.length() == 0)
    		throw new MessagingException("No Mail Server specified.");
		
		props.put("mail.smtp.host", mailServer);		
	}

	private Session getSession() {
		return session;
	}

	private void setSession(Session session) {
		this.session = session;
	}
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public IAttachment getAttach() {
		return attachment;
	}
	public void setAttach(IAttachment attach) {
		this.attachment = attach;
	}
	public IRecipientList getRecipientList() {
		return recipientList;
	}
	public void setRecipientList(IRecipientList recipientList) {
		this.recipientList = recipientList;
	}	
	
	public class EmailStandardAuthenticator extends javax.mail.Authenticator
	{
		private String username;
		private String password;
		EmailStandardAuthenticator(String username,String password)
		{
			this.password = password;
			this.username = username;
		}
		protected javax.mail.PasswordAuthentication getPasswordAuthentication()
		{
			return new javax.mail.PasswordAuthentication(username,password);
		}
	}
}
