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

import ims.configuration.EnvironmentConfig;
import ims.configuration.User;
import ims.core.domain.PatientMerge;
import ims.core.vo.MergeRequestVo;
import ims.core.vo.MergeRequestVoCollection;
import ims.core.vo.MergeTableDetailsVo;
import ims.core.vo.MergeTableDetailsVoCollection;
import ims.domain.DomainSession;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.hibernate3.Registry;
import ims.domain.impl.DomainImplFlyweightFactory;
import ims.framework.enumerations.SystemLogLevel;
import ims.framework.enumerations.SystemLogType;
import ims.framework.interfaces.IPatMergeInterfaceComponent;
import ims.framework.interfaces.IPatMergeServletController;
import imsmaxims.common.ImsDate;
import imsmaxims.common.ImsException;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.mapping.Column;
import org.hibernate.mapping.ForeignKey;
import org.hibernate.mapping.PersistentClass;
import org.hibernate.mapping.Property;
import org.hibernate.mapping.Table;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;


public class PatientMergerServlet extends HttpServlet implements IPatMergeServletController, IPatMergeInterfaceComponent, Runnable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1145609618115164922L;
	private static final org.apache.log4j.Logger localLogger = ims.utils.Logging.getLogger(PatientMergerServlet.class);
	private static Thread mergerThread = null;
	
	private volatile boolean isInterrupted = false;
	
	private PatientMergeConfig pMergeConfig = null;
    private MergeTableDetailsVoCollection tablesList;
	private DomainSession	domSess;
	private PatientMerge	patMergeImpl;
	protected int numSuccessMerges;
	protected int numFailedMerges;

	private static IPatMergeInterfaceComponent patMergeThread;

	
	private static final String PATIENT_CLASS = "ims.core.patient.domain.objects.Patient";
	
	public PatientMergerServlet()
	{
		
	}
	
    public void proceed()
    {

        // Merge Patient, we need to check for merge requests and perform the merges required
        try
        {
        	numFailedMerges=0;
        	numSuccessMerges=0;
        	
            // List tables outside loop as there should be no need to reload list all the time
            int rv=listTables();
            while (rv >= 0 && !isInterrupted)
            {
               rv = mergePatients();
               if (rv < 0)
                   break;

               localLogger.debug("" + rv + " Merges Complete");
               if (!pMergeConfig.isContinousLoop())
               	break;
               
               // Sleep for a period before checking for merge requests again
           	   Thread.sleep(pMergeConfig.getSleepInterval());
           }
        }
        catch (InterruptedException e) 
        {
        	localLogger.fatal("PatientMerge Interrupted - Servlet Terminating");
        	patMergeImpl.createSystemLogEntry(SystemLogType.PATIENT_MERGE, SystemLogLevel.ERROR, "PatientMerge Interrupted - Servlet Terminating");
        	mergerThread=null;
        }
        catch (Exception ex) {
        	localLogger.fatal("Exception occurred - " + ex.getMessage(), ex);
        	patMergeImpl.createSystemLogEntry(SystemLogType.PATIENT_MERGE, SystemLogLevel.ERROR, "Exception occurred - " + ex.getMessage());
        }
    }
    


    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	}


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		
	}

    private int mergePatients()
    {
    	int countRequests = patMergeImpl.countPatientsToBeMerged();
    	if (countRequests <= 0)
			return countRequests;
    	
    	return(doMerges(patMergeImpl.listPatientsToBeMerged()));
    }

    private int doMerges(MergeRequestVoCollection patList) 
    {
		if (patList == null || patList.size() == 0)
			return 0;
		
		for (int i=0; i<patList.size(); i++)
		{
			MergeRequestVo req = patList.get(i);
			
			try 
			{
				patMergeImpl.performPatientMerge(req, tablesList, pMergeConfig.mergePatientIds, pMergeConfig.processOcsCounts);
				numSuccessMerges++;
			} 
			catch (Exception e)
			{
				// An exception occurred, so let's log this error
				try {
					if (e.getMessage() == null)
						patMergeImpl.logMergeError(req, "Null Exception Received");
					else
						patMergeImpl.logMergeError(req, e.getMessage());
					numFailedMerges++;
				} catch (StaleObjectException e1) {
					localLogger.error("StaleObjectException occurred logging Merge Error - " + e.getMessage(),e1);
				}
			}
		}
		return patList.size();
		
	}

	/**
	 * List Tables
	 * <p>
	 * This method is called to populate the tables hashtable. It reads all tables that have a foreign constraint to core_patient, excluding those tables specified in the exclude tables section of the configuration file.
	 * 
	 * @return 0 for or SUCCESS -1 for ERROR
	 *         </p>
	 */
	private int listTables()
	{
		tablesList = new MergeTableDetailsVoCollection();
			
		// Get list of entities with foreign constraints to Patient
    	Iterator it = Registry.getInstance().getConfiguration().getClassMappings();
    	while (it.hasNext())
    	{
    		PersistentClass cls = (PersistentClass) it.next();
    		
    		// If this is to be excluded, then continue
    		if (pMergeConfig.isExcluded(cls.getClassName()))
    				continue;
    		Table tab = cls.getTable();
    		Iterator it3= tab.getForeignKeyIterator();
    		if (it3 != null)
    		{
    			while (it3.hasNext())
    			{
    				ForeignKey key = (ForeignKey) it3.next();
    				if (key.getReferencedEntityName().equals(PATIENT_CLASS))
    				{	
    					MergeTableDetailsVo tableDet = new MergeTableDetailsVo();
    					tableDet.setTableName(tab.getName());
    					tableDet.setColumnName(((Column)key.getColumns().get(0)).getName());
    					tableDet.setEntityName(cls.getClassName());
    					tableDet.setAttributeName(getAttributeForTabCol(cls.getClassName(), tableDet.getColumnName()));
    					tablesList.add(tableDet);
    				}
    			}
    		}
    	}

    	localLogger.debug("Tables List for MERGE...");
    	for (int i=0; i<tablesList.size(); i++)
    	{
    		localLogger.debug("" + (i+1) + "Table:" + tablesList.get(i).getTableName() + "  Col:" +
    					tablesList.get(i).getColumnName() + " Entity:" + tablesList.get(i).getEntityName() + 
    					" Att:" + tablesList.get(i).getAttributeName());
    	}
		return tablesList.size();
	}


    private String getAttributeForTabCol(String entity, String col)
    {
    	if (entity == null || col == null)
    		return null;
    	
    	PersistentClass cls = Registry.getInstance().getConfiguration().getClassMapping(entity);
    	if (cls != null)
    	{
    		Iterator it = cls.getPropertyIterator();
    		while (it.hasNext())
    		{
    			Property prop = (Property) it.next();
    			Iterator it2 = prop.getColumnIterator();
    			while (it2.hasNext())
    			{
    				Column col2 = (Column) it2.next();
    				if (col2 != null && col2.getName().equals(col))
    					return prop.getName();
    			}
    		
    		}
    	}
    	
    	// Recursively get super classes in case not found in at this level
    	if (cls.getSuperclass() != null)
    	{
    		return (getAttributeForTabCol(cls.getSuperclass().getClassName(), col));
    	}
    	return null;
    }

	protected static void getCurrentDateTime(StringBuffer dateStrBuf, StringBuffer timeStrBuf, boolean incMillis)
        throws ImsException
    {
        try
        {
            SimpleDateFormat formatter;

            if (incMillis)
                formatter = new SimpleDateFormat("yyyy-MM-dd HHmmssSSS");
            else
                formatter = new SimpleDateFormat("yyyy-MM-dd HHmmss");
            java.util.Date currentTime_1 = new java.util.Date();
            String dateString = formatter.format(currentTime_1);
            ImsDate dateVal = new ImsDate(dateString.substring(0, 10));
            dateStrBuf.append(dateVal.toString(true));
            if (incMillis)
               timeStrBuf.append(dateString.substring(11, 20));
            else
               timeStrBuf.append(dateString.substring(11, 16));
        }
        catch(Exception e)
        {
            throw new ImsException(5, -1, "Exception occurred getting current date and time - ".concat(String.valueOf(String.valueOf(e.getMessage()))));
        }
    }
	
	public synchronized Thread getMergerThread()
	{
		if (mergerThread == null || !mergerThread.isAlive())
		{
		mergerThread = new Thread(this,"PatientMerger");
		}
		return mergerThread;
			
	}
	@Override
	public void init() throws ServletException 
	{
		super.init();
		if (mergerThread != null && mergerThread.isAlive())
			return;
		
		patMergeThread=this;
		
		if (EnvironmentConfig.getPatientMerge().booleanValue() == false)
		{
			localLogger.warn("Patient Merge Environment Flag is not set, Patient Merge Process NOT STARTED");
			return;
		}
		
		localLogger.warn("Starting initialization of PatientMerge");
		
		//try to get the config file name 
		String configFileName = null;
		if (System.getProperty("PAT_MERGE_INI") == null)
		{
			configFileName =  "patient_merge_config.xml";
		}
		else 
		{
			configFileName = System.getProperty("PAT_MERGE_INI");
		}
		InputStream confFileStream;
//		ServletContext servletContext = getServletContext();
//		if (servletContext == null)
			confFileStream = this.getClass().getClassLoader().getResourceAsStream(configFileName);
//		else
//			confFileStream = servletContext.getResourceAsStream(configFileName);
		
		if (confFileStream == null)
		{
			 localLogger.fatal("Configuration problem or config file missing");
			 localLogger.fatal("Patient Merger will exit");
			 return;
		}
		  try
		  {
			  domSess = DomainSession.getSession();
			  login();	
			  patMergeImpl = (PatientMerge) getDomainImpl("ims.core.domain.impl.PatientMergeImpl");
			  this.pMergeConfig = new PatientMergeConfig(confFileStream);
		  
		  }
		  catch(Exception ex)
		  {
			 localLogger.error("Exception creating the config object",ex);
			 return;
		  }
		  localLogger.info("Configuration of Patient Merge finished successfully");
		  
		
		  getMergerThread().start();
	}

	public void run() {
		localLogger.info("Starting Patient Merge timer");
		proceed();
		
		
	}
	@Override
	public void destroy()
	{
	
		super.destroy();
		if (mergerThread == null)
			return;
		localLogger.warn("Sending the interrupt signal to PatientMerger thread");
		this.isInterrupted= true;
		mergerThread.interrupt();
	
		
	}

	private void login() throws Exception
	{
		User user = new User();
		user.setUsername("IMSPatientMerge");
		domSess.setUser(user);
	}
	
	private Object getDomainImpl(String className) throws Exception
	{
		Class<?> implClass = Class.forName(className);
		DomainImplFlyweightFactory factory = DomainImplFlyweightFactory.getInstance();
		return factory.create(implClass, domSess);
	}
	
	
	class PatientMergeConfig
	{
		
	    private long sleepInterval=300000;
		private Hashtable<String, String> excludeEntities;
	    private boolean continousLoop=true;
	    private boolean mergePatientIds=true;
	    private boolean processOcsCounts=false;

		public PatientMergeConfig(InputStream configFileStream) throws Exception
		{
			//  Use SAXBuilder
			Document doc = null;
			SAXBuilder builder = new SAXBuilder();
			doc = builder.build(configFileStream);
			Element root = doc.getRootElement();
			setSettings(root);
		}
		
		
		private void setSettings(Element root)
		{
			List elemntList;
			elemntList = root.getChildren("parameter");
			Iterator parameterIterator = elemntList.iterator();
	        String entName;

			while(parameterIterator.hasNext())
			{
				Element parameterElement = (Element)parameterIterator.next();
				String parameterName = parameterElement.getAttributeValue("name","");
				
	            if (parameterName.equals("sleep_interval"))
	            {
	                // Sleep Interval is specified in seconds, sleep requires milliseconds - default 5 minutes
	                sleepInterval = (Long.parseLong(parameterElement.getAttributeValue("value", "300")) * 1000);
	            }
	            
	            if (parameterName.equals("continous_loop"))
	            {
	            	String tmpStr = parameterElement.getAttributeValue("value", "");
	            	if (tmpStr.equalsIgnoreCase("false") || tmpStr.equalsIgnoreCase("no"))
	            		continousLoop=false;
	            	else
	            		continousLoop=true;
	            }
	            if (parameterName.equals("merge_patient_ids"))
	            {
	            	String tmpStr = parameterElement.getAttributeValue("value", "");
	            	if (tmpStr.equalsIgnoreCase("false") || tmpStr.equalsIgnoreCase("no"))
	            		mergePatientIds=false;
	            	else
	            		mergePatientIds=true;
	            }
	            if (parameterName.equals("process_ocs_counts"))
	            {
	            	String tmpStr = parameterElement.getAttributeValue("value", "");
	            	if (tmpStr.equalsIgnoreCase("true") || tmpStr.equalsIgnoreCase("yes"))
	            		processOcsCounts=true;
	            	else
	            		processOcsCounts=false;
	            }
	        }

	          /*
	           * Entities can be excluded from the entity list.  These are
	           * usually demographic tables.
	           */
			excludeEntities = new Hashtable<String,String>();
	        elemntList = root.getChildren("excludeEntities");
	        Iterator tableIterator = elemntList.iterator();

	         while(tableIterator.hasNext())
	         {
	             Element tableElement = (Element)tableIterator.next();
	             List tabList=tableElement.getChildren("entity");
	             for (int i=0; i<tabList.size(); i++)
	             {
	                 Element tab = (Element)tabList.get(i);

	                 entName = tab.getAttributeValue("name", "");
	                 excludeEntities.put(entName, entName);
	             }
	            }
	            
			}

	    public boolean isExcluded(String entity)
	    {
	        if (excludeEntities.containsKey(entity) || excludeEntities.contains(toShortName(entity)))
	            return true;
	        if (entity.equals(PATIENT_CLASS))
	        	return true;
	        return false;
	    }

		private String toShortName(String entity)
		{
			return entity.substring(entity.lastIndexOf('.')+1);
		}


		/**
		 * @return Returns the continousLoop.
		 */
		public boolean isContinousLoop() {
			return continousLoop;
		}
	    public long getSleepInterval()
	    {
	        return sleepInterval;
	    }

		public boolean isMergePatientIds() {
			return mergePatientIds;
		}


		public void setMergePatientIds(boolean mergePatientIds) {
			this.mergePatientIds = mergePatientIds;
		}
		
	}


	public boolean isRunning() 
	{
		return getMergerThread().isAlive();
	}



	public void shutdown() 
	{
		if (mergerThread != null)
		{
			getMergerThread().interrupt();
			
			mergerThread=null;
		}
	}



	public void startup() throws Exception 
	{
		if (mergerThread == null || !mergerThread.isAlive())
			init();
	}
	
	public int getNumFailedMerges()
	{
		return numFailedMerges;
	}
	
	public int getNumSuccessMerges()
	{
		return numSuccessMerges;
	}

	public int getErrorCount() 
	{
		return numFailedMerges;
	}

	public int getSuccessfulCount() 
	{
		return numSuccessMerges;
	}



	public IPatMergeInterfaceComponent getPatMerge() 
	{
		return patMergeThread;
	}
}

