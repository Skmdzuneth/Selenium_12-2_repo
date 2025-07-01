package Bike;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class YamahaTest {
	
	@Test
	
	public void launch() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://global.yamaha-motor.com/");
		Reporter.log("Kawasaki launched",true);
	}


}
