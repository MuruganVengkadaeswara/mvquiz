package com.mv.mvQuiz.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mv.mvQuiz.Dto.MvQuestionDTO;
import com.mv.mvQuiz.Response.GeneralResponse;
import com.mv.mvQuiz.Service.MvQuestionService;

@RestController
public class QuestionController {

    @Autowired
    MvQuestionService questionService;

    @PostMapping("/question")
    public GeneralResponse addQuestion(@RequestBody MvQuestionDTO question) {
	return questionService.addQuestion(question);

    }

    @GetMapping("/question/{id}")
    public GeneralResponse getQuestionById(@PathVariable("id") String id) {
	return questionService.getQuestionById(Integer.parseInt(id));
    }

    @DeleteMapping("/question/{id}")
    public GeneralResponse deleteQuestionById(@PathVariable("id") String id) {
	return questionService.removeQuestion(Integer.parseInt(id));
    }

    @GetMapping("/questionset/{quesSetName}")
    public GeneralResponse getQuestionSetByName(@PathVariable("quesSetName") String quesSetName) {
	return questionService.getQuestionSetByName(quesSetName);
    }

}
