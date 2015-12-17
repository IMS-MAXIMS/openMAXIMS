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

import ims.configuration.EnvironmentConfig;
import java.util.Properties;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.tomcat.dbcp.dbcp.BasicDataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class QuartzProperties
{
	public static Properties getProperties()
	{		
		try 
		{
			InitialContext cxt = new InitialContext();
			Object datasource =  cxt.lookup( "java:/comp/env/jdbc/" + EnvironmentConfig.getMainDataSourceName());
			String driverDB   = null;
			String urlDB 	  = null;
			String userDB 	  = null;
			String passwordDB = null;
			
			if (datasource instanceof ComboPooledDataSource)
			{				
				driverDB   = ((ComboPooledDataSource)datasource).getDriverClass();
				urlDB 	   = ((ComboPooledDataSource) datasource).getJdbcUrl();
				userDB 	   = ((ComboPooledDataSource) datasource).getUser();
				passwordDB = ((ComboPooledDataSource) datasource).getPassword();
			}
			else if (datasource instanceof BasicDataSource)
			{
				driverDB   = ((BasicDataSource)datasource).getDriverClassName();
				urlDB 	   = ((BasicDataSource)datasource).getUrl();
				userDB 	   = ((BasicDataSource)datasource).getUsername();
				passwordDB = ((BasicDataSource)datasource).getPassword();
			}
			
			
			Properties props = new Properties();
						
			// Configure Main Scheduler Properties
			props.setProperty("org.quartz.scheduler.instanceName", "QuartzCluster");
			props.setProperty("org.quartz.scheduler.instanceId", "AUTO");
			
			// Configure ThreadPool
			props.setProperty("org.quartz.threadPool.class", "org.quartz.simpl.SimpleThreadPool");
			props.setProperty("org.quartz.threadPool.threadCount", "10");
			props.setProperty("org.quartz.threadPool.threadPriority", "5");
			props.setProperty("org.quartz.threadPool.threadsInheritContextClassLoaderOfInitializingThread", "true");
			
			//Skip update check
			props.setProperty("org.quartz.scheduler.skipUpdateCheck", "true");
			
			// Configure JobStore
			props.setProperty("org.quartz.jobStore.misfireThreshold", "60000");
			props.setProperty("org.quartz.jobStore.isClustered", "true");
			props.setProperty("org.quartz.jobStore.clusterCheckinInterval", "120000");
			props.setProperty("org.quartz.jobStore.class", "org.quartz.impl.jdbcjobstore.JobStoreTX");
			props.setProperty("org.quartz.jobStore.driverDelegateClass", "org.quartz.impl.jdbcjobstore.StdJDBCDelegate");
			props.setProperty("org.quartz.jobStore.dataSource", "myDS");
			props.setProperty("org.quartz.jobStore.tablePrefix", "QRTZ_");
			props.setProperty("org.quartz.jobStore.useDBLocks", "true");
			
			if (driverDB.equals("oracle.jdbc.driver.OracleDriver")) {
				props.setProperty("org.quartz.jobStore.selectWithLockSQL", "select * from {0}locks updlock where lock_name= ?");
			}
			else {
				props.setProperty("org.quartz.jobStore.selectWithLockSQL", "select lock_name from {0}locks with (updlock,rowlock) where lock_name=?");
			}
			
			// Configure Datasources
			props.setProperty("org.quartz.dataSource.myDS.driver", driverDB);
			props.setProperty("org.quartz.dataSource.myDS.URL", urlDB);
			props.setProperty("org.quartz.dataSource.myDS.user", userDB);
			props.setProperty("org.quartz.dataSource.myDS.password", passwordDB);
			props.setProperty("org.quartz.dataSource.myDS.maxConnections", "5");
			
			return props;
		} 
		catch (NamingException err) 
		{		
			System.out.println(err.getMessage());			
		}				
		
		return null;		
	}
}
