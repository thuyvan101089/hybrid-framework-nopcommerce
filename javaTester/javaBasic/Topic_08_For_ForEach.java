package javaBasic;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.OffsetMapping.ForOrigin.Renderer.ForDescriptor;
import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class Topic_08_For_ForEach {

	@Test
	public void TC_01_For_Iterate() {
		for (int i = 0; i < 5; i++) {
		System.out.println(i);	
		}
		//Array
		
	// For kết hợp if: thỏa điều kiện mới action
		// Biến đếm - dùng để điều kiện filter
	
	String[] cityName = {"Ha Noi", "Ho Chi Minh", "Da Nang"};
	for (int i = 0; i < cityName.length; i++) {
		if (cityName[i].equals("Da Nang")) {
			//Action
			System.out.println("Do action");
			//break: khi gặp giá trị thỏa đk thì ngừng ko kiểm tra các giá trị sau
			break;
		}
		
		System.out.println(cityName[i]);
	}
	
	// Dùng chạy qua hết các giá trị
	for (String city : cityName) {
		System.out.println(city);
		
	}
	}
	
	// Vế 1: biến tạm dùng để tăng giá trị sau mỗi lần duyệt
	// Dùng để so sánh với tổng giá trị 
	// Vế 2: so sanh vs tổng
	// Vế 3: tăng i lên 1 đơn vị sau khi chạy vào thân vòng for
	
	// Lần 1: 
	// i= 0 
	// i<5 (0<5) thỏa điêu kiện => in ra i
	//  tăng i + 1
	// gán lại i= i+1
	
	@Test
 	public void TC_02_For() {
		
		//Array
		//Java Collection
		// Class: Array List/ LinkedList/ Vector...
		// Interface: List/Set/Queue
		String[] cityName = {"Ha Noi", "Ho Chi Minh", "Da Nang"};
		List<String> cityAddress = new ArrayList<String>();
		
		//Compile (Coding)- add khi viết code
		cityAddress.add("Bac Giang");
		
		// Runtime(Running)- add khi chạy
		for (String city : cityName) {
			cityAddress.add(city);
		}
	
		System.out.println(cityAddress.size());
	
		// Java Generic
		
	}
	

}
