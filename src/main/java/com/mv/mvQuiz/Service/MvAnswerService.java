package com.mv.mvQuiz.Service;

import com.mv.mvQuiz.Response.GeneralResponse;

public interface MvAnswerService {
    
    public GeneralResponse getAnswerSetByQuestionSetId(Integer questionSetId);
    
    

}
