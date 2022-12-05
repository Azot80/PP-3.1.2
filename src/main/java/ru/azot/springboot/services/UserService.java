package ru.azot.springboot.services;



import ru.azot.springboot.models.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();

    void saveUser(User user);

    User getUserById(long id);

    void update(long id, User user);

    void deleteUser(long id);
}
