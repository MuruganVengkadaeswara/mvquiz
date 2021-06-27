package com.mv.mvQuiz.Exceptions;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.mv.mvQuiz.Constants.Status;
import com.mv.mvQuiz.Response.GeneralResponse;

@RestControllerAdvice
public class MvQuizGlobalExceptionHandler {

    @ExceptionHandler
    GeneralResponse handler(Exception e) {
	GeneralResponse response = new GeneralResponse();
	response.setStatus(Status.FAILURE.toString());
	response.setError(e.getMessage());
	return response;
    }

}
