package com.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.demo.entities.User;
import com.demo.repositories.UserRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class FirstTest {

	@Autowired
	private TestEntityManager em;

	@Autowired
	private UserRepository userRepository;
	

	@Test
	public void shouldSave() {
		String email = "Markcarltimfing@test.com";
		String address = "japan";
		int age = 45;
		String pwd = "123";
		
		User user = new User();
		user.setEmail(email);
		user.setAddress(address);
		user.setAge(age);
		user.setPassword(pwd);
		
		em.persist(user);
		em.flush();
		
		
		User foundUser = userRepository.findById(email).orElse(null);
		
		Assert.assertTrue(foundUser != null);
		Assert.assertTrue(email.equals(foundUser.getEmail()));
		Assert.assertTrue(address.equals(foundUser.getAddress()));
		Assert.assertTrue(pwd.equals(foundUser.getPassword()));
//		Assert.assertTrue(99==foundUser.getAge());
		
		Assert.assertSame(age, foundUser.getAge());
	}
}
