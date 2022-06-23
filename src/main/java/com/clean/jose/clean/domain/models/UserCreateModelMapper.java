package com.clean.jose.clean.domain.models;

import com.clean.jose.clean.domain.entities.User;

public class UserCreateModelMapper {

    UserCreateResponseModel toUserCreateResponseModel(UserCreateRequestModel userCreateRequestModel) {
        return new UserCreateResponseModel(userCreateRequestModel.getName());
    }


}
