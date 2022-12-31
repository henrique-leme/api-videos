package com.hleme.apivideos.DTO.request;

import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@ToString
@AllArgsConstructor
public class UserRequest {
    @NotBlank(message = "name must not be null or blank")
    @Size(max = 100, message = "name must be maximum {max} characters long")
    private String name;
    @NotBlank(message = "email must not be null or blank")
    @Email(message = "email must be a well-formed email address")
    @Size(max = 255, message = "email must be {max} characters long")
    private String email;
    @NotBlank(message = "password must not be null or blank")
    @Size(min = 6, max = 25, message = "password must be between {min} and {max} characters long")
    private String password;
}
