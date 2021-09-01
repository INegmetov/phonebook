package com.example.phonebook.api.controller;

import com.example.phonebook.core.model.ContactDto;
import com.example.phonebook.core.service.ContactServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ContactController {

    @Autowired
    private ContactServiceImpl contactServiceImpl;

    @ApiOperation(
            value = "Контроллер добавления контакта"
    )
    @PostMapping("/add")
    public List<ContactDto> addContact() {
        return null;
    }

    @ApiOperation(
            value = "Контроллер изменения контакта"
    )
    @PostMapping("/edit")
    public List<ContactDto> editContact() {
        return null;
    }

    @ApiOperation(
            value = "Контроллер вывода по ФИО "
    )
    @PostMapping("/filterByName")
    public List<ContactDto> findByName() {
        return null;
    }

    @ApiOperation(
            value = "Контроллер вывода по ФИО и дате рождения"
    )
    @PostMapping("/filterByNameAndByBirthday")
    public List<ContactDto> findByNameAndByBirthday() {
        return null;
    }

     @ApiOperation(
            value = "Контроллер вывода по дате рождения"
    )
    @PostMapping("/filterByBirthday")
    public List<ContactDto> findByBirthday(String dateOfBirth) {
        return null;
    }
}
