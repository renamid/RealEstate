package com.example.realestate.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "agents")
public class Agents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "email" ,nullable = false, unique = true, length = 100)
    private String email;

    @Column(name = "phone",nullable = false, unique = true, length = 20)
    private String phone;

    @Column(name = "experience", nullable = false)
    private Integer experience;

    @Column(name = "education", nullable = false, length = 100)
    private String education;

    @Column(name = "salary", nullable = false)
    private Double salary;

    // constructors, getters, setters, toString
}
