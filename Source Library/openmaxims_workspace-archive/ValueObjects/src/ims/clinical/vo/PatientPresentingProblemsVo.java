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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.clinical.vo;

/**
 * Linked to core.clinical.PatientProblem business object (ID: 1023100001).
 */
public class PatientPresentingProblemsVo extends ims.core.clinical.vo.PatientProblemRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public PatientPresentingProblemsVo()
	{
	}
	public PatientPresentingProblemsVo(Integer id, int version)
	{
		super(id, version);
	}
	public PatientPresentingProblemsVo(ims.clinical.vo.beans.PatientPresentingProblemsVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.problem = bean.getProblem() == null ? null : bean.getProblem().buildVo();
		this.patientproblem = bean.getPatientProblem();
		this.ispresentingproblem = bean.getIsPresentingProblem();
		this.clinicalcontact = bean.getClinicalContact() == null ? null : new ims.core.admin.vo.ClinicalContactRefVo(new Integer(bean.getClinicalContact().getId()), bean.getClinicalContact().getVersion());
		this.carecontext = bean.getCareContext() == null ? null : new ims.core.admin.vo.CareContextRefVo(new Integer(bean.getCareContext().getId()), bean.getCareContext().getVersion());
		this.isactive = bean.getIsActive();
		this.problemnote = bean.getProblemNote();
		this.onset = bean.getOnset() == null ? null : bean.getOnset().buildPartialDate();
		this.primaryforcarespells = ims.core.vo.CSPrimaryProblemVoCollection.buildFromBeanCollection(bean.getPrimaryForCareSpells());
		this.authoringinformation = bean.getAuthoringInformation() == null ? null : bean.getAuthoringInformation().buildVo();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.clinical.vo.beans.PatientPresentingProblemsVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.problem = bean.getProblem() == null ? null : bean.getProblem().buildVo(map);
		this.patientproblem = bean.getPatientProblem();
		this.ispresentingproblem = bean.getIsPresentingProblem();
		this.clinicalcontact = bean.getClinicalContact() == null ? null : new ims.core.admin.vo.ClinicalContactRefVo(new Integer(bean.getClinicalContact().getId()), bean.getClinicalContact().getVersion());
		this.carecontext = bean.getCareContext() == null ? null : new ims.core.admin.vo.CareContextRefVo(new Integer(bean.getCareContext().getId()), bean.getCareContext().getVersion());
		this.isactive = bean.getIsActive();
		this.problemnote = bean.getProblemNote();
		this.onset = bean.getOnset() == null ? null : bean.getOnset().buildPartialDate();
		this.primaryforcarespells = ims.core.vo.CSPrimaryProblemVoCollection.buildFromBeanCollection(bean.getPrimaryForCareSpells());
		this.authoringinformation = bean.getAuthoringInformation() == null ? null : bean.getAuthoringInformation().buildVo(map);
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.clinical.vo.beans.PatientPresentingProblemsVoBean bean = null;
		if(map != null)
			bean = (ims.clinical.vo.beans.PatientPresentingProblemsVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.clinical.vo.beans.PatientPresentingProblemsVoBean();
			map.addValueObjectBean(this, bean);
			bean.populate(map, this);
		}
		return bean;
	}
	public Object getFieldValueByFieldName(String fieldName)
	{
		if(fieldName == null)
			throw new ims.framework.exceptions.CodingRuntimeException("Invalid field name");
		fieldName = fieldName.toUpperCase();
		if(fieldName.equals("PROBLEM"))
			return getProblem();
		if(fieldName.equals("PATIENTPROBLEM"))
			return getPatientProblem();
		if(fieldName.equals("ISPRESENTINGPROBLEM"))
			return getIsPresentingProblem();
		if(fieldName.equals("CLINICALCONTACT"))
			return getClinicalContact();
		if(fieldName.equals("CARECONTEXT"))
			return getCareContext();
		if(fieldName.equals("ISACTIVE"))
			return getIsActive();
		if(fieldName.equals("PROBLEMNOTE"))
			return getProblemNote();
		if(fieldName.equals("ONSET"))
			return getOnset();
		if(fieldName.equals("PRIMARYFORCARESPELLS"))
			return getPrimaryForCareSpells();
		if(fieldName.equals("AUTHORINGINFORMATION"))
			return getAuthoringInformation();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getProblemIsNotNull()
	{
		return this.problem != null;
	}
	public ims.clinical.vo.ClinicalProblemShortVo getProblem()
	{
		return this.problem;
	}
	public void setProblem(ims.clinical.vo.ClinicalProblemShortVo value)
	{
		this.isValidated = false;
		this.problem = value;
	}
	public boolean getPatientProblemIsNotNull()
	{
		return this.patientproblem != null;
	}
	public String getPatientProblem()
	{
		return this.patientproblem;
	}
	public static int getPatientProblemMaxLength()
	{
		return 255;
	}
	public void setPatientProblem(String value)
	{
		this.isValidated = false;
		this.patientproblem = value;
	}
	public boolean getIsPresentingProblemIsNotNull()
	{
		return this.ispresentingproblem != null;
	}
	public Boolean getIsPresentingProblem()
	{
		return this.ispresentingproblem;
	}
	public void setIsPresentingProblem(Boolean value)
	{
		this.isValidated = false;
		this.ispresentingproblem = value;
	}
	public boolean getClinicalContactIsNotNull()
	{
		return this.clinicalcontact != null;
	}
	public ims.core.admin.vo.ClinicalContactRefVo getClinicalContact()
	{
		return this.clinicalcontact;
	}
	public void setClinicalContact(ims.core.admin.vo.ClinicalContactRefVo value)
	{
		this.isValidated = false;
		this.clinicalcontact = value;
	}
	public boolean getCareContextIsNotNull()
	{
		return this.carecontext != null;
	}
	public ims.core.admin.vo.CareContextRefVo getCareContext()
	{
		return this.carecontext;
	}
	public void setCareContext(ims.core.admin.vo.CareContextRefVo value)
	{
		this.isValidated = false;
		this.carecontext = value;
	}
	public boolean getIsActiveIsNotNull()
	{
		return this.isactive != null;
	}
	public Boolean getIsActive()
	{
		return this.isactive;
	}
	public void setIsActive(Boolean value)
	{
		this.isValidated = false;
		this.isactive = value;
	}
	public boolean getProblemNoteIsNotNull()
	{
		return this.problemnote != null;
	}
	public String getProblemNote()
	{
		return this.problemnote;
	}
	public static int getProblemNoteMaxLength()
	{
		return 500;
	}
	public void setProblemNote(String value)
	{
		this.isValidated = false;
		this.problemnote = value;
	}
	public boolean getOnsetIsNotNull()
	{
		return this.onset != null;
	}
	public ims.framework.utils.PartialDate getOnset()
	{
		return this.onset;
	}
	public void setOnset(ims.framework.utils.PartialDate value)
	{
		this.isValidated = false;
		this.onset = value;
	}
	public boolean getPrimaryForCareSpellsIsNotNull()
	{
		return this.primaryforcarespells != null;
	}
	public ims.core.vo.CSPrimaryProblemVoCollection getPrimaryForCareSpells()
	{
		return this.primaryforcarespells;
	}
	public void setPrimaryForCareSpells(ims.core.vo.CSPrimaryProblemVoCollection value)
	{
		this.isValidated = false;
		this.primaryforcarespells = value;
	}
	public boolean getAuthoringInformationIsNotNull()
	{
		return this.authoringinformation != null;
	}
	public ims.core.vo.AuthoringInformationVo getAuthoringInformation()
	{
		return this.authoringinformation;
	}
	public void setAuthoringInformation(ims.core.vo.AuthoringInformationVo value)
	{
		this.isValidated = false;
		this.authoringinformation = value;
	}
	public boolean isValidated()
	{
		if(this.isBusy)
			return true;
		this.isBusy = true;
	
		if(!this.isValidated)
		{
			this.isBusy = false;
			return false;
		}
		if(this.problem != null)
		{
			if(!this.problem.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.primaryforcarespells != null)
		{
			if(!this.primaryforcarespells.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.authoringinformation != null)
		{
			if(!this.authoringinformation.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		this.isBusy = false;
		return true;
	}
	public String[] validate()
	{
		return validate(null);
	}
	public String[] validate(String[] existingErrors)
	{
		if(this.isBusy)
			return null;
		this.isBusy = true;
	
		java.util.ArrayList<String> listOfErrors = new java.util.ArrayList<String>();
		if(existingErrors != null)
		{
			for(int x = 0; x < existingErrors.length; x++)
			{
				listOfErrors.add(existingErrors[x]);
			}
		}
		if(this.problem != null)
		{
			String[] listOfOtherErrors = this.problem.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.patientproblem == null || this.patientproblem.length() == 0)
			listOfErrors.add("PatientProblem is mandatory");
		else if(this.patientproblem.length() > 255)
			listOfErrors.add("The length of the field [patientproblem] in the value object [ims.clinical.vo.PatientPresentingProblemsVo] is too big. It should be less or equal to 255");
		if(this.carecontext == null)
			listOfErrors.add("CareContext is mandatory");
		if(this.problemnote != null)
			if(this.problemnote.length() > 500)
				listOfErrors.add("The length of the field [problemnote] in the value object [ims.clinical.vo.PatientPresentingProblemsVo] is too big. It should be less or equal to 500");
		if(this.primaryforcarespells != null)
		{
			String[] listOfOtherErrors = this.primaryforcarespells.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.authoringinformation != null)
		{
			String[] listOfOtherErrors = this.authoringinformation.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		int errorCount = listOfErrors.size();
		if(errorCount == 0)
		{
			this.isBusy = false;
			this.isValidated = true;
			return null;
		}
		String[] result = new String[errorCount];
		for(int x = 0; x < errorCount; x++)
			result[x] = (String)listOfErrors.get(x);
		this.isBusy = false;
		this.isValidated = false;
		return result;
	}
	public void clearIDAndVersion()
	{
		this.id = null;
		this.version = 0;
	}
	public Object clone()
	{
		if(this.isBusy)
			return this;
		this.isBusy = true;
	
		PatientPresentingProblemsVo clone = new PatientPresentingProblemsVo(this.id, this.version);
		
		if(this.problem == null)
			clone.problem = null;
		else
			clone.problem = (ims.clinical.vo.ClinicalProblemShortVo)this.problem.clone();
		clone.patientproblem = this.patientproblem;
		clone.ispresentingproblem = this.ispresentingproblem;
		clone.clinicalcontact = this.clinicalcontact;
		clone.carecontext = this.carecontext;
		clone.isactive = this.isactive;
		clone.problemnote = this.problemnote;
		if(this.onset == null)
			clone.onset = null;
		else
			clone.onset = (ims.framework.utils.PartialDate)this.onset.clone();
		if(this.primaryforcarespells == null)
			clone.primaryforcarespells = null;
		else
			clone.primaryforcarespells = (ims.core.vo.CSPrimaryProblemVoCollection)this.primaryforcarespells.clone();
		if(this.authoringinformation == null)
			clone.authoringinformation = null;
		else
			clone.authoringinformation = (ims.core.vo.AuthoringInformationVo)this.authoringinformation.clone();
		clone.isValidated = this.isValidated;
		
		this.isBusy = false;
		return clone;
	}
	public int compareTo(Object obj)
	{
		return compareTo(obj, true);
	}
	public int compareTo(Object obj, boolean caseInsensitive)
	{
		if (obj == null)
		{
			return -1;
		}
		if(caseInsensitive); // this is to avoid eclipse warning only.
		if (!(PatientPresentingProblemsVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A PatientPresentingProblemsVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((PatientPresentingProblemsVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((PatientPresentingProblemsVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.problem != null)
			count++;
		if(this.patientproblem != null)
			count++;
		if(this.ispresentingproblem != null)
			count++;
		if(this.clinicalcontact != null)
			count++;
		if(this.carecontext != null)
			count++;
		if(this.isactive != null)
			count++;
		if(this.problemnote != null)
			count++;
		if(this.onset != null)
			count++;
		if(this.primaryforcarespells != null)
			count++;
		if(this.authoringinformation != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 10;
	}
	protected ims.clinical.vo.ClinicalProblemShortVo problem;
	protected String patientproblem;
	protected Boolean ispresentingproblem;
	protected ims.core.admin.vo.ClinicalContactRefVo clinicalcontact;
	protected ims.core.admin.vo.CareContextRefVo carecontext;
	protected Boolean isactive;
	protected String problemnote;
	protected ims.framework.utils.PartialDate onset;
	protected ims.core.vo.CSPrimaryProblemVoCollection primaryforcarespells;
	protected ims.core.vo.AuthoringInformationVo authoringinformation;
	private boolean isValidated = false;
	private boolean isBusy = false;
}