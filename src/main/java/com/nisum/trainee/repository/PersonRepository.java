package com.nisum.trainee.repository;

import com.nisum.trainee.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository {
    public List<Person> createPeople(){
        List<Person> people = new ArrayList<>();
        List<Person> friends1 = new ArrayList<>();
        List<Person> friends2 = new ArrayList<>();
        List<Person> friends3 = new ArrayList<>();

        Person person1 = Person.builder().name("Kyle").lastName("Broflovski").rut("10554345-1").age(10).friends(null).build();
        friends1.add(person1);
        Person person2 = Person.builder().name("Stan").lastName("Marsh").rut("10446789-1").age(10).friends(null).build();
        friends1.add(person2);
        Person person3 = Person.builder().name("Eric").lastName("Cartman").rut("10665432-8").age(10).friends(null).build();
        friends1.add(person3);
        Person person4 = Person.builder().name("Kenny").lastName("McCormick").rut("10775378-2").age(10).friends(friends1).build();
        people.add(person4);

        Person person5 = Person.builder().name("Butters").lastName("Stotch").rut("11776537-1").age(10).friends(null).build();
        friends2.add(person5);
        Person person6 = Person.builder().name("Clyde").lastName("Donovan").rut("12556345-1").age(10).friends(null).build();
        friends2.add(person6);
        Person person7 = Person.builder().name("Craig").lastName("Tucker").rut("15667456-8").age(10).friends(null).build();
        friends2.add(person7);
        Person person8 = Person.builder().name("Jimmy").lastName("Valmer").rut("15435674-2").age(10).friends(friends2).build();
        people.add(person8);

        Person person9 = Person.builder().name("Randy").lastName("Marsh").rut("18776392-1").age(45).friends(null).build();
        friends3.add(person9);
        Person person10 = Person.builder().name("Gerald").lastName("Broflovski").rut("18773627-1").age(42).friends(null).build();
        friends3.add(person10);
        Person person11 = Person.builder().name("Jimbo").lastName("Kern").rut("19773629-8").age(38).friends(null).build();
        friends3.add(person11);
        Person person12 = Person.builder().name("Stephen").lastName("Stotch").rut("18773623-2").age(40).friends(friends3).build();
        people.add(person12);
        return people;
    }
}
