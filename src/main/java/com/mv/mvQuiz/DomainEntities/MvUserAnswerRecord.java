package com.mv.mvQuiz.DomainEntities;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonRawValue;

import lombok.Data;

@Data
@Entity
@Table
public class MvUserAnswerRecord {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ansRecId;

	private Long score;
	
	@OneToOne
	private MvQuestionSet questionSet;

	@JsonRawValue
	@Column(columnDefinition = "json")
	private String userAnswer;

}
