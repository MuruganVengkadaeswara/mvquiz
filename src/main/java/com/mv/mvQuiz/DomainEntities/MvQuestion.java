package com.mv.mvQuiz.DomainEntities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table
@Entity
public class MvQuestion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ques_id")
    private int quesId;

    private String quesType;
    private String quesString;
    @ElementCollection
    private List<String> options;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "ques_id")
    private List<MvAnswer> answers;

    @ManyToOne
    private MvQuestionSet questionSet;

}
