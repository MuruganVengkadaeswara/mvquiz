package com.mv.mvQuiz.RepositoryTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.mv.mvQuiz.DomainEntities.MvQuestion;
import com.mv.mvQuiz.DomainEntities.MvQuestionSet;
import com.mv.mvQuiz.Repository.MvQuestionRepository;
import com.mv.mvQuiz.Repository.MvQuestionSetRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
class MvQuestionSetRepositoryTest {

	@Autowired
	MvQuestionRepository quesRepo;

	@Autowired
	MvQuestionSetRepository quesSetRepo;

	@Test
	void testAddQuestionSetWithQuestions() {
		MvQuestionSet quesSet = new MvQuestionSet();
		quesSet.setQuesSetName("FirstSetName");
		quesSetRepo.save(quesSet);
		
	}

}
