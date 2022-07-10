package com.practice.security.user;

import lombok.Data;

/**
 * 회원가입 DTO
 */
@Data
public class UserRegisterDto {
    private String username;
    private String password;
}
