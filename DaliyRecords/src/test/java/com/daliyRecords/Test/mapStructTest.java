package com.daliyRecords.Test;

import com.daliyRecords.mapStruct.BaseMapper;
import com.daliyRecords.mapStruct.UserConvertMapper;
import com.daliyRecords.mapStruct.entity.User;
import com.daliyRecords.mapStruct.entity.UserDto;
import jakarta.annotation.Resource;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class mapStructTest {
    @Resource
    private BaseMapper<UserDto, User> userMapper;

    public  mapStructTest(){
        this.userMapper = BaseMapper.getMapper(UserConvertMapper.class);
    }
    @Test
    public void test01() {

        User user=new User("1",10,"test");
        ArrayList<User> users = new ArrayList<>();
        users.add(user);
        List<UserDto> userDtos = userMapper.toDtoList(users);
        UserDto dto = userMapper.toDto(user);
        System.out.println(dto.toString());
        System.out.println(userDtos);
    }
}
