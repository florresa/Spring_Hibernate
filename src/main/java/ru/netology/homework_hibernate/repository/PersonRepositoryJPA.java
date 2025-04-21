package ru.netology.homework_hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.netology.homework_hibernate.dto.Person;
import java.util.List;
import java.util.Optional;


@Repository
public interface PersonRepositoryJPA extends JpaRepository<Person, Long> {

    List<Person> findByCityOfLiving(String city);

    List<Person> findByAgeIsBeforeOrderByAge(int age);

    Optional<Person> findByNameAndSurname(String name, String surname);
}
