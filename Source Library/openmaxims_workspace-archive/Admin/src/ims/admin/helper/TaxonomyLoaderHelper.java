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


import ims.admin.vo.Icd10AmProcVo;
import ims.admin.vo.Opcs4Vo;
import ims.admin.vo.TaxonomySnomedConWrdIdxVo;
import ims.admin.vo.TaxonomySnomedConceptVo;
import ims.configuration.gen.ConfigFlag;
import ims.core.vo.AddressVo;
import ims.core.vo.CCGPCTPCCodesVo;
import ims.core.vo.CommChannelVo;
import ims.core.vo.CommChannelVoCollection;
import ims.core.vo.GpVo;
import ims.core.vo.Gp_PracticesVo;
import ims.core.vo.Gp_PracticesVoCollection;
import ims.core.vo.LocSiteUpprNameVo;
import ims.core.vo.LocSiteUpprNameVoCollection;
import ims.core.vo.OrgVo;
import ims.core.vo.PersonName;
import ims.core.vo.TaxonomyMap;
import ims.core.vo.TaxonomyMapCollection;
import ims.core.vo.lookups.ChannelType;
import ims.core.vo.lookups.GPStatus;
import ims.core.vo.lookups.LocationType;
import ims.core.vo.lookups.OrganisationType;
import ims.core.vo.lookups.PersonTitle;
import ims.core.vo.lookups.TaxonomyType;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.exceptions.UniqueKeyViolationException;
import ims.domain.exceptions.UnqViolationUncheckedException;
import ims.framework.interfaces.ITaxonomyLoadActions;
import ims.framework.utils.TextileString;
import ims.utils.FlatFileLoad;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import net.sf.flatpack.DataSet;
import net.sf.flatpack.DefaultParserFactory;
import net.sf.flatpack.InitialisationException;
import net.sf.flatpack.Parser;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.helpers.DefaultHandler;

public class TaxonomyLoaderHelper extends TaxonomyLoader {
	TaxonomyLoader taxonomyLoader = null;

	public TaxonomyLoaderHelper() {
		super();
	}

	public TaxonomyLoaderHelper(ims.admin.domain.TaxonomyCodeAdmin domain,
			ims.core.vo.lookups.TaxonomyType codeType,
			ims.admin.vo.lookups.FileFormatType fileFormat,
			ims.core.vo.lookups.TaxonomyElement te) {
		super();

		// add implementation loaders here based on taxonomy type
		if (codeType.equals(ims.core.vo.lookups.TaxonomyType.OPCS4)) {
			taxonomyLoader = new TaxonomyOPCS4Loader(domain, fileFormat);
		} else if (codeType.equals(ims.core.vo.lookups.TaxonomyType.SNOMED)) {
			taxonomyLoader = new TaxonomySnomedLoader(domain, fileFormat, te);
		} else if (codeType.equals(ims.core.vo.lookups.TaxonomyType.ICD10)) {
			taxonomyLoader = new TaxonomyIcd10Loader(domain, fileFormat);
		} else if (codeType
				.equals(ims.core.vo.lookups.TaxonomyType.NAT_LOC_CODE)) {
			taxonomyLoader = new TaxonomyPracticeLoader(domain, fileFormat);
		} else if (codeType
				.equals(ims.core.vo.lookups.TaxonomyType.NAT_GP_CODE)) {
			taxonomyLoader = new TaxonomyGPLoader(domain, fileFormat);
		} else if (codeType
				.equals(ims.core.vo.lookups.TaxonomyType.PCG)) {
			//taxonomyLoader = new TaxonomyPCodeLoader(domain, fileFormat);
		} else if (codeType
				.equals(ims.core.vo.lookups.TaxonomyType.CCG)) {
			taxonomyLoader = new TaxonomyCCGLoader(domain, fileFormat);
		}
		
	}

	public void load(String filename, String mapfile, StringBuffer delimeter,
			StringBuffer qualifer) throws IOException {
		if (taxonomyLoader != null) {
			taxonomyLoader.load(filename, mapfile, delimeter, qualifer);
			this.setRecordsInserted(taxonomyLoader.getRecordsInserted());
			this.setRecordsUpdated(taxonomyLoader.getRecordsUpdated());
		} else
			throw new IOException(
					"No load implemtation for selected taxonomy type.");
	}

	public TextileString getLoadReport(ims.core.vo.lookups.TaxonomyType codeType) {
		StringBuffer str = new StringBuffer();

		str.append(makeTextile(
				"<CENTER>*" + "Load Results for " + codeType.getText()
						+ "*</CENTER>", "SlateBlue", "tahoma", "14"));

		str.append(makeNewLine(new Integer(1)));
		str.append(makeTextile("Number of Records Inserted : ", "DarkRed",
				"tahoma", "12"));
		str.append(makeTextile(Integer.toString(getRecordsInserted()), "Black",
				"tahoma", "12").append(makeNewLine(new Integer(1))));

		str.append(makeNewLine(new Integer(1)));
		str.append(makeTextile("Number of Records Updated : ", "DarkRed",
				"tahoma", "12"));
		str.append(makeTextile(Integer.toString(getRecordsUpdated()), "Black",
				"tahoma", "12").append(makeNewLine(new Integer(1))));

		return new TextileString(str.toString());
	}

	private StringBuffer makeTextile(String stringin, String colour,
			String font, String fontsize) {
		StringBuffer sb = new StringBuffer();
		sb.append("<span style=\"color:");
		sb.append(colour);
		sb.append(";font-family:");
		sb.append(font);
		sb.append(";font-size:");
		sb.append(fontsize);
		sb.append(";\">");
		sb.append(stringin);
		sb.append("</span>");
		return sb;
	}

	private StringBuffer makeNewLine(Integer numLines) {
		StringBuffer ret = new StringBuffer();
		ret.append("");

		for (int i = 0; i < numLines.intValue(); i++) {
			ret.append("<br>");
		}
		return ret;
	}

	public void validateTaxonomyFile(String file, String fileMap)
			throws IOException {
		if (taxonomyLoader != null)
			taxonomyLoader.verify(file, fileMap);
		else
			throw new IOException(
					"No Verify implemtation for selected taxonomy type.");

	}

	public void validateXMLFIle(String file)
			throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = null;
		db = dbf.newDocumentBuilder();

		if (db != null) {
			db.parse(file);
		}
	}

	public String getColMapFileContent(String file)
			throws FileNotFoundException, IOException {
		StringBuffer sb = new StringBuffer();

		BufferedReader in = new BufferedReader(new FileReader(file));
		String str;
		while ((str = in.readLine()) != null) {
			sb.append(str + "\r\n");
		}
		in.close();
		return sb.toString();
	}

	public String getLocalColMapFileContent(String file)
			throws FileNotFoundException, IOException {
		StringBuffer sb = new StringBuffer();

		BufferedReader in = new BufferedReader(new FileReader(file));
		String str;
		while ((str = in.readLine()) != null) {
			sb.append(str + "\r\n");
		}
		in.close();
		return sb.toString();
	}

	public void saveColMapToFile(String taxonomyColumnMapFilename, String value)
			throws IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter(
				taxonomyColumnMapFilename));

		out.write(value);

		out.close();
	}

}
final class TaxonomyCCGLoader extends TaxonomyLoader {
	ims.admin.domain.TaxonomyCodeAdmin domainTaxonomy;

	private static final org.apache.log4j.Logger LOG = ims.utils.Logging.getLogger(TaxonomyCCGLoader.class);
	
	public TaxonomyCCGLoader(ims.admin.domain.TaxonomyCodeAdmin domain,
			ims.admin.vo.lookups.FileFormatType ft) {
		if (ft != null) {
			if (ft.equals(ims.admin.vo.lookups.FileFormatType.XML))
				loadActions = new TaxonomyLoadXml();
			else if (ft.equals(ims.admin.vo.lookups.FileFormatType.FIXEDLENGTH))
				loadActions = new FlatFileLoad();
			else if (ft.equals(ims.admin.vo.lookups.FileFormatType.DELIMITED))
				loadActions = new TaxonomyLoadDelimited();
		}
		domainTaxonomy = domain;
	}

	public void load(String filename, String mapFile, StringBuffer delimeter,
			StringBuffer qualifier) throws IOException {
		int recInserted = 0;
		int recUpdated = 0;

		if (loadActions == null)
			throw new IOException(
					"No loader implementation for this type of file");

		loadActions.load(filename, mapFile, delimeter, qualifier);

		CCGPCTPCCodesVo vo = null;

		LOG.warn("Starting to load ccg code file :" + filename);
		
		if (loadActions.getClass().equals(TaxonomyLoadDelimited.class)) {
			// fixedlength represetation read
			TaxonomyLoadDelimited loadImpl = (TaxonomyLoadDelimited) loadActions;
			while (loadImpl.next()) {
				try {
					if (loadImpl.getString("postcode") != "") {
						vo = domainTaxonomy.getCCGRecord(loadImpl
								.getString("postcode"));
						//Only load codes with a valid CCG for the postcode to ccg mapping
						if ( loadImpl.getString("ccg") != null && !loadImpl.getString("ccg").equalsIgnoreCase(""))
						{
							if (vo != null) {
								// update
								vo.setCCGCode(applyDhaRule(loadImpl.getString("dha"))?loadImpl.getString("dha"):loadImpl.getString("ccg"));
								//vo.setCCGDescription(loadImpl.getString("ccgdescr")); none available in file provided by ONS
								vo.setDHACode(loadImpl.getString("dha"));
								recUpdated++;
							} else {
								// insert
								vo = new CCGPCTPCCodesVo();
								vo.setPostcode(loadImpl.getString("postcode"));
								vo.setCCGCode(applyDhaRule(loadImpl.getString("dha"))?loadImpl.getString("dha"):loadImpl.getString("ccg"));
								//vo.setCCGDescription(loadImpl.getString("ccgdescr"));
								vo.setDHACode(loadImpl.getString("dha"));
								recInserted++;
							}

							String[] err = vo.validate();
							if (err != null && err.length > 0)							
								throw new DomainInterfaceException(err[0].toString());
							else
								domainTaxonomy.saveCCGRecord(vo);
						}
					}

				} catch (DomainInterfaceException e) {
					throw new IOException(e.getMessage());
				} catch (StaleObjectException e) {
					throw new IOException(e.getMessage());
				} catch (UniqueKeyViolationException e) {
					throw new IOException(e.getMessage());
				} catch (NoSuchElementException e) {
					throw new IOException(e.getMessage());
				}
			}

			setRecordsInserted(recInserted);
			setRecordsUpdated(recUpdated);
		}
		
		LOG.warn("Finished load ccg code file :" + filename);
	}

	private boolean applyDhaRule(String dhaString) 
	{
		if (dhaString != null)
		{
			if (dhaString.length()>0)
			{
				//S (Scotland)
				if (dhaString.substring(0, 1).equals("S"))
					return true;
				
				if (dhaString.length()>=3)
				{				
					//YAD YAE YAF (Channel Islands)
					if (dhaString.substring(0, 3).equals("YAD") || dhaString.substring(0, 3).equals("YAE") || dhaString.substring(0, 3).equals("YAF"))
						return true;
				}
			}
		}
		return false;
	}
}

final class TaxonomyPracticeLoader extends TaxonomyLoader 
{
	private static final org.apache.log4j.Logger LOG = ims.utils.Logging.getLogger(TaxonomyPracticeLoader.class);
	
	ims.admin.domain.TaxonomyCodeAdmin domainTaxonomy;

	public TaxonomyPracticeLoader(ims.admin.domain.TaxonomyCodeAdmin domain,
			ims.admin.vo.lookups.FileFormatType ft) {
		if (ft != null) {
			if (ft.equals(ims.admin.vo.lookups.FileFormatType.XML))
				loadActions = new TaxonomyLoadXml();
			else if (ft.equals(ims.admin.vo.lookups.FileFormatType.FIXEDLENGTH))
				loadActions = new FlatFileLoad();
			else if (ft.equals(ims.admin.vo.lookups.FileFormatType.DELIMITED))
				loadActions = new TaxonomyLoadDelimited();
		}
		domainTaxonomy = domain;
	}

	public void load(String filename, String mapFile, StringBuffer delimeter,StringBuffer qualifier) throws IOException
	{
		int[] recInserted = new int[1];
		int[] recUpdated = new int[1];
		recInserted[0]=0;
		recUpdated[0]=0;

		if (loadActions == null)
			throw new IOException(
					"No loader implementation for this type of file");

		loadActions.load(filename, mapFile, delimeter, qualifier);		

		if (loadActions.getClass().equals(TaxonomyLoadDelimited.class)) 
		{
			TaxonomyLoadDelimited loadImpl = (TaxonomyLoadDelimited) loadActions;
			while (loadImpl.next()) 
			{
				try 
				{										
					OrgVo vo=setFieldsIntoPracticeVo(loadImpl,recInserted,recUpdated);					
					vo=savePracticeVo(vo);

						if(!ConfigFlag.DOM.GP_USE_SURGERIES.getValue())													
						{	
							LocSiteUpprNameVo surgeryvo=setSurgeryFieldsIntoSurgeryVo(vo,loadImpl);
							
							surgeryvo=saveSurgeryVo(surgeryvo); 
						}	
						
						
				} catch (DomainInterfaceException e) {
					throw new IOException(e.getMessage());
				} catch (StaleObjectException e) {
					//try again to get and update
					try 
					{										
						OrgVo vo=setFieldsIntoPracticeVo(loadImpl,recInserted,recUpdated);					
						vo=savePracticeVo(vo);

							if(!ConfigFlag.DOM.GP_USE_SURGERIES.getValue())													
							{	
								LocSiteUpprNameVo surgeryvo=setSurgeryFieldsIntoSurgeryVo(vo,loadImpl);
								
								surgeryvo=saveSurgeryVo(surgeryvo); 
							}	
							
							
					} catch (DomainInterfaceException e2) {
						LOG.error(e2); // and continue					
					} catch (StaleObjectException e2) {
						LOG.error(e2); // and continue
					} catch (UniqueKeyViolationException e2) {
						LOG.error(e2); // and continue
					} catch (NoSuchElementException e2) {
						LOG.error(e2); // and continue
					}
					catch (UnqViolationUncheckedException e2){
						LOG.error(e2); // and continue
					}
				} catch (UniqueKeyViolationException e) {
					LOG.error(e); // and continue
				} catch (NoSuchElementException e) {
					LOG.error(e); // and continue
				}
				catch (UnqViolationUncheckedException e2){
					LOG.error(e2); // and continue
				}				
			}

			setRecordsInserted(recInserted[0]);
			setRecordsUpdated(recUpdated[0]);
		}
	}

	private OrgVo savePracticeVo(OrgVo vo) throws DomainInterfaceException, StaleObjectException, UniqueKeyViolationException 
	{
		//WDEV-17409
		String[] err = vo.validate();
		if (err != null && err.length > 0) 
		{
			String concat = "";
			for (int i = 0; i < err.length; i++) 
			{
				concat = concat + " " + err[i] + " ";
			}
			throw new DomainRuntimeException(concat);
		} else 
		{
				return domainTaxonomy.savePracticeRecord(vo);
		}
	}

	private LocSiteUpprNameVo saveSurgeryVo(LocSiteUpprNameVo surgeryvo) throws DomainInterfaceException, StaleObjectException, UniqueKeyViolationException {
		// TODO Auto-generated method stub
		 String[] errs = surgeryvo.validate();
			if (errs  != null && errs .length > 0) 
			{
				String concatt = "";
				for (int i = 0; i < errs.length; i++) 
				{
					concatt = concatt + " " + errs[i] + " ";
				}
				throw new DomainRuntimeException(concatt);
			} else 
			{
				return domainTaxonomy.saveSurgeryRecord(surgeryvo);																					            			       			            
			}
	}

	private LocSiteUpprNameVo setSurgeryFieldsIntoSurgeryVo(OrgVo vo, TaxonomyLoadDelimited loadImpl) throws DomainInterfaceException 
	{
		String practCode = vo.getCodeMappings().get(0).getTaxonomyCode();
		String surgerycode=practCode+ "_1";
		LocSiteUpprNameVo surgeryvo = domainTaxonomy.getSurgeryCode(surgerycode);
		
		if(surgeryvo == null)
		{
			surgeryvo = new LocSiteUpprNameVo();
			surgeryvo.setType(LocationType.SURGERY);
			surgeryvo.setParentOrganisation(vo);
			surgeryvo.setIsVirtual(Boolean.FALSE);									
			TaxonomyMap taxMap= new TaxonomyMap();								
			taxMap.setTaxonomyName(TaxonomyType.PAS);
			taxMap.setTaxonomyCode(surgerycode);				
			TaxonomyMapCollection taxMapColl = new TaxonomyMapCollection();
			taxMapColl.add(taxMap);																	
			surgeryvo.setCodeMappings(taxMapColl);													
		}
									
		surgeryvo.setName(vo.getName());
		surgeryvo.setAddress(vo.getAddress());
		surgeryvo.setIsActive(vo.getIsActive());										          
		surgeryvo.setUpperName(vo.getUpperName());				           
		surgeryvo.setCommChannels(vo.getCommChannels());
		
		return surgeryvo;
	}

	private OrgVo setFieldsIntoPracticeVo(TaxonomyLoadDelimited loadImpl, int[] recInserted, int[] recUpdated) throws DomainInterfaceException, NoSuchElementException {
		// TODO Auto-generated method stub
		
		OrgVo vo=null;
		if (loadImpl.getString("PRACTICECODE") != "" && loadImpl.getString("PRACTICENAME")!="") 
		{
			vo = domainTaxonomy.getPracticeCode(loadImpl.getString("PRACTICECODE"));
			System.out.println(loadImpl.getString("PRACTICECODE"));
			if (vo == null) 
			{
				vo = new OrgVo();
				
				TaxonomyMap tmCAB = new TaxonomyMap();
				String practCode = loadImpl.getString("PRACTICECODE");
				tmCAB.setTaxonomyName(TaxonomyType.ICAB);
				tmCAB.setTaxonomyCode(practCode);

				TaxonomyMap tmNAT = new TaxonomyMap();
				practCode = loadImpl.getString("PRACTICECODE");
				tmNAT.setTaxonomyName(TaxonomyType.NAT_LOC_CODE);
				tmNAT.setTaxonomyCode(practCode);

				TaxonomyMapCollection taxColl = new TaxonomyMapCollection();
				taxColl.add(tmCAB);
				taxColl.add(tmNAT);
				vo.setCodeMappings(taxColl);
				
				vo.setType(OrganisationType.GPP);
				
				recInserted[0]=recInserted[0]+1;
			} else 
			{
				//WDEV-17409
				//If there is no ICAB mapping , create it.
				if (vo.getCodeMappingsIsNotNull() && vo.getCodeMappings().getMappingValue(TaxonomyType.ICAB)==null)
				{
					TaxonomyMap tmCAB = new TaxonomyMap();
					String practCode = loadImpl.getString("PRACTICECODE");
					tmCAB.setTaxonomyName(TaxonomyType.ICAB);
					tmCAB.setTaxonomyCode(practCode);

					vo.getCodeMappings().add(tmCAB);
				}
				recUpdated[0]=recUpdated[0]+1;
			}

			String name = loadImpl.getString("PRACTICENAME");
			vo.setName(name);
			AddressVo address = new AddressVo();
			address.setLine1(loadImpl.getString("ADDRESS1"));
			address.setLine2(loadImpl.getString("ADDRESS2"));
			address.setLine3(loadImpl.getString("ADDRESS3"));
			address.setLine4(loadImpl.getString("ADDRESS4"));
			address.setLine5(loadImpl.getString("ADDRESS5"));
			address.setPostCode(loadImpl.getString("POSTCODE"));

			vo.setAddress(address);
			
			String closeDate = loadImpl.getString("CLOSEDATE");		
			if (closeDate == null || !("".equals(closeDate))) {
				vo.setIsActive(Boolean.FALSE);
			} else {
				vo.setIsActive(Boolean.TRUE);
			}
			
			if (name.length() > 30)
				vo.setUpperName(name.toUpperCase().substring(0, 30));
			else {
				// throw new Exception("Shorter than 30");
				vo.setUpperName(name);
			}
			vo.setPctCode(loadImpl.getString("PARENT"));
			
			String workphone=loadImpl.getString("PHONE");
			if(workphone!="")
			{
				CommChannelVo workPhoneChannel = new CommChannelVo();
				workPhoneChannel.setChannelType(ChannelType.WORK_PHONE);
				workPhoneChannel.setCommValue(workphone);

				CommChannelVoCollection commColl = new CommChannelVoCollection();
				commColl.add(workPhoneChannel);
				vo.setCommChannels(commColl);
			}			
		}
		
		return vo;	
	}
}

final class TaxonomyGPLoader extends TaxonomyLoader 
{ 
	private static final org.apache.log4j.Logger LOG = ims.utils.Logging.getLogger(TaxonomyGPLoader.class);
	ims.admin.domain.TaxonomyCodeAdmin domainTaxonomy;


	public TaxonomyGPLoader(ims.admin.domain.TaxonomyCodeAdmin domain,ims.admin.vo.lookups.FileFormatType ft) 	
	{
		if (ft != null) 
		{
			if (ft.equals(ims.admin.vo.lookups.FileFormatType.XML))
				loadActions = new TaxonomyLoadXml();
			else if (ft.equals(ims.admin.vo.lookups.FileFormatType.FIXEDLENGTH))
				loadActions = new FlatFileLoad();
			else if (ft.equals(ims.admin.vo.lookups.FileFormatType.DELIMITED))
				loadActions = new TaxonomyLoadDelimited();
		}
		domainTaxonomy = domain;
	}

	public void load(String filename, String mapFile, StringBuffer delimeter, StringBuffer qualifier) throws IOException 
	{
		int[] recInserted = new int[1];
		int[] recUpdated = new int[1];	
		recInserted[0]=0;
		recUpdated[0]=0;
		
		if (loadActions == null)
			throw new IOException("No loader implementation for this type of file");
		loadActions.load(filename, mapFile, delimeter, qualifier);

		if (loadActions.getClass().equals(TaxonomyLoadDelimited.class)) 
		{
			TaxonomyLoadDelimited loadImpl = (TaxonomyLoadDelimited) loadActions;
			while (loadImpl.next()) 
			{
				try 
				{														
					GpVo vo=setFieldsIntoGpVo(loadImpl,recInserted,recUpdated );
					vo=saveGpVo(vo);
												
					if(ConfigFlag.DOM.GP_USE_SURGERIES.getValue())													
					{	
						LocSiteUpprNameVo surgeryvo=setSurgeryFieldsIntoSurgeryVo(vo,loadImpl);
						surgeryvo=saveSurgeryVo(surgeryvo);
					}

				} catch (DomainInterfaceException e) {
					throw new IOException(e.getMessage());
				} catch (StaleObjectException e) {
					// try again to get and update
					try 
					{														
						GpVo vo=setFieldsIntoGpVo(loadImpl,recInserted,recUpdated );
						vo=saveGpVo(vo);
													
						if(ConfigFlag.DOM.GP_USE_SURGERIES.getValue())													
						{	
							LocSiteUpprNameVo surgeryvo=setSurgeryFieldsIntoSurgeryVo(vo,loadImpl);
							surgeryvo=saveSurgeryVo(surgeryvo);
						}

					} catch (DomainInterfaceException e2) {
						LOG.error(e2); // and continue
					} catch (StaleObjectException e2) {
						LOG.error(e); // and continue
					} catch (UniqueKeyViolationException e2) {
						LOG.error(e2); // and continue
					} catch (NoSuchElementException e2) {
						LOG.error(e2); // and continue
					}		
					catch (UnqViolationUncheckedException e2){
						LOG.error(e2); // and continue
					}					
				} catch (UniqueKeyViolationException e) {
					LOG.error(e); // and continue
				} catch (NoSuchElementException e) {
					LOG.error(e); // and continue
				}
				catch (UnqViolationUncheckedException e){
					LOG.error(e); // and continue
				}				
			}
			setRecordsInserted(recInserted[0]);
			setRecordsUpdated(recUpdated[0]);
		}
	}


	private LocSiteUpprNameVo setSurgeryFieldsIntoSurgeryVo(GpVo vo, TaxonomyLoadDelimited loadImpl) throws DomainInterfaceException, NoSuchElementException 
	{
		// TODO Auto-generated method stub				
			String parent_practice=loadImpl.getString("PARENT");
		
			AddressVo address = new AddressVo();
			address.setLine1(loadImpl.getString("ADDRESS1"));
			address.setLine2(loadImpl.getString("ADDRESS2"));
			address.setLine3(loadImpl.getString("ADDRESS3"));
			address.setLine4(loadImpl.getString("ADDRESS4"));
			address.setLine5(loadImpl.getString("ADDRESS5"));
			address.setPostCode(loadImpl.getString("POSTCODE"));
			
			OrgVo practice = domainTaxonomy.getPracticeCode(parent_practice);			 
			
			LocSiteUpprNameVo surgeryvo= domainTaxonomy.getSurgery(address,null);
			if(practice!=null&&surgeryvo==null)
			{								
					surgeryvo= getSurgery(practice.getLocationSites(),address);
			}		
						
			//WDEV-16706
			if(surgeryvo==null)
			{
				surgeryvo=new LocSiteUpprNameVo();			
				surgeryvo.setType(LocationType.SURGERY);				
				surgeryvo.setIsVirtual(Boolean.FALSE);		
				surgeryvo.setAddress(address);
				if (practice!=null)
				{
					//if there is a parent practice associated, then take active status from that.
					surgeryvo.setIsActive(practice.getIsActive());
				}
				else
				{
					surgeryvo.setIsActive(vo.getStatus()==GPStatus.ACTIVE?Boolean.TRUE:Boolean.FALSE);
				}
				surgeryvo.setParentOrganisation(practice);
				if (practice != null)
				{
					surgeryvo.setName(practice.getName());	
					surgeryvo.setUpperName(practice.getUpperName());
				}
				else
				{
					surgeryvo.setName(vo.getName().getSurname());	
					surgeryvo.setUpperName(vo.getName().getUpperSurname());					
				}
				
				surgeryvo.setCommChannels(vo.getCommChannels());
			}
			else
			{
				if (practice != null)
				{
					surgeryvo.setParentOrganisation(practice);
					surgeryvo.setName(practice.getName());	
					surgeryvo.setUpperName(practice.getUpperName());
				}
				else
				{
					surgeryvo.setName(vo.getName().getSurname());	
					surgeryvo.setUpperName(vo.getName().getUpperSurname());					
				}					
				surgeryvo.setCommChannels(vo.getCommChannels());
			}
			//WDEV-16706
			
			return surgeryvo;		
	}

	private GpVo setFieldsIntoGpVo(TaxonomyLoadDelimited loadImpl, int[] recInserted , int[] recUpdated) throws DomainInterfaceException 
	{
		// TODO Auto-generated method stub
					
		GpVo vo=null;
		
		PersonTitle title = domainTaxonomy.getLkpPersonTitle("DR");
		title.setText("DR");
		
		if (loadImpl.getString("GPCODE") != "") 
		{
			vo = domainTaxonomy.getGPCode(loadImpl.getString("GPCODE"));
			if (vo == null) 
			{
				vo = new GpVo();
				
				TaxonomyMap tmGP = new TaxonomyMap();
				String gpCode = loadImpl.getString("GPCODE");
				tmGP.setTaxonomyName(TaxonomyType.NAT_GP_CODE);
				tmGP.setTaxonomyCode(gpCode);
				TaxonomyMapCollection taxColl = new TaxonomyMapCollection();
				taxColl.add(tmGP);
				vo.setCodeMappings(taxColl);

				OrgVo practice = domainTaxonomy.getPracticeCode(loadImpl.getString("PARENT"));
				Gp_PracticesVo gp2Pract = new Gp_PracticesVo();
				gp2Pract.setGp(vo);
				gp2Pract.setPractice(practice);
				gp2Pract.setIsPrimaryPractice(Boolean.TRUE);							
				gp2Pract.setGpCode(gpCode);
				Gp_PracticesVoCollection pr_coll = new Gp_PracticesVoCollection();
				pr_coll.add(gp2Pract);
				vo.setPractices(pr_coll);
				
				recInserted[0]= recInserted[0]+1;				
			} else 
			{
				recUpdated[0]=recUpdated[0]+1;				
			}									
			
			String nameString = loadImpl.getString("GPNAME");
			PersonName name = new PersonName();
			name.setSurname(nameString);
			name.setTitle(title);
			vo.setName(name);
			vo.getName().setUppers(); //WDEV-14173
			

			String closeDate = loadImpl.getString("CLOSEDATE");
			if (closeDate == null || !("".equals(closeDate))) {
				vo.setStatus(GPStatus.INACTIVE);

			} else {
				vo.setStatus(GPStatus.ACTIVE);
			}
			String workphone=loadImpl.getString("PHONE");
			if(workphone!="")
			{
				CommChannelVo workPhoneChannel = new CommChannelVo();
				workPhoneChannel.setChannelType(ChannelType.WORK_PHONE);
				workPhoneChannel.setCommValue(loadImpl.getString("PHONE"));
				CommChannelVoCollection comm_coll = new CommChannelVoCollection();
				comm_coll.add(workPhoneChannel);
				vo.setCommChannels(comm_coll);
			}				
		}			
		
		return vo;
	}

	private LocSiteUpprNameVo saveSurgeryVo(LocSiteUpprNameVo surgeryvo) throws DomainInterfaceException, StaleObjectException, UniqueKeyViolationException 
	{
		// TODO Auto-generated method stub
		String[] errs = surgeryvo.validate();
		if (errs  != null && errs .length > 0) 
		{
			String concatt = "";
			for (int i = 0; i < errs.length; i++) 
			{
				concatt = concatt + " " + errs[i] + " ";
			}
			throw new DomainRuntimeException(concatt);
		} else 
		{
			return domainTaxonomy.saveSurgeryRecord(surgeryvo);																					            			       			            
		}
	}

	private GpVo saveGpVo(GpVo vo) throws DomainInterfaceException, StaleObjectException, UniqueKeyViolationException 
	{
		// TODO Auto-generated method stub
		String[] err = vo.validate();
		if (err != null && err.length > 0) 
		{
			String concat = "";
			for (int i = 0; i < err.length; i++) 
			{
				concat = concat + " " + err[i] + " ";
			}
			throw new DomainRuntimeException(concat);
		} else
		{
			return domainTaxonomy.saveGPRecord(vo);			
		}
	}

	LocSiteUpprNameVo getSurgery(LocSiteUpprNameVoCollection locSites, AddressVo address)
	{
		for (int i = 0; i < locSites.size(); i++)
		{
			LocSiteUpprNameVo vo =locSites.get(i); 
			
			if (vo != null && vo.getAddress() != null && address != null)
			{
				if (    adrLinesEqual(vo.getAddress().getLine1(),address.getLine1()) &&						
						adrLinesEqual(vo.getAddress().getLine2(),address.getLine2()) &&
						adrLinesEqual(vo.getAddress().getLine3(),address.getLine3()) && 
						adrLinesEqual(vo.getAddress().getLine4(),address.getLine4()) && 
						adrLinesEqual(vo.getAddress().getLine5(),address.getLine5()) &&
						adrLinesEqual(vo.getAddress().getPostCode(),address.getPostCode()))
						{
							return vo;
						}				
			}
		}
		return null;
	}
	private boolean adrLinesEqual(String line1, String line2)
	{
		if(line2=="") line2=null;
		
		if (line1 != null && line2 != null)
		{			
			 if (line1.equals(line2)) 
				return true;
			 else
				 return false;
		}
		else if (line1 == null && line2 == null)
			return true;
		
		return false;			
	}
}
final class TaxonomyOPCS4Loader extends TaxonomyLoader {
	ims.admin.domain.TaxonomyCodeAdmin domainTaxonomy;

	public TaxonomyOPCS4Loader(ims.admin.domain.TaxonomyCodeAdmin domain,
			ims.admin.vo.lookups.FileFormatType ft) {
		if (ft != null) {
			if (ft.equals(ims.admin.vo.lookups.FileFormatType.XML))
				loadActions = new TaxonomyLoadXml();
			else if (ft.equals(ims.admin.vo.lookups.FileFormatType.FIXEDLENGTH))
				loadActions = new FlatFileLoad();
			else if (ft.equals(ims.admin.vo.lookups.FileFormatType.DELIMITED))
				loadActions = new TaxonomyLoadDelimited();
		}
		domainTaxonomy = domain;
	}

	public void load(String filename, String mapFile, StringBuffer delimeter,
			StringBuffer qualifier) throws IOException {
		int recInserted = 0;
		int recUpdated = 0;

		if (loadActions == null)
			throw new IOException(
					"No loader implementation for this type of file");

		loadActions.load(filename, mapFile, delimeter, qualifier);

		Opcs4Vo vo = null;

		if (loadActions.getClass().equals(FlatFileLoad.class)) {
			// fixedlength represetation read
			FlatFileLoad loadImpl = (FlatFileLoad) loadActions;
			while (loadImpl.next()) {
				try {
					if (loadImpl.getString("opcode") != "") {
						vo = domainTaxonomy.getOpcs4Code(loadImpl
								.getString("opcode"));
						if (vo != null) {
							// update
							vo.setOpname3(loadImpl.getString("opname3"));
							vo.setOpname4(loadImpl.getString("opname4"));
							vo.setOpstatus(loadImpl.getString("opstatus"));
							vo.setSelindic(loadImpl.getString("selindic"));
							vo.setSexa(loadImpl.getString("sexa"));
							vo.setSexs(loadImpl.getString("sexs"));
							recUpdated++;
						} else {
							// insert
							vo = new Opcs4Vo();
							vo.setOpcode(loadImpl.getString("opcode"));
							vo.setOpname3(loadImpl.getString("opname3"));
							vo.setOpname4(loadImpl.getString("opname4"));
							vo.setOpstatus(loadImpl.getString("opstatus"));
							vo.setSelindic(loadImpl.getString("selindic"));
							vo.setSexa(loadImpl.getString("sexa"));
							vo.setSexs(loadImpl.getString("sexs"));
							recInserted++;
						}

						String[] err = vo.validate();
						if (err != null && err.length > 0)
							throw new DomainInterfaceException(err.toString());
						else
							domainTaxonomy.saveOpcs4Record(vo);
					}

				} catch (DomainInterfaceException e) {
					throw new IOException(e.getMessage());
				} catch (StaleObjectException e) {
					throw new IOException(e.getMessage());
				} catch (UniqueKeyViolationException e) {
					throw new IOException(e.getMessage());
				} catch (NoSuchElementException e) {
					throw new IOException(e.getMessage());
				}
			}

			setRecordsInserted(recInserted);
			setRecordsUpdated(recUpdated);
		}
	}

}

final class TaxonomyIcd10Loader extends TaxonomyLoader {
	ims.admin.domain.TaxonomyCodeAdmin domainTaxonomy;

	public TaxonomyIcd10Loader(ims.admin.domain.TaxonomyCodeAdmin domain,
			ims.admin.vo.lookups.FileFormatType ft) {
		if (ft != null) {
			if (ft.equals(ims.admin.vo.lookups.FileFormatType.XML))
				loadActions = new TaxonomyLoadXml();
			else if (ft.equals(ims.admin.vo.lookups.FileFormatType.FIXEDLENGTH))
				loadActions = new FlatFileLoad();
			else if (ft.equals(ims.admin.vo.lookups.FileFormatType.DELIMITED))
				loadActions = new TaxonomyLoadDelimited();
		}
		domainTaxonomy = domain;
	}

	public void load(String filename, String mapFile, StringBuffer delimeter,
			StringBuffer qualifier) throws IOException {
		if (loadActions == null)
			throw new IOException(
					"No loader implementation for this type of file");

		int recInserted = 0;
		int recUpdated = 0;

		loadActions.load(filename, mapFile, delimeter, qualifier);

		Icd10AmProcVo vo = null;

		if (loadActions.getClass().equals(FlatFileLoad.class)) {
			// fixedlength represetation read
			FlatFileLoad loadImpl = (FlatFileLoad) loadActions;
			while (loadImpl.next()) {
				try {
					if (loadImpl.getString("code") != "") {
						vo = domainTaxonomy.getIcd10Code(loadImpl
								.getString("code"));
						if (vo != null) {
							// update
							vo.setAgeL(loadImpl.getString("minage").equals("") ? null
									: new Integer(loadImpl.getString("minage")));
							vo.setAgelH(loadImpl.getString("maxage").equals("") ? null
									: new Integer(loadImpl.getString("maxage")));
							vo.setAscii_desc(loadImpl.getString("diagname4"));
							vo.setAscii_short_desc(loadImpl
									.getString("diagname3"));
							vo.setAtype(loadImpl.getString("recordtype")
									.equals("") ? null : new Integer(loadImpl
									.getString("recordtype")));
							// vo.setBlock();
							// vo.setEffective_from(value);
							// vo.setID_Icd10AmProc(value);
							// vo.setInactive(datevalue);
							// vo.setIsRIE(isRIE);
							vo.setSex(loadImpl.getString("sexs").equals("") ? null
									: new Integer(loadImpl.getString("sexs")));
							recUpdated++;
						} else {
							// insert
							vo = new Icd10AmProcVo();
							vo.setCode_id(loadImpl.getString("code"));
							vo.setAgeL(loadImpl.getString("minage").equals("") ? null
									: new Integer(loadImpl.getString("minage")));
							vo.setAgelH(loadImpl.getString("maxage").equals("") ? null
									: new Integer(loadImpl.getString("maxage")));
							vo.setAscii_desc(loadImpl.getString("diagname4"));
							vo.setAscii_short_desc(loadImpl
									.getString("diagname3"));
							vo.setAtype(loadImpl.getString("recordtype")
									.equals("") ? null : new Integer(loadImpl
									.getString("recordtype")));
							// vo.setBlock();
							// vo.setEffective_from(value);
							// vo.setID_Icd10AmProc(value);
							// vo.setInactive(datevalue);
							// vo.setIsRIE(isRIE);
							vo.setSex(loadImpl.getString("sexs").equals("") ? null
									: new Integer(loadImpl.getString("sexs")));
							recInserted++;
						}

						String[] err = vo.validate();
						if (err != null && err.length > 0)
							throw new DomainInterfaceException(err.toString());
						else
							domainTaxonomy.saveIcd10Record(vo);
					}

				} catch (DomainInterfaceException e) {
					throw new IOException(e.getMessage());
				} catch (StaleObjectException e) {
					throw new IOException(e.getMessage());
				} catch (UniqueKeyViolationException e) {
					throw new IOException(e.getMessage());
				} catch (NoSuchElementException e) {
					throw new IOException(e.getMessage());
				}
			}

			setRecordsInserted(recInserted);
			setRecordsUpdated(recUpdated);

		}
	}
}

final class TaxonomySnomedFlatLoader implements ITaxonomyLoadActions {

	ims.admin.domain.TaxonomyCodeAdmin domainTaxonomy;
	int count = 0;
	int recInserted = 0;
	int recUpdated = 0;

	public TaxonomySnomedFlatLoader(ims.admin.domain.TaxonomyCodeAdmin domain) {
		domainTaxonomy = domain;
	}

	public void load(String filename, String definitionFile,
			StringBuffer delimeter, StringBuffer qualifier,
			boolean ignoreFirstRecord) {

	}

	public void load(String filename, String mapFile, StringBuffer delimeter,
			StringBuffer qualifier) throws IOException {

		FlatFileLoad loadImpl = new FlatFileLoad();

		TaxonomySnomedConceptVo vo = null;

		loadImpl.load(filename, mapFile, delimeter, qualifier);

		// fixedlength represetation read
		recInserted = 0;
		recUpdated = 0;
		while (loadImpl.next()) {

			try {
				if (loadImpl.getString("CONCEPTID") != "") {

					// try {
					// vo =
					// domainTaxonomy.getSnomedConcept(loadImpl.getString("CONCEPTID"));
					// } catch (DomainInterfaceException e1) {
					// throw new IOException(e1.getMessage());
					// }

					try {
						// if (vo != null)
						// {
						//
						// vo.setConceptstatus(new
						// Integer(loadImpl.getString("CONCEPTSTATUS")));
						// vo.setCtv3id(loadImpl.getString("CTV3ID"));
						// vo.setFullyspecifiedname(loadImpl.getString("FULLYSPECIFIEDNAME"));
						// if (loadImpl.getString("ISPRIMITIVE") != "")
						// vo.setIsprimitive(new
						// Integer(loadImpl.getString("ISPRIMITIVE")));
						// vo.setSnomedid(loadImpl.getString("SNOMEDID"));
						// }
						// else
						// {
						vo = new TaxonomySnomedConceptVo();
						vo.setConceptid(loadImpl.getString("CONCEPTID"));
						if (loadImpl.getString("CONCEPTSTATUS") != "")
							vo.setConceptstatus(new Integer(loadImpl
									.getString("CONCEPTSTATUS")));
						vo.setCtv3id(loadImpl.getString("CTV3ID"));
						vo.setFullyspecifiedname(loadImpl
								.getString("FULLYSPECIFIEDNAME"));
						if (loadImpl.getString("ISPRIMITIVE") != "")
							vo.setIsprimitive(new Integer(loadImpl
									.getString("ISPRIMITIVE")));
						vo.setSnomedid(loadImpl.getString("SNOMEDID"));

						recInserted++;
						// }
					} catch (NumberFormatException e) {
						// do nothing for now
					}

					String[] err = vo.validate();
					if (err != null && err.length > 0)
						throw new IOException(err.toString());
					else {
						try {
							domainTaxonomy.saveSnomedConceptRecord(vo);
						} catch (UniqueKeyViolationException e) {
							throw new IOException(e.getMessage());
						} catch (StaleObjectException e) {
							throw new IOException(e.getMessage());
						} catch (DomainInterfaceException e) {
							throw new IOException(e.getMessage());
						}
					}
				}
			} catch (NoSuchElementException e) {
				throw new IOException(e.getMessage());
			}
		}

		loadImpl.close();
	}

	public String[] getErrors() {
		return null;
	}

	public boolean verify(String filename, String definitionFile) {
		return false;
	}

	public int getRecordsInserted() {
		return recInserted;
	}

	public int getRecordsUpdated() {
		return recUpdated;
	}

}

final class TaxonomySnomedLoader extends TaxonomyLoader {
	ims.admin.domain.TaxonomyCodeAdmin domainTaxonomy;

	public TaxonomySnomedLoader(ims.admin.domain.TaxonomyCodeAdmin domain,
			ims.admin.vo.lookups.FileFormatType ft,
			ims.core.vo.lookups.TaxonomyElement te) {
		if (ft != null) 
		{
			if (ft.equals(ims.admin.vo.lookups.FileFormatType.XML)) {
				loadActions = new TaxonomySnomedLoadXml(domain, te);
			} else 
				if (ft.equals(ims.admin.vo.lookups.FileFormatType.FIXEDLENGTH)) 
				{
					if (te.equals(ims.core.vo.lookups.TaxonomyElement.CONCEPT)) 
					{
						loadActions = new TaxonomySnomedFlatLoader(domain);
					} else if (te.equals(ims.core.vo.lookups.TaxonomyElement.CONCEPTWORDIDX))
						loadActions = new TaxonomySnomedWrdIdxFlatLoader(domain);					
				} 
				else if (ft.equals(ims.admin.vo.lookups.FileFormatType.DELIMITED)) 
				{
					if (te.equals(ims.core.vo.lookups.TaxonomyElement.CONCEPT)) 
					{
						// instantiate fixed len loader for concept - not
						// supplied anymore
					} else if (te.equals(ims.core.vo.lookups.TaxonomyElement.CONCEPTWORDIDX))
						loadActions = new TaxonomySnomedWrdIdxFlatLoader(domain);
				}
		}
		domainTaxonomy = domain;
	}

	public void load(String filename, String mapFile, StringBuffer delimeter,
			StringBuffer qualifier) throws IOException {
		if (loadActions == null)
			throw new IOException(
					"No loader implementation for this type of file");

		loadActions.load(filename, mapFile, delimeter, qualifier);
		setRecordsInserted(loadActions.getRecordsInserted());
		setRecordsUpdated(loadActions.getRecordsUpdated());

	}
}

final class TaxonomySnomedLoadXml extends DefaultHandler implements
		ITaxonomyLoadActions {
	private ims.admin.domain.TaxonomyCodeAdmin domain;
	private static boolean loadErrors;
	private String currentElement = null;
	private TaxonomySnomedConceptVo conceptVo;
	private TaxonomySnomedConWrdIdxVo conceptWrdIdxVo;
	int recInserted = 0;
	int recUpdated = 0;

	public TaxonomySnomedLoadXml(
			ims.admin.domain.TaxonomyCodeAdmin adminDomain,
			ims.core.vo.lookups.TaxonomyElement te) {
		super();
		loadErrors = false;

		domain = adminDomain;

		if (te.equals(ims.core.vo.lookups.TaxonomyElement.CONCEPT)) {
			conceptVo = new TaxonomySnomedConceptVo();
			conceptWrdIdxVo = null;
		} else if (te
				.equals(ims.core.vo.lookups.TaxonomyElement.CONCEPTWORDIDX)) {
			conceptWrdIdxVo = new TaxonomySnomedConWrdIdxVo();
			conceptVo = null;
		}
	}

	public String[] getErrors() {
		if (loadErrors)
			return null;
		return null;
	}

	public void load(String filename, String definitionFile,
			StringBuffer delimeter, StringBuffer qualifier,
			boolean ignoreFirstRecord) {

	}

	public void load(String filename, String mapFile, StringBuffer delimeter,
			StringBuffer qualifier) throws IOException {
		currentElement = "";
		recInserted = 0;

		// setup SAX parser
		System.setProperty("javax.xml.parsers.SAXParserFactory",
				"org.apache.xerces.jaxp.SAXParserFactoryImpl");
		SAXParserFactory parserFactory = SAXParserFactory.newInstance();
		parserFactory.setValidating(true);
		parserFactory.setNamespaceAware(true);
		try {
			parserFactory.setFeature(
					"http://xml.org/sax/features/namespace-prefixes", true);
			SAXParser parser = parserFactory.newSAXParser();
			// Parse xml
			parser.parse(filename, this);
			currentElement = "";
			loadErrors = false;

		} catch (SAXNotRecognizedException e) {
			throw new IOException(e.getMessage());
		} catch (SAXNotSupportedException e) {
			throw new IOException(e.getMessage());
		} catch (ParserConfigurationException e) {
			throw new IOException(e.getMessage());
		} catch (SAXException e) {
			throw new IOException(e.getMessage());
		}
	}

	public void characters(char[] ch, int start, int length)
			throws SAXException {
		String value = new String(ch, start, length);

		try {
			if (conceptVo != null) {
				if (!value.trim().equals("")) {
					if (currentElement.equalsIgnoreCase("ConceptID")) {
						conceptVo.setConceptid(value);
					} else if (currentElement.equalsIgnoreCase("ConceptStatus")) {
						if (value != "")
							conceptVo.setConceptstatus(new Integer(value));
					} else if (currentElement
							.equalsIgnoreCase("FullySpecifiedName")) {
						conceptVo.setFullyspecifiedname(value);
					} else if (currentElement.equalsIgnoreCase("CTV3ID")) {
						conceptVo.setCtv3id(value);
					} else if (currentElement.equalsIgnoreCase("SnomedID")) {
						conceptVo.setSnomedid(value);
					} else if (currentElement.equalsIgnoreCase("IsPrimitive")) {
						if (value != "")
							conceptVo.setIsprimitive(new Integer(value));
					}
				}
				currentElement = "";
			} else if (conceptWrdIdxVo != null) {

			}
		} catch (NumberFormatException e) {
			// do nothing for now
		}
	}

	public void endDocument() throws SAXException {
	}

	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		currentElement = "";

		if (conceptVo != null) {
			if (qName.equalsIgnoreCase("Concept")) {
				String[] arrErrors;
				try {
					arrErrors = saveSnomedConceptRecord();
					if (arrErrors != null && arrErrors.length > 0) {
						loadErrors = true;
					}
					// clearout Vo for next element
					clearSnomedConcept();
				} catch (UniqueKeyViolationException e) {
					throw new SAXException(e.getMessage());
				} catch (DomainInterfaceException e) {
					throw new SAXException(e.getMessage());
				} catch (StaleObjectException e) {
					throw new SAXException(e.getMessage());
				}

			}
		}
	}

	private void clearSnomedConcept() {
		conceptVo.setConceptid(null);
		conceptVo.setConceptstatus(null);
		conceptVo.setCtv3id(null);
		conceptVo.setFullyspecifiedname(null);
		conceptVo.setID_snomed_concept(null);
		conceptVo.setIsprimitive(null);
		conceptVo.setIsRIE(null);
		conceptVo.setSnomedid(null);
	}

	private String[] saveSnomedConceptRecord()
			throws UniqueKeyViolationException, DomainInterfaceException,
			StaleObjectException {
		String[] arrErrors = conceptVo.validate();
		if (arrErrors != null) {
			return arrErrors;
		}

		domain.saveSnomedConceptRecord(conceptVo);
		recInserted++;

		return null;
	}

	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		if (qName.equalsIgnoreCase("Concept")) {
			currentElement = "Concept";
		} else if (qName.equals("ConceptID")) {
			currentElement = "ConceptID";
		} else if (qName.equals("ConceptStatus")) {
			currentElement = "ConceptStatus";
		} else if (qName.equals("FullySpecifiedName")) {
			currentElement = "FullySpecifiedName";
		} else if (qName.equals("CTV3ID")) {
			currentElement = "CTV3ID";
		} else if (qName.equals("SnomedID")) {
			currentElement = "SnomedID";
		} else if (qName.equals("IsPrimitive")) {
			currentElement = "IsPrimitive";
		}

		else
			currentElement = "";
	}

	public boolean verify(String filename, String definitionFile) {
		// TODO Auto-generated method stub
		return false;
	}

	public int getRecordsInserted() {
		return recInserted;
	}

	public int getRecordsUpdated() {
		return recUpdated;
	}

}

final class TaxonomySnomedWrdIdxFlatLoader implements ITaxonomyLoadActions {
	ims.admin.domain.TaxonomyCodeAdmin domainTaxonomy;
	int recInserted = 0;
	int recUpdated = 0;

	public TaxonomySnomedWrdIdxFlatLoader(
			ims.admin.domain.TaxonomyCodeAdmin domain) {
		domainTaxonomy = domain;
	}

	public void load(String filename, String definitionFile,
			StringBuffer delimeter, StringBuffer qualifier,
			boolean ignoreFirstRecord) {

	}

	public void load(String filename, String mapFile, StringBuffer delimeter,
			StringBuffer qualifier) throws IOException {
		FlatFileLoad loadImpl = new FlatFileLoad();

		TaxonomySnomedConWrdIdxVo vo = null;

		loadImpl.load(filename, mapFile, delimeter, qualifier);

		// fixedlength represetation read
		recInserted = 0;
		recUpdated = 0;
		while (loadImpl.next()) {

			try {
				if (loadImpl.getString("KEYWORD") != "") {
					vo = new TaxonomySnomedConWrdIdxVo();
					vo.setKeyword(loadImpl.getString("KEYWORD"));
					vo.setConceptid(loadImpl.getString("CONCEPTID"));
					String[] err = vo.validate();
					if (err != null && err.length > 0)
						throw new IOException(err.toString());
					else
						try {
							try {
								domainTaxonomy.saveSnomedConceptWrdIdx(vo);
								recInserted++;
							} catch (StaleObjectException e) {
								throw new IOException(e.getMessage());
							}
						} catch (DomainInterfaceException e) {
							throw new IOException(e.getMessage());
						}

					vo = null; // reset
				}
			} catch (NoSuchElementException e) {
				throw new IOException(e.getMessage());
			}
		}

		loadImpl.close();
	}

	public String[] getErrors() {
		return null;
	}

	public boolean verify(String filename, String definitionFile) {
		return false;
	}

	public int getRecordsInserted() {
		return recInserted;
	}

	public int getRecordsUpdated() {
		return recUpdated;
	}

}

final class TaxonomyLoadXml implements ITaxonomyLoadActions {

	public String[] getErrors() {
		// TODO implement xml version
		return null;
	}

	public void load(String filename, String definitionFile,
			StringBuffer delimeter, StringBuffer qualifier,
			boolean ignoreFirstRecord) {

	}

	public void load(String filename, String mapFile, StringBuffer delimeter,
			StringBuffer qualifier) throws IOException {
		// TODO implement xml version

	}

	public boolean verify(String filename, String definitionFile) {
		// TODO Auto-generated method stub
		return false;
	}

	public int getRecordsInserted() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getRecordsUpdated() {
		// TODO Auto-generated method stub
		return 0;
	}

}

final class TaxonomyLoadDelimited implements ITaxonomyLoadActions {
	DataSet ds = null;
	Parser parser = null;
	int recordsInserted, recordsUpdated = 0;

	public String[] getErrors() {
		if ((ds != null) && (ds.getErrorCount() > 0)) {
			String[] strErr = new String[ds.getErrorCount()];
			ds.getErrors().toArray(strErr);
			return strErr;
		}
		return null;
	}

	public void load(String filename, String definitionFile,
			StringBuffer delimeter, StringBuffer qualifier,
			boolean ignoreFirstRecord) {

	}

	public void load(String file, String fileMap, StringBuffer delimeter,
			StringBuffer qualifier) throws IOException {
		// TODO Auto-generated method stub
		try {
			if (delimeter.length() > 0 && delimeter.toString() != "") {
				if (fileMap != null) {
					parser = DefaultParserFactory.getInstance()
							.newDelimitedParser(
									new FileReader(fileMap), // xml column
																// mapping
									new FileReader(file), // txt file to
															// parse
									delimeter.length() > 0 ? delimeter
											.charAt(0) : ',', // delimiter
									qualifier.length() > 0 ? qualifier
											.charAt(0) : '"', // text
																// qualfier
									false); // ignore the first record (may
											// need to be done if first
											// record contain column names)
				}
			}
		} catch (NoClassDefFoundError e) {
			e.printStackTrace();
			throw new IOException(e.getMessage());
		}

		// obtain DataSet

		/*
		 * if (parser != null) { parser.setHandlingShortLines(true);
		 * parser.setIgnoreExtraColumns(true);
		 * parser.setIgnoreParseWarnings(true); }
		 */

		try {
			if (parser != null)
				ds = parser.parse();

		} catch (InitialisationException e) {
			e.printStackTrace();
			throw new IOException(e.getMessage());
		}

		if (ds.getErrorCount() > 0) {
			throw new IOException(ds.getErrors().toString());
		}

	}

	public boolean next() {
		if (ds != null)
			return ds.next();
		return false;
	}

	public void close() throws IOException {
		/*
		 * if (parser != null){} parser.close();
		 */
	}

	public String getString(String item) throws NoSuchElementException {
		if (ds != null)
			return ds.getString(item);
		return null;
	}

	public boolean verify(String filename, String definitionFile) {
		// TODO Auto-generated method stub
		return false;
	}

	public void setRecordsInserted(int numRecords) {
		recordsInserted = numRecords;

	}

	public void setRecordsUpdated(int numRecords) {
		recordsUpdated = numRecords;

	}

	public int getRecordsInserted() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getRecordsUpdated() {
		// TODO Auto-generated method stub
		return 0;
	}

}

final class TaxonomyCodeMapFile extends DefaultHandler {

	public TaxonomyCodeMapFile() {
		super();
	}

	public void loadFile(String file) throws ParserConfigurationException,
			SAXException, IOException {
		// setup SAX parser
		System.setProperty("javax.xml.parsers.SAXParserFactory",
				"org.apache.xerces.jaxp.SAXParserFactoryImpl");
		SAXParserFactory parserFactory = SAXParserFactory.newInstance();
		parserFactory.setValidating(true);
		parserFactory.setNamespaceAware(true);
		parserFactory.setFeature(
				"http://xml.org/sax/features/namespace-prefixes", true);
		SAXParser parser = parserFactory.newSAXParser();

		// Parse xml
		parser.parse(file, this);

	}

	public void characters(char[] ch, int start, int length)
			throws SAXException {
	}

	public void endDocument() throws SAXException {
	}

	public void endElement(String uri, String localName, String qName)
			throws SAXException {
	}

	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
	}
 
}

