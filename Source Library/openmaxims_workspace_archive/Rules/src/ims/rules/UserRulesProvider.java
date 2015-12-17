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
package ims.rules;

import ims.core.admin.domain.objects.BusinessRule;
import ims.domain.DomainFactory;
import ims.domain.impl.DomainImpl;
import ims.rules.interfaces.IRule;
import ims.rules.interfaces.IRulesProvider;
import ims.rules.utils.RuleXmlSerialization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserRulesProvider extends DomainImpl implements IRulesProvider 
{
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	public IRule[] getUserRules() 
	{				
		DomainFactory factory = getDomainFactory();
		StringBuffer hql = new StringBuffer(" from BusinessRule br where br.active = 1");
		List lst = factory.find(hql.toString());
		 
		if (lst != null)
		{
			List<IRule> rules = new ArrayList<IRule>();
			
			Iterator<Object> i = lst.iterator();
			
			while(i.hasNext())
			{
				BusinessRule dbRule = (BusinessRule)i.next();
				
				if (dbRule != null)
				{
					String xmlContent = dbRule.getXmlContent();
					if (xmlContent != null)
					{
						IRule rule;
						try 
						{
							rule = RuleXmlSerialization.deserializeFromXml(xmlContent, ims.rules.helper.Entities.getInstance());							
							rules.add(rule);
						} 
						catch (Exception e) 
						{
							// Nothing else to do so far, I will throw a runtime exception later...
							e.printStackTrace();
						} 
					}
				}
			}		
			
			IRule[] collection = new IRule[rules.size()];
			rules.toArray(collection);
			return collection;						
		}
				
		return null;	
	}
}
