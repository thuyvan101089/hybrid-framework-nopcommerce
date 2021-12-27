package javaAccessModifierFirst;

public class Computer {
	//Property
	// 1. Private
	private int ssdSize;
	// 2. Default
	String ramProductName;
	//3. Protected
	protected String cpuProductName;
	// 4. Public
	public int vgaSize;
	
	
	
	//Method
	private void setssdSize(int ssd_size) {
	ssdSize = ssd_size;
		
	}
	//Default
	void setRamProductName(String ramProduct) {
		ramProductName = ramProduct;
		
	}
	// Protected
	protected void setCpuProductName( String cpuProduct) {
		cpuProductName = cpuProduct;
	}
	//Public
	public void setvgaSize(int vgaSize) {
		this.vgaSize = vgaSize;
		
	}
	
	
	public static void main(String[] args) {
		Computer comp = new Computer();
		
		// Truy cap thong qua bien
		comp.cpuProductName = "Intel";
		comp.vgaSize = 6;
		
		System.out.println(comp.cpuProductName);
		
		// Truy cap thong qua phuong thuc
		comp.setCpuProductName("AMD");
		System.out.println(comp.cpuProductName);
		comp.setvgaSize(6);
		System.out.println(comp.vgaSize);
	}

}
