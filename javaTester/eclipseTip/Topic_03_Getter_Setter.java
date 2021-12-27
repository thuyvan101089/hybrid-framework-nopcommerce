package eclipseTip;

import org.openqa.selenium.WebDriver;

public class Topic_03_Getter_Setter {
	private String carName;
	private String carType;
	private String carColor;
	
	// Getter: lấy dữ liệu
	public String getCarName() {
		return carName;
	}
	/**
	 * 
	 * @param carName
	 */
	//Setter 
	public void setCarName(String carName) {
		this.carName = carName;
	}
}
	
