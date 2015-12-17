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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5589.25814)
// Copyright (C) 1995-2015 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.vo.lookups;

import ims.framework.cn.data.TreeNode;
import java.util.ArrayList;
import ims.framework.utils.Image;
import ims.framework.utils.Color;

public class PreOpPostOpCare extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public PreOpPostOpCare()
	{
		super();
	}
	public PreOpPostOpCare(int id)
	{
		super(id, "", true);
	}
	public PreOpPostOpCare(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public PreOpPostOpCare(int id, String text, boolean active, PreOpPostOpCare parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public PreOpPostOpCare(int id, String text, boolean active, PreOpPostOpCare parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public PreOpPostOpCare(int id, String text, boolean active, PreOpPostOpCare parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static PreOpPostOpCare buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new PreOpPostOpCare(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (PreOpPostOpCare)super.getParentInstance();
	}
	public PreOpPostOpCare getParent()
	{
		return (PreOpPostOpCare)super.getParentInstance();
	}
	public void setParent(PreOpPostOpCare parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		PreOpPostOpCare[] typedChildren = new PreOpPostOpCare[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (PreOpPostOpCare)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof PreOpPostOpCare)
		{
			super.addChild((PreOpPostOpCare)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof PreOpPostOpCare)
		{
			super.removeChild((PreOpPostOpCare)child);
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
		PreOpPostOpCareCollection result = new PreOpPostOpCareCollection();
		result.add(PRE_OP);
		result.add(POST_OP);
		result.add(PRE_OP_AND_POST_OP);
		return result;
	}
	public static PreOpPostOpCare[] getNegativeInstances()
	{
		PreOpPostOpCare[] instances = new PreOpPostOpCare[3];
		instances[0] = PRE_OP;
		instances[1] = POST_OP;
		instances[2] = PRE_OP_AND_POST_OP;
		return instances;
	}
	public static String[] getNegativeInstanceNames()
	{
		String[] negativeInstances = new String[3];
		negativeInstances[0] = "PRE_OP";
		negativeInstances[1] = "POST_OP";
		negativeInstances[2] = "PRE_OP_AND_POST_OP";
		return negativeInstances;
	}
	public static PreOpPostOpCare getNegativeInstance(String name)
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
	public static PreOpPostOpCare getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		PreOpPostOpCare[] negativeInstances = getNegativeInstances();
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
	public static final int TYPE_ID = 1341053;
	public static final PreOpPostOpCare PRE_OP = new PreOpPostOpCare(-2978, "PreOP", true, null, null, Color.Default);
	public static final PreOpPostOpCare POST_OP = new PreOpPostOpCare(-2979, "Post OP", true, null, null, Color.Default);
	public static final PreOpPostOpCare PRE_OP_AND_POST_OP = new PreOpPostOpCare(-2980, "Pre OP & Post OP", true, null, null, Color.Default);
}