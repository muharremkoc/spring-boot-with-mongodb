package com.example.springbootwithmongodb.service;

import com.example.springbootwithmongodb.dto.PersonDTO;
import com.example.springbootwithmongodb.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonService {

    Person createPerson(PersonDTO personDTO);
    Person updatePerson(String id, PersonDTO personDTO);
    List<Person> getPersons();
    Optional<Person> getPerson(String id);
    void  deletePerson(String id);
}
