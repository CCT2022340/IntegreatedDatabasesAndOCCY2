/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca.occc;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author moni_
 */

 // Link GitHub: https://github.com/CCT2022340/IntegreatedDatabasesAndOCCY2/commit/316717a8d3158dfec1facb57ee50a3a9b2cab73d
public class CaOccc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

       

        System.out.println("Welcome to the TaxTotem Tactician: Building Bridges to Financial Empowerment.!");

        while (true) {
            printMainMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Lógica para el login del administrador
                    break;
                case 2:
                    // Lógica para el registro de usuario regular
                    break;
                case 3:
                    // Lógica para salir de la aplicación
                    System.out.println("Exiting the Tax Calculator System. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void printMainMenu() {
        System.out.println("Main Menu:");
        System.out.println("1. Admin Login");
        System.out.println("2. Regular User Sign Up");
        System.out.println("3. Exit");
        System.out.println("Enter your choice: ");
    }
}
    
        
