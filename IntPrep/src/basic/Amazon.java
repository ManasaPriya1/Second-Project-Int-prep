package basic;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	List<WebElement> ele = driver.findElements(By.tagName("a"));
	int count = ele.size();
	System.out.println("count");
//    for(WebElement ele1 : ele) {
//    	String ele3 = ele1.getText();
//    	System.out.println(ele3);
//    }
	for(int i=0; i<count; i++) {
	WebElement ele2 =ele.get(i);
		String text =ele2.getText();
		String test = ele2.getTagName();
		System.out.println(text);
		System.out.println(test);
	}
	
	driver.quit();
}
}
