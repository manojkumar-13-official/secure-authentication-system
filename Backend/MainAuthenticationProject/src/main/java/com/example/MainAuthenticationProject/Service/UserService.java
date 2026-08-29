package com.example.MainAuthenticationProject.Service;

import com.example.MainAuthenticationProject.Exception.ResourceNotFoundException;
import com.example.MainAuthenticationProject.Model.UserEntity;
import com.example.MainAuthenticationProject.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    
    //Get All Users in the database
    public List<UserEntity> getAllUsers(){
        return userRepository.findAll();
    }
    
    //Get the User By ID
    public UserEntity getUserById(Long userId){
        return userRepository.findById(userId).orElseThrow(()->new ResourceNotFoundException("User Not Found"));
    }

    //Store Users In Database
    public UserEntity addUser(UserEntity currentUser){
        return userRepository.save(currentUser);
    }

    //Update the Existing Users
    public UserEntity updateUser(Long userId,UserEntity currentUser){
        UserEntity fetchedUser = getUserById(userId);
        fetchedUser.setUserEmail(currentUser.getUserEmail());
        fetchedUser.setUserName(currentUser.getUserName());
        return userRepository.save(fetchedUser);
    }

    //Delete User By ID
    public Boolean deleteUser(Long userId){
        UserEntity fetchedUser = getUserById(userId);
        if(fetchedUser!=null){
            userRepository.deleteById(userId);
            return true;
        }
        return false;
    }

}
