package javaBasic;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Topic_12_String {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".\\browserDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String schoolName = "Automation Testing";
		String courseName = "AUTOMATION TESTING";
		String schoolAdress = "Ho chi minh city";
		System.out.println("Do dai = " + schoolName.length());
		System.out.println("Lay ra 1 ki tu " + schoolName.charAt(0));
		System.out.println("Noi 2 chuoi " + schoolName.concat(schoolAdress));
		System.out.println("Noi 2 chuoi " + schoolName + schoolAdress);
		System.out.println("Kiem tra 2 chuoi bang nhau tuyet doi " + schoolName.equals(schoolAdress));
		System.out.println("Kiem tra 2 chuoi bang nhau tuyet doi " + schoolName.equals("Automation Testing"));
		
		//Handle multiple browsers
		System.out.println("Kiem tra 2 chuoi bang nhau tuong doi " + schoolName.equalsIgnoreCase(courseName));
		// startsWith/endsWith/contains
		System.out.println("Có bắt đầu bằng 1 kí tư/chuỗi" + schoolName.startsWith("A"));
		System.out.println("Có chứa 1 kí tư/chuỗi" + schoolName.contains("Automation"));
		System.out.println("Có kết thúc bằng 1 kí tư/chuỗi" + schoolName.endsWith("g"));
		System.out.println("Vị trí của 1 kí tư/chuỗi kí tự trong chuỗi: " + schoolName.indexOf("utomation"));
		System.out.println("Tách 1 kí tư/chuỗi kí tự trong chuỗi: " + schoolName.substring(11));
		System.out.println("Tách 1 kí tư/chuỗi kí tự trong chuỗi: " + schoolName.substring(11,15));
		
		//Split: tách chuỗi thành 1 mảng dựa vào kí tự/ chuỗi kí tự
		// Thực hành ở Alert
		String result = "Viewing 48 of 132 results";
		String results[] =  result.split(" ");
		System.out.println(results[1]);
		
		// Replace
		 String productPrice = "$100.00";
		 productPrice = productPrice.replace("$", "");
		 float productPriceF = Float.parseFloat(productPrice);
		 System.out.println(productPrice);
		 // Từ float qua String
		 productPrice = String.valueOf(productPriceF);
		 
		 String osName = System.getProperty("os.name");
		 System.out.println(osName);
		 //Windows 10
		 // Handle multiple OS: Mac/Windows (Action - keys - Ctrl/Command)
		 if (osName.toLowerCase().contains("windows")) {
			 Keys key = Keys.CONTROL;
		 }else {
			 Keys key = Keys.COMMAND;
		 }
		 
		 //Multiple Browser: toUpperCase
		 
		String driverInstanceName = driver.toString();
		System.out.println(driverInstanceName);
		// Lấy ra ID
		// Close browser/driver
		
		if (driverInstanceName.contains("internetexplorer")) {
			//Sleep cứng thêm 5s sau mỗi sự kiện chuyển page
		}
		// Khoảng trắng/xuống dòng/Tab
		String helloWorld = "    \n   \t HelloWorld!      ";
		System.out.println(helloWorld.trim());
		
		helloWorld = " ";
		System.out.println(helloWorld.isEmpty());

		// Dynamic locator
		// Dai dien cho 1 chuoi: %s
		
		String dynamicButtonXpath = "//button[@is='%s']";
		System.out.println("Click to Login button" + dynamicButtonXpath.format(dynamicButtonXpath, "login"));
		
	}
	
	
	
	
	
	

}
