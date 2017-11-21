package fr.todo.controller;

import fr.todo.domain.model.UserModel;
import fr.todo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value ="/user", method = RequestMethod.POST)
    public UserModel addUser(@RequestBody UserModel userModel){
        return userService.addUser(userModel);
    }
}
