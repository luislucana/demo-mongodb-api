package br.com.demo.persistence.repository;

import br.com.demo.persistence.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OutroRepository extends MongoRepository<Person, String> {
}
