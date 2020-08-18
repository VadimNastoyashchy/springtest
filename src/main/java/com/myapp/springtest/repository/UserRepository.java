package com.myapp.springtest.repository;

import com.myapp.springtest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Vadym Nastoiashchyi
 */

public interface UserRepository extends JpaRepository<User, Long> {

}
