//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
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
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
package ims.admin.helper;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Node;

import sun.misc.BASE64Decoder;

public class ReportTemplateManifest
{
	public static final String FastReport = "FastReport"; 
	public static final String MSWord = "MSWord";
	public static final byte[] ZipSignature = new byte[] {0x50, 0x4B, 0x03, 0x04};

	public void extractReportInfoFromXml(String reportXml, StringBuilder sb)
	{
		if(reportXml == null || reportXml.length() == 0)
			return;
		
		try
		{
    		Document maindoc = getXmlDocument(reportXml);
    
    		Node root = maindoc.selectSingleNode("Project/Info");
    
    		sb.append("Created By: ");
    		sb.append(root.valueOf("CreatedBy"));
    		sb.append(", ");
    		sb.append("Created On: ");
    		sb.append(root.valueOf("CreatedOn"));
    		sb.append(", ");
    		sb.append("Updated By: ");
    		sb.append(root.valueOf("UpdatedBy"));
    		sb.append(", ");
    		sb.append("Updated On: ");
    		sb.append(root.valueOf("UpdatedOn"));
    		sb.append(", ");
    		sb.append("Version: ");
    		sb.append(root.valueOf("Version"));
    		sb.append("\n");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
			sb.append(e.toString());
			sb.append("\n");
		}
	}

	/**
	 * Extracts the manifest info from a FastReport template
	 * <p>
	 * @param  templateXml  a string that contains the FastReport template
	 * @return      template manifest as a string
	 * @throws IOException 
	 */    
	public String extractTemplateInfoFromXml(String templateXml) 
	{
		StringBuilder sb = new StringBuilder();
		
		if(templateXml == null || templateXml.length() == 0)
			return sb.toString();
		
		try
		{
			if(MSWord.equals(getTemplateType(templateXml)))
				return extractTemplateInfoFromDocx(templateXml);

			sb.append("Updated By: ");
	        sb.append(extractTagValue(templateXml, "ReportOptions.Author"));
	        sb.append(", ");
	        sb.append("Updated On: ");
	        sb.append(extractDateTimeFromNumeric(extractTagValue(templateXml, "ReportOptions.LastChange")));
	        sb.append(", ");
	        sb.append("Version: ");
	        sb.append(extractTagValue(templateXml, "ReportOptions.VersionBuild"));
	        sb.append(".");
	        sb.append(extractTagValue(templateXml, "ReportOptions.VersionMajor"));
	        sb.append(".");
	        sb.append(extractTagValue(templateXml, "ReportOptions.VersionMinor"));
	        sb.append(".");
	        sb.append(extractTagValue(templateXml, "ReportOptions.VersionRelease"));
	        sb.append("\n");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
			sb.append(e.toString());
			sb.append("\n");
		}
		
		return sb.toString();
	}

	private String extractTagValue(String templateXml, String tag)
	{
        int startIndex;

        if (templateXml == null || tag == null)
        {
            return null;
        }

        if ((startIndex = templateXml.indexOf(tag + "=\"")) >= 0)
        {
            int endIndex = templateXml.indexOf('"', startIndex + tag.length() + 2);

            if (endIndex > startIndex)
            {
                return templateXml.substring(startIndex + tag.length() + 2, endIndex);
            }
        }

        return "";
	}
	
	public String getTemplateType(String templateXml)
	{
		if(templateXml == null || templateXml.length() == 0)
			return "(null template received)";
		
		if(templateXml.startsWith("<?xml"))
			return FastReport;
		
		return MSWord;
	}

	/**
	 * Extracts the manifest info from a MSWord template
	 * <p>
	 * @param  templateXml  a string that contains the MSWord template
	 * @return      template manifest as a string
	 * @throws IOException 
	 */    
	private String extractTemplateInfoFromDocx(String templateXml) throws IOException
	{
		StringBuilder sb = new StringBuilder();
		
		if(templateXml == null || templateXml.length() == 0)
			return sb.toString();

		//the MSWord template is stored as base64 in the DB
		BASE64Decoder dec = new BASE64Decoder();
		
		byte[] xml = dec.decodeBuffer(templateXml);
		
		//check if it is in ZIP format first
		if(!Arrays.equals(ZipSignature, getFirstBytes(xml, ZipSignature.length)))
		{
			return "The template ZIP signature is invalid.";
		}
		
        ByteArrayInputStream stream = new ByteArrayInputStream(xml);
        ZipInputStream zis = new ZipInputStream(new BufferedInputStream(stream));
        ZipEntry entry;
        
        try
        {
            while ((entry = zis.getNextEntry()) != null) 
            {
                if (!entry.isDirectory()) 
                {
                    final String fileName = entry.getName();
                    if (fileName.equalsIgnoreCase("docProps/core.xml")) 
                    {
                        int size;
                        byte[] buffer = new byte[2048];

                        ByteArrayOutputStream baos = new ByteArrayOutputStream();
                        BufferedOutputStream bos = new BufferedOutputStream(baos, buffer.length);

                        while ((size = zis.read(buffer, 0, buffer.length)) != -1) 
                        {
                            bos.write(buffer, 0, size);
                        }
                        bos.flush();
                        bos.close();
                        
                        String tmpXml = new String(baos.toByteArray(), "UTF-8");
                        baos.close();

                        sb.append(extractManifestInfoFromWordTemplate(tmpXml));
                        break;
                    }
                }
            }
        }
		catch(Exception e)
		{
			e.printStackTrace();
			
			sb.append(e.toString());
			sb.append("\n");
		}
		
		return sb.toString();
	}
	
	private byte[] getFirstBytes(byte[] source, int len)
	{
		if(len == 0 || source == null || source.length == 0)
			return null;
		
		byte[] ret = new byte[len];
		
		for(int i = 0; i < len; i++)
		{
			ret[i] = source[i];
		}
		
		return ret;
	}
	
    private String extractManifestInfoFromWordTemplate(String xml) throws DocumentException
    {
        StringBuilder sb = new StringBuilder();
        String tmp;
        
        Document maindoc = getXmlDocument(xml);        
        Node root = maindoc.selectSingleNode("cp:coreProperties");
        
        sb.append("Updated By: ");
        sb.append(root.valueOf("cp:lastModifiedBy"));
        sb.append(", ");
        sb.append("Updated On: ");
        tmp = root.valueOf("dcterms:modified");
        if(tmp != null && tmp.length() > 0)
        {
            SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            SimpleDateFormat df2 = new SimpleDateFormat("dd MMM yyyy HH:mm:ss");
            tmp = tmp.replace('T', ' ');
            tmp = tmp.replace('Z', ' ').trim();
            
            try
            {
                Date result =  df1.parse(tmp);  
                tmp = df2.format(result);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        sb.append(tmp);
        sb.append(", ");
        sb.append("Version: ");
        sb.append(root.valueOf("cp:revision"));
        sb.append("\n");

        return sb.toString();
    }
	
	/**
	 * Extracts the datetime from a double precision numeric representation (this is how a datetime is stored in a FastReport file)
	 * The dbl argument is the numeric representation for that datetime value
	 * Example: 41199.6451570139 corresponds to 17/10/2012 15:29:01
	 * The integer part are the days elapsed from 30-Dec-1899
	 * The fractional part is fraction of a 24 hour day that has elapsed (in miliseconds)
	 * <p>
	 * @param  dbl  a string that contains a double precision numeric value
	 * @return      the encoded date in dd/mm/yyyy hh:mm:ss format
	 */    
	    private String extractDateTimeFromNumeric(String dbl)
	    {
	        String ret;
	        double val;
	        
	        if(dbl == null || dbl.length() == 0)
	        {
	            return "";
	        }
	        
	        try
	        {
	            val = Double.parseDouble(dbl);
	        }
	        catch(Exception e)
	        {
	            e.printStackTrace();
	            return "";
	        }
	        
	        double frac = Math.abs(val - Math.floor(val));
	        double base = Math.abs(Math.floor(val));

	        frac = Math.round(frac*24*3600*1000);
	        long l = (long) frac;
	        int Hour = (int)(l / 3600000);
	        l = l % 3600000;
	        int Minute = (int)(l / 60000);
	        l = l % 60000;
	        int Second = (int)(l / 1000);
	        l = l % 1000;
	        int MilliSecond = (int) l;
	        
	        try
	        {
	            Calendar epoch = Calendar.getInstance();
	            epoch.clear(Calendar.MILLISECOND);
	            epoch.set(1899, Calendar.DECEMBER, 30, 0,0,0);
	            
	            epoch.add(Calendar.DATE, (int)base);
	            
	            epoch.set(Calendar.HOUR, Hour);
	            epoch.set(Calendar.MINUTE, Minute);
	            epoch.set(Calendar.SECOND, Second);
	            epoch.set(Calendar.MILLISECOND, MilliSecond);
	            
	            java.util.Date dt = new Date(epoch.getTimeInMillis());
	            
	            ret = new SimpleDateFormat("dd MMM yyyy HH:mm:ss").format(dt);
	        }
	        catch(Exception e)
	        {
	            System.out.println(e);
	            
	            return "";
	        }
	        
	        return ret;
	    }

		private Document getXmlDocument(String xmlBuffer) throws DocumentException
		{
			return DocumentHelper.parseText(xmlBuffer);
		}
	    
}
