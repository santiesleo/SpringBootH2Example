package com.example.springbooth2example.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "user_role")
public class UserRole implements Serializable {

    @EmbeddedId
     private UserRolePK userRolePK;

    @ManyToOne
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "role_id", insertable = false, updatable = false)
    private Role role;


}
