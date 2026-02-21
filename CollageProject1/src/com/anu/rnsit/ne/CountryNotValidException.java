package com.anu.rnsit.ne;

//exception for invalid country
public class CountryNotValidException extends Exception {

 private static final long serialVersionUID = 1L;

 // constructor to pass message
 public CountryNotValidException(String message) {
     super(message);
 }
}
