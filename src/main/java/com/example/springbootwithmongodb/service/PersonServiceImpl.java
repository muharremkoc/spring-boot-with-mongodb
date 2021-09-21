package com.example.springbootwithmongodb.service;

import com.example.springbootwithmongodb.dto.PersonDTO;
import com.example.springbootwithmongodb.exception.PersonAlreadyExistsException;
import com.example.springbootwithmongodb.exception.PersonNotFoundException;
import com.example.springbootwithmongodb.model.Person;
import com.example.springbootwithmongodb.repository.PersonRepository;


import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService{

   final PersonRepository personRepository;

  //  private SequenceGeneratorService sequenceGeneratorService;


    @Override
    public Person createPerson(PersonDTO personDTO) {
        Person person= Person.builder()
                .firstName(personDTO.getFirstName())
                .gender(personDTO.getGender())
                .lastName(personDTO.getLastName())
                .build();

       /* Optional<Person> optionalUser=personRepository.findById(person.getId());


        if (optionalUser.isPresent()) {
            throw new PersonAlreadyExistsException();
        }*/


      //  person.setId(sequenceGeneratorService.getSequenceNumber(SEQUENCE_NAME));
        return personRepository.save(person);
    }

    @Override
    public Person updatePerson(String id, PersonDTO personDTO) {
        Person newPerson=personRepository.findById(id).orElseThrow(PersonNotFoundException::new);
        newPerson.setFirstName(personDTO.getFirstName());
        newPerson.setLastName(personDTO.getLastName());
        newPerson.setGender(personDTO.getGender());


        return personRepository.save(newPerson);
    }

    @Override
    public List<Person> getPersons() {
        List<Person> personList=personRepository.findAll();
        return  personList;
    }

    @Override
    public Optional<Person> getPerson(String id) {
     Optional<Person> emPerson=personRepository.findById(id);
     return emPerson;
    }

    @Override
    public void deletePerson(String id) {
        Person person=personRepository.findById(id).orElseThrow(() -> new PersonNotFoundException());


        personRepository.delete(person);
    }
}
