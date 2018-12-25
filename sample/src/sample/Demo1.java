package sample;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Demo1 {

	
	public static  void main(String [] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ashish\\Desktop\\Drivers\\chromedriver.exe");
		
		//Disable developer mode extension
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-extensions");
		
		
		//Disable chrome browser notification
		Map<String, Object> prefs=new HashMap<>();
		prefs.put("profile.default_content_settind_values.notifications", 2);
		options.setExperimentalOption("prefs", prefs);
		
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com");
		System.out.println("Welcome to the Jenkins World");
		
		Actions action=new Actions(driver);
		action.sendKeys(Keys.ARROW_DOWN);
		action.keyDown(Keys.CONTROL.SHIFT.DELETE).build().perform();//keyDown==key pressed, keyUp==key released
	}

}
