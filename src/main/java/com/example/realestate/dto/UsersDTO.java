package com.example.realestate.dto;

import com.example.realestate.entity.Users;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsersDTO {
    private Long id;
    private String name;
    private String email;
    private String password;
    private String phone;
    private Double budget;
    private String location;
    private String preferences;

    public static UsersDTO fromEntity(Users users){
        UsersDTO dto = new UsersDTO();
        dto.setId(users.getId());

        return dto;
    }

    public static Users toEntity(UsersDTO dto){
        Users users = new Users();
        users.setId(dto.getId());

        return users;
    }
}
