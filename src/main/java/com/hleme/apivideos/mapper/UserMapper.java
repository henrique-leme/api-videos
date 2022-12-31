package com.hleme.apivideos.mapper;

import com.hleme.apivideos.DTO.request.UserRequest;
import com.hleme.apivideos.DTO.response.UserResponse;
import com.hleme.apivideos.model.User;

public interface UserMapper {
    User fromUserRequest(UserRequest userRequest);

    UserResponse toUserResponse(User user);
}
