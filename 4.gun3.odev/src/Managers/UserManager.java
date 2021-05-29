package Managers;

import Services.UserService;
import Services.UserValidationService;
import entities.User;

public class UserManager implements UserService {

private UserValidationService userCheck;
	
	public UserManager(UserValidationService userCheck) {
		this.userCheck = userCheck;
	}
	@Override
	public void register(User user) {
		if (userCheck.userValidation(user)) {
			System.out.println("User registered : " + user.getFirstName() + " " + user.getLastName());
		}else {
			System.out.println("Not a valid person");
		}
		
	}

	@Override
	public void update(User user) {
		if (userCheck.userValidation(user)) {
			System.out.println("User updated : " + user.getFirstName());
		}else {
			System.out.println("Not a valid person");
		}
		
		
	}

	@Override
	public void delete(User user) {
		if (userCheck.userValidation(user)) {
			System.out.println("User deleted : " + user.getFirstName());
		}else {
			System.out.println("Not a valid person");
		}
		
	}

}
