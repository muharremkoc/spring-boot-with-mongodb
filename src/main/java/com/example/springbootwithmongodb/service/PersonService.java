package com.example.springbootwithmongodb.service;

import com.example.springbootwithmongodb.dto.PersonDTO;
import com.example.springbootwithmongodb.model.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {

    Person createPerson(Person person);
    Person updatePerson(int id, PersonDTO personDTO);
    List<Person> getPersons();
    Optional<Person> getPerson(int id);
    void  deletePerson(int id);
}
