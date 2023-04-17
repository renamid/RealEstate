package com.example.realestate.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "listings")
public class Listing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "object_id", nullable = false)
    private Long objectId;

    @Column(name = "name", length = 50, nullable = false)
    private String name;

    @Column(name = "type", length = 20, nullable = false)
    private String type;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "address", length = 100, nullable = false)
    private String address;

    @Column(name = "thumbnail", length = 100, nullable = false)
    private String thumbnail;

    @Column(name = "user_id")
    private Long userId;

    // constructors, getters and setters
}
