package io.javabrains.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Topicservice {
	
	@Autowired
	private TopicRepository topicRepository;
	
	private List<Topic> topics=new ArrayList<> ( Arrays.asList(
			new Topic("spring","Spring Framework","Spring Framework Descption"),
			new Topic("java","Core Java","Core Java Descption")
			));
	
	public List<Topic> getAllTopics(){
//		return topics;
		
		List<Topic> topics=new ArrayList<>();
		topicRepository.findAll()
		.forEach(topics::add);
		return topics;
	}

	public Object getTopic(String id){
//		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		
    return  topicRepository.findById(id);
		
	}

	public void addTopic(Topic topic) {
//		topics.add(topic);
		topicRepository.save(topic);
		
		
	}

	public void updateTopic(Topic topic, String id) {

		
		topicRepository.save(topic);
		
	}

	public void deleteTopic(String id) {
//		topics.removeIf(t->t.getId().equals(id));
	
		topicRepository.deleteById(id);
	}
	
	
}
