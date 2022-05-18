package mathias.m2i.forum.repositories;

import mathias.m2i.forum.entities.Message;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MessageRepository extends MongoRepository<Message, String> {
}
