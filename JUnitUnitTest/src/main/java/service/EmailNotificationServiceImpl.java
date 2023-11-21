package service;

import model.User;

public class EmailNotificationServiceImpl implements EmailNotificationService {

	@Override
	public void scheduleEmailConfirmation(User user) {
	
		System.out.println("Add email notification into email queue when user is created");

	}

}
