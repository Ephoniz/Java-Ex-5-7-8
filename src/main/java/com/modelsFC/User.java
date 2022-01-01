package com.modelsFC;

import java.util.List;

public class User {
    String email;
    String password;
    String username;
    String profile_img;

    List<Student> studentsList;

    public User(String email, String password, String username, String profile_img) {
        this.email = email;
        this.password = password;
        this.username = username;
        this.profile_img = profile_img;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getProfile_img() {
        return profile_img;
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }
}