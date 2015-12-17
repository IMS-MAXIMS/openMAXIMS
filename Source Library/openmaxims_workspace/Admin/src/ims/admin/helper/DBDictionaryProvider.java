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

import ims.admin.vo.GlobalDictionaryWordVoCollection;
import ims.admin.vo.domain.AppFormVoAssembler;
import ims.admin.vo.domain.GlobalDictionaryWordVoAssembler;
import ims.configuration.gen.ConfigFlag;
import ims.core.admin.domain.objects.GlobalDictionaryWord;
import ims.domain.DomainFactory;
import ims.domain.impl.DomainImpl;
import ims.framework.interfaces.IAppForm;
import ims.framework.interfaces.IDictionaryProvider;

public class DBDictionaryProvider extends DomainImpl implements IDictionaryProvider 
{
	private static final long serialVersionUID = 1L;
	private static List<String> words = null;
	private static String filePath = null;
	
	public DBDictionaryProvider()
	{
		
	}

	public boolean addWord(String word) 
	{
		return false;
	}

	public String getName() 
	{
		return null;
	}
	
	public String[] getWords() 
	{
		readDataBase();
		String[] result = new String[words.size()];
		words.toArray(result);
		return result;
	}
	
	

	public boolean isCorrect(String word) 
	{
		return words.indexOf(word) >= 0;
	}

	private void readDataBase() 
    {
		DomainFactory factory = getDomainFactory();
		List<GlobalDictionaryWord> l = factory.find("from GlobalDictionaryWord");
	
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
