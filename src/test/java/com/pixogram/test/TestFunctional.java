package com.pixogram.test;


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pixogram.models.*;
import com.pixogram.services.*;

import junit.framework.Assert;

public class TestFunctional {
	
	
	@Test
	public void testRegister()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("pixogram-application.xml");

		User user = new User();

		user.setUserId(1);
		user.setUserFirstName("meghana");
		user.setUserLastName("g");
		user.setUserName("meghana1234");
		user.setUserEmail("meghana6116@gmail.com");
		user.setUserPassword("meghana12");
		user.setProfilePicture("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");
		
		UserService userservice=(UserService) context.getBean("userservice");
		userservice.register(user);
		User userfromdb =userservice.getProfile(user.getUserId());
		assertSame(user,userfromdb);
	}
	
	
	@Test
	public void testUpdateProfile()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("pixogram-application.xml");
		User user = new User();

		user.setUserId(1);
		user.setUserFirstName("meghana");
		user.setUserLastName("g");
		user.setUserName("meghana1234");
		user.setUserEmail("meghana6116@gmail.com");
		user.setUserPassword("meghana12");
		user.setProfilePicture("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");
		
		UserService userservice=(UserService) context.getBean("userservice");
		boolean isUpdated =userservice.updateProfile(user);
		assertEquals("1",isUpdated);

	
	}
	
	@Test
	public void testGetProfile() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Stock-application.xml");
		User user = new User();

		user.setUserId(1);
		user.setUserFirstName("meghana");
		user.setUserLastName("g");
		user.setUserName("meghana1234");
		user.setUserEmail("meghana6116@gmail.com");
		user.setUserPassword("meghana12");
		user.setProfilePicture("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");
		UserService userservice=(UserService) context.getBean("userservice");
		User userfromdb =userservice.getProfile(user.getUserId());
		assertEquals(user,userfromdb);
	}
	
	@Test
	public void testDeleteProfile() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("pixogram-application.xml");
		User user = new User();

		user.setUserId(1);
		user.setUserFirstName("meghana");
		user.setUserLastName("g");
		user.setUserName("meghana1234");
		user.setUserEmail("meghana6116@gmail.com");
		user.setUserPassword("meghana12");
		user.setProfilePicture("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");
		UserService userservice=(UserService) context.getBean("userservice");
		boolean userdeleted =userservice.deleteProfile(user.getUserId());
		assertEquals("1",userdeleted,"should delete from db");
	}
	
	@Test
	public void testAddContent()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("pixogram-application.xml");
		Content content = new Content();
		
		content.setContentId(1);
		content.setImagePath("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");
		content.setVideoPath("");
		content.setCaption("i like this");
		content.setDescription("i too like this");
		content.setUserId(1);
		content.setVisibility(true);
		
		UserService userservice=(UserService) context.getBean("userService");
		 //List tasks=projectManagerService.viewTask(task);
		 //assertNotNull(tasks);
		boolean iscontentadded = userservice.addContent((List<Content>) content, content.getUserId());
		assertEquals("1",iscontentadded,"should add content to db");
		Content Contentfromdb = userservice.getContent(content.getContentId());
		assertSame(content,Contentfromdb);

	}
	
	@Test
	public void testGetContent()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("pixogram-application.xml");
		Content content = new Content();
		
		content.setContentId(1);
		content.setImagePath("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");
		content.setVideoPath("");
		content.setCaption("i like this");
		content.setDescription("i too like this");
		content.setUserId(1);
		content.setVisibility(true);
		
		UserService userservice=(UserService) context.getBean("userService");
		 //List tasks=projectManagerService.viewTask(task);
		 //assertNotNull(tasks);
		Content Contentfromdb = userservice.getContent(content.getContentId());
		assertSame(content,Contentfromdb);

	}
	
	
	@Test
	public void testUpdateContent()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("pixogram-application.xml");
Content content = new Content();
		User user= new User();
		user.setUserId(1);
		content.setContentId(1);
		content.setImagePath("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");
		content.setVideoPath("");
		content.setCaption("i like this");
		content.setDescription("i love this");
		content.setUserId(1);
		content.setVisibility(true);
		
		UserService userservice=(UserService) context.getBean("userservice");
		boolean isUpdated =userservice.updateContent(user.getUserId(),content);
		assertEquals("1",isUpdated,"should be updated");	
	}
	
	@Test
	public void testAddComment()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("pixogram-application.xml");
		Feedback feedback = new Feedback();
		
		feedback.setFeedbackId(1);
		feedback.setUserId(1);
		feedback.setCommment("it is nice");
		feedback.setSenderId(2);
		feedback.setLike(true);
		
		UserService userservice=(UserService) context.getBean("userService");
		 //List tasks=projectManagerService.viewTask(task);
		 //assertNotNull(tasks);
		boolean iscommentadded = userservice.addComment(feedback);
		assertEquals("1",iscommentadded,"should add content to db");
		

	}
	
	@Test
	public void testGetUser() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Stock-application.xml");
		User user = new User();

		user.setUserId(1);
		user.setUserFirstName("meghana");
		user.setUserLastName("g");
		user.setUserName("meghana1234");
		user.setUserEmail("meghana6116@gmail.com");
		user.setUserPassword("meghana12");
		user.setProfilePicture("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");
		UserService userservice=(UserService) context.getBean("userservice");
		User userfromdb =userservice.getUserById(user.getUserId());
		assertEquals(user,userfromdb);
	}
	
	@Test
	public void testGetContentByUser()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("pixogram-application.xml");
		Content content = new Content();
		User user = new User();
		
		content.setContentId(1);
		content.setImagePath("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");
		content.setVideoPath("");
		content.setCaption("i like this");
		content.setDescription("i too like this");
		content.setUserId(1);
		content.setVisibility(true);
		
		UserService userservice=(UserService) context.getBean("userService");
		 //List tasks=projectManagerService.viewTask(task);
		 //assertNotNull(tasks);
		List<Content> Contentfromdb = userservice.getContentByUser(user.getUserId());
		assertSame(content,Contentfromdb);

	}
	
	
	
	
	
	

}
