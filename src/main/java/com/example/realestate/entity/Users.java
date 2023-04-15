package com.example.realestate.entity;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String password;

    private String phone;

    private Double budget;

    private String location;

    private String preferences;

    // constructors, getters and setters
}
