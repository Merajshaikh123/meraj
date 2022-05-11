package com.mindgate.pojo;

import com.mindgate.service.Notification;

public class SmsNotification implements Notification  {
	@Override
	public void sendNotificaton(String to,String message) {
		System.out.println("sending sms notification");
		System.out.println("to  :  "+to);
		System.out.println("Message  : "+message);
	}

}
