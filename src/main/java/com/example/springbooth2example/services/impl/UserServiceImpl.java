package com.example.springbooth2example.services.impl;

import com.example.springbooth2example.model.User;
import com.example.springbooth2example.services.interfaces.IUserDao;
import com.example.springbooth2example.services.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


//el user service depende del repositorio
@Service
public class UserServiceImpl implements IUserService {


    //hacemos la inyección de UserDao para poder llamar al método findAll(),
    // que lo proporciona la interfaz CrudRepository
    @Autowired
    private IUserDao userDao;

    @Override
    public List<User> getUsers() {
        return (List<User>) userDao.findAll();
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
