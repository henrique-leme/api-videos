package com.hleme.apivideos.controller;

import com.hleme.apivideos.DTO.response.UserResponse;
import com.hleme.apivideos.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @GetMapping
    public ResponseEntity<Page<UserResponse>> fetchAll(@PageableDefault(size = 5) Pageable pageable) {
        return ResponseEntity.ok(userService.fetchAll(pageable));
    }
}
