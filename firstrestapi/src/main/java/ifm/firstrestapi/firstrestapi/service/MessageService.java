package ifm.firstrestapi.firstrestapi.service;

import ifm.firstrestapi.firstrestapi.model.Message;
import ifm.firstrestapi.firstrestapi.repository.MessageRepository;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class MessageService {

   private  final  MessageRepository messageRepository ;

   private final KafkaTemplate<String, String> kafkaTemplate;

    public MessageService(MessageRepository messageRepository, KafkaTemplate<String, String> kafkaTemplate) {
        this.messageRepository = messageRepository;
        this.kafkaTemplate = kafkaTemplate;
    }

    public Mono<Message> insertMessage (Mono<Message> message) {

        Mono<Message> savedMessage = messageRepository.saveAll(message).next();
        //Test
        kafkaTemplate.sendDefault("Word1");
        kafkaTemplate.sendDefault("Word2");
        kafkaTemplate.sendDefault("Word3");
        kafkaTemplate.sendDefault("Word4");
        return  savedMessage ;
    }

    public Flux<Message> getAllMessages () {
        return messageRepository.findAll();

    }


}
