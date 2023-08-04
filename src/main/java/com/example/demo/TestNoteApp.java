package com.example.demo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TestNoteApp {

    @Autowired
    InterfaceNote interfaceNote;



    @Order(1)
    @PostConstruct
     void testMethodAll () {
      interfaceNote.add(new Note( "New note #1", " This is addiction note #1"));
      interfaceNote.add(new Note( "New note #2", " This is addiction note #2"));
      interfaceNote.add(new Note(4l, "New note #4", " This is addiction note #4"));
      System.out.println("by id ========>>>> " +interfaceNote.getById(4l));
      interfaceNote.update(new Note (4l,  "New Correction note", " This is some correction note #4"));
      interfaceNote.deleteById(2l);
    }


//    @PostConstruct
//    @Order(2)
//    void testMethodGetId() {
//        System.out.println("by id ========>>>> " +interfaceNote.getById(3l));
//    }

//    @Order(10)
//    @PostConstruct
//    void testMethodUpdate() {
//        interfaceNote.update(new Note (4l,  "New Correction note", " This is some correction note #4"));
//    }
//
//    @Order(50)
//    @PostConstruct
//    void testMethodDelete() {
//        interfaceNote.deleteById(2l);
//    }

    @Order(100)
    @PostConstruct
    void testMethodShowNotes() {
        System.out.println("listAll() ========>>>>" + interfaceNote.listAll().toString());
    }
}

