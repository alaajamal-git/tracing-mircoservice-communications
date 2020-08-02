package com.mobileapp.api.users.feignclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mobileapp.api.users.circuitbreaker.postsFallBackFactory;
import com.mobileapp.api.users.ui.models.PostRequestModel;

@FeignClient(name="posts-ws", fallbackFactory = postsFallBackFactory.class)
public interface PostService{
	@GetMapping(value = "/users/{id}/posts")
	public List<PostRequestModel> getUserPosts(@PathVariable String id);

}
