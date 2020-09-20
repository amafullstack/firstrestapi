package ifm.firstrestapi.firstrestapi.repository;

import ifm.firstrestapi.firstrestapi.model.Message;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;

public interface MessageRepository extends ReactiveCassandraRepository<Message, String> {
}
