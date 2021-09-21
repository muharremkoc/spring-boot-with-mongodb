package com.example.springbootwithmongodb.controller;

import com.example.springbootwithmongodb.dto.PersonDTO;
import com.example.springbootwithmongodb.model.Person;

import com.example.springbootwithmongodb.service.PersonService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequestMapping("/mongodb")
public class PersonController {

    final PersonService personService;


    @PostMapping("/person")
    public Person createPerson(@RequestBody PersonDTO personDTO){

        return personService.createPerson(personDTO);
    }


    @GetMapping("/persons")
    public List<Person> getPersons(){
        return personService.getPersons();
    }


    @GetMapping("/person/{id}")
    public Optional<Person> getPerson(@PathVariable("id") String id){
        return personService.getPerson(id);
    }


    @PutMapping("/person/{id}")
    public Person updatePerson(@PathVariable("id") String id, @RequestBody PersonDTO personDTO){
        return personService.updatePerson(id, personDTO);
    }

    @DeleteMapping("/person/{id}")
    public void deletePerson(@PathVariable("id") String id){
        personService.deletePerson(id);
    }
}
