package com.mobileapp.comments.services;

import java.util.List;

import com.mobileapp.comments.shared.CommentsDto;

public interface CommentsServices {
	
	List<CommentsDto> getComments(String id);

}
