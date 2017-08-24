package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.Model.User;
import com.example.Repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManageApplicationTests {
    @Autowired
    private UserRepository userRepository;
    
	@Test
	public void contextLoads() {
	}
      
    @Test  
    public void testEntity() {  
        User user = new User();  
        user.setName("jiang1004");
        user.setNickname("江江1004");
        user.setPassword("123456");
        userRepository.save(user);
          
        User user1 = userRepository.findOne(user.getId());  
        System.out.println("User info:" + user1);  
    } 
}
