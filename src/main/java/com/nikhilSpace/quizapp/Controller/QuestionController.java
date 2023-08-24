package com.nikhilSpace.quizapp.Controller;

import com.nikhilSpace.quizapp.Entity.Question;
import com.nikhilSpace.quizapp.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("questions")
    public ResponseEntity<List<Question>> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @GetMapping("question/{uId}")
    public Optional<Question> getQuestion(@PathVariable ("uId") Integer id) {     //if uId and id were the same
                                                                                // we would not have to specify it in bracket
        return questionService.getQuestion(id);
    }

    @GetMapping("questions/category/{ctg}")
    public ResponseEntity<List<Question>> getQuestionByCategory(@PathVariable String ctg){
        return questionService.getQuestionByCategory(ctg);
    }

    @GetMapping("questions/difficulty/{difficulty}")
    public List<Question> getQuestionByDifficulty(@PathVariable ("difficulty") String difficulty){
        return questionService.getQuestionByDifficulty(difficulty);
    }

    @PostMapping("addquestion")
    public ResponseEntity<Question> addQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);
    }

    @GetMapping("questions/{category}/{difficulty}")
    public List<Question> getQuestionsByCategoryAndDifficulty(
            @PathVariable("category") String category,
            @PathVariable("difficulty") String difficulty) {
        return questionService.getQuestionByCategoryAndDifficulty(category, difficulty);
    }
}
