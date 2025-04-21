package ru.netology.homework_hibernate.dto;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "PERSONS")
@IdClass(PersonId.class)
@Data
public class Person {

    @Id
    private String name;

    @Id
    private String surname;

    @Id
    private int age;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "city_of_living")
    private String cityOfLiving;

}
