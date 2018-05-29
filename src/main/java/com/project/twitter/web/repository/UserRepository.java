package com.project.twitter.web.repository;

import com.project.twitter.web.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
	    User findByUsername(String username);
}
