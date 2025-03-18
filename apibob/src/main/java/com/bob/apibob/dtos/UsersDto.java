package com.bob.apibob.models.dtos;

import com.bob.apibob.models.entitys.UsersEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class UsersDto {

    private Long id;
    private String names;
    private String pass;
    private String mail;
    private String status;

    public UsersDto(UsersEntity user) {
        this.id = user.getId();
        this.names = user.getNames();
        this.pass = user.getPass();
        this.mail = user.getMail();
        this.status = user.getStatus();

    }

}