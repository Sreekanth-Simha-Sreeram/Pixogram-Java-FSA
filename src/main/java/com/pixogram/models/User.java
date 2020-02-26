package com.pixogram.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {
	
	
	   @Id
	   @Column(name="userId")
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
       int userId;	
	   @Column(name="userFirstName")
       String userFirstName;
	  
	   @Column(name="userLastName")
       String userLastName;
	   
	   @Column(name="userName")
       String userName;
	
	   @Column(name="userEmail")
	   String userEmail;
	   
	   @Column(name="userPassword")
       String userPassword;
	   
	   @Column(name="profilePicture")
       String profilePicture;
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getUserFirstName() {
	return userFirstName;
}
public void setUserFirstName(String userFirstName) {
	this.userFirstName = userFirstName;
}
public String getUserLastName() {
	return userLastName;
}
public void setUserLastName(String userLastName) {
	this.userLastName = userLastName;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getUserEmail() {
	return userEmail;
}
public void setUserEmail(String userEmail) {
	this.userEmail = userEmail;
}
public String getUserPassword() {
	return userPassword;
}
public void setUserPassword(String userPassword) {
	this.userPassword = userPassword;
}
public String getProfilePicture() {
	return profilePicture;
}
public void setProfilePicture(String profilePicture) {
	this.profilePicture = profilePicture;
}
	
}
