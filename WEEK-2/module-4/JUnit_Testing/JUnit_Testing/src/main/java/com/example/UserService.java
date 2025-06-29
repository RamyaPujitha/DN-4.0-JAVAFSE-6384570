package com.example;

public class UserService {
    public boolean isValidUser(String username) {
        return username != null && !username.trim().isEmpty();
    }

    public int getNameLength(String username) {
        if (username == null) return 0;
        return username.length();
    }
}
