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
package ims.core.helper;
import ims.core.vo.enums.SelectItemType;
import ims.vo.LookupInstVo;
import ims.vo.interfaces.IGenericItemType;

public class GenericInfoAdapter implements IGenericItemType
{
	LookupInstVo instance;
	
	public GenericInfoAdapter(LookupInstVo instance)
	{
		this.instance = instance;
	}
	public Integer getIGenericItemInfoID() 
	{
		return new Integer(this.instance.getId());
	}
	public String getIGenericItemInfoName() {
		return this.instance.getText();
	}
	public Boolean getIGenericItemInfoIsActive() {
		return new Boolean(this.instance.isActive());
	}
	public  LookupInstVo getInstance()
	{
		return instance;
	}
	public SelectItemType getIGenericItemTypeSelectItemType()
	{
		return SelectItemType.SITE_LOOKUP;
	}
	public int compareTo(Object o)
	{
		if(instance != null)
			return instance.compareTo(o);
		
		return 0;
	}
}
