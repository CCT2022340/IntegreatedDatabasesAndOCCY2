/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.occc;
import java.util.Scanner;
/**
 *
 * @author moni_
 */

public interface TaxCalculator {
    double calculateIncomeTax(double grossIncome, double taxCredits);
    double calculateUSC(double grossIncome);
    double calculatePRSI(double grossIncome);
}
