package com.bob.apibob.models.entitys;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


@Entity
@Table(name = "visitors")
public class VisitorsEntity implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    @Column(name = "faceData", nullable = false, columnDefinition = "TEXT")
    private String faceData;

    @OneToOne
    @JoinColumn(name = "userId", nullable = false)
    private UsersEntity user;

    public VisitorsEntity() {
    }

}