package com.fycode.demohc.mapper;


import com.fycode.demohc.dto.request.UserCreationRequest;
import com.fycode.demohc.dto.request.UserUpdateRequest;
import com.fycode.demohc.dto.response.UserResponse;
import com.fycode.demohc.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);

    UserResponse toUserResponse(User user);

    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
