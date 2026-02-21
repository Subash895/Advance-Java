package com.anu.rnsit.ne;

//exception when salary is too low for tax
public class TaxNotEligibleException extends Exception {

 private static final long serialVersionUID = 1L;

 // constructor to pass message
 public TaxNotEligibleException(String message) {
     super(message);
 }
}
