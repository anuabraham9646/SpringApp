package com.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	List<Topics> topics= new ArrayList<>(Arrays.asList(

			new Topics(1,"Spring boot", "its all about spring boot"),
			new Topics(2,"Java", "its all about Java"),
			new Topics(3,"Python", "its all about Python")
			));
			
	public List<Topics> getAllTopics(){
		
		return topics;
	}
	
	public Topics getById(int id) {
		
		return topics.stream().filter(t -> t.getId()== id).findFirst().get();
	}

	public void addTopic(Topics topic) {

		topics.add(topic);
		
	}

	public void updateTopic(Topics topic, int id) {
		for(int i=0;i< topics.size();i++) {
			if(topics.get(i).getId()==id) {
				topics.set(i, topic);
			}
		}
		
	}

	public void deleteTopic(int id) {
		topics.removeIf(t -> t.getId()==id);
		
	}

}
