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
 * Created on 26-Apr-2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package ims.clinical.helper;

/**
 * @author vpurdila
 *
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.Properties;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

public class VelocityHelper
{
	private static VelocityEngine engine = null;
	
	public VelocityHelper() throws Exception
	{
		if(engine == null)
			configureVelocity();
	}
	
	private synchronized void configureVelocity() throws Exception
	{
		engine = new VelocityEngine();
		
		Properties props = new Properties();
	    props.setProperty("classpath." + RuntimeConstants.RESOURCE_LOADER + ".class", ClasspathResourceLoader.class.getName());
	    
	    props.setProperty("classpath." + RuntimeConstants.RESOURCE_LOADER + ".class", ClasspathResourceLoader.class.getName());
	    
	    engine.init(props);		
	}

	public synchronized String Generate(String contextName, Object obj, String templateName) throws Exception
	{
        VelocityContext context = new VelocityContext();
        context.put(contextName, obj);

        StringWriter writer = writer = new StringWriter();
        String template = getFileContent(templateName);

        engine.evaluate(context, writer, "", template);
        
        writer.flush();
        writer.close();
        
        return writer.toString();
	}
	
	public String getFileContent(String fileName)
	{
		InputStream is = null;
		
		is = ClassLoader.getSystemResourceAsStream(fileName);
		
		if(is == null)
			is = this.getClass().getResourceAsStream(fileName);
		
		byte[] content = new byte[512];
		int nread = 0;
		StringBuffer sb = new StringBuffer(10000);
		
		try
		{
			while(is.available() > 0)
			{
				nread = is.read(content);
				
				if(nread > 0)
					sb.append(new String(content, 0, nread));
			}
			
			is.close();
		} catch (IOException e2)
		{
			e2.printStackTrace();
		}

		return sb.toString();
	}
}
