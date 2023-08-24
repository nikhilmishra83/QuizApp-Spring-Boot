package com.nikhilSpace.quizapp.Entity;


import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "questions")
public class Question implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int questionId ;
    private String category ;
    private String difficulty;
    private String option1 ;
    private String option2 ;
    private String option3 ;
    private String option4 ;
    private String questionTitle ;
    private String answer ;


}
