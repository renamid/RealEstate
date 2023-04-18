package com.example.realestate.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "objects")
public class Objects {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "address", nullable = false, length = 100)
    private String address;

    @Column(name = "type", nullable = false, length = 50)
    private String type;

    @Column(name = "area", nullable = false)
    private Double area;

    @Column(name = "rooms", nullable = false)
    private Integer rooms;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "photos", nullable = false)
    private String photos;

    @Temporal(TemporalType.DATE)
    @Column(name = "date_added")
    private Date dateAdded;

    // Конструкторы

}
