package com.nikhilSpace.quizapp.Service;

import com.nikhilSpace.quizapp.Entity.Question;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface QuestionService {

    public ResponseEntity<List<Question>> getAllQuestions();

    public ResponseEntity<Question> addQuestion(Question question);

    public Optional<Question> getQuestion(int id);

    public ResponseEntity<List<Question>> getQuestionByCategory(String ctg);

    public List<Question> getQuestionByDifficulty(String difficulty);

    public List<Question> getQuestionByCategoryAndDifficulty(String category, String difficulty);

}
