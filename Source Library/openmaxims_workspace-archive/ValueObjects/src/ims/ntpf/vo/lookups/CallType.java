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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.ntpf.vo.lookups;

import ims.framework.cn.data.TreeNode;
import java.util.ArrayList;
import ims.framework.utils.Image;
import ims.framework.utils.Color;

public class CallType extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public CallType()
	{
		super();
	}
	public CallType(int id)
	{
		super(id, "", true);
	}
	public CallType(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public CallType(int id, String text, boolean active, CallType parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public CallType(int id, String text, boolean active, CallType parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public CallType(int id, String text, boolean active, CallType parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static CallType buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new CallType(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (CallType)super.getParentInstance();
	}
	public CallType getParent()
	{
		return (CallType)super.getParentInstance();
	}
	public void setParent(CallType parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		CallType[] typedChildren = new CallType[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (CallType)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof CallType)
		{
			super.addChild((CallType)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof CallType)
		{
			super.removeChild((CallType)child);
		}
		return super.getChildInstances().size();
	}
	public Image getExpandedImage()
	{
		return super.getImage();
	}
	public Image getCollapsedImage()
	{
		return super.getImage();
	}
	public static ims.framework.IItemCollection getNegativeInstancesAsIItemCollection()
	{
		CallTypeCollection result = new CallTypeCollection();
		result.add(GPREFERRAL);
		result.add(PATIENTSELFREFERRAL);
		return result;
	}
	public static CallType[] getNegativeInstances()
	{
		CallType[] instances = new CallType[2];
		instances[0] = GPREFERRAL;
		instances[1] = PATIENTSELFREFERRAL;
		return instances;
	}
	public static String[] getNegativeInstanceNames()
	{
		String[] negativeInstances = new String[2];
		negativeInstances[0] = "GPREFERRAL";
		negativeInstances[1] = "PATIENTSELFREFERRAL";
		return negativeInstances;
	}
	public static CallType getNegativeInstance(String name)
	{
		if(name == null)
			return null;
		String[] negativeInstances = getNegativeInstanceNames();
		for (int i = 0; i < negativeInstances.length; i++)
		{
			if(negativeInstances[i].equals(name))
				return getNegativeInstances()[i];
		}
		return null;
	}
	public static CallType getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		CallType[] negativeInstances = getNegativeInstances();
		for (int i = 0; i < negativeInstances.length; i++)
		{
			if(negativeInstances[i].getID() == id)
				return negativeInstances[i];
		}
		return null;
	}
	public int getTypeId()
	{
		return TYPE_ID;
	}
	public static final int TYPE_ID = 1101049;
	public static final CallType GPREFERRAL = new CallType(-698, "GP Referral", true, null, null, Color.Default);
	public static final CallType PATIENTSELFREFERRAL = new CallType(-699, "Patient Self Referral", true, null, null, Color.Default);
}
