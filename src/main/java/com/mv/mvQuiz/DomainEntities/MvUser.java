package com.mv.mvQuiz.DomainEntities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class MvUser {

	public MvUser() {
		super();
	}

	public MvUser(int userId, String userName, String password, boolean status, List<String> roles) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.status = status;
		this.roles = roles;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;

	@Column(unique = true)
	private String userName;

	private String password;
	private boolean status;

	@ElementCollection
	private List<String> roles;

}
