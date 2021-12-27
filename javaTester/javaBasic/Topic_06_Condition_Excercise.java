package javaBasic;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Topic_06_Condition_Excercise {
	Scanner scanner = new Scanner(System.in);

	@Test
	public void TC_01() {
		// Nhập 1 số từ bàn phím

		String message = "Input your number";
		System.out.println(message);

		int number = scanner.nextInt();
		System.out.println(number);

		if (number % 2 == 0) {
			System.out.println("Số" + number + "là số chẵn nhé");
		} else {
			System.out.println("Số " + number + "là số lẻ");
		}

	}

	@Test
	public void TC_02() {

		int numberA = scanner.nextInt();
		int numberB = scanner.nextInt();

		if (numberA >= numberB) {

			System.out.println(numberA + "lớn hơn hoặc bằng" + numberB);
		} else
			System.out.println(numberA + "nhỏ bằng" + numberB);

	}

	@Test

	public void TC_03() {
		String firstName = scanner.nextLine();
		String secondName = scanner.nextLine();
		// Dùng equals khac với ==
		// Dùng equal: dùng với reference
		// Kiểm tra value của biến + vị trí của biến trong vùng nhớ

		// Dùng ==: với dạng số primitive type , không đúng với text
		if (firstName.equals(secondName)) {
			System.out.println("Trùng tên nhau");
		} else
			System.out.println("Khác tên nhau");

	}

	@Test
	public void TC_04() {
		int numberA = scanner.nextInt();
		int numberB = scanner.nextInt();
		int numberC = scanner.nextInt();

		if (numberA > numberB && numberA > numberC) {
			System.out.println("So lơn nhất" + numberA);
		} else if (numberB > numberC) {
			System.out.println("So lơn nhất" + numberB);
		} else {
			System.out.println("So lơn nhất" + numberC);
		}

	}
	@Test
	public void TC_05() {

		int numberA = scanner.nextInt();
		if (10 < numberA && numberA < 100) {
			System.out.println("nằm trong khoảng 10 - 100");
		} else {
			System.out.println("nằm ngoài khoảng 10 - 100");
		}
	}
	
	@Test
	public void TC_06() {
		float studentpoint = scanner.nextFloat();
		
		if(8.5<=studentpoint && studentpoint <=10) {
			System.out.println("Hệ số A");
		}else if(7.5<=studentpoint && studentpoint <8.5) {
			System.out.println("Hệ số B");
		}else if(5<=studentpoint && studentpoint <7.5) {
			System.out.println("Hệ số C");
		}else if(0<=studentpoint && studentpoint <5) {
			System.out.println("Hệ số D");
		}else {
			System.out.println("Vui lòng nhập lại");
		}
	}
	
	@Test
	public void TC_07() {
		int month = scanner.nextInt();
		//1 3 5 7 8 10 12
		if(month == 1 || month == 3 || month == 5|| month == 7|| month == 8 ||month == 10|| month == 12 ) {
			System.out.println("Tháng này có 31 ngày");
			
		}else if(month == 2) {
			System.out.println("Tháng này có 28 hoặc 29 ngày");
		}else if(month == 4|| month == 6|| month == 9|| month == 11) {
			System.out.println("Tháng này có 30 ngày");
		}
	}
	
	
}
