package com.clean.jose.clean.infra.repositories;

import com.clean.jose.clean.domain.boundaries.UserRepositoryInterface;
import com.clean.jose.clean.domain.entities.User;
import com.clean.jose.clean.infra.boundaries.UserDatasourceInterface;
import com.clean.jose.clean.infra.models.UserDto;
import com.clean.jose.clean.infra.models.UserMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserRepositoryImpl implements UserRepositoryInterface {

    private final UserDatasourceInterface userDatasourceInterface;
    private final UserMapper userMapper;

    public UserRepositoryImpl(UserDatasourceInterface userDatasourceInterface, UserMapper userMapper) {
        this.userDatasourceInterface = userDatasourceInterface;
        this.userMapper = userMapper;
    }

    @Override
    public User create(User user) {
        UserDto newUser = userDatasourceInterface.save(userMapper.toDto(user));
        return userMapper.toUser(newUser);
    }

    @Override
    public User find(String name) {
        return null;
    }

    @Override
    public void delete(String name) {

    }

    @Override
    public List<User> findAll() {
        return userDatasourceInterface.findAll().stream().map(it -> new User(it.getName(), it.getPassword())).collect(Collectors.toList());
    }
}
