package com.del;

import java.util.Base64;

public class Main {
	  public static void main(String[] args) {
	    String inputString = "your input string here";

	    try {
	      byte[] decodedBytes = Base64.getDecoder().decode(inputString);
	      int padding = inputString.endsWith("==") ? 2 : (inputString.endsWith("=") ? 1 : 0);
	      int expectedLength = 4 * ((inputString.length() + 3) / 4);
	      int actualLength = decodedBytes.length;

	      if (actualLength == expectedLength) {
	        System.out.println("Padding is correctly done in Base64: " + inputString);
	      } else {
	        System.out.println("Padding is not correctly done in Base64: " + inputString);
	      }
	    } catch (IllegalArgumentException e) {
	      System.out.println("Input string is not valid Base64: " + inputString);
	      e.printStackTrace();
	    }
	  }
	}