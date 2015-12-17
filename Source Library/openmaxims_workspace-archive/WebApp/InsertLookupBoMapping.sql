
if object_id('applookup_type_col_map') is not null
begin
	DROP TABLE applookup_type_col_map
end
go
CREATE TABLE applookup_type_col_map 
(
    table_name  varchar(50)   NOT NULL,
    col_name    varchar(50)   NOT NULL,
    type_id     int           NOT NULL,
    bo_name     varchar(50)   NOT NULL,
    bo_field    varchar(50)   NOT NULL,
    CONSTRAINT applookup_type_col_map_pk
   	PRIMARY KEY CLUSTERED (table_name, col_name)
)
go
grant all on applookup_type_col_map to ims_dml	
go

insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_phygfeet', 'lkp_patientatt', 1021014, 'PersonalHygieneFeet', 'patientAttendChiropodist')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_documentcatego', 'lkp_category', 1021220, 'DocumentCategoryConfig', 'category')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_brthcomp', 'lkp_breathingt', 1001047, 'BreathingComponent', 'breathingTreatment')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_inpat_epis', 'lkp_readmissio', 1021257, 'InpatientEpisode', 'readmissionType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('asse_assessmentpatq', 'lkp_isanswered', 1271000, 'PatientAssessmentQuestion', 'isAnswered')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_eatswall', 'lkp_swallowabi', 1011048, 'EatingSwallowingDetails', 'swallowAbility')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('edis_ttamedicationd', 'lkp_durationun', 1231112, 'TTAMedicationDetail', 'durationUnit')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_pendingelectiv', 'lkp_management', 1021255, 'PendingElectiveAdmission', 'managementIntention')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_triagepriority', 'lkp_priorityb8', 1021145, 'TriagePriorityKPConfig', 'priorityBreachedKPIFlashingText')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_propertyitem', 'lkp_item', 1001075, 'PropertyItem', 'item')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('spin_resplungfields', 'lkp_lungfield', 1051135, 'RespLungFields', 'lungField')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_sportsactivity', 'lkp_c_sele', 1021145, 'SportsActivity', 'select')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_specimencolle3', 'lkp_c_ti', 1161041, 'SpecimenCollectionListConfigDetails', 'time')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_workonadmissio', 'lkp_referdea', 1021014, 'WorkOnAdmission', 'referDEA')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_patienthomesit', 'lkp_bathroomlo', 1231055, 'PatientHomeSituation', 'bathroomLocation')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_eatswall', 'lkp_status', 1021014, 'EatingSwallowingDetails', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_allergiesdetai', 'lkp_sourceofin', 1021033, 'PatientAllergy', 'sourceofInformation')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_rta', 'lkp_rtatype', 1291006, 'RTA', 'rTAType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_emergencyepiso', 'lkp_sourceofre', 1291000, 'EmergencyEpisode', 'sourceOfReferral')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_adviceleaflets', 'lkp_adviceleaf', 1021006, 'AdviceLeaflets', 'adviceLeaflet')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_dementiafind', 'lkp_camsaltere', 1021145, 'DementiaFind', 'cAMSAlteredLevel')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_userworkqueue', 'lkp_procedurec', 1021098, 'UserWorkQueue', 'procedureContext')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_skinassrev', 'lkp_secondaryd', 1001036, 'SkinAssessmentReview', 'secondaryDressing')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_neuexamsensbo', 'lkp_franklegra', 1051131, 'NeuExamSens', 'frankleGrade')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_patienthomesit', 'lkp_accomtype', 1231047, 'PatientHomeSituation', 'accomType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_contractconfig', 'lkp_contractty', 1021266, 'ContractConfig', 'contractType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('pthw_target', 'lkp_targetdate', 1321012, 'Target', 'targetDateCalculation')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_hospitalatnipd', 'lkp_typeofrequ', 1231119, 'HospitalAtNightPatientDetail', 'typeOfRequest')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_ventilationtra', 'lkp_patientint', 1021014, 'VentilationTracheostomy', 'patientIntubated')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_hcgtestitem', 'lkp_serumhcg', 1291040, 'HCGTestItem', 'serumHCG')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_emergencyepiso', 'lkp_category', 1291002, 'EmergencyEpisode', 'category')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_printagent', 'lkp_jobtype', 1101047, 'PrintAgent', 'jobType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_patientmeetinv', 'lkp_status', 1231014, 'PatientMeetingInvitee', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_referralsrecor', 'lkp_referralpr', 1021193, 'ReferralsRecording', 'referralPriority')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_hospitalatnipd', 'lkp_clinicalta', 1231120, 'HospitalAtNightPatientDetail', 'clinicalTasks')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('pthw_event', 'lkp_status', 1021124, 'Event', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_hist_outpat_at', 'lkp_cancellati', 1141007, 'HistoricOutpatientAttendance', 'cancellationReason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('edis_ttamedicationd', 'lkp_form', 1231071, 'TTAMedicationDetail', 'form')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_attendancerequ', 'lkp_status', 1291049, 'AttendanceRequiringContracting', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_thermalactivit', 'lkp_laterality', 1021032, 'ThermalActivity', 'laterality')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_carecontext', 'lkp_locationty', 1021093, 'CareContext', 'locationType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_electrotherap7', 'lkp_frequency', 1051043, 'ElectrotherapyUltrasoundTreatment', 'frequency')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_opdfertilitycl', 'lkp_treatments', 1051127, 'OPDFertClinic', 'treatmentsoffered')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_skinassfind', 'lkp_pressureso', 1001028, 'SkinAssessmentFindings', 'pressureSoreGrade')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_splintdetails', 'lkp_splinttype', 2287, 'SplintDetails', 'splintType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_phlebotomyroun', 'lkp_roundtocol', 1161041, 'PhlebotomyRound', 'roundToCollect')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_container', 'lkp_volumeunit', 1161009, 'Container', 'volumeUnits')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_whiteboardques', 'lkp_genderspec', 1031002, 'WhiteBoardQuestionConfig', 'genderSpecific')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_patientspecial', 'lkp_specialnee', 1021217, 'PatientSpecialNeed', 'specialNeed')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_wheelchaircush', 'lkp_cushioncat', 1051062, 'WheelchairCushion', 'cushionCategory')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_internalrefer2', 'lkp_referralou', 1251090, 'InternalReferralOutcome', 'referralOutcome')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_cliniciannoted', 'lkp_status', 1021124, 'ClinicianNoteDefaultTextConfig', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_thermalactivit', 'lkp_thermal', 1051024, 'ThermalActivity', 'thermal')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_triage', 'lkp_currenttr3', 1291020, 'Triage', 'currentTriagePriority')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_sessionparentc', 'lkp_status', 1141007, 'SessionParentChildSlot', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_careplanstatus', 'lkp_status', 1001044, 'CarePlanStatus', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_ordermessage', 'lkp_messagesta', 1161039, 'OrderMessage', 'messageStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_pathologydetai', 'lkp_synchronou', 1251038, 'PathologyDetails', 'synchronousTumourIndicator')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_communicationp', 'lkp_status', 1021014, 'CommunicationProblems', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_goalplanning', 'lkp_primecance', 1231042, 'GoalPlanning', 'primeCancelReason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('edis_dischargesumma', 'lkp_jobtype', 1231105, 'DischargeSummarySchedule', 'jobType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_pendingelectiv', 'lkp_electivead', 1021234, 'PendingElectiveAdmission', 'electiveAdmissionStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_tciforpatiente', 'lkp_kpiexceede', 1341047, 'TCIForPatientElectiveList', 'kPIExceededReason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_drugtoxicolog2', 'lkp_toxicology', 1291038, 'DrugToxicologyItem', 'toxicologyType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_appt_history_s', 'lkp_cancellati', 1141003, 'Appointment_Status', 'cancellationReason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_intraoperative', 'lkp_anaesthet3', 1231122, 'IntraOperativeCareRecord', 'anaestheticUsed')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_triagepriority', 'lkp_priorityb3', 1021145, 'TriagePriorityKPConfig', 'priorityBreachWarningKPIFlashingText')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_powerchairskil', 'lkp_powerchair', 1051065, 'PowerchairSkillsAssessment', 'powerchairSkill')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_cataractintrao', 'lkp_wasswabnee', 1021145, 'CataractIntraOperative', 'wasSwabNeedleCountCorrect')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_internalreferr', 'lkp_referralty', 1251092, 'InternalReferral', 'referralType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_datasettype', 'lkp_defaultlin', 1021174, 'DatasetType', 'defaultLineType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_fieldhelptext', 'lkp_field', 1041001, 'FieldHelpText', 'field')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_deathdetails', 'lkp_deathcause', 1021154, 'DeathDetails', 'deathCauseEstablished')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patient', 'lkp_sourceofin', 1021212, 'Patient', 'sourceOfInformation')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_eatcomp', 'lkp_difficulti', 1021014, 'EatingComponent', 'difficultiesWithSwallowing')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_teletherapydet', 'lkp_beamtype', 1251017, 'TeletherapyDetails', 'beamType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_organisation', 'lkp_c_ty', 1021067, 'Organisation', 'type')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_referralstatus', 'lkp_linkedrefe', 1341000, 'ReferralStatusConfig', 'linkedReferralStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('asse_graphicassessm', 'lkp_activestat', 1021124, 'GraphicAssessmentQuestion', 'activeStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_treatmentinte2', 'lkp_specialty', 621, 'TreatmentInterventionHotlist', 'specialty')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_safeenvironmen', 'lkp_riskofauto', 1021014, 'SafeEnvironmentComponent', 'riskOfAutonomicDysreflexia')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_skinpreperatio', 'lkp_skinprepar', 1231089, 'SkinPreperation', 'skinPreparationUsed')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_sch_booking', 'lkp_patientsta', 1021112, 'Sch_Booking', 'patientStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_resultcomponen', 'lkp_normalcyst', 1161037, 'ResultComponent', 'normalcyStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_dischargeservi', 'lkp_patientmob', 1021191, 'DischargeServicesAndAdvice', 'patientMobility')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_roomdetails', 'lkp_environmen', 1051179, 'RoomDetails', 'environmentVisitRoomType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_orderchangeres', 'lkp_msgtype', 1021260, 'OrderChangeResponseQueue', 'msgType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_patientabsentp', 'lkp_sourceofin', 1021033, 'PatientAbsentProcedure', 'sourceofInformation')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_outpat_att', 'lkp_appointme2', 1141007, 'OutpatientAttendance', 'appointmentStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_floorbedlayout', 'lkp_status', 1021124, 'FloorBedSpaceLayout', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_injurydetails', 'lkp_requiresve', 1021014, 'InjuryDetails', 'requiresVentillation')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_patactionstatu', 'lkp_actionsta2', 1281026, 'PatActionStatusPoint', 'actionStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_tiig', 'lkp_intendtoin', 1291029, 'TIIG', 'intendToInformPolice')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_configuredjob', 'lkp_frequency', 1021263, 'ConfiguredJob', 'frequency')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_electrotherap7', 'lkp_target', 1051040, 'ElectrotherapyUltrasoundTreatment', 'target')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_racppastmedica', 'lkp_examfindin', 1021247, 'RACPPastMedicalHistory', 'examFindings')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('asse_screeningprofi', 'lkp_contexttyp', 1021167, 'ScreeningProfile', 'contextType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patientconcern', 'lkp_concernsta', 1021079, 'PatientConcern', 'concernStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_catsreferral', 'lkp_additional', 1341007, 'CatsReferral', 'additionalInvApptsStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_resultcomponen', 'lkp_edsubtype', 1161053, 'ResultComponent', 'eDSubType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_softtissuemass', 'lkp_stmassagea', 904, 'SoftTissueMassage', 'sTMassageArea')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_wheelchaircush', 'lkp_cushionmod', 1051063, 'WheelchairCushion', 'cushionModification')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_racpreferral', 'lkp_sourceofre', 1021025, 'RACPReferral', 'sourceofReferral')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_racpplanadvice', 'lkp_advicegive', 1021248, 'RACPPlanAdvice', 'adviceGivenPatient')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_nurbowelcompon', 'lkp_bowelrout2', 1001059, 'NurBowelComponent', 'bowelRoutinePerformedBy')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_appt_history_s', 'lkp_priority', 1141009, 'Appointment_Status', 'priority')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_handtest', 'lkp_dominantha', 1121015, 'HandTest', 'dominantHand')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('asse_graphicgssessm', 'lkp_assessment', 1021137, 'GraphicAssessment', 'assessmentType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_appcontextvari', 'lkp_variablety', 1031010, 'AppContextVariable', 'variableType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_admissiondetai', 'lkp_specialty', 621, 'AdmissionDetail', 'specialty')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('edis_ttamedication', 'lkp_doseunit', 1021015, 'TTAMedication', 'doseUnit')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_bladskil', 'lkp_skills', 1011005, 'BladderSkills', 'skills')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_booking_appoin', 'lkp_priority', 1141009, 'Booking_Appointment', 'priority')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_dementiaassess', 'lkp_confirmtru', 1021145, 'DementiaAssessAndInvestigate', 'confirmTrustsProtocol')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('pthw_target', 'lkp_eventlinkt', 1321002, 'Target', 'eventLinkType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('adto_edattendanceme', 'lkp_queuetype', 1021259, 'EdAttendanceMessageQueue', 'queueType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_phygfeet', 'lkp_conditiono', 1011066, 'PersonalHygieneFeet', 'conditionOfFeet')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_rehabilitation', 'lkp_activityty', 1026, 'RehabilitationActivity', 'activityType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('icps_patienticpacts', 'lkp_variancety', 1181009, 'PatientICPActionStatus', 'varianceType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_mobilitycompon', 'lkp_mobilityai', 1001051, 'NurMobilityComponent', 'mobilityAids')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_deathdetails', 'lkp_cancerrela', 1021155, 'DeathDetails', 'cancerRelatedDeath')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_chartrequested', 'lkp_chartrequi', 1021145, 'ChartRequested', 'chartRequiredbyTriage')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_ordermessage', 'lkp_ordercateg', 1161000, 'OrderMessage', 'orderCategory')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_skinassrev', 'lkp_odour', 1001033, 'SkinAssessmentReview', 'odour')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('edis_futureplanfoll', 'lkp_followupi2', 1021130, 'FuturePlanFollowUp', 'followUpInUnit')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_dementiaworkli', 'lkp_reasonfore', 1021282, 'DementiaWorklistStatus', 'reasonForExclusion')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_patientwaitin4', 'lkp_electivel4', 1291057, 'PatientElectiveList', 'electiveListReason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_pathologydetai', 'lkp_specimenna', 1251043, 'PathologyDetails', 'specimenNature')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_electrotherap3', 'lkp_warninggiv', 1021014, 'ElectrotherapyPneumatic', 'warningGiven')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_commhear', 'lkp_hearingimp', 1021014, 'CommunicationHearing', 'hearingImpairment')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_booking_appoin', 'lkp_actcomplet', 1141006, 'Booking_Appointment', 'actCompleteFlag')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_vteriskassessm', 'lkp_lumbarpun2', 1021145, 'VTERiskAssessment', 'lumbarPuncturePrevious4hrs')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_propertyitem', 'lkp_status', 1001076, 'PropertyItem', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_inpat_epis', 'lkp_admissiont', 1021231, 'InpatientEpisode', 'admissionType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('icps_patienticpphss', 'lkp_status', 1181013, 'PatientICPPhaseStatus', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_imagingevents', 'lkp_investigat', 1251088, 'Imagingevents', 'investigationResult')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_dischargedepis', 'lkp_readmissio', 1021257, 'DischargedEpisode', 'readmissionType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_brachytherapyd', 'lkp_brachyther', 1251023, 'BrachytherapyDetails', 'brachytherapyType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_dementiatermco', 'lkp_field', 1041002, 'DementiaTermConfig', 'field')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_teletherapydet', 'lkp_hyperfract', 1021145, 'TeletherapyDetails', 'hyperfractionation')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_electivelistst', 'lkp_removaloth', 1341046, 'ElectiveListStatus', 'removalOtherReason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_emergencyatten', 'lkp_outcome', 1291014, 'EmergencyAttendance', 'outcome')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_brachytherapyd', 'lkp_anaestheti', 1251019, 'BrachytherapyDetails', 'anaestheticReq')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_vteriskassessm', 'lkp_obesity', 1021145, 'VTERiskAssessment', 'obesity')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patientnoaller', 'lkp_allergysta', 1021207, 'PatientNoAllergyInfo', 'allergyStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_clin_team', 'lkp_teamtype', 1021181, 'ClinicalTeam', 'teamType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_radiotherapy', 'lkp_hrg', 1251021, 'RadiotherapyDetails', 'hRG')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_commmob', 'lkp_bedtype', 1001016, 'MobilityComponent', 'bedType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_patientwaitin4', 'lkp_patientsta', 1341033, 'PatientElectiveList', 'patientStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_providersystem', 'lkp_primarypat', 624, 'ProviderSystem', 'primaryPatientId')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_strengtheningp', 'lkp_excercise', 1051069, 'StrengtheningProgram', 'excercise')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patientcorecli', 'lkp_supportne2', 1021209, 'PatientCoreClinicalData', 'supportNetworkServiceStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_carespellstatu', 'lkp_status', 1021275, 'CareSpellStatusHistory', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_pendingemergen', 'lkp_admissiont', 1021231, 'PendingEmergencyAdmission', 'admissionType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('hl7_inbound', 'lkp_messagetyp', 1411000, 'HL7Inbound', 'messageType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_sleepreferral', 'lkp_oximetryva', 1021146, 'SleepReferral', 'oximetryValues')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_ventilationtra', 'lkp_patientven', 1021014, 'VentilationTracheostomy', 'patientVentilated')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_inpatientdisch', 'lkp_outcome', 1231032, 'InpatientDischargeNoteFollowup', 'outcome')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_spinepath', 'lkp_modeofinju', 1051098, 'MskSpinePath', 'modeOfInjury')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_suitableforsur', 'lkp_anaestheti', 1231108, 'SuitableForSurgeryAssessment', 'anaestheticType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_deeptissuemass', 'lkp_dfmassagea', 2346, 'DeepFrictionMassage', 'dFMassageArea')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_paincomp', 'lkp_patientexp', 1021014, 'PainComponent', 'patientExperiencePainAnyTime')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('pthw_eventtarget', 'lkp_status', 1021124, 'EventTarget', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_pendingemergen', 'lkp_bedtypereq', 1021256, 'PendingEmergencyAdmission', 'bedTypeRequested')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('adto_patientdocumen', 'lkp_queuetype', 1021259, 'PatientDocumentMessageQueue', 'queueType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_triageprotasse', 'lkp_triageprio', 1291020, 'TriageProtocolAssessment', 'triagePriority')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('edis_summarydetail', 'lkp_c_secti', 1231114, 'SummaryDetail', 'section')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_skinassrev', 'lkp_frequencyo', 1001037, 'SkinAssessmentReview', 'frequencyOfChange')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_clin_contact', 'lkp_specialty', 621, 'ClinicalContact', 'specialty')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_outpat_att', 'lkp_cancellati', 1141007, 'OutpatientAttendance', 'cancellationReason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_surgicalopnote', 'lkp_followupt2', 1341032, 'SurgicalOpNotes', 'followUpTypeIn')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_vitalsigns', 'lkp_recordedsi', 1021058, 'VitalSigns', 'recordedSigns')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_trackingarea', 'lkp_areatype', 1291035, 'TrackingArea', 'areaType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_imagingevents', 'lkp_anatomical', 1251013, 'Imagingevents', 'anatomicalSite')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_wheelchairski2', 'lkp_wheelchair', 1051067, 'WheelchairSkills', 'wheelchairSkills')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_eatcomp', 'lkp_nutritiona', 1001014, 'EatingComponent', 'nutritionalMethod')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_deathcondition', 'lkp_causeofdea', 1021203, 'DeathConditions', 'causeofDeath')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_specimenworkli', 'lkp_listtype', 1161020, 'SpecimenWorkListItem', 'listType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patprocedure', 'lkp_incomplete', 1021274, 'PatientProcedure', 'incompleteReason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_orderentrytem2', 'lkp_divider', 1161019, 'OrderEntryTemplateComponent', 'divider')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('corr_noletterisrequ', 'lkp_specialtie', 621, 'NoLetterIsRequired', 'specialties')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_booking_appoin', 'lkp_outcomerea', 1031030, 'Booking_Appointment', 'outcomeReason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('edis_summary', 'lkp_ttastatus', 1231111, 'Summary', 'tTAStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patientcorecli', 'lkp_noallergys', 1021033, 'PatientCoreClinicalData', 'noAllergySourceofInformation')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patient', 'lkp_prefcommla', 1021280, 'Patient', 'prefCommLanguage')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_problemhotlist', 'lkp_specialty', 621, 'ProblemHotlist', 'specialty')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_commcaredet', 'lkp_userdefin3', 1331007, 'CommunityCareDetail', 'userDefinedField3')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_clin_contact', 'lkp_contacttyp', 1021092, 'ClinicalContact', 'contactType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_bowelostomy', 'lkp_ostomytype', 1001008, 'BowelOstomy', 'ostomyType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_awaitingclinic', 'lkp_clinicalin', 1341028, 'AwaitingClinicalInfo', 'clinicalInfoAwaiting')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('corr_clinicaccess', 'lkp_accessrigh', 1111005, 'ClinicAccess', 'accessRight')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_homedetails', 'lkp_accommodat', 2603, 'HomeDetails', 'accommodationType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_bloodsugar', 'lkp_timeperiod', 1021156, 'BloodSugar', 'timePeriod')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_systemreviewsy', 'lkp_absentpres', 1231015, 'SystemReviewSymptoms', 'absentPresent')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_surgicalaudpd', 'lkp_anaesthet6', 1231108, 'SurgicalAuditProcedureDetails', 'anaestheticUsed')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_dailypattern', 'lkp_dailypatte', 1021171, 'DailyPattern', 'dailyPatternType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_toolpmdt', 'lkp_equipmento', 1011094, 'PatientMovementHandlingDetails', 'equipmentOther')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_skinassrev', 'lkp_primarydre', 1001035, 'SkinAssessmentReview', 'primaryDressing')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_emotasses', 'lkp_assessment', 1011058, 'EmotionalStateAssessment', 'assessment')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patientnoalert', 'lkp_noalertsou', 1021033, 'PatientNoAlertInfo', 'noAlertSourceofInformation')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_nurse', 'lkp_specialty', 621, 'Nurse', 'specialty')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_referraloutcom', 'lkp_catsfinalr', 1341017, 'ReferralOutcome', 'catsFinalReportStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patientnosuppo', 'lkp_supportnet', 1021209, 'PatientNoSupportNetworkStatusInfo', 'supportNetworkStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_gaittreatment', 'lkp_orthosis', 1121013, 'GaitTreatment', 'orthosis')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_repositioningp', 'lkp_positionin', 1001049, 'RepositioningPlan', 'positioningFreq')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_drgrpref', 'lkp_status', 1021014, 'DressingandGroomingPreferences', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_specimenworkli', 'lkp_collection', 1161045, 'SpecimenWorkListItem', 'collectionStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_surgicalauditp', 'lkp_preopcheck', 1021145, 'SurgicalAuditPreOpChecks', 'preOpCheckDone')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patdiagnosis', 'lkp_basisofdia', 1021042, 'PatientDiagnosis', 'basisofDiagnosis')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_internalreferr', 'lkp_referralre', 1251092, 'InternalReferral', 'referralReason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('corr_templateassoci', 'lkp_specialtie', 621, 'TemplateAssociations', 'specialties')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_theatretrscolo', 'lkp_trackingst', 1231116, 'TheatreTrackingStatusColourConfig', 'trackingStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_painassrev', 'lkp_onset', 1001024, 'PainAssessmentReview', 'onset')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_alcohol', 'lkp_doyoudrink', 1021014, 'Alcohol', 'doYouDrinkAlcohol')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_racpsymptomris', 'lkp_diabetesst', 1231078, 'RACPSymptomRiskFactors', 'diabetesStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_plinthworktrea', 'lkp_treatment', 1121009, 'PlinthWorkTreatment', 'treatment')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_investigation', 'lkp_activestat', 1021124, 'Investigation', 'activeStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_trackingattend', 'lkp_prevstatus', 1291019, 'TrackingAttendanceStatus', 'prevStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_phygcomp', 'lkp_assisstanc', 1021014, 'PersonalHygieneComponent', 'assisstanceWithPersonalHygiene')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_medicationform', 'lkp_form', 1231071, 'MedicationForm', 'form')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_splintdetails', 'lkp_splintcate', 1041, 'SplintDetails', 'splintCategory')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_skinassfind', 'lkp_cleansedwi', 1001009, 'SkinAssessmentFindings', 'cleansedWith')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_respiratorytre', 'lkp_posturaldr', 1051109, 'RespiratoryTreatment', 'posturalDrainage')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_commcomp', 'lkp_difficulty', 1021014, 'CommunicationComponent', 'difficultyInCommunication')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_bowelmed', 'lkp_medication', 1011012, 'BowelMedication', 'medication')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_teletherapydet', 'lkp_preoperati', 1021145, 'TeletherapyDetails', 'preoperative')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_sch_session', 'lkp_consmediat', 1141025, 'Sch_Session', 'consMediaType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_wheelchairref', 'lkp_chairtype', 1051140, 'WheelchairReferral', 'chairType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_illicitdrugdet', 'lkp_substance', 1021123, 'IllicitDrugDetails', 'substance')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('edis_neonatal', 'lkp_feeding', 1331003, 'NeoNatal', 'feeding')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_mobilitycompon', 'lkp_orthosesus', 1051076, 'NurMobilityComponent', 'orthosesUsed')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_alternativeadu', 'lkp_adultspec2', 1161009, 'AlternativeAdultContainers', 'adultSpecVolUnit')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_tumourgroupspc', 'lkp_associated', 621, 'TumourGroupSpecialty', 'associatedSpecialty')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_roomdetails', 'lkp_homevisitr', 1051091, 'RoomDetails', 'homeVisitRoomType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_dementiaassess', 'lkp_q3currenty', 1021145, 'DementiaAssessAndInvestigate', 'q3CurrentYear')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_vteriskassessm', 'lkp_acutesurgi', 1021145, 'VTERiskAssessment', 'acuteSurgicalAdmission')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_medic', 'lkp_secondspec', 621, 'Medic', 'secondSpecialty')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_handjaymarfind', 'lkp_laterality', 1021063, 'HandJaymarFinding', 'laterality')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_primarytumourd', 'lkp_benign', 1021014, 'PrimaryTumourDetails', 'benign')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_episofcare', 'lkp_relationsh', 1021165, 'EpisodeOfCare', 'relationship')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patprocedure', 'lkp_procsite', 1021031, 'PatientProcedure', 'procSite')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_brthcough', 'lkp_sputumtype', 1011027, 'BreathingCough', 'sputumType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_electrothpneum', 'lkp_area', 2622, 'ElectrotherapyPneumaticTreatment', 'area')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_dischargedepis', 'lkp_admissiont', 1021231, 'DischargedEpisode', 'admissionType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_intraoperativd', 'lkp_instrument', 1021145, 'IntraOperativeDetails', 'instrumentCount')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_supportnetwor2', 'lkp_emergencyc', 1021018, 'SupportNetworkFamily', 'emergencyContactOrder')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_urinalysis', 'lkp_bilirubin', 1021062, 'Urinalysis', 'bilirubin')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_dischargedepis', 'lkp_methodofdi', 1021239, 'DischargedEpisode', 'methodOfDischarge')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_patientpmhche2', 'lkp_selected', 1021014, 'PatientPMHChecklistDiagnosis', 'selected')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_pattreatpl', 'lkp_surgeryreq', 1251094, 'PatTreatmentPlan', 'surgeryRequired')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('corr_cspdetail', 'lkp_specialint', 1111004, 'CorrespondenceDetails', 'specialInterest')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_racpeecg', 'lkp_protocol', 1231079, 'RACPExerciseECG', 'protocol')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patient', 'lkp_sex', 632, 'Patient', 'sex')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_chemocycledeta', 'lkp_dayonedeli', 1251098, 'ChemoCycleDetailsCCO', 'dayOneDeliveryCode')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_hist_outpat_at', 'lkp_appointme2', 1141007, 'HistoricOutpatientAttendance', 'appointmentStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_neuroreflexeso', 'lkp_othermodal', 1051108, 'NeuroReflexesOtherFindings', 'otherModality')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_infectcontrdet', 'lkp_result', 1011010, 'InfectionControlDetails', 'result')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_sleepfindings', 'lkp_answer', 1021014, 'SleepFindings', 'answer')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_containertypes', 'lkp_manufactur', 1161013, 'PathSpecimenContainer', 'manufacturer')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_alertsdetails', 'lkp_sourceofin', 1021033, 'PatientAlert', 'sourceofInformation')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patient', 'lkp_religion', 780, 'Patient', 'religion')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_safetylevel', 'lkp_status', 1021014, 'SafetyLevel', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_commcaredet', 'lkp_userdefin5', 1331009, 'CommunityCareDetail', 'userDefinedField5')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_gaittreatment', 'lkp_environmen', 1051074, 'GaitTreatment', 'environment')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_vteriskassessm', 'lkp_concurrent', 1021145, 'VTERiskAssessment', 'concurrentAnticoagulants')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_intraoperativd', 'lkp_needlecoun', 1021145, 'IntraOperativeDetails', 'needleCount')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_racpeecg', 'lkp_painexperi', 1361000, 'RACPExerciseECG', 'painExperienced')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_cleansinganddr', 'lkp_bathingpat', 1001053, 'CleansingandDressingComponent', 'bathingPattern')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_futureappointm', 'lkp_periodtype', 1021078, 'FutureAppointmentDetails', 'periodType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_pataction', 'lkp_plannedreg', 1251027, 'PatAction', 'plannedRegime')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_emergencyatten', 'lkp_attendanc2', 1021145, 'EmergencyAttendance', 'attendanceDataVerified')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_emergencyepiso', 'lkp_occupatio2', 1021157, 'EmergencyEpisode', 'occupationStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patprocedure', 'lkp_proclocati', 1021091, 'PatientProcedure', 'procLocation')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_cancercareplan', 'lkp_careplanin', 1251046, 'CancerCarePlan', 'carePlanIntent')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_primarytumourd', 'lkp_histologys', 1251061, 'PrimaryTumourDetails', 'histologySource')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_mskjbmovements', 'lkp_limited', 1051173, 'MskJointMovement', 'limited')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_electrotherap7', 'lkp_laterality', 1021032, 'ElectrotherapyUltrasoundTreatment', 'laterality')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_softtissuemass', 'lkp_stmassaget', 906, 'SoftTissueMassage', 'sTMassageType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_admissiondetai', 'lkp_resusstatu', 1021172, 'AdmissionDetails', 'resusStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_chartrequested', 'lkp_chartrecei', 1021145, 'ChartRequested', 'chartReceived')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_vteriskassessm', 'lkp_historyofv', 1021145, 'VTERiskAssessment', 'historyOfVTE')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_reviewpatiente', 'lkp_reviewtype', 1341048, 'ReviewPatientElectiveList', 'reviewType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_spircomp', 'lkp_belieforfa', 1021014, 'SpiritualityComponent', 'beliefOrFaith')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_tciforpatiente', 'lkp_planningel', 1341038, 'TCIForPatientElectiveList', 'planningElective')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_rededialmateri', 'lkp_material', 1051016, 'RemedialMaterial', 'material')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_opdfertilitycl', 'lkp_spermfroze', 1051126, 'OPDFertClinic', 'spermFrozen')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_opderectdysfxn', 'lkp_treatdiscu', 1021014, 'OPDErectDysfxn', 'treatDiscussed')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_surgerydetails', 'lkp_asagrade', 1021202, 'SurgeryDetails', 'aSAGrade')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_illicitdrugs', 'lkp_drugsused2', 1021014, 'IllicitDrugs', 'drugsUsedIntravenously')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_opderectdysfxn', 'lkp_advleaflet', 1021014, 'OPDErectDysfxn', 'advLeafletGiven')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_pendingtransfe', 'lkp_specialty', 621, 'PendingTransfers', 'specialty')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_sessionactivit', 'lkp_appointmen', 1141007, 'SessionActivityPathwayEvent', 'appointmentStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('icps_icp', 'lkp_c_ty', 11021117, 'ICP', 'type')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_illicitdrugdet', 'lkp_urinetestr', 1021118, 'IllicitDrugDetails', 'urineTestResult')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_needsassessmen', 'lkp_hadbooklet', 1021014, 'NeedsAssessment', 'hadBooklet')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_furthermanagem', 'lkp_tlttype', 1341022, 'FurtherManagement', 'tLTType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_attendancekpic', 'lkp_losbreach6', 1021145, 'AttendanceKPIConfig', 'losBreachedKPIFlashingText')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_nacscoring', 'lkp_c_ty', 1021134, 'NacScoring', 'type')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_painassrev', 'lkp_progressio', 1001025, 'PainAssessmentReview', 'progression')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_columndetail', 'lkp_c_colu', 1291016, 'ColumnDetail', 'column')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_hydrotherapy', 'lkp_equipment', 1051006, 'Hydrotherapy', 'equipment')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_charttypedatas', 'lkp_linetype', 1021174, 'ChartTypeDataset', 'lineType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_emergencyatte2', 'lkp_paymentref', 1021145, 'EmergencyAttendanceBilling', 'paymentRefunded')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('adto_edattendanceme', 'lkp_messagesta', 1161039, 'EdAttendanceMessageQueue', 'messageStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_accomhome', 'lkp_homefacili', 1011002, 'AccommodationHomeFacilities', 'homeFacilities')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_treatmentinter', 'lkp_treatment2', 1231134, 'TreatmentIntervention', 'treatmentInterventionType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_vitalsignsmoni', 'lkp_groupfrequ', 1021176, 'VitalSignsMonitoring', 'groupFrequency')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_drivingaspect', 'lkp_aspect', 1051084, 'DrivingAspect', 'aspect')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_deathdetails', 'lkp_postmortem', 1021267, 'DeathDetails', 'postMortem')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_cancerimagingh', 'lkp_specialty', 621, 'CancerImagingHotlist', 'specialty')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_opdfertilitycl', 'lkp_bladderdra', 1051117, 'OPDFertClinic', 'bladderDrainage')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_procedure', 'lkp_procedures', 1021096, 'Procedure', 'procedureStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_opdrelpres', 'lkp_relrelatio', 519, 'OPDRelPres', 'relRelationship')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_electrotreat', 'lkp_electrodes', 1051038, 'ElectrotherapyTensTreatment', 'electrodes')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_socialhistory', 'lkp_occupation', 625, 'SocialHistory', 'occupation')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_consultationou', 'lkp_dischargem', 1021190, 'ConsultationOutcome', 'dischargeMethod')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_containertypes', 'lkp_material', 1161014, 'PathSpecimenContainer', 'material')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_commsplg', 'lkp_communicat', 1011036, 'CommunicationSpeechAndLanguage', 'communicates')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_surgicalaudpd', 'lkp_checklistn', 1231132, 'SurgicalAuditProcedureDetails', 'checkListNotPerformedReason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_pattreatpl', 'lkp_patientsta', 3197, 'PatTreatmentPlan', 'patientStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_treatmentequip', 'lkp_c_ty', 1121011, 'TreatmentEquipmentConfig', 'type')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_dischargeoutco', 'lkp_dischargeo', 1341009, 'DischargeOutcome', 'dischargeOtherType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_suitableforsur', 'lkp_suitablefo', 1021014, 'SuitableForSurgeryAssessment', 'suitableForSurgery')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_surgeryassista', 'lkp_assistantg', 1021065, 'SurgeryAssistants', 'assistantGrade')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_clinicalnotes', 'lkp_sourceofno', 1021185, 'ClinicalNotes', 'sourceOfNote')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_careplaninterv', 'lkp_frequency', 1001087, 'CarePlanIntervention', 'frequency')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_sch_session', 'lkp_sessionsta', 1141004, 'Sch_Session', 'sessionStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_ventilationch2', 'lkp_c_mo', 1021068, 'VentilationChart', 'mode')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_mergedpatient', 'lkp_occupation', 625, 'MergedPatient', 'occupation')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_obsform', 'lkp_formtype', 1011006, 'ObservationForm', 'formType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_tgroupsitetnmv', 'lkp_clinicalpa', 1251084, 'TumourGroupSiteTNMValue', 'clinicalPathological')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('edis_failedemailsde', 'lkp_jobtype', 1231105, 'FailedEmailsDetails', 'jobType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_containertypes', 'lkp_additive', 1161016, 'PathSpecimenContainer', 'additive')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_careplantempli', 'lkp_frequency', 1001087, 'CarePlanTemplateIntervention', 'frequency')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('asse_userassessment', 'lkp_activestat', 1021124, 'UserAssessment', 'activeStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_spinepath', 'lkp_typeofinju', 1051153, 'MskSpinePath', 'typeOfInjury')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_vteriskassessm', 'lkp_surgerysig', 1021145, 'VTERiskAssessment', 'surgerySignificantMobilityReduction')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_servicefunctio', 'lkp_c_functi', 1021097, 'ServiceFunction', 'function')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patientcorecli', 'lkp_noalertsou', 1021033, 'PatientCoreClinicalData', 'noAlertSourceofInformation')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_neuinterpret', 'lkp_spinalsynd', 1051149, 'NeuInterpret', 'spinalSyndrome')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_erectdysfxtrea', 'lkp_tried', 1021014, 'OPDErectDysfxTreatments', 'tried')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_vteriskassessm', 'lkp_prophylaxi', 1231124, 'VTERiskAssessment', 'prophylaxisOffered')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_medprobonadmbo', 'lkp_specialty', 621, 'PatientProblem', 'specialty')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_equipment', 'lkp_fundedby', 1021086, 'Equipment', 'fundedBy')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_skinassrev', 'lkp_exudateamo', 1001031, 'SkinAssessmentReview', 'exudateAmount')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_gaitreeducatio', 'lkp_gaitaspect', 1051000, 'GaitReEducation', 'gaitAspect')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_investigationi', 'lkp_genderspec', 1031002, 'InvestigationIndex', 'genderSpecific')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_wheelchaircush', 'lkp_cushionacc', 1051064, 'WheelchairCushion', 'cushionAccessory')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_phygftfg', 'lkp_status', 1021032, 'PersonalHygieneFeetFindings', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_mskexamjointbd', 'lkp_bone', 1051138, 'MSkExamJointBonesDetail', 'bone')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_toolpmdt', 'lkp_movement', 1011092, 'PatientMovementHandlingDetails', 'movement')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_tiig', 'lkp_assaultwea', 1291027, 'TIIG', 'assaultWeapon')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('asse_userassessment', 'lkp_assessment', 1021137, 'UserAssessment', 'assessmentType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_surgerydetails', 'lkp_consultant', 1021201, 'SurgeryDetails', 'consultantPresence')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_tiig', 'lkp_genderofat', 1291031, 'TIIG', 'genderofAttacker')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_pathologydetai', 'lkp_servicere2', 1251042, 'PathologyDetails', 'serviceReportStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_dementiaconfig', 'lkp_admissiont', 1021226, 'DementiaConfiguration', 'admissionTypes')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_skinassrev', 'lkp_cleansedwi', 1001009, 'SkinAssessmentReview', 'cleansedWith')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_otherassessmen', 'lkp_assessmen2', 1271004, 'OtherAssessmentSummary', 'assessmentName')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_medicationdeta', 'lkp_sourceofin', 1021033, 'PatientMedication', 'sourceofInformation')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_mrsasitesresul', 'lkp_site', 1001065, 'MRSASitesResults', 'site')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_remedialactivi', 'lkp_activity', 1051017, 'RemedialActivity', 'activity')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_sch_session', 'lkp_cancellati', 1141003, 'Sch_Session', 'cancellationReason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_careplanmodali', 'lkp_treatmentm', 1251050, 'CarePlanModality', 'treatmentModality')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_radiotherapy', 'lkp_reasondel2', 1251102, 'RadiotherapyDetails', 'reasonDelay2')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_bedspace', 'lkp_wardtype', 1021228, 'BedSpace', 'wardType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_wheelchaircush', 'lkp_covertype', 1051145, 'WheelchairCushion', 'coverType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_reviewreferral', 'lkp_reviewtype', 1341014, 'ReviewReferralDetail', 'reviewType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_mskjbmovements', 'lkp_movetype', 1051128, 'MskJointMovement', 'moveType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_vteriskassessm', 'lkp_ageoversix', 1021145, 'VTERiskAssessment', 'ageOverSixty')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patprocedure', 'lkp_surgeonsgr', 1021065, 'PatientProcedure', 'surgeonsGrade')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_attendancekpic', 'lkp_awaitingc3', 1021145, 'AttendanceKPIConfig', 'awaitingClinicianBreachWarningKPIFlashingText')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_specimencolle3', 'lkp_dayofweek', 1161042, 'SpecimenCollectionListConfigDetails', 'dayOfWeek')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_dementiafind', 'lkp_camsinatte', 1021145, 'DementiaFind', 'cAMSInattention')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_functionaltra2', 'lkp_equipment', 1051046, 'FunctionalTransfersTechnique', 'equipment')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_diagnosismanag', 'lkp_patientcon', 1021145, 'DiagnosisManagement', 'patientConsent')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_valuable', 'lkp_hasvaluabl', 1021145, 'Valuable', 'hasValuable')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('icps_patienticpacts', 'lkp_status', 1181014, 'PatientICPActionStatus', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_phygactv', 'lkp_ability', 1211020, 'PersonalHygieneActivities', 'ability')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patient', 'lkp_occupation', 625, 'Patient', 'occupation')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_chemotherapyde', 'lkp_drugtherap', 1251026, 'ChemotherapyDetails', 'drugTherapyType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_locationdepart', 'lkp_defaultdep', 1291036, 'LocationDepartmentTypes', 'defaultDepartmentType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_rehabilitation', 'lkp_location', 1081, 'RehabilitationActivity', 'location')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_tiig', 'lkp_numberofat', 1291030, 'TIIG', 'numberOfAttackers')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_supportnetwor2', 'lkp_carerrelat', 1021017, 'SupportNetworkFamily', 'carerRelationship')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_ward_stay', 'lkp_wardtype', 1021228, 'WardStay', 'wardType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_emergencyatten', 'lkp_accompanie', 1291010, 'EmergencyAttendance', 'accompaniedBy')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_commvisn', 'lkp_visualimpa', 1021014, 'CommunicationVision', 'visualImpairment')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_triagepriority', 'lkp_triageprio', 1291020, 'TriagePriorityKPConfig', 'triagePriority')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_opderectdysfxn', 'lkp_actualtrea', 1051095, 'OPDErectDysfxn', 'actualTreatmentDiscussed')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_radiotherapy', 'lkp_treatement', 1251014, 'RadiotherapyDetails', 'treatementIntent')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_sportsactivity', 'lkp_sportsacti', 1051072, 'SportsActivity', 'sportsActivity')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_waitingtimesad', 'lkp_reasreferr', 1251053, 'WaitingTimesAdjustmentsandReasons', 'reasReferralFirstSeen')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_keydates', 'lkp_datetype', 1021152, 'KeyDates', 'dateType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patienttranspo', 'lkp_transport', 1141010, 'PatientTransportRequirements', 'transport')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_brthcomp', 'lkp_acutechron', 1211030, 'BreathingComponent', 'acuteChronic')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_intervchdet', 'lkp_assistance', 1001070, 'InterventionChartDetails', 'assistanceRequired')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_opdfertilitycl', 'lkp_semencultu', 1051122, 'OPDFertClinic', 'semenCulture')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_orderinvestiga', 'lkp_resultspec', , 'OrderInvestigation', 'resultSpecimenType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_actions', 'lkp_actionlist', 1011098, 'Actions', 'actionList')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('edis_dischargedetai', 'lkp_methodofdi', 1021239, 'DischargeDetails', 'methodOfDischarge')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_diathermyplate', 'lkp_diathermyt', 1231093, 'DiathermyPlateDetail', 'diathermyType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_orderspecimen', 'lkp_specimenso', 1161029, 'OrderSpecimen', 'specimenSource')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_pulse', 'lkp_pulserhyth', 1021052, 'Pulse', 'pulseRhythm')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_clinicalcontsh', 'lkp_status', 1021270, 'ClinicalContactStatusHistory', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('edis_summary', 'lkp_additonalc', 1231113, 'Summary', 'additonalClinicalInfo')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_chemotherapyde', 'lkp_txchangere', 1251029, 'ChemotherapyDetails', 'txChangeReason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_bladskil', 'lkp_dependency', 1211020, 'BladderSkills', 'dependency')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_drgractv', 'lkp_activities', 1011043, 'DressingandGroomingActivities', 'activities')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_opdfertilitycl', 'lkp_endoevalpe', 1051119, 'OPDFertClinic', 'endoEvalPerf')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_defaultedlocat', 'lkp_defaultdep', 1291008, 'DefaultEDLocationDeptType', 'defaultDeptType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_bladcont', 'lkp_problemtyp', 1011004, 'BladderContinence', 'problemType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_investigations', 'lkp_investigat', 1021087, 'Investigations', 'investigation')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_specimencolle2', 'lkp_listtype', 1161020, 'SpecimenCollectionListConfig', 'listType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_pendingtransfe', 'lkp_passpecial', 1021269, 'PendingTransfers', 'pASSpecialty')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('asse_userassessment', 'lkp_scoringmet', 1021135, 'UserAssessment', 'scoringMethod')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_admitassess', 'lkp_assessmen2', 1211029, 'AdmissionAssessment', 'assessmentStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_diagnosismanag', 'lkp_actionrequ', 1021145, 'DiagnosisManagement', 'actionRequiredByGP')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_electrotherap7', 'lkp_areatreate', 1051040, 'ElectrotherapyUltrasoundTreatment', 'areaTreated')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_boweldhr', 'lkp_pronetodia', 1021014, 'BowelDiarrhoea', 'proneToDiarrhoea')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_surgicalopnote', 'lkp_anaestheti', 1231108, 'SurgicalOperationNotes', 'anaestheticGiven')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_painassfind', 'lkp_onset', 1001024, 'PainAssessmentFindings', 'onset')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_pas_event', 'lkp_episodefin', 1161035, 'PASEvent', 'episodeFinancialClass')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_needsassessmen', 'lkp_needassess', 1231016, 'NeedsAssessment', 'needAssessmentNumber')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_surgerydetails', 'lkp_specialtyf', 1231060, 'SurgeryDetails', 'specialtyFunctionCode')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_cancercareplan', 'lkp_currentsta', 1251074, 'CancerCarePlan', 'currentStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_edtransfer', 'lkp_tohospital', 1291050, 'EDTransfer', 'toHospital')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_medicationdeta', 'lkp_contextrec', 1021076, 'PatientMedication', 'contextRecorded')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_mdtmeeting', 'lkp_listpatien', 1231017, 'MDTMeeting', 'listPatientisOn')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_racpeecg', 'lkp_interpreta', 1231085, 'RACPExerciseECG', 'interpretation')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_localanaesthet', 'lkp_localanaes', 1231098, 'LocalAnaestheticAdministered', 'localAnaesthetic')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_investigationa', 'lkp_attendence', 1291046, 'InvestigationAttendenceDetail', 'attendenceInvestigation')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_sess_slot', 'lkp_directacce', 1141014, 'Session_Slot', 'directAccessSlot')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_specimencollec', 'lkp_listtype', 1161020, 'SpecimenCollectionStatus', 'listType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_pathologydetai', 'lkp_investigat', 1251036, 'PathologyDetails', 'investigationType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('spin_patientsocials', 'lkp_modality', 1051097, 'PatientSocialStatus', 'modality')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_waitingtimesad', 'lkp_delayreasd', 1251057, 'WaitingTimesAdjustmentsandReasons', 'delayReasDecTreatTreat')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_limbweight', 'lkp_limbtype', 1051070, 'StrengtheningProgramLimbWeight', 'limbType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_racpsymptomris', 'lkp_symptomdur', 1231077, 'RACPSymptomRiskFactors', 'symptomDuration')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_teletherapydet', 'lkp_generalana', 1021145, 'TeletherapyDetails', 'generalAnaesthetic')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_peripheralrefl', 'lkp_leftfindin', 1051130, 'NeuroReflexesPeripheralFindings', 'leftFinding')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_pendingemergen', 'lkp_admissions', 1021230, 'PendingEmergencyAdmission', 'admissionStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_specimencollec', 'lkp_collection', 1161045, 'SpecimenCollectionStatus', 'collectionStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_adaptations', 'lkp_fundedby', 1021086, 'Adaptations', 'fundedBy')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_onwardreferrtr', 'lkp_serviceref', 1341034, 'OnwardReferralFromTriage', 'serviceReferredInto')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_waitingtimesad', 'lkp_reasdectre', 1251055, 'WaitingTimesAdjustmentsandReasons', 'reasDecTreatTreatment')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_services', 'lkp_specialty', 621, 'Service', 'specialty')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_orderreshist', 'lkp_ordinvstat', 1161027, 'OrderResultHistory', 'ordInvStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_invasivedevice', 'lkp_durationun', 1021078, 'InvasiveDeviceConfig', 'durationUnit')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_hydrotherapy', 'lkp_modalities', 1051005, 'Hydrotherapy', 'modalities')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_referral', 'lkp_specialty', 621, 'Referral', 'specialty')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_vitalsignitemf', 'lkp_vitalsignt', 1021058, 'VitalSignItemFrequency', 'vitalSignType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_document', 'lkp_status', 1021127, 'Document', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_chemoregimensc', 'lkp_dayonedeli', 1251098, 'ChemoRegimensConfig', 'dayOneDeliveryCode')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_teletherapydet', 'lkp_beamenergy', 1251080, 'TeletherapyDetails', 'beamEnergy')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_tiltexercise', 'lkp_tiltsuppor', 1121012, 'TiltExercise', 'tiltSupportExercise')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_episofcare', 'lkp_specialty', 621, 'EpisodeOfCare', 'specialty')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('cab_pdsrequest', 'lkp_success', 1021145, 'PdsRequest', 'success')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_phygftfg', 'lkp_findings', 1011069, 'PersonalHygieneFeetFindings', 'findings')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_bowelctp', 'lkp_leakageof2', 1021014, 'BowelConstipation', 'leakageOfFaecesPast')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_vteriskassessm', 'lkp_activeblee', 1021145, 'VTERiskAssessment', 'activeBleeding')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_wheelchairdet', 'lkp_wheelchai4', 1051143, 'WheelchairDetails', 'wheelchairFootplates')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_infectioncontr', 'lkp_esbc', 1021014, 'InfectionControlComponent', 'eSBC')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_rehabilitation', 'lkp_technique', 1051009, 'RehabilitationActivity', 'technique')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_bedspacestates', 'lkp_bedstatus', 1021229, 'BedSpaceStateStatus', 'bedStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_emergencyepiso', 'lkp_mobility', 1021191, 'EmergencyEpisode', 'mobility')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_sess_slot', 'lkp_status', 1141007, 'Session_Slot', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_eatmand', 'lkp_manualdext', 1011052, 'EatingManualDexterity', 'manualDexterity')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_supportnetwor3', 'lkp_hcpsubtype', 1021048, 'SupportNetworkProfessional', 'hcpSubType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_mrsasitesresul', 'lkp_result', 1001066, 'MRSASitesResults', 'result')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_clinicalcorres', 'lkp_c_ty', 1231031, 'ClinicalCorrespondence', 'type')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_vteriskassessm', 'lkp_useofhrt', 1021145, 'VTERiskAssessment', 'useOfHRT')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_orderspecimen', 'lkp_requestedt', 1161043, 'OrderSpecimen', 'requestedType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('pthw_journeytargets', 'lkp_status', 1321004, 'JourneyTargetStatus', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_equipment', 'lkp_loan', 1021085, 'Equipment', 'loan')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_admissiondetai', 'lkp_methodofad', 1021226, 'AdmissionDetail', 'methodOfAdmission')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_careplanmodali', 'lkp_patientagr', 1021145, 'CarePlanModality', 'patientAgreed')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_booking_appoin', 'lkp_arrivalsta', 1141011, 'Booking_Appointment', 'arrivalStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_racpmedicatio2', 'lkp_medicatio2', 1231087, 'RACPMedicationStatus', 'medicationStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_tiig', 'lkp_previously', 1291032, 'TIIG', 'previouslyAssulatedByAttacker')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_reportsrequire', 'lkp_reportsreq', 1341023, 'ReportsRequiredForPrinting', 'reportsRequired')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_userworkqueue', 'lkp_currentsta', 1101040, 'UserWorkQueue', 'currentStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_urinalysis', 'lkp_leucocytes', 1021062, 'Urinalysis', 'leucocytes')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_appnavigation', 'lkp_style', 1031017, 'AppNavigation', 'style')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_wheelchaircush', 'lkp_cushiontyp', 1051062, 'WheelchairCushion', 'cushionType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_brachytherapyd', 'lkp_brachydeli', 1251068, 'BrachytherapyDetails', 'brachyDeliveryType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_phygcomp', 'lkp_condition2', 1011074, 'PersonalHygieneComponent', 'conditionOfNails')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patientfamilyh', 'lkp_relationsh', 1021017, 'PatientFamilyHistory', 'relationship')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_allertypereact', 'lkp_reaction', 1021026, 'AllergenTypeReaction', 'reaction')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_skincomp', 'lkp_frequencyo', 1001019, 'SkinComponent', 'frequencyOfTurns')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_repositioningp', 'lkp_positioni2', 1021145, 'RepositioningPlan', 'positioningSuitable')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('pthw_patjourstatus', 'lkp_status', 1321005, 'PatientJourneyStatus', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_thermalactivit', 'lkp_thermaltyp', 1051024, 'ThermalActivity', 'thermalType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_sessiontheatre', 'lkp_statusreas', 1141007, 'SessionTheatreTCISlot', 'statusReason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('corr_cspdetail', 'lkp_currentsta', 1021127, 'CorrespondenceDetails', 'currentStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_bowelregime', 'lkp_bowelregim', 1001055, 'BowelRegime', 'bowelRegime')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_vteriskassessm', 'lkp_anaestheti', 1021145, 'VTERiskAssessment', 'anaestheticAndSurgery')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_prof', 'lkp_pasclinic', 1141018, 'Sch_Profile', 'pASClinic')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_cognitivefunct', 'lkp_answer', 1021014, 'CognitiveFunction', 'answer')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_tcioutcomeforp', 'lkp_outcomerea', 1341041, 'TCIOutcomeForPatientElectiveList', 'outcomeReason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_sch_session', 'lkp_anaestheti', 1231108, 'Sch_Session', 'anaestheticType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_drawingimage2', 'lkp_category', 1021115, 'DrawingImage', 'category')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_alertsdetails', 'lkp_alertconfi', 1021027, 'PatientAlert', 'alertConfirmedStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_emergencyepiso', 'lkp_presenting', 1291003, 'EmergencyEpisode', 'presentingComplaint')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('corr_categorynote', 'lkp_category', 1111001, 'CategoryNotes', 'category')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_medic', 'lkp_grade', 1021065, 'Medic', 'grade')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_respiratorytr2', 'lkp_treatment', 1051111, 'RespiratoryTreatmentDetail', 'treatment')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_accommodation', 'lkp_accommodat', 2603, 'Accommodation', 'accommodationType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_remedialactivi', 'lkp_activitypo', 1051019, 'RemedialActivity', 'activityPosition')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('edis_ttamedication', 'lkp_route', 1021035, 'TTAMedication', 'route')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_surgicalopnote', 'lkp_followupty', 1341031, 'SurgicalOpNotes', 'followUpType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_functionaltra2', 'lkp_technique', 1051045, 'FunctionalTransfersTechnique', 'technique')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_skinassfind', 'lkp_odour', 1001033, 'SkinAssessmentFindings', 'odour')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_environmental2', 'lkp_location', 1051071, 'EnvironmentalVisit', 'location')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_clinoutcome', 'lkp_clinicalo2', 1341030, 'ClinicalOutcome', 'clinicalOutcomeContext')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_equipment', 'lkp_supplier', 1021083, 'Equipment', 'supplier')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_patientwaitin4', 'lkp_priority', 1341036, 'PatientElectiveList', 'priority')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_pers_relative', 'lkp_relationsh', 519, 'Relative', 'relationship')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_sleepmed', 'lkp_sleepmedic', 1011080, 'SleepingMedication', 'sleepMedication')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_opdspasassesst', 'lkp_treatgoal', 1051155, 'OPDSpasAssessTreatGoal', 'treatGoal')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_tiig', 'lkp_hadpatient', 1291023, 'TIIG', 'hadPatientConsumedAlcohol')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_tracking', 'lkp_reasonforb', 1291048, 'Tracking', 'reasonForBreach')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_opdspasasslimb', 'lkp_movement', 1051128, 'OPDSpasAssLimbs', 'movement')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_surgicalaudco', 'lkp_reasonforc', 1231130, 'SurgicalAuditCancelOperation', 'reasonForCancellation')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('asse_userdefinedobj', 'lkp_objecttype', 1021151, 'UserDefinedObject', 'objectType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('adto_patientdocumen', 'lkp_msgtype', 1021260, 'PatientDocumentMessageQueue', 'msgType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_illicitdrugdet', 'lkp_frequency', 1021038, 'IllicitDrugDetails', 'frequency')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_questionanswer', 'lkp_answertype', 1021122, 'QuestionAnswerType', 'answerType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_wheelchairdet', 'lkp_wheelchai3', 1051142, 'WheelchairDetails', 'wheelchairFrame')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_deathdetails', 'lkp_deathplace', 1021153, 'DeathDetails', 'deathPlaceofDeath')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('corr_consultantacce', 'lkp_accessrigh', 1111005, 'ConsultantAccess', 'accessRight')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('corr_glossaryprofil', 'lkp_specifiert', 1111003, 'GlossaryProfile', 'specifierType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_chemocycledeta', 'lkp_procuremen', 1251097, 'ChemoCycleDetailsCCO', 'procurementCode')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('corr_recipient', 'lkp_recipientt', 1111011, 'Recipient', 'recipientType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_socialhistory', 'lkp_fittotakeh', 1021014, 'SocialHistory', 'fitToTakeHome')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_splintsinstruc', 'lkp_instructio', 1051058, 'SplintsInstructionDetails', 'instructionLeaflet')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_eatmand', 'lkp_status', 1021014, 'EatingManualDexterity', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_opdfertilitycl', 'lkp_ejaculatio', 1051152, 'OPDFertClinic', 'ejaculation')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_chemotherapyde', 'lkp_outcometim', 1021145, 'ChemotherapyDetails', 'outcomeTimeDelay')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_catheterdetail', 'lkp_catheterin', 1021145, 'CatheterDetail', 'catheterInserted')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('icps_icpaction', 'lkp_status', 1021124, 'ICPAction', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_generalquestio', 'lkp_questiongr', 1161046, 'GeneralQuestionAnswer', 'questionGroup')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_dementiaassess', 'lkp_q10recall', 1021145, 'DementiaAssessAndInvestigate', 'q10Recall')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_dressingsandai', 'lkp_dressingsa', 1231097, 'DressingsAndAids', 'dressingsAndAids')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_socialhistory', 'lkp_diet', 1021158, 'SocialHistory', 'diet')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('icps_patienticpacts', 'lkp_varianceca', 1181009, 'PatientICPActionStatus', 'varianceCategory')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_smokingdetails', 'lkp_status', 1021016, 'SmokingDetails', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_referralsrecor', 'lkp_cancerstat', 1021197, 'ReferralsRecording', 'cancerStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_clinicalnotes', 'lkp_c_discipli', 1021048, 'ClinicalNotes', 'discipline')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_tiig', 'lkp_consumedor', 1291024, 'TIIG', 'consumedOrPurchasedAlcoholFrom')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_opderectdysfxn', 'lkp_erectionqu', 1051054, 'OPDErectDysfxn', 'erectionQual')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_rehabilitation', 'lkp_independen', 2223, 'RehabilitationActivity', 'independenceLevel')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_teletherapydet', 'lkp_multiplepl', 1021145, 'TeletherapyDetails', 'multiplePlanning')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_ventilationch2', 'lkp_physio', 1021014, 'VentilationChart', 'physio')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_emergencyatten', 'lkp_modeofarri', 1291009, 'EmergencyAttendance', 'modeOfArrival')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_remedialactivi', 'lkp_independen', 1051020, 'RemedialActivity', 'independence')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_appt_history_s', 'lkp_pasclinic', 1141018, 'Appointment_Status', 'pASClinic')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_appdbimage', 'lkp_imagetype', 1031018, 'AppDBImage', 'imageType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('adto_patientdocumen', 'lkp_messagesta', 1161039, 'PatientDocumentMessageQueue', 'messageStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_functionaltra2', 'lkp_startposit', 1051047, 'FunctionalTransfersTechnique', 'startPosition')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_bowelctp', 'lkp_takinglaxa', 1021014, 'BowelConstipation', 'takingLaxatives')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_vitalsigns', 'lkp_patientcon', 1021204, 'VitalSigns', 'patientConscious')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_patientwaitin4', 'lkp_c_langua', 532, 'PatientElectiveList', 'language')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_must', 'lkp_management', 1001071, 'MUST', 'management')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_activity', 'lkp_status', 1021109, 'Activity', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_brthcough', 'lkp_sputumamou', 1011026, 'BreathingCough', 'sputumAmount')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_bowelctp', 'lkp_leakageoff', 1021014, 'BowelConstipation', 'leakageOfFaecesAtPresent')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_rehabilitation', 'lkp_activity', 1026, 'RehabilitationActivity', 'activity')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_splintdetails', 'lkp_laterality', 1021063, 'SplintDetails', 'laterality')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_emergencyatten', 'lkp_visittype', 1291042, 'EmergencyAttendance', 'visitType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_batchpricing', 'lkp_status', 1101053, 'BatchPricing', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_edadmission', 'lkp_allocateds', 1291054, 'EDPartialAdmission', 'allocatedStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_chemotherapyde', 'lkp_delayreas2', 1081034, 'ChemotherapyDetails', 'delayReason2')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('pthw_rttstatusevent', 'lkp_encounteri', , 'RTTStatusEventMap', 'encounterInstance')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_remedialactivi', 'lkp_subjective', 1051021, 'RemedialActivity', 'subjectiveObs')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_commvisn', 'lkp_effectedey', 1021032, 'CommunicationVision', 'effectedEyes')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('icps_icpaction', 'lkp_linkedtype', 1021114, 'ICPAction', 'linkedType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_wardbayconfig', 'lkp_mainspecia', 621, 'WardBayConfig', 'mainSpecialty')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_ocsorder', 'lkp_authorisat', 1161048, 'OcsOrderSession', 'authorisationOrderStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_vteriskassessm', 'lkp_acquiredbl', 1021145, 'VTERiskAssessment', 'acquiredBleeding')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_softtissuemass', 'lkp_laterality', 1021032, 'SoftTissueMassage', 'laterality')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_eatcomp', 'lkp_anyspecial', 1021014, 'EatingComponent', 'anySpecialDiet')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_repositioningp', 'lkp_skintolera', 1021145, 'RepositioningPlan', 'skinToleranceTest')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_radiotherapy', 'lkp_reasondela', 1251102, 'RadiotherapyDetails', 'reasonDelay1')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_racpeecg', 'lkp_dysponea', 1211031, 'RACPExerciseECG', 'dysponea')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patient', 'lkp_confidenti', 1021214, 'Patient', 'confidentialReason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_dementiaassess', 'lkp_confirmmed', 1021145, 'DementiaAssessAndInvestigate', 'confirmMedicationReview')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_boweldhr', 'lkp_odour', 1011016, 'BowelDiarrhoea', 'odour')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_referralsrecor', 'lkp_referralst', 1021148, 'ReferralsRecording', 'referralStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_dischargeservi', 'lkp_equipment', 1291047, 'DischargeServicesAndAdvice', 'equipment')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_patientwaitin4', 'lkp_electivead', 1341039, 'PatientElectiveList', 'electiveAdmissionType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_vteriskassessm', 'lkp_thrombocyt', 1021145, 'VTERiskAssessment', 'thrombocytopenia')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_referralreject', 'lkp_reason', 1341001, 'ReferralReject', 'reason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_investigation', 'lkp_c_ty', 1161055, 'Investigation', 'type')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_allergiesdetai', 'lkp_allergenty', 1021028, 'PatientAllergy', 'allergenType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_vteriskassessm', 'lkp_neurospina', 1021145, 'VTERiskAssessment', 'neuroSpinalEyeSurgery')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('asse_graphicgssessm', 'lkp_assessmen3', 621, 'GraphicAssessment', 'assessmentSpecialties')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_cognitivefunct', 'lkp_c_functi', 1051162, 'CognitiveFunction', 'function')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_intraoperative', 'lkp_readmissio', 1021257, 'IntraOperativeCareRecord', 'readmissionType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_boweldiarrhoea', 'lkp_sufferfrom', 1001060, 'BowelDiarrhoeaConstipation', 'sufferFrom')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_patienthomesit', 'lkp_floorlevel', 1231051, 'PatientHomeSituation', 'floorLevel')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_invasivedevic2', 'lkp_durationun', 1021078, 'InvasiveDeviceType', 'durationUnit')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_equipment', 'lkp_suppliedfo', 1021084, 'Equipment', 'suppliedFor')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_vipscore', 'lkp_vipscale', 1231036, 'VIPScore', 'vIPScale')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_investigation', 'lkp_minreorde2', 1161007, 'Investigation', 'minReorderPeriodUnit')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_actualplandeta', 'lkp_actualtre2', 1251078, 'ActualPlanDetails', 'actualTreatmentType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_mskgroups', 'lkp_handmoveme', 1051176, 'MskGroups', 'handMovementTests')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_infectioncontr', 'lkp_vre', 1021014, 'InfectionControlComponent', 'vRE')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_patientwaitin4', 'lkp_intendedma', 1021255, 'PatientElectiveList', 'intendedManagement')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('edis_ttamedicationd', 'lkp_frequencyu', 1021038, 'TTAMedicationDetail', 'frequencyUnit')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_remedialactivi', 'lkp_patientpos', 1051018, 'RemedialActivity', 'patientPosition')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_taxonomyupload', 'lkp_taxonomyc2', 1021047, 'TaxonomyUpload', 'taxonomyCode')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_prof', 'lkp_intervalty', 1141002, 'Sch_Profile', 'intervalType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_pataction', 'lkp_patientsta', 3197, 'PatAction', 'patientStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_infectioncontr', 'lkp_mrsa', 1021014, 'InfectionControlComponent', 'mRSA')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_sess_slot', 'lkp_bookingsou', 1141016, 'Session_Slot', 'bookingSource')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_eatoral', 'lkp_oralassess', 1011050, 'EatingOralAssessment', 'oralAssessment')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_waitingtimesad', 'lkp_reasfirsts', 1251054, 'WaitingTimesAdjustmentsandReasons', 'reasFirstSeenDecTreat')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_emotasses', 'lkp_c_sele', 1021014, 'EmotionalStateAssessment', 'select')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_stretchingdeta', 'lkp_stretching', 1121006, 'StretchingDetails', 'stretchingArea')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_cataractintrao', 'lkp_dressings', 1231099, 'CataractIntraOperative', 'dressings')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_skinassfind', 'lkp_exudateamo', 1001031, 'SkinAssessmentFindings', 'exudateAmount')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_suspensiondeta', 'lkp_initator', 1021292, 'SuspensionDetailsForPatientElectiveList', 'initator')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_chemotherapyde', 'lkp_outcomesum', 1251105, 'ChemotherapyDetails', 'outcomeSummary')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_externalsy', 'lkp_eventtype', 1141017, 'ExternalSystemEvent', 'eventType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_fitforsurgerya', 'lkp_anaestheti', 1231108, 'FitForSurgeryAssesment', 'anaestheticType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_accomhous', 'lkp_accommodat', 1011001, 'AccommodationHousing', 'accommodation')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_adaptations', 'lkp_suppliedfo', 1021084, 'Adaptations', 'suppliedFor')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_bowelctp', 'lkp_pronetocon', 1021014, 'BowelConstipation', 'proneToConstipation')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_surgicalauditp', 'lkp_consentrec', 1021145, 'SurgicalAuditPreOpChecks', 'consentReceived')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_vteriskassessm', 'lkp_otherproce', 1021145, 'VTERiskAssessment', 'otherProcedureWithHighBleedingRisk')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('pthw_eventrttevent', 'lkp_status', 1021124, 'EventRTTEvent', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_onwardreferral', 'lkp_onwardref3', 1341016, 'OnwardReferral', 'onwardReferralReason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_pas_event', 'lkp_cspdocumen', 1021127, 'PASEvent', 'cspDocumentStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_teletherapydet', 'lkp_specialtec', 1251070, 'TeletherapyDetails', 'specialTechnique')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_inpat_epis', 'lkp_wardtype', 1021228, 'InpatientEpisode', 'wardType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_appnavform', 'lkp_accessfore', 1031000, 'AppNavForm', 'accessForEpisEnd')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_procedurehotli', 'lkp_specialty', 621, 'ProcedureHotlist', 'specialty')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_mergedpatient', 'lkp_ethnicorig', 762, 'MergedPatient', 'ethnicOrigin')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_clinicalcdiass', 'lkp_reverseass', 1231022, 'Clinicalcdiassociations', 'reverseAssociation')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_medicationhotl', 'lkp_specialty', 621, 'MedicationHotlist', 'specialty')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_homedetails', 'lkp_ownerships', 2605, 'HomeDetails', 'ownershipStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_neurootsensfin', 'lkp_sensationt', 1051132, 'NeuRootSensFinding', 'sensationType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_ded', 'lkp_county', 1101022, 'DED', 'county')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_remedial', 'lkp_remediallo', 2047, 'Remedial', 'remedialLocation')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_catsreferralst', 'lkp_referralst', 1341000, 'CATSReferralStatus', 'referralStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_propertycheckl', 'lkp_movementty', 1001077, 'PropertyChecklist', 'movementType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('icps_patienticpeval', 'lkp_c_discipli', 1021048, 'PatientICPEvaluationNote', 'discipline')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_chartrequested', 'lkp_requestedb', 1021145, 'ChartRequested', 'requestedbyReception')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patient', 'lkp_dodsource', 1021211, 'Patient', 'dodSource')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patientdiagnos', 'lkp_status', 1021159, 'PatientDiagnosisStatus', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_gaittreatment', 'lkp_gaittechni', 1051075, 'GaitTreatment', 'gaitTechnique')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_urinalysis', 'lkp_ph', 1021057, 'Urinalysis', 'pH')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_allertypereact', 'lkp_allergenty', 1021028, 'AllergenTypeReaction', 'allergenType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_appt_tracking', 'lkp_trackingst', 1141023, 'Appt_Tracking_Status_History', 'trackingStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_neuroreflexesa', 'lkp_analtestfi', 1051107, 'NeuroReflexesAnalTests', 'analTestfinding')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_brachytxtreatm', 'lkp_c_ty', 1251069, 'BrachyTxTreatmentDetails', 'type')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_injurydetails', 'lkp_mechanismo', 1051098, 'InjuryDetails', 'mechanismOfInjury')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_appointmentcli', 'lkp_clinicaln2', 1341035, 'AppointmentClinicalNotes', 'clinicalNoteType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_medicationdeta', 'lkp_isdiscont4', 1021037, 'PatientMedication', 'isDiscontinuedReason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_pathologydetai', 'lkp_status', 1251082, 'PathologyDetails', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patprocedure', 'lkp_confirmeds', 1021027, 'PatientProcedure', 'confirmedStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_clinimagordite', 'lkp_durationun', 1161006, 'ClinImagInvDetails', 'durationUnit')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_pattreatmentpl', 'lkp_activestat', 1021145, 'PatTreatmentPlanGroupSiteTech', 'activeStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_nurbladdercomp', 'lkp_aidsused', 1001062, 'NurBladderComponent', 'aidsUsed')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_clinicaloutcom', 'lkp_category', 1231117, 'ClinicalOutcomeCategoryProcedureRequiredConfig', 'category')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('edis_dischargedetai', 'lkp_discharges', 1231104, 'DischargeDetails', 'dischargeSupplementaryLetterStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_commsplg', 'lkp_spokenlang', 532, 'CommunicationSpeechAndLanguage', 'spokenLanguage')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('adto_demographicsmq', 'lkp_queuetype', 1021259, 'DemographicsMessageQueue', 'queueType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_brthcough', 'lkp_anycough', 1021014, 'BreathingCough', 'anyCough')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_painassfind', 'lkp_depth', 1001026, 'PainAssessmentFindings', 'depth')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_roomdetails', 'lkp_unitofmeas', 1051178, 'RoomDetails', 'unitOfMeasure')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_dischargesumma', 'lkp_discharget', 1341003, 'DischargeSummaryPacuAndWard', 'dischargeType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_urinalysis', 'lkp_ketones', 1021062, 'Urinalysis', 'ketones')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_sch_booking', 'lkp_specialreq', 1141013, 'Sch_Booking', 'specialRequirements')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_vitalsignitemf', 'lkp_frequency', 1021176, 'VitalSignItemFrequency', 'frequency')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_datasettype', 'lkp_unitofmeas', 1161036, 'DatasetType', 'unitOfMeasure')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_actvlevl', 'lkp_ability', 1211020, 'ActivityLevel', 'ability')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_diagnosishotli', 'lkp_specialty', 621, 'DiagnosisHotlist', 'specialty')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_patientabsentd', 'lkp_sourceofin', 1021033, 'PatientAbsentDiagnosis', 'sourceofInformation')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_skinassfind', 'lkp_pain', 1001034, 'SkinAssessmentFindings', 'pain')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_externalresour', 'lkp_externalre', 1021283, 'ExternalResource', 'externalResourceType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_appnavform', 'lkp_accessforr', 1031000, 'AppNavForm', 'accessForRip')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_racpexamfindin', 'lkp_auscultat2', 1021247, 'RACPExamFindings', 'auscultationFinding')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_chemotherapyde', 'lkp_treatmentr', 1251028, 'ChemotherapyDetails', 'treatmentResponse')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_nutritionalmet', 'lkp_site', 1001063, 'NutritionalMethod', 'site')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_careplaninterv', 'lkp_interventi', 1001011, 'CarePlanIntervention', 'interventionType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_bowelctp', 'lkp_stainingof', 1021014, 'BowelConstipation', 'stainingOfFaeces')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_sch_session', 'lkp_slottype', 1141024, 'Sch_Session', 'slotType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_injurydetails', 'lkp_modeofinju', 1051098, 'InjuryDetails', 'modeOfInjury')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_medication', 'lkp_adminroute', 1021035, 'PatientMedicationDose', 'adminRoute')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_mergedpatient', 'lkp_religion', 780, 'MergedPatient', 'religion')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_appt_history_s', 'lkp_status', 1141007, 'Appointment_Status', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patientkioskse', 'lkp_theme', 1021221, 'PatientKioskSettings', 'theme')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_investigation', 'lkp_eventtype', 1161056, 'Investigation', 'eventType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_complementary2', 'lkp_complement', 1051001, 'ComplementaryTherapyDetails', 'complementaryTherapy')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_location', 'lkp_c_ty', 1021069, 'Location', 'type')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_bedspace', 'lkp_bedspacety', 1021235, 'BedSpace', 'bedSpaceType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_vteriskassessm', 'lkp_vteassessm', 1231125, 'VTERiskAssessment', 'vTEAssessmentStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_brachytherapyd', 'lkp_unit', 1251069, 'BrachytherapyDetails', 'unit')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_careplantempli', 'lkp_intervent2', 1001011, 'CarePlanTemplateIntervention', 'interventionType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patientcorecli', 'lkp_alertstatu', 1021208, 'PatientCoreClinicalData', 'alertStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_contractconfig', 'lkp_status', 1021124, 'ContractConfig', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_furthermanagem', 'lkp_medicallyi', 1341010, 'FurtherManagement', 'medicallyIncomplete')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('edis_futureplanfoll', 'lkp_hospitalfo', 1021145, 'FuturePlanFollowUp', 'hospitalFollowUp')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('icps_icp', 'lkp_specialty', 621, 'ICP', 'specialty')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_areaofneedsno2', 'lkp_areaofneed', 1021164, 'AreaofNeedsNotingDetail', 'areaofNeed')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_prof', 'lkp_theatretyp', 1141022, 'Sch_Profile', 'theatreType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_commvisn', 'lkp_wearglasse', 1021014, 'CommunicationVision', 'wearGlasses')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_intraoperativd', 'lkp_patientpos', 1021075, 'IntraOperativeDetails', 'patientPosition')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_neuinterpret', 'lkp_asiagrade', 1051148, 'NeuInterpret', 'asiaGrade')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patient', 'lkp_maritalsta', 766, 'Patient', 'maritalStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('pthw_targetreadjust', 'lkp_targetread', 1321013, 'TargetReadjustment', 'targetReadjustment')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_surgicalauditr', 'lkp_confirmpat', 1021145, 'SurgicalAuditRecovery', 'confirmPatientArrival')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_illicitdrugs', 'lkp_useanyothe', 1021014, 'IllicitDrugs', 'useAnyOtherDrugs')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_vteriskassessm', 'lkp_reducedmob', 1021145, 'VTERiskAssessment', 'reducedMobility')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_injurydetails', 'lkp_durlocunit', 1051101, 'InjuryDetails', 'durLOCUnit')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_mskjbmovements', 'lkp_movefindin', 1051129, 'MskJointMovement', 'moveFinding')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_emergencyepiso', 'lkp_school', 1291012, 'EmergencyEpisode', 'school')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_chemoregimensc', 'lkp_deliveryco', 1251099, 'ChemoRegimensConfig', 'deliveryCodeAllOtherDays')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_radiotherapy', 'lkp_treatingho', 1251096, 'RadiotherapyDetails', 'treatingHospital')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_catsreferral', 'lkp_isfinalrep', 1341017, 'CatsReferral', 'isFinalReportRequired')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_teletherapydet', 'lkp_anterior', 1021145, 'TeletherapyDetails', 'anterior')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_tcioutcomeforp', 'lkp_outcome', 1341045, 'TCIOutcomeForPatientElectiveList', 'outcome')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_orderinvappt', 'lkp_status', 1021241, 'OrderInvAppt', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_electrotherap7', 'lkp_wave', 1051041, 'ElectrotherapyUltrasoundTreatment', 'wave')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_stoolscale', 'lkp_result', 1021145, 'StoolScale', 'result')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_referralcodite', 'lkp_proclatera', 1021032, 'ReferralCodingItem', 'procLaterality')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_cdshistory', 'lkp_reporttype', 1021279, 'CDSHistory', 'reportType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_valuable', 'lkp_valuable', 1001079, 'Valuable', 'valuable')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_orderentrytemp', 'lkp_activestat', 1021124, 'OrderEntryTemplate', 'activeStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_peripheralrefl', 'lkp_peripheral', 1051130, 'NeuroReflexesPeripheralFindings', 'peripheralReflex')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_resultcomponen', 'lkp_resvaltype', 1161032, 'ResultComponent', 'resValType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('asse_graphicassess3', 'lkp_activestat', 1021124, 'GraphicAssessmentFindingQuestion', 'activeStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_brthcough', 'lkp_productive', 1021014, 'BreathingCough', 'productiveOfSputum')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_vteriskassessm', 'lkp_acutestrok', 1021145, 'VTERiskAssessment', 'acuteStroke')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_trackingarea', 'lkp_status', 1021124, 'TrackingArea', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_chartrequested', 'lkp_reasonnotr', 1031028, 'ChartRequested', 'reasonnotrequested')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_pas_event', 'lkp_passpecial', 1021269, 'PASEvent', 'pASSpecialty')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_commcaredet', 'lkp_userdefine', 1331005, 'CommunityCareDetail', 'userDefinedField1')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('hl7_inbound', 'lkp_messagecat', 1411000, 'HL7Inbound', 'messageCategory')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_skincomp', 'lkp_turnsperfo', 1001021, 'SkinComponent', 'turnsPerformedBy')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_cancellationty', 'lkp_cancellati', 1141007, 'CancellationTypeReason', 'cancellationType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_temperature', 'lkp_recordings', 1021050, 'Temperature', 'recordingSite')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('edis_futureplan', 'lkp_hospitalfo', 1021145, 'FuturePlan', 'hospitalFollowUp')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_clinicalnotesa', 'lkp_notingmeth', 1231040, 'ClinicalNotesAdditional', 'notingMethod')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_ventilationch2', 'lkp_position', 1021075, 'VentilationChart', 'position')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_drawingimage2', 'lkp_imagestatu', 1021113, 'DrawingImage', 'imageStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_illicitdrugs', 'lkp_drugsusedi', 1021014, 'IllicitDrugs', 'drugsUsedInThePastMonth')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('edis_futureplan', 'lkp_fittoretur', 1021145, 'FuturePlan', 'fitToReturnToWork')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_statusworkflow', 'lkp_workflowst', 1291019, 'StatusWorkflowConfig', 'workflowStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_opderectdysfxn', 'lkp_actualleaf', 1021006, 'OPDErectDysfxn', 'actualLeafletsGiven')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_nurbowelcompon', 'lkp_usualbowel', 1001056, 'NurBowelComponent', 'usualBowelPattern')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patprocedure', 'lkp_procedurei', 1021046, 'PatientProcedure', 'procedureIntent')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_floorlayout', 'lkp_status', 1021124, 'FloorLayout', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_sess_slot', 'lkp_priority', 1141009, 'Session_Slot', 'priority')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_adaptations', 'lkp_itemtype', 1051094, 'Adaptations', 'itemType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patprocedure', 'lkp_procedureo', 1231034, 'PatientProcedure', 'procedureOutcome')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_patienthomesit', 'lkp_toiletloca', 1231056, 'PatientHomeSituation', 'toiletLocation')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_respiratorytre', 'lkp_contraindi', 1021014, 'RespiratoryTreatment', 'contraindicationChecked')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_adaptations', 'lkp_supplier', 1021083, 'Adaptations', 'supplier')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_services', 'lkp_servicecat', 1021022, 'Service', 'serviceCategory')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_edadmission', 'lkp_allocatedb', 1291053, 'EDPartialAdmission', 'allocatedBedType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_pendingtransfe', 'lkp_wardtype', 1021228, 'PendingTransfers', 'wardType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_externalresour', 'lkp_hcptype', 1021048, 'ExternalResource', 'hCPType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_pathologydetai', 'lkp_excisionma', 1251041, 'PathologyDetails', 'excisionMargin')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_emergencyatten', 'lkp_emergencyd', 1291008, 'EmergencyAttendance', 'emergencyDeptType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_handjaymar', 'lkp_jaymarleve', 1121000, 'HandJaymar', 'jaymarLevel')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patientnoalert', 'lkp_alertstatu', 1021208, 'PatientNoAlertInfo', 'alertStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_remedialactivi', 'lkp_c_sequen', 1051171, 'RemedialActivity', 'sequence')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_primarytumourd', 'lkp_basisofdia', 1021042, 'PrimaryTumourDetails', 'basisofDiagnosis')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_vitalsigns', 'lkp_urine2mlkg', 1021205, 'VitalSigns', 'urine2mlkgkhr')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('asse_userassessment', 'lkp_copylastfr', 1271005, 'UserAssessment', 'copyLastFromContext')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_electrothpneum', 'lkp_cycle', 2624, 'ElectrotherapyPneumaticTreatment', 'cycle')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_dischargeservi', 'lkp_transporta', 1141010, 'DischargeServicesAndAdvice', 'transportArrangedType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_emergencyatte2', 'lkp_paymenttyp', 1331010, 'EmergencyAttendanceBilling', 'paymentType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_dementiafind', 'lkp_camsdisorg', 1021145, 'DementiaFind', 'cAMSDisorganisedThinking')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_frameexercises', 'lkp_framesuppo', 1121012, 'FrameExerciseSupport', 'frameSupportExercise')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_skinassrev', 'lkp_pain', 1001034, 'SkinAssessmentReview', 'pain')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_commsplu', 'lkp_speechandl', 1011033, 'CommunicationSpeechAndLanguageUnderstanding', 'speechAndLanguageUnderstanding')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_communicationp', 'lkp_problemswi', 1001046, 'CommunicationProblems', 'problemsWith')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_radiotherapy', 'lkp_performanc', 2936, 'RadiotherapyDetails', 'performanceStatusAtDDT')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('edis_dischargedetai', 'lkp_dischargi3', 621, 'DischargeDetails', 'dischargingSpecialty')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_vteriskassessm', 'lkp_dehydratio', 1021145, 'VTERiskAssessment', 'dehydration')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_mdtnotes', 'lkp_area', 1231033, 'MDTNotes', 'area')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_splintdetails', 'lkp_splintbase', 2283, 'SplintDetails', 'splintBase')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_planofcarenoti', 'lkp_actionstat', 1001073, 'PlanOfCareNoting', 'actionStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_activity', 'lkp_activityty', 1021125, 'Activity', 'activityType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_mskjbmovements', 'lkp_qualitativ', 1051174, 'MskJointMovement', 'qualitativeRange')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_prof_slot', 'lkp_directacce', 1141014, 'Profile_Slot', 'directAccessSlot')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_prof', 'lkp_consmediat', 1141025, 'Sch_Profile', 'consMediaType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_medicationdeta', 'lkp_frequency', 1021038, 'PatientMedication', 'frequency')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_opdfertilitycl', 'lkp_infxnscree', 1051120, 'OPDFertClinic', 'infxnScreening')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_pendingelectiv', 'lkp_tcitype', 1021237, 'PendingElectiveAdmission', 'tCIType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('asse_userassessment', 'lkp_assessmen3', 621, 'UserAssessment', 'assessmentSpecialties')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_drains', 'lkp_sutured', 1021145, 'Drains', 'sutured')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_externalresour', 'lkp_resourcest', 1021124, 'ExternalResource', 'resourceStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_secslookupscor', 'lkp_lookupinst', , 'SECSLookupScore', 'lookupInstance')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_theatrebooking', 'lkp_anaestheti', 1231108, 'TheatreBooking', 'anaestheticType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_questioninform', 'lkp_classifica', 1021119, 'QuestionInformation', 'classification')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('pthw_rttevent', 'lkp_action', 1321003, 'RTTEvent', 'action')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('corr_cspdetailstath', 'lkp_status', 1021127, 'CorrespondenceStatusHistory', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_chemocycledeta', 'lkp_regimen', 1251027, 'ChemoCycleDetailsCCO', 'regimen')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_carecontext', 'lkp_context', 1021167, 'CareContext', 'context')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_drgrcomp', 'lkp_assistance', 1021014, 'DressingandGroomingComponent', 'assistanceWithDressingAndGrooming')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_chemoregimensc', 'lkp_procuremen', 1251097, 'ChemoRegimensConfig', 'procurementCode')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_chemodosagedet', 'lkp_provideror', 1251106, 'ChemoDosageDetails', 'providerOrganisation')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_goalplanning', 'lkp_goalplann2', 1231041, 'GoalPlanning', 'goalPlanningOutcome')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_infectcontrdet', 'lkp_infectionc', 1011009, 'InfectionControlDetails', 'infectionControlType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_patientpmhche3', 'lkp_sourceofin', 1021033, 'PatientPMHChecklistProcedure', 'sourceofInformation')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_pataction', 'lkp_transport', 3202, 'PatAction', 'transport')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_customlist', 'lkp_specialty', 621, 'CustomList', 'specialty')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_referralletter', 'lkp_transportr', 1021145, 'ReferralLetterDetails', 'transportRequired')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_injurydetails', 'lkp_causeofinj', 1051099, 'InjuryDetails', 'causeOfInjury')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_sch_session', 'lkp_theatretyp', 1141022, 'Sch_Session', 'theatreType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_nureatingcompo', 'lkp_difficulti', 1021014, 'NurEatingComponent', 'difficultiesInSwallowing')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_electrotherapy', 'lkp_warninggiv', 1021014, 'ElectrotherapyTENS', 'warningGiven')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_chemotherapyde', 'lkp_comorbidit', 1021145, 'ChemotherapyDetails', 'comorbidityAdjustment')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_orderentrytemp', 'lkp_templateca', 1161021, 'OrderEntryTemplate', 'templateCategory')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_medonadmisover', 'lkp_c_ty', 1231027, 'MedicationOverview', 'type')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('icps_icpaction', 'lkp_c_discipli', 1021048, 'ICPAction', 'discipline')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patdiagnosis', 'lkp_sourceofin', 1021033, 'PatientDiagnosis', 'sourceofInformation')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_pendingelectiv', 'lkp_admissions', 1021227, 'PendingElectiveAdmission', 'admissionSource')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_medication2', 'lkp_frequencyd', 1021038, 'Medication', 'frequencyDefault')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_patienthomesit', 'lkp_rails', 1231053, 'PatientHomeSituation', 'rails')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_mskgroups', 'lkp_jointgener', 1051137, 'MskGroups', 'jointGeneralFindings')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_dementiaassess', 'lkp_q6recognis', 1021145, 'DementiaAssessAndInvestigate', 'q6RecognisePeople')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_teletherapydet', 'lkp_anaestheti', 1251019, 'TeletherapyDetails', 'anaestheticReq')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_patienttumourr', 'lkp_recurrenc2', 1251086, 'PatientTumourRecurrence', 'recurrenceSite')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_orderchangeres', 'lkp_queuetype', 1021259, 'OrderChangeResponseQueue', 'queueType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_cancermdtmeeti', 'lkp_comorbidit', 1251044, 'CancerMDTMeeting', 'coMorbidityAssessment')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_commhear', 'lkp_hearingai2', 1021014, 'CommunicationHearing', 'hearingAidWithPatientOnAdmission')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_commmob', 'lkp_chairtype', 1001017, 'MobilityComponent', 'chairType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_procedureconte', 'lkp_context', 1021098, 'ActivityContextPricingDetails', 'context')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_leiscomp', 'lkp_alcoholsoc', 1021014, 'LeisureComponent', 'alcoholSocially')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_electrothpneum', 'lkp_splints', 2623, 'ElectrotherapyPneumaticTreatment', 'splints')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_statusworkflow', 'lkp_departureo', 1291014, 'StatusWorkflowConfig', 'departureOutcomeDefault')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_onwardreferrtr', 'lkp_agreewithd', 1021145, 'OnwardReferralFromTriage', 'agreeWithDecision')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_medicationrout', 'lkp_route', 1021035, 'MedicationRoute', 'route')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_prof', 'lkp_prfcategor', 1141001, 'Sch_Profile', 'prfCategory')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patdiagnosis', 'lkp_diagconfir', 1021027, 'PatientDiagnosis', 'diagConfirmedStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_extendedadmiss', 'lkp_admittedfr', 1021283, 'ExtendedAdmissionDetail', 'admittedFromType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_sleepapnoea', 'lkp_apnoeaansw', 1051166, 'SleepApnoea', 'apnoeaAnswers')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_emergencyepiso', 'lkp_triagecate', 1291022, 'EmergencyEpisode', 'triageCategoryType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_emergencyatten', 'lkp_preferedla', 532, 'EmergencyAttendance', 'preferedLanguage')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('edis_summarydetail', 'lkp_progressst', 1231115, 'SummaryDetail', 'progressStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_radiotherapy', 'lkp_treatment2', 1251022, 'RadiotherapyDetails', 'treatmentCourseStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('icps_icp', 'lkp_category', 11021117, 'ICP', 'category')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_medication', 'lkp_durationun', 1021078, 'PatientMedicationDose', 'durationUnits')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_catsreferral', 'lkp_discharget', 1341026, 'CatsReferral', 'dischargeToGPDetailsReviewStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_patienttarget', 'lkp_loa', 1231011, 'PatientGoalTarget', 'lOA')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_spircomp', 'lkp_practicing', 1021014, 'SpiritualityComponent', 'practicingMember')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('icps_icpstages', 'lkp_status', 1021124, 'ICPStage', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_datasettype', 'lkp_category', 1021173, 'DatasetType', 'category')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_intraoperative', 'lkp_admissiont', 1021231, 'IntraOperativeCareRecord', 'admissionType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('edis_plasticsurgery', 'lkp_skinforsto', 1021145, 'PlasticSurgeryAndBurns', 'skinForStorage')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_tabledevice', 'lkp_tabledevic', 1231101, 'TableDevice', 'tableDevice')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('edis_ttamedicationd', 'lkp_route', 1021035, 'TTAMedicationDetail', 'route')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_internalreferr', 'lkp_status', 1021124, 'InternalReferral', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_investigation', 'lkp_turnaround', 1161007, 'Investigation', 'turnaroundMeasure')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_surgicalaudtn', 'lkp_operationt', 1021161, 'SurgicalAuditPreOpChecksTheatreNurse', 'operationType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('edis_plasticsurgery', 'lkp_anaestheti', 1231108, 'PlasticSurgeryAndBurns', 'anaestheticType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_edattendenceco', 'lkp_controltyp', 1031027, 'EDAttendenceControlsConfig', 'controlType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_mobilitycompon', 'lkp_mobilityst', 1001050, 'NurMobilityComponent', 'mobilityStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_sleepcomp', 'lkp_patienthav', 1021014, 'SleepingComponent', 'patientHaveDifficultyInSleeping')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_referralletter', 'lkp_interprete', 1021145, 'ReferralLetterDetails', 'interpreterRequired')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_skincomp', 'lkp_chairtype', 1001017, 'SkinComponent', 'chairType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('asse_patientassessi', 'lkp_status', 1021163, 'PatientAssessment', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_questioninform', 'lkp_questionty', 1021150, 'QuestionInformation', 'questionType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_clinicalnoteno', 'lkp_status', 1021143, 'ClinicalNoteNoteStatus', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_locationdepart', 'lkp_department', 1291036, 'LocationDepartmentTypes', 'departmentTypes')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_radiotherapy', 'lkp_diseasetre', 1251101, 'RadiotherapyDetails', 'diseaseTreatment')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_allergyreactio', 'lkp_reaction', 1021026, 'PatientAllergyReaction', 'reaction')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_deeptissuemass', 'lkp_dfmassages', 2346, 'DeepFrictionMassage', 'dFMassageStructure')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_alertsdetails', 'lkp_alerttype', 1021024, 'PatientAlert', 'alertType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_splintdetails', 'lkp_material', 1045, 'SplintDetails', 'material')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_assessmentinfo', 'lkp_status', 1001043, 'AssessmentInfo', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_arterialbloodg', 'lkp_ventilatio', 1021068, 'ArterialBloodGas', 'ventilationMode')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_chemoregimensd', 'lkp_regimen', 1251027, 'ChemoRegimensDrugConfig', 'regimen')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_admissioncheck', 'lkp_checklisti', 1001074, 'AdmissionChecklist', 'checklistItem')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_pendingelectiv', 'lkp_wardtype', 1021228, 'PendingElectiveAdmission', 'wardType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_rehabilitation', 'lkp_purpose', 1080, 'RehabilitationActivity', 'purpose')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_racpreferral', 'lkp_referralre', 1021194, 'RACPReferral', 'referralReason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_referralsrecor', 'lkp_referralty', 1231044, 'ReferralsRecording', 'referralType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('edis_futureplan', 'lkp_followupi2', 1021078, 'FuturePlan', 'followupInInterval')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_appointmenttra', 'lkp_trackingst', 1141023, 'AppointmentTrackingstatusColourConfig', 'trackingStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('asse_patientassessi', 'lkp_dpptype', 1271003, 'PatientAssessment', 'dPPType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_flubaldetails', 'lkp_c_ty', 1021077, 'FluidsBalanceDetails', 'type')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_bladcont', 'lkp_day', 1001001, 'BladderContinence', 'day')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_fitforsurgerya', 'lkp_notfitreas', 1231088, 'FitForSurgeryAssesment', 'notFitReason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_orderinvestiga', 'lkp_displayfla', 1161040, 'OrderInvestigation', 'displayFlag')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_orderchangeres', 'lkp_causingsta', 1161027, 'OrderChangeResponseQueue', 'causingStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('icps_icp', 'lkp_status', 1021124, 'ICP', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_containertypes', 'lkp_volumeunit', 1161009, 'PathSpecimenContainer', 'volumeUnits')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_skinassrev', 'lkp_woundbed', 1001029, 'SkinAssessmentReview', 'woundBed')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_tiig', 'lkp_assaultloc', 1291026, 'TIIG', 'assaultLocation')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_socialhistory', 'lkp_occupatio3', 1021157, 'SocialHistory', 'occupationStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_painassfind', 'lkp_progressio', 1001025, 'PainAssessmentFindings', 'progression')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_skincomp', 'lkp_bedtype', 1001016, 'SkinComponent', 'bedType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_cancercareplan', 'lkp_recurrence', 1251073, 'CancerCarePlan', 'recurrenceIndicator')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_emergencyatten', 'lkp_depttype', 1291008, 'EmergencyAttendance', 'deptType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_medic', 'lkp_medictype', 1021048, 'Medic', 'medicType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_catsreferral', 'lkp_urgency', 1341036, 'CatsReferral', 'urgency')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_diathermyplate', 'lkp_skinintact', 1021145, 'DiathermyPlateDetail', 'skinintact')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('pthw_eventtarget', 'lkp_setjourney', 1321004, 'EventTarget', 'setJourneyTargetStatusTo')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_referralletter', 'lkp_transport', 1141010, 'ReferralLetterDetails', 'transport')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_sleepfindings', 'lkp_finding', 1051167, 'SleepFindings', 'finding')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_waitingtimesad', 'lkp_delayreasr', 1251056, 'WaitingTimesAdjustmentsandReasons', 'delayReasReferralTreat')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_socialhistory', 'lkp_smokingsta', 1021007, 'SocialHistory', 'smokingStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('edis_dischargedetai', 'lkp_discharged', 1011097, 'DischargeDetails', 'dischargeDestination')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_providersystem', 'lkp_codesystem', 1021047, 'ProviderSystem', 'codeSystem')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_drgrcomp', 'lkp_shavingpre', 1011046, 'DressingandGroomingComponent', 'shavingPreference')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('icps_icpphases', 'lkp_status', 1021124, 'ICPPhase', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('asse_userassessmen4', 'lkp_activestat', 1021124, 'AssessmentQuestionGroup', 'activeStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_commhear', 'lkp_effectedea', 1021032, 'CommunicationHearing', 'effectedEars')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_wheelchairref', 'lkp_patientinf', 1021014, 'WheelchairReferral', 'patientInformed')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_pas_event', 'lkp_sourceofre', 1021025, 'PASEvent', 'sourceOfReferral')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_carecontext', 'lkp_discharger', 1021253, 'CareContext', 'dischargeReason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_patientcasecon', 'lkp_cancellati', 1231008, 'PatientCaseConference', 'cancellationReason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patientdocumen', 'lkp_creationty', 1021219, 'PatientDocument', 'creationType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_tiltexercise', 'lkp_supporttyp', 1121012, 'TiltExercise', 'supportType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_painassfind', 'lkp_painhypers', 1001027, 'PainAssessmentFindings', 'painHypersensitivity')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_soapnote', 'lkp_areaofneed', 1021164, 'SoapNote', 'areaofNeed')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_appointmentcli', 'lkp_notestatus', 1341024, 'AppointmentClinicalNotes', 'noteStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_specialinteres', 'lkp_specialint', 1111004, 'SpecialInterestDetail', 'specialInterestCategory')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_communicationc', 'lkp_usethecall', 1021014, 'NurCommunicationComponent', 'useTheCallBell')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_splintdetails', 'lkp_product', 1044, 'SplintDetails', 'product')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_cancellationty', 'lkp_cancellat2', 1141003, 'CancellationTypeReason', 'cancellationReason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patientmedical', 'lkp_policytype', 1021271, 'PatientMedicalInsurance', 'policyType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_vteriskassessm', 'lkp_useofostog', 1021145, 'VTERiskAssessment', 'useOfOstogren')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_medication', 'lkp_stoppedbyt', 1021184, 'PatientMedicationDose', 'stoppedByType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_racpsymptoms', 'lkp_racpcfindi', 1021243, 'RACPSymptoms', 'rACPCFinding')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('pthw_pathway', 'lkp_status', 1021124, 'Pathway', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_pacsconfigurti', 'lkp_pacsclient', 1021286, 'PACSConfiguration', 'pACSClientType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_surgerydetails', 'lkp_discharge2', 1231061, 'SurgeryDetails', 'dischargeDestination')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_attendanceclin', 'lkp_specialty', 621, 'AttendanceClinicalNotes', 'specialty')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_painmed', 'lkp_medication', 1011063, 'PainMedication', 'medication')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('corr_glossary', 'lkp_glossary', 1111002, 'Glossary', 'glossary')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_patactionstatu', 'lkp_actionstat', 1281026, 'PatActionStatusPoint', 'actionStatusReason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_neuroreflexeso', 'lkp_otherfindi', 1051108, 'NeuroReflexesOtherFindings', 'otherFinding')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_remedialactivi', 'lkp_technique', 1051022, 'RemedialActivity', 'technique')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_ventilationtra', 'lkp_tracheosto', 1021073, 'VentilationTracheostomy', 'tracheostomyType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_surgerydetails', 'lkp_proceduret', 1021199, 'SurgeryDetails', 'procedureType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_hcgtestitem', 'lkp_urinehcg', 1291040, 'HCGTestItem', 'urineHCG')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_chemotherapyde', 'lkp_performanc', 2936, 'ChemotherapyDetails', 'performanceStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patprocedure', 'lkp_specialty', 621, 'PatientProcedure', 'specialty')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_appointmentcal', 'lkp_reason', 1341006, 'AppointmentCallAttempts', 'reason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('pthw_extevenmap', 'lkp_detail', 1321001, 'ExternalEventMapping', 'detail')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_racpplanadvice', 'lkp_secondaryp', 1021250, 'RACPPlanAdvice', 'secondaryPlans')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_bowelregime', 'lkp_status', 1021014, 'BowelRegime', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('icps_patientcritica', 'lkp_criticalev', 1181000, 'PatientCriticalEvents', 'criticalEvent')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_eatcomp', 'lkp_describeap', 1011055, 'EatingComponent', 'describeAppetite')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_followupnote', 'lkp_followupty', 1021258, 'FollowUpNote', 'followUpType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_emergencyatten', 'lkp_patientatt', 1291052, 'EmergencyAttendance', 'patientAttendanceStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('adto_inpatientadtme', 'lkp_msgtype', 1021260, 'InPatientADTMessageQueue', 'msgType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_specialtyleadc', 'lkp_specialty', 621, 'SpecialtyLeadConsultant', 'specialty')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_connectivetiss', 'lkp_ctmassagea', 1066, 'ConnectiveTissueMassage', 'cTMassageArea')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_manchestertria', 'lkp_defaultpri', 1291020, 'ManchesterTriageProtocolConfiguration', 'defaultPriority')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_limbweight', 'lkp_action', 1051172, 'StrengtheningProgramLimbWeight', 'action')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_categoryproced', 'lkp_category', 1021261, 'CategoryProcedures', 'category')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_serverdocument', 'lkp_filetype', 1021218, 'ServerDocument', 'fileType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_bladcont', 'lkp_night', 1001001, 'BladderContinence', 'night')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_referral', 'lkp_referralpr', 1021193, 'Referral', 'referralPriority')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patdiagnosis', 'lkp_specialty', 621, 'PatientDiagnosis', 'specialty')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_sch_booking', 'lkp_bookingsys', 1141005, 'Sch_Booking', 'bookingSysType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_brachytherapyd', 'lkp_prescripti', 1251103, 'BrachytherapyDetails', 'prescriptionPoint')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_socialhistory', 'lkp_liveswith', 1021094, 'SocialHistory', 'livesWith')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_prof', 'lkp_anaestheti', 1231108, 'Sch_Profile', 'anaestheticType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_cancercontacts', 'lkp_hcpdiscipl', 1021048, 'CancerContacts', 'hCPDiscipline')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_phygcomp', 'lkp_evidenceof', 1021014, 'PersonalHygieneComponent', 'evidenceOfHairInfestation')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('adto_inpatientadtme', 'lkp_messagesta', 1161039, 'InPatientADTMessageQueue', 'messageStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_admissiondetai', 'lkp_sourceofad', 1021227, 'AdmissionDetail', 'sourceOfAdmission')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_pupils', 'lkp_pupilrigh2', 1021056, 'Pupils', 'pupilRightReaction')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_referralsrecor', 'lkp_referralso', 1231045, 'ReferralsRecording', 'referralSource')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_ventilationtra', 'lkp_requiresat', 1021014, 'VentilationTracheostomy', 'requiresATracheostomy')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_patientmeeting', 'lkp_status', 1231012, 'PatientMeeting', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_plinthworkacti', 'lkp_position', 1121014, 'PlinthWorkActivities', 'position')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patprocedure', 'lkp_infosource', 1021033, 'PatientProcedure', 'infoSource')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_discriminatorc', 'lkp_defaulttri', 1291020, 'DiscriminatorConfig', 'defaultTriagePriority')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_reportnoteprin', 'lkp_notetype', 1341023, 'ReportNotePrintTemplate', 'noteType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_sleepmed', 'lkp_route', 1021035, 'SleepingMedication', 'route')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_systemreviewsy', 'lkp_durationun', 1021130, 'SystemReviewSymptoms', 'durationUnit')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_vteriskassessm', 'lkp_varicoseve', 1021145, 'VTERiskAssessment', 'varicoseVeins')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_leisclub', 'lkp_clubname', 1011060, 'LeisueClubs', 'clubName')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_eatcomp', 'lkp_specialdie', 1001015, 'EatingComponent', 'specialDiet')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_drawingimage2', 'lkp_c_ty', 1021115, 'DrawingImage', 'type')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('edis_neonatal', 'lkp_route', 1021035, 'NeoNatal', 'route')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patientcorecli', 'lkp_supportnet', 1021209, 'PatientCoreClinicalData', 'supportNetworkStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_dischargedepis', 'lkp_discharge2', 1011097, 'DischargedEpisode', 'dischargeDestination')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_resultcomponen', 'lkp_displayfla', 1161040, 'ResultComponent', 'displayFlag')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_neuroreflexesa', 'lkp_analtest', 1051107, 'NeuroReflexesAnalTests', 'analTest')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_skinassfind', 'lkp_frequencyo', 1001037, 'SkinAssessmentFindings', 'frequencyOfChange')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_respiratorytre', 'lkp_referoncal', 1021014, 'RespiratoryTreatment', 'referOnCallPhysio')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_dementiaassess', 'lkp_q5nameofho', 1021145, 'DementiaAssessAndInvestigate', 'q5NameOfHospital')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_medprobonadmbo', 'lkp_status', 1021160, 'PatientProblem', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_brthcomp', 'lkp_difficulty', 1021014, 'BreathingComponent', 'difficultyBreathing')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_toolpmdt', 'lkp_mechanical', 1011093, 'PatientMovementHandlingDetails', 'mechanicalEquipment')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_transfers', 'lkp_patienttra', 1001052, 'Transfers', 'patientTransfers')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('hl7_outbound', 'lkp_messagetyp', 1411000, 'HL7Outbound', 'messageType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_printlocationc', 'lkp_printtoord', 1021145, 'PrintLocationConfig', 'printToOrderingLocation')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_tciforpatiente', 'lkp_tciofferme', 1021291, 'TCIForPatientElectiveList', 'tCIOfferMethod')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_adaptations', 'lkp_loan', 1021085, 'Adaptations', 'loan')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_dftcollectiont', 'lkp_sitecollec', 1161043, 'DFTCollectionTypesConfig', 'siteCollectionType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_checklistitems', 'lkp_checklisti', 1231002, 'ChecklistItems', 'checklistItem')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('edis_futureplanfoll', 'lkp_followupsp', 621, 'FuturePlanFollowUp', 'followUpSpecialty')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_opdspasticitya', 'lkp_treatmentp', 1051156, 'OPDSpasticityAssessTreat', 'treatmentPlan')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_mrsatreatmentd', 'lkp_treatment', 1001067, 'MRSATreatmentDetails', 'treatment')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_tracking', 'lkp_dischargel', 1231076, 'Tracking', 'dischargeLetterStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_opdfertilitycl', 'lkp_achieveere', 1051029, 'OPDFertClinic', 'achieveErection')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_electrotreat', 'lkp_c_si', 1051039, 'ElectrotherapyTensTreatment', 'size')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_sochistmartial', 'lkp_maritalsta', 766, 'SocialHistoryMaritalStatus', 'maritalStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_bloodsugar', 'lkp_c_ty', 1021179, 'BloodSugar', 'type')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patientdocumen', 'lkp_category', 1021220, 'PatientDocument', 'category')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_vteriskassessm', 'lkp_surgerylow', 1021145, 'VTERiskAssessment', 'surgeryLowerLimbPelvis60mins')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_racpeecg', 'lkp_otherfindi', 1231083, 'RACPExerciseECG', 'otherFindings')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_racpplanadvice', 'lkp_advicegiv2', 1021249, 'RACPPlanAdvice', 'adviceGivenToGP')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_presentingcoho', 'lkp_specialty', 621, 'PresentingComplaintHotlist', 'specialty')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_vteriskassessm', 'lkp_hipkneerep', 1021145, 'VTERiskAssessment', 'hipKneeReplacement')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_intraoperativd', 'lkp_dressing', 1231092, 'IntraOperativeDetails', 'dressing')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_chemotherapyde', 'lkp_outcomedos', 1021145, 'ChemotherapyDetails', 'outcomeDoseReduction')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_attendancekpic', 'lkp_awaitingt8', 1021145, 'AttendanceKPIConfig', 'awaitingTriageBreachKPIFlashingText')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_surgicalauditp', 'lkp_asagrade', 1021202, 'SurgicalAuditPreOpChecks', 'aSAGrade')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_commvisn', 'lkp_registered', 1021014, 'CommunicationVision', 'registeredBlind')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_triagenotedefa', 'lkp_status', 1021124, 'TriageNoteDefaultTextConfig', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_catsreferral', 'lkp_issecondar', 1341017, 'CatsReferral', 'isSecondaryReportRequired')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_handlingmoveme', 'lkp_mechanical', 1001084, 'HandlingMovementDetail', 'mechanicalEquipment')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_caetgoryqa', 'lkp_category', 1161000, 'CategoryQuestionAnswer', 'category')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_actualplandeta', 'lkp_organisati', 1251077, 'ActualPlanDetails', 'organisationPlanned')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_roomdetails', 'lkp_location', 1051090, 'RoomDetails', 'location')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_orderinvestiga', 'lkp_resultstat', 1161038, 'OrderInvestigation', 'resultStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_externalsy', 'lkp_messagesta', 1161039, 'ExternalSystemEvent', 'messageStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_clinicalnotes', 'lkp_forreviewd', 1021048, 'ClinicalNotes', 'forReviewDiscipline')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_carecontextsta', 'lkp_status', 1021262, 'CareContextStatusHistory', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_clinicianspeci', 'lkp_specialtie', 621, 'ClinicianSpecialtiesConfig', 'specialties')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_ventilationtra', 'lkp_breathsspo', 1021014, 'VentilationTracheostomy', 'breathsSpontaneously')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_opdfertilitycl', 'lkp_methodssuc', 1051125, 'OPDFertClinic', 'methodssuccessWith')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_actvlevl', 'lkp_activity', 1011003, 'ActivityLevel', 'activity')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_urinalysis', 'lkp_ascorbicac', 1021062, 'Urinalysis', 'ascorbicAcid')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_patientwaitin4', 'lkp_transport', 1141010, 'PatientElectiveList', 'transport')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('edis_futureplan', 'lkp_adviceapp2', 1231110, 'FuturePlan', 'adviceApplicatiableForUnit')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_opdfertclinics', 'lkp_semenfindi', 1051123, 'OPDFertClinicSemenAna', 'semenFinding')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_pataction', 'lkp_unit', 3424, 'PatAction', 'unit')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_surgicalauditp', 'lkp_confirmpat', 1021145, 'SurgicalAuditPreOpChecks', 'confirmPatientDetails')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_graphicimage', 'lkp_imagestatu', 1021124, 'DrawingGraphicImage', 'imageStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_jobnotificatio', 'lkp_delivery', 1031019, 'ConfiguredJobNotification', 'delivery')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_patientpropert', 'lkp_propertybo', 1021014, 'PatientProperty', 'propertyBookComplete')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_taxonomyupload', 'lkp_taxonomyel', 1021242, 'TaxonomyUpload', 'taxonomyElement')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_procedureconte', 'lkp_c_curren', 1021099, 'ActivityContextPricingDetails', 'currency')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_wheelchairskil', 'lkp_wheelchair', 1051067, 'WheelchairSkillsAssessment', 'wheelchairSkill')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_systemreviewfo', 'lkp_c_syst', 1231133, 'SystemReviewForPresentingProblemConfig', 'system')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_systemsreview', 'lkp_systems', 1231133, 'SystemsReview', 'systems')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_clinicaloutco2', 'lkp_context', 1341030, 'ClinicalOutcomeContextProcedureRequiredConfig', 'context')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_correspnotes', 'lkp_notetype', 1341018, 'CorrespondenceNote', 'noteType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_mskexamjointbd', 'lkp_generalfin', 1051136, 'MSkExamJointBonesDetail', 'generalFindingsBone')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_sleepmed', 'lkp_frequency', 1021038, 'SleepingMedication', 'frequency')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_paincomp', 'lkp_patienttak', 1021014, 'PainComponent', 'patientTakePainMeds')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_booking_appoin', 'lkp_outcome', 1141020, 'Booking_Appointment', 'outcome')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_patienthomesit', 'lkp_fittotakeh', 1021014, 'PatientHomeSituation', 'fitToTakeHome')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_internalreferr', 'lkp_referralso', 1251093, 'InternalReferral', 'referralSource')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_activitypathwa', 'lkp_appointmen', 1141007, 'ActivityStatusToPathwayEvent', 'appointmentStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_teletherapydet', 'lkp_nooffields', 1251060, 'TeletherapyDetails', 'noOfFields')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_nurbowelcompon', 'lkp_bowelrouti', 1001058, 'NurBowelComponent', 'bowelRoutinePerformedIn')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_slot_history', 'lkp_status', 1141007, 'SessionSlotStatus', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_racpmedicatio2', 'lkp_medication', 1231086, 'RACPMedicationStatus', 'medication')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_booking_appoin', 'lkp_apptstatu2', 1141007, 'Booking_Appointment', 'apptStatusReas')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_socialhistory', 'lkp_fittocaref', 1021014, 'SocialHistory', 'fitToCareForPatient')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_spircomp', 'lkp_continuepr', 1021014, 'SpiritualityComponent', 'continuePracticing')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_edadmission', 'lkp_admittingc', 1291021, 'EDPartialAdmission', 'admittingConsultant')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_resultcomponen', 'lkp_resultspec', , 'ResultComponent', 'resultSpecimenType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_vteriskassessm', 'lkp_untreatedb', 1021145, 'VTERiskAssessment', 'untreatedBleedingDisorder')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_pupils', 'lkp_pupilleftr', 1021056, 'Pupils', 'pupilLeftReaction')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_helptext', 'lkp_textcatego', 1161005, 'HelpText', 'textCategory')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('edis_futureplan', 'lkp_statemento', 1021145, 'FuturePlan', 'statementOfFitnessToWorkIssue')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patientnosupse', 'lkp_supportnet', 1021209, 'PatientNoSupportNetworkServicesInfo', 'supportNetworkServiceStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_clinicalnotes', 'lkp_noteclassi', 1231107, 'ClinicalNotes', 'noteClassification')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_reportnote', 'lkp_notestatus', 1341024, 'ReportNote', 'noteStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_opdfertilitycl', 'lkp_screencons', 1051121, 'OPDFertClinic', 'screenConsent')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patientdocumen', 'lkp_status', 1021124, 'PatientDocument', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_emergencyatten', 'lkp_urgencylev', 1291033, 'EmergencyAttendance', 'urgencyLevel')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_providersystem', 'lkp_category', 1161000, 'ProviderSystem', 'category')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_referralerod', 'lkp_erodstatus', 1341042, 'ReferralEROD', 'erodStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_pataction', 'lkp_reason', 1281026, 'PatAction', 'reason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_allergiesdetai', 'lkp_confirmeds', 1021027, 'PatientAllergy', 'confirmedStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_vteriskassessm', 'lkp_criticalca', 1021145, 'VTERiskAssessment', 'criticalCareAdmission')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_electrothpneum', 'lkp_startingpo', 2621, 'ElectrotherapyPneumaticTreatment', 'startingPosition')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_skincomp', 'lkp_cushiontyp', 1001042, 'SkinComponent', 'cushionType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_urinalysis', 'lkp_glucose', 1021062, 'Urinalysis', 'glucose')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_notetype', 'lkp_notetype', 1231043, 'NoteType', 'noteType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('spin_respobserv', 'lkp_observfind', 1051134, 'RespObserv', 'observFind')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('pthw_pathway', 'lkp_journeycou', 1321011, 'Pathway', 'journeyCountType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_chemotherapyde', 'lkp_status', 1021124, 'ChemotherapyDetails', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patprocedure', 'lkp_procedureu', 1021161, 'PatientProcedure', 'procedureUrgency')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_icabreferral', 'lkp_status', 1341002, 'ICABReferral', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_eatoral', 'lkp_status', 1021014, 'EatingOralAssessment', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_injuryassociat', 'lkp_associated', 1051102, 'InjuryAssocFactor', 'associatedFactor')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_sch_session', 'lkp_pasclinic', 1141018, 'Sch_Session', 'pASClinic')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_checklistitems', 'lkp_absentpres', 1021014, 'ChecklistItems', 'absentPresent')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('pthw_target', 'lkp_status', 1021124, 'Target', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_patientcasecon', 'lkp_discharge2', 1021130, 'PatientCaseConference', 'dischargeDelayUnit')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_inpat_epis', 'lkp_vteassessm', 1231125, 'InpatientEpisode', 'vTEAssessmentStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_pas_event', 'lkp_eventtype', 1021186, 'PASEvent', 'eventType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_opdfertilitycl', 'lkp_sexdrive', 1051116, 'OPDFertClinic', 'sexDrive')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_patienthomesit', 'lkp_railside', 1231054, 'PatientHomeSituation', 'railSide')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_primarytumourd', 'lkp_pretreatm9', 1251035, 'PrimaryTumourDetails', 'preTreatmentOverAllCert')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_pattreatpl', 'lkp_treatmenti', 3199, 'PatTreatmentPlan', 'treatmentIntent')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_skincomp', 'lkp_turntype', 1001048, 'SkinComponent', 'turnType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_dementiafind', 'lkp_deliriumco', 1021145, 'DementiaFind', 'deliriumConfirmed')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_emergencyatte2', 'lkp_paymentmad', 1021145, 'EmergencyAttendanceBilling', 'paymentMade')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_charttypedatas', 'lkp_linecolour', 1021175, 'ChartTypeDataset', 'lineColourPointIcon')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_dementiaassess', 'lkp_q7yearww2e', 1021145, 'DementiaAssessAndInvestigate', 'q7YearWW2Ended')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_pacslaunchaudi', 'lkp_pacsclient', 1021286, 'PACSLaunchAudit', 'pACSClientType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_surgicalaudsp', 'lkp_surgicalpa', 1231128, 'SurgicalAuditSurgicalPack', 'surgicalPack')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_adviceleaflets', 'lkp_givento', 1021059, 'AdviceLeaflets', 'givenTo')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_commmob', 'lkp_assistance', 1021014, 'MobilityComponent', 'assistanceWithMobility')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_dressingsandai', 'lkp_periodinte', 1021130, 'DressingsAndAids', 'periodInterval')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_pendingtransfe', 'lkp_currentsta', 1021232, 'PendingTransfers', 'currentStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_smokingdetails', 'lkp_smokingwha', 1021008, 'SmokingDetails', 'smokingWhat')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_vipscore', 'lkp_action', 1231037, 'VIPScore', 'action')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_correspostatus', 'lkp_correspond', 1231024, 'CorrespondenceStatus', 'correspondenceStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_dementiaworkli', 'lkp_status', 1021281, 'DementiaWorklistStatus', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_temperature', 'lkp_instrument', 1021051, 'Temperature', 'instrument')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_patientgoal', 'lkp_areaofneed', 1231010, 'PatientGoal', 'areaOfNeed')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_suspensiondeta', 'lkp_suspension', 1341044, 'SuspensionDetailsForPatientElectiveList', 'suspensionReason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_resultspecimen', 'lkp_alternates', 1161052, 'ResultSpecimenTypes', 'alternateSpecimenTypes')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_skinassfind', 'lkp_surroundin', 1001030, 'SkinAssessmentFindings', 'surroundingSkin')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_handlingmoveme', 'lkp_movement', 1001083, 'HandlingMovementDetail', 'movement')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_edadmission', 'lkp_specialty', 621, 'EDPartialAdmission', 'specialty')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_toolptdt', 'lkp_assessment', 1011090, 'PatientMovementHandlingScreeningDetails', 'assessment')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('adto_demographicsmq', 'lkp_messagesta', 1161039, 'DemographicsMessageQueue', 'messageStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_tiig', 'lkp_attackerha', 1291025, 'TIIG', 'attackerHadConsumedAlcohol')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_electrotreat', 'lkp_model', 1051035, 'ElectrotherapyTensTreatment', 'model')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_prof', 'lkp_prftype', 1141000, 'Sch_Profile', 'prftype')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_illicitdrugdet', 'lkp_currentsta', 1231106, 'IllicitDrugDetails', 'currentStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_gaittreatment', 'lkp_supervisio', 1051077, 'GaitTreatment', 'supervisionLevel')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_diathermyplate', 'lkp_skinshaved', 1021145, 'DiathermyPlateDetail', 'skinShaved')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_presproblemche', 'lkp_specialty', 621, 'PresProblemChecklistConfig', 'specialty')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_primarytumourd', 'lkp_pretreatm6', 1251035, 'PrimaryTumourDetails', 'preTreatmentMCert')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('corr_templatecatego', 'lkp_dischargec', 1111001, 'TemplateCategory', 'dischargeCategories')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_referralerod', 'lkp_erodtype', 1341037, 'ReferralEROD', 'eRODType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('asse_graphicfinding', 'lkp_activestat', 1021124, 'DrawingGraphicFinding', 'activeStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_orderinvestiga', 'lkp_collection', 1161043, 'OrderInvestigation', 'collectionType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_skincomp', 'lkp_mattressty', 1001020, 'SkinComponent', 'mattressType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_investigations', 'lkp_investigat', 1051104, 'InvAndPlan', 'investigationOrdered')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_pataction', 'lkp_modality', 3422, 'PatAction', 'modality')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_bedspacestates', 'lkp_reasonforc', 1021233, 'BedSpaceStateStatus', 'reasonForClosure')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_orderspecimen', 'lkp_sitecd', 1161028, 'OrderSpecimen', 'siteCd')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_edtransfer', 'lkp_transferes', 1291051, 'EDTransfer', 'transferEscort')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_patienthomesit', 'lkp_fittocaref', 1021014, 'PatientHomeSituation', 'fitToCareForPatient')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_splintdetails', 'lkp_splintsize', 2286, 'SplintDetails', 'splintSize')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_bladdermictr', 'lkp_urinarydiv', 1001003, 'BladderMicturition', 'urinaryDiversion')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_whiteboardques', 'lkp_answertype', 1021122, 'WhiteBoardQuestionConfig', 'answerType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_attendancekpic', 'lkp_losbreach3', 1021145, 'AttendanceKPIConfig', 'losBreachWarningKPIFlashingText')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_nurbowelcompon', 'lkp_bowelsopen', 1021014, 'NurBowelComponent', 'bowelsOpenSpontaneously')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_sleepapnoea', 'lkp_apnoeafact', 1051166, 'SleepApnoea', 'apnoeaFactors')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('pthw_patientevent', 'lkp_eventstatu', 1321007, 'PatientEvent', 'eventStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_mskspineexamin', 'lkp_findingtyp', 1051106, 'MskSpineExamFinding', 'findingType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_furthermanagem', 'lkp_anothercon', 1341005, 'FurtherManagement', 'anotherConsultationAppt')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_procedureconte', 'lkp_pricecateg', 1101007, 'ActivityContextPricingDetails', 'priceCategory')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_urinalysis', 'lkp_blood', 1021062, 'Urinalysis', 'blood')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_cancercareplan', 'lkp_noanticanc', 1251047, 'CancerCarePlan', 'noAntiCancerTxReason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('icps_patienticpstas', 'lkp_status', 1181012, 'PatientICPStageStatus', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_phygfeet', 'lkp_patientbat', 1021014, 'PersonalHygieneFeet', 'patientBatheFeet')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_awaitingclinic', 'lkp_clinicali2', 1341028, 'AwaitingClinicalInfo', 'clinicalInfoReceived')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_vteriskassessm', 'lkp_activecanc', 1021145, 'VTERiskAssessment', 'activeCancer')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_carecontexthis', 'lkp_context', 1021167, 'CareContextHistory', 'context')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patientconcern', 'lkp_teamidenti', 1021048, 'PatientConcern', 'teamIdentified')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('pthw_patientevent', 'lkp_specialty', 621, 'PatientEvent', 'specialty')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_needsassessme2', 'lkp_componentt', 1021137, 'NeedsAssessmentComponentScore', 'componentType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_plinthworkanal', 'lkp_balanceana', 1121007, 'PlinthWorkAnalysis', 'balanceAnalysis')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_theatrebooking', 'lkp_tcitime', 1141021, 'TheatreBooking', 'tCITime')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('edis_futureplan', 'lkp_livesalone', 1021145, 'FuturePlan', 'livesAlone')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_primarytumourd', 'lkp_pretreatm2', 1251035, 'PrimaryTumourDetails', 'preTreatmentTCert')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_businessrule', 'lkp_category', 1031015, 'BusinessRule', 'category')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_painassfind', 'lkp_c_ty', 1001022, 'PainAssessmentFindings', 'type')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_painassrev', 'lkp_c_ty', 1001022, 'PainAssessmentReview', 'type')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_nurbladdercomp', 'lkp_patienthav', 1021014, 'NurBladderComponent', 'patientHaveBladderControl')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_carecontexthis', 'lkp_locationty', 1021093, 'CareContextHistory', 'locationType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('asse_userassessment', 'lkp_category', 1021133, 'UserAssessment', 'category')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_documentstatus', 'lkp_correspond', 1021127, 'DocumentStatus', 'correspondenceStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_splintdetails', 'lkp_area', 1043, 'SplintDetails', 'area')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_referralletter', 'lkp_c_langua', 532, 'ReferralLetterDetails', 'language')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_appt_history_s', 'lkp_statusreas', 1141007, 'Appointment_Status', 'statusReason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_urinalysis', 'lkp_urobilinog', 1021062, 'Urinalysis', 'urobilinogen')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_opderectdysfxn', 'lkp_consetnfor', 1021014, 'OPDErectDysfxn', 'consetnFormSigned')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_commhear', 'lkp_batteriesi', 1021014, 'CommunicationHearing', 'batteriesInOrder')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patprocedure', 'lkp_proclatera', 1021032, 'PatientProcedure', 'procLaterality')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_brachytherapyd', 'lkp_brachythe3', 1251025, 'BrachytherapyDetails', 'brachyTherapyUnsealedSourceType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_safetylevel', 'lkp_safetyleve', 1001045, 'SafetyLevel', 'safetyLevel')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_catsreferral', 'lkp_onwardrefe', 1341015, 'CatsReferral', 'onwardReferralStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_mskgroups', 'lkp_bones', 1051138, 'MskGroups', 'bones')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_respiratorytr2', 'lkp_status', 1021014, 'RespiratoryTreatmentDetail', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_discharge', 'lkp_destinatio', 1011097, 'Discharge', 'destination')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_infectioncontr', 'lkp_controlreq', 1021014, 'InfectionControlComponent', 'controlRequirement')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_commcaredet', 'lkp_userdefin2', 1331006, 'CommunityCareDetail', 'userDefinedField2')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_referralletter', 'lkp_referrerty', 1021025, 'ReferralLetterDetails', 'referrerType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_chemotherapyde', 'lkp_clinicaltr', 1021145, 'ChemotherapyDetails', 'clinicalTrial')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('asse_userdefinedobj', 'lkp_activestat', 1021124, 'UserDefinedObject', 'activeStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_patientcasecon', 'lkp_caseconfou', 1231008, 'PatientCaseConference', 'caseConfOutCome')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_patienthomesit', 'lkp_ownership', 1231050, 'PatientHomeSituation', 'ownership')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_activity', 'lkp_reason', 1021100, 'Activity', 'reason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_racpplanadvice', 'lkp_primarypla', 1021250, 'RACPPlanAdvice', 'primaryPlan')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_electrotherap7', 'lkp_intensity', 1051044, 'ElectrotherapyUltrasoundTreatment', 'intensity')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_medic', 'lkp_thirdspeci', 621, 'Medic', 'thirdSpecialty')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_referralsrecor', 'lkp_specialtyf', 1231060, 'ReferralsRecording', 'specialtyFunctionCode')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('edis_dischargedetai', 'lkp_dischargel', 1231076, 'DischargeDetails', 'dischargeLetterStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_nurbowelcompon', 'lkp_timeofday', 1001057, 'NurBowelComponent', 'timeOfDay')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_racpexamfindin', 'lkp_auscultati', 1021247, 'RACPExamFindings', 'auscultationType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_primarytumourd', 'lkp_prognost12', 1251035, 'PrimaryTumourDetails', 'prognosticMCert')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_functionaltra2', 'lkp_finishposi', 1051047, 'FunctionalTransfersTechnique', 'finishPosition')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_deeptissuemass', 'lkp_laterality', 1021032, 'DeepFrictionMassage', 'laterality')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_vteriskassessm', 'lkp_lumbarpunc', 1021145, 'VTERiskAssessment', 'lumbarPunctureWithinNext12hrs')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_referralsrecor', 'lkp_reasonforr', 1021194, 'ReferralsRecording', 'reasonForReferral')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_nursingnotes', 'lkp_mrsaresult', 1001066, 'NursingNotes', 'mRSAResult')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_nureatingcompo', 'lkp_patientreq', 1021014, 'NurEatingComponent', 'patientRequireAssistance')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_medicationdeta', 'lkp_supplied', 1021014, 'PatientMedication', 'supplied')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patprocedure', 'lkp_procedures', 1021162, 'PatientProcedure', 'procedureStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_phygcomp', 'lkp_conditiono', 1011072, 'PersonalHygieneComponent', 'conditionOfHair')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_commhear', 'lkp_hearingaid', 1021014, 'CommunicationHearing', 'hearingAid')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_rehabilitation', 'lkp_activitygr', 1026, 'RehabilitationActivity', 'activityGroup')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_accomhous', 'lkp_assisstanc', 1021014, 'AccommodationHousing', 'assisstanceToOthers')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_dementiafind', 'lkp_camsacuteo', 1021145, 'DementiaFind', 'cAMSAcuteOnset')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_careplanmodali', 'lkp_modalityst', 1251052, 'CarePlanModality', 'modalityStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_wheelchairdet', 'lkp_wheelchair', 1051140, 'WheelchairDetails', 'wheelchairType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_vteriskassessm', 'lkp_notexpecte', 1021145, 'VTERiskAssessment', 'notExpectedReducedMobility')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_catsreferral', 'lkp_onwardref2', 1341016, 'CatsReferral', 'onwardReferralReason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_boweldhr', 'lkp_colour', 1011017, 'BowelDiarrhoea', 'colour')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_emergencyatte2', 'lkp_reasonforn', 1431010, 'EmergencyAttendanceBilling', 'reasonForNonPayment')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_supportnetwor3', 'lkp_profession', 1021048, 'SupportNetworkProfessional', 'profession')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_vitalsigns', 'lkp_patientcau', 1021206, 'VitalSigns', 'patientCausingConcern')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_brachytherapyd', 'lkp_actualdose', 1251081, 'BrachytherapyDetails', 'actualDoseRate')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('edis_ttamedicationd', 'lkp_doseunit', 1021015, 'TTAMedicationDetail', 'doseUnit')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_electivelistst', 'lkp_electiveli', 1021288, 'ElectiveListStatus', 'electiveListStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('corr_specialtyacces', 'lkp_accessrigh', 1111005, 'SpecialtyAccess', 'accessRight')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_emergencyepiso', 'lkp_incidentlo', 1291001, 'EmergencyEpisode', 'incidentLocation')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_mskexamjointbd', 'lkp_generalfi2', 1051137, 'MSkExamJointBonesDetail', 'generalFindingsJoint')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('edis_futureplan', 'lkp_returntowo', 1231109, 'FuturePlan', 'returnToWorkAdvice')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_tourniquetdeta', 'lkp_tourniquet', 1021145, 'TourniquetDetail', 'tourniquet')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_dementiaassess', 'lkp_q8monarch', 1021145, 'DementiaAssessAndInvestigate', 'q8Monarch')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('pthw_pathwaytargete', 'lkp_status', 1021124, 'PathwayTargetExternalEventMapping', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_customlist', 'lkp_listtype', 1021254, 'CustomList', 'listType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_racpeecg', 'lkp_stopreason', 1231082, 'RACPExerciseECG', 'stopReasons')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_hcplocation', 'lkp_casetypes', 1101008, 'HcpLocation', 'caseTypes')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_commsplu', 'lkp_status', 1021014, 'CommunicationSpeechAndLanguageUnderstanding', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_primarytumourd', 'lkp_pretreatm4', 1251035, 'PrimaryTumourDetails', 'preTreatmentNCert')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_primarytumourd', 'lkp_differenta', 1251062, 'PrimaryTumourDetails', 'differentatationSource')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_userworkqueue', 'lkp_orignotety', 1101036, 'UserWorkQueue', 'origNoteType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_investigation', 'lkp_femalemin2', 1161007, 'Investigation', 'femaleMinReorderPeriodUnit')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_surgicalauditp', 'lkp_sitemarked', 1021145, 'SurgicalAuditPreOpChecks', 'siteMarked')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_clinicaloutcom', 'lkp_category', 1231117, 'ClinicalOutcomeConfig', 'category')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_vteriskassessm', 'lkp_knownthrom', 1021145, 'VTERiskAssessment', 'knownThrombophilias')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_emergencyatten', 'lkp_bedtypereq', 1021256, 'EmergencyAttendance', 'bedTypeRequested')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_consultationou', 'lkp_followupty', 1341013, 'ConsultationOutcome', 'followupType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_electrotreat', 'lkp_dailyusage', 1051037, 'ElectrotherapyTensTreatment', 'dailyUsage')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_racpsymptomris', 'lkp_riskfacto2', 1021244, 'RACPSymptomRiskFactors', 'riskFactors')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_vtmhotlist', 'lkp_specialty', 621, 'VTMHotlist', 'specialty')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_fluidbalinstan', 'lkp_timeperiod', 1021180, 'FluidBalanceInstance', 'timePeriod')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_dementiafind', 'lkp_hasformald', 1021145, 'DementiaFind', 'hasFormalDiagnosisOfDementia')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_appcontextvari', 'lkp_valuetype', 1031011, 'AppContextVariable', 'valueType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_bladdermngm', 'lkp_method', 1001004, 'BladderManagement', 'method')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_boweldhr', 'lkp_amount', 1011013, 'BowelDiarrhoea', 'amount')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('spin_respobserv', 'lkp_observtype', 1051134, 'RespObserv', 'observType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_pataction', 'lkp_status', 1281026, 'PatAction', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_repositioningp', 'lkp_blanching', 1001072, 'RepositioningPlan', 'blanching')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_bladcomp', 'lkp_assistance', 1021014, 'BladderComponent', 'assistanceContinence')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_medication', 'lkp_doseunit', 1021015, 'PatientMedicationDose', 'doseUnit')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_hcplocationacc', 'lkp_accreditat', 1021111, 'HcpLocationAccredHis', 'accreditationStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_vteriskassessm', 'lkp_riskgroup', 1231123, 'VTERiskAssessment', 'riskGroup')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('edis_futureplan', 'lkp_refrainfr2', 1021130, 'FuturePlan', 'refrainFromWorkUnit')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_primarytumourd', 'lkp_tumourlate', 1021032, 'PrimaryTumourDetails', 'tumourLaterality')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_commcaredet', 'lkp_userdefin4', 1331008, 'CommunityCareDetail', 'userDefinedField4')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_cancermdtmeeti', 'lkp_patientper', 1251045, 'CancerMDTMeeting', 'patientPerformanceStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_mskjbmovements', 'lkp_moveaction', 1051175, 'MskJointMovement', 'moveAction')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_pmhchecklist', 'lkp_specialty', 621, 'PMHChecklistConfig', 'specialty')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_electrotherap2', 'lkp_warninggiv', 1021014, 'ElectrotherapyUltrasound', 'warningGiven')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_signatoryshift', 'lkp_endtime', 1021180, 'SignatoryShiftDetails', 'endTime')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_boweldiarrhoea', 'lkp_status', 1021014, 'BowelDiarrhoeaConstipation', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_referralstatus', 'lkp_referralst', 1341000, 'ReferralStatusConfig', 'referralStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_sch_session', 'lkp_statusreas', 1141004, 'Sch_Session', 'statusReason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_medicationdeta', 'lkp_discontinu', 1021184, 'PatientMedication', 'discontinuedByType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_pattreatpl', 'lkp_seenlocati', 3196, 'PatTreatmentPlan', 'seenLocation')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('adto_inpatientadtme', 'lkp_queuetype', 1021259, 'InPatientADTMessageQueue', 'queueType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_bowelmed', 'lkp_frequency', 1021038, 'BowelMedication', 'frequency')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_mdtlistanddate', 'lkp_listpatien', 1231017, 'MDTListandDates', 'listPatientisOn')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_brachytherapyd', 'lkp_brachythe2', 1251024, 'BrachytherapyDetails', 'brachyTherapyIsotopeType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_intraoperativd', 'lkp_swabcount', 1021145, 'IntraOperativeDetails', 'swabCount')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_attendancekpic', 'lkp_awaitingt3', 1021145, 'AttendanceKPIConfig', 'awaitingTriageBreachWarningKPIFlashingText')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_ocsorder', 'lkp_ordercateg', 1161035, 'OcsOrderSession', 'orderCategory')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_allergen', 'lkp_allergenty', 1021028, 'Allergen', 'allergenType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('pthw_pathway', 'lkp_specialty', 621, 'Pathway', 'specialty')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_ventilationch2', 'lkp_probechang', 1021145, 'VentilationChart', 'probeChange')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_admissiondetaq', 'lkp_question', 1001074, 'AdmissionDetailsQuestions', 'question')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_investigationi', 'lkp_orderabili', 1161050, 'InvestigationIndex', 'orderability')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_orderinvestiga', 'lkp_orderprior', 1161004, 'OrderInvestigation', 'orderPriority')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_booking_appoin', 'lkp_apptconfir', 1141012, 'Booking_Appointment', 'apptConfirmStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_suitableforsur', 'lkp_theatretyp', 1141022, 'SuitableForSurgeryAssessment', 'theatreType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_booking_appoin', 'lkp_consmediat', 1141025, 'Booking_Appointment', 'consMediaType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_episodeofcareh', 'lkp_specialty', 621, 'EpisodeOfCareHistory', 'specialty')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_medication', 'lkp_commencedb', 1021184, 'PatientMedicationDose', 'commencedByType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_datasettype', 'lkp_deflinecol', 1021175, 'DatasetType', 'defLineColPtIcon')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_planofcare', 'lkp_c_gro', 1231039, 'PlanOfCare', 'group')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_providercancel', 'lkp_reason', 1341011, 'ProviderCancellation', 'reason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patientimplant', 'lkp_charactere', 1021090, 'PatientCharacteristic', 'characteresticType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_onwardreferrtr', 'lkp_requestedb', 1021145, 'OnwardReferralFromTriage', 'requestedByGP')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_tgroupsitetnmv', 'lkp_tnmtype', 1251033, 'TumourGroupSiteTNMValue', 'tNMType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_therapist', 'lkp_specialty', 621, 'Therapist', 'specialty')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_furthermanagem', 'lkp_followupty', 1341013, 'FurtherManagement', 'followupType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_patientclerica', 'lkp_status', 1161054, 'PatientClericalTask', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('pthw_apptoutcomecfg', 'lkp_appointmen', 1141020, 'AppointmentOutcomeConfig', 'appointmentOutcome')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_medication', 'lkp_isstoppedr', 1021037, 'PatientMedicationDose', 'isStoppedReason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_commsplg', 'lkp_speechlang', 1021014, 'CommunicationSpeechAndLanguage', 'speechLanguageDifficulty')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_hydrotherapy', 'lkp_levelofass', 1051002, 'Hydrotherapy', 'levelOfAssistance')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_tourniquetdeta', 'lkp_tournique3', 1231103, 'TourniquetDetail', 'tourniquetPressure')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_primarytumourd', 'lkp_tumourstat', 1251085, 'PrimaryTumourDetails', 'tumourStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_patientturns', 'lkp_position', 1021075, 'PatientTurns', 'position')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_brachytherapyd', 'lkp_patienttyp', 1251087, 'BrachytherapyDetails', 'patientType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_electrotreat', 'lkp_c_mo', 1051036, 'ElectrotherapyTensTreatment', 'mode')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_nutritionalmet', 'lkp_c_ty', 1001064, 'NutritionalMethod', 'type')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_sessiontheatre', 'lkp_status', 1141007, 'SessionTheatreTCISlot', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_admissiondetai', 'lkp_preferredl', 1001085, 'AdmissionDetails', 'preferredLang')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_wheelchairskil', 'lkp_wheelchai2', 1051068, 'WheelchairSkillsAssessment', 'wheelchairSkillAssLevel')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_bowelcmp', 'lkp_bowelsopen', 1011011, 'BowelComponent', 'bowelsOpen')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_surgicalaudpd', 'lkp_surgicalch', 1021145, 'SurgicalAuditProcedureDetails', 'surgicalCheckListPerformed')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_catergoryquest', 'lkp_ocrrcatego', 1161000, 'CategoryQuestion', 'oCRRCategory')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_prof', 'lkp_slottype', 1141024, 'Sch_Profile', 'slotType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_ventilationch2', 'lkp_cuff', 1021088, 'VentilationChart', 'cuff')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_chemocycledeta', 'lkp_treatmentt', 1251100, 'ChemoCycleDetailsCCO', 'treatmentType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_painassrev', 'lkp_depth', 1001026, 'PainAssessmentReview', 'depth')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_urinalysis', 'lkp_protein', 1021062, 'Urinalysis', 'protein')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_dementiaassess', 'lkp_q9countbac', 1021145, 'DementiaAssessAndInvestigate', 'q9CountBackwards')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_mskjoints', 'lkp_movements', 1051128, 'MskJoints', 'movements')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_clinicalnotesa', 'lkp_correctedr', 1021144, 'ClinicalNotesAdditional', 'correctedReason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_consultationou', 'lkp_discharget', 1341019, 'ConsultationOutcome', 'dischargeType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_jobnotificatio', 'lkp_priority', 1031020, 'ConfiguredJobNotification', 'priority')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_medic', 'lkp_specialty', 621, 'Medic', 'specialty')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('edis_summary', 'lkp_hashadanyp', 1021145, 'Summary', 'hasHadAnyProceduresPerformed')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_referralsrecor', 'lkp_urgentcanc', 1021196, 'ReferralsRecording', 'urgentCancerReferralType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_connectivetiss', 'lkp_laterality', 1021032, 'ConnectiveTissueMassage', 'laterality')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_ventilationtra', 'lkp_tracheost2', 1021074, 'VentilationTracheostomy', 'tracheostomyAccessories')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_dischargesumma', 'lkp_medicallyi', 1341010, 'DischargeSummaryPacuAndWard', 'medicallyIncomplete')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_admissiondetai', 'lkp_wardtype', 1021228, 'AdmissionDetail', 'wardType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_wardbayconfig', 'lkp_specialtie', 621, 'WardBayConfig', 'specialties')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_inpatientdisch', 'lkp_reviewinun', 1231030, 'InpatientDischargeNoteFollowup', 'reviewinUnits')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_containertypes', 'lkp_c_si', 1161015, 'PathSpecimenContainer', 'size')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patientcorecli', 'lkp_allergysta', 1021207, 'PatientCoreClinicalData', 'allergyStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_emergencyatten', 'lkp_edconsulta', 1291043, 'EmergencyAttendance', 'eDConsultant')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_admissiondetaq', 'lkp_answer', 1021145, 'AdmissionDetailsQuestions', 'answer')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_chemotherapyde', 'lkp_treatments', 1251096, 'ChemotherapyDetails', 'treatmentSite')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_admitassess', 'lkp_assessment', 1211000, 'AdmissionAssessment', 'assessmentType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_hcp', 'lkp_hcptype', 1021048, 'Hcp', 'hcpType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_outboundtrigge', 'lkp_queuetype', 1021259, 'OutboundTriggers', 'queueType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_surgerydetails', 'lkp_anaesthet2', 1021065, 'SurgeryDetails', 'anaesthetistGrade')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_patienthomesit', 'lkp_liveswith', 1021094, 'PatientHomeSituation', 'livesWith')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('edis_summary', 'lkp_discharges', 1231104, 'Summary', 'dischargeSupplementaryLetterStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_extendeddischa', 'lkp_discharger', 1021253, 'ExtendedDischargeDetail', 'dischargeReason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('adto_demographicsmq', 'lkp_msgtype', 1021260, 'DemographicsMessageQueue', 'msgType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_safeenvironmen', 'lkp_maintainow', 1021014, 'SafeEnvironmentComponent', 'maintainOwnSafety')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_smoking', 'lkp_smokingsta', 1021007, 'Smoking', 'smokingStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_infectioncontr', 'lkp_tb', 1021014, 'InfectionControlComponent', 'tB')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('pthw_adminevent', 'lkp_outcome', 1321015, 'AdminEvent', 'outcome')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_painassfind', 'lkp_severity', 1001023, 'PainAssessmentFindings', 'severity')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_slot_history', 'lkp_statusreas', 1141007, 'SessionSlotStatus', 'statusReason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_racppastmedica', 'lkp_relevantdi', 1021245, 'RACPPastMedicalHistory', 'relevantDiagnosis')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_environmentdet', 'lkp_checklistt', 1001086, 'EnvironmentalChecklistDetail', 'checklistType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_skinassfind', 'lkp_secondaryd', 1001036, 'SkinAssessmentFindings', 'secondaryDressing')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('pthw_rttstatusevent', 'lkp_encountert', 1321014, 'RTTStatusEventMap', 'encounterType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_frameexercise', 'lkp_frameexerc', 1121012, 'FrameExercise', 'frameExerciseSupportType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_emergencyatten', 'lkp_attendanc4', 1291056, 'EmergencyAttendance', 'attendanceReasonNotVerified')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_chemoregimensc', 'lkp_status', 1021124, 'ChemoRegimensConfig', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_ventilationch2', 'lkp_suction', 1021014, 'VentilationChart', 'suction')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('edis_summary', 'lkp_dischargel', 1231076, 'Summary', 'dischargeLetterStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patdiagnosis', 'lkp_informedof', 1021041, 'PatientDiagnosis', 'informedOfDiagnosis')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_chemotherapyde', 'lkp_outcomesto', 1021145, 'ChemotherapyDetails', 'outcomeStoppedEarly')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_resultdetails', 'lkp_c_ty', 1161058, 'ResultDetails', 'type')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_electrothpneum', 'lkp_laterality', 1021032, 'ElectrotherapyPneumaticTreatment', 'laterality')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_pendingelectiv', 'lkp_admissionm', 1021226, 'PendingElectiveAdmission', 'admissionMethod')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_skincomp', 'lkp_skincondit', 1011075, 'SkinComponent', 'skinCondition')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_radiotherapy', 'lkp_anatomical', 1251015, 'RadiotherapyDetails', 'anatomicalTreatmentSite')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_radiotherapy', 'lkp_diseasesta', 1251101, 'RadiotherapyDetails', 'diseaseStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_equipment', 'lkp_c_ty', 1021082, 'Equipment', 'type')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_environmentdet', 'lkp_answer', 1021145, 'EnvironmentalChecklistDetail', 'answer')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_respiratorytre', 'lkp_assistedco', 1051110, 'RespiratoryTreatment', 'assistedCough')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_actualplandeta', 'lkp_organisat2', 1251079, 'ActualPlanDetails', 'organisationOrganised')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_ocsorder', 'lkp_patmobilit', 1161025, 'OcsOrderSession', 'patMobility')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_teletherapydet', 'lkp_hasadjacen', 1021145, 'TeletherapyDetails', 'hasAdjacentFields')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_mskexamjointbd', 'lkp_laterality', 1021063, 'MSkExamJointBonesDetail', 'laterality')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_racpplanadvice', 'lkp_overallimp', 1021251, 'RACPPlanAdvice', 'overallImpression')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_rehabilitation', 'lkp_equipment', 1051008, 'RehabilitationActivity', 'equipment')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_drains', 'lkp_drains', 1021145, 'Drains', 'drains')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_containertypes', 'lkp_colour', 1161033, 'PathSpecimenContainer', 'colour')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_pathologydetai', 'lkp_vascularly', 1251040, 'PathologyDetails', 'vascularLymphInvasion')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_ventilationch2', 'lkp_painscale', 1001023, 'VentilationChart', 'painScale')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('asse_screenproficom', 'lkp_activestat', 1021124, 'ScreeningProfileComponent', 'activeStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_careplantempl', 'lkp_assessment', 1211028, 'CarePlanTemplate', 'assessmentComponent')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_painmed', 'lkp_route', 1021035, 'PainMedication', 'route')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_actvlevl', 'lkp_aidsused', 1011008, 'ActivityLevel', 'aidsUsed')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_actualplandeta', 'lkp_plannedtre', 1251078, 'ActualPlanDetails', 'plannedTreatmentType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_pataction', 'lkp_priority', 3201, 'PatAction', 'priority')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_investigationi', 'lkp_category', 1161000, 'InvestigationIndex', 'category')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_plinthworkanal', 'lkp_staticanal', 1021145, 'PlinthWorkAnalysis', 'staticAnalysis')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_thermalactivit', 'lkp_area', 1051025, 'ThermalActivity', 'area')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_personaldetail', 'lkp_occupation', 625, 'PersonalDetailsComponent', 'occupation')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_pendingelectiv', 'lkp_patientsta', 1021112, 'PendingElectiveAdmission', 'patientStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_patienthomesit', 'lkp_lift', 1231049, 'PatientHomeSituation', 'lift')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_skinassrev', 'lkp_surroundin', 1001030, 'SkinAssessmentReview', 'surroundingSkin')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_opdgennotes', 'lkp_autonomicd', 1021140, 'OPDGenNotes', 'autonomicDysreflexia')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patientconcern', 'lkp_allocatedt', 1021048, 'PatientConcern', 'allocatedToTeam')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_drgractv', 'lkp_ability', 1211020, 'DressingandGroomingActivities', 'ability')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_edtransfer', 'lkp_transfermo', 1291009, 'EDTransfer', 'transferMode')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_neuinterpret', 'lkp_completein', 1051150, 'NeuInterpret', 'completeIncomplete')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_mergedpatient', 'lkp_maritalsta', 766, 'MergedPatient', 'maritalStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_vteriskassessm', 'lkp_uncontroll', 1021145, 'VTERiskAssessment', 'uncontrolledHypertension')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_surgicalauditp', 'lkp_actiontake', 1231126, 'SurgicalAuditPreOpChecks', 'actionTaken')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_accomhome', 'lkp_status', 1021014, 'AccommodationHomeFacilities', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_dementiaassess', 'lkp_q1age', 1021145, 'DementiaAssessAndInvestigate', 'q1Age')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_handrangeofmov', 'lkp_dominantha', 1121016, 'HandRangeOfMovement', 'dominantHand')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_medicationdeta', 'lkp_commencedb', 1021184, 'PatientMedication', 'commencedByType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_dischargedepis', 'lkp_vteassessm', 1231125, 'DischargedEpisode', 'vTEAssessmentStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_brachytxtreatm', 'lkp_generalana', 1021145, 'BrachyTxTreatmentDetails', 'generalAnaesthetic')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_emergencyatten', 'lkp_intreprete', 1021145, 'EmergencyAttendance', 'intrepreterRequired')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_electrotreat', 'lkp_protocolfo', 1021014, 'ElectrotherapyTensTreatment', 'protocolFollowed')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_outpatientnote', 'lkp_outcome', 1231029, 'OutpatientNotesOutcome', 'outcome')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_hcplocation', 'lkp_accreditat', 1021111, 'HcpLocation', 'accreditationStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('spin_motorchartdeta', 'lkp_laterality', 1021063, 'MotorChartDetails', 'laterality')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_stoolscale', 'lkp_stooltype', 1001054, 'StoolScale', 'stoolType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_commvisn', 'lkp_wearlenses', 1021014, 'CommunicationVision', 'wearLenses')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_chemocycledeta', 'lkp_deliveryco', 1251099, 'ChemoCycleDetailsCCO', 'deliveryCodeAllOtherDays')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_assessmentcomp', 'lkp_componentt', 1211028, 'AssessmentComponent', 'componentType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_surgicalaudds', 'lkp_operations', 1231131, 'SurgicalAuditOperationDetailStatus', 'operationStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_phygactv', 'lkp_activities', 1001018, 'PersonalHygieneActivities', 'activities')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_erectdysfxtrea', 'lkp_treatment', 1051095, 'OPDErectDysfxTreatments', 'treatment')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_dischargedepis', 'lkp_treatmentd', 1021240, 'DischargedEpisode', 'treatmentDeferredReason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_allergyreactio', 'lkp_severity', 1021021, 'PatientAllergyReaction', 'severity')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_booking_appoin', 'lkp_apptstatus', 1141007, 'Booking_Appointment', 'apptStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_intraoperativd', 'lkp_skinprepar', 1231089, 'IntraOperativeDetails', 'skinPreparationUsed')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('pthw_event', 'lkp_eventtype', 1321008, 'Event', 'eventType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patientdocumen', 'lkp_specialty', 621, 'PatientDocument', 'specialty')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_electrotreat', 'lkp_area', 1051034, 'ElectrotherapyTensTreatment', 'area')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('hl7_outbound', 'lkp_messagecat', 1411000, 'HL7Outbound', 'messageCategory')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_questioninform', 'lkp_genderspec', 1031002, 'QuestionInformation', 'genderSpecific')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('pthw_adminevent', 'lkp_eventmetho', 1141025, 'AdminEvent', 'eventMethod')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_goalplanning', 'lkp_discharge2', 1021130, 'GoalPlanning', 'dischargeDelayUnit')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('asse_userdefinedob2', 'lkp_activestat', 1021124, 'UserDefinedObjectComponent', 'activeStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_procedure', 'lkp_surgeoncat', 1041003, 'Procedure', 'surgeonCategory')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('edis_dischargedetai', 'lkp_dischargem', 1021190, 'DischargeDetails', 'dischargeMethod')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_dischargesumma', 'lkp_followupty', 1341013, 'DischargeSummaryPacuAndWard', 'followupType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_patientturns', 'lkp_duration', 1001049, 'PatientTurns', 'duration')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_investigationi', 'lkp_activestat', 1021124, 'InvestigationIndex', 'activeStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_importresultsc', 'lkp_categories', 1161000, 'ImportResultsConfig', 'categories')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_resultcomponen', 'lkp_resultstat', 1161038, 'ResultComponent', 'resultStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_racpeecg', 'lkp_medication', 1231081, 'RACPExerciseECG', 'medicationAtTest')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_orderreshist', 'lkp_resultstat', 1161038, 'OrderResultHistory', 'resultStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('edis_ttastatus', 'lkp_status', 1231111, 'TTAStatus', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_drgrpref', 'lkp_preference', 1011044, 'DressingandGroomingPreferences', 'preferences')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_functionaltra2', 'lkp_risk', 1051048, 'FunctionalTransfersTechnique', 'risk')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_dementiafind', 'lkp_awarenessq', 1021145, 'DementiaFind', 'awarenessQuestion')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_opdgennotes', 'lkp_opdnextuni', 1021141, 'OPDGenNotes', 'opdNextUnits')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('edis_medicationonad', 'lkp_recordmed2', 1021145, 'MedicationOnAdmissionAndChanges', 'recordMedicationChanges')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patient', 'lkp_mrnstatus', 1021285, 'Patient', 'mRNStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_catsreferral', 'lkp_referralca', 1341033, 'CatsReferral', 'referralCategory')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_referralsrecor', 'lkp_delayreaso', 1231059, 'ReferralsRecording', 'delayReasonGPUrgentReferral')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_vteriskassessm', 'lkp_pregnancy', 1021145, 'VTERiskAssessment', 'pregnancy')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('edis_medicationdeta', 'lkp_ttarequire', 1231075, 'MedicationDetails', 'tTARequired')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_patienthomesit', 'lkp_stairs', 1231052, 'PatientHomeSituation', 'stairs')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_mskgroups', 'lkp_grouptype', 1051177, 'MskGroups', 'groupType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_rta', 'lkp_policestat', 1291034, 'RTA', 'policeStation')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_ventilationtra', 'lkp_modeofvent', 1021068, 'VentilationTracheostomy', 'modeOfVentilation')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('edis_medicationonad', 'lkp_recordmedi', 1021145, 'MedicationOnAdmissionAndChanges', 'recordMedicationOnAdmission')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('adto_edattendanceme', 'lkp_msgtype', 1021260, 'EdAttendanceMessageQueue', 'msgType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_specimenworkli', 'lkp_roundtocol', 1161041, 'SpecimenWorkListItem', 'roundToCollect')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_needsassessmen', 'lkp_attachbook', 1021145, 'NeedsAssessment', 'attachBookletToSummarySheet')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_workallocation', 'lkp_referralst', 1341000, 'WorkAllocation', 'referralStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_epworthsleepas', 'lkp_chanceofsl', 1051168, 'EpworthSleepAssessment', 'chanceOfSleep')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_referral', 'lkp_referralty', 1021081, 'Referral', 'referralType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_pattreatmentpl', 'lkp_treatmentt', 3415, 'PatTreatmentPlanGroupSiteTech', 'treatmentTechnique')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_personaldetail', 'lkp_takesnight', 1021014, 'PersonalDetailsComponent', 'takesNightSedation')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_dementiaassess', 'lkp_q4currentt', 1021145, 'DementiaAssessAndInvestigate', 'q4CurrentTime')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_reportnote', 'lkp_notetype', 1341023, 'ReportNote', 'noteType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_hydrotherapy', 'lkp_transferin', 1051003, 'Hydrotherapy', 'transferIn')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_emergencyepiso', 'lkp_occupation', 625, 'EmergencyEpisode', 'occupation')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('edis_futureplanfoll', 'lkp_followupty', 1021258, 'FuturePlanFollowUp', 'followUpType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_bladcont', 'lkp_bladderemp', 1021014, 'BladderContinence', 'bladderEmptySpontaneously')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_nutritionalmet', 'lkp_nutritiona', 1001014, 'NutritionalMethod', 'nutritionalMethod')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patientdocumen', 'lkp_correspond', 1021127, 'PatientDocument', 'correspondenceStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patientdocumen', 'lkp_emailstatu', 1021277, 'PatientDocument', 'emailStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_referraltospec', 'lkp_specialty', 621, 'ReferralToSpecTeam', 'specialty')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_vitalsignmonit', 'lkp_vitalssign', 1021058, 'VitalSignMonitoringGroup', 'vitalsSigns')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_appointmentout', 'lkp_appointmen', 1141027, 'AppointmentOutcomeAction', 'appointmentAction')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_chemotherapyde', 'lkp_cancertrea', 1251014, 'ChemotherapyDetails', 'cancerTreatementIntent')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_mskgroups', 'lkp_bonegenera', 1051136, 'MskGroups', 'boneGeneralFindings')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_boweldhr', 'lkp_consistenc', 1011015, 'BowelDiarrhoea', 'consistency')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_activemonitori', 'lkp_activemoni', 1341029, 'ActiveMonitoring', 'activeMonitoringReason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_vteriskassessm', 'lkp_significan', 1021145, 'VTERiskAssessment', 'significantMorbidities')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_investigationi', 'lkp_sites', 1161028, 'InvestigationIndex', 'sites')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_radiotherapy', 'lkp_concurrent', 1021145, 'RadiotherapyDetails', 'concurrentChemotherapy')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_orderset', 'lkp_activestat', 1021124, 'OrderSet', 'activeStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_primarytumourd', 'lkp_prognosti6', 1251035, 'PrimaryTumourDetails', 'prognosticGroupingCert')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_pataction', 'lkp_attendinga', 3204, 'PatAction', 'attendingAs')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_commsplg', 'lkp_verbally', 1011037, 'CommunicationSpeechAndLanguage', 'verbally')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_ane_att', 'lkp_modeofarri', 1021128, 'AEAttendance', 'modeOfArrival')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_visualacuity', 'lkp_systemused', 1021061, 'VisualAcuity', 'systemUsed')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_painassrev', 'lkp_severity', 1001023, 'PainAssessmentReview', 'severity')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_resultcomponen', 'lkp_unitofmeas', 1161036, 'ResultComponent', 'unitOfMeasure')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('asse_screeningprofi', 'lkp_activestat', 1021124, 'ScreeningProfile', 'activeStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_referral', 'lkp_sourceofre', 1021025, 'Referral', 'sourceOfReferral')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_planofcare', 'lkp_status', 1001069, 'PlanOfCare', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_emergencyatten', 'lkp_attendanc3', 1021033, 'EmergencyAttendance', 'attendanceSourceOfData')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_patientabsentd', 'lkp_status', 1231035, 'PatientAbsentDiagnosis', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_epworthsleepas', 'lkp_sleepscore', 1051161, 'EpworthSleepAssessment', 'sleepScore')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_electrotreat', 'lkp_laterality', 1021032, 'ElectrotherapyTensTreatment', 'laterality')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_sleepaids', 'lkp_patienttak', 1021014, 'SleepingAids', 'patientTakeMedicationToSleep')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_emergencyatten', 'lkp_attendance', 1291007, 'EmergencyAttendance', 'attendanceType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('corr_specialtyacces', 'lkp_specialty', 621, 'SpecialtyAccess', 'specialty')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_intraoperativd', 'lkp_nationaljo', 1021145, 'IntraOperativeDetails', 'nationalJointRegistryCompleted')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_rehabilitation', 'lkp_activityca', 1026, 'RehabilitationActivity', 'activityCategory')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_sch_session', 'lkp_sessiontyp', 1141000, 'Sch_Session', 'sessionType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_medication', 'lkp_admintimes', 1021036, 'PatientMedicationDose', 'adminTimes')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_electrotherap7', 'lkp_muscleaspe', 2239, 'ElectrotherapyUltrasoundTreatment', 'muscleAspect')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_racpeecg', 'lkp_preassesse', 1231080, 'RACPExerciseECG', 'preAssessesCHD')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_accommodation', 'lkp_livingarra', 1011000, 'Accommodation', 'livingArrangements')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_bladdermngm', 'lkp_c_ty', 1001005, 'BladderManagement', 'type')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_booking_appoin', 'lkp_category', 1341033, 'Booking_Appointment', 'category')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_clinicaloutcom', 'lkp_specialty', 621, 'ClinicalOutcomeConfig', 'specialty')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_services', 'lkp_turnaround', 1161007, 'Service', 'turnaroundMeasure')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_admissiondetai', 'lkp_patientsta', 1021112, 'AdmissionDetail', 'patientStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_infectioncontr', 'lkp_clostridiu', 1021014, 'InfectionControlComponent', 'clostridium')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_procedure', 'lkp_anaestheti', 1041003, 'Procedure', 'anaesthetistCategory')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_racppastmedica', 'lkp_ecgfinding', 1021246, 'RACPPastMedicalHistory', 'eCGFindings')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_questioninform', 'lkp_status', 1021124, 'QuestionInformation', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_opdspasasslimb', 'lkp_toneright', 1051165, 'OPDSpasAssLimbs', 'toneRight')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_protocoldiscri', 'lkp_priority', 1291020, 'ProtocolDiscriminator', 'priority')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_extendedadmiss', 'lkp_referredfr', 1021283, 'ExtendedAdmissionDetail', 'referredFromType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_safeenvironmen', 'lkp_haveaheadi', 1021014, 'SafeEnvironmentComponent', 'haveAHeadInjury')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_plinthworkanal', 'lkp_dynamic', 1021145, 'PlinthWorkAnalysis', 'dynamic')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_specimen', 'lkp_c_ty', 1161029, 'Specimen', 'type')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_episodeofcareh', 'lkp_relationsh', 1021165, 'EpisodeOfCareHistory', 'relationship')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_signatoryperio', 'lkp_timeperiod', 1021180, 'SignatoryPeriod', 'timePeriods')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patientfamilyh', 'lkp_relativeli', 1021014, 'PatientFamilyHistory', 'relativeLiving')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_attendancekpic', 'lkp_awaitingc8', 1021145, 'AttendanceKPIConfig', 'awaitingClinicianBreachKPIFlashingText')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_gp', 'lkp_status', 1021110, 'Gp', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_toolptdt', 'lkp_status', 1021014, 'PatientMovementHandlingScreeningDetails', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_skinassfind', 'lkp_woundbed', 1001029, 'SkinAssessmentFindings', 'woundBed')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_splintsadditio', 'lkp_feature', 1051057, 'SplintsAdditionalFeatures', 'feature')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patient', 'lkp_ethnicorig', 762, 'Patient', 'ethnicOrigin')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_skinassrev', 'lkp_pressureso', 1001028, 'SkinAssessmentReview', 'pressureSoreGrade')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_powerchairskil', 'lkp_powerchai2', 1051066, 'PowerchairSkillsAssessment', 'powerchairSkillAssLevel')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_onwardreferrtr', 'lkp_referralco', 1021145, 'OnwardReferralFromTriage', 'referralComplete')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_wheelchairsurf', 'lkp_surface', 1051114, 'WheelchairSurfaceDistance', 'surface')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_manchestertria', 'lkp_activestat', 1021124, 'ManchesterTriageProtocolConfiguration', 'activeStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_pain', 'lkp_pain', 1001023, 'Pain', 'pain')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_suitableforsur', 'lkp_reasonnots', 1341020, 'SuitableForSurgeryAssessment', 'reasonNotSuitable')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_resultcomponen', 'lkp_specimenso', 1161029, 'ResultComponent', 'specimenSource')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_referralsrecor', 'lkp_primarypre', 1231046, 'ReferralsRecording', 'primaryPreceeding')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_medprobonadmbo', 'lkp_source', 1021033, 'PatientProblem', 'source')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_tourniquetdeta', 'lkp_tournique2', 1231102, 'TourniquetDetail', 'tourniquetPosition')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_referraltospec', 'lkp_teamconsul', 1291021, 'ReferralToSpecTeam', 'teamConsultant')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_deathdetails', 'lkp_deathcoded', 1021187, 'DeathDetails', 'deathCodeDiscrepency')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_hydrotherapy', 'lkp_transferou', 1051004, 'Hydrotherapy', 'transferOut')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_patientpmhche2', 'lkp_sourceofin', 1021033, 'PatientPMHChecklistDiagnosis', 'sourceofInformation')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_pas_event', 'lkp_specialty', 621, 'PASEvent', 'specialty')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_repositioningp', 'lkp_position', 1021075, 'RepositioningPlan', 'position')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_peripheralrefl', 'lkp_rightfindi', 1051130, 'NeuroReflexesPeripheralFindings', 'rightFinding')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_secsconfigurat', 'lkp_c_ty', 1021178, 'SECSConfiguration', 'type')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patientmedical', 'lkp_currentsta', 1021272, 'PatientMedicalInsurance', 'currentStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_intraoperativd', 'lkp_skinclosur', 1231090, 'IntraOperativeDetails', 'skinClosure')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_functionalasse', 'lkp_functional', 1011099, 'FunctionalAndSupport', 'functionalSupports')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_attendanceclin', 'lkp_notetype', 1291045, 'AttendanceClinicalNotes', 'noteType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_racpsymptoms', 'lkp_rapcsympto', 1021243, 'RACPSymptoms', 'rAPCSymptom')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_dementiaassess', 'lkp_q2dob', 1021145, 'DementiaAssessAndInvestigate', 'q2DOB')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_skinassfind', 'lkp_exudatetyp', 1001032, 'SkinAssessmentFindings', 'exudateType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_electrotherap7', 'lkp_pulse', 1051042, 'ElectrotherapyUltrasoundTreatment', 'pulse')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_prof_slot', 'lkp_priority', 1141009, 'Profile_Slot', 'priority')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('asse_graphicgssessm', 'lkp_activestat', 1021124, 'GraphicAssessment', 'activeStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_nureatingcompo', 'lkp_specialdie', 1001015, 'NurEatingComponent', 'specialDiet')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_catheterdetail', 'lkp_difficulty', 1021145, 'CatheterDetail', 'difficultyWithInsertion')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_visitassessmen', 'lkp_c_ty', 1051147, 'VisitAssessmentComponent', 'type')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_tunourgroupsit', 'lkp_overallsta', 1251075, 'TumourGroupSiteOverallStaging', 'overallStageDescription')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_chemotherapyde', 'lkp_chemoradia', 1021145, 'ChemotherapyDetails', 'chemoRadiation')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patient', 'lkp_c_langua', 532, 'Patient', 'language')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_vteriskassessm', 'lkp_hipfractur', 1021145, 'VTERiskAssessment', 'hipFracture')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_functionalasse', 'lkp_status', 1021014, 'FunctionalAndSupport', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_racpeecg', 'lkp_result', 1231084, 'RACPExerciseECG', 'result')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_chemoregimensc', 'lkp_regimen', 1251027, 'ChemoRegimensConfig', 'regimen')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_rta', 'lkp_protection', 1291005, 'RTA', 'protectionDevice')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_goalplanningm2', 'lkp_status', 1231014, 'GoalPlanningMeetingAttendee', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_wheelchairasse', 'lkp_chairtype', 1051140, 'WheelchairAssessment', 'chairType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_skinassfind', 'lkp_primarydre', 1001035, 'SkinAssessmentFindings', 'primaryDressing')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_sessionparentc', 'lkp_statusreas', 1141007, 'SessionParentChildSlot', 'statusReason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_caseconfhcpsta', 'lkp_attendance', 1231014, 'CaseConfMOSStatus', 'attendanceStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_brthcomp', 'lkp_breathingd', 1211031, 'BreathingComponent', 'breathingDyspnoea')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_appointmentout', 'lkp_outcomeofa', 1141026, 'AppointmentOutcomeAction', 'outcomeOfAction')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_splintswearreg', 'lkp_weartimere', 1051023, 'SplintsWearRegime', 'wearTimeRegime')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_prognosticgrp', 'lkp_prognostic', 1251095, 'PrognosticGrouping', 'prognosticGroup')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_educationtocar', 'lkp_carer', 1121005, 'EducationToCarers', 'carer')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_taxonomyupload', 'lkp_filetype', 1031014, 'TaxonomyUpload', 'fileType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_balanceactivit', 'lkp_balanceact', 1121010, 'BalanceActivities', 'balanceActivities')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_opdspasassesst', 'lkp_opdtreatgo', 1051159, 'OPDSpasAssessTreatGoal', 'oPDTreatGoalStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('pthw_extevenmap', 'lkp_c_gro', 1321000, 'ExternalEventMapping', 'group')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_wheelchaircush', 'lkp_cushionsiz', 1051146, 'WheelchairCushion', 'cushionSize')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_catsreferralst', 'lkp_secondopin', 1341027, 'CATSReferralStatus', 'secondOpinionCategory')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('asse_dppquestiongro', 'lkp_c_gro', 1231039, 'DPPQuestionGroup', 'group')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patient', 'lkp_homefolder', 1021268, 'Patient', 'homeFolderLocation')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_skinassfind', 'lkp_woundtype', 1001038, 'SkinAssessmentFindings', 'woundType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_referralsrecor', 'lkp_referralca', 1231058, 'ReferralsRecording', 'referralCategory')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_opdspasasslimb', 'lkp_toneleft', 1051165, 'OPDSpasAssLimbs', 'toneLeft')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_infectioncontr', 'lkp_norovirus', 1021014, 'InfectionControlComponent', 'norovirus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_sess_slot', 'lkp_statusreas', 1141007, 'Session_Slot', 'statusReason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_appointmentcli', 'lkp_notetype', 1341023, 'AppointmentClinicalNotes', 'noteType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_electivelistst', 'lkp_removalrea', 1341043, 'ElectiveListStatus', 'removalReason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_appsite', 'lkp_site', 1021238, 'AppSite', 'site')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_racpreferral', 'lkp_delayreaso', 1021265, 'RACPReferral', 'delayReason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('pthw_pathwaytargetr', 'lkp_status', 1021124, 'PathwayTargetRTTEvent', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_teletherapydet', 'lkp_complexity', 2930, 'TeletherapyDetails', 'complexityGroup')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_pattreatmentpl', 'lkp_treatmentg', 1251108, 'PatTreatmentPlanGroupSiteTech', 'treatmentGroupSite')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_nurse', 'lkp_nursetype', 1021048, 'Nurse', 'nurseType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patdiagnosis', 'lkp_site', 1231021, 'PatientDiagnosis', 'site')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_mergedpatient', 'lkp_c_langua', 532, 'MergedPatient', 'language')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_radiotherapy', 'lkp_radiothera', 1251016, 'RadiotherapyDetails', 'radiotherapyType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_mobilisations', 'lkp_treatmentt', 1051007, 'MobilisationsTreatment', 'treatmentType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_activity', 'lkp_specialreq', 1021101, 'Activity', 'specialRequirements')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_opdspasticitya', 'lkp_botulismtr', 1051157, 'OPDSpasticityAssessTreat', 'botulismTreatment')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_chemotherapyde', 'lkp_regimenacr', 1251027, 'ChemotherapyDetails', 'regimenAcronym')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patdiagnosis', 'lkp_diaglatera', 1021032, 'PatientDiagnosis', 'diagLaterality')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_alcohol', 'lkp_unitsperwe', 1021147, 'Alcohol', 'unitsPerWeek')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_signatoryshift', 'lkp_starttime', 1021180, 'SignatoryShiftDetails', 'startTime')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_emergencyatte2', 'lkp_exemptionr', 1291044, 'EmergencyAttendanceBilling', 'exemptionReason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_patientpmhche3', 'lkp_selected', 1021014, 'PatientPMHChecklistProcedure', 'selected')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_workqueuestatu', 'lkp_status', 1101040, 'WorkQueueStatus', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_opdfertilitycl', 'lkp_testatroph', 1051118, 'OPDFertClinic', 'testAtrophy')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('cab_actionrequest', 'lkp_requesttyp', 1001006, 'ActionRequest', 'requestType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('edis_ttamedication', 'lkp_gptocontin', 1021145, 'TTAMedication', 'gpToContinue')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_orderchangeres', 'lkp_messagesta', 1161039, 'OrderChangeResponseQueue', 'messageStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patient', 'lkp_nationalit', 1021210, 'Patient', 'nationality')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_patientabsentp', 'lkp_selected', 1231035, 'PatientAbsentProcedure', 'selected')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_printlocationc', 'lkp_printcentr', 1021145, 'PrintLocationConfig', 'printCentral')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_pattreatpl', 'lkp_treatments', 1251108, 'PatTreatmentPlan', 'treatmentSites')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_electronicpres', 'lkp_button', 1021278, 'ElectronicPrescribingConfig', 'button')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_clinicalnotes', 'lkp_notetype', 1021169, 'ClinicalNotes', 'noteType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_drugtoxicolog2', 'lkp_toxicolog2', 1291039, 'DrugToxicologyItem', 'toxicologyResult')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_accomhous', 'lkp_currentliv', 1011000, 'AccommodationHousing', 'currentLivingArrangements')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_resultspecimen', 'lkp_specimenty', 1161029, 'ResultSpecimenTypes', 'specimenType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_clinicalcdiass', 'lkp_associatio', 1231022, 'Clinicalcdiassociations', 'associationDescription')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_dischargeoutco', 'lkp_discharget', 1341003, 'DischargeOutcome', 'dischargeType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_chemotherapyde', 'lkp_delayreaso', 1081034, 'ChemotherapyDetails', 'delayReason1')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_referralsrecor', 'lkp_c_discipli', 1231064, 'ReferralsRecording', 'discipline')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_memberofstaff', 'lkp_stafftype', 1021116, 'MemberOfStaff', 'staffType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_hospitalatnpds', 'lkp_status', 1231121, 'HospitalAtNightPatientDetailStatus', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_erectdysfxtrea', 'lkp_treatscore', 1021089, 'OPDErectDysfxTreatments', 'treatScore')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('pthw_apptoutcomerea', 'lkp_appointmen', 1031030, 'AppointmentOutcomeReasons', 'appointmentOutcomeReason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_rehabilitation', 'lkp_envadaptat', 1051010, 'RehabilitationActivity', 'envAdaptations')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_patienthomesit', 'lkp_showerloca', 1231057, 'PatientHomeSituation', 'showerLocation')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_mergedpatient', 'lkp_sex', 632, 'MergedPatient', 'sex')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('asse_userassessmen2', 'lkp_activestat', 1021124, 'AssessmentQuestion', 'activeStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_surgicalaudod', 'lkp_reasonforc', 1231130, 'SurgicalAuditOperationDetail', 'reasonForCancellation')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_skinassrev', 'lkp_exudatetyp', 1001032, 'SkinAssessmentReview', 'exudateType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_boweldhr', 'lkp_frequency', 1011014, 'BowelDiarrhoea', 'frequency')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('pthw_pathwaytarget', 'lkp_status', 1021124, 'PathwayTarget', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_emergencyepiso', 'lkp_elapsedper', 1291004, 'EmergencyEpisode', 'elapsedPeriod')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_workonadmissio', 'lkp_worksiteas', 1021014, 'WorkOnAdmission', 'workSiteAssessment')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_hospitalatnipd', 'lkp_mews', 1231118, 'HospitalAtNightPatientDetail', 'mEWS')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_documentcatego', 'lkp_specialty', 621, 'DocumentCategoryConfig', 'specialty')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_primarytumourd', 'lkp_prognost10', 1251035, 'PrimaryTumourDetails', 'prognosticTCert')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_chemocycledeta', 'lkp_performanc', 2936, 'ChemoCycleDetailsCCO', 'performanceStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_nurbladdercomp', 'lkp_typeofblad', 1001061, 'NurBladderComponent', 'typeOfBladder')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_medonadmisover', 'lkp_correctnes', 1021183, 'MedicationOverview', 'correctness')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_topbutton', 'lkp_action', 1031001, 'AppTopButton', 'action')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_nursingnotes', 'lkp_smokingsta', 1021007, 'NursingNotes', 'smokingStatus')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_emergencyatte2', 'lkp_ispatiente', 1021145, 'EmergencyAttendanceBilling', 'isPatientExempt')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_patinvasivedev', 'lkp_removalrea', 1231026, 'PatientInvasiveDevice', 'removalReason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_pataction', 'lkp_aneastheti', 3541, 'PatAction', 'aneasthetic')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_patienthomesit', 'lkp_supervised', 1231048, 'PatientHomeSituation', 'supervisedBy')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patientnoaller', 'lkp_sourceofin', 1021033, 'PatientNoAllergyInfo', 'sourceofInformation')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_booking_appoin', 'lkp_dispcode', 1141008, 'Booking_Appointment', 'dispCode')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_patinvasivedev', 'lkp_sentforcul', 1021145, 'PatientInvasiveDevice', 'sentForCulture')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_outpatientnote', 'lkp_reviewinun', 1231030, 'OutpatientNotesOutcome', 'reviewinUnits')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_procedure', 'lkp_hospitalca', 1041003, 'Procedure', 'hospitalCategory')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_trackingattend', 'lkp_status', 1291019, 'TrackingAttendanceStatus', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_infectcontrdet', 'lkp_status', 1021145, 'InfectionControlDetails', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('pthw_eventexternale', 'lkp_status', 1021124, 'EventExternalEventMapping', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('asse_patientassessi', 'lkp_statusreas', 1021163, 'PatientAssessment', 'statusReason')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_wheelchairdet', 'lkp_wheelchai2', 1051140, 'WheelchairDetails', 'wheelchairModel')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_transfers', 'lkp_assistance', 1211020, 'Transfers', 'assistanceRequired')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_painmed', 'lkp_frequency', 1021038, 'PainMedication', 'frequency')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_systemreviewsy', 'lkp_symptom', 1231001, 'SystemReviewSymptoms', 'symptom')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_pataction', 'lkp_category', 3245, 'PatAction', 'category')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_tnmstagingclas', 'lkp_status', 1021124, 'TNMStagingClassificationVersion', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_patientkioskme', 'lkp_messagetyp', 1031013, 'PatientKioskMessage', 'messageType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_opdfertilitycl', 'lkp_elisa', 1051124, 'OPDFertClinic', 'elisa')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ther_adaptations', 'lkp_itemcatego', 1051094, 'Adaptations', 'itemCategory')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('shcl_patientgoal', 'lkp_goaltype', 1231009, 'PatientGoal', 'goalType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_ventilationtra', 'lkp_typeofvent', 1021066, 'VentilationTracheostomy', 'typeOfVentilator')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('edis_futureplan', 'lkp_medicalcer', 1021145, 'FuturePlan', 'medicalCertificationIssued')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_opdfertilitycl', 'lkp_erectdysfx', 1051115, 'OPDFertClinic', 'erectDysfxTreatments')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('schl_booking_appoin', 'lkp_transportt', 1141010, 'Booking_Appointment', 'transportType')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('coe_bowelmed', 'lkp_route', 1021035, 'BowelMedication', 'route')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_episodeofcares', 'lkp_status', 1021276, 'EpisodeOfCareStatusHistory', 'status')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('care_onwardreferral', 'lkp_rejectedby', 1341012, 'OnwardReferral', 'rejectedBy')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_tiig', 'lkp_relationsh', 1291028, 'TIIG', 'relationshipToAttacker')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_eatcomp', 'lkp_requireass', 1021014, 'EatingComponent', 'requireAssistance')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_vitalsignsmoni', 'lkp_durationun', 1021177, 'VitalSignsMonitoring', 'durationUnit')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_primarytumourd', 'lkp_prognost11', 1251035, 'PrimaryTumourDetails', 'prognosticNCert')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('emer_attendanceclin', 'lkp_c_discipli', 1021048, 'AttendanceClinicalNotes', 'discipline')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ns_communicationc', 'lkp_difficulty', 1021014, 'NurCommunicationComponent', 'difficultyInCommunication')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('med_spinepath', 'lkp_mechanismo', 1051098, 'MskSpinePath', 'mechanismOfInjury')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('ocrr_container', 'lkp_c_ty', 1161057, 'Container', 'type')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_teletherapydet', 'lkp_retreatmen', 1021145, 'TeletherapyDetails', 'retreatment')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('pthw_extevenmap', 'lkp_specialty', 621, 'ExternalEventMapping', 'specialty')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('onco_contacttypesby', 'lkp_c_discipli', 1021048, 'ContactTypesByDiscipline', 'discipline')
go
insert into applookup_type_col_map(table_name, col_name, type_id, bo_name, bo_field) values('core_therapist', 'lkp_therapistt', 1021048, 'Therapist', 'therapistType')
go
