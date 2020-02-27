package com.pixogram.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pixogram.dao.UserDao;
import com.pixogram.models.Content;
import com.pixogram.models.Feedback;
import com.pixogram.models.Followers;
import com.pixogram.models.LogActivities;
import com.pixogram.models.User;

import com.pixogram.services.UserService;

@Component
@Service ("UserService")
public class UserServiceImpl implements UserService {

	
	@Autowired
	UserDao userDao;
	
	@Transactional
	public boolean register(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public boolean login(String userName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public boolean resetPassword(String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public User getProfile(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public boolean updateProfile(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public boolean deleteProfile(int userId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public boolean addContent(List<Content> content, int userId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public List<Content> organizeImage(int userId, List<Content> content) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public List<Content> organizeVideo(int userId, List<Content> content) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Content getContent(int contentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public boolean updateContent(int userId, Content content) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public boolean addComment(Feedback feedback) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public boolean followUser(int userId, int senderId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public List<Followers> followList(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public boolean hideMedia(String imagePath, boolean visibility, String videoPath) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public List<LogActivities> activityLog(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public List<Content> getContentByUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
