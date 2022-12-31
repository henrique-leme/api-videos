package com.hleme.apivideos.service;

import com.hleme.apivideos.DTO.response.UserResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    Page<UserResponse> fetchAll(Pageable pageable);
}
