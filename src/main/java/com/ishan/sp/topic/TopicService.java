package com.ishan.sp.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topicList = new ArrayList<>(Arrays.asList(
            new Topic("spring","Spring Framework","Spring Framework Description"),
            new Topic("java","Java","Java Description"),
            new Topic("django","Django Framework","Django Description")
    ));

    public List<Topic> getAllTopics(){
        return topicList;
    }

    public Topic getTopic(String id){
        return topicList.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topicList.add(topic);
    }

    public void updateTopic(String id, Topic topic) {
        for(int i=0;i<topicList.size();i++){
            Topic t = topicList.get(i);
            if(t.getId().equals(id)){
                topicList.set(i,topic);
                return;
            }
        }
    }

    public void deleteTopic(String id) {
        topicList.removeIf(t -> t.getId().equals(id));
    }
}
