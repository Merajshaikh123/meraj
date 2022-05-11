package com.mindgate.pojo;

import com.mindgate.service.Notification;

public class SmsWhatsapp implements Notification {
	@Override
	public void sendNotificaton(String to,String message) {
		System.out.println("sending Whatsapp notification notification");
		System.out.println("to  :  "+to);
		System.out.println("Message  : "+message);
	}

}
