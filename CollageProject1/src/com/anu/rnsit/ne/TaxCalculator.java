package com.anu.rnsit.ne;

public class TaxCalculator {

    // method to calculate tax
    // It throws custom exceptions 
    public double calculateTax(String empName, boolean isIndian, double empSal)
            throws CountryNotValidException,
                   EmployeeNameInvalidException,
                   TaxNotEligibleException {

        // checking if employee is Indian
        if (!isIndian) {
            throw new CountryNotValidException(
                "The employee should be an Indian citizen for calculating tax");
        }

        // Check if employee name is empty
        if (empName == null || empName.isEmpty()) {
            throw new EmployeeNameInvalidException(
                "The employee name cannot be empty");
        }

        // salary based tax calculation
        if (empSal > 100000) {
            return empSal * 0.08;  // 8% 
        } 
        else if (empSal >= 50000) {
            return empSal * 0.06;  // 6% 
        } 
        else if (empSal >= 30000) {
            return empSal * 0.05;  // 5% 
        } 
        else if (empSal >= 10000) {
            return empSal * 0.04;  // 4% 
        } 
        else {
            // If low salary 
            throw new TaxNotEligibleException(
                "The employee does not need to pay tax");
        }
    }
}
