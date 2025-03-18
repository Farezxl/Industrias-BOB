package com.bob.apibob.models.repos;    

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bob.apibob.models.entitys.UsersEntity;

@Repository
public interface UsersRepositorys extends JpaRepository<UsersEntity, Long> {

}