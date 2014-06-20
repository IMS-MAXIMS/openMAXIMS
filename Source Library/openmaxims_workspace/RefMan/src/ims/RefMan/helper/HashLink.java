/*
 * Created on 26 Nov 2009
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package ims.RefMan.helper;

public class HashLink
{
	private String boName;
	private String fieldName;
	private String fieldNameBool;

	public HashLink()
	{
	}

	public HashLink(String boName, String fieldName, String fieldNameBool)
	{
		super();

		this.boName = boName;
		this.fieldName = fieldName;
		this.fieldNameBool = fieldNameBool;
	}

	public String getBoName()
	{
		return boName;
	}

	public void setBoName(String boName)
	{
		this.boName = boName;
	}

	public String getFieldName()
	{
		return fieldName;
	}

	public void setFieldName(String fieldName)
	{
		this.fieldName = fieldName;
	}

	public String getFieldNameBool()
	{
		return fieldNameBool;
	}

	public void setFieldNameBool(String fieldNameBool)
	{
		this.fieldNameBool = fieldNameBool;
	}

}
