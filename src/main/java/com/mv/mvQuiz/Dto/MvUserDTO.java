package com.mv.mvQuiz.Dto;

import java.util.List;

import lombok.Data;

@Data
public class MvUserDTO {

	private int userId;
	private String userName;
	private String password;
	private boolean status;
	private List<String> roles;
}
