package com.example.springmain.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
import org.springframework.stereotype.Service;

import com.examples.springmain.getsettopics.TopicObject;

@Service   
/*This annotation marks the class as a business service and creates
instance of the business service when spring starts*/

public class TopicService {
		private List<TopicObject> topics =new ArrayList<>( Arrays.asList(
				new TopicObject("Spring", "Spring Framework","Spring Boot and Spring MVCFramework"),
				new TopicObject("Java","Core Java","Java Fundamentals"),
				new TopicObject("Angular","Angular 7","Angular 7 Fundamentals")));
	
	public List<TopicObject> getAllTopics()
	{
		return topics;
	}
	
	public TopicObject getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	public void addTopic(TopicObject topic) {
		topics.add(topic);
	}
	
}