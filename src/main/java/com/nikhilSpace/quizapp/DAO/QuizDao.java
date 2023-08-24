package com.nikhilSpace.quizapp.DAO;

import com.nikhilSpace.quizapp.Entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository <Quiz, Integer> {
}
