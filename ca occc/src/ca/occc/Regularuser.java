/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.occc;

/**
 *
 * @author moni_
 */
public class Regularuser {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    
 public Regularuser(String username, String password, String firstName, String lastName, String email) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
 }

    String getUsername() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    String getName() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    String getSurname() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}