package com.mv.mvQuiz.DomainEntities;

import java.util.List;

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
public class MvAnswerSet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ans_set_id")
    private int ansSetId;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "ans_set_id")
    private List<MvAnswer> answers;

    @OneToOne
    private MvQuestionSet questionSet;
}
