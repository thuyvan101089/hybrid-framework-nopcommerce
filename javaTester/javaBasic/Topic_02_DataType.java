package javaBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Topic_02_DataType {
	//Primitive type: kiểu nguyên thủy
	// Không có function đi cùng
	byte bNumber = 6;
	short sNumber = 150;
	int iNumber = 6500;
	long lNumber =9000;
	float fNumber = 15.98f;
	double dNUmber = 17.99d;
	char cChar ='1';
	boolean bStatus = false;
	
	//Reference type: kiểu tham chiếu
	// Có những function đi cùng
	//String
	String address1 = "Ho Chi Minh";
	//Array
	String [] studentsAddress = {address1,"Ha Noi", "Da Nang"};
	Integer[] studentsNumber = {13,14,15};
	
	//Class
	Topic_01_Variable topic1;
	
	//Interface
	WebDriver driver;
	//Object: có thể convert qua những kiểu dữ liệu khác
	Object aObject;
	
	//Collection
	//List/Set/Queue/Map
	//List: có thể lưu trùng
	//Set: Không lưu trùng

	List<WebElement> homePageLink = driver.findElements(By.tagName("a"));
	Set<String> allWindows = driver.getWindowHandles();
	
	List<String> productName = new ArrayList<String>();
	
	public void clickToElement() {
		address1.trim();
		
		studentsAddress.clone();
		
		driver.getCurrentUrl();
		
		aObject.toString();
		
		homePageLink.size();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
