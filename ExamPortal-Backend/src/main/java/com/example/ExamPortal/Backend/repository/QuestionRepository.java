package com.example.ExamPortal.Backend.repository;

import com.example.ExamPortal.Backend.model.exam.Question;
import com.example.ExamPortal.Backend.model.exam.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface QuestionRepository extends JpaRepository<Question,Long> {
    Set<Question> findByQuiz(Quiz quiz);
}
