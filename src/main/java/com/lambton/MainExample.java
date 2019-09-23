package com.lambton;

import java.time.LocalDate;

public class MainExample {

    public static void main(String[] args)
    {
        Person p1;

        Student s1= new Student(1,"Kuldeep","Singh","Male", LocalDate.now(),1,"MADT");
        p1=s1;
        p1.display();

    }

}
