package ru.itmo.webmail.model.repository;

import ru.itmo.webmail.model.domain.User;

import java.util.List;

public interface UserRepository {
    User find(long userId);
    User findByLogin(String login);
    User findByEmail(String email);
    User findByLoginOrEmailAndPasswordSha(String loginOrEmail, String passwordSha);
    User findByLoginOrEmail(String loginOrEmail);
    List<User> findAll();
    void save(User user, String passwordSha);
    void updateUserConfirmation(long id, boolean status);
}
