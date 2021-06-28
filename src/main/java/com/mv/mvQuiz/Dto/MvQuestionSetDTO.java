package com.mv.mvQuiz.Dto;

import java.util.Set;

import lombok.Data;

@Data
public class MvQuestionSetDTO {

	private Integer quesSetId;

	private String quesSetName;

	private Set<MvQuestionDTO> questions;

}
