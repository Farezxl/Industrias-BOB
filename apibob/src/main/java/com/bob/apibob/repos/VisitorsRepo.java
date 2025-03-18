package com.bob.apibob.models.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bob.springapi.models.entitys.VisitorsEntity;

@Repository
public interface VisitorsRepo extends JpaRepository<VisitorsEntity, Long> {

}