package com.ShoppersStack_GenericUtility;

import java.time.LocalDateTime;
import java.util.Random;

public class JavaUtility {
	
	 public int Genraterandomnumber() {
		 
		 
		Random ran=new Random();
		int value = ran.nextInt();
		return value;
		
		
	 }
	 
	 
	 public String LocalDate() {
		 
		 
		 String ty = java.time.LocalDate.now().toString().replace("_", "");
		 return ty;
	 }
	
	public String DateAndTime() {
		
		String value = LocalDateTime.now().toString().replace("_", " ").replace(":", "").replace(".", "");
       
		return value;		
	}

}
