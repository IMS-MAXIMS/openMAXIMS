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
/*
 * Created on 11 Jan 2007
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package ims.core.helper;

import ims.admin.vo.AppImageVo;
import ims.assessment.vo.PatientGraphicAssessmentFindingVo;
import ims.assessment.vo.PatientGraphicAssessmentVo;
import ims.assessment.vo.Patient_GraphicAssessmentFindingVo;
import ims.assessment.vo.Patient_GraphicAssessmentVo;
import ims.configuration.gen.ConfigFlag;
import ims.core.vo.DrawingGraphicFindingVo;
import ims.framework.utils.Image;
import ims.framework.utils.ImagePath;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class DrawingControlReportHelper
{
	public DrawingControlReportHelper()
	{
	}
	
	public String CreateDrawingControlSeed(PatientGraphicAssessmentVo data, int imageWidth, int imageHeight) 
	{
		if(data == null)
			return null;
		
		StringBuffer sb = new StringBuffer(16384);
		String backgroundImageUrl = null;
		AppImageVo backgroundImage = null;
		ArrayList images = new ArrayList();
		HashMap imageMap = new HashMap();
		TreeMap findingMap = new TreeMap();
		
		if(data.getGraphicImageIsNotNull() && data.getGraphicImage().getImageIsNotNull())
			backgroundImageUrl = data.getGraphicImage().getImage().getImagePath();
		
		if(backgroundImageUrl != null)
		{
		    backgroundImage = data.getGraphicImage().getImage();
		}
		
		//render legend
		if(data.getPatientGraphicFindingIsNotNull())
		{
			for (int i = 0; i < data.getPatientGraphicFinding().size(); i++)
			{
				PatientGraphicAssessmentFindingVo finding = data.getPatientGraphicFinding().get(i);
				
				DrawingGraphicFindingVo graphicFinding = finding.getGraphicFinding();
				
				if(graphicFinding != null)
				{
					findingMap.put(graphicFinding.getID_DrawingGraphicFinding(), graphicFinding);
				}
			}
		}
		sb.append("<div style=\"float: right; width: 200px; \">");
		for (Iterator iter = findingMap.keySet().iterator(); iter.hasNext();)
		{
			DrawingGraphicFindingVo graphicFinding = (DrawingGraphicFindingVo) findingMap.get(iter.next());
			
			if(graphicFinding.getImageIsNotNull())
			{
				//image
				sb.append("<img src=\"file:///");
				sb.append(graphicFinding.getImage().getImagePath());
				sb.append("\"/> ");
				
				images.add(graphicFinding.getImage().getImagePath());
				imageMap.put(graphicFinding.getImage().getImagePath(), graphicFinding.getImage());
			}
			else
			{
				//shape
				sb.append("<span style=\"overflow: hidden; margin-right: 4px; vertical-align: middle; width: 10px; height: 4px; background: ");
				sb.append(graphicFinding.getColour().toString());
				sb.append("\"></span>");
			}
			sb.append(ims.framework.utils.StringUtils.encodeXML(graphicFinding.getDisplayText()));
			sb.append("<br>");
			
			
		}
		sb.append("</div>");

		//render background image
		if(backgroundImageUrl != null)
		{
			sb.append("<img style=\"position: absolute; top: 0; left: 0; \" src=\"file:///");
			sb.append(backgroundImageUrl);
			sb.append("\"/> ");
			
			images.add(backgroundImageUrl);
			imageMap.put(backgroundImageUrl, backgroundImage);
		}

		//group vml
		int imgWidth  = backgroundImage != null && backgroundImage.getWidthIsNotNull() ? backgroundImage.getWidth() : 0;
		int imgHeight = backgroundImage != null && backgroundImage.getWidthIsNotNull() ? backgroundImage.getHeight() : 0;
		
		String groupVml = "<v:group style=\"position: absolute; top: 0; left: 0px; width: " + imgWidth + "px; height: " + imgHeight + "px; \" coordsize=\"" + imgWidth + "," + imgHeight + "\">"; 
		//render VML
		if(data.getPatientGraphicFindingIsNotNull())
		{
			//render shapes
			//data.getPatientGraphicFinding().sort();
			for (int i = 0; i < data.getPatientGraphicFinding().size(); i++)
			{
				PatientGraphicAssessmentFindingVo finding = data.getPatientGraphicFinding().get(i);
				
				DrawingGraphicFindingVo graphicFinding = finding.getGraphicFinding();
				
				if(graphicFinding != null)
				{
					if(finding.getAreaDrawn().substring(0, 8).equalsIgnoreCase("<v:image"))
					{
						sb.append(groupVml);
							sb.append(replaceString(finding.getAreaDrawn(),"src = \"","src = \"file:///"));
						sb.append("</v:group>");
					}
					else
					{
						sb.append(finding.getAreaDrawn());
					}
					
					sb.append(getFindingTag(finding.getAreaDrawn(), i+1));
				}
			}
		}
		
		sb.append("</body>\r\n" + 
				"</html>\r\n" + 
				"");
		
		StringBuffer mht = new StringBuffer(sb.length());
		
		mht.append("<!--_ims_render_mht_0123456789_" + imageWidth + "x" + imageHeight + "-->\r\n" + 
				"From: <Saved by Microsoft Internet Explorer 5>\r\n" + 
				"Subject: \r\n" + 
				"Date: Tue, 9 Jan 2007 12:07:30 -0000\r\n" + 
				"MIME-Version: 1.0\r\n" + 
				"Content-Type: multipart/related;\r\n" + 
				"	type=\"text/html\";\r\n" + 
				"	boundary=\"----=_NextPart_000_0000_01C733E6.BCFF96B0\"\r\n" + 
				"X-MimeOLE: Produced By Microsoft MimeOLE V6.00.2900.3028\r\n" + 
				"\r\n" + 
				"This is a multi-part message in MIME format.\r\n" + 
				"\r\n" + 
				"------=_NextPart_000_0000_01C733E6.BCFF96B0\r\n" + 
				"Content-Type: text/html;\r\n" + 
				"	charset=\"Windows-1252\"\r\n" + 
				"Content-Transfer-Encoding: quoted-printable\r\n" + 
				"Content-Location: file://C:\\temp\\drawing.html\r\n" + 
				"\r\n" + 
				"<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\r\n" + 
				"<HTML xmlns:v =3D \"urn:schemas-microsoft-com:vml\"><HEAD>\r\n" + 
				"<META http-equiv=3DContent-Type content=3D\"text/html; =\r\n" + 
				"charset=3Dwindows-1252\">\r\n" + 
				"<STYLE>v\\:* {\r\n" + 
				"	BEHAVIOR: url(#default#vml)\r\n" + 
				"}\r\n" + 
				"BODY {\r\n" + 
				"	MARGIN: 0px\r\n" + 
				"}\r\n" + 
				"</STYLE>\r\n" + 
				"\r\n" + 
				"<META content=3D\"MSHTML 6.00.2900.3020\" name=3DGENERATOR></HEAD>\r\n" + 
				"<BODY scroll=3Dno>\r\n" + 
				"<OBJECT id=3DVMLRender codeBase=3Dvgx.dll=20\r\n" + 
				"classid=3DCLSID:10072CEC-8CC1-11D1-986E-00A0C955B42E></OBJECT>");
		
		mht.append(EncodeQuotedPrintable(RemoveCRLF(sb.toString())));
		mht.append("\r\n");

		//include images as Base64
		for (int i = 0; i < images.size(); i++)
		{
			Image img = (Image) imageMap.get(images.get(i));
			
			mht.append("\r\n" + 
					"------=_NextPart_000_0000_01C733E6.BCFF96B0\r\n" + 
					"Content-Type: " + img.getImageInfo().getMimeType() + "\r\n" + 
					"Content-Transfer-Encoding: base64\r\n" + 
					"Content-Location: file:///" +
					images.get(i) +
					"\r\n" + 
					"\r\n" + 
					"");
			
			mht.append(ims.utils.Base64Coder.encode(getImageContent((Image) imageMap.get(images.get(i)))));
			mht.append("\r\n");
		}
		
		mht.append("\r\n" + 
				"------=_NextPart_000_0000_01C733E6.BCFF96B0--\r\n" + 
				"");
		
		return mht.toString();
	}
	
	//WDEV-12215
	public String CreateDrawingControlSeed(Patient_GraphicAssessmentVo data, int imageWidth, int imageHeight) 
	{
		if(data == null)
			return null;
		
		StringBuffer sb = new StringBuffer(16384);
		String backgroundImageUrl = null;
		AppImageVo backgroundImage = null;
		ArrayList images = new ArrayList();
		HashMap imageMap = new HashMap();
		TreeMap findingMap = new TreeMap();
		
		if(data.getGraphicImageIsNotNull() && data.getGraphicImage().getImageIsNotNull())
			backgroundImageUrl = data.getGraphicImage().getImage().getImagePath();
		
		if(backgroundImageUrl != null)
		{
		    backgroundImage = data.getGraphicImage().getImage();
		}
		
		//render legend
		if(data.getPatientGraphicFindingIsNotNull())
		{
			for (int i = 0; i < data.getPatientGraphicFinding().size(); i++)
			{
				Patient_GraphicAssessmentFindingVo finding = data.getPatientGraphicFinding().get(i);
				
				DrawingGraphicFindingVo graphicFinding = finding.getGraphicFinding();
				
				if(graphicFinding != null)
				{
					findingMap.put(graphicFinding.getID_DrawingGraphicFinding(), graphicFinding);
				}
			}
		}
		sb.append("<div style=\"float: right; width: 200px; \">");
		for (Iterator iter = findingMap.keySet().iterator(); iter.hasNext();)
		{
			DrawingGraphicFindingVo graphicFinding = (DrawingGraphicFindingVo) findingMap.get(iter.next());
			
			if(graphicFinding.getImageIsNotNull())
			{
				//image
				sb.append("<img src=\"file:///");
				sb.append(graphicFinding.getImage().getImagePath());
				sb.append("\"/> ");
				
				images.add(graphicFinding.getImage().getImagePath());
				imageMap.put(graphicFinding.getImage().getImagePath(), graphicFinding.getImage());
			}
			else
			{
				//shape
				sb.append("<span style=\"overflow: hidden; margin-right: 4px; vertical-align: middle; width: 10px; height: 4px; background: ");
				sb.append(graphicFinding.getColour().toString());
				sb.append("\"></span>");
			}
			sb.append(ims.framework.utils.StringUtils.encodeXML(graphicFinding.getDisplayText()));
			sb.append("<br>");
			
			
		}
		sb.append("</div>");

		//render background image
		if(backgroundImageUrl != null)
		{
			sb.append("<img style=\"position: absolute; top: 0; left: 0; \" src=\"file:///");
			sb.append(backgroundImageUrl);
			sb.append("\"/> ");
			
			images.add(backgroundImageUrl);
			imageMap.put(backgroundImageUrl, backgroundImage);
		}

		//group vml
		int imgWidth  = backgroundImage != null && backgroundImage.getWidthIsNotNull() ? backgroundImage.getWidth() : 0;
		int imgHeight = backgroundImage != null && backgroundImage.getWidthIsNotNull() ? backgroundImage.getHeight() : 0;
		
		String groupVml = "<v:group style=\"position: absolute; top: 0; left: 0px; width: " + imgWidth + "px; height: " + imgHeight + "px; \" coordsize=\"" + imgWidth + "," + imgHeight + "\">"; 
		//render VML
		if(data.getPatientGraphicFindingIsNotNull())
		{
			//render shapes
			//data.getPatientGraphicFinding().sort();
			for (int i = 0; i < data.getPatientGraphicFinding().size(); i++)
			{
				Patient_GraphicAssessmentFindingVo finding = data.getPatientGraphicFinding().get(i);
				
				DrawingGraphicFindingVo graphicFinding = finding.getGraphicFinding();
				
				if(graphicFinding != null)
				{
					if(finding.getAreaDrawn().substring(0, 8).equalsIgnoreCase("<v:image"))
					{
						sb.append(groupVml);
							sb.append(replaceString(finding.getAreaDrawn(),"src = \"","src = \"file:///"));
						sb.append("</v:group>");
					}
					else
					{
						sb.append(finding.getAreaDrawn());
					}
					
					sb.append(getFindingTag(finding.getAreaDrawn(), i+1));
				}
			}
		}
		
		sb.append("</body>\r\n" + 
				"</html>\r\n" + 
				"");
		
		StringBuffer mht = new StringBuffer(sb.length());
		
		mht.append("<!--_ims_render_mht_0123456789_" + imageWidth + "x" + imageHeight + "-->\r\n" + 
				"From: <Saved by Microsoft Internet Explorer 5>\r\n" + 
				"Subject: \r\n" + 
				"Date: Tue, 9 Jan 2007 12:07:30 -0000\r\n" + 
				"MIME-Version: 1.0\r\n" + 
				"Content-Type: multipart/related;\r\n" + 
				"	type=\"text/html\";\r\n" + 
				"	boundary=\"----=_NextPart_000_0000_01C733E6.BCFF96B0\"\r\n" + 
				"X-MimeOLE: Produced By Microsoft MimeOLE V6.00.2900.3028\r\n" + 
				"\r\n" + 
				"This is a multi-part message in MIME format.\r\n" + 
				"\r\n" + 
				"------=_NextPart_000_0000_01C733E6.BCFF96B0\r\n" + 
				"Content-Type: text/html;\r\n" + 
				"	charset=\"Windows-1252\"\r\n" + 
				"Content-Transfer-Encoding: quoted-printable\r\n" + 
				"Content-Location: file://C:\\temp\\drawing.html\r\n" + 
				"\r\n" + 
				"<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\r\n" + 
				"<HTML xmlns:v =3D \"urn:schemas-microsoft-com:vml\"><HEAD>\r\n" + 
				"<META http-equiv=3DContent-Type content=3D\"text/html; =\r\n" + 
				"charset=3Dwindows-1252\">\r\n" + 
				"<STYLE>v\\:* {\r\n" + 
				"	BEHAVIOR: url(#default#vml)\r\n" + 
				"}\r\n" + 
				"BODY {\r\n" + 
				"	MARGIN: 0px\r\n" + 
				"}\r\n" + 
				"</STYLE>\r\n" + 
				"\r\n" + 
				"<META content=3D\"MSHTML 6.00.2900.3020\" name=3DGENERATOR></HEAD>\r\n" + 
				"<BODY scroll=3Dno>\r\n" + 
				"<OBJECT id=3DVMLRender codeBase=3Dvgx.dll=20\r\n" + 
				"classid=3DCLSID:10072CEC-8CC1-11D1-986E-00A0C955B42E></OBJECT>");
		
		mht.append(EncodeQuotedPrintable(RemoveCRLF(sb.toString())));
		mht.append("\r\n");

		//include images as Base64
		for (int i = 0; i < images.size(); i++)
		{
			Image img = (Image) imageMap.get(images.get(i));
			
			mht.append("\r\n" + 
					"------=_NextPart_000_0000_01C733E6.BCFF96B0\r\n" + 
					"Content-Type: " + img.getImageInfo().getMimeType() + "\r\n" + 
					"Content-Transfer-Encoding: base64\r\n" + 
					"Content-Location: file:///" +
					images.get(i) +
					"\r\n" + 
					"\r\n" + 
					"");
			
			mht.append(ims.utils.Base64Coder.encode(getImageContent((Image) imageMap.get(images.get(i)))));
			mht.append("\r\n");
		}
		
		mht.append("\r\n" + 
				"------=_NextPart_000_0000_01C733E6.BCFF96B0--\r\n" + 
				"");
		
		return mht.toString();
	}
	
	private String getFindingTag(String areaDrawn, int number)
	{
		int index;
		int len = areaDrawn.length();
		char c;
		StringBuffer sb = new StringBuffer("");
		String str = "";
		
		sb.append("<div style=\'");
		if(areaDrawn.substring(0, 8).equalsIgnoreCase("<v:image"))
		{
			//left
			index = areaDrawn.toUpperCase().indexOf("LEFT:");
			
			if(index < 0)
				return "";

			while((c = areaDrawn.charAt(index)) != ';' && index < len)
			{
				sb.append(c);
				index++;
			}
			sb.append(';');
			
			//top
			index = areaDrawn.toUpperCase().indexOf("TOP:");
			
			if(index < 0)
				return "";

			while((c = areaDrawn.charAt(index)) != ';' && index < len)
			{
				sb.append(c);
				index++;
			}
			sb.append(';');
			sb.append("background: transparent;");
		}
		else if(areaDrawn.substring(0, 8).equalsIgnoreCase("<v:shape"))
		{
			index = areaDrawn.toUpperCase().indexOf("PATH = \" M");

			if(index < 0)
				return "";
			
			index += 10;
			while((c = areaDrawn.charAt(index)) != ' ' && index < len)
			{
				if(c == ',')
				{
					//left
					sb.append("LEFT: ");
					sb.append(str);
					sb.append("px; ");
					str = "";
				}
				else
					str += c;
				
				index++;
			}
			
			//top
			sb.append("TOP: ");
			sb.append(str);
			sb.append("px; ");
			sb.append("background: black;");
		}
		
		sb.append(" padding: 2px; z-index: 10000; position: absolute; font-weight: bold; font-size: 9px; color: white; filter: dropShadow(color=black,offx=1,offy=1); \'>");
		sb.append(number);
		sb.append("</div>");
		
		return sb.toString();
	}

	private byte[] getImageContent(Image img) 
	{
		if(img == null || img.getImagePath() == null || img.getImagePath().length() == 0)
			return null;

		return ImagePath.getImageContent(img.getImagePath());
	}
	
	private String EncodeTriplet(String value, char delimiter)
	{
		int n;
		char c;
		
		if (value == null) return "";
		
		StringBuffer sb = new StringBuffer(value.length() * 3);
		
		for(n = 0; n < value.length(); n++)
		{
			c = value.charAt(n);
			
			if((c >= 0 && c <= 31) || (c >= 127 && c <= 255) || c == '=')
			{
				sb.append(delimiter);
				sb.append(Integer.toHexString( 0x100 | c).substring(1).toUpperCase());
			}
			else
			{
				sb.append(c);
			}
		}
		
		return sb.toString();
	}
	
	private String EncodeQuotedPrintable(String value)
	{
		return EncodeTriplet(value, '=');
	}
	
	private String RemoveCRLF(String value)
	{
		if(value == null)
			return null;
		
		StringBuffer sb = new StringBuffer(value.length());
		
		int len = value.length();
		char c;
		for (int i = 0; i < len; i++)
		{
			c = value.charAt(i);
			
			if(c != '\r' && c != '\n')
				sb.append(c);
		}
		
		return sb.toString();
	}
	
	private String replaceString(String aInput, String aOldPattern, String aNewPattern)
	{
		if (aOldPattern.equals(""))
		{
			throw new IllegalArgumentException("Old pattern must have content.");
		}

		final StringBuffer result = new StringBuffer();
		//startIdx and idxOld delimit various chunks of aInput; these
		//chunks always end where aOldPattern begins
		int startIdx = 0;
		int idxOld = 0;
		while ((idxOld = aInput.indexOf(aOldPattern, startIdx)) >= 0)
		{
			//grab a part of aInput which does not include aOldPattern
			result.append(aInput.substring(startIdx, idxOld));
			//add aNewPattern to take place of aOldPattern
			result.append(aNewPattern);

			//reset the startIdx to just after the current match, to see
			//if there are any further matches
			startIdx = idxOld + aOldPattern.length();
		}
		//the final chunk will go to the end of aInput
		result.append(aInput.substring(startIdx));
		return result.toString();
	}



}
