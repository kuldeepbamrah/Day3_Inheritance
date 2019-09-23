package com.lambton;

import java.time.LocalDate;

public class Student extends Person
{

    private int currentSemester;
    private String courseName;

    public Student(int personId) {
        super(personId);
    }



    public Student(int personId, String fName, String lName, String gender, LocalDate birthDate, int currentSemester, String courseName) {
        super(personId, fName, lName, gender, birthDate);
        this.currentSemester = currentSemester;
        this.courseName = courseName;
    }

    public int getCurrentSemester() {
        return currentSemester;
    }

    public void setCurrentSemester(int currentSemester) {
        this.currentSemester = currentSemester;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


    @Override
    public void display() {

        System.out.println("Student Id              : " + getPersonId());
        System.out.println("Student  First Name     : " + getfName());
        System.out.println("Student Last Name       : " + getlName());
        System.out.println("Gender                  : " + getGender());
        System.out.println("Course Name             : " + getCourseName());
        System.out.println("Current Semester:       : " + getCurrentSemester());

    }
}
