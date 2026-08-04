package com.example.MainAuthenticationProject.Controller;

import com.example.MainAuthenticationProject.Model.UserEntity;
import com.example.MainAuthenticationProject.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<UserEntity>> getAllUsers(){
        List<UserEntity> users = userService.getAllUsers();
        if(!users.isEmpty()){
            return ResponseEntity.ok(users);
        }
        return ResponseEntity.status(404).build();
    }

    @GetMapping("/{userId}")
    public ResponseEntity<UserEntity> getUserById(@PathVariable Long userId){
        UserEntity fetchedUser = userService.getUserById(userId);
        if(fetchedUser !=null){
            return ResponseEntity.ok(fetchedUser);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @PostMapping("/addUser")
    public ResponseEntity<UserEntity> addUser(@RequestBody UserEntity addingUser){
        UserEntity user = userService.addUser(addingUser);
        if(user!=null){
            return ResponseEntity.ok(user);
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

    @PutMapping("/updateUser/{userId}")
    public ResponseEntity<UserEntity> updateUser(@PathVariable Long userId,@RequestBody UserEntity updatingUser){
            UserEntity user = userService.updateUser(userId,updatingUser);
            if(user!=null){
                return ResponseEntity.ok(user);
            }
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @PutMapping("/updateUser/{userId}")
    public ResponseEntity<String> deleteUser(@PathVariable Long userId){
        Boolean message = userService.deleteUser(userId);

    }
}
