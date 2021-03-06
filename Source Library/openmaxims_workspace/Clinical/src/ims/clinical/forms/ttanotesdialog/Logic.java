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
// This code was generated by George Cristian Josan using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2013 IMS MAXIMS. All rights reserved.

package ims.clinical.forms.ttanotesdialog;

import ims.clinical.forms.ttanotesdialog.GenForm.grdCommentsRow;
import ims.clinical.vo.DischargeMedicationDetailsVo;
import ims.clinical.vo.TTAMedicationVo;
import ims.clinical.vo.TTANoteVo;
import ims.clinical.vo.TTANoteVoCollection;
import ims.edischarge.vo.TTANoteRefVoCollection;
import ims.framework.enumerations.DialogResult;
import ims.framework.exceptions.PresentationLogicException;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void onFormOpen(Object[] args) throws PresentationLogicException
	{
		TTANoteRefVoCollection comments = null;
		
		// Get notes from argument
		if (args != null && args.length > 0)
		{
			if (args[0] instanceof DischargeMedicationDetailsVo)
			{
				DischargeMedicationDetailsVo dischargeMedication = (DischargeMedicationDetailsVo) args[0];
				comments = dischargeMedication.getTTAComments();
			}
			else if (args[0] instanceof TTAMedicationVo)
			{
				TTAMedicationVo medication = (TTAMedicationVo) args[0];
				comments = new TTANoteRefVoCollection();
				
				if (medication.getMedComments() != null)
				{
					for (TTANoteVo note : medication.getMedComments())
						comments.add(note);
				}
			}
		}
		
		// Refresh the screen
		open(comments);
	}

	@Override
	protected void onBtnCloseClick() throws ims.framework.exceptions.PresentationLogicException
	{
		engine.close(DialogResult.OK);		
	}

	
	private void open(TTANoteRefVoCollection comments) throws PresentationLogicException
	{
		populateCommentsToGrid(domain.getTTAComments(comments));
	}


	private void populateCommentsToGrid(TTANoteVoCollection ttaComments)
	{
		form.grdComments().getRows().clear();
		
		if (ttaComments == null)
			return;
		
		for (TTANoteVo comment : ttaComments)
		{
			grdCommentsRow row = form.grdComments().getRows().newRow();
			
			row.setColComment(comment.getTTAComment());
			row.setColSourceOfInformation(comment.getSourceOfInformation());
			row.setColDate(comment.getNoteDate());
			
			row.setValue(comment);
		}
	}

}
