package com.example.phonebook.core.service;

import com.example.phonebook.core.model.ContactDto;
import com.example.phonebook.core.model.PhoneDto;

import java.util.Date;
import java.util.List;

public interface ContactService {

    ContactDto getById(Long id);

    /** Добавление нового контакта */
    List<ContactDto> addContact(
            String name,
            Date birthday,
            List<PhoneDto> phoneNumber);

    /** Изменение контакта */
    List<ContactDto> editContact(
            Long Id,
            String name,
            Date birthday,
            List<PhoneDto> phoneNumber);

    /** Поиск контакта по ФИО */
    List<ContactDto> findByName(String name);

    /** Поиск контакта по дате рождения */
    List<ContactDto> findByBirthday(Date birthday);

    /** Поиск контакта по ФИО и дате рождения*/
    List<ContactDto> findByNameAndByBirthday(
            String name,
            Date birthday);

}
