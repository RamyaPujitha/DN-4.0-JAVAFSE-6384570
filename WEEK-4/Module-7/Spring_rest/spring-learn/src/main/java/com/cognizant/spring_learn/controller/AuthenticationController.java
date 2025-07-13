package com.cognizant.spring_learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cognizant.spring_learn.util.JwtUtil;

import java.util.Base64;

import jakarta.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class AuthenticationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

    @Autowired
    private JwtUtil jwtUtil;

    @RequestMapping("/authenticate")
    public String authenticate(HttpServletRequest request) {
        LOGGER.info("START");

        String authHeader = request.getHeader("Authorization");
        if (authHeader == null || !authHeader.startsWith("Basic ")) {
            throw new RuntimeException("Missing or invalid Authorization header");
        }

        String base64Credentials = authHeader.substring("Basic ".length());
        byte[] decodedBytes = Base64.getDecoder().decode(base64Credentials);
        String[] credentials = new String(decodedBytes).split(":", 2);

        String username = credentials[0];
        String password = credentials[1];

        // For simplicity, hardcoding a username and password
        if ("user".equals(username) && "pwd".equals(password)) {
            String token = jwtUtil.generateToken(username);
            LOGGER.info("END");
            return "{\"token\": \"" + token + "\"}";
        } else {
            throw new RuntimeException("Invalid credentials");
        }
    }
}
