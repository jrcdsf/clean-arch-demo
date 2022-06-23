package com.clean.jose.clean.domain.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserCreateRequestModel {

    private String name;
    private String password;
}
