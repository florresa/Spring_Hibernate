package ru.netology.homework_hibernate.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class PersonId implements Serializable {

    private String name;
    private String surname;
    private int age;

    public PersonId() {}

    public PersonId(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}