package ua.pp.hak.springbootstarter.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.pp.hak.springbootstarter.model.Topic;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();
		topics.add(new Topic("spring", "Spring Framework", "Spring Framework Descr"));
		topics.add(new Topic("java", "Core Java", "Core Java descr"));
		topics.add(new Topic("js", "Javascript", "Javascript descr"));

		return topics;
	}
}
