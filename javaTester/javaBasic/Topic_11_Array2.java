package javaBasic;

public class Topic_11_Array2 {
		String name;
		int age;
		
		// Hàm khởi tạo
		public Topic_11_Array2(String name, int age) {
			this.name = name;
			this.age = age;
			
		}
		public void display() {
			System.out.println("Name:" + name);
			System.out.println("Age:" + age);
			
		}
		
		public static void main(String[] args) {
			Topic_11_Array2[] students = new Topic_11_Array2[3];
			students[0] = new Topic_11_Array2("Nam", 24);
			students[1] = new Topic_11_Array2("Tuan", 23);
			students[2] = new Topic_11_Array2("Cuong", 25);
			
			for (int i = 0; i < students.length; i++) {
				students[i].display();
			}
		}
}
