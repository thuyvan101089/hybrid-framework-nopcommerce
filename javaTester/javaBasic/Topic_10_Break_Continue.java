package javaBasic;

public class Topic_10_Break_Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Nested for
		for (int i = 0; i <=5; i++) {
			System.out.println("Lần chạy của i= " + i );
		}
		//i =1
		// Mỗi 1 lần chạy của for trên sẽ apply cho tất cả cacslaafn chạy của for bên dưới
		for(int j =0; j<10; j++) {
			
			// Loai trừ case này ra
			
			if(j==4) {
				continue;
			}
			System.out.println(j);
		}
	}

}
