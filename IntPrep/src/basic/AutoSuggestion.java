package basic;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutoSuggestion {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("java");
	List<WebElement> ele1 =driver.findElements(By.xpath("//span[contains(text(),'java')]"));
	int count = ele1.size();
	System.out.println(count);
//	for(int i=0; i<count; i++) {
//		WebElement ele2 = ele1.get(i);
//		String text = ele2.getText();
//		System.out.println(text);
//	}
//	ele1.get(count-1).click();
//}
	for(WebElement ele2 :ele1) {
		String text= ele2.getText();
		System.out.println(text);
	}
	if (count > 0) {
	    ele1.get(count - 1).click();
	} else {
	    System.out.println("No suggestions to click.");
	}

}

}