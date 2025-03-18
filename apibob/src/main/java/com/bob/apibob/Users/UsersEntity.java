package com.bob.apibob.models.entitys;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "users")
public class UsersEntity implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    @Column(name = "names", nullable = false, length = 160)
    private String names;

    @Column(name = "pass", nullable = false, columnDefinition = "TEXT")
    private String pass;

    @Column(name = "mail", nullable = false, length = 160)
    private String mail;

    @Column(name = "status", nullable = false, columnDefinition = "ENUM('ACTIVE', 'INACTIVE','BLOCKED') DEFAULT 'INACTIVE'")
    private String status;

    public UsersEntity() {
    }

    

    
}