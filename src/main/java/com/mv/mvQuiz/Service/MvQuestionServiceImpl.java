package com.mv.mvQuiz.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mv.mvQuiz.Constants.MvQuizConstants;
import com.mv.mvQuiz.Constants.Status;
import com.mv.mvQuiz.DomainEntities.MvQuestion;
import com.mv.mvQuiz.DomainEntities.MvQuestionSet;
import com.mv.mvQuiz.Dto.MvQuestionDTO;
import com.mv.mvQuiz.Dto.MvQuestionSetDTO;
import com.mv.mvQuiz.Exceptions.MvQuizException;
import com.mv.mvQuiz.Repository.MvQuestionRepository;
import com.mv.mvQuiz.Repository.MvQuestionSetRepository;
import com.mv.mvQuiz.Response.GeneralResponse;

@Service
public class MvQuestionServiceImpl implements MvQuestionService {

    @Autowired
    MvQuestionRepository questionRepository;

    @Autowired
    MvQuestionSetRepository questionSetRepository;

    @Autowired
    ObjectMapper mapper;

    @Override
    public GeneralResponse addQuestion(MvQuestionDTO question) throws MvQuizException {

	GeneralResponse response = new GeneralResponse();
	if (isValidQuestion(question)) {
	    MvQuestion questionEntity = new MvQuestion();
	    questionEntity = mapper.convertValue(question, MvQuestion.class);
	    questionRepository.save(questionEntity);
	    question = mapper.convertValue(questionEntity, MvQuestionDTO.class);
	    response.setResponse(question);
	    response.setStatus(Status.SUCCESS.toString());
	} else {
	    throw new MvQuizException(String.format(MvQuizConstants.QUESTION_IS_INVALID, question.getQuesString()));
	}
	return response;
    }

    @Override
    public GeneralResponse getQuestionById(Integer questionId) throws MvQuizException {

	Optional<MvQuestion> question = questionRepository.findById(questionId);
	if (question.isPresent()) {
	    GeneralResponse response = new GeneralResponse();
	    MvQuestionDTO questionDTO = mapper.convertValue(question, MvQuestionDTO.class);
	    response.setResponse(questionDTO);
	    return response;
	} else {
	    throw new MvQuizException(MvQuizConstants.QUESTION_NOT_FOUND);
	}

    }

    @Override
    public GeneralResponse removeQuestion(Integer questionId) throws MvQuizException {

	GeneralResponse response = new GeneralResponse();
	Optional<MvQuestion> question = questionRepository.findById(questionId);
	if (question.isPresent()) {
	    questionRepository.delete(question.get());
	    response.setStatus(Status.SUCCESS.toString());
	    return response;
	} else {
	    throw new MvQuizException(MvQuizConstants.QUESTION_NOT_FOUND_TO_DELETE);
	}

    }

    @Override
    public GeneralResponse getQuestionSetByName(String questionSetName) throws MvQuizException {

	GeneralResponse response = new GeneralResponse();
	Optional<MvQuestionSet> questionSet = questionSetRepository.findByQuesSetName(questionSetName);
	if (questionSet.isPresent()) {
	    MvQuestionSetDTO questionSetDTO = mapper.convertValue(questionSet, MvQuestionSetDTO.class);
	    response.setResponse(questionSetDTO);
	    return response;
	} else {
	    throw new MvQuizException(MvQuizConstants.QUESTION_SET_NOT_FOUND);
	}

    }

    @Override
    public GeneralResponse removeQuestionSetByName(String questionSetName) {

	GeneralResponse response = new GeneralResponse();
	Integer quesSetId = questionSetRepository.deleteByQuesSetName(questionSetName);
	if (null != quesSetId && quesSetId != 0) {
	    response.setResponse(quesSetId);
	} else {
	    throw new MvQuizException(MvQuizConstants.UNABLE_TO_DELETE_QUESTION_SET);
	}

	return null;
    }

    @Override
    public GeneralResponse addQuestionSet(MvQuestionSetDTO questionSet) throws MvQuizException {

	GeneralResponse response = new GeneralResponse();
	MvQuestionSet qSet;
	if (isValidQuestionSet(questionSet)) {
	    qSet = mapper.convertValue(questionSet, MvQuestionSet.class);
	    questionSetRepository.save(qSet);
	    questionSet = mapper.convertValue(qSet, MvQuestionSetDTO.class);
	    response.setResponse(questionSet);
	}
	return response;
    }

    @Override
    public GeneralResponse updateQuestion(MvQuestionDTO question) throws MvQuizException {

	GeneralResponse response = new GeneralResponse();

	Optional<MvQuestion> questionEntity = questionRepository.findById(question.getQuesId());
	if (questionEntity.isPresent()) {
	    MvQuestion ques = mapper.convertValue(question, MvQuestion.class);
	    ques.setQuesId(questionEntity.get().getQuesId());
	    questionRepository.save(ques);
	    response.setResponse(mapper.convertValue(ques, MvQuestionDTO.class));
	    return response;
	} else {
	    throw new MvQuizException(MvQuizConstants.QUESTION_NOT_FOUND);
	}

    }

    @Override
    public GeneralResponse updateQuestionSet(MvQuestionSetDTO questionSet) throws MvQuizException {

	GeneralResponse response = new GeneralResponse();
	Optional<MvQuestionSet> questionSetEntity;

	if (null != questionSet.getQuesSetId()) {
	    questionSetEntity = questionSetRepository.findById(questionSet.getQuesSetId());
	} else if (null != questionSet.getQuesSetName()) {
	    questionSetEntity = questionSetRepository.findByQuesSetName(questionSet.getQuesSetName());
	} else {
	    throw new MvQuizException(MvQuizConstants.PROVIDE_QUESTION_SET_ID_OR_NAME);
	}

	if (questionSetEntity.isPresent()) {
	    MvQuestionSet queSet = mapper.convertValue(questionSet, MvQuestionSet.class);
	    queSet.setQuesSetId(questionSetEntity.get().getQuesSetId());
	    questionSetRepository.save(queSet);

	}

	return null;
    }
    
    
    @Override
    public GeneralResponse getQuestionSetwithAnswersByName(String questionSetName) throws MvQuizException {
	GeneralResponse response = new GeneralResponse();
	Optional<MvQuestionSet> questionSet = questionSetRepository.findByQuesSetName(questionSetName);
	if (questionSet.isPresent()) {
	    MvQuestionSetDTO questionSetDTO = mapper.convertValue(questionSet, MvQuestionSetDTO.class);
	    response.setResponse(questionSetDTO);
	    return response;
	} else {
	    throw new MvQuizException(MvQuizConstants.QUESTION_SET_NOT_FOUND);
	}
    }

    private boolean isValidQuestionSet(MvQuestionSetDTO questionSetDTO) {
	if (null != questionSetDTO.getQuesSetName()) {
	    if (questionSetRepository.findByQuesSetName(questionSetDTO.getQuesSetName()).isPresent()) {
		throw new MvQuizException(String.format(MvQuizConstants.QUESTION_SET_NAME_PRESENT_ALREADY,
			questionSetDTO.getQuesSetName()));
	    }
	    for (MvQuestionDTO question : questionSetDTO.getQuestions()) {
		if (!isValidQuestion(question)) {
		    throw new MvQuizException(
			    String.format(MvQuizConstants.QUESTION_IS_INVALID, question.getQuesString()));
		}
	    }
	    return Boolean.TRUE;
	} else {
	    throw new MvQuizException(MvQuizConstants.QUESTION_SET_NAME_IS_MANDATORY);
	}
    }

    private boolean isValidQuestion(MvQuestionDTO question) {
	if (null != question.getQuesString() && null != question.getOptions() && question.getOptions().size() >= 4
		&& null != question.getQuesType()) {
	    return Boolean.TRUE;
	} else {
	    return Boolean.FALSE;
	}
    }

}
