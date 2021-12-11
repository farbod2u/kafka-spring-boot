package ir.farbod.kafka.producer.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
@RequiredArgsConstructor
public class StringController {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private static final String TOPIC = "KafkaSample";

    @GetMapping("/publish/{message}")
    public String publish(@PathVariable String message) {
        kafkaTemplate.send(TOPIC, message);
        return "Successfully publish Message ==> " + message;
    }
}
