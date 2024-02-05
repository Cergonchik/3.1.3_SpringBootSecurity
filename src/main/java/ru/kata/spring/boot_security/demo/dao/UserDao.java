package ru.kata.spring.boot_security.demo.dao;





import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserDao {
    public List<User> getAllUsers();
    public void addUser(User user);
    public void deleteUser(int userId);
    public void updateUser(int id, User user);
    public User getUser(int userId);

}