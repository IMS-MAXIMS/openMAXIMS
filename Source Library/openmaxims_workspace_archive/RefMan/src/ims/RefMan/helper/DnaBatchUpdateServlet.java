package ims.RefMan.helper;

import ims.configuration.EnvironmentConfig;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

import javax.naming.InitialContext;
import javax.naming.NameNotFoundException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.sql.DataSource;

import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleTrigger;
import org.quartz.impl.StdSchedulerFactory;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;


public class DnaBatchUpdateServlet extends HttpServlet
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void init()throws ServletException
	{
		try 
		{
			scheduleJob();
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
	//This method will retrieve the information of the job from the database and create the scheduler again
	private void scheduleJob() throws ClassNotFoundException 
	{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		try 
		{	
			//Connection to the DB using JDBC
			
			Connection con = retrieveJdbcDatasourceConnection();
			
			Statement stmt = con.createStatement();
			ResultSet result = stmt.executeQuery("SELECT * FROM SCHL_DNABACTCHJOB");
			while (result.next())
			{
				String jobDetail=result.getString("jobdetail");
				String cron=result.getString("cron");
				String cronFebruary=result.getString("cronfebrua");
				Boolean isSimpleCron=result.getBoolean("issimplecr");
				int id=result.getInt("id");
				String frecuency=result.getString("triggerFre");
				SchedulerFactory sf = new StdSchedulerFactory();
				Scheduler sched=sf.getScheduler();
				XStream xS=new XStream(new DomDriver());
				JobDetail jd=(JobDetail)xS.fromXML(jobDetail);
				SimpleTrigger st=null;
				CronTrigger ct=null;
				CronTrigger februaryCron=null;
				if (cronFebruary!=null)
					februaryCron=(CronTrigger) xS.fromXML(cronFebruary);
				if (isSimpleCron)
				{
					st=(SimpleTrigger)xS.fromXML(cron);
					st.setNextFireTime(getNextFireTime(con, id, frecuency, st.getNextFireTime()));


					sched.scheduleJob(jd, st);
				}
				else
				{
					ct=(CronTrigger)xS.fromXML(cron);
					ct.setNextFireTime(getNextFireTime(con, id, frecuency, ct.getNextFireTime()));


					sched.scheduleJob(jd, ct);
					
				}
				if (cronFebruary!=null)
				{
					februaryCron=(CronTrigger) xS.fromXML(cronFebruary);
					sched.scheduleJob(februaryCron);
				}
				
				sched.start();
				con.close();
			}
				
				
			
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	private Date getNextFireTime(Connection con, int id, String frecuency, Date triggerDate) throws SQLException 
			
	{
		Calendar cal=Calendar.getInstance();
		int days=0;
		boolean isWeekly=false;
		boolean isMonthly=false;
		//If the date of the next run of the job is in the past we have to calculate the new date for the next run.
		while (triggerDate.compareTo(new Date())<0)
		{
			if (days==0)
			{
				StringTokenizer token=new StringTokenizer(frecuency," ");
				token.nextToken();
				String tok=token.nextToken();
				try
				{
					days=Integer.parseInt(tok);
					cal.setTime(triggerDate);
					cal.add(Calendar.DATE, days);
					triggerDate=cal.getTime();
				}
				catch (NumberFormatException e)
				{
					if (tok.equals("month"))
					{
						cal.setTime(triggerDate);
						cal.add(Calendar.MONTH,1);
						triggerDate=cal.getTime();
						isMonthly=true;
					}
					else
					{
						cal.setTime(triggerDate);
						cal.add(Calendar.DATE,7);
						triggerDate=cal.getTime();
						isWeekly=true;
					}
				}	
			}
			else
			{
				if (!isWeekly && !isMonthly)
				{
					cal.add(Calendar.DATE, days);
					triggerDate=cal.getTime();
				}
				else if (isWeekly)
				{
					cal.add(Calendar.DATE, 7);
					triggerDate=cal.getTime();
				}
				else if (isMonthly)
				{
					cal.add(Calendar.MONTH, 1);
					triggerDate=cal.getTime();
				}
			}
		}
		PreparedStatement updateDna=con.prepareStatement("UPDATE SCHL_DNABACTCHJOB SET NEXTRUN=? WHERE ID=" + id);
		java.sql.Timestamp data=new java.sql.Timestamp(triggerDate.getTime());
		updateDna.setTimestamp(1, data);
		updateDna.executeUpdate();
		return triggerDate;
	}
	private Connection retrieveJdbcDatasourceConnection() throws Exception
	{
		javax.naming.Context initCtx = new InitialContext();
		Connection con=null;
//		String appServer = ConfigFlag.APPSERVER_TYPE.getValue();
//		if (appServer.equals(AppServer.WEBSPHERE) || appServer.equals(AppServer.TOMCAT))
//		{
			initCtx = (javax.naming.Context) initCtx.lookup("java:comp/env");
//		}
		try
		{
			String environment = EnvironmentConfig.getMainDataSourceName();
			DataSource dataSource =(DataSource) initCtx.lookup("jdbc/" + environment);
			con = dataSource.getConnection();
		}
		
		catch (NameNotFoundException e)
		{
			System.out.println("No jdbc datasources are configured for this project.");
		}
		return con;
	}
}
		
