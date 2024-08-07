package com.daliyRecords.mapStruct;

import com.daliyRecords.mapStruct.entity.User;
import com.daliyRecords.mapStruct.entity.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public  interface UserConvertMapper extends BaseMapper<UserDto, User> {


    @Override
    @Mapping(target = "userCode2",source = "userCode")
    User toEntity(UserDto dto);

    @Override
    @Mapping(target = "userCode",source = "userCode2")
    UserDto toDto(User entity);


    @Override
    List<User> toEntityList(List<UserDto> dtoList);

    @Override
    List<UserDto> toDtoList(List<User> dtoList);
}
