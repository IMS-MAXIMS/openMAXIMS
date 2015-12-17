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

import ims.configuration.ConfigItems;
import ims.configuration.gen.ConfigFlag;
import ims.core.patient.vo.PatientRefVo;
import ims.core.resource.people.vo.HcpRefVo;
import ims.core.resource.place.vo.LocSiteRefVo;
import ims.core.vo.GpShortVo;
import ims.core.vo.HcpLiteVo;
import ims.core.vo.LocSiteLiteMappingsVo;
import ims.core.vo.LocSiteLiteMappingsVoCollection;
import ims.core.vo.Patient;
import ims.core.vo.PatientFilter;
import ims.core.vo.PatientId;
import ims.core.vo.PatientIdCollection;
import ims.core.vo.PatientShort;
import ims.core.vo.PatientShortCollection;
import ims.core.vo.ServiceShortVo;
import ims.core.vo.ServiceShortVoCollection;
import ims.core.vo.lookups.DocumentCategory;
import ims.core.vo.lookups.FileType;
import ims.core.vo.lookups.PatIdType;
import ims.core.vo.lookups.Sex;
import ims.core.vo.lookups.TaxonomyType;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.ForeignKeyViolationException;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.utils.DateTime;
import ims.framework.utils.PartialDate;
import ims.hl7.utils.HL7Errors;
import ims.hl7.utils.HL7Utils;
import ims.ocrr.orderingresults.vo.OrderSpecimenRefVo;
import ims.ocrr.vo.ProviderSystemVo;
import ims.ocrr.vo.ResultDemographicsVo;
import ims.ocrr.vo.lookups.AuthorisationOrderStatus;
import ims.ocrr.vo.lookups.Category;
import ims.ocrr.vo.lookups.InvEventType;
import ims.ocrr.vo.lookups.InvestigationStatusChangeReason;
import ims.ocrr.vo.lookups.NormalcyStatus;
import ims.ocrr.vo.lookups.OcsDisplayFlag;
import ims.ocrr.vo.lookups.OrderCategory;
import ims.ocrr.vo.lookups.OrderInvStatus;
import ims.ocrr.vo.lookups.OrderPatMobility;
import ims.ocrr.vo.lookups.OrderPriority;
import ims.ocrr.vo.lookups.ResultDetailsType;
import ims.ocrr.vo.lookups.ResultEDSubtype;
import ims.ocrr.vo.lookups.ResultSpecimenTypes;
import ims.ocrr.vo.lookups.ResultStatus;
import ims.ocrr.vo.lookups.ResultUnitOfMeasure;
import ims.ocrr.vo.lookups.ResultValueType;
import ims.ocrr.vo.lookups.SpecimenSite;
import ims.ocrr.vo.lookups.SpecimenType;
import ims.ocs_if.helper.IHL7Helper;
import ims.ocs_if.vo.IfAnalyteVo;
import ims.ocs_if.vo.IfInvestigationLiteVo;
import ims.ocs_if.vo.IfOcsOrderVo;
import ims.ocs_if.vo.IfOcsPathResultVo;
import ims.ocs_if.vo.IfOcsPathResultVoCollection;
import ims.ocs_if.vo.IfOcsRadResultVo;
import ims.ocs_if.vo.IfOcsResCommentVo;
import ims.ocs_if.vo.IfOcsResCommentVoCollection;
import ims.ocs_if.vo.IfOcsResCompVo;
import ims.ocs_if.vo.IfOcsResCompVoCollection;
import ims.ocs_if.vo.IfOrdInvResultVo;
import ims.ocs_if.vo.IfOrdSpecLiteVo;
import ims.ocs_if.vo.IfOrderInvCurrentStatusVo;
import ims.ocs_if.vo.IfOrderInvestigationVo;
import ims.ocs_if.vo.IfOrderInvestigationVoCollection;
import ims.ocs_if.vo.IfOrderSpecimenVo;
import ims.ocs_if.vo.IfOrderSpecimenVoCollection;
import ims.ocs_if.vo.IfProviderInvSearchVo;
import ims.ocs_if.vo.IfResultDetailsVo;
import ims.ocs_if.vo.IfResultDetailsVoCollection;
import ims.vo.LookupInstVo;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.AbstractGroup;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.Varies;
import ca.uhn.hl7v2.model.v24.datatype.CE;
import ca.uhn.hl7v2.model.v24.datatype.CNN;
import ca.uhn.hl7v2.model.v24.datatype.CX;
import ca.uhn.hl7v2.model.v24.datatype.ED;
import ca.uhn.hl7v2.model.v24.datatype.NDL;
import ca.uhn.hl7v2.model.v24.datatype.SPS;
import ca.uhn.hl7v2.model.v24.datatype.TQ;
import ca.uhn.hl7v2.model.v24.datatype.XCN;
import ca.uhn.hl7v2.model.v24.group.ORU_R01_OBXNTE;
import ca.uhn.hl7v2.model.v24.group.ORU_R01_ORCOBRNTECTDOBXNTEFT1CTI;
import ca.uhn.hl7v2.model.v24.message.OMG_O19;
import ca.uhn.hl7v2.model.v24.message.ORG_O20;
import ca.uhn.hl7v2.model.v24.message.ORM_O01;
import ca.uhn.hl7v2.model.v24.message.ORR_O02;
import ca.uhn.hl7v2.model.v24.message.ORU_R01;
import ca.uhn.hl7v2.model.v24.segment.MSH;
import ca.uhn.hl7v2.model.v24.segment.NTE;
import ca.uhn.hl7v2.model.v24.segment.OBR;
import ca.uhn.hl7v2.model.v24.segment.OBX;
import ca.uhn.hl7v2.model.v24.segment.ORC;
import ca.uhn.hl7v2.model.v24.segment.PID;
import ca.uhn.hl7v2.model.v24.segment.PV1;

public class R01VoMapper extends VoMapper
{
	private static final Logger	LOG	= Logger.getLogger(R01VoMapper.class);

	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	{
		try
		{
			processResult(msg,providerSystem);
		}
		catch (StaleObjectException soe)
		{
			try
			{
				System.out.println("Handeling SOE");
				Thread.sleep(10000);
				processResult(msg,providerSystem);
			}
			catch(Exception ie)
			{
				this.errorCount++;
				ie.printStackTrace();
				return HL7Utils.buildRejAck(msg.get("MSH"), "Exception. " + ie.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
			}
		}
		catch (Exception ex)
		{
			this.errorCount++;
			ex.printStackTrace();
			return HL7Utils.buildRejAck(msg.get("MSH"), "Exception. " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
		}

		Message ack = HL7Utils.buildPosAck(msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));
		return ack;
	}

	protected void processResult(Message msg, ProviderSystemVo providerSystem) throws Exception
	{
		String placerOrdNum = "";
		String fillerOrdNum = "";

		IfOrderSpecimenVo spcVo = null;
		IfResultDetailsVoCollection historicResultDetails = new IfResultDetailsVoCollection();
		IfOrderInvestigationVoCollection invResVoColl = new IfOrderInvestigationVoCollection();
		IfOcsPathResultVoCollection specimenResults = new IfOcsPathResultVoCollection();
			
		MSH msh;
		int pid_count=getPIDCount(msg);
		
		if (msg instanceof ORM_O01)
		{
			msh = ((ORM_O01)msg).getMSH();
		}
		else if (msg instanceof OMG_O19)
		{			
			msh = ((OMG_O19)msg).getMSH();
		}
		else if (msg instanceof ORU_R01)
		{
			msh = ((ORU_R01)msg).getMSH();
		}
		else if (msg instanceof ORR_O02)
		{
			msh = ((ORR_O02)msg).getMSH();
		}
		else if (msg instanceof ORG_O20)
		{
			msh = ((ORG_O20)msg).getMSH();
		}
		else
		{
			throw new HL7Exception("Invalid message type passed to R01.processResult");
		}

		String hl7App = msh.getSendingApplication().getNamespaceID().getValue();		
		Category category = getOrderCategory(hl7App);
		if (category == null)
			throw new HL7Exception("No Category found for Application: " + hl7App);

		boolean bPathology = category.equals(Category.PATHOLOGY);

		for (int i = 0; i < pid_count; i++)
		{
			PID pid = null;
			int invCount = 0;
			if (msg instanceof ORM_O01)
			{
				invCount = ((ORM_O01)msg).getORM_O01_ORCOBRRQDRQ1RXOODSODTNTECTDDG1OBXNTEFT1CTIBLGReps();
				pid = ((ORM_O01)msg).getORM_O01_PIDPD1NTEPV1PV2IN1IN2IN3GT1AL1().getPID();  // wdev-3151 - this was commented out
			}
			else if (msg instanceof OMG_O19)
			{
				invCount = ((OMG_O19)msg).getOMG_O19_ORCOBRNTECTDDG1OBXNTEPIDPD1PV1PV2AL1ORCOBRNTECTDOBXNTEFT1CTIBLGReps();
				pid = ((OMG_O19)msg).getOMG_O19_PIDPD1NTEPV1PV2IN1IN2IN3GT1AL1().getPID();  
			}
			else if (msg instanceof ORU_R01)
			{
				invCount = ((ORU_R01)msg).getORU_R01_PIDPD1NK1NTEPV1PV2ORCOBRNTECTDOBXNTEFT1CTI(i).getORU_R01_ORCOBRNTECTDOBXNTEFT1CTIReps(); 
				pid = ((ORU_R01)msg).getORU_R01_PIDPD1NK1NTEPV1PV2ORCOBRNTECTDOBXNTEFT1CTI(i).getORU_R01_PIDPD1NK1NTEPV1PV2().getPID();				
			}
			else if (msg instanceof ORR_O02)
			{
				invCount = ((ORR_O02)msg).getORR_O02_PIDNTEORCOBRRQDRQ1RXOODSODTNTECTI().getORR_O02_ORCOBRRQDRQ1RXOODSODTNTECTIReps();
				pid = ((ORR_O02)msg).getORR_O02_PIDNTEORCOBRRQDRQ1RXOODSODTNTECTI().getORR_O02_PIDNTE().getPID(); // wdev-3151 - this was commented out
			}
			else if (msg instanceof ORG_O20)
			{
				invCount = ((ORG_O20)msg).getORG_O20_PIDNTEORCOBRNTECTI().getORG_O20_ORCOBRNTECTIReps();
				pid = ((ORG_O20)msg).getORG_O20_PIDNTEORCOBRNTECTI().getORG_O20_PIDNTE().getPID();
			}
			else
			{
				throw new HL7Exception("Invalid message type passed to R01.processResult");
			}
			
			
			//http://jira/browse/WDEV-6953
			// wdev-5526 At this stage, we need to loop through each obr segment and ensure no duplicates found
			boolean isResultMessage=(msg instanceof ORU_R01?true:false);
			Map<IfInvestigationLiteVo,IfInvestigationLiteVo> map = new HashMap<IfInvestigationLiteVo, IfInvestigationLiteVo>();
			boolean containsDFT=false;
			if(invCount>1) //http://jira/browse/WDEV-17952
			{
			for (int invI=0; invI<invCount; invI++)
			{
				OBR obr=null;
				if (msg instanceof ORM_O01)
					obr = ((ORM_O01)msg).getORM_O01_ORCOBRRQDRQ1RXOODSODTNTECTDDG1OBXNTEFT1CTIBLG(invI).getORM_O01_OBRRQDRQ1RXOODSODTNTECTDDG1OBXNTE().getOBR();
				else if (msg instanceof OMG_O19)
					obr = ((OMG_O19)msg).getOMG_O19_ORCOBRNTECTDDG1OBXNTEPIDPD1PV1PV2AL1ORCOBRNTECTDOBXNTEFT1CTIBLG(invI).getOBR();
				else if (msg instanceof ORR_O02)
					 obr = ((ORR_O02)msg).getORR_O02_PIDNTEORCOBRRQDRQ1RXOODSODTNTECTI().getORR_O02_ORCOBRRQDRQ1RXOODSODTNTECTI(invI).getOBR();
				else if (msg instanceof ORG_O20)
					 obr = ((ORG_O20)msg).getORG_O20_PIDNTEORCOBRNTECTI().getORG_O20_ORCOBRNTECTI(invI).getOBR();
				else if (msg instanceof ORU_R01)
					 obr = ((ORU_R01)msg).getORU_R01_PIDPD1NK1NTEPV1PV2ORCOBRNTECTDOBXNTEFT1CTI().getORU_R01_ORCOBRNTECTDOBXNTEFT1CTI(invI).getOBR();
				else
					continue;
				
				String providerInvCode = obr.getUniversalServiceIdentifier().getIdentifier().getValue();
				IfInvestigationLiteVo inv = getInvestigation(obr, hl7App, providerSystem, providerInvCode,bPathology,isResultMessage);
				if (inv != null)
				{
					if(inv.getEventTypeIsNotNull()&&inv.getEventType().equals(InvEventType.TIME_SERIES))
					{
						containsDFT=true;
					}

					if (map.containsKey(inv))
					{
						throw new HL7Exception("Duplicate Investigation found - " + providerInvCode + " (" + inv.getInvestigationIndex().getName() + "), message rejected");
					}
					map.put(inv, inv);
				}
			}
			}
			if(containsDFT&&map.size()>1)
			{
				throw new HL7Exception("Time series must contain a single investigation.");
			}
			map.clear();
			// wdev-5526 end
			//http://jira/browse/WDEV-6953
			//http://jira/browse/WDEV-17495 take voOrder outside the loop
			IfOcsOrderVo voOrder = null;
			
			for (int j = 0; j < invCount; j++)
			{
				ORU_R01_ORCOBRNTECTDOBXNTEFT1CTI orc_group = null;				
				ORC orc = null;
				ORC lastOrc = null;
				OBR obr =  null;
				if (msg instanceof ORM_O01)
				{
					orc = ((ORM_O01)msg).getORM_O01_ORCOBRRQDRQ1RXOODSODTNTECTDDG1OBXNTEFT1CTIBLG(j).getORC();
					obr = ((ORM_O01)msg).getORM_O01_ORCOBRRQDRQ1RXOODSODTNTECTDDG1OBXNTEFT1CTIBLG(j).getORM_O01_OBRRQDRQ1RXOODSODTNTECTDDG1OBXNTE().getOBR();
				}
				else if (msg instanceof OMG_O19)
				{
					orc = ((OMG_O19)msg).getOMG_O19_ORCOBRNTECTDDG1OBXNTEPIDPD1PV1PV2AL1ORCOBRNTECTDOBXNTEFT1CTIBLG(j).getORC();
					obr = ((OMG_O19)msg).getOMG_O19_ORCOBRNTECTDDG1OBXNTEPIDPD1PV1PV2AL1ORCOBRNTECTDOBXNTEFT1CTIBLG(j).getOBR();
				}
				else if (msg instanceof ORU_R01)
				{
					orc_group = ((ORU_R01)msg).getORU_R01_PIDPD1NK1NTEPV1PV2ORCOBRNTECTDOBXNTEFT1CTI(i).getORU_R01_ORCOBRNTECTDOBXNTEFT1CTI(j);
					orc = orc_group.getORC();
					if (orc == null)
						orc = lastOrc;
					else
						lastOrc = orc;
							
					obr = orc_group.getOBR();
				}
				else if (msg instanceof ORR_O02)
				{
					orc = ((ORR_O02)msg).getORR_O02_PIDNTEORCOBRRQDRQ1RXOODSODTNTECTI().getORR_O02_ORCOBRRQDRQ1RXOODSODTNTECTI(j).getORC();
					obr = ((ORR_O02)msg).getORR_O02_PIDNTEORCOBRRQDRQ1RXOODSODTNTECTI().getORR_O02_ORCOBRRQDRQ1RXOODSODTNTECTI(j).getOBR();
				}
				else if (msg instanceof ORG_O20)
				{
					orc = ((ORG_O20)msg).getORG_O20_PIDNTEORCOBRNTECTI().getORG_O20_ORCOBRNTECTI().getORC();
					obr = ((ORG_O20)msg).getORG_O20_PIDNTEORCOBRNTECTI().getORG_O20_ORCOBRNTECTI().getOBR();
				}
				else
				{
					throw new HL7Exception("Invalid message type passed to R01.processResult");
				}
				
				placerOrdNum=null;
				if ( orc.getPlacerOrderNumber() != null && orc.getPlacerOrderNumber().getEntityIdentifier() != null)
				{
					placerOrdNum = orc.getPlacerOrderNumber().getEntityIdentifier().getValue();
				}
				//JME: 20060627: Need to also check in OBR, in case sender is not filling ORC
				if (placerOrdNum == null && obr.getPlacerOrderNumber() != null && obr.getPlacerOrderNumber().getEntityIdentifier() != null)
				{
					placerOrdNum = obr.getPlacerOrderNumber().getEntityIdentifier().getValue();
				}
				if (placerOrdNum != null && placerOrdNum.equals("#R"))
					placerOrdNum=null;
				
				fillerOrdNum=null;
				if ( orc.getFillerOrderNumber() != null && orc.getFillerOrderNumber().getEntityIdentifier() != null)
				{
					fillerOrdNum = orc.getFillerOrderNumber().getEntityIdentifier().getValue();
				}
				//JME: 20060627: Need to also check in OBR, in case sender is not filling ORC
				if (fillerOrdNum == null && obr.getFillerOrderNumber() != null && obr.getFillerOrderNumber().getEntityIdentifier() != null)
				{
					fillerOrdNum = obr.getFillerOrderNumber().getEntityIdentifier().getValue();
				}
				
				// wdev-2945 hold onto the configuration items for the provider system
				ConfigItems[] providerSystemConfigItems = toConfigItemArray(providerSystem.getConfigItems());
				boolean orderCreated=false;
				// http://jira/browse/WDEV-11907 Some code tidy up removed unnecessary if /else
//				IfOcsOrderVo voOrder = null; //http://jira/browse/WDEV-17495
				
				String tmpPlacerOrdNum=placerOrdNum;
				if(tmpPlacerOrdNum==null)
				{
					tmpPlacerOrdNum =getPlacerNumFromMessage( msg, invCount, i);
				}
//				http://jira/browse/WDEV-17495
				if(voOrder==null)
				{
					voOrder = ocsIfInbound.getOrderByPlacerOrFiller(tmpPlacerOrdNum, fillerOrdNum, category);
				}
				//New unsolicited Result. Need to create the Order structures first.
				if (voOrder == null)
				{
					//WDEV-6326 - bug fix, order response for invalid id should NAK
					if (msg instanceof ORR_O02 || msg instanceof ORG_O20)
					{
						throw new HL7Exception("Order Response received for non-existent order");
					}
					
					orderCreated=true;
					voOrder = processOrderCreation(msg,providerSystem,category,providerSystemConfigItems);
					//JME: No need to do anymore if this is not a result message
					if (!(msg instanceof ORU_R01))
							return;
				}	
				else 
				{
					if(pid.getPatientIdentifierList().length!=0) //WDEV-12230 Check there is a PID segment
					{
						Boolean isValidPatient=demog.validatePatient(populatePatientFromPID(pid,providerSystem),voOrder.getPatient());
						if(null==isValidPatient||!isValidPatient)
						{
							throw new HL7Exception("Patient mismatch between Order and message.");
						}
					}
					
					// http://jira/browse/WDEV-11907
					if(ConfigFlag.HL7.ALLOW_HL7_UPDATES_TO_LOCATION_AND_CONSULTANT.getValue())
					{
						voOrder=updateOrderLevelValues(msg, orc, obr, voOrder, providerSystem);
					}
				}

				// wdev-2945, if the order wasn't created, we still may need to perform a demographics
				// match on the details received
				if (!orderCreated)
				{
					String demographicMatch = HL7Utils.getConfigItem(providerSystemConfigItems, ConfigItems.EnableDemographicMatching);
					String matchExceptionMessage=null;
					if ((matchExceptionMessage = demographicsMatch(demographicMatch, voOrder.getPatient(), pid, providerSystem, voOrder)) != null)
						throw new HL7Exception(matchExceptionMessage);
				}
				
				
				//  The order has been created/updated at this stage, we now concentrate on the result
				if (bPathology)
					spcVo = processPATHResult(msg, voOrder, placerOrdNum, fillerOrdNum, spcVo, hl7App, orc, obr, pid, orc_group, providerSystem, i, j, invResVoColl,specimenResults,historicResultDetails,providerSystemConfigItems);
				else
					processRADResult(msg, voOrder, placerOrdNum, fillerOrdNum, hl7App, orc, obr, pid, orc_group, providerSystem, j);
//			}
			
			if (bPathology)
			{	
				if(ConfigFlag.HL7.UNSOLICTED_NEW_SPECIMEN_PER_INVESTIGATION.getValue()
						||j==invCount-1) // Only save the last time round
				{
					if (msg instanceof ORU_R01)
					{
							savePathResult(spcVo, placerOrdNum,fillerOrdNum, hl7App,isGPResultMessage(msg),historicResultDetails,invResVoColl.get(j));	
					}
					else
					{
						ocsIfInbound.saveOrderSpecimen(spcVo);						
					}
				}
			}
		}
		}
	}

	/**
	 * wdev-3645
	 * solicitedOrder
	 * This method will check the interfaces to see if the flag - wasOrdered is set to true.
	 * If it was, we know that it was ordered from within our appliation.
	 * @param voOrder
	 * @return true to say it is a solicited order, false otherwise
	 */
	private boolean solicitedOrder(IfOcsOrderVo voOrder)
	{
		if (voOrder != null)
		{
			for (int i=0; i<voOrder.getInvestigations().size(); i++)
			{
				IfOrderInvestigationVo invVo = voOrder.getInvestigations().get(i);
				if (invVo.getWasOrderedIsNotNull() && invVo.getWasOrdered().booleanValue() == true)
					return true;  // It is a solicited order
			}
		}
		return false;
	}
	private void processRADResult(Message msg, IfOcsOrderVo voOrder, String placerOrdNum, String fillerOrdNum, String hl7App, ORC orc, OBR obr, PID pid, ORU_R01_ORCOBRNTECTDOBXNTEFT1CTI orc_group, ProviderSystemVo providerSystem, int invCount) throws Exception
	{
		// wdev-2397 specimen source is now part of the search criteria to get the investigation
		IfOrderInvestigationVo orderInvfromMsg=null;
		ServiceShortVo serviceFromPlacerNum=null;
		
		if ((msg instanceof ORM_O01 || msg instanceof OMG_O19)
				&&("XO".equals(orc.getOrderControl().getValue())))
		{
				processChangeInvestigation(orc,obr,hl7App,voOrder,placerOrdNum, fillerOrdNum,providerSystem);
				return;
		}
		
		
		
		if (((msg instanceof ORR_O02)||(msg instanceof ORM_O01)||(msg instanceof OMG_O19)||(msg instanceof ORG_O20))
				&&("CARE_UK".equals(ConfigFlag.HL7.EXTENDED_HL7_PROCESSING.getValue())))
		{
			Category category = getOrderCategory(hl7App);
			IfOcsOrderVo orderVo=ocsIfInbound.getOrderByPlacerOrFiller(placerOrdNum, fillerOrdNum, category);
			orderInvfromMsg=getInvFromOrderVoAndMessage(orderVo,placerOrdNum);
			serviceFromPlacerNum= ocsIf.getService(orderInvfromMsg.getInvestigation());
		}
		
		
		SPS sps = obr.getSpecimenSource();
		
		IfOrderInvestigationVo invVo=null;
		IfInvestigationLiteVo cfgInv=null;
		IfProviderInvSearchVo search = new IfProviderInvSearchVo();
		String providerInvCode = obr.getUniversalServiceIdentifier().getIdentifier().getValue();
		if((null==providerInvCode)&&("CARE_UK".equals(ConfigFlag.HL7.EXTENDED_HL7_PROCESSING.getValue())))
		{
			invVo=orderInvfromMsg;
		}
		else
		{
			search.setProviderInvCode(providerInvCode);
			search.setHl7App(hl7App);
			search.setProvider(providerSystem);
			search.setSpecimenSource(sps.getSpecimenSourceNameOrCode().getIdentifier().getValue());
			cfgInv = ocsIfInbound.getInvestigationByHl7AppInvAndService(search);
			if (cfgInv == null)
				throw new HL7Exception("Investigation could not be found for ProviderInvCode:" + providerInvCode + ", ProviderSystem:" + hl7App);
	
			SpecimenSite siteSource=null;
			if (cfgInv.getInvestigationIndexIsNotNull() && cfgInv.getInvestigationIndex().getRequiresSiteSpecifierIsNotNull() &&
						cfgInv.getInvestigationIndex().getRequiresSiteSpecifier().booleanValue() == true)
			{
				siteSource =  (SpecimenSite) svc.getLocalLookup(SpecimenSite.class, SpecimenSite.TYPE_ID, providerSystem.getCodeSystem().getText(), sps.getSpecimenSourceNameOrCode().getIdentifier().getValue().trim());
			}
			
			invVo = ocsIfInbound.getOrderInvestigation(voOrder, cfgInv, siteSource, null,placerOrdNum,fillerOrdNum);  // wdev-3597 Rad Order no specimen
			
			if((msg instanceof ORM_O01 || msg instanceof OMG_O19)&&("CARE_UK".equals(ConfigFlag.HL7.EXTENDED_HL7_PROCESSING.getValue())))
					{
				// Only create a new investigation if the service is the same for the existing OrderInv and the new one
						ServiceShortVo newService= ocsIf.getService(cfgInv);
						if(!newService.getBoId().equals(serviceFromPlacerNum.getBoId()))
							throw new HL7Exception("New Investigation must have the same modality."); 
								
					}
			
			
		}
		if (invVo == null)
		{
			invVo = new IfOrderInvestigationVo();
			invVo.setWasOrdered(Boolean.FALSE);
			invVo.setOrdInvSeq(Integer.valueOf(invCount+1));
			invVo.setOrderDetails(voOrder); // wdev-3152 link investigation to order
			if(null!=cfgInv)
			fillRADInvestigationFromOBR(invVo, obr, cfgInv,providerSystem);	
		}
		else
		{
			
			if(null!=cfgInv)
				fillRADInvestigationFromOBR(invVo, obr, cfgInv,providerSystem);					
			if (!invVo.getOrdInvSeqIsNotNull())
				invVo.setOrdInvSeq( Integer.valueOf(invCount+1));
			if("SN".equals(orc.getOrderControl().getValue()))
			{
				//IF it is a SN send number order we create a new order
				processOrderCreation(msg, providerSystem, Category.CLINICALIMAGING, toConfigItemArray(providerSystem.getConfigItems()) );
			}

		}
		
		
		if (msg instanceof ORM_O01 || msg instanceof OMG_O19)
		{
				invVo.setOrdInvCurrentStatus(createInvStatus(invVo.getOrdInvCurrentStatus(),orc, OrderInvStatus.ACCEPTED, "Update Order Message received.",providerSystem));
		}
		else if (msg instanceof ORU_R01)
		{
			//JME: 20061103: WDEV-2051. 
			IfOrderInvCurrentStatusVo vo = new IfOrderInvCurrentStatusVo();
			vo.setChangeDateTime(populateDateTimeVoFromTS(orc.getDateTimeOfTransaction()));
			if (vo.getChangeDateTime() == null)
				vo.setChangeDateTime(new DateTime());
			
			vo.setChangeUser("HL7InboundEngine");
			vo.setProcessedDateTime(new DateTime());
			
//WDEV-9005 
			OrderInvStatus status =(OrderInvStatus)svc.getLocalLookup(OrderInvStatus.class, OrderInvStatus.TYPE_ID, providerSystem.getCodeSystem().getText(),orc.getOrderStatus().getValue());
			if (OrderInvStatus.AUTOREPORT.equals(status))
			{
				vo.setOrdInvStatus(OrderInvStatus.AUTOREPORT);
				vo.setStatusReason("Auto Report Received");
			}
			else
			{
					vo.setOrdInvStatus(OrderInvStatus.NEW_RESULT);
					String orderControlReason = orc.getOrderControlCodeReason().getIdentifier().getValue(); 
					if (orderControlReason == null)
						orderControlReason = "New Result Received.";
					vo.setStatusReason(orderControlReason);
			}
			invVo.setOrdInvCurrentStatus(vo);
			
			//Set the endoscopy KPIs if they are in the message
			TQ[] tqs=orc.getQuantityTiming();
			for (TQ tq : tqs) {
				if("Theatre".equals(tq.getText().getValue()))
				{
					invVo.setEnterTheatreDate(populateDateTimeVoFromTS(tq.getStartDateTime()));
					invVo.setLeaveRecoveryDate(populateDateTimeVoFromTS(tq.getEndDateTime()));
				}
				if("Procedure".equals(tq.getText().getValue()))
				{
					invVo.setStartProcedureDate(populateDateTimeVoFromTS(tq.getStartDateTime()));
					invVo.setEndProcedureDate(populateDateTimeVoFromTS(tq.getEndDateTime()));
				}
					
			}
			
//			invVo.set
		}
		else if (msg instanceof ORR_O02 || msg instanceof ORG_O20)
		{
			invVo.setOrdInvCurrentStatus(createInvStatus(invVo.getOrdInvCurrentStatus(),orc, null, "Order Response/Status Update message received.",providerSystem));
			//http://jira/browse/WDEV-12682 Only make the call if there is extended processing
			// update the acceptReferralFromInvestigation method to check the contract type 
			if ("CARE_UK".equals(ConfigFlag.HL7.EXTENDED_HL7_PROCESSING.getValue()))
			{
				RefMandomain.acceptReferralFromInvestigation(invVo);
				
			}
		}

		if (invVo.getOrdInvCurrentStatus().getOrdInvStatus().equals(OrderInvStatus.INPROGRESS_SCH))
		{
			invVo.setAppointmentDate(populateDateTimeVoFromTS(orc.getOrderEffectiveDateTime()));
		}

		if (!(msg instanceof ORU_R01))
		{
			String errors[] = invVo.validate();
			if (errors != null)
			{
				throw new HL7Exception("Validation of invVo failed. " + VoMapper.toDisplayString(errors));				
			}
			invVo=ocsIfInbound.saveOrderInvestigation(invVo);	
			if (((msg instanceof ORR_O02)||(msg instanceof ORM_O01)||(msg instanceof OMG_O19)||(msg instanceof ORG_O20))
					&&("CARE_UK".equals(ConfigFlag.HL7.EXTENDED_HL7_PROCESSING.getValue())))

			{
				DateTime apptStartTime=populateDateTimeVoFromTS(orc.getQuantityTiming(0).getStartDateTime());
				DateTime apptEndTime=populateDateTimeVoFromTS(orc.getQuantityTiming(0).getEndDateTime());
				HcpRefVo seenBy=null;
				
				XCN orderingProvider=null;
				if (orc.getOrderingProvider(0) != null && orc.getOrderingProvider(0).getIDNumber().getValue() != null)
				{		
					orderingProvider = orc.getOrderingProvider(0);
				}
				if (orderingProvider == null)
				{
					//Need to also check OBR-16   Ordering provider  (XCN)
					if (obr.getOrderingProvider(0) != null && obr.getOrderingProvider(0).getIDNumber().getValue() != null)
					{
						orderingProvider = obr.getOrderingProvider(0);
					}
				}
				if (orderingProvider != null)
				{
					HcpLiteVo hcp = populateHcpVoFromXCN(orderingProvider, providerSystem.getCodeSystem());
					if (hcp != null)
					{
						seenBy=hcp;
					}
				}

				
				IHL7Helper RefManHelper=(IHL7Helper)getDomainImpl("ims.RefMan.helper.RefManHL7Helper");
				RefManHelper.ProcessOrderMessage( orc, invVo,orderInvfromMsg,RefMandomain,apptStartTime,apptEndTime,seenBy);
			}

		}	
		else
		{
			IfOrdInvResultVo invResVo = createInvResVoFromResVo(invVo);					
			invResVo.setResultDemographics(getResDemoVoFromSeg(pid, providerSystem));
			
			if(invResVo.getResultDetails()==null)
			{
				invResVo.setResultDetails(new IfResultDetailsVo());
			}
			invResVo.getResultDetails().setType(ResultDetailsType.CLINICAL);
			invResVo.getResultDetails().setClinicalResultDetails(getRadResultDetails(obr, orc_group));
			saveRadResult(invResVo, placerOrdNum,fillerOrdNum, hl7App);
			
			if((msg instanceof ORU_R01)&&("CARE_UK".equals(ConfigFlag.HL7.EXTENDED_HL7_PROCESSING.getValue())))
			{
				
				IHL7Helper RefManHelper= (IHL7Helper)getDomainImpl("ims.RefMan.helper.RefManHL7Helper");
				String fileTypeStr=obr.getPlacerSupplementalServiceInformation(0).getNameOfCodingSystem().getValue();
				if(null!=fileTypeStr)
				{
					FileType fileType=(FileType)svc.getLocalLookup(FileType.class, FileType.TYPE_ID, providerSystem.getCodeSystem().getText(),fileTypeStr);
					if (!FileType.PDF.equals(fileType))
						{
							LOG.error("Document format (PlacerSupplementalServiceInformation^NameOfCodingSystem)must be the PDF mapping for the FileType Lookup.");
						}
				}
				String documentCategoryStr=obr.getPlacerSupplementalServiceInformation(0).getIdentifier().getValue();
				if(null!=documentCategoryStr)
				{
					DocumentCategory documentCategory=(DocumentCategory)svc.getLocalLookup(DocumentCategory.class, DocumentCategory.TYPE_ID ,providerSystem.getCodeSystem().getText(),documentCategoryStr);
					if(!DocumentCategory.RESULTREPORT.equals(documentCategory))
					{
						LOG.error("Document category (PlacerSupplementalServiceInformation^Identifier)must be the Result Report mapping for the DocumentCategory Lookup.");
					}
				}
				RefManHelper.PocessResultMessage((ORU_R01)msg, invVo,orderInvfromMsg,RefMandomain);
			}
			
			
		}
		
	}


	private IfOrderSpecimenVo processPATHResult(Message msg, IfOcsOrderVo voOrder, String placerOrdNum, String fillerOrdNum, IfOrderSpecimenVo spcVo, String hl7App, ORC orc, OBR obr, PID pid, ORU_R01_ORCOBRNTECTDOBXNTEFT1CTI orc_group, ProviderSystemVo providerSystem, int pdCount, int invCount, IfOrderInvestigationVoCollection invResVoColl,IfOcsPathResultVoCollection specResults,IfResultDetailsVoCollection historicResultDetails, ConfigItems[] providerSystemConfigItems) throws Exception
	{
		//JP 20060802
		ServiceShortVo discip = null;
		String serviceCode = obr.getDiagnosticServSectID().getValue();
		IfOrderInvestigationVo invVo=null;
		
		
		
		//JP 20060802
		discip = ocsIfInbound.getServiceByTaxonomy(serviceCode, TaxonomyType.PATH);
		ServiceShortVoCollection serviceColl=null;
		 
		if (discip == null)
		{
			// The service wasn't found, let's see if this value is used as an alternative service code,
			// if so, get the list of services matching it and see if we can get the investigation based on it
			serviceColl = ocsIfInbound.listServicesWithAlternateCode(serviceCode);
			if (serviceColl != null && serviceColl.size() > 0)
			{
				// Set to the first service, though we may need to reference the others later
				discip = serviceColl.get(0);
				LOG.debug("Discipline set to Alternate Service Code " + discip);
			}
			else //JP 20060802
			{
				throw new HL7Exception("Service could not be found for service code: " + serviceCode + ", ProviderSystem: " + hl7App);
			}
		}
		
		
		// wdev-2397 specimen source is now part of the search criteria to get the investigation
		SPS sps = obr.getSpecimenSource();
		String source=null;
		if (sps != null && sps.getSpecimenSourceNameOrCode().getIdentifier().getValue() != null)
		{
			source =  sps.getSpecimenSourceNameOrCode().getIdentifier().getValue().trim();
		}
		else  // wdev-2618
			throw new HL7Exception("Specimen Source is required for this message to be processed successfully");

		//http://jira/browse/WDEV-11634  
		// This field will not be populated by Winpath 
		//currently JAN-11  only Omni-lab will support this
		String site=null;
		if(sps!=null &&sps.getBodySite().getIdentifier().getValue()!=null)
		{
			site = sps.getBodySite().getIdentifier().getValue().trim();
		}
		IfProviderInvSearchVo search = new IfProviderInvSearchVo();
		String providerInvCode = obr.getUniversalServiceIdentifier().getIdentifier().getValue();
		search.setProviderInvCode(providerInvCode);
		search.setHl7App(hl7App);
		search.setService(discip);
		search.setSpecimenSource(source);
		search.setProvider(providerSystem);
		search.setSpecimenSite(site);// Usually null!
		boolean isResultMessage=(msg instanceof ORU_R01?true:false);
		search.setIsResultMessage(isResultMessage);

		IfInvestigationLiteVo cfgInv = ocsIfInbound.getInvestigationByHl7AppInvAndService(search);
		if (cfgInv == null)
		{
			// Not found the first time, if serviceColl has more disciplines, loop through and try for these
			if (serviceColl != null && serviceColl.size() > 1)
			{
				for (int k=1; k<serviceColl.size();k++)
				{
					LOG.debug("Checking For Investigation with Alternate Service Codes:" + serviceColl.get(k));
					search.setService(serviceColl.get(k));
					cfgInv = ocsIfInbound.getInvestigationByHl7AppInvAndService(search);
					if (cfgInv != null)
					{
						discip = serviceColl.get(k);
						break;
					}
				}
			}
		}
		if (cfgInv == null)
			throw new HL7Exception("Investigation could not be found for ProviderInvCode:" + providerInvCode + ", ProviderSystem:" + hl7App);

		//http://jira/browse/WDEV-17495
		invVo = getPathOrderInvestigation(voOrder, cfgInv,  spcVo);
		if(invVo==null)
		{
			invVo = ocsIfInbound.getOrderInvestigation(voOrder, cfgInv, null, spcVo,placerOrdNum,fillerOrdNum);
		}
		if (invVo == null)
		{
			invVo = new IfOrderInvestigationVo();
			invVo.setWasOrdered(Boolean.FALSE);
			invVo.setOrdInvSeq( Integer.valueOf(invCount+1));
			invVo.setOrderDetails(voOrder);  // wdev-3152 link investigation to order
			fillPATHInvestigationFromOBR(invVo, obr, cfgInv,providerSystem);	
//			spcVo.getInvestigations().add(invVo);
		}
		else
		{
			fillPATHInvestigationFromOBR(invVo, obr, cfgInv,providerSystem);					
			if (!invVo.getOrdInvSeqIsNotNull())
				invVo.setOrdInvSeq(Integer.valueOf(invCount+1));
		}

//		if (spcVo.getCollDateTimeFiller() != null) //no specimens in radiology
//		{
//			invVo.setDisplayDateTime(spcVo.getCollDateTimeFiller());
//			invVo.setDisplayTimeSupplied(spcVo.getColTimeFillerSupplied());
//			invVo.setDisplayFlag(OcsDisplayFlag.SPEC_COLL);
//		}		

		
		
		

		if (spcVo == null||ConfigFlag.HL7.UNSOLICTED_NEW_SPECIMEN_PER_INVESTIGATION.getValue())
		{
			spcVo = ocsIfInbound.getSpecimenByPlacerOrFiller(voOrder, placerOrdNum, fillerOrdNum,invVo);					
			if (spcVo == null)
			{
				spcVo = new IfOrderSpecimenVo();
				populateSpecimenVoFromOBR(spcVo, null, obr,providerSystem);  // wdev-2367 used to be fillSpecimenFromOBR
				spcVo.setOrder(voOrder);
				spcVo.setPlacerOrdNum(placerOrdNum);
				IfOrderInvestigationVoCollection invColl = new IfOrderInvestigationVoCollection();
				invColl.add(invVo);
				spcVo.setInvestigations(invColl);
				if(invVo.getInvestigation().getEventType().equals(InvEventType.TIME_SERIES))
				{
					spcVo.setWasProcessed(true);
				}
				if ("SN".equals(orc.getOrderControl().getValue()))
				{
					voOrder = ocsIfInbound.saveOrderAsUnprocessed(voOrder);
				}
			}	
			else
			{
				// // wdev-2367 used to be fillSpecimenFromOBR
				if (spcVo.getInvestigationsIsNotNull() && spcVo.getInvestigations().size() > 0)
					populateSpecimenVoFromOBR(spcVo, spcVo.getInvestigations().get(pdCount).getInvestigation(), obr,providerSystem);
				else
					populateSpecimenVoFromOBR(spcVo, null, obr,providerSystem);
			}
			// wdev-2367 20070102 Update the display datetime on all investigations for this specimen
			if (spcVo != null && spcVo.getInvestigationsIsNotNull())
			{
				for (int k=0; k<spcVo.getInvestigations().size(); k++)
				{
					IfOrderInvestigationVo spcInvVo = spcVo.getInvestigations().get(k);
					spcInvVo.setDisplayDateTime(spcVo.getCollDateTimeFiller());
					if (spcInvVo.getDisplayDateTime()==null)
					{
						spcInvVo.setDisplayDateTime(spcVo.getReceivedDateTime());
					}
				}
			}
		}
		
		if (spcVo.getInvestigations().contains(invVo))
			spcVo.getInvestigations().remove(invVo);
		spcVo.getInvestigations().add(invVo);
		
		if(!invVo.getSpecimenIsNotNull())
		{
			invVo.setSpecimen(new IfOrderSpecimenVoCollection());
		}
		if(invVo.getSpecimen().contains(spcVo))
			invVo.getSpecimen().remove(spcVo);
		invVo.getSpecimen().add(spcVo);

		
		if (msg instanceof ORM_O01 || msg instanceof OMG_O19)
		{
			if ("SN".equals(orc.getOrderControl().getValue()))
			{
				invVo.setOrdInvCurrentStatus(createInvStatus(invVo.getOrdInvCurrentStatus(), orc, OrderInvStatus.ORDERED, "New Send Number Order received by HL7 Inbound Engine",providerSystem));
			}
			else
				invVo.setOrdInvCurrentStatus(createInvStatus(invVo.getOrdInvCurrentStatus(),orc, OrderInvStatus.ACCEPTED, "Update Order Message received.",providerSystem));
			//save?
		}
		else if (msg instanceof ORR_O02 || msg instanceof ORG_O20)
		{
			invVo.setOrdInvCurrentStatus(createInvStatus(invVo.getOrdInvCurrentStatus(),orc, null, "Order Response/Status Update message received.",providerSystem));
			//save?
		}

		if (invVo.getOrdInvCurrentStatus()!=null
				&&invVo.getOrdInvCurrentStatus().getOrdInvStatus()!=null
				&&invVo.getOrdInvCurrentStatus().getOrdInvStatus().equals(OrderInvStatus.INPROGRESS_SCH))
		{
			invVo.setAppointmentDate(populateDateTimeVoFromTS(orc.getOrderEffectiveDateTime()));
		}
		
		if (msg instanceof ORU_R01)
		{
			//JME: 20061103: WDEV-2051. 
			IfOrderInvCurrentStatusVo vo = new IfOrderInvCurrentStatusVo();
			vo.setChangeDateTime(populateDateTimeVoFromTS(orc.getDateTimeOfTransaction()));
			if (vo.getChangeDateTime() == null)
				vo.setChangeDateTime(new DateTime());
			vo.setProcessedDateTime(new DateTime());
			vo.setChangeUser("HL7InboundEngine");
			
			//http://jira/browse/WDEV-13061
			String autoAuthorise = HL7Utils.getConfigItem(providerSystemConfigItems, ConfigItems.AutoCheckGPResults);
			if(autoAuthorise!=null&&(autoAuthorise.equalsIgnoreCase("TRUE")||autoAuthorise.equalsIgnoreCase("YES"))
					&&isGPResultMessage(msg))
			{
				vo.setOrdInvStatus(OrderInvStatus.CHECKED);
				vo.setStatusReason("Auto Authorised GP Request");
			}
			else
			{
				vo.setOrdInvStatus(OrderInvStatus.NEW_RESULT);
				String orderControlReason = orc.getOrderControlCodeReason().getIdentifier().getValue(); 
				if (orderControlReason == null)
					orderControlReason = "New Result Received.";
				vo.setStatusReason(orderControlReason);
			}

			invVo.setOrdInvCurrentStatus(vo);

			
			
			invVo.setResultDemographics(getResDemoVoFromSeg(pid, providerSystem));
			
			// get component collection from OBXs
			IfOcsResCompVoCollection componentColl = new IfOcsResCompVoCollection();
			int componentCount = orc_group.getORU_R01_OBXNTEReps();
			for (int k = 0; k < componentCount; k++)
			{
				search.setProviderInvCode(invVo.getInvestigation().getProviderInvCode());
				IfOcsResCompVo compVo = getCompVoFromSeg(orc_group.getORU_R01_OBXNTE(k), search,providerSystem);
				//JME: 20060909: Need to have this field filled for cumulative results reporting
				//obs datetime in path results is actually the specimen collected datetime, 
				//so if not sent in OBX take from specimen record.
				if(compVo!=null) //http://jira/browse/WDEV-14073
				{
					if (compVo.getObsDateTime() == null)
					{
						if (spcVo.getCollDateTimeFiller() != null)
						{
							compVo.setObsDateTime(spcVo.getCollDateTimeFiller());
							compVo.setObsTimeSupplied(spcVo.getColTimeFillerSupplied());
						}
						else
						{
							compVo.setObsDateTime(spcVo.getCollDateTimePlacer());
							compVo.setObsTimeSupplied(Boolean.TRUE);									
						}
					}
					// http://jira/browse/WDEV-15774
					if(spcVo!=null)
					{
						compVo.setSpecimenSource(spcVo.getSpecimenSource());
					}
					if(invVo!=null)
					{
						compVo.setResultSpecimenType(invVo.getResultSpecimenType());
					}
					// End http://jira/browse/WDEV-15774
				componentColl.add(compVo);
				}
			}

			
			
			
			//get or create the path result
			IfResultDetailsVo resultDetails = null;
			
			if(invVo!=null&&invVo.getResultDetails()!=null)
			{
				resultDetails=invVo.getResultDetails();
			}
			else
			{
				resultDetails = new IfResultDetailsVo();
				resultDetails.setType(ResultDetailsType.PATHOLOGY);
				invVo.setResultDetails(resultDetails);
			}
			
			if(resultDetails.getPathologyResultDetails()==null)
			{
				resultDetails.setPathologyResultDetails(new IfOcsPathResultVoCollection());
			}
			IfResultDetailsVo history = new IfResultDetailsVo();
			history.setType(ResultDetailsType.PATHOLOGY);
			history.setPathologyResultDetails(new IfOcsPathResultVoCollection());
			historicResultDetails.add(history);
			
			IfOcsPathResultVo pathResultVo =null;
			
			
			//if DFT
			if (invVo.getInvestigationIsNotNull()
					&&invVo.getInvestigation().getEventTypeIsNotNull()
					&&invVo.getInvestigation().getEventType().equals(InvEventType.TIME_SERIES))
			{
				if(spcVo.getPathResultIsNotNull()&&spcVo.getPathResult().size()>0)
				{
//WDEV-16489
//					pathResultVo=spcVo.getPathResult().get(0);
//					System.out.println("pathResultVo"+pathResultVo.getBoId());
					for (IfOcsPathResultVo pRes : spcVo.getPathResult())
					{
						if(resultDetails.getPathologyResultDetailsIsNotNull()&&resultDetails.getPathologyResultDetails().contains(pRes))
						{
							pathResultVo=pRes;
						}
					}
				}
				if(pathResultVo==null)
				{
					pathResultVo= new IfOcsPathResultVo();
				}
			}
			else // Not a DFT
			{
				if(invVo.getResultDetailsIsNotNull()
						&&invVo.getResultDetails().getPathologyResultDetailsIsNotNull()
						&&invVo.getResultDetails().getPathologyResultDetails().size()>0)
				{
					pathResultVo = invVo.getResultDetails().getPathologyResultDetails().get(0);
				}
				else
				{
					pathResultVo= new IfOcsPathResultVo();
				}
			}
			
			IfOcsPathResultVo historicPathResultVo= new IfOcsPathResultVo();
			
			
			
			history.getPathologyResultDetails().add(historicPathResultVo);
			history.setInvCode(invVo.getInvestigation().getProviderInvCode());
			if(!spcVo.getPathResultIsNotNull())
			{
				spcVo.setPathResult(new IfOcsPathResultVoCollection());
			}
			
			
			invVo.getResultDetails().setType(ResultDetailsType.PATHOLOGY);

//			invVo.getResultDetails().getPathologyResultDetails().add(pathResultVo);
//			
			if(invVo.getResultDetails().getPathologyResultDetails().contains(pathResultVo))
			{
				invVo.getResultDetails().getPathologyResultDetails().remove(pathResultVo);
			}

			fillPathResultDetails(pathResultVo, orc_group, componentColl);
			fillPathResultDetails(historicPathResultVo, orc_group, componentColl);
			pathResultVo.setOrderSpecimen(spcVo);
			
			resultDetails.getPathologyResultDetails().add(pathResultVo);
			spcVo.getPathResult().add(pathResultVo);
				
			// wdev-2397 If the collection already has the same investigation
			// then we want to merge the result details into the one
			if (invResVoColl.contains(invVo))
			{
				IfOrderInvestigationVo voSource = invResVoColl.get(invResVoColl.indexOf(invVo));
				
				// Add the new component details
				IfOcsResCompVoCollection collSource = voSource.getResultDetails().getPathologyResultDetails().get(0).getResultComponents();
				for (int k=0; k<componentColl.size(); k++)
				{
					collSource.add(componentColl.get(k));
				}
					
				IfOcsResCommentVoCollection cmtCollSource = voSource.getResultDetails().getPathologyResultDetails().get(0).getResultComments();
				for (int k=0; k<invVo.getResultDetails().getPathologyResultDetails().get(0).getResultComments().size(); k++)
				{
					cmtCollSource.add(invVo.getResultDetails().getPathologyResultDetails().get(0).getResultComments().get(k));
				}
					
				if (invVo.getResultDetails().getPathologyResultDetails().get(0).getIsAbnormal() != null && invVo.getResultDetails().getPathologyResultDetails().get(0).getIsAbnormal().booleanValue() == true)
					voSource.getResultDetails().getPathologyResultDetails().get(0).setIsAbnormal(invVo.getResultDetails().getPathologyResultDetails().get(0).getIsAbnormal());
				
			}
			else
			{
				invResVoColl.add(invVo);
				//Only save PATH when Specimen fully loaded with all invs
			}
			specResults.add(pathResultVo);
		}
		return spcVo;

	}

	/**
	 * wdev-2367
	 * updateOrderLevelValues
	 * This method will update the Patient Location and Responsible Clinician if they are specified with a result message. 
	 * @param ormMsg
	 * @param obr 
	 * @param orc 
	 * @param voOrder
	 * @param providerSystem
	 * @return 
	 * @return
	 * @throws HL7Exception 
	 * @throws StaleObjectException 
	 */
	private IfOcsOrderVo updateOrderLevelValues(Message ormMsg, ORC orc, OBR obr, IfOcsOrderVo voOrder, ProviderSystemVo providerSystem) throws HL7Exception, StaleObjectException
	{
		PV1 pv1=null;
		if (ormMsg instanceof ORM_O01)
		{
			pv1=((ORM_O01)ormMsg).getORM_O01_PIDPD1NTEPV1PV2IN1IN2IN3GT1AL1().getORM_O01_PV1PV2().getPV1();
		}
		else if (ormMsg instanceof OMG_O19)
		{
			pv1=((OMG_O19)ormMsg).getOMG_O19_PIDPD1NTEPV1PV2IN1IN2IN3GT1AL1().getOMG_O19_PV1PV2().getPV1();
		}
		else if (ormMsg instanceof ORU_R01)
		{
			pv1=((ORU_R01)ormMsg).getORU_R01_PIDPD1NK1NTEPV1PV2ORCOBRNTECTDOBXNTEFT1CTI().getORU_R01_PIDPD1NK1NTEPV1PV2().getORU_R01_PV1PV2().getPV1();
		}

		if (pv1 != null)
		{
			populateLocationVoFromPL(pv1.getAssignedPatientLocation(), voOrder, providerSystem);			
		}

		// ORC-12   Ordering provider
		populateWithOrderingProvider(voOrder, orc, obr, providerSystem);
		
		// wdev-3054 - Removed code that appends value to Additional Clinical Info as now only populated
		// on un-solicited results
		
		String errors[] = voOrder.validate();
		if (errors != null)
			throw new HL7Exception("Validation errors found for order - " + VoMapper.toDisplayString(errors));
		voOrder = ocsIfInbound.saveOrderLevelItems(voOrder);
		return voOrder;
	}

	
	private void populateWithOrderingProvider(IfOcsOrderVo order, ORC orc, OBR obr, ProviderSystemVo providerSystem) throws HL7Exception
	{
		
		XCN orderingProvider=null;
		if (orc.getOrderingProvider(0) != null && orc.getOrderingProvider(0).getIDNumber().getValue() != null)
		{		
			orderingProvider = orc.getOrderingProvider(0);
		}
		if (orderingProvider == null)
		{
			//Need to also check OBR-16   Ordering provider  (XCN)
			if (obr.getOrderingProvider(0) != null && obr.getOrderingProvider(0).getIDNumber().getValue() != null)
			{
				orderingProvider = obr.getOrderingProvider(0);
			}
		}
		
		if (orderingProvider != null)
		{
			HcpLiteVo hcp = populateHcpVoFromXCN(orderingProvider, providerSystem.getCodeSystem());
			if (hcp != null)
			{
				order.setResponsibleClinician(hcp);
				if (!order.getOrderedByIsNotNull())  // wdev-4443
					order.setOrderedBy(hcp.getMos());
			}
			else
			{
				GpShortVo gp = populateGPVoFromXCN(orderingProvider, providerSystem.getCodeSystem());
				if (gp == null)
				{
					// We need to log the fact that the GP is not on our system
					LOG.warn("GP with code " + orderingProvider.getIDNumber() + " was not found on the IMS database");												
				}
				else
				{
					order.setResponsibleGp(gp);
				}
			}
			//WDEV-8884 
			if(ConfigFlag.HL7.REJECT_RESULTS_FOR_UNKNOWN_ORDERINGPROVIDER_OR_LOCATION.getValue())
			{
				// wdev-2746 If Neither Clinician nor GP are populated, reject the message as
				// one or the other are mandatory
				if (orderingProvider.getIDNumber().getValue() != null &&
						!order.getResponsibleClinicianIsNotNull() && !order.getResponsibleGpIsNotNull())
				{
					throw new HL7Exception("Ordering Provider (ORC-12, OBR-16) does not map to a valid Clinician or GP - Message Rejected");
				}
			}
		}

	}
	
	private IfOcsOrderVo processOrderCreation(Message ormMsg, ProviderSystemVo providerSystem, Category orderCategory, ConfigItems[] configItems) throws Exception
	{		
		String sendingApplication = HL7Utils.getSendingApplication(ormMsg);
		if (orderCategory == null)
			throw new HL7Exception("Cannot find provider system for sending Application " + sendingApplication);
		
		
		boolean bPathology = orderCategory.equals(Category.PATHOLOGY);
		
		// Check if this Patient exists, if not, reject the message
		PID pid=null;
		PV1 pv1=null;
		if (ormMsg instanceof ORM_O01)
		{
			pid=((ORM_O01)ormMsg).getORM_O01_PIDPD1NTEPV1PV2IN1IN2IN3GT1AL1().getPID();
			pv1=((ORM_O01)ormMsg).getORM_O01_PIDPD1NTEPV1PV2IN1IN2IN3GT1AL1().getORM_O01_PV1PV2().getPV1();
		}
		else if (ormMsg instanceof OMG_O19)
		{
			pid=((OMG_O19)ormMsg).getOMG_O19_PIDPD1NTEPV1PV2IN1IN2IN3GT1AL1().getPID();
			pv1=((OMG_O19)ormMsg).getOMG_O19_PIDPD1NTEPV1PV2IN1IN2IN3GT1AL1().getOMG_O19_PV1PV2().getPV1();
		}
		else if (ormMsg instanceof ORR_O02)
		{
			pid=((ORR_O02)ormMsg).getORR_O02_PIDNTEORCOBRRQDRQ1RXOODSODTNTECTI().getORR_O02_PIDNTE().getPID();
		}
		else if (ormMsg instanceof ORG_O20)
		{
			pid=((ORG_O20)ormMsg).getORG_O20_PIDNTEORCOBRNTECTI().getORG_O20_PIDNTE().getPID();
		}
		else if (ormMsg instanceof ORU_R01)
		{
			pid=((ORU_R01)ormMsg).getORU_R01_PIDPD1NK1NTEPV1PV2ORCOBRNTECTDOBXNTEFT1CTI().getORU_R01_PIDPD1NK1NTEPV1PV2().getPID();
			pv1=((ORU_R01)ormMsg).getORU_R01_PIDPD1NK1NTEPV1PV2ORCOBRNTECTDOBXNTEFT1CTI().getORU_R01_PIDPD1NK1NTEPV1PV2().getORU_R01_PV1PV2().getPV1(); 
		}
		
		// Populate Patient
		Patient patVo = getPrimaryIdFromPid(pid, providerSystem);
		PatientRefVo patLite = getDemog().getPatientLite(patVo);
		IfOcsOrderVo order = new IfOcsOrderVo();
		Boolean secondaryPatientMatch=false;
		
		if (ConfigFlag.GEN.USE_ORDERING_HOSPITAL_LOCATION.getValue()==true)
		{
			order.setOrderingHospital(getProviderHospital( pid,providerSystem));
		}

		if (patLite == null)
		{
			//Secondary patient search 
			//WDEV-13033 
			String secondaryPatientSearch = HL7Utils.getConfigItem(configItems, ConfigItems.NHSNumberasSecondaryIdentifier);
			if(secondaryPatientSearch!=null&&(secondaryPatientSearch.equalsIgnoreCase("TRUE")||secondaryPatientSearch.equalsIgnoreCase("YES")))
			{
				//Check NHS number and DOB exist in message
				PatientIdCollection ids=getIdentifiersFromPid(pid,providerSystem,PatIdType.NHSN);
				if(ids==null||ids.size()==0)
					throw new HL7Exception("No Identifier of type"+PatIdType.NHSN.getText());

				DateTime dobFromMessage = populateDateTimeVoFromTS(pid.getDateTimeOfBirth());
				patVo.setIdentifiers(ids);
				PatientFilter filter = new PatientFilter();
				filter.setPersId(ids.get(0));
				PatientShortCollection patients= getPSearch().listActivePatients(filter);
				if (patients==null||patients.size()<1)
					throw new HL7Exception("No patients found with NHS number:"+ids.get(0).getValue());
				if(patients.size()>1)
					throw new HL7Exception("Duplicate patients found with NHS number: "+ids.get(0).getValue());
				
				if(patients.get(0).getDob()==null ||dobFromMessage==null||!(new PartialDate(dobFromMessage.getDate())).equals(patients.get(0).getDob()))
				{
					throw new HL7Exception("DOB check failed"+(patVo.getNhsn()!=null&&patVo.getNhsn().getIdValue()!=null?" for NHS Number:"+patVo.getNhsn().getIdValue():""));
				}
				order.setPatient(patients.get(0));
				secondaryPatientMatch=true;
				patLite=patients.get(0);
			}
		}
		if (patLite == null)
		{
			
			// wdev-2945 PatientRegistration is not allowed, reject the message
			String patientRegistration = HL7Utils.getConfigItem(configItems, ConfigItems.EnablePatientRegistration);
			if (patientRegistration != null && !patientRegistration.equalsIgnoreCase("TRUE") && !patientRegistration.equalsIgnoreCase("YES"))
				throw new HL7Exception("Patient not found with idtype = " + patVo.getIdentifiers().get(0).getType().getText() + " and value = " + patVo.getIdentifiers().get(0).getValue());
					
			//throw new HL7Exception("Patient not found with idtype = " + patVo.getIdentifiers().get(0).getType().getText() + " and value = " + patVo.getIdentifiers().get(0).getValue());
			//JME: 20060925: Agreed to perform temp registration of patients to avoid other problems when PAS messages not arriving
			patVo = savePatient(ormMsg, providerSystem);
			order.setPatient(patVo);
		}
		else
		{
			// wdev-2945 - Check whether Patient Matching is required
			String demographicMatch = HL7Utils.getConfigItem(configItems, ConfigItems.EnableDemographicMatching);
			String matchExceptionMessage=null;
			if ((matchExceptionMessage = demographicsMatch(demographicMatch, patLite, pid, providerSystem, null)) != null)
				throw new HL7Exception(matchExceptionMessage);
			
			order.setPatient(patLite);
		}

		HashMap<String, Object> fillerSpecimens = new HashMap<String, Object>();

		IfOrderSpecimenVo specimen = null;		
		IfOrderSpecimenVoCollection specColl = new IfOrderSpecimenVoCollection();

		IfOrderInvestigationVoCollection invColl = new IfOrderInvestigationVoCollection();
		
		int numReps=0;
		if (ormMsg instanceof ORM_O01)
			numReps=((ORM_O01)ormMsg).getORM_O01_ORCOBRRQDRQ1RXOODSODTNTECTDDG1OBXNTEFT1CTIBLGReps();
		else if (ormMsg instanceof OMG_O19)
			numReps=((OMG_O19)ormMsg).getOMG_O19_ORCOBRNTECTDDG1OBXNTEPIDPD1PV1PV2AL1ORCOBRNTECTDOBXNTEFT1CTIBLGReps();
		else if (ormMsg instanceof ORR_O02)
			numReps=((ORR_O02)ormMsg).getORR_O02_PIDNTEORCOBRRQDRQ1RXOODSODTNTECTI().getORR_O02_ORCOBRRQDRQ1RXOODSODTNTECTIReps();	
		else if (ormMsg instanceof ORG_O20)
			numReps=((ORG_O20)ormMsg).getORG_O20_PIDNTEORCOBRNTECTI().getORG_O20_ORCOBRNTECTIReps();
		else if (ormMsg instanceof ORU_R01)
			numReps = ((ORU_R01)ormMsg).getORU_R01_PIDPD1NK1NTEPV1PV2ORCOBRNTECTDOBXNTEFT1CTI().getORU_R01_ORCOBRNTECTDOBXNTEFT1CTIReps();
		
		boolean isResultMessage=(ormMsg instanceof ORU_R01?true:false);
		
		boolean sendNumber=false;
		for (int i=0; i<numReps; i++)
		{
			ORC orc=null;
			OBR obr=null;
			NTE nte=null;
			if (ormMsg instanceof ORM_O01)
			{
				orc = ((ORM_O01)ormMsg).getORM_O01_ORCOBRRQDRQ1RXOODSODTNTECTDDG1OBXNTEFT1CTIBLG(i).getORC();
				obr = ((ORM_O01)ormMsg).getORM_O01_ORCOBRRQDRQ1RXOODSODTNTECTDDG1OBXNTEFT1CTIBLG(i).getORM_O01_OBRRQDRQ1RXOODSODTNTECTDDG1OBXNTE().getOBR();
				nte = ((ORM_O01)ormMsg).getORM_O01_ORCOBRRQDRQ1RXOODSODTNTECTDDG1OBXNTEFT1CTIBLG(i).getORM_O01_OBRRQDRQ1RXOODSODTNTECTDDG1OBXNTE().getNTE();				
			}
			else if (ormMsg instanceof OMG_O19)
			{
				orc = ((OMG_O19)ormMsg).getOMG_O19_ORCOBRNTECTDDG1OBXNTEPIDPD1PV1PV2AL1ORCOBRNTECTDOBXNTEFT1CTIBLG(i).getORC();
				obr = ((OMG_O19)ormMsg).getOMG_O19_ORCOBRNTECTDDG1OBXNTEPIDPD1PV1PV2AL1ORCOBRNTECTDOBXNTEFT1CTIBLG(i).getOBR();
				nte = ((OMG_O19)ormMsg).getOMG_O19_ORCOBRNTECTDDG1OBXNTEPIDPD1PV1PV2AL1ORCOBRNTECTDOBXNTEFT1CTIBLG(i).getNTE();
			}
			else if (ormMsg instanceof ORR_O02)
			{
				 orc = ((ORR_O02)ormMsg).getORR_O02_PIDNTEORCOBRRQDRQ1RXOODSODTNTECTI().getORR_O02_ORCOBRRQDRQ1RXOODSODTNTECTI(i).getORC();
				 obr = ((ORR_O02)ormMsg).getORR_O02_PIDNTEORCOBRRQDRQ1RXOODSODTNTECTI().getORR_O02_ORCOBRRQDRQ1RXOODSODTNTECTI(i).getOBR();
				 nte = ((ORR_O02)ormMsg).getORR_O02_PIDNTEORCOBRRQDRQ1RXOODSODTNTECTI().getORR_O02_ORCOBRRQDRQ1RXOODSODTNTECTI(i).getNTE();
			}
			else if (ormMsg instanceof ORG_O20)
			{
				 orc = ((ORG_O20)ormMsg).getORG_O20_PIDNTEORCOBRNTECTI().getORG_O20_ORCOBRNTECTI(i).getORC();
				 obr = ((ORG_O20)ormMsg).getORG_O20_PIDNTEORCOBRNTECTI().getORG_O20_ORCOBRNTECTI(i).getOBR();
				 nte = ((ORG_O20)ormMsg).getORG_O20_PIDNTEORCOBRNTECTI().getORG_O20_ORCOBRNTECTI(i).getNTE();
			}
			else if (ormMsg instanceof ORU_R01)
			{
				 orc = ((ORU_R01)ormMsg).getORU_R01_PIDPD1NK1NTEPV1PV2ORCOBRNTECTDOBXNTEFT1CTI().getORU_R01_ORCOBRNTECTDOBXNTEFT1CTI(i).getORC();
				 obr = ((ORU_R01)ormMsg).getORU_R01_PIDPD1NK1NTEPV1PV2ORCOBRNTECTDOBXNTEFT1CTI().getORU_R01_ORCOBRNTECTDOBXNTEFT1CTI(i).getOBR();
				 nte = ((ORU_R01)ormMsg).getORU_R01_PIDPD1NK1NTEPV1PV2ORCOBRNTECTDOBXNTEFT1CTI().getORU_R01_ORCOBRNTECTDOBXNTEFT1CTI(i).getNTE();
			}
			
			if (i == 0)
			{
				// OBR-30   Transportation mode
				order.setPatMobility((OrderPatMobility)svc.getLocalLookup(OrderPatMobility.class, OrderPatMobility.TYPE_ID, providerSystem.getCodeSystem().getText(),obr.getTransportationMode().getValue()));
			}
			
			if ("SN".equals(orc.getOrderControl().getValue()))
			{
				sendNumber=true;
			}

			IfOrderInvestigationVo investigation=null;
			if (bPathology)
				investigation = populatePATHInvestigationVoFromOBR(obr, sendingApplication, specimen, fillerSpecimens, specColl, providerSystem,isResultMessage);
			else
			{
				investigation = populateRADInvestigationVoFromOBR(obr, sendingApplication, providerSystem);
				
				// wdev-3265 If display date/time is not set at this stage, check ORC-9
				if (!investigation.getDisplayDateTimeIsNotNull())
				{
					if (orc.getDateTimeOfTransaction() != null && orc.getDateTimeOfTransaction().getTimeOfAnEvent().getValue() != null)
					{
						investigation.setDisplayDateTime(populateDateTimeVoFromTS(orc.getDateTimeOfTransaction()));
						investigation.setDisplayFlag(OcsDisplayFlag.REQUESTED);
						investigation.setDisplayTimeSupplied( Boolean.valueOf(isTimeSupplied(orc.getDateTimeOfTransaction())));
					}
				}
			}
			investigation.setWasSecondaryMatchingUsed(secondaryPatientMatch);

			// wdev-3312 Set Appointment Date if a value is supplied
			if (orc.getOrderEffectiveDateTime() != null)
			{
				investigation.setAppointmentDate(populateDateTimeVoFromTS(orc.getOrderEffectiveDateTime()));
			}

			
			// Create the current status record
			if(sendNumber)
			{
				investigation.setOrdInvCurrentStatus(createInvStatus(investigation.getOrdInvCurrentStatus(), orc, OrderInvStatus.ORDERED, "New Send Number Order received by HL7 Inbound Engine",providerSystem));
			}
			else
			{
				investigation.setOrdInvCurrentStatus(createInvStatus(investigation.getOrdInvCurrentStatus(), orc, OrderInvStatus.ACCEPTED, "New Order received by HL7 Inbound Engine",providerSystem));
			}
			investigation.setOrdInvSeq( Integer.valueOf(i+1));
			
			if (orc.getEnteredBy(0) != null)
			{
				// ORC-10   Entered by   
				order.setOrderedBy(populateMemberOfStaffShortVoFromXCN(orc.getEnteredBy(0), providerSystem.getCodeSystem()));
			}
				
			populateWithOrderingProvider(order, orc, obr, providerSystem);
			order.setAdditClinNotes("");
			// WDEV-6790
			// Check for NTE segments
			// forcing first NTE to have text
			StringBuffer nte_notes = new StringBuffer();
			
			if (nte != null && nte.getComment(0).getValue() != null)
			{
				int nte_ix=0;
				
				// WDEV-11712 ClassCastException - need to check proper message type
				if (ormMsg instanceof ORM_O01)
				{
					nte_ix = ((ORM_O01)ormMsg).getORM_O01_ORCOBRRQDRQ1RXOODSODTNTECTDDG1OBXNTEFT1CTIBLG(i).getORM_O01_OBRRQDRQ1RXOODSODTNTECTDDG1OBXNTE().getNTEReps();				
				}
				else if (ormMsg instanceof OMG_O19)
				{
					nte_ix = ((OMG_O19)ormMsg).getOMG_O19_ORCOBRNTECTDDG1OBXNTEPIDPD1PV1PV2AL1ORCOBRNTECTDOBXNTEFT1CTIBLG(i).getNTEReps();
				}
				else if (ormMsg instanceof ORU_R01)
				{
					nte_ix = ((ORU_R01)ormMsg).getORU_R01_PIDPD1NK1NTEPV1PV2ORCOBRNTECTDOBXNTEFT1CTI(i).getORU_R01_ORCOBRNTECTDOBXNTEFT1CTI().getNTEReps();
				}
				else
					nte_ix = 0;
								
				for (int j = 0; j < nte_ix; j++)			
				{
					// WDEV-11712 ClassCastException - need to check proper message type
					if (ormMsg instanceof ORM_O01)
					{
						nte = ((ORM_O01)ormMsg).getORM_O01_ORCOBRRQDRQ1RXOODSODTNTECTDDG1OBXNTEFT1CTIBLG(i).getORM_O01_OBRRQDRQ1RXOODSODTNTECTDDG1OBXNTE().getNTE(j);					}
					else if (ormMsg instanceof OMG_O19)
					{
						nte = ((OMG_O19)ormMsg).getOMG_O19_ORCOBRNTECTDDG1OBXNTEPIDPD1PV1PV2AL1ORCOBRNTECTDOBXNTEFT1CTIBLG(i).getNTE(j);
					}
					else if (ormMsg instanceof ORU_R01)
					{
						nte = ((ORU_R01)ormMsg).getORU_R01_PIDPD1NK1NTEPV1PV2ORCOBRNTECTDOBXNTEFT1CTI(i).getORU_R01_ORCOBRNTECTDOBXNTEFT1CTI().getNTE(j);
					}
					else
						nte=null;
					
					if (nte != null)
					{
						for (int k = 0; k < nte.getComment().length;k++)					
							nte_notes.append(HL7Utils.fromHL7Text(nte.getComment(k).getValue())+ "\n");
					}
				}				
				order.setAdditClinNotes(nte_notes.toString());
			}
			
			if (obr.getRelevantClinicalInfo().getValue() != null)
			{
				if (order.getAdditClinNotes() != null && order.getAdditClinNotes().length() > 0)
					order.setAdditClinNotes(order.getAdditClinNotes() + " " + obr.getRelevantClinicalInfo().getValue());
				else
					order.setAdditClinNotes(obr.getRelevantClinicalInfo().getValue());
			}
			investigation.setOrderDetails(order);
			invColl.add(investigation);
		}
		
				order.setSpecimens(specColl);
		order.setInvestigations(invColl);
		
		// Set Mandatory items
		order.setClinicalTrial(Boolean.FALSE);
		
		String sendNumberConfigItem = HL7Utils.getConfigItem(configItems, ConfigItems.SupportSendNumber);
		
		if (sendNumberConfigItem == null || (!sendNumberConfigItem.equalsIgnoreCase("TRUE") && !sendNumberConfigItem.equalsIgnoreCase("YES"))
				||(ormMsg instanceof ORU_R01)||!sendNumber)
		{
			order.setWasProcessed(Boolean.TRUE);  // As we don't want the outbound engine to pick it up
		}
		else
		{
				order.setWasProcessed(Boolean.FALSE);  // As we do want the outbound engine to pick it up
				order.setAuthorisationOrderStatus(AuthorisationOrderStatus.AUTHORISED);
				order.setSendNumber(Boolean.TRUE);
		}
		
		if (pv1 != null)
		{
			populateLocationVoFromPL(pv1.getAssignedPatientLocation(), order, providerSystem);
			
			// wdev-2746 Get the Order Category
			if (!bPathology && pv1.getPatientClass() != null && pv1.getPatientClass().getValue() != null)
			{
				order.setOrderCategory((OrderCategory)svc.getLocalLookup(OrderCategory.class, OrderCategory.TYPE_ID, providerSystem.getCodeSystem().getText(), pv1.getPatientClass().getValue()));
			}
			else if (bPathology && pv1.getPatientType() != null && pv1.getPatientType().getValue() != null)
			{
				order.setOrderCategory((OrderCategory)svc.getLocalLookup(OrderCategory.class, OrderCategory.TYPE_ID, providerSystem.getCodeSystem().getText(), pv1.getPatientType().getValue()));
			}

		}
		if(order.getSpecimensIsNotNull())
		{
			for (IfOrdSpecLiteVo  ifOrderSpecimenVo : order.getSpecimens())
			{
				String token = "Do not use:" + (Double.valueOf(Math.random()*10000).toString().substring(0,4));
				ifOrderSpecimenVo.setPlacerOrdNum(token);
			}
		}
		
		String errors[] = order.validate();
		if (errors != null)
			throw new HL7Exception("Validation errors found for order - " + VoMapper.toDisplayString(errors));
		return ocsIfInbound.saveOrder(order);
	}

	private LocSiteRefVo getProviderHospital(PID pid,ProviderSystemVo providerSystem) throws HL7Exception
	{
		//Get PASID from message should be only one
		CX[] idList=pid.getPatientIdentifierList();
		String pasidValue=null;
		for(int i = 0; i < idList.length; i++)
		{
			String idType;
			if (providerSystem.getIdtypeComponent().intValue() == 4)
			{
				idType = idList[i].getAssigningAuthority().getNamespaceID().getValue();
			}
			else
			{
				idType = idList[i].getIdentifierTypeCode().getValue();
			}
				
			if (idType == null)
			{
				throw new HL7Exception("Identifier type code must be sent in the configured component C" + providerSystem.getIdtypeComponent() + " for all repetitions of CX.");
			}
			
			// If the value is null then move to the next in the list
			String idVal = idList[i].getID().getValue();
			if (idVal == null)
				continue;
			
			PatIdType providedType = (PatIdType) getDemog().getLookupService().getLocalLookup(PatIdType.class, PatIdType.TYPE_ID, providerSystem.getCodeSystem().getText(), idType);
			if (PatIdType.PASID.equals( providedType))
					{
						pasidValue=idVal;
						break;
					}
		}
		
		// Now try and match the location
		LocSiteLiteMappingsVoCollection locSiteMappings= careContextSelectDialog.listLocSites();
		for (LocSiteLiteMappingsVo locSiteLiteMappingsVo : locSiteMappings)
		{
			if(pasidValue!=null&&pasidValue.startsWith(locSiteLiteMappingsVo.getPathMapping()))
			{
				return(locSiteLiteMappingsVo.getProviderHospital());
			}
		}
		return null; // Could not find it
	}
	
	
	private void processChangeInvestigation(ORC orc,OBR obr,String hl7App,IfOcsOrderVo voOrder,String placerOrdNum, String fillerOrdNum,ProviderSystemVo providerSystem) throws Exception
	{
		
		
		String statusMsg=null;
		IfOrderInvestigationVo invVo=null;
		invVo=getInvFromOrderVoAndMessage(voOrder,placerOrdNum,fillerOrdNum);

		// add check to make sure it is not already resulted
		
		//Try and get the new investigation
		String providerInvCode = obr.getUniversalServiceIdentifier().getIdentifier().getValue();
		if(null==providerInvCode)
		{
			// Generate a Change unacceptable message not a NAK
			statusMsg="Investigation code must be present in Universal Service Identifier OBR-4";
			invVo.setOrdInvCurrentStatus(createInvStatus(invVo.getOrdInvCurrentStatus(),orc,OrderInvStatus.PROVIDER_CHANGE_REJECTED, statusMsg,providerSystem));
			String errors[] = invVo.validate();
			if (errors != null)
			{
				throw new HL7Exception("Validation of invVo failed. " + VoMapper.toDisplayString(errors));				
			}
			ocsIfInbound.saveOrderInvestigation(invVo,true,providerSystem);	
			throw new HL7Exception(statusMsg);
		}
		IfInvestigationLiteVo cfgInv=null;
		IfProviderInvSearchVo search = new IfProviderInvSearchVo();

		String serviceCode = obr.getDiagnosticServSectID().getValue();
		ServiceShortVo discip = ocsIfInbound.getServiceByTaxonomy(serviceCode, providerSystem.getCodeSystem());
		ServiceShortVoCollection serviceColl=null;
		 
		if (discip == null)
		{
			// The service wasn't found, let's see if this value is used as an alternative service code,
			// if so, get the list of services matching it and see if we can get the investigation based on it
			serviceColl = ocsIfInbound.listServicesWithAlternateCode(serviceCode);
			if (serviceColl != null && serviceColl.size() > 0)
			{
				// Set to the first service, though we may need to reference the others later
				discip = serviceColl.get(0);
				LOG.debug("Discipline set to Alternate Service Code " + discip);
			}
			else 
			{
				statusMsg="Service could not be found for service code: " + serviceCode + ", ProviderSystem: " + hl7App;
				invVo.setOrdInvCurrentStatus(createInvStatus(invVo.getOrdInvCurrentStatus(),orc,OrderInvStatus.PROVIDER_CHANGE_REJECTED, statusMsg,providerSystem));
				String errors[] = invVo.validate();
				if (errors != null)
				{
					throw new HL7Exception("Validation of invVo failed. " + VoMapper.toDisplayString(errors));				
				}
				voOrder.setWasProcessed(Boolean.FALSE);
				ocsIfInbound.saveOrderInvestigation(invVo,true,providerSystem);	
				throw new HL7Exception(statusMsg);
			}
		}
		
		search.setProviderInvCode(providerInvCode);
		search.setHl7App(hl7App);
		search.setProvider(providerSystem);
		search.setService(discip);
		
		cfgInv = ocsIfInbound.getInvestigationByHl7AppInvAndService(search);
		if (cfgInv == null)
		{
			// Generate a Change unacceptable message not a NAK
			statusMsg="Investigation could not be found for ProviderInvCode:" + providerInvCode + ", ProviderSystem:" + hl7App;
			invVo.setOrdInvCurrentStatus(createInvStatus(invVo.getOrdInvCurrentStatus(),orc,OrderInvStatus.PROVIDER_CHANGE_REJECTED, statusMsg,providerSystem));
			String errors[] = invVo.validate();
			if (errors != null)
			{
				throw new HL7Exception("Validation of invVo failed. " + VoMapper.toDisplayString(errors));				
			}
			ocsIfInbound.saveOrderInvestigation(invVo,true,providerSystem);	
			return;
		}
		
		//if the new service is not the same as the old service check the flag and reject change 
		IfInvestigationLiteVo oldInv =  invVo.getInvestigation();
		if(!ConfigFlag.HL7.ALLOW_XO_CHANGE_INV_TO_NEW_SERVICE.getValue())
		{
			ServiceShortVo oldService=ocsIf.getService(oldInv);
			ServiceShortVo newService=ocsIf.getService(cfgInv);
			if(!newService.getBoId().equals(oldService.getBoId()))
			{
				statusMsg="New Investigation must have the same modality.";
				invVo.setOrdInvCurrentStatus(createInvStatus(invVo.getOrdInvCurrentStatus(),orc,OrderInvStatus.PROVIDER_CHANGE_REJECTED, statusMsg,providerSystem));
				String errors[] = invVo.validate();
				if (errors != null)
				{
					throw new HL7Exception("Validation of invVo failed. " + VoMapper.toDisplayString(errors));				
				}
				ocsIfInbound.saveOrderInvestigation(invVo,true,providerSystem);	
				return;
			}
		}
		
		//http://jira/browse/WDEV-12499 Dont change the inv if it is the same 
		if ((cfgInv!=null)&&(oldInv!=null)&&(!(cfgInv.getBoId().equals(oldInv.getBoId())))) // Inv changed
		{	
			invVo.setInvestigation(cfgInv);
			//28 Feb 2011 13:44 Order changed from X-ray Knee Left to X-ray Knee Right by RADSYS (Changed)
			statusMsg= "Order changed from "+oldInv.getInvestigationIndex().getName()+" to "+cfgInv.getInvestigationIndex().getName()+" by "+providerSystem.getSystemName();
			invVo.setOrdInvCurrentStatus(createInvStatus(invVo.getOrdInvCurrentStatus(),orc,OrderInvStatus.CHANGED, statusMsg,providerSystem));
	
			String errors[] = invVo.validate();
			if (errors != null)
			{
				throw new HL7Exception("Validation of invVo failed. " + VoMapper.toDisplayString(errors));				
			}
			invVo=ocsIfInbound.saveOrderInvestigation(invVo,true,providerSystem);
		}
		//http://jira/browse/WDEV-12499 Update the appointment dt if it changed 
		DateTime dateTimefromMsg = populateDateTimeVoFromTS(orc.getOrderEffectiveDateTime());
		DateTime appointmentDateTime = invVo.getAppointmentDate();
		
		if ((dateTimefromMsg!=null)&&!dateTimefromMsg.equals(appointmentDateTime))
		{
			invVo.setAppointmentDate(dateTimefromMsg);
			statusMsg= "Order appointment changed to "+dateTimefromMsg+" by "+providerSystem.getSystemName();
			invVo.setOrdInvCurrentStatus(createInvStatus(invVo.getOrdInvCurrentStatus(),orc,OrderInvStatus.CHANGED, statusMsg,providerSystem));

			String errors[] = invVo.validate();
			if (errors != null)
			{
				throw new HL7Exception("Validation of invVo failed. " + VoMapper.toDisplayString(errors));				
			}
			ocsIfInbound.saveOrderInvestigation(invVo,true,providerSystem);
		}
		else // default don't change anything but accept message i.e. room change
		{
			statusMsg= "No change recorded for XO message from "+providerSystem.getSystemName();
			invVo.setOrdInvCurrentStatus(createInvStatus(invVo.getOrdInvCurrentStatus(),orc,OrderInvStatus.CHANGED, statusMsg,providerSystem));

			String errors[] = invVo.validate();
			if (errors != null)
			{
				throw new HL7Exception("Validation of invVo failed. " + VoMapper.toDisplayString(errors));				
			}
			ocsIfInbound.saveOrderInvestigation(invVo,true,providerSystem);
			
		}
	}
	
	
	private String demographicsMatch(String demographicMatch, PatientRefVo patId, PID pid, ProviderSystemVo providerSystem, IfOcsOrderVo voOrder) throws HL7Exception
	{
		if (demographicMatch == null || (!demographicMatch.equalsIgnoreCase("TRUE") && !demographicMatch.equalsIgnoreCase("YES")))
			return null;
		
		PatientShort dbPatient = getDemog().getPatientShort(patId); // We need to do this to get the nhsn
		String dbSurname=null;
		String dbForename=null;
		if (dbPatient.getNameIsNotNull())
		{
			dbSurname = dbPatient.getName().getSurname();
			dbForename = dbPatient.getName().getForename();
		}
		PartialDate dbDob = dbPatient.getDob();
		
		Patient msgPatient = new Patient();
		msgPatient = populatePatientFromPID(msgPatient, pid, providerSystem);
		
		String msgSurname=null;
		String msgForename=null;
		if (msgPatient.getNameIsNotNull())
		{
			msgSurname= msgPatient.getName().getSurname();
			msgForename = msgPatient.getName().getForename();
		}
		PartialDate msgDob = msgPatient.getDob();
		
		// wdev-3151 Ensure that the Primary Identifier for the Provider System is matched
		PatIdType primaryId = providerSystem.getPrimaryPatientId();
		if (primaryId == null)
			primaryId = PatIdType.DISTRICT;
		
		Patient mergedPatient=null;
		String mergeDbSurname=null, mergeDbForename=null;
		PartialDate mergeDbDob=null;
		Sex mergeDbSex=null;
		PatientId mergeDbPrimaryId=null, mergeDbNhsn=null;
		
//		 wdev-3645 - We only want to perform the demographicsMatch if this is a solicited order
		if (voOrder != null && solicitedOrder(voOrder))
		{
			// wdev-3645 Allow for merged patients too - check this first - if merged patient
			// 	is not null, we can validate against both the current db and merged patient
			mergedPatient = demog.getMergedPatient(msgPatient);
		
			if (mergedPatient != null)
			{
				mergeDbSurname=mergedPatient.getName().getSurname();
				mergeDbForename=mergedPatient.getName().getForename();
				mergeDbDob=mergedPatient.getDob();
				mergeDbSex=mergedPatient.getSex();
				mergeDbPrimaryId = mergedPatient.getPatientIdentifier(primaryId);
				mergeDbNhsn = mergedPatient.getPatientIdentifier(PatIdType.NHSN);
			}
		}
				
		if ((msgSurname != null && dbSurname == null) || (msgSurname == null && dbSurname != null) || (msgSurname != null && dbSurname != null && !msgSurname.equalsIgnoreCase(dbSurname)))
		{
			if (mergedPatient == null || ((msgSurname != null && mergeDbSurname == null) || (msgSurname == null && mergeDbSurname != null) || (msgSurname != null && mergeDbSurname != null && !msgSurname.equalsIgnoreCase(mergeDbSurname))))
				return "Demographics Mismatch on Patient Surname";
		}
		if ((msgForename != null && dbForename == null) || (msgForename == null && dbForename != null) || (msgForename != null && dbForename != null && !msgForename.equalsIgnoreCase(dbForename))) 
		{
			if (mergedPatient == null ||((msgForename != null && mergeDbForename == null) || (msgForename == null && mergeDbForename != null) || (msgForename != null && mergeDbForename != null && !msgForename.equalsIgnoreCase(mergeDbForename))))
				return "Demographics Mismatch on Patient Forename";
		}
		if ((msgDob != null && dbDob == null) || (msgDob == null && dbDob != null) || (msgDob != null && dbDob != null && !msgDob.equals(dbDob))) 
		{
			if (mergedPatient == null || ((msgDob != null && mergeDbDob == null) || (msgDob == null && mergeDbDob != null) || (msgDob != null && mergeDbDob != null && !msgDob.equals(mergeDbDob))))
				return "Demographics Mismatch on Patient Date of Birth";
		}
		
		
		PatientId msgPrimaryId = msgPatient.getPatientIdentifier(primaryId);
		PatientId dbPrimaryId = dbPatient.getPatientIdentifier(primaryId);

		PatientId msgNhsn = msgPatient.getPatId(PatIdType.NHSN);
		PatientId dbNhsn=null;
		if (dbPatient != null)
			dbNhsn = dbPatient.getPatId(PatIdType.NHSN);
		
		String msgNhsnValue=null;
		String dbNhsnValue=null;
		String mergeDbNhsnValue=null;
		if (dbNhsn != null)
			dbNhsnValue = dbNhsn.getValue();
		if (msgNhsn != null)
			msgNhsnValue = msgNhsn.getValue();
		if (mergeDbNhsn != null)
			mergeDbNhsnValue = mergeDbNhsn.getValue();
		
		
		if ((msgPrimaryId != null && dbPrimaryId != null && !msgPrimaryId.getValue().equalsIgnoreCase(dbPrimaryId.getValue())))
		{
			if (mergedPatient == null || (msgPrimaryId != null && mergeDbPrimaryId != null && !msgPrimaryId.getValue().equalsIgnoreCase(mergeDbPrimaryId.getValue())))
				return "Demographics Mismatch on Primary Patient Identifier " + primaryId.getText();
		}
		
		
		// We now check for sex and nhsn.  If one side has a value and the other doesn't, we let it continue
		Sex dbSex = dbPatient.getSex();
		Sex msgSex = msgPatient.getSex();
		if (dbSex != null && msgSex != null && !dbSex.equals(msgSex))
		{
			 if (mergedPatient == null || (mergeDbSex != null && msgSex != null && !mergeDbSex.equals(msgSex)))
				return "Demographics Mismatch on Patient Sex";
		}

		if (dbNhsnValue != null && msgNhsnValue != null && !dbNhsnValue.equals(msgNhsnValue))
		{
			 if (mergedPatient == null || (mergeDbNhsnValue != null && msgNhsnValue != null && !mergeDbNhsnValue.equals(msgNhsnValue))) 
				 return "Demographics Mismatch on Patient NHS Number";
		}

		// Demographics Match
		return null;
	}

	private IfOrdSpecLiteVo populateSpecimenVoFromOBR(IfOrdSpecLiteVo ordSpc, IfInvestigationLiteVo inv, OBR obr,ProviderSystemVo providerSystem) throws Exception
	{
		// OBR-7   Specimen collected date/time   
		ordSpc.setCollDateTimeFiller(populateDateTimeVoFromTS(obr.getObservationDateTime()));
		ordSpc.setColTimeFillerSupplied( Boolean.valueOf(isTimeSupplied(obr.getObservationDateTime())));
		ordSpc.setCollDateTimePlacer(ordSpc.getCollDateTimeFiller());

		// OBR-14   Specimen received date/time   
		ordSpc.setReceivedDateTime(populateDateTimeVoFromTS(obr.getSpecimenReceivedDateTime()));
		ordSpc.setReceivedTimeSupplied( Boolean.valueOf(isTimeSupplied(obr.getSpecimenReceivedDateTime())));
		
		//OBR-22 WDEV-16410
		ordSpc.setDftSpecimenResulted(populateDateTimeVoFromTS(obr.getResultsRptStatusChngDateTime()));
		ordSpc.setDftSpecimenResultedTimeSupplied(Boolean.valueOf(isTimeSupplied(obr.getResultsRptStatusChngDateTime())));
		
		// OBR-3   Filler order number   
		ordSpc.setFillerOrdNum(obr.getFillerOrderNumber().getEntityIdentifier().getValue());
		
		// OBR-24   Diagnostic serv sect ID   
		// wdev-2367 Check for alternate codes too
		String serviceCode = obr.getDiagnosticServSectID().getValue();
		if (serviceCode != null)
		{
			ServiceShortVoCollection serviceColl=null;
			ServiceShortVo discip =ocsIfInbound.getServiceByTaxonomy(obr.getDiagnosticServSectID().getValue(), providerSystem.getCodeSystem());
			if (discip == null)
			{
				// The service wasn't found, let's see if this value is used as an alternative service code,
				// if so, get the list of services matching it and see if we can get the investigation based on it
				serviceColl = ocsIfInbound.listServicesWithAlternateCode(serviceCode);
				if (serviceColl != null && serviceColl.size() > 0)
				{
					// Set to the first service, though we may need to reference the others later
					discip = serviceColl.get(0);
					LOG.debug("Disclipline set to Alternate Service Code " + discip);
				}
			}
			ordSpc.setDiscipline(discip);
		}
		
		if (ordSpc.getIsAwaitingCollection() == null)
			ordSpc.setIsAwaitingCollection(Boolean.FALSE);

		if (ordSpc.getIsPatientCollect() == null)	
			ordSpc.setIsPatientCollect(Boolean.FALSE);
		
		// wdev-2397 If the investigation's requiresSite value is set to true
		// then we want to set the specimenSource to the value associated with
		// the invesitgation and set the siteCode to the value in the specimen source
		// 	OBR-15   Specimen source   
		SPS sps = obr.getSpecimenSource();
		
		//START http://jira/browse/WDEV-11635
		//http://jira/browse/WDEV-11733 Changed the Order of these calls
		LookupInstVo resultSpecimenSource=svc.getLocalLookup(LookupInstVo.class, SpecimenType.TYPE_ID, providerSystem.getCodeSystem().getText(), sps.getSpecimenSourceNameOrCode().getIdentifier().getValue().trim()); 
		if(resultSpecimenSource==null)
		{
			resultSpecimenSource= svc.getLocalLookup(LookupInstVo.class, ResultSpecimenTypes.TYPE_ID, providerSystem.getCodeSystem().getText(), sps.getSpecimenSourceNameOrCode().getIdentifier().getValue().trim());
		}
//WDEV-15552 		ordSpc.setResultSpecimenSource(resultSpecimenSource);
		//END http://jira/browse/WDEV-11635		
		
		if (inv != null && inv.getInvestigationIndex().getRequiresSiteSpecifierIsNotNull() && inv.getInvestigationIndex().getRequiresSiteSpecifier().booleanValue() == true 
					&& inv.getPathInvDetailsIsNotNull() && !ordSpc.getSpecimenSourceIsNotNull())
		{
			ordSpc.setSpecimenSource(inv.getPathInvDetails().getSpecimens().get(0).getType());
//WDEV-15552 			ordSpc.setResultSpecimenSource(inv.getPathInvDetails().getSpecimenType());
 
			
			String useSiteAndSource = HL7Utils.getConfigItem(toConfigItemArray(providerSystem.getConfigItems()), ConfigItems.useSiteAndSource);
			String siteFromMessage=null;
			if (useSiteAndSource!=null&&(useSiteAndSource.equalsIgnoreCase("TRUE")||useSiteAndSource.equalsIgnoreCase("YES"))
					&&(sps.getBodySite().getIdentifier().getValue()!=null))
			{
				siteFromMessage=sps.getBodySite().getIdentifier().getValue().trim();
			}
			else
			{
				siteFromMessage=sps.getSpecimenSourceNameOrCode().getIdentifier().getValue().trim();
			}
			ordSpc.setSiteCd( (SpecimenSite) svc.getLocalLookup(SpecimenSite.class, SpecimenSite.TYPE_ID, providerSystem.getCodeSystem().getText(), siteFromMessage));
		}
		else
		{
			if (sps != null && !ordSpc.getSpecimenSourceIsNotNull())
			{
				// if this is a result message and the message specimen source is a result specimen get the 1st
				//specimen that matches that result specimen and and populate that into the specimen 
				
				//http://jira/browse/WDEV-14059
				// Get specimen source from configured Inv
				if(inv!=null&&inv.getPathInvDetailsIsNotNull()&&inv.getPathInvDetails().getSpecimens().get(0).getTypeIsNotNull())
				{
					ordSpc.setSpecimenSource(inv.getPathInvDetails().getSpecimens().get(0).getType());
				}
				// Try from Message
				else if(sps.getSpecimenSourceNameOrCode().getIdentifier().getValue()!=null)
				{
					SpecimenType sTypeFromMsg=(SpecimenType)svc.getLocalLookup(SpecimenType.class, SpecimenType.TYPE_ID, providerSystem.getCodeSystem().getText(), sps.getSpecimenSourceNameOrCode().getIdentifier().getValue().trim()); 
					if(sTypeFromMsg==null)
					{
						ResultSpecimenTypes rlookup=(ResultSpecimenTypes)svc.getLocalLookup(ResultSpecimenTypes.class, ResultSpecimenTypes.TYPE_ID, providerSystem.getCodeSystem().getText(), sps.getSpecimenSourceNameOrCode().getIdentifier().getValue().trim());
						sTypeFromMsg=ocsIfInbound.getFirstSpecimenTypeForResultSpecimenType(rlookup);
					}
					ordSpc.setSpecimenSource(sTypeFromMsg);
				}
			}
		}	
		
		//http://jira/browse/WDEV-16978 if the site is in the message save it!
		if (sps!=null && sps.getBodySite().getIdentifier().getValue() != null)
		{
			ordSpc.setSiteCd((SpecimenSite) svc.getLocalLookup(SpecimenSite.class, SpecimenSite.TYPE_ID, providerSystem.getCodeSystem().getText(), sps.getBodySite().getIdentifier().getValue().trim()));				
		}

		
		if (ordSpc.getCollectorComment() == null)
		{
			ordSpc.setCollectorComment(formatCommentsList(obr.getCollectorSComment(), "\r"));					
		}
		
		return ordSpc;
	}
	
	
	private IfOrderInvestigationVo populateRADInvestigationVoFromOBR(OBR obr, String sendingApplication, ProviderSystemVo providerSystem) throws Exception
	{
		IfOrderInvestigationVo orderInvVo = new IfOrderInvestigationVo();
		
		String providerInvCode = obr.getUniversalServiceIdentifier().getIdentifier().getValue();
		
		// wdev-2397 specimen source is now part of the search criteria to get the investigation
		SPS sps = obr.getSpecimenSource();

		IfProviderInvSearchVo search = new IfProviderInvSearchVo();
		search.setProviderInvCode(providerInvCode);
		search.setProvider(providerSystem);
		search.setHl7App(sendingApplication);
		search.setSpecimenSource(sps.getSpecimenSourceNameOrCode().getIdentifier().getValue());
		IfInvestigationLiteVo invVo = ocsIfInbound.getInvestigationByHl7AppInvAndService(search);
		if (invVo == null)
			throw new HL7Exception("Investigation not found for provider system and providerInvCode = " + providerInvCode);
		
		
		fillRADInvestigationFromOBR(orderInvVo, obr, invVo,providerSystem);
		
			// OBR-27   Quantity/timing
		// wdev-2746 - If obr-27 is not populated, we can check obr-5
		String priority = obr.getQuantityTiming(0).getPriority().getValue();
		if (priority == null)
			priority = obr.getPriority().getValue();
		if (priority != null)
		{
			orderInvVo.setOrderPriority((OrderPriority) svc.getLocalLookup(OrderPriority.class, OrderPriority.TYPE_ID, providerSystem.getCodeSystem().getText(), priority));
		}
		
		orderInvVo.setWasOrdered(Boolean.FALSE);
		return orderInvVo;
	}

	/**
	 * wdev-5526
	 * getInvestigation
	 * This method was extract from populatePATHInvestigationVoFromOBR so that it could be used before an
	 * unsolicited order is created.  Before we create anything, we need to ensure that no duplicate investigations
	 * are in the message, the message should be rejected if duplicates found.
	 * @param obr
	 * @param sendingApplication
	 * @return Configured investigation matching search criteria
	 * @throws HL7Exception 
	 */
	private IfInvestigationLiteVo getInvestigation(OBR obr, String sendingApplication, ProviderSystemVo providerSystem, String providerInvCode,boolean bPathology,boolean isResultMessage) throws HL7Exception
	{
		
		String serviceCode =obr.getDiagnosticServSectID().getValue(); 
	
		ServiceShortVo discip = ocsIfInbound.getServiceByTaxonomy(serviceCode, providerSystem.getCodeSystem());
		
		ServiceShortVoCollection serviceColl=null;
		if (discip == null)
		{
			// The service wasn't found, let's see if this value is used as an alternative service code,
			// if so, get the list of services matching it and see if we can get the investigation based on it
			serviceColl = ocsIfInbound.listServicesWithAlternateCode(serviceCode);
			if (serviceColl != null && serviceColl.size() > 0)
			{
				// Set to the first service, though we may need to reference the others later
				discip = serviceColl.get(0);
				LOG.debug("Disclipline set to Alternate Service Code " + discip);

			}
			if (discip == null)
				throw new HL7Exception("Local discipline not found for given mapping " + obr.getDiagnosticServSectID().getValue());
		}
		
		// wdev-2397 specimen source is now part of the search criteria to get the investigation
		SPS sps = obr.getSpecimenSource();
		String source=null;
		String site=null;

		if(bPathology)
		{	
			if (sps != null && sps.getSpecimenSourceNameOrCode().getIdentifier().getValue() != null)
			{
				source =  sps.getSpecimenSourceNameOrCode().getIdentifier().getValue().trim();
			}
			else  // wdev-2618
				throw new HL7Exception("Specimen Source is required for this message to be processed successfully");
			//http://jira/browse/WDEV-11634  
			// This field will not be populated by Winpath 
			//currently Jan - 11 only Omni-lab will support this
			if(sps!=null &&sps.getBodySite().getIdentifier().getValue()!=null)
			{
				site = sps.getBodySite().getIdentifier().getValue().trim();
			}
		}
		IfProviderInvSearchVo search = new IfProviderInvSearchVo();
		search.setProviderInvCode(providerInvCode);
		search.setHl7App(sendingApplication);
		search.setService(discip);
		search.setSpecimenSource(source);
		search.setProvider(providerSystem);
		search.setSpecimenSite(site);
		search.setIsResultMessage(isResultMessage);
		IfInvestigationLiteVo invVo = ocsIfInbound.getInvestigationByHl7AppInvAndService(search);
		if (invVo == null)
		{
			// Not found the first time, if serviceColl has more disciplines, loop through and try for these
			if (serviceColl != null && serviceColl.size() > 1)
			{
				for (int i=1; i<serviceColl.size(); i++)
				{
					LOG.debug("Checking For Investigation with Alternate Service Codes:" + serviceColl.get(i));
					search.setService(serviceColl.get(i));
					invVo = ocsIfInbound.getInvestigationByHl7AppInvAndService(search);
					if (invVo != null)
						break;
				}
			}
		}
		return invVo;
	}
	
	private IfOrderInvestigationVo populatePATHInvestigationVoFromOBR(OBR obr, String sendingApplication, IfOrderSpecimenVo specimen, HashMap<String, Object> fillerSpecimens, IfOrderSpecimenVoCollection specColl, ProviderSystemVo providerSystem,boolean isResultMessage) throws Exception
	{
		IfOrderInvestigationVo orderInvVo = new IfOrderInvestigationVo();
		String providerInvCode = obr.getUniversalServiceIdentifier().getIdentifier().getValue();

		// wdev-5526 - method created and called from here now
		IfInvestigationLiteVo invVo = getInvestigation(obr, sendingApplication, providerSystem, providerInvCode,true,isResultMessage);
		if (invVo == null)
			throw new HL7Exception("Investigation not found for provider system and providerInvCode = " + providerInvCode);
		
		fillPATHInvestigationFromOBR(orderInvVo, obr, invVo,providerSystem);

		// OBR-27   Quantity/timing
		// wdev-2746 - If obr-27 is not populated, we can check obr-5
		String priority = obr.getQuantityTiming(0).getPriority().getValue();
		if (priority == null)
			priority = obr.getPriority().getValue();
		if (priority != null)
		{
			orderInvVo.setOrderPriority((OrderPriority) svc.getLocalLookup(OrderPriority.class, OrderPriority.TYPE_ID, providerSystem.getCodeSystem().getText(), priority));
		}

		orderInvVo.setWasOrdered(Boolean.FALSE);
		
		// Specimens only for Pathology orders
		//	OBR-3   Filler order number   
		//  WDEV-1354 
		// We hold onto the specimens for each fillerOrderNumber in case
		// the same specimen is required again
		String fillerOrderNum = obr.getFillerOrderNumber().getEntityIdentifier().getValue();
		if (fillerSpecimens.containsKey(fillerOrderNum)&&!ConfigFlag.HL7.UNSOLICTED_NEW_SPECIMEN_PER_INVESTIGATION.getValue())
			specimen = (IfOrderSpecimenVo) fillerSpecimens.get(fillerOrderNum);
		else
		{
			specimen = new IfOrderSpecimenVo();
			populateSpecimenVoFromOBR(specimen, orderInvVo.getInvestigation(), obr,providerSystem);
			specimen.getInvestigations();
			if(InvEventType.TIME_SERIES.equals(orderInvVo.getInvestigation().getEventType()))
			{
				specimen.setWasProcessed(true);	
//				specimen.setPlacerOrdNum(value);
			}
			if(!specimen.getInvestigationsIsNotNull())
			{
				specimen.setInvestigations(new IfOrderInvestigationVoCollection());
			}
			specimen.getInvestigations().add(orderInvVo);
			specColl.add(specimen);

			if (!fillerSpecimens.containsKey(specimen.getFillerOrdNum()))
			{
				fillerSpecimens.put(specimen.getFillerOrdNum(), specimen);
			}
		}
		if(orderInvVo.getSpecimen()==null&&!ConfigFlag.HL7.UNSOLICTED_NEW_SPECIMEN_PER_INVESTIGATION.getValue())
		{
			orderInvVo.setSpecimen(specColl);
		}
		else
		{
			orderInvVo.setSpecimen(new IfOrderSpecimenVoCollection());
			orderInvVo.getSpecimen().add(specimen);
		}
		
		//WDEV-15552
		SPS sps = obr.getSpecimenSource();
		LookupInstVo resultSpecimenSource=svc.getLocalLookup(LookupInstVo.class, ResultSpecimenTypes.TYPE_ID, providerSystem.getCodeSystem().getText(), sps.getSpecimenSourceNameOrCode().getIdentifier().getValue().trim()); 
		orderInvVo.setResultSpecimenType(resultSpecimenSource);

		return orderInvVo;
	}

	private IfOrdInvResultVo createInvResVoFromResVo(IfOrderInvestigationVo vo)
	{
		IfOrdInvResultVo ret = new IfOrdInvResultVo(vo.getID_OrderInvestigation(), vo.getVersion_OrderInvestigation());
		ret.setIsRIE(vo.getIsRIE());
		ret.setOrderPriority(vo.getOrderPriority());
		ret.setRepDateTime(vo.getRepDateTime());
		ret.setResultSortDate(vo.getRepDateTime());//http://jira/browse/WDEV-18025
		ret.setRepTimeSupplied(vo.getRepTimeSupplied());
		ret.setDisplayDateTime(vo.getDisplayDateTime());
		ret.setDisplayTimeSupplied(vo.getDisplayTimeSupplied());
		ret.setDisplayFlag(vo.getDisplayFlag());
		ret.setWasOrdered(vo.getWasOrdered());
		ret.setResultStatus(vo.getResultStatus());
		ret.setOrdInvCurrentStatus(vo.getOrdInvCurrentStatus());
		ret.setFillerOrdNum(vo.getFillerOrdNum());
		ret.setSpecimen(vo.getSpecimen());
		ret.setAppointmentDate(vo.getAppointmentDate());
		ret.setReasonForStudy(vo.getReasonForStudy());
		ret.setInvestigation(vo.getInvestigation());
		ret.setOrderDetails(vo.getOrderDetails());	
		ret.setOrdInvSeq(vo.getOrdInvSeq());
		ret.setAccessionNumber(vo.getAccessionNumber()); //http://jira/browse/WDEV-9727
		ret.setWasSecondaryMatchingUsed(vo.getWasSecondaryMatchingUsed());//http://jira/browse/WDEV-13033
		ret.setResultSpecimenType(vo.getResultSpecimenType());//http://jira/browse/WDEV-15552
		return ret;
	}

//	private IfOrdSpecResVo createSpecResFromOrdSpec(IfOrderSpecimenVo vo) throws StaleObjectException
//	{
//		// wdev-2748 Moved here so the version number can be used to construct newly returned vo
//		IfOrderSpecimenVo updatedSpcVo= ocsIfInbound.updateNonResultableInvestigations(vo);
//		
//		IfOrdSpecResVo ret = new IfOrdSpecResVo(updatedSpcVo.getID_OrderSpecimen(), updatedSpcVo.getVersion_OrderSpecimen());
//		ret.setIsRIE(vo.getIsRIE());
//		ret.setCollDateTimePlacer(vo.getCollDateTimePlacer());
//		ret.setCollDateTimeFiller(vo.getCollDateTimeFiller());
//		ret.setColTimeFillerSupplied(vo.getColTimeFillerSupplied());
//		ret.setCollEndDateTimePlacer(vo.getCollEndDateTimePlacer());
//		ret.setCollEndDateTimeFiller(vo.getCollEndDateTimeFiller());
//		ret.setSiteText(vo.getSiteText());
//		ret.setSpecimenSource(vo.getSpecimenSource());
//		ret.setDiscipline(vo.getDiscipline());
//		ret.setCollectingMos(vo.getCollectingMos());
//		ret.setIsPatientCollect(vo.getIsPatientCollect());
//		ret.setIsAwaitingCollection(vo.getIsAwaitingCollection());
//		ret.setReceivedDateTime(vo.getReceivedDateTime());
//		ret.setReceivedTimeSupplied(vo.getReceivedTimeSupplied());
//		ret.setFillerOrdNum(vo.getFillerOrdNum());
//		ret.setSiteCd(vo.getSiteCd());
//		ret.setCollectorComment(vo.getCollectorComment());
//		ret.setOrder(vo.getOrder());
//		ret.setInvestigations(new IfOrdInvResultVoCollection());
//		ret.setPlacerOrdNum(vo.getPlacerOrdNum());
//		return ret;
//	}
	
	private IfOrderInvCurrentStatusVo createInvStatus(IfOrderInvCurrentStatusVo invStatVo, ORC orc, OrderInvStatus defaultStatus, String reason,ProviderSystemVo providerSystem) throws Exception
	{

		IfOrderInvCurrentStatusVo vo = new IfOrderInvCurrentStatusVo();
		vo.setChangeDateTime(populateDateTimeVoFromTS(orc.getDateTimeOfTransaction()));
		if (vo.getChangeDateTime() == null)
			vo.setChangeDateTime(new DateTime());
		vo.setProcessedDateTime(new DateTime());
		
		vo.setChangeUser("HL7InboundEngine");
		String orderControlReasonCode = orc.getOrderControlCodeReason().getIdentifier().getValue(); 
		String orderControlReasonText = HL7Utils.fromHL7Text(orc.getOrderControlCodeReason().getText().getValue());
		
		
		if (null!=orderControlReasonCode)
			vo.setStatusChangeReason((InvestigationStatusChangeReason) svc.getLocalLookup(InvestigationStatusChangeReason.class, InvestigationStatusChangeReason.TYPE_ID, providerSystem.getCodeSystem().getText(), orderControlReasonCode));

		if (null!=orderControlReasonText)
		{
			//http://jira/browse/WDEV-12166
			if(orderControlReasonText.length() >= 500)
			{
				orderControlReasonText = orderControlReasonText.substring(0,500);
			} //End of WDEV-12166
			vo.setStatusReason(orderControlReasonText);
		}else if (reason!=null)
		{
			vo.setStatusReason(reason);
		}

		// ORC-1   Order control   
		String orderControl = orc.getOrderControl().getValue();
		// ORC-5   Order status   (ID)   00219
		String orderStatus = orc.getOrderStatus().getValue();
		
		if (orderControl != null && orderControl.equals("OK"))  // Request Accepted by RIS
		{
			vo.setOrdInvStatus(OrderInvStatus.ACCEPTED);
		}
		else if(orderControl!=null && orderControl.equals("UA")) // Unable to accept
		{
			vo.setOrdInvStatus(OrderInvStatus.REJECTED);
		}
		else if(orderControl!=null && orderControl.equals("CR")) //Cancelled  as requested 
		{
			vo.setOrdInvStatus(OrderInvStatus.CANCELLED);
		}
		else if (orderControl!=null&&orderControl.equals("HR")) //Held as requested
		{
			vo.setOrdInvStatus(OrderInvStatus.HELD);
		}
		else if (orderControl!=null&&orderControl.equals("CA")) // Cancel Order
		{
			vo.setOrdInvStatus(OrderInvStatus.CANCELLED);
		}
		else if (orderControl!=null&&orderControl.equals("OC")) // Cancel Order
		{
			vo.setOrdInvStatus(OrderInvStatus.CANCELLED);
		}
		else if (orderControl!=null&&orderControl.equals("XR")) //Changed as requested
		{
			vo.setOrdInvStatus(OrderInvStatus.CHANGED);
		}
		// http://jira/browse/WDEV-13400
		else if (orderControl!=null&&orderControl.equals("SC")
				&&(ConfigFlag.HL7.DEFAULT_ORDER_CONTROL_SC_STATUS.getValue()==null
				||!((ConfigFlag.HL7.DEFAULT_ORDER_CONTROL_SC_STATUS.getValue()!=null)
				&&"".equals(ConfigFlag.HL7.DEFAULT_ORDER_CONTROL_SC_STATUS.getValue())))) // Status change
		{
			OrderInvStatus status = OrderInvStatus.getNegativeInstance(ConfigFlag.HL7.DEFAULT_ORDER_CONTROL_SC_STATUS.getValue());
			vo.setOrdInvStatus(status);
		}

		else if (orderStatus != null)
		{
			OrderInvStatus newStatus = (OrderInvStatus) svc.getLocalLookup(OrderInvStatus.class, OrderInvStatus.TYPE_ID, providerSystem.getCodeSystem().getText(), orderStatus);
			if (newStatus == null && defaultStatus == null)
			{
				String error = "Local lookup not found for Inv Status value of " + orc.getOrderStatus().getValue() + " with mapping type = " + providerSystem.getCodeSystem().getText(); 
				throw new HL7Exception(error);
			}
			else if (newStatus == null && defaultStatus != null)
			{
				newStatus = defaultStatus;
			}
			vo.setOrdInvStatus(newStatus);			
		}
		else
		{
			if (defaultStatus == null)
				throw new HL7Exception("No Order Status supplied (ORC.5) - message rejected");
			else
				vo.setOrdInvStatus(defaultStatus);
		}		
		
		if (invStatVo != null)
		{
			OrderInvStatus curStat = invStatVo.getOrdInvStatus();
			if (curStat.equals(OrderInvStatus.CANCEL_REQUEST)&&vo.getOrdInvStatus().equals(OrderInvStatus.CANCELLED))
			{
				//MN 20081006 OK to change status from CANCEL REQUEST to CANCEL
				return vo;
			}
			
			if (curStat.equals(OrderInvStatus.CANCEL_REQUEST) || curStat.equals(OrderInvStatus.CANCELLED))
				return invStatVo;
			// Status cannot be changed from post result to pre-result statuc
			if (isPostResult(curStat) && isPreResult(vo.getOrdInvStatus()))
				return invStatVo;
		}		
		return vo;
	}

	private void fillPATHInvestigationFromOBR(IfOrderInvestigationVo invVo, OBR obr, IfInvestigationLiteVo cfgInv,ProviderSystemVo providerSystem) throws Exception
	{
		LOG.debug("R01VoMapper fillPATHInvestigationFromOBR: entry");

		invVo.setInvestigation(cfgInv);
		invVo.setFillerOrdNum(obr.getFillerOrderNumber().getEntityIdentifier().getValue());
		invVo.setResultStatus((ResultStatus) svc.getLocalLookup(ResultStatus.class, ResultStatus.TYPE_ID, providerSystem.getCodeSystem().getText(), obr.getResultStatus().getValue()));
		
		//http://jira/browse/WDEV-15552
		SPS sps = obr.getSpecimenSource();
		LookupInstVo resultSpecimenSource=svc.getLocalLookup(LookupInstVo.class, ResultSpecimenTypes.TYPE_ID, providerSystem.getCodeSystem().getText(), sps.getSpecimenSourceNameOrCode().getIdentifier().getValue().trim()); 
		invVo.setResultSpecimenType(resultSpecimenSource);
		//End http://jira/browse/WDEV-15552
		
		// wdev-2746 ResultStatus must map to a valid lookup value 
		if (obr.getResultStatus().getValue() != null && !invVo.getResultStatusIsNotNull())
			throw new HL7Exception("ResultStatus (OBR-25) does not map to a valid local lookup (ResultStatus) - Message Rejected");
			
		if (obr.getRequestedDateTime() != null && obr.getRequestedDateTime().getTimeOfAnEvent().getValue() != null)
		{
			invVo.setDisplayDateTime(populateDateTimeVoFromTS(obr.getRequestedDateTime()));
			invVo.setDisplayTimeSupplied( Boolean.valueOf(isTimeSupplied(obr.getRequestedDateTime())));
			invVo.setDisplayFlag(OcsDisplayFlag.REQUESTED);
		}
		if (obr.getResultsRptStatusChngDateTime() != null && obr.getResultsRptStatusChngDateTime().getTimeOfAnEvent().getValue() != null)
		{
			DateTime dt = populateDateTimeVoFromTS(obr.getResultsRptStatusChngDateTime());
			//JME: 20061205: Change to handle WinPath sending 189912300000 in OBR.22 instead of a null date/time
			if (!dt.equals(new DateTime("189912300000")))
			{
				invVo.setDisplayDateTime(dt);				
				invVo.setRepDateTime(dt);
				invVo.setResultSortDate(dt);//http://jira/browse/WDEV-18025
				invVo.setRepTimeSupplied( Boolean.valueOf(isTimeSupplied(obr.getResultsRptStatusChngDateTime())));					
				invVo.setDisplayFlag(OcsDisplayFlag.REPORTED);
				invVo.setDisplayTimeSupplied(invVo.getRepTimeSupplied());					
			}
		}
		if (obr.getSpecimenReceivedDateTime() != null && obr.getSpecimenReceivedDateTime().getTimeOfAnEvent().getValue() != null)
		{
			invVo.setDisplayDateTime(populateDateTimeVoFromTS(obr.getSpecimenReceivedDateTime()));			
			invVo.setDisplayFlag(OcsDisplayFlag.SPEC_RECVD);
			invVo.setDisplayTimeSupplied( Boolean.valueOf(isTimeSupplied(obr.getSpecimenReceivedDateTime())));
			
			// WDEV-16384  - Check if expected turnaround values configured.  If they are, calculated the expected result datetime
			invVo.setExpectedDateTime(ocsIfInbound.calculateExpectedDateTime(invVo.getInvestigation(), invVo.getDisplayDateTime()));

		}
		if (obr.getObservationDateTime() != null && obr.getObservationDateTime().getTimeOfAnEvent().getValue() != null)
		{
			invVo.setDisplayDateTime(populateDateTimeVoFromTS(obr.getObservationDateTime()));
			invVo.setDisplayFlag(OcsDisplayFlag.SPEC_COLL);
			invVo.setDisplayTimeSupplied( Boolean.valueOf(isTimeSupplied(obr.getObservationDateTime())));
		}			
		/*
		 * etc investVo.setOrderPriority(); investVo.setOrdInvCurrentStatus();
		 */
		LOG.debug("R01VoMapper fillPATHInvestigationFromOBR: exit");
	}

	
	private void fillRADInvestigationFromOBR(IfOrderInvestigationVo invVo, OBR obr, IfInvestigationLiteVo cfgInv,ProviderSystemVo providerSystem) throws Exception
	{
		LOG.debug("R01VoMapper fillRADInvestigationFromOBR: entry");

		invVo.setInvestigation(cfgInv);
		invVo.setFillerOrdNum(obr.getFillerOrderNumber().getEntityIdentifier().getValue());
		invVo.setResultStatus((ResultStatus) svc.getLocalLookup(ResultStatus.class, ResultStatus.TYPE_ID, providerSystem.getCodeSystem().getText(), obr.getResultStatus().getValue()));
		// http://jira/browse/WDEV-9727
		String accession = obr.getFillerField2().getValue();
		if (accession!=null && !Hl7Null.equals(accession))
		{
			invVo.setAccessionNumber(accession);
		}
		// wdev-2746 ResultStatus must map to a valid lookup value 
		if (obr.getResultStatus().getValue() != null && !invVo.getResultStatusIsNotNull())
			throw new HL7Exception("ResultStatus (OBR-25) does not map to a valid local lookup (ResultStatus) - Message Rejected");
			
		if (obr.getRequestedDateTime() != null && obr.getRequestedDateTime().getTimeOfAnEvent().getValue() !=null)
		{
			invVo.setDisplayDateTime(populateDateTimeVoFromTS(obr.getRequestedDateTime()));
			invVo.setDisplayFlag(OcsDisplayFlag.REQUESTED);
			invVo.setDisplayTimeSupplied( Boolean.valueOf(isTimeSupplied(obr.getRequestedDateTime())));
		}
		if (obr.getObservationDateTime() != null && obr.getObservationDateTime().getTimeOfAnEvent().getValue() != null)
		{
			invVo.setDisplayDateTime(populateDateTimeVoFromTS(obr.getObservationDateTime()));
			invVo.setDisplayFlag(OcsDisplayFlag.EXAMINED);
			invVo.setDisplayTimeSupplied( Boolean.valueOf(isTimeSupplied(obr.getObservationDateTime())));
			
			// WDEV-16384  - Check if expected turnaround values configured.  If they are, calculated the expected result datetime
			invVo.setExpectedDateTime(ocsIfInbound.calculateExpectedDateTime(invVo.getInvestigation(), invVo.getDisplayDateTime()));
		}
		if (obr.getResultsRptStatusChngDateTime() != null && obr.getResultsRptStatusChngDateTime().getTimeOfAnEvent().getValue() != null)
		{
			invVo.setRepDateTime(populateDateTimeVoFromTS(obr.getResultsRptStatusChngDateTime()));	
			invVo.setResultSortDate(populateDateTimeVoFromTS(obr.getResultsRptStatusChngDateTime())); //http://jira/browse/WDEV-18025
			invVo.setRepTimeSupplied( Boolean.valueOf(isTimeSupplied(obr.getResultsRptStatusChngDateTime())));					
		}
		else
		{
			invVo.setRepDateTime(null);	
			invVo.setResultSortDate(null); //http://jira/browse/WDEV-18025
			invVo.setRepTimeSupplied(Boolean.FALSE);	
//			invVo.setDisplayFlag(OcsDisplayFlag.REQUESTED);
//			invVo.setDisplayTimeSupplied(false);
//			invVo.setDisplayDateTime(populateDateTimeVoFromTS(obr.getObservationDateTime()));
		}
		
		/*
		 * etc investVo.setOrderPriority(); investVo.setOrdInvCurrentStatus();
		 */
		LOG.debug("R01VoMapper fillRADInvestigationFromOBR: exit");
	}

	
	private IfOcsPathResultVo fillPathResultDetails(IfOcsPathResultVo resVo, ORU_R01_ORCOBRNTECTDOBXNTEFT1CTI orc_group, IfOcsResCompVoCollection componentColl) throws HL7Exception
	{
		resVo.setResultComponents(componentColl);
		resVo.setResultComments(getResultComments(orc_group));
		//WDEV-16980
		if (resVo.getIsAbnormalIsNotNull()) 
			resVo.setIsAbnormal(null); //Clear it out
		
		// Loop through the componentCollection to check for abnormal values, if any, we want to 
		// set the abnormal flag at top level
		if (componentColl != null)
		{
			for (int i=0; i<componentColl.size(); i++)
			{
				IfOcsResCompVo comp = componentColl.get(i);
				if (comp.getIsAbnormalIsNotNull() && comp.getIsAbnormal().booleanValue())
				{
					resVo.setIsAbnormal(comp.getIsAbnormal());
					break;
				}
				if (!comp.getIsAbnormalIsNotNull())  // Mandatory item
					comp.setIsAbnormal(Boolean.FALSE);
			}
		}
		
		// Mandatory item needs to be set wdev-2688s
		if (!resVo.getIsAbnormalIsNotNull())
			resVo.setIsAbnormal(Boolean.FALSE);
		
		return resVo;
	}

	private IfOcsRadResultVo getRadResultDetails(OBR obr, ORU_R01_ORCOBRNTECTDOBXNTEFT1CTI orc_group) throws Exception
	{
		LOG.debug("R01VoMapper getRadResultDetails: entry");
		IfOcsRadResultVo radResVo = new IfOcsRadResultVo();

		radResVo.setReportText(getReportTextFromOBXGroup(orc_group));

		if (obr.getAssistantResultInterpreter().length > 0)
			radResVo.setAuthoringRadiologistName(getNameFromNDL(obr.getAssistantResultInterpreter(0)));
		if (obr.getTechnician().length > 0)
			radResVo.setRadiographerName(getNameFromNDL(obr.getTechnician(0)));
		radResVo.setExamDateTime(populateDateTimeVoFromTS(obr.getObservationDateTime()));
		if (radResVo.getExamDateTimeIsNotNull())
			radResVo.setExamTimeSupplied(Boolean.valueOf(radResVo.getExamDateTime().getTime() != null));
		radResVo.setRadiographerName("");
		// iSoft spec - "unused"
		if (obr.getTranscriptionist().length > 0)
			radResVo.setTranscriberName(getNameFromNDL(obr.getTranscriptionist(0)));

		radResVo.setVerifyingRadiologistName(getNameFromNDL(obr.getPrincipalResultInterpreter()));
		LOG.debug("R01VoMapper getRadResultDetails: exit");
		return radResVo;
	}

	private String getNameFromNDL(NDL ndl) throws DataTypeException
	{
		// NDL denotes an abstract HL7 data type can be sent
		StringBuffer ret = new StringBuffer();

		if (ndl.getComponents().length == 0)
			return "";

		CNN cnn = (CNN) ndl.getComponent(0);

		if (cnn == null)
			return "";

		if (cnn.getPrefixEgDR().getValue() != null)
		{
			ret.append(cnn.getPrefixEgDR().getValue());
			ret.append(" ");
		}
		if (cnn.getGivenName().getValue() != null)
		{
			ret.append(cnn.getGivenName().getValue());
			ret.append(" ");
		}
		if (cnn.getFamilyName().getValue() != null)
			ret.append(cnn.getFamilyName().getValue());

		return ret.toString();
	}

	private String getReportTextFromOBXGroup(ORU_R01_ORCOBRNTECTDOBXNTEFT1CTI orc_group) throws HL7Exception
	{
		int componentCount = orc_group.getORU_R01_OBXNTEReps();
		StringBuffer ret = new StringBuffer();
		for (int i = 0; i < componentCount; i++)
		{
			ORU_R01_OBXNTE obx_nte = orc_group.getORU_R01_OBXNTE(i);
			OBX obx = obx_nte.getOBX();
//			String obValue=HL7Utils.fromHL7Text(HL7Utils.getValueFromVariant(obx.getObservationValue(0), 0)); //WDEV-6358
			
			
			Varies[] varies = obx.getObservationValue();
			String obValue="";
			if (null!=varies)
			{	
				 for (Varies varies2 : varies)
				 {
					 if(!"".equals(obValue)) // Add a new line if it is not the first
					 {
						 obValue+="\n"; // Newline: result is always displayed as html
					 }
					 String value = HL7Utils.fromHL7Text(HL7Utils.getValueFromVariant(varies2, 0));
					 if(null!=value)
						 obValue +=value; 
				}
			}

			
			
			if(null!=obValue)
				ret.append(obValue);
			ret.append("\r");
			int nteCount = obx_nte.getNTEReps();
			for (int j = 0; j < nteCount; j++)
			{
				NTE nte = obx_nte.getNTE(j);
				int commCount = nte.getComment().length;
				for (int k = 0; k < commCount; k++)
				{
					ret.append(HL7Utils.fromHL7Text(nte.getComment(k).getValue()));	
					ret.append("\r");
				}
			}			
		}
		String returnString = ret.toString();
		//http://jira/browse/WDEV-14838
		if(ConfigFlag.HL7.REMOVE_HL7_INDENT_FORMATTING.getValue())
		{
			if(null!=returnString) 
			{ 
				returnString = returnString.replaceAll("\\\\\\.in[\\+\\-](\\d)*\\\\", " "); 
			} 
		}
		return returnString;
	}

	private IfOcsResCommentVoCollection getResultComments(AbstractGroup nte_group) throws HL7Exception
	{
		// This is a cludge around an apparent bug in the HAPI library: One
		// empty
		// NTE (hanging off OBR) is created in the parsed structure even if it
		// wasn't sent in the message
		// so we know that if there's only one NTE and its comments are empty,
		// it's useless so disregard
		int NTEcount = nte_group.getAll("NTE").length;
		if (NTEcount == 0)
			return null;

		IfOcsResCommentVoCollection coll = new IfOcsResCommentVoCollection();
		NTE nte = getNTEFromAbstract(nte_group, 0);
		if ((NTEcount > 1 && (nte.getComment(0).getValue() == null)) || nte.getComment(0).getValue() != null)
		{
			for (int k = 0; k < NTEcount; k++)
				coll.add(getCommentVoFromSeg(getNTEFromAbstract(nte_group, k)));
		}
		return coll;
	}

	private NTE getNTEFromAbstract(AbstractGroup nte_group, int i) throws HL7Exception
	{
		return ((NTE) nte_group.get("NTE", i));
	}

	private ResultDemographicsVo getResDemoVoFromSeg(PID pid, ProviderSystemVo providerSystem) throws Exception
	{
		LOG.debug("R01VoMapper getResDemoVoFromSeg: entry");
		ResultDemographicsVo demoVo = new ResultDemographicsVo();
		
		// wdev-2117
		DateTime dob = populateDateTimeVoFromTS(pid.getDateTimeOfBirth());
		if (dob != null)
			demoVo.setDob(new PartialDate(dob.getDate()));

		PatientIdCollection patColl = populatePatidCollectionFromIdList(pid.getPatientIdentifierList(), providerSystem);

		for (int i = 0; i < patColl.size(); i++)
		{
			if (patColl.get(i).getType().equals(PatIdType.NHSN))
			{
//				demoVo.setNhsNumber(pid.getPatientIdentifierList(i).getID().getValue());
				demoVo.setNhsNumber(patColl.get(i).getValue());
			}
			else if (patColl.get(i).getType().equals(PatIdType.HOSPNUM) || 
					patColl.get(i).getType().equals(PatIdType.DISTRICT)||
					patColl.get(i).getType().equals(PatIdType.EMPI)) // http://jira/browse/WDEV-10137
			{
//				demoVo.setHospNum(pid.getPatientIdentifierList(i).getID().getValue());
				demoVo.setHospNum(patColl.get(i).getValue());
				
			}
		}
		//WDEV-4822, JP
		CX patid = pid.getPatientID();		
		String pid2Val = patid.getID().getValue();
		if (pid2Val != null && pid2Val.length() > 0)
		{		 
			PatientId patIdVo = populatePatidFromIdField(patid,providerSystem); 
			if (patIdVo != null && patIdVo.getValue() != null && patIdVo.getValue().length() > 0)
			{
				if (patIdVo.getType().equals(PatIdType.NHSN) && demoVo.getNhsNumber() == null)
					demoVo.setNhsNumber(patIdVo.getValue());
				else if(patIdVo.getType().equals(PatIdType.HOSPNUM) && demoVo.getHospNum() == null)
					demoVo.setHospNum(patIdVo.getValue());
			}
		}
		
		demoVo.setSex((Sex) svc.getLocalLookup(Sex.class, Sex.TYPE_ID, providerSystem.getCodeSystem().getText(), pid.getAdministrativeSex().getValue()));
		demoVo.setName(populateNameVoFromXPN(demoVo.getName(), pid.getPatientName(0),providerSystem));
		demoVo.getName().setUppers();
		LOG.debug("R01VoMapper getResDemoVoFromSeg: exit");
		return demoVo;
	}

	private IfOcsResCompVo getCompVoFromSeg(ORU_R01_OBXNTE obx_nte, IfProviderInvSearchVo providerInvSearch,ProviderSystemVo providerSystem) throws Exception
	{
		LOG.debug("R01VoMapper getCompVoFromSeg: entry");
		IfOcsResCompVo resCompVo = new IfOcsResCompVo();
		OBX obx = obx_nte.getOBX();
		resCompVo.setRefRange(obx.getReferencesRange().getValue());

		// OBX 5(Result Value) doens't necessarily have to have data -
		// Normalcy Status can just be reported as "Normal" or whatever

		// obx abnormal flags can repeat - not handled in model?
		NormalcyStatus stat = (NormalcyStatus) svc.getLocalLookup(NormalcyStatus.class, NormalcyStatus.TYPE_ID, providerSystem.getCodeSystem().getText(), obx.getAbnormalFlags().getValue());
		if (stat != null && stat.equals(NormalcyStatus.N))
		{
			resCompVo.setNormalcyStatus(NormalcyStatus.N);
			resCompVo.setIsAbnormal(Boolean.FALSE);
		}
		else if (stat != null)
		{
			resCompVo.setNormalcyStatus(stat);
			resCompVo.setIsAbnormal(Boolean.TRUE);
		}
		
		// wdev-2746 - normalcyStatus must map if provided or else message rejection	
		if (obx.getAbnormalFlags().getValue() != null && !resCompVo.getNormalcyStatusIsNotNull())
			throw new HL7Exception("Abnormal Flag (OBX-8) does not map to a valid local lookup (NormalcyStatus) - Message Rejected"); 

		// wdev-3032 Set isAbnormal to false if not already set
		if (!resCompVo.getIsAbnormalIsNotNull())
			resCompVo.setIsAbnormal(Boolean.FALSE);
		
		resCompVo.setObsDateTime(populateDateTimeVoFromTS(obx.getDateTimeOfTheObservation()));
		resCompVo.setObsTimeSupplied( Boolean.valueOf(isTimeSupplied(obx.getDateTimeOfTheObservation())));			
		resCompVo.setResultStatus((ResultStatus)svc.getLocalLookup(ResultStatus.class, ResultStatus.TYPE_ID,  providerSystem.getCodeSystem().getText(), obx.getObservationResultStatus().getValue()));
		// wdev-2746 ResultStatus must map to a valid lookup value 
		if (obx.getObservationResultStatus().getValue() != null && !resCompVo.getResultStatusIsNotNull())
			throw new HL7Exception("Observation Result Status (OBX-11) does not map to a valid local lookup (ResultStatus) - Message Rejected");

		
		resCompVo.setResValType((ResultValueType) svc.getLocalLookup(ResultValueType.class, ResultValueType.TYPE_ID, providerSystem.getCodeSystem().getText(), obx.getValueType().getValue()));

		//http://jira/browse/WDEV-2175
		//JME: 20061123
		//WDEV-6046
		Varies[] varies = obx.getObservationValue();
		String valString="";
		String subType=null;
		if (null!=varies)
		{	
			 for (Varies varies2 : varies)
			 {
				 if(!"".equals(valString)) // Add a new line if it is not the first
				 {
					 valString+="\n"; // Newline: result is always displayed as html
				 }
				 if(ResultValueType.ED.equals(resCompVo.getResValType())
						 &&(varies2.getData()!=null)&&varies2.getData()instanceof ED) 
				 {
					 valString+=((ED)varies2.getData()).getData().getValue();
					 subType=((ED)varies2.getData()).getDataSubtype().getValue();
				 }
				 else if (ResultValueType.CE.equals(resCompVo.getResValType())
						 &&(varies2.getData()!=null)&&varies2.getData()instanceof CE)
				 {
					 //WDEV-14900 CE data
					 String text = ((CE)varies2.getData()).getText().getValue();
					 if (text==null)
					 {
						 text=((CE)varies2.getData()).getIdentifier().getValue();
					 }
					 if (text!=null)
					 {
					 valString+=text;
					 }
				 }
				 else 
				 {
					 String value = HL7Utils.fromHL7Text(HL7Utils.getValueFromVariant(varies2, 0));
					 if(null!=value)
						 valString +=value; 
				 }
			}
		}
		//http://jira/browse/WDEV-14838
		if(ConfigFlag.HL7.REMOVE_HL7_INDENT_FORMATTING.getValue()
				&&!ResultValueType.ED.equals(resCompVo.getResValType())) //Don't do it if the type is ED
		{
			if(null!=valString) 
			{ 
				valString = valString.replaceAll("\\\\\\.in[\\+\\-](\\d)*\\\\", " "); 
			} 
		}
		
		if (valString!=null&&valString.length() > 1000)
		{
			resCompVo.setFormattedText(valString);
			//http://jira/browse/WDEV-14270
			if (!ResultValueType.ED.equals(resCompVo.getResValType()))
			{
				resCompVo.setResValType(ResultValueType.FT);
			}
		}
		else
		{
			resCompVo.setResultVal(valString);			
		}
		
		//http://jira/browse/WDEV-14073
		if (Hl7Null.equals(valString))
		{
			return null;
		}
		if(subType!=null)
		{
			ResultEDSubtype edSubType=(ResultEDSubtype)svc.getLocalLookup(ResultEDSubtype.class, ResultEDSubtype.TYPE_ID, providerSystem.getCodeSystem().getText(), subType);
			resCompVo.setEDSubType(edSubType);
		}
		ResultUnitOfMeasure units = (ResultUnitOfMeasure) svc.getLocalLookup(ResultUnitOfMeasure.class, ResultUnitOfMeasure.TYPE_ID, providerSystem.getCodeSystem().getText(), obx.getUnits().getIdentifier().getValue());
		if (units == null)
		{
			units = (ResultUnitOfMeasure)addLookupInstanceMapping(ResultUnitOfMeasure.class, ResultUnitOfMeasure.TYPE_ID, obx.getUnits().getIdentifier().getValue(), obx.getUnits().getIdentifier().getValue(), providerSystem.getCodeSystem().getText());
		}
		resCompVo.setUnitOfMeasure(units);

		String analyteExtCode = obx.getObservationIdentifier().getIdentifier().getValue();
		//http://jira/browse/WDEV-15795
		if (analyteExtCode==null||null==analyteExtCode.trim()||"".equals(analyteExtCode.trim()))
		{
			throw new HL7Exception("Observation Identifier OBX-3 is mandatory");
		}
		String analyteExtText = obx.getObservationIdentifier().getText().getValue();
		
		if (analyteExtText==null||null==analyteExtText.trim()||"".equals(analyteExtText.trim()))
		{
			throw new HL7Exception("Observation Identifier text OBX-3-2 is mandatory");
		}
		IfAnalyteVo analyteVo = ocsIfInbound.getAnalyte(analyteExtCode, analyteExtText, providerInvSearch, units);
		if (analyteVo == null)
			throw new HL7Exception("Analyte is null");
		resCompVo.setAnalyte(analyteVo);

		
		resCompVo.setResultComponentComments(getResultComments(obx_nte));
		LOG.debug("R01VoMapper getCompVoFromSeg: exit");
		return resCompVo;
	}

	private IfOcsResCommentVo getCommentVoFromSeg(NTE nte) throws HL7Exception
	{
		StringBuffer cmnt = new StringBuffer();
		IfOcsResCommentVo commentVo = new IfOcsResCommentVo();
		commentVo.setCmtSrc(nte.getSourceOfComment().getValue());

		for (int i = 0; i < nte.getComment().length; i++)
		{
			if(null!=nte.getComment(i).getValue())
			{
				cmnt.append(HL7Utils.fromHL7Text(nte.getComment(i).getValue()));
			}
		}

		if(cmnt.length()==0)
		{
			cmnt.append('\r');
		}
		commentVo.setCmtText(cmnt.toString());

		return commentVo;
	}

	private String formatCommentsList(CE[] commentList, String delimiter)
	{
		String ret = "";
		for (int i = 0; commentList != null && i < commentList.length; i++)
			ret += commentList[i].getText() + delimiter;
		return ret;
	}

	private void savePathResult(IfOrderSpecimenVo spcVo, String placerNum, String fillerNum, String hl7App,Boolean statusChecked,IfResultDetailsVoCollection historicResultDetails, IfOrderInvestigationVo orderInvRef) throws StaleObjectException,HL7Exception
	{
		// not validating because vo is not being saved directly
		try
		{
			ocsIfInbound.savePathResult(spcVo, placerNum, fillerNum, hl7App,statusChecked,historicResultDetails,orderInvRef);
		}
		catch (DomainInterfaceException e)
		{
			LOG.error("DomainInterfaceException occurred saving Pathology message - " + e.getMessage(), e);
			throw new HL7Exception(e.getMessage(), e);
		}
		catch (ForeignKeyViolationException e)
		{
			LOG.error("ForeignKeyViolationException occurred saving Pathology message - " + e.getMessage(), e);
			throw new HL7Exception(e.getMessage(), e);
		}
//		catch (StaleObjectException e)
//		{
//			LOG.error("StaleObjectException occurred saving Pathology message - " + e.getMessage(), e);
//			throw new HL7Exception(e.getMessage(), e);
//		}
	}

	private void saveRadResult(IfOrdInvResultVo invVo, String placerNum, String fillerNum, String hl7App) throws HL7Exception
	{
		// not validating because vo is not being saved directly
		try
		{
			ocsIfInbound.saveRadResult(invVo, placerNum, fillerNum, hl7App);
		}
		catch (DomainInterfaceException e)
		{
			LOG.error("DomainInterfaceException occurred saving Radiology message - " + e.getMessage(), e);
			throw new HL7Exception(e.getMessage(), e);
		}
		catch (ForeignKeyViolationException e)
		{
			LOG.error("ForeignKeyViolationException occurred saving Radiology message - " + e.getMessage(), e);
			throw new HL7Exception(e.getMessage(), e);
		}
		catch (StaleObjectException e)
		{
			LOG.error("StaleObjectException occurred saving Radiology message - " + e.getMessage(), e);
			throw new HL7Exception(e.getMessage(), e);
		}
	}

	public Message populateMessage()
	{

		return null;
	}

	/**
	 * Returns true if the given status is a pre-resulted status
	 * i.e. Ordered, Sent, Received, Rejected, Accepted, Inprogress,
	 * Inprogress-SCH
	 * @param status
	 * @return true or false
	 */
	//updated http://jira/browse/WDEV-15673
	private boolean isPreResult(OrderInvStatus status)
	{
		if (status == null)
			return false;
		
		if (status.equals(OrderInvStatus.ORDERED) || status.equals(OrderInvStatus.SENT) || status.equals(OrderInvStatus.RECEIVED)
				||status.equals(OrderInvStatus.REJECTED) || status.equals(OrderInvStatus.ACCEPTED)
				||status.equals(OrderInvStatus.CANCEL_REQUEST) || status.equals(OrderInvStatus.CANCELLED) 
				|| status.equals(OrderInvStatus.INPROGRESS) ||status.equals(OrderInvStatus.INPROGRESS_SCH) 
				|| status.equals(OrderInvStatus.COMPLETE) || status.equals(OrderInvStatus.AWAITING_AUTHORISATION) 
				|| status.equals(OrderInvStatus.ORDERED_AWAITING_APPT)|| status.equals(OrderInvStatus.HELD) 
				|| status.equals(OrderInvStatus.CHANGE_REQUESTED)|| status.equals(OrderInvStatus.CHANGED) 
				|| status.equals(OrderInvStatus.HOLD_REQUESTED)|| status.equals(OrderInvStatus.PROVIDER_CHANGE_REJECTED) 
				|| status.equals(OrderInvStatus.AMENDED))
			return true;
			
		return false;
	}
	
	/**
	 * Returns true if the given status is a post-resulted status
	 * i.e. New Result, Updated Result, Seen, Checked, Query, Complete
	 * @param status
	 * @return true or false
	 */
	// updated http://jira/browse/WDEV-15673
	private boolean isPostResult(OrderInvStatus status)
	{
		if (status == null)
			return false;
		
		if (status.equals(OrderInvStatus.NEW_RESULT) || status.equals(OrderInvStatus.UPDATED_RESULT) || status.equals(OrderInvStatus.SEEN)
				||status.equals(OrderInvStatus.CHECKED) || status.equals(OrderInvStatus.REVIEW)|| status.equals(OrderInvStatus.UNSEEN)
				|| status.equals(OrderInvStatus.RESULTED)|| status.equals(OrderInvStatus.AUTOREPORT)|| status.equals(OrderInvStatus.VIEWED))
			return true;
			
		return false;
	}
	
	private IfOrderInvestigationVo getInvFromOrderVoAndMessage(IfOcsOrderVo orderVo,String placerOrdNum,String fillerOrdNum) throws Exception
	{
		IfOrderInvestigationVoCollection invColl= orderVo.getInvestigations();
		IfOrderInvestigationVo invVo=null;
		if(placerOrdNum!=null)
		{
			DecimalFormat myFormatter = new DecimalFormat("000000000");  // Required for placer order number
			for (int i=0;i<invColl.size();i++)
			{
				invVo=invColl.get(i);
				if(placerOrdNum.equals(myFormatter.format(invVo.getBoId())))
				{
					return invVo;
				}
			}
			throw new Exception("Could not find Investigation for Placer Order Number: "+placerOrdNum+" in Order:"
					+orderVo.toString());
		}
		else if(fillerOrdNum!=null)
		{
			for (int i=0;i<invColl.size();i++)
			{
				invVo=invColl.get(i);
				if(fillerOrdNum.equals(invVo.getFillerOrdNum()))
				{
					return invVo;
				}
			}
		}
		throw new Exception("Could not find Investigation for Filler Order Number: "+fillerOrdNum+" in Order:"
				+orderVo.toString());
	}
	
	
	private IfOrderInvestigationVo getInvFromOrderVoAndMessage(IfOcsOrderVo orderVo,String placerOrdNum) throws Exception
	{
		return getInvFromOrderVoAndMessage( orderVo, placerOrdNum,null);
	}

	private boolean isGPResultMessage(Message msg)
	{
		PV1 pv1=null;
		if (msg!=null&&msg instanceof ORU_R01)
		{
			pv1=((ORU_R01)msg).getORU_R01_PIDPD1NK1NTEPV1PV2ORCOBRNTECTDOBXNTEFT1CTI().getORU_R01_PIDPD1NK1NTEPV1PV2().getORU_R01_PV1PV2().getPV1();
		}
		//WDEV-13253 
		if (pv1 != null&&pv1.getPatientClass()!=null&&pv1.getPatientClass().getValue()!=null&&pv1.getPatientClass().getValue().equals("G"))
			{
				return true;
			}
		return false;
	}

	/*
	 * Returns the first "real" placer number from a message if any
	 * this is useful when trying to get the order session a message relates
	 * it may be the case with Omni for example that the first Inv in a message
	 * does not contain a placer number. 
	 */
	private String getPlacerNumFromMessage(Message msg,int invCount,int PIDcounter) throws HL7Exception
	{
		String placerOrdNum=null;
		for (int j = 0; j < invCount; j++)
		{
			ORU_R01_ORCOBRNTECTDOBXNTEFT1CTI orc_group = null;				
			ORC orc = null;
			ORC lastOrc = null;
			OBR obr =  null;
			if (msg instanceof ORM_O01)
			{
				orc = ((ORM_O01)msg).getORM_O01_ORCOBRRQDRQ1RXOODSODTNTECTDDG1OBXNTEFT1CTIBLG(j).getORC();
				obr = ((ORM_O01)msg).getORM_O01_ORCOBRRQDRQ1RXOODSODTNTECTDDG1OBXNTEFT1CTIBLG(j).getORM_O01_OBRRQDRQ1RXOODSODTNTECTDDG1OBXNTE().getOBR();
			}
			else if (msg instanceof OMG_O19)
			{
				orc = ((OMG_O19)msg).getOMG_O19_ORCOBRNTECTDDG1OBXNTEPIDPD1PV1PV2AL1ORCOBRNTECTDOBXNTEFT1CTIBLG(j).getORC();
				obr = ((OMG_O19)msg).getOMG_O19_ORCOBRNTECTDDG1OBXNTEPIDPD1PV1PV2AL1ORCOBRNTECTDOBXNTEFT1CTIBLG(j).getOBR();
			}
			else if (msg instanceof ORU_R01)
			{
				orc_group = ((ORU_R01)msg).getORU_R01_PIDPD1NK1NTEPV1PV2ORCOBRNTECTDOBXNTEFT1CTI(PIDcounter).getORU_R01_ORCOBRNTECTDOBXNTEFT1CTI(j);
				orc = orc_group.getORC();
				if (orc == null)
					orc = lastOrc;
				else
					lastOrc = orc;
						
				obr = orc_group.getOBR();
			}
			else if (msg instanceof ORR_O02)
			{
				orc = ((ORR_O02)msg).getORR_O02_PIDNTEORCOBRRQDRQ1RXOODSODTNTECTI().getORR_O02_ORCOBRRQDRQ1RXOODSODTNTECTI(j).getORC();
				obr = ((ORR_O02)msg).getORR_O02_PIDNTEORCOBRRQDRQ1RXOODSODTNTECTI().getORR_O02_ORCOBRRQDRQ1RXOODSODTNTECTI(j).getOBR();
			}
			else if (msg instanceof ORG_O20)
			{
				orc = ((ORG_O20)msg).getORG_O20_PIDNTEORCOBRNTECTI().getORG_O20_ORCOBRNTECTI().getORC();
				obr = ((ORG_O20)msg).getORG_O20_PIDNTEORCOBRNTECTI().getORG_O20_ORCOBRNTECTI().getOBR();
			}
			else
			{
				throw new HL7Exception("Invalid message type passed to R01.processResult");
			}
			
			placerOrdNum=null;
			if ( orc.getPlacerOrderNumber() != null && orc.getPlacerOrderNumber().getEntityIdentifier() != null)
			{
				placerOrdNum = orc.getPlacerOrderNumber().getEntityIdentifier().getValue();
			}
			//JME: 20060627: Need to also check in OBR, in case sender is not filling ORC
			if (placerOrdNum == null && obr.getPlacerOrderNumber() != null && obr.getPlacerOrderNumber().getEntityIdentifier() != null)
			{
				placerOrdNum = obr.getPlacerOrderNumber().getEntityIdentifier().getValue();
			}
			if (placerOrdNum != null && placerOrdNum.equals("#R"))
				placerOrdNum=null;
			
			if(placerOrdNum!=null)
				return placerOrdNum;
			
		}
		return placerOrdNum;
	}

	
	private int getPIDCount(Message msg)
	{
		if (msg instanceof ORU_R01)
			return  ((ORU_R01)msg).getORU_R01_PIDPD1NK1NTEPV1PV2ORCOBRNTECTDOBXNTEFT1CTIReps();
		else
			return 1;
	}		

	/* http://jira/browse/WDEV-17495
	 * Try and get the OrderInvestigation from the OCS Order vo instead of going to the DB
	 *  for UNSOLICTED_NEW_SPECIMEN_PER_INVESTIGATION go directly to the database.
	 */
	private IfOrderInvestigationVo getPathOrderInvestigation(IfOcsOrderVo order, IfInvestigationLiteVo investigation, OrderSpecimenRefVo orderSpecimen)
	{
		if((orderSpecimen==null||ConfigFlag.HL7.UNSOLICTED_NEW_SPECIMEN_PER_INVESTIGATION.getValue())
				&&investigation.getInvestigationIndexIsNotNull()
				&&investigation.getInvestigationIndex().getCategoryIsNotNull()
				&&investigation.getInvestigationIndex().getCategory().equals(Category.PATHOLOGY)
				&&investigation.getEventTypeIsNotNull()
				&&(!investigation.getEventType().equals(InvEventType.TIME_SERIES)))
		{
			return null;
		}
		if(order==null||order.getInvestigations()==null||investigation==null)
		{
			return null;
		}
		for (IfOrderInvestigationVo inv : order.getInvestigations())
		{
			if(inv.getInvestigation().equals(investigation))
			{
				if(inv.getSpecimen()==null)
				{
					return null;
				}
				for (IfOrderSpecimenVo spec : inv.getSpecimen())
				{
					if(spec.equals(orderSpecimen))
					{
						return inv;
					}
				}
			}
		}
		return null;
	}
	
}
