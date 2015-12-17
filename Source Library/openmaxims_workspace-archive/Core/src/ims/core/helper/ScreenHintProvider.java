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

import ims.core.generic.domain.objects.ScreenHint;
import ims.core.vo.domain.ScreenHintVoAssembler;
import ims.domain.DomainFactory;
import ims.domain.impl.DomainImpl;
import ims.framework.interfaces.IAppForm;
import ims.framework.interfaces.IScreenHint;
import ims.framework.interfaces.IScreenHintProvider;

import java.util.ArrayList;
import java.util.List;

public class ScreenHintProvider extends DomainImpl implements IScreenHintProvider
{
	private static final long serialVersionUID = 1L;

	public IScreenHint[] getHintsForForm(IAppForm form) 
	{
		DomainFactory factory = getDomainFactory();				
		 
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Integer> values = new ArrayList<Integer>();
		
		StringBuffer hql = new StringBuffer(" from ScreenHint as sh where sh.formId = :formID");			
		names.add("formID");				
		values.add(form.getFormId());
		
		List hints = factory.find(hql.toString(),names,values);
		IScreenHint[] hintsList = new IScreenHint[hints.size()]	;	
		if (hints.size() > 0)
		{
			for (int i = 0; i < hints.size(); i++)
			{
				if ( hints.get(i) instanceof IScreenHint)
				{
					hintsList[i] = (IScreenHint) hints.get(i);
				}
			}
			
			return hintsList;
		}
		
		return null;
	}

	public IScreenHint getHint(String hintId) 
	{
		return ScreenHintVoAssembler.create(ScreenHint.getScreenHintFromImsId(getDomainFactory(),hintId));
	}
}
