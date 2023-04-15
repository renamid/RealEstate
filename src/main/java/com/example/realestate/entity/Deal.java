package com.example.realestate.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "deal")
public class Deal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "object_id")
    private Long objectId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "agent_id")
    private Long agentId;

    @Column(name = "price")
    private Double price;

    @Column(name = "date")
    private LocalDate date;

    // Конструкторы, геттеры и сеттеры
}
