package com.example.realestate.entity;

import javax.persistence.*;
@Entity
@Table(name = "agents")
public class Agents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private Integer experience;

    private String education;

    @Column(nullable = false)
    private Double salary;

    // constructors, getters, setters, toString
}
