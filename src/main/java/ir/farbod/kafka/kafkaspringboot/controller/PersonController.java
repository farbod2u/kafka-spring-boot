package ir.farbod.kafka.kafkaspringboot.controller;

import ir.farbod.kafka.kafkaspringboot.entity.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

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