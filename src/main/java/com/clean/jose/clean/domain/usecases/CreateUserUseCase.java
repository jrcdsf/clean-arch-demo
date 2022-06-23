package com.clean.jose.clean.domain.usecases;

import com.clean.jose.clean.domain.boundaries.UserRepositoryInterface;
import com.clean.jose.clean.domain.entities.User;
import com.clean.jose.clean.domain.models.UserCreateResponseModel;
import com.clean.jose.clean.domain.models.UserResponseModel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CreateUserUseCase {

    private final UserRepositoryInterface userRepositoryInterface;

    public CreateUserUseCase(UserRepositoryInterface userRepositoryInterface) {
        this.userRepositoryInterface = userRepositoryInterface;
    }

    public UserCreateResponseModel create(String name, String password){
        User newUser = userRepositoryInterface.create(new User(name, password));
        return new UserCreateResponseModel(newUser.getName());
    }

    public List<UserResponseModel> findAll(){
        return userRepositoryInterface.findAll().stream().map(it -> new UserResponseModel(it.getName())).collect(Collectors.toList());
    }
}
