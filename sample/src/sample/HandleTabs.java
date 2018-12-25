package sample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTabs {

	public static void main(String[] args) {
		
		//how to handle windows/ tabs?
		//Method1:
		WebDriver driver=new ChromeDriver();
		String parent=driver.getWindowHandle();

		Set<String> list=driver.getWindowHandles();
		int count= list.size();
		System.out.println(count);
		Iterator<String> it=list.iterator();
		while(it.hasNext()){
			String child=it.next();
			
			if(!parent.equals(child)){
				driver.switchTo().window(child);
				driver.close();
			}
			driver.switchTo().window(parent);
			
		}

		//Method2:

		String parent1=driver.getWindowHandle();
		Set<String> handles1= driver.getWindowHandles();

		ArrayList<String> arr=new ArrayList<>(handles1);
		//we can directly switchTo any window / tab
		driver.switchTo().window(arr.get(1)); 


		driver.switchTo().window(arr.get(0)); 


		driver.switchTo().window(arr.get(3)); 


	}

}
