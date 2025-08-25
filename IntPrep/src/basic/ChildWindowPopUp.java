package basic;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopUp {
	public static void main(String[] args) {
		
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
	driver.findElement(By.xpath("(//button[text()='view more'])[1]/../p")).click();
	driver.findElement(By.xpath("(//button[text()='view more'])[2]/../p")).click();
	Set<String> sid = driver.getWindowHandles();
	System.out.println(sid);
	int c =sid.size();
	System.out.println(c);
	for(String wid :sid) {
		driver.switchTo().window(wid);
		String title = driver.getTitle();
		System.out.println(title);
	}


}
}
