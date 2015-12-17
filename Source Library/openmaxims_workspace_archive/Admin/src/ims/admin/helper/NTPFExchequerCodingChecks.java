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
package ims.admin.helper;

import ims.core.vo.ActivityContextPricingDetailsVo;
import ims.core.vo.ActivityContextPricingDetailsVoCollection;
import ims.core.vo.LocMostVo;
import ims.core.vo.LocationServiceActivityVo;
import ims.core.vo.LocationServiceVo;
import ims.core.vo.lookups.TaxonomyType;

public class NTPFExchequerCodingChecks
{
	public static String ValidHospital(LocMostVo voHospital)
	{
		if (voHospital.getIsActiveIsNotNull() 
			&& ! voHospital.getIsActive().booleanValue())
			return "\r\nThe Hospital is not active. No editing is allowed";

		if (voHospital.getCodeMappingsIsNotNull())
		{
			boolean bFound = false;
			for(int i=0;i < voHospital.getCodeMappings().size() ; i++)
			{
				//Has it an Exchequer code
				if (voHospital.getCodeMappings().get(i).getTaxonomyNameIsNotNull()
					&& voHospital.getCodeMappings().get(i).getTaxonomyName().equals(TaxonomyType.EXCH))
				{
					bFound = true;
					//Is it a valid Exchequer code
					if ( ! checkCodeIsAAANNN(voHospital.getCodeMappings().get(i).getTaxonomyCode()) )
						return "\r\nThe Hospitals Exchequer code is not of the format AAANNN. No editing is allowed";
				}
			}
			if ( ! bFound)
				return "\r\nThe Hospital has no Exchequer code. No editing is allowed";
		}

		return "";
	}

	public static String ValidHospitalSpecialty(LocationServiceVo voLocService)
	{
		if (voLocService.getIsActiveIsNotNull() 
			&& ! voLocService.getIsActive().booleanValue())
			return "\r\nThe Hospital / Specialty link is not active. No editing is allowed";
		
		//Check Specialty is Active and has an Exchequer code
		if (voLocService.getServiceIsNotNull())
		{
			if (voLocService.getService().getIsActiveIsNotNull() 
				&& ! voLocService.getService().getIsActive().booleanValue())
				return "\r\nThe Specialty is not active. No editing is allowed";

			if (voLocService.getService().getTaxonomyMapIsNotNull())
			{
				boolean bFound = false;
				for(int i=0;i < voLocService.getService().getTaxonomyMap().size() ; i++)
				{
					//Has it an Exchequer code
					if (voLocService.getService().getTaxonomyMap().get(i).getTaxonomyNameIsNotNull()
						&& voLocService.getService().getTaxonomyMap().get(i).getTaxonomyName().equals(TaxonomyType.EXCH))
					{
						bFound = true;
						//Is it a valid Exchequer code
						if ( ! checkCodeIsA6NNN(voLocService.getService().getTaxonomyMap().get(i).getTaxonomyCode()) )
							return "\r\nThe Specialty Exchequer code is not of the format 6NNN. No editing is allowed";
					}
				}
				if ( ! bFound)
					return "\r\nThe Specialty has no Exchequer code. No editing is allowed";

			}
		}
		return "";
	}
	
	public static String ValidHospitalSpecialtyProcedure(LocationServiceActivityVo voLocServiceActivity)
	{
		//Check Specialty / proceedure is Active and has an Exchequer code
		if (voLocServiceActivity != null && voLocServiceActivity.getServiceActivityIsNotNull())
		{
			if (voLocServiceActivity.getServiceActivity().getTaxonomyMapIsNotNull())
			{
				if (voLocServiceActivity.getIsActiveIsNotNull() 
					&& ! voLocServiceActivity.getIsActive().booleanValue())
					return "\r\nThe Hospital / Specialty / Procedure link is not active. No editing is allowed";

				boolean bFound  = false;
				for(int i=0;i < voLocServiceActivity.getServiceActivity().getTaxonomyMap().size() ; i++)
				{
					//Has it an Exchequer code
					if (voLocServiceActivity.getServiceActivity().getTaxonomyMap().get(i).getTaxonomyNameIsNotNull()
						&& voLocServiceActivity.getServiceActivity().getTaxonomyMap().get(i).getTaxonomyName().equals(TaxonomyType.EXCH))
					{
						if ( ! checkCodeIs60NNNNNorNNNN(voLocServiceActivity.getServiceActivity().getTaxonomyMap().get(i).getTaxonomyCode()) )
							return "\r\nThe Specialty / procedure Link Exchequer code is not of the format 60 N NNNN/9NNNN. No editing is allowed";

						bFound = true; //Is has a valid Exchequer code
					}
				}
				if ( ! bFound)
					return "\r\nThere is no Exchequer code found for this Specialty / Procedure. No editing is allowed";
			}
			if (voLocServiceActivity.getServiceActivity().getIsActiveIsNotNull() 
				&& ! voLocServiceActivity.getServiceActivity().getIsActive().booleanValue())
				return "\r\nThe Specialty / Procedure link is not active. No editing is allowed";
		}
		return "";
	}
	
	public static boolean checkCodeIs60NNNNNorNNNN(String taxonomyCode)
	{
		if (taxonomyCode == null)
			return false;

		if ( taxonomyCode.length() == 7)
		{
			if (Character.getNumericValue(taxonomyCode.charAt(0)) != 6)
				return false;
				
			if (Character.getNumericValue(taxonomyCode.charAt(1)) != 0)
				return false;
				
			for (int i = 0 ; i < taxonomyCode.length() ; i++)
			{
				char valChar = taxonomyCode.charAt(i);
					
				if (! Character.isDigit(valChar))
					return false;
					
				if (Character.isLetter(valChar))
					return false;
			}
			return true;
		}
		else
			return false;
	}

	public static boolean checkCodeIs9NNNNorNNNN(String taxonomyCode)
	{
		if (taxonomyCode == null || taxonomyCode.equals("")) //WDEV-15610
			return false;
		
		char valChar = taxonomyCode.charAt(0);

		if ( taxonomyCode.length() == 4
			|| ( taxonomyCode.length() == 5 && Character.getNumericValue(valChar) == 9) )
		{
			for (int i = 0 ; i < taxonomyCode.length() ; i++)
			{
				valChar = taxonomyCode.charAt(i);
				
				if (! Character.isDigit(valChar))
					return false;
				
				if (Character.isLetter(valChar))
					return false;
			}
			return true;
		}		

		return false;
	}
	public static boolean checkCodeIsA6NNN(String taxonomyCode)
	{
		if (taxonomyCode == null)
			return false;

		if (taxonomyCode.length() != 4)
			return false;
		
		char valChar = taxonomyCode.charAt(0);
		if (Character.isDigit(valChar))
			if (Character.getNumericValue(valChar) != 6)
				return false;
			
		for (int i = 1 ; i < taxonomyCode.length() ; i++)
		{
			valChar = taxonomyCode.charAt(i);
			
			if (! Character.isDigit(valChar))
				return false;
			
			if (Character.isLetter(valChar))
				return false;
		}

		return true;
	}
	
	//WDEV-2578 
	public static boolean checkCodeIsAAANNN(String taxonomyCode)
	{
		if (taxonomyCode == null)
			return false;

		if (taxonomyCode.length() != 6)
			return false;
		
		for (int i = 0 ; i < 3 ; i++)
		{
			if ( ! Character.isLetter(taxonomyCode.charAt(i)))
				return false;
		}

		for (int j = 3 ; j < taxonomyCode.length() ; j++)
		{
			if (! Character.isDigit(taxonomyCode.charAt(j)))
				return false;
		}

		return true;
	}

	public static boolean validatePricingIsUnique(ActivityContextPricingDetailsVoCollection priceCollVo, ActivityContextPricingDetailsVo voACPDetailSaved)
	{
		for(int i = 0 ; i < priceCollVo.size() ; i++)
		{
			ActivityContextPricingDetailsVo voACPDetailCompare = priceCollVo.get(i);
			
			if ( (voACPDetailSaved.getIsActiveIsNotNull() && ! voACPDetailSaved.getIsActive().booleanValue())
				||( voACPDetailCompare.getIsActiveIsNotNull() && ! voACPDetailCompare.getIsActive().booleanValue()) )
				continue;
			
			if ( ! voACPDetailSaved.equals(voACPDetailCompare))
			{	
				if (voACPDetailCompare.getContextIsNotNull() && voACPDetailSaved.getContextIsNotNull()
					&& 	voACPDetailCompare.getContext().equals(voACPDetailSaved.getContext()) )
				{
					if (voACPDetailCompare.getPriceCategoryIsNotNull() && voACPDetailSaved.getPriceCategoryIsNotNull()
						&& 	voACPDetailCompare.getPriceCategory().equals(voACPDetailSaved.getPriceCategory()) )
					{
						if (voACPDetailCompare.getNormLengthStayIsNotNull() && voACPDetailSaved.getNormLengthStayIsNotNull()
								&& 	voACPDetailCompare.getNormLengthStay().equals(voACPDetailSaved.getNormLengthStay()) )
						{
							if (voACPDetailCompare.getIsActiveIsNotNull() && voACPDetailSaved.getIsActiveIsNotNull()
									&& 	voACPDetailCompare.getIsActive().equals(voACPDetailSaved.getIsActive()) )
							{
									if (voACPDetailCompare.getEffectiveFromIsNotNull() 
									&& voACPDetailSaved.getEffectiveFromIsNotNull()
									&& voACPDetailCompare.getEffectiveToIsNotNull()
									&& voACPDetailSaved.getEffectiveToIsNotNull() )
								{
									//Inside period
									if ( (voACPDetailSaved.getEffectiveFrom().isGreaterOrEqualThan(voACPDetailCompare.getEffectiveFrom()))
										&& (voACPDetailSaved.getEffectiveFrom().isLessOrEqualThan(voACPDetailCompare.getEffectiveTo())) )
										return false;
											
									//Starts Before and ends inside
									if ( voACPDetailSaved.getEffectiveFrom().isLessOrEqualThan(voACPDetailCompare.getEffectiveFrom())
										&& voACPDetailSaved.getEffectiveTo().isGreaterOrEqualThan(voACPDetailCompare.getEffectiveFrom()) 
										&& voACPDetailSaved.getEffectiveTo().isLessOrEqualThan(voACPDetailCompare.getEffectiveTo()) )
										return false;
									
									//Starts inside and ends after
									if ( voACPDetailSaved.getEffectiveFrom().isGreaterOrEqualThan(voACPDetailCompare.getEffectiveFrom())
										&& voACPDetailSaved.getEffectiveFrom().isLessOrEqualThan(voACPDetailCompare.getEffectiveTo())
										&& voACPDetailSaved.getEffectiveTo().isGreaterOrEqualThan(voACPDetailCompare.getEffectiveTo()) ) 
										return false;
									
									//Starts before and ends after
									if ( (voACPDetailSaved.getEffectiveFrom().isLessOrEqualThan(voACPDetailCompare.getEffectiveFrom()))
										&& (voACPDetailSaved.getEffectiveTo().isGreaterOrEqualThan(voACPDetailCompare.getEffectiveTo())) )
										return false;
								}
								else if (voACPDetailCompare.getEffectiveFromIsNotNull() 
										&& voACPDetailSaved.getEffectiveFromIsNotNull()
										&& 	voACPDetailSaved.getEffectiveToIsNotNull()
										&& 	voACPDetailCompare.getEffectiveTo() == null)
								{
									if ( (voACPDetailSaved.getEffectiveFrom().isLessOrEqualThan(voACPDetailCompare.getEffectiveFrom()))
											&& (voACPDetailSaved.getEffectiveTo().isGreaterOrEqualThan(voACPDetailCompare.getEffectiveFrom())) )
											return false;

									if ( (voACPDetailSaved.getEffectiveFrom().isGreaterOrEqualThan(voACPDetailCompare.getEffectiveFrom()))
											&& (voACPDetailSaved.getEffectiveTo().isGreaterOrEqualThan(voACPDetailCompare.getEffectiveFrom())) )
											return false;
								}
								else if (voACPDetailCompare.getEffectiveFromIsNotNull() 
										&& voACPDetailSaved.getEffectiveFromIsNotNull()
										&& 	voACPDetailCompare.getEffectiveToIsNotNull()
										&& 	voACPDetailSaved.getEffectiveTo() == null)
								{
									if ( (voACPDetailSaved.getEffectiveFrom().isGreaterOrEqualThan(voACPDetailCompare.getEffectiveFrom()))
										&& (voACPDetailSaved.getEffectiveFrom().isLessOrEqualThan(voACPDetailCompare.getEffectiveTo())) )
										return false;

									if (voACPDetailSaved.getEffectiveFrom().isLessOrEqualThan(voACPDetailCompare.getEffectiveFrom()))
										return false;
								}
								else if (voACPDetailCompare.getEffectiveFromIsNotNull() 
									&& 	voACPDetailCompare.getEffectiveTo() == null)
										return false;
							}
						}
					}
				}
			}
		}				
		
		return true;
	}

}
