package com.clean.jose.clean.controllers;

import com.clean.jose.clean.domain.entities.User;
import com.clean.jose.clean.domain.models.UserCreateRequestModel;
import com.clean.jose.clean.domain.models.UserCreateResponseModel;
import com.clean.jose.clean.domain.models.UserResponseModel;
import com.clean.jose.clean.domain.usecases.CreateUserUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private CreateUserUseCase createUserUseCase;

    @PostMapping
    @ResponseBody
    public UserCreateResponseModel create(@RequestBody UserCreateRequestModel userCreateRequestModel){
        return createUserUseCase.create(userCreateRequestModel.getName(), userCreateRequestModel.getPassword());
    }

    @GetMapping
    public List<UserResponseModel> list(){
        return createUserUseCase.findAll();
    }
}
