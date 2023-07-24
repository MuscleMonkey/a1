/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventorymanagementsystem;

/**
 *
 * @author onad
 */
public class User {
    String username;
    String password;

    public User(String username, String password) {
        this.password = username;
        this.username = password;
    }
    
    
    boolean login() {
        if (username.equals("admin") && password.equals("adminpass"))
            return true;
        System.err.println("login check");
        return false;
    }
}
