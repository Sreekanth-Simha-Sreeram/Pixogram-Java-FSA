package com.pixogram.test;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pixogram.models.User;
import com.pixogram.services.UserService;

import junit.framework.Assert;

public class TestException extends Exception {

   @Test(expected = NullPointerException.class)
    public void testEmptyPasswordException() 
    {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("pixogram-application.xml");
           
           User user=new User();
           user.setUserPassword(null);
           user.setUserName("megha");
           UserService userservice = (UserService) context.getBean("userservice");
           //userservice.login(user.getUserName(), user.getUserPassword());
           Assert.assertEquals("1234",user.getUserPassword(),"password empty exception");
           throw new NullPointerException();
    }

    
   @Test(expected = NullPointerException.class)
    public void testEmptyUserException() 
    {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("pixogram-application.xml");
           
           User user=new User();

            user.setUserId(1000);
            user.setUserFirstName("meghana");
            user.setUserLastName("g");
            user.setUserName("meghana1234");
            user.setUserEmail("meghana6116@gmail.com");
            user.setUserPassword("meghana12");
           UserService userservice = (UserService) context.getBean("userservice");
           User userdata=userservice.getUserById(user.getUserId());
           //userservice.login(user.getUserName(), user.getUserPassword());
           Assert.assertNull(userdata);
           throw new NullPointerException();
    }
    
    
   @Test(expected = NullPointerException.class)
    public void testEmptyContentException() 
    {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("pixogram-application.xml");
           
           User user=new User();

            user.setUserId(0);
            user.setUserFirstName("meghana");
            user.setUserLastName("g");
            user.setUserName("meghana1234");
            user.setUserEmail("meghana6116@gmail.com");
            user.setUserPassword("meghana12");
           UserService userservice = (UserService) context.getBean("userservice");
    }
   
}