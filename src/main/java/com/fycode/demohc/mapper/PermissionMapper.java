package com.fycode.demohc.mapper;


import com.fycode.demohc.dto.request.PermissionRequest;
import com.fycode.demohc.dto.response.PermissionResponse;
import com.fycode.demohc.entity.Permission;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);
    PermissionResponse toPermissionResponse(Permission permission);
}
