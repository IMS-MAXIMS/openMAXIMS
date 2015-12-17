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
package ims.core.helper;

import ims.configuration.EnvironmentConfig;
import ims.configuration.gen.ConfigFlag;
import ims.framework.UIEngine;
import ims.framework.enumerations.SystemLogLevel;
import ims.framework.enumerations.SystemLogType;
import ims.framework.utils.DateTime;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.security.SecureRandom;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

public class DocumentHelper
{
	private static final long serialVersionUID = 1L;
	
	private static final String CHECKOUT_FOLDER = "CheckOut";

	public static boolean checkIfPdfFileExist(String pdfFileName, String rtfFileName) 
	{
		int year  = new DateTime().getDate().getYear();
		int month = new DateTime().getDate().getMonth();
		int day   = new DateTime().getDate().getDay();
		
		File pdfFile = new File(getPDFStorePath() + year + "\\" + month + "\\" + day + "\\" + pdfFileName);
		boolean nonNullFileExistAnd = pdfFile.exists() && (pdfFile.length() > 0);
		
		if (nonNullFileExistAnd)
		{
			long startCheck= System.currentTimeMillis();
			FileInputStream fin = null;
		    FileChannel ch = null;
		    try 
		    {
		        fin = new FileInputStream(pdfFile);
		        ch = fin.getChannel();
		        
		        byte fileContent[] = new byte[(int)pdfFile.length()];
                fin.read(fileContent);

                fin.close();
		        ch.close();

		        long start = System.currentTimeMillis();
				PdfReader pdfReader = new PdfReader(fileContent);  
			    String textFromPdfFilePageOne = PdfTextExtractor.getTextFromPage(pdfReader, 1);
			    long end = System.currentTimeMillis();								
				System.out.println("Reading first pdf page time : " + (new Float(end-start))/1000 + " seconds");
				
				if (Boolean.FALSE.equals(ConfigFlag.GEN.RELEASE_MODE.getValue()))
				{
					System.out.println(pdfFile + " first page content:");
					System.out.println(textFromPdfFilePageOne);
				}
				
				long endCheck = System.currentTimeMillis();								
				System.out.println("Total time for checking if file is on the share : " + (new Float(endCheck - startCheck)) / 1000 + " seconds");	
				
				//If CORRESPONDENCE_ARCHIVE_RTF_FILES is set try to archive file
				if (ConfigFlag.UI.CORRESPONDENCE_ARCHIVE_RTF_FILES.getValue())
				{
					archiveRtfFile(pdfFileName, rtfFileName);
				}				
		    }
		    catch (Exception e) 
		    {
		        e.printStackTrace();
		        return false;
		    }	  
		}
		
		return nonNullFileExistAnd;
	}

	public static String getPDFStorePath()
	{
		String storePath = ConfigFlag.GEN.PDF_STORE_PATH.getValue();

		if (!(storePath.endsWith("/") || storePath.endsWith("\\")))
			storePath = storePath + "/";

		return storePath;
	}
	
	public static String getArchiveStorePath()
	{
		String storePath = ConfigFlag.GEN.ARCHIVE_STORE_PATH.getValue();

		if (!(storePath.endsWith("/") || storePath.endsWith("\\")))
			storePath = storePath + "/";

		return storePath;
	}
	
	public static void archiveRtfFile(String pdfFileName, String rtfFileName) throws Exception
	{
		FileChannel inChan = null;
		FileChannel outChan = null;
		
		int year  = new DateTime().getDate().getYear();
		int month = new DateTime().getDate().getMonth();
		int day   = new DateTime().getDate().getDay();
		
		try
		{
			if (ConfigFlag.GEN.ARCHIVE_STORE_PATH.getValue() == null ||
					ConfigFlag.GEN.ARCHIVE_STORE_PATH.getValue().trim().length() == 0)
			{
				throw new Exception("ARCHIVE_STORE_PATH config flag is not set");
			}
			
			if (ConfigFlag.GEN.ARCHIVE_STORE_PATH.getValue() == null ||
					ConfigFlag.GEN.ARCHIVE_STORE_PATH.getValue().trim().length() == 0)
			{
				File file = new File(ConfigFlag.GEN.ARCHIVE_STORE_PATH.getValue());
				if (Boolean.FALSE.equals(file.exists()))
				{
					throw new Exception(file + " directory not exist");
				}
			}
			
			try {
				inChan = new FileInputStream(getPDFStorePath() + year + "\\" + month + "\\" + day + "\\" + pdfFileName).getChannel();
			}
			catch (FileNotFoundException e){
				throw new Exception("Can't read " +  pdfFileName + " pdf file");
			}
			
			inChan.close();
			inChan = null;
						
			try {
				inChan = new FileInputStream(getWorkAreaPath() + rtfFileName).getChannel();
			}
			catch (FileNotFoundException e){
				throw new Exception("Can't read " +  pdfFileName + " rtf file");
			}
			
			boolean retry = false;
			boolean success = false;
			
			while (!success)
			{
				success = true;
				
				File destinationFile = new File(ConfigFlag.GEN.ARCHIVE_STORE_PATH.getValue() + 
						"\\" +
						new DateTime().getDate().getYear() +
						"\\" +
						new DateTime().getDate().getMonth() +
						"\\" +
						new DateTime().getDate().getDay() +
						"\\" +
						pdfFileName.substring(0, pdfFileName.lastIndexOf('.')) + 
						".rtf");
				
				if (!destinationFile.exists())
				{
					try
					{
						File parentDir = destinationFile.getParentFile();
						if (!parentDir.exists()) {
							parentDir.mkdirs();
						}
						
						destinationFile.createNewFile();
					}
					catch (IOException e)
					{
						success = false;
						if (retry)
						{
							throw new Exception("Could not create the document in work area. An I/O error occurred");
						}
					}					
				}

				if (success)
				{
					try
					{
						outChan = new RandomAccessFile(destinationFile, "rw").getChannel();
					}
					catch (FileNotFoundException e)
					{
						success = false;
						if (retry)
						{
							throw new Exception("Could not create the document in work area. An I/O error occurred");
						}
					}					
				}
				
				if (!success)
				{
					retry  = true;
					Thread.sleep(1000);
				}
			}

			FileLock outLock = null;
			try
			{
				outLock = outChan.tryLock();
			}
			catch (IOException e)
			{
				throw new Exception("An I/O error occured . Please contact your administrator");
			}
			if (!(outLock != null && outLock.isValid()))
			{
				throw new Exception("Unable to complete checked out at the moment . Try again later");
			}
			
			try
			{
				int maxCount = 64 * 1024;
				long size;

				size = inChan.size();

				long position = 0;
				while (position < size)
				{
					position += inChan.transferTo(position, maxCount, outChan);
				}
			}
			catch (IOException e)
			{
				throw new Exception("An I/O error occured during copy");
			}
			finally
			{
				outLock.release();			
			}
		}
		catch (Exception e)
		{
			throw new Exception(e);
		}
		finally
		{
			tryClose(inChan);
			tryClose(outChan);			
		}
	}
	
	public static void tryClose(FileChannel inChan)
	{
		if (inChan != null)
		{
			try
			{
				inChan.close();
			}
			catch (IOException e1)
			{

			}
		}
	}
	
	public static String getWorkAreaPath()
	{
		String storePath = ConfigFlag.GEN.MAXIMS_DOCUMENT_WORK_AREA.getValue();

		if (!(storePath.endsWith("/") || storePath.endsWith("\\")))
			storePath = storePath + "/";

		return storePath;
	}
	
	public static boolean deleteFile(String fileToDelete)
	{
		File file = new File(fileToDelete);
		if (file.exists())
		{
			boolean wasDeleted = file.delete();
			if (!wasDeleted)
			{
				file.deleteOnExit();
			}
		}
		
		return true;
	}
	
	public static String generateName(Object value)
	{
		String str = "";

		try
		{
			// Get Random Segment
			SecureRandom prng = SecureRandom.getInstance("SHA1PRNG");
			str += Integer.toHexString(prng.nextInt());
			while (str.length() < 8)
			{
				str = '0' + str;
			}

			// Get CurrentTimeMillis() segment
			str += Long.toHexString(System.currentTimeMillis());
			while (str.length() < 12)
			{
				str = '0' + str;
			}

			// Get Random Segment
			SecureRandom secondPrng = SecureRandom.getInstance("SHA1PRNG");
			str += Integer.toHexString(secondPrng.nextInt());
			while (str.length() < 8)
			{
				str = '0' + str;
			}

			// Get IdentityHash() segment
			str += Long.toHexString(System.identityHashCode(value));
			while (str.length() < 8)
			{
				str = '0' + str;
			}
			// Get Third Random Segment
			byte bytes[] = new byte[16];
			SecureRandom thirdPrng = SecureRandom.getInstance("SHA1PRNG");
			thirdPrng.nextBytes(bytes);
			str += Integer.toHexString(thirdPrng.nextInt());
			while (str.length() < 8)
			{
				str = '0' + str;
			}
		}
		catch (java.security.NoSuchAlgorithmException ex)
		{
			ex.getMessage();
		}

		return str;
	}
	
	public static byte[] readFile(String filePath)
	{
		File pdf = new File(filePath);
		if (!pdf.exists())
		{	
			return null;
		}
		
		long size = pdf.length();

		if (size == 0)
		{
			return null;
		}
		
		FileInputStream fileInputStream = null;
		byte[] buffer = null;
		try
		{
			fileInputStream = new FileInputStream(pdf);

			int bytesAvailable = fileInputStream.available();

			int maxBufferSize = (int) size;

			int bufferSize = Math.min(bytesAvailable, maxBufferSize);

			buffer = new byte[bufferSize];

			int bytesRead = fileInputStream.read(buffer, 0, bufferSize);

			while (bytesRead > 0)
			{
				bytesAvailable = fileInputStream.available();
				bufferSize = Math.min(bytesAvailable, maxBufferSize);
				bytesRead = fileInputStream.read(buffer, 0, bufferSize);
			}

		}
		catch (IOException e)
		{
			buffer = null;
			e.printStackTrace();
		}
		finally
		{
			if (fileInputStream != null)
			{
				try
				{
					fileInputStream.close();
				}
				catch (IOException e1)
				{// Do Nothing

				}
			}
		}
		
		return buffer;
	}
	
	public static void createFile(String finalPDF, ByteArrayOutputStream outputStream, UIEngine engine) throws FileNotFoundException, IOException 
	{
		if (outputStream == null || finalPDF == null)
			return;
		
		FileOutputStream fos = new FileOutputStream (new File(finalPDF)); 
		Document document = new Document();
		try
		{			
			fos.write(outputStream.toByteArray());
			fos.close();
			
			PdfWriter writer = PdfWriter.getInstance(document, fos);

			document.open();
			BaseFont bf = BaseFont.createFont(BaseFont.HELVETICA, BaseFont.CP1252, BaseFont.NOT_EMBEDDED);
			PdfContentByte cb = writer.getDirectContent();
			cb.beginText();
			cb.setFontAndSize(bf, 9);
			cb.showTextAligned(PdfContentByte.ALIGN_CENTER, "This is a Draft Document, its contents might still change", 520, 5, 0);
			cb.endText();

			document.close();		       
		}
		catch (Exception e) 
		{
			engine.createSystemLogEntry(SystemLogType.REPORTS, SystemLogLevel.ERROR, "Error Converting DRAFT Document into PDF");
		}
		finally 
		{		
			fos.close();
			if (document.isOpen()) {
				document.close();		
			}
		}
	}	
	
	public static String convertRtfToPdf(UIEngine engine, Object logicObject, String inputFileName, Boolean isFinalDocument)
	{
		if (inputFileName == null || inputFileName.length() == 0)
			return null;
		
		if (!isFinalDocument && (ConfigFlag.GEN.FILE_UPLOAD_DIR.getValue() == null || ConfigFlag.GEN.FILE_UPLOAD_DIR.getValue().length() ==0))
			return null;
		
		int inputFileTypesIndex = inputFileName.lastIndexOf(".");
		if (inputFileTypesIndex < 0)
			return null;
		
		String inputFileType = inputFileName.substring(inputFileTypesIndex + 1);
		
		int lastIndexOf = inputFileName.lastIndexOf("/");
		if (lastIndexOf < 0)
		{
			lastIndexOf = inputFileName.lastIndexOf("\\");
		}
		
		String pdfFileName = generateName(logicObject) + ".pdf";
		
		String pdfTempFileName = null;
		if (!isFinalDocument)
		{
			pdfTempFileName =  (EnvironmentConfig.getBaseUri() + (ConfigFlag.GEN.FILE_UPLOAD_DIR.getValue().endsWith("/") ? ConfigFlag.GEN.FILE_UPLOAD_DIR.getValue().replace("/", "") : ConfigFlag.GEN.FILE_UPLOAD_DIR.getValue()) + "/" + generateName(logicObject) + ".pdf").replace("/", "\\");
		}
		
		byte[] buffer = readFile(getWorkAreaPath() + inputFileName);
		if (buffer == null || (buffer != null && buffer.length == 0))
			return null;

		ByteArrayOutputStream outStream = null;

		try
		{
			outStream = new ByteArrayOutputStream();
			
			ConversionHelper helper = new ConversionHelper();
			helper.convert(buffer, inputFileType, outStream);				
		}
		catch (Exception e)
		{
			e.printStackTrace();
			pdfFileName = null;
			pdfTempFileName = null;  
		}
		finally
		{
			if (outStream != null)
			{
				try
				{
					outStream.close();
				}
				catch (IOException e)
				{
					// Do Nothing
				}
			}
		}
		
		if(pdfFileName == null && isFinalDocument)
			return null;
		
		if(pdfTempFileName == null && !isFinalDocument)
			return null;

		try 
		{		
			if (isFinalDocument)
				engine.uploadFile(ConfigFlag.GEN.PDF_UPLOAD_URL.getValue(), outStream.toByteArray(), pdfFileName, ConfigFlag.GEN.FILE_UPLOAD_DIR.getValue() + "\\");
			else
				createFile(pdfTempFileName, outStream, engine);
		}
		catch (Exception e)
		{
			pdfFileName = null; 
			pdfTempFileName = null;
		}
		finally
		{
			if (outStream != null)
			{
				try
				{
					outStream.close();
				}
				catch (IOException e)
				{
					// Do Nothing
				}
			}
		}
		
		if(isFinalDocument && pdfFileName != null && pdfFileName.length() > 0)
			return pdfFileName;
		else if (!isFinalDocument && pdfTempFileName != null && pdfTempFileName.length() > 0)
			return pdfTempFileName;
		
		return null;
	}
	
	public static String getCheckOutWorkArea()
	{
		String checkOutPath = getWorkAreaPath() + CHECKOUT_FOLDER;
		
		File checkout = new File(checkOutPath);
		
		if(!checkout.exists())
			checkout.mkdirs();
		
		String newCheckOutPath = checkout.getPath();
		
		if (!(newCheckOutPath.endsWith("/") || newCheckOutPath.endsWith("\\")))
			newCheckOutPath = newCheckOutPath + "/";

		return newCheckOutPath;
	}
}
