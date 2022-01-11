package com.example.springmain.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.examples.springmain.getsettopics.TopicObject;

@RestController
public class TopicController {
	
	/* TopicController class asks for the service instance 
	created by spring by creating a private member variable topicService
	and annotate with @Autowired */
	
	@Autowired
	private TopicService topicService; 
	
	@RequestMapping("/topics")
	public List<TopicObject> getAllTopics() {
		return  topicService.getAllTopics();
	}
	
	// creating a REST API that return only the Topic that is requested
	@RequestMapping("/topics/{id}")
	public TopicObject getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public void addTopic(@RequestBody TopicObject topic) {
		topicService.addTopic(topic);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
	public void updateTopic(@RequestBody TopicObject topic, @PathVariable String id) {
		topicService.updateTopic(id,topic);
		}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
	public void delteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
		}
}
