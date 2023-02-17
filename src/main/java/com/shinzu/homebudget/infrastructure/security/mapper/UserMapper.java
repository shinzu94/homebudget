package com.shinzu.homebudget.infrastructure.security.mapper;

import com.shinzu.homebudget.infrastructure.security.dto.UserDto;
import com.shinzu.homebudget.infrastructure.security.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User mapToEntity(UserDto userDto);
}
