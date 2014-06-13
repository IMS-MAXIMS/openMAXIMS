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

import ims.vo.ValueObjectRef;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class ListByCareContactHelper
{
	ims.domain.DomainFactory factory	= null;

	public ListByCareContactHelper(ims.domain.DomainFactory factory)
	{
		this.factory = factory;
	}

	public Object getVoBasedOnClinicalContact(IValueObjectGetter getter)
	{
		if (getter == null)
			throwRuntimeException("Cannot get Value Object for null " + IValueObjectGetter.class.getName() + "instance");

		if (getter.getValueObjectClass() == null)
			throwRuntimeException("Invalid Value Object class");

		if (getter.getValueObjectRef() == null)
			throwRuntimeException("Cannot get " + getter.getValueObjectClass() + " for null ValueObjectRef");

		if (getter.getAssesmblerClass() == null)
			throwRuntimeException("Invalid Assembler class");

		if (getter.getBOClass() == null)
			throwRuntimeException("Invalid BO class name");

		String fullVoClassName = getter.getValueObjectClass().toString();
		String fullBOClassName = getter.getBOClass().toString();

		String shortVoClassName = fullVoClassName.substring(fullVoClassName.lastIndexOf(".") + 1);
		String shortBoClassName = fullBOClassName.substring(fullBOClassName.lastIndexOf(".") + 1);
		String methodName = "create" + shortVoClassName + "CollectionFrom" + shortBoClassName;

		if (methodSignatureExists(getter.getAssesmblerClass(), methodName) == false)
			throwRuntimeException("Method " + methodName + " is not defined in " + getter.getAssesmblerClass().getName());

		//Write a test to see if the ClinicalContact is in the BO
		//test(shortBoClassName, clinicalContact);
		//test isRIE as well? - when isRIE was adeed
		StringBuffer query = new StringBuffer("from " + shortBoClassName + " as p1_1 where p1_1." + getter.getFieldName() + ".id = :CCID and p1_1.isRIE is null");

		List list = factory.find(query.toString(), "CCID", getter.getValueObjectRef().getBoId());

		if (list == null || list.size() == 0)
			return null;

		java.lang.reflect.Method m = null;
		Object obj = null;
		try
		{
			m = getter.getAssesmblerClass().getMethod(methodName, new Class[]{List.class});
		}
		catch (SecurityException e)
		{
			throwRuntimeException(e.getMessage());
		}
		catch (NoSuchMethodException e)
		{
			throwRuntimeException(e.getMessage());
		}

		try
		{
			obj = m.invoke(null, new Object[]{list});
		}
		catch (IllegalArgumentException e)
		{
			throwRuntimeException(e.getMessage());
		}
		catch (IllegalAccessException e)
		{
			throwRuntimeException(e.getMessage());
		}
		catch (InvocationTargetException e)
		{
			throwRuntimeException(e.getMessage());
		}

		return obj;
	}

	private void throwRuntimeException(String message)
	{
		throw new RuntimeException(message);
	}

	public interface IValueObjectGetter
	{
		ValueObjectRef getValueObjectRef();

		String getFieldName();

		Class getValueObjectClass();

		Class getAssesmblerClass();

		Class getBOClass();
	}

	public boolean methodSignatureExists(Class boClass, String methodName)
	{
		if (boClass == null)
			return false;

		if (methodName == null || methodName.length() == 0)
			return false;

		Method[] methods = boClass.getMethods();
		for (int i = 0; methods != null && i < methods.length; i++)
		{
			if (methods[i].getName().equals(methodName))
				return true;
		}
		// Assert.fail(methodName + " Method Not Implemented in " + boClass);
		return false;
	}
}
