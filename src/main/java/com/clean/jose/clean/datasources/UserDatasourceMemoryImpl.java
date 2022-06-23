package com.clean.jose.clean.datasources;

import com.clean.jose.clean.infra.boundaries.UserDatasourceInterface;
import com.clean.jose.clean.infra.models.UserDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDatasourceMemoryImpl implements UserDatasourceInterface {

    private List<UserDto> list;

    UserDatasourceMemoryImpl(){
        list = new ArrayList<>();
    }

    @Override
    public UserDto save(UserDto userDto) {
        list.add(userDto);
        return userDto;
    }

    @Override
    public List<UserDto> findAll() {
        return list;
    }
}
