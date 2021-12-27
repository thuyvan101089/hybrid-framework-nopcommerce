package javaBasic;

import org.testng.annotations.Test;

public class Topic_11_Array_Exercise {


		// TODO Auto-generated method stub
		int number[] = {5,8,15,7,60,10};
		int number1[] = {3,-7,2,5,9,-6,10,12};
		int number2[] = {3,5,7,30,10,3,5,23,0,-5};
		
		// @Test
		
		public void TC_01_Find_Max_Number() {
			int x = 0;
		for (int i = 0; i < number.length; i++) {
			if (x < number[i]) {
				x = number[i];
			}
		}
		System.out.println("Max number:" + x);
		}
		// @Test
		public void TC_02_Sum_First_And_Last_Number() {
			System.out.println(number[0] + number[number.length -1]);
			
		}
		// @Test
		public void TC_03_() {
			for (int i = 0; i < number.length; i++) {
				if(number[i] % 2 ==0) {
					System.out.println("Even numbers: " + number[i]);
				}
				
			}
		}
		
		//@Test
		public void TC_04() {
			for (int i = 0; i < number1.length; i++) {
				if(number1[i] >=0 && number1[i] <=10) {
					System.out.println("Numbers:" + number1[i] );
					
					
				}
			}
		}
		
		@Test
		public void TC_05() {
			int sum = 0;
			for (int i = 0; i < number2.length; i++) {
				sum += number2[i];
			}
			System.out.println("Sum of numbers" + sum);
			
			float average = sum/number2.length;
			
			System.out.println("Average of number:" + average);
		}
		
	}


