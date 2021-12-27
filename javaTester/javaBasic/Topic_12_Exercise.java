package javaBasic;

import org.testng.annotations.Test;

public class Topic_12_Exercise {
	
	String courseName = "Automation Testing Advanced 2021";
	
  @Test
  
  public void TC_01() {
	  
	  char[] courseNameArr = courseName.toCharArray();
	  int countU =0 ; 
	  int countL =0 ; 
	  int countN =0 ; 
	  for (char character : courseNameArr) {
		  //Upper
		  if (character <= 'Z' && character >= 'A') {
			  countU ++;
		  }	  
		  
		  //Lowercase
		  if (character <= 'z' && character >= 'a') {
			  countL ++;
		  }	
		  
		  //Number
		  
		  if (character <= '9' && character >= '0') {
			  countN ++;
		  }	
		
	}
	  System.out.println("Sum of uppercase " + countU );
	  System.out.println("Sum of uppercase " + countL );
	  System.out.println("Sum of uppercase " + countN );
  }
  
  
  
  @Test
  
  public void TC_02() {
	  char courseNameArr[] = courseName.toCharArray();
	  int count = 0;
	  for (char c : courseNameArr) {
		  if (c == 'a') {
			 count++; 
			  
		  }		
	}
	  System.out.println(count);
  }
  
  
@Test
  
  public void TC_03() {
	
	char courseNameArr[] = courseName.toCharArray();
	
	
}
	  
   
}
