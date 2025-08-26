package basic;
import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploadPopUp {

	public static void main(String[] args) throws InterruptedException  {
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
	File f = new File("./data/Resume.doc");
	String s = f.getAbsolutePath();
	System.out.println(s);
	WebElement eke = driver.findElement(By.id("resume"));eke.sendKeys(s);
	eke.click();
	//eke.click();
	//driver.findElement(By.id("fileInput")).sendKeys(s);
	
	
	

}
}
