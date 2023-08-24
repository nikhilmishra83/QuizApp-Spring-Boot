package com.nikhilSpace.quizapp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class QuestionWrapper {

    @Id
    private int questionId ;
    private String questionTitle ;
    private String option1 ;
    private String option2 ;
    private String option3 ;
    private String option4 ;

    public QuestionWrapper(int questionId, String questionTitle, String option1, String option2, String option3, String option4) {
        this.questionId = questionId;
        this.questionTitle = questionTitle;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
    }
}
