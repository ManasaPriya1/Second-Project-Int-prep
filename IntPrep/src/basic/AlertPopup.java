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

public class AlertPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("(//input[@type='checkbox' and @value='false'])[1]")).click();
		driver.findElement(By.id("deleteButton")).click();
		//driver.switchTo().alert().dismiss();--confirmation Popup
		//driver.switchTo().alert().accept();//--alert popup
		driver.switchTo().alert().sendKeys("Not Needed");//prompt popup
		//driver.switchTo().alert().getText();
		Thread.sleep(2000);
		//driver.switchTo().alert().accept();
		
		
		
	}

}
