package ims.RefMan.helper;

import ims.RefMan.vo.CatsReferralRefVo;
import ims.configuration.gen.ConfigFlag;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.impl.DomainImpl;
import ims.ocrr.orderingresults.vo.OrderInvestigationRefVo;
import ims.ocrr.orderingresults.vo.OrderInvestigationRefVoCollection;

import java.io.ByteArrayOutputStream;

import com.ims.query.builder.client.QueryBuilderClient;
import com.ims.query.builder.client.SeedValue;
import com.ims.query.builder.client.exceptions.QueryBuilderClientException;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PRAcroForm;
import com.itextpdf.text.pdf.PdfCopy;
import com.itextpdf.text.pdf.PdfImportedPage;
import com.itextpdf.text.pdf.PdfReader;

public class CatsReferralReportBuilder extends DomainImpl
{
	private static final long serialVersionUID = 1L;
	
//	private static final Integer CATS_REFERRAL_FINAL_DISCHARGE_REPORT = 130;
//	private static final Integer RESULT_INVESTIGATION_REPORT = 309;	


	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//	Utility classes
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	
	/**
	 *	PDF merge utility class
	 *	Remember to call close() member function to obtain closed document
	 */
	private class PDFContentMerger
	{
		private ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		private Document document = null;
		private PdfCopy writer = null;

		public PDFContentMerger()
		{
			super();
		}

		ByteArrayOutputStream getOutputStream()
		{
			return this.outStream;
		}

		@SuppressWarnings("unused")
		void setOutputStream(ByteArrayOutputStream outStreamInput)
		{
			this.outStream = outStreamInput;
		}

		public byte[] getMergedPdfByteArray()
		{
			if (this.outStream != null)
			{
				return this.outStream.toByteArray();
			}
			else
			{
				return null;
			}
		}

		public void add(byte[] pdfByteArray)
		{
			try
			{
				PdfReader reader = new PdfReader(pdfByteArray);
				int numberOfPages = reader.getNumberOfPages();

				if (this.document == null)
				{
					this.document = new Document(reader.getPageSizeWithRotation(1));
					this.writer = new PdfCopy(this.document, this.getOutputStream());
					this.document.open();
				}
				PdfImportedPage page;
				for (int i = 0; i < numberOfPages;)
				{
					++i;
					page = this.writer.getImportedPage(reader, i);
					this.writer.addPage(page);
				}
				PRAcroForm acroForm = reader.getAcroForm();
				if (acroForm != null)
				{
					this.writer.copyAcroForm(reader);
				}
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}

		public void close()
		{
			try
			{
				this.document.close();
				this.outStream.close();
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}



	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//	Public methods
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	
	/**
	 *	Function used to build	CATS Referral Final Discharge Report	in PDF format, without printing
	 *	The report will be a PDF 
	 */
	public byte[] getCatsReferralFinalDischargeReport(CatsReferralRefVo referral, OrderInvestigationRefVoCollection investigationList, String[] coverReport, String[] investigationReport, String sessionID) throws DomainInterfaceException, QueryBuilderClientException
	{
		return getCatsReferralFinalDischargeReport(referral, investigationList, coverReport, investigationReport, sessionID, null, 0);
	}
	
	
	/**
	 *	Function used to build	CATS Referral Final Discharge Report	in PDF format
	 */
	public byte[] getCatsReferralFinalDischargeReport(CatsReferralRefVo referral, OrderInvestigationRefVoCollection investigationList, String[] coverReport, String[] investigationReport, String sessionID, String printer, int copies) throws DomainInterfaceException, QueryBuilderClientException
	{
		return getCatsReferralFinalDischargeReport(referral, investigationList, coverReport, investigationReport,  sessionID, "PDF", printer, copies);
	}
	
	
	/**
	 * Function used to build CATS Referral Final Discharge Report
	 * 
	 * @param referral
	 * @param sessionID
	 * @param format 
	 * @param printer 
	 * @param copies 
	 * @return
	 * @throws DomainInterfaceException 
	 * @throws QueryBuilderClientException 
	 */
	public byte[] getCatsReferralFinalDischargeReport(CatsReferralRefVo referral, OrderInvestigationRefVoCollection investigationList, String[] coverReport, String[] investigationReport, String sessionID, String format, String printer, int copies) throws DomainInterfaceException, QueryBuilderClientException
	{
		// Check parameter for a valid referral
		if (referral == null || !referral.getID_CatsReferralIsNotNull())
			return null;
		
		
		// Get Query Builder client
		QueryBuilderClient queryClient = new QueryBuilderClient(ConfigFlag.GEN.QUERY_SERVER_URL.getValue(), sessionID);
		
		// Get the CATS Referral Final Discharge Report
		//String[] coverReport = getSystemReportAndTemplate(CATS_REFERRAL_FINAL_DISCHARGE_REPORT);
		

		// Generate CATS Referral Final Discharge Report
		
			// Add necessary seeds for the report
			queryClient.addSeed(new SeedValue("CatsReferral_id", referral.getID_CatsReferral(), Integer.class));
			
			// Build  CATS Referral Final Discharge Report  with data and retain it's content 
			byte[] coverReportContent = queryClient.buildReport(coverReport[0], coverReport[1], ConfigFlag.GEN.REPORT_SERVER_URL.getValue(), format, printer, copies);
			
			
		// Check the Referral Outcome record corresponding to CATS Referral for associated investigations
		// OrderInvestigationRefVoCollection investigationList = getInvestigations(referral);
		
		// If the Referral Outcome recored corresponding to CATS Referral doesn't have any investigations associated
		// return the content of  CATS Referral Final Discharge Report
		if (investigationList == null || investigationList.size() == 0)
			return coverReportContent;
		
		
		// Prepare the PDF Merger tool
		PDFContentMerger contentMerger = new PDFContentMerger();
		
		// Add content of  CATS Referral Final Discharge Report
		contentMerger.add(coverReportContent);
		
		
		// Iterate collection of investigations associated to Referral Outcome record
		for (OrderInvestigationRefVo investigation : investigationList)
		{
			// Get the report for OrderInvestigation
			// String[] investigationReport = getSystemReportAndTemplate(RESULT_INVESTIGATION_REPORT);
			
			// Generate OrderInvestigation report
			
    			// Clear previous seeds
    			queryClient.getSeeds().clear();
    			// Add necessary seeds for the report
    			queryClient.addSeed(new SeedValue("OrderInvestigation_id", investigation.getID_OrderInvestigation(), Integer.class));
    			
    			// Build  OrderInvestigation  report with data and retain it's content
    			byte[] investigationReportContent = queryClient.buildReport(investigationReport[0], investigationReport[1], ConfigFlag.GEN.REPORT_SERVER_URL.getValue(), format, printer, copies);
    			
    			
    		// Append content of the OrderInvestigation report
    		contentMerger.add(investigationReportContent);
		}
		
		
		// Close the PDF Merger tool to finalise document
		contentMerger.close();
		
		// Return PDF content
		return contentMerger.getMergedPdfByteArray();
	}



	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//	Private methods
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	/**
	 *	Function used to retrieve all resulted investigations associated to Referral Outcome record corresponding to CATS Referral record 
	 */
//	private OrderInvestigationRefVoCollection getInvestigations(CatsReferralRefVo referral)
//	{
//		// Test referral parameter
//		if (referral == null || !referral.getID_CatsReferralIsNotNull())
//			return null;
//		
//		
//		// Build query to retrieve  Investigations  associated to  ReferralOutcome  record corresponding to  CATS Referral record
//		String query = "select investigation from ReferralOutcome as refOut left join refOut.referralDischarge as dis left join dis.resultsForReport as investigation where refOut.catsReferral.id = :ID";
//		// Query database for investigations
//		List<?> investigationsList = getDomainFactory().find(query, "ID", referral.getID_CatsReferral());
//		
//		// Create collection for results
//		OrderInvestigationRefVoCollection resultsCollection = new OrderInvestigationRefVoCollection();
//		
//		// Iterate investigations returned by database query
//		while (investigationsList.iterator().hasNext())
//		{
//			OrderInvestigation investigation = (OrderInvestigation) investigationsList.iterator().next();
//			
//			// Create OrderInvestigationRefVo
//			OrderInvestigationRefVo investigationRef = new OrderInvestigationRefVo(investigation.getId(), investigation.getVersion());
//			// Add OrderInvestigationRefVo to results
//			resultsCollection.add(investigationRef);
//		}
//		
//		// Results
//		return resultsCollection;
//	}


	/**
	 *	Function used to retrieve the system report and template
	 */
//	private String[] getSystemReportAndTemplate(Integer reportID) throws DomainInterfaceException
//	{
//		// Test report ID parameter
//		if (reportID == null)
//			throw new DomainRuntimeException("Can not retrieve report & template for null ID");
//		
//		String[] result = null;
//		
//		
//		// Build query for retrieving templates
//		String query = "select report.reportXml, template.templateXml from ReportBo as report left join reports.templates as template where report.imsId = :IMS_ID order by template.name";
//		
//		
//		// Retrieve report and template data
//		List<?> reportTemplates = getDomainFactory().find(query, "IMS_ID", reportID);
//		
//		// Since there is no way to return only the first record,
//		// then assume the first record returned by the query is the one intended
//		if (reportTemplates.iterator().hasNext())
//		{
//			Object[] report = (Object[]) reportTemplates.iterator().next();
//			
//			result = new String[] {(String) report[0], (String) report[1]};
//		}
//		
//		
//		// Check if the report was found and retrieved from database
//		if (result == null || result.length < 2)
//		{
//			throw new DomainInterfaceException("Report and template were not found.");
//		}
//		
//		// Check if the report content is valid
//		if (result[0] == null || result[1] == null)
//		{
//			throw new DomainInterfaceException("The report has not been deployed.");
//		}
//		
//		// Return the report and template
//		return result;
//	}
}
