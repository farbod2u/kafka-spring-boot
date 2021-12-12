package ir.farbod.kafka.producer.controller;

import ir.farbod.kafka.producer.entity.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka/person")
@RequiredArgsConstructor
public class PersonController {

    private final KafkaTemplate<String, Person> kafkaTemplate;
    private static final String TOPIC = "KafkaSample";

    @PostMapping
    public String publish(@RequestBody Person entity) {
        kafkaTemplate.send(TOPIC, entity);
        return "Successfully publish Person ==> " + entity;
    }
}
