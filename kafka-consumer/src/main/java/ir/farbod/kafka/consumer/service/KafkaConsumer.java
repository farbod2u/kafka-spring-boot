package ir.farbod.kafka.consumer.service;

import ir.farbod.kafka.consumer.entity.Person;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "KafkaSample", groupId = "GroupId")
    public void stringConsumer(String message) {
        System.out.println("message = " + message);
    }

    @KafkaListener(topics = "KafkaSample", groupId = "GroupId",
            containerFactory = "personConcurrentKafkaListenerContainerFactory")
    public void personConsumer(Person entity) {
        System.out.println("entity = " + entity);
    }
}
