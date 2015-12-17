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
import ims.framework.controls.DynamicGridCell;
import ims.framework.controls.TreeNode;
import ims.framework.controls.TreeView;
import ims.framework.controls.DynamicGrid;
import ims.framework.controls.DynamicGridRow;
import ims.framework.controls.DynamicGridColumn;
import ims.framework.enumerations.DynamicCellType;
import ims.framework.utils.Image;

public class OrganisationLocationHelper
{
	private static final int	ROOT = 0;
	private static final int	ORG_NODE = 1;
	private static final int	LS_NODE = 2;
	private static final int	LOC_NODE = 3;

	private static final Integer	COL_DESC			= new Integer(2);

	private Image orgImg;
	private Image orgDisImg;
	private Image locSiteImg;
	private Image locSiteDisImg;
	private Image locImg;
	private Image locDisImg;
	private TreeView tree;
	private DynamicGrid dynGrid;
	private boolean showInactive;
	private boolean showCheckBoxes;
	
	public OrganisationLocationHelper (Image orgImg, Image locSiteImg, Image locImg)
	{
		this(orgImg, orgImg, locSiteImg, locSiteImg, locImg, locImg);		
	}
	
	public OrganisationLocationHelper (Image orgImg, Image orgDisImg, Image locSiteImg, Image locSiteDisImg, Image locImg, Image locDisImg)
	{
		this.orgImg = orgImg;
		this.orgDisImg = orgDisImg;
		this.locSiteImg = locSiteImg;
		this.locSiteDisImg = locSiteDisImg;
		this.locImg = locImg;
		this.locDisImg = locDisImg;		
	}
	
	public void populateOrganisationLocationTree(TreeView tree, OrganisationVoCollection voColl)
	{
		populateOrganisationLocationTree(tree, voColl, false, false);
	}
	
	public void populateOrganisationLocationDynamicGrid(DynamicGrid grid, OrganisationVoCollection voColl)
	{
		populateOrganisationLocationDynamicGrid(grid, voColl, false, false);
	}
	
	public void populatOrganisationLocationTree(TreeView tree, OrganisationVoCollection voColl, boolean showCheckBoxes)
	{
		populateOrganisationLocationTree(tree, voColl, showCheckBoxes, false);
	}

	public void populatOrganisationLocationDynamicGrid(DynamicGrid grid, OrganisationVoCollection voColl, boolean showCheckBoxes)
	{
		populateOrganisationLocationDynamicGrid(grid, voColl, showCheckBoxes, false);
	}
	
	public void populateOrganisationLocationTree(TreeView tree, OrganisationVoCollection voColl, boolean showCheckBoxes, boolean showInactive)
	{
		this.tree = tree;
		this.dynGrid = null;
		this.showInactive = showInactive;
		this.showCheckBoxes = showCheckBoxes;
		this.tree.clear();		
		
		populateOrganisations(voColl, null);		
	}
	
	private void populateOrganisationLocationDynamicGrid(DynamicGrid grid, OrganisationVoCollection voColl, boolean showCheckBoxes, boolean showInactive)
	{
		this.tree = null;
		this.dynGrid = grid;
		this.showInactive = showInactive;
		this.showCheckBoxes = showCheckBoxes;
		this.dynGrid.getRows().clear();	
		
		populateOrganisations(voColl, null);
	}

	private void populateOrganisations(OrganisationVoCollection voColl, Object objectTreeOrGrid) //TreeNode parentNode)
	{
		if (voColl == null)
			return;

		for (int i = 0; i < voColl.size(); i++)
		{
			OrganisationVo voOrg = voColl.get(i);
			
			if (voOrg.getIsActive().booleanValue() == false && !showInactive)
				continue;
			
			Image img = voOrg.getIsActive().booleanValue() ? orgImg : orgDisImg;			
			if (this.tree != null)
			{
				TreeNode orgNode = null;
				
				TreeNode parentNode = (TreeNode) objectTreeOrGrid;
				if (parentNode == null)
					orgNode = tree.getNodes().add(voOrg, voOrg.getName(), ORG_NODE, new int[]{ROOT, ORG_NODE}, true);
				else
					orgNode = parentNode.getNodes().add(voOrg, voOrg.getName(), ORG_NODE, new int[]{ROOT, ORG_NODE}, true);
				orgNode.setCollapsedImage(img);
				orgNode.setExpandedImage(img);

				populateOrganisations(voOrg.getRelatedOrganisations().sort(), orgNode);
				populateLocationSites(voOrg.getLocationSites().sort(), orgNode);
			}
			else
			{
				DynamicGridRow rowParent = (DynamicGridRow)objectTreeOrGrid;
				
				DynamicGridRow row = null;
				if (rowParent == null)
				{
					row = this.dynGrid.getRows().newRow();
					
					DynamicGridCell cell1 = row.getCells().newCell(getColByIdentifier(COL_DESC), DynamicCellType.LABEL);
					cell1.setValue(voOrg.getNameIsNotNull() ? voOrg.getName() : "");
					cell1.setIdentifier(voOrg.getName());
					row.setValue(voOrg);
					row.setCheckBoxVisible(false);
					//cell1.setTooltip(voDose.getDiscontinuedTooltip());
				}
				else
				{
					row = rowParent.getRows().newRow();

					DynamicGridCell cell1 = row.getCells().newCell(getColByIdentifier(COL_DESC), DynamicCellType.LABEL);
					cell1.setValue(voOrg.getNameIsNotNull() ? voOrg.getName() : "");
					cell1.setIdentifier(voOrg.getName());
					row.setValue(voOrg);
					row.setCheckBoxVisible(false);
				}
				
				row.setCollapsedImage(img);
				row.setExpandedImage(img);
				
				populateOrganisations(voOrg.getRelatedOrganisations().sort(), row);
				populateLocationSites(voOrg.getLocationSites().sort(), row);
			}
			
		}
	}

	private DynamicGridColumn getColByIdentifier(Object indentifier)
	{
		return this.dynGrid.getColumns().getByIdentifier(indentifier);
	}

	private void populateLocationSites(LocSiteVoCollection locationSites, Object objectTreeOrGrid)
	{
		if (locationSites == null)
			return;
		
		TreeNode locNode = null;
		for(int i=0; i < locationSites.size(); i++)
		{
			LocSiteVo voLoc = locationSites.get(i);	
			if (voLoc.getIsActive().booleanValue() == false && !showInactive)
				continue;
			
			if (voLoc.getIsVirtualIsNotNull() && voLoc.getIsVirtual().booleanValue())
				continue;

			Image img = voLoc.getIsActive().booleanValue() ? locSiteImg : locSiteDisImg;			

			if (this.tree != null)
			{
				TreeNode parentNode = (TreeNode) objectTreeOrGrid;

				locNode = parentNode.getNodes().add(voLoc, voLoc.getName(), LS_NODE, ORG_NODE, true);
				locNode.setCollapsedImage(img);
				locNode.setExpandedImage(img);
				locNode.setCheckBoxVisible(showCheckBoxes);

				populateLocations(voLoc.getLocations().sort(), locNode);
			}
			else
			{
				DynamicGridRow rowParent = (DynamicGridRow)objectTreeOrGrid;
				DynamicGridRow row = null;
				row = rowParent.getRows().newRow();

				DynamicGridCell cell1 = row.getCells().newCell(getColByIdentifier(COL_DESC), DynamicCellType.LABEL);
				cell1.setValue(voLoc.getNameIsNotNull() ? voLoc.getName() : "");
				cell1.setIdentifier(voLoc.getName());

				row.setValue(voLoc);
				row.setCheckBoxVisible(showCheckBoxes);
				
				row.setCollapsedImage(img);
				row.setExpandedImage(img);

				populateLocations(voLoc.getLocations().sort(), row);
			}
		}		
	}

	private void populateLocations(LocMostVoCollection locations, Object objectTreeOrGrid)
	{
		if (locations == null)
			return;
		
		TreeNode locNode = null;
		for(int i=0; i < locations.size(); i++)
		{
			LocMostVo voLoc = locations.get(i);	
			if (voLoc.getIsActive().booleanValue() == false && !showInactive)
				continue;
			
			if (voLoc.getIsVirtualIsNotNull() && voLoc.getIsVirtual().booleanValue())
				continue;

			Image img = voLoc.getIsActive().booleanValue() ? locImg: locDisImg;			
			if (this.tree != null)
			{
				TreeNode parentNode = (TreeNode) objectTreeOrGrid;

				locNode = parentNode.getNodes().add(voLoc, voLoc.getName(), LOC_NODE, new int[]{LS_NODE,LOC_NODE}, true);
				locNode.setCollapsedImage(img);
				locNode.setExpandedImage(img);	
				locNode.setCheckBoxVisible(showCheckBoxes);

				populateLocations(voLoc.getLocations().sort(), locNode);
			}
			else
			{
				DynamicGridRow rowParent = (DynamicGridRow)objectTreeOrGrid;
				DynamicGridRow row = null;
				row = rowParent.getRows().newRow();

				DynamicGridCell cell1 = row.getCells().newCell(getColByIdentifier(COL_DESC), DynamicCellType.LABEL);
				cell1.setValue(voLoc.getNameIsNotNull() ? voLoc.getName() : "");
				cell1.setIdentifier(voLoc.getName());

				row.setValue(voLoc);
				row.setCheckBoxVisible(showCheckBoxes);

				row.setCollapsedImage(img);
				row.setExpandedImage(img);
				
				populateLocations(voLoc.getLocations().sort(), row);
			}
		}		
	}

}
