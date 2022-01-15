package com.ishan.sp.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topicList = Arrays.asList(
            new Topic("spring","Spring Framework","Spring Framework Description"),
            new Topic("java","Java","Java Description"),
            new Topic("django","Django Framework","Django Description")
    );

    public List<Topic> getAllTopics(){
        return topicList;
    }

    public Topic getTopic(String id){
        return topicList.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }
}
