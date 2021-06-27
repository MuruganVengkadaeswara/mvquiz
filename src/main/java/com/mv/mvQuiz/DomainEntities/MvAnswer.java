package com.mv.mvQuiz.DomainEntities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class MvAnswer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ansId;

	private String ansType;
	private String optionValue;
	private String ansString;

	@ManyToOne
	private MvQuestion question;

	@ManyToOne
	private MvAnswerSet ansSet;

}
