package com.bob.apibob.models.dtos;

import com.bob.apibob.models.entitys.VisitorsEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class VisitorsDto {

    private long id;
    private String faceData;
    private long userId;

    public VisitorsDto(VisitorsEntity visitor) {
        this.id = visitor.getId();
        this.faceData = visitor.getFaceData();
        this.userId = visitor.getUser().getId();
    }

}