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
     private static List<Regularuser> userList = new ArrayList<>();
     private static Admin admin;
     private static TaxCalculator taxCalculator = new CaOcccTaxCalculator();




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
                    // Logic for admin 
                    System.out.println("Enter admin username: ");
                    String adminUsername = scanner.next();
                    System.out.println("Enter admin password: ");
                    String adminPassword = scanner.next();

                    try {
                        admin = new Admin(adminUsername, adminPassword);
                        System.out.println("Admin logged in successfully!");
                        adminMenu(scanner);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Invalid admin credentials. Please try again.");
                    }
                    break;

                case 2:
                    // Logic for regular user signup
                    Regularuser regularUser = UserSignUp.signup();
                    userList.add(regularUser);
                    System.out.println("Regular user signed up successfully!");
                    // Add logic for regular user actions (modify profile, save and view equations, etc.)
                    break;

                case 3:
                    System.out.println("Exiting the TaxTotem Tactician System. Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void adminMenu(Scanner scanner) {
        while (true) {
            printAdminMenu();
            int adminChoice = scanner.nextInt();

            switch (adminChoice) {
                case 1:
                    // Modify Admin Profile
                    modifyAdminProfile(scanner);
                    break;

                // Case 2 en adminMenu
                case 2:
                     // Logic for regular user signup
                     Regularuser regularUser = UserSignUp.signup();
                     userList.add(regularUser);
                     System.out.println("Regular user signed up successfully!");

                     // Obtener ingreso bruto y créditos fiscales del usuario
                     System.out.println("Enter gross income: ");
                     double grossIncome = scanner.nextDouble();
                     System.out.println("Enter tax credits: ");
                     double taxCredits = scanner.nextDouble();

                     // Calcular impuestos para el usuario regular
                    double incomeTax = taxCalculator.calculateIncomeTax(grossIncome, taxCredits);
                    double usc = taxCalculator.calculateUSC(grossIncome);
                    double prsi = taxCalculator.calculatePRSI(grossIncome);

                    // Imprimir o almacenar los impuestos calculados según sea necesario
                    System.out.println("Income Tax: " + incomeTax);
                    System.out.println("USC: " + usc);
                    System.out.println("PRSI: " + prsi);
                    break;

                case 3:
                    // Remove User
                    removeUser(scanner);
                    break;

                case 4:
                    // Review User Operations
                    reviewUserOperations();
                    break;

                case 5:
                    // Exit Admin Menu
                    return;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void modifyAdminProfile(Scanner scanner) {
        System.out.println("Enter new name: ");
        String newName = scanner.next();
        admin.setName(newName);

        System.out.println("Enter new surname: ");
        String newSurname = scanner.next();
        admin.setSurname(newSurname);

        System.out.println("Admin profile modified successfully!");
    }

    private static void printUserList() {
        System.out.println("User List:");
        for (Regularuser user : userList) {
            System.out.println("Username: " + user.getUsername() + ", Name: " + user.getName() +
                    ", Surname: " + user.getSurname());
        }
    }

    private static void removeUser(Scanner scanner) {
        System.out.println("Enter username to remove: ");
        String usernameToRemove = scanner.next();
        // Implement logic to remove the user from the userList

    }

    private static void reviewUserOperations() {
        // Implement logic to review user operations
        // This could involve printing a log associated with timestamps
        // or reviewing a history of actions performed by users
    }

    private static void printMainMenu() {
        System.out.println("Main Menu:");
        System.out.println("1. Admin Login");
        System.out.println("2. Regular User Sign Up");
        System.out.println("3. Exit");
        System.out.println("Enter your choice: ");
    }

    private static void printAdminMenu() {
        System.out.println("Admin Menu:");
        System.out.println("1. Modify Admin Profile");
        System.out.println("2. Access User List");
        System.out.println("3. Remove User");
        System.out.println("4. Review User Operations");
        System.out.println("5. Exit Admin Menu");
        System.out.println("Enter your choice: ");
    }

    private double calculateIncomeTax(double grossIncome, double taxCredits) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private double calculateUSC(double grossIncome) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private double calculatePRSI(double grossIncome) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}