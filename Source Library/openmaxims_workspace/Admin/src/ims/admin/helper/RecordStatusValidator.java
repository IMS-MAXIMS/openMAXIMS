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
/*
 * Created on 23 Oct 2007
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package ims.admin.helper;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import ims.core.vo.lookups.LookupHelper;
import ims.core.vo.lookups.PreActiveActiveInactiveStatus;
import ims.domain.DomainFactory;
import ims.domain.DomainObject;
import ims.domain.IDomainGetter;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.lookups.LookupInstance;
import ims.domain.lookups.LookupService;
import ims.framework.RecordStatus;
import ims.framework.exceptions.CodingRuntimeException;
import ims.framework.interfaces.IRecordStatusTree;
/**
 * 
 * @author dlaffan
 *
 * @description - This class is used to validate parent child relationships with PreActive / Active /Inactive instances of a lookup type 
 * used for status in both the parent and child
 * 
 * @conditions - Each parent and child vo must implement the built-in interface IRecordStatusTree
 * and the field must be called status in the corresponding business objects - if the link to the child collection is not made at the bo level 
 * the parent vo must have a method to set the children (a collection implementing the IRecordStatusTree interface)
 * 
 * @usage - Simply Instantiate this class in your impl and call validate as follows :
 * 			RecordStatusValidator helper = new RecordStatusValidator(factory, getLookupService());
 *			helper.validate(voParent);
 *			
 *			notes : your impl method should be marked as throws DomainInterfaceException which is then shown in the UI
 *					if any change has been made the domain objects before this is called there may be an impact regarding previous status
 */
public class RecordStatusValidator
{
	private List<String> errors = null;
	private DomainFactory thisfactory;
	private LookupService thisLookupService;

	
	public RecordStatusValidator(DomainFactory factory, LookupService lookupService)
	{
		if(factory == null)
			throw new CodingRuntimeException("factory is null in RecordStatusValidator constructor");
		if(lookupService == null)
			throw new CodingRuntimeException("lookupService is null in RecordStatusValidator constructor");
		
		errors = new ArrayList<String>();
		thisfactory = factory;
		thisLookupService = lookupService;
	}
	
	public void validate(IRecordStatusTree record) throws DomainInterfaceException
	{
		if(record == null)
			throw new CodingRuntimeException("record is null in method RecordStatusValidator.validate");
		
		if(record.getIRecordStatusTreeStatus() == null)
			throw new CodingRuntimeException("vo not validated for mandatory fields and as a result status is not set in method RecordStatusValidator.validate");
		
		PreActiveActiveInactiveStatus previousStatus = null;
		
		if(record.isNew())
		{
			if(record.getIRecordStatusTreeStatus().equals(RecordStatus.INACTIVE))
				errors.add("Cannot insert inactive " + record.getDomainObjectName());
		}
		else
			previousStatus = getPreviousStatus(record);
		
		if(record.getIRecordStatusTreeStatus().equals(RecordStatus.PREACTIVE))
		{
			if(previousStatus != null && previousStatus.equals(PreActiveActiveInactiveStatus.ACTIVE))
				errors.add("Cannot change status to PreActive from Active in " + record.getDomainObjectName() + " record");
			if(anyNewChildrenAreInactive(record))
			{
				errors.add("Cannot add inactive " + record.getChildren()[0].getDomainObjectName() + " to a preactive " + record.getDomainObjectName());
			}
		}
		else if(record.getIRecordStatusTreeStatus().equals(RecordStatus.ACTIVE))
		{
			if(previousStatus != null && previousStatus.equals(PreActiveActiveInactiveStatus.INACTIVE))
				errors.add("cannot change status to Active from Inactive in " + record.getDomainObjectName() + " record");
			if(anyNewChildrenAreInactiveOrPreActive(record))
			{
				errors.add("Cannot add inactive or preactive " + record.getChildren()[0].getDomainObjectName() + " to an active " + record.getDomainObjectName());
			}
		}
		
		if(record.getChildren() != null)
		{
			for(int i=0;i<record.getChildren().length;i++)
			{
				if(record.getChildren()[i] != null)
					validate(record.getChildren()[i]);
				else
					throw new CodingRuntimeException("child record is null in RecordStatusValidator.validate");
			}
		}
		
		String errorMessage = "";
		if(errors.size() > 0)
		{
			for(int i=0;i<errors.size();i++)
			{
				if(!errorMessage.contains(errors.get(i)))
					errorMessage += errors.get(i) + "\n";
			}		
		}
		
		if(errorMessage.length() > 0)
			throw new DomainInterfaceException(errorMessage);
	}

	private PreActiveActiveInactiveStatus getPreviousStatus(IRecordStatusTree record)
	{
		if(record.isNew())
			return null;
		
		DomainObject doObject =  thisfactory.getDomainObject((IDomainGetter) record);
		Method statusMethod;
		Object status = null;
		try
		{
			statusMethod = doObject.getClass().getMethod(record.getStatusMethodName(), (Class[])null);
			try
			{
				status = statusMethod.invoke(doObject, (Object[])null);				
			}
			catch (IllegalArgumentException e)
			{
				throw new CodingRuntimeException(e.getMessage(), e);
			}
			catch (IllegalAccessException e)
			{
				throw new CodingRuntimeException(e.getMessage(), e);
			}
			catch (InvocationTargetException e)
			{
				throw new CodingRuntimeException(e.getMessage(), e);
			}
		}
		catch (NoSuchMethodException e)
		{
			throw new CodingRuntimeException("No method called getStatus present");
		}
		
		LookupInstance inst = (LookupInstance) status;
		return LookupHelper.getPreActiveActiveInactiveStatusInstance(thisLookupService, inst.getId());
	}

	private boolean anyNewChildrenAreInactiveOrPreActive(IRecordStatusTree record)
	{
		boolean childrenInactiveOrPreActive = false;
		
		if(record.getChildren() != null)
		{
			for(int i=0;i<record.getChildren().length;i++)
			{
				if(record.getChildren()[i].isNew())
				{
					if(record.getChildren()[i].getIRecordStatusTreeStatus() != null && (record.getChildren()[i].getIRecordStatusTreeStatus().equals(RecordStatus.INACTIVE) || record.getChildren()[i].getIRecordStatusTreeStatus().equals(RecordStatus.PREACTIVE)))
					{
						childrenInactiveOrPreActive = true;
						break;
					}
				}

			}
		}
		return childrenInactiveOrPreActive;	
	}

	private boolean anyNewChildrenAreInactive(IRecordStatusTree record)
	{
		boolean childrenInactive = false;
		
		if(record.getChildren() != null)
		{
			for(int i=0;i<record.getChildren().length;i++)
			{
				if(record.getChildren()[i].isNew())
				{
					if(record.getChildren()[i].getIRecordStatusTreeStatus() != null && record.getChildren()[i].getIRecordStatusTreeStatus().equals(RecordStatus.INACTIVE))
					{
						childrenInactive = true;
						break;
					}
				}
			}
		}
		return childrenInactive;
	}
}
