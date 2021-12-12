package ir.farbod.kafka.consumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "KafkaSample", groupId = "GroupId")
    public void stringConsumer(String message){
        System.out.println("message = " + message);
    }
}
