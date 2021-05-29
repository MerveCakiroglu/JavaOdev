package Managers;

import Services.UserValidationService;
import entities.User;

public class UserValidationManager implements UserValidationService{

	@Override
	public boolean userValidation(User user) {
		return true;
	}

}
