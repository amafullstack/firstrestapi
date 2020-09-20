package ifm.firstrestapi.firstrestapi.bootstarp;



import ifm.firstrestapi.firstrestapi.model.Message;
import ifm.firstrestapi.firstrestapi.repository.MessageRepository;
import ifm.firstrestapi.firstrestapi.service.MessageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Component
public class BootstrapCRL implements CommandLineRunner {

    private final MessageRepository repository;

    private final MessageService service;


    public BootstrapCRL(MessageRepository repository, MessageService service) {
        this.repository = repository;
        this.service = service;
    }

    @Override
    public void run(String... args) throws Exception {

       // repository.deleteAll().block();
        //repository.deleteAll().thenMany(
        //                  );

        //repository.deleteAll().thenMany()
        /*
        Flux.just("Silence1").map( title -> new Message("14",title))
                .flatMap(repository::insert)
                .subscribe(null, null,
                        () -> {repository
                                .findAll()
                                .subscribe(System.out::println);
                        });


        */


    }
}
