package javaBasic;

public class Topic_04_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 10;
		
		number += 5;

		System.out.println(number);
		
		// Lấy nguyên
		System.out.println(number / 5);

		// Lấy dư	
		System.out.println(number % 6);
		
		System.out.println(number++);
		System.out.println(number--);
	
		int b = 10;
		// thực hiện hành động trước rồi mới tăng lên 1 đơn vị
		System.out.println(b ++);
		// Tăng lên 1 đơn vị rồi mới thực hiện hành động
		System.out.println(++b);
		String address = "Ho Chi Minh";
		// bieu thuc tam nguyen = ? :
		boolean status = (address == "Ha Noi") ? true : false;
		System.out.println(status);
		
		
		 
	}

}
