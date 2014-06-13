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
 * Created on 04-Apr-2005
 *
 */
package ims.scheduling.helper;

import ims.configuration.gen.ConfigFlag;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;


/**
 * @author jmacenri
 *
 */
public class Uuid 
{
	private static String macAddr;
	private static int sequence = 0;
	static
	{
		try 
		{
			macAddr = getMacAddress();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
			macAddr = "";
		}
	}
	
	public static synchronized String generateUUID()
	{
		StringBuffer uuid= new StringBuffer();			
		SimpleDateFormat sf = new SimpleDateFormat("yyyyMMdd-HHmm-ssSSS");
		String nowStr = sf.format(new Date());
		uuid.append(nowStr.substring(0,nowStr.length()-1));
		uuid.append("-" + nowStr.substring(nowStr.length()-1));
		uuid.append(getSeqStr());
		uuid.append("-" + macAddr);
		return uuid.toString();
	}

	private static String getSeqStr() 
	{
		sequence++;
		if (sequence >=1000) sequence = 0;
		String seqStr = "" + sequence;
		if (seqStr.length() == 1) 
		{
			return ("00" + seqStr);
		}
		else if (seqStr.length() == 2)
		{
			return ("0" + seqStr);
		}
		else return seqStr;		
	}

	private final static String getMacAddress() throws IOException 
	{
		String localHost = null;
		try 
		{
			localHost = ConfigFlag.GEN.UUID_IP.getValue();
			if (localHost.equals(""))
			{
				localHost = InetAddress.getLocalHost().getHostAddress();	
			}
			
		}
		catch(java.net.UnknownHostException ex) 
		{
			ex.printStackTrace();
			throw new IOException(ex.getMessage());
		}

		String os = System.getProperty("os.name").toLowerCase();
		String fmac = null;
		try 
		{
			if(os.startsWith("windows")) 
			{
				fmac = winMacAddress(localHost);
			} 
			else if(os.indexOf("linux") != -1) 
			{
				fmac = linuxMacAddress(localHost);
			}
			else if(os.indexOf("aix") != -1) 
			{
				fmac = aixMacAddress(localHost);
			}
			else 
			{
				throw new IOException("unknown operating system: " + os);
			}
			return formatMacAddress(fmac);
		} 
		catch(ParseException ex) 
		{
			ex.printStackTrace();
			throw new IOException(ex.getMessage());
		}
	}


	private final static String winMacAddress(String localHost) throws ParseException, IOException
	{
		String ipCfg = getIpCfg("ipconfig /all");
		StringTokenizer tokenizer = new StringTokenizer(ipCfg, "\n");
		String lastMacAddress = null;

		while(tokenizer.hasMoreTokens()) 
		{
			String line = tokenizer.nextToken().trim();

			// see if line contains IP address
			if(line.contains(localHost) && lastMacAddress != null) {
				return lastMacAddress;
			}

			// see if line contains MAC address
			int macAddressPosition = line.indexOf(":");
			if(macAddressPosition <= 0) continue;

			String macAddressCandidate = line.substring(macAddressPosition + 1).trim();
			if(macAddressCandidate.length() == 17 && line.contains("Physical Address"))  // Is this a macAddress
			{
				lastMacAddress = macAddressCandidate;
				continue;
			}
		}

		ParseException ex = new ParseException("cannot read MAC address from [" + ipCfg + "]", 0);
		ex.printStackTrace();
		throw ex;
	}

	private final static String linuxMacAddress(String localHost) throws ParseException, IOException
	{
		String ipCfg = getIpCfg("ifconfig");
		StringTokenizer tokenizer = new StringTokenizer(ipCfg, "\n");
		String lastMacAddress = null;

		while(tokenizer.hasMoreTokens()) 
		{
			String line = tokenizer.nextToken().trim();
			boolean containsLocalHost = line.indexOf(localHost) >= 0;

			// see if line contains IP address
			if(containsLocalHost && lastMacAddress != null) 
			{
				return lastMacAddress;
			}

			// see if line contains MAC address
			int macAddressPosition = line.indexOf("HWaddr");
			if(macAddressPosition <= 0) continue;

			String macAddressCandidate = line.substring(macAddressPosition + 6).trim();
			if(macAddressCandidate.length() == 17) 
			{
				lastMacAddress = macAddressCandidate;
				continue;
			}
		}

		ParseException ex = new ParseException
			("cannot read MAC address for " + localHost + " from [" + ipCfg + "]", 0);
		ex.printStackTrace();
		throw ex;
	}
	
	private final static String aixMacAddress(String localHost) throws ParseException, IOException
	{
		String ipCfg = getIpCfg("netstat -ian");
		StringTokenizer tokenizer = new StringTokenizer(ipCfg, "\n");
		String lastMacAddress = null;

		while(tokenizer.hasMoreTokens()) 
		{
			String line = tokenizer.nextToken().trim();
			boolean containsLocalHost = line.indexOf(localHost) >= 0;

			// see if line contains IP address
			if(containsLocalHost && lastMacAddress != null) 
			{
				return lastMacAddress;
			}

			// see if line contains MAC address
			StringTokenizer st2 = new StringTokenizer(line);
			if (st2.countTokens() < 9) continue;
			
			//Skip the parts we don't want.
			st2.nextToken();st2.nextToken();st2.nextToken();
			String macAddressCandidate = st2.nextToken().trim();
			if (macAddressCandidate.length() > 0 || !macAddressCandidate.equals("Address"))
			{
				lastMacAddress = macAddressCandidate;	
			}			
		}

		ParseException ex = new ParseException
			("cannot read MAC address for " + localHost + " from [" + ipCfg + "]", 0);
		ex.printStackTrace();
		throw ex;
	}

	private static String getIpCfg(String cmd) throws IOException 
	{
		Process p = Runtime.getRuntime().exec(cmd);
		InputStream stdoutStream = new BufferedInputStream(p.getInputStream());

		StringBuffer buffer= new StringBuffer();
		for (;;) 
		{
			int c = stdoutStream.read();
			if (c == -1) break;
			buffer.append((char)c);
		}
		String outputText = buffer.toString();
		stdoutStream.close();

		return outputText;
	}

	private static String formatMacAddress(String fmac) throws ParseException
	{
		StringTokenizer st = new StringTokenizer(fmac, ":.-");
		if (st.countTokens() < 6) throw new ParseException("Failed to parse MAC Address " + fmac, 0);
		StringBuffer ret = new StringBuffer();
		while (st.hasMoreTokens())
		{
			String part = st.nextToken();
			if (part.length() < 2)
			{
				part = "0" + part;
			}
			ret.append(part);
		}
		return ret.toString().toUpperCase();
	}
	
	public static void main(String[] args)
	{
		for (int i = 1; i < 20; i++)
		{
			System.out.println("UUID " + i + " = " + Uuid.generateUUID());
		}
	}
}
