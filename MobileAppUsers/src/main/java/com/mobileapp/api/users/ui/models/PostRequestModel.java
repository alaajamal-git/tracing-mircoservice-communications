package com.mobileapp.api.users.ui.models;


import java.util.Date;
import java.util.List;

public class PostRequestModel {
	
	private String userId;
	private String content;
	private Date date;
	private long likes;
	private List<CommentRequestModel> comments;
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public long getLikes() {
		return likes;
	}
	public void setLikes(long likes) {
		this.likes = likes;
	}
	public List<CommentRequestModel> getComments() {
		return comments;
	}
	public void setComments(List<CommentRequestModel> comments) {
		this.comments = comments;
	}
	

}
