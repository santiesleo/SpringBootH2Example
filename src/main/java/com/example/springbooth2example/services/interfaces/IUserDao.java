package com.example.springbooth2example.services.interfaces;

import com.example.springbooth2example.model.User;
import org.springframework.data.repository.CrudRepository;

//por buena práctica, debo generar una interfaz y que la clase la implemente
//La interfaz CrudRepository nos proporciona todo lo necesario para hacer un CRUD a una entidad
public interface IUserDao extends CrudRepository<User, Integer> {
//    public void saveUser(User user);
//    public User findUserByUsername(String username);
//    public User authenticateUser(String username, String password);
}
