package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement  ele = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
	ele.isDisplayed();
	driver.findElement(By.id("email")).sendKeys("VIRATse@gmail.com", Keys.CONTROL+"AC");
	Thread.sleep(2000);
	driver.findElement(By.id("pass")).sendKeys(Keys.CONTROL+"V", Keys.BACK_SPACE);
	
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//a[text()='Create new account']")).click();
//	boolean res= driver.findElement(By.xpath("//button[text()='Log in']")).isEnabled();
//	if(res==true) {
//		System.out.println("Login button is enabled");
//	}
//	else {
//		System.out.println("Login button is not enabled");
//	}
//	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
//	WebElement ele2= driver.findElement(By.xpath("//label[text()='Male']"));
//	ele2.click();
//	boolean ele3 = ele2.isSelected();
//	if(ele3==true) {
//		System.out.println("button is selected");
//	}
//	else {
//		System.out.println("button is not selected");
//	}
//	
}
}
