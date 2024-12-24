package com.springacademy.usermicroservices.repositories;

import com.springacademy.usermicroservices.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {


    User save(User user);


    Optional<User> findById(Long aLong);

   Optional findByEmail(String email);
}
