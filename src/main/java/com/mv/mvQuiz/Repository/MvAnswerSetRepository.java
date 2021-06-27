package com.mv.mvQuiz.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mv.mvQuiz.DomainEntities.MvAnswerSet;

public interface MvAnswerSetRepository extends JpaRepository<MvAnswerSet, Integer> {

}
