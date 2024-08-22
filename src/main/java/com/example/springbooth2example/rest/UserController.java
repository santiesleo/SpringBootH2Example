package com.example.springbooth2example.rest;
import com.example.springbooth2example.model.User;
import com.example.springbooth2example.services.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserService userService;

    // Obtener todos los usuarios
    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }

    // Agregar un nuevo usuario
    @PostMapping
    public User addUser(@RequestBody User user) {
        // Aquí puedes agregar lógica adicional si es necesario antes de guardar el usuario
        return userService.saveUser(user);
    }

    // Actualizar un usuario existente
    @PutMapping("/{id}")
    public User updateUser(@PathVariable int id, @RequestBody User user) {
        // Aquí puedes agregar lógica adicional si es necesario antes de actualizar el usuario
        user.setId(id);
        return userService.updateUser(user);
    }

    // Eliminar un usuario por ID
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
    }
}

