package com.example.formation.services;

import com.example.formation.entites.Person;

import java.util.List;

public interface PersonService {

    public Person ajouter(Person person);

    public List<Person> getAllPerson();

    public Person getPersonById(Long id);

    public void delete(Long id);
}
