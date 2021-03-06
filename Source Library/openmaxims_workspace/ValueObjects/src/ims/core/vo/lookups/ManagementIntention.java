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

package ims.core.vo.lookups;

import ims.framework.cn.data.TreeNode;
import java.util.ArrayList;
import ims.framework.utils.Image;
import ims.framework.utils.Color;

public class ManagementIntention extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public ManagementIntention()
	{
		super();
	}
	public ManagementIntention(int id)
	{
		super(id, "", true);
	}
	public ManagementIntention(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public ManagementIntention(int id, String text, boolean active, ManagementIntention parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public ManagementIntention(int id, String text, boolean active, ManagementIntention parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public ManagementIntention(int id, String text, boolean active, ManagementIntention parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static ManagementIntention buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new ManagementIntention(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (ManagementIntention)super.getParentInstance();
	}
	public ManagementIntention getParent()
	{
		return (ManagementIntention)super.getParentInstance();
	}
	public void setParent(ManagementIntention parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		ManagementIntention[] typedChildren = new ManagementIntention[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (ManagementIntention)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof ManagementIntention)
		{
			super.addChild((ManagementIntention)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof ManagementIntention)
		{
			super.removeChild((ManagementIntention)child);
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
		ManagementIntentionCollection result = new ManagementIntentionCollection();
		result.add(DAY_CASE);
		result.add(OVERNIGHT);
		result.add(TYPE3_SEQUENCEATLEASTONENIGHT);
		result.add(TYPE4_SEQUENCENOOVERNIGHSTAY);
		result.add(TYPE5_SEQUENCEOVERNIGHTANDHOME);
		return result;
	}
	public static ManagementIntention[] getNegativeInstances()
	{
		ManagementIntention[] instances = new ManagementIntention[5];
		instances[0] = DAY_CASE;
		instances[1] = OVERNIGHT;
		instances[2] = TYPE3_SEQUENCEATLEASTONENIGHT;
		instances[3] = TYPE4_SEQUENCENOOVERNIGHSTAY;
		instances[4] = TYPE5_SEQUENCEOVERNIGHTANDHOME;
		return instances;
	}
	public static String[] getNegativeInstanceNames()
	{
		String[] negativeInstances = new String[5];
		negativeInstances[0] = "DAY_CASE";
		negativeInstances[1] = "OVERNIGHT";
		negativeInstances[2] = "TYPE3_SEQUENCEATLEASTONENIGHT";
		negativeInstances[3] = "TYPE4_SEQUENCENOOVERNIGHSTAY";
		negativeInstances[4] = "TYPE5_SEQUENCEOVERNIGHTANDHOME";
		return negativeInstances;
	}
	public static ManagementIntention getNegativeInstance(String name)
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
	public static ManagementIntention getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		ManagementIntention[] negativeInstances = getNegativeInstances();
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
	public static final int TYPE_ID = 1021255;
	public static final ManagementIntention DAY_CASE = new ManagementIntention(-1789, "Day Case", true, null, null, Color.Default);
	public static final ManagementIntention OVERNIGHT = new ManagementIntention(-1790, "Overnight", true, null, null, Color.Default);
	public static final ManagementIntention TYPE3_SEQUENCEATLEASTONENIGHT = new ManagementIntention(-2617, "Patient to be admitted for a planned sequence of admissions each involving at least one overnight stay", true, null, null, Color.Default);
	public static final ManagementIntention TYPE4_SEQUENCENOOVERNIGHSTAY = new ManagementIntention(-2618, "Patient to be admitted for a planned sequence of admissions which do not involve an overnight stay", true, null, null, Color.Default);
	public static final ManagementIntention TYPE5_SEQUENCEOVERNIGHTANDHOME = new ManagementIntention(-2619, "Patient to be admitted regularly for a planned sequence of nights who returns home for the remainder of the 24 hour period", true, null, null, Color.Default);
}
