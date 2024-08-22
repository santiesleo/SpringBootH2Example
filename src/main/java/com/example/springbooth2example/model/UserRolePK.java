package com.example.springbooth2example.model;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

//Clave embebida
@Embeddable
public class UserRolePK implements Serializable {

    @Column(name = "user_id", insertable = false, updatable = false)
    private int userId;
    @Column(name = "role_id", insertable = false, updatable = false)
    private int roleId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
}
