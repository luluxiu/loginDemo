package com.example.repository;

import com.example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by freedom on 2016/4/10.
 */
@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Long> {

    User findByName(String name);
}
