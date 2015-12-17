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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import ims.admin.vo.domain.AppUserNotificationVoAssembler;
import ims.configuration.EnvironmentConfig;
import ims.core.admin.domain.objects.Notifications;
import ims.core.admin.domain.objects.QueuedNotification;
import ims.core.configuration.domain.objects.AppUser;
import ims.core.vo.NotificationVo;
import ims.core.vo.QueuedNotificationVo;
import ims.core.vo.domain.NotificationVoAssembler;
import ims.core.vo.domain.QueuedNotificationVoAssembler;
import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.impl.DomainImpl;
import ims.framework.enumerations.NotificationDelivery;
import ims.framework.enumerations.NotificationPriority;
import ims.framework.exceptions.CodingRuntimeException;
import ims.framework.interfaces.INotification;
import ims.framework.interfaces.INotificationsProvider;
import ims.framework.interfaces.IQueuedNotification;
import ims.framework.interfaces.IUINotification;
import ims.framework.utils.Date;
import ims.framework.utils.DateTime;

public class NotificationsProvider extends DomainImpl implements INotificationsProvider
{   
	private static final long serialVersionUID = 1L;
	
	public boolean hasUnseenNotifications(int userId) 
	{
		return getUnseenNotificationsCount(userId) > 0 ? true : false;
	}
	public IUINotification[] getUnseenNotifications(int userId) 
	{
		return getNotifications(userId, false, EnvironmentConfig.getResultSetDefaultMax());
	}	
	public int getUnseenNotificationsCount(int userId) 
	{
		DomainFactory factory = getDomainFactory();

		String hql = "select count(n.id) from Notifications n where n.seen = 0 and n.user.id = :userIden";
		
		Object[] count = factory.find(hql, new String[] {"userIden"}, new Object[] {userId}).toArray();
		
		if(count != null && count.length > 0)
			return ((Long) count[0]).intValue();
		
		return 0;
	}	
	public void markAsSeen(IUINotification notification) 
	{
		if(notification == null)
			throw new CodingRuntimeException("Notification passed into markAsSeen is null.");
		
		DomainFactory factory = getDomainFactory();
		
		NotificationVo notificationVo = NotificationVoAssembler.create((Notifications) factory.getDomainObject(Notifications.class, notification.getINotificationId()));
		
		notificationVo.setSeen(Boolean.TRUE);
		notificationVo.setSeenAt(new DateTime());
		
		notificationVo.validate();
		
		try 
		{
			factory.save(NotificationVoAssembler.extractNotifications(factory, notificationVo));
		} 
		catch (StaleObjectException e) 
		{
			throw new RuntimeException(e);
		}
	}
	public void markAllAsSeen(int userId) 
	{
		IUINotification[] unseen = getUnseenNotifications(userId);
		if(unseen != null)
		{
			for(int x = 0; x < unseen.length; x++)
			{
				markAsSeen(unseen[x]);
			}
		}
	}	
	public void setUserNotified(INotification notification) 
	{
		if(notification == null)
			throw new CodingRuntimeException("Notification passed into setUserNotified is null.");
		
		DomainFactory factory = getDomainFactory();
		
		NotificationVo notificationVo = NotificationVoAssembler.create((Notifications) factory.getDomainObject(Notifications.class, notification.getINotificationId()));
		
		notificationVo.setUserNotified(true);		
		
		notificationVo.validate();
		
		try 
		{
			factory.save(NotificationVoAssembler.extractNotifications(factory, notificationVo));
		} 
		catch (StaleObjectException e) 
		{
			throw new RuntimeException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public IUINotification[] getNotifications(int userId, boolean seen, int maxNumberOfNotifications) 
	{
		DomainFactory factory = getDomainFactory();

		String hql = "from Notifications n";
		StringBuffer condStr = new StringBuffer();
		String andStr = "";
		
		ArrayList<String> markers = new ArrayList<String>();
		ArrayList<Serializable> values = new ArrayList<Serializable>();
		
		List userNotificationsList = null;
		
		condStr.append(andStr + " n.user.id = :userIden");
		markers.add("userIden");
		values.add(userId);
		andStr = " and";
		
		condStr.append(andStr + " n.seen = :isSeen");
		markers.add("isSeen");
		values.add(seen);
		andStr = " and";
		 
		hql += " where";
		hql += condStr.toString();
		
		hql += " order by n.dateTime desc";
		
		if(maxNumberOfNotifications > EnvironmentConfig.getResultSetDefaultMax())
			maxNumberOfNotifications = EnvironmentConfig.getResultSetDefaultMax();
		
		userNotificationsList = factory.find(hql, markers, values, maxNumberOfNotifications);
		
		return NotificationVoAssembler.createNotificationVoCollectionFromNotifications(userNotificationsList).toIUINotificationArray();
	}

	@SuppressWarnings("unchecked")
	public IUINotification[] getNotifications(int userId, Date dateFrom, Date dateTo, String message, String source, NotificationPriority priority, boolean seen) 
	{
		DomainFactory factory = getDomainFactory();

		String hql = "from Notifications n";
		StringBuffer condStr = new StringBuffer();
		String andStr = "";
		
		ArrayList<String> markers = new ArrayList<String>();
		ArrayList<Serializable> values = new ArrayList<Serializable>();
		
		List userNotificationsList = null;
		
		condStr.append(andStr + " n.user.id = :userIden");
		markers.add("userIden");
		values.add(userId);
		andStr = " and";
		
		if(dateFrom != null)
		{
			condStr.append(andStr + " n.dateTime >= :from");
			markers.add("from");
			values.add(dateFrom.getDate());
			dateFrom.getDate().toString();
			andStr = " and";
		}
		
		if(dateTo != null)
		{
			Date dateToClone = ((Date)dateTo.clone()).addDay(1);
			condStr.append(andStr + " n.dateTime < :to");
			markers.add("to");
			values.add(dateToClone.getDate());
			andStr = " and";
		}
		
		if(message != null)
		{
			condStr.append(andStr + " n.message like :mess");
			markers.add("mess");
			values.add("%" + message + "%");
			andStr = " and";
		}
		
		if(source != null)
		{
			condStr.append(andStr + " n.source like :src");
			markers.add("src");
			values.add("%" + source + "%");
			andStr = " and";
		}
		
		if(priority != null)
		{
			condStr.append(andStr + " n.priority = :pri");
			markers.add("pri");
			values.add(priority.getId());
			andStr = " and";
		}
		
		condStr.append(andStr + " n.seen = :isSeen");
		markers.add("isSeen");
		values.add(seen);
		andStr = " and";
		 
		hql += " where";
		hql += condStr.toString();
		
		hql += " order by n.priority asc, n.dateTime desc";
		
		userNotificationsList = factory.find(hql, markers, values);
		
		return NotificationVoAssembler.createNotificationVoCollectionFromNotifications(userNotificationsList).toIUINotificationArray();
	}

	public IQueuedNotification getQueuedNotification(int queuedNotificationId) 
	{
		return QueuedNotificationVoAssembler.create((QueuedNotification)getDomainFactory().getDomainObject(QueuedNotification.class, queuedNotificationId));
	}
	public IQueuedNotification[] queueNotification(int userId, NotificationPriority priority, String message, String source, String entityName, Integer entityId, NotificationDelivery[] delivery) throws Exception 	
	{
		IQueuedNotification[] result = new IQueuedNotification[delivery.length]; 
		                    
		DomainFactory factory =  getDomainFactory();
		for(int x = 0; x < delivery.length; x++)
		{
			QueuedNotificationVo valueObject = new QueuedNotificationVo();
			
			valueObject.setDateTime(new DateTime());
			valueObject.setUserId(userId);
			valueObject.setPriority(priority.getId());
			valueObject.setMessage(message);
			valueObject.setSource(source);
			valueObject.setEntityType(entityName);
			valueObject.setEntityId(entityId);
			valueObject.setDeliveryMethod(delivery[x].getId());
			
			String[] errors = valueObject.validate();
			if(errors != null && errors.length > 0)
				throw new Exception("Unable to queue notifications because of validation errors");
			
			QueuedNotification domainObject = QueuedNotificationVoAssembler.extractQueuedNotification(factory, valueObject);
			factory.save(domainObject);
			valueObject = QueuedNotificationVoAssembler.create(domainObject);
			result[x] = valueObject;
		}
		
		return result;
	}
	public void removeQueuedNotification(IQueuedNotification notification) throws Exception 
	{
		DomainFactory factory =  getDomainFactory();
		QueuedNotification domainObject = (QueuedNotification)factory.getDomainObject(QueuedNotification.class, notification.getINotificationId());
		if(domainObject != null)
		{
			factory.delete(domainObject);
		}
	}
	
	public IUINotification createUINotification(IQueuedNotification notification) throws Exception 
	{
		if(notification == null)
			throw new CodingRuntimeException("Invalid notification.");
		
		if(notification.getINotificationMessage() == null)
			throw new CodingRuntimeException("Notification message is null.");
		
		if(notification.getINotificationPriority() == null)
			throw new CodingRuntimeException("Notification priority is null.");
		
		NotificationVo instance = new NotificationVo();
		DomainFactory domainFactory = this.getDomainFactory();
		
		AppUser doUser = (AppUser)domainFactory.getDomainObject(AppUser.class, notification.getINotificationUserId());
		
		if(doUser == null)
			throw new DomainRuntimeException("Invalid User Id passed into createNotification.");
		
		instance.setUser(AppUserNotificationVoAssembler.create(doUser));
		instance.setDateTime(new DateTime());
		instance.setNotificationPriority(notification.getINotificationPriority().getId());
		instance.setMessage(notification.getINotificationMessage());
		instance.setSource(notification.getINotificationSource());
		instance.setSeen(Boolean.FALSE);
		
		if(notification.getINotificationEntityType() != null)
		{
			instance.setEntityType(notification.getINotificationEntityType());
			instance.setEntityId(notification.getINotificationEntityId());
		}
		
		String[] errors = instance.validate();
		if(errors != null && errors.length > 0)
		{
			throw new RuntimeException("Validation errors while creating a user notification.");
		}
		
		try 
		{
			ims.core.admin.domain.objects.Notifications doNotification = NotificationVoAssembler.extractNotifications(domainFactory, instance);
			domainFactory.save(doNotification);
			instance = NotificationVoAssembler.create(doNotification);			
		} 
		catch (StaleObjectException e) 
		{
			throw new RuntimeException(e);
		}
		
		return instance;
	}
}
