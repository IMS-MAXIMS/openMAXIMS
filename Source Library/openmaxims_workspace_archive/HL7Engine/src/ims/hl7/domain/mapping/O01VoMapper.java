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
package ims.hl7.domain.mapping;

import ims.admin.vo.ConfigPropertyVo;
import ims.assessment.helper.UserAssessmentInstHelper;
import ims.configuration.gen.ConfigFlag;
import ims.configuration.ConfigItems;
import ims.core.patient.vo.PatientRefVo;
import ims.core.vo.ClinicLiteVo;
import ims.core.vo.CommChannelVo;
import ims.core.vo.GeneralQuestionAnswerVo;
import ims.core.vo.GeneralQuestionAnswerVoCollection;
import ims.core.vo.Hcp;
import ims.core.vo.LocShortMappingsVo;
import ims.core.vo.MedicVo;
import ims.core.vo.PatientShort;
import ims.core.vo.ServiceShortVo;
import ims.core.vo.TaxonomyMap;
import ims.core.vo.lookups.ChannelType;
import ims.core.vo.lookups.LocationType;
import ims.framework.utils.DateTime;
import ims.hl7.domain.HL7EngineApplication;
import ims.hl7.utils.EvnCodes;
import ims.hl7.utils.HL7Utils;
import ims.ocrr.orderingresults.vo.OcsOrderSessionRefVo;
import ims.ocrr.vo.ProviderSystemVo;
import ims.ocrr.vo.lookups.Category;
import ims.ocrr.vo.lookups.InvEventType;
import ims.ocrr.vo.lookups.ResultStatus;
import ims.ocrr.vo.lookups.ResultValueType;
import ims.ocrr.vo.lookups.SpecimenActionCode;
import ims.ocrr.vo.lookups.SpecimenType;
import ims.ocs_if.helper.IHL7Helper;
import ims.ocs_if.vo.IfInvestigationLiteVo;
import ims.ocs_if.vo.IfOrdSpecLiteVo;
import ims.ocs_if.vo.IfOrderInvestigationVo;
import ims.ocs_if.vo.IfOrderMessageVo;
import ims.ocs_if.vo.IfOutOcsOrderVo;
import ims.scheduling.vo.ExternalEventVo;
import ims.scheduling.vo.lookups.ExternalSystemEventTypes;
import java.text.DecimalFormat;
import org.apache.log4j.Logger;



import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.datatype.FT;
import ca.uhn.hl7v2.model.v24.datatype.PL;
import ca.uhn.hl7v2.model.v24.datatype.SPS;
import ca.uhn.hl7v2.model.v24.message.ORM_O01;
import ca.uhn.hl7v2.model.v24.segment.NTE;
import ca.uhn.hl7v2.model.v24.segment.OBR;
import ca.uhn.hl7v2.model.v24.segment.OBX;
import ca.uhn.hl7v2.model.v24.segment.ORC;
import ca.uhn.hl7v2.model.v24.segment.PID;
import ca.uhn.hl7v2.model.v24.segment.PV1;

public class O01VoMapper extends VoMapper
{
	private static final Logger			LOG		= Logger.getLogger(O01VoMapper.class);
	
	/**
	 * processMessage
	 * <p> ORM^O01 message may be received from GPs.  If this is the case, and placerId will be null
	 * and we need to check for the existence of the specimen.  If not found, we will create the order
	 * and set wasProcessed to true so that it won't be picked up by our outbound app. </p>
	 */
	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	{
		R01VoMapper r01mapper = (R01VoMapper) HL7EngineApplication.getVoMapper(EvnCodes.R01);
		if (r01mapper == null)
		{
			throw new HL7Exception("O02 mapper requires R01 mapper. R01 mapper not found in list of registerd mappers.");			
		}
		return r01mapper.processEvent(msg, providerSystem);
	}
	
	public Message populateMessage(IfOrderMessageVo msgVo, IfOutOcsOrderVo newOrder) throws Exception
	{
		LOG.debug("O01VoMapper populateMessage: entry");
		if (msgVo == null || newOrder == null||msgVo.getProviderSystem()==null||msgVo.getProviderSystem().getCodeSystem()==null)
			throw new Exception("Invalid parameters supplied to populateMessage!");
		
		ORM_O01 order=null;
		
		if (msgVo.getOrderCategoryIsNotNull() && msgVo.getOrderCategory().equals(Category.CLINICALIMAGING)
				||(msgVo.getInvestigationsIsNotNull()&&msgVo.getInvestigations().size()>0&&msgVo.getInvestigations().get(0).getInvestigation().getEventType().equals(InvEventType.TIME_SERIES)))
		{
			order = populateNonSpecimenOrder(msgVo, newOrder);
		}
		else if (msgVo.getOrderCategoryIsNotNull() && msgVo.getOrderCategory().equals(Category.PATHOLOGY))
		{
			order = populatePathologyOrder(msgVo, newOrder);
		}
		if (order == null)
			throw new Exception("Order message is null, an error has occurred");
		
		// Setup Message Header Details
		populateMSH(msgVo.getProviderSystem(), order.getMSH(),getMessageControlIDFromOrderMessageVo( msgVo),"ORM","O01");
		
		//Only Clinical Imaging and can be scheduled passed over to CARE UK code
		//MN WDEV-7711 changed newOrder.getInvestigations().get(0) to msgVo.getInvestigations().get(0) for RAD investigations 
		//there should only be 1 investigation per message 
		if((msgVo.getOrderCategoryIsNotNull() && msgVo.getOrderCategory().equals(Category.CLINICALIMAGING))
				&&  ocsIf.getService(msgVo.getInvestigations()
						.get(0).getInvestigation()).getCanBeScheduled().booleanValue() )
		{
			//ims.RefMan.helper.IHL7Helper RefManHelper= new ims.RefMan.helper.RefManHL7Helper();
			IHL7Helper RefManHelper=(IHL7Helper)getDomainImpl("ims.RefMan.helper.RefManHL7Helper");
			order = RefManHelper.PopulateOrderMessage(order,msgVo,msgVo.getInvestigations().get(0),RefMandomain);
		}
		LOG.debug("O01VoMapper populateMessage: exit");		
		
		return order;
	}
	
	private String getMessageControlIDFromOrderMessageVo(IfOrderMessageVo msgVo)
	{
		return msgVo.getPlacerOrdNum() + (msgVo.getOrderCategory().getId() * -1);
	}

	private ORM_O01 populateNonSpecimenOrder(IfOrderMessageVo msgVo, IfOutOcsOrderVo newOrder) throws Exception
	{
		LOG.debug("O01VoMapper populateSpecimenFreeOrder: entry");
		// No investigations = no order
		if (!newOrder.getInvestigationsIsNotNull())
			throw new Exception("No Investigations found for this order");
		
		ORM_O01 order = new ORM_O01();
		renderPIDPV1(newOrder, order, msgVo.getProviderSystem());
		
		//JME: 20060915: Isoft require this be sent in PV1.2 to indicate patient category (NHS, Private etc.)
		if (newOrder.getOrderCategory() != null)
		{
			String patientOrderCategory = svc.getRemoteLookup(newOrder.getOrderCategory().getId(), msgVo.getProviderSystem().getCodeSystem().getText());
			if (patientOrderCategory != null )
			{
				PV1 pv = order.getORM_O01_PIDPD1NTEPV1PV2IN1IN2IN3GT1AL1().getORM_O01_PV1PV2().getPV1();			
				//PV1 pv = order.getPATIENT().getPATIENT_VISIT().getPV1();
				//pv.getPatientClass().setValue(patientOrderCategory);
				pv.getFinancialClass(0).getFinancialClass().setValue(patientOrderCategory);  // WDEV-3649 OrderCategory will be moved to PV1-2 within ICAN
			}
		}
		
		// There will only be one investigation per order for Radiology
		//ORC commonOrder = order.getORDER(0).getORC();
		//OBR obr = order.getORDER(0).getORDER_DETAIL().getOBR();
		ORC commonOrder = order.getORM_O01_ORCOBRRQDRQ1RXOODSODTNTECTDDG1OBXNTEFT1CTIBLG(0).getORC();
		OBR obr = order.getORM_O01_ORCOBRRQDRQ1RXOODSODTNTECTDDG1OBXNTEFT1CTIBLG(0).getORM_O01_OBRRQDRQ1RXOODSODTNTECTDDG1OBXNTE().getOBR();
		
		String QALineBreaks = HL7Utils.getConfigItem(toConfigItemArray(msgVo.getProviderSystem().getConfigItems()), ConfigItems.UseLineBreakBetweenQAs);
		boolean lineBreaks = QALineBreaks != null && (QALineBreaks.equalsIgnoreCase("TRUE") || QALineBreaks.equalsIgnoreCase("YES"))?true:false;

		String separateNTEsConfig = HL7Utils.getConfigItem(toConfigItemArray(msgVo.getProviderSystem().getConfigItems()), ConfigItems.ClinicalImagingSeparateNTEs);
		boolean separateNTEs = separateNTEsConfig != null && (separateNTEsConfig.equalsIgnoreCase("TRUE") || separateNTEsConfig.equalsIgnoreCase("YES"))?true:false;

		
		
		String useOBXs = HL7Utils.getConfigItem(toConfigItemArray(msgVo.getProviderSystem().getConfigItems()), ConfigItems.SendQAsAsOBXs);
		if ((useOBXs != null && (useOBXs.equalsIgnoreCase("TRUE") || useOBXs.equalsIgnoreCase("YES")))
				||separateNTEs)
		{
			populateNonSpecimenClinicalDetailsSeparateSegments(msgVo.getInvestigations().get(0),msgVo.getProviderSystem(), newOrder, order,separateNTEs);
		}

		String addtNotes;
		String nteNotes;

		String alertText = getAlertsText(newOrder.getPatient(),msgVo.getProviderSystem());
		
		if(alertText==null)
		{
			alertText="";
		}
		addtNotes=alertText;
		nteNotes=alertText;
		addtNotes += UserAssessmentInstHelper.getTextualQuestionAndAnswers(ocsIf.getRadiologyQuestions(msgVo.getInvestigations().get(0)), true, true,false);
		nteNotes += UserAssessmentInstHelper.getTextualQuestionAndAnswers(ocsIf.getRadiologyQuestions(msgVo.getInvestigations().get(0)), true, true,lineBreaks);
		if (newOrder.getAdditClinNotesIsNotNull())
		{
			addtNotes += "\r" + newOrder.getAdditClinNotes();
			nteNotes += "\r" + newOrder.getAdditClinNotes();
		}
		if(newOrder.getSummaryClinicalInformationIsNotNull())
		{
			addtNotes += "\r"+ newOrder.getSummaryClinicalInformation();
			nteNotes += "\r"+ newOrder.getSummaryClinicalInformation();
			
		}
		if(msgVo.getInvestigations().get(0).getReorderReasonIsNotNull()&&!"".equals(msgVo.getInvestigations().get(0).getReorderReason()))
		{
			addtNotes += "\r"+"Reason for Re-Order: "+msgVo.getInvestigations().get(0).getReorderReason();
			nteNotes += "\r"+"Reason for Re-Order: "+msgVo.getInvestigations().get(0).getReorderReason();
		}
		if (nteNotes != null && nteNotes.length() > 0
				&&!separateNTEs)
		{
			NTE nte = order.getORM_O01_ORCOBRRQDRQ1RXOODSODTNTECTDDG1OBXNTEFT1CTIBLG(0).getORM_O01_OBRRQDRQ1RXOODSODTNTECTDDG1OBXNTE().getNTE();
			//NTE nte = order.getORDER(0).getORDER_DETAIL().getNTE();
			// wdev-3315 Q&A to be include in the NTE segment
			renderNTE(nte, nteNotes);
		}
		if (addtNotes != null && addtNotes.length() > 0)
		{
			// OBR-13   Relevant clinical information 
			obr.getRelevantClinicalInfo().setValue(HL7Utils.toHL7Text(addtNotes));
		}
		
		
		renderOrder(msgVo.getInvestigations().get(0), msgVo, newOrder, commonOrder, obr, 0);
		LOG.debug("O01VoMapper populateSpecimenFreeOrder: exit");
		return order;
	}

	/**
	 * @param msgVo
	 * @param newOrder
	 * @param order
	 * @throws HL7Exception
	 * @throws DataTypeException
	 */
	private void populateNonSpecimenClinicalDetailsSeparateSegments(IfOrderInvestigationVo inv,ProviderSystemVo providerSystem,
			 IfOutOcsOrderVo newOrder, ORM_O01 order,boolean useNTE)
			throws HL7Exception, DataTypeException {
		GeneralQuestionAnswerVoCollection radiologyQuestions = ocsIf.getRadiologyQuestions(inv);
		if ((radiologyQuestions!=null&&radiologyQuestions.size()>0)
				||newOrder.getAdditClinNotesIsNotNull()
				||newOrder.getSummaryClinicalInformationIsNotNull())
		{
			int i=0;
			String FT = svc.getRemoteLookup(ResultValueType.FT.getId(), providerSystem.getCodeSystem().getText());
			String orderDetail= svc.getRemoteLookup(ResultStatus.ORDERDETAIL.getId(), providerSystem.getCodeSystem().getText());
			if(!useNTE)
			{	
				i++;
				renderOBX(getNextOBX(order, i), i, "Relevant clinical information : ", FT, orderDetail); // Only needed for OBXs
			}

			String alertText = getAlertsText(newOrder.getPatient(),providerSystem);
			if (alertText!=null&&!alertText.equals(""))
			{
				i++;
				if(useNTE)
					renderNTE(getNextNTE(order, i), alertText,i);
				else
					renderOBX(getNextOBX(order, i), i, alertText, FT, orderDetail);
			}
			
			for (GeneralQuestionAnswerVo qAVo : radiologyQuestions)
			{
				String answers = UserAssessmentInstHelper.getAnswersAsText(qAVo);
				if(answers!=null)
				{
					i++;
					if(useNTE)
						renderNTE(getNextNTE(order, i),qAVo.getQuestion().getShortText()+": "+ answers, i);
					else
						renderOBX(getNextOBX(order, i), i, answers, FT, orderDetail,qAVo.getQuestion().getShortText());
				}
			}
			
			if (newOrder.getAdditClinNotesIsNotNull())
			{
				i++;
				if(useNTE)
					renderNTE(getNextNTE(order, i), newOrder.getAdditClinNotes(),i);
				else
					renderOBX(getNextOBX(order, i), i, newOrder.getAdditClinNotes(), FT, orderDetail);
			}
			if(newOrder.getSummaryClinicalInformationIsNotNull())
			{
				i++;
				if(useNTE)
					renderNTE(getNextNTE(order, i),newOrder.getSummaryClinicalInformation(),i);
				else
					renderOBX(getNextOBX(order, i),i,newOrder.getSummaryClinicalInformation(),FT,orderDetail);
			}
			if(inv.getReorderReasonIsNotNull()&&!"".equals(inv.getReorderReason()))
			{
				i++;
				if(useNTE)
					renderNTE(getNextNTE(order, i),"Reason for Re-Order: "+inv.getReorderReason(),i);
				else
					renderOBX(getNextOBX(order, i),i,"Reason for Re-Order: "+inv.getReorderReason(),FT,orderDetail);
			}
		}
	}
	
	private OBX getNextOBX(ORM_O01 order,int i) throws HL7Exception
	{
		return order.getORM_O01_ORCOBRRQDRQ1RXOODSODTNTECTDDG1OBXNTEFT1CTIBLG(0).getORM_O01_OBRRQDRQ1RXOODSODTNTECTDDG1OBXNTE().getORM_O01_OBXNTE(i-1).getOBX();
	}

	private NTE getNextNTE(ORM_O01 order,int i) throws HL7Exception
	{
		return order.getORM_O01_ORCOBRRQDRQ1RXOODSODTNTECTDDG1OBXNTEFT1CTIBLG(0).getORM_O01_OBRRQDRQ1RXOODSODTNTECTDDG1OBXNTE().getORM_O01_OBXNTE(i-1).getNTE();
	}

	
	
	private void renderOBX(OBX obx,int ID,String text,String type,String orderDetail) throws HL7Exception
	{
		renderOBX( obx, ID, text, type, orderDetail,null);
	}
	
	private void renderOBX(OBX obx,int ID,String text,String type,String orderDetail,String identifierText) throws HL7Exception
	{
		obx.getSetIDOBX().setValue(Integer.toString(ID));
		obx.getValueType().setValue(type);
		if(identifierText==null)
		{
			obx.getObservationIdentifier().getIdentifier().setValue(Hl7Null);
		}
		else
		{
			obx.getObservationIdentifier().getText().setValue(HL7Utils.toHL7Text(identifierText));
		}
		obx.getObservationValue(0).setData(new FT(HL7Utils.toHL7Text(text)));
		obx.getObservationResultStatus().setValue(orderDetail);
	}

	
	private String getAlertsText(PatientRefVo patient,ProviderSystemVo provider )
	{
	String [] alerts = demog.listPatientAlertsTextByTaxonomy(patient, true, provider.getCodeSystem());
	if (alerts==null||alerts.length==0)
	{
		return null;
	}
	String alertText = "Patient has alert(s): ";
	for (int i=0;i<alerts.length;i++)
	{
		if(i<(alerts.length-1))
		{
			alertText+=(alerts[i]+", ");
		}
		else
		{
			alertText+=(alerts[i]+"\r");
		}
	}
	return alertText;
	}

	
	private void renderNTE(NTE nte, String additClinNotes) throws HL7Exception
	{
		renderNTE(nte,  additClinNotes,null);
	}

	private void renderNTE(NTE nte, String additClinNotes,Integer ID) throws HL7Exception
	{
		//	NTE-1  Set ID
		if(ID==null)
		{
			nte.getSetIDNTE().setValue("1"); // Always only 1
		}
		else
		{
			nte.getSetIDNTE().setValue(ID.toString());
		}
		
		
		//	NTE-2  Source of comment
		nte.getSourceOfComment().setValue("P");  // Placer of the order
		
		// NTE-3  Comment
		nte.getComment(0).setValue(HL7Utils.toHL7Text(additClinNotes));		
		
		// NTE-4  Comment type
		nte.getCommentType().getText().setValue("R"); // General Remark
	}
	

	private void renderPIDPV1(IfOutOcsOrderVo newOrder, ORM_O01 order, ProviderSystemVo providerSystem) throws Exception
	{
		LOG.debug("O01VoMapper renderPIDPV1: entry");
		
		PID pid = order.getORM_O01_PIDPD1NTEPV1PV2IN1IN2IN3GT1AL1().getPID();
		PV1 pv = order.getORM_O01_PIDPD1NTEPV1PV2IN1IN2IN3GT1AL1().getORM_O01_PV1PV2().getPV1();
		
		//PID pid = order.getPATIENT().getPID();
		//PV1 pv = order.getPATIENT().getPATIENT_VISIT().getPV1();
		
		String pASIDPrefix=null;
		
		if(ConfigFlag.DOM.CREATE_ORDERS_WITH_CARECONTEXT_ONLY.getValue())
		{
			
			if (newOrder.getCareContextPas()!=null)
			{
				if (newOrder.getCareContextPas().getPasEvent()!=null)
				{
					if (newOrder.getCareContextPas().getPasEvent().getPasEpisodeId()!=null)
					{
						pv.getAlternateVisitID().getID().setValue(newOrder.getCareContextPas().getPasEvent().getPasEpisodeId());
					}
				}
				if(ConfigFlag.GEN.USE_ORDERING_HOSPITAL_LOCATION.getValue()&& newOrder.getOrderingHospitalIsNotNull()&&newOrder.getOrderingHospital().getBoId()!=null)
				{	
					LocShortMappingsVo orderingHospVo=orgLoc.getLocation(newOrder.getOrderingHospital().getBoId());
					pASIDPrefix = orderingHospVo.getTaxonomyMap(providerSystem.getCodeSystem()).getTaxonomyCode();
				} else
				{
					LOG.warn("NULL Value used with USE ORDERING HOSPITAL LOCATION");
				}
				
			}
		}
		PatientShort patShort = demog.getPatientShort(newOrder.getPatient());
		if(ConfigFlag.GEN.USE_ORDERING_HOSPITAL_LOCATION.getValue())
		{
			renderPatientShortVoToPID(patShort,pASIDPrefix, pid, providerSystem);
		}
		else
		{
			renderPatientShortVoToPID(patShort,pid, providerSystem);
		}
		
		
		//http://jira/browse/WDEV-6910
		ConfigPropertyVo prop= providerSystem.getConfigurationProperty(ConfigItems.UseGpAsOrderingProvider);
		if (prop != null && (prop.getPropertyValueIsNotNull())&&(prop.getPropertyValue().length() > 0)
				&&prop.getPropertyValue().trim().equalsIgnoreCase("TRUE"))
		{
			if(newOrder.getResponsibleGpIsNotNull())
			{
				renderGpShortVoToXCN(newOrder.getResponsibleGp(),pv.getReferringDoctor(0),providerSystem);
			}
			
		}
		if (newOrder.getResponsibleClinicianIsNotNull())
		{
			renderMemberOfStaffShortVoToXCN(newOrder.getResponsibleClinician().getMos(), pv.getConsultingDoctor(0),providerSystem);
			
			// wdev-2047 If the clinician has a specialty, render that to PV1-10 for Radiology only
			if (providerSystem.getCategoryIsNotNull() && providerSystem.getCategory().equals(Category.CLINICALIMAGING))
			{
				// This call is necessary to get the full Medic Details
				Hcp medicHcp = hcpAdmin.getHcp(newOrder.getResponsibleClinician());
				if (medicHcp instanceof MedicVo)
				{
					MedicVo med = (MedicVo) medicHcp;
					if (med.getSpecialtyIsNotNull())
					{
						pv.getHospitalService().setValue(svc.getRemoteLookup(med.getSpecialty().getId(), providerSystem.getCodeSystem().getText()));
					}
				}
			}
		}
	
		renderPatientLocationToPV1(newOrder.getPatientLocation(), newOrder.getPatientClinic(),newOrder.getOutpatientDept(), pv,providerSystem);
		 
		//JME: 20061103: WDEV-2502
		if (newOrder.getOrderCategory() != null)
		{
			String patientOrderCategory = svc.getRemoteLookup(newOrder.getOrderCategory().getId(), providerSystem.getCodeSystem().getText());
			if (patientOrderCategory != null )
			{
				// WDEV-12841 - Default location for order category is PatientType field unless specified otherwise by this flag.
				if (ConfigFlag.HL7.ORDER_CATEGORY_HL7_FIELD.getValue() != null && ConfigFlag.HL7.ORDER_CATEGORY_HL7_FIELD.getValue().equals("PV1-20"))
					pv.getFinancialClass(0).getFinancialClass().setValue(patientOrderCategory);  
				else
					pv.getPatientType().setValue(patientOrderCategory);	//JME: 20061103: WDEV-2171
				
			}
		}
		
		LOG.debug("O01VoMapper renderPIDPV1: exit");
	}

	private ORM_O01 populatePathologyOrder(IfOrderMessageVo msgVo, IfOutOcsOrderVo newOrder) throws Exception
	{
		LOG.debug("O01VoMapper populatePathologyOrder: entry");

		// No specimens = no order
		if (!newOrder.getSpecimensIsNotNull())
			throw new Exception("No Specimens found for this order");
		
		ORM_O01 order = new ORM_O01();
		renderPIDPV1(newOrder, order, msgVo.getProviderSystem());
		
		StringBuffer nteContents = new StringBuffer();
		String useOBXs = HL7Utils.getConfigItem(toConfigItemArray(msgVo.getProviderSystem().getConfigItems()), ConfigItems.SendQAsAsOBXs);
		
		String removeDuplicates = HL7Utils.getConfigItem(toConfigItemArray(msgVo.getProviderSystem().getConfigItems()), ConfigItems.NTERemoveDuplicateQAs);
		
		
		String QALineBreaks = HL7Utils.getConfigItem(toConfigItemArray(msgVo.getProviderSystem().getConfigItems()), ConfigItems.UseLineBreakBetweenQAs);
		boolean lineBreaks = QALineBreaks != null && (QALineBreaks.equalsIgnoreCase("TRUE") || QALineBreaks.equalsIgnoreCase("YES"))?true:false;
		

		Boolean includeShared=true;
		
		// There will only be one specimen per order for Pathology
		for (int i=0; i<msgVo.getInvestigations().size(); i++)
		{
			IfOrderInvestigationVo investigation = msgVo.getInvestigations().get(i);
			IfOrdSpecLiteVo specimen = investigation.getSpecimen().get(0);
			// Ensure that this specimen is ready
			if ((newOrder.getSendNumberIsNotNull()&&newOrder.getSendNumber())|| specimen.getCollDateTimePlacerIsNotNull() || (specimen.getIsPatientCollectIsNotNull() && specimen.getIsPatientCollect().booleanValue()))
			{
				ORC orc = order.getORM_O01_ORCOBRRQDRQ1RXOODSODTNTECTDDG1OBXNTEFT1CTIBLG(i).getORC();
				OBR obr = order.getORM_O01_ORCOBRRQDRQ1RXOODSODTNTECTDDG1OBXNTEFT1CTIBLG(i).getORM_O01_OBRRQDRQ1RXOODSODTNTECTDDG1OBXNTE().getOBR();

				//ORC orc = order.getORDER(i).getORC();
				//OBR obr = order.getORDER(i).getORDER_DETAIL().getOBR();
				
				if (useOBXs != null && (useOBXs.equalsIgnoreCase("TRUE") || useOBXs.equalsIgnoreCase("YES")))
				{
					GeneralQuestionAnswerVoCollection questions = ocsIf.getPathologyQuestions(specimen, investigation,true);
					if ((questions!=null&&questions.size()>0)||newOrder.getAdditClinNotesIsNotNull())
					{
						int k=0;
						String FT = svc.getRemoteLookup(ResultValueType.FT.getId(), msgVo.getProviderSystem().getCodeSystem().getText());
						String orderDetail= svc.getRemoteLookup(ResultStatus.ORDERDETAIL.getId(), msgVo.getProviderSystem().getCodeSystem().getText());
						for (GeneralQuestionAnswerVo qAVo : questions)
						{
							k++;
							OBX qaobx = order.getORM_O01_ORCOBRRQDRQ1RXOODSODTNTECTDDG1OBXNTEFT1CTIBLG(i).getORM_O01_OBRRQDRQ1RXOODSODTNTECTDDG1OBXNTE().getORM_O01_OBXNTE(k-1).getOBX();
							qaobx.getSetIDOBX().setValue(Integer.toString(k));
							qaobx.getValueType().setValue(FT); //FT Required
							qaobx.getObservationIdentifier().getText().setValue(HL7Utils.toHL7Text(qAVo.getQuestion().getShortText()));
							qaobx.getObservationValue(0).setData(new FT(HL7Utils.toHL7Text(UserAssessmentInstHelper.getAnswersAsText(qAVo))));
							qaobx.getObservationResultStatus().setValue(orderDetail);
						}
						
						if (newOrder.getAdditClinNotesIsNotNull())
						{
							k++;
							OBX addInfoObx = order.getORM_O01_ORCOBRRQDRQ1RXOODSODTNTECTDDG1OBXNTEFT1CTIBLG(i).getORM_O01_OBRRQDRQ1RXOODSODTNTECTDDG1OBXNTE().getORM_O01_OBXNTE(k-1).getOBX();
							addInfoObx.getSetIDOBX().setValue(Integer.toString(k));
							addInfoObx.getValueType().setValue(FT); //FT Required
							addInfoObx.getObservationIdentifier().getIdentifier().setValue(Hl7Null);
							addInfoObx.getObservationValue(0).setData(new FT(HL7Utils.toHL7Text(newOrder.getAdditClinNotes())));
							addInfoObx.getObservationResultStatus().setValue(orderDetail);
						}
						if (newOrder.getSummaryClinicalInformationIsNotNull())
						{
							k++;
							OBX addInfoObx = order.getORM_O01_ORCOBRRQDRQ1RXOODSODTNTECTDDG1OBXNTEFT1CTIBLG(i).getORM_O01_OBRRQDRQ1RXOODSODTNTECTDDG1OBXNTE().getORM_O01_OBXNTE(k-1).getOBX();
							addInfoObx.getSetIDOBX().setValue(Integer.toString(k));
							addInfoObx.getValueType().setValue(FT); //FT Required
							addInfoObx.getObservationIdentifier().getIdentifier().setValue(Hl7Null);
							addInfoObx.getObservationValue(0).setData(new FT(HL7Utils.toHL7Text(newOrder.getSummaryClinicalInformation())));
							addInfoObx.getObservationResultStatus().setValue(orderDetail);
						}

					}
	
				}
				else 
				{

					// OBR-13   Relevant clinical information
					// Get the questions relevant to this specimen
					
					String addtNotes;
					String nteNotes;
					String alertText = getAlertsText(newOrder.getPatient(),msgVo.getProviderSystem());
					if(alertText==null)
					{
						alertText="";
					}
					addtNotes=alertText;
					nteNotes=alertText;
					
					addtNotes += UserAssessmentInstHelper.getTextualQuestionAndAnswers(ocsIf.getPathologyQuestions(specimen, investigation,true), true, true,false);
					nteNotes += UserAssessmentInstHelper.getTextualQuestionAndAnswers(ocsIf.getPathologyQuestions(specimen, investigation,includeShared), true, true,lineBreaks);
					
					if (removeDuplicates != null && (removeDuplicates.equalsIgnoreCase("TRUE") || removeDuplicates.equalsIgnoreCase("YES")))
					{
						includeShared=false;
					}
//					String addtNotes = UserAssessmentInstHelper.getTextualQuestionAndAnswers(ocsIf.getPathologyQuestions(specimen, investigation), true, true);
		
					// Additional info only in NTE segment as otherwise it will only have info relevant to first investigation
					// wdev-3315  Hold a StringBuffer of what is required for the NTE segment to be rendered following all investigations

					if(investigation.getReorderReasonIsNotNull()&&!"".equals(investigation.getReorderReason()))
					{
						String invName=null;
						if(investigation!=null
								&&investigation.getInvestigation()!=null
								&&investigation.getInvestigation().getInvestigationIndex()!=null
								&&investigation.getInvestigation().getInvestigationIndex().getName()!=null)
						{
							invName=investigation.getInvestigation().getInvestigationIndex().getName();
						}
						addtNotes += "\r"+(invName!=null?invName:"") +" Reason for Re-Order: "+investigation.getReorderReason();
						nteNotes += "\r"+(invName!=null?invName:"") +" Reason for Re-Order: "+investigation.getReorderReason();
					}

					if (nteNotes != null)
						nteContents.append(nteNotes).append("\r");
	
					if (newOrder.getAdditClinNotesIsNotNull())
					{
						addtNotes += "\r" + newOrder.getAdditClinNotes();
					}
					if(newOrder.getSummaryClinicalInformationIsNotNull())
					{
						addtNotes += "\r" + newOrder.getSummaryClinicalInformation();
					}
					
					
					obr.getRelevantClinicalInfo().setValue(HL7Utils.toHL7Text(addtNotes));
				}
				renderOrder(investigation, msgVo, newOrder, orc, obr, i);
			
				renderSpecimenToOBR(specimen, obr,msgVo.getProviderSystem());
			}
		}
		
		if (!(useOBXs != null && (useOBXs.equalsIgnoreCase("TRUE") || useOBXs.equalsIgnoreCase("YES"))))// NOT using OBXs
		{
			// wdev-3315
			NTE nte = order.getORM_O01_ORCOBRRQDRQ1RXOODSODTNTECTDDG1OBXNTEFT1CTIBLG(0).getORM_O01_OBRRQDRQ1RXOODSODTNTECTDDG1OBXNTE().getNTE();
			//NTE nte = order.getORDER(0).getORDER_DETAIL().getNTE();
			if (newOrder.getAdditClinNotesIsNotNull())
				nteContents.append(newOrder.getAdditClinNotes());
			if(newOrder.getSummaryClinicalInformationIsNotNull())
			{
				if(nteContents.length()>0)
					nteContents.append("\r");
				nteContents.append(newOrder.getSummaryClinicalInformation());
			}
			renderNTE(nte, nteContents.toString());
		}
		LOG.debug("O01VoMapper populatePathologyOrder: exit");

		return order;
	}

	private void renderOrder(IfOrderInvestigationVo investigation, IfOrderMessageVo msgVo, IfOutOcsOrderVo newOrder, ORC orc, OBR obr, int id) throws Exception
	{
		LOG.debug("O01VoMapper renderOrder: entry");

		// OBR-1   Set ID – OBR   (SI)
		obr.getSetIDOBR().setValue(String.valueOf(id+1));

		// OBR-2   Placer order number   (EI)   00216
		obr.getPlacerOrderNumber().getEntityIdentifier().setValue(msgVo.getPlacerOrdNum());
		
		// OBR-3 Filler Order Number
		if (msgVo.getFillerNumberIsNotNull())
		{
			obr.getFillerOrderNumber().getEntityIdentifier().setValue(msgVo.getFillerNumber());
		}

		renderInvestigationToORC_OBR(investigation, orc, obr,msgVo.getProviderSystem());
		renderMsgVoToORC(msgVo, orc);
		renderNewOrderToORC_OBR(msgVo.getProviderSystem(),newOrder, orc, obr);
		
		if (orc.getDateTimeOfTransaction().getTimeOfAnEvent().getValue() == null)
			renderDateTimeVoToTS(new DateTime(), orc.getDateTimeOfTransaction());
		
		if(investigation.getInvestigationIsNotNull()
				&&investigation.getInvestigation().getEventType().equals(InvEventType.TIME_SERIES)
				&&investigation.getInvestigation().getPathInvDetailsIsNotNull()
				&&investigation.getInvestigation().getPathInvDetails().getSpecimens().size()>0
				&&investigation.getInvestigation().getPathInvDetails().getSpecimens().get(0).getTypeIsNotNull())
		{
			SpecimenType type = investigation.getInvestigation().getPathInvDetails().getSpecimens().get(0).getType();
			
			SPS sps = obr.getSpecimenSource();
			sps.getSpecimenSourceNameOrCode().getIdentifier().setValue(svc.getRemoteLookup(type.getId(), msgVo.getProviderSystem().getCodeSystem().getText()));
			sps.getSpecimenSourceNameOrCode().getText().setValue(type.getText());

		}
		LOG.debug("O01VoMapper renderOrder: exit");

	}

		
	private void renderNewOrderToORC_OBR(ProviderSystemVo providerSystem,IfOutOcsOrderVo newOrder, ORC commonOrder, OBR obr) throws Exception
	{
		LOG.debug("O01VoMapper renderNewOrderToORC_OBR: entry");

		// ORC-4   Placer group number   (EI)   00218
		commonOrder.getPlacerGroupNumber().getEntityIdentifier().setValue("" + newOrder.getID_OcsOrderSession());
		
		if (newOrder.getOrderedByIsNotNull())
		{
			// ORC-10   Entered by   (XCN)   00224
			renderMemberOfStaffShortVoToXCN(newOrder.getOrderedBy(), commonOrder.getEnteredBy(0),providerSystem);

			// ORC-13   Enterer’s location   (PL)   00227 
			if (newOrder.getOrderedBy().getPrimaryLocationIsNotNull())
			{
				commonOrder.getEntererSLocation().getLocationDescription().setValue(newOrder.getOrderedBy().getPrimaryLocation().getName());
			}
			
			if (newOrder.getOrderedBy().getCommChannelsIsNotNull())
			{
				// ORC-14   Call back phone number   (XTN)   00228
				renderCommChannelVoCollectionToXTN(newOrder.getOrderedBy().getCommChannels(), commonOrder.getCallBackPhoneNumber(0));
			}
		}
		
		// OBR-16   Ordering provider  (XCN)   
		// ORC-12   Ordering provider   (XCN)   00226
		
		
		//http://jira/browse/WDEV-6910
		ConfigPropertyVo prop= providerSystem.getConfigurationProperty(ConfigItems.UseGpAsOrderingProvider);
		if (prop != null && (prop.getPropertyValueIsNotNull())&&(prop.getPropertyValue().length() > 0)
				&&prop.getPropertyValue().trim().equalsIgnoreCase("TRUE"))
		{
			if(newOrder.getResponsibleGpIsNotNull())
			{
				renderGpShortVoToXCN(newOrder.getResponsibleGp(), commonOrder.getOrderingProvider(0),providerSystem);
				renderGpShortVoToXCN(newOrder.getResponsibleGp(), obr.getOrderingProvider(0),providerSystem);
			}
		}
		
		else if (newOrder.getResponsibleClinicianIsNotNull())
		{
			renderMemberOfStaffShortVoToXCN(newOrder.getResponsibleClinician().getMos(), commonOrder.getOrderingProvider(0),providerSystem);
			renderMemberOfStaffShortVoToXCN(newOrder.getResponsibleClinician().getMos(), obr.getOrderingProvider(0),providerSystem);
			// OBR-17   Order callback phone number 
			
			if (!ConfigFlag.GEN.SITE_USES_ORDER_BLEEP_EXT_NUMBER.getValue()
					&& newOrder.getResponsibleClinician().getMosIsNotNull())
				renderCommChannelVoToXTN(newOrder.getResponsibleClinician().getMos().getCommChannel(ChannelType.BLEEP), obr.getOrderCallbackPhoneNumber(0));
		}

		if(ConfigFlag.GEN.SITE_USES_ORDER_BLEEP_EXT_NUMBER.getValue()&&newOrder.getBleepExtNumberIsNotNull())
		{
			CommChannelVo bleepVo = new CommChannelVo();
			bleepVo.setCommValue(newOrder.getBleepExtNumber());
			bleepVo.setChannelType(ChannelType.BLEEP);
			renderCommChannelVoToXTN(bleepVo, obr.getOrderCallbackPhoneNumber(0));
		}
			
			
		// OBR-28   Result copies to   
		if (newOrder.getReportToIsNotNull())
		{
			for (int i=0; i<newOrder.getReportTo().size(); i++)
			{
				obr.getResultCopiesTo(i).getFamilyName().getSurname().setValue(newOrder.getReportTo().get(i).getValue());
			}
		}
		
		// OBR-30   Transportation mode
		if (newOrder.getPatMobilityIsNotNull())
		{
			obr.getTransportationMode().setValue(svc.getRemoteLookup(newOrder.getPatMobility().getId(), providerSystem.getCodeSystem().getText()));
		}
		
		LOG.debug("O01VoMapper renderNewOrderToORC_OBR: exit");

	}

	private void renderMsgVoToORC(IfOrderMessageVo msgVo, ORC commonOrder) throws HL7Exception
	{
		LOG.debug("O01VoMapper renderMsgVoToORC: entry");

		// ORC-1 Order Control (First New Order)
		
		if(msgVo.getOrderDetailsIsNotNull()&& msgVo.getOrderDetails().getSendNumberIsNotNull()
				&&Boolean.TRUE.equals(msgVo.getOrderDetails().getSendNumber()))
		{
			commonOrder.getOrderControl().setValue("NA"); 
		}
		else
		{
			commonOrder.getOrderControl().setValue("NW"); 
		}
		
		
		// ORC-2   Placer order number   (EI)   00216
		commonOrder.getPlacerOrderNumber().getEntityIdentifier().setValue(msgVo.getPlacerOrdNum());
		if (msgVo.getFillerNumberIsNotNull())
		{
			commonOrder.getFillerOrderNumber().getEntityIdentifier().setValue(msgVo.getFillerNumber());
		}
	
		// ORC-6   Response flag   (ID)   00220
		// Possible values..
		//		E	Report exceptions only
		//		R	Same as E, also Replacement and Parent-Child
		//		D	Same as R, also other associated segments
		//		F	Same as D, plus confirmations explicitly
		//		N	Only the MSA segment is returned
		commonOrder.getResponseFlag().setValue("D");  // Default Value 
		LOG.debug("O01VoMapper renderMsgVoToORC: exit");

	}

	private void renderInvestigationToORC_OBR(IfOrderInvestigationVo investigation, ORC commonOrder, OBR obr,ProviderSystemVo providerSystem) throws Exception
	{
		LOG.debug("O01VoMapper renderInvestigationToORC_OBR: entry");

		IfInvestigationLiteVo invVo = investigation.getInvestigation();

		// ORC-5   Order status   (ID)   00219
		if (investigation.getOrdInvCurrentStatusIsNotNull() && investigation.getOrdInvCurrentStatus().getOrdInvStatusIsNotNull())
			commonOrder.getOrderStatus().setValue(svc.getRemoteLookup(investigation.getOrdInvCurrentStatus().getOrdInvStatus().getId(), providerSystem.getCodeSystem().getText()));
	
		// ORC-9   Date/time of transaction   (TS)   00223
		//TODO: Not sure if this should override the sysinfo values.
		//The assembler would ignore them anyway.
		//WDEV-8866
		if (investigation.getDisplayDateTimeIsNotNull())
			renderDateTimeVoToTS(investigation.getDisplayDateTime(), commonOrder.getDateTimeOfTransaction());
		else 
			renderDateTimeVoToTS(new DateTime(), commonOrder.getDateTimeOfTransaction());
		
		// ORC-24   Ordering provider address   (XAD)   01314
		//TODO: Will leave out for now. 
//		if (invVo.getProviderServiceIsNotNull() && invVo.getProviderService().getLocationServiceIsNotNull() && invVo.getProviderService().getLocationService().getLocationIsNotNull())
//			renderAddressVoToXAD(invVo.getProviderService().getLocationService().getLocation().getAddress(), commonOrder.getOrderingProviderAddress(0));

		// OBR-4   Universal service identifier   (CE)   00238
		// Test Name
		obr.getUniversalServiceIdentifier().getIdentifier().setValue(invVo.getProviderInvCode());
		obr.getUniversalServiceIdentifier().getText().setValue(invVo.getInvestigationIndex().getName());
		// Coding System
//		if (invVo.getProviderServiceIsNotNull() && invVo.getProviderService().getProviderSystemIsNotNull() && invVo.getProviderService().getProviderSystem().getCodeSystemIsNotNull())
//			obr.getUniversalServiceIdentifier().getNameOfCodingSystem().setValue(invVo.getProviderService().getProviderSystem().getCodeSystem().getText());

		// OBR-5   Priority - OBR
		// ORC-7   Quantity/timing   
		// OBR-27   Quantity/timing   
		if (investigation.getOrderPriorityIsNotNull())
		{
			String extPriority = svc.getRemoteLookup(investigation.getOrderPriority().getId(), providerSystem.getCodeSystem().getText()); 
			commonOrder.getQuantityTiming(0).getPriority().setValue(extPriority);
			obr.getPriority().setValue(extPriority);
			obr.getQuantityTiming(0).getPriority().setValue(extPriority);
		}
		
		// OBR-31   Reason for study
		if (investigation.getReasonForStudyIsNotNull())
			obr.getReasonForStudy(0).getText().setValue(investigation.getReasonForStudy());
		
		// JP 10/11/2006 WDEV-2110
		ServiceShortVo service = ocsIf.getService(investigation.getInvestigation());
		String extMapping = ocsIf.getServiceMapping(service,providerSystem.getCodeSystem());
		obr.getDiagnosticServSectID().setValue(extMapping);
		
		
		// ORC-7   Quantity/timing   
		// OBR-27   Quantity/timing
		// wdev-2559 Moved from renderOrder method, examination required by is now at investigation level
		renderDateVoToTS(investigation.getExamReqOnAfterDate(), obr.getQuantityTiming(0).getStartDateTime());
		renderDateVoToTS(investigation.getExamReqOnAfterDate(), commonOrder.getQuantityTiming(0).getStartDateTime());
		
		LOG.debug("O01VoMapper renderInvestigationToORC_OBR: exit");

	}
	
	private void renderSpecimenToOBR(IfOrdSpecLiteVo specimen, OBR obr,ProviderSystemVo providerSystem) throws Exception
	{
		LOG.debug("O01VoMapper renderSpecimenToOBR: entry");

		// OBR-7   Observation date/time   (TS)   00241
		renderDateTimeVoToTS(specimen.getCollDateTimePlacer(), obr.getObservationDateTime());
		
		// OBR-8   Observation end date/time   (TS)   
		renderDateTimeVoToTS(specimen.getCollEndDateTimePlacer(), obr.getObservationEndDateTime());
		
		// OBR-11   Specimen action code 
		obr.getSpecimenActionCode().setValue(svc.getRemoteLookup(SpecimenActionCode.O.getId(), providerSystem.getCodeSystem().getText()));
		
		// OBR-15 Specimen source   (CM)
		// This is build up of siteCd, siteText and the SpecimenSource lookup
		SPS sps = obr.getSpecimenSource();
		if (specimen.getSpecimenSourceIsNotNull())
		{
			sps.getSpecimenSourceNameOrCode().getIdentifier().setValue(svc.getRemoteLookup(specimen.getSpecimenSource().getId(), providerSystem.getCodeSystem().getText()));
			sps.getSpecimenSourceNameOrCode().getText().setValue(specimen.getSpecimenSource().getText());
		}
		
		//Leaving open the option for certain disciplines to use coded site field.
		if (specimen.getSiteCdIsNotNull())
		{
			String remoteLookup = svc.getRemoteLookup(specimen.getSiteCd().getId(), providerSystem.getCodeSystem().getText()); 
			
			sps.getBodySite().getIdentifier().setValue(remoteLookup);
			sps.getBodySite().getText().setValue(specimen.getSiteCd().getText());
			
			//JME: 20061013: copy body site component into specimen source component even if value for specimen source available. 
			//http://jira/browse/WDEV-11634
			String sendSiteAndSource = HL7Utils.getConfigItem(toConfigItemArray(providerSystem.getConfigItems()), ConfigItems.useSiteAndSource);
			if (sendSiteAndSource == null || (sendSiteAndSource.equalsIgnoreCase("FALSE") || sendSiteAndSource.equalsIgnoreCase("NO")))
			{
				sps.getSpecimenSourceNameOrCode().getIdentifier().setValue(remoteLookup);
				sps.getSpecimenSourceNameOrCode().getText().setValue(specimen.getSiteCd().getText());
			}
		}
	
		// OBR-24   Diagnostic serv sect ID
		if (specimen.getDisciplineIsNotNull())
		{
			String extMapping = ocsIf.getServiceMapping(specimen.getDiscipline(), providerSystem.getCodeSystem());
			obr.getDiagnosticServSectID().setValue(extMapping);
		}
		
		// OBR-39   Collector’s comment   (CE)  
		obr.getCollectorSComment(0).getText().setValue(specimen.getCollectorComment());
		LOG.debug("O01VoMapper renderSpecimenToOBR: exit");

	}

	public Message populateMessage()
	{
		return null;
	}
	
	public Message populateStatusChangeRadiologyMessage(ExternalEventVo event) throws Exception
	{
		LOG.debug("O01VoMapper populateStatusChangeRadiologyMessage: entry");
		ORM_O01 order = new ORM_O01();
		
		PatientRefVo patient= RefMandomain.getPatientFromAppointment(event.getAppointment());
		if(null==event.getInvestigation())
			return null;
		OcsOrderSessionRefVo orderRef=RefMandomain.getOrderFromInvestigation(event.getInvestigation());
		IfOutOcsOrderVo orderVo= ocsIf.getOrder(orderRef);
		
		DecimalFormat myFormatter = new DecimalFormat("000000000");  // Required for placer order number
		// Radiology messages only have a single investigation
		IfOrderInvestigationVo orderInv=getInvFromOrderVoAndMessage(orderVo,event.getInvestigation());
		String placerNum = myFormatter.format(event.getInvestigation().getID_OrderInvestigation());
		
		
		
		String fillerNum = orderInv.getFillerOrdNum();
		DateTime startDate = orderInv.getAppointmentDate();
		String priority = "";
		if (null!=orderInv.getOrderPriority())
		{
			priority  = orderInv.getOrderPriority().getText();
		}
		
		
		
		
		populateMSH( event.getProviderSystem(),  order.getMSH(),Long.toString( new java.util.Date().getTime()),"ORM","O01");
		PatientShort shortPatient = demog.getPatientShort(patient);
		renderPatientShortVoToPID(shortPatient, order.getORM_O01_PIDPD1NTEPV1PV2IN1IN2IN3GT1AL1().getPID(), event.getProviderSystem());
		//renderPatientShortVoToPID(shortPatient, order.getPATIENT().getPID(), event.getProviderSystem());
		
		//wdev-6361
		PV1 pv = order.getORM_O01_PIDPD1NTEPV1PV2IN1IN2IN3GT1AL1().getORM_O01_PV1PV2().getPV1();
		//PV1 pv = order.getPATIENT().getPATIENT_VISIT().getPV1();
		pv.getPatientClass().setValue("U");
		
		//http://jira/browse/WDEV-6910
		ConfigPropertyVo prop= event.getProviderSystem().getConfigurationProperty(ConfigItems.UseGpAsOrderingProvider);
		if (prop != null && (prop.getPropertyValueIsNotNull())&&(prop.getPropertyValue().length() > 0)
				&&prop.getPropertyValue().trim().equalsIgnoreCase("TRUE"))
		{
			if(orderVo.getResponsibleGpIsNotNull())
			{
				renderGpShortVoToXCN(orderVo.getResponsibleGp(),pv.getReferringDoctor(0),event.getProviderSystem());
			}
			
		}

		
		
		
		//ORC commonOrder = order.getORDER().getORC();
		ORC commonOrder = order.getORM_O01_ORCOBRRQDRQ1RXOODSODTNTECTDDG1OBXNTEFT1CTIBLG(0).getORC();
		
		
		//ORC-1
		//http://jira/browse/WDEV-12682
		if(ExternalSystemEventTypes.CANCELORDER.equals(event.getEventType())||ExternalSystemEventTypes.CANCELAPPOINTMENT.equals(event.getEventType()))
		{
		commonOrder.getOrderControl().setValue("CA");
		}
		else if(ExternalSystemEventTypes.UPDATEORDER.equals(event.getEventType()))
		{
			commonOrder.getOrderControl().setValue("XO");
		}
		
		else if(ExternalSystemEventTypes.PATIENTDNA.equals(event.getEventType()))
		{
			commonOrder.getOrderControl().setValue("HD");
		}
		
		
		//ORC-2		
		commonOrder.getPlacerOrderNumber().getEntityIdentifier().setValue(placerNum);
		//ORC-3
		commonOrder.getFillerOrderNumber().getEntityIdentifier().setValue(fillerNum);
		//ORC-4
		commonOrder.getPlacerGroupNumber().getEntityIdentifier().setValue(orderInv.getID_OrderInvestigation().toString());
		
		//ORC-5 ??
//		commonOrder.getOrderStatus().get
		
		// ORC-6   Response flag   (ID)   00220
		// Possible values..
		//		E	Report exceptions only
		//		R	Same as E, also Replacement and Parent-Child
		//		D	Same as R, also other associated segments
		//		F	Same as D, plus confirmations explicitly
		//		N	Only the MSA segment is returned
		commonOrder.getResponseFlag().setValue("D");  // Default Value 

		
		//ORC-7 
		//Start and end time handled in helper
		
		commonOrder.getQuantityTiming(0).getPriority().setValue(priority);
		
		//Current Date Time ORC-9
		//WDEV-8866		
		if (orderInv.getDisplayDateTimeIsNotNull())
			renderDateTimeVoToTS(orderInv.getDisplayDateTime(), commonOrder.getDateTimeOfTransaction());
		else 
			renderDateTimeVoToTS(new DateTime(), commonOrder.getDateTimeOfTransaction());
				
		if (orderVo.getOrderedByIsNotNull())
		{
			// ORC-10   Entered by   (XCN)   00224
			renderMemberOfStaffShortVoToXCN(orderVo.getOrderedBy(), commonOrder.getEnteredBy(0),event.getProviderSystem());

			// ORC-13   Enterer’s location   (PL)   00227 
			if (orderVo.getOrderedBy().getPrimaryLocationIsNotNull())
			{
				commonOrder.getEntererSLocation().getLocationDescription().setValue(orderVo.getOrderedBy().getPrimaryLocation().getName());
			}
			
			if (orderVo.getOrderedBy().getCommChannelsIsNotNull())
			{
				// ORC-14   Call back phone number   (XTN)   00228
				renderCommChannelVoCollectionToXTN(orderVo.getOrderedBy().getCommChannels(), commonOrder.getCallBackPhoneNumber(0));
			}
		}
		
		
		
		
		
		// ORC-12   Ordering provider   (XCN)   00226
		//http://jira/browse/WDEV-6910
		if (prop != null && (prop.getPropertyValueIsNotNull())&&(prop.getPropertyValue().length() > 0)
				&&prop.getPropertyValue().trim().equalsIgnoreCase("TRUE"))
		{
			if(orderVo.getResponsibleGpIsNotNull())
			{
				renderGpShortVoToXCN(orderVo.getResponsibleGp(), commonOrder.getOrderingProvider(0),event.getProviderSystem());
			}
		}
		
		else if (orderVo.getResponsibleClinicianIsNotNull())
		{
			renderMemberOfStaffShortVoToXCN(orderVo.getResponsibleClinician().getMos(), commonOrder.getOrderingProvider(0),event.getProviderSystem());
		}
		
		
		
		//ORC-15 Is this the same as ORC-7? It is for now
		renderDateTimeVoToTS(startDate,commonOrder.getOrderEffectiveDateTime());
		
		ServiceShortVo service = ocsIf.getService(orderInv.getInvestigation());


		// Only do this for XOs that are .....
		// contract is non-diagnostic and provider system has RebookApptWithCancelandFullXO set
		
		IHL7Helper RefMan=(IHL7Helper)getDomainImpl("ims.RefMan.helper.RefManHL7Helper");
		Boolean nonDiagnostic = !RefMan.isReferralDiagnostic(event.getAppointment().getBoId()) ;
		
		String rebookApptWithCancelandFullXO = HL7Utils.getConfigItem(toConfigItemArray(event.getProviderSystem().getConfigItems()), ConfigItems.RebookApptWithCancelandFullXO);
		boolean rebookWithFullXO=false;
		if(rebookApptWithCancelandFullXO!=null&&(rebookApptWithCancelandFullXO.equalsIgnoreCase("TRUE")||rebookApptWithCancelandFullXO.equalsIgnoreCase("YES")))
		{
			rebookWithFullXO=true;
		}
		
		if(ExternalSystemEventTypes.UPDATEORDER.equals(event.getEventType())&&rebookWithFullXO&&nonDiagnostic)
		{
			String StrSendNWinsteadofXO=HL7Utils.getConfigItem(toConfigItemArray(event.getProviderSystem().getConfigItems()), ConfigItems.XOasNWforApptRebookNonDiagnostic);
			if(StrSendNWinsteadofXO!=null&&(StrSendNWinsteadofXO.equalsIgnoreCase("TRUE")||StrSendNWinsteadofXO.equalsIgnoreCase("YES")))
			{
				commonOrder.getOrderControl().setValue("NW");
			}
			
		
			
		OBR obr = order.getORM_O01_ORCOBRRQDRQ1RXOODSODTNTECTDDG1OBXNTEFT1CTIBLG(0).getORM_O01_OBRRQDRQ1RXOODSODTNTECTDDG1OBXNTE().getOBR();
		
		String QALineBreaks = HL7Utils.getConfigItem(toConfigItemArray(event.getProviderSystem().getConfigItems()), ConfigItems.UseLineBreakBetweenQAs);
		boolean lineBreaks = QALineBreaks != null && (QALineBreaks.equalsIgnoreCase("TRUE") || QALineBreaks.equalsIgnoreCase("YES"))?true:false;
	
		
		String useOBXs = HL7Utils.getConfigItem(toConfigItemArray(event.getProviderSystem().getConfigItems()), ConfigItems.SendQAsAsOBXs);
		
		String separateNTEsConfig = HL7Utils.getConfigItem(toConfigItemArray(event.getProviderSystem().getConfigItems()), ConfigItems.ClinicalImagingSeparateNTEs);
		boolean separateNTEs = separateNTEsConfig != null && (separateNTEsConfig.equalsIgnoreCase("TRUE") || separateNTEsConfig.equalsIgnoreCase("YES"))?true:false;

		
		if (useOBXs != null && (useOBXs.equalsIgnoreCase("TRUE") || useOBXs.equalsIgnoreCase("YES")))
		{
			populateNonSpecimenClinicalDetailsSeparateSegments(orderInv,event.getProviderSystem(), orderVo, order,separateNTEs);
		}
		String addtNotes;
		String nteNotes;

		String alertText = getAlertsText(orderVo.getPatient(),event.getProviderSystem());
		
		if(alertText==null)
		{
			alertText="";
		}
		addtNotes=alertText;
		nteNotes=alertText;
		addtNotes += UserAssessmentInstHelper.getTextualQuestionAndAnswers(ocsIf.getRadiologyQuestions(orderInv), true, true,false);
		nteNotes += UserAssessmentInstHelper.getTextualQuestionAndAnswers(ocsIf.getRadiologyQuestions(orderInv), true, true,lineBreaks);
		if (orderVo.getAdditClinNotesIsNotNull())
		{
			addtNotes += "\r" + orderVo.getAdditClinNotes();
			nteNotes += "\r" + orderVo.getAdditClinNotes();
		}
		if(orderVo.getSummaryClinicalInformationIsNotNull())
		{
			addtNotes += "\r"+ orderVo.getSummaryClinicalInformation();
			nteNotes += "\r"+ orderVo.getSummaryClinicalInformation();
			
		}
		if(orderInv.getReorderReasonIsNotNull()&&!"".equals(orderInv.getReorderReason()))
		{
			addtNotes += "\r"+"Reason for Re-Order: "+orderInv.getReorderReason();
			nteNotes += "\r"+"Reason for Re-Order: "+orderInv.getReorderReason();
		}
		if (nteNotes != null && nteNotes.length() > 0
				&&!separateNTEs)
		{
			NTE nte = order.getORM_O01_ORCOBRRQDRQ1RXOODSODTNTECTDDG1OBXNTEFT1CTIBLG(0).getORM_O01_OBRRQDRQ1RXOODSODTNTECTDDG1OBXNTE().getNTE();
			//NTE nte = order.getORDER(0).getORDER_DETAIL().getNTE();
			// wdev-3315 Q&A to be include in the NTE segment
			renderNTE(nte, nteNotes);
		}
		if (addtNotes != null && addtNotes.length() > 0)
		{
			// OBR-13   Relevant clinical information 
			obr.getRelevantClinicalInfo().setValue(HL7Utils.toHL7Text(addtNotes));
		}
		
		// OBR-1   Set ID – OBR   (SI)
		obr.getSetIDOBR().setValue(String.valueOf(0+1));

		// OBR-2   Placer order number   (EI)   00216
		obr.getPlacerOrderNumber().getEntityIdentifier().setValue(placerNum);
		
		// OBR-3 Filler Order Number
		if (fillerNum!=null)
		{
			obr.getFillerOrderNumber().getEntityIdentifier().setValue(fillerNum);
		}

		renderInvestigationToORC_OBR(orderInv, commonOrder, obr,event.getProviderSystem());
		renderNewOrderToORC_OBR(event.getProviderSystem(),orderVo, commonOrder, obr);
		
		if (commonOrder.getDateTimeOfTransaction().getTimeOfAnEvent().getValue() == null)
			renderDateTimeVoToTS(new DateTime(), commonOrder.getDateTimeOfTransaction());

		
		}
		
		if (service.getCanBeScheduled()) 
		{
		IHL7Helper RefManHelper=(IHL7Helper)getDomainImpl("ims.RefMan.helper.RefManHL7Helper");
		order = RefManHelper.PopulateOrderMessage(order,null,orderInv,RefMandomain);
		}
		LOG.debug("O01VoMapper populateStatusChangeRadiologyMessage: exit");
		return order;
	}

}
