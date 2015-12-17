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

import ims.configuration.gen.ConfigFlag;
import ims.core.generic.domain.objects.Keyword;
import ims.core.vo.TaxonomyMapCollection;
import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainInterfaceException;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
public class Keywords
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
		//JME: Pared the last char to bring it down to 10 chars
		excludedWords.put("CHRONICALL","CHRONICALL"); 
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
		
		//IMS Added excluded words over SNOMED
		excludedWords.put("IS","IS"); 
		excludedWords.put("A","A"); 
		excludedWords.put("WITH","WITH"); 
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

	public static String fixKeyword(String val) 
	{
		return fixKeyword(val, 10);
	}

	public static String fixKeyword(String val, int length) 
	{
		if (val == null) return "";
		if (val.length() == 0) return "";

		val = val.trim().toUpperCase();
		if (val.length() > length)
			val = val.substring(0,length);			

		val = removeUnwantedChars(val);
		
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
	
	private static String removeUnwantedChars(String val)
	{
		String ret = val;

		ret = ret.replaceAll("!", "");
		ret = ret.replaceAll("\"", "");
		ret = ret.replaceAll("£", "");
		ret = ret.replaceAll("\\$", "");
		ret = ret.replaceAll("%", "");
		ret = ret.replaceAll("\\^", "");

		//ret = ret.replaceAll("&", "");
		while (ret.startsWith("&"))
			ret = ret.substring(1);
		while (ret.endsWith("&"))
			ret = ret.substring(0, ret.length() - 1);

		ret = ret.replaceAll("\\*", "");
		ret = ret.replaceAll("\\(", "");
		ret = ret.replaceAll("\\)", "");

		//ret = ret.replaceAll("-", "");
		while (ret.startsWith("-"))
			ret = ret.substring(1);
		while (ret.endsWith("-"))
			ret = ret.substring(0, ret.length() - 1);
		
		ret = ret.replaceAll("_", "");
		ret = ret.replaceAll("=", "");
		ret = ret.replaceAll("\\+", "");
		ret = ret.replaceAll("\\{", "");
		ret = ret.replaceAll("\\[", "");
		ret = ret.replaceAll("}", "");
		ret = ret.replaceAll("]", "");
		ret = ret.replaceAll(":", "");
		ret = ret.replaceAll(";", "");
		ret = ret.replaceAll("'", "");
		ret = ret.replaceAll("@", "");		
		ret = ret.replaceAll("~", "");
		ret = ret.replaceAll("\\|", "");
		ret = ret.replaceAll("\\\\", "");
		ret = ret.replaceAll("<", "");
		ret = ret.replaceAll(",", "");
		ret = ret.replaceAll(">", "");
		ret = ret.replaceAll("\\.", "");
		ret = ret.replaceAll("/", "");		
		ret = ret.replaceAll("\\?", "");
		
		return ret;
	}
	
	public static String[] generateKeywords(String name)
	{
    	StringTokenizer st = new StringTokenizer(name, " ,.;:/");
    	ArrayList keyws = new ArrayList();    	
    	while (st.hasMoreTokens())
    	{
    		String val = Keywords.fixKeyword(st.nextToken());
    		if (val.length() < 2 || Keywords.isExcluded(val))
    			continue;  
    		if (keyws.indexOf(val) < 0)
    			keyws.add(val);    		
    	}
    	String[] ret = new String[keyws.size()];
    	keyws.toArray(ret);
    	return ret;
	}

	public static List setupKeyWords(List l, String name)
	{
	   	if (l == null) 
	   		l = new ArrayList();
	   	

	   	Keyword keyword;
    	String[] keyws = generateKeywords(name);
    	for (int i = 0; i < keyws.length; i++)
    	{
    		keyword = new Keyword();
    		keyword.setKeyword(keyws[i]);  
    		l.add(keyword);
    	}


    	String val;
    	//Don't overwrite existing keywords. 
    	if (l.size() > 0)
    	{
    		for (int i = 0; i < l.size(); i++)
    		{
    			keyword = (Keyword)l.get(i);
    			val = Keywords.fixKeyword(keyword.getKeyword());
        		if (val.length() < 2 || Keywords.isExcluded(val) || isDuplicated(keyword, l))
        			l.remove(i);
        		else
        			keyword.setKeyword(val);    			
    		}    		
    	}
    	
    	return l;
 	}
	
	
	private static boolean isDuplicated(Keyword val, List l)
	{
		if (val == null || l == null)
			return false;
		
		int firstIndex = l.indexOf(val);
		if (firstIndex < 0)
			return false;
		
		for (int i = 0; i < l.size(); i++)
		{
			if (l.get(i).equals(val) && i != firstIndex)
			{
				return true;				
			}
		}
		return false;
	}

	public static List getIntersectionList(List primaryList, List secondList)
	{
		List ret = new ArrayList();
		for (int i = 0; i < primaryList.size(); i++)
		{
			if (secondList.indexOf(primaryList.get(i)) != -1)
			{
				ret.add(primaryList.get(i));
			}
		}
		return ret;
	}

	public static List searchByKeywords(DomainFactory factory, String filter, String hql, ArrayList names, ArrayList values) throws DomainInterfaceException
	{
		List retList;
		
		int cfgAmount = (ConfigFlag.DOM.CLINICAL_ADMIN_SEARCH_MAX_SIZE.getValue());
		if (filter == null)
		{
			return factory.find(hql.toString(), names, values, cfgAmount);
		}
		
		StringTokenizer st = new StringTokenizer(filter.trim().toUpperCase(), " ,.;:/");
		if (st.countTokens() == 0)
		{
			return factory.find(hql.toString(), names, values, cfgAmount);
		}
		
		String val = Keywords.fixKeyword(st.nextToken());		
		while ((val == null || val.length() == 0 || Keywords.isExcluded(val)) && st.hasMoreTokens())
		{
			val = Keywords.fixKeyword(st.nextToken());
		}
		
		//wdev-1412 Search against an excluded word.
		if (Keywords.isExcluded(val))
			throw new DomainInterfaceException(val + " is an excluded keyword term.");
		
		if (val == null || val.length() == 0) 
		{
			return factory.find(hql.toString(), names, values, cfgAmount);
		}
		
		String clause = " where ";
		if (names.size() > 0)
			clause = " and ";
		
		 
    	hql += (clause + " kw.keyword like :keyword " );
    	names.add("keyword");
    	values.add(val + "%");
		
		retList = factory.find(hql, names, values, 1000);		
		List newList = null;
		while (st.hasMoreTokens())
		{
			val = Keywords.fixKeyword(st.nextToken());
			if (val.length() < 2 || Keywords.isExcluded(val))
				continue;
			
			if (values.size() > 0)
				values.set(values.size()-1, val + "%");
			
			newList = factory.find(hql.toString(), names, values, 1000);
			retList = Keywords.getIntersectionList(retList, newList);				
		}
		//JME: 20060921: Needed as many of the find calls used to create the final intersection list may have exceeded the max size
		factory.getDomainSession().clearMessages();
		return retList;
	}
	
	public static String checkDuplicateTaxonomy(DomainFactory factory, Object cciObject, String mapFieldName, TaxonomyMapCollection coll, String methodToCall)
	{
		if(coll == null || coll.size() == 0)
			return null;
		
		String hqlStart =  " select cci from " + cciObject.getClass().getName() + " as cci join cci." + mapFieldName + " as map where map.taxonomyName  = ";
		String hqlEnd =  " and map.taxonomyCode =  '";
		
		List l = null;
		for(int i=0; i < coll.size(); i++)
		{
			String fullHql = hqlStart + coll.get(i).getTaxonomyName().getId() + hqlEnd + coll.get(i).getTaxonomyCode() + "'";
			l = factory.find(fullHql);
			if(l != null && l.size() > 0 && l.indexOf(cciObject) == -1)
			{
				String name;
				try
				{
					Method m = cciObject.getClass().getMethod(methodToCall, (Class[])null);
					Object o = m.invoke(l.get(0), (Object[])null);
					name = (o==null) ? "NULL NAME" : o.toString();
				}
				catch (Exception e)
				{
					name = "Exception occurred trying to find name. " + e.getMessage();
					e.printStackTrace();
				}
				String dupMessage = "Item named '" + name + "' already has a " + coll.get(i).getTaxonomyName().getText() + " mapping with code = " + coll.get(i).getTaxonomyCode();
				return dupMessage;
			}
		}
		return null;		
	}
	
	public static String checkDuplicateTaxonomy(DomainFactory factory, Object cciObject, TaxonomyMapCollection coll, String methodToCall)
	{
		return checkDuplicateTaxonomy(factory, cciObject, "taxonomyMap", coll, methodToCall);
	}
}
