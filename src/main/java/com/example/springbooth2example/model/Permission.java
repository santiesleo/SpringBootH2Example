package com.example.springbooth2example.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "permission")
public class Permission implements Serializable {

    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String resource;

    @Setter
    @Getter
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

}
