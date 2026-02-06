package com.talentotech.energia.model;
import java.lang.annotation.Inherited;

import javax.annotation.processing.Generated;

import jakarta.persistence.*;

@Entity
@Table(name ="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable =false,unique = true)
    private String username;
    @Column(nullable = false)
    private String email;
}
