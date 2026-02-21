package com.anu.rnsit.ne;

//exception for invalid employee name
public class EmployeeNameInvalidException extends Exception {

 private static final long serialVersionUID = 1L;

 // constructor to pass message
 public EmployeeNameInvalidException(String message) {
     super(message);
 }
}
