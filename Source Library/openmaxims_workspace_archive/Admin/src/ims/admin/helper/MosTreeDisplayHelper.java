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
/**
 * displays a list of MOS into a tree
 */
package ims.admin.helper;

/**
 * @author aursache
 *
 */
public class MosTreeDisplayHelper
{
	private ims.framework.controls.TreeView treeMos = null;
	private ims.framework.utils.Image staffImage = null;
	
	public MosTreeDisplayHelper(ims.framework.controls.TreeView tree, ims.framework.utils.Image image)
	{
		treeMos    = tree;
		staffImage = image;
	}
	public void populateMosTree(ims.core.vo.MemberOfStaffShortVoCollection mosCollVo)
	{
		if(treeMos == null)
			throw new ims.framework.exceptions.CodingRuntimeException("No tree control provided to MosTreeDisplayHelper");
		
		treeMos.clear();
		for (int i = 0; mosCollVo != null && i < mosCollVo.size(); i++)
		{
			ims.core.vo.MemberOfStaffShortVo mosVo = mosCollVo.get(i);
	
			ims.framework.controls.TreeNode newNode = treeMos.getNodes().add(mosVo, mosVo.toString());
			if (mosVo.getHcpIsNotNull() && mosVo.getHcp().getHcpTypeIsNotNull())
			{
				if (mosVo.getHcp().getHcpType().getParent() == null)
				{
					newNode.setCollapsedImage(mosVo.getHcp().getHcpType().getImage() == null ? staffImage : mosVo.getHcp().getHcpType().getImage());
					newNode.setExpandedImage(mosVo.getHcp().getHcpType().getImage() == null ? staffImage : mosVo.getHcp().getHcpType().getImage());
				}
				else
				{
					newNode.setCollapsedImage(mosVo.getHcp().getHcpType().getParent().getImage() == null ? staffImage : mosVo.getHcp().getHcpType().getParent().getImage());
					newNode.setExpandedImage(mosVo.getHcp().getHcpType().getParent().getImage() == null ? staffImage : mosVo.getHcp().getHcpType().getParent().getImage());
	
				}
			}
			else
			{
				newNode.setCollapsedImage(staffImage);
				newNode.setExpandedImage(staffImage);
			}
			if ((mosVo.getIsActiveIsNotNull()) && (mosVo.getIsActive().booleanValue() == false))
				newNode.setTextColor(ims.framework.utils.Color.Gray);
		}
	}

}
