package ifm.firstrestapi.firstrestapi.controler;

import ifm.firstrestapi.firstrestapi.model.Message;
import ifm.firstrestapi.firstrestapi.service.MessageService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/message")
public class MessageController{

    private final MessageService messageService;


    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping("application/json")
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping("/word")
    public Mono<Message>insertMessage (@RequestBody  Mono<Message> message) {
       return  messageService.insertMessage(message);
    }


    @GetMapping()
    @RequestMapping("/words")
    public Flux<Message> getAllMessages() {
        return messageService.getAllMessages();
    }
}
