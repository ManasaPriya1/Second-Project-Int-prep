package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locators {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.xpath("//input[@placeholder ='Enter your name']")).sendKeys("manasa");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pritya.manasaj@gmail.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Manasa123!23");
	driver.findElement(By.xpath("//button[text()='Register']")).click();
	driver.quit();
	
}
}
