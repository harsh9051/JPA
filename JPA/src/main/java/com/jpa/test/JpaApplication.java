package com.jpa.test;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRespository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpaApplication.class, args);
		UserRespository userRespository = context.getBean(UserRespository.class);
		
//		//Create the object of single user and storing it in the databse
//		User user = new User();
//		user.setName("Harsh");
//		user.setCity("kolkata"); 
//		user.setStatus("I am available");
//		
//	  User user1 = userRespository.save(user);
//	  System.out.println(user1);
		
		
		
//     Created multiple user and saved in the databse using list		

//		User user1 = new User();
//		user1.setName("Niyati");
//		user1.setCity("kolkata");
//		user1.setStatus("Available");
//		
//		User user2 = new User();
//		user2.setName("Rishab");
//		user2.setCity("kolkata");
//		user2.setStatus("Available");
//		
//		List<User> users = List.of(user1,user2);
//		
//		Iterable<User> resultIterable= userRespository.saveAll(users);
//		
//		resultIterable.forEach(user->{
//			System.out.println(user);
//		});
//		------------------------------------------------------------------------------------------------------------------
		
	
////     Updating the data
//		Optional<User> optional = userRespository.findById(3);
//		
//		User user = optional.get();
//		
//		user.setName("Rishab Jain");
//		
//		userRespository.save(user);
//		
////    delete the data
//		userRespository.deleteById(3);
		
		
//		Some of the predefined function can be used to accesss the data from db
//		
//		List<User> users = userRespository.findByName("Harsh");
//		users.forEach(r->System.out.println(r));
//		
//		List<User> usersfindby = userRespository.findByNameStartingWith("H");
//		System.out.println(usersfindby);
		
		List<User> allUser = userRespository.getAllUser();
		allUser.forEach(e->{
			System.out.println(e);
		});
		
		List<User> userByName = userRespository.getUserByName("Harsh");
		userByName.forEach(e->System.out.println(e)); 
		
		
	}

}
