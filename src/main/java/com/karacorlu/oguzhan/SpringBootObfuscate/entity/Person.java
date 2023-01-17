package com.karacorlu.oguzhan.SpringBootObfuscate.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * @author oguzhan.karacorlu on 17.01.2023
 * @project springbootobfuscate
 */
@Getter
@Setter
public class Person {

    private String name;
    private String surname;
    private Integer age;

    public Person(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}
