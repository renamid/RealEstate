package com.example.realestate.dto;

import com.example.realestate.entity.Objects;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
public class ObjectsDTO {
    private Long id;
    private String address;
    private String type;
    private Double area;
    private Integer rooms;
    private Double price;
    private String description;
    private String photos;
    private LocalDate dateAdded;

    public static ObjectsDTO fromEntity(Objects objects){
        ObjectsDTO dto = new ObjectsDTO();
        dto.setId(objects.getId());

        return dto;
    }

    public static Objects toEntity(ObjectsDTO dto){
        Objects objects = new Objects();
        objects.setId(dto.getId());

        return objects;
    }
}
