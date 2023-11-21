package service;

import model.User;
import data.UserRepository;

public class UserServiceImpl implements UserService {
	UserRepository userRepository;
	EmailNotificationService emailNotificationService;

	public UserServiceImpl(UserRepository userRepository, EmailNotificationService emailNotificationService) {
		this.userRepository = userRepository;
		this.emailNotificationService = emailNotificationService;
	}

	@Override
	public User createUser(String firstName, String lastName, String email, String id, String password,
			String repeatPassword) {

		if (firstName == null || firstName.trim().length() == 0) {
			throw new IllegalArgumentException("User's first name is empty");
		}

		if (lastName == null || lastName.trim().length() == 0) {
			throw new IllegalArgumentException("User's last name is empty");
		}

		User user = new User(firstName, lastName, email, id, password, repeatPassword);

		boolean isUserCreated;

		try {
			isUserCreated = userRepository.save(user);
		} catch (RuntimeException ex) {
			throw new UserServiceException(ex.getMessage());
		}

		if (!isUserCreated)
			throw new UserServiceException("Could NOT create user");

		try {

			emailNotificationService.scheduleEmailConfirmation(user);

		} catch (RuntimeException ex) {
			throw new UserServiceException(ex.getMessage());
		}

		return user;
	}

}
