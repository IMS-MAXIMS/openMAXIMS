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
package ims.core.helper;

import ims.RefMan.vo.PatientElectiveListBedInfoVo;
import ims.configuration.gen.ConfigFlag;
import ims.core.vo.lookups.PatIdType;
import ims.framework.controls.DynamicGrid;
import ims.framework.controls.DynamicGridCell;
import ims.framework.controls.DynamicGridColumn;
import ims.framework.controls.DynamicGridRow;
import ims.framework.enumerations.Alignment;
import ims.framework.enumerations.DynamicCellType;
import ims.framework.enumerations.SortMode;
import ims.framework.utils.Color;
import ims.framework.utils.ImagePath;
import ims.framework.utils.PartialDate;
import ims.vo.interfaces.IPendingAdmission;
import ims.vo.interfaces.IPendingAdmissionCollection;

public class AdmitToWardHelper
{
	//-----------------------------------------------------------------------------------------------------
	//	Constants
	//-----------------------------------------------------------------------------------------------------
	
    	public static final int DYNAMIC_GRID_MODE_ED					=	0;
    	public static final int DYNAMIC_GRID_MODE_PATIENT_SEARCH		=	1;
    	public static final int DYNAMIC_GRID_MODE_TCI					=	2;
    	public static final int DYNAMIC_GRID_MODE_WARD_ATTENDERS		=	3;
    	public static final int DYNAMIC_GRID_MODE_PENDING_EMERGENCIES	=	4;
    	
    	
    	public static final int COL_PATIENT_SURNAME			=	0;
    	public static final int COL_PATIENT_FORENAME		=	1;
    	public static final int COL_PATIENT_IDENTIFIER		=	2;
    	public static final int COL_PATIENT_SEX				=	3;
    	public static final int COL_PATIENT_AGE				=	4;
    	public static final int COL_PATIENT_DOB				=	5;
    	public static final int COL_ED_LOS					=	6;
    	public static final int COL_TCI_DATE_TIME			=	7;
    	public static final int COL_TCI_COMMENTS			=	8;
    	public static final int COL_WARD_APPOINTMENT_TIME	=	9;

    	public static final ims.framework.utils.Image TCIComments16 = new ImagePath(102625, "Images/Core/Comment16.png", new Integer(16), new Integer(16));
	
	
	//-----------------------------------------------------------------------------------------------------
	//	UI Helper methods	
	//-----------------------------------------------------------------------------------------------------
	
	public static void InitializeDynamicGrids(DynamicGrid dynamicGrid, int gridMode)
	{
		// Clear dynamic grid
		dynamicGrid.clear();
		// Set dynamic grid to read-only state
		dynamicGrid.setReadOnly(true);


		DynamicGridColumn columnSurname = dynamicGrid.getColumns().newColumn("Surname", COL_PATIENT_SURNAME);
		columnSurname.setHeaderAlignment(Alignment.LEFT);
		columnSurname.setSortMode(SortMode.AUTOMATIC);
		columnSurname.setWidth(120);

		
		DynamicGridColumn columnForename = dynamicGrid.getColumns().newColumn("Forename", COL_PATIENT_FORENAME);
		columnForename.setHeaderAlignment(Alignment.LEFT);
		columnForename.setSortMode(SortMode.AUTOMATIC);
		columnForename.setWidth(120);
		
		
		DynamicGridColumn columnPatID = dynamicGrid.getColumns().newColumn(PatIdType.getNegativeInstance(ConfigFlag.UI.DISPLAY_PATID_TYPE.getValue()).getText(), COL_PATIENT_IDENTIFIER);
		columnPatID.setSortMode(SortMode.AUTOMATIC);
		columnPatID.setWidth(100);
		
		
		DynamicGridColumn columnSex = dynamicGrid.getColumns().newColumn("Sex", COL_PATIENT_SEX);
		columnSex.setSortMode(SortMode.AUTOMATIC);
		columnSex.setWidth(50);

		
		DynamicGridColumn columnAge = dynamicGrid.getColumns().newColumn("Age", COL_PATIENT_AGE);
		columnAge.setSortMode(SortMode.MANUAL);
		columnAge.setWidth(75);
		
		
		DynamicGridColumn columnDoB = dynamicGrid.getColumns().newColumn("DOB", COL_PATIENT_DOB);
		columnDoB.setSortMode(SortMode.MANUAL);
		columnDoB.setWidth(80);
		
		
		switch (gridMode)
		{
			case DYNAMIC_GRID_MODE_ED:
			{
				DynamicGridColumn columnLoS = dynamicGrid.getColumns().newColumn("LOS", COL_ED_LOS);
				columnLoS.setSortMode(SortMode.MANUAL);
				columnLoS.setWidth(80);

				break;
			}
			
			case DYNAMIC_GRID_MODE_TCI:
			{
				DynamicGridColumn columnTCIDate = dynamicGrid.getColumns().newColumn("TCI Date/Time", COL_TCI_DATE_TIME);
				columnTCIDate.setSortMode(SortMode.MANUAL);
				columnTCIDate.setWidth(100);
				
				DynamicGridColumn columnTCIComments = dynamicGrid.getColumns().newColumn("Comments", COL_TCI_COMMENTS);
				columnTCIComments.setSortMode(SortMode.MANUAL);
				columnTCIComments.setWidth(80);
				
				break;
			}
			
			case DYNAMIC_GRID_MODE_WARD_ATTENDERS:
			{
				DynamicGridColumn columnTCIComments = dynamicGrid.getColumns().newColumn("Appointment Time", COL_WARD_APPOINTMENT_TIME);
				columnTCIComments.setSortMode(SortMode.AUTOMATIC);
				columnTCIComments.setWidth(-1);
				
				break;
			}
		}
	}


	public static void PopulateDynamicGrid(DynamicGrid dynamicGrid, int gridMode, IPendingAdmissionCollection pendingAdmissions)
	{
		dynamicGrid.getRows().clear();
		
		if (pendingAdmissions == null)
			return;		
		
		for (int i = 0; i < pendingAdmissions.size(); i++)
		{
			IPendingAdmission pendingAdmission = pendingAdmissions.getIPendingAdmission(i);
			DynamicGridRow row = dynamicGrid.getRows().newRow();

			DynamicGridCell cellSurname = row.getCells().newCell(dynamicGrid.getColumns().getByIdentifier(COL_PATIENT_SURNAME), DynamicCellType.STRING);
			cellSurname.setValue(pendingAdmission.getPatientSurname());
			
			DynamicGridCell cellForename = row.getCells().newCell(dynamicGrid.getColumns().getByIdentifier(COL_PATIENT_FORENAME), DynamicCellType.STRING);
			cellForename.setValue(pendingAdmission.getPatientForename());
			
			if (pendingAdmission.getPatientDod() != null)
			{
				String info = getRIPInfo(pendingAdmission);
				cellSurname.setTooltip(info);
				cellForename.setTooltip(info);				
			}
			
			DynamicGridCell cellIdentifier = row.getCells().newCell(dynamicGrid.getColumns().getByIdentifier(COL_PATIENT_IDENTIFIER), DynamicCellType.STRING);
			if (pendingAdmission.getPatientDisplayIdentifier() != null)
			{
				cellIdentifier.setValue(pendingAdmission.getPatientDisplayIdentifier().getValue());
			}
			
			DynamicGridCell cellSex = row.getCells().newCell(dynamicGrid.getColumns().getByIdentifier(COL_PATIENT_SEX), DynamicCellType.STRING);
			if (pendingAdmission.getPatientSex() != null)
			{
				cellSex.setValue(pendingAdmission.getPatientSex().getText());
			}
			
			DynamicGridCell cellAge = row.getCells().newCell(dynamicGrid.getColumns().getByIdentifier(COL_PATIENT_AGE), DynamicCellType.STRING);
			if (pendingAdmission.getPatientAge() != null)
			{
				cellAge.setValue(pendingAdmission.getPatientAgeText());
			}
			
			DynamicGridCell cellDob = row.getCells().newCell(dynamicGrid.getColumns().getByIdentifier(COL_PATIENT_DOB), DynamicCellType.PARTIALDATE);
			PartialDate dob = pendingAdmission.getPatientDoB();
			if (dob != null)
			{
				cellDob.setValue(dob);
			}


			switch (gridMode)
			{
				case DYNAMIC_GRID_MODE_ED:
				{
					DynamicGridCell cellLengthOfStay = row.getCells().newCell(dynamicGrid.getColumns().getByIdentifier(COL_ED_LOS), DynamicCellType.STRING);
					cellLengthOfStay.setValue(pendingAdmission.getLengthOfStay());

					break;
				}
				
				case DYNAMIC_GRID_MODE_TCI:
				{
					DynamicGridCell cellTCI_DateTime = row.getCells().newCell(dynamicGrid.getColumns().getByIdentifier(COL_TCI_DATE_TIME), DynamicCellType.DATETIME);
					cellTCI_DateTime.setValue(pendingAdmission.getTCIDateTime());
					
					DynamicGridCell cellTCI_Comments = row.getCells().newCell(dynamicGrid.getColumns().getByIdentifier(COL_TCI_COMMENTS), DynamicCellType.IMAGE);
					if (hasAnyComments((PatientElectiveListBedInfoVo) pendingAdmission))
					{
						cellTCI_Comments.setValue(TCIComments16);
						cellTCI_Comments.setTooltip(getCommentsDisplay((PatientElectiveListBedInfoVo) pendingAdmission));
					}
					break;
				}				
				case DYNAMIC_GRID_MODE_WARD_ATTENDERS:
				{
					DynamicGridCell cellAppointmentTime = row.getCells().newCell(dynamicGrid.getColumns().getByIdentifier(COL_WARD_APPOINTMENT_TIME), DynamicCellType.TIME);
					cellAppointmentTime.setValue(pendingAdmission.getWardAttendanceAppointmentTime());
					
					break;
				}
			}

			row.setValue(pendingAdmission);
			//WDEV-21216
			Color rowColor = getColor(row);
			if (!Color.Default.equals(rowColor))
				row.setBackColor(rowColor);
		}
	}
	
	/**--------------------private methods
	//WDEV-21216*/
	private static Color getColor(DynamicGridRow row)
	{		
		Color color = Color.Default;
		if (row != null && row.getValue() instanceof IPendingAdmission)
		{
			if (((IPendingAdmission) row.getValue()).getPatientAssociatedPatient() != null)
				color = ConfigFlag.UI.MERGED_COLOUR.getValue();
			if (((IPendingAdmission) row.getValue()).getPatientDod() != null)
				color = Color.Yellow;
		}
		return color;
	}
	private static String getRIPInfo(IPendingAdmission val)
	{
		StringBuilder sb = new StringBuilder();
		if (val == null || val.getPatientDod() == null)
			return null;
		sb.append("Patient's Date of Death: "  + "<b> " + val.getPatientDod().toString() + "</b>" );
		if (val.getPatientTimeOfDeath() != null)
			sb.append(" at "  + "<b> " + val.getPatientTimeOfDeath().toString() + "</b>" );
		return  sb.toString();
	}
	//WDEV-21216
	private static String getCommentsDisplay(PatientElectiveListBedInfoVo patientElective)
	{
		StringBuilder commmentDisplay = new StringBuilder();
		
		if (patientElective.getCommentsIsNotNull())
			commmentDisplay.append("<b>Elective List Comments:</b> " + patientElective.getComments() + " <br/>");
		if (patientElective.getPreAssessmentOutcomeIsNotNull() && patientElective.getPreAssessmentOutcome().getGeneralCommentsIsNotNull())
		{	
			commmentDisplay.append("<b>Pre-Assessment Comments:</b> " + patientElective.getPreAssessmentOutcome().getGeneralComments() + " <br/>");
		}	
		if (patientElective.getTCIDetailsIsNotNull())
		{
			if (patientElective.getTCIDetails().getCommentsIsNotNull())
				commmentDisplay.append("<b>TCI Booking Comments:</b> " + patientElective.getTCIDetails().getComments() + " <br/>");
			if (patientElective.getTCIDetails().getBedManagerCommentIsNotNull())
				commmentDisplay.append("<b>TCI Bed Manager Comments:</b> " + patientElective.getTCIDetails().getBedManagerComment() + " <br/>");
		}
		
		return commmentDisplay.toString();
	}


	private static boolean hasAnyComments(PatientElectiveListBedInfoVo patientElective)
	{
		if (patientElective == null)
			return false;
		
		return patientElective.getCommentsIsNotNull() || (patientElective.getPreAssessmentOutcomeIsNotNull() && patientElective.getPreAssessmentOutcome().getGeneralComments() != null)|| (patientElective.getTCIDetailsIsNotNull() && (patientElective.getTCIDetails().getCommentsIsNotNull() || patientElective.getTCIDetails().getBedManagerCommentIsNotNull()));
	}

}
