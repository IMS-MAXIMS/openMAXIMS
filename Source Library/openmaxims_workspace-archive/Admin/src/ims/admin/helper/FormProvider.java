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

import java.util.Iterator;
import java.util.List;

import ims.admin.vo.domain.AppFormVoAssembler;
import ims.core.configuration.domain.objects.AppForm;
import ims.core.configuration.domain.objects.AppFormLookup;
import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.impl.DomainImpl;
import ims.domain.lookups.LookupInstance;
import ims.framework.interfaces.IAppForm;
import ims.framework.interfaces.IFormProvider;
import ims.framework.utils.Color;
import ims.framework.utils.Image;
import ims.framework.utils.ImagePath;
import ims.vo.LookupInstVo;

public class FormProvider extends DomainImpl implements IFormProvider
{

	public IAppForm getForm(int formId)
	{
		DomainFactory factory = getDomainFactory();
		AppForm domForm = (AppForm)factory.getDomainObject(AppForm.class, formId);
		return AppFormVoAssembler.create(domForm);
	}

	public IAppForm[] getAllForms()
	{
		DomainFactory factory = getDomainFactory();
		List l = factory.find("from AppForm", 5000);
		return AppFormVoAssembler.createAppFormVoCollectionFromAppForm(l).toIAppFormArray();
	}

	public LookupInstVo getDefaultLookupInstance(int formId, int lookupTypeId, Class lookupClass)
	{
		LookupInstance lookupInst = null;
		DomainFactory factory = getDomainFactory();
		AppForm domForm = (AppForm)factory.getDomainObject(AppForm.class, formId);

		List lookupTypes = domForm.getLookups();
		for (Iterator iter = lookupTypes.iterator(); iter.hasNext();)
		{
			AppFormLookup element = (AppFormLookup) iter.next();
			if (element != null && element.getLookupType().getId() == lookupTypeId)
			{
				lookupInst = element.getDefaultInstance();
			}
		}
		
		if (lookupInst == null)
			return null;
		
		return createLookupInstance(lookupInst, lookupClass);
	}

	
	private LookupInstVo createLookupInstance(LookupInstance instance, Class instanceClass)
	{
		if (instance == null)
			return null;
		
		if (instanceClass == null) 
			instanceClass = LookupInstVo.class;
		
		Object voInstance = null;
		ims.domain.lookups.LookupInstance doParent = instance.getParent();
		Object voParent = null;
		if (doParent != null)
		{
			voParent = createLookupInstance(doParent, instanceClass);
		}
		Class[] params = {Integer.TYPE, String.class, Boolean.TYPE, instanceClass, Image.class, Color.class, Integer.TYPE};
		try
		{
			java.lang.reflect.Constructor ctor = instanceClass.getConstructor(params);

			Image img = null;
			if (instance.getImage() != null)
			{
				img = new ImagePath(instance.getImage().getImageId(), instance.getImage().getImagePath());
			}
			Color color = instance.getColor();
			if (color != null)
			{
				color.getValue();				
			}
			Object[] args = {new Integer(instance.getId()), instance.getText(), new Boolean(instance.isActive()), voParent, img, color, new Integer(instance.getOrder())};
			voInstance = ctor.newInstance(args);
		}
		catch (Exception e)
		{
			throw new DomainRuntimeException(e);
		}
		return (LookupInstVo) voInstance;
	}
}
