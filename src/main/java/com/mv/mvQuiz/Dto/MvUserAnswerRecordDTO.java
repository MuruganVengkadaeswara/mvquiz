package com.mv.mvQuiz.Dto;

import lombok.Data;

@Data
public class MvUserAnswerRecordDTO {

	private int ansRecId;
	private Long score;
	private MvQuestionSetDTO questionSet;
	private String userAnswer;

}
