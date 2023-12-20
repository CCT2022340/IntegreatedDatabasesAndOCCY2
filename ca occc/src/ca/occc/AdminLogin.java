/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.occc;

/**
 *
 * @author moni_
 */
public class AdminLogin {
    
    private static final String ADMIN_USERNAME = "CCT";
    private static final String ADMIN_PASSWORD = "Dublin";

    public static boolean login(String enteredUsername, String enteredPassword) {
        return ADMIN_USERNAME.equals(enteredUsername) && ADMIN_PASSWORD.equals(enteredPassword);
    }
}
