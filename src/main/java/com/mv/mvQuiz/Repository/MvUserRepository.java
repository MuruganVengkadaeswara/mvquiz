package com.mv.mvQuiz.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mv.mvQuiz.DomainEntities.MvUser;

public interface MvUserRepository extends JpaRepository<MvUser, Integer> {

	Optional<MvUser> findByUserName(String userName);

}
