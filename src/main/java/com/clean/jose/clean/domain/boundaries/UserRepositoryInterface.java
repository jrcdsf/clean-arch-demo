package com.clean.jose.clean.domain.boundaries;

import com.clean.jose.clean.domain.entities.User;

import java.util.List;

public interface UserRepositoryInterface {

    User create(User user);
    User find(String name);
    void delete(String name);
    List<User> findAll();

}
