package com.lambton;

import java.time.LocalDate;

public abstract class Person {


    private int personId;
    private String fName,lName,gender;
    private LocalDate birthDate;


    public Person(int personId) {
        this.personId = personId;
    }

    public Person(int personId, String fName, String lName, String gender, LocalDate birthDate) {
        this.personId = personId;
        this.fName = fName;
        this.lName = lName;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    public int getPersonId() {
        return personId;
    }


    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }


    public abstract void display();
}
