package com.mv.mvQuiz.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mv.mvQuiz.DomainEntities.MvQuestionSet;

public interface MvQuestionSetRepository extends JpaRepository<MvQuestionSet, Integer> {

    Optional<MvQuestionSet> findByQuesSetName(String quesSetName);

    Integer deleteByQuesSetName(String quesSetName);

}
