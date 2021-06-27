package com.mv.mvQuiz.Dto;

import java.util.List;

import lombok.Data;

@Data
public class MvAnswerSetDTO {

	private int ansSetId;

	List<MvAnswerDTO> answers;

	MvQuestionSetDTO questionSet;

}
