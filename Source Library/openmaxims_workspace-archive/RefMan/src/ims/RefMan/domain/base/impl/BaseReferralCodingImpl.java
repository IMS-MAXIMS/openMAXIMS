// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.domain.base.impl;

import ims.domain.impl.DomainImpl;

public abstract class BaseReferralCodingImpl extends DomainImpl implements ims.RefMan.domain.ReferralCoding, ims.domain.impl.Transactional
{
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	public void validatelistProcedureForReferral(ims.core.admin.vo.CareContextRefVo careContextlRefVo)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistDiagnosisComplicationsForReferral(ims.core.admin.vo.CareContextRefVo careContextRefVo)
	{
	}

	@SuppressWarnings("unused")
	public void validategetReferralCoding(ims.RefMan.vo.CatsReferralRefVo catsRefVo, ims.core.admin.pas.vo.PASEventRefVo pasEventRefVo)
	{
	}

	@SuppressWarnings("unused")
	public void validatesaveReferralCoding(ims.RefMan.vo.ReferralCodingVo referralCodingVo, ims.core.admin.pas.vo.DischargedEpisodeRefVo dischargedEpisodeRef)
	{
	}

	@SuppressWarnings("unused")
	public void validategetCareContext(ims.RefMan.vo.CatsReferralRefVo catsRefVo)
	{
	}

	@SuppressWarnings("unused")
	public void validategetDiagnosisWithTaxonomyMappings(ims.core.clinical.vo.DiagnosisRefVo diagRefVo)
	{
	}

	@SuppressWarnings("unused")
	public void validategetProcedureWithTaxonomyMappings(ims.core.clinical.vo.ProcedureRefVo procRefVo)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistPASEvents(ims.RefMan.vo.CatsReferralRefVo voCatsReferralRef)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistNonSFSProcedures(ims.core.admin.vo.CareContextRefVo careContextlRefVo)
	{
	}

	@SuppressWarnings("unused")
	public void validategetPatientRef(ims.RefMan.vo.CatsReferralRefVo catsReferralRef)
	{
	}
}
