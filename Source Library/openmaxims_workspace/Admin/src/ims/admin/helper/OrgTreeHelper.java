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
package ims.admin.helper;

import ims.core.vo.LocMostVo;
import ims.core.vo.LocMostVoCollection;
import ims.core.vo.LocSiteLiteWithLocationsVo;
import ims.core.vo.LocSiteLiteWithLocationsVoCollection;
import ims.core.vo.LocSiteVo;
import ims.core.vo.LocSiteVoCollection;
import ims.core.vo.LocationMinWithLocationsVo;
import ims.core.vo.LocationMinWithLocationsVoCollection;
import ims.core.vo.OrganisationMinWithLocSitesVo;
import ims.core.vo.OrganisationMinWithLocSitesVoCollection;
import ims.core.vo.OrganisationVo;
import ims.core.vo.OrganisationVoCollection;
import ims.core.vo.lookups.LocationType;
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
	private boolean showCaseNoteLocations;
	private boolean showLocationsMarkedAsCaseNoteFolderOnly;
	private boolean showVirtual;
	
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
		populateOrgTree(tree, voColl, false, false, true, false, false);
	}
	
	public void populateOrgTree(TreeView tree, OrganisationVoCollection voColl, boolean showCheckBoxes)
	{
		populateOrgTree(tree, voColl, showCheckBoxes, false, false, false, false);
	}
	
	public void populateOrgTree(TreeView tree, OrganisationVoCollection voColl, boolean showCheckBoxes, boolean showVirtual)
	{
		populateOrgTree(tree, voColl, showCheckBoxes, false, showVirtual, false, false);
	}
	
	
	public void populateOrgTree(TreeView tree, OrganisationVoCollection voColl, boolean showCheckBoxes, boolean showInactive, boolean showVirtual, boolean disableOrgNodes, boolean caseNoteLocations)
	{
		this.tree = tree;
		this.showInactive = showInactive;
		this.showCheckBoxes = showCheckBoxes;
		this.showCaseNoteLocations = caseNoteLocations;
		this.showVirtual = showVirtual;
		this.tree.clear();		
		populateOrgs(voColl, null, disableOrgNodes);		
	}
	//WDEV-20044 new constructor based on Lite vo
	public void populateOrgTree(TreeView tree, OrganisationMinWithLocSitesVoCollection voColl, boolean showCheckBoxes, boolean showInactive, boolean showVirtual, boolean disableOrgNodes, boolean caseNoteLocations)
	{
		this.tree = tree;
		this.showInactive = showInactive;
		this.showCheckBoxes = showCheckBoxes;
		this.showCaseNoteLocations = caseNoteLocations;
		this.showVirtual = showVirtual;
		this.tree.clear();		
		populateOrgs(voColl, null, disableOrgNodes);		
	}
	//wdev-20067
	public void populateOrgTree(TreeView tree, OrganisationMinWithLocSitesVoCollection voColl, boolean showCheckBoxes, boolean showInactive, boolean showVirtual, boolean disableOrgNodes, boolean caseNoteLocations, ims.core.vo.lookups.LocationType loctype)
	{
		this.tree = tree;
		this.showInactive = showInactive;
		this.showCheckBoxes = showCheckBoxes;
		this.showCaseNoteLocations = caseNoteLocations;
		this.showVirtual = showVirtual;
		this.tree.clear();		
		populateOrgs(voColl, null, disableOrgNodes,loctype);		
	}
	//--------
	public void populateOrgTreeCaseNoteLocations(TreeView tree, OrganisationVoCollection voColl, boolean showCheckBoxes, boolean showInactive, boolean showVirtual, boolean disableOrgNodes,  boolean showLocationsMarkedAsCaseNoteFolderOnly)
	{
		this.tree = tree;
		this.showInactive = showInactive;
		this.showVirtual = showVirtual;
		this.showCheckBoxes = showCheckBoxes;
		this.showLocationsMarkedAsCaseNoteFolderOnly = showLocationsMarkedAsCaseNoteFolderOnly;
		this.tree.clear();		
		populateOrgs(voColl, null, disableOrgNodes);		
	}
	//WDEV-20044 new constructor based on Lite vo to list Case Note Folder locations in tree
	public void populateOrgTreeCaseNoteLocations(TreeView tree, OrganisationMinWithLocSitesVoCollection voColl, boolean showCheckBoxes, boolean showInactive, boolean showVirtual, boolean disableOrgNodes,  boolean showLocationsMarkedAsCaseNoteFolderOnly)
	{
		this.tree = tree;
		this.showInactive = showInactive;
		this.showVirtual = showVirtual;
		this.showCheckBoxes = showCheckBoxes;
		this.showLocationsMarkedAsCaseNoteFolderOnly = showLocationsMarkedAsCaseNoteFolderOnly;
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
	//WDEV-20044 - method to populate tree with Lite vo argument collection
	private void populateOrgs(OrganisationMinWithLocSitesVoCollection voColl, TreeNode parentNode, boolean disableOrgNodes)
	{
		if (voColl == null)
			return;

		for (int i = 0; i < voColl.size(); i++)
		{
			OrganisationMinWithLocSitesVo voOrg = voColl.get(i);
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
	
	//wdev-20067
	private void populateOrgs(OrganisationMinWithLocSitesVoCollection voColl, TreeNode parentNode, boolean disableOrgNodes, ims.core.vo.lookups.LocationType loctype)
	{
		if (voColl == null)
			return;

		for (int i = 0; i < voColl.size(); i++)
		{
			OrganisationMinWithLocSitesVo voOrg = voColl.get(i);
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
			
			populateOrgs(voOrg.getRelatedOrganisations().sort(), orgNode, disableOrgNodes,loctype);
			populateLocSites(voOrg.getLocationSites().sort(), orgNode, loctype);
		}
	}
	
	private void populateLocSites(LocSiteLiteWithLocationsVoCollection locationSites, TreeNode orgNode, ims.core.vo.lookups.LocationType loctype)
	{
		if (locationSites == null)
			return;
		
		TreeNode locNode = null;
		for(int i=0; i < locationSites.size(); i++)
		{
			LocSiteLiteWithLocationsVo voLoc = locationSites.get(i);	
			
			if ((voLoc.getIsActive().booleanValue() == false && !showInactive) || (voLoc.getIsVirtual().booleanValue() && !showVirtual) || ((LocationType.CASE_NOTE_FOLDER_LOCATION.equals(voLoc.getType()) || LocationType.MEDICAL_RECORDS.equals(voLoc.getType()))  && !showCaseNoteLocations && !showLocationsMarkedAsCaseNoteFolderOnly) || (showLocationsMarkedAsCaseNoteFolderOnly && !isCaseFolderLocationOrHasCaseNoteLocChild(voLoc))) //WDEV-19532 //WDEV-19545
				continue;
			
			if( loctype != null && loctype.equals(voLoc.getType()))
			{
			
    			Image img = voLoc.getIsActive().booleanValue() ? locSiteImg : locSiteDisImg;		
    			
    			//WDEV-6444 - if node is inactive disable drag dropping for that node
    			if(voLoc.getIsActive().booleanValue() == false)
    				locNode = orgNode.getNodes().add(voLoc, voLoc.getName());
    			else
    				locNode = orgNode.getNodes().add(voLoc, voLoc.getName(), LS_NODE, ORG_NODE, true);
    			
    			locNode.setCollapsedImage(img);
    			locNode.setExpandedImage(img);
    			locNode.setCheckBoxVisible(showCheckBoxes);
    			locNode.setEnabled(showLocationsMarkedAsCaseNoteFolderOnly ? Boolean.TRUE.equals(voLoc.getCaseNoteFolderLocation()) : true); //WDEV-19518
			}
			if( locNode != null)
				populateLocations(voLoc.getLocations().sort(), locNode,loctype);
			else
				populateLocations(voLoc.getLocations().sort(), orgNode,loctype);
		}		
	}
	private void populateLocations(LocationMinWithLocationsVoCollection locations, TreeNode parentNode, ims.core.vo.lookups.LocationType loctype )
	{
		if (locations == null)
			return;
		
		TreeNode locNode = null;
		for(int i=0; i < locations.size(); i++)
		{
			LocationMinWithLocationsVo voLoc = locations.get(i);	
			
			if ((voLoc.getIsActive().booleanValue() == false && !showInactive) || (voLoc.getIsVirtual().booleanValue() && !showVirtual) || ((LocationType.CASE_NOTE_FOLDER_LOCATION.equals(voLoc.getType()) || LocationType.MEDICAL_RECORDS.equals(voLoc.getType())) && !showCaseNoteLocations && !showLocationsMarkedAsCaseNoteFolderOnly) || (showLocationsMarkedAsCaseNoteFolderOnly && !Boolean.TRUE.equals(voLoc.getCaseNoteFolderLocation()))) //WDEV-19532 //WDEV-19545
				continue;
			
			if( loctype != null && loctype.equals(voLoc.getType()))
			{
			
    			Image img = voLoc.getIsActive().booleanValue() ? locImg: locDisImg;			
    			
    			//WDEV-6444 - if node is inactive disable drag dropping for that node
    			if(voLoc.getIsActive().booleanValue() == false)
    				locNode = parentNode.getNodes().add(voLoc, voLoc.getName());
    			else
    				locNode = parentNode.getNodes().add(voLoc, voLoc.getName(), LOC_NODE, new int[]{LS_NODE,LOC_NODE}, true);
    			
    			locNode.setCollapsedImage(img);
    			locNode.setExpandedImage(img);	
    			locNode.setCheckBoxVisible(showCheckBoxes);
    			locNode.setEnabled(showLocationsMarkedAsCaseNoteFolderOnly ? Boolean.TRUE.equals(voLoc.getCaseNoteFolderLocation()) : true); //WDEV-19518
			}
			if( locNode != null)
				populateLocations(voLoc.getLocations().sort(), locNode,loctype);
			else
				populateLocations(voLoc.getLocations().sort(), parentNode,loctype);
		}		
	}
	
	//---------- end of wdev-20074 ----
	
	private void populateLocSites(LocSiteVoCollection locationSites, TreeNode orgNode)
	{
		if (locationSites == null)
			return;
		
		TreeNode locNode = null;
		for(int i=0; i < locationSites.size(); i++)
		{
			LocSiteVo voLoc = locationSites.get(i);	
			
			if ((voLoc.getIsActive().booleanValue() == false && !showInactive) || (voLoc.getIsVirtual().booleanValue() && !showVirtual) || ((LocationType.CASE_NOTE_FOLDER_LOCATION.equals(voLoc.getType()) || LocationType.MEDICAL_RECORDS.equals(voLoc.getType()))  && !showCaseNoteLocations && !showLocationsMarkedAsCaseNoteFolderOnly) || (showLocationsMarkedAsCaseNoteFolderOnly && !isCaseFolderLocationOrHasCaseNoteLocChild(voLoc))) //WDEV-19532 //WDEV-19545
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
			locNode.setEnabled(showLocationsMarkedAsCaseNoteFolderOnly ? Boolean.TRUE.equals(voLoc.getCaseNoteFolderLocation()) : true); //WDEV-19518
			populateLocations(voLoc.getLocations().sort(), locNode);
		}		
	}
	//WDEV-20044 - method to populate tree with Lite vo argument collection
	private void populateLocSites(LocSiteLiteWithLocationsVoCollection locationSites, TreeNode orgNode)
	{
		if (locationSites == null)
			return;
		
		TreeNode locNode = null;
		for(int i=0; i < locationSites.size(); i++)
		{
			LocSiteLiteWithLocationsVo voLoc = locationSites.get(i);	
			
			if ((voLoc.getIsActive().booleanValue() == false && !showInactive) || (voLoc.getIsVirtual().booleanValue() && !showVirtual) || ((LocationType.CASE_NOTE_FOLDER_LOCATION.equals(voLoc.getType()) || LocationType.MEDICAL_RECORDS.equals(voLoc.getType()))  && !showCaseNoteLocations && !showLocationsMarkedAsCaseNoteFolderOnly) || (showLocationsMarkedAsCaseNoteFolderOnly && !isCaseFolderLocationOrHasCaseNoteLocChild(voLoc))) //WDEV-19532 //WDEV-19545
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
			locNode.setEnabled(showLocationsMarkedAsCaseNoteFolderOnly ? Boolean.TRUE.equals(voLoc.getCaseNoteFolderLocation()) : true); //WDEV-19518
			populateLocations(voLoc.getLocations().sort(), locNode);
		}		
	}
	//WDEV-19518
	private boolean isCaseFolderLocationOrHasCaseNoteLocChild(LocSiteVo voLoc)
	{
		if (Boolean.TRUE.equals(voLoc.getCaseNoteFolderLocation()))
				return true;
		if (voLoc.getLocationsIsNotNull() && voLoc.getLocations().size() > 0)
		{
			for (LocMostVo loc : voLoc.getLocations())
			{
				if (Boolean.TRUE.equals(loc.getCaseNoteFolderLocation()))
						return true;
			}
			return false;
		}
		return false;
	}

	private void populateLocations(LocMostVoCollection locations, TreeNode parentNode)
	{
		if (locations == null)
			return;
		
		TreeNode locNode = null;
		for(int i=0; i < locations.size(); i++)
		{
			LocMostVo voLoc = locations.get(i);	
			
			if ((voLoc.getIsActive().booleanValue() == false && !showInactive) || (voLoc.getIsVirtual().booleanValue() && !showVirtual) || ((LocationType.CASE_NOTE_FOLDER_LOCATION.equals(voLoc.getType()) || LocationType.MEDICAL_RECORDS.equals(voLoc.getType())) && !showCaseNoteLocations && !showLocationsMarkedAsCaseNoteFolderOnly) || (showLocationsMarkedAsCaseNoteFolderOnly && !Boolean.TRUE.equals(voLoc.getCaseNoteFolderLocation()))) //WDEV-19532 //WDEV-19545
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
			locNode.setEnabled(showLocationsMarkedAsCaseNoteFolderOnly ? Boolean.TRUE.equals(voLoc.getCaseNoteFolderLocation()) : true); //WDEV-19518
			populateLocations(voLoc.getLocations().sort(), locNode);
		}		
	}
	//WDEV-20044 - method to populate tree with Lite vo argument collection
	private void populateLocations(LocationMinWithLocationsVoCollection locations, TreeNode parentNode)
	{
		if (locations == null)
			return;
		
		TreeNode locNode = null;
		for(int i=0; i < locations.size(); i++)
		{
			LocationMinWithLocationsVo voLoc = locations.get(i);	
			
			if ((voLoc.getIsActive().booleanValue() == false && !showInactive) || (voLoc.getIsVirtual().booleanValue() && !showVirtual) || ((LocationType.CASE_NOTE_FOLDER_LOCATION.equals(voLoc.getType()) || LocationType.MEDICAL_RECORDS.equals(voLoc.getType())) && !showCaseNoteLocations && !showLocationsMarkedAsCaseNoteFolderOnly) || (showLocationsMarkedAsCaseNoteFolderOnly && !isCaseFolderLocationOrHasCaseNoteLocChild(voLoc))) //WDEV-19532 //WDEV-19545
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
			locNode.setEnabled(showLocationsMarkedAsCaseNoteFolderOnly ? Boolean.TRUE.equals(voLoc.getCaseNoteFolderLocation()) : true); //WDEV-19518
			populateLocations(voLoc.getLocations().sort(), locNode);
		}		
	}
	private boolean isCaseFolderLocationOrHasCaseNoteLocChild(LocSiteLiteWithLocationsVo voLoc)
	{
		if(voLoc == null)
			return false;
		
		if (Boolean.TRUE.equals(voLoc.getCaseNoteFolderLocation()))
				return true;
		
		if (voLoc.getLocationsIsNotNull() && voLoc.getLocations().size() > 0)
		{
			for (LocationMinWithLocationsVo loc : voLoc.getLocations())
			{
				if(isCaseFolderLocationOrHasCaseNoteLocChild(loc))
					return true;
			}
			
			return false;
		}
		
		return false;
	}
	
	private boolean isCaseFolderLocationOrHasCaseNoteLocChild(LocationMinWithLocationsVo voLoc)
	{
		if(voLoc == null)
			return false;
		
		if (Boolean.TRUE.equals(voLoc.getCaseNoteFolderLocation()))
				return true;
		
		if (voLoc.getLocationsIsNotNull() && voLoc.getLocations().size() > 0)
		{
			for (LocationMinWithLocationsVo loc : voLoc.getLocations())
			{
				if(isCaseFolderLocationOrHasCaseNoteLocChild(loc))
					return true;
			}
			
			return false;
		}
		
		return false;
	}
}
