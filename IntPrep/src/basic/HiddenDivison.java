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

public class HiddenDivison {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/hidden?sublist=0");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	driver.findElement(By.xpath("//button[text()='Add Customer']")).click();
	driver.findElement(By.id("customerName")).sendKeys("Manasa");
	driver.findElement(By.id("customerEmail")).sendKeys("priya@gmail.com");
	WebElement ele1= driver.findElement(By.id("prod"));
	ele1.click();
	Select s = new Select(ele1);
	s.selectByVisibleText("Mobile");
	driver.findElement(By.id("message")).sendKeys("HI, There This is Manasa Priya J");
	driver.findElement(By.xpath("//button[text()='Submit']")).click();
	driver.findElement(By.id("hiddendiv")).click();
	}
}
