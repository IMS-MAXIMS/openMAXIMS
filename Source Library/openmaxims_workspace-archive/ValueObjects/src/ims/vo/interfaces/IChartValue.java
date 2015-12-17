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

package ims.vo.interfaces;

/*
 * Represents a charting value.
 */
public interface IChartValue extends Comparable
{
	/*
	 * Value
	 */
	 Float getIChartValueValue();
	/*
	 * IChartValueIsAbnormal
	 */
	 Boolean getIChartValueIsAbnormal();
	/*
	 * getIChartValueDateTime
	 */
	 ims.framework.utils.DateTime getIChartValueDateTime();
	/*
	 * getIChartValueComments
	 */
	 ims.vo.interfaces.IChartValueComment[] getIChartValueComments();
	/*
	 * Is the time relevant for ChartValue?
	 */
	 Boolean getIChartValueTimeSupplied();
	/*
	 * Retrieves IChart Value Investigation Comments added by the result message.
	 */
	 ims.vo.interfaces.IChartValueComment[] getIChartValueInvestigationComments();
	/*
	 * getIChartValueInvestigationName
	 */
	 String getIChartValueInvestigationName();
	/*
	 * getIChartValueSpecimenComments
	 */
	 ims.vo.interfaces.IChartValueComment[] getIChartValueSpecimenComments();
	/*
	 * getIChartValueSpecimenType
	 */
	 String getIChartValueSpecimenType();
	/*
	 * getIChartValueLabOrder
	 */
	 String getIChartValueLabOrder();
	/*
	 * getIChartValueDisplayDate
	 */
	 ims.framework.utils.DateTime getIChartValueDisplayDate();
	/*
	 * getIChartValueDisplayFlag
	 */
	 String getIChartValueDisplayFlag();
	/*
	 * getIChartValueInvestigation
	 */
	 ims.vo.interfaces.IChartValueInvestigation getIChartValueInvestigation();
	/*
	 * getIChartValueLabSpecimentType
	 */
	 String getIChartValueLabSpecimentType();
	/*
	 * get Order Specimen
	 */
	 ims.ocrr.vo.lookups.SpecimenType getIChartValueOrderSpecimen();
	/*
	 * get Lab Specimen
	 */
	 ims.vo.LookupInstVo getIChartValueLabSpecimen();
	/*
	 * getIChartValueIsReceivedDateTime
	 */
	 Boolean getIChartValueIsReceivedDateTime();
	/*
	 * String value.
	 */
	 String getIChartValue();
	/*
	 * Get the Ref Range for the value.
	 */
	 String getIChartValueRefRange();
	/*
	 * Get Units of Measure for value.
	 */
	 ims.ocrr.vo.lookups.ResultUnitOfMeasure getIChartValueUnitOfMeasure();
}