package com.example.realestate.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "agents")
public class Agents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email" ,nullable = false, unique = true)
    private String email;

    @Column(name = "phone",nullable = false, unique = true)
    private String phone;

    @Column(name = "experience", nullable = false)
    private Integer experience;

    @Column(name = "education", nullable = false)
    private String education;

    @Column(name = "salary", nullable = false)
    private Double salary;

    // constructors, getters, setters, toString
}
