package com.mv.mvQuiz.DomainEntities;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table
@Entity
public class MvQuestion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int quesId;

	private String quesType;
	private String quesString;
	@ElementCollection
	private List<String> options;

	@ManyToMany
	private List<MvQuestionSet> questionSet;

	@OneToMany
	private List<MvAnswer> answers;

}
