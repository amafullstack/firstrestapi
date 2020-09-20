package ifm.firstrestapi.firstrestapi.messaging.listener;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @KafkaListener(topics = "output-topic-ifm", groupId="firstrestapi" )
    public  void displayMessage (String message) {
        System.out.println("Amadou: " + message);
    }
}
