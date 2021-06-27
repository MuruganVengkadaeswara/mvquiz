package com.mv.mvQuiz.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mv.mvQuiz.DomainEntities.MvUserAnswerRecord;

public interface MvUserAnswerRecordRepository extends JpaRepository<MvUserAnswerRecord, Integer> {

}
