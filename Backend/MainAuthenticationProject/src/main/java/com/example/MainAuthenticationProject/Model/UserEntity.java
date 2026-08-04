package com.example.MainAuthenticationProject.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")

public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String userName;
    private String userEmail;

    public UserEntity() {
    }

    public UserEntity(Long userId, String userName, String userEmail) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
