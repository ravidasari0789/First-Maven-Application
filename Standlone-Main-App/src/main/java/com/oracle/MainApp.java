package com.oracle;

import com.standlone.PSWSecurity;

public class MainApp {

	             public static void main(String[] args) {
					   PSWSecurity psw=new PSWSecurity();
					   
					   String encode=psw.pwsSecurity("abc@123");
					   System.out.println(encode);
				}
}
