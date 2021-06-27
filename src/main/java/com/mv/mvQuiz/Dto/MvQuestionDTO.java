package com.mv.mvQuiz.Dto;

import java.util.List;

import lombok.Data;

@Data
public class MvQuestionDTO {

	private int quesId;
	private String quesName;
	private String quesType;
	private String quesString;
	private List<String> options;

}
