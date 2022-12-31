package com.hleme.apivideos.service;

import com.hleme.apivideos.DTO.response.UserResponse;
import com.hleme.apivideos.mapper.UserMapper;
import com.hleme.apivideos.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImp implements UserService{
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public Page<UserResponse> fetchAll(Pageable pageable) {
        return userRepository.findAll(pageable).map(userMapper::toUserResponse);
    }
}
