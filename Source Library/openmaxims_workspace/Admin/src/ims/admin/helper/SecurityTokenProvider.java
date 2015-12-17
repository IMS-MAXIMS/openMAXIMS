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

import java.util.ArrayList;

import ims.admin.vo.domain.SecurityTokenVoAssembler;
import ims.core.admin.domain.objects.SecurityToken;
import ims.domain.DomainFactory;
import ims.domain.exceptions.ForeignKeyViolationException;
import ims.domain.impl.DomainImpl;
import ims.framework.interfaces.ISecurityToken;
import ims.framework.interfaces.ISecurityTokenProvider;

public class SecurityTokenProvider extends DomainImpl implements ISecurityTokenProvider
{

	public ISecurityToken getToken(String tokenId) 
	{
        String hql;
		ArrayList markers = new ArrayList();
		ArrayList values = new ArrayList();
        
		hql = " from SecurityToken secToken where tokenID = :tokenId";
		markers.add("tokenId");
		values.add(tokenId);
		
		DomainFactory factory = getDomainFactory();
		ims.admin.vo.SecurityTokenVoCollection voColl = SecurityTokenVoAssembler.createSecurityTokenVoCollectionFromSecurityToken(factory.find(hql, markers, values));
			
		//delete from db		
		if (voColl.size() > 0)
		{
			SecurityToken st = SecurityTokenVoAssembler.extractSecurityToken(factory,voColl.get(0));
			try 
			{
				factory.delete(st);
			}
			catch (ForeignKeyViolationException e)
			{
				//can't really do anything here.
			}
			
			return voColl.get(0);
		}
		
		return null;
	}
}
