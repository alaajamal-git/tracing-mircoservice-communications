package com.mobileapp.comments.restcontroller;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.google.common.reflect.TypeToken;
import com.mobileapp.comments.models.CommentResposeModel;
import com.mobileapp.comments.services.CommentsServices;
import com.mobileapp.comments.shared.CommentsDto;

@RestController
public class Comments {
	
	@Autowired
	private CommentsServices service;
	
	@RequestMapping("/users/comments/{id}")
	@GetMapping(produces = {MediaType.APPLICATION_ATOM_XML_VALUE,MediaType.APPLICATION_JSON_VALUE,})
	public List<CommentResposeModel> getComments(@PathVariable String id) {
		List<CommentResposeModel> returnValue = new ArrayList<>();
		List<CommentsDto> commentsList=service.getComments(id);
		if(commentsList==null) return returnValue;
				// mapping the two lists postList and postList

		
		Type listType = new TypeToken<List<CommentResposeModel>>(){

			/**
			 * 
			 */
			private static final long serialVersionUID = 4388705252532001293L;}.getType();
		returnValue=new ModelMapper().map(commentsList, listType);
		return returnValue;
	}

}
