package com.example.realestate.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "purchases")
public class Purchases {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "object_id"/*, nullable = false*/)
    private Long objectId;

    @Column(name = "user_id"/*, nullable = false*/)
    private Long userId;

    @Column(name = "agent_id"/*, nullable = false*/)
    private Long agentId;

    @Column(name = "price"/*, nullable = false*/)
    private Double price;

    @Column(name = "date"/*, nullable = false*/)
    private LocalDate date;

    // Конструкторы
}
