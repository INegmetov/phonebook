package com.example.phonebook.db.repository;

import com.example.phonebook.db.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContactRepository extends JpaRepository<Contact, Long> {


    /** Поиск по id */
    Contact getById(Long id);

    /** Поиск по дате рождения */
    List<Contact> findByBirthday();

    /** Поиск по ФИО */
    List<Contact> findByName();

    /** Поиск по ФИО и дате рождения */
    List<Contact> findByNameAndByBirthday();
}
