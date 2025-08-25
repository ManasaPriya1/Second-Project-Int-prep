package basic;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
	driver.findElement(By.xpath("(//button[text()='view more'])[1]")).click();
	driver.findElement(By.xpath("(//button[text()='view more'])[2]")).click();
	Set<String> allWid = driver.getWindowHandles();
	System.out.println(allWid);
	int c= allWid.size();
	System.out.println(c);
	for(String sid: allWid) {
		driver.switchTo().window(sid);
		String t = driver.getTitle();
		System.out.println(t);
	}
}
}
