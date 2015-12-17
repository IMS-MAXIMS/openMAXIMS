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
package ims.hl7.domain.mapping;

import ims.admin.domain.GPAdmin;
import ims.admin.domain.HcpAdmin;
import ims.admin.domain.LookupTree;
import ims.admin.domain.MosAdmin;
import ims.admin.domain.OrganisationAndLocation;
import ims.admin.vo.ConfigPropertyVo;
import ims.admin.vo.ConfigPropertyVoCollection;
import ims.clinical.domain.Allergies;
import ims.clinical.domain.ClinicalCoding;
import ims.clinical.domain.DischargeInpatient;
import ims.clinical.domain.HL7TTOIF;
import ims.coe.vo.lookups.DischargeDestination;
import ims.configuration.ConfigItems;
import ims.configuration.gen.ConfigFlag;
import ims.core.clinical.vo.AllergenRefVo;
import ims.core.domain.ADT;
import ims.core.domain.CareContextSelectDialog;
import ims.core.domain.CareSpellDialog;
import ims.core.domain.Demographics;
import ims.core.domain.PatientSearch;
import ims.core.patient.vo.PatientRefVo;
import ims.core.resource.people.vo.HcpRefVo;
import ims.core.resource.people.vo.MedicRefVo;
import ims.core.resource.place.vo.LocSiteRefVo;
import ims.core.vo.AddressVo;
import ims.core.vo.AneAttendanceVo;
import ims.core.vo.CareContextHistoryVo;
import ims.core.vo.CareContextHistoryVoCollection;
import ims.core.vo.CareContextInterfaceVo;
import ims.core.vo.CareContextStatusHistoryVo;
import ims.core.vo.CareContextVo;
import ims.core.vo.CareContextVoCollection;
import ims.core.vo.CareSpellVo;
import ims.core.vo.ClinicLiteVo;
import ims.core.vo.ClinicVo;
import ims.core.vo.CommChannelVo;
import ims.core.vo.CommChannelVoCollection;
import ims.core.vo.DischargedEpisodeVo;
import ims.core.vo.EpisodeOfCareHistoryVo;
import ims.core.vo.EpisodeOfCareHistoryVoCollection;
import ims.core.vo.EpisodeOfCareInterfaceVo;
import ims.core.vo.EpisodeofCareLiteVo;
import ims.core.vo.EpisodeofCareVo;
import ims.core.vo.EpisodeofCareVoCollection;
import ims.core.vo.GpLiteVo;
import ims.core.vo.GpShortVo;
import ims.core.vo.HcpFilter;
import ims.core.vo.HcpLiteVo;
import ims.core.vo.HcpMinVo;
import ims.core.vo.IfPatientAllergyVo;
import ims.core.vo.IfPatientAllergyVoCollection;
import ims.core.vo.InpatientEpisodeVo;
import ims.core.vo.LocShortMappingsVo;
import ims.core.vo.LocShortVo;
import ims.core.vo.LocSiteShortVo;
import ims.core.vo.LocationLiteVo;
import ims.core.vo.MedicVo;
import ims.core.vo.MedicWithMappingsLiteVo;
import ims.core.vo.MemberOfStaffLiteVo;
import ims.core.vo.MemberOfStaffShortVo;
import ims.core.vo.NationalHealthCoverVo;
import ims.core.vo.NextOfKin;
import ims.core.vo.OutPatientAttendanceVo;
import ims.core.vo.PasEventVo;
import ims.core.vo.PatRelative;
import ims.core.vo.Patient;
import ims.core.vo.PatientAlert;
import ims.core.vo.PatientAlertLiteVo;
import ims.core.vo.PatientAlertLiteVoCollection;
import ims.core.vo.PatientId;
import ims.core.vo.PatientIdCollection;
import ims.core.vo.PatientMedicalInsuranceVo;
import ims.core.vo.PatientShort;
import ims.core.vo.PersonAddress;
import ims.core.vo.PersonAddressCollection;
import ims.core.vo.PersonName;
import ims.core.vo.PersonNameCollection;
import ims.core.vo.PrivateInsuranceCompanyVo;
import ims.core.vo.SupportNetworkFamily;
import ims.core.vo.TaxonomyMap;
import ims.core.vo.lookups.AddressType;
import ims.core.vo.lookups.AdmissionType;
import ims.core.vo.lookups.AlertType;
import ims.core.vo.lookups.ArrivalMode;
import ims.core.vo.lookups.BedTypeRequested;
import ims.core.vo.lookups.CareContextStatus;
import ims.core.vo.lookups.CareSpelltoEpisodeRelationship;
import ims.core.vo.lookups.ChannelType;
import ims.core.vo.lookups.ContextType;
import ims.core.vo.lookups.Country;
import ims.core.vo.lookups.Eligibility;
import ims.core.vo.lookups.EthnicOrigin;
import ims.core.vo.lookups.LocationType;
import ims.core.vo.lookups.MRNStatus;
import ims.core.vo.lookups.ManagementIntention;
import ims.core.vo.lookups.MaritalStatus;
import ims.core.vo.lookups.MethodOfAdmission;
import ims.core.vo.lookups.NameType;
import ims.core.vo.lookups.Occupation;
import ims.core.vo.lookups.PASSpecialty;
import ims.core.vo.lookups.PDSChannelUsage;
import ims.core.vo.lookups.PasEventType;
import ims.core.vo.lookups.PatIdType;
import ims.core.vo.lookups.PatientStatus;
import ims.core.vo.lookups.PersonHealthActCategory;
import ims.core.vo.lookups.PersonRelationship;
import ims.core.vo.lookups.PersonTitle;
import ims.core.vo.lookups.PrivateInsurancePolicyType;
import ims.core.vo.lookups.Religion;
import ims.core.vo.lookups.Sex;
import ims.core.vo.lookups.SourceOfAdmission;
import ims.core.vo.lookups.SourceOfReferral;
import ims.core.vo.lookups.SourceofInformation;
import ims.core.vo.lookups.Specialty;
import ims.core.vo.lookups.TaxonomyType;
import ims.core.vo.lookups.WardType;
import ims.core.vo.lookups.YesNo;
import ims.domain.DomainSession;
import ims.domain.SessionData;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.factory.ContextSetterFactory;
import ims.domain.impl.DomainImplFlyweightFactory;
import ims.domain.lookups.LookupService;
import ims.framework.SessionConstants;
import ims.framework.cn.Context;
import ims.framework.enumerations.ContextQueryItem;
import ims.framework.interfaces.IContextSetter;
import ims.framework.utils.Date;
import ims.framework.utils.DateFormat;
import ims.framework.utils.DateTime;
import ims.framework.utils.DateTimeFormat;
import ims.framework.utils.PartialDate;
import ims.framework.utils.TimeFormat;
import ims.hl7.HL7Config;
import ims.hl7.domain.EventResponse;
import ims.hl7.utils.HL7Utils;
import ims.ntpf.vo.lookups.County;
import ims.ntpf_ptr.vo.lookups.AreaOfResidence;
import ims.ocrr.orderingresults.vo.OrderInvestigationRefVo;
import ims.ocrr.vo.ProviderSystemVo;
import ims.ocrr.vo.lookups.Category;
import ims.ocrr.vo.lookups.OrderCategory;
import ims.ocs_if.domain.OcsIf;
import ims.ocs_if.domain.OcsIfInbound;
import ims.ocs_if.helper.IRefManDomainHelper;
import ims.ocs_if.vo.IfOcsOrderVo;
import ims.ocs_if.vo.IfOrderInvestigationVo;
import ims.ocs_if.vo.IfOrderInvestigationVoCollection;
import ims.ocs_if.vo.IfOutOcsOrderVo;
import ims.scheduling.vo.ifSessionListOwnerVoCollection;
import ims.vo.LookupInstVo;
import ims.vo.LookupInstanceCollection;
import ims.vo.LookupMappingVo;
import ims.vo.LookupTypeVo;

import java.text.ParseException;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.Group;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.Structure;
import ca.uhn.hl7v2.model.v24.datatype.CX;
import ca.uhn.hl7v2.model.v24.datatype.DT;
import ca.uhn.hl7v2.model.v24.datatype.PL;
import ca.uhn.hl7v2.model.v24.datatype.TS;
import ca.uhn.hl7v2.model.v24.datatype.XAD;
import ca.uhn.hl7v2.model.v24.datatype.XCN;
import ca.uhn.hl7v2.model.v24.datatype.XPN;
import ca.uhn.hl7v2.model.v24.datatype.XTN;
import ca.uhn.hl7v2.model.v24.group.ADT_A05_IN1IN2IN3ROL;
import ca.uhn.hl7v2.model.v24.message.ADT_A01;
import ca.uhn.hl7v2.model.v24.message.ADT_A05;
import ca.uhn.hl7v2.model.v24.message.ADT_A30;
import ca.uhn.hl7v2.model.v24.message.ADT_A39;
import ca.uhn.hl7v2.model.v24.message.ADT_A52;
import ca.uhn.hl7v2.model.v24.message.MFN_M02;
import ca.uhn.hl7v2.model.v24.message.MFN_M05;
import ca.uhn.hl7v2.model.v24.message.OMG_O19;
import ca.uhn.hl7v2.model.v24.message.ORG_O20;
import ca.uhn.hl7v2.model.v24.message.ORM_O01;
import ca.uhn.hl7v2.model.v24.message.ORR_O02;
import ca.uhn.hl7v2.model.v24.message.ORU_R01;
import ca.uhn.hl7v2.model.v24.message.PPG_PCG;
import ca.uhn.hl7v2.model.v24.message.REF_I12;
import ca.uhn.hl7v2.model.v24.segment.AIP;
import ca.uhn.hl7v2.model.v24.segment.AL1;
import ca.uhn.hl7v2.model.v24.segment.EVN;
import ca.uhn.hl7v2.model.v24.segment.IN1;
import ca.uhn.hl7v2.model.v24.segment.MRG;
import ca.uhn.hl7v2.model.v24.segment.MSH;
import ca.uhn.hl7v2.model.v24.segment.NK1;
import ca.uhn.hl7v2.model.v24.segment.OBR;
import ca.uhn.hl7v2.model.v24.segment.OBX;
import ca.uhn.hl7v2.model.v24.segment.ORC;
import ca.uhn.hl7v2.model.v24.segment.PD1;
import ca.uhn.hl7v2.model.v24.segment.PID;
import ca.uhn.hl7v2.model.v24.segment.PV1;
import ca.uhn.hl7v2.model.v24.segment.PV2;
import ca.uhn.hl7v2.model.v24.segment.SCH;
import ca.uhn.hl7v2.model.v24.segment.TXA;

public abstract class VoMapper  implements IMessageHandler 
{

	private static final Logger			LOG		= Logger.getLogger(VoMapper.class);
	private DomainSession				sess;
	
//	private static String				currentProviderExternalCode;
//	private static TaxonomyType			extType;

	protected HL7Config					cfg;
	protected LookupService				svc;
	protected Demographics				demog;
	protected ADT						adt;
	protected OrganisationAndLocation	orgLoc;
	protected HcpAdmin					hcpAdmin;
	protected MosAdmin					mosAdmin;
	protected PatientSearch				psearch;
	protected OcsIfInbound				ocsIfInbound;
	protected OcsIf						ocsIf;
	protected GPAdmin					gpAdmin;
	protected LookupTree				lookupTree;
	protected CareSpellDialog			careSpellDialog;
	protected DischargeInpatient		dischargeInpatient;
	protected IRefManDomainHelper       RefMandomain;
	protected HL7TTOIF					hl7tto;
	protected CareContextSelectDialog	careContextSelectDialog;
	protected Allergies					allergy;
	protected ClinicalCoding			allergen;
	
	

	public static final String			Hl7Null 	= "\"\"";
	
	// Communication Channel Uses
	public static final String			Home		= "PRN";
	public static final String			Other		= "ORN";
	public static final String			Work		= "WPN";
	public static final String			Vacation	= "VHN";
	public static final String			Answering	= "ASN";
	public static final String			Emergency	= "EMR";
	public static final String			Email		= "NET";
	public static final String			Beeper		= "BPN";
	
	// Communication Channel Types
	public static final String			Phone		= "PH";
	public static final String			Mobile		= "CP";
	public static final String			Fax			= "FX";
	public static final String			Modem		= "MD";

	protected static final String OUTPATIENT_APP = "O";
	protected static final String INPATIENT_APP = "I";
	protected static final String EMERGENCY_APP = "E";
	protected static final String PREADMIT = "P";
	
	public int						processedCount = 0;
	public int						errorCount = 0;
	public int 						successCount = 0;
	
	public DateTime lastSuccessDateTime;
	public String lastSuccessMessage;
	public DateTime lastFailedDateTime;
	public String lastFailedMessage;
		

	//WDEV-20112
//	public abstract Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception;
	public abstract EventResponse processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception; //WDEV-20112


	protected Object getDomainImpl(String className) throws Exception
	{
		Class<?> implClass = Class.forName(className);
		DomainImplFlyweightFactory factory = DomainImplFlyweightFactory.getInstance();
		return factory.create(implClass, sess);
	}

	public ProviderSystemVo getProviderSystem(String sendingApplication) throws HL7Exception
	{
		LOG.debug("VoMapper getProviderSystem for SendingApplication = " + sendingApplication);
		ProviderSystemVo vo = ocsIf.getProviderSystem(sendingApplication);
		if (vo == null)
		{
			LOG.warn("Provider System not found for sendingApplication = " + sendingApplication);
			throw new HL7Exception("Provider System not found for sendingApplication = " + sendingApplication);			
		}
		if (null==vo.getCodeSystem()||null==vo.getCodeSystem().getText())
		{
			throw new HL7Exception("Provider System Coding configuration incorrect for = " + sendingApplication);
		}
		LOG.info("Provider System " + vo.getCodeSystem().getText() + " found for sendingApplication" + sendingApplication);		
		LOG.debug("VoMapper getProviderSystem - CurrentProviderExternalCode = " + vo.getCodeSystem().getText());
		return vo;
	}
	
	public Category getOrderCategory(String sendingApplication) throws HL7Exception
	{
		ProviderSystemVo vo = getProviderSystem(sendingApplication);
		if (vo != null)
			return vo.getCategory();
		return null;
	}
	
	public HcpAdmin getHcpAdmin()
	{
		return hcpAdmin;
	}

	public HL7Config getCfg()
	{
		return cfg;
	}

	public void setCfg(HL7Config cfg)
	{
		this.cfg = cfg;
	}

	public DomainSession getSess()
	{
		return sess;
	}

	public void setSess(DomainSession sess)
	{
		this.sess = sess;
	}

	public void setHcpAdmin(HcpAdmin hcpAdmin)
	{
		this.hcpAdmin = hcpAdmin;
	}

	public OrganisationAndLocation getOrgLoc()
	{
		return orgLoc;
	}

	public void setOrgLoc(OrganisationAndLocation orgLoc)
	{
		this.orgLoc = orgLoc;
	}

	public abstract Message populateMessage();

	public LookupService getSvc()
	{
		return svc;
	}

	public void setSvc(LookupService svc)
	{
		this.svc = svc;
	}

	public void setDemog(Demographics demog)
	{
		this.demog = demog;
	}

	public Demographics getDemog()
	{
		return demog;
	}

	public void setPSearch(PatientSearch psearch)
	{
		this.psearch = psearch;
	}

	public PatientSearch getPSearch()
	{
		return psearch;
	}

	public void setADT(ADT adt)
	{
		this.adt = adt;
	}

	public ADT getADT()
	{
		return adt;
	}
	
	public PatientRefVo getPatient(Message msg, ProviderSystemVo providerSystem) throws Exception
	{
		PID pid=null;

		//WDEV-20035 Don't cause an exception when no PID segment exists in inbound message
		if (msg instanceof MFN_M02 || msg instanceof MFN_M05)
		{
			return null;
		} //WDEV-20035

		if (msg instanceof ORM_O01)
		{
			pid=((ORM_O01)msg).getORM_O01_PIDPD1NTEPV1PV2IN1IN2IN3GT1AL1().getPID();
		}
		else if (msg instanceof OMG_O19)
		{
			pid=((OMG_O19)msg).getOMG_O19_PIDPD1NTEPV1PV2IN1IN2IN3GT1AL1().getPID();
		}
		else if (msg instanceof ORR_O02)
		{
			pid=((ORR_O02)msg).getORR_O02_PIDNTEORCOBRRQDRQ1RXOODSODTNTECTI().getORR_O02_PIDNTE().getPID();
		}
		else if (msg instanceof ORG_O20)
		{
			pid=((ORG_O20)msg).getORG_O20_PIDNTEORCOBRNTECTI().getORG_O20_PIDNTE().getPID();
		}
		else if (msg instanceof ORU_R01)
		{
			pid=((ORU_R01)msg).getORU_R01_PIDPD1NK1NTEPV1PV2ORCOBRNTECTDOBXNTEFT1CTI().getORU_R01_PIDPD1NK1NTEPV1PV2().getPID();
		}
		else
		{
			pid = (PID) msg.get("PID");
		}
		
		Patient patVo = getPrimaryIdFromPid(pid, providerSystem);
		Patient patVo2 = getDemog().getPatient(patVo);
		
		if (patVo2 != null)
			patVo = patVo2;
		
		return patVo;
	}

	public Patient savePatient(Message msg, ProviderSystemVo providerSystem) throws Exception
	{
		return savePatient(msg, providerSystem, true);
	}

	public Patient savePatient(Message msg, ProviderSystemVo providerSystem, boolean includeNok) throws Exception
	{
		LOG.debug("VoMapper savePatient - entry");
		
		PID pid=null;
		PD1 pd1=null;
		NK1 nk1=null;
		PatientAlertLiteVoCollection  alertsFromMsg = null;
		IfPatientAllergyVoCollection allergiesFromMsg = null;
		PatientAlertLiteVoCollection  alertsToSave = null;
		boolean deactivatePASAlerts=false;

		if (msg instanceof ORM_O01)
		{
			//pid=((ORM_O01)msg).getPATIENT().getPID();
			pid=((ORM_O01)msg).getORM_O01_PIDPD1NTEPV1PV2IN1IN2IN3GT1AL1().getPID();
		}
		else if (msg instanceof OMG_O19)
		{
			pid=((OMG_O19)msg).getOMG_O19_PIDPD1NTEPV1PV2IN1IN2IN3GT1AL1().getPID();
		}
		else if (msg instanceof ORR_O02)
		{
			//pid=((ORR_O02)msg).getRESPONSE().getPATIENT().getPID();
			pid=((ORR_O02)msg).getORR_O02_PIDNTEORCOBRRQDRQ1RXOODSODTNTECTI().getORR_O02_PIDNTE().getPID();
		}
		else if (msg instanceof ORG_O20)
		{
			//pid=((ORG_O20)msg).getRESPONSE().getPATIENT().getPID();
			pid=((ORG_O20)msg).getORG_O20_PIDNTEORCOBRNTECTI().getORG_O20_PIDNTE().getPID();
		}
		else if (msg instanceof ORU_R01)
		{
			//pid=((ORU_R01)msg).getPATIENT_RESULT().getPATIENT().getPID();
			pid=((ORU_R01)msg).getORU_R01_PIDPD1NK1NTEPV1PV2ORCOBRNTECTDOBXNTEFT1CTI().getORU_R01_PIDPD1NK1NTEPV1PV2().getPID();
		}
		else if (msg instanceof PPG_PCG)
		{
			pid = (PID) msg.get("PID");
		}
		else if (msg instanceof REF_I12)
		{
			pid=(PID) ((REF_I12)msg).getREF_I12_AUTCTD().get("PID");
		}
		else if(msg instanceof ADT_A39) //http://jira/browse/WDEV-6819
		{
			pid= ((ADT_A39) msg).getADT_A39_PIDPD1MRGPV1().getPID();
		}

		else //ADT? - Not quite
		{
			pid = (PID) msg.get("PID");
			pd1 = (PD1) msg.get("PD1");
			if (includeNok)
			{
				nk1 = (NK1) msg.get("NK1");
			}
			
			// wdev-7262 - OBX Segment is not in quite a few of the ADT messages, 
			// message type needs to be checked in before trying to access it
			// The following ADT msgs do not have OBX, though we only support some of these
			// A18, 20, 24, 30, 34, 35, 36, 37, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 48, 50, 51, 52, 53
			if (!(msg instanceof ADT_A30) && !(msg instanceof ADT_A39) && !(msg instanceof ADT_A52))
			{
				Structure[] obxs=msg.getAll("OBX");
				alertsFromMsg = new PatientAlertLiteVoCollection();
				alertsToSave = new PatientAlertLiteVoCollection();
				allergiesFromMsg = new IfPatientAllergyVoCollection();
				for (int i=0;i<obxs.length;i++)
				{
					OBX obx=(OBX)obxs[i];
					String obsResStatus=obx.getObservationResultStatus().getValue();
					String alert=obx.getObservationIdentifier().getIdentifier().getValue();
					String observationType=obx.getObservationIdentifier().getNameOfCodingSystem().getValue();
					String valueType=obx.getValueType().getValue();
		
					//http://jira/browse/WDEV-15830 
					String alertcomment=null;
					String dateIdentified=null;
					if(ConfigFlag.HL7.HL7_PROCESS_EXTENDED_ALERT_DATA.getValue())
					{
						if(obx.getObservationValue()!=null
								&&obx.getObservationValue().length>0)
						{
						alertcomment = HL7Utils.getValueFromVariant(obx.getObservationValue()[0], 0);
						}
						dateIdentified = obx.getDateTimeOfTheObservation().getTimeOfAnEvent().getValue();
					} //End http://jira/browse/WDEV-15830
					if	(observationType==null||!observationType.equals("ALERT"))
					{
						LOG.warn("OBX-3 C3 (Observation identifier - name of coding system must have the value ALERT for Patient Alerts");
					}
					else if(obsResStatus==null||!obsResStatus.equals("X"))
					{
						throw new Exception("OBX-11(Observation result status) is mandatory and must have the value X for Patient Alerts");
					}
					else if(valueType==null||!valueType.equals("ST"))
					{
						throw new Exception("OBX-2(Value type) is mandatory and must have the value ST for Patient Alerts");
					}
					else 
					{
						if("\"\"".equals(alert)&&"A31".equalsIgnoreCase(HL7Utils.getEventCode(msg)))
						{
							deactivatePASAlerts=true;
							break;
						}
						String extSystem = ConfigFlag.DOM.DEMOGRAPHICS_EXT_SYSTEM.getValue();
						AllergenRefVo allergen=null;
						AlertType alertLookup =(AlertType)getADT().getLookupService().getLocalLookup(AlertType.class, AlertType.TYPE_ID, extSystem, alert);
						if(alertLookup==null)
						{
							allergen = allergy.getAllergenForTaxonomy(providerSystem.getCodeSystem(), alert);
							if(allergen!=null)
							{
							IfPatientAllergyVo patientAllergy = new IfPatientAllergyVo();
							patientAllergy.setAllergen(allergen);
							patientAllergy.setIsCurrentlyActiveAllergy(Boolean.TRUE);
							patientAllergy.setSourceofInformation(SourceofInformation.PAS);
							allergiesFromMsg.add(patientAllergy);
							
							}
							else
							{
								LOG.warn("Cannot find AlertType or Allergen with a "+extSystem +" mapping of "+alert);
							}
						}
						else
						{
							PatientAlert alertVo=new PatientAlert();
							alertVo.setAlertType(alertLookup);
							//http://jira/browse/WDEV-15670
							if(ConfigFlag.HL7.HL7_PROCESS_EXTENDED_ALERT_DATA.getValue())
							{
								if (dateIdentified != null)
								{
									if (dateIdentified.equals(Hl7Null) || dateIdentified.length() < 4)
									{
										alertVo.setDateIdentified(null);
									}
									else
									{
										alertVo.setDateIdentified(new PartialDate(dateIdentified));
									}
								}
								//http://jira/browse/WDEV-15670
								if(Hl7Null.equals(alertcomment))
								{
									alertVo.setComments(null);
								}
								else
								{
									alertVo.setComments(alertcomment);
								}
							}
							alertVo.setIsCurrentlyActiveAlert(Boolean.TRUE);
							alertVo.setSourceofInformation(SourceofInformation.PAS);
							alertsFromMsg.add(alertVo);
						}
					}
				}
				
			}
			
			
		}
		Patient patVo = getPrimaryIdFromPid(pid, providerSystem);
		Patient patVo2 = getDemog().getPatient(patVo);
		boolean doDemographicCheck=false;
		if(patVo2==null&&providerSystem.getConfigurationProperty("SecondaryID")!=null
				&&providerSystem.getConfigurationProperty("SecondaryID").getPropertyValue()!=null)
		{
			PatIdType idLookup =PatIdType.getNegativeInstance(providerSystem.getConfigurationProperty("SecondaryID").getPropertyValue());
			if(idLookup!=null)
			{
				PatientIdCollection ids=getIdentifiersFromPid(pid,providerSystem,idLookup);
				if(ids!=null&&ids.size()>0)
				{
	//				throw new HL7Exception("No Identifier of type"+idLookup.getText());
					patVo.setIdentifiers(ids);
					patVo2 = getDemog().getPatient(patVo);
					if(patVo2!=null)
						doDemographicCheck=true;
				}
			}
		}
		if (patVo2 != null)
			patVo = patVo2;

		if(doDemographicCheck)
			demographicCheck(patVo,pid,providerSystem);
			
		populatePatientFromPID(patVo, pid, providerSystem);
		if (pd1 != null)
		{
			//WDEV-20278
//			populatePatientGPDetailsFromPD1(patVo, pd1);			
			populatePatientGPDetailsFromPD1(patVo, pd1, providerSystem); //WDEV-20278
			populatePatientOccupationFromPD1(patVo, pd1, providerSystem); //WDEV-22969
		}
		if (includeNok && nk1 != null)
		{
			patVo.setNok(populateNextOfKinVoFromNK1(patVo.getNok(), nk1,providerSystem));
		}
		
		if ((msg instanceof ADT_A05))
		{
			Structure [] in1s = msg.getAll("ADT_A05_IN1IN2IN3ROL");
			for (Structure structure : in1s)
			{
				IN1 in1 = ((ADT_A05_IN1IN2IN3ROL)structure).getIN1();
				if(isEHIC(in1))
					populateEHICDetails(patVo, in1, providerSystem);
				else
					populateInsuranceDetails(patVo,in1,providerSystem);
			}
		}
		
		//Update the alerts with the patient before validating them
		if(deactivatePASAlerts&&patVo.getPatientAlerts()!=null)
		{
			for (PatientAlertLiteVo existingAlert : patVo.getPatientAlerts())
			{
				if(existingAlert.getIsCurrentlyActiveAlert()&&existingAlert.getSourceofInformation().equals(SourceofInformation.PAS))
				{
					existingAlert.setIsCurrentlyActiveAlert(Boolean.FALSE);
					
				}
			}
		}
		else
		{
			//Go through the current alerts and remove any duplicates
			if (alertsFromMsg != null/*&&alertsFromMsg.size()!=0*/ )//http://jira/browse/WDEV-17156
			{
				if(patVo!=null &&patVo.getPatientAlertsIsNotNull()) //WDEV-14427 
				{
					for (PatientAlertLiteVo existingAlert : patVo.getPatientAlerts())
					{
						if((!isAlertInMessage(existingAlert,alertsFromMsg))
								&&existingAlert.getSourceofInformationIsNotNull()
								&&existingAlert.getSourceofInformation().equals(SourceofInformation.PAS)
								&&existingAlert.getIsCurrentlyActiveAlertIsNotNull()
								&&existingAlert.getIsCurrentlyActiveAlert()	)
						{
							existingAlert.setIsCurrentlyActiveAlert(Boolean.FALSE);
							alertsToSave.add(existingAlert);
						}
					}
				}
				
				
				//Go through all the alerts in the message removing any that already in the patient record
				Iterator<PatientAlertLiteVo> msgAlertIterator = alertsFromMsg.iterator();
				while(msgAlertIterator.hasNext())
				{
					PatientAlertLiteVo msgAlertVo=msgAlertIterator.next();
					if(patVo.getPatientAlertsIsNotNull())
					{
						for (PatientAlertLiteVo existingAlert : patVo.getPatientAlerts())
						{
							if(msgAlertVo.getAlertType().equals(  existingAlert.getAlertType())
								&&msgAlertVo.getIsCurrentlyActiveAlert().equals(existingAlert.getIsCurrentlyActiveAlert())
								&&msgAlertVo.getSourceofInformation().equals(existingAlert.getSourceofInformation()))
							{
								//	Same alert
//								alertsFromMsg.remove(msgAlertVo);
								msgAlertIterator.remove();
								//WDEV-14427  break here so we don't remove the same one twice
								break;
							}
						}
					}
					msgAlertVo.setPatient(patVo);
				}
				
				for (PatientAlertLiteVo patientAlertLiteVo : alertsFromMsg) {
					alertsToSave.add(patientAlertLiteVo);
				}
				
				
				String []errs= alertsToSave.validate();	
				if (errs != null)
				{			
					throw new Exception("Validation of Alerts failed. " + VoMapper.toDisplayString(errs));
				}
			patVo.setPatientAlerts(alertsToSave);
			}
		}
		String[] errs = patVo.validate();
		if (errs != null)
		{			
			throw new Exception("Validation of Patient failed. " + VoMapper.toDisplayString(errs));
		}
		
		if(patVo.getID_PatientIsNotNull())
		{
			setPatientContext(patVo.getID_Patient());
		}
		else
		{
			clearPatientContext();
		}
			
		Patient pat =  getDemog().savePatient(patVo,true);
		
		if(allergiesFromMsg!=null) //http://jira/browse/WDEV-17335
		{
			allergy.updatePASAllergies(pat.toPatientRefVo(),allergiesFromMsg);
		}
		
		
		//WDEV-4752 
		setPatientContext(pat.getID_Patient());
		
		return pat;

	}
	

//http://jira/browse/WDEV-15670	
	private boolean isAlertInMessage(PatientAlertLiteVo existingAlert,PatientAlertLiteVoCollection alertsFromMsg)
	{
		for (PatientAlertLiteVo msgAlertLiteVo : alertsFromMsg)
		{
			if ((msgAlertLiteVo. getAlertType() == null ? existingAlert.getAlertType() == null : msgAlertLiteVo. getAlertType().equals(  existingAlert.getAlertType()))
				&&(msgAlertLiteVo.getIsCurrentlyActiveAlert()==null ? existingAlert.getIsCurrentlyActiveAlert()==null : msgAlertLiteVo.getIsCurrentlyActiveAlert().equals(existingAlert.getIsCurrentlyActiveAlert()))
				&&(msgAlertLiteVo.getSourceofInformation()==null ? existingAlert.getSourceofInformation()==null : msgAlertLiteVo.getSourceofInformation().equals(existingAlert.getSourceofInformation()))
//WDEV-17156				&&(msgAlertLiteVo.getComments()==null ? existingAlert.getComments()==null : msgAlertLiteVo.getComments().equals(existingAlert.getComments()))
//WDEV-17156				&&(msgAlertLiteVo.getDateIdentified()==null ? existingAlert.getDateIdentified()==null : msgAlertLiteVo.getDateIdentified().equals(existingAlert.getDateIdentified()))
					)
				{
					//	Same alert
					return true;
					
				}
		}
		return false;
	}

	private void populateInsuranceDetails(Patient patVo,IN1 in1,ProviderSystemVo providerSystem) throws HL7Exception
	{
		NationalHealthCoverVo insurance = null;
		PatientMedicalInsuranceVo medInsurance = null;
		if(patVo.getNationalHealthCover() == null)
			insurance = new NationalHealthCoverVo();
		else
			insurance=patVo.getNationalHealthCover();
		
		if(patVo.getCurrentMedicalInsurance()==null)
		{
			medInsurance=new PatientMedicalInsuranceVo();
			medInsurance.setPatient(patVo);
		}
		else
		{
			medInsurance=patVo.getCurrentMedicalInsurance();
		}

		medInsurance.setPatient(patVo);
		
		//IN1-3
		String insuranceCompany=in1.getInsuranceCompanyID(0).getID().getValue();
		PrivateInsuranceCompanyVo company = adt.getPrivateInsuranceCompany(insuranceCompany,providerSystem.getCodeSystem()); 
		
		medInsurance.setCompany(company);
		
		

		//IN1-36
		String insuranceRegNumber = in1.getPolicyNumber().getValue();
		if (insuranceRegNumber != null)
		{
			if (insuranceRegNumber.equals(Hl7Null))
				medInsurance.setPolicyNumber(null);
			else
				medInsurance.setPolicyNumber(insuranceRegNumber);
		}
		
		//IN1-2
		String insurancePlan = in1.getInsurancePlanID().getIdentifier().getValue();
		if (insurancePlan != null)
		{
			if (insurancePlan.equals(Hl7Null))
			{
				medInsurance.setPolicyType(null);
				medInsurance.setPlanOrUnits(null);
			}
			else
			{
				PrivateInsurancePolicyType policy = (PrivateInsurancePolicyType)svc.getLocalLookup(PrivateInsurancePolicyType.class, PrivateInsurancePolicyType.TYPE_ID, providerSystem.getCodeSystem().getText(),insurancePlan);
				if(policy!=null)
				{
					medInsurance.setPolicyType(policy);
					medInsurance.setPlanOrUnits(null);
					
				}
				else
				{
					medInsurance.setPolicyType(PrivateInsurancePolicyType.OTHER);
					medInsurance.setPlanOrUnits(insurancePlan);
				}
			}
		}

		//IN1-13
		Date date = populateDateVoFromDT(in1.getPlanExpirationDate());
		if (date!=null)
		{
			medInsurance.setExpiryDate(date);
		}
		
		//IN1-28
		String eligibility = in1.getPreAdmitCert().getValue();
		if (eligibility != null)
		{
			if (eligibility.equals(Hl7Null))
				//WDEV-23272
//				insurance.setHealthActCategory(null);
				insurance.setEligibility(null); //WDEV-23272

			else
				//WDEV-23727
//				insurance.setHealthActCategory((PersonHealthActCategory) svc.getLocalLookup(PersonHealthActCategory.class, PersonHealthActCategory.TYPE_ID, providerSystem.getCodeSystem().getText(),eligibility));
				insurance.setEligibility((Eligibility) svc.getLocalLookup(Eligibility.class, Eligibility.TYPE_ID, providerSystem.getCodeSystem().getText(),eligibility)); //WDEV-23727
		}
		
		//IN1-35
		String medCardNumber = in1.getCompanyPlanCode().getValue();
		if(medCardNumber!=null)
		{
			if(medCardNumber.equals(Hl7Null))
				insurance.setMedicalCardNo(null);
			else
				insurance.setMedicalCardNo(medCardNumber);
		}
		
		//IN1-31
		String proved = in1.getBillingStatus().getValue();
		if (proved != null)
		{
			if (proved.equals(Hl7Null))
				insurance.setMedicalCardProved(null);
			else
				insurance.setMedicalCardProved((YesNo) svc.getLocalLookup(YesNo.class, YesNo.TYPE_ID, providerSystem.getCodeSystem().getText(),proved));
		}
		
		//IN1-14-3
		String proof = in1.getAuthorizationInformation().getSource().getValue();
		if (proof != null)
		{
			if (proof.equals(Hl7Null))
				insurance.setEligibilityProof(null);
			else
				insurance.setEligibilityProof(proof);
		}

		//IN1-29
		String medCardExpity = in1.getVerificationDateTime().getTimeOfAnEvent().getValue();
		if (medCardExpity != null)
		{
			if (medCardExpity.equals(Hl7Null) || medCardExpity.length() < 4)
			{
				insurance.setMedicalCardExpiryDate(null);
			}
			else
			{
				insurance.setMedicalCardExpiryDate(new PartialDate(medCardExpity));
			}
		}
		
		if(patVo.getCurrentMedicalInsurance()==null)
			patVo.setCurrentMedicalInsurance(medInsurance);
			
		if(patVo.getNationalHealthCover() == null)	
			patVo.setNationalHealthCover(insurance);
	}
	
	private boolean isEHIC(IN1 in1) throws HL7Exception
	{
		//IN1-2
		String insurancePlan = in1.getInsurancePlanID().getIdentifier().getValue();
		if(!"EHIC".equals(insurancePlan))
			return false;
		//IN1-3
		String insuranceCompany = in1.getInsuranceCompanyID(0).getID().getValue();
		if(!"EHIC".equals(insuranceCompany))
			return false;
		return true;

	}
	
	private void populateEHICDetails(Patient patVo,IN1 in1,ProviderSystemVo providerSystem) throws HL7Exception
	{
		if (!isEHIC(in1))
			return;
		
		NationalHealthCoverVo insurance = null;
		if(patVo.getNationalHealthCover() == null)
			insurance = new NationalHealthCoverVo();
		else
			insurance=patVo.getNationalHealthCover();

		//IN1-36
		String insuranceRegNumber = in1.getPolicyNumber().getValue();
		if (insuranceRegNumber != null)
		{
			if (insuranceRegNumber.equals(Hl7Null))
				insurance.setEHICNumber(null);
			else
				insurance.setEHICNumber(insuranceRegNumber);
		}
		
		//IN1-13
		String date = in1.getPlanExpirationDate().getValue();
		if (date!=null)
		{
			insurance.setEHICExpiryDate(new PartialDate(date));
		}

		//IN1-5-6
		String country = in1.getInsuranceCompanyAddress(0).getCountry().getValue();
		if (country != null)
		{
			if (country.equals(Hl7Null))
				insurance.setMedicalCardProved(null);
			else
				insurance.setEHICCountry((Country) svc.getLocalLookup(Country.class, Country.TYPE_ID, providerSystem.getCodeSystem().getText(),country));
		}
 
		//IN1-4
		String institution = in1.getInsuranceCompanyName(0).getOrganizationName().getValue();
		if(institution!=null)
		{
			if(institution.equals(Hl7Null))
				insurance.setEHICInstitution(null);
			else
				insurance.setEHICInstitution(institution);
		}
		
		if(patVo.getNationalHealthCover() == null)	
			patVo.setNationalHealthCover(insurance);
	}
	
	
	
	//WDEV-20278	
//	private void populatePatientGPDetailsFromPD1(Patient patVo, PD1 pd1) throws HL7Exception
	private void populatePatientGPDetailsFromPD1(Patient patVo, PD1 pd1, ProviderSystemVo providerSystem) throws HL7Exception //WDEV-20278
	{
		// As there was an inconsistency between chapter 2 and 3 of the HL7 Specification for
		// PD1 and XON, we have to look for the practice code in the organisation name
		// component.
		String gpCode = pd1.getPatientPrimaryCareProviderNameIDNo(0).getIDNumber().getValue();
		if (gpCode != null)
			patVo.setGp(gpAdmin.getGPByTaxonomyType(gpCode, TaxonomyType.NAT_GP_CODE));
		//TODO: JME: 20060901: McKesson sending the practice code in the org name (1st) component
		//Should be in the ID (3rd) component. Temp fix here.
		String pracCode = pd1.getPatientPrimaryFacility(0).getOrganizationName().getValue();
		String surgeryCode=null;
		if (pd1.getPatientPrimaryFacility().length > 1)
			surgeryCode = pd1.getPatientPrimaryFacility(1).getIDNumber().getValue();
		if (surgeryCode == null)  // wdev-4457
			surgeryCode = pd1.getPatientPrimaryFacility(0).getIDNumber().getValue();

		if (pracCode != null)
		{
			if(ConfigFlag.HL7.HEARTS_GP_MODEL.getValue()&&gpCode!=null&&gpCode!=Hl7Null) //
			{
				//WDEV-20278
//				LocSiteShortVo surgery=orgLoc.getLocSiteShortByTaxonomyType(pracCode + "_" + gpCode+"_"+surgeryCode, TaxonomyType.PAS);
				LocSiteShortVo surgery=orgLoc.getLocSiteShortByTaxonomyType(pracCode + "_" + gpCode+"_"+surgeryCode, providerSystem.getCodeSystem()); //WDEV-20278
				if(surgery==null)
				{
					//WDEV-20278
//					surgery=orgLoc.getLocSiteShortByTaxonomyType(pracCode + "_" + surgeryCode, TaxonomyType.PAS);
					surgery=orgLoc.getLocSiteShortByTaxonomyType(pracCode + "_" + surgeryCode, providerSystem.getCodeSystem()); //WDEV-20278
				}
				patVo.setGpSurgery(surgery);
			}
			else
			{
				//WDEV-20278
//				patVo.setGpSurgery(orgLoc.getLocSiteShortByTaxonomyType(pracCode + "_" + surgeryCode, TaxonomyType.PAS));
				patVo.setGpSurgery(orgLoc.getLocSiteShortByTaxonomyType(pracCode + "_" + surgeryCode, providerSystem.getCodeSystem())); //WDEV-20278
			}
		}
		
	}
	
	//WDEV-22969
	private void populatePatientOccupationFromPD1(Patient patVo, PD1 pd1, ProviderSystemVo providerSystem) throws HL7Exception 
	{
		// PD1-2 (Living Arrangement) contains patient's occupation (NON-STANDARD)

		String occupation = pd1.getLivingArrangement().getValue();
		
		if (occupation != null)
		{
			if (ConfigFlag.UI.DEMOGRAPHICS_TYPE.getValue().equals("IRISH"))
			{
				patVo.setTxtOccupation(occupation);
			}
			else
			{
				if (occupation.equals(Hl7Null))
					patVo.setOccupation(null);
				else
					patVo.setOccupation((Occupation) svc.getLocalLookup(Occupation.class, Occupation.TYPE_ID, providerSystem.getCodeSystem().getText(), occupation));
			}
		}
	} //WDEV-22969	

	protected Patient getPrimaryIdFromMrg(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	{
		MRG mrg = null;
		if (msg instanceof ADT_A39) //http://jira/browse/WDEV-6819
		{
			mrg = ((ADT_A39)msg).getADT_A39_PIDPD1MRGPV1().getMRG();
		}else 
		{
			mrg= (MRG)msg.get("MRG");
		}
		CX[] idList = mrg.getPriorPatientIdentifierList();
		return getPrimaryIdPatient(idList, providerSystem);
	}

	protected Patient getPrimaryIdFromPid(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	{
		PID pid=null;
		if(msg instanceof ADT_A39) //http://jira/browse/WDEV-6819
		{
			pid= ((ADT_A39) msg).getADT_A39_PIDPD1MRGPV1().getPID();
		}
		else
		{
			pid = (PID) msg.get("PID");
		}
		return this.getPrimaryIdFromPid(pid, providerSystem);
	}
	
	protected Patient getPrimaryIdFromPid(PID pid, ProviderSystemVo providerSystem) throws HL7Exception
	{
		CX[] idList = pid.getPatientIdentifierList();
		return getPrimaryIdPatient(idList, providerSystem);
	}

	private Patient getPrimaryIdPatient(CX[] idList, ProviderSystemVo providerSystem) throws HL7Exception
	{
		LOG.debug("VoMapper getPrimaryIdPatient - entry");
		
		Patient vo = new Patient();
		if (idList.length == 0)
			throw new HL7Exception("PID must contain Primary Patient ID Type : " + providerSystem.getPrimaryPatientId().getText());
		
		if (providerSystem.getPrimaryPatientId() == null || providerSystem.getIdtypeComponent() == null)
			throw new HL7Exception("Provider System " + providerSystem.getSystemName() + " must specify ID Component and Primary Patient ID Type "); 
		
		PatientIdCollection coll = new PatientIdCollection();
		for (int i = 0; i < idList.length; i++)
		{
			String idType;
			if (providerSystem.getIdtypeComponent().intValue() == 4)
			{
				idType = idList[i].getAssigningAuthority().getNamespaceID().getValue();
			}
			else if (providerSystem.getIdtypeComponent().intValue() == 5)
			{
				idType = idList[i].getIdentifierTypeCode().getValue();
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
			if (idVal == null||"".equals(idVal)||Hl7Null.equals(idVal)) //http://jira/browse/WDEV-13709
				continue;
			

			PatIdType providedType = (PatIdType) getDemog().getLookupService().getLocalLookup(PatIdType.class, PatIdType.TYPE_ID, providerSystem.getCodeSystem().getText(), idType);
			if (providedType != null && providedType.equals(providerSystem.getPrimaryPatientId()))
			{
				if (providedType != null)
				{
					//JME: 20060119: for all id types, remove the leading char.					
					if (providerSystem.getCodeSystem().getText().equals("PAS") && !providedType.equals(PatIdType.NHSN) && !providedType.equals(PatIdType.DISTRICT) && ConfigFlag.HL7.HL7_STRIP_PATIENT_IDENTIFIER_CHARACTER.getValue())
						idVal = idVal.substring(1);

					PatientId patid = new PatientId();
					patid.setType(providedType);
					patid.setValue(idVal.trim());
					//wdev-8055
					if (providedType.equals(PatIdType.NHSN) && idList[i].getCheckDigit().getValue() != null && idList[i].getCheckDigit().getValue().equals("V")) 
						patid.setVerified(true);
					else
						patid.setVerified(false);
					coll.add(patid);
				}
				else
				{					
					throw new HL7Exception("Lookup Mapping for Primary Patient ID Type not available : " + providerSystem.getPrimaryPatientId() + " ExternalCode=" + providerSystem.getCodeSystem().getText());
				}
			}
		}
		
		// wdev-4259
		if (coll != null && coll.size() > 0)
		{
			vo.setIdentifiers(coll);
			LOG.debug("VoMapper getPrimaryIdPatient - exit");
			return vo;
		}

		throw new HL7Exception("PID must contain Primary Patient ID Type : " + providerSystem.getPrimaryPatientId());
	}
	
	//http://jira/browse/WDEV-13033
	protected PatientIdCollection getIdentifiersFromPid(PID pid, ProviderSystemVo providerSystem, PatIdType patIdType) throws HL7Exception
	{
		CX[] idList = pid.getPatientIdentifierList();
		return getIdentifiersFromPid(idList, providerSystem,patIdType);
	}

	//http://jira/browse/WDEV-13033
	private PatientIdCollection getIdentifiersFromPid(CX[] idList, ProviderSystemVo providerSystem, PatIdType patIdType) throws HL7Exception
	{
		LOG.debug("VoMapper getIdentifierFromPid - entry");
		if (idList.length == 0)
			throw new HL7Exception("PID must contain Patient Identifier List.");
		
		if (providerSystem.getPrimaryPatientId() == null || providerSystem.getIdtypeComponent() == null)
			throw new HL7Exception("Provider System " + providerSystem.getSystemName() + " must specify ID Component and Primary Patient ID Type "); 
		
		PatientIdCollection coll = new PatientIdCollection();
		for (int i = 0; i < idList.length; i++)
		{
			String idType;
			if (providerSystem.getIdtypeComponent().intValue() == 4)
			{
				idType = idList[i].getAssigningAuthority().getNamespaceID().getValue();
			}
			else if (providerSystem.getIdtypeComponent().intValue() == 5)
			{
				idType = idList[i].getIdentifierTypeCode().getValue();
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
			if (idVal == null||"".equals(idVal)||Hl7Null.equals(idVal)) //http://jira/browse/WDEV-13709
				continue;
			

			PatIdType providedType = (PatIdType) getDemog().getLookupService().getLocalLookup(PatIdType.class, PatIdType.TYPE_ID, providerSystem.getCodeSystem().getText(), idType);
			if (providedType != null&& providedType.equals(patIdType))
			{
				//JME: 20060119: for all id types, remove the leading char.					
				if (providerSystem.getCodeSystem().getText().equals("PAS") && !providedType.equals(PatIdType.NHSN) && !providedType.equals(PatIdType.DISTRICT) && ConfigFlag.HL7.HL7_STRIP_PATIENT_IDENTIFIER_CHARACTER.getValue())
					idVal = idVal.substring(1);

				PatientId patid = new PatientId();
				patid.setType(providedType);
				patid.setValue(idVal.trim());
				//wdev-8055
				if (providedType.equals(PatIdType.NHSN) && idList[i].getCheckDigit().getValue() != null && idList[i].getCheckDigit().getValue().equals("V")) 
					patid.setVerified(true);
				else
					patid.setVerified(false);
				coll.add(patid);
			}
//			else
//			{					
//				throw new HL7Exception("Lookup Mapping for Primary Patient ID Type not available : " + providerSystem.getPrimaryPatientId() + " ExternalCode=" + providerSystem.getCodeSystem().getText());
//			}
		}
		
		LOG.debug("VoMapper getIdentifierFromPid - exit");
		return coll;
	}

	
	
	
	

	public NextOfKin populateNextOfKinVoFromNK1(NK1 nk1,ProviderSystemVo providerSystem) throws HL7Exception
	{
		return (populateNextOfKinVoFromNK1(new NextOfKin(), nk1,providerSystem));
	}

	protected final NextOfKin populateNextOfKinVoFromNK1(NextOfKin nok, NK1 nk1,ProviderSystemVo providerSystem) throws HL7Exception
	{
		LOG.debug("VoMapper populateNextOfKinVoFromNK1: entry");

		if (nok == null)
			nok = new NextOfKin();
		if (nk1 == null)
			return nok;
		nok.setName(populateNameVoFromXPN(nok.getName(), nk1.getNKName(0),providerSystem));
		nok.setAddress(populateAddressVoFromXAD(nok.getAddress(), nk1.getAddress(0),providerSystem, AddressType.NOKHOME));
		
		//WDEV-14130 For NOK, we want to enforce the addrss type to be NOKHOME
		if (nok.getAddressIsNotNull())
			nok.getAddress().setAddressType(AddressType.NOKHOME);
		
		//	http://jira/browse/WDEV-15935 always create a new collection
		CommChannelVoCollection	coll = new CommChannelVoCollection();
		String workPhone = nk1.getBusinessPhoneNumber(0).getAnyText().getValue();
		CommChannelVo comm = nok.getCommunicationChannel(ChannelType.WORK_PHONE);
		if (workPhone != null)
		{
			if (workPhone.equals(Hl7Null))
			{
				if (comm != null)
					coll.remove(comm);
			}
			else
			{
				if (comm == null)
					comm = new CommChannelVo();
				comm.setChannelType(ChannelType.WORK_PHONE);
				comm.setCommValue(workPhone);
				coll.add(comm);
			}
		}
		String homePhone = nk1.getPhoneNumber(0).getAnyText().getValue();
		comm = nok.getCommunicationChannel(ChannelType.HOME_PHONE);
		if (homePhone != null)
		{
			 if (homePhone.equals(Hl7Null))
			 {
				 if (comm != null)
					 coll.remove(comm);
			 }
			 else
			 {
				 if (comm == null)
					 comm = new CommChannelVo();
				 comm.setChannelType(ChannelType.HOME_PHONE);
				 comm.setCommValue(homePhone);
				 coll.add(comm);
			 }
		}
		nok.setCommChannels(coll);

		// wdev-2905 Check for null value
		// If the home phone in communication channels has been
		// set to null then we set the main home phone to null too
		CommChannelVo homePhoneChannel = nok.getCommunicationChannel(ChannelType.HOME_PHONE);
		if (nok.getAddress() != null)
		{
			if (homePhoneChannel == null)
				nok.getAddress().setPhone(null);
			else
				nok.getAddress().setPhone(homePhoneChannel.getCommValue());
		}
		
		
		nok.setRelationship((PersonRelationship) svc.getLocalLookup(PersonRelationship.class, PersonRelationship.TYPE_ID, providerSystem.getCodeSystem().getText(), nk1.getRelationship().getIdentifier().getValue()));

		LOG.debug("VoMapper populateNextOfKinVoFromNK1: exit (" + nok.toString() + ")");

		if (nok.getName() == null && nok.getAddress() == null && nok.getCommChannels().size() == 0 && nok.getRelationship() == null)
		{
			return null;
		}
		else
			return nok;
	}


	//WDEV-20335
//	protected final void renderNextOfKinVoToNK1(NextOfKin nok, NK1 nk1,ProviderSystemVo providerSystem) throws Exception
	protected final void renderNextOfKinVoToNK1(NextOfKin nok, NK1 nk1,ProviderSystemVo providerSystem, Boolean isConfidential) throws Exception //WDEV-20335
	{
		LOG.debug("VoMapper renderNextOfKinVoToNK1: entry");
		if (nok == null)
			return;

		renderNameVoToXPN(nok.getName(), nk1.getNKName(0),providerSystem);
		
		//WDEV-20335
		if((isConfidential == null) || (!isConfidential))
		{
			renderAddressVoToXAD(nok.getAddress(), nk1.getAddress(0), providerSystem);
		}//WDEV-20335
		
		//WDEV-22006
//		CommChannelVo voWork = nok.getCommunicationChannel(ChannelType.WORK_PHONE);
//		if (voWork != null)
//			nk1.getBusinessPhoneNumber(0).getAnyText().setValue(voWork.getCommValue());
//		CommChannelVo vo = nok.getCommunicationChannel(ChannelType.HOME_PHONE);
//		if (vo != null)
//		{
//			nk1.getPhoneNumber(0).getAnyText().setValue(vo.getCommValue());
//		}
//		else
//		{
//			// wdev-3087 Check if home phone is set at address level
//			
//			if (nok.getAddressIsNotNull() && nok.getAddress().getPhoneIsNotNull())
//				nk1.getPhoneNumber(0).getAnyText().setValue(nok.getAddress().getPhone());
//		}

		//WDEV-22006
		if (nok.getCommChannels() != null)
		{
			renderCommChannelVoCollToNK1(nok.getCommChannels(), nk1, providerSystem);
		} 
		else if (nok.getAddress() != null 
				&& nok.getAddress().getPhone() != null)
		{
			nk1.getBusinessPhoneNumber(0).getTelecommunicationUseCode().setValue("WPN");
			nk1.getBusinessPhoneNumber(0).getTelecommunicationEquipmentType().setValue("PH");
			nk1.getBusinessPhoneNumber(0).getAnyText().setValue(nok.getAddress().getPhone());
		} //WDEV-22006

		
		if (nok.getRelationshipIsNotNull())
		{
			nk1.getRelationship().getIdentifier().setValue(svc.getRemoteLookup(nok.getRelationship().getID(), providerSystem.getCodeSystem().getText()));				
		}
		
		//WDEV-20336 
		//NK1-7 Contact role (CE)
		if (nok.getRoleIsNotNull())
		{
			nk1.getContactRole().getIdentifier().setValue(svc.getRemoteLookup(nok.getRole().getID(), providerSystem.getCodeSystem().getText()));
		}
			
		//NK1-16 Date/time of birth (TS)
		if (nok.getDobIsNotNull())
		{
			nk1.getDateTimeOfBirth().getTimeOfAnEvent().setValue(nok.getDob().toString(DateFormat.ISO));
		} //WDEV-20336
		

		LOG.debug("VoMapper renderNextOfKinVoToNK1: exit (" + nk1.toString() + ")");
	}

	//WDEV-20336
	protected final void renderPatRelativeVoToNK1(PatRelative nok, NK1 nk1, ProviderSystemVo providerSystem, Boolean isConfidential) throws Exception
	{
		LOG.debug("VoMapper renderPatRelativeVoToNK1: entry");
		if (nok == null)
			return;

		//NK1-2 Name (XPN)
		renderNameVoToXPN(nok.getName(), nk1.getNKName(0),providerSystem);

		//NK1-3 Relationship (CE)
		if (nok.getRelationshipIsNotNull())
		{
			nk1.getRelationship().getIdentifier().setValue(svc.getRemoteLookup(nok.getRelationship().getID(), providerSystem.getCodeSystem().getText()));
		}

		//NK1-4 Address (XAD)
		if((isConfidential == null) || (!isConfidential))
		{
			renderAddressVoToXAD(nok.getAddress(), nk1.getAddress(0), providerSystem);
		}

		//NK1-5 Phone number (XTN)
		//NK1-6 Business phone number (XTN)
		if(nok.getCommChannelsIsNotNull())
		{
			
			//http://jira/browse/WDEV-22006
//			CommChannelVoCollection comChannelVoCollection = nok.getCommChannels();
//			
//			int phNum = 0;
//			int workPhNum = 0;
//			
//			for (int i = 0; i < comChannelVoCollection.size(); i++)
//			{
//				CommChannelVo commChannel = comChannelVoCollection.get(i);
//				
//				if((ChannelType.WORK_PHONE).equals(commChannel.getChannelType()))
//				{channeltopid
			
//					nk1.getBusinessPhoneNumber(workPhNum).getTelecommunicationUseCode().setValue("WPN");
//					nk1.getBusinessPhoneNumber(workPhNum).getAnyText().setValue(commChannel.getCommValue());
//					workPhNum ++;
//				}
//				if((ChannelType.HOME_PHONE).equals(commChannel.getChannelType()))
//				{
//					if(phNum > 0)
//					{
//						nk1.getPhoneNumber(phNum).getTelecommunicationUseCode().setValue("ORN");
//					}
//					else
//					{
//						nk1.getPhoneNumber(phNum).getTelecommunicationUseCode().setValue("PRN");
//					}
//					nk1.getPhoneNumber(phNum).getAnyText().setValue(commChannel.getCommValue());
//					phNum ++;	
//				}
//			}
			renderCommChannelVoCollToNK1(nok.getCommChannels(), nk1, providerSystem); //WDEV-22006

		}

		//NK1-7 Contact role (CE)
		if(nok.getRoleIsNotNull())
		{
			nk1.getContactRole().getIdentifier().setValue(svc.getRemoteLookup(nok.getRole().getID(), providerSystem.getCodeSystem().getText()));
		}

		//http://jira/browse/WDEV-22006
		//NK1-8 Start date (DT)
		if (nok.getBeffdateIsNotNull())
		{
			nk1.getStartDate().setValue(nok.getBeffdate().toString(DateFormat.ISO));
		} //WDEV-22006
		
		//http://jira/browse/WDEV-22006
		//NK1-9 End date (DT)
		if (nok.getBetdateIsNotNull())
		{
			nk1.getEndDate().setValue(nok.getBetdate().toString(DateFormat.ISO));
		} //WDEV-22006
		
		//NK1-16 Date/time of birth (TS)
		if (nok.getDobIsNotNull())
		{
			nk1.getDateTimeOfBirth().getTimeOfAnEvent().setValue(nok.getDob().toString(DateFormat.ISO));
		}

		
		LOG.debug("VoMapper renderPatRelativeVoToNK1: exit (" + nk1.toString() + ")");
	} //WDEV-20336
	
	
	//http://jira/browse/WDEV-22006
	protected final void renderCommChannelVoCollToNK1(CommChannelVoCollection comChannelVoCollection, NK1 nk1, ProviderSystemVo providerSystem) throws Exception
	{
		/*
		  Components:  [NNN] [(999)]999-9999 [X99999] [B99999] [C any text] ^ <telecommunication use code (ID)> ^ <tele-communication equipment type (ID)> 
		               ^ <email address (ST)> ^ <country code (NM)> ^ <area/city code (NM)> ^ <phone number (NM)> ^ <extension (NM)> ^ <any text (ST)>
		               
		   Lookup PDSChannelUsage:
			H = Home Contact
			HP = Home
			HV = Home Vacation
			MC = Mobile
			PG = Pager
			WP = Office Address
			AS = Answering Machine
			EC = Emergency Contact
			
			Lookup ChannelType:
			GEN_PHONE
			HOME_PHONE
			WORK_PHONE
			MOBILE
			EMAIL
			WEB
			FAX
			BEEP
			EMERGENCY
		 */

		int xtnHomePhoneIter = 0;
		int xtnBusinessPhoneIter = 0;

		Boolean isPrimaryResidenceNumberAssigned = Boolean.FALSE;
				
		for (int i = 0; i < comChannelVoCollection.size(); i++)
		{
			CommChannelVo commChannel = comChannelVoCollection.get(i);
			
			Boolean isWorkAddressChannelUsage = Boolean.FALSE;
			Boolean isValidCommChannel = Boolean.TRUE;
			
			if (ChannelType.WORK_PHONE.equals (commChannel.getChannelType()))
			{
				if (commChannel.getCommValue() != null 
						&& isEmail(commChannel.getCommValue()))
				{
					/*
					 * commChannel.getCommValue() is actually an email address
					 * and configuration flag INCLUDE_EMAIL_FORMATTED_WORK_NUMBERS is FALSE
					 * Skip the processing of the Comm Channel
					 */	
					isValidCommChannel = Boolean.FALSE;
				}
			}

			if (commChannel.getCommValue() != null
					&& isValidCommChannel)
			{
				//----------------------------------------------
				// XTN.0 [(999)] 999-9999 [X99999] [C any text]
				
				//----------------------------------------------
				// XTN.1 telecommunication use code (ID)
	
				/*
				 *  Has a PDSChannelUsage value been assigned to this Comm Channel?
				 */
				if (commChannel.getChannelUsage() != null
						&& !(commChannel.getChannelUsage().getID() == 0))
				{
					/*
					 *  Is there a provider system external value mapping defined for this PDSChannelUsage lookup?
					 */
					String extCodeForChannelUsage = svc.getRemoteLookup(commChannel.getChannelUsage().getID(), providerSystem.getCodeSystem().getText());
					if (extCodeForChannelUsage != null)
					{
						if (PDSChannelUsage.WP.equals(commChannel.getChannelUsage()))
						{
							nk1.getBusinessPhoneNumber(xtnBusinessPhoneIter).getTelecommunicationUseCode().setValue(extCodeForChannelUsage);
							isWorkAddressChannelUsage = Boolean.TRUE;
						}
						else
						{
							nk1.getPhoneNumber(xtnHomePhoneIter).getTelecommunicationUseCode().setValue(extCodeForChannelUsage);
						}
					}
					else
					{
						/*
						 * No provider system external value mapping defined for PDSChannelUsage lookup - use the lookup text values
						 */
						if (PDSChannelUsage.WP.equals(commChannel.getChannelUsage()))
						{
							nk1.getBusinessPhoneNumber(xtnBusinessPhoneIter).getTelecommunicationUseCode().setValue(commChannel.getChannelUsage().getText());
							isWorkAddressChannelUsage = Boolean.TRUE;
						}
						else
						{
							nk1.getPhoneNumber(xtnHomePhoneIter).getTelecommunicationUseCode().setValue(commChannel.getChannelUsage().getText());
						}
					}
				}
				
				/*
				 *  No PDSChannelUsage value defined - use HL7 standard values based on ChannelType lookup
				 */
				else if (ChannelType.GEN_PHONE.equals(commChannel.getChannelType())
							|| ChannelType.HOME_PHONE.equals(commChannel.getChannelType())
							|| ChannelType.MOBILE.equals(commChannel.getChannelType()))
				{
					if (isPrimaryResidenceNumberAssigned)
					{
						nk1.getPhoneNumber(xtnHomePhoneIter).getTelecommunicationUseCode().setValue("ORN");					
					}
					else
					{
						nk1.getPhoneNumber(xtnHomePhoneIter).getTelecommunicationUseCode().setValue("PRN");
						isPrimaryResidenceNumberAssigned = Boolean.TRUE;
					}
				} 
	
				else if (ChannelType.WORK_PHONE.equals(commChannel.getChannelType()))
				{
					nk1.getBusinessPhoneNumber(xtnBusinessPhoneIter).getTelecommunicationUseCode().setValue("WPN");
					isWorkAddressChannelUsage = Boolean.TRUE;
				}
	
				else if (ChannelType.EMERGENCY.equals(commChannel.getChannelType()))
				{
					nk1.getPhoneNumber(xtnHomePhoneIter).getTelecommunicationUseCode().setValue("EMR");
				}
	
				else if (ChannelType.BLEEP.equals(commChannel.getChannelType()))
				{
					if (isWorkAddressChannelUsage)
					{
						nk1.getBusinessPhoneNumber(xtnBusinessPhoneIter).getTelecommunicationUseCode().setValue("BPN");
					}
					else
					{
						nk1.getPhoneNumber(xtnHomePhoneIter).getTelecommunicationUseCode().setValue("BPN");
					}
				}
				
				else if (ChannelType.EMAIL.equals(commChannel.getChannelType()) 
						|| ChannelType.WEB.equals(commChannel.getChannelType()))
				{
					if (isWorkAddressChannelUsage)
					{
						nk1.getBusinessPhoneNumber(xtnBusinessPhoneIter).getTelecommunicationUseCode().setValue("NET");
					}
					else
					{
						nk1.getPhoneNumber(xtnHomePhoneIter).getTelecommunicationUseCode().setValue("NET");
					}
				}
	
	
				//----------------------------------------------
				// XTN.2 tele-communication equipment type (ID)
				if (commChannel.getChannelType() != null
						&& !(commChannel.getChannelType().getID() == 0))
				{
					/*
					 *  Is there a provider system mapping defined for ChannelType lookup?
					 */
					String channelType = svc.getRemoteLookup(commChannel.getChannelType().getID(), providerSystem.getCodeSystem().getText());
					if (channelType != null)
					{
						if (ChannelType.WORK_PHONE.equals(commChannel.getChannelType())
								|| isWorkAddressChannelUsage)
						{
							nk1.getBusinessPhoneNumber(xtnBusinessPhoneIter).getTelecommunicationEquipmentType().setValue(channelType);
						}
						else
						{
							nk1.getPhoneNumber(xtnHomePhoneIter).getTelecommunicationEquipmentType().setValue(channelType);
						}
					}
	
					/*
					 *  No provider system mapping found for assigned ChannelType lookup - use HL7 standard values			
					 */
					else if (ChannelType.EMERGENCY.equals  (commChannel.getChannelType())
							|| ChannelType.GEN_PHONE.equals  (commChannel.getChannelType()) 
							|| ChannelType.HOME_PHONE.equals (commChannel.getChannelType()))
					{
						if (isWorkAddressChannelUsage)
						{
							nk1.getBusinessPhoneNumber(xtnBusinessPhoneIter).getTelecommunicationEquipmentType().setValue("PH");
						}
						else
						{
							nk1.getPhoneNumber(xtnHomePhoneIter).getTelecommunicationEquipmentType().setValue("PH");
						}
					}
		
					else if (ChannelType.WORK_PHONE.equals (commChannel.getChannelType()))
					{
						nk1.getBusinessPhoneNumber(xtnBusinessPhoneIter).getTelecommunicationEquipmentType().setValue("PH");
					}
		
					else if (ChannelType.FAX.equals(commChannel.getChannelType())) 
					{
						if (isWorkAddressChannelUsage)
						{
							nk1.getBusinessPhoneNumber(xtnBusinessPhoneIter).getTelecommunicationEquipmentType().setValue("FX");
						}
						else
						{
							nk1.getPhoneNumber(xtnHomePhoneIter).getTelecommunicationEquipmentType().setValue("FX");
						}
					}
		
					else if (ChannelType.MOBILE.equals(commChannel.getChannelType()))
					{
						if (isWorkAddressChannelUsage)
						{
							nk1.getBusinessPhoneNumber(xtnBusinessPhoneIter).getTelecommunicationEquipmentType().setValue("CP");
						}
						else
						{
							nk1.getPhoneNumber(xtnHomePhoneIter).getTelecommunicationEquipmentType().setValue("CP");
						}
					}
		
					else if (ChannelType.EMAIL.equals(commChannel.getChannelType())
							|| ChannelType.WEB.equals(commChannel.getChannelType()))
					{
						if (isWorkAddressChannelUsage)
						{
							nk1.getBusinessPhoneNumber(xtnBusinessPhoneIter).getTelecommunicationEquipmentType().setValue("Internet");
						}
						else
						{
							nk1.getPhoneNumber(xtnHomePhoneIter).getTelecommunicationEquipmentType().setValue("Internet");
						}
					}
		
		
					else if (ChannelType.BLEEP.equals(commChannel.getChannelType()))
					{
						if (isWorkAddressChannelUsage)
						{
							nk1.getBusinessPhoneNumber(xtnBusinessPhoneIter).getTelecommunicationEquipmentType().setValue("BP");
						}
						else
						{
							nk1.getPhoneNumber(xtnHomePhoneIter).getTelecommunicationEquipmentType().setValue("BP");
						}
					}
				}
	
				
				//----------------------------------------------
				// XTN.3 email address (ST)
				if (ChannelType.EMAIL.equals(commChannel.getChannelType()))
				{
					if (isWorkAddressChannelUsage)
					{
						nk1.getBusinessPhoneNumber(xtnBusinessPhoneIter).getEmailAddress().setValue(commChannel.getCommValue());
					}
					else
					{
						nk1.getPhoneNumber(xtnHomePhoneIter).getEmailAddress().setValue(commChannel.getCommValue());
					}
				}
	
				//----------------------------------------------
				// XTN.4 country code (NM)
				// XTN.5 area/city code (NM)
				// XTN.6 phone number (NM)
				// XTN.7 extension (NM)
				
				//----------------------------------------------
				// XTN.8 any text (ST)
				if (commChannel.getCommValue() != null && !ChannelType.EMAIL.equals(commChannel.getChannelType()))
				{
					if (ChannelType.WORK_PHONE.equals(commChannel.getChannelType())
							|| isWorkAddressChannelUsage)
					{
						nk1.getBusinessPhoneNumber(xtnBusinessPhoneIter).getAnyText().setValue(commChannel.getCommValue());
					}
					else
					{
						nk1.getPhoneNumber(xtnHomePhoneIter).getAnyText().setValue(commChannel.getCommValue());
					}
				}
	
				/*
				 * Update correct XTN iteration
				 */
				if (ChannelType.WORK_PHONE.equals(commChannel.getChannelType())
						|| isWorkAddressChannelUsage)
				{
					xtnBusinessPhoneIter ++;
				}
				else
				{
					xtnHomePhoneIter ++;
				}

			}
			
		}
		
	}
	

	//WDEV-19555
	//WDEV-20335
//	protected final void renderSupportNetworkFamilyVoToNK1(SupportNetworkFamily snfVo, NK1 nk1,ProviderSystemVo providerSystem) throws Exception
	protected final void renderSupportNetworkFamilyVoToNK1(SupportNetworkFamily snfVo, NK1 nk1,ProviderSystemVo providerSystem, Boolean isConfidential) throws Exception //WDEV-20335
	{
		
		//NOTE: Vo is actually called SupportNetwork Family. It must have been created before
		//      the suffix Vo became mandatory
		
		LOG.debug("VoMapper renderSupportNetworkFamilyVoToNK1: entry");
		if (snfVo == null)
			return;

		//WDEV-22006
		Boolean isValidCommChannel = Boolean.TRUE;
		
		//NK1-6 Business phone number (XTN) 
		if(snfVo.getCarerWorkPhoneIsNotNull())
		{
			//WDEV-22006 Check to see if value is an email address
			if (snfVo.getCarerWorkPhone() != null 
					&& isEmail(snfVo.getCarerWorkPhone()))
			{
				/*
				 * snfVo.getCarerWorkPhone() is actually an email address
				 * and configuration flag INCLUDE_EMAIL_FORMATTED_WORK_NUMBERS is FALSE
				 * Skip the processing of the Comm Channel
				 */	
				isValidCommChannel = Boolean.FALSE;
			}
		
			if (isValidCommChannel)
			{
				nk1.getBusinessPhoneNumber(0).getAnyText().setValue(snfVo.getCarerWorkPhone());
				nk1.getBusinessPhoneNumber(0).getTelecommunicationUseCode().setValue("WPN");
				nk1.getBusinessPhoneNumber(0).getTelecommunicationEquipmentType().setValue("PH");
		        //WDEV-22006
	//	         nk1.getBusinessPhoneNumber(0).getTelecommunicationEquipmentType().setValue("PH");
				 /*
				 *  Is there a provider system mapping defined for ChannelType lookup?
				 */
				String channelType = svc.getRemoteLookup(ChannelType.WORK_PHONE.getID(), providerSystem.getCodeSystem().getText());
				if (channelType != null)
				{
					nk1.getBusinessPhoneNumber(0).getTelecommunicationEquipmentType().setValue(channelType);
				}
				else
				{
					nk1.getBusinessPhoneNumber(0).getTelecommunicationEquipmentType().setValue("PH");
				} 
			}//WDEV-22006
		}
		
		//NK1-7 Contact role (CE)
		if(snfVo.getEmergencyContactOrderIsNotNull() && snfVo.getCarerRelationshipIsNotNull())
		{
			nk1.getContactRole().getIdentifier().setValue(svc.getRemoteLookup(snfVo.getEmergencyContactOrder().getID(), providerSystem.getCodeSystem().getText()));
			nk1.getContactRole().getText().setValue(svc.getRemoteLookup(snfVo.getCarerRelationship().getID(), providerSystem.getCodeSystem().getText()));
			if(snfVo.getIsMainCarerIsNotNull() && snfVo.getIsMainCarer().toString().equalsIgnoreCase("TRUE"))
			{				
				nk1.getContactRole().getAlternateText().setValue("Y");
			}
		}
		
		//NK1-9 End date (DT)
		if(snfVo.getInactivatingDateTimeIsNotNull())
		{
			nk1.getEndDate().setValue(snfVo.getInactivatingDateTime().toString());
		}
		
		//NK1-23 Protection indicator (ID)
		if(snfVo.getDiscussProgressIsNotNull() && snfVo.getDiscussProgress().toString().equalsIgnoreCase("TRUE"))
		{
			nk1.getProtectionIndicator().setValue("Y");
		}
		
		//NK1-30 Contact person’s name (XPN)
		if(snfVo.getCarerNameIsNotNull())
		{
			nk1.getContactPersonSName(0).getGivenName().setValue(snfVo.getCarerName());
		}
		
		//http://jira/browse/WDEV-20141
		
//		//NK1-31 Contact person’s telephone number (XTN) 
//		if(snfVo.getCarerHomePhoneIsNotNull())
//		{
//			nk1.getContactPersonSTelephoneNumber(0).getAnyText().setValue(snfVo.getCarerHomePhone());
//			nk1.getContactPersonSTelephoneNumber(0).getTelecommunicationUseCode().setValue("PRN");
//			nk1.getContactPersonSTelephoneNumber(0).getTelecommunicationEquipmentType().setValue("PH");
//		}
//		
//		//NK1-31 Contact person’s telephone number (XTN) 
//		if(snfVo.getCarerMobilePhoneIsNotNull())
//		{
//			nk1.getContactPersonSTelephoneNumber(1).getAnyText().setValue(snfVo.getCarerMobilePhone());
//			nk1.getContactPersonSTelephoneNumber(1).getTelecommunicationUseCode().setValue("ORN");
//			nk1.getContactPersonSTelephoneNumber(1).getTelecommunicationEquipmentType().setValue("CP");
//		}

		//http://jira/browse/WDEV-20141
		int repitition=0;
        //NK1-31 Contact person’s telephone number (XTN)
        //Home phone
        if(snfVo.getCarerHomePhoneIsNotNull())
        {
           nk1.getContactPersonSTelephoneNumber(repitition).getAnyText().setValue(snfVo.getCarerHomePhone());
           nk1.getContactPersonSTelephoneNumber(repitition).getTelecommunicationUseCode().setValue("PRN");
           //WDEV-22006
//         nk1.getContactPersonSTelephoneNumber(repitition).getTelecommunicationEquipmentType().setValue("PH");
			/*
			 *  Is there a provider system mapping defined for ChannelType lookup?
			 */
			String channelType = svc.getRemoteLookup(ChannelType.GEN_PHONE.getID(), providerSystem.getCodeSystem().getText());
			if (channelType != null)
			{
				nk1.getContactPersonSTelephoneNumber(repitition).getTelecommunicationEquipmentType().setValue(channelType);
			}
			else
			{
				nk1.getContactPersonSTelephoneNumber(repitition).getTelecommunicationEquipmentType().setValue("PH");
			} //WDEV-22006
           repitition ++;
        }
        
        //Mobile phone
        if(snfVo.getCarerMobilePhoneIsNotNull())
        {
           nk1.getContactPersonSTelephoneNumber(repitition).getAnyText().setValue(snfVo.getCarerMobilePhone());
           //WDEV-22006
//           nk1.getContactPersonSTelephoneNumber(repitition).getTelecommunicationEquipmentType().setValue("CP");
			/*
			 *  Is there a provider system mapping defined for ChannelType lookup?
			 */
			String channelType = svc.getRemoteLookup(ChannelType.MOBILE.getID(), providerSystem.getCodeSystem().getText());
			if (channelType != null)
			{
				nk1.getContactPersonSTelephoneNumber(repitition).getTelecommunicationEquipmentType().setValue(channelType);
			}
			else
			{
				nk1.getContactPersonSTelephoneNumber(repitition).getTelecommunicationEquipmentType().setValue("CP");		
			}

           if(repitition == 0)
           {
        	   nk1.getContactPersonSTelephoneNumber(repitition).getTelecommunicationUseCode().setValue("PRN");
           }
           else
           {
               nk1.getContactPersonSTelephoneNumber(repitition).getTelecommunicationUseCode().setValue("ORN");
           }
           repitition ++;
        }

        //WDEV-22006 Bug!!
        //Work phone
//        if(snfVo.getCarerWorkPhoneIsNotNull())
//        {
//           nk1.getContactPersonSTelephoneNumber(repitition).getAnyText().setValue(snfVo.getCarerWorkPhone());
//           nk1.getContactPersonSTelephoneNumber(repitition).getTelecommunicationUseCode().setValue("WPN");                           
//           nk1.getContactPersonSTelephoneNumber(repitition).getTelecommunicationEquipmentType().setValue("PH");                           
//           repitition ++;
//        }
        
        //Email address
        if(snfVo.getCarerEmail() != null
                     && snfVo.getCarerEmail().length() > 0)
        {                    
           nk1.getContactPersonSTelephoneNumber(repitition).getEmailAddress().setValue(snfVo.getCarerEmail());
           nk1.getContactPersonSTelephoneNumber(repitition).getTelecommunicationUseCode().setValue("NET");
           //WDEV-22006
//           nk1.getContactPersonSTelephoneNumber(repitition).getTelecommunicationEquipmentType().setValue("internet");
			/*
			 *  Is there a provider system mapping defined for ChannelType lookup?
			 */
			String channelType = svc.getRemoteLookup(ChannelType.EMAIL.getID(), providerSystem.getCodeSystem().getText());
			if (channelType != null)
			{
				nk1.getContactPersonSTelephoneNumber(repitition).getTelecommunicationEquipmentType().setValue(channelType);
			}
				else
			{
	           nk1.getContactPersonSTelephoneNumber(repitition).getTelecommunicationEquipmentType().setValue("Internet");				
			} //WDEV-22006

        }

		// END http://jira/browse/WDEV-20141
		
		//NK1-32 Contact person’s address (XAD)
        //WDEV-20335
        if((isConfidential == null) || (!isConfidential))
        {
        	nk1.getContactPersonSAddress(0).getStreetAddress().getStreetOrMailingAddress().setValue(HL7Utils.toHL7Text(snfVo.getCarerAddress()));
        } //WDEV-20335

		LOG.debug("VoMapper rendeSupportNetworkFamilyVoVoToNK1: exit (" + nk1.toString() + ")");
	}

	
	
	public Patient populatePatientFromPID(PID pid, ProviderSystemVo providerSystem) throws HL7Exception
	{
		return populatePatientFromPID(new Patient(), pid, providerSystem);
	}

	protected final Patient populatePatientFromPID(Patient patVo, PID pid, ProviderSystemVo providerSystem) throws HL7Exception
	{
 		LOG.debug("VoMapper populatePatientFromPID: entry");
		if (patVo == null)
			patVo = new Patient();
		if (pid == null)
			return patVo;

		// Get all patient identifiers found in PID.03
		patVo.setIdentifiers(populatePatidCollectionFromIdList(pid.getPatientIdentifierList(), providerSystem));

		//name
		XPN xpn = pid.getPatientName(0);
		patVo.setName(populateNameVoFromXPN(patVo.getName(), xpn,providerSystem));
		if(patVo.getOtherNamesIsNotNull()) //http://jira/browse/WDEV-17878
			patVo.getOtherNames().clear();
		for (int i = 1; i < pid.getPatientName().length; i++)
		{
			// wdev-7441
			if (patVo.getOtherNames() == null)
				patVo.setOtherNames(new PersonNameCollection());
			patVo.getOtherNames().add(populateNameVoFromXPN(null, pid.getPatientName(i),providerSystem));
		}

		//sex
		String sexCode = pid.getAdministrativeSex().getValue();
		if (sexCode != null)
		{
			if (sexCode.equals(Hl7Null))
				patVo.setSex(null);
			else
				patVo.setSex((Sex) svc.getLocalLookup(Sex.class, Sex.TYPE_ID, providerSystem.getCodeSystem().getText(), sexCode));				
		}
		
		//DOB
		String dob = pid.getDateTimeOfBirth().getTimeOfAnEvent().getValue();
		if (dob != null)
		{
			if (dob.equals(Hl7Null) || dob.length() < 4)
				patVo.setDob(null);
			else
			{
				patVo.setDob(new PartialDate(dob));
			}
		}
		
		// DOD update http://jira/browse/WDEV-15870
		String dod = pid.getPatientDeathDateAndTime().getTimeOfAnEvent().getValue();
		if (dod != null)
		{
			if (dod.equals(Hl7Null))
			{
				patVo.setDod(null);
				patVo.setTimeOfDeath(null);
			}	
			else
			{
				try
				{
					if(dod.length()<8)
						throw new Exception();
					DateTime dtOfDeath = populateDateTimeVoFromTS(pid.getPatientDeathDateAndTime());
					if(isTimeSupplied(pid.getPatientDeathDateAndTime()))
					{
						patVo.setTimeOfDeath(dtOfDeath.getTime());
					}
					else
					{
						patVo.setTimeOfDeath(null);
					}
					patVo.setDod(dtOfDeath.getDate());

				}
				catch (Exception e)
				{
					throw new HL7Exception("Patient Death Date And Time PID-29 could not be parsed");
				}				
			}
		}
		patVo.calculateAge();

		// Marital Status
		String martCode = pid.getMaritalStatus().getIdentifier().getValue();
		if (martCode != null)
		{
			if (martCode.equals(Hl7Null))
				patVo.setMaritalStatus(null);
			else
				patVo.setMaritalStatus((MaritalStatus) svc.getLocalLookup(MaritalStatus.class, MaritalStatus.TYPE_ID, providerSystem.getCodeSystem().getText(), martCode));
		}

		// Religion
		String relgCode = pid.getReligion().getIdentifier().getValue();
		if (relgCode != null)
		{
			if (relgCode.equals(Hl7Null))
				patVo.setReligion(null);
			else
				patVo.setReligion((Religion) svc.getLocalLookup(Religion.class, Religion.TYPE_ID, providerSystem.getCodeSystem().getText(), relgCode));
		}
		

		// EthnicOrigin
		String ethc = null;
		if (pid.getEthnicGroup().length > 0)
			ethc = pid.getEthnicGroup(0).getIdentifier().getValue();
		else if (pid.getRace().length > 0)
			ethc = pid.getRace(0).getIdentifier().getValue();
		if (ethc != null)
		{
			if (ethc.equals(Hl7Null))
				patVo.setEthnicOrigin(null);
			else
				patVo.setEthnicOrigin((EthnicOrigin) svc.getLocalLookup(EthnicOrigin.class, EthnicOrigin.TYPE_ID, providerSystem.getCodeSystem().getText(), ethc));
		}
				
		
		// address(es)
		
		//http://jira/browse/WDEV-13371 Moved clearing the addresses outside of the loop
		if (patVo.getAddresses() == null)
			patVo.setAddresses(new PersonAddressCollection());
		
		patVo.getAddresses().clear();

		for (int i = 0; i < pid.getPatientAddress().length; i++)
		{
			
			// Get the address type, permanent address is assigned to the main address
			// field in patient vo, other addresses get added to the addresses list
			String addressType = pid.getPatientAddress(i).getAddressType().getValue();
			if (addressType != null && addressType.equals("P"))  // Permanent
				patVo.setAddress(populateAddressVoFromXAD(patVo.getAddress(), pid.getPatientAddress(i),providerSystem, AddressType.PERMANENT));
			else
			{
				PersonAddress addr = populateAddressVoFromXAD(null, pid.getPatientAddress(i),providerSystem, AddressType.CORRESPONDENCE);
				if (addr != null)
				{
					patVo.getAddresses().add(addr);
				}
			}
		}

//		http://jira/browse/WDEV-15935 always create a new collection
		CommChannelVoCollection coll = new CommChannelVoCollection();

		// Home phone + email address
		for (int i = 0; i < pid.getPhoneNumberHome().length; i++)
		{
			String commsUse = pid.getPhoneNumberHome(i).getTelecommunicationUseCode().getValue();
			String equipType = pid.getPhoneNumberHome(i).getTelecommunicationEquipmentType().getValue();
			if (commsUse != null && commsUse.equals("NET") && equipType != null && equipType.equals("Internet"))
			{
				coll = populateCommChannel(coll, ChannelType.EMAIL, pid.getPhoneNumberHome(i).getEmailAddress().getValue());
			}
			else if (equipType != null && equipType.equals("CP"))
			{
				coll = populateCommChannel(coll, ChannelType.MOBILE, pid.getPhoneNumberHome(i).getAnyText().getValue());
			}
			else if (equipType != null && equipType.equals("FX"))
			{
//				if (patVo.getAddress() != null)
//				{
					if (pid.getPhoneNumberHome(i).getAnyText().getValue().equals(Hl7Null)&&(patVo.getAddress() != null))
					{
							patVo.getAddress().setFax(null);
							coll = populateCommChannel(coll, ChannelType.FAX, pid.getPhoneNumberHome(i).getAnyText().getValue());
					}
					else
					{
						if(patVo.getAddress() == null)
						{
							patVo.setAddress(new PersonAddress());
						}
						
						patVo.getAddress().setFax(pid.getPhoneNumberHome(i).getAnyText().getValue());
						coll = populateCommChannel(coll, ChannelType.FAX, pid.getPhoneNumberHome(i).getAnyText().getValue());

					}
//				}
			}
			else  // PH Phone Numbers
			{
				if (commsUse != null && commsUse.equals("PRN")) // Home Phone
				{
					if (patVo.getAddress() != null)
					{
						if ((null == pid.getPhoneNumberHome(i).getAnyText().getValue())||pid.getPhoneNumberHome(i).getAnyText().getValue().equals(Hl7Null))
						{
							coll = populateCommChannel(coll, ChannelType.HOME_PHONE, pid.getPhoneNumberHome(i).getAnyText().getValue());
							patVo.getAddress().setPhone(null);
						}
						else
							patVo.getAddress().setPhone(pid.getPhoneNumberHome(i).getAnyText().getValue());
					}
					//http://jira/browse/WDEV-23396
					if(svc.getLocalLookup(ChannelType.class, ChannelType.TYPE_ID, providerSystem.getCodeSystem().getText(), equipType)!=null)
					{
						coll = populateCommChannel(coll,(ChannelType) svc.getLocalLookup(ChannelType.class, ChannelType.TYPE_ID, providerSystem.getCodeSystem().getText(), equipType), pid.getPhoneNumberHome(i).getAnyText().getValue());
					}
					else
					{
						coll = populateCommChannel(coll, ChannelType.HOME_PHONE, pid.getPhoneNumberHome(i).getAnyText().getValue());
					}
				}
				else if (commsUse != null && commsUse.equals("ORN")&&(!Hl7Null.equals(pid.getPhoneNumberHome(i).getAnyText().getValue())))
				{
					if (ConfigFlag.HL7.USE_ORN_NUMBERS_FOR_CORRESPONDENCE_ADDRESS.getValue()) //http://jira/browse/WDEV-14384
					{
						PersonAddress corrAddress = null;
						for (PersonAddress address : patVo.getAddresses())
						{
							if(address.getAddressTypeIsNotNull()&&address.getAddressType().equals(AddressType.CORRESPONDENCE))
							{
								corrAddress=address;
								break;
							}
						}
						if(corrAddress==null)
						{
							corrAddress=new PersonAddress();
							corrAddress.setAddressType(AddressType.CORRESPONDENCE);
							patVo.getAddresses().add(corrAddress);
						}
						corrAddress.setPhone(pid.getPhoneNumberHome(i).getAnyText().getValue());
					}
					else
					{
						//http://jira/browse/WDEV-23396
						if(svc.getLocalLookup(ChannelType.class, ChannelType.TYPE_ID, providerSystem.getCodeSystem().getText(), equipType)!=null)
						{
							coll = populateCommChannel(coll,(ChannelType) svc.getLocalLookup(ChannelType.class, ChannelType.TYPE_ID, providerSystem.getCodeSystem().getText(), equipType), pid.getPhoneNumberHome(i).getAnyText().getValue());
						}
						else
						{
							coll = populateCommChannel(coll, ChannelType.GEN_PHONE, pid.getPhoneNumberHome(i).getAnyText().getValue());
						}
					}
				}
			}
		}

		// Work Number
		for (int i = 0; i < pid.getPhoneNumberBusiness().length; i++)
		{
			String commsUse = pid.getPhoneNumberBusiness(i).getTelecommunicationUseCode().getValue();
			String equipType = pid.getPhoneNumberBusiness(i).getTelecommunicationEquipmentType().getValue();
			if (commsUse != null && commsUse.equals("NET") && equipType != null && equipType.equals("Internet"))
			{
				coll = populateCommChannel(coll, ChannelType.EMAIL, pid.getPhoneNumberBusiness(i).getEmailAddress().getValue());
			}
			else if (equipType != null && equipType.equals("CP"))
			{
				coll = populateCommChannel(coll, ChannelType.MOBILE, pid.getPhoneNumberBusiness(i).getAnyText().getValue());
			}
			else
			{
				if (commsUse != null && commsUse.equals("WPN")) // Work Phone
				{
					coll = populateCommChannel(coll, ChannelType.WORK_PHONE, pid.getPhoneNumberBusiness(i).getAnyText().getValue());
				}
				else if (commsUse != null && commsUse.equals("BPN")) // Bleeper
				{
					coll = populateCommChannel(coll, ChannelType.BLEEP, pid.getPhoneNumberBusiness(i).getAnyText().getValue());
				}
				else if (commsUse != null && commsUse.equals("ORN")&&(!Hl7Null.equals(pid.getPhoneNumberBusiness(i).getAnyText().getValue())))
				{
					if (ConfigFlag.HL7.USE_ORN_NUMBERS_FOR_CORRESPONDENCE_ADDRESS.getValue()) //http://jira/browse/WDEV-14384
					{
						PersonAddress corrAddress = null;
						for (PersonAddress address : patVo.getAddresses())
						{
							if(address.getAddressTypeIsNotNull()&&address.getAddressType().equals(AddressType.CORRESPONDENCE))
							{
								corrAddress=address;
								break;
							}
						}
						if(corrAddress==null)
						{
							corrAddress=new PersonAddress();
							corrAddress.setAddressType(AddressType.CORRESPONDENCE);
							patVo.getAddresses().add(corrAddress);
						}
						corrAddress.setOtherphone(pid.getPhoneNumberBusiness(i).getAnyText().getValue());
					}
					else
					{
						if(svc.getLocalLookup(ChannelType.class, ChannelType.TYPE_ID, providerSystem.getCodeSystem().getText(), equipType)!=null)
						{
							coll = populateCommChannel(coll,(ChannelType) svc.getLocalLookup(ChannelType.class, ChannelType.TYPE_ID, providerSystem.getCodeSystem().getText(), equipType), pid.getPhoneNumberBusiness(i).getAnyText().getValue());
						}
						else
						{
							coll = populateCommChannel(coll, ChannelType.GEN_PHONE, pid.getPhoneNumberBusiness(i).getAnyText().getValue());
						}
					}
				}
			}
		}
		patVo.setCommChannels(coll);
		CX[] motherIdentifiers = pid.getMotherSIdentifier();
		if (motherIdentifiers.length != 0)
		{
			Patient mothersID = getPrimaryIdPatient(motherIdentifiers, providerSystem);
			Patient mother=null;
			try
			{
				mother = getDemog().getPatient(mothersID);
				patVo.setClientParent(mother);
			} catch (StaleObjectException e)
			{
				LOG.warn("SOE Getting patients mother", e);
			}
		}
		patVo.setMRNStatus(MRNStatus.ALLOCATED);

		LOG.debug("VoMapper populatePatientFromPID: exit (" + patVo.toString() + ")");
		return patVo;
	}

	/**
	 * wdev-4702
	 * This method is used to populate or clear a Comm Channel for a Patient
	 * @param coll
	 * @param channel
	 * @param value
	 * @return
	 */
	private CommChannelVoCollection populateCommChannel(CommChannelVoCollection coll, ChannelType channel, String value) 
	{
		CommChannelVo comm = coll.getCommunicationChannel(channel); 

		if (value == null)
			return coll;
		
		if (value.equals(Hl7Null))
		{
			if (comm != null)
				coll.remove(comm);
		}
		else
		{
			if (comm == null) 
				comm = new CommChannelVo();
			comm.setChannelType(channel);
			comm.setCommValue(value);
			coll.add(comm);
		}
		return coll;
	}


	protected final void renderPatientVoToPID(Patient patVo, PID pid, ProviderSystemVo providerSystem) throws Exception
	{
		LOG.debug("VoMapper renderPatientVoToPID: entry");
		if (patVo == null)
			return;

		renderPatientShortVoToPID(patVo, pid, providerSystem);

		for (int i = 0; i < patVo.getOtherNames().size(); i++)
		{
			renderNameVoToXPN(patVo.getOtherNames().get(i), pid.getPatientName(i+1),providerSystem);
		}

		//http://jira/browse/WDEV-20335
		if((patVo.getIsConfidential() == null) || (patVo.getIsConfidentialIsNotNull() && !patVo.getIsConfidential()))
		{
			for (int i = 0; i < patVo.getAddresses().size(); i++)
			{
				if (!patVo.getAddressIsNotNull()) // First instance will not have been populated if permanent address was null
					renderAddressVoToXAD(patVo.getAddresses().get(i), pid.getPatientAddress(i),providerSystem);
				else
					renderAddressVoToXAD(patVo.getAddresses().get(i), pid.getPatientAddress(i+1),providerSystem);
			}			
		} //WDEV-20335

		if (patVo.getMaritalStatusIsNotNull())
			pid.getMaritalStatus().getIdentifier().setValue(svc.getRemoteLookup(patVo.getMaritalStatus().getID(), providerSystem.getCodeSystem().getText()));

		LOG.debug("VoMapper renderPatientVoToPID: exit (" + pid.toString() + ")");
	}

	protected final void renderPatientShortVoToPID(PatientShort patVo, PID pid, ProviderSystemVo providerSystem) throws Exception
	{
		renderPatientShortVoToPID(patVo,null,  pid, providerSystem);
	}
	
	
	protected final void renderPatientShortVoToPID(PatientShort patVo, String pasidPrefix,PID pid, ProviderSystemVo providerSystem) throws Exception
	{
		LOG.debug("VoMapper renderPatientShortVoToPID: entry");
		if (patVo == null)
			return;

		renderPatidCollectionToIdList(patVo.getIdentifiers(),pasidPrefix ,pid, providerSystem);
		//TODO 
		//if config flag
//		renderMaximsIdentifier(patVo.getID_Patient(),pid,providerSystem);

		renderNameVoToXPN(patVo.getName(), pid.getPatientName(0),providerSystem);

		if (patVo.getSexIsNotNull())
			pid.getAdministrativeSex().setValue(svc.getRemoteLookup(patVo.getSex().getID(), providerSystem.getCodeSystem().getText()));

		// WDEV-20334		
//		if (patVo.getDobIsNotNull())
//			pid.getDateTimeOfBirth().getTimeOfAnEvent().setValue(patVo.getDob().toString(DateFormat.ISO));

		if (patVo.getDobIsNotNull())
		{
			if (patVo.getDob().getMonth() != null && patVo.getDob().getDay() != null) // Don't process time of birth if DOB is a partial date
			{
				ConfigItems[] providerSystemConfigItems = toConfigItemArray(providerSystem.getConfigItems());
				String timeOfBirthInPID = HL7Utils.getConfigItem(providerSystemConfigItems, ConfigItems.TimeOfBirthInPID);
		
				if (timeOfBirthInPID != null
						&& (timeOfBirthInPID.equalsIgnoreCase("TRUE") || timeOfBirthInPID.equalsIgnoreCase("YES")))
				{
		
					String dateOfBirth = null;
					String timeOfBirth = null;
					String datetimeOfBirth = null;
	
					// Populate string to hold date of birth
					dateOfBirth = patVo.getDob().toString(DateFormat.ISO);
			
					// Check if time of birth is defined, append this time to string value of date of birth
					if(patVo.getTimeOfBirth() != null)
						timeOfBirth = patVo.getTimeOfBirth().toString(TimeFormat.FLAT4);
			
					if (dateOfBirth != null)
						datetimeOfBirth = dateOfBirth;
			
					if(timeOfBirth != null)
						datetimeOfBirth += timeOfBirth;
			
					if(datetimeOfBirth != null)
					{
						pid.getDateTimeOfBirth().getTimeOfAnEvent().setValue(datetimeOfBirth);
					} 
				}
				else
				{
					pid.getDateTimeOfBirth().getTimeOfAnEvent().setValue(patVo.getDob().toString(DateFormat.ISO));
				}
			}
			else
			{
				pid.getDateTimeOfBirth().getTimeOfAnEvent().setValue(patVo.getDob().toString(DateFormat.ISO));
			}
		} //WDEV-20334

		//WDEV-20664
//		if (patVo.getDodIsNotNull())
//		{
//			pid.getPatientDeathDateAndTime().getTimeOfAnEvent().setValue(patVo.getDod().toString(DateFormat.ISO));
//			pid.getPatientDeathIndicator().setValue("Y");  // Patient Death Indicator
//		}
		
		//WDEV-20664 If DOD time has been defined, transmit this time as well as date (if flag TimeOfDeathInPID is true)
		if (patVo.getDodIsNotNull())
		{
			ConfigItems[] providerSystemConfigItems = toConfigItemArray(providerSystem.getConfigItems());
			String timeOfDeathInPID = HL7Utils.getConfigItem(providerSystemConfigItems, ConfigItems.TimeOfDeathInPID);
	
			if (timeOfDeathInPID != null
					&& (timeOfDeathInPID.equalsIgnoreCase("TRUE") || timeOfDeathInPID.equalsIgnoreCase("YES")))
			{
	
				String dateOfDeath = null;
				String timeOfDeath = null;
				String datetimeOfDeath = null;

				// Populate string to hold date of death
				dateOfDeath = patVo.getDod().toString(DateFormat.ISO);
		
				// Check if time of death is defined, append this time to string value of date of death
				if(patVo.getTimeOfDeath() != null)
					timeOfDeath = patVo.getTimeOfDeath().toString(TimeFormat.FLAT4);
		
				if (dateOfDeath != null)
					datetimeOfDeath = dateOfDeath;
		
				if(timeOfDeath != null)
					datetimeOfDeath += timeOfDeath;
		
				if(datetimeOfDeath != null)
				{
					pid.getPatientDeathDateAndTime().getTimeOfAnEvent().setValue(datetimeOfDeath);
				} 
			}
			else
			{
				pid.getPatientDeathDateAndTime().getTimeOfAnEvent().setValue(patVo.getDod().toString(DateFormat.ISO));
			}
			pid.getPatientDeathIndicator().setValue("Y");  // Patient Death Indicator
		} //WDEV-20664

		// http://jira/browse/WDEV-20335
		if((patVo.getIsConfidential() == null) || (patVo.getIsConfidentialIsNotNull() && !patVo.getIsConfidential()))
		{
			renderAddressVoToXAD(patVo.getAddress(), pid.getPatientAddress(0),providerSystem);
		}

		// http://jira/browse/WDEV-22237 Replace following code by a call to a single method
//		int phoneNumberCount = 0;
//		CommChannelVo commVo = patVo.getCommunicationChannel(ChannelType.EMAIL);
//		if (commVo != null)
//		{
//			pid.getPhoneNumberHome(phoneNumberCount).getTelecommunicationUseCode().setValue("NET");
//			pid.getPhoneNumberHome(phoneNumberCount).getTelecommunicationEquipmentType().setValue("internet");
//			pid.getPhoneNumberHome(phoneNumberCount).getEmailAddress().setValue(commVo.getCommValue());
//			phoneNumberCount++;
//		}
//
//		commVo = patVo.getCommunicationChannel(ChannelType.MOBILE);
//		if (commVo != null)
//		{
//			pid.getPhoneNumberHome(phoneNumberCount).getAnyText().setValue(commVo.getCommValue());
//			pid.getPhoneNumberHome(phoneNumberCount).getTelecommunicationEquipmentType().setValue("CP");
//			phoneNumberCount++;
//		}
//		commVo = patVo.getCommunicationChannel(ChannelType.HOME_PHONE);
//		if (commVo != null)
//		{
//			pid.getPhoneNumberHome(phoneNumberCount).getAnyText().setValue(commVo.getCommValue());
//			pid.getPhoneNumberHome(phoneNumberCount).getTelecommunicationEquipmentType().setValue(Phone);  // wdev-11609
//			phoneNumberCount++;
//		}
//
//		if (patVo.getAddressIsNotNull() && patVo.getAddress().getFaxIsNotNull())
//		{
//			pid.getPhoneNumberHome(phoneNumberCount).getAnyText().setValue(patVo.getAddress().getFax());
//			pid.getPhoneNumberHome(phoneNumberCount).getTelecommunicationEquipmentType().setValue("FX");
//			phoneNumberCount++;
//		}
//		else
//		{
//			// wdev-5442
//			// Check for Fax as a comms channel type and output if set
//			commVo = patVo.getCommunicationChannel(ChannelType.FAX);
//			if (commVo != null)
//			{
//				pid.getPhoneNumberHome(phoneNumberCount).getAnyText().setValue(commVo.getCommValue());
//				pid.getPhoneNumberHome(phoneNumberCount).getTelecommunicationEquipmentType().setValue("FX");
//				phoneNumberCount++;
//			}
//		}
//
//		// TODO - Not sure whether we can differentiate between home and work email etc..??
//		
//		//http://jira/browse/WDEV-18953 //WDEV-18951
//		phoneNumberCount = 0;
//		CommChannelVoCollection commChannels = patVo.getCommChannels();
//		if (commChannels!=null)
//		{
//			for (CommChannelVo commChannelVo : commChannels)
//			{
//				if(commChannelVo.getChannelType()!=null
//					&&ChannelType.WORK_PHONE.equals(commChannelVo.getChannelType()))
//					{
//					String value = commChannelVo.getCommValue();
//					if (value!=null &&!isEmail(value))
//					{
//						pid.getPhoneNumberBusiness(phoneNumberCount).getAnyText().setValue(value);
//						phoneNumberCount++;
//					}
//				}
//			}
//		}
//
//		
//		
//		commVo = patVo.getCommunicationChannel(ChannelType.WORK_PHONE);
//		if (commVo != null)
//		{
//			String value = commVo.getCommValue();
//			if (value!=null &&!isEmail(value))
//			{
//				pid.getPhoneNumberBusiness(phoneNumberCount).getAnyText().setValue(value);
//				phoneNumberCount++;
//			}
//		}

		renderCommChannelVoCollToPID(patVo.getCommChannels(), pid, providerSystem);
		// WDEV-22237
		
		if (patVo.getReligionIsNotNull())
			pid.getReligion().getIdentifier().setValue(svc.getRemoteLookup(patVo.getReligion().getID(), providerSystem.getCodeSystem().getText()));
		
		if(patVo.getMaritalStatusIsNotNull())
			pid.getMaritalStatus().getIdentifier().setValue(svc.getRemoteLookup(patVo.getMaritalStatus().getID(), providerSystem.getCodeSystem().getText()));
		
		if (patVo.getEthnicOriginIsNotNull())
			pid.getEthnicGroup(0).getIdentifier().setValue(svc.getRemoteLookup(patVo.getEthnicOrigin().getID(), providerSystem.getCodeSystem().getText()));

		LOG.debug("VoMapper renderPatientShortVoToPID: exit (" + pid.toString() + ")");
	}
	
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
	    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

	public static boolean isEmail(String emailStr)
	{
		if(ConfigFlag.HL7.INCLUDE_EMAIL_FORMATTED_WORK_NUMBERS.getValue())
		{
			return false;
		}
		else
		{
	        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(emailStr);
	        return matcher.find();
		}
	}

	public InpatientEpisodeVo fillEpisFromMsg(Message msg, OrganisationAndLocation orgLoc, HcpAdmin hcpAdmin,ProviderSystemVo providerSystem) throws Exception
	{
		return fillEpisFromMsg(new InpatientEpisodeVo(), msg, orgLoc, hcpAdmin,providerSystem);
	}
	public InpatientEpisodeVo fillEpisFromMsg(Message msg, OrganisationAndLocation orgLoc, HcpAdmin hcpAdmin, PasEventVo pas,ProviderSystemVo providerSystem , DateTime transactionDT) throws Exception
	{
		InpatientEpisodeVo episVo = new InpatientEpisodeVo();
		
		if (pas.getPasEventId()==null)
		{
		PasEventVo pe = episVo.getPasEvent();
		if (pe == null)
			pe = new PasEventVo();
		
		PV1 pv1 = (PV1) msg.get("PV1");
		EVN evn = (EVN) msg.get("EVN");

		fillPasEventFromEVN(evn, pe, transactionDT);
		fillPasEventFromPV1(pv1, pe, orgLoc, hcpAdmin,providerSystem);
		episVo.setPasEvent(pe);
		}
		else
		{
			episVo.setPasEvent(pas);
		}
		episVo=addEpisodeDetails(episVo,msg);
		return episVo;
	}
	
	public InpatientEpisodeVo fillEpisFromMsg(InpatientEpisodeVo episVo, Message msg, OrganisationAndLocation orgLoc, HcpAdmin hcpAdmin,ProviderSystemVo providerSystem) throws Exception
	{
		if (episVo == null)
			episVo = new InpatientEpisodeVo();
		
		PasEventVo pe = episVo.getPasEvent();
		if (pe == null)
			pe = new PasEventVo();
		
		PV1 pv1 = (PV1) msg.get("PV1");
		EVN evn = (EVN) msg.get("EVN");

		fillPasEventFromEVN(evn, pe, null);
		fillPasEventFromPV1(pv1, pe, orgLoc, hcpAdmin,providerSystem);
		episVo.setPasEvent(pe);
		episVo = addEpisodeDetails(episVo,msg);
		return episVo;
	}

	private InpatientEpisodeVo addEpisodeDetails(InpatientEpisodeVo episVo,Message msg)//throws Exception
	{
		PV1 pv1;
		try {
			pv1 = (PV1) msg.get("PV1");
			episVo.setIsMaternityInpatient(isMaternity(pv1));
			episVo.setIsChaplainRequired(getIsChaplainRequired(pv1));
			episVo.setMethodOfAdmission(getMethodOfAdmission(pv1));
			episVo.setPreAdmitNumber(getPreAdmitNumber(pv1));
			//WDEV-14833 
			episVo.setPatientStatus(getPatientStatus(pv1));
		} catch (HL7Exception e)
		{
			LOG.warn("Exception getting PV1 from message", e);
		}
		PV2 pv2;
		try {
			pv2 = (PV2) msg.get("PV2");
			episVo.setWardType(getWardType(pv2));
			episVo.setReasonForAdmission(getReasonForAdmission(pv2));
			episVo.setSourceOfAdmission(getSourceAdmission(pv2));
			Integer stay =HL7Utils.getIntegerFromNM(pv2.getEstimatedLengthOfInpatientStay());
			if(null!=stay&&episVo.getPasEventIsNotNull()&&episVo.getPasEvent().getEventDateTimeIsNotNull())
			{
				//WDEV-8310 clone the date before adding to it 
				episVo.setEstDischargeDate(((DateTime)episVo.getPasEvent().getEventDateTime().clone()).addDays(stay));
			}
			//WDEV-13288
			if("RD".equals(pv2.getPatientStatusCode().getValue())
					&&!Hl7Null.equals(pv2.getPatientStatusEffectiveDate().getValue()))
			{
				
				Date date = populateDateVoFromDT(pv2.getPatientStatusEffectiveDate());
				if(date!=null)
				{
					episVo.setDischargeReadyDate(date);
				}
			}

		} catch (HL7Exception e)
		{
			LOG.warn("Exception getting PV2 from message", e);
		}
		//WDEV-16836
		if(episVo.getIsOnLeave()==null)
		{	
			episVo.setIsOnLeave(Boolean.FALSE);
		}
		//WDEV-8398  
		if(episVo.getPasEventIsNotNull()&&episVo.getPasEvent().getEventDateTimeIsNotNull())
			episVo.setAdmissionDateTime(episVo.getPasEvent().getEventDateTime());
		return episVo;
	}
	
	
	protected Boolean isMaternity(PV1 pv1) {
		AdmissionType admissionType;
		Boolean isMaternity=null;
		String extSystem = ConfigFlag.DOM.DEMOGRAPHICS_EXT_SYSTEM.getValue();
		if(pv1.getAdmissionType().getValue()!=null)
		{
			admissionType = (AdmissionType)getADT().getLookupService().getLocalLookup(AdmissionType.class, AdmissionType.TYPE_ID, extSystem, pv1.getAdmissionType().getValue());
			if (AdmissionType.ADMITTED_ANTE_PARTUM.equals(admissionType)||AdmissionType.ADMITTED_POST_PARTUM.equals(admissionType))
				isMaternity=Boolean.TRUE;
		}
		return isMaternity;
	}
	
	protected String getReasonForAdmission(PV2 pv2)
	{
		if ("\"\"".equals(pv2.getAdmitReason().getIdentifier().getValue()))
			return null;
		return pv2.getAdmitReason().getIdentifier().getValue();
	}
	
	protected String getPreAdmitNumber(PV1 pv1) {
		
		String eventId = pv1.getPreadmitNumber().getID().getValue() + "_" + pv1.getPreadmitNumber().getCheckDigit();
		
		return eventId;
	}
	
	//PV1.39 - Servicing Facility
	protected BedTypeRequested getBedTypeRequested(PV1 pv1)
	{
		BedTypeRequested bedType=null;
		String extSystem = ConfigFlag.DOM.DEMOGRAPHICS_EXT_SYSTEM.getValue();
		String bedTypeFromMsg=pv1.getServicingFacility().getValue();
		if(bedTypeFromMsg!=null)
		{
			bedType=(BedTypeRequested)getADT().getLookupService().getLocalLookup(BedTypeRequested.class, BedTypeRequested.TYPE_ID, extSystem, bedTypeFromMsg);
		}
		return bedType;
	}
	
	protected SourceOfAdmission getSourceAdmission(PV2 pv2) //PV2-22
	{
		SourceOfAdmission admissionSource=null;
		String extSystem = ConfigFlag.DOM.DEMOGRAPHICS_EXT_SYSTEM.getValue();
		String admissionSourceHl7=pv2.getVisitProtectionIndicator().getValue();
		if (admissionSourceHl7!=null)
		{
			admissionSource=(SourceOfAdmission)getADT().getLookupService().getLocalLookup(SourceOfAdmission.class, SourceOfAdmission.TYPE_ID, extSystem, admissionSourceHl7);
		}
		return admissionSource;
	}
	

	protected MethodOfAdmission getMethodOfAdmission(PV1 pv1)
	{
		MethodOfAdmission methodOfAdmission=null;
		String extSystem = ConfigFlag.DOM.DEMOGRAPHICS_EXT_SYSTEM.getValue();
		String methodOfAdmissionhl7=pv1.getAdmissionType().getValue();
		if (methodOfAdmissionhl7!=null)
		{
			methodOfAdmission=(MethodOfAdmission)getADT().getLookupService().getLocalLookup(MethodOfAdmission.class, MethodOfAdmission.TYPE_ID, extSystem, methodOfAdmissionhl7);
		}
		return methodOfAdmission;
	}

	protected Boolean getIsChaplainRequired(PV1 pv1) //pv1-22
	{
		Boolean isChaplinRequired=null;
		YesNo yesNo = null;
		String extSystem = ConfigFlag.DOM.DEMOGRAPHICS_EXT_SYSTEM.getValue();
		if(pv1.getCourtesyCode().getValue()!=null)
		{
			yesNo = (YesNo)getADT().getLookupService().getLocalLookup(YesNo.class, YesNo.TYPE_ID, extSystem, pv1.getCourtesyCode().getValue());
			if (YesNo.YES.equals(yesNo))
				isChaplinRequired=Boolean.TRUE;
		}
		return isChaplinRequired;
	}

	//http://jira/browse/WDEV-13505 
	protected PatientStatus getPatientStatus(PV1 pv1) //PV1-41
	{
		PatientStatus patientStatus = null;
		if(pv1!=null)
		{
			String extSystem = ConfigFlag.DOM.DEMOGRAPHICS_EXT_SYSTEM.getValue();
			String patStat = pv1.getAccountStatus().getValue();
			if(patStat!=null)
			{
				patientStatus = (PatientStatus)getADT().getLookupService().getLocalLookup(PatientStatus.class, PatientStatus.TYPE_ID, extSystem, patStat);
			}
		}
		return patientStatus;
	}
	
	//WDEV-20278
	//	protected MedicRefVo getReferringConsultant(PV1 pv1)
	protected MedicRefVo getReferringConsultant(PV1 pv1, ProviderSystemVo providerSystem) //WDEV-20278
	{
		MedicRefVo hcp=null;
		XCN[] xcns = pv1.getReferringDoctor();
		if (xcns!=null&&xcns.length>0&&xcns[0]!=null)
		{
			hcp= populateMedicRefFromXCN(xcns[0],TaxonomyType.NAT_CONS_CODE);
		}
		if(hcp==null&&xcns.length>1&&xcns[1]!=null)
		{
			//WDEV-20278
//			hcp=populateMedicRefFromXCN(xcns[1],TaxonomyType.PAS);
			hcp = populateMedicRefFromXCN(xcns[1], providerSystem.getCodeSystem()); //WDEV-20278
		}
		return hcp;
	}
	
	//WDEV-20278
//	protected HcpMinVo getAttendingDoctor(PV1 pv1)
	protected HcpMinVo getAttendingDoctor(PV1 pv1, ProviderSystemVo providerSystem) //WDEV-20278
	{
		HcpMinVo hcp=null;
		XCN[] xcns = pv1.getAttendingDoctor();
		if (xcns!=null&&xcns.length>0&&xcns[0]!=null)
		{
			hcp= populateHcpMinFromXCN(xcns[0],TaxonomyType.NAT_CONS_CODE);
		}
		if(hcp==null&&xcns.length>1&&xcns[1]!=null)
		{
			//WDEV-20278
//			hcp=populateHcpMinFromXCN(xcns[1],TaxonomyType.PAS);
			hcp = populateHcpMinFromXCN(xcns[1], providerSystem.getCodeSystem()); //WDEV-20278
		}
		return hcp;
	}
	
	
	protected String getComment(PV2 pv2) //PV2-12
	{
		if ("\"\"".equals(pv2.getVisitDescription().getValue()))
			return null;
		return pv2.getVisitDescription().getValue();

	}
	
	protected WardType getWardType(PV2 pv2)
	{
		WardType wardType = null;
		String extSystem = ConfigFlag.DOM.DEMOGRAPHICS_EXT_SYSTEM.getValue();
		String mainSide = pv2.getAccommodationCode().getIdentifier().getValue();
		if(mainSide!=null)
		{
			wardType = (WardType)getADT().getLookupService().getLocalLookup(WardType.class, WardType.TYPE_ID, extSystem, mainSide);
		}
		return wardType;
	}
	
	protected ManagementIntention getManagementIntention(PV2 pv2)
	{
		ManagementIntention managementIntention = null;
		String extSystem = ConfigFlag.DOM.DEMOGRAPHICS_EXT_SYSTEM.getValue();
		try{
		if (pv2.getVisitUserCode(0)!= null&&null!=pv2.getVisitUserCode(0).getValue())
		{
			managementIntention=(ManagementIntention)getADT().getLookupService().getLocalLookup(ManagementIntention.class, ManagementIntention.TYPE_ID, extSystem, pv2.getVisitUserCode(0).getValue()); 
		}
		}catch(HL7Exception e)
		{
			LOG.warn("PV2.getVisitUserCode - invalid repetition number used", e);
		}
		return managementIntention;
	}
	
	
	public OutPatientAttendanceVo fillAttFromMsg(Message msg, OrganisationAndLocation orgLoc, HcpAdmin hcpAdmin,ProviderSystemVo providerSystem) throws Exception
	{
		return this.fillAttFromMsg(new OutPatientAttendanceVo(), msg, orgLoc, hcpAdmin,providerSystem);
	}
	public OutPatientAttendanceVo fillAttFromMsg(OutPatientAttendanceVo attVo, Message msg, OrganisationAndLocation orgLoc, HcpAdmin hcpAdmin,ProviderSystemVo providerSystem) throws Exception
	{
		PV1 pv1 = (PV1) msg.get("PV1");
		PasEventVo pe=new PasEventVo();
		
		if(attVo.getPasEvent()!=null)
			pe = attVo.getPasEvent();
		
			EVN evn = (EVN) msg.get("EVN");
			fillPasEventFromEVN(evn, pe, null);
			fillPasEventFromPV1(pv1, pe, orgLoc, hcpAdmin,providerSystem);
			attVo.setPasEvent(pe);
		
			
			attVo.setIsActive(Boolean.TRUE);
			//if (attVo.getAppointmentDateTime() != null)
			
			if (pv1.getAdmitDateTime().getTimeOfAnEvent() != null && pv1.getAdmitDateTime().getTimeOfAnEvent().getValue() != null)
			{
				attVo.setAppointmentDateTime(new DateTime(pv1.getAdmitDateTime().getTimeOfAnEvent().getValue()));					
			}				
		
		
		String patClass = pv1.getPatientClass().getValue();
		if (patClass != null && patClass.equals(OUTPATIENT_APP))
		{
			attVo.setClinic(orgLoc.getClinicByTaxonomyCode(providerSystem.getCodeSystem(),pv1.getAssignedPatientLocation().getPointOfCare().getValue()));//.getClinicByCode(pv1.getAssignedPatientLocation().getPointOfCare().getValue()));
			
			// wdev-3104 Reject message if clinic not found
			if (!attVo.getClinicIsNotNull())
			{
				throw new HL7Exception("Clinic not found within application (" + pv1.getAssignedPatientLocation().getPointOfCare().getValue() + ") PV1-3. Message Rejected");			
			}
			
			// WDEV-13455
			// Set the appointment type from PV1-4 - admission type (specifics set for Patient Diary)
			if (pv1.getAdmissionType() != null)
				attVo.setApptType(pv1.getAdmissionType().getValue());
		}

		
		return attVo;
	}


	public AneAttendanceVo fillAnEAttFromMsg(Message msg, OrganisationAndLocation orgLoc, HcpAdmin hcpAdmin,ProviderSystemVo providerSystem) throws Exception
	{
		return this.fillAnEAttFromMsg(new AneAttendanceVo(), msg, orgLoc, hcpAdmin,providerSystem);
	}
	public AneAttendanceVo fillAnEAttFromMsg(AneAttendanceVo attVo, Message msg, OrganisationAndLocation orgLoc, HcpAdmin hcpAdmin,ProviderSystemVo providerSystem) throws Exception
	{

		PasEventVo pe = attVo.getPasEvent();
		if (pe == null)
			pe = new PasEventVo();

		PV1 pv1 = (PV1) msg.get("PV1");
		PV2 pv2 = (PV2) msg.get("PV2");
		
		EVN evn = (EVN) msg.get("EVN");

		fillPasEventFromEVN(evn, pe, null);
		fillPasEventFromPV1(pv1, pe, orgLoc, hcpAdmin,providerSystem);

		attVo.setPasEvent(pe);
		attVo.setIsActive(Boolean.TRUE);
		
		DateTime admitDT=null;
		
		
		if(null!=pv1.getAdmitDateTime().getTimeOfAnEvent()
				&&null!=pv1.getAdmitDateTime().getTimeOfAnEvent().getValue())
		{
			admitDT=new DateTime(pv1.getAdmitDateTime().getTimeOfAnEvent().getValue());
		}
		if (admitDT!=null)
		{
			attVo.setAdmitDateTime(admitDT);
		}
		
		//PV1.45 used to populate Pending Emergency Conclusion date
		DateTime dischargeDT = null;
		if (null != pv1.getDischargeDateTime(0).getTimeOfAnEvent()
				&&null!=pv1.getDischargeDateTime(0).getTimeOfAnEvent().getValue())
		{
			try { 
				dischargeDT = new DateTime(pv1.getDischargeDateTime(0).getTimeOfAnEvent().getValue());
			} catch (ParseException e) {
				LOG.warn("Unparsable PV1-45 in message", e);
				//Carry on with a null date
			}
		}
		attVo.setANEconclusionDateTime(dischargeDT);
		
		// PV2-38   Mode of arrival code   
		attVo.setModeOfArrival((ArrivalMode) svc.getLocalLookup(ArrivalMode.class, ArrivalMode.TYPE_ID, providerSystem.getCodeSystem().getText(), pv2.getModeOfArrivalCode().getIdentifier().getValue()));

		attVo.setReasonForAdmission( getReasonForAdmission(pv2));
		attVo.setBedTypeRequested(getBedTypeRequested(pv1));
		LocShortVo currentLoc=null;
		if(pv1.getAssignedPatientLocation().getFacility().getNamespaceID().getValue()!=Hl7Null)
			//WDEV-20278
//			currentLoc = orgLoc.getLocationByTaxonomyType(pv1.getAssignedPatientLocation().getFacility().getNamespaceID().getValue(),  TaxonomyType.PAS);
			currentLoc = orgLoc.getLocationByTaxonomyType(pv1.getAssignedPatientLocation().getFacility().getNamespaceID().getValue(), providerSystem.getCodeSystem()); //WDEV-20278
		attVo.setCurrentLocation(currentLoc);
		return attVo;
	}
	
	public void fillPasEventFromPV1(PV1 pv1, PasEventVo pe, OrganisationAndLocation orgLoc, HcpAdmin hcpAdmin,ProviderSystemVo providerSystem) throws Exception
	{
		pe.setSpecialty((Specialty) svc.getLocalLookup(Specialty.class, Specialty.TYPE_ID, providerSystem.getCodeSystem().getText(), pv1.getHospitalService().getValue()));
		//http://jira/browse/WDEV-14185
		pe.setPASSpecialty((PASSpecialty) svc.getLocalLookup(PASSpecialty.class, PASSpecialty.TYPE_ID, providerSystem.getCodeSystem().getText(), pv1.getHospitalService().getValue()));
		String eventId = pv1.getVisitNumber().getID().getValue() + "_" + pv1.getVisitNumber().getComponent(1);
		pe.setPasEventId(eventId);
		
		pe.setSourceOfReferral((SourceOfReferral) svc.getLocalLookup(SourceOfReferral.class, SourceOfReferral.TYPE_ID, providerSystem.getCodeSystem().getText(), pv1.getAdmitSource().getValue()));
		String pasEpisodeId=pv1.getAlternateVisitID().getID().getValue();
		pe.setPasEpisodeId(pasEpisodeId);
		LocShortVo loc = null;
		String patClass = pv1.getPatientClass().getValue();
		
		// wdev-7260
		if (patClass == null)
			throw new HL7Exception("PatientClass invalid or not specified (PV1-2)");

		if (patClass.equals(INPATIENT_APP))
		{
			//WDEV-20278
//			loc = orgLoc.getLocationByTaxonomyType(pv1.getAssignedPatientLocation().getPointOfCare().getValue(), TaxonomyType.PAS);
			loc = orgLoc.getLocationByTaxonomyType(pv1.getAssignedPatientLocation().getPointOfCare().getValue(), providerSystem.getCodeSystem()); //WDEV-20278
			pe.setEventType(PasEventType.INPATIENT);
			//loc = orgLoc.getLocationByLocalCode(pv1.getAssignedPatientLocation().getPointOfCare().getValue(), LocationType.WARD);
		}
		else if (patClass.equals(OUTPATIENT_APP))
		{
			pe.setEventType(PasEventType.OUTPATIENT);
			// Do nothing - as it is a clinic that will be held at attendance level for outpatient
			//loc = orgLoc.getLocationByLocalCode(pv1.getAssignedPatientLocation().getPointOfCare().getValue(), LocationType.CLINIC);
		}
		else if (patClass.equals(EMERGENCY_APP))
		{
			loc = orgLoc.getLocationByLocalCode(pv1.getAssignedPatientLocation().getPointOfCare().getValue(), LocationType.DEPT);
			pe.setSourceOfReferral((SourceOfReferral) svc.getLocalLookup(SourceOfReferral.class, SourceOfReferral.TYPE_ID, TaxonomyType.MAXIMS_INTERNAL.getText(), pv1.getAdmitSource().getValue()));

		}
		else
		{
			// Default to assuming it's a WARD location
			loc = orgLoc.getLocationByLocalCode(pv1.getAssignedPatientLocation().getPointOfCare().getValue(), LocationType.WARD);
		}
		pe.setLocation(loc);
				
		if (pv1.getAdmitDateTime().getTimeOfAnEvent() != null && pv1.getAdmitDateTime().getTimeOfAnEvent().getValue() != null)
		{
			pe.setEventDateTime(new DateTime(pv1.getAdmitDateTime().getTimeOfAnEvent().getValue()));				
		}

		MedicVo medic = hcpAdmin.getMedicByNationalCode(pv1.getConsultingDoctor(0).getIDNumber().getValue());
		MedicWithMappingsLiteVo medLite=null;
		//JME: 20061016: McKesson are sending the consultant in PV1.17 (Admitting Doctor)
		if (medic == null)
		{
			// Check to see if the pas code has been specified in second repetition of consulting doctor, try this if found
			String pasCode = pv1.getConsultingDoctor(1).getIDNumber().getValue();
			if (pasCode != null)
				medLite = hcpAdmin.getMedicMedicMappingsByPasCode(pasCode);
			
			if (medLite == null)  // wdev-3115
				medic = hcpAdmin.getMedicByNationalCode(pv1.getAdmittingDoctor(0).getIDNumber().getValue());
		}
		if (medic != null || medLite != null)
		{
			if (medLite == null)
			{
				medLite = new MedicWithMappingsLiteVo(medic.getID_Hcp(), medic.getVersion_Hcp());
				medLite.setMos(medic.getMos());
			}
			pe.setConsultant(medLite);			
		}
		pe.setIsVip(Boolean.FALSE);
		if (pv1.getVIPIndicator().getValue() != null && pv1.getVIPIndicator().getValue().equals("Y"))
		{
			pe.setIsVip(Boolean.TRUE);
		}
		
		// PV1-7 Attending doctor
		//WDEV-20278
//		pe.setAttendingHCP(getAttendingDoctor(pv1));
		pe.setAttendingHCP(getAttendingDoctor(pv1, providerSystem)); //WDEV-20278
				
		//	PV1-8   Referring doctor   
		if (pv1.getReferringDoctor(0) != null)	
		{
			GpLiteVo gp = gpAdmin.getGPByTaxonomyType(pv1.getReferringDoctor(0).getIDNumber().getValue(), TaxonomyType.NAT_GP_CODE);
			if (gp == null && pv1.getReferringDoctor(1).getIDNumber().getValue() != null) // See if second repetition has been supplied and try to get by PAS code
				//WDEV-20278
				//gp = gpAdmin.getGPByTaxonomyType(pv1.getReferringDoctor(1).getIDNumber().getValue(), TaxonomyType.PAS);
				gp = gpAdmin.getGPByTaxonomyType(pv1.getReferringDoctor(1).getIDNumber().getValue(), providerSystem.getCodeSystem()); //WDEV-20278
			pe.setReferringGP(gp);
		}
		
		// WDEV-12841 - Populate the FinancialClass if supplied.
		if (pv1.getFinancialClass(0) != null && pv1.getFinancialClass(0).getFinancialClass() != null &&
											pv1.getFinancialClass(0).getFinancialClass().getValue() != null)
		{
			pe.setEpisodeFinancialClass((OrderCategory) svc.getLocalLookup(OrderCategory.class, OrderCategory.TYPE_ID, providerSystem.getCodeSystem().getText(), pv1.getFinancialClass(0).getFinancialClass().getValue()));
		}
		
	}

	public void fillPasEventFromEVN(EVN evn, PasEventVo pe, DateTime transactionDT) throws HL7Exception
	{
		try
		{
			if (evn.getRecordedDateTime().getTimeOfAnEvent() != null && evn.getRecordedDateTime().getTimeOfAnEvent().getValue() != null)
			{
				pe.setEventDateTime(new DateTime(evn.getRecordedDateTime().getTimeOfAnEvent().getValue()));
				if(transactionDT != null)
					transactionDT.setDateTime(pe.getEventDateTime().getDate(), pe.getEventDateTime().getTime());
			}
		}
		catch (ParseException e)
		{
			throw new HL7Exception(e.getMessage(), e);
		}
	}

	public DischargedEpisodeVo fillDischargeFromMsg(Message msg, OrganisationAndLocation orgLoc, HcpAdmin hcpAdmin,ProviderSystemVo providerSystem) throws Exception
	{
		return this.fillDischargeFromMsg(new DischargedEpisodeVo(), msg, orgLoc, hcpAdmin,providerSystem);
	}
	
	public DischargedEpisodeVo fillDischargeFromMsg(DischargedEpisodeVo dischVo, Message msg, OrganisationAndLocation orgLoc, HcpAdmin hcpAdmin,ProviderSystemVo providerSystem) throws Exception
	{
		if (dischVo == null)
			dischVo = new DischargedEpisodeVo();
		
		PasEventVo pe = dischVo.getPasEvent();
		if (pe == null)
			pe = new PasEventVo();

		PV1 pv1 = (PV1) msg.get("PV1");
		EVN evn = (EVN) msg.get("EVN");

		fillPasEventFromEVN(evn, pe, null);
		fillPasEventFromPV1(pv1, pe, orgLoc, hcpAdmin,providerSystem);

		// Get Discharge DateTime is specified in PV1-45
		if (pv1.getDischargeDateTime(0).getTimeOfAnEvent() != null && pv1.getDischargeDateTime(0).getTimeOfAnEvent().getValue() != null)
		{
			dischVo.setDischargeDateTime(new DateTime(pv1.getDischargeDateTime(0).getTimeOfAnEvent().getValue()));
			pe.setEventDateTime(new DateTime(pv1.getDischargeDateTime(0).getTimeOfAnEvent().getValue()));				
		}
		
		//wdev WDEV-8275
		dischVo.setDischargeDestination((DischargeDestination)svc.getLocalLookup(DischargeDestination.class,DischargeDestination.TYPE_ID, providerSystem.getCodeSystem().getText(), pv1.getDischargedToLocation().getDischargeLocation().getValue()));
		
		dischVo.setPasEvent(pe);
		// wdev-4538 Do not set the discharge date/time if this is a cancel discharge message
		if (!HL7Utils.getEventCode(msg).equals("A13")&&dischVo.getDischargeDateTimeIsNotNull())
			dischVo.setDischargeDateTime(pe.getEventDateTime());
		dischVo.setIsActive(true);  // wdev-3411

		return dischVo;
	}

	protected final PersonName populateNameVoFromXPN(PersonName name, XPN xpn,ProviderSystemVo providerSystem)
	{
		LOG.debug("VoMapper populateNameVoFromXPN: entry");
		if (xpn == null)
			return name;
		
		if (name == null)
		{
			name = new PersonName();			
		}
		
		String surname = xpn.getFamilyName().getSurname().getValue();
		if (surname != null && surname.equals(Hl7Null))
			name.setSurname(null);
		else if (surname != null)		
			name.setSurname(surname);

		String forename = xpn.getGivenName().getValue();
		if (forename != null && forename.equals(Hl7Null))
			name.setForename(null);
		else if (forename != null)		
			name.setForename(forename);
		
		String midName = xpn.getSecondAndFurtherGivenNamesOrInitialsThereof().getValue();
		if (midName != null && midName.equals(Hl7Null))
			name.setMiddleName(null);
		else if (midName != null)		
			name.setMiddleName(midName);

		
		String titleTxt = xpn.getPrefixEgDR().getValue();
		if (titleTxt != null && titleTxt.equals(Hl7Null))
			name.setTitle(null);
		else if (titleTxt != null)		
			name.setTitle(getTitleLookup(titleTxt,providerSystem));

		
		String nmType = xpn.getNameTypeCode().getValue();
		if (nmType != null && nmType.equals(Hl7Null))
			name.setNameType(null);
		else if (nmType != null)		
			name.setNameType((NameType) svc.getLocalLookup(NameType.class, NameType.TYPE_ID, providerSystem.getCodeSystem().getText(), nmType));
	
		LOG.debug("VoMapper populateNameVoFromXPN: exit (" + name.toShortForm() + ")");

		if (name.getSurname() == null && name.getForename() == null && name.getMiddleName() == null && name.getTitle() == null && name.getNameType() == null)
		{
			return null;
		}
		else
			return name;
	}

	private PersonTitle getTitleLookup(String titleTxt,ProviderSystemVo providerSystem)
	{
		if (titleTxt == null)
			return null;
		String modifiedText = titleTxt.toUpperCase().trim().replaceAll("\\.", "");
		PersonTitle titleValue =(PersonTitle) svc.getLocalLookup(PersonTitle.class, PersonTitle.TYPE_ID, providerSystem.getCodeSystem().getText(), modifiedText);
		if (titleValue != null)
			return titleValue;
		else
			return (PersonTitle)addLookupInstanceMapping(PersonTitle.class, PersonTitle.TYPE_ID, titleTxt, modifiedText, providerSystem.getCodeSystem().getText());
	}
	
	@SuppressWarnings("unchecked")
	protected LookupInstVo addLookupInstanceMapping(Class clazz, int typeId, String lookupText, String mappingText, String extSystem)
	{
		if (lookupText == null || lookupText.equals(""))
			return null;
		
		LookupInstVo instance = checkForExistingLookupInstance(typeId, lookupText);
		if (instance == null)
		{
			instance = new LookupInstVo(0,lookupText.trim(),true);
		}
		instance.addMapping(new LookupMappingVo(extSystem, mappingText.trim()));
		LookupTypeVo type = new LookupTypeVo(typeId);
		try
		{
			lookupTree.saveLookupInstance(type, instance);			
			LookupInstVo inst = svc.getLocalLookup(clazz, typeId, extSystem, mappingText);
			//lookupTree.refreshCache(type);
			//svc.refreshCache(type.getId());
			
			return inst;
		}
		catch (DomainInterfaceException e)
		{
			LOG.error("DomainInterfaceException occurred Saving a new title lookup - " + e.getMessage(), e);
		}
		catch (StaleObjectException e)
		{
			LOG.error("StaleObjectException occurred Saving a new title lookup - " + e.getMessage(), e);
		}
		return null;
	}

	private LookupInstVo checkForExistingLookupInstance(int typeId, String lookupText)
	{
		LookupInstanceCollection coll = svc.getLookupCollection(new LookupTypeVo(typeId));
		for (int i = 0; i < coll.size(); i++)
		{
			if (coll.getIndex(i).getText().equalsIgnoreCase(lookupText))
				return coll.getIndex(i);
		}
		return null;
	}


	protected final void renderNameVoToXPN(PersonName name, XPN xpn,ProviderSystemVo providerSystem) throws Exception
	{
		LOG.debug("VoMapper renderNameVoToXPN: entry");
		if (name == null)
			return;

		xpn.getFamilyName().getSurname().setValue(name.getSurname());
		xpn.getGivenName().setValue(name.getForename());
		xpn.getSecondAndFurtherGivenNamesOrInitialsThereof().setValue(name.getMiddleName());
		if (name.getTitleIsNotNull())
			xpn.getPrefixEgDR().setValue(svc.getRemoteLookup(name.getTitle().getID(), providerSystem.getCodeSystem().getText()));
		if (name.getNameTypeIsNotNull())
		{
			xpn.getNameTypeCode().setValue(svc.getRemoteLookup(name.getNameType().getID(), providerSystem.getCodeSystem().getText()));
		}
		else
		{
			xpn.getNameTypeCode().setValue(svc.getRemoteLookup( NameType.LEGAL.getID(), providerSystem.getCodeSystem().getText()));
		}
			
		LOG.debug("VoMapper renderNameVoToXPN: exit (" + xpn.toString() + ")");
	}

	
	//WDEV-19576
//	protected final void renderPersonNameShortVoToXPN(PersonNameShortVo name, XPN xpn, ProviderSystemVo providerSystem) throws Exception
//	{
//		LOG.debug("VoMapper renderPersonNameShortVoToXPN: entry");
//		
//		if (name == null)
//			return;
//
//		if(name.getSurname() != null && name.getSurname().length() > 0)
//		{
//			xpn.getFamilyName().getSurname().setValue(name.getSurname());
//		}
//
//		if (name.getTitle() != null && name.getTitle().getID() > 0)
//		{
//			xpn.getPrefixEgDR().setValue(svc.getRemoteLookup(name.getTitle().getID(), providerSystem.getCodeSystem().getText()));
//		}
//
//		xpn.getNameTypeCode().setValue(svc.getRemoteLookup(NameType.LEGAL.getID(), providerSystem.getCodeSystem().getText()));
//		
//		LOG.debug("VoMapper renderPersonNameShortVoToXPN: exit (" + xpn.toString() + ")");
//	}
	
		
	protected final void populateLocationVoFromPL(PL pl, IfOcsOrderVo order, ProviderSystemVo providerSystem) throws HL7Exception
	{
		LOG.debug("VoMapper populateLocationVoFromPL: entry");
		if (pl == null)
			return;
		
		
		//WDEV-6828 - if config item is valued and the same value has been sent in, ensure the Patient Location isn't overwritten
		ConfigPropertyVo prop= providerSystem.getConfigurationProperty(ConfigItems.GenericClinicCode);
		if (prop != null && (prop.getPropertyValue().length() > 0) && prop.getPropertyValue().equalsIgnoreCase(pl.getPointOfCare().getValue()))
			return;
		
		// wdev-3051 - get PatientLocation by Provider Systems type and not National Location Code
		//http://jira/browse/WDEV-3246 use the lite version
		LocationLiteVo loc= orgLoc.getLocationLiteByTaxonomyType(pl.getPointOfCare().getValue(),providerSystem.getCodeSystem());
		if (loc == null)
		{
			// Check to see if it is a clinic
			ClinicVo clinic =orgLoc.getClinicByTaxonomyCode((TaxonomyType)providerSystem.getCodeSystem(),pl.getPointOfCare().getValue());
			if (clinic != null)
			{
				order.setPatientClinic(clinic);
				order.setOutpatientDept(clinic.getOutpatientDept());
			}
		}
		else
		{
			order.setPatientLocation(loc);
			if (loc.getType()!=null&&loc.getType().equals(LocationType.OUTPATIENT_DEPT))
			{
				order.setOutpatientDept(loc);
			}
		}
		//WDEV-8884 
		if(ConfigFlag.HL7.REJECT_RESULTS_FOR_UNKNOWN_ORDERINGPROVIDER_OR_LOCATION.getValue())
		{
		
			// wdev-2746 Either PatientClinic or PatientLocation must map
			if (pl.getPointOfCare().getValue() != null &&
					!order.getPatientClinicIsNotNull() && !order.getPatientLocationIsNotNull())
			{
				throw new HL7Exception("PatientLocation (PV1-3) does not map to a valid Location or Clinic - Message Rejected");
			}
		}
		LOG.debug("VoMapper populateLocationVoFromPL: -exit ");
	}
	
	protected final PersonAddress populateAddressVoFromXAD(PersonAddress pa, XAD xad,ProviderSystemVo providerSystem, AddressType defaultAddrType)
	{
		LOG.debug("VoMapper populateAddressVoFromXAD: entry");
		if (xad == null)
			return pa;

		if (pa == null)
		{
			pa = new PersonAddress();			
		}

		String line = xad.getStreetAddress().getStreetOrMailingAddress().getValue();
		if (line != null && line.equals(Hl7Null))
			pa.setLine1(null);
		else if (line != null)		
			pa.setLine1(line);
		
		line = xad.getOtherDesignation().getValue();
		if (line != null && line.equals(Hl7Null))
			pa.setLine2(null);
		else if (line != null)		
			pa.setLine2(line);
		
		line = xad.getCity().getValue();
		if (line != null && line.equals(Hl7Null))
			pa.setLine3(null);
		else if (line != null)		
			pa.setLine3(line);
		
		line = xad.getStateOrProvince().getValue();
		if (line != null && line.equals(Hl7Null))
			pa.setLine4(null);
		else if (line != null)		
			pa.setLine4(line);

		line = xad.getOtherGeographicDesignation().getValue();
		if (line != null && line.equals(Hl7Null))
			pa.setLine5(null);
		else if (line != null)		
			pa.setLine5(line);
		
		String postCode = xad.getZipOrPostalCode().getValue();
		if (postCode != null && postCode.equals(Hl7Null))
			pa.setPostCode(null);
		else if (postCode != null)		
			pa.setPostCode(postCode);
			
		String countyCode = xad.getCountyParishCode().getValue();
		//http://jira/browse/WDEV-13491
		if(ConfigFlag.UI.DEMOGRAPHICS_TYPE.getValue().equals("UK"))
		{
			if (countyCode != null && countyCode.equals(Hl7Null))
				pa.setPCT(null);
			else if (countyCode != null)		
				pa.setPCT (countyCode);
			
		}
		else
		{
			if (countyCode != null && countyCode.equals(Hl7Null))
				pa.setCounty(null);
			else if (countyCode != null)		
				pa.setCounty((County) svc.getLocalLookup(County.class, County.TYPE_ID, providerSystem.getCodeSystem().getText(), countyCode));
		}
		//http://jira/browse/WDEV-13371 - set the address type
		String addressType = xad.getAddressType().getValue();
		if(addressType!=null&&addressType.equals(Hl7Null))
		{
			pa.setAddressType(null);
		}
		else if(addressType!=null)
		{
			pa.setAddressType((AddressType)svc.getLocalLookup(AddressType.class, AddressType.TYPE_ID, providerSystem.getCodeSystem().getText(), addressType));
		}

		
		// WDEV-15936 Address Type cannot be null as it causes problems with equals method
		// use the defaultAddressType argument if setting to null
		if (!pa.getAddressTypeIsNotNull())
			pa.setAddressType(defaultAddrType);

		
		//http://jira/browse/WDEV-14488
		if (pa.getAddressTypeIsNotNull()&& pa.getAddressType().equals(AddressType.HISTORICAL))
		{
			try
			{
				pa.setNotificationDate(new Date(xad.getAddressRepresentationCode().getValue(),DateFormat.ISO));
			} catch(Exception e)
			{
				LOG.warn("Failed to parse notification date "+e.getMessage());
			}
		}
		String aor=xad.getCensusTract().getValue(); //http://jira/browse/WDEV-19177
		if(aor!=null&&aor.equals(Hl7Null))
		{
			pa.setAreaOfResidence(null);
		}
		else if(aor!=null)
		{
			pa.setAreaOfResidence((AreaOfResidence)svc.getLocalLookup(AreaOfResidence.class, AreaOfResidence.TYPE_ID, providerSystem.getCodeSystem().getText(), aor));
		}
		
		LOG.debug("VoMapper populateAddressVoFromXAD: exit (" + pa.toDisplayString() + ")");

		if (pa.getLine1() == null && pa.getLine2() == null && pa.getLine3() == null && pa.getLine4() == null && pa.getLine5() == null && pa.getPostCode() == null && pa.getCounty() == null
				&&pa.getAreaOfResidence()==null)
		{
			return null;
		}
		else
			return pa;
	}

	protected final void renderAddressVoToXAD(PersonAddress pa, XAD xad,ProviderSystemVo providerSystem) throws Exception
	{
		LOG.debug("VoMapper renderAddressVoToXAD: entry");
		if (pa == null)
			return;

		xad.getStreetAddress().getStreetOrMailingAddress().setValue(pa.getLine1());
		xad.getOtherDesignation().setValue(pa.getLine2());
		xad.getCity().setValue(pa.getLine3());
		xad.getStateOrProvince().setValue(pa.getLine4());
		xad.getOtherGeographicDesignation().setValue(pa.getLine5());
		xad.getZipOrPostalCode().setValue(pa.getPostCode());

		if (pa.getCountyIsNotNull())
			xad.getCountyParishCode().setValue(svc.getRemoteLookup(pa.getCounty().getID(), providerSystem.getCodeSystem().getText()));
		
		if(pa.getAddressTypeIsNotNull())
		{
			xad.getAddressType().setValue(svc.getRemoteLookup(pa.getAddressType().getID(), providerSystem.getCodeSystem().getText()));
		}
		else
		{
			xad.getAddressType().setValue(svc.getRemoteLookup(AddressType.PERMANENT.getID(), providerSystem.getCodeSystem().getText()));
		}
		if(pa.getAreaOfResidenceIsNotNull()) //http://jira/browse/WDEV-19177
		{
			xad.getCensusTract().setValue(svc.getRemoteLookup(pa.getAreaOfResidence().getID(), providerSystem.getCodeSystem().getText()));
		}

		LOG.debug("VoMapper renderAddressVoToXAD: exit (" + xad.toString() + ")");
	}

	
	//WDEV-19576
	protected final void renderOrgAddressVoToXAD(AddressVo addressVo, XAD xad, ProviderSystemVo providerSystem) throws Exception
	{
		LOG.debug("VoMapper renderOrgAddressVoToXAD: entry");
		
		if (addressVo == null)
			return;

		//XAD.1.1 Street or mailing address (ST)
		if(addressVo.getLine1() != null && addressVo.getLine1().length() > 0)
		{
			xad.getStreetAddress().getStreetOrMailingAddress().setValue(addressVo.getLine1());
		}
		//XAD.2 Other designation (ST)
		if(addressVo.getLine2() != null && addressVo.getLine2().length() > 0)
		{
			xad.getOtherDesignation().setValue(addressVo.getLine2());
		}
		//XAD.3 City (ST)
		if(addressVo.getLine3() != null && addressVo.getLine3().length() > 0)
		{
			xad.getCity().setValue(addressVo.getLine3());
		}
		//XAD.4 Stae or province *ST)
		if(addressVo.getLine4() != null && addressVo.getLine4().length() > 0)
		{
			xad.getStateOrProvince().setValue(addressVo.getLine4());
		}
		//XAD.5 Zip or postal code (ST)
		if(addressVo.getPostCode() != null && addressVo.getPostCode().length() > 0)
		{
			xad.getZipOrPostalCode().setValue(addressVo.getPostCode());
		}
		//WDEV-22597
		//XAD.8 Address type (ID)
		if (addressVo.getAddressType() != null)
		{
			xad.getAddressType().setValue(svc.getRemoteLookup(addressVo.getAddressType().getID(), providerSystem.getCodeSystem().getText()));			
		} //WDEV-22597
		//XAD.8 Other geographic designation (ST)
		if(addressVo.getLine5() != null && addressVo.getLine5().length() > 0)
		{
			xad.getOtherGeographicDesignation().setValue(addressVo.getLine5());
		}
	
		LOG.debug("VoMapper renderOrgAddressVoToXAD: exit (" + xad.toString() + ")");
	}
	
	
	
	/**
	 * populateDateVoFromTS
	 * <p>
	 * Populates a Date class with values from TS YYYY[MM[DD[HHMM[SS[.S[S[S[S]]]]]]]][+/-
	 * 
	 * @param ts
	 * @return ims.framework.utils.Date or null if partial date
	 *         </p>
	 */
	protected final Date populateDateVoFromTS(TS ts)
	{
		LOG.debug("VoMapper populateDateVoFromTS: entry");

		if (ts == null || ts.getTimeOfAnEvent().getValue() == null)
			return null;
		Date dt = null;
		String st = ts.getTimeOfAnEvent().getValue();
		PartialDate pdt = new PartialDate(st);
		dt = pdt.toDate();
		if (dt != null)
			LOG.debug("VoMapper populateDateVoFromTS: exit (" + dt.toString() + ")");
		return dt;
	}

	/**
	 * populateDateVoFromDT
	 * <p>
	 * Populates a Date class with values from DT YYYY[MM[DD]]
	 * 
	 * @param dt
	 * @return ims.framework.utils.Date or null if partial date
	 *         </p>
	 */
	protected final Date populateDateVoFromDT(DT dt)
	{
		LOG.debug("VoMapper populateDateVoFromTS: entry");

		if (dt == null || dt.getValue() == null)
			return null;
		Date date = null;
		String st = dt.getValue();
		PartialDate pdt = new PartialDate(st);
		date = pdt.toDate();
		if (date != null)
			LOG.debug("VoMapper populateDateVoFromDT: exit (" + dt.toString() + ")");
		return date;
	}
	
	/**
	 * populateDateVoFromTS
	 * <p>
	 * Populates a Date class with values from TS YYYY[MM[DD[HHMM[SS[.S[S[S[S]]]]]]]][+/-
	 * 
	 * @param ts
	 * @return ims.framework.utils.Date or null if partial date
	 *         </p>
	 * @throws Exception
	 */
	protected final DateTime populateDateTimeVoFromTS(TS ts) throws Exception
	{
		LOG.debug("VoMapper populateDateTimeVoFromTS: entry");

		if (ts == null || ts.getTimeOfAnEvent().getValue() == null)
			return null;

		DateTime dt;
		String st = ts.getTimeOfAnEvent().getValue();
		if (st.length() < 12)
		{
			// Time is not included, so we will have to create a date and then instantiate a datetime
			// from that
			PartialDate pdt = new PartialDate(st);
			dt = new DateTime(pdt.toDate(), null);
		}
		else
			dt = new DateTime(st);
		if (dt != null)
			LOG.debug("VoMapper populateDateTimeVoFromTS: exit (" + dt.toString() + ")");
		return dt;
	}
	
	protected final boolean isTimeSupplied(TS ts)
	{
		if (ts == null || ts.getTimeOfAnEvent().getValue() == null)
			return false;		
		return ts.getTimeOfAnEvent().getValue().length() >= 12;
	}

	protected final void renderDateTimeVoToTS(DateTime dt, TS ts) throws Exception
	{
		LOG.debug("VoMapper renderDateTimeVoToTS: entry");
		if (dt == null)
			return;

		ts.getTimeOfAnEvent().setValue(dt.toString(DateTimeFormat.MILLI));

		LOG.debug("VoMapper renderDateTimeVoToTS: exit (" + ts.toString() + ")");
	}

	//http://jira/browse/WDEV-19913
	protected final void renderDateTimeVoToTS(DateTime dt, TS ts,DateTimeFormat format) throws Exception
	{
		LOG.debug("VoMapper renderDateTimeVoToTS: entry");
		if (dt == null)
			return;

		ts.getTimeOfAnEvent().setValue(dt.toString(format));

		LOG.debug("VoMapper renderDateTimeVoToTS: exit (" + ts.toString() + ")");
	}

	
	protected final void renderDateVoToTS(Date dt, TS ts) throws Exception
	{
		LOG.debug("VoMapper renderDateVoToTS: entry");
		if (dt == null)
			return;

		ts.getTimeOfAnEvent().setValue(dt.toString(DateFormat.ISO));
		LOG.debug("VoMapper renderDateVoToTS: exit (" + ts.toString() + ")");
	}
	
	protected final PatientId populatePatidFromIdField(CX idField, ProviderSystemVo providerSystem) throws HL7Exception
	{
		LOG.debug("VoMapper populatePatidFromIdField: entry");
		PatientId patid = new PatientId();
		CX id1 = idField;
		String idType;
		if (providerSystem.getIdtypeComponent().intValue() == 4)
		{
			idType = id1.getAssigningAuthority().getNamespaceID().getValue();
		}
		else if (providerSystem.getIdtypeComponent().intValue() == 5)
		{
			idType = id1.getIdentifierTypeCode().getValue();
		}
		else
		{
			idType = id1.getIdentifierTypeCode().getValue();
		}

		if (idType == null)
		{
			throw new HL7Exception("Identifier type code must be sent in the configured component C" + providerSystem.getIdtypeComponent() + " for all repetitions of CX.");
		}
		
		// If the value is null then move to the next in the list
		String idVal = id1.getID().getValue();
		if (idVal == null||"".equals(idVal)||Hl7Null.equals(idVal)) //http://jira/browse/WDEV-13709
			throw new HL7Exception("Identifier value must be sent in component 1 of the patient Id field");

		PatIdType type = (PatIdType) svc.getLocalLookup(PatIdType.class, PatIdType.TYPE_ID, providerSystem.getCodeSystem().getText(), idType);
		if (type != null)
		{
			//JME: 20060119: for all id types, remove the leading char.
			if (providerSystem.getCodeSystem().getText().equals("PAS") && !type.equals(PatIdType.NHSN) && !type.equals(PatIdType.DISTRICT) && ConfigFlag.HL7.HL7_STRIP_PATIENT_IDENTIFIER_CHARACTER.getValue())  // wdev-3656
				idVal = idVal.substring(1);
			
			patid.setType(type);
			patid.setValue(idVal.trim());
			//wdev-8055
			if (type.equals(PatIdType.NHSN) && id1.getCheckDigit().getValue()!= null && id1.getCheckDigit().getValue().equals("V")) 
				patid.setVerified(true);
			else
				patid.setVerified(false);
		}
		
		LOG.debug("VoMapper populatePatidFromIdField: exit");
		return patid;

	}

	protected final PatientIdCollection populatePatidCollectionFromIdList(CX[] idList, ProviderSystemVo providerSystem) throws HL7Exception
	{
		LOG.debug("VoMapper populatePatidCollectionFromIdList: entry");
		PatientIdCollection coll = new PatientIdCollection();
		for (int i = 0; i < idList.length; i++)
		{
			CX id1 = idList[i];
			// If the value is null then move to the next in the list
			//http://jira/browse/WDEV-12137 moved to start of method
			String idVal = id1.getID().getValue();
			if (idVal == null||"".equals(idVal)||Hl7Null.equals(idVal)) //http://jira/browse/WDEV-13709
				continue;

			String idType;
			if (providerSystem.getIdtypeComponent().intValue() == 4)
			{
				idType = id1.getAssigningAuthority().getNamespaceID().getValue();
			}
			else if (providerSystem.getIdtypeComponent().intValue() == 5)
			{
				idType = id1.getIdentifierTypeCode().getValue();
			}
			else
			{
				idType = id1.getIdentifierTypeCode().getValue();
			}

			if (idType == null)
			{
				throw new HL7Exception("Identifier type code must be sent in the configured component C" + providerSystem.getIdtypeComponent() + " for all repetitions of CX.");
			}
			

			PatIdType type = (PatIdType) svc.getLocalLookup(PatIdType.class, PatIdType.TYPE_ID, providerSystem.getCodeSystem().getText(), idType);
			if (type != null)
			{
				//JME: 20060119: for all id types, remove the leading char.
				if (providerSystem.getCodeSystem().getText().equals("PAS") && !type.equals(PatIdType.NHSN) && !type.equals(PatIdType.DISTRICT) && ConfigFlag.HL7.HL7_STRIP_PATIENT_IDENTIFIER_CHARACTER.getValue())  // wdev-3656
					idVal = idVal.substring(1);

				PatientId patid = new PatientId();
				patid.setType(type);
				patid.setValue(idVal.trim());
				//wdev-8055
				if (type.equals(PatIdType.NHSN) && id1.getCheckDigit().getValue() != null && id1.getCheckDigit().getValue().equals("V")) 
					patid.setVerified(true);
				else
					patid.setVerified(false);
				coll.add(patid);
			}
		}
		if (coll.size() == 0)
			throw new HL7Exception("No Valid Patient ID found in message");
		LOG.debug("VoMapper populatePatidCollectionFromIdList: exit");
		return coll;
	}

	protected final void renderMaximsIdentifier(Integer ID,PID pid,ProviderSystemVo providerSystem)throws Exception
	{
		if(null==ID||null==pid||null==providerSystem)
			return;
		int identiferCount=pid.getPatientIdentifierList().length;
		CX maximsID=pid.getPatientIdentifierList(identiferCount);
		maximsID.getID().setValue(ID.toString());
		if (providerSystem.getIdtypeComponent().intValue() == 4)
			maximsID.getAssigningAuthority().getNamespaceID().setValue("MAXIMS");
		else
			maximsID.getIdentifierTypeCode().setValue("MAXIMS");
	}
	
	protected final void renderPatidCollectionToIdList(PatientIdCollection coll, PID pid, ProviderSystemVo providerSystem) throws Exception
	{
		renderPatidCollectionToIdList( coll, null, pid, providerSystem);
	}
	
	/*
	 * If this method is changed make sure to check the impact on renderPatidCollectionToMrg in A40VoMapper MN
	 */
	protected final void renderPatidCollectionToIdList(PatientIdCollection coll, String pasidPrefix,PID pid, ProviderSystemVo providerSystem) throws Exception
	{
		if (coll == null)
			return;

		LOG.debug("VoMapper renderPatidCollectionToIdList: entry");

		
		int posInMsg=0;
		for (int i = 0; i < coll.size(); i++)
		{
			PatientId patId = coll.get(i);
			
			if(patId.getTypeIsNotNull()&&patId.getType().equals(PatIdType.PASID)&&pasidPrefix!=null)
			{
				if (!patId.getValue().toUpperCase().startsWith(pasidPrefix.toUpperCase()))
					{
						continue;
					}
			}
			//http://jira/browse/WDEV-10022
			if(ConfigFlag.HL7.SEND_ONLY_VERIFIED_NHSN.getValue()==true 
					&&patId.getTypeIsNotNull()&&patId.getType().equals(PatIdType.NHSN)
					&&(!patId.getVerifiedIsNotNull()||patId.getVerified()==false))
			{
				
				continue;
			}
			CX idSingle = pid.getPatientID();
			if (patId.getTypeIsNotNull())
			{
				String patIdType = svc.getRemoteLookup(patId.getType().getID(), providerSystem.getCodeSystem().getText());
				if (patIdType != null)
				{
					
					CX id1 = pid.getPatientIdentifierList(posInMsg); //WDEV-12137
					posInMsg++;										 //WDEV-12137

					if (patId.getType().equals(PatIdType.NHSN))
						id1.getID().setValue((patId.getValue()!=null)?patId.getValue().replace(" ", ""):null);
					else
						id1.getID().setValue(patId.getValue());

					if (providerSystem.getIdtypeComponent().intValue() == 4)
						id1.getAssigningAuthority().getNamespaceID().setValue(patIdType);
					else
						id1.getIdentifierTypeCode().setValue(patIdType);
					
					if (patId.getType().equals(PatIdType.NHSN))
					{
						idSingle.getID().setValue((patId.getValue()!=null)?patId.getValue().replace(" ", ""):null);
						if (providerSystem.getIdtypeComponent().intValue() == 4)
							idSingle.getAssigningAuthority().getNamespaceID().setValue(patIdType);
						else
							idSingle.getIdentifierTypeCode().setValue(patIdType);
//MN 10-Mar-09		http://jira/browse/WDEV-6401
						if(patId.getVerifiedIsNotNull()&&patId.getVerified())
						{
							id1.getCheckDigit().setValue("V");
							id1.getCodeIdentifyingTheCheckDigitSchemeEmployed().setValue("MAXIMS");
						}
					
					}
				}
				
			}
			
		}

		LOG.debug("VoMapper renderPatidCollectionToIdList: exit");
	}

	protected final void renderCommChannelVoCollectionToXTN(CommChannelVoCollection voColl, XTN xtn) throws DataTypeException
	{
		if (voColl == null)
			return;
		for (int i=0; i<voColl.size(); i++)
		{
			renderCommChannelVoToXTN(voColl.get(i), xtn);
		}
	}
	
	protected final void renderCommChannelVoToXTN(CommChannelVo vo, XTN xtn) throws DataTypeException
	{
		if (vo == null)
			return;
			
		LOG.debug("VoMapper renderCommChannelVoToXTN: entry");
		
		xtn.getAnyText().setValue(vo.getCommValue());
		
		if (vo.getChannelType().equals(ChannelType.BLEEP))
		{
			xtn.getTelecommunicationEquipmentType().setValue("BP"); 
		}
		else if (vo.getChannelType().equals(ChannelType.EMAIL))
		{
			xtn.getEmailAddress().setValue(vo.getCommValue());
			xtn.getTelecommunicationEquipmentType().setValue("Internet");
			xtn.getTelecommunicationUseCode().setValue("NET");
		}
		else if (vo.getChannelType().equals(ChannelType.FAX))
		{
			xtn.getTelecommunicationEquipmentType().setValue("FX");
		}
		else if (vo.getChannelType().equals(ChannelType.MOBILE) || vo.getChannelType().equals(ChannelType.HOME_PHONE) ||
				vo.getChannelType().equals(ChannelType.WORK_PHONE))
		{
			xtn.getTelecommunicationEquipmentType().setValue("PH");
		}
				
		LOG.debug("VoMapper renderCommChannelVoToXTN: exit");
	}
	
	
	//http://jira/browse/WDEV-13614 Fax number not being sent from Hearts
	//Then issues with this method
	protected final CommChannelVoCollection populateCommsChannelVoCollectionFromXTN(XTN[] xtnColl, CommChannelVoCollection coll)
	{
		LOG.debug("VoMapper populateCommsChannelVoCollectionFromXTN: entry");

		if (coll == null)
			coll = new CommChannelVoCollection();
		
		coll.clear(); //clear out the old ones 
		
		for (int i = 0; i < xtnColl.length; i++)
		{
			XTN xtn = xtnColl[i];
			CommChannelVo vo = new CommChannelVo();
			String commUse = xtn.getTelecommunicationUseCode().getValue();	
			String commType = xtn.getTelecommunicationEquipmentType().getValue();
			if (commUse == null&&commType==null)
				continue;
			if (commUse!=null&&commUse.equals(Beeper))
			{
				vo.setChannelType(ChannelType.BLEEP);
			}
			else if (commUse!=null&&commUse.equals(Mobile) || (commType != null && commType.equals(Mobile)))
			{
				vo.setChannelType(ChannelType.MOBILE);
			}
			else if (commUse!=null&&commUse.equals(Email))
			{
				vo.setChannelType(ChannelType.EMAIL);
			}
			else if (commUse!=null&&commUse.equals(Fax) || (commType != null && commType.equals(Fax)))
			{
				vo.setChannelType(ChannelType.FAX);
			}
			else if (commUse!=null&&commUse.equals(Home))
			{
				vo.setChannelType(ChannelType.HOME_PHONE);
			}
			else if (commUse!=null&&commUse.equals(Work))
			{
				vo.setChannelType(ChannelType.WORK_PHONE);
			}
			else
			{
				LOG.warn("Unknown communication channel type " + commUse);
				continue;
			}
			vo.setCommValue(xtn.getAnyText().getValue());
			if(Hl7Null.equals(vo.getCommValue()) )
			{
				continue;
			}
			if(commUse!=null&&commUse.equals(Email)&&vo.getCommValue()==null) //WDEV-11424  if it was not populated by the default behaviour get it the correct way 
			{
				vo.setCommValue(xtn.getEmailAddress().getValue());
				if(Hl7Null.equals(vo.getCommValue()) )
				{
					continue;
				}
				
			}
			if (!(isCommChannelInCollection(vo, coll)))
			{
				coll.add(vo);
			}
		}
		LOG.debug("VoMapper populateCommsChannelVoCollectionFromXTN: exit coll size = " + coll.size());

		return coll;
	}
	private boolean isCommChannelInCollection(CommChannelVo commChannel,CommChannelVoCollection coll)
	{
		if(coll==null||coll.size()<1||commChannel==null)
		{
			return false;
		}
		for (CommChannelVo vo : coll)
		{
			if(commChannel.getChannelTypeIsNotNull()&&
					vo.getChannelTypeIsNotNull()&&
					commChannel.getChannelType().equals(vo.getChannelType())&&
					commChannel.getCommValueIsNotNull()&&
					vo.getCommValueIsNotNull()&&
					commChannel.getCommValue().equals(vo.getCommValue()))
			{
				return true;
			}
		}	
		return false;
	}
	protected GpShortVo populateGPVoFromXCN(XCN xcn, TaxonomyType taxType)
	{
		String pasCode = xcn.getIDNumber().getValue();
		if (pasCode != null)
		{
			GpShortVo gp = gpAdmin.getGPByTaxonomyType(pasCode, taxType);
			return gp;
		}
		return null;
	}

	protected final MemberOfStaffLiteVo populateMemberOfStaffShortVoFromXCN(XCN xcn, TaxonomyType taxType)
	{
		// Get the PAS Code and get Mos from there
		String pasCode = xcn.getIDNumber().getValue();
		if (pasCode != null)
		{
			MemberOfStaffLiteVo mosVo = mosAdmin.getMemberOfStaffLiteByTaxonomyType(pasCode, taxType);
			return mosVo;
		}
		return null;
	}

	protected final HcpLiteVo populateHcpVoFromXCN(XCN xcn, TaxonomyType taxType)
	{
		String pasCode = xcn.getIDNumber().getValue();
		if (pasCode != null)
		{
			return mosAdmin.getHcpLiteByTaxonomyType(pasCode, taxType);
		}
		return null;
	}

//http://jira/browse/WDEV-13505
	protected final MedicRefVo populateMedicRefFromXCN(XCN xcn, TaxonomyType taxType)
	{
		String code = xcn.getIDNumber().getValue();
		if (code != null)
		{
			return mosAdmin.getMedicRefByTaxonomyType(code, taxType);
		}
		return null;
	}


	protected final HcpRefVo populateHcpRefFromXCN(XCN xcn, TaxonomyType taxType)
	{
		String code = xcn.getIDNumber().getValue();
		if (code != null)
		{
			return mosAdmin.getHcpRefByTaxonomyType(code, taxType);
		}
		return null;
	}
	
	protected final HcpMinVo populateHcpMinFromXCN(XCN xcn, TaxonomyType taxType)
	{
		String code = xcn.getIDNumber().getValue();
		if (code != null)
		{
			return mosAdmin.getHcpMinByTaxonomyType(code, taxType);
		}
		return null;
	}
	
	
	protected final void renderMemberOfStaffShortVoToXCN(MemberOfStaffShortVo mos, XCN xcn,ProviderSystemVo providerSystem) throws DataTypeException
	{
		LOG.debug("VoMapper renderMemberOfStaffShortVoToXCN: entry");


		//WDEV-20083
//			if(mos!=null&&mos.getNameIsNotNull()&&mos.getName().getForenameIsNotNull())
//				xcn.getGivenName().setValue(mos.getName().getForename());
//			if(mos!=null&&mos.getNameIsNotNull()&&mos.getName().getSurnameIsNotNull())
//				xcn.getFamilyName().getSurname().setValue(mos.getName().getSurname());
		if(mos.getNameIsNotNull())
		{
			if(mos.getName().getForenameIsNotNull())
			{
				xcn.getGivenName().setValue(mos.getName().getForename());
			}
			if(mos.getName().getSurnameIsNotNull())
			{
				xcn.getFamilyName().getSurname().setValue(mos.getName().getSurname());
			}
			if(mos.getName().getTitleIsNotNull()
				&& mos.getName().getTitle().getID() > 0)
			{
				xcn.getPrefixEgDR().setValue(svc.getRemoteLookup(mos.getName().getTitle().getID(), providerSystem.getCodeSystem().getText()));
			}
		}
		//WDEV-20083
			
		if(mos != null 
			&& mos.getNationalConsCode() != null)
		{
			xcn.getIDNumber().setValue(mos.getNationalConsCode());
		}
		else if(mos != null)
		{
			TaxonomyMap mapping = mos.getExternalCode(providerSystem.getCodeSystem());
			if (mapping != null)
			{
				xcn.getIDNumber().setValue(mapping.getTaxonomyCode());
			}
		}

		LOG.debug("VoMapper renderMemberOfStaffShortVoToXCN: exit");
	}
	

	protected final void renderMemberOfStaffShortVoToXCNNatCode(MemberOfStaffShortVo mos, XCN xcn, ProviderSystemVo providerSystem) throws DataTypeException
	{
		LOG.debug("VoMapper renderMemberOfStaffShortVoToXCNNatCode: entry");

		//		//WDEV-20083
//		if(mos!=null&&mos.getNameIsNotNull()&&mos.getName().getForenameIsNotNull())
//			xcn.getGivenName().setValue(mos.getName().getForename());
//		if(mos!=null&&mos.getNameIsNotNull()&&mos.getName().getSurnameIsNotNull())
//			xcn.getFamilyName().getSurname().setValue(mos.getName().getSurname());
		if(mos.getNameIsNotNull())
		{
			if(mos.getName().getForenameIsNotNull())
			{
				xcn.getGivenName().setValue(mos.getName().getForename());
			}
			if(mos.getName().getSurnameIsNotNull())
			{
				xcn.getFamilyName().getSurname().setValue(mos.getName().getSurname());
			}
			if(mos.getName().getTitleIsNotNull()
				&& mos.getName().getTitle().getID() > 0)
			{
				xcn.getPrefixEgDR().setValue(svc.getRemoteLookup(mos.getName().getTitle().getID(), providerSystem.getCodeSystem().getText()));
			}
		}
		//WDEV-20083
		
		if(mos != null 
			&& mos.getNationalConsCode() != null)
		{
			xcn.getIDNumber().setValue(mos.getNationalConsCode());
		}
		else if(mos != null)
		{
			TaxonomyMap mapping = mos.getExternalCode(providerSystem.getCodeSystem());
			if (mapping != null)
			{
				xcn.getIDNumber().setValue(mapping.getTaxonomyCode());
			}
		}
		
		LOG.debug("VoMapper renderMemberOfStaffShortVoToXCNNatCode: exit");
	}

	
	protected final void renderGpShortVoToXCN(GpShortVo gp, XCN xcn, ProviderSystemVo providerSystem) throws DataTypeException
	{
		LOG.debug("VoMapper renderGpShortVoToXCN: entry");
		
		if(gp!=null&&gp.getNameIsNotNull()&&gp.getName().getForenameIsNotNull())
			xcn.getGivenName().setValue(gp.getName().getForename());
		if(gp!=null&&gp.getNameIsNotNull()&&gp.getName().getSurnameIsNotNull())
			xcn.getFamilyName().getSurname().setValue(gp.getName().getSurname());
		TaxonomyMap mapping = null;
		if (gp!=null)
			mapping = gp.getExternalCode(TaxonomyType.NAT_GP_CODE);
		if(mapping!=null)
		{
			xcn.getIDNumber().setValue(mapping.getTaxonomyCode());
		}
		if(gp!=null&&gp.getNameIsNotNull()&&gp.getName().getTitleIsNotNull())
			xcn.getPrefixEgDR().setValue(svc.getRemoteLookup(gp.getName().getTitle().getID(), providerSystem.getCodeSystem().getText()));

		LOG.debug("VoMapper renderGpShortVoToXCN: exit");
	}

	
	//WDEV-19481
	protected final void renderGpLiteVoToXCN(GpLiteVo gp, XCN xcn, ProviderSystemVo providerSystem) throws DataTypeException
	{
		LOG.debug("VoMapper renderGpLiteVoToXCN: entry");

		if(gp != null)
		{
			//XCN.0 ID number (ST)
			TaxonomyMap mapping = null;
			mapping = gp.getExternalCode(TaxonomyType.NAT_GP_CODE);
			if(mapping != null 
					&& mapping.getTaxonomyCode() != null)
			{
				xcn.getIDNumber().setValue(mapping.getTaxonomyCode());
			}			
			//XCN.1 Family Name (FN)
			if(gp.getNameIsNotNull() 
				&& gp.getName().getSurnameIsNotNull() 
				&& gp.getName().getSurname().length() > 0)
			{
				xcn.getFamilyName().getSurname().setValue(gp.getName().getSurname());
			}
			//XCN.2 Given name (ST)
			if(gp.getNameIsNotNull() 
				&& gp.getName().getForenameIsNotNull() 
				&& gp.getName().getForename().length() > 0)
			{
				xcn.getGivenName().setValue(gp.getName().getForename());
			}
			//XCN.5 Suffix (ST)
			if(gp.getNameIsNotNull() 
				&& gp.getName().getTitleIsNotNull() 
				&& gp.getName().getTitle().getId() > 0)
			{
				xcn.getPrefixEgDR().setValue(svc.getRemoteLookup(gp.getName().getTitle().getID(), providerSystem.getCodeSystem().getText()));
			}
			
//			//WDEV-2100
//			//XCN.9 Assigning authority (HD)
//			if (mapping != null
//					&& mapping.getTaxonomyName() != null)
//			{
//				xcn.getAssigningAuthority().getNamespaceID().setValue(mapping.getTaxonomyName().toString());
//
//				TaxonomyType taxonomyType = mapping.getTaxonomyName();
//				if (taxonomyType != null)
//				{
//					String taxTypeText = svc.getRemoteLookup(taxonomyType.getID(), providerSystem.getCodeSystem().getText());
//					if (taxTypeText != null)
//					{
//						//XCN.10 Name type code (ID)
//						xcn.getNameTypeCode().setValue(taxTypeText);
//					}
//				}
//			}
		}
			
		LOG.debug("VoMapper renderGpLiteVoToXCN: exit");
	}
	
	
	//WDEV-19481
	protected final void renderMedicWithMappingsLiteVoToXCN(MedicWithMappingsLiteVo medic, XCN xcn, ProviderSystemVo providerSystem) throws DataTypeException
	{
		LOG.debug("VoMapper renderMedicWithMappingsLiteVoToXCN: entry");

		if (medic != null)
		{
			//WDEV-2100
			TaxonomyMap natConsCodeMapping = medic.getMos().getExternalCode(TaxonomyType.NAT_CONS_CODE);
					
			// XCN.1 ID number (ST)
			if (natConsCodeMapping != null
					&& natConsCodeMapping.getTaxonomyCode() != null)
			{
				xcn.getIDNumber().setValue(natConsCodeMapping.getTaxonomyCode());
			}
			
			//XCN.2 Family Name (FN)
			if (medic.getMos().getNameIsNotNull() 
					&& medic.getName().getSurnameIsNotNull() 
					&& medic.getName().getSurname().length() > 0)
			{
				xcn.getFamilyName().getSurname().setValue(medic.getName().getSurname());
			}
			
			//XCN.3 Given name (ST)
			if (medic.getName().getSurnameIsNotNull() 
					&& medic.getName().getForenameIsNotNull() 
					&& medic.getName().getForename().length() > 0)
			{
				xcn.getGivenName().setValue(medic.getName().getForename());
			}
			
			//XCN.5 Prefix (ST)
			if (medic.getMos().getNameIsNotNull() 
					&& medic.getName().getTitleIsNotNull() 
					&& medic.getName().getTitle().getID() > 0)
			{
				xcn.getPrefixEgDR().setValue(svc.getRemoteLookup(medic.getName().getTitle().getID(), providerSystem.getCodeSystem().getText()));
			}
			
		}

		LOG.debug("VoMapper renderMedicWithMappingsLiteVoToXCN: exit");
	}


	//WDEV-19704
	protected final void renderHcpToXCN(ims.core.vo.Hcp hcp, XCN xcn, ProviderSystemVo providerSystem) throws DataTypeException
	{
		LOG.debug("VoMapper renderHcpToXCN: entry");

		if (hcp != null && hcp.getMos() != null)
		{
			//WDEV-2100
			TaxonomyMap natConsCodeMapping = hcp.getMos().getExternalCode(TaxonomyType.NAT_CONS_CODE);

			// XCN.0 ID number (ST)
			if (natConsCodeMapping != null
					&& natConsCodeMapping.getTaxonomyCode() != null)
			{
				xcn.getIDNumber().setValue(natConsCodeMapping.getTaxonomyCode().toString());
			} 
			
			//XCN.1 Family Name (FN)
			if (hcp.getMos().getNameIsNotNull() 
					&& hcp.getName().getSurnameIsNotNull() 
					&& hcp.getName().getSurname().length() > 0)
			{
				xcn.getFamilyName().getSurname().setValue(hcp.getName().getSurname());
			}
			
			//XCN.2 Given name (ST)
			if (hcp.getName().getSurnameIsNotNull() 
					&& hcp.getName().getForenameIsNotNull() 
					&& hcp.getName().getForename().length() > 0)
			{
				xcn.getGivenName().setValue(hcp.getName().getForename());
			}
			
			//XCN.5 Prefix (ST)
			if (hcp.getMos().getNameIsNotNull() 
					&& hcp.getName().getTitleIsNotNull() 
					&& hcp.getName().getTitle().getID() > 0)
			{
				xcn.getPrefixEgDR().setValue(svc.getRemoteLookup(hcp.getName().getTitle().getID(), providerSystem.getCodeSystem().getText()));
			}
			
		}

		LOG.debug("VoMapper renderHcpToXCN: exit");
	}


	public static String toDisplayString(String[] arr)
	{
		if (arr == null)
			return null;
		
		StringBuffer returnStr = new StringBuffer();
		for (int i=0; i<arr.length; i++)
		{
			if ( i > 0 )
				returnStr.append("; ");
			returnStr.append(arr[i]);
		}
		return returnStr.toString();
	}
	
//	protected TaxonomyType getExternalMappingType()
//	{
//		return extType;
//	}


	public GPAdmin getGpAdmin()
	{
		return gpAdmin;
	}


	public void setGpAdmin(GPAdmin gpAdmin)
	{
		this.gpAdmin = gpAdmin;
	}


	public LookupTree getLookupTree()
	{
		return lookupTree;
	}


	public void setLookupTree(LookupTree lookupTree)
	{
		this.lookupTree = lookupTree;
	}


	public MosAdmin getMosAdmin()
	{
		return mosAdmin;
	}


	public void setMosAdmin(MosAdmin mosAdmin)
	{
		this.mosAdmin = mosAdmin;
	}


	public OcsIf getOcsIf()
	{
		return ocsIf;
	}


	public void setOcsIf(OcsIf ocsIf)
	{
		this.ocsIf = ocsIf;
	}


	public OcsIfInbound getOcsIfInbound()
	{
		return ocsIfInbound;
	}


	public void setOcsIfInbound(OcsIfInbound ocsIfInbound)
	{
		this.ocsIfInbound = ocsIfInbound;
	}
	public CareSpellDialog getCareSpellDialog()
	{
		return careSpellDialog;
	}
	public void setCareSpellDialog(CareSpellDialog careSpellDialog)
	{
		this.careSpellDialog = careSpellDialog;
	}
	public CareContextSelectDialog getCareContextSelectDialog()
	{
		return careContextSelectDialog;
	}
	public void setCareContextSelectDialog(CareContextSelectDialog careContextSelectDialog)
	{
		this.careContextSelectDialog=careContextSelectDialog;
	}
	public DischargeInpatient getDischargeInpatient()
	{
		return dischargeInpatient;
	}
	public void setDischargeInpatient(DischargeInpatient dischargeInpatient)
	{
		this.dischargeInpatient = dischargeInpatient;
	}

	public static ConfigItems[] toConfigItemArray(ConfigPropertyVoCollection properties)
	{
		if (properties == null || properties.size() == 0)
			return null;
		
		ConfigItems[] items = new ConfigItems[properties.size()];
		for (int i=0; i<properties.size(); i++)
		{
			ConfigPropertyVo prop= properties.get(i);
			ConfigItems item = new ConfigItems(prop.getPropertyName(), prop.getPropertyValue());
			items[i] = item;
		}
		return items;
	}
	
	
	//WDEV-20278
//	public CareSpellVo createCareSpellVo(PasEventVo pas, PV1 pv)throws HL7Exception
	public CareSpellVo createCareSpellVo(PasEventVo pas, PV1 pv, ProviderSystemVo providerSystem)throws HL7Exception //WDEV-20278
	{
		CareSpellVo careSpell=new CareSpellVo();
		if(pas!=null && pas.getEventDateTime()!=null)
			careSpell.setStartDate( pas.getEventDateTime().getDate());
		else
			throw new HL7Exception("Validation of PasEvent failed. Set the Event Date Time in PV1-44");
		
		careSpell.setPatient(pas.getPatient());
		EpisodeofCareVo episode=new EpisodeofCareVo();
		episode.setCareSpell(careSpell);
		episode.setResponsibleHCP(hcpAdmin.getHcpLiteByExternalCode(TaxonomyType.NAT_CONS_CODE, pv.getConsultingDoctor(0).getIDNumber().getValue()));
		
		// wdev-4883 Check for PAS code mapping if national consultant code not found
		if (!episode.getResponsibleHCPIsNotNull())
		{
			episode.setResponsibleHCP(hcpAdmin.getHcpLiteByExternalCode(TaxonomyType.PAS, pv.getConsultingDoctor(1).getIDNumber().getValue()));
		}
		
		episode.setRelationship(CareSpelltoEpisodeRelationship.PRIMARY);
		episode.setSpecialty(pas.getSpecialty());
		episode.setStartDate( pas.getEventDateTime().getDate());
		EpisodeofCareVoCollection episodes=new EpisodeofCareVoCollection();
		episodes.add(episode);
		CareContextVo careContext=new CareContextVo();
		careContext.setEpisodeOfCare(episode);
		ContextType context=new ContextType();
		if (pv.getPatientClass().getValue().equals("I"))
		{
			context = ContextType.INPATIENT;
			pas.setEventType(ims.core.vo.lookups.PasEventType.INPATIENT);
		}
		else if (pv.getPatientClass().getValue().equals("O"))
		{
			context = ContextType.OUTPATIENT;
			pas.setEventType(ims.core.vo.lookups.PasEventType.OUTPATIENT);
		}
		else if (pv.getPatientClass().getValue().equals("P"))
		{
			context = ContextType.TCI;
			pas.setEventType(ims.core.vo.lookups.PasEventType.TCI);
		}
		else
		{
			context = ContextType.GHGSURGERY;
		}
		careContext.setContext(context);
		careContext.setStartDateTime(pas.getEventDateTime());
		careContext.setPasEvent(pas);
		careContext.setResponsibleHCP(episode.getResponsibleHCP());
		
		//WDEV-10231
		careContext.setCurrentStatus(new CareContextStatusHistoryVo());
		careContext.getCurrentStatus().setStatus(CareContextStatus.OPEN);
		careContext.getCurrentStatus().setStatusDateTime(pas.getEventDateTime());
	
		//WDEV-20278
//		LocSiteShortVo loc = orgLoc.getLocSiteShortByTaxonomyType(pv.getAssignedPatientLocation().getBuilding().getValue(), TaxonomyType.PAS);
		LocSiteShortVo loc = orgLoc.getLocSiteShortByTaxonomyType(pv.getAssignedPatientLocation().getBuilding().getValue(), providerSystem.getCodeSystem()); //WDEV-20278
		LocSiteRefVo orderingHospRef = new LocSiteRefVo();
		if (loc!=null)
		{
			orderingHospRef.setID_Location(loc.getBoId());
			careContext.setOrderingHospital(orderingHospRef);
		}

		
		CareContextVoCollection careContexts=new CareContextVoCollection();
		careContexts.add(careContext);
		episode.setCareContexts(careContexts);
		careSpell.setEpisodes(episodes);
		
		return careSpell;
		
	}
	
	public PasEventVo saveCareSpell(CareSpellVo careSpell) throws StaleObjectException, HL7Exception
	{
		String [] errors = careSpell.validate();
		if (errors != null)
		{
			throw new HL7Exception("Validation of CareSpell failed. " + VoMapper.toDisplayString(errors));				
		}
		careSpell = careSpellDialog.saveCareSpell(careSpell);
		
		// wdev-4752
		setCareContextContext(careSpell.getEpisodes().get(0).getCareContexts().get(0).getID_CareContext(),careSpell.getEpisodes().get(0).getID_EpisodeOfCare());
		
		return careSpell.getEpisodes().get(0).getCareContexts().get(0).getPasEvent(); 
	}
	
	
	

	private void setPatientContext(int patientId)
	{
		IContextSetter ctxSet = getSessionContext();
		ctxSet.setPatient(patientId);
	}
	private void clearPatientContext()
	{
		SessionData sessData = (SessionData) sess.getAttribute(SessionConstants.SESSION_DATA);
		Context ctx = (Context) sessData.context.get();
		if (ctx == null)
		{
			ctx = new Context(sess);
			sessData.context.set(ctx);
		}
		ctx.put(ContextQueryItem.PATIENT.getKey(), null);
	}
	
	protected void setCareContextContext(int careContextId, int episodeOfCareId)
	{
		IContextSetter ctxSet = getSessionContext();
		ctxSet.setEpisodeOfCare(episodeOfCareId);
		ctxSet.setCareContext(careContextId);
		
	}
	
	private IContextSetter getSessionContext()
	{
		SessionData sessData = (SessionData) sess.getAttribute(SessionConstants.SESSION_DATA);
		Context ctx = (Context) sessData.context.get();
		if (ctx == null)
		{
			ctx = new Context(sess);
			sessData.context.set(ctx);
		}
		ContextSetterFactory setf = new ContextSetterFactory(sess,ctx);
		return (setf.getContextSetter());
	}
	
	public PasEventVo createCareContext(Patient patVo, PV1 pv, PasEventVo pas,ProviderSystemVo providerSystem) throws Exception 
	{	
		
		try 
		{
			fillPasEventFromPV1(pv, pas, getOrgLoc(), getHcpAdmin(),providerSystem);
			pas.setPatient(patVo);
		} 
		catch (StaleObjectException e) 
		{
			throw new HL7Exception(e.getMessage(), e);
		}
		CareContextVo careContext=new CareContextVo();
		ContextType context=new ContextType();
		if (pv.getPatientClass().getValue().equals("I"))
		{
			context = ContextType.INPATIENT;
			pas.setEventType(ims.core.vo.lookups.PasEventType.INPATIENT);
		}
		else if (pv.getPatientClass().getValue().equals("O"))
		{
			context = ContextType.OUTPATIENT;
			pas.setEventType(ims.core.vo.lookups.PasEventType.OUTPATIENT);
		}
		else if(pv.getPatientClass().getValue().equals("P"))
		{
			context = ContextType.TCI;
			pas.setEventType(ims.core.vo.lookups.PasEventType.TCI);
		}
		else
		{
			context = ContextType.GHGSURGERY;
		}
		careContext.setContext(context);
		careContext.setStartDateTime(pas.getEventDateTime());
		careContext.setPasEvent(pas);
		
		//WDEV-10231
		careContext.setCurrentStatus(new CareContextStatusHistoryVo());
		careContext.getCurrentStatus().setStatus(CareContextStatus.OPEN);
		careContext.getCurrentStatus().setStatusDateTime(pas.getEventDateTime());
		
		//WDEV-20278
//		LocSiteShortVo loc = orgLoc.getLocSiteShortByTaxonomyType(pv.getAssignedPatientLocation().getBuilding().getValue(), TaxonomyType.PAS);
		LocSiteShortVo loc = orgLoc.getLocSiteShortByTaxonomyType(pv.getAssignedPatientLocation().getBuilding().getValue(), providerSystem.getCodeSystem()); //WDEV-20278
		LocSiteRefVo orderingHospRef = new LocSiteRefVo();
		if (loc!=null)
		{
			orderingHospRef.setID_Location(loc.getBoId());
			careContext.setOrderingHospital(orderingHospRef);
		}
		
		EpisodeofCareLiteVo episode = careSpellDialog.getEpisodeOfCare(pas.getPasEpisodeId());
		CareContextVo careContextSave=null;
		if (episode!=null)
		{
			careContext.setEpisodeOfCare(episode);

			try 
			{
				String [] errors = careContext.validate();
				if (errors != null)
				{
					throw new HL7Exception("Validation of Care Context failed. " + VoMapper.toDisplayString(errors));				
				}
				careContextSave = careSpellDialog.saveCareContext(careContext);
			} 
			catch (StaleObjectException e) 
			{
				throw new HL7Exception(e.getMessage());
			}
		
		}
		else
		{
			// wdev-7705 - create the carespell at this stage if required
			//WDEV-20278
//			CareSpellVo careSpell=createCareSpellVo(pas,pv);
			CareSpellVo careSpell = createCareSpellVo(pas, pv, providerSystem); //WDEV-20278
			String [] errors = careSpell.validate();
			if (errors != null)
			{
				throw new HL7Exception("Validation of Carespell failed. " + VoMapper.toDisplayString(errors));				
			}
			careSpell = careSpellDialog.saveCareSpell(careSpell);
			if (careSpell != null && careSpell.getEpisodes() != null && careSpell.getEpisodes().size() > 0 &&
					careSpell.getEpisodes().get(0).getCareContexts() != null && careSpell.getEpisodes().get(0).getCareContexts().size() > 0)
			{
				episode = careSpell.getEpisodes().get(0);
				careContextSave = careSpell.getEpisodes().get(0).getCareContexts().get(0);
			}
		}
		
		if (careContextSave != null && careContextSave.getID_CareContext()!=null && episode.getID_EpisodeOfCare()!=null)
		{	
			setCareContextContext(careContextSave.getID_CareContext(),episode.getID_EpisodeOfCare());
		}
		if (careContextSave != null)
			return careContextSave.getPasEvent();
		else
			return null;
	}


	public IRefManDomainHelper getRefManDomain() {
		return RefMandomain;
	}


	public void setRefManDomain(IRefManDomainHelper RefMandomain) {
		this.RefMandomain = RefMandomain;
	}

	public void setHL7TTO(HL7TTOIF hl7tto) {
		this.hl7tto=hl7tto;
	}

	//WDEV-19913
	protected void populateMSH(ProviderSystemVo proVo, MSH msh, String messageControlID,
			String messageType, String triggerEvent) throws DataTypeException, Exception
	{
		populateMSH(proVo,  msh,  messageControlID,messageType,  triggerEvent,DateTimeFormat.MILLI);
	}

	//WDEV-19913
	protected void populateMSH(ProviderSystemVo proVo, MSH msh, String messageControlID,
			String messageType, String triggerEvent,DateTimeFormat format) throws DataTypeException, Exception 
	{
		LOG.debug("VoMapper populateMSH: entry");
		renderDateTimeVoToTS(new DateTime(), msh.getDateTimeOfMessage(),format);//WDEV-19913

		String receivingFacility=null;
		ConfigPropertyVo prop = proVo.getConfigurationProperty(ConfigItems.Hl7Facility);
		if (prop != null)
		{
			receivingFacility = prop.getPropertyValue();
		}
		if (receivingFacility == null)
			receivingFacility = cfg.getReceivingFacility();

		String processingId=null;
		ConfigPropertyVo hl7Prop = proVo.getConfigurationProperty(ConfigItems.ProcessingID);
		if (hl7Prop != null)
		{
			processingId=hl7Prop.getPropertyValue();
		}
		if (processingId == null)
			processingId = cfg.getProcessingId();

		msh.getSendingApplication().getNamespaceID().setValue(cfg.getSendApplication());	
		msh.getSendingFacility().getNamespaceID().setValue(cfg.getSendFacility()); 
		msh.getFieldSeparator().setValue("|");  
		msh.getEncodingCharacters().setValue("^~\\&");
		msh.getReceivingFacility().getNamespaceID().setValue(receivingFacility);
		msh.getReceivingApplication().getNamespaceID().setValue(proVo.getHl7Application());
		msh.getVersionID().getVersionID().setValue("2.4");
		msh.getMessageType().getMessageType().setValue(messageType);
		msh.getMessageType().getTriggerEvent().setValue(triggerEvent);
		msh.getProcessingID().getProcessingID().setValue(processingId);  // Debug / Production / Training
		msh.getMessageControlID().setValue(messageControlID);
		//		order.getMSH().getMessageControlID().setValue(new String() + new java.util.Date().getTime());
		LOG.debug("VoMapper populateMSH: exit");

	}
	protected void populateEVN(EVN evn,String eventType) throws Exception
	{
		evn.getEventTypeCode().setValue(eventType);
		renderDateTimeVoToTS(new DateTime(), evn.getRecordedDateTime());
	}


	protected IfOrderInvestigationVo getInvFromOrderVoAndMessage(IfOutOcsOrderVo orderVo, OrderInvestigationRefVo invRef)
			throws Exception {
				IfOrderInvestigationVoCollection invColl= orderVo.getInvestigations();
				IfOrderInvestigationVo invVo=null;
				for (int i=0;i<invColl.size();i++)
				{
					invVo=invColl.get(i);
					if(invRef.getBoId().equals(invVo.getBoId()))
					{
						return invVo;
					}
				}
				throw new Exception("Could not find Investigation for Ref: "+invRef+" in Order:"
						+orderVo.toString());
			}


	public Allergies getAllergy() {
		return allergy;
	}

	public void setAllergy(Allergies allergy) {
		this.allergy = allergy;
	}
	
	public ClinicalCoding getAllergen() {
		return allergen;
	}


	public void setAllergen(ClinicalCoding allergen) {
		this.allergen = allergen;
	}
	
	/** WDEV-13901
	 * Method created to validate the CareContext and EpisodeOfCare to see if modifications
	 * made to ResponsibleHcp in either and Specialty in EpisodeOfCare.  If so, need to
	 * create a history record with the original values.
	 * @param careContext
	 * @throws HL7Exception 
	 * @throws StaleObjectException 
	 */
	protected CareContextInterfaceVo createHistoryCareContextAndEpis(CareContextInterfaceVo careContext, boolean saveCC, PV1 pv1, String externalType) throws HL7Exception, StaleObjectException 
	{
		HcpRefVo oldEpisHcp = careContext.getEpisodeOfCare().getResponsibleHCP();
		HcpRefVo oldCCHcp =  careContext.getResponsibleHCP();
		Specialty oldSpecialty = careContext.getEpisodeOfCare().getSpecialty();
		
		LookupInstVo newSpec =  svc.getLocalLookup(Specialty.class, Specialty.TYPE_ID, externalType, pv1.getHospitalService().getValue());
		
		HcpLiteVo medic = hcpAdmin.getHcpLiteByExternalCode(TaxonomyType.NAT_CONS_CODE, pv1.getConsultingDoctor(0).getIDNumber().getValue());
		//JME: 20061016: McKesson are sending the consultant in PV1.17 (Admitting Doctor)
		if (medic == null)
		{
			// Check to see if the pas code has been specified in second repetition of consulting doctor, try this if found
			String pasCode = pv1.getConsultingDoctor(1).getIDNumber().getValue();
			if (pasCode != null)
				medic = hcpAdmin.getHcpLiteByExternalCode(TaxonomyType.PAS,pasCode);
			
			if (medic == null)  // wdev-3115
				medic = hcpAdmin.getHcpLiteByExternalCode(TaxonomyType.NAT_CONS_CODE,pv1.getAdmittingDoctor(0).getIDNumber().getValue());
		}

		// WDEV-13901 If ResponsibleHCP modified in CareContext, create a history record
		if ((medic != null && oldCCHcp!=null && medic.getID_Hcp().intValue() != oldCCHcp.getID_Hcp().intValue())
				||(medic != null && oldCCHcp==null)) //WDEV-14587 
		{
			CareContextHistoryVo history = new CareContextHistoryVo();
			history.setContext(careContext.getContext());
			history.setBedNumber(careContext.getBedNumber());
			history.setEndDateTime(careContext.getEndDateTime());
			history.setLocationType(careContext.getLocationType());
			if (careContext.getPasEventIsNotNull())
				history.setPasEventId(careContext.getPasEvent().getPasEventId());
			if(oldCCHcp!=null) //WDEV-14587 
			{
				history.setResponsibleHCP(hcpAdmin.getHcpLite(new HcpFilter(oldCCHcp.getID_Hcp(), oldCCHcp.getVersion_Hcp())));
			}
			history.setStartDateTime(careContext.getStartDateTime());
			
			if (!careContext.getCareContextHistoryIsNotNull())
				careContext.setCareContextHistory(new CareContextHistoryVoCollection());
			careContext.getCareContextHistory().add(history);
			
			// Set the new value within careContext
			careContext.setResponsibleHCP(medic);
		}
		
		// WDEV-13901 - Check EpisodeOfCare too, if hcp or specialty modified, create a history record
		EpisodeOfCareInterfaceVo voEpis = careContext.getEpisodeOfCare();
		if (voEpis != null)
		{
			if ((oldEpisHcp != null && medic != null && oldEpisHcp.getID_Hcp().intValue() != medic.getID_Hcp().intValue()) ||
				(oldSpecialty != null && newSpec != null && oldSpecialty.getID() != newSpec.getID()))
			{
				EpisodeOfCareHistoryVo episHist = new EpisodeOfCareHistoryVo();
				episHist.setEndDate(voEpis.getEndDate());
				episHist.setRelationship(voEpis.getRelationship());
				episHist.setResponsibleHCP(voEpis.getResponsibleHCP());
				episHist.setSpecialty(voEpis.getSpecialty());
				episHist.setStartDate(voEpis.getStartDate());
				
				if (!voEpis.getEpisodeOfCareHistoryIsNotNull())
					voEpis.setEpisodeOfCareHistory(new EpisodeOfCareHistoryVoCollection());
				voEpis.getEpisodeOfCareHistory().add(episHist);
				
				// Set the new value within voEpis
				voEpis.setSpecialty(new Specialty(newSpec.getID()));
				voEpis.setResponsibleHCP(medic);
				
				String [] errors = voEpis.validate();
				if (errors != null)
				{
					throw new HL7Exception("Validation of EpisodeOfCare failed. " + VoMapper.toDisplayString(errors));				
				}
				try 
				{
					voEpis = careSpellDialog.saveEpisodeOfCare(voEpis);
					careContext.setEpisodeOfCare(voEpis);
				}
				catch (StaleObjectException e) 
				{
					e.printStackTrace();
					throw e;
				}
			}
		}

		if (saveCC)
		{
			String [] errors = careContext.validate();
			if (errors != null)
			{
				throw new HL7Exception("Validation of Care Context failed. " + VoMapper.toDisplayString(errors));				
			}
			try 
			{
				careContext = careSpellDialog.saveCareContext(careContext);
			}
			catch (StaleObjectException ex) 
			{
				ex.printStackTrace();
				throw ex;
			}
		}
		
		return careContext;
	}
	
	
	protected void renderPatientLocationToPV1(LocShortMappingsVo loc, ClinicLiteVo clinic,LocShortMappingsVo opd ,PV1 pv, ProviderSystemVo providerSystem) throws DataTypeException
	{
		LOG.debug("O01VoMapper renderPatientLocationToPV1: entry");

		// PV1-1   Set ID 
		pv.getSetIDPV1().setValue("1");		
		
		//PV1-2   Patient class   - Required
		pv.getPatientClass().setValue("U"); 

		PL pl = pv.getAssignedPatientLocation();		
		if (loc != null)
		{
			pl.getLocationDescription().setValue(loc.getName());
			TaxonomyMap map = loc.getTaxonomyMap(providerSystem.getCodeSystem());
			//http://jira/browse/WDEV-5693
			if (map != null)				
				pl.getPointOfCare().setValue(map.getTaxonomyCode());
			if (loc.getType().equals(LocationType.WARD))
				pv.getPatientClass().setValue("I");
			//http://jira/browse/WDEV-11637 populate the facility
			String facilityCode = orgLoc.getActiveHospitalCodeForLoc(loc, providerSystem.getCodeSystem());
			if(facilityCode!=null)
				pl.getFacility().getNamespaceID().setValue(facilityCode);
			else
				LOG.warn("Mapping for location - Facility not found :"+loc.getName());
		}
		else if (clinic != null)
		{
			//WDEV-6828 - if GenericClinicCode config item is valued use it
			ConfigPropertyVo prop= providerSystem.getConfigurationProperty(ConfigItems.GenericClinicCode);
			
			if (prop != null && (prop.getPropertyValue().length() > 0))
				pl.getPointOfCare().setValue(prop.getPropertyValue());
			else		
			{
				pl.getLocationDescription().setValue(clinic.getClinicName());
				//http://jira/browse/WDEV-5693
				if(clinic.getCodeMappings().size()>0)
					pl.getPointOfCare().setValue(clinic.getMapping(providerSystem.getCodeSystem() ));
					String facilityCode = orgLoc.getActiveHospitalCodeForClinic(clinic, providerSystem.getCodeSystem());
					if(facilityCode!=null)
						pl.getFacility().getNamespaceID().setValue(facilityCode);
					else
						LOG.warn("Mapping for Clinic - Facility not found :"+clinic.getClinicName());
					//pl.getPointOfCare().setValue(clinic.getMapping()   getCodeMappings().  get(0).getTaxonomyCode());
					
					//http://jira/browse/WDEV-11909
					if (clinic.getOutpatientDeptIsNotNull()&&
							clinic.getOutpatientDept().getCodeMappingsIsNotNull())
					{
						pl.getBuilding().setValue(clinic.getOutpatientDept().getCodeMappings().getMappingValue(providerSystem.getCodeSystem()));
					}
			}
			pv.getPatientClass().setValue("O");
		}
		else if (opd!=null) //WDEV-14269
		{
			pl.getLocationDescription().setValue(opd.getName());
			TaxonomyMap map = opd.getTaxonomyMap(providerSystem.getCodeSystem());
			if (map != null)				
				pl.getBuilding().setValue(map.getTaxonomyCode());
			String facilityCode = orgLoc.getActiveHospitalCodeForLoc(opd, providerSystem.getCodeSystem());
			if(facilityCode!=null)
				pl.getFacility().getNamespaceID().setValue(facilityCode);
			else
				LOG.warn("Mapping for location - Facility not found :"+opd.getName());
			pv.getPatientClass().setValue("O");
		}
		LOG.debug("O01VoMapper renderPatientLocationToPV1: exit");
	}

	
	protected void renderGPDetailsToPD1(Patient patient, PD1 pd1) throws Exception
	{
		String gpCode=null;
		if(patient.getGpIsNotNull()&&patient.getGp().getCodeMappingsIsNotNull())
		{
			gpCode=patient.getGp().getNationalCode();
			pd1.getPatientPrimaryCareProviderNameIDNo(0).getIDNumber().setValue(gpCode);
		}
		if(patient.getGpIsNotNull()&&patient.getGp().getNameIsNotNull()&&patient.getGpIsNotNull()&&patient.getGp().getName().getSurnameIsNotNull())
		{
			pd1.getPatientPrimaryCareProviderNameIDNo(0).getFamilyName().getSurname().setValue(patient.getGp().getName().getSurname()); //
		}
		if(patient.getGpIsNotNull()&&patient.getGp().getNameIsNotNull()&&patient.getGpIsNotNull()&&patient.getGp().getName().getForenameIsNotNull())
		{
			pd1.getPatientPrimaryCareProviderNameIDNo(0).getGivenName().setValue(patient.getGp().getName().getForename());
		}
		
		//WDEV-20243
		//PD1-3 Patient primary facility (XON)
	//		if(patient.getGpSurgeryIsNotNull())
	//		{
	//			String practiceCode = orgLoc.getPracticeNationalCodeForSurgery(patient.getGpSurgery());
	//			if(practiceCode != null)
	//			{
	//				pd1.getPatientPrimaryFacility(0).getOrganizationName().setValue(practiceCode);
	//			}
	//		}
		
		
		if(patient.getGpSurgeryIsNotNull())
		{
			String practiceCode = orgLoc.getPracticeNationalCodeForSurgery(patient.getGpSurgery());
			if(practiceCode != null)
			{
				pd1.getPatientPrimaryFacility(0).getOrganizationName().setValue(practiceCode);
			}
		}
		else if(patient.getPractice() != null
				&& patient.getPractice().getNationalLocCode() != null)
		{
			pd1.getPatientPrimaryFacility(0).getOrganizationName().setValue(patient.getPractice().getNationalLocCode());
		} //WDEV-20243
	
		//WDEV-19704 (CCG Code)
		if(patient.getPractice() != null
				&& patient.getPractice().getPctCode() != null)
		{
			pd1.getPatientPrimaryFacility(0).getAssigningAuthority().getNamespaceID().setValue(patient.getPractice().getPctCode());
		}
			
	}


	//WDEV-20993
	protected void renderGPDetailsToPD1(Patient patient, PD1 pd1, ProviderSystemVo providerSystem) throws Exception
	{
		if (patient.getGpIsNotNull())
		{
			//WDEV-21000
			if (ConfigFlag.HL7.USE_CONFIGURED_TAXONOMYTYPES_FOR_XCN.getValue())
			{
				renderGpShortVoToPatientPrimaryCareProviderIDNo(patient.getGp(), pd1, providerSystem);
			}
			else
			{
				renderGpShortVoToXCN(patient.getGp(), pd1.getPatientPrimaryCareProviderNameIDNo(0), providerSystem);
			}
		}

		
		//PD1-3 Patient Primary Facilty (XON)
		if (patient.getGpSurgeryIsNotNull())
		{
			String practiceCode = orgLoc.getPracticeNationalCodeForSurgery(patient.getGpSurgery());
			if (practiceCode != null)
			{
				//PD1-3-1 Organization name (ST)
				pd1.getPatientPrimaryFacility(0).getOrganizationName().setValue(practiceCode);
			}
		}
		else if (patient.getPractice() != null
				&& patient.getPractice().getNationalLocCode() != null)
		{
			//PD1-3-1 Organization name (ST)
			pd1.getPatientPrimaryFacility(0).getOrganizationName().setValue(patient.getPractice().getNationalLocCode());
		}
	
		if (patient.getPractice() != null
				&& patient.getPractice().getPctCode() != null)
		{
			//PD1-3-6 Assiging Authority (HD)
			pd1.getPatientPrimaryFacility(0).getAssigningAuthority().getNamespaceID().setValue(patient.getPractice().getPctCode());
		}
		
		//WDEV-20993
		ConfigItems[] providerSystemConfigItems = toConfigItemArray(providerSystem.getConfigItems());
		String practiceNameInPD1 = HL7Utils.getConfigItem(providerSystemConfigItems, ConfigItems.PracticeNameInPD1);
		if (practiceNameInPD1 != null 
				&& (practiceNameInPD1.equalsIgnoreCase("TRUE") || practiceNameInPD1.equalsIgnoreCase("YES")))
		{
			if (patient.getPracticeIsNotNull())
			{
				if (patient.getPractice().getNameIsNotNull())
				{
					//PD1-3-1 Organization name (ST)
					pd1.getPatientPrimaryFacility(0).getOrganizationName().setValue(patient.getPractice().getName());					
				}
				
				if (patient.getPractice().getNationalLocCode() != null)
				{
					// PD1-3-9 Name representation code (ID)
					pd1.getPatientPrimaryFacility(0).getNameRepresentationCode().setValue(patient.getPractice().getNationalLocCode());
				}
			}
		}

	}

	
	private void demographicCheck(Patient patVo,PID pid,ProviderSystemVo providerSystem) throws HL7Exception
	{
		String dbForename=null,dbSurname=null,msgForename=null,msgSurname=null;
		Sex dbSex=null,msgSex=null;
		PartialDate dbDob=null,msgDob=null;
		
		if(patVo!=null&&patVo.getNameIsNotNull())
		{
			dbForename=patVo.getName().getForename();
			dbSurname=patVo.getName().getSurname();
		}
		dbSex=patVo.getSex();
		dbDob=patVo.getDob();
		

		//Sex
		String sexCode = pid.getAdministrativeSex().getValue();
		if (sexCode != null&&!sexCode.equals(Hl7Null))
		{
			msgSex=(Sex) svc.getLocalLookup(Sex.class, Sex.TYPE_ID, providerSystem.getCodeSystem().getText(), sexCode);				
		}
		
		
		//DOB
		String dob = pid.getDateTimeOfBirth().getTimeOfAnEvent().getValue();
		if (dob != null&&!dob.equals(Hl7Null)&& dob.length() > 4)
		{
				msgDob=new PartialDate(dob);
		}
		
		XPN xpn = pid.getPatientName(0);
		
		String surname = xpn.getFamilyName().getSurname().getValue();
		if (surname != null && !surname.equals(Hl7Null))
			msgSurname=surname;

		String forename = xpn.getGivenName().getValue();
		if (forename != null && !forename.equals(Hl7Null))
			msgForename=forename;
		
		if ((msgSurname != null && dbSurname == null) || (msgSurname == null && dbSurname != null) || (msgSurname != null && dbSurname != null && !msgSurname.equalsIgnoreCase(dbSurname)))
		{
			throw new HL7Exception("Demographics Mismatch on Patient Surname");
		}
		if ((msgForename != null && dbForename == null) || (msgForename == null && dbForename != null) || (msgForename != null && dbForename != null && !msgForename.equalsIgnoreCase(dbForename))) 
		{
			throw new HL7Exception("Demographics Mismatch on Patient Forename");
		}
		if ((msgDob != null && dbDob == null) || (msgDob == null && dbDob != null) || (msgDob != null && dbDob != null && !msgDob.equals(dbDob))) 
		{
				throw new HL7Exception("Demographics Mismatch on Patient Date of Birth");
		}
		if ((msgSex != null && dbSex == null) || (msgSex == null && dbSex != null) || (msgSex != null && dbSex != null && !msgSex.equals(dbSex))) 
		{
				throw new HL7Exception("Demographics Mismatch on Patient gender");
		}
	}
	
	
	
	//WDEV-21000
	protected final void renderMemberOfStaffShortVoToAttendingDoctor(MemberOfStaffShortVo mos, PV1 pv1, ProviderSystemVo providerSystem) throws HL7Exception
	{
		LOG.debug("VoMapper renderMemberOfStaffShortVoToAttendingDoctor: entry");

		int xcnCount = 0;
		
		if (mos != null)
		{

			if (mos.getCodeMappings() != null)
			{
				for (int i = 0; i < mos.getCodeMappings().size(); i++)
				{
					ims.core.vo.TaxonomyMap map = mos.getCodeMappings().get(i);
	
					/* 
					 * First check to see if the code is defined as a  valid Taxonomy Type for provider system
					 * If it isn't, then skip this code mapping 
					 */
	
					TaxonomyType taxonomyType = map.getTaxonomyName();
					if (taxonomyType != null)
					{
						String taxTypeText = svc.getRemoteLookup(taxonomyType.getID(), providerSystem.getCodeSystem().getText());
						if (taxTypeText != null)
						{
							/* 
							 * This code mapping has a valid taxonomy type defined for the provider system
							 */
							
							//XCN.0 ID Number (ST)
							pv1.getAttendingDoctor(xcnCount).getIDNumber().setValue(map.getTaxonomyCode());
							if (mos.getNameIsNotNull())
							{
								//XCN.1 Family name (ST)
								if (mos.getName().getSurnameIsNotNull())
									pv1.getAttendingDoctor(xcnCount).getFamilyName().getSurname().setValue(mos.getName().getSurname().toString());
								//XCN.2 Given name (ST)
								if (mos.getName().getForenameIsNotNull())
									pv1.getAttendingDoctor(xcnCount).getGivenName().setValue(mos.getName().getForename().toString());
								//XCN.3 Second and further names (ST)
								if (mos.getName().getMiddleNameIsNotNull())
									pv1.getAttendingDoctor(xcnCount).getSecondAndFurtherGivenNamesOrInitialsThereof().setValue(mos.getName().getMiddleName().toString());
								//XCN.5 Prefix (ST)
								if (mos.getName().getTitleIsNotNull())
									pv1.getAttendingDoctor(xcnCount).getPrefixEgDR().setValue(mos.getName().getTitle().toString());
							}
							//XCN.9 Assigning authority (HD)
							pv1.getAttendingDoctor(xcnCount).getAssigningAuthority().getNamespaceID().setValue(map.getTaxonomyName().toString());
							//XCN.10 Name type code (ID)
							pv1.getAttendingDoctor(xcnCount).getNameTypeCode().setValue(taxTypeText);
							
							xcnCount ++;
						}
					}
				}
				
				if (xcnCount == 0)
				{
					if (mos.getNameIsNotNull())
					{
						//XCN.1 Family name (ST)
						if (mos.getName().getSurnameIsNotNull())
							pv1.getAttendingDoctor(xcnCount).getFamilyName().getSurname().setValue(mos.getName().getSurname().toString());
						//XCN.2 Given name (ST)
						if (mos.getName().getForenameIsNotNull())
							pv1.getAttendingDoctor(xcnCount).getGivenName().setValue(mos.getName().getForename().toString());
						//XCN.3 Second and further names (ST)
						if (mos.getName().getMiddleNameIsNotNull())
							pv1.getAttendingDoctor(xcnCount).getSecondAndFurtherGivenNamesOrInitialsThereof().setValue(mos.getName().getMiddleName().toString());
						//XCN.5 Prefix (ST)
						if (mos.getName().getTitleIsNotNull())
							pv1.getAttendingDoctor(xcnCount).getPrefixEgDR().setValue(mos.getName().getTitle().toString());
					}
				}
	
			}
		}
		
		LOG.debug("VoMapper renderMemberOfStaffShortVoToAttendingDoctor: exit");
	}


	//WDEV-21000
	protected final void renderMemberOfStaffShortVoToReferringDoctor(MemberOfStaffShortVo mos, PV1 pv1, ProviderSystemVo providerSystem) throws HL7Exception
	{
		LOG.debug("VoMapper renderMemberOfStaffShortVoToReferringDoctor: entry");

		int xcnCount = 0;
		
		if (mos != null)
		{
			
			if (mos.getCodeMappings() != null)
			{
				for (int i = 0; i < mos.getCodeMappings().size(); i++)
				{
					ims.core.vo.TaxonomyMap map = mos.getCodeMappings().get(i);
	
					/* 
					 * First check to see if the code is defined as a  valid Taxonomy Type for provider system
					 * If it isn't, then skip this code mapping 
					 */
	
					TaxonomyType taxonomyType = map.getTaxonomyName();
					if (taxonomyType != null)
					{
						String taxTypeText = svc.getRemoteLookup(taxonomyType.getID(), providerSystem.getCodeSystem().getText());
						if (taxTypeText != null)
						{
							/* 
							 * This code mapping has a valid taxonomy type defined for the provider system
							 */
							
							//XCN.0 ID Number (ST)
							pv1.getReferringDoctor(xcnCount).getIDNumber().setValue(map.getTaxonomyCode());
							if (mos.getNameIsNotNull())
							{
								//XCN.1 Family name (ST)
								if (mos.getName().getSurnameIsNotNull())
									pv1.getReferringDoctor(xcnCount).getFamilyName().getSurname().setValue(mos.getName().getSurname().toString());
								//XCN.2 Given name (ST)
								if (mos.getName().getForenameIsNotNull())
									pv1.getReferringDoctor(xcnCount).getGivenName().setValue(mos.getName().getForename().toString());
								//XCN.3 Second and further names (ST)
								if (mos.getName().getMiddleNameIsNotNull())
									pv1.getReferringDoctor(xcnCount).getSecondAndFurtherGivenNamesOrInitialsThereof().setValue(mos.getName().getMiddleName().toString());
								//XCN.5 Prefix (ST)
								if (mos.getName().getTitleIsNotNull())
									pv1.getReferringDoctor(xcnCount).getPrefixEgDR().setValue(mos.getName().getTitle().toString());
							}
							//XCN.9 Assigning authority (HD)
							pv1.getReferringDoctor(xcnCount).getAssigningAuthority().getNamespaceID().setValue(map.getTaxonomyName().toString());
							//XCN.10 Name type code (ID)
							pv1.getReferringDoctor(xcnCount).getNameTypeCode().setValue(taxTypeText);
							
							xcnCount ++;
						}
					}
				}
			}
				
			if (xcnCount == 0)
			{
				if (mos.getNameIsNotNull())
				{
					//XCN.1 Family name (ST)
					if (mos.getName().getSurnameIsNotNull())
						pv1.getReferringDoctor(xcnCount).getFamilyName().getSurname().setValue(mos.getName().getSurname().toString());
					//XCN.2 Given name (ST)
					if (mos.getName().getForenameIsNotNull())
						pv1.getReferringDoctor(xcnCount).getGivenName().setValue(mos.getName().getForename().toString());
					//XCN.3 Second and further names (ST)
					if (mos.getName().getMiddleNameIsNotNull())
						pv1.getReferringDoctor(xcnCount).getSecondAndFurtherGivenNamesOrInitialsThereof().setValue(mos.getName().getMiddleName().toString());
					//XCN.5 Prefix (ST)
					if (mos.getName().getTitleIsNotNull())
						pv1.getReferringDoctor(xcnCount).getPrefixEgDR().setValue(mos.getName().getTitle().toString());
				}
			}

		}
		
		LOG.debug("VoMapper renderMemberOfStaffShortVoToReferringDoctor: exit");
	}


	//WDEV-21000
	protected final void renderMemberOfStaffShortVoToConsultingDoctor(MemberOfStaffShortVo mos, PV1 pv1, ProviderSystemVo providerSystem) throws HL7Exception
	{
		LOG.debug("VoMapper renderMemberOfStaffShortVoToConsultingDoctor: entry");

		int xcnCount = 0;
		
		if (mos != null)
		{
			if (mos.getCodeMappings() != null)
			{
				for (int i = 0; i < mos.getCodeMappings().size(); i++)
				{
					ims.core.vo.TaxonomyMap map = mos.getCodeMappings().get(i);
	
					/* 
					 * First check to see if the code is defined as a  valid Taxonomy Type for provider system
					 * If it isn't, then skip this code mapping 
					 */
	
					TaxonomyType taxonomyType = map.getTaxonomyName();
					if (taxonomyType != null)
					{
						String taxTypeText = svc.getRemoteLookup(taxonomyType.getID(), providerSystem.getCodeSystem().getText());
						if (taxTypeText != null)
						{
							/* 
							 * This code mapping has a valid taxonomy type defined for the provider system
							 */
							
							//XCN.0 ID Number (ST)
							pv1.getConsultingDoctor(xcnCount).getIDNumber().setValue(map.getTaxonomyCode());
							if (mos.getNameIsNotNull())
							{
								//XCN.1 Family name (ST)
								if (mos.getName().getSurnameIsNotNull())
									pv1.getConsultingDoctor(xcnCount).getFamilyName().getSurname().setValue(mos.getName().getSurname().toString());
								//XCN.2 Given name (ST)
								if (mos.getName().getForenameIsNotNull())
									pv1.getConsultingDoctor(xcnCount).getGivenName().setValue(mos.getName().getForename().toString());
								//XCN.3 Second and further names (ST)
								if (mos.getName().getMiddleNameIsNotNull())
									pv1.getConsultingDoctor(xcnCount).getSecondAndFurtherGivenNamesOrInitialsThereof().setValue(mos.getName().getMiddleName().toString());
								//XCN.5 Prefix (ST)
								if (mos.getName().getTitleIsNotNull())
									pv1.getConsultingDoctor(xcnCount).getPrefixEgDR().setValue(mos.getName().getTitle().toString());
							}
							//XCN.9 Assigning authority (HD)
							pv1.getConsultingDoctor(xcnCount).getAssigningAuthority().getNamespaceID().setValue(map.getTaxonomyName().toString());
							//XCN.10 Name type code (ID)
							pv1.getConsultingDoctor(xcnCount).getNameTypeCode().setValue(taxTypeText);
							
							xcnCount ++;
						}
					}
				}
			}
			
			if (xcnCount == 0)
			{
				if (mos.getNameIsNotNull())
				{
					//XCN.1 Family name (ST)
					if (mos.getName().getSurnameIsNotNull())
						pv1.getConsultingDoctor(xcnCount).getFamilyName().getSurname().setValue(mos.getName().getSurname().toString());
					//XCN.2 Given name (ST)
					if (mos.getName().getForenameIsNotNull())
						pv1.getConsultingDoctor(xcnCount).getGivenName().setValue(mos.getName().getForename().toString());
					//XCN.3 Second and further names (ST)
					if (mos.getName().getMiddleNameIsNotNull())
						pv1.getConsultingDoctor(xcnCount).getSecondAndFurtherGivenNamesOrInitialsThereof().setValue(mos.getName().getMiddleName().toString());
					//XCN.5 Prefix (ST)
					if (mos.getName().getTitleIsNotNull())
						pv1.getConsultingDoctor(xcnCount).getPrefixEgDR().setValue(mos.getName().getTitle().toString());
				}
			}

		}

		LOG.debug("VoMapper renderMemberOfStaffShortVoToConsultingDoctor: exit");
	}

	
	//WDEV-21000
	protected final void renderGpLiteVoToAttendingDoctor(GpLiteVo gp, PV1 pv1, ProviderSystemVo providerSystem) throws HL7Exception
	{
		LOG.debug("VoMapper renderGpLiteVoToAttendingDoctor: entry");

		int xcnCount = 0;
		
		if (gp != null)
		{
			if (gp.getCodeMappings() != null)
			{
				for (int i = 0; i < gp.getCodeMappings().size(); i++)
				{
					ims.core.vo.TaxonomyMap map = gp.getCodeMappings().get(i);
	
					/* 
					 * First check to see if the code is defined as a  valid Taxonomy Type for provider system
					 * If it isn't, then skip this code mapping 
					 */
	
					TaxonomyType taxonomyType = map.getTaxonomyName();
					if (taxonomyType != null)
					{
						String taxTypeText = svc.getRemoteLookup(taxonomyType.getID(), providerSystem.getCodeSystem().getText());
						if (taxTypeText != null)
						{
							/* 
							 * This code mapping has a valid taxonomy type defined for the provider system
							 */
							
							//XCN.0 ID Number (ST)
							pv1.getAttendingDoctor(xcnCount).getIDNumber().setValue(map.getTaxonomyCode());
							if (gp.getNameIsNotNull())
							{
								//XCN.1 Family name (ST)
								if (gp.getName().getSurnameIsNotNull())
									pv1.getAttendingDoctor(xcnCount).getFamilyName().getSurname().setValue(gp.getName().getSurname().toString());
								//XCN.2 Given name (ST)
								if (gp.getName().getForenameIsNotNull())
									pv1.getAttendingDoctor(xcnCount).getGivenName().setValue(gp.getName().getForename().toString());
								//XCN.3 Second and further names (ST)
								if (gp.getName().getMiddleNameIsNotNull())
									pv1.getAttendingDoctor(xcnCount).getSecondAndFurtherGivenNamesOrInitialsThereof().setValue(gp.getName().getMiddleName().toString());
								//XCN.5 Prefix (ST)
								if (gp.getName().getTitleIsNotNull())
									pv1.getAttendingDoctor(xcnCount).getPrefixEgDR().setValue(gp.getName().getTitle().toString());
							}
							//XCN.9 Assigning authority (HD)
							pv1.getAttendingDoctor(xcnCount).getAssigningAuthority().getNamespaceID().setValue(map.getTaxonomyName().toString());
							//XCN.10 Name type code (ID)
							pv1.getAttendingDoctor(xcnCount).getNameTypeCode().setValue(taxTypeText);
							
							xcnCount ++;
						}
					}
				}
			}
				
			if (xcnCount == 0)
			{
				if (gp.getNameIsNotNull())
				{
					//XCN.1 Family name (ST)
					if (gp.getName().getSurnameIsNotNull())
						pv1.getAttendingDoctor(xcnCount).getFamilyName().getSurname().setValue(gp.getName().getSurname().toString());
					//XCN.2 Given name (ST)
					if (gp.getName().getForenameIsNotNull())
						pv1.getAttendingDoctor(xcnCount).getGivenName().setValue(gp.getName().getForename().toString());
					//XCN.3 Second and further names (ST)
					if (gp.getName().getMiddleNameIsNotNull())
						pv1.getAttendingDoctor(xcnCount).getSecondAndFurtherGivenNamesOrInitialsThereof().setValue(gp.getName().getMiddleName().toString());
					//XCN.5 Prefix (ST)
					if (gp.getName().getTitleIsNotNull())
						pv1.getAttendingDoctor(xcnCount).getPrefixEgDR().setValue(gp.getName().getTitle().toString());
				}
			}

		}
		
		LOG.debug("VoMapper renderGpLiteVoToAttendingDoctor: exit");
	}
	
	
	//WDEV-21000
	protected final void renderGpLiteVoToReferringDoctor(GpLiteVo gp, PV1 pv1, ProviderSystemVo providerSystem) throws HL7Exception
	{
		LOG.debug("VoMapper renderGpLiteVoToReferringDoctor: entry");

		int xcnCount = 0;
		
		if (gp != null)
		{
		
			if (gp.getCodeMappings() != null)
			{
				for (int i = 0; i < gp.getCodeMappings().size(); i++)
				{
					ims.core.vo.TaxonomyMap map = gp.getCodeMappings().get(i);
	
					/* 
					 * First check to see if the code is defined as a  valid Taxonomy Type for provider system
					 * If it isn't, then skip this code mapping 
					 */
	
					TaxonomyType taxonomyType = map.getTaxonomyName();
					if (taxonomyType != null)
					{
						String taxTypeText = svc.getRemoteLookup(taxonomyType.getID(), providerSystem.getCodeSystem().getText());
						if (taxTypeText != null)
						{
							/* 
							 * This code mapping has a valid taxonomy type defined for the provider system
							 */
							
							//XCN.0 ID Number (ST)
							pv1.getReferringDoctor(xcnCount).getIDNumber().setValue(map.getTaxonomyCode());
							if (gp.getNameIsNotNull())
							{
								//XCN.1 Family name (ST)
								if (gp.getName().getSurnameIsNotNull())
									pv1.getReferringDoctor(xcnCount).getFamilyName().getSurname().setValue(gp.getName().getSurname().toString());
								//XCN.2 Given name (ST)
								if (gp.getName().getForenameIsNotNull())
									pv1.getReferringDoctor(xcnCount).getGivenName().setValue(gp.getName().getForename().toString());
								//XCN.3 Second and further names (ST)
								if (gp.getName().getMiddleNameIsNotNull())
									pv1.getReferringDoctor(xcnCount).getSecondAndFurtherGivenNamesOrInitialsThereof().setValue(gp.getName().getMiddleName().toString());
								//XCN.5 Prefix (ST)
								if (gp.getName().getTitleIsNotNull())
									pv1.getReferringDoctor(xcnCount).getPrefixEgDR().setValue(gp.getName().getTitle().toString());
							}
							//XCN.9 Assigning authority (HD)
							pv1.getReferringDoctor(xcnCount).getAssigningAuthority().getNamespaceID().setValue(map.getTaxonomyName().toString());
							//XCN.10 Name type code (ID)
							pv1.getReferringDoctor(xcnCount).getNameTypeCode().setValue(taxTypeText);
							
							xcnCount ++;
						}
					}
				}
			}
			
			if (xcnCount == 0)
			{
				if (gp.getNameIsNotNull())
				{
					//XCN.1 Family name (ST)
					if (gp.getName().getSurnameIsNotNull())
						pv1.getReferringDoctor(xcnCount).getFamilyName().getSurname().setValue(gp.getName().getSurname().toString());
					//XCN.2 Given name (ST)
					if (gp.getName().getForenameIsNotNull())
						pv1.getReferringDoctor(xcnCount).getGivenName().setValue(gp.getName().getForename().toString());
					//XCN.3 Second and further names (ST)
					if (gp.getName().getMiddleNameIsNotNull())
						pv1.getReferringDoctor(xcnCount).getSecondAndFurtherGivenNamesOrInitialsThereof().setValue(gp.getName().getMiddleName().toString());
					//XCN.5 Prefix (ST)
					if (gp.getName().getTitleIsNotNull())
						pv1.getReferringDoctor(xcnCount).getPrefixEgDR().setValue(gp.getName().getTitle().toString());
				}
			}

		}

		LOG.debug("VoMapper renderGpLiteVoToReferringDoctor: exit");
	}


	//WDEV-21000
	protected final void renderMedicWithMappingsLiteVoToConsultingDoctor(MedicWithMappingsLiteVo medic, PV1 pv1, ProviderSystemVo providerSystem) throws HL7Exception
	{
		LOG.debug("VoMapper renderGpLiteVoToReferringDoctor: entry");

		int xcnCount = 0;
		
		if (medic != null)
		{
			
			if (medic.getMos() != null)
			{
				if (medic.getMos().getCodeMappings() != null)
				{
					for (int i = 0; i < medic.getMos().getCodeMappings().size(); i++)
					{
						ims.core.vo.TaxonomyMap map = medic.getMos().getCodeMappings().get(i);
		
						/* 
						 * First check to see if the code is defined as a  valid Taxonomy Type for provider system
						 * If it isn't, then skip this code mapping 
						 */
		
						TaxonomyType taxonomyType = map.getTaxonomyName();
						if (taxonomyType != null)
						{
							String taxTypeText = svc.getRemoteLookup(taxonomyType.getID(), providerSystem.getCodeSystem().getText());
							if (taxTypeText != null)
							{
								/* 
								 * This code mapping has a valid taxonomy type defined for the provider system
								 */
								
								//XCN.0 ID Number (ST)
								pv1.getConsultingDoctor(xcnCount).getIDNumber().setValue(map.getTaxonomyCode());
								if (medic.getMos().getNameIsNotNull())
								{
									//XCN.1 Family name (ST)
									if (medic.getMos().getName().getSurnameIsNotNull())
										pv1.getConsultingDoctor(xcnCount).getFamilyName().getSurname().setValue(medic.getMos().getName().getSurname().toString());
									//XCN.2 Given name (ST)
									if (medic.getMos().getName().getForenameIsNotNull())
										pv1.getConsultingDoctor(xcnCount).getGivenName().setValue(medic.getMos().getName().getForename().toString());
									//XCN.3 Second and further names (ST)
									if (medic.getMos().getName().getMiddleNameIsNotNull())
										pv1.getAttendingDoctor(xcnCount).getSecondAndFurtherGivenNamesOrInitialsThereof().setValue(medic.getMos().getName().getMiddleName().toString());
									//XCN.5 Prefix (ST)
									if (medic.getMos().getName().getTitleIsNotNull())
										pv1.getConsultingDoctor(xcnCount).getPrefixEgDR().setValue(medic.getMos().getName().getTitle().toString());
								}
								//XCN.9 Assigning authority (HD)
								pv1.getConsultingDoctor(xcnCount).getAssigningAuthority().getNamespaceID().setValue(map.getTaxonomyName().toString());
								//XCN.10 Name type code (ID)
								pv1.getConsultingDoctor(xcnCount).getNameTypeCode().setValue(taxTypeText);
								
								xcnCount ++;
							}
						}
					}
				}
				
				if (xcnCount == 0)
				{
					if (medic.getMos().getNameIsNotNull())
					{
						//XCN.1 Family name (ST)
						if (medic.getMos().getName().getSurnameIsNotNull())
							pv1.getConsultingDoctor(xcnCount).getFamilyName().getSurname().setValue(medic.getMos().getName().getSurname().toString());
						//XCN.2 Given name (ST)
						if (medic.getMos().getName().getForenameIsNotNull())
							pv1.getConsultingDoctor(xcnCount).getGivenName().setValue(medic.getMos().getName().getForename().toString());
						//XCN.3 Second and further names (ST)
						if (medic.getMos().getName().getMiddleNameIsNotNull())
							pv1.getConsultingDoctor(xcnCount).getSecondAndFurtherGivenNamesOrInitialsThereof().setValue(medic.getMos().getName().getMiddleName().toString());
						//XCN.5 Prefix (ST)
						if (medic.getMos().getName().getTitleIsNotNull())
							pv1.getConsultingDoctor(xcnCount).getPrefixEgDR().setValue(medic.getMos().getName().getTitle().toString());
					}
				}

			}
		
		}

		LOG.debug("VoMapper renderMedicWithMappingsLiteVoToConsultingDoctor: exit");
	}

	//WDEV-21000
	protected final void renderHcpToReferringDoctor(ims.core.vo.Hcp hcp, PV1 pv1, ProviderSystemVo providerSystem) throws HL7Exception
	{
		LOG.debug("VoMapper renderHcpToReferringDoctor: entry");

		int xcnCount = 0;
		
		if (hcp != null)
		{
			
			if (hcp.getMos() != null)
			{
				if (hcp.getMos().getCodeMappings() != null)
				{
					for (int i = 0; i < hcp.getMos().getCodeMappings().size(); i++)
					{
						ims.core.vo.TaxonomyMap map = hcp.getMos().getCodeMappings().get(i);
		
						/* 
						 * First check to see if the code is defined as a  valid Taxonomy Type for provider system
						 * If it isn't, then skip this code mapping 
						 */
	
						TaxonomyType taxonomyType = map.getTaxonomyName();
						if (taxonomyType != null)
						{
							String taxTypeText = svc.getRemoteLookup(taxonomyType.getID(), providerSystem.getCodeSystem().getText());
							if (taxTypeText != null)
							{
								/* 
								 * This code mapping has a valid taxonomy type defined for the provider system
								 */
								
								//XCN.0 ID Number (ST)
								pv1.getReferringDoctor(xcnCount).getIDNumber().setValue(map.getTaxonomyCode());
								if (hcp.getMos().getNameIsNotNull())
								{
									//XCN.1 Family name (ST)
									if (hcp.getMos().getName().getSurnameIsNotNull())
										pv1.getReferringDoctor(xcnCount).getFamilyName().getSurname().setValue(hcp.getMos().getName().getSurname().toString());
									//XCN.2 Given name (ST)
									if (hcp.getMos().getName().getForenameIsNotNull())
										pv1.getReferringDoctor(xcnCount).getGivenName().setValue(hcp.getMos().getName().getForename().toString());
									//XCN.3 Second and further names (ST)
									if (hcp.getMos().getName().getMiddleNameIsNotNull())
										pv1.getReferringDoctor(xcnCount).getSecondAndFurtherGivenNamesOrInitialsThereof().setValue(hcp.getMos().getName().getMiddleName().toString());
									//XCN.5 Prefix (ST)
									if (hcp.getMos().getName().getTitleIsNotNull())
										pv1.getReferringDoctor(xcnCount).getPrefixEgDR().setValue(hcp.getMos().getName().getTitle().toString());
								}
								//XCN.9 Assigning authority (HD)
								pv1.getReferringDoctor(xcnCount).getAssigningAuthority().getNamespaceID().setValue(map.getTaxonomyName().toString());
								//XCN.10 Name type code (ID)
								pv1.getReferringDoctor(xcnCount).getNameTypeCode().setValue(taxTypeText);
								
								xcnCount ++;
							}
						}
					}
				}
				
				if (xcnCount == 0)
				{
					if (hcp.getMos().getNameIsNotNull())
					{
						//XCN.1 Family name (ST)
						if (hcp.getMos().getName().getSurnameIsNotNull())
							pv1.getReferringDoctor(xcnCount).getFamilyName().getSurname().setValue(hcp.getMos().getName().getSurname().toString());
						//XCN.2 Given name (ST)
						if (hcp.getMos().getName().getForenameIsNotNull())
							pv1.getReferringDoctor(xcnCount).getGivenName().setValue(hcp.getMos().getName().getForename().toString());
						//XCN.3 Second and further names (ST)
						if (hcp.getMos().getName().getMiddleNameIsNotNull())
							pv1.getReferringDoctor(xcnCount).getSecondAndFurtherGivenNamesOrInitialsThereof().setValue(hcp.getMos().getName().getMiddleName().toString());
						//XCN.5 Prefix (ST)
						if (hcp.getMos().getName().getTitleIsNotNull())
							pv1.getReferringDoctor(xcnCount).getPrefixEgDR().setValue(hcp.getMos().getName().getTitle().toString());
					}
				}
			}

		}

		LOG.debug("VoMapper renderHcpToReferringDoctor: exit");
	}

	

	//WDEV-21000
	protected final void renderGpShortVoToReferringDoctor(GpShortVo gp, PV1 pv1, ProviderSystemVo providerSystem) throws HL7Exception
	{
		LOG.debug("VoMapper renderGpShortVoToReferringDoctor: entry");

		int xcnCount = 0;
		
		if (gp != null)
		{
			if (gp.getCodeMappings() != null)
			{
				for (int i = 0; i < gp.getCodeMappings().size(); i++)
				{
					ims.core.vo.TaxonomyMap map = gp.getCodeMappings().get(i);
	
					/* 
					 * First check to see if the code is defined as a  valid Taxonomy Type for provider system
					 * If it isn't, then skip this code mapping 
					 */

					TaxonomyType taxonomyType = map.getTaxonomyName();
					if (taxonomyType != null)
					{
						String taxTypeText = svc.getRemoteLookup(taxonomyType.getID(), providerSystem.getCodeSystem().getText());
						if (taxTypeText != null)
						{
							/* 
							 * This code mapping has a valid taxonomy type defined for the provider system
							 */
							
							//XCN.0 ID Number (ST)
							pv1.getReferringDoctor(xcnCount).getIDNumber().setValue(map.getTaxonomyCode());
							if (gp.getNameIsNotNull())
							{
								//XCN.1 Family name (ST)
								if (gp.getName().getSurnameIsNotNull())
									pv1.getReferringDoctor(xcnCount).getFamilyName().getSurname().setValue(gp.getName().getSurname().toString());
								//XCN.2 Given name (ST)
								if (gp.getName().getForenameIsNotNull())
									pv1.getReferringDoctor(xcnCount).getGivenName().setValue(gp.getName().getForename().toString());
								//XCN.3 Second and further names (ST)
								if (gp.getName().getMiddleNameIsNotNull())
									pv1.getReferringDoctor(xcnCount).getSecondAndFurtherGivenNamesOrInitialsThereof().setValue(gp.getName().getMiddleName().toString());
								//XCN.5 Prefix (ST)
								if (gp.getName().getTitleIsNotNull())
									pv1.getReferringDoctor(xcnCount).getPrefixEgDR().setValue(gp.getName().getTitle().toString());
							}
							//XCN.9 Assigning authority (HD)
							pv1.getReferringDoctor(xcnCount).getAssigningAuthority().getNamespaceID().setValue(map.getTaxonomyName().toString());
							//XCN.10 Name type code (ID)
							pv1.getReferringDoctor(xcnCount).getNameTypeCode().setValue(taxTypeText);
							
							xcnCount ++;
						}
					}
				}
			}
			
			if (xcnCount == 0)
			{
				if (gp.getNameIsNotNull())
				{
					//XCN.1 Family name (ST)
					if (gp.getName().getSurnameIsNotNull())
						pv1.getReferringDoctor(xcnCount).getFamilyName().getSurname().setValue(gp.getName().getSurname().toString());
					//XCN.2 Given name (ST)
					if (gp.getName().getForenameIsNotNull())
						pv1.getReferringDoctor(xcnCount).getGivenName().setValue(gp.getName().getForename().toString());
					//XCN.3 Second and further names (ST)
					if (gp.getName().getMiddleNameIsNotNull())
						pv1.getReferringDoctor(xcnCount).getSecondAndFurtherGivenNamesOrInitialsThereof().setValue(gp.getName().getMiddleName().toString());
					//XCN.5 Prefix (ST)
					if (gp.getName().getTitleIsNotNull())
						pv1.getReferringDoctor(xcnCount).getPrefixEgDR().setValue(gp.getName().getTitle().toString());
				}
			}

		}

		LOG.debug("VoMapper renderGpShortVoToReferringDoctor: exit");
	}

	
	//WDEV-21000
	protected final void renderMemberOfStaffShortVoToEnteredBy(MemberOfStaffShortVo mos, ORC commonOrder, ProviderSystemVo providerSystem) throws HL7Exception
	{
		LOG.debug("VoMapper renderMemberOfStaffShortVoToEnteredBy: entry");

		int xcnCount = 0;
		
		if (mos != null)
		{
			
			if (mos.getCodeMappings() != null)
			{
				for (int i = 0; i < mos.getCodeMappings().size(); i++)
				{
					ims.core.vo.TaxonomyMap map = mos.getCodeMappings().get(i);
	
					/* 
					 * First check to see if the code is defined as a  valid Taxonomy Type for provider system
					 * If it isn't, then skip this code mapping 
					 */

					TaxonomyType taxonomyType = map.getTaxonomyName();
					if (taxonomyType != null)
					{
						String taxTypeText = svc.getRemoteLookup(taxonomyType.getID(), providerSystem.getCodeSystem().getText());
						if (taxTypeText != null)
						{
							/* 
							 * This code mapping has a valid taxonomy type defined for the provider system
							 */
							
							//XCN.0 ID Number (ST)
							commonOrder.getEnteredBy(xcnCount).getIDNumber().setValue(map.getTaxonomyCode());
							if (mos.getNameIsNotNull())
							{
								//XCN.1 Family name (ST)
								if (mos.getName().getSurnameIsNotNull())
									commonOrder.getEnteredBy(xcnCount).getFamilyName().getSurname().setValue(mos.getName().getSurname().toString());
								//XCN.2 Given name (ST)
								if (mos.getName().getForenameIsNotNull())
									commonOrder.getEnteredBy(xcnCount).getGivenName().setValue(mos.getName().getForename().toString());
								//XCN.3 Second and further names (ST)
								if (mos.getName().getMiddleNameIsNotNull())
									commonOrder.getEnteredBy(xcnCount).getSecondAndFurtherGivenNamesOrInitialsThereof().setValue(mos.getName().getMiddleName().toString());
								//XCN.5 Prefix (ST)
								if (mos.getName().getTitleIsNotNull())
									commonOrder.getEnteredBy(xcnCount).getPrefixEgDR().setValue(mos.getName().getTitle().toString());
							}
							//XCN.9 Assigning authority (HD)
							commonOrder.getEnteredBy(xcnCount).getAssigningAuthority().getNamespaceID().setValue(map.getTaxonomyName().toString());
							//XCN.10 Name type code (ID)
							commonOrder.getEnteredBy(xcnCount).getNameTypeCode().setValue(taxTypeText);
							
							xcnCount ++;
						}
					}
				}
			}
			
			if (xcnCount == 0)
			{
				if (mos.getNameIsNotNull())
				{
					//XCN.1 Family name (ST)
					if (mos.getName().getSurnameIsNotNull())
						commonOrder.getEnteredBy(xcnCount).getFamilyName().getSurname().setValue(mos.getName().getSurname().toString());
					//XCN.2 Given name (ST)
					if (mos.getName().getForenameIsNotNull())
						commonOrder.getEnteredBy(xcnCount).getGivenName().setValue(mos.getName().getForename().toString());
					//XCN.3 Second and further names (ST)
					if (mos.getName().getMiddleNameIsNotNull())
						commonOrder.getEnteredBy(xcnCount).getSecondAndFurtherGivenNamesOrInitialsThereof().setValue(mos.getName().getMiddleName().toString());
					//XCN.5 Prefix (ST)
					if (mos.getName().getTitleIsNotNull())
						commonOrder.getEnteredBy(xcnCount).getPrefixEgDR().setValue(mos.getName().getTitle().toString());
				}
			}

		}

		LOG.debug("VoMapper renderMemberOfStaffShortVoToEnteredBy: exit");
	}


	//WDEV-21000
	protected final void renderGpShortVoToOrderingProvider(GpShortVo gp, ORC orc, ProviderSystemVo providerSystem) throws HL7Exception
	{
		LOG.debug("VoMapper renderGpShortVoToOrderingProvider: entry");

		int xcnCount = 0;
		
		if (gp != null)
		{
			
			if (gp.getCodeMappings() != null)
			{
				for (int i = 0; i < gp.getCodeMappings().size(); i++)
				{
					ims.core.vo.TaxonomyMap map = gp.getCodeMappings().get(i);
	
					/* 
					 * First check to see if the code is defined as a  valid Taxonomy Type for provider system
					 * If it isn't, then skip this code mapping 
					 */

					TaxonomyType taxonomyType = map.getTaxonomyName();
					if (taxonomyType != null)
					{
						String taxTypeText = svc.getRemoteLookup(taxonomyType.getID(), providerSystem.getCodeSystem().getText());
						if (taxTypeText != null)
						{
							/* 
							 * This code mapping has a valid taxonomy type defined for the provider system
							 */
							
							//XCN.0 ID Number (ST)
							orc.getOrderingProvider(xcnCount).getIDNumber().setValue(map.getTaxonomyCode());
							if (gp.getNameIsNotNull())
							{
								//XCN.1 Family name (ST)
								if (gp.getName().getSurnameIsNotNull())
									orc.getOrderingProvider(xcnCount).getFamilyName().getSurname().setValue(gp.getName().getSurname().toString());
								//XCN.2 Given name (ST)
								if (gp.getName().getForenameIsNotNull())
									orc.getOrderingProvider(xcnCount).getGivenName().setValue(gp.getName().getForename().toString());
								//XCN.3 Second and further names (ST)
								if (gp.getName().getMiddleNameIsNotNull())
									orc.getOrderingProvider(xcnCount).getSecondAndFurtherGivenNamesOrInitialsThereof().setValue(gp.getName().getMiddleName().toString());
								//XCN.5 Prefix (ST)
								if (gp.getName().getTitleIsNotNull())
									orc.getOrderingProvider(xcnCount).getPrefixEgDR().setValue(gp.getName().getTitle().toString());
							}
							//XCN.9 Assigning authority (HD)
							orc.getOrderingProvider(xcnCount).getAssigningAuthority().getNamespaceID().setValue(map.getTaxonomyName().toString());
							//XCN.10 Name type code (ID)
							orc.getOrderingProvider(xcnCount).getNameTypeCode().setValue(taxTypeText);
							
							xcnCount ++;
						}
					}
				}
			}
			
			if (xcnCount == 0)
			{
				if (gp.getNameIsNotNull())
				{
					//XCN.1 Family name (ST)
					if (gp.getName().getSurnameIsNotNull())
						orc.getOrderingProvider(xcnCount).getFamilyName().getSurname().setValue(gp.getName().getSurname().toString());
					//XCN.2 Given name (ST)
					if (gp.getName().getForenameIsNotNull())
						orc.getOrderingProvider(xcnCount).getGivenName().setValue(gp.getName().getForename().toString());
					//XCN.3 Second and further names (ST)
					if (gp.getName().getMiddleNameIsNotNull())
						orc.getOrderingProvider(xcnCount).getSecondAndFurtherGivenNamesOrInitialsThereof().setValue(gp.getName().getMiddleName().toString());
					//XCN.5 Prefix (ST)
					if (gp.getName().getTitleIsNotNull())
						orc.getOrderingProvider(xcnCount).getPrefixEgDR().setValue(gp.getName().getTitle().toString());
				}
			}

		}


		LOG.debug("VoMapper renderGpShortVoToOrderingProvider: exit");
	}

	
	//WDEV-21000
	protected final void renderGpShortVoToOrderingProvider(GpShortVo gp, OBR obr, ProviderSystemVo providerSystem) throws HL7Exception
	{
		LOG.debug("VoMapper renderGpShortVoToOrderingProvider: entry");

		int xcnCount = 0;
		
		if (gp != null)
		{
			if (gp.getCodeMappings() != null)
			{
				for (int i = 0; i < gp.getCodeMappings().size(); i++)
				{
					ims.core.vo.TaxonomyMap map = gp.getCodeMappings().get(i);
	
					/* 
					 * First check to see if the code is defined as a  valid Taxonomy Type for provider system
					 * If it isn't, then skip this code mapping 
					 */

					TaxonomyType taxonomyType = map.getTaxonomyName();
					if (taxonomyType != null)
					{
						String taxTypeText = svc.getRemoteLookup(taxonomyType.getID(), providerSystem.getCodeSystem().getText());
						if (taxTypeText != null)
						{
							/* 
							 * This code mapping has a valid taxonomy type defined for the provider system
							 */
							
							//XCN.0 ID Number (ST)
							obr.getOrderingProvider(xcnCount).getIDNumber().setValue(map.getTaxonomyCode());
							if (gp.getNameIsNotNull())
							{
								//XCN.1 Family name (ST)
								if (gp.getName().getSurnameIsNotNull())
									obr.getOrderingProvider(xcnCount).getFamilyName().getSurname().setValue(gp.getName().getSurname().toString());
								//XCN.2 Given name (ST)
								if (gp.getName().getForenameIsNotNull())
									obr.getOrderingProvider(xcnCount).getGivenName().setValue(gp.getName().getForename().toString());
								//XCN.3 Second and further names (ST)
								if (gp.getName().getMiddleNameIsNotNull())
									obr.getOrderingProvider(xcnCount).getSecondAndFurtherGivenNamesOrInitialsThereof().setValue(gp.getName().getMiddleName().toString());
								//XCN.5 Prefix (ST)
								if (gp.getName().getTitleIsNotNull())
									obr.getOrderingProvider(xcnCount).getPrefixEgDR().setValue(gp.getName().getTitle().toString());
							}
							//XCN.9 Assigning authority (HD)
							obr.getOrderingProvider(xcnCount).getAssigningAuthority().getNamespaceID().setValue(map.getTaxonomyName().toString());
							//XCN.10 Name type code (ID)
							obr.getOrderingProvider(xcnCount).getNameTypeCode().setValue(taxTypeText);
							
							xcnCount ++;
						}
					}
				}
			}
			
			if (xcnCount == 0)
			{
				if (gp.getNameIsNotNull())
				{
					//XCN.1 Family name (ST)
					if (gp.getName().getSurnameIsNotNull())
						obr.getOrderingProvider(xcnCount).getFamilyName().getSurname().setValue(gp.getName().getSurname().toString());
					//XCN.2 Given name (ST)
					if (gp.getName().getForenameIsNotNull())
						obr.getOrderingProvider(xcnCount).getGivenName().setValue(gp.getName().getForename().toString());
					//XCN.3 Second and further names (ST)
					if (gp.getName().getMiddleNameIsNotNull())
						obr.getOrderingProvider(xcnCount).getSecondAndFurtherGivenNamesOrInitialsThereof().setValue(gp.getName().getMiddleName().toString());
					//XCN.5 Prefix (ST)
					if (gp.getName().getTitleIsNotNull())
						obr.getOrderingProvider(xcnCount).getPrefixEgDR().setValue(gp.getName().getTitle().toString());
				}
			}

		}

		LOG.debug("VoMapper renderGpShortVoToOrderingProvider: exit");
	}


	//WDEV-21000
	protected final void renderGpShortVoToPatientPrimaryCareProviderIDNo(GpShortVo gp, PD1 pd1, ProviderSystemVo providerSystem) throws HL7Exception
	{
		LOG.debug("VoMapper renderGpShortVoToPatientPrimaryCareProviderIDNo: entry");

		int xcnCount = 0;
		
		if (gp != null)
		{
			
			if (gp.getCodeMappings() != null)
			{
				for (int i = 0; i < gp.getCodeMappings().size(); i++)
				{
					ims.core.vo.TaxonomyMap map = gp.getCodeMappings().get(i);
	
					/* 
					 * First check to see if the code is defined as a  valid Taxonomy Type for provider system
					 * If it isn't, then skip this code mapping 
					 */

					TaxonomyType taxonomyType = map.getTaxonomyName();
					if (taxonomyType != null)
					{
						String taxTypeText = svc.getRemoteLookup(taxonomyType.getID(), providerSystem.getCodeSystem().getText());
						if (taxTypeText != null)
						{
							/* 
							 * This code mapping has a valid taxonomy type defined for the provider system
							 */
							
							//XCN.0 ID Number (ST)
							pd1.getPatientPrimaryCareProviderNameIDNo(xcnCount).getIDNumber().setValue(map.getTaxonomyCode());
							if (gp.getNameIsNotNull())
							{
								//XCN.1 Family name (ST)
								if (gp.getName().getSurnameIsNotNull())
									pd1.getPatientPrimaryCareProviderNameIDNo(xcnCount).getFamilyName().getSurname().setValue(gp.getName().getSurname().toString());
								//XCN.2 Given name (ST)
								if (gp.getName().getForenameIsNotNull())
									pd1.getPatientPrimaryCareProviderNameIDNo(xcnCount).getGivenName().setValue(gp.getName().getForename().toString());
								//XCN.3 Second and further names (ST)
								if (gp.getName().getMiddleNameIsNotNull())
									pd1.getPatientPrimaryCareProviderNameIDNo(xcnCount).getSecondAndFurtherGivenNamesOrInitialsThereof().setValue(gp.getName().getMiddleName().toString());
								//XCN.5 Prefix (ST)
								if (gp.getName().getTitleIsNotNull())
									pd1.getPatientPrimaryCareProviderNameIDNo(xcnCount).getPrefixEgDR().setValue(gp.getName().getTitle().toString());
							}
							//XCN.9 Assigning authority (HD)
							pd1.getPatientPrimaryCareProviderNameIDNo(xcnCount).getAssigningAuthority().getNamespaceID().setValue(map.getTaxonomyName().toString());
							//XCN.10 Name type code (ID)
							pd1.getPatientPrimaryCareProviderNameIDNo(xcnCount).getNameTypeCode().setValue(taxTypeText);
							
							xcnCount ++;
						}
					}
				}
			}
			
			if (xcnCount == 0)
			{
				if (gp.getNameIsNotNull())
				{
					//XCN.1 Family name (ST)
					if (gp.getName().getSurnameIsNotNull())
						pd1.getPatientPrimaryCareProviderNameIDNo(xcnCount).getFamilyName().getSurname().setValue(gp.getName().getSurname().toString());
					//XCN.2 Given name (ST)
					if (gp.getName().getForenameIsNotNull())
						pd1.getPatientPrimaryCareProviderNameIDNo(xcnCount).getGivenName().setValue(gp.getName().getForename().toString());
					//XCN.3 Second and further names (ST)
					if (gp.getName().getMiddleNameIsNotNull())
						pd1.getPatientPrimaryCareProviderNameIDNo(xcnCount).getSecondAndFurtherGivenNamesOrInitialsThereof().setValue(gp.getName().getMiddleName().toString());
					//XCN.5 Prefix (ST)
					if (gp.getName().getTitleIsNotNull())
						pd1.getPatientPrimaryCareProviderNameIDNo(xcnCount).getPrefixEgDR().setValue(gp.getName().getTitle().toString());
				}
			}

		}

		LOG.debug("VoMapper renderGpShortVoToPatientPrimaryCareProviderIDNo: exit");
	}
	

	//WDEV-21000
	protected final void renderMemberOfStaffShortVoToOrderingProvider(MemberOfStaffShortVo mos, ORC orc, ProviderSystemVo providerSystem) throws HL7Exception
	{
		LOG.debug("VoMapper renderMemberOfStaffShortVoToOrderingProvider: entry");

		int xcnCount = 0;
		
		if (mos != null)
		{
			
			if (mos.getCodeMappings() != null)
			{
				for (int i = 0; i < mos.getCodeMappings().size(); i++)
				{
					ims.core.vo.TaxonomyMap map = mos.getCodeMappings().get(i);
	
					/* 
					 * First check to see if the code is defined as a  valid Taxonomy Type for provider system
					 * If it isn't, then skip this code mapping 
					 */

					TaxonomyType taxonomyType = map.getTaxonomyName();
					if (taxonomyType != null)
					{
						String taxTypeText = svc.getRemoteLookup(taxonomyType.getID(), providerSystem.getCodeSystem().getText());
						if (taxTypeText != null)
						{
							/* 
							 * This code mapping has a valid taxonomy type defined for the provider system
							 */
							
							//XCN.0 ID Number (ST)
							orc.getOrderingProvider(xcnCount).getIDNumber().setValue(map.getTaxonomyCode());
							if (mos.getNameIsNotNull())
							{
								//XCN.1 Family name (ST)
								if (mos.getName().getSurnameIsNotNull())
									orc.getOrderingProvider(xcnCount).getFamilyName().getSurname().setValue(mos.getName().getSurname().toString());
								//XCN.2 Given name (ST)
								if (mos.getName().getForenameIsNotNull())
									orc.getOrderingProvider(xcnCount).getGivenName().setValue(mos.getName().getForename().toString());
								//XCN.3 Second and further names (ST)
								if (mos.getName().getMiddleNameIsNotNull())
									orc.getOrderingProvider(xcnCount).getSecondAndFurtherGivenNamesOrInitialsThereof().setValue(mos.getName().getMiddleName().toString());
								//XCN.5 Prefix (ST)
								if (mos.getName().getTitleIsNotNull())
									orc.getOrderingProvider(xcnCount).getPrefixEgDR().setValue(mos.getName().getTitle().toString());
							}
							//XCN.9 Assigning authority (HD)
							orc.getOrderingProvider(xcnCount).getAssigningAuthority().getNamespaceID().setValue(map.getTaxonomyName().toString());
							//XCN.10 Name type code (ID)
							orc.getOrderingProvider(xcnCount).getNameTypeCode().setValue(taxTypeText);
							
							xcnCount ++;
						}
					}
				}
			}
			
			if (xcnCount == 0)
			{
				if (mos.getNameIsNotNull())
				{
					//XCN.1 Family name (ST)
					if (mos.getName().getSurnameIsNotNull())
						orc.getOrderingProvider(xcnCount).getFamilyName().getSurname().setValue(mos.getName().getSurname().toString());
					//XCN.2 Given name (ST)
					if (mos.getName().getForenameIsNotNull())
						orc.getOrderingProvider(xcnCount).getGivenName().setValue(mos.getName().getForename().toString());
					//XCN.3 Second and further names (ST)
					if (mos.getName().getMiddleNameIsNotNull())
						orc.getOrderingProvider(xcnCount).getSecondAndFurtherGivenNamesOrInitialsThereof().setValue(mos.getName().getMiddleName().toString());
					//XCN.5 Prefix (ST)
					if (mos.getName().getTitleIsNotNull())
						orc.getOrderingProvider(xcnCount).getPrefixEgDR().setValue(mos.getName().getTitle().toString());
				}
			}

		}

		LOG.debug("VoMapper renderMemberOfStaffShortVoToOrderingProvider: exit");
	}

	
	//WDEV-21000
	protected final void renderMemberOfStaffShortVoToOrderingProvider(MemberOfStaffShortVo mos, OBR obr, ProviderSystemVo providerSystem) throws HL7Exception
	{
		LOG.debug("VoMapper renderMemberOfStaffShortVoToOrderingProvider: entry");

		int xcnCount = 0;
		
		if (mos != null)
		{
			
			if (mos.getCodeMappings() != null)
			{
				for (int i = 0; i < mos.getCodeMappings().size(); i++)
				{
					ims.core.vo.TaxonomyMap map = mos.getCodeMappings().get(i);
	
					/* 
					 * First check to see if the code is defined as a  valid Taxonomy Type for provider system
					 * If it isn't, then skip this code mapping 
					 */

					TaxonomyType taxonomyType = map.getTaxonomyName();
					if (taxonomyType != null)
					{
						String taxTypeText = svc.getRemoteLookup(taxonomyType.getID(), providerSystem.getCodeSystem().getText());
						if (taxTypeText != null)
						{
							/* 
							 * This code mapping has a valid taxonomy type defined for the provider system
							 */
							
							//XCN.0 ID Number (ST)
							obr.getOrderingProvider(xcnCount).getIDNumber().setValue(map.getTaxonomyCode());
							if (mos.getNameIsNotNull())
							{
								//XCN.1 Family name (ST)
								if (mos.getName().getSurnameIsNotNull())
									obr.getOrderingProvider(xcnCount).getFamilyName().getSurname().setValue(mos.getName().getSurname().toString());
								//XCN.2 Given name (ST)
								if (mos.getName().getForenameIsNotNull())
									obr.getOrderingProvider(xcnCount).getGivenName().setValue(mos.getName().getForename().toString());
								//XCN.3 Second and further names (ST)
								if (mos.getName().getMiddleNameIsNotNull())
									obr.getOrderingProvider(xcnCount).getSecondAndFurtherGivenNamesOrInitialsThereof().setValue(mos.getName().getMiddleName().toString());
								//XCN.5 Prefix (ST)
								if (mos.getName().getTitleIsNotNull())
									obr.getOrderingProvider(xcnCount).getPrefixEgDR().setValue(mos.getName().getTitle().toString());
							}
							//XCN.9 Assigning authority (HD)
							obr.getOrderingProvider(xcnCount).getAssigningAuthority().getNamespaceID().setValue(map.getTaxonomyName().toString());
							//XCN.10 Name type code (ID)
							obr.getOrderingProvider(xcnCount).getNameTypeCode().setValue(taxTypeText);
							
							xcnCount ++;
						}
					}
				}
			}
			
			if (xcnCount == 0)
			{
				if (mos.getNameIsNotNull())
				{
					//XCN.1 Family name (ST)
					if (mos.getName().getSurnameIsNotNull())
						obr.getOrderingProvider(xcnCount).getFamilyName().getSurname().setValue(mos.getName().getSurname().toString());
					//XCN.2 Given name (ST)
					if (mos.getName().getForenameIsNotNull())
						obr.getOrderingProvider(xcnCount).getGivenName().setValue(mos.getName().getForename().toString());
					//XCN.3 Second and further names (ST)
					if (mos.getName().getMiddleNameIsNotNull())
						obr.getOrderingProvider(xcnCount).getSecondAndFurtherGivenNamesOrInitialsThereof().setValue(mos.getName().getMiddleName().toString());
					//XCN.5 Prefix (ST)
					if (mos.getName().getTitleIsNotNull())
						obr.getOrderingProvider(xcnCount).getPrefixEgDR().setValue(mos.getName().getTitle().toString());
				}
			}
			
		}

		LOG.debug("VoMapper renderMemberOfStaffShortVoToOrderingProvider: exit");
	}

	
	//WDEV-21000
	protected final void renderMemberOfStaffShortVoToPrimaryActivityProviderCodeName(MemberOfStaffShortVo mos, TXA txa, ProviderSystemVo providerSystem) throws HL7Exception
	{
		LOG.debug("VoMapper renderMemberOfStaffShortVoToPrimaryActivityProviderCodeName: entry");

		int xcnCount = 0;
		
		if (mos != null)
		{
			
			if (mos.getCodeMappings() != null)
			{
				for (int i = 0; i < mos.getCodeMappings().size(); i++)
				{
					ims.core.vo.TaxonomyMap map = mos.getCodeMappings().get(i);
	
					/* 
					 * First check to see if the code is defined as a  valid Taxonomy Type for provider system
					 * If it isn't, then skip this code mapping 
					 */

					TaxonomyType taxonomyType = map.getTaxonomyName();
					if (taxonomyType != null)
					{
						String taxTypeText = svc.getRemoteLookup(taxonomyType.getID(), providerSystem.getCodeSystem().getText());
						if (taxTypeText != null)
						{
							/* 
							 * This code mapping has a valid taxonomy type defined for the provider system
							 */
							
							//XCN.0 ID Number (ST)
							txa.getPrimaryActivityProviderCodeName(xcnCount).getIDNumber().setValue(map.getTaxonomyCode());
							if (mos.getNameIsNotNull())
							{
								//XCN.1 Family name (ST)
								if (mos.getName().getSurnameIsNotNull())
									txa.getPrimaryActivityProviderCodeName(xcnCount).getFamilyName().getSurname().setValue(mos.getName().getSurname().toString());
								//XCN.2 Given name (ST)
								if (mos.getName().getForenameIsNotNull())
									txa.getPrimaryActivityProviderCodeName(xcnCount).getGivenName().setValue(mos.getName().getForename().toString());
								//XCN.3 Middle Initial or name (ST)
								if (mos.getName().getMiddleNameIsNotNull())
									txa.getPrimaryActivityProviderCodeName(xcnCount).getSecondAndFurtherGivenNamesOrInitialsThereof().setValue(mos.getName().getMiddleName().toString());
								//XCN.5 Prefix (ST)
								if (mos.getName().getTitleIsNotNull())
									txa.getPrimaryActivityProviderCodeName(xcnCount).getPrefixEgDR().setValue(mos.getName().getTitle().toString());
							}
							//XCN.9 Assigning authority (HD)
							txa.getPrimaryActivityProviderCodeName(xcnCount).getAssigningAuthority().getNamespaceID().setValue(map.getTaxonomyName().toString());
							//XCN.10 Name type code (ID)
							txa.getPrimaryActivityProviderCodeName(xcnCount).getNameTypeCode().setValue(taxTypeText);
							
							xcnCount ++;
						}
					}
				}
			}
			
			if (xcnCount == 0)
			{
				if (mos.getNameIsNotNull())
				{
					//XCN.1 Family name (ST)
					if (mos.getNameIsNotNull())
					{
						//XCN.1 Family name (ST)
						if (mos.getName().getSurnameIsNotNull())
							txa.getPrimaryActivityProviderCodeName(xcnCount).getFamilyName().getSurname().setValue(mos.getName().getSurname().toString());
						//XCN.2 Given name (ST)
						if (mos.getName().getForenameIsNotNull())
							txa.getPrimaryActivityProviderCodeName(xcnCount).getGivenName().setValue(mos.getName().getForename().toString());
						//XCN.3 Middle Initial or name (ST)
						if (mos.getName().getMiddleNameIsNotNull())
							txa.getPrimaryActivityProviderCodeName(xcnCount).getSecondAndFurtherGivenNamesOrInitialsThereof().setValue(mos.getName().getMiddleName().toString());
						//XCN.5 Prefix (ST)
						if (mos.getName().getTitleIsNotNull())
							txa.getPrimaryActivityProviderCodeName(xcnCount).getPrefixEgDR().setValue(mos.getName().getTitle().toString());
					}
				}
			}

		}


		LOG.debug("VoMapper renderMemberOfStaffShortVoToPrimaryActivityProviderCodeName: exit");
	}

	
	//WDEV-21000
	protected final void renderMemberOfStaffShortVoToOriginatorCodeName(MemberOfStaffShortVo mos, TXA txa, ProviderSystemVo providerSystem) throws HL7Exception
	{
		LOG.debug("VoMapper renderMemberOfStaffShortVoToOriginatorCodeName: entry");

		int xcnCount = 0;
		
		if (mos != null)
		{
			
			if (mos.getCodeMappings() != null)
			{
				for (int i = 0; i < mos.getCodeMappings().size(); i++)
				{
					ims.core.vo.TaxonomyMap map = mos.getCodeMappings().get(i);
	
					/* 
					 * First check to see if the code is defined as a  valid Taxonomy Type for provider system
					 * If it isn't, then skip this code mapping 
					 */

					TaxonomyType taxonomyType = map.getTaxonomyName();
					if (taxonomyType != null)
					{
						String taxTypeText = svc.getRemoteLookup(taxonomyType.getID(), providerSystem.getCodeSystem().getText());
						if (taxTypeText != null)
						{
							/* 
							 * This code mapping has a valid taxonomy type defined for the provider system
							 */
							
							//XCN.0 ID Number (ST)
							txa.getOriginatorCodeName(xcnCount).getIDNumber().setValue(map.getTaxonomyCode());
							if (mos.getNameIsNotNull())
							{
								//XCN.1 Family name (ST)
								if (mos.getName().getSurnameIsNotNull())
									txa.getOriginatorCodeName(xcnCount).getFamilyName().getSurname().setValue(mos.getName().getSurname().toString());
								//XCN.2 Given name (ST)
								if (mos.getName().getForenameIsNotNull())
									txa.getOriginatorCodeName(xcnCount).getGivenName().setValue(mos.getName().getForename().toString());
								//XCN.3 Middle Initial or name (ST)
								if (mos.getName().getMiddleNameIsNotNull())
									txa.getOriginatorCodeName(xcnCount).getSecondAndFurtherGivenNamesOrInitialsThereof().setValue(mos.getName().getMiddleName().toString());
								//XCN.5 Prefix (ST)
								if (mos.getName().getTitleIsNotNull())
									txa.getOriginatorCodeName(xcnCount).getPrefixEgDR().setValue(mos.getName().getTitle().toString());
							}
							//XCN.9 Assigning authority (HD)
							txa.getOriginatorCodeName(xcnCount).getAssigningAuthority().getNamespaceID().setValue(map.getTaxonomyName().toString());
							//XCN.10 Name type code (ID)
							txa.getOriginatorCodeName(xcnCount).getNameTypeCode().setValue(taxTypeText);
							
							xcnCount ++;
						}
					}
				}
			}
			
			if (xcnCount == 0)
			{
				if (mos.getNameIsNotNull())
				{
					//XCN.1 Family name (ST)
					if (mos.getName().getSurnameIsNotNull())
						txa.getOriginatorCodeName(xcnCount).getFamilyName().getSurname().setValue(mos.getName().getSurname().toString());
					//XCN.2 Given name (ST)
					if (mos.getName().getForenameIsNotNull())
						txa.getOriginatorCodeName(xcnCount).getGivenName().setValue(mos.getName().getForename().toString());
					//XCN.3 Middle Initial or name (ST)
					if (mos.getName().getMiddleNameIsNotNull())
						txa.getOriginatorCodeName(xcnCount).getSecondAndFurtherGivenNamesOrInitialsThereof().setValue(mos.getName().getMiddleName().toString());
					//XCN.5 Prefix (ST)
					if (mos.getName().getTitleIsNotNull())
						txa.getOriginatorCodeName(xcnCount).getPrefixEgDR().setValue(mos.getName().getTitle().toString());
				}
			}

		}

		LOG.debug("VoMapper renderMemberOfStaffShortVoToOriginatorCodeName: exit");
	}

	
	//WDEV-21000
	protected final void renderMemberOfStaffShortVoToTranscriptionistCodeName(MemberOfStaffShortVo mos, TXA txa, ProviderSystemVo providerSystem) throws HL7Exception
	{
		LOG.debug("VoMapper renderMemberOfStaffShortVoToTranscriptionistCodeName: entry");

		int xcnCount = 0;
		
		if (mos != null)
		{
			
			if (mos.getCodeMappings() != null)
			{
				for (int i = 0; i < mos.getCodeMappings().size(); i++)
				{
					ims.core.vo.TaxonomyMap map = mos.getCodeMappings().get(i);
	
					/* 
					 * First check to see if the code is defined as a  valid Taxonomy Type for provider system
					 * If it isn't, then skip this code mapping 
					 *
					 */
	
					TaxonomyType taxonomyType = map.getTaxonomyName();
					if (taxonomyType != null)
					{
						String taxTypeText = svc.getRemoteLookup(taxonomyType.getID(), providerSystem.getCodeSystem().getText());
						if (taxTypeText != null)
						{
							/* 
							 * This code mapping has a valid taxonomy type defined for the provider system
							 */
							
							//XCN.0 ID Number (ST)
							txa.getTranscriptionistCodeName(xcnCount).getIDNumber().setValue(map.getTaxonomyCode());
							if (mos.getNameIsNotNull())
							{
								//XCN.1 Family name (ST)
								if (mos.getName().getSurnameIsNotNull())
									txa.getTranscriptionistCodeName(xcnCount).getFamilyName().getSurname().setValue(mos.getName().getSurname().toString());
								//XCN.2 Given name (ST)
								if (mos.getName().getForenameIsNotNull())
									txa.getTranscriptionistCodeName(xcnCount).getGivenName().setValue(mos.getName().getForename().toString());
								//XCN.3 Middle Initial or name (ST)
								if (mos.getName().getMiddleNameIsNotNull())
									txa.getTranscriptionistCodeName(xcnCount).getSecondAndFurtherGivenNamesOrInitialsThereof().setValue(mos.getName().getMiddleName().toString());
								//XCN.5 Prefix (ST)
								if (mos.getName().getTitleIsNotNull())
									txa.getTranscriptionistCodeName(xcnCount).getPrefixEgDR().setValue(mos.getName().getTitle().toString());
							}
							//XCN.9 Assigning authority (HD)
							txa.getTranscriptionistCodeName(xcnCount).getAssigningAuthority().getNamespaceID().setValue(map.getTaxonomyName().toString());
							//XCN.10 Name type code (ID)
							txa.getTranscriptionistCodeName(xcnCount).getNameTypeCode().setValue(taxTypeText);
							
							xcnCount ++;
						}
					}
				}
			}
			
			if (xcnCount == 0)
			{
				if (mos.getNameIsNotNull())
				{
					//XCN.1 Family name (ST)
					if (mos.getName().getSurnameIsNotNull())
						txa.getTranscriptionistCodeName(xcnCount).getFamilyName().getSurname().setValue(mos.getName().getSurname().toString());
					//XCN.2 Given name (ST)
					if (mos.getName().getForenameIsNotNull())
						txa.getTranscriptionistCodeName(xcnCount).getGivenName().setValue(mos.getName().getForename().toString());
					//XCN.3 Middle Initial or name (ST)
					if (mos.getName().getMiddleNameIsNotNull())
						txa.getTranscriptionistCodeName(xcnCount).getSecondAndFurtherGivenNamesOrInitialsThereof().setValue(mos.getName().getMiddleName().toString());
					//XCN.5 Prefix (ST)
					if (mos.getName().getTitleIsNotNull())
						txa.getTranscriptionistCodeName(xcnCount).getPrefixEgDR().setValue(mos.getName().getTitle().toString());
				}
			}

		}


		LOG.debug("VoMapper renderMemberOfStaffShortVoToTranscriptionistCodeName: exit");
	}

	
	//WDEV-21000
	protected final void renderGpShortVoToPlacerContactPerson(GpShortVo gp, SCH sch, ProviderSystemVo providerSystem) throws HL7Exception
	{
		LOG.debug("VoMapper renderGpShortVoToPlacerContactPerson: entry");

		int xcnCount = 0;
		
		if (gp != null)
		{
			
			if (gp.getCodeMappings() != null)
			{
				for (int i = 0; i < gp.getCodeMappings().size(); i++)
				{
					ims.core.vo.TaxonomyMap map = gp.getCodeMappings().get(i);
	
					/* 
					 * First check to see if the code is defined as a  valid Taxonomy Type for provider system
					 * If it isn't, then skip this code mapping 
					 *
					 */

					TaxonomyType taxonomyType = map.getTaxonomyName();
					if (taxonomyType != null)
					{
						String taxTypeText = svc.getRemoteLookup(taxonomyType.getID(), providerSystem.getCodeSystem().getText());
						if (taxTypeText != null)
						{
							/* 
							 * This code mapping has a valid taxonomy type defined for the provider system
							 */
							
							//XCN.0 ID Number (ST)
							sch.getPlacerContactPerson(xcnCount).getIDNumber().setValue(map.getTaxonomyCode());
							if (gp.getNameIsNotNull())
							{
								//XCN.1 Family name (ST)
								if (gp.getName().getSurnameIsNotNull())
									sch.getPlacerContactPerson(xcnCount).getFamilyName().getSurname().setValue(gp.getName().getSurname().toString());
								//XCN.2 Given name (ST)
								if (gp.getName().getForenameIsNotNull())
									sch.getPlacerContactPerson(xcnCount).getGivenName().setValue(gp.getName().getForename().toString());
								//XCN.3 Middle Initial or name (ST)
								if (gp.getName().getMiddleNameIsNotNull())
									sch.getPlacerContactPerson(xcnCount).getSecondAndFurtherGivenNamesOrInitialsThereof().setValue(gp.getName().getMiddleName().toString());
								//XCN.5 Prefix (ST)
								if (gp.getName().getTitleIsNotNull())
									sch.getPlacerContactPerson(xcnCount).getPrefixEgDR().setValue(gp.getName().getTitle().toString());
							}
							//XCN.9 Assigning authority (HD)
							sch.getPlacerContactPerson(xcnCount).getAssigningAuthority().getNamespaceID().setValue(map.getTaxonomyName().toString());
							//XCN.10 Name type code (ID)
							sch.getPlacerContactPerson(xcnCount).getNameTypeCode().setValue(taxTypeText);
							
							xcnCount ++;
						}
					}
				}
			}

			if (xcnCount == 0)
			{
				if (gp.getNameIsNotNull())
				{
					//XCN.1 Family name (ST)
					if (gp.getName().getSurnameIsNotNull())
						sch.getPlacerContactPerson(xcnCount).getFamilyName().getSurname().setValue(gp.getName().getSurname().toString());
					//XCN.2 Given name (ST)
					if (gp.getName().getForenameIsNotNull())
						sch.getPlacerContactPerson(xcnCount).getGivenName().setValue(gp.getName().getForename().toString());
					//XCN.3 Middle Initial or name (ST)
					if (gp.getName().getMiddleNameIsNotNull())
						sch.getPlacerContactPerson(xcnCount).getSecondAndFurtherGivenNamesOrInitialsThereof().setValue(gp.getName().getMiddleName().toString());
					//XCN.5 Prefix (ST)
					if (gp.getName().getTitleIsNotNull())
						sch.getPlacerContactPerson(xcnCount).getPrefixEgDR().setValue(gp.getName().getTitle().toString());
				}
			}

		}


		LOG.debug("VoMapper renderGpShortVoToPlacerContactPerson: exit");
	}

	
	//WDEV-21000
	protected final void renderMemberOfStaffShortVoToPersonnelResourceID(MemberOfStaffShortVo mos, AIP aip, ProviderSystemVo providerSystem) throws HL7Exception
	{
		LOG.debug("VoMapper renderMemberOfStaffShortVoToPersonnelResourceID: entry");

		int xcnCount = 0;
		
		if (mos != null)
		{
			
			if (mos.getCodeMappings() != null)
			{
				for (int i = 0; i < mos.getCodeMappings().size(); i++)
				{
					ims.core.vo.TaxonomyMap map = mos.getCodeMappings().get(i);
	
					/* 
					 * First check to see if the code is defined as a  valid Taxonomy Type for provider system
					 * If it isn't, then skip this code mapping 
					 * 
					 */
	
					TaxonomyType taxonomyType = map.getTaxonomyName();
					if (taxonomyType != null)
					{
						String taxTypeText = svc.getRemoteLookup(taxonomyType.getID(), providerSystem.getCodeSystem().getText());
						if (taxTypeText != null)
						{
							/* 
							 * This code mapping has a valid taxonomy type defined for the provider system
							 */
							
							//XCN.0 ID Number (ST)
							aip.getPersonnelResourceID(xcnCount).getIDNumber().setValue(map.getTaxonomyCode());
							if (mos.getNameIsNotNull())
							{
								//XCN.1 Family name (ST)
								if (mos.getName().getSurnameIsNotNull())
									aip.getPersonnelResourceID(xcnCount).getFamilyName().getSurname().setValue(mos.getName().getSurname().toString());
								//XCN.2 Given name (ST)
								if (mos.getName().getForenameIsNotNull())
									aip.getPersonnelResourceID(xcnCount).getGivenName().setValue(mos.getName().getForename().toString());
								//XCN.3 Second and further names (ST)
								if (mos.getName().getMiddleNameIsNotNull())
									aip.getPersonnelResourceID(xcnCount).getSecondAndFurtherGivenNamesOrInitialsThereof().setValue(mos.getName().getMiddleName().toString());
								//XCN.5 Prefix (ST)
								if (mos.getName().getTitleIsNotNull())
									aip.getPersonnelResourceID(xcnCount).getPrefixEgDR().setValue(mos.getName().getTitle().toString());
							}
							//XCN.9 Assigning authority (HD)
							aip.getPersonnelResourceID(xcnCount).getAssigningAuthority().getNamespaceID().setValue(map.getTaxonomyName().toString());
							//XCN.10 Name type code (ID)
							aip.getPersonnelResourceID(xcnCount).getNameTypeCode().setValue(taxTypeText);
							
							xcnCount ++;
						}
					}
				}
			}
	
			if (xcnCount == 0)
			{
				if (mos.getNameIsNotNull())
				{
					//XCN.1 Family name (ST)
					if (mos.getName().getSurnameIsNotNull())
						aip.getPersonnelResourceID(xcnCount).getFamilyName().getSurname().setValue(mos.getName().getSurname().toString());
					//XCN.2 Given name (ST)
					if (mos.getName().getForenameIsNotNull())
						aip.getPersonnelResourceID(xcnCount).getGivenName().setValue(mos.getName().getForename().toString());
					//XCN.3 Second and further names (ST)
					if (mos.getName().getMiddleNameIsNotNull())
						aip.getPersonnelResourceID(xcnCount).getSecondAndFurtherGivenNamesOrInitialsThereof().setValue(mos.getName().getMiddleName().toString());
					//XCN.5 Prefix (ST)
					if (mos.getName().getTitleIsNotNull())
						aip.getPersonnelResourceID(xcnCount).getPrefixEgDR().setValue(mos.getName().getTitle().toString());
				}
			}
		}
		
		LOG.debug("VoMapper renderMemberOfStaffShortVoToPersonnelResourceID: exit");
	}

	
	//WDEV-21244
	protected final void renderSessionListOwnerVoCollToAttendingDoctor(ifSessionListOwnerVoCollection listOwners, PV1 pv1, ProviderSystemVo providerSystem, Boolean isAttendingClinician) throws HL7Exception
	{
		LOG.debug("VoMapper renderSessionListOwnerVoCollToAttendingDoctor: entry");

		int xcnCount = 0;
		
		if (listOwners != null
				&& listOwners.size() > 0)
		{
			
			for (int i=0; i < listOwners.size(); i++)
			{
				if (listOwners.get(i) != null
						&& listOwners.get(i).getHcp() != null
						&& listOwners.get(i).getHcp().getMos() != null
						&& listOwners.get(i).getAttendingClinician() != null
						&& isAttendingClinician != null
						&& (isAttendingClinician.equals(listOwners.get(i).getAttendingClinician())))
				{
					
					MemberOfStaffShortVo mos = listOwners.get(i).getHcp().getMos();
					
					if (mos.getCodeMappings() != null
							&& mos.getCodeMappings().size() > 0)
					{
						
						for (int j = 0; j < mos.getCodeMappings().size(); j++)
						{
							ims.core.vo.TaxonomyMap map = mos.getCodeMappings().get(j);
							
							TaxonomyType taxonomyType = map.getTaxonomyName();
							if (taxonomyType != null)
							{
								String taxTypeText = svc.getRemoteLookup(taxonomyType.getID(), providerSystem.getCodeSystem().getText());
								if (taxTypeText != null)
								{
									/* 
									 * This code mapping has a valid taxonomy type defined for the provider system
									 */

									//XCN.0 ID Number (ST)
									if (map.getTaxonomyCode() != null)
										pv1.getAttendingDoctor(xcnCount).getIDNumber().setValue(map.getTaxonomyCode());
									
									if (mos.getNameIsNotNull())
									{
										//XCN.1 Family name (ST)
										if (mos.getName().getSurnameIsNotNull())
											pv1.getAttendingDoctor(xcnCount).getFamilyName().getSurname().setValue(mos.getName().getSurname().toString());
										//XCN.2 Given name (ST)
										if (mos.getName().getForenameIsNotNull())
											pv1.getAttendingDoctor(xcnCount).getGivenName().setValue(mos.getName().getForename().toString());
										//XCN.3 Second and further names (ST)
										if (mos.getName().getMiddleNameIsNotNull())
											pv1.getAttendingDoctor(xcnCount).getSecondAndFurtherGivenNamesOrInitialsThereof().setValue(mos.getName().getMiddleName().toString());
										//XCN.5 Prefix (ST)
										if (mos.getName().getTitleIsNotNull())
											pv1.getAttendingDoctor(xcnCount).getPrefixEgDR().setValue(mos.getName().getTitle().toString());
									}
									if (map.getTaxonomyName() != null)
									{
										//XCN.9 Assigning authority (HD)
										pv1.getAttendingDoctor(xcnCount).getAssigningAuthority().getNamespaceID().setValue(map.getTaxonomyName().toString());
										//XCN.10 Name type code (ID)
										pv1.getAttendingDoctor(xcnCount).getNameTypeCode().setValue(taxTypeText);
									}

									xcnCount ++;

								}
							}
						}
					}
					else
					{ // No taxononmy mapping for Member of Staff - render only name details
						if (mos.getNameIsNotNull())
						{
							//XCN.1 Family name (ST)
							if (mos.getName().getSurnameIsNotNull())
								pv1.getAttendingDoctor(xcnCount).getFamilyName().getSurname().setValue(mos.getName().getSurname().toString());
							//XCN.2 Given name (ST)
							if (mos.getName().getForenameIsNotNull())
								pv1.getAttendingDoctor(xcnCount).getGivenName().setValue(mos.getName().getForename().toString());
							//XCN.3 Second and further names (ST)
							if (mos.getName().getMiddleNameIsNotNull())
								pv1.getAttendingDoctor(xcnCount).getSecondAndFurtherGivenNamesOrInitialsThereof().setValue(mos.getName().getMiddleName().toString());
							//XCN.5 Prefix (ST)
							if (mos.getName().getTitleIsNotNull())
								pv1.getAttendingDoctor(xcnCount).getPrefixEgDR().setValue(mos.getName().getTitle().toString());
							
							xcnCount ++;	
						}						
					}
				}
			}
		}
		
		LOG.debug("VoMapper renderSessionListOwnerVoCollToAttendingDoctor: exit");
	}

	
	//WDEV-21244
	protected final void renderSessionListOwnerVoCollToConsultingDoctor(ifSessionListOwnerVoCollection listOwners, PV1 pv1, ProviderSystemVo providerSystem, Boolean isListOwner) throws HL7Exception
	{
		LOG.debug("VoMapper renderSessionListOwnerVoCollToConsultingDoctor: entry");

		int xcnCount = 0;
		
		if (listOwners != null
				&& listOwners.size() > 0)
		{
			
			for (int i=0; i < listOwners.size(); i++)
			{
				if (listOwners.get(i) != null
						&& listOwners.get(i).getHcp() != null
						&& listOwners.get(i).getHcp().getMos() != null
						&& listOwners.get(i).getListOwner() != null
						&& isListOwner != null
						&& (isListOwner.equals(listOwners.get(i).getListOwner())))
				{
					
					MemberOfStaffShortVo mos = listOwners.get(i).getHcp().getMos();
					
					if (mos.getCodeMappings() != null
							&& mos.getCodeMappings().size() > 0)
					{
						
						for (int j = 0; j < mos.getCodeMappings().size(); j++)
						{
							
							ims.core.vo.TaxonomyMap map = mos.getCodeMappings().get(j);

							TaxonomyType taxonomyType = map.getTaxonomyName();
							if (taxonomyType != null)
							{
								String taxTypeText = svc.getRemoteLookup(taxonomyType.getID(), providerSystem.getCodeSystem().getText());
								if (taxTypeText != null)
								{
									/* 
									 * This code mapping has a valid taxonomy type defined for the provider system
									 */

									//XCN.0 ID Number (ST)
									if (map.getTaxonomyCode() != null)
										pv1.getConsultingDoctor(xcnCount).getIDNumber().setValue(map.getTaxonomyCode());
									
									if (mos.getNameIsNotNull())
									{
										//XCN.1 Family name (ST)
										if (mos.getName().getSurnameIsNotNull())
											pv1.getConsultingDoctor(xcnCount).getFamilyName().getSurname().setValue(mos.getName().getSurname().toString());
										//XCN.2 Given name (ST)
										if (mos.getName().getForenameIsNotNull())
											pv1.getConsultingDoctor(xcnCount).getGivenName().setValue(mos.getName().getForename().toString());
										//XCN.3 Second and further names (ST)
										if (mos.getName().getMiddleNameIsNotNull())
											pv1.getConsultingDoctor(xcnCount).getSecondAndFurtherGivenNamesOrInitialsThereof().setValue(mos.getName().getMiddleName().toString());
										//XCN.5 Prefix (ST)
										if (mos.getName().getTitleIsNotNull())
											pv1.getConsultingDoctor(xcnCount).getPrefixEgDR().setValue(mos.getName().getTitle().toString());
									}
									
									if (map.getTaxonomyNameIsNotNull())
									{
										//XCN.9 Assigning authority (HD)
										pv1.getConsultingDoctor(xcnCount).getAssigningAuthority().getNamespaceID().setValue(map.getTaxonomyName().toString());
										//XCN.10 Name type code (ID)
										pv1.getConsultingDoctor(xcnCount).getNameTypeCode().setValue(taxTypeText);
									}
									
									xcnCount ++;
									
								}
							}							
						}
					}
					
					else
						
					{ // No taxononmy mapping for Member of Staff - render only name details
						if (mos.getNameIsNotNull())
						{
							//XCN.1 Family name (ST)
							if (mos.getName().getSurnameIsNotNull())
								pv1.getConsultingDoctor(xcnCount).getFamilyName().getSurname().setValue(mos.getName().getSurname().toString());
							//XCN.2 Given name (ST)
							if (mos.getName().getForenameIsNotNull())
								pv1.getConsultingDoctor(xcnCount).getGivenName().setValue(mos.getName().getForename().toString());
							//XCN.3 Second and further names (ST)
							if (mos.getName().getMiddleNameIsNotNull())
								pv1.getConsultingDoctor(xcnCount).getSecondAndFurtherGivenNamesOrInitialsThereof().setValue(mos.getName().getMiddleName().toString());
							//XCN.5 Prefix (ST)
							if (mos.getName().getTitleIsNotNull())
								pv1.getConsultingDoctor(xcnCount).getPrefixEgDR().setValue(mos.getName().getTitle().toString());
							
							xcnCount ++;
							
						}
					}
				}
			}
		}
		
		LOG.debug("VoMapper renderSessionListOwnerVoCollToConsultingDoctor: exit");
	}
	
	
	// http://jira/browse/WDEV-22006
	protected final void renderPatientVoToNK1(Patient patient, Message message, ProviderSystemVo provider) throws Exception
	{
		Boolean isConfidential = patient.getIsConfidential();

		int NK1Iteration = 0;
		NK1 nk1;
		
		if (patient.getPDSrelativesIsNotNull()
				&& patient.getPDSrelatives().size() > 0)
		{
			for (int i=0; i < patient.getPDSrelatives().size(); i++)
			{
				PatRelative patRelative = patient.getPDSrelatives().get(i);
				if (message instanceof ADT_A01)
					nk1 = ((ADT_A01) message).getNK1(NK1Iteration);
				else
					nk1 = ((ADT_A05) message).getNK1(NK1Iteration);
				Integer setId = Integer.valueOf(NK1Iteration) + 1;
				if (message instanceof ADT_A01)
					((ADT_A01) message).getNK1(NK1Iteration).getSetIDNK1().setValue(setId.toString());
				else
					((ADT_A05) message).getNK1(NK1Iteration).getSetIDNK1().setValue(setId.toString());
				renderPatRelativeVoToNK1(patRelative, nk1, provider, isConfidential);
				NK1Iteration ++;
			}
		} 
		else
		{
			if (patient.getNok() != null)
			{
				if (message instanceof ADT_A01)
					nk1 = ((ADT_A01) message).getNK1(NK1Iteration);
				else
					nk1 = ((ADT_A05) message).getNK1(NK1Iteration);
				Integer setId = Integer.valueOf(NK1Iteration) + 1;
				if (message instanceof ADT_A01)
					((ADT_A01) message).getNK1(NK1Iteration).getSetIDNK1().setValue(setId.toString());
				else
					((ADT_A05) message).getNK1(NK1Iteration).getSetIDNK1().setValue(setId.toString());
				renderNextOfKinVoToNK1(patient.getNok(), nk1, provider, isConfidential);
				NK1Iteration ++;
			}
		}
		
		if (patient.getSupportNetworkFamilyIsNotNull() && ConfigFlag.HL7.HL7_INCLUDE_FAMILY_SUPPORT.getValue())
		{
			for (int i=0; i < patient.getSupportNetworkFamily().size(); i++)
			{
				if(patient.getSupportNetworkFamily().get(i).getInactivatingDateTime() == null)
				{
					if (message instanceof ADT_A01)
						nk1 = ((ADT_A01) message).getNK1(NK1Iteration);
					else
						nk1 = ((ADT_A05) message).getNK1(NK1Iteration);
					Integer setId = Integer.valueOf(NK1Iteration) + 1;
					if (message instanceof ADT_A01)
						((ADT_A01) message).getNK1(NK1Iteration).getSetIDNK1().setValue(setId.toString());
					else
						((ADT_A05) message).getNK1(NK1Iteration).getSetIDNK1().setValue(setId.toString());
					renderSupportNetworkFamilyVoToNK1(patient.getSupportNetworkFamily().get(i), nk1, provider, isConfidential);
					NK1Iteration++;
				}
			}
		} 
	}

	
	// http://jira/browse/WDEV-22237
	protected final void renderCommChannelVoCollToPID(CommChannelVoCollection comChannelVoCollection, PID pid, ProviderSystemVo providerSystem) throws Exception
	{
		/*
		  Components:  [NNN] [(999)]999-9999 [X99999] [B99999] [C any text] ^ <telecommunication use code (ID)> ^ <tele-communication equipment type (ID)> 
		               ^ <email address (ST)> ^ <country code (NM)> ^ <area/city code (NM)> ^ <phone number (NM)> ^ <extension (NM)> ^ <any text (ST)>
		               
		   Lookup PDSChannelUsage:
			H = Home Contact
			HP = Home
			HV = Home Vacation
			MC = Mobile
			PG = Pager
			WP = Office Address
			AS = Answering Machine
			EC = Emergency Contact
			
			Lookup ChannelType:
			GEN_PHONE
			HOME_PHONE
			WORK_PHONE
			MOBILE
			EMAIL
			WEB
			FAX
			BEEP
			EMERGENCY
		 */

		int xtnHomePhoneIter = 0;
		int xtnBusinessPhoneIter = 0;

		Boolean isPrimaryResidenceNumberAssigned = Boolean.FALSE;
				
		for (int i = 0; i < comChannelVoCollection.size(); i++)
		{
			CommChannelVo commChannel = comChannelVoCollection.get(i);
			
			Boolean isWorkAddressChannelUsage = Boolean.FALSE;
			Boolean isValidCommChannel = Boolean.TRUE;
			
			if (ChannelType.WORK_PHONE.equals (commChannel.getChannelType()))
			{
				if (commChannel.getCommValue() != null 
						&& isEmail(commChannel.getCommValue()))
				{
					/*
					 * commChannel.getCommValue() is actually an email address
					 * and configuration flag INCLUDE_EMAIL_FORMATTED_WORK_NUMBERS is FALSE
					 * Skip the processing of the Comm Channel
					 */	
					isValidCommChannel = Boolean.FALSE;
				}
			}

			if (commChannel.getCommValue() != null
					&& isValidCommChannel)
			{
				//----------------------------------------------
				// XTN.0 [(999)] 999-9999 [X99999] [C any text]
				
				//----------------------------------------------
				// XTN.1 telecommunication use code (ID)
	
				/*
				 *  Has a PDSChannelUsage value been assigned to this Comm Channel?
				 */
				if (commChannel.getChannelUsage() != null
						&& !(commChannel.getChannelUsage().getID() == 0))
				{
					/*
					 *  Is there a provider system external value mapping defined for this PDSChannelUsage lookup?
					 */
					String extCodeForChannelUsage = svc.getRemoteLookup(commChannel.getChannelUsage().getID(), providerSystem.getCodeSystem().getText());
					if (extCodeForChannelUsage != null)
					{
						if (PDSChannelUsage.WP.equals(commChannel.getChannelUsage()))
						{
							pid.getPhoneNumberBusiness(xtnBusinessPhoneIter).getTelecommunicationUseCode().setValue(extCodeForChannelUsage);
							isWorkAddressChannelUsage = Boolean.TRUE;
						}
						else
						{
							pid.getPhoneNumberHome(xtnHomePhoneIter).getTelecommunicationUseCode().setValue(extCodeForChannelUsage);
						}
					}
					else
					{
						/*
						 * No provider system external value mapping defined for PDSChannelUsage lookup - use the lookup text values
						 */
						if (PDSChannelUsage.WP.equals(commChannel.getChannelUsage()))
						{
							pid.getPhoneNumberBusiness(xtnBusinessPhoneIter).getTelecommunicationUseCode().setValue(commChannel.getChannelUsage().getText());
							isWorkAddressChannelUsage = Boolean.TRUE;
						}
						else
						{
							pid.getPhoneNumberHome(xtnHomePhoneIter).getTelecommunicationUseCode().setValue(commChannel.getChannelUsage().getText());
						}
					}
				}
				
				/*
				 *  No PDSChannelUsage value defined - use HL7 standard values based on ChannelType lookup
				 */
				else if (ChannelType.GEN_PHONE.equals(commChannel.getChannelType())
							|| ChannelType.HOME_PHONE.equals(commChannel.getChannelType())
							|| ChannelType.MOBILE.equals(commChannel.getChannelType()))
				{
					if (isPrimaryResidenceNumberAssigned)
					{
						pid.getPhoneNumberHome(xtnHomePhoneIter).getTelecommunicationUseCode().setValue("ORN");					
					}
					else
					{
						pid.getPhoneNumberHome(xtnHomePhoneIter).getTelecommunicationUseCode().setValue("PRN");
						isPrimaryResidenceNumberAssigned = Boolean.TRUE;
					}
				} 
	
				else if (ChannelType.WORK_PHONE.equals(commChannel.getChannelType()))
				{
					pid.getPhoneNumberBusiness(xtnBusinessPhoneIter).getTelecommunicationUseCode().setValue("WPN");
					isWorkAddressChannelUsage = Boolean.TRUE;
				}
	
				else if (ChannelType.EMERGENCY.equals(commChannel.getChannelType()))
				{
					pid.getPhoneNumberHome(xtnHomePhoneIter).getTelecommunicationUseCode().setValue("EMR");
				}
	
				else if (ChannelType.BLEEP.equals(commChannel.getChannelType()))
				{
					if (isWorkAddressChannelUsage)
					{
						pid.getPhoneNumberBusiness(xtnBusinessPhoneIter).getTelecommunicationUseCode().setValue("BPN");
					}
					else
					{
						pid.getPhoneNumberHome(xtnHomePhoneIter).getTelecommunicationUseCode().setValue("BPN");
					}
				}
				
				else if (ChannelType.EMAIL.equals(commChannel.getChannelType()) 
						|| ChannelType.WEB.equals(commChannel.getChannelType()))
				{
					if (isWorkAddressChannelUsage)
					{
						pid.getPhoneNumberBusiness(xtnBusinessPhoneIter).getTelecommunicationUseCode().setValue("NET");
					}
					else
					{
						pid.getPhoneNumberHome(xtnHomePhoneIter).getTelecommunicationUseCode().setValue("NET");
					}
				}
	
	
				//----------------------------------------------
				// XTN.2 tele-communication equipment type (ID)
				if (commChannel.getChannelType() != null
						&& !(commChannel.getChannelType().getID() == 0))
				{
					/*
					 *  Is there a provider system mapping defined for ChannelType lookup?
					 */
					String channelType = svc.getRemoteLookup(commChannel.getChannelType().getID(), providerSystem.getCodeSystem().getText());
					if (channelType != null)
					{
						if (ChannelType.WORK_PHONE.equals(commChannel.getChannelType())
								|| isWorkAddressChannelUsage)
						{
							pid.getPhoneNumberBusiness(xtnBusinessPhoneIter).getTelecommunicationEquipmentType().setValue(channelType);
						}
						else
						{
							pid.getPhoneNumberHome(xtnHomePhoneIter).getTelecommunicationEquipmentType().setValue(channelType);
						}
					}
	
					/*
					 *  No provider system mapping found for assigned ChannelType lookup - use HL7 standard values			
					 */
					else if (ChannelType.EMERGENCY.equals  (commChannel.getChannelType())
							|| ChannelType.GEN_PHONE.equals  (commChannel.getChannelType()) 
							|| ChannelType.HOME_PHONE.equals (commChannel.getChannelType()))
					{
						if (isWorkAddressChannelUsage)
						{
							pid.getPhoneNumberBusiness(xtnBusinessPhoneIter).getTelecommunicationEquipmentType().setValue("PH");
						}
						else
						{
							pid.getPhoneNumberHome(xtnHomePhoneIter).getTelecommunicationEquipmentType().setValue("PH");
						}
					}
		
					else if (ChannelType.WORK_PHONE.equals (commChannel.getChannelType()))
					{
						pid.getPhoneNumberBusiness(xtnBusinessPhoneIter).getTelecommunicationEquipmentType().setValue("PH");
					}
		
					else if (ChannelType.FAX.equals(commChannel.getChannelType())) 
					{
						if (isWorkAddressChannelUsage)
						{
							pid.getPhoneNumberBusiness(xtnBusinessPhoneIter).getTelecommunicationEquipmentType().setValue("FX");
						}
						else
						{
							pid.getPhoneNumberHome(xtnHomePhoneIter).getTelecommunicationEquipmentType().setValue("FX");
						}
					}
		
					else if (ChannelType.MOBILE.equals(commChannel.getChannelType()))
					{
						if (isWorkAddressChannelUsage)
						{
							pid.getPhoneNumberBusiness(xtnBusinessPhoneIter).getTelecommunicationEquipmentType().setValue("CP");
						}
						else
						{
							pid.getPhoneNumberHome(xtnHomePhoneIter).getTelecommunicationEquipmentType().setValue("CP");
						}
					}
		
					else if (ChannelType.EMAIL.equals(commChannel.getChannelType())
							|| ChannelType.WEB.equals(commChannel.getChannelType()))
					{
						if (isWorkAddressChannelUsage)
						{
							pid.getPhoneNumberBusiness(xtnBusinessPhoneIter).getTelecommunicationEquipmentType().setValue("Internet");
						}
						else
						{
							pid.getPhoneNumberHome(xtnHomePhoneIter).getTelecommunicationEquipmentType().setValue("Internet");
						}
					}
		
		
					else if (ChannelType.BLEEP.equals(commChannel.getChannelType()))
					{
						if (isWorkAddressChannelUsage)
						{
							pid.getPhoneNumberBusiness(xtnBusinessPhoneIter).getTelecommunicationEquipmentType().setValue("BP");
						}
						else
						{
							pid.getPhoneNumberHome(xtnHomePhoneIter).getTelecommunicationEquipmentType().setValue("BP");
						}
					}
				}
	
				
				//----------------------------------------------
				// XTN.3 email address (ST)
				if (ChannelType.EMAIL.equals(commChannel.getChannelType()))
				{
					if (isWorkAddressChannelUsage)
					{
						pid.getPhoneNumberBusiness(xtnBusinessPhoneIter).getEmailAddress().setValue(commChannel.getCommValue());
					}
					else
					{
						pid.getPhoneNumberHome(xtnHomePhoneIter).getEmailAddress().setValue(commChannel.getCommValue());
					}
				}
	
				//----------------------------------------------
				// XTN.4 country code (NM)
				// XTN.5 area/city code (NM)
				// XTN.6 phone number (NM)
				// XTN.7 extension (NM)
				
				//----------------------------------------------
				// XTN.8 any text (ST)
				if (commChannel.getCommValue() != null && !ChannelType.EMAIL.equals(commChannel.getChannelType()))
				{
					if (ChannelType.WORK_PHONE.equals(commChannel.getChannelType())
							|| isWorkAddressChannelUsage)
					{
						pid.getPhoneNumberBusiness(xtnBusinessPhoneIter).getAnyText().setValue(commChannel.getCommValue());
					}
					else
					{
						pid.getPhoneNumberHome(xtnHomePhoneIter).getAnyText().setValue(commChannel.getCommValue());
					}
				}
	
				/*
				 * Update correct XTN iteration
				 */
				if (ChannelType.WORK_PHONE.equals(commChannel.getChannelType())
						|| isWorkAddressChannelUsage)
				{
					xtnBusinessPhoneIter ++;
				}
				else
				{
					xtnHomePhoneIter ++;
				}

			}
			
		}
		
	}

	//WDEV-22624
	protected final void renderPatientDetailsToPD1(Patient fullPatient, PD1 pd1, ProviderSystemVo providerSystem) throws Exception
	{
		// PD1-2 Living arrangment (IS)
		// Note: Non-standard use of this field. It is being populated with the patient's occupation
		if (fullPatient != null
				&& fullPatient.getOccupationIsNotNull())
		{
			pd1.getLivingArrangement().setValue(svc.getRemoteLookup(fullPatient.getOccupation().getID(),providerSystem.getCodeSystem().getText()));
		}
		else if(fullPatient!=null 
			&&fullPatient.getTxtOccupationIsNotNull()&&!fullPatient.getTxtOccupation().isEmpty()) //http://jira/browse/WDEV-22888
		{
			pd1.getLivingArrangement().setValue(fullPatient.getTxtOccupation());
		}
		
	} 
	
	
	
//	//WDEV-22750
//	protected final void renderPatientMedicalInsuranceToIN1(PatientMedicalInsuranceVo medicalInsurance, IN1 in1, ProviderSystemVo providerSystem) throws HL7Exception
//	{
//		if (medicalInsurance == null || in1 == null || providerSystem == null)
//		{
//			return;
//		}
//		
//		//IN1-2 Insurance Plan.Identifier (ST)
//		if (medicalInsurance.getPolicyTypeIsNotNull()&&!(medicalInsurance.getPolicyType().getID()==(PrivateInsurancePolicyType.OTHER.getID())))
//		{
//			in1.getInsurancePlanID().getIdentifier().setValue(svc.getRemoteLookup(medicalInsurance.getPolicyType().getID(), providerSystem.getCodeSystem().getText()));
//		}
//		else if (medicalInsurance.getPlanOrUnitsIsNotNull())
//		{
//			in1.getInsurancePlanID().getIdentifier().setValue(medicalInsurance.getPlanOrUnits());
//		}
//		
//		//IN1-3 Insurance Company ID.ID (ST)
//		if (medicalInsurance.getCompanyIsNotNull() 
//				&& medicalInsurance.getCompany().getCodeMappingsIsNotNull())
//		{
//			String companyName  = medicalInsurance.getCompany().getCodeMappings().getMappingValue(providerSystem.getCodeSystem());
//			in1.getInsuranceCompanyID(0).getID().setValue(companyName);
//		}
//		
//		//IN1-13 Expiration Date (DT)
//		if (medicalInsurance.getExpiryDateIsNotNull())
//		{
//			in1.getPlanExpirationDate().setValue(medicalInsurance.getExpiryDate().toString(DateFormat.ISO));
//		}
//
//		//IN1-36 Policy Number (ST)
//		if (medicalInsurance.getPolicyNumberIsNotNull())
//		{
//			in1.getPolicyNumber().setValue(medicalInsurance.getPolicyNumber());
//		}
//	}
//	
//	protected final void renderInsuranceToIN1(NationalHealthCoverVo insurance, IN1 in1, ProviderSystemVo providerSystem) throws HL7Exception
//	{
//		if (insurance!=null || in1==null || providerSystem==null)
//		{
//		// Medical Card / Insurance	
//		
//			in1.getSetIDIN1().setValue("1");
//			
//			//IN1-14-3 Authorization Information.Source (ST)
//			if (insurance.getEligibilityProofIsNotNull())
//			{
//				in1.getAuthorizationInformation().getSource().setValue(insurance.getEligibilityProof());
//			}
//			
//			//IN1-28 Pre-Admit Cert (PAC) (ST)
//			if (insurance.getHealthActCategoryIsNotNull())
//			{
//				in1.getPreAdmitCert().setValue(svc.getRemoteLookup(insurance.getHealthActCategory().getID(), providerSystem.getCodeSystem().getText()));
//			}
//			
//			//IN1-29-1 Verification Date/Time.Time of an event (ST)
//			if (insurance.getMedicalCardExpiryDateIsNotNull())
//			{
//				in1.getVerificationDateTime().getTimeOfAnEvent().setValue(insurance.getMedicalCardExpiryDate().toString(DateFormat.ISO));
//			}
//
//			//IN1-32 Billing Status (IS)
//			if (insurance.getMedicalCardProvedIsNotNull())
//			{
//				in1.getBillingStatus().setValue(svc.getRemoteLookup(insurance.getMedicalCardProved().getID(), providerSystem.getCodeSystem().getText()));
//			}
//
//			//IN1-35 Company Plan Code (IS)
//			if (insurance.getMedicalCardNoIsNotNull())
//			{
//				in1.getCompanyPlanCode().setValue(insurance.getMedicalCardNo());
//			}	
//		}
//	}
//	
//	protected final void renderEHICToIN1(NationalHealthCoverVo insurance, IN1 in1,ProviderSystemVo providerSystem) throws HL7Exception 
//	{
//		if (insurance != null || in1 == null || providerSystem == null)
//		{
//			in1.getSetIDIN1().setValue("2");
//			
//			//IN1-2 Insurance Plan.Identifier (ST)
//			in1.getInsurancePlanID().getIdentifier().setValue("EHIC");
//			
//			//IN1-3 Insurance Company ID.ID (ST)
//			in1.getInsuranceCompanyID(0).getID().setValue("EHIC");
//						
//			//IN1-4-1 Insurance Company Name.Organization Name (ST)
//			if (insurance.getEHICInstitutionCodeIsNotNull())
//			{
//				in1.getInsuranceCompanyName(0).getOrganizationName().setValue(svc.getRemoteLookup(insurance.getEHICInstitutionCode().getID(),providerSystem.getCodeSystem().getText()));
//			}
//
//			//IN1-5-6 Insurance Company Address.Country (ID)
//			if (insurance.getEHICCountryIsNotNull())
//			{
//				in1.getInsuranceCompanyAddress(0).getCountry().setValue(svc.getRemoteLookup(insurance.getEHICCountry().getID(),providerSystem.getCodeSystem().getText()));
//			}
//
//			//IN1-13 Expiration Date (DT)
//			if (insurance.getEHICExpiryDateIsNotNull())
//			{
//				in1.getPlanExpirationDate().setValue(insurance.getEHICExpiryDate().toString(DateFormat.ISO));
//			}
//
//			//IN1-36 Policy Number (ST)
//			if (insurance.getEHICNumberIsNotNull())
//			{
//				in1.getPolicyNumber().setValue(insurance.getEHICNumber());
//			}	
//		}	
//	} //WDEV-22750
	
	
	
}


