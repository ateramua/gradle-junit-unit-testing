package data;

import java.util.HashMap;
import java.util.Map;

import model.User;

public class UserRepositoryImpl implements UserRepository {
	
	Map<String, User> users = new HashMap<String, User>();

	@Override
	public boolean save(User user) {
		boolean returnValue = false;
		System.out.println("The actual save method is invoked");
		if(!users.containsKey(user.getId())) {
			users.put(user.getId(),user);
			returnValue = true;
		}
		return returnValue;
	}

}
