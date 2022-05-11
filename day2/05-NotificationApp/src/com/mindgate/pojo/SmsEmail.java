package com.mindgate.pojo;

import com.mindgate.service.Notification;

public class SmsEmail implements Notification {

	@Override
	public void sendNotificaton(String to, String message) {
		System.out.println("sending Email sms notification");
		System.out.println("to  :  "+to);
		System.out.println("Message  : "+message);
		
	}

}
