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

import java.util.List;

import ims.admin.vo.domain.AppFormVoAssembler;
import ims.admin.vo.domain.AppImageVoAssembler;
import ims.core.configuration.domain.objects.AppForm;
import ims.core.configuration.domain.objects.AppImage;
import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.impl.DomainImpl;
import ims.framework.interfaces.IAppForm;
import ims.framework.interfaces.IImageProvider;
import ims.framework.utils.Image;

public class ImageProvider extends DomainImpl implements IImageProvider
{

	public IAppForm getForm(int formId)
	{
		DomainFactory factory = getDomainFactory();
		AppForm domForm = (AppForm)factory.getDomainObject(AppForm.class, formId);
		return AppFormVoAssembler.create(domForm);
	}

	public Image[] getAllImages()
	{
		DomainFactory factory = getDomainFactory();
		List l = factory.find("from AppImage", 5000);
		return AppImageVoAssembler.createAppImageVoCollectionFromAppImage(l).toIAppImageArray();
	}

	public Image getImage(int imageId)
	{
		DomainFactory factory = getDomainFactory();
		AppImage domImage = (AppImage)factory.getDomainObject(AppImage.class, imageId);
		return AppImageVoAssembler.create(domImage);
	}

	public void setImageWidthHeight(Image img, int width, int height)
	{
		DomainFactory factory = getDomainFactory();
		AppImage domImage = (AppImage)factory.getDomainObject(AppImage.class, img.getImageId());
		domImage.setHeight(new Integer(height));
		domImage.setWidth(new Integer(width));
		try
		{
			factory.save(domImage);
		}
		catch (StaleObjectException e)
		{
			throw new DomainRuntimeException(e);
		}
		
	}

}
