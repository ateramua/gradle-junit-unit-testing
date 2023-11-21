package model;

public class User {
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String repeatPassword;
	private String id;
	

	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassoword() {
		return password;
	}
	
	public String getId() {
		return id;
	}
	
	public String getRepeatPassword() {
		return repeatPassword;
	}
	
	public User(String firstName, String lastName,String email,String id, String password, String repeatPassword) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
		this.repeatPassword = repeatPassword;
		this.id = id;
	}


	//instance variables were initialized using a constructor to set the initial values of the variables
	//
	

}
