package com.example.phonebook.core.service;

import com.example.phonebook.core.mapper.ContactMapper;
import com.example.phonebook.core.model.ContactDto;
import com.example.phonebook.core.model.PhoneDto;
import com.example.phonebook.db.entity.Contact;
import com.example.phonebook.db.entity.Phone;
import com.example.phonebook.db.repository.ContactRepository;
import com.example.phonebook.db.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ContactServiceImpl implements ContactService{

    @Autowired
    private ContactRepository contactRepository;
    @Autowired
    private ContactMapper contactMapper;

    @Override
    public ContactDto getById(Long id) {
        return null;
    }

    @Override
    public List<ContactDto> addContact(String name, Date birthday, List<PhoneDto> phoneNumber) {
        return null;
    }

    @Override
    public List<ContactDto> editContact(Long Id, String name, Date birthday, List<PhoneDto> phoneNumber) {
        return null;
    }

    @Override
    public List<ContactDto> findByName(String name) {
        return null;
    }

    @Override
    public List<ContactDto> findByBirthday(Date birthday) {
        return null;
    }

    @Override
    public List<ContactDto> findByNameAndByBirthday(String name, Date birthday) {
        return null;
    }
}
