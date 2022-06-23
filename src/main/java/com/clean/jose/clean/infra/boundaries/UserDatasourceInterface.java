package com.clean.jose.clean.infra.boundaries;

import com.clean.jose.clean.infra.models.UserDto;

import java.util.List;

public interface UserDatasourceInterface {

    UserDto save(UserDto userDto);
    List<UserDto> findAll();
}
