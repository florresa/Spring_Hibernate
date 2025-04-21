package ru.netology.homework_hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.netology.homework_hibernate.dto.Person;
import ru.netology.homework_hibernate.repository.PersonRepositoryJPA;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    @Autowired
    private PersonRepositoryJPA personRepository;

    public List<Person> getPersonsByCity(String city) {
        return personRepository.findByCityOfLiving(city);
    }

    public List<Person> getPersonsByAge(int age) {
        return personRepository.findByAgeIsBeforeOrderByAge(age);
    }

    public Optional<Person> getPersonsByNameAndSurname(String name, String surname) {
        return personRepository.findByNameAndSurname(name, surname);
    }

}
