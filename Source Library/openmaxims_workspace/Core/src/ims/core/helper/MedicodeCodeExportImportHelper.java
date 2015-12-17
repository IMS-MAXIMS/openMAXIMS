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

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import ims.RefMan.vo.AdmissionDetailWithConsultantStaysForCodingVo;
import ims.RefMan.vo.CatsReferralRefVo;
import ims.RefMan.vo.ConsultantStayForPatientCodingListVo;
import ims.RefMan.vo.ReferralCodingItemVo;
import ims.RefMan.vo.ReferralCodingItemVoCollection;
import ims.RefMan.vo.ReferralExternalCodingItemVo;
import ims.RefMan.vo.ReferralExternalCodingItemVoCollection;
import ims.RefMan.vo.ReferralExternalCodingVo;
import ims.RefMan.vo.StageCodeExportVo;
import ims.RefMan.vo.StageCodeExportVoCollection;
import ims.clinical.vo.CodingCommentVo;
import ims.clinical.vo.CodingCommentVoCollection;
import ims.clinical.vo.lookups.CodingCommentType;
import ims.coe.vo.lookups.DischargeDestination;
import ims.configuration.gen.ConfigFlag;
import ims.core.admin.pas.domain.objects.AdmissionDetail;
import ims.core.admin.pas.domain.objects.DischargedEpisode;
import ims.core.clinical.domain.objects.Diagnosis;
import ims.core.clinical.domain.objects.NonUniqueTaxonomyMap;
import ims.core.clinical.domain.objects.PatientDiagnosis;
import ims.core.clinical.domain.objects.PatientProcedure;
import ims.core.clinical.domain.objects.Procedure;
import ims.core.clinical.domain.objects.Service;
import ims.core.clinical.domain.objects.TaxonomyMap;
import ims.core.vo.CDSInpatientVo;
import ims.core.vo.LocationFullVo;
import ims.core.vo.MemberOfStaffLiteVo;
import ims.core.vo.PatientId;
import ims.core.vo.PatientIdCollection;
import ims.core.vo.PatientShort;
import ims.core.vo.ServiceLiteVo;
import ims.core.vo.TaxonomyMapCollection;
import ims.core.vo.domain.LocationFullVoAssembler;
import ims.core.vo.lookups.CodingStatus;
import ims.core.vo.lookups.MethodOfAdmission;
import ims.core.vo.lookups.PatIdType;
import ims.core.vo.lookups.Sex;
import ims.core.vo.lookups.SourceOfAdmission;
import ims.core.vo.lookups.Specialty;
import ims.core.vo.lookups.TaxonomyType;
import ims.domain.DomainFactory;
import ims.domain.DomainSession;
import ims.domain.exceptions.DomainRuntimeException;
import ims.framework.exceptions.CodingRuntimeException;
import ims.domain.impl.DomainImpl;
import ims.domain.lookups.LookupInstance;
import ims.domain.lookups.LookupMapping;
import ims.framework.enumerations.SortOrder;
import ims.framework.interfaces.IAppUser;
import ims.framework.utils.DateFormat;
import ims.framework.utils.DateTime;
import ims.framework.utils.PartialDate;
import ims.vo.LookupMappingVo;
import ims.vo.LookupMappingVoCollection;
import ims.core.resource.people.domain.objects.Hcp;
import ims.core.resource.people.domain.objects.MemberOfStaff;
import ims.core.resource.place.domain.objects.Location;
import ims.core.patient.domain.objects.Patient;
import ims.RefMan.vo.DischargedEpisodeForReferralExternalCodingVo;


public class MedicodeCodeExportImportHelper extends DomainImpl implements ICodeExportImportHelper
{
	/**S
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final org.apache.log4j.Logger LOG = ims.utils.Logging.getLogger(MedicodeCodeExportImportHelper.class);
	
	private Map<String, String> referralCodingDataRecord1 = null;
	private Map<String, String> referralCodingDataRecord2 = null;
	String record_delim = "\r\n";
	static String eof = "EOF";
	private String file_content = "";
	AdmissionDetail admDetail = null;
	
	public String getFile_content() {
		return file_content;
	}


	public void setFile_content(String file_content) {
		this.file_content = file_content;
	}


	private DomainFactory domFactory = null;

	public MedicodeCodeExportImportHelper() throws DomainRuntimeException
	{
		if (referralCodingDataRecord1 == null)
			referralCodingDataRecord1 = new ConcurrentHashMap<String, String>();
		else
			referralCodingDataRecord1.clear();
		
		if (referralCodingDataRecord2 == null)
			referralCodingDataRecord2 = new ConcurrentHashMap<String, String>();
		else
			referralCodingDataRecord2.clear();
				
		try {
			domFactory = getDomainFactory();
			domFactory.setDomainSession(DomainSession.getSession());
		} catch (Exception e) {
			throw new DomainRuntimeException(e);
		}
		
		admDetail = null;
		
	}
	
	private class DiagnosisComparator implements Comparator
	{
		private int direction = 1;
		public DiagnosisComparator()
		{
			this(SortOrder.ASCENDING);
		}
		public DiagnosisComparator(SortOrder order)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
		}
		public int compare(Object obj1, Object obj2)
		{
			PatientDiagnosis patientDiagobj1 = (PatientDiagnosis)obj1;
			PatientDiagnosis patientDiagobj2 = (PatientDiagnosis)obj2;
			return direction*(patientDiagobj1.getDiagnosedDate().compareTo(patientDiagobj2.getDiagnosedDate()));
		}
		public boolean equals(Object obj)
		{
			return false;
		}
	}

	private class ProcedureComparator implements Comparator
	{
		private int direction = 1;
		public ProcedureComparator()
		{
			this(SortOrder.ASCENDING);
		}
		public ProcedureComparator(SortOrder order)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
		}
		public int compare(Object obj1, Object obj2)
		{
			PatientProcedure patientDiagobj1 = (PatientProcedure)obj1;
			PatientProcedure patientDiagobj2 = (PatientProcedure)obj2;
			return direction*(patientDiagobj1.getProcDate().compareTo(patientDiagobj2.getProcDate()));
		}
		public boolean equals(Object obj)
		{
			return false;
		}
	}
	
	public StringBuilder exportCodingData(
			IAppUser iAppUser,
			CatsReferralRefVo referralVo,
			AdmissionDetailWithConsultantStaysForCodingVo admissionVo,
			ConsultantStayForPatientCodingListVo  FCEVo,
			DischargedEpisodeForReferralExternalCodingVo dischargeVo,
			PatientShort patient,			
			Integer totalNumFCEs,
			Integer episodeOrder,
			Boolean lastEpisodeSpell,
			ReferralExternalCodingVo referralCodingVo) 
	{
		
		if (admDetail==null)
			admDetail = (AdmissionDetail)domFactory.getDomainObject(AdmissionDetail.class, admissionVo.getID_AdmissionDetail());

		StringBuilder out = new StringBuilder();
		
		// Record 1----------------------------------
		out.append(exportRecord1(iAppUser,referralVo,admissionVo,patient,totalNumFCEs,episodeOrder,lastEpisodeSpell));		
		
		out.append(record_delim);
		
		// Record 2----------------------------------
		
		out.append(exportRecord2(iAppUser,referralVo,admissionVo,FCEVo,dischargeVo, patient,totalNumFCEs,episodeOrder,lastEpisodeSpell,referralCodingVo));
		out.append(record_delim);
		
		
		//split referralcodingitem into diags and procs
		ReferralExternalCodingItemVoCollection diagColl = new ReferralExternalCodingItemVoCollection();
		ReferralExternalCodingItemVoCollection procColl = new ReferralExternalCodingItemVoCollection();
		
		if (referralCodingVo.getCodingItems()!=null && referralCodingVo.getCodingItems().size()>0)
		{
			for (ReferralExternalCodingItemVo item : referralCodingVo.getCodingItems())
			{
				if (item.getPatientDiagnosisIsNotNull())
					diagColl.add(item);
				else if (item.getPatientProcedureIsNotNull())
					procColl.add(item);
			}
		}

		// Record 3----------------------------------
		
		out.append(exportRecord3(iAppUser,referralVo,admissionVo,FCEVo,dischargeVo, patient,totalNumFCEs,episodeOrder,lastEpisodeSpell,referralCodingVo,diagColl));
		out.append(record_delim);

		// Record 4----------------------------------
		
		out.append(exportRecord4(iAppUser,referralVo,admissionVo,FCEVo,dischargeVo, patient,totalNumFCEs,episodeOrder,lastEpisodeSpell,referralCodingVo,procColl));
		out.append(record_delim);
		
		out.append(eof);
			
		int i =0;
		//update stagexportcollection
		if (!referralCodingVo.getStagingCodeExportIsNotNull())
		{
			referralCodingVo.setStagingCodeExport(new StageCodeExportVoCollection());		
			StageCodeExportVo stageExportVo = new StageCodeExportVo();
			stageExportVo.setExportDateTime(new DateTime());
			//WDEV-22421
			stageExportVo.setDataExport(out.toString().substring(0, out.length()>9999?9999:out.length()));
			referralCodingVo.getStagingCodeExport().add(stageExportVo);
		}
		else
		{
			//check last stageexport record was not saved. If not then update it with dataout contents
			StageCodeExportVo stageExportVo;
			if (referralCodingVo.getStagingCodeExport().size()==0)
				stageExportVo = new StageCodeExportVo();
			else
				stageExportVo = referralCodingVo.getStagingCodeExport().get(referralCodingVo.getStagingCodeExport().size()-1);
			
			if (stageExportVo.getID_StagingCodeExportIsNotNull())
			{
				//create new record
				StageCodeExportVo newstageExportVo = new StageCodeExportVo();
				//WDEV-22421
				newstageExportVo.setDataExport(out.toString().substring(0, out.length()>9999?9999:out.length()));
				newstageExportVo.setExportDateTime(new DateTime());
				referralCodingVo.getStagingCodeExport().add(newstageExportVo);
			}
			else
			{
				//already new, so update record
				//WDEV-22421
				stageExportVo.setDataExport(out.toString().substring(0, out.length()>9999?9999:out.length()));
				stageExportVo.setExportDateTime(new DateTime());
				referralCodingVo.getStagingCodeExport().add(stageExportVo);
			}
		}
		
		return out;
	}


	private StringBuffer exportRecord4(
			IAppUser iAppUser,
			CatsReferralRefVo referralVo,
			AdmissionDetailWithConsultantStaysForCodingVo admissionVo,			
			ConsultantStayForPatientCodingListVo fCEVo,
			DischargedEpisodeForReferralExternalCodingVo dischargeVo,
			PatientShort patient, 
			Integer totalNumFCEs,
			Integer episodeOrder,
			Boolean lastEpisodeSpell,
			ReferralExternalCodingVo referralCodingVo,
			ReferralExternalCodingItemVoCollection procColl) 
	{
		
		StringBuffer out = new StringBuffer();
		SimpleDateFormat df = new SimpleDateFormat("ddMMyyyy");
		
		if (procColl!=null && procColl.size()>0)
		{
			
			ReferralCodingItemVoCollection pushedColl = new ReferralCodingItemVoCollection();
			
			for (ReferralExternalCodingItemVo item : procColl)
			{
				if (item!=null && item.getPatientProcedureIsNotNull() && item.getPatientProcedure().getProcedureIsNotNull())
				{
					StringBuffer procCode = (StringBuffer) getProcedureCode(item.getPatientProcedure().getProcedure().getID_Procedure());
					//Number of Procedures
					out.append(procColl.size())
					.append('|')
					//Procedure Code n
					.append(procCode)
					.append('|')
					//Primary Secondary ind n
					.append(item.getPatientProcedure().getIsPrimaryIsNotNull()?(item.getPatientProcedure().getIsPrimary().booleanValue()?'Y':'N'):"")
					.append('|')
					//Code Type Indicator n
					.append("OP4");
					//Only receiving, not sending ??
					out.append('|');
					//Procedure Consultant and Theatre code n
					if (item.getPatientProcedure().getPeformedByIsNotNull())
						out.append(getConsultantCode(item.getPatientProcedure().getPeformedBy().getIMosHcpId()));
					out.append('|');
					//Procedure Date "–" Time n				
					if (item.getPatientProcedure().getProcDateIsNotNull())
						out.append(getProcedureDateTime(item.getPatientProcedure().getProcDate()));
					out.append('|');
					//"1st in set" Indicator n
					//out.append(firstInSet?'Y':'N') -- not available in Maxims
					out.append('|');
					
					ReferralCodingItemVo pushedCodingItem = new ReferralCodingItemVo();
					pushedCodingItem.setCodingTypeIndicator("OP4");
					pushedCodingItem.setICD10(procCode.toString());				
					pushedColl.add(pushedCodingItem);
				}
			}
			
			//add to coding pushed items
			if (!referralCodingVo.getStagingCodeExportIsNotNull())
				referralCodingVo.setStagingCodeExport(new StageCodeExportVoCollection());
	
			StageCodeExportVo stageExportVo = new StageCodeExportVo();
			stageExportVo.setExportDateTime(new DateTime());
			stageExportVo.setPushedCodingItems(pushedColl);

			referralCodingVo.getStagingCodeExport().add(stageExportVo);
			
		}		
		return out;
	}

	private StringBuffer getConsultantCode(Integer iMosHcpId) 
	{
		StringBuffer out = new StringBuffer();
		
		Hcp hcp = (Hcp)domFactory.getDomainObject(Hcp.class, iMosHcpId);
		
		out.append(hcp.getExtCode(TaxonomyType.NAT_CONS_CODE.getID()));
		
		return out;		
	}


	private Object getProcedureCode(Integer id_Procedure) 
	{
		//returns ICD10 code of procedure.mappings
		
		StringBuffer out = new StringBuffer();
		out.append("");
		
		if(id_Procedure == null)
			return null;
		
		Procedure doProc = (Procedure)domFactory.getDomainObject(Procedure.class, id_Procedure);
				
		List procTaxonomyMapColl = doProc.getTaxonomyMap();
		if(procTaxonomyMapColl != null && procTaxonomyMapColl.size() > 0)
		{
			for(int i=0; i<procTaxonomyMapColl.size(); i++)
			{
				TaxonomyMap doTavonomyMap = (TaxonomyMap)procTaxonomyMapColl.get(i);
				if(doTavonomyMap != null && doTavonomyMap.getTaxonomyName()!=null && doTavonomyMap.getTaxonomyName().getId()==(ims.core.vo.lookups.TaxonomyType.ICD10.getID()))
				{
					return out.append(doTavonomyMap.getTaxonomyCode());
				}				
			}				
		}
		return out;		

	}


	private StringBuffer exportRecord3(
			IAppUser iAppUser,
			CatsReferralRefVo referralVo,
			AdmissionDetailWithConsultantStaysForCodingVo admissionVo,			
			ConsultantStayForPatientCodingListVo fCEVo,
			DischargedEpisodeForReferralExternalCodingVo dischargeVo,
			PatientShort patient, 
			Integer totalNumFCEs,
			Integer episodeOrder,
			Boolean lastEpisodeSpell,
			ReferralExternalCodingVo referralCodingVo,
			ReferralExternalCodingItemVoCollection diagColl) 
	{
		StringBuffer out = new StringBuffer();
	
		if (diagColl!=null && diagColl.size()>0)
		{
	
			ReferralCodingItemVoCollection pushedColl = new ReferralCodingItemVoCollection();
			
			for (ReferralExternalCodingItemVo item : diagColl)
			{
				StringBuffer diagCode = getDiagnosisCode(item.getPatientDiagnosis().getDiagnosis().getID_Diagnosis());
				//Number of Diagnoses
				out.append(diagColl.size())
				.append('|')
				//Diagnosis Code n
				.append(diagCode)
				.append('|')
				//Dagger Asterisk indicator n
				.append('|')
				//Coding Type Indicator n
				.append("I10")
				.append('|');
				//"1st in set" Indicator n
				//out.append(firstInSet?'Y':'N') -- not available in Maxims
				out.append('|');
								
				ReferralCodingItemVo pushedCodingItem = new ReferralCodingItemVo();
				pushedCodingItem.setCodingTypeIndicator("I10");
				pushedCodingItem.setOPCS4(diagCode.toString());				
				pushedColl.add(pushedCodingItem);
			}
			
			//add to coding pushed items
			if (!referralCodingVo.getStagingCodeExportIsNotNull())
				referralCodingVo.setStagingCodeExport(new StageCodeExportVoCollection());
	
			StageCodeExportVo stageExportVo = new StageCodeExportVo();
			stageExportVo.setExportDateTime(new DateTime());			
			//stageExportVo.setDataExport(lOut);
			stageExportVo.setPushedCodingItems(pushedColl);
	
			referralCodingVo.getStagingCodeExport().add(stageExportVo );
	
		}		
		return out;
	}


	private String getProcedureDateTime(PartialDate procDate) 
	{
		SimpleDateFormat df = new SimpleDateFormat("ddMMyyyy");
		return df.format(fromPartialDate(procDate)).toString();
	}

	private StringBuffer getDiagnosisCode(Integer id_Diagnosis) 
	{
		//returns ICD10 code of diagnosis.mappings
		
		StringBuffer out = new StringBuffer();
		
		out.append("");
		if(id_Diagnosis == null)
			return null;
		
		Diagnosis doDiag = (Diagnosis)domFactory.getDomainObject(Diagnosis.class, id_Diagnosis);
				
		List diagTaxonomyMapColl = doDiag.getTaxonomyMap();
		if(diagTaxonomyMapColl != null && diagTaxonomyMapColl.size() > 0)
		{
			for(int i=0; i<diagTaxonomyMapColl.size(); i++)
			{
				TaxonomyMap doTavonomyMap = (TaxonomyMap)diagTaxonomyMapColl.get(i);
				if(doTavonomyMap != null && doTavonomyMap.getTaxonomyName()!=null && doTavonomyMap.getTaxonomyName().getId() == (ims.core.vo.lookups.TaxonomyType.ICD10.getID()))
				{
					return out.append(doTavonomyMap.getTaxonomyCode());
				}				
			}				
		}
		return out;		
	}

	private StringBuffer exportRecord2(
			IAppUser iAppUser,
			CatsReferralRefVo referralVo,
			AdmissionDetailWithConsultantStaysForCodingVo admissionVo,			
			ConsultantStayForPatientCodingListVo fCEVo,
			DischargedEpisodeForReferralExternalCodingVo dischargeVo,
			PatientShort patient, 
			Integer totalNumFCEs,
			Integer episodeOrder,
			Boolean lastEpisodeSpell,
			ReferralExternalCodingVo referralCodingVo)
	{
		StringBuffer out = new StringBuffer();
		SimpleDateFormat df = new SimpleDateFormat("ddMMyyyy");
		
		//Episode Number
		out.append(fCEVo!=null?fCEVo.getID_ConsultantStay():"");
		out.append('|');
		
		//Episode Start Date / Attendance Date
		if (fCEVo!=null&&fCEVo.getTransferDateTimeIsNotNull() && fCEVo.getTransferDateTime().getDate()!=null)
			out.append(df.format(fCEVo.getTransferDateTime().getDate().getDate()));
		out.append('|');
		
		//Episode End Date / Attendance Date
		if (fCEVo!=null&&fCEVo.getEndDateTimeIsNotNull() && fCEVo.getEndDateTime().getDate()!=null)
			out.append(df.format(fCEVo.getEndDateTime().getDate().getDate()));
		out.append('|');
		
		//Intended Management
		out.append(getIntendedManagment(fCEVo,admissionVo)); // http://jira/browse/WDEV-23953
		
		out.append('|');
		
		//Admission Source
		out.append(getMappingForSourceOfAdmissionLookup(admissionVo.getSourceOfAdmission()));
		out.append('|');
		
		//Admission Date
		if (admissionVo.getAdmissionDateTimeIsNotNull() && admissionVo.getAdmissionDateTime().getDate()!=null)
			out.append(df.format(admissionVo.getAdmissionDateTime().getDate().getDate()));
		out.append('|');
		
		//Admission Type
		//WDEV-23787
		out.append(getAdmissionType(admissionVo!=null?admissionVo.getID_AdmissionDetail():null));
		//WDEV-23787		
		out.append('|');
				
		//Discharge Date
		if (dischargeVo!=null && dischargeVo.getDischargeDateTimeIsNotNull())
			out.append(df.format(dischargeVo.getDischargeDateTime().getDate()!=null?dischargeVo.getDischargeDateTime().getDate().getDate():""));
		out.append('|');
		
		//Discharge Destination
		if (dischargeVo!=null)
			out.append(getMappingForDischargeDestinationLookup(dischargeVo.getDischargeDestination()));
		out.append('|');
		
		//Discharge Type
		//WDEV-23787
		out.append(getDischargeType(admissionVo!=null?admissionVo.getID_AdmissionDetail():null));
		//WDEV-23787		
		out.append('|');
		
		//Consultant Code
		if (fCEVo.getConsultantIsNotNull())
			out.append(getExternalCodingConsCode(fCEVo.getConsultant().getMos()));
		out.append('|');
		
		//WDEV-23906
		//Episode Speciality Code		
		if (fCEVo!=null&&fCEVo.getConsultant()!=null)
		{
			out.append(getMappingForSpecialty(fCEVo.getConsultant().getSpecialty()));
		}
		out.append('|');
		//WDEV-23906

		//Additional Clinical Reference
		out.append('|');
		
		//Group Type
		out.append('|');
		
		//Group Code 1
		out.append('|');
		//Group Code 2
		out.append('|');
		//Group Code 3
		out.append('|');

		//Coding Level Indicator - not output from Maxims. This is handled in Medicode and derived for Maxims.
//		if (fCEVo!=null)
//			out.append(getMappingForCoding(fCEVo.getCodingStatus()));
		out.append('|');		
		
		//Diagnosis Free Text
		out.append('|');
		
		//Procedure Free Text
		out.append('|');
		
		//Legal Status
		out.append('|');
		
		//Coders Notes will be imported only to the ReferalCoding.Comments
		//if (fCEVo!=null && fCEVo.getCodingCommentIsNotNull() && fCEVo.getCodingComment().size()>0)
			//out.append(fCEVo.getCodingCommentIsNotNull()?fCEVo.getCodingComment():"");
		out.append('|');
		
		//Date Coded
		if (referralCodingVo != null)
			out.append(referralCodingVo.getAuthoringDateTimeIsNotNull() &&
					referralCodingVo.getAuthoringDateTime().getDate()!=null?df.format(referralCodingVo.getAuthoringDateTime().getDate().getDate()):"");
		else
			out.append(df.format(new Date())); //today
		out.append('|');

		//Episode Start Date / Attendance Date
		
		//Time Coded
		if (referralCodingVo != null && referralCodingVo.getAuthoringDateTimeIsNotNull())			
			out.append(getHour(referralCodingVo.getAuthoringDateTime().getTime().getHour())+":"+getTime(referralCodingVo.getAuthoringDateTime().getTime().getMinute()));
		else			
		{
			DateTime now = new DateTime();
			out.append(getHour(now.getTime().getHour())+":"+getTime(now.getTime().getMinute())); //today
		}
		out.append('|');
		
		//WDEV-23780
		//Coding Source
		out.append("04|"); //04 EPR Notes 
		//WDEV-23780
		
		//Ward
		if (admissionVo.getPasEventIsNotNull() && admissionVo.getPasEvent().getLocationIsNotNull())
			out.append(getlocationMapping(admissionVo.getPasEvent().getLocation().getID_Location()));
		out.append('|');
		
		
		//PSE/CSE
		out.append('|');
		
		//Delete Episode
		out.append('|');
		
		//Group Code 1 Unbundled
		out.append('|');
		
		//Spell No.
		out.append(admissionVo.getID_AdmissionDetail());
		out.append('|');
		
		//Treatment Function Code
		//WDEV-23787
		//http://jira/browse/WDEV-23906 part b National Treatment Function
		if(fCEVo!=null&&fCEVo.getService()!=null)
		{
			out.append(getMappingForTreatment(fCEVo.getService()));
		}
		//WDEV-23787		
		out.append('|');
		
		//Neonatal Level of Care
		out.append('|');
		
		//Patient Classification
		out.append(getPatientClassification(fCEVo,admissionVo)); // http://jira/browse/WDEV-23953
		//TODO: review source
		out.append('|');
		
		//Provider Code
		out.append(ConfigFlag.DOM.CDS_DEFAULT_SITE_CODE.getValue()!=null?ConfigFlag.DOM.CDS_DEFAULT_SITE_CODE.getValue():"")
		.append('|');
		
		//Purchaser Code
		if (admissionVo.getPasEventIsNotNull() && admissionVo.getPasEvent().getLocationIsNotNull())
			out.append(getLocationAddressPCT(admissionVo.getPasEvent().getLocation().getID()));
		out.append('|')
		
		//PbR Delayed Discharge days
		//TODO - source TBC Product Team
		.append('|');
		
		//PbR Critical Care Bed days
		//TODO - source TBC Product Team		
		out.append('|');
		
		//Episode Order
		//zero padded width 3
		if (episodeOrder>0)
			out.append(String.format("%03d",episodeOrder));
		out.append('|');
		
		//Last Episode In Spell
		out.append(lastEpisodeSpell!=null?(lastEpisodeSpell?'Y':'N'):'N')
		//WDEV-23780
		.append('|');
		
		//Renal Attendance Indicator
		out.append('|')
		//WDEV-23780
		
		//Mental Health Provision Indicator
		.append('|')
		
		//First Attendance
		//TODO Review source
		.append('|')
		
		//WDEV-23780
		//A&E Arrival Mode
		.append('|')
		
		//A&E Attendance Category
		.append('|')
		
		//A&E Incident Location
		.append('|')
		
		//A&E Patient Group
		.append('|')
		
		//A&E Source of Referral
		.append('|')
		
		//A&E Attending Officer
		.append('|')
		
		//A&E Attendance/Episode Tim
		.append('|')
		
		//A&E Multiple Injuries
		.append('|')
		
		//A&E Trauma Screening
		.append('|')
		
		//A&E No. of Prescriptions
		.append('|')
		
		//A&E Diagnostic Description
		.append('|')
		
		//WDEV-23780		
		
		//Spell Group Code 1
		.append('|');
		
		//Spell Admission Date
		if (admissionVo.getAdmissionDateTimeIsNotNull() && admissionVo.getAdmissionDateTime().getDate()!=null)
			out.append(df.format(admissionVo.getAdmissionDateTime().getDate().getDate()));
		out.append('|');
		
		//Spell Discharge Date
		if (dischargeVo!=null && dischargeVo.getDischargeDateTimeIsNotNull() && dischargeVo.getDischargeDateTime().getDate()!=null)
			out.append(df.format(dischargeVo.getDischargeDateTime().getDate().getDate()));
		out.append('|')
		
		//Spell Admission Type/Method
		//TODO: review source
		//.append()
		.append('|');
		
		//Episode Start Time
		if (referralCodingVo!=null && fCEVo!=null && fCEVo.getTransferDateTimeIsNotNull())
			out.append(getHour(fCEVo.getTransferDateTime().getTime().getHour())+":"+getTime(fCEVo.getTransferDateTime().getTime().getMinute()));
		out.append('|');		
		
		//Episode End Time
		if (referralCodingVo!=null && fCEVo!=null && fCEVo.getEndDateTimeIsNotNull())
			out.append(getHour(fCEVo.getEndDateTime().getTime().getHour())+":"+getTime(fCEVo.getEndDateTime().getTime().getMinute()));
		out.append('|');
 
		return out;
	}
	
	//Start http://jira/browse/WDEV-23953
	
	/*
1	Ordinary admission
A PATIENT not admitted electively, and any PATIENT admitted electively with the expectation that they will remain in hospital for at least one night, including a PATIENT admitted with this intention who leaves hospital for any reason without staying overnight. A PATIENT admitted electively with the intent of not staying overnight, but who does not return home as scheduled, should be counted as an ordinary admission

2	Day case admission
A PATIENT admitted electively during the course of a day with the intention of receiving care who does not require the use of a Hospital Bed  overnight and who returns home as scheduled. If this original intention is not fulfilled and the PATIENT stays overnight, such a PATIENT should be counted as an ordinary admission

3	Regular day admission
A PATIENT admitted electively during the day, as part of a planned series of regular admissions for an on-going regime of broadly similar treatment and who is discharged the same day.
 If the intention is not fulfilled and one of these admissions should involve a stay of at least 24 hours, such an admission should be classified as an ordinary admission.
 The series of regular admissions ends when the PATIENT no longer requires frequent admissions

4	Regular night admission
A PATIENT admitted electively for the night, as part of a planned series of regular admissions for an on-going regime of broadly similar treatment and who is discharged in the morning. If the intention is not fulfilled and one of these admissions should involve a stay of at least 24 hours, such an admission should be classified as an ordinary admission. The series of regular admissions ends when the patient no longer requires frequent admissions

5	Mother and baby using delivery facilities only
Mother and baby using delivery facilities only and not using a Hospital Bed in the Antenatal or Postnatal WARDS during the stay in hospital

	 */
	
	
	private String getPatientClassification( ConsultantStayForPatientCodingListVo fCEVo, AdmissionDetailWithConsultantStaysForCodingVo admissionVo)
	{
		if(isUnPlannedElective(admissionVo)&&isDayCase(fCEVo))
		{
			return "2";
		}
		else if (isPlannedElective(admissionVo)&&isDayCase(fCEVo))
		{
			return "3";
		}
		else 
			return "1";
	}
	
	private boolean isUnPlannedElective(AdmissionDetailWithConsultantStaysForCodingVo admissionVo)
	{
		if (admDetail==null)
			admDetail = (AdmissionDetail)domFactory.getDomainObject(AdmissionDetail.class, admissionVo.getID_AdmissionDetail());
		if(admDetail!=null&&admDetail.getMethodOfAdmission()!=null)
		{
			if(MethodOfAdmission.BOOKED.getID()==admDetail.getMethodOfAdmission().getId()
					||MethodOfAdmission.WAITING_LIST.getID()==admDetail.getMethodOfAdmission().getId())
			{
				return true;
			}
		}
		return false;
	}


	
	private boolean isPlannedElective(AdmissionDetailWithConsultantStaysForCodingVo admissionVo)
	{
		if (admDetail==null)
			admDetail = (AdmissionDetail)domFactory.getDomainObject(AdmissionDetail.class, admissionVo.getID_AdmissionDetail());
		if(admDetail!=null&&admDetail.getMethodOfAdmission()!=null)
		{
			if(MethodOfAdmission.PLANNED.getID()==admDetail.getMethodOfAdmission().getId())
			{
				return true;
			}
		}
		return false;
	}

	//http://jira/browse/WDEV-23972 new method
	private boolean isIntendedDayCase( AdmissionDetailWithConsultantStaysForCodingVo admissionVo) 
	{
		if (admDetail==null)
			admDetail = (AdmissionDetail)domFactory.getDomainObject(AdmissionDetail.class, admissionVo.getID_AdmissionDetail());
		if(admDetail!=null&&admDetail.getAnticipatedStay()!=null&&Integer.valueOf(0).equals(admDetail.getAnticipatedStay()))
		{
			return true; // Day Case
		}
		return false; // Ordinary Admission
	}

	
	
	private boolean isDayCase( ConsultantStayForPatientCodingListVo fCEVo) 
	{
		
		if(fCEVo==null||fCEVo.getTransferDateTime()==null||fCEVo.getEndDateTime()==null)
			return false;
		
		Date startDate=fCEVo.getTransferDateTime().getJavaDate();
		Date endDate = fCEVo.getEndDateTime().getJavaDate();
		if (startDate == null || endDate == null)
			return false;  // Default
		
		ims.framework.utils.Date fromDt = new ims.framework.utils.Date(startDate);
		ims.framework.utils.Date toDt = new ims.framework.utils.Date(endDate);

		long numDays = ims.framework.utils.Date.daysBetween(fromDt, toDt);
		if (numDays == 0)
			return true;  // Day Case
		
		return false;  // Ordinary Admission
	}

/*
	Intended Management
	This is the intended pattern of Hospital Bed use for a PATIENT, decided when the decision is made to admit. This only applies to PATIENTS on the ELECTIVE ADMISSION LIST. It is not necessary to collect this information for maternity PATIENTS or for babies admitted to hospital shortly after birth.

	National Codes:
	1	PATIENT to stay in hospital for at least one night
	2	PATIENT not to stay in hospital overnight
	3	PATIENT to be admitted for a planned sequence of admissions each involving at least one overnight stay
	4	PATIENT to be admitted for a planned sequence of admissions which do not involve an overnight stay
	5	PATIENT to be admitted regularly for a planned sequence of nights who returns home for the remainder of the 24 hour period
	
*/
	private String getIntendedManagment(ConsultantStayForPatientCodingListVo fCEVo,AdmissionDetailWithConsultantStaysForCodingVo admissionVo)
	{
		if(isUnPlannedElective(admissionVo)&&isIntendedDayCase(admissionVo)) //http://jira/browse/WDEV-23972
		{
			return "2";
		}
		else if (isPlannedElective(admissionVo)&&isIntendedDayCase(admissionVo))//http://jira/browse/WDEV-23972
		{
			return "4";
		}
		else if(isPlannedElective(admissionVo))
		{
			return "3";
		}
		else if(isUnPlannedElective(admissionVo))
		{	
			return "1";
		}	
		else
		{	
			return "";
		}	
	}

	//End http://jira/browse/WDEV-23953	
	

	//WDEV-23787
	private String getTreatmentFunction(Integer iD_AdmissionDetail) 
	{
		if (admDetail==null)
			admDetail = (AdmissionDetail)domFactory.getDomainObject(AdmissionDetail.class, iD_AdmissionDetail);

		if (admDetail.getService()!=null && admDetail.getService().getTaxonomyMap()!=null)
		{
			List serviceTaxonomyMapColl = admDetail.getService().getTaxonomyMap();
			if(serviceTaxonomyMapColl != null && serviceTaxonomyMapColl.size() > 0)
			{
				for(int i=0; i<serviceTaxonomyMapColl.size(); i++)
				{
					NonUniqueTaxonomyMap doTavonomyMap = (NonUniqueTaxonomyMap)serviceTaxonomyMapColl.get(i);
					if(doTavonomyMap != null && doTavonomyMap.getTaxonomyName()!=null && doTavonomyMap.getTaxonomyName().getId()==(ims.core.vo.lookups.TaxonomyType.NAT_TREAT_CODE.getID()))
					{
						return doTavonomyMap.getTaxonomyCode();
					}				
				}				
			}

		}
		return null;
				
	}


	private String getDischargeType(Integer iD_AdmissionDetail) 
	{
		if (admDetail==null)
			admDetail = (AdmissionDetail)domFactory.getDomainObject(AdmissionDetail.class, iD_AdmissionDetail);

		//Discharge Type will go from admission-pasevent-carespell-discharge
		
		//Get CareContext from PasEvent
		List<?> dischargeDetList = getDomainFactory().find("from DischargedEpisode dis where dis.pasEvent.id = :pasEventId", new String[]{"pasEventId"}, new Object[]{admDetail.getPasEvent().getId()});
			
		if (dischargeDetList!=null && dischargeDetList.size()==1)
		{
			DischargedEpisode dischargeDet = (DischargedEpisode)dischargeDetList.get(0);
			if (dischargeDet!=null && dischargeDet.getMethodOfDischarge()!=null && dischargeDet.getMethodOfDischarge().getMappings()!=null)
				return dischargeDet.getMethodOfDischarge().getMapping(ims.core.vo.lookups.TaxonomyType.CDS.toString())!=null?dischargeDet.getMethodOfDischarge().getMapping(ims.core.vo.lookups.TaxonomyType.CDS.toString()).getExtCode():"";
		}
		
		return "";
	}


	private String getAdmissionType(Integer iD_AdmissionDetail) 
	{
		
		if (admDetail==null)
			admDetail = (AdmissionDetail)domFactory.getDomainObject(AdmissionDetail.class, iD_AdmissionDetail);
		
		if (admDetail.getMethodOfAdmission()!=null && admDetail.getMethodOfAdmission().equals(domFactory.getLookupInstance(MethodOfAdmission.EMERGENCY.getId())))
		{	
			//Return the SourceOfEmergencyReferral
			if (admDetail.getSourceOfEmergencyReferral()!=null && admDetail.getSourceOfEmergencyReferral().getMappings()!=null && admDetail.getSourceOfEmergencyReferral().getMapping(ims.core.vo.lookups.TaxonomyType.CDS.toString())!=null)
				return admDetail.getSourceOfEmergencyReferral().getMapping(ims.core.vo.lookups.TaxonomyType.CDS.toString())!=null?admDetail.getSourceOfEmergencyReferral().getMapping(ims.core.vo.lookups.TaxonomyType.CDS.toString()).getExtCode():"";
		}
		else if (admDetail.getMethodOfAdmission()!=null && admDetail.getMethodOfAdmission().getMappings()!=null && admDetail.getMethodOfAdmission().getMapping(ims.core.vo.lookups.TaxonomyType.CDS.toString())!=null)
		{				
			return admDetail.getMethodOfAdmission().getMapping(ims.core.vo.lookups.TaxonomyType.CDS.toString())!=null?admDetail.getMethodOfAdmission().getMapping(ims.core.vo.lookups.TaxonomyType.CDS.toString()).getExtCode():"";
		}
		
		return "";
	}
	//WDEV-23787


	private String getTime(int minute) 
	{
		return String.format("%02d",minute);
	}


	private String getHour(int hour) 
	{
		return String.format("%02d",hour);
	}


	private Object getLocationAddressPCT(int id) 
	{
		LocationFullVo locvo = LocationFullVoAssembler.create((Location)domFactory.getDomainObject(Location.class, id));
		return locvo.getAddressIsNotNull()?locvo.getAddress().getPCTIsNotNull()?locvo.getAddress().getPCT():"":"";
	}

	private StringBuffer exportRecord1(
			IAppUser iAppUser,
			CatsReferralRefVo referralVo,
			AdmissionDetailWithConsultantStaysForCodingVo admissionVo,			
			PatientShort patient, 
			Integer totalNumFCEs,
			Integer episodeOrder,
			Boolean lastEpisodeSpell) 
	{
		// Mandatory
 		// User Identifier - 7
		StringBuffer out = new StringBuffer();		
		out.append(iAppUser.getUsername()+iAppUser.getUserId())
		.append('|')
		
		// User Profile - 'M'
		.append("")
		.append('|')
		
		// Mandatory
		// Coding Identifier 5
		.append("S")
		.append('|')
		
		// Mandatory
		// Coding Method - 1
		.append("AN")
		.append('|');
		
		// Mandatory
		// Patient Number - 10
		//Start http://jira/browse/WDEV-23372
		PatientId identifier = getExternalCodingPatientNumber(patient.getIdentifiers(),PatIdType.getNegativeInstance(ims.configuration.gen.ConfigFlag.UI.DISPLAY_PATID_TYPE.getValue()));
		//WDEV-23495
		out.append((identifier!=null?identifier.getValue().replaceAll(" ", ""):""))
		//WDEV-23495
		//MNout.append(patient.getID_Patient().toString())
		//END http://jira/browse/WDEV-23372
		.append('|')
			
		// Mandatory
		// Full Name - 37
		.append(patient.getName().getSurname())
		.append(',')
		.append(patient.getName().getForename() + (patient.getName().getMiddleNameIsNotNull()?" " + patient.getName().getMiddleName():""))
		.append('|');		
		
		// Mandatory
		// Date Of Birth - 8
		SimpleDateFormat df = new SimpleDateFormat("ddMMyyyy");
		if (patient.getDobIsNotNull())	
		{ 
			out.append(df.format(fromPartialDate(patient.getDob())));			
		}
			
		out.append('|');
		
		// Mandatory
		// Gender - 1
		if (patient.getSexIsNotNull())
		{
			if (patient.getSex().equals(Sex.MALE))
					out.append("1");
			else if (patient.getSex().equals(Sex.FEMALE))
				out.append("2");
			else if (patient.getSex().equals(Sex.UNKNOWN))
				out.append("0");
			else
				out.append("9"); // Not Specified
		}
		else
			out.append("9"); // Not Specified
		
		out.append('|');	
		
		// Postcode - 8
		//get patient address postcode		
		out.append(patient.getAddressIsNotNull()?patient.getAddress().getPostCodeIsNotNull()?patient.getAddress().getPostCode():"":"")
		.append('|')
		
		// GP Code - 10
		.append(getExternalCodingGPCode(patient))
		.append('|')
		
		// Mandatory
		// Number of Episodes - 3		
		.append(totalNumFCEs.toString())
		.append('|');
		
		// NHS No. - 10
		PatientId patientIdentifier = getExternalCodingPatientNumber(admissionVo.getPasEvent().getPatient().getIdentifiers(),PatIdType.NHSN);
		out.append(patientIdentifier!=null?patientIdentifier.getValue():"")
		.append('|');
		
		//TODO review
		// NHS No. Status Indicator - 2		
		if (patientIdentifier!=null && patientIdentifier.getVerifiedIsNotNull())
			out.append(patientIdentifier.getVerified()?"01":"02");
		else
			out.append("02");		
		out.append('|');
				
		// Internal PAS - 20
		out.append(admissionVo.getPasEvent().getPatient().getID_Patient().toString())
		.append('|')
				
		//Previous Patient IDs - 99
		.append("");
		
		return out;		
	}

	private Date fromPartialDate(PartialDate dt)  
	{
		if (dt == null)
			return null;
		
		if (dt.isDate())
			return dt.toDate().getDate();
		else
		{
			StringBuffer retVal= new StringBuffer();
			if (dt.getYear() != null)
				retVal.append(dt.getYear());
			if (dt.getMonth() != null)
				retVal.append(dt.getMonth());
			else
				retVal.append("1");
			if (dt.getDay() != null)
				retVal.append(dt.getDay());
			else
				retVal.append("1");
			
			try 
			{
				return new ims.framework.utils.Date(retVal.toString(),DateFormat.ISO).getDate();
			} catch (ParseException e)
			{				
				LOG.error("MedicodeHelper: ParseException building Date from PartialDate - " + e.getMessage());
				if (getSessLogger()!=null)
					getSessLogger().error("MedicodeHelper: ParseException building Date from PartialDate - " + e.getMessage());
				throw new CodingRuntimeException("MedicodeHelper: ParseException building Date from PartialDate - " + e.getMessage());				
			}
		}
	}

	private Object getExternalCodingGPCode(PatientShort patient) 
	{
		if (!(patient!=null && patient.getID_PatientIsNotNull()))
			return "";
			
		DomainFactory factory = domFactory;
		// get GP Code based on patient surgery location
		Patient pt = (Patient)factory.getDomainObject(Patient.class, patient.getID_Patient());
		
		if (pt != null && pt.getGp() != null)
		{
			List lstcm = pt.getGp().getCodeMappings();
			if(lstcm != null && lstcm.size() > 0)
			{
				for(int i=0; i<lstcm.size(); i++)
				{
					TaxonomyMap doTavonomyMap = (TaxonomyMap)lstcm.get(i);
					if(doTavonomyMap != null && doTavonomyMap.getTaxonomyName()!=null && doTavonomyMap.getTaxonomyName().getId() == (ims.core.vo.lookups.TaxonomyType.NAT_GP_CODE.getID()))
					{
						return doTavonomyMap.getTaxonomyCode();
					}				
				}				
			}
			
		}
		
		return "";
	}

	private Object getExternalCodingConsCode(MemberOfStaffLiteVo mosVo) 
	{
		// get GP Code based on patient surgery location
		MemberOfStaff mos = (MemberOfStaff)domFactory.getDomainObject(MemberOfStaff.class, mosVo.getID_MemberOfStaff());
		
		if (mos != null)
		{
			List lstcm = mos.getCodeMappings();
			if(lstcm != null && lstcm.size() > 0)
			{
				for(int i=0; i<lstcm.size(); i++)
				{
					
					ims.core.clinical.domain.objects.TaxonomyMap doTavonomyMap = (ims.core.clinical.domain.objects.TaxonomyMap)lstcm.get(i);
					if(doTavonomyMap != null && doTavonomyMap.getTaxonomyCode() !=null && doTavonomyMap.getTaxonomyName().getId()==(ims.core.vo.lookups.TaxonomyType.NAT_CONS_CODE.getID()))
					{
						return doTavonomyMap.getTaxonomyCode();
					}				
				}				
			}
			
		}
		
		return "";
	}


	private PatientId getExternalCodingPatientNumber(
			PatientIdCollection identifiers, PatIdType patIdType) 
	{
		if (identifiers!=null && identifiers.size()>0)
		{
			for (PatientId item : identifiers)
			{
				if (item.getType().equals(patIdType))
					return item;
			}
		}
		
		return null;
	}


	private Object getlocationMapping(Integer id_Location) 
	{
		LocationFullVo locations = LocationFullVoAssembler.create((Location)domFactory.getDomainObject(Location.class, id_Location));
		
		if(locations == null)
			return "";
		TaxonomyMapCollection mappings = locations.getCodeMappings();
		if(mappings != null && mappings.size() > 0)
		{
			for(int i=0; i<mappings.size(); i++)
			{
				ims.core.vo.TaxonomyMap volocMap = mappings.get(i);
				if(volocMap != null && volocMap.getTaxonomyCode() != null && volocMap.getTaxonomyName() != null && volocMap.getTaxonomyName().getID() == TaxonomyType.NAT_LOC_CODE.getID())
				{					
					return volocMap.getTaxonomyCode();
				}
				
			}
				
		}
		return "";
		
		
	}


//	private String getMappingForCoding(CodingStatus codingStatus)
//	{
////		if(codingStatus == null)
////			return "";
////		LookupMappingVoCollection vocol = getMappings(codingStatus.getID());
////		if(vocol != null && vocol.size() > 0)
////		{
////			for(int i=0; i<vocol.size(); i++)
////			{
////				LookupMappingVo voSpec = vocol.get(i);
////				if(voSpec != null && voSpec.getExtSystem() != null && voSpec.getExtSystem().equals(ims.core.vo.lookups.TaxonomyType.CDS.toString()))
////				{
////					return voSpec.getExtCode();
////				}
////				
////			}
////				
////		}
////		return "";
//		
//		//code based on Medicode values instead
//		if (codingStatus == null)
//			return "";
//		else if (codingStatus.equals(Cod ingStatus.UNCODED))
//			return "0";
//		else if (codingStatus.equals(CodingStatus.CODED))
//			return "1";
//	}

	private CodingStatus getCodingStatus(String extCodingStatus)
	{
//		null
//		0 Codes assigned but incomplete
//		1 Codes assigned and complete
//		2 Codes assigned, complete and grouped.
//		3 Codes assigned, complete, grouped and dispatched.
//		4 Amendment to codes received pre/post dispatch.
		
//		Uncoded:            All FCEs under that admission have the status of "Uncoded".
//		In Progress:        Not all FCEs under that admission have the status of "Coded", but at least one FCE has the status of "Coded" or "In Progress" and there are no FCEs of status "For Review".
//		Coded:                 All FCEs under that admission have the status of "Coded"
//		For Review:        One or more previously coded FCEs under the admission has a status of "For Review" and a review of the coding is required.

		if(extCodingStatus==null || extCodingStatus == "")
			return CodingStatus.UNCODED;
		
		if (extCodingStatus.equalsIgnoreCase("0"))
			return CodingStatus.INPROGRESS;
		else if (extCodingStatus.equalsIgnoreCase("1"))
			return CodingStatus.CODED;
		else if (extCodingStatus.equalsIgnoreCase("2"))
			return CodingStatus.CODED;
		else if (extCodingStatus.equalsIgnoreCase("3"))
			return CodingStatus.CODED;
		else if (extCodingStatus.equalsIgnoreCase("4"))
			return CodingStatus.CODED;
			
		return null;
	}


	private String getMappingForSpecialty(LookupInstance specialty)
	{
		String strListLocalCodes = "";
		if(specialty == null)
			return strListLocalCodes;
		LookupMappingVoCollection vocol = getMappings(specialty.getId());
		if(vocol != null && vocol.size() > 0)
		{
			for(int i=0; i<vocol.size(); i++)
			{
				LookupMappingVo voSpec = vocol.get(i);
				if(voSpec != null && voSpec.getExtSystem() != null && voSpec.getExtSystem().equals(ims.core.vo.lookups.TaxonomyType.NAT_SPEC_CODE.toString()))
				{
					strListLocalCodes += voSpec.getExtCode();
					return strListLocalCodes;
				}
				
			}
				
		}
		return strListLocalCodes;
		
	}
	//http://jira/browse/WDEV-23906 part b National Treatment Function
	private String getMappingForTreatment(ServiceLiteVo serviceVo)
	{
		String strListLocalCodes = "";
		if(serviceVo == null||serviceVo.getBoId()==null)
		{
			return strListLocalCodes;
		}
		Service service = (Service)domFactory.getDomainObject(Service.class, serviceVo.getBoId());
		if(service!=null&&service.getTaxonomyMap()!=null)
		{
			for (Object element : service.getTaxonomyMap())
			{
				NonUniqueTaxonomyMap taxonomy = (NonUniqueTaxonomyMap)element;
				if(taxonomy.getTaxonomyName().getId()==TaxonomyType.NAT_TREAT_CODE.getId())
				{
					return taxonomy.getTaxonomyCode();
				}
			}
		}
		return strListLocalCodes;
	}
			

	private String getMappingForSpecialty(Specialty specialty)
	{
		String strListLocalCodes = "";
		if(specialty == null)
			return strListLocalCodes;
		LookupMappingVoCollection vocol = getMappings(specialty.getID());
		if(vocol != null && vocol.size() > 0)
		{
			for(int i=0; i<vocol.size(); i++)
			{
				LookupMappingVo voSpec = vocol.get(i);
				if(voSpec != null && voSpec.getExtSystem() != null && voSpec.getExtSystem().equals(ims.core.vo.lookups.TaxonomyType.NAT_SPEC_CODE.toString()))
				{
					strListLocalCodes += voSpec.getExtCode();
					return strListLocalCodes;
				}
				
			}
				
		}
		return strListLocalCodes;
		
	}
	
	private String getMappingForSourceOfAdmissionLookup(SourceOfAdmission sourceOfAdmission)
	{
		String strListLocalCodes = "";
		if(sourceOfAdmission == null)
			return strListLocalCodes;
		LookupMappingVoCollection vocol = getMappings(sourceOfAdmission.getID());
		if(vocol != null && vocol.size() > 0)
		{
			for(int i=0; i<vocol.size(); i++)
			{
				LookupMappingVo voSpec = vocol.get(i);
				//WDEV-23780
				if(voSpec != null && voSpec.getExtSystem() != null && voSpec.getExtSystem().equals(ims.core.vo.lookups.TaxonomyType.CDS.toString()))
				//WDEV-23780
				{
					strListLocalCodes += voSpec.getExtCode();
					return strListLocalCodes;
				}
				
			}
				
		}
		return strListLocalCodes;
		
	}
	
	private String getMappingForDischargeDestinationLookup(DischargeDestination dischargeDestination)
	{
		String strListLocalCodes = "";
		if(dischargeDestination == null)
			return strListLocalCodes;
		LookupMappingVoCollection vocol = getMappings(dischargeDestination.getID());
		if(vocol != null && vocol.size() > 0)
		{
			for(int i=0; i<vocol.size(); i++)
			{
				LookupMappingVo voSpec = vocol.get(i);
				//WDEV-23780
				if(voSpec != null && voSpec.getExtSystem() != null && voSpec.getExtSystem().equals(ims.core.vo.lookups.TaxonomyType.CDS.toString()))
				//WDEV-23780
				{
					strListLocalCodes += voSpec.getExtCode();
					return strListLocalCodes;
				}
				
			}
				
		}
		return strListLocalCodes;
		
	}

	public LookupMappingVoCollection getMappings(int instanceid)
	{
		ims.domain.lookups.LookupInstance doInst = domFactory.getLookupInstance(instanceid);
		if(doInst == null)
			return null;
		Set mappings = doInst.getMappings();
		LookupMappingVoCollection mapColl = new LookupMappingVoCollection();
		Iterator iter = mappings.iterator();
		LookupMapping doMapping;
		while (iter.hasNext())
		{
			doMapping = (LookupMapping) iter.next();
			mapColl.add(new LookupMappingVo(doMapping.getExtSystem(), doMapping.getExtCode()));
		}
		mapColl.sort();
		return mapColl;
	}
	
	public ReferralExternalCodingVo importCodingData(ReferralExternalCodingVo referralCodingRec,String codingIn) 
	{		
		
		if (referralCodingRec == null)
			referralCodingRec = new ReferralExternalCodingVo();
	
		// codingIn will have '|' field delimiter and '\n' record delimiter
		
		//Split records first
		String[] record = codingIn.split(record_delim);
		
		//WDEV-22442
		//check length
		if (record.length<1)
			return null;
		
	    if (LOG.isDebugEnabled())
	    {
		    LOG.debug("***********importRecord *******************");
		    LOG.debug("***********Coding Input: *******************");
	    }
	    if (getSessLogger() != null)
	    {
	    	getSessLogger().debug("***********importRecord *******************");
	    	getSessLogger().debug("***********Coding Input: *******************");
	    }
	    String[] list_strrr0 = record[0].split(record_delim);	    
	    String[] list_str = list_strrr0[0].split("\\|");
	    
	    LOG.debug("list_str : " + list_str.length);
	    if (getSessLogger() != null)
	    	getSessLogger().debug("list_str : " + list_str.length);
	    	    
    	//create new collection of coding items for each import
    	if (!referralCodingRec.getCodingItemsIsNotNull())
    		referralCodingRec.setCodingItems(new ReferralExternalCodingItemVoCollection());
    	else
    		referralCodingRec.getCodingItems().clear();

    	//keep history of input as separate collection
    	StageCodeExportVoCollection stagingExportImport = referralCodingRec.getStagingCodeExport();
    	if (stagingExportImport == null)
    		stagingExportImport = new StageCodeExportVoCollection();		    		
    	
    	StageCodeExportVo stageImport = new StageCodeExportVo();
    	//store data import
    	//WDEV-22421
    	stageImport.setDataImport(codingIn.substring(0, codingIn.length()>9999?9999:codingIn.length()));
    	stageImport.setImportDateTime(new DateTime());

    	if (referralCodingRec.getStagingCodeExportIsNotNull())
    		referralCodingRec.getStagingCodeExport().add(stageImport); //keeps history of imports for a specified referralcoding record.
    	else
    	{
    		//add
    		stagingExportImport.add(stageImport);
    		referralCodingRec.setStagingCodeExport(stagingExportImport);
    	}
    	
	    LOG.debug("***********Record 1*******************");
	    if (getSessLogger() != null)
	    	getSessLogger().debug("***********Record 1*******************");
	    
	    int i = 0; // 1 to 15
	    
	    if (list_str.length >0)
	    {
	       	referralCodingDataRecord1.put("UserIdentifier", list_str[0]);    
	    	LOG.debug("UserIdentifier :" + referralCodingDataRecord1.get("UserIdentifier"));
		    if (getSessLogger() != null)
		    	getSessLogger().debug("UserIdentifier :" + referralCodingDataRecord1.get("UserIdentifier"));
	    	
	    }	
	    if (list_str.length >1)
	    {
	    	referralCodingDataRecord1.put("UserProfile", list_str[1]);
	    	LOG.debug("UserProfile :" + referralCodingDataRecord1.get("UserProfile"));
		    if (getSessLogger() != null)
		    	getSessLogger().debug("UserProfile :" + referralCodingDataRecord1.get("UserProfile"));

	    }	
	    if (list_str.length >2)	    	
	    	referralCodingDataRecord1.put("CodingIdentifier", list_str[2]);
	    	LOG.debug("CodingIdentifier :" + referralCodingDataRecord1.get("CodingIdentifier"));
		    if (getSessLogger() != null)
		    	getSessLogger().debug("CodingIdentifier :" + referralCodingDataRecord1.get("CodingIdentifier"));

	    	
	    if (list_str.length >3)
	    {
	    	referralCodingDataRecord1.put("CodingMethod", list_str[3]);
	    	LOG.debug("CodingMethod :" + referralCodingDataRecord1.get("CodingMethod"));
		    if (getSessLogger() != null)
		    	getSessLogger().debug("CodingMethod :" + referralCodingDataRecord1.get("CodingMethod"));

	    }	
	    if (list_str.length >4)
	    {
	    	referralCodingDataRecord1.put("PatientNumber", list_str[4]);
	    	LOG.debug("PatientNumber :" + referralCodingDataRecord1.get("PatientNumber"));
		    if (getSessLogger() != null)
		    	getSessLogger().debug("PatientNumber :" + referralCodingDataRecord1.get("PatientNumber"));
		    
		    stageImport.setReceivedPatientId(referralCodingDataRecord1.get("PatientNumber"));
	    }
	    if (list_str.length >5)
	    {
	    	referralCodingDataRecord1.put("FullName", list_str[5]);
	    	LOG.debug("FullName :" + referralCodingDataRecord1.get("FullName"));
		    if (getSessLogger() != null)
		    	getSessLogger().debug("FullName :" + referralCodingDataRecord1.get("FullName"));

	    }
	    if (list_str.length >6)
	    {
	    	referralCodingDataRecord1.put("DateofBirth", list_str[6]);
	    	LOG.info("DateofBirth :" + referralCodingDataRecord1.get("DateofBirth"));
	    }	
	    if (list_str.length >7)
	    {
	    	referralCodingDataRecord1.put("Gender", list_str[7]);
	    	LOG.debug("Gender :" + referralCodingDataRecord1.get("Gender"));
		    if (getSessLogger() != null)
		    	getSessLogger().debug("Gender :" + referralCodingDataRecord1.get("Gender"));

	    }	
	    if (list_str.length >8)
	    {
	    	referralCodingDataRecord1.put("Postcode", list_str[8]);
	    	LOG.debug("Postcode :" + referralCodingDataRecord1.get("Postcode"));
		    if (getSessLogger() != null)
		    	getSessLogger().debug("Postcode :" + referralCodingDataRecord1.get("Postcode"));

	    }
	    if (list_str.length >9)
	    {
	    	referralCodingDataRecord1.put("GPCode", list_str[9]);
	    	LOG.debug("GPCode :" + referralCodingDataRecord1.get("GPCode"));
		    if (getSessLogger() != null)
		    	getSessLogger().debug("GPCode :" + referralCodingDataRecord1.get("GPCode"));

	    }
	    if (list_str.length >10)
	    {
	    	referralCodingDataRecord1.put("NumberOfEpisodes", list_str[10]);
	    	LOG.debug("NumberOfEpisodes :" + referralCodingDataRecord1.get("NumberOfEpisodes"));
		    if (getSessLogger() != null)
		    	getSessLogger().debug("NumberOfEpisodes :" + referralCodingDataRecord1.get("NumberOfEpisodes"));

	    }
	    if (list_str.length >11)
	    {
	    	referralCodingDataRecord1.put("NHSNo", list_str[11]);
	    	LOG.info("NHSNo :" + referralCodingDataRecord1.get("NHSNo"));
		    if (getSessLogger() != null)
		    	getSessLogger().debug("");

	    }
	    if (list_str.length >12)
	    {
	    	referralCodingDataRecord1.put("NHSNoStatusIndicator", list_str[12]);
	    	LOG.debug("NHSNoStatusIndicator :" + referralCodingDataRecord1.get("NHSNoStatusIndicator"));
		    if (getSessLogger() != null)
		    	getSessLogger().debug("NHSNoStatusIndicator :" + referralCodingDataRecord1.get("NHSNoStatusIndicator"));

	    }
	    if (list_str.length >13)
	    {
	    	referralCodingDataRecord1.put("InternalPAS", list_str[13]);
	    	LOG.debug("InternalPAS :" + referralCodingDataRecord1.get("InternalPAS"));
		    if (getSessLogger() != null)
		    	getSessLogger().debug("InternalPAS :" + referralCodingDataRecord1.get("InternalPAS"));

	    }
	    if (list_str.length >14)
	    {
	    	referralCodingDataRecord1.put("PreviousPreviousIDs :", list_str[14]);
	    	LOG.debug("PreviousPreviousIDs" + referralCodingDataRecord1.get("PreviousPreviousIDs"));
		    if (getSessLogger() != null)
		    	getSessLogger().debug("PreviousPreviousIDs" + referralCodingDataRecord1.get("PreviousPreviousIDs"));

	    }
	    
	    LOG.debug("***********Record 2******************* Pos 1 to 56 "); // Pos 1 to 56
	    if (getSessLogger() != null)
	    	getSessLogger().debug("***********Record 2******************* Pos 1 to 56 "); // Pos 1 to 56

	    if (record.length>=2)
	    {
	    	record[1].replaceAll("(\\r)","");
	    	record[1].trim();
	    	String[] list_strrr = record[1].split("\\r");
		    String[] list_str2 = list_strrr[0].split("\\|");
		    LOG.debug("list_str2 : " + list_str2.length);
		    if (getSessLogger() != null)
		    	getSessLogger().debug("list_str2 : " + list_str2.length);
		    
		    //Episode Number
		    if (list_str2.length >0)
		    	referralCodingDataRecord1.put("EpisodeNumber", list_str2[0]);
		    
	    	LOG.debug("EpisodeNumber :" + referralCodingDataRecord1.get("EpisodeNumber"));
		    if (getSessLogger() != null)
		    	getSessLogger().debug("EpisodeNumber :" + referralCodingDataRecord1.get("EpisodeNumber"));
		    
		    //CODING LEVEL INDICATOR		    
		    if (list_str2.length >16)
		    	referralCodingDataRecord1.put("CodingLevelIndicator", list_str2[17]);
		    
	    	LOG.debug("CodingLevelIndicator :" + referralCodingDataRecord1.get("CodingLevelIndicator"));
		    if (getSessLogger() != null)
		    	getSessLogger().debug("CodingLevelIndicator :" + referralCodingDataRecord1.get("CodingLevelIndicator"));		    
		    
			//populate referralCodingRec FCE Coding Status - FCE must be supplied by caller in the referralCodingRec
		    
		    stageImport.setCodingStatus(getCodingStatus(referralCodingDataRecord1.get("CodingLevelIndicator")));
		    
		    stageImport.setReceivedFCEId(referralCodingDataRecord1.get("EpisodeNumber"));
		    
		    if (referralCodingRec.getFCEIsNotNull())
		    	referralCodingRec.getFCE().setCodingStatus(getCodingStatus(referralCodingDataRecord1.get("CodingLevelIndicator")));

		    //Coders Notes
		    if (list_str2.length >20)
		    {
		    	referralCodingDataRecord1.put("CoderNotes", list_str2[21]);
		    	if (referralCodingRec.getFCEIsNotNull() && !referralCodingRec.getFCE().getCodingCommentIsNotNull())
		    		referralCodingRec.getFCE().setCodingComment(new CodingCommentVoCollection());
		    	
		    	//append new external comment always
	    		CodingCommentVo externalCOmment = new CodingCommentVo();
	    		//Date Coded Time Coded
	    		externalCOmment.setAuthoringDateTime(new DateTime());
	    		externalCOmment.setAuthoringMOS(referralCodingRec.getAuthoringMOS());
	    		externalCOmment.setCommentText(referralCodingDataRecord1.get("CoderNotes"));
	    		externalCOmment.setCodingType(CodingCommentType.EXTERNAL);
	    		if (referralCodingRec.getFCEIsNotNull())
	    			referralCodingRec.getFCE().getCodingComment().add(externalCOmment);
		    		
		    }
		    
		    //These are set from export and initial launch. No update.
		    //Date Coded
		    //Time Coded
		    	
		    //TODO change required for this field if needed in future requirement
		    //Group Type
		    if (list_str2.length >13)
		    	referralCodingDataRecord1.put("GroupType", list_str2[13]);	
		    
		    //Group Code 1		    
		    if (list_str2.length >=14)
		    {
		    	referralCodingDataRecord1.put("GroupCode1", list_str2[14]);		    	
				addHRG(referralCodingRec,referralCodingDataRecord1.get("GroupCode1"),referralCodingDataRecord1.get("GroupType"));			    				    	
		    }
		    
		    //Group Code 2
		    if (list_str2.length >=15)
		    {
		    	referralCodingDataRecord1.put("GroupCode2", list_str2[15]);
		    	addHRG(referralCodingRec,referralCodingDataRecord1.get("GroupCode2"),referralCodingDataRecord1.get("GroupType"));
		    }
		    
		    //Group Code 3
		    if (list_str2.length >=16)
		    {
		    	referralCodingDataRecord1.put("GroupCode3", list_str2[16]);
		    	addHRG(referralCodingRec,referralCodingDataRecord1.get("GroupCode3"),referralCodingDataRecord1.get("GroupType"));
		    }

		    //TODO HRG currently set to 5 chars for each item so will take just that for now.
		    //Group Code 1 Unbundled - HRG v4
		    //This field may contain more than one HRG v4 code and will therefore be separated by using a ^ for example
		    
		    if (list_str2.length >=28)
		    {
		    	referralCodingDataRecord1.put("GroupCode1Unbundled", list_str2[28]);

	    		if (referralCodingRec.getFCEIsNotNull())
	    		{
	    			String grp1code = referralCodingDataRecord1.get("GroupCode1Unbundled");
	    			if (grp1code.indexOf('^')>0)
	    				processMultipleGroup1Codes(referralCodingRec,grp1code);
	    			else
	    			{
	    				addHRG(referralCodingRec,grp1code,"V4");	    				
	    			}
	    		}    				
    		}
		    
		    		    
	    }
	    else
	    {
	    	LOG.error("Medicode: record.length not as expected >=2 : " + record.length);
		    if (getSessLogger() != null)
		    	getSessLogger().error("Medicode: record.length not as expected >=2 : " + record.length);
		    throw new CodingRuntimeException("Medicode: record.length not as expected >=2 : " + record.length);
	    }
	    
	    
	    LOG.info("***********Record 3 - repeats ******************* Pos 1 to 56 "); // Pos 1 to 56
	    if (record.length>=3)
	    {	
	    	String[] list_strrr3 = record[2].split("\\r");
		    String[] list_str3 = list_strrr3[0].split("\\|");
		    LOG.debug("list_str3 : " + list_str3.length);
		    if (getSessLogger() != null)
		    	getSessLogger().debug("list_str3 : " + list_str3.length);
		    
		    if (list_str3.length > 0)
		    {
		    	//Number of Diagnoses
		    	Integer numberOfDiags = null;
		    	try{
		    		numberOfDiags = new Integer(list_str3[0]);
		    	}
		    	catch (NumberFormatException ne)
		    	{
		    		LOG.error("Medicode: Record 3 - invalid number of diagnosis");
				    if (getSessLogger() != null)
				    	getSessLogger().error("Medicode: Record 3 - invalid number of diagnosis");
				    throw new CodingRuntimeException("Medicode: Record 3 - invalid number of diagnosis");
		    	}
		    	
			    //check length of record and number of procedures specified
		    	if (numberOfDiags *4 == list_str3.length -1)
		    	{
		    		LOG.debug("Record 3 - validation - Number of records match specified field [1] : " + numberOfDiags);
				    if (getSessLogger() != null)
				    	getSessLogger().debug("Record 3 - validation - Number of records match specified field [1] : " + numberOfDiags);
		    	}
		    	else
		    	{
		    		LOG.debug("Record 3 - validation - Number of records do not match specified field [1] : " + numberOfDiags);
				    if (getSessLogger() != null)
				    	getSessLogger().debug("Record 3 - validation - Number of records do not match specified field [1] : " + numberOfDiags);
		    	}
		    	
		    	StageCodeExportVo stageCodeExportvo = null;
		    	int stageCodeExportIndex = -1;
		    	//populate the received collection into the last exported - should always have a StagingCodeExport record;
		    	if (referralCodingRec.getStagingCodeExportIsNotNull())
		    	{
		    		stageCodeExportIndex = referralCodingRec.getStagingCodeExport().size()-1;
		    		stageCodeExportvo = referralCodingRec.getStagingCodeExport().get(stageCodeExportIndex);
		    	}
		    	else
		    	{
		    		//for testing create a new one
		    		stageCodeExportvo = new StageCodeExportVo();
		    	}
    	
		    			    	
		    	int base = 1;
		    	int iDiagProcessed = 0;
		    	LOG.debug("Processing - Coded Diagnosis");
			    if (getSessLogger() != null)
			    	getSessLogger().debug("Processing - Coded Diagnosis");

		    	for (int iDiagRecIdx = 1; iDiagRecIdx <= numberOfDiags;iDiagRecIdx++)
		    	{
		    		
		    		ReferralExternalCodingItemVo diagCodingItem = new ReferralExternalCodingItemVo();
		    		ReferralCodingItemVo recievedItem = new ReferralCodingItemVo();
		    		
		    		//TODO Review - Do we need to check the coding type indicator is icd10?		    		
		    		
		    		//Diagnosis Code n
	    			diagCodingItem.setICD10(list_str3[base]);
	    			recievedItem.setICD10(list_str3[base]);
		    				    		

		    		//Dagger Asterisk indicator n
	    			diagCodingItem.setDaggerAsterisk(list_str3[base+1]);
	    			recievedItem.setDaggerAsterisk(list_str3[base+1]);
		    		
		    		//Coding Type Indicator n
	    			diagCodingItem.setCodingTypeIndicator(list_str3[base+2]);
	    			recievedItem.setCodingTypeIndicator(list_str3[base+2]);
	    			
		    		//"1st in set" Indicator n
	    			diagCodingItem.setFirstInSet(list_str3[base+3]);
	    			recievedItem.setFirstInSet(list_str3[base+3]);
		    		
		    		//add to collection
		    		referralCodingRec.getCodingItems().add(diagCodingItem);
		    		if (stageCodeExportvo.getReceivedCodingItemsIsNotNull())
		    			stageCodeExportvo.getReceivedCodingItems().add(recievedItem);
		    		else
		    		{
		    			ReferralCodingItemVoCollection recCol = new ReferralCodingItemVoCollection();
		    			recCol.add(recievedItem);
		    			stageCodeExportvo.setReceivedCodingItems(recCol);
		    		}		    			
		    		
	    			base+=4;
	    			iDiagProcessed++;

		    	}
		    	
		    	stageCodeExportvo.setExportDateTime(new DateTime());
		    	
		    	LOG.debug("Record 3 - validation - Number of records processed : " + iDiagProcessed);
			    if (getSessLogger() != null)
			    	getSessLogger().debug("Record 3 - validation - Number of records processed : " + iDiagProcessed);
		    	
		    	if (referralCodingRec.getStagingCodeExportIsNotNull())
		    		referralCodingRec.getStagingCodeExport().set(stageCodeExportIndex,stageCodeExportvo);
		    	else
		    	{
		    		StageCodeExportVoCollection stagingCodeExpColl = new StageCodeExportVoCollection();
		    		stagingCodeExpColl.add(stageCodeExportvo);
		    		referralCodingRec.setStagingCodeExport(stagingCodeExpColl); //for testing
		    	}

		    }
		    else
		    {
		    	LOG.debug("list_str3 : " + list_str3.length + "< 3");
			    if (getSessLogger() != null)
			    	getSessLogger().debug("list_str3 : " + list_str3.length + "< 3");
		    }
	    }
	    else
	    {
	    	LOG.error("Medicode: record.length not as expected >=3 : " + record.length);
		    if (getSessLogger() != null)
		    	getSessLogger().error("Medicode: record.length not as expected >=3 : " + record.length);
		    throw new CodingRuntimeException("Medicode: record.length not as expected >=3 : " + record.length);
	    }


	    LOG.info("***********Record 4 - repeats ******************* Pos 1 to 56 "); // Pos 1 to 56
	    if (record.length>=4)
	    {	    	
	    	String[] list_strrr4 = record[3].split("\\r");
		    String[] list_str4 = list_strrr4[0].split("\\|");
		    
		    LOG.debug("list_str4 : " + list_str4.length);
		    if (getSessLogger() != null)
		    	getSessLogger().debug("list_str4 : " + list_str4.length);
		    
		    if (list_str4.length > 0)
		    {
		    	//Number of Procedures
		    	Integer numberOfProcs = null;
			    try
			    {
			    	numberOfProcs = new Integer(list_str4[0]);
		    	}
		    	catch (NumberFormatException ne)
		    	{
		    		LOG.error("Medicode: Record 3 - invalid number of procedures");
				    if (getSessLogger() != null)
				    	getSessLogger().error("Medicode: Record 3 - invalid number of procedures");
				    throw new CodingRuntimeException("Medicode: Record 3 - invalid number of procedures");		    		
		    	}
		    			    	
			    //check length of record and number of procedures specified
		    	if (numberOfProcs *6 == list_str4.length -1)
		    	{
		    		LOG.debug("Record 4 - validation - Number of records match specified field [1] : " + numberOfProcs);
				    if (getSessLogger() != null)
				    	getSessLogger().debug("Record 4 - validation - Number of records match specified field [1] : " + numberOfProcs);		    		
		    	}
		    	else
		    	{
		    		LOG.debug("Record 4 - validation - Number of records do not match specified field [1] : " + numberOfProcs);
				    if (getSessLogger() != null)
				    	getSessLogger().debug("Record 4 - validation - Number of records do not match specified field [1] : " + numberOfProcs);
		    	}
		    			    	
		    	StageCodeExportVo stageCodeExportvo = null;
		    	int stageCodeExportIndex = -1;
		    	//populate the received collection into the last exported - should always have a StagingCodeExport record;
		    	if (referralCodingRec.getStagingCodeExportIsNotNull())
		    	{
		    		stageCodeExportIndex = referralCodingRec.getStagingCodeExport().size()-1;
		    		stageCodeExportvo = referralCodingRec.getStagingCodeExport().get(stageCodeExportIndex);
		    	}
		    	else
		    	{
		    		//for testing create a new one
		    		stageCodeExportvo = new StageCodeExportVo();
		    	}
		    	
		    	//stageImport.set
		    	int base = 1;
		    	int iProcProcessed=0;
		    	LOG.debug("Processing - Coded Procedures");
			    if (getSessLogger() != null)
			    	getSessLogger().debug("Processing - Coded Procedures");
			    
		    	for (int iProcRecIdx = 1; iProcRecIdx <= numberOfProcs;iProcRecIdx++)
		    	{
		    		
		    		ReferralExternalCodingItemVo diagCodingItem = new ReferralExternalCodingItemVo();
		    		ReferralCodingItemVo recievedItem = new ReferralCodingItemVo();
		    		
		    		//TODO Review - Do we need to check the coding type indicator is icd10?
		    		
		    		//Procedure Code n
		    		diagCodingItem.setOPCS4(list_str4[base]);
		    		recievedItem.setOPCS4(list_str4[base]);
		    				 
		    		//Primary Secondary ind n
	    			diagCodingItem.setPrimarySecondaryInd(list_str4[base+1]);
	    			recievedItem.setPrimarySecondaryInd(list_str4[base+1]);
		    		
		    		//Coding Type Indicator n
	    			diagCodingItem.setCodingTypeIndicator(list_str4[base+2]);
	    			recievedItem.setCodingTypeIndicator(list_str4[base+2]);
		    		
		    		//Procedure Consultant and Theatre code n
	    			diagCodingItem.setProcConsandTheatreCode(list_str4[base+3]);
	    			recievedItem.setProcConsandTheatreCode(list_str4[base+3]);
		    		
		    		//Procedure Date "–" Time n
	    			diagCodingItem.setProcedureDateTime(list_str4[base+4]);
	    			recievedItem.setProcedureDateTime(list_str4[base+4]);
		    				    		
		    		//"1st in set" Indicator n
	    			diagCodingItem.setFirstInSet(list_str4[base+5]);
	    			recievedItem.setFirstInSet(list_str4[base+5]);
		    		
		    		//add to collection
	    			referralCodingRec.getCodingItems().add(diagCodingItem);		    		
		    		if (stageCodeExportvo.getReceivedCodingItemsIsNotNull())
		    			stageCodeExportvo.getReceivedCodingItems().add(recievedItem);
		    		else
		    		{
		    			ReferralCodingItemVoCollection recCol = new ReferralCodingItemVoCollection();
		    			recCol.add(recievedItem);		    			
		    			stageCodeExportvo.setReceivedCodingItems(recCol);		    			
		    		}
		    		
		    		iProcProcessed++;
		    		
	    			base+=6;
		    				    		
		    	}	
		    	
		    	stageCodeExportvo.setExportDateTime(new DateTime());

		    	LOG.debug("Record 4 - validation - Number of records processed : " + iProcProcessed);
			    if (getSessLogger() != null)
			    	getSessLogger().debug("Record 4 - validation - Number of records processed : " + iProcProcessed);
		    	
		    }
		    else
		    {
		    	LOG.debug("list_str4 : " + list_str4.length + "< 4");
			    if (getSessLogger() != null)
			    	getSessLogger().debug("list_str4 : " + list_str4.length + "< 4");
		    }
	    }
	    else
	    {
	    	LOG.error("Medicode: record.length not as expected >=4 : " + record.length);
		    if (getSessLogger() != null)
		    	getSessLogger().error("Medicode: record.length not as expected >=4 : " + record.length);
		    throw new CodingRuntimeException("Medicode: record.length not as expected >=4 : " + record.length);
	    }
	    
	    return referralCodingRec;    
	}


	private void addHRG(ReferralExternalCodingVo referralCodingRec, String hrg, String hrgType) 
	{
		if (hrg.equals(""))
			return;
		
		ReferralExternalCodingItemVo HRGCodingItem = new ReferralExternalCodingItemVo();
		ReferralCodingItemVo recievedItem = new ReferralCodingItemVo();
		
		HRGCodingItem.setHRG(hrg);
		HRGCodingItem.setHRGType(hrgType);
		recievedItem.setHRG(hrg);
		//TODO next release.
		//recievedItem.setHRGType(hrgType);
		
		StageCodeExportVo stageCodeExportvo = null;
		int stageCodeExportIndex = -1;
		//populate the received collection into the last exported - should always have a StagingCodeExport record;
		if (referralCodingRec.getStagingCodeExportIsNotNull())
		{
			stageCodeExportIndex = referralCodingRec.getStagingCodeExport().size()-1;
			stageCodeExportvo = referralCodingRec.getStagingCodeExport().get(stageCodeExportIndex);
		}
		else
		{
			//for testing create a new one
			stageCodeExportvo = new StageCodeExportVo();
		}
		
		//add to collection
		referralCodingRec.getCodingItems().add(HRGCodingItem);
		
		//add to received items
		if (stageCodeExportvo.getReceivedCodingItemsIsNotNull())
			stageCodeExportvo.getReceivedCodingItems().add(recievedItem);
		else
		{
			ReferralCodingItemVoCollection recCol = new ReferralCodingItemVoCollection();
			recCol.add(recievedItem);
			stageCodeExportvo.setReceivedCodingItems(recCol);
		}
		
		if (referralCodingRec.getStagingCodeExportIsNotNull())
			referralCodingRec.getStagingCodeExport().set(stageCodeExportIndex,stageCodeExportvo);
		else
		{
			StageCodeExportVoCollection stagingCodeExpColl = new StageCodeExportVoCollection();
			stagingCodeExpColl.add(stageCodeExportvo);
			referralCodingRec.setStagingCodeExport(stagingCodeExpColl); //for testing
		}
	}
	
	private void processMultipleGroup1Codes(
			ReferralExternalCodingVo referralCodingRec, String grp1codeList) 
	{
		
		grp1codeList.trim();
    	String[] list_strrr = grp1codeList.split("\\^");
	    LOG.debug("list_strrr - HRG items : " + list_strrr.length);
	    if (getSessLogger() != null)
	    	getSessLogger().debug("list_strrr - HRG items :" + list_strrr.length);

    	StageCodeExportVo stageCodeExportvo = null;
    	int stageCodeExportIndex = -1;
    	//populate the received collection into the last exported - should always have a StagingCodeExport record;
    	if (referralCodingRec.getStagingCodeExportIsNotNull())
    	{
    		stageCodeExportIndex = referralCodingRec.getStagingCodeExport().size()-1;
    		stageCodeExportvo = referralCodingRec.getStagingCodeExport().get(stageCodeExportIndex);
    	}
    	else
    	{
    		//for testing create a new one
    		stageCodeExportvo = new StageCodeExportVo();
    	}
    	
	    for (String grp1code: list_strrr)
	    {
	    	addHRG(referralCodingRec,grp1code,"V4");
	    }

	}


	//used for testing
	public void readTestFile(String Filename)
	{
		try {
		
			FileInputStream fin;
				fin = new FileInputStream(Filename);
		    int ch;
		    StringBuffer strContent = new StringBuffer("");
		    
		    while( (ch = fin.read()) != -1)
	        strContent.append((char)ch);
		    
		    this.file_content = strContent.toString();
		    
		    fin.close();
		} catch (FileNotFoundException e) {
		    if (getSessLogger() != null)
		    	getSessLogger().error("Medicode: " + e.getMessage());
		    throw new CodingRuntimeException(e.getMessage());
		} catch (IOException e) {
		    if (getSessLogger() != null)
		    	getSessLogger().error("Medicode: " + e.getMessage());
		    throw new CodingRuntimeException(e.getMessage());
		}
	    
	}
		
	public String getContent()
	{
		return file_content;
	}

	public void setContent(String strContent)
	{
		file_content = strContent;
	}
	
	public void writeTestFile(String Filename) 
	{
		Writer writer = null;

		try {
		    writer = new BufferedWriter(new OutputStreamWriter(
		          new FileOutputStream(Filename), "utf-8"));
		    writer.write(file_content);
		} catch (IOException ex) {
		  // report
		} finally {
		   try {writer.close();} catch (Exception ex) {
			   
			    if (getSessLogger() != null)
			    	getSessLogger().error("Medicode: " + ex.getMessage());
			    throw new CodingRuntimeException(ex.getMessage());			   
		   }
		}
		
	}
}

