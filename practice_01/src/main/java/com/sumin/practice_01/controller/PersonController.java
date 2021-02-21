package com.sumin.practice_01.controller;

import com.sumin.practice_01.models.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/myinfo")
    public Person getPersonInfo() {
        Person person = new Person();
        person.setName("손수민");
        person.setAddress("광주");
        person.setAge(25);
        person.setJob("대학생");

        return person;
    }
}
