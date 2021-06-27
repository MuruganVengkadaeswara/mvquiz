package com.mv.mvQuiz.Service;

import org.springframework.stereotype.Service;

import com.mv.mvQuiz.Dto.MvQuestionDTO;
import com.mv.mvQuiz.Dto.MvQuestionSetDTO;
import com.mv.mvQuiz.Exceptions.MvQuizException;
import com.mv.mvQuiz.Response.GeneralResponse;

@Service
public interface MvQuestionService {

	public GeneralResponse addQuestion(MvQuestionDTO question) throws MvQuizException;
	
	public GeneralResponse getQuestionById(Integer questionId) throws MvQuizException;

	public GeneralResponse removeQuestion(Integer questionId) throws MvQuizException;

	public GeneralResponse getQuestionSetByName(String questionSetName) throws MvQuizException;

	public GeneralResponse removeQuestionSetByName(String questionSetName) throws MvQuizException;

	public GeneralResponse addQuestionSet(MvQuestionSetDTO questionSet) throws MvQuizException;

}
