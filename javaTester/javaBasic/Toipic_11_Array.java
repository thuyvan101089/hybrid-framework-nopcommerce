package javaBasic;

import java.util.ArrayList;

public class Toipic_11_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// int number[] = {1,2,3,4,5};
		
		// int[] student = {1,2,3,4,5};
		
		// Lấy ra phần tử đầu tiên use index
		// System.out.println(student[0]);
		// Được define cố định bao nhiêu phần tử
		String studentName[] = {"Nam", "Long", "An"};
		for (int i = 0; i < studentName.length; i++) {
			if (i ==2) {
				System.out.println(studentName[i]);
			}
		}
		
		for (String std : studentName) {
			if(std.equals ("Long")) {
			System.out.println(std);
			}
		}
		
		ArrayList<String> stdName = new ArrayList<String>();
		
		// Khi chạy code mới add (Runtime)
		
		for (String std : stdName) {
			stdName.add(std);
		}
	}

}
