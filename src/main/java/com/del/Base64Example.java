package com.del;

import java.util.Base64;


public class Base64Example {
    public static void main(String[] args) {
    	
    	String encoded="eyJyZXN0cmljdGlvblNldCI6W3sicmVzdHJpY3Rpb25Db2RlIjoiVlJDUCIsInJlc3RyaWN0aW9uVmFsdWUiOiJPIn0seyJyZXN0cmljdGlvbkNvZGUiOiJWUkNTIiwicmVzdHJpY3Rpb25WYWx1ZSI6Ik8ifSx7InJlc3RyaWN0aW9uQ29kZSI6IlZVQ1AiLCJyZXN0cmljdGlvblZhbHVlIjoiTyJ9XX0=";
 //   	String encoded2="eyJyZXN0cmljdGlvblNldCI6W3sicmVzdHJpY3Rpb25Db2RlIjoiVlJDUCIsInJlc3RyaWN0aW9uVmFsdWUiOiJPIn0seyJyZXN0cmljdGlvbkNvZGUiOiJWUkNTIiwicmVzdHJpY3Rpb25WYWx1ZSI6Ik8ifSx7InJlc3RyaWN0aW9uQ29kZSI6IlZVQ1AiLCJyZXN0cmljdGlvblZhbHVlIjoiTyJ9XX0";
    		
    	// String encoded = "VGhpcyBpcyBhbiBlbmNvZGVkIHN0cmluZw"; // base64 encoded string with incorrect padding
         String paddedString = addPadding(encoded); // add padding characters

         System.out.println("--->"+paddedString);
         
         byte[] decoded = Base64.getDecoder().decode(paddedString);
         String decodedString = new String(decoded);
         System.out.println(decodedString);
     }

     private static String addPadding(String encoded) {
         int padding = 4 - encoded.length() % 4; // calculate number of padding characters needed
         StringBuilder sb = new StringBuilder(encoded);
         for (int i = 0; i < padding; i++) {
             sb.append('=');
         }
         return sb.toString();
     }
 }