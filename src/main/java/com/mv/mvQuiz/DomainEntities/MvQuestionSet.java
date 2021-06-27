package com.mv.mvQuiz.DomainEntities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
    @Column(name = "ques_set_id")
    private int quesSetId;

    @Column(unique = true)
    private String quesSetName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "ques_set_id")
    private Set<MvQuestion> questions;

    @OneToOne
    private MvAnswerSet answerSet;

}
