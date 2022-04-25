package com.nisum.trainee.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
public class Person {
    private String name;
    private String lastName;
    private String rut;
    private Integer age;
    private List<Person> friends;
}
