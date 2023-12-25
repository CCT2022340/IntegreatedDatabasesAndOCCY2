/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.occc;

/**
 *
 * @author moni_
 */
public class Admin implements TaxCalculator {

    
    
    private static final String ADMIN_USERNAME = "CCT";
    private static final String ADMIN_PASSWORD = "Dublin";

    private String username;
    private String password;
    private String name;
    private String surname;

    public Admin(String enteredUsername, String enteredPassword) {
        if (isAdmin(enteredUsername, enteredPassword)) {
            // Initialize admin attributes
            this.username = ADMIN_USERNAME;
            this.password = ADMIN_PASSWORD;
            this.name = "AdminName";
            this.surname = "AdminSurname";
        } else {
            throw new IllegalArgumentException("Invalid admin credentials");
        }
    }

    private boolean isAdmin(String enteredUsername, String enteredPassword) {
        return ADMIN_USERNAME.equals(enteredUsername) && ADMIN_PASSWORD.equals(enteredPassword);
    }

    

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setSurname(String newSurname) {
        this.surname = newSurname;
    }
@Override
    public double calculateIncomeTax(double grossIncome, double taxCredits) {
        // Implementa la lógica para calcular el impuesto sobre la renta
        return 0.0; // Reemplaza con tu lógica real
    }

    @Override
    public double calculateUSC(double grossIncome) {
        // Implementa la lógica para calcular la USC
        return 0.0; // Reemplaza con tu lógica real
    }

    @Override
    public double calculatePRSI(double grossIncome) {
        // Implementa la lógica para calcular el PRSI
        return 0.0; // Reemplaza con tu lógica real
    }
}

  