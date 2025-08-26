package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.testng.Assert.assertEquals;
import org.testng.Assert;

//import graphql.Assert;

public class Filupload {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/upload-download-test/");
		//download
		driver.findElement(By.id("downloadButton")).click();
		WebElement ele = driver.findElement(By.id("fileinput"));
		ele.sendKeys("./Downloads/download.xlsx");
		By toastlocator = By.xpath("//div[@class='Toastify__toast-body']/div[2]");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(toastlocator));
		driver.findElement(By.xpath("//div[text()='Apple']/../../div[4]/div[1]")).getText();
		String toast = driver.findElement(toastlocator).getText();
		System.out.println(toast);
		//Assert.assertEquals("Updated Excel Data Successfully", toast);
		Assert.assertEquals("Updated Excel Data Successfully.", toast);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(toastlocator));
		
	}
}
