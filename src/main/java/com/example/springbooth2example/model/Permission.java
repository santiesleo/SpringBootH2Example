package com.example.springbooth2example.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "permission")
public class Permission implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String resource;


    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

}
