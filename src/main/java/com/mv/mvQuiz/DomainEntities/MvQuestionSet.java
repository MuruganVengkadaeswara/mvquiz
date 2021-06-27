package com.mv.mvQuiz.DomainEntities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class MvQuestionSet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int quesSetId;

    @Column(unique = true)
    private String quesSetName;

    @OneToMany
    private Set<MvQuestion> questions;

    @OneToOne
    private MvAnswerSet answerSet;

}
