package com.hleme.apivideos.mapper;

import com.hleme.apivideos.DTO.request.UserRequest;
import com.hleme.apivideos.DTO.response.UserResponse;
import com.hleme.apivideos.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.modelmapper.ModelMapper;


@Component
@RequiredArgsConstructor
public class UserMapperImp implements UserMapper{
    private final ModelMapper mapper;

    @Override
    public User fromUserRequest(UserRequest userRequest) {
        return mapper.map(userRequest, User.class);
    }

    @Override
    public UserResponse toUserResponse(User user) {
        return mapper.map(user, UserResponse.class);
    }
}
