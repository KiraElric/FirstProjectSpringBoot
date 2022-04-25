package com.nisum.trainee.controller;

import com.nisum.trainee.model.Person;
import com.nisum.trainee.repository.PersonRepository;
import com.nisum.trainee.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class PersonController {
    @GetMapping("/")
    public List<Person> allPeople(){
        return new PersonRepository().createPeople();
    }

    @GetMapping("/filtered")
    public List<Person> filterPeople(){
        return new PersonService().filterPeople();
    }
}
