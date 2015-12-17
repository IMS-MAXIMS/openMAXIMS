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

import java.util.ArrayList;
import java.util.List;

import ims.core.configuration.domain.objects.Printer;
import ims.domain.DomainFactory;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.impl.DomainImpl;
import ims.framework.enumerations.PrinterScope;
import ims.framework.interfaces.ILocation;
import ims.framework.interfaces.IPrinter;
import ims.framework.interfaces.IPrintersProvider;
import ims.reports.ReportEngine;

public class PrintersProvider extends DomainImpl implements IPrintersProvider
{
	private static final long serialVersionUID	= 1L;
	private static IPrinter[] allCachedPrinters;
	
	public IPrinter[] getAllPrinters() 
	{
		IPrinter[] allPrinters = updatePrinterList();
		if(allPrinters == null)
			return new IPrinter[0];
		return allPrinters;
	}
	
	public IPrinter getPrinterByLocationAndScope(ILocation location, PrinterScope scope)
	{
		if (location == null)
			return null;
		
		IPrinter[] allActivePrinters = getAllPrinters();
		if(allActivePrinters.length == 0)
			return null;
		
		DomainFactory factory = getDomainFactory();				
	 
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Integer> values = new ArrayList<Integer>();
		StringBuffer hql = new StringBuffer();
		
		if (scope.equals(PrinterScope.DEFAULT))
		{
			hql.append(" select default.id from Location as loc join loc.defaultPrinter as default where loc.id = :locationID " );
		}
		else if (scope.equals(PrinterScope.NEWRESULT))
		{
			hql.append(" select newResult.id from Location as loc join loc.designatedPrinterForNewResults as newResult where loc.id = :locationID " );
		}
		else if (scope.equals(PrinterScope.OCSORDER))
		{
			hql.append(" select ocs.id from Location as loc join loc.designatedPrinterForOCSOrder as ocs where loc.id = :locationID " );
		}
		names.add("locationID");				
		values.add(location.getID());
			
		List printers = factory.find(hql.toString(),names,values);	
		if (printers.size() > 0)
		{
			for (int i = 0; i < printers.size(); i++)
			{
				for (int j = 0; j < allActivePrinters.length; j++)
				{
					if (allActivePrinters[j].getIPrinterId() == (Integer)printers.get(i))
					{
						return allActivePrinters[j];
					}
				}
			}		
		}
				
		return null;
	}	
	
	public IPrinter[] getPrintersForLocation(ILocation location) 
	{
		IPrinter[] allActivePrinters = getAllPrinters();
		if(allActivePrinters.length == 0)
			return new IPrinter[0];
		
		ArrayList<IPrinter> result = new ArrayList<IPrinter>();
		
		
		DomainFactory factory = getDomainFactory();				
	 
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Integer> values = new ArrayList<Integer>();
			
		StringBuffer hql = new StringBuffer(" select printers.id from Location as loc join loc.printers as printers where loc.id = :locationID and printers.active = 1" );			
		names.add("locationID");				
		values.add(location.getID());
			
		List printers = factory.find(hql.toString(),names,values);			
		if (printers.size() > 0)
		{
			for (int i = 0; i < allActivePrinters.length; i++)
			{
				for (int j = 0; j < printers.size(); j++)
				{
					if (allActivePrinters[i].getIPrinterId() == (Integer)printers.get(j))
					{
						result.add(allActivePrinters[i]);
						break;
					}
				}
			}			
		}
			
		IPrinter[] castArray = new IPrinter[result.size()];
		result.toArray(castArray);
		return castArray;
	}
	private IPrinter[] updatePrinterList()
	{
		synchronized (this) 
		{
			try 
			{
				allCachedPrinters = updatePrinterListInternal();				
			} 
			catch (StaleObjectException e) 
			{
				return allCachedPrinters;
			}
		}
		
		return allCachedPrinters;
	}
	private synchronized IPrinter[] updatePrinterListInternal() throws StaleObjectException 
	{
		ArrayList<IPrinter> result = new ArrayList<IPrinter>();		
		DomainFactory 		factory = getDomainFactory();						 
		
		StringBuffer hql = new StringBuffer("from Printer" );			
		List printers = factory.find(hql.toString());
		
		ReportEngine re = getReportEngine();
		//WDEV-11729 Start issue modifications
		String[] printersAsString = null;
		try
		{
			printersAsString = re.listPrinters(null);
		}
		catch (Exception e) 
		{
			printersAsString = new String[0];
		}
		
		//WDEV-11729 End issue modifications
		
		for (int i = 0; i < printers.size(); i++)
		{
			Printer printer = (Printer) printers.get(i);
			if (printer.isActive())
			{
				boolean found = false;
				for (int j = 0; j < printersAsString.length; j++)
				{
					if(printer.getName().toLowerCase().equals(printersAsString[j].toLowerCase()))
					{
						found = true;
						break;
					}
				}
				
				if (!found)
				{
					deactivatePrinter(printer);
				}
				else
				{
					result.add(printer);
				}
			}
		}
		
		for (int j = 0; j < printersAsString.length; j++)
		{
			boolean found = false;
			for (int i = 0; i < printers.size(); i++)
			{
				Printer printer = (Printer) printers.get(i);
				if(printer.getName().toLowerCase().equals(printersAsString[j].toLowerCase()))
				{
					if (!printer.isActive())
					{
						activatePrinter(printer);
						result.add(printer);
					}
					found = true;
					break;
				}
			}
			
			if (!found)
			{
				result.add(addPrinter(printersAsString[j]));				
			}
		}
		
		IPrinter[] castArray = new IPrinter[result.size()];
		result.toArray(castArray);
		return castArray;
	}
		
	private IPrinter addPrinter(String printerName) throws StaleObjectException
	{		
		Printer printer = new Printer();
		printer.setName(printerName);
		printer.setActive(true);
		getDomainFactory().save(printer);
		return printer;
	}
	
	private void deactivatePrinter(Printer printer) throws StaleObjectException
	{
		printer.setActive(false);
		getDomainFactory().save(printer);		
	}
	
	private void activatePrinter(Printer printer) throws StaleObjectException
	{
		printer.setActive(true);
		getDomainFactory().save(printer);		
	}
}
