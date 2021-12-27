package javaBasic;

public class Topic_03_Compare {
	
	int number = 8;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1 vùng nhớ cho biến x
		int x =15;
		//1 vùng nhớ cho biến y 
		int y =x;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	// Kiểu nguyên thủy khi tạo biến sẽ là 1 vùng nhớ riêng 
		
		// G�?n lại giá trị cho biến y
		y = 10;
		
		System.out.println("x= " + x );
		System.out.println("x= " + y );
		
	// Kiểu tham chiếu sẽ tham chiếu v�? giá trị của vùng nhớ
		Topic_03_Compare  firstVariable = new Topic_03_Compare ();
		Topic_03_Compare  secondVariable = firstVariable;
		
		System.out.println("Before" + firstVariable.number );
		System.out.println("Before" + secondVariable.number );
		
		// Gán lại giá trị sẽ làm thay đổi vùng nhớ
		secondVariable.number = 15;
		
		System.out.println("After" + firstVariable.number);
		System.out.println("After" + secondVariable.number);
		
		// Trư�?ng hơp new 2 dối tương khác nhau sẽ không ảnh hưởng đến thay đổi vùng nhớ
		Topic_03_Compare  firstVariable1 = new Topic_03_Compare ();
		Topic_03_Compare  secondVariable1 = new Topic_03_Compare ();
	}
	
}
