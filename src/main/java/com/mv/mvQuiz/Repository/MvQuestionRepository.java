package com.mv.mvQuiz.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mv.mvQuiz.DomainEntities.MvQuestion;

public interface MvQuestionRepository extends JpaRepository<MvQuestion, Integer>{

}
