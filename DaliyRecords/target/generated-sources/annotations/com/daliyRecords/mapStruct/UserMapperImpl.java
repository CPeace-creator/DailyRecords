package com.daliyRecords.mapStruct;

import com.daliyRecords.mapStruct.entity.User;
import com.daliyRecords.mapStruct.entity.UserDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-06T16:13:36+0800",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 22.0.2 (Oracle Corporation)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public User toEntity(UserDto dto) {
        if ( dto == null ) {
            return null;
        }

        User user = new User();

        user.setUserCode2( dto.getUserCode() );
        user.setId( dto.getId() );
        user.setName( dto.getName() );

        return user;
    }

    @Override
    public UserDto toDto(User entity) {
        if ( entity == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setUserCode( entity.getUserCode2() );
        userDto.setUserCode2( entity.getUserCode2() );
        userDto.setId( entity.getId() );
        userDto.setName( entity.getName() );

        return userDto;
    }

    @Override
    public List<User> toEntityList(List<UserDto> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<User> list = new ArrayList<User>( dtoList.size() );
        for ( UserDto userDto : dtoList ) {
            list.add( toEntity( userDto ) );
        }

        return list;
    }

    @Override
    public List<UserDto> toDtoList(List<User> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<UserDto> list = new ArrayList<UserDto>( dtoList.size() );
        for ( User user : dtoList ) {
            list.add( toDto( user ) );
        }

        return list;
    }
}
