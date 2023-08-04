package com.example.demo;

import java.util.List;

public interface InterfaceNote {

    Note add(Note note);


    Note getById(long id);

    void update(Note note);


    void deleteById(long id);


    List<Note> listAll();

}
