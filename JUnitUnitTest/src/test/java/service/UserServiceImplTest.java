package service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import data.UserRepository;
import model.User;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

	
	//thenThrow and thenReturn method DO NOT go with void methods
	//doNothing will override doThrow
	
	//methods with return type - thenThrow() and thenReturn(true)
	//Void methods - doThrow() and DoNothing()

	@InjectMocks
	UserServiceImpl  userService;
	
	
	@Mock
	EmailNotificationServiceImpl emailNotificationService;
	
	@Mock
	UserRepository userRepository;
	String firstName;
	String lastName;
	String email;
	String password;
	String repeatPassword;
	String id;

	

	
	@BeforeEach
	void init() {
		firstName = "Thomas";
	    lastName = "Mathew";
		email = "test@lesson.com";
		password = "test1234";
		repeatPassword = "test1234";
		id = "1234";
	}

	@Test
	void testCreateUser_WhenUseDetailsProvided_ReturnsUserObject() {
		
		//Arrange
		when(userRepository.save(any(User.class))).thenReturn(true);
		

		//Act
		User user = userService.createUser(firstName, lastName, email, id, password, repeatPassword);
	
		//Assert
		assertNotNull(user," user object should have values in it");
		assertEquals(firstName, user.getFirstName());

		//Verify method was only called one time
		verify(userRepository,times(1)).save(any(User.class));
		Mockito.verify(userRepository,Mockito.atLeast(0)).save(any(User.class));
		Mockito.verify(userRepository, Mockito.atMost(2)).save(any(User.class));
	}
	
	@Test
	void testCreateUser_WhenSaveMethodThrowsException_ThenThowsUserServiceException() {
		
		
		//Arrange - Exception Stabbing 
		when(userRepository.save(any(User.class))).thenThrow(RuntimeException.class); 
		
		//Assert - Exception is thrown
		assertThrows(UserServiceException.class, () -> {userService.createUser(firstName, lastName, email, id, password, repeatPassword);}, "Should have thrown user service exception");
		
	}
	
	@Test
	void testCreateUser_WhenEmailNotificationExceptionThrown_ThenThowsUserServiceException() {
		
		//Arrange
		when(userRepository.save(any(User.class))).thenReturn(true);
		
		//Act
		doThrow(EmailNotificationServiceException.class)
			.when(emailNotificationService)
			.scheduleEmailConfirmation(any(User.class));
		
//		doNothing()
//		.when(emailNotificationService)
//		.scheduleEmailConfirmation(any(User.class));
		
		//Assert
		assertThrows(UserServiceException.class, () -> {userService.createUser(firstName, lastName, email, id, password, repeatPassword);} ,"Should throw Email notification Service Exception");
	
	}
	
	@Test
	void testCreateUser_WhenUserIsCreated_ScheduleEmailConfirmation() {
		//Arrange
		when(userRepository.save(any(User.class))).thenReturn(true);
		doCallRealMethod().when(emailNotificationService).scheduleEmailConfirmation(any(User.class));
		
		//Act
		userService.createUser(firstName, lastName, email, id, password, repeatPassword);
	}

}
