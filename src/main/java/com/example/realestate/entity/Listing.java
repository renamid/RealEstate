package com.example.realestate.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "listings")
public class Listing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "object_id")
    private Long objectId;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "type", length = 20)
    private String type;

    @Column(name = "price")
    private Double price;

    @Column(name = "address", length = 100)
    private String address;

    @Column(name = "thumbnail", length = 100)
    private String thumbnail;

    @Column(name = "user_id")
    private Long userId;

    // constructors, getters and setters
}
