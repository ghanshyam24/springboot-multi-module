package com.user.management.shared.mapper;

import com.user.management.shared.dto.UserDto;
import com.user.management.shared.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "password", ignore = true)
    UserDto toDto(User entity);

    User toEntity(UserDto dto);
}
