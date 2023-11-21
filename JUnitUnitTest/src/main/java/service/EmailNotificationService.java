package service;

import model.User;

public interface EmailNotificationService {
		
	void scheduleEmailConfirmation(User user);
	
}
