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

import ims.framework.interfaces.ITaxonomyLoadActions;

import java.io.IOException;

public abstract class TaxonomyLoader {

	ITaxonomyLoadActions loadActions;
	int recordsInserted;
	int recordsUpdated;
		
	public void load(String filename,String definitionFile,StringBuffer delimeter,StringBuffer qualifer) throws IOException
	{
		loadActions.load(filename,definitionFile,delimeter,qualifer);
	}
	
	public String[] getErrors()
	{
		return loadActions.getErrors();
	}	
	
	public boolean verify(String filename,String definitionFile)
	{
		return loadActions.verify(filename, definitionFile);
	}

	public int getRecordsInserted() {
		return recordsInserted;
	}

	public void setRecordsInserted(int recordsInserted) {
		this.recordsInserted = recordsInserted;
	}

	public int getRecordsUpdated() {
		return recordsUpdated;
	}

	public void setRecordsUpdated(int recordsUpdated) {
		this.recordsUpdated = recordsUpdated;
	}
	
}
