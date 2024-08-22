package com.example.springbooth2example.services.interfaces;

import com.example.springbooth2example.model.User;

import java.util.List;

// creamos la interfaz del sercicio y agregamos la definición del método para conectar
// con el DAO y creamos la implementación (REVISAR UserServiceImpl

public interface IUserService {
    public List<User> getUsers();

    User saveUser(User user);

    User updateUser(User user);

    void deleteUser(int id);
}
