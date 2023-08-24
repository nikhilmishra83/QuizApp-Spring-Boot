package com.nikhilSpace.quizapp.Entity;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
public class Response implements Serializable {
    private int id;
    private String response;

}
