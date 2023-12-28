package com.standlone;


import java.util.Base64;
import java.util.Base64.Encoder;

public class PSWSecurity {

	           public String pwsSecurity(String str) {
	        	   
	        	   Encoder en=Base64.getEncoder();
	        	   int i=30;
	        	 byte[] Byte=  en.encode(str.getBytes());
	        	   
	        	   String encoder=new String(Byte);
	        	   int sum=30;
	        	   return encoder;
	        	   
	           }
}
