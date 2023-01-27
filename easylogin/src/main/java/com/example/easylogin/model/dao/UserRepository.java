package com.example.easylogin.model.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;


import com.example.easylogin.model.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	@RequestMapping
	List<User> findByUserNameAndPassword(String userName, String password);

}
