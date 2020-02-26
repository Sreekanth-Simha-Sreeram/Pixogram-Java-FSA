package com.pixogram.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Content")
public class Content {
	   @Id
	   @Column(name="contentId")
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
      int contentId;
	   
	  @Column(name="imagePath")
      String imagePath;
	   
	  @Column(name="videoPath")
      String videoPath;
	   
	  @Column(name="caption")
      String caption;
	  
	  @Column(name="description")
      String description;
	  
	  @Column(name="userId")
      int userId;
	  
	  @Column(name="visibility")
     boolean visibility;
public int getContentId() {
	return contentId;
}
public void setContentId(int contentId) {
	this.contentId = contentId;
}
public String getImagePath() {
	return imagePath;
}
public void setImagePath(String imagePath) {
	this.imagePath = imagePath;
}
public String getVideoPath() {
	return videoPath;
}
public void setVideoPath(String videoPath) {
	this.videoPath = videoPath;
}
public String getCaption() {
	return caption;
}
public void setCaption(String caption) {
	this.caption = caption;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public boolean isVisibility() {
	return visibility;
}
public void setVisibility(boolean visibility) {
	this.visibility = visibility;
}

}
