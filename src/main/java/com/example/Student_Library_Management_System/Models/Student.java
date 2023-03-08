package com.example.Student_Library_Management_System.Models;

import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )  //id parameter will auto increment it's value
    private int id;

    private String name;

    @Column(unique = true)
    private String email;

    private String mobNo;

    private int age;

    private String country;


}
