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

import ims.core.vo.LocSiteVo;
import ims.core.vo.LocSiteVoCollection;
import ims.core.vo.LocMostVo;
import ims.core.vo.LocMostVoCollection;
import ims.core.vo.OrganisationVo;
import ims.core.vo.OrganisationVoCollection;
import ims.framework.controls.TreeNode;
import ims.framework.controls.TreeView;
import ims.framework.utils.Image;

public class OrgTreeHelper
{
	private static final int	ROOT = 0;
	private static final int	ORG_NODE = 1;
	private static final int	LS_NODE = 2;
	private static final int	LOC_NODE = 3;

	private Image orgImg;
	private Image orgDisImg;
	private Image locSiteImg;
	private Image locSiteDisImg;
	private Image locImg;
	private Image locDisImg;
	private TreeView tree;
	private boolean showInactive;
	private boolean showCheckBoxes;
	
	public OrgTreeHelper (Image orgImg, Image locSiteImg, Image locImg)
	{
		this(orgImg, orgImg, locSiteImg, locSiteImg, locImg, locImg);		
	}
	
	public OrgTreeHelper (Image orgImg, Image orgDisImg, Image locSiteImg, Image locSiteDisImg, Image locImg, Image locDisImg)
	{
		this.orgImg = orgImg;
		this.orgDisImg = orgDisImg;
		this.locSiteImg = locSiteImg;
		this.locSiteDisImg = locSiteDisImg;
		this.locImg = locImg;
		this.locDisImg = locDisImg;		
	}
	
	public void populateOrgTree(TreeView tree, OrganisationVoCollection voColl)
	{
		populateOrgTree(tree, voColl, false, false, false);
	}
	
	public void populateOrgTree(TreeView tree, OrganisationVoCollection voColl, boolean showCheckBoxes)
	{
		populateOrgTree(tree, voColl, showCheckBoxes, false, false);
	}
	
	public void populateOrgTree(TreeView tree, OrganisationVoCollection voColl, boolean showCheckBoxes, boolean showInactive, boolean disableOrgNodes)
	{
		this.tree = tree;
		this.showInactive = showInactive;
		this.showCheckBoxes = showCheckBoxes;
		this.tree.clear();		
		populateOrgs(voColl, null, disableOrgNodes);		
	}
	
	private void populateOrgs(OrganisationVoCollection voColl, TreeNode parentNode, boolean disableOrgNodes)
	{
		if (voColl == null)
			return;

		for (int i = 0; i < voColl.size(); i++)
		{
			OrganisationVo voOrg = voColl.get(i);
			if (voOrg.getIsActive().booleanValue() == false && !showInactive)
				continue;
			
			TreeNode orgNode = null;
			if (parentNode == null)
			{
				//WDEV-6444 - if node is inactive disable drag dropping for that node
				if(voOrg.getIsActive().booleanValue() == false)
					orgNode = tree.getNodes().add(voOrg, voOrg.getName());
				else
					orgNode = tree.getNodes().add(voOrg, voOrg.getName(), ORG_NODE, new int[]{ROOT, ORG_NODE}, true);
			}
			else
				orgNode = parentNode.getNodes().add(voOrg, voOrg.getName(), ORG_NODE, new int[]{ROOT, ORG_NODE}, true);
			Image img = voOrg.getIsActive().booleanValue() ? orgImg : orgDisImg;			
			orgNode.setCollapsedImage(img);
			orgNode.setExpandedImage(img);
			orgNode.setEnabled(!disableOrgNodes);
			
			populateOrgs(voOrg.getRelatedOrganisations().sort(), orgNode, disableOrgNodes);
			populateLocSites(voOrg.getLocationSites().sort(), orgNode);
		}
	}
	
	private void populateLocSites(LocSiteVoCollection locationSites, TreeNode orgNode)
	{
		if (locationSites == null)
			return;
		
		TreeNode locNode = null;
		for(int i=0; i < locationSites.size(); i++)
		{
			LocSiteVo voLoc = locationSites.get(i);	
			if (voLoc.getIsActive().booleanValue() == false && !showInactive)
				continue;
			
			Image img = voLoc.getIsActive().booleanValue() ? locSiteImg : locSiteDisImg;		
			
			//WDEV-6444 - if node is inactive disable drag dropping for that node
			if(voLoc.getIsActive().booleanValue() == false)
				locNode = orgNode.getNodes().add(voLoc, voLoc.getName());
			else
				locNode = orgNode.getNodes().add(voLoc, voLoc.getName(), LS_NODE, ORG_NODE, true);
			
			locNode.setCollapsedImage(img);
			locNode.setExpandedImage(img);
			locNode.setCheckBoxVisible(showCheckBoxes);
			populateLocations(voLoc.getLocations().sort(), locNode);
		}		
	}

	private void populateLocations(LocMostVoCollection locations, TreeNode parentNode)
	{
		if (locations == null)
			return;
		
		TreeNode locNode = null;
		for(int i=0; i < locations.size(); i++)
		{
			LocMostVo voLoc = locations.get(i);	
			if (voLoc.getIsActive().booleanValue() == false && !showInactive)
				continue;
			
			Image img = voLoc.getIsActive().booleanValue() ? locImg: locDisImg;			
			
			//WDEV-6444 - if node is inactive disable drag dropping for that node
			if(voLoc.getIsActive().booleanValue() == false)
				locNode = parentNode.getNodes().add(voLoc, voLoc.getName());
			else
				locNode = parentNode.getNodes().add(voLoc, voLoc.getName(), LOC_NODE, new int[]{LS_NODE,LOC_NODE}, true);
			
			locNode.setCollapsedImage(img);
			locNode.setExpandedImage(img);	
			locNode.setCheckBoxVisible(showCheckBoxes);
			populateLocations(voLoc.getLocations().sort(), locNode);
		}		
	}
}
