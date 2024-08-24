package com.example.springbooth2example.services.impl;

import com.example.springbooth2example.model.User;
import com.example.springbooth2example.services.interfaces.IUserDao;
import com.example.springbooth2example.services.interfaces.IUserService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


//el user service depende del repositorio
@Service
public class UserServiceImpl implements IUserService {


    //hacemos la inyección de UserDao para poder llamar al método findAll(),
    // que lo proporciona la interfaz CrudRepository
    @Autowired
    private IUserDao userDao;

    @PostConstruct
    public void init() {
        User user = new User();
        user.setUsername("admin2");
        user.setPassword("admin");
        user.setEmail("admin@admin.com");
        user.setName("Usuario");
        user.setLastName("Inicial");
        userDao.save(user);
    }

    @Override
    public List<User> getUsers() {
        return (List<User>) userDao.findAll();
    }

    @Override
    public User saveUser(User user) {
        return userDao.save(user);
    }

    @Override
    public User updateUser(User user) {
        // Verificar que el usuario existe antes de actualizar
        Optional<User> existingUser = userDao.findById(user.getId());
        if (existingUser.isPresent()) {
            return userDao.save(user);
        } else {
            // Manejar el caso en el que el usuario no exista
            return null;
        }
    }

    @Override
    public void deleteUser(int id) {
        Optional<User> existingUser = userDao.findById(id);
        if (existingUser.isPresent()) {
            userDao.delete(existingUser.get());
        } else {
            //
        }
    }


//    @Autowired
//    private UserRepository userRepository;
//
//    @Override
//    public void saveUser(User user) {
//
//    }
//
//    @Override
//    public User findUserByUsername(String username) {
//        return null;
//    }
//
//    @Override
//    public User authenticateUser(String username, String password) {
//        return null;
//    }
}
