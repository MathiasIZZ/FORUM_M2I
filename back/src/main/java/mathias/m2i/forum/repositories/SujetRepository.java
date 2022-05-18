package mathias.m2i.forum.repositories;

import mathias.m2i.forum.entities.Sujet;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SujetRepository extends MongoRepository<Sujet, String> {
}
