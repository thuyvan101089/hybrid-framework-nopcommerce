package javaAccessModifierFirst;

public class Laptop {
	
public static void main(String[] args) {
	
	Computer comp = new Computer();
	
	// Truy cap thong qua bien
	comp.ramProductName = "KingSton";
	
	System.out.println(comp.ramProductName);
	
	// Truy cap thong qua phuong thuc
	comp.setRamProductName("KingMax");
	System.out.println(comp.ramProductName);
}

}
	

