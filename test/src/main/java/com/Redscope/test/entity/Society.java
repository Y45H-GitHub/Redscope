package com.Redscope.test.entity;
import jakarta.persistence.*;
@Entity
@Table(name = "societies")
public class Society {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long societyId;

    @Column(nullable = false, unique = true)
    private String societyName;
}

