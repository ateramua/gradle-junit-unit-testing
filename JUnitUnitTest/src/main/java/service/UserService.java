package service;

import model.User;

public interface UserService {

		User createUser(String firstName,
						String lastName,
						String email,
						String id,
						String password,
						String repeatPassword);
}


//An interface - a reference type with some method contracts
//The interface method createUser has return type and parameters. The return type is User class and the parameter is of string data type
//The method that implements this method should also have a parameter and return type