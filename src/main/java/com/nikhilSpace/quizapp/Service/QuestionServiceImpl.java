package com.nikhilSpace.quizapp.Service;

import com.nikhilSpace.quizapp.DAO.QuestionDao;
import com.nikhilSpace.quizapp.Entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    QuestionDao questionDao;

    @Override
    public ResponseEntity<List<Question>> getAllQuestions() {
        try{
            return new ResponseEntity<>(questionDao.findAll(), HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
        }
            return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);

    }

    @Override
    public ResponseEntity<Question> addQuestion(Question question) {
        return new ResponseEntity<>(questionDao.save(question), HttpStatus.CREATED);
    }

    @Override
    public Optional<Question> getQuestion(int id) {
        return questionDao.findById(id);
    }



    @Override
    public ResponseEntity<List<Question>> getQuestionByCategory(String ctg) {
        try{
            return new ResponseEntity<>(questionDao.findByCategory(ctg), HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);


    }

    @Override
    public List<Question> getQuestionByDifficulty(String difficulty) {
        return questionDao.findByDifficulty( difficulty);
    }



    @Override
    public List<Question> getQuestionByCategoryAndDifficulty(String category, String difficulty) {
        return questionDao.findByCategoryAndDifficulty(category, difficulty);
    }
}
