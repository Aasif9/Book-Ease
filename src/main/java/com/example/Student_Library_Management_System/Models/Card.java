package com.example.Student_Library_Management_System.Models;

import com.example.Student_Library_Management_System.Enums.CardStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name="card")
public class Card {

    //Plan is to save this card in Db.
    //Before saving I have to set its attributes : Rule 1

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;  //Its auto generated

    @CreationTimestamp //Auto timestamp the time when an entry is created
    private Date createdOn; //Its auto generated

    @UpdateTimestamp //Sets time when an entry is updated.
    private Date updatedOn; //Its auto generated

    @Enumerated(value = EnumType.STRING)
    private CardStatus cardStatus; //SEt this attribute



}
