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

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import ims.configuration.gen.ConfigFlag;
import ims.core.vo.DocumentVo;
import ims.framework.interfaces.IAttachment;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.mail.MessagingException;
import javax.mail.internet.MimeBodyPart;

import com.ims.query.builder.client.QueryBuilderClient;
import com.ims.query.builder.client.exceptions.QueryBuilderClientException;

/**
 * @author snesbitt
 *
 */
public class AttachmentHelper implements IAttachment 
{
	DocumentVo voDoc;
	String sessionId;
	String fileName;
	MimeBodyPart bp;

	public AttachmentHelper(DocumentVo vo,String sessionId,String filename)
	{
		this.voDoc = vo;
		this.sessionId = sessionId;	
		this.setFileName(filename);
	}
	
	/* (non-Javadoc)
	 * @see ims.correspondence.helper.IAttachment#getBody()
	 */
	public javax.mail.internet.MimeBodyPart getBody() throws MessagingException
	{
		byte[] letterAsPdf = null;
		String urlReportServer = ConfigFlag.GEN.REPORT_SERVER_URL.getValue();
		QueryBuilderClient client = new QueryBuilderClient(urlReportServer,getSessionId());
		try
		{					
			letterAsPdf = client.convertReport(urlReportServer,voDoc.getContent().getBytes(),"PDF","",1);
			final byte[] attachment = letterAsPdf;
			this.bp = new MimeBodyPart();
			this.bp.setDataHandler(
			           new DataHandler(
			                   new DataSource() 
			           {
				            public String getContentType() 
				            {
				                return "application/pdf";
				            }
				 
				            public InputStream getInputStream() throws IOException 
				            {
				                return new ByteArrayInputStream(attachment);
				            }
				 
				            public String getName() 
				            {
				                return "DischargeLetter.pdf";
				            }
				 
				            public OutputStream getOutputStream() throws IOException 
				            {
				                return null;
				            }
			            }
			            ));
			
			//bp.setContent(resultPdf, "application/pdf");
			if (this.getFileName() == null)
				throw new MessagingException("Filename not supplied for email attachment.");
			this.bp.setFileName(this.getFileName());
			return this.bp;
			
		}
		catch (QueryBuilderClientException e) 
		{
			throw new MessagingException("Quer Builder Error: " + e.getMessage());
		}
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}
