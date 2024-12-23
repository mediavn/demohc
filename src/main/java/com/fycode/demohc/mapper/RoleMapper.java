package com.fycode.demohc.mapper;

import com.fycode.demohc.dto.request.RoleRequest;
import com.fycode.demohc.dto.response.RoleResponse;

import com.fycode.demohc.entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    @Mapping(target = "permissions", ignore = true)
    Role toRole(RoleRequest request);

    RoleResponse toRoleResponse(Role role);
}
