package com.pixogram.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Feedback")
public class Feedback {
	
	   @Id
	   @Column(name="feedbackId")
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
       int feedbackId;
	   
	   @Column(name="userId")
       int userId;
	   
	   @Column(name="commment")
       String commment;
	   
	   @Column(name="senderId")
       int senderId;
	   
	   @Column(name="like")
       boolean like;
public int getFeedbackId() {
	return feedbackId;
}
public void setFeedbackId(int feedbackId) {
	this.feedbackId = feedbackId;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getCommment() {
	return commment;
}
public void setCommment(String commment) {
	this.commment = commment;
}
public int getSenderId() {
	return senderId;
}
public void setSenderId(int senderId) {
	this.senderId = senderId;
}
public boolean isLike() {
	return like;
}
public void setLike(boolean like) {
	this.like = like;
}

}
