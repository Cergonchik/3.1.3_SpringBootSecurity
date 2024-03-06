package ru.kata.spring.boot_security.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
   // @Query("select u from User u left join fetch u.roles where u.username = :username")
   @Query("Select u from User u join fetch u.roles where u.username=:username")
    User findByUsername(String username);

   /*
   Создание таблиц

   select * from users;
    select * from user_roles;
    select * from roles;

    DELETE FROM users WHERE id = 3;

    CREATE TABLE `userdb`.`users` (
            `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
    PRIMARY KEY (`id`))
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8;

    drop table users;

    UPDATE roles SET name = "ADMIN"
    where id = 1;
    UPDATE roles SET name = "USER"
    where id = 2;

    UPDATE users SET  password = "$2a$12$9zAhIH70HrylQqtALHQbGeFl2sMmNxUv2JRyFV.vLqrTQzb7CH0mu"
    where id = 2;
    UPDATE users SET password = "$2a$12$cv4/OdRrO.C4wWAzvAFeFu44/X/pK2.iN0nG/2NnxbceGgCIOgxEO"
    where id = 1;

    INSERT INTO roles (name) VALUES("ROLE_ADMIN");
    INSERT INTO roles (name) VALUES("ROLE_USER");

    INSERT INTO users (username,password) VALUES("user","$2a$12$9zAhIH70HrylQqtALHQbGeFl2sMmNxUv2JRyFV.vLqrTQzb7CH0mu");
    INSERT INTO users (username,password) VALUES("admin","$2a$12$cv4/OdRrO.C4wWAzvAFeFu44/X/pK2.iN0nG/2NnxbceGgCIOgxEO");

    CREATE TABLE `userdb`.`user_roles` (
            `user_id` INT NOT NULL REFERENCES users(id) ,
  `role_id` VARCHAR(45) NULL REFERENCES roles(id),
    PRIMARY KEY (`user_id`) )
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8;

    INSERT INTO user_roles (user_id, role_id) VALUES(1,1);
    INSERT INTO user_roles (user_id, role_id) VALUES(2,2);

*/

}
