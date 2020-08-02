package com.mobileapp.comments.serviceImp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mobileapp.comments.services.CommentsServices;
import com.mobileapp.comments.shared.CommentsDto;
@Service
public class CommentsServicesImp implements CommentsServices {

	@Override
	public List<CommentsDto> getComments(String id) {

		List<CommentsDto> list=new ArrayList<>();
		
		CommentsDto o1=new CommentsDto();
		o1.setcommentId(id);
		o1.setContent("the comment number 1");
		
		CommentsDto o2=new CommentsDto();
		o2.setcommentId(id);
		o2.setContent("the comment number 2");
		
		list.add(o2);
		list.add(o1);
		return list;
	}

}
