package com.mobileapp.posts.shared;

import java.util.Date;
import java.util.List;

import com.mobileapp.posts.models.CommentResposeModel;

public class PostDto {
	private String userId;
	private String content;
	private Date date;
	private long likes;
	private List<CommentResposeModel> comments;
	public List<CommentResposeModel> getComments() {
		return comments;
	}
	public void setComments(List<CommentResposeModel> comments) {
		this.comments = comments;
	}
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
	
	

}
