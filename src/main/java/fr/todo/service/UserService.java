package fr.todo.service;

import fr.todo.domain.UserRepository;
import fr.todo.domain.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserModel addUser(UserModel userModel){
        return userRepository.save(userModel);
    }


}
