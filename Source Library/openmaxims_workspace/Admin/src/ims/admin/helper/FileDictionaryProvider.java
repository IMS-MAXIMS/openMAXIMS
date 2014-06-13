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

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import ims.configuration.gen.ConfigFlag;
import ims.domain.impl.DomainImpl;
import ims.framework.interfaces.IDictionaryProvider;

public class FileDictionaryProvider extends DomainImpl implements IDictionaryProvider 
{
	private static final long serialVersionUID = 1L;
	private static List<String> words = null;
	private static String filePath = null;
	private static String dictionaryFileName = "/dictionary.dic";
	
	public FileDictionaryProvider()
	{				
		if (words == null)
		{		
			filePath = ConfigFlag.FW.DICTIONARY_FILE.getValue();
			
			if (filePath == null ||
					filePath == "")
			{				 
				  ClassLoader cloader = Thread.currentThread().getContextClassLoader();
				  if (cloader != null)
				  {
					  String path = cloader.getResource("/").getPath();
					  if (path != null)
					  {
						  filePath = path.substring(0, path.length()-17) + dictionaryFileName;  
					  }					    
				  }
			}

			readFile();
		}
	}


	public boolean addWord(String word) 
	{
		if(isCorrect(word))
			return false;
		
		BufferedWriter fbuf = null;
		
		try
		{ 			
			fbuf = new BufferedWriter(new FileWriter(filePath, true));
			fbuf.newLine();
			fbuf.write(word);
		    fbuf.flush();
		}
		catch (Exception e)
		{
		  throw new RuntimeException(e);
		}
		finally 
		{
			if (fbuf != null)
			try 
			{
				fbuf.close();
			} 
			catch (IOException e) 
			{
				  throw new RuntimeException(e);
			}
		}
		
		words.add(word);
		    
		return true;
	}

	public String getName() 
	{
		return dictionaryFileName;
	}

	public String[] getWords() 
	{
		String[] result = new String[words.size()];
		words.toArray(result);
		return result;
	}

	public boolean isCorrect(String word) 
	{
		return words.indexOf(word) >= 0;
	}

	private void readFile() 
    {	
    	DataInputStream dis = null; 
        
        try 
        { 
           File f = new File(filePath); 
           FileInputStream fis = new FileInputStream(f);
           
           StringBuffer inputBuffer = new StringBuffer();
           byte[] buffer = new byte[10240];
           while (true) 
           {
               int count = fis.read(buffer); 
               if (count <= 0)
               	break;
               
               inputBuffer.append(new String(buffer, 0, count));
           }         
           
           words = split(inputBuffer.toString(), "\r\n");
        } 
        catch (IOException e) 
        {   
        	throw new RuntimeException(e);
        }
        finally 
        { 
           if (dis != null) 
           { 
        	   try 
        	   {
                 dis.close(); 
        	   }
        	   catch (IOException e) 
        	   {
        		   throw new RuntimeException(e);
        	   }
           } 
        } 
     }
	
	private static List<String> split(String input, String delimiter) 
	{
	    StringTokenizer st = new StringTokenizer(input, delimiter);	    
	    int count = st.countTokens();
	    List<String> out = new ArrayList<String>();

	    for (int i = 0; i < count; i++) 
	    {
	      out.add(st.nextToken());
	    }

	    return out;
	}

	public boolean isReadOnly()
	{
		// TODO Auto-generated method stub
		return false;
	}
}
