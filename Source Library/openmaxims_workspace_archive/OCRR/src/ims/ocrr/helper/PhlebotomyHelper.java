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
package ims.ocrr.helper;

import ims.core.vo.MemberOfStaffLiteVo;
import ims.framework.controls.DynamicGridCell;
import ims.framework.utils.Date;
import ims.framework.utils.DateTime;
import ims.ocrr.vo.lookups.OutPatientDuration;

public class PhlebotomyHelper
{
	public static final String	INSTRUCTION_TO_COLLECTOR	= " Instructions To Collector : ";
	public static final String	ORDERER_INSTRUCTIONS		= "Orderers Instructions : "; 
	private String userName = null;
	public PhlebotomyHelper()
	{
		setUserName("");
	}
	public PhlebotomyHelper(String userRealName)
	{
		setUserName(userRealName);
	}
	
	private void setUserName(String userRealName)
	{
		this.userName = userRealName;
	}

	public Date calculateDateToCollect(Integer num, OutPatientDuration duration) 
	{
		//can't perform calculation
		if(num == null || duration == null)
			return null;
		
		Date result = null;
		Date today = new Date();
		if(duration.equals(OutPatientDuration.DAYS))
		{
			result = today.addDay(num.intValue());
		}
		else if(duration.equals(OutPatientDuration.WEEKS))
		{
			result = today.addDay(num.intValue() * 7);
		}
		else if(duration.equals(OutPatientDuration.MONTHS))
		{
			result = today.addMonth(num.intValue());
		}
		else if(duration.equals(OutPatientDuration.YEARS))
		{
			result = today.addYear(num.intValue());
		}
		
		return result;
	}
	
	/**
	 * @param existingComment
	 * @param phlebotomistString
	 * @param dateTimeCollected
	 * @param commentCollected
	 * @return
	 */
	public String getPhlebotomistComment(String existingComment, String phlebotomistString, DateTime dateTimeCollected, String commentCollected)
	{
		StringBuffer comment = new StringBuffer();
		comment.append(phlebotomistString != null ? phlebotomistString : "");
		comment.append(" ");
		comment.append(dateTimeCollected != null?dateTimeCollected.toString():"");
		comment.append(commentCollected != null && commentCollected.length() > 0? "\n" + commentCollected : "");
		comment.append(existingComment  != null && existingComment.length() > 0 ? "\n" + existingComment : "");
		return comment.toString();
	}

	//WDEV-2263 
	public static String getInstructorToCollectorTooltip(String tooltip)
	{
		if (tooltip == null || tooltip.length() == 0)
			return "";

		String bold_start = "<b>"; 
		String bold_end	  = "</b>";
		
		if(tooltip.indexOf(INSTRUCTION_TO_COLLECTOR) >= 0)
		{
			tooltip = tooltip.replaceAll(INSTRUCTION_TO_COLLECTOR, bold_start + INSTRUCTION_TO_COLLECTOR + bold_end);
		}
		
		if(tooltip.indexOf(ORDERER_INSTRUCTIONS) >= 0)
		{
			tooltip = tooltip.replaceAll(ORDERER_INSTRUCTIONS, bold_start + ORDERER_INSTRUCTIONS + bold_end);
		}
	
		return tooltip;
	}
	
	
	public int getMaxLength(String collectorComment)
	{
		String mosMaxLengthString = getMaximumMosString();
		//Add an extra space for getPhlebotomistComment to return the maximum characters (e.g. "\n" added)
		if(collectorComment == null || collectorComment.length() == 0)
			collectorComment = " ";
		String maxPhlebotomostComment = getPhlebotomistComment(collectorComment, mosMaxLengthString, new DateTime(), " ");

		// Substract from CollectorCommentMaxLength() the max length of the
		// previous comment plus the DateTime and the phlebotomist
		int maxAllowedCollectorCommentLength = new ims.ocrr.vo.OrderSpecimenListVo().getCollectorCommentMaxLength();
		int maxLength = maxAllowedCollectorCommentLength - maxPhlebotomostComment.length();

		return maxLength;
	}

	private String getMaximumMosString()
	{
		int maxSize = (new MemberOfStaffLiteVo()).getInitialsMaxLength();
		int realNameSize = userName != null ? userName.length() : 0;
		if (realNameSize > maxSize)
			maxSize = realNameSize;
		return new String(new char[maxSize]);
	}
	
	public String getCollectorCommentTrimmed(String commentCollected)
	{
		int maxAllowedCollectorCommentLength = new ims.ocrr.vo.OrderSpecimenListVo().getCollectorCommentMaxLength();
		String trimmedComment = commentCollected != null ? commentCollected.trim() : null;
		if (trimmedComment != null && trimmedComment.length() > maxAllowedCollectorCommentLength)
			return trimmedComment.substring(0, maxAllowedCollectorCommentLength);

		return trimmedComment;
	}
	
	public void setCellMaxLength(String collectorComment, DynamicGridCell cell)
	{
		if (cell == null)
			return;

		int maxLength = getMaxLength(collectorComment);
		cell.setStringMaxLength(maxLength < 0 ? 0 : maxLength);
		if (maxLength <= 0)
			cell.setReadOnly(true);
	}
}
