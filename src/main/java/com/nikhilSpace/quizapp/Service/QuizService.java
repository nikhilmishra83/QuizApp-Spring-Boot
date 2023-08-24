package com.nikhilSpace.quizapp.Service;

import com.nikhilSpace.quizapp.Entity.QuestionWrapper;
import com.nikhilSpace.quizapp.Entity.Response;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface QuizService {


    ResponseEntity<String> createQuiz(String category, int numQ, String title);

    ResponseEntity<List<QuestionWrapper>> getQuizQuestions(int id);

    ResponseEntity<Integer> calculateResult(int id, List<Response> responses);
}
