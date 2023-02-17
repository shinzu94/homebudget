package com.shinzu.homebudget.infrastructure.security.controller;

import com.shinzu.homebudget.infrastructure.security.dto.UserDto;
import com.shinzu.homebudget.infrastructure.security.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SecurityController {

    private final UserMapper userMapper;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createUser(@RequestBody UserDto userDto) {
        userMapper.mapToEntity(userDto);
    }
}
