package com.mobileapp.posts.serviceImp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mobileapp.posts.models.CommentResposeModel;
import com.mobileapp.posts.services.PostServices;
import com.mobileapp.posts.shared.PostDto;
@Service
public class PostServicesImp implements PostServices {
	RestTemplate restt;
	
	@Autowired
	public PostServicesImp(RestTemplate restt) {

		this.restt=restt;

	}
	@Override
	public List<PostDto> getPosts(String id) {

		List<PostDto> list=new ArrayList<>();
		String postserviceurl;
		ResponseEntity<List<CommentResposeModel>> entity;
		List<CommentResposeModel> comments;
		PostDto o1=new PostDto();
		o1.setUserId(id);
		o1.setDate(new Date());
		o1.setLikes(5455554444L);
		o1.setContent("the post content 1");
		String postId=UUID.randomUUID().toString();
		postserviceurl=String.format("http://comments-ws/users/comments/%s", postId);
		entity=this.restt.exchange(postserviceurl,HttpMethod.GET ,null,new ParameterizedTypeReference<List<CommentResposeModel>>() {});
		comments=entity.getBody();
		o1.setComments(comments);
		
		PostDto o2=new PostDto();
		o2.setUserId(id);
		o2.setDate(new Date());
		o2.setLikes(5455554444L);
		o2.setContent("the post content 2");
		postId=UUID.randomUUID().toString();
		postserviceurl=String.format("http://comments-ws/users/comments/%s", postId);
		entity=this.restt.exchange(postserviceurl,HttpMethod.GET ,null,new ParameterizedTypeReference<List<CommentResposeModel>>() {});
		comments=entity.getBody();
		o2.setComments(comments);
		
		o2.setComments(comments);

		list.add(o2);
		list.add(o1);
		return list;
	}

}
