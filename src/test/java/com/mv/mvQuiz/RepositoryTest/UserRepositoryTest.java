package com.mv.mvQuiz.RepositoryTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.mv.mvQuiz.DomainEntities.MvUser;
import com.mv.mvQuiz.Repository.MvUserRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
class UserRepositoryTest {

	@Autowired
	private MvUserRepository repository;

	@Test
	void testAddUser() {
		MvUser user = new MvUser();
		user.setUserName("FirstUser");
		user.setPassword("Password");
		user.setStatus(true);
		List<String> roles = new ArrayList<>();
		roles.add("user");
		roles.add("admin");
		user.setRoles(roles);

		MvUser user1 = repository.save(user);
		assertEquals(user.getUserName(), repository.findByUserName("FirstUser").get().getUserName());
		assertNotNull(user1);

	}

}
