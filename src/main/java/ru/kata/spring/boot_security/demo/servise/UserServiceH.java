package ru.kata.spring.boot_security.demo.servise;





import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;


public interface UserServiceH {
     List<User> getAllUsers();
     void addUser(User user);
     void deleteUser(int userId);
     void updateUser(int id, User user);
     User getUser(int userId);
}
