package com.anu.rnsit.ne;

import java.util.Scanner;


//Main class to test TaxCalculator
public class CalculatorTaxEntryApp {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     // Creating object of TaxCalculator
     TaxCalculator calculator = new TaxCalculator();

     try {

         // Taking input from user
         System.out.println("Enter Employee Name:");
         String name = sc.nextLine();

         System.out.println("Is Employee Indian? (true/false):");
         boolean isIndian = sc.nextBoolean();

         System.out.println("Enter Employee Salary:");
         double salary = sc.nextDouble();

         // calculateTax method
         double tax = calculator.calculateTax(name, isIndian, salary);

         // calculated tax
         System.out.println("Tax amount is: " + tax);

     } 
     catch (CountryNotValidException e) {
         //invalid country exception
         System.out.println(e.getMessage());
     } 
     catch (EmployeeNameInvalidException e) {
         // invalid name exception
         System.out.println(e.getMessage());
     } 
     catch (TaxNotEligibleException e) {
         // tax not eligible exception
         System.out.println(e.getMessage());
     }

     sc.close();
 }
}
