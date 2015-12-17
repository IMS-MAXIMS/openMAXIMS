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
/*
 * Created on 21-Sep-2005
 *
 * Returns an instance of the desired lookup  
 */
package ims.ccosched.Helper;

import ims.dto.Result;
import ims.dto.client.Lkup;
import ims.dto.client.Lkup.LkupRecord;
import ims.framework.utils.Color;
import ims.ccosched.vo.lookups.Requirements;
import ims.ccosched.vo.lookups.Techniques;
import ims.ccosched.vo.lookups.Transport;
import ims.vo.LookupInstVo;
import ims.dto.DTODomain;
public class LookupHelper
{
    private String TRANSPORT_LKP_TYPE = "3202";
    private String TECHNIQUE_LKP_TYPE = "3415";
    private String REQUREMENT_LKP_TYPE = "3406";

    Lkup lookupDto = null;
    String lookup_type = "";
    public LookupHelper(DTODomain domain, String lookup_Type)
    {
       this.lookup_type = lookup_Type;
       lookupDto = (Lkup)domain.getDTOInstance(Lkup.class);
       lookupDto.Filter.clear();
       lookupDto.Filter.Lkup_typ = lookup_Type;

       Result result = lookupDto.list();
       if (result != null)
           lookupDto = null;
    }
    
    //Public mehods
    public Transport getTransport(String lkp_id)
    {
        LookupInstVo lkupRecord = getLookup(lkp_id);
        if(lkupRecord instanceof Transport)
            return (Transport)lkupRecord;

        return null;
    }
    
    public Techniques getTechnique(String lkp_id)
    {
        LookupInstVo lkupRecord = getLookup(lkp_id);
        if(lkupRecord instanceof Techniques)
            return (Techniques)lkupRecord;
        
        return null;
    }
    public Requirements getRequerement(String lkp_id)
    {
        LookupInstVo lkupRecord = getLookup(lkp_id);
        if(lkupRecord instanceof Requirements)
            return (Requirements)lkupRecord;
        
        return null;
    }
     
    //Private Methods
    private LookupInstVo getLookup(String lkp_id)
    {
        LkupRecord lkupRecord = getLookupRecord(lkp_id);
        if(lkupRecord != null)
        {
            int id           = getIntFromString(lkupRecord.Lkup_id);
            String text      = lkupRecord.Lkup_nm;
            boolean active   = lkupRecord.Lkup_stat.equalsIgnoreCase("Y")?true:false;
            int order        = getIntFromString(lkupRecord.Lkup_order);
            if(lookup_type.equals(TRANSPORT_LKP_TYPE))
            {
                Transport parent = getTransport(lkupRecord.Lkup_parent);
                return new Transport(id, text, active, parent, null, Color.Default, order);
            }
            else if(lookup_type.equals(TECHNIQUE_LKP_TYPE))
            {
                Techniques parent = getTechnique(lkupRecord.Lkup_parent);
                return new Techniques(id, text, active, parent, null, Color.Default, order); 
            }
            else if(lookup_type.equals(REQUREMENT_LKP_TYPE))
            {
               Requirements parent = getRequerement(lkupRecord.Lkup_parent);
               return new Requirements(id, text, active, parent, null, Color.Default, order);
            }
            else
                return null;
        }

        return null;
    }
        
    public LkupRecord getLookupRecord(String lkp_id)
    {
        if(lookupDto != null)
        {
            for (int i = 0; i < lookupDto.DataCollection.count(); i++) 
            {
                if(lookupDto.DataCollection.get(i).Lkup_id != null && 
                   lookupDto.DataCollection.get(i).Lkup_id.equals(lkp_id))
                {
                    return lookupDto.DataCollection.get(i);
                }
            }
        }
        return null;
    }
        
    private int getIntFromString(String value)
    {
        if(value != null && value.equals(""))
            return 0;
        try{return Integer.parseInt(value);}catch(NumberFormatException e){}
        return 0;
    }
}
