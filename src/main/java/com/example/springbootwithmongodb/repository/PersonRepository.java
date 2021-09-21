package com.example.springbootwithmongodb.repository;

import com.example.springbootwithmongodb.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends MongoRepository<Person,Integer> {
}
