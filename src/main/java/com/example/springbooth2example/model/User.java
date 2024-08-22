package com.example.springbooth2example.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "user")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;
    private String email;
    private String name;
    private String lastName;
    //TODO: Add the roles field

    // va a estar mapeado al atributo user que estará desmapeado en UserRole
    @OneToMany(mappedBy = "user")
    private List<UserRole> roles;

}
