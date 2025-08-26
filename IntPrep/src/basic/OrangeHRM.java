package basic;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	for(int i=0; i<10000; i++) {
		try {
			driver.findElement(By.name("username")).sendKeys("Admin");
		}
		catch(Exception e) {
		//	System.out.println(i);
		}
	}
	//driver.findElement(By.name("password")).sendKeys("admin123");
	
}
}
