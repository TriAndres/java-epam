package ru.yandex.user.repository;

import ru.yandex.user.model.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private final Map<Long, User> users = new HashMap<>();

    public Collection<User> findAllUser() {
      return users.values();
    }

    public User createUser(User user) {
        users.put(user.getId(), user);
        return user;
    }

    public User findByIdUser(long id) {
        return users.get(id);
    }
}