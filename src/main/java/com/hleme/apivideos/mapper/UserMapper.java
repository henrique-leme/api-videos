package com.hleme.apivideos.mapper;

public interface UserMapper {
    User fromUserRequest(UserRequest userRequest);

    UserResponse toUserResponse(User user);
}
