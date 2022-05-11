package com.mindgate.factory;

import com.mindgate.pojo.SmsEmail;
import com.mindgate.pojo.SmsNotification;
import com.mindgate.pojo.SmsWhatsapp;
import com.mindgate.service.Notification;

public class NotificationFactory {
	public static Notification getNotification(int choice) {
		Notification notification=null;
		switch(choice) {
		case 1:
			notification=new SmsWhatsapp();
			break;
		case 2:
			notification=new SmsNotification();
			break;
		case 3:
			notification=new SmsEmail();
		}
		return notification;
	}

}
