package com.mv.mvQuiz.Service;

import com.mv.mvQuiz.Dto.MvUserDTO;
import com.mv.mvQuiz.Response.GeneralResponse;

public interface MvUserService {

    public GeneralResponse getUserById(Integer userId);

    public GeneralResponse addUser(MvUserDTO userDto);

    public GeneralResponse removeUserById(Integer userId);

    public GeneralResponse updateUser(MvUserDTO userDto);

    public GeneralResponse getUserByUserName(String userName);
}
