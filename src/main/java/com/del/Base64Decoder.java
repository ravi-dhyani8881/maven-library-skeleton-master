package com.del;

import java.util.Base64;

import org.apache.solr.common.StringUtils;

public class Base64Decoder {
    public static void main(String[] args) {
      //  String encodedString = "eyJyZXN0cmljdGlvblNldCI6W3sicmVzdHJpY3Rpb25Db2RlIjoiVlJDUCIsInJlc3RyaWN0aW9uVmFsdWUiOiJPIn0seyJyZXN0cmljdGlvbkNvZGUiOiJWUkNTIiwicmVzdHJpY3Rpb25WYWx1ZSI6Ik8ifSx7InJlc3RyaWN0aW9uQ29kZSI6IlZVQ1AiLCJyZXN0cmljdGlvblZhbHVlIjoiTyJ9XX0==";
        
    	
    	String encodedString = "SGVsbG8gV29ybGQhPQ==";
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);
        
        System.out.println(decodedString);
    }

   
    public static String removePadding(String s) {
    	System.out.println("----->");
        byte[] decodedBytes = Base64.getDecoder().decode(s);
        String result = Base64.getEncoder().encodeToString(decodedBytes);
        return result.replace("=", "");
    }
}