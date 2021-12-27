package javaBasic;

public class Topic_05_Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ep kieu ngam dinh, khong mat du lieu
//		byte bNumber = 126;
//		short sNumber = bNumber;
//		int iNumber = sNumber;
//		long lNumber = iNumber;
//		float fNumber = lNumber;
//		double dNumber = fNumber;
		
		// Ep kieu tuong minh
		
		double dNumber = 65456767666688d;
		System.out.println(dNumber);
		float fNumber = (float) dNumber;
		System.out.println(fNumber);
		
		long lNumber = (long) fNumber;
		System.out.println(lNumber);

	}

}
