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
package ims.core.helper;

import java.util.HashMap;
import java.util.Iterator;

public class ExcludedKeywords
{
	private static final HashMap excludedWords = new HashMap();
	
	static
	{
		excludedWords.put("ABOUT","ABOUT"); 
		excludedWords.put("ALONGSIDE","ALONGSIDE"); 
		excludedWords.put("AN","AN"); 
		excludedWords.put("AND","AND"); 
		excludedWords.put("ANYTHING","ANYTHING"); 
		excludedWords.put("AROUND","AROUND"); 
		excludedWords.put("AS","AS"); 
		excludedWords.put("AT","AT"); 
		excludedWords.put("BECAUSE","BECAUSE"); 
		excludedWords.put("BEFORE","BEFORE"); 
		excludedWords.put("BEING","BEING"); 
		excludedWords.put("BOTH","BOTH"); 
		excludedWords.put("BY","BY"); 
		excludedWords.put("CANNOT","CANNOT"); 
		excludedWords.put("CHRONICALLY","CHRONICALLY"); 
		excludedWords.put("CONSISTS","CONSISTS"); 
		excludedWords.put("COVERED","COVERED"); 
		excludedWords.put("DOES","DOES"); 
		excludedWords.put("DURING","DURING"); 
		excludedWords.put("EVERY","EVERY"); 
		excludedWords.put("FINDS","FINDS"); 
		excludedWords.put("FOR","FOR"); 
		excludedWords.put("FROM","FROM"); 
		excludedWords.put("IN","IN"); 
		excludedWords.put("INSTEAD","INSTEAD"); 
		excludedWords.put("INTO","INTO"); 
		excludedWords.put("MORE","MORE"); 
		excludedWords.put("MUST","MUST"); 
		excludedWords.put("NO","NO"); 
		excludedWords.put("NOT","NOT"); 
		excludedWords.put("OF","OF"); 
		excludedWords.put("ON","ON"); 
		excludedWords.put("ONLY","ONLY"); 
		excludedWords.put("OR","OR"); 
		excludedWords.put("PROPERLY","PROPERLY"); 
		excludedWords.put("SIDE","SIDE"); 
		excludedWords.put("SIDED","SIDED"); 
		excludedWords.put("SOME","SOME"); 
		excludedWords.put("SOMETHING","SOMETHING"); 
		excludedWords.put("SPECIFIC","SPECIFIC"); 
		excludedWords.put("THAN","THAN"); 
		excludedWords.put("THAT","THAT"); 
		excludedWords.put("THE","THE"); 
		excludedWords.put("THINGS","THINGS"); 
		excludedWords.put("THIS","THIS"); 
		excludedWords.put("THROUGHOUT","THROUGHOUT"); 
		excludedWords.put("TO","TO"); 
		excludedWords.put("UP","UP"); 
		excludedWords.put("USING","USING"); 
		excludedWords.put("USUALLY","USUALLY"); 
		excludedWords.put("WHEN","WHEN"); 
		excludedWords.put("WHILE","WHILE"); 
		excludedWords.put("WITHOUT","WITHOUT"); 
	}
	
	public static boolean isExcluded(String keyword)
	{
		return (excludedWords.get(keyword) != null);
	}
	
	public static String[] getExcludedKeywords()
	{
		String[] ret = new String[excludedWords.size()];
		
		Iterator iter = excludedWords.values().iterator();
		int i = 0;
		while (iter.hasNext())
		{
			ret[i] = (String)iter.next();
			i++;
		}
		return ret;
	}

	public static String convertVal(String val) 
	{
		if (val == null) return "";
		if (val.length() == 0) return "";
		if (val.length() == 1)
		{
			if (val.equals("#")) return "FRACTURE";
			
			char valChar = val.charAt(0);
			if (Character.isDigit(valChar))
			{
				switch (Character.getNumericValue(valChar))
				{
				case 1: return "FIRST";
				case 2: return "SECOND";
				case 3: return "THIRD";
				case 4: return "FOURTH";
				case 5: return "FIFTH";
				case 6: return "SIXTH";
				case 7: return "SEVENTH";
				case 8: return "EIGHTH";
				case 9: return "NINTH";
				default:
				}
			}			
		}
		return val;
	}

}
