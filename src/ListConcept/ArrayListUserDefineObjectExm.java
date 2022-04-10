package ListConcept;

import java.util.ArrayList;
import java.util.List;

public class ArrayListUserDefineObjectExm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<User> users = new ArrayList<>();
		users.add(new User("John", 25));
		users.add(new User("Apple", 26));
		users.add(new User("Ball", 27));

		 users.forEach(user -> {
	            System.out.println("Name : " + user.getName() + ", Age : " + user.getAge());
	        });
		

	}

}
