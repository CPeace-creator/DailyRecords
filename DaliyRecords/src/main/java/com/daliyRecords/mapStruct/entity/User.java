package com.daliyRecords.mapStruct.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String id;
    private Integer userCode2;
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", userCode2='" + userCode2 + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

