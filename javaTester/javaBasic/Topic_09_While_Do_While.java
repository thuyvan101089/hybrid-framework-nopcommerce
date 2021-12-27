package javaBasic;
//Class
public class Topic_09_While_Do_While {
	//Function
	public static void main(String[] args) {
		int i=0;
		// i biên cục bộ sử dụng trong for
		//Block code
		// Thực hiện phần thân sau đó tăng i lên 1 đơn vị
		for (i=0; i<5; i++) {
			System.out.println("For:" + i);
			
			if (i==3) {
				break;
			}
		}
		// lần cuối chạy for i = 5 không thỏa điều kiên 
	
		while (i<5) {
			System.out.println("While: " + i);
			i++;
			if (i==3) {
				break;
			}
			
		}
		// chạy phần thân trước
		do {
			System.out.println("Do_While" + i);
			i++;
			
		} while (i<5);
	}
}
