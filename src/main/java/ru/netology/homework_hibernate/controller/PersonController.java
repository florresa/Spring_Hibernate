package ru.netology.homework_hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.homework_hibernate.dto.Person;
import ru.netology.homework_hibernate.repository.PersonRepository;
import org.springframework.web.bind.annotation.*;
import ru.netology.homework_hibernate.service.PersonService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/persons")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;
    private PersonService personService;


    @GetMapping("/city/{city}")
    public List<Person> getPersonsByCity(@PathVariable String city) {
        return personService.getPersonsByCity(city);
    }

    @GetMapping("/age/{age}")
    public List<Person> getPersonsByAge(@PathVariable int age) {
        return personService.getPersonsByAge(age);
    }

    @GetMapping("/name/{name}/{surname}")
    public Optional<Person> getPersonsByName(@PathVariable String name, @PathVariable String surname) {
        return personService.getPersonsByNameAndSurname(name, surname);
    }
}
