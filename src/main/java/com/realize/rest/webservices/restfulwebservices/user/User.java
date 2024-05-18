package com.realize.rest.webservices.restfulwebservices.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class User {
    private int id;
    @Size(min = 4, message = "Name must be at least 4 characters long")
    @JsonProperty("user_name")
    private String name;
    @Past(message = "Please enter a valid date in the past")
    @JsonProperty("birth_date")
    private LocalDate birthDate;

    public User(String name, int id, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "User{" +
                ", id='" + id + '\'' +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
