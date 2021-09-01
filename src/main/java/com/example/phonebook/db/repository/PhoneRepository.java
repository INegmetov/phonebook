package com.example.phonebook.db.repository;

import com.example.phonebook.db.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PhoneRepository extends JpaRepository<Phone, Long> {

    List<Phone> findByNumber();
}
