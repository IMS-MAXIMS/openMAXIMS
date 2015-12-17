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
package ims.core.helper;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;

import org.apache.commons.io.IOUtils;
import org.artofsolving.jodconverter.OfficeDocumentConverter;
import org.artofsolving.jodconverter.office.DefaultOfficeManagerConfiguration;
import org.artofsolving.jodconverter.office.OfficeConnectionProtocol;
import org.artofsolving.jodconverter.office.OfficeManager;

import com.ims.query.builder.client.QueryBuilderClient;
import com.ims.query.builder.client.exceptions.QueryBuilderClientException;

import ims.configuration.gen.ConfigFlag;
import ims.configuration.EnvironmentConfig;
import ims.domain.impl.DomainImpl;

public class ConversionHelper extends DomainImpl
{   
	private static final long serialVersionUID = 1L;		  			
	private Long taskExecutionTimeout = 25000L;
	private int maxTasksPerProcess = 4;
	private static int currentPortNumber = 10000;
	
	public void convert(byte[] buffer, String inputFormat, OutputStream outputStream) throws Exception 
	{	
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		ByteArrayInputStream inStream = new ByteArrayInputStream(buffer);
		
		if (ConfigFlag.FW.DOCUMENT_CONVERSION_ENGINE.getValue() != null)
		{
			if (ConfigFlag.FW.DOCUMENT_CONVERSION_ENGINE.getValue().trim().equals("OpenOffice"))
			{			
				System.out.println("Using OpenOffice conversion engine");
				
				/**************************************************************/
				try {
					convertUsingOpenOffice(inStream, inputFormat, outputStream);
				}
				catch (Exception e) {
					throw new Exception("Conversion failed: ", e.getCause());				
				}
				finally  {
					outStream.close();
				}
				/*************************************************************/			
			}	
			else if(ConfigFlag.FW.DOCUMENT_CONVERSION_ENGINE.getValue().equals("Microsoft Office"))
			{			
				System.out.println("File type: " + inputFormat);
				
				/**************************************************************/
				if(inputFormat != null && inputFormat.trim() != "" &&
						(inputFormat.toUpperCase().endsWith("DOC") || inputFormat.toUpperCase().endsWith("DOCX") || inputFormat.toUpperCase().endsWith("RTF")))
				{
					System.out.println("Using Microsoft Office conversion engine");
					convertUsingMSOffice(inStream, outputStream); 
				}
				/**************************************************************/
				else
				{
					System.out.println("Using OpenOffice conversion engine");
					
					/**************************************************************/
					try {
						convertUsingOpenOffice(inStream, inputFormat, outputStream);
					}
					catch (Exception e) {
						throw new Exception("Conversion failed: ", e.getCause());					
					}
					finally {
						outStream.close();
					}
					/**************************************************************/
				}			
			}
		}
	}

	private void convertUsingMSOffice(InputStream inputStream, OutputStream outputStream) throws Exception 
	{	
		String urlReportServer = ConfigFlag.GEN.REPORT_SERVER_URL.getValue();
		if (urlReportServer == null || urlReportServer.trim().equals(""))
			throw new Exception("REPORT_SERVER_URL ConfigFlag must be set!");
		
		String urlQueryServer = ConfigFlag.GEN.QUERY_SERVER_URL.getValue();
		if (urlQueryServer == null || urlQueryServer.trim().equals(""))
			throw new Exception("QUERY_SERVER_UR ConfigFlag must be set!");
		
		long start = 0;
		long end = 0;
		
		//fileFormat 	 - PDF, RTF, DOC, DOCX, MHT -
		//officeDocument - DOC, DOCX or RTF document
		
		String fileFormat = "PDF";

		/**************************************************************/
		try {
			start = System.currentTimeMillis();
			
			/**************************************************************/
				QueryBuilderClient client = new QueryBuilderClient(urlQueryServer, null);
			/**************************************************************/
			
			end = System.currentTimeMillis();								
			System.out.println("QueryBuilderClient time : " + (new Float(end-start))/1000 + " seconds");
			
			start = System.currentTimeMillis();
			
			/**************************************************************/
				outputStream.write(client.convertOfficeDocument(urlReportServer, IOUtils.toByteArray(inputStream), fileFormat));
			/**************************************************************/
			
			end = System.currentTimeMillis();								
			System.out.println("Conversion time : " + (new Float(end-start))/1000 + " seconds");
		}
		catch (QueryBuilderClientException e) {		
			throw new Exception("QueryBuilderClientException: " + e.getCause());
		}
		catch (IOException e) {		
			throw new Exception("IOException: " + e.getCause());
		}
		/**************************************************************/
	}

	private void convertUsingOpenOffice(InputStream inputStream, String inputFormat, OutputStream outputStream) throws Exception 
	{ 		
		File inFile = null;
		File outFile = null;	
		
		long start = 0;
		long end = 0;
		
		OfficeManager officeManager =  null;		
		try 
		{
			/**************************************************************/
				officeManager = startOManager();		
			/**************************************************************/
			
			if (officeManager == null)
				throw new Exception("OfficeManager cannot be started");
			
			OfficeDocumentConverter converter = new OfficeDocumentConverter(officeManager);
			
			inFile = File.createTempFile("temp", "." + inputFormat);
			OutputStream inputFileStream = null;
			
			/**************************************************************/
			try {
				inputFileStream = new FileOutputStream(inFile);
				IOUtils.copy(inputStream, inputFileStream);
			}
			finally {
				IOUtils.closeQuietly(inputFileStream);
			}
			/**************************************************************/
			
			outFile = File.createTempFile("temp", "." + "pdf");
			
			start = System.currentTimeMillis();
			
			/**************************************************************/
				converter.convert(inFile, outFile);
			/**************************************************************/
			
			end = System.currentTimeMillis();								
			System.out.println("Conversion time : " + (new Float(end-start))/1000 + " seconds");
			
			FileInputStream outputFileStream = null;
			
			/**************************************************************/
			try {
				outputFileStream = new FileInputStream(outFile);
				IOUtils.copy(outputFileStream, outputStream);
			}
			finally {
				IOUtils.closeQuietly(outputFileStream);
			}				
			/**************************************************************/
		}
		catch (IOException ioException) 
		{
			throw new Exception("Conversion failed", ioException);
		} 
		finally 
		{			
			start = System.currentTimeMillis();
			officeManager.stop();							
			end = System.currentTimeMillis();		
			System.out.println("Shutdown time : " + (new Float(end-start))/1000 + " seconds");
			
			if (inFile != null) {
				inFile.delete();
			}
			if (outFile != null) {
				outFile.delete();
			}			
		}
	}
		
	private synchronized int getAvaiblePort()
	{	
		currentPortNumber ++;
		
		//Allow using port range between 10000 - 11000
		if (currentPortNumber == 10030)
		{
			currentPortNumber = 10000;
		}
		
		while(!isPortAvailable(currentPortNumber))
		{
			currentPortNumber++;
		}		
		
		return currentPortNumber;
	}
	
	private synchronized boolean isPortAvailable(int port) 
	{  		
		try 
		{  	    
			ServerSocket srv = new ServerSocket(port);  
			srv.close();  
			srv = null;  
			
			return true;  
		}
		catch (IOException e) 
		{  
			return false;  
		}  
	}  
	
	private synchronized OfficeManager startOManager() throws Exception
	{
		String officeHome = EnvironmentConfig.getOpenOfficeHomePath();
		if (officeHome == null || officeHome.trim().equals(""))
			throw new Exception("OpenOfficeHomePath EnvironmentConfig must be set!");
		
		OfficeManager officeManager = null;    	
		long start = 0;
		long end = 0;
		int port = getAvaiblePort();
							
		officeManager = new DefaultOfficeManagerConfiguration()
			.setOfficeHome(officeHome)	 
			.setConnectionProtocol(OfficeConnectionProtocol.SOCKET)
			.setPortNumber(port)	 					
			.setTaskExecutionTimeout(taskExecutionTimeout)
			.setMaxTasksPerProcess(maxTasksPerProcess)	 				
			.buildOfficeManager();
		
		System.out.println("OfficeHome : " + officeHome);										
		start = System.currentTimeMillis();
		
		/**************************************************************/
		try {
			officeManager.start();				
		}
		catch (Exception exception) {
			throw new Exception("OfficeManager start failed: ", exception);
		} 			
		/**************************************************************/
		
		end = System.currentTimeMillis();				
		System.out.println("Starting time : " + (new Float(end-start))/1000 + " seconds");
		
		return officeManager;
	}
}
