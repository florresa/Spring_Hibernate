package ru.netology.homework_hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.homework_hibernate.dto.Person;
import ru.netology.homework_hibernate.repository.PersonRepository;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/persons/by-city")
    public List<Person> getPersonsByCity(@RequestParam String city) {
        return personRepository.getPersonsByCity(city);
    }

    @GetMapping("/persons/all")
    public List<Person> getPersonsAll() {
        return personRepository.getPersonsAll();
    }
}
