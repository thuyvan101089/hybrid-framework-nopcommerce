package javaBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Topic_01_Variable {
		//Global variable: biến toàn cục có thể giá trị mặc định và ko cân khởi tạo
		static int number;
		
		String address = "Ho Chi Minh";
	
	public static void main(String[] args) {
		// Local variable: phải khởi tạo để use biến cục bộ
		// Khi g�?i sử dụng biến khác thông qua kiêu static có 2 cacsh1:
		//1. Biến được g�?i fai khai báo là biến static
		//2. G�?i đến biến thông qua object (khởi tạo object trước)
		
		
		int studentNumber = 0;	
		Topic_01_Variable topic = new Topic_01_Variable();
		System.out.println(topic.address);
		System.out.println(studentNumber);
		
			
	}

}
