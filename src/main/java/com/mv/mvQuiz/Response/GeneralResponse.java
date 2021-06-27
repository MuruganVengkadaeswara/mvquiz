package com.mv.mvQuiz.Response;

import com.mv.mvQuiz.Constants.Status;

import lombok.Data;

@Data
public class GeneralResponse {

    private String status = Status.SUCCESS.toString();
    private Object response;
    private String error;

}
