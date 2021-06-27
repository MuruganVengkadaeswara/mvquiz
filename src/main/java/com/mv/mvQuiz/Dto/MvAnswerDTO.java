package com.mv.mvQuiz.Dto;

import lombok.Data;

@Data
public class MvAnswerDTO {
	private int ansId;

	private String ansType;
	private String optionValue;
	private String ansString;
}
