package com.djl.dao;

import com.djl.po.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by limi on 2017/10/15.
 */
public interface UserRepository extends JpaRepository<User,Long>, JpaSpecificationExecutor<User> {

    @Query("select u from User u where u.username = ?1 and u.password =?2")
    User findByUsernameAndPassword(String username, String password);
}
