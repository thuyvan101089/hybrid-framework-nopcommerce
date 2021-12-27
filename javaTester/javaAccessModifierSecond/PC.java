package javaAccessModifierSecond;

import javaAccessModifierFirst.Computer;

public class PC extends Computer {
	public void showramProductName() {
		// Truy cap thong qua bien
	cpuProductName = "Intel";
		
		System.out.println(cpuProductName);
		
		// Truy cap thong qua phuong thuc
		setCpuProductName("AMD");
		System.out.println(cpuProductName);
	}
}
