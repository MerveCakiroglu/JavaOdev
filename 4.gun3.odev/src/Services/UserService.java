package Services;

import entities.User;

public interface UserService {
	void register(User user);
	void update(User user);
	void delete(User user);
}
 