package com.mv.mvQuiz.RepositoryTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.mv.mvQuiz.DomainEntities.MvQuestion;
import com.mv.mvQuiz.Repository.MvQuestionRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
class MvQuestionRepositoryTest {

	@Autowired
	MvQuestionRepository repository;

	@Test
	void testAddQuestionWithoutQuestionSet() {
		MvQuestion question = new MvQuestion();
		question.setQuesType("MCQ");
		question.setQuesString("WHat is your name");
		repository.save(question);
	}

}
