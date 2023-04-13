package com.example.realestate.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "property")
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String address;

    private String type;

    private Double area;

    private Integer rooms;

    private Double price;

    private String description;

    private String photos;

    @Temporal(TemporalType.DATE)
    @Column(name = "date_added")
    private Date dateAdded;

    // Конструкторы, геттеры и сеттеры

}
