package basic;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AuthenticationPopup {
	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/auth?sublist=0");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	driver.findElement(By.xpath("//a[text()='Login']")).click();
	

	        // Credentials
	        String username = "admin";
	        String password = "admin";

	        // Target URL with embedded credentials
	        String baseURL = "https://" + username + ":" + password + "@demoapps.qspiders.com/ui/auth?sublist=0";

	        driver.get(baseURL);
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

	        // Optional: Interact with page after login
	        // driver.findElement(By.xpath("//a[text()='Login']")).click();
	    }
}
