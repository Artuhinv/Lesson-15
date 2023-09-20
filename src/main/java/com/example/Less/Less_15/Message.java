package com.example.Less.Less_15;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Message {

    @Id
    @GeneratedValue
    private int id;
    private String title;
    private String text;
    private LocalDateTime birthday;

    public Message() {
    }

    public Message(String title, String text, LocalDateTime birthday) {
        this.title = title;
        this.text = text;
        this.birthday = birthday;
    }

    public Message(int id, String title, String text, LocalDateTime birthday) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String surname) {
        this.title = surname;
    }

    public String getText() {
        return text;
    }

    public void setText(String lastname) {
        this.text = lastname;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }
}

