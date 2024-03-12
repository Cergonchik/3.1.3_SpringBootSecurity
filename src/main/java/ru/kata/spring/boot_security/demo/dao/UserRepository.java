package ru.kata.spring.boot_security.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
   //@Query("Select u from User u left join fetch u.roles where u.username=:username")
   @Query("SELECT u FROM User u JOIN FETCH u.roles WHERE u.username = :username")
    User findUserByUsername(String username);


}
