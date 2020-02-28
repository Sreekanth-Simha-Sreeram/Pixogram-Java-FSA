package com.pixogram.test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.pixogram.models.User;

public class TestBoundary {

	 @Test
	    public void testpasswordLength()
	    {
	        User user=new User();
	        user.setUserId(1);
			user.setUserFirstName("meghana");
			user.setUserLastName("g");
			user.setUserName("meghana1234");
			user.setUserEmail("meghana6116@gmail.com");
			user.setUserPassword("meghana12");
			user.setProfilePicture("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");


	        int passwordLength=10;
	assertEquals(passwordLength,user.getUserPassword().length());


	    }
	 
	  @Test
	    public void testEmail()
	    {
	        User user=new User();
	        user.setUserId(1);
			user.setUserFirstName("meghana");
			user.setUserLastName("g");
			user.setUserName("meghana1234");
			user.setUserEmail("meghana6116@gmail.com");
			user.setUserPassword("meghana12");
			user.setProfilePicture("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");
	        assertNotNull(user.getUserEmail());


	    }
	  
	  @Test
	    public void testUserName()
	    {
		  User user=new User();
	        user.setUserId(1);
			user.setUserFirstName("meghana");
			user.setUserLastName("g");
			user.setUserName("meghana1234");
			user.setUserEmail("meghana6116@gmail.com");
			user.setUserPassword("meghana12");
			user.setProfilePicture("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");
	        assertNotNull(user.getUserName());

	    }

	
}
