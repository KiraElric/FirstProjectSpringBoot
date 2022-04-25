package com.nisum.trainee.service;

import com.nisum.trainee.model.Person;
import com.nisum.trainee.repository.PersonRepository;

import java.util.ArrayList;
import java.util.List;

public class PersonService {
    public List<Person> filterPeople(){
        List<Person> people = new PersonRepository().createPeople();
        List<Person> legallyAdult = new ArrayList<>();
        for( Person p : people){
            if(p.getAge() > 18 ){
                legallyAdult.add(p);
            }
        }
        return legallyAdult;
    }
}
