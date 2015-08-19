/**
 * 
 */
package org.springframework.samples.quickstarter.repository.impl;

import org.springframework.stereotype.Repository;

import org.springframework.samples.quickstarter.model.User;
import org.springframework.samples.quickstarter.repository.UserRepository;

/**
 * @author AM283065
 *
 */
@Repository
public class UserRepositoryImpl implements UserRepository {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wipro.quickstarter.repository.UserRepository#getUserDetails()
	 */
	@Override
	public User getUserDetails() {
		// Hit the database
		User user = new User("Spring", "Quickstarter", "spring.quickstarter@mail.com");
		return user;
	}

}
