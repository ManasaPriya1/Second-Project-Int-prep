package basic;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebElement countryCode = driver.findElement(By.id("country_code"));
	Select s = new Select(countryCode);
	s.selectByIndex(3);
	WebElement ele2= driver.findElement(By.id("select3"));
	Select s1 = new Select(ele2);
	//s1.selectByValue("India");
//	s1.selectByVisibleText("Canada");
	s1.selectByContainsVisibleText("India");
	/**--to check whether dropdown is single or multiselected
	Select select = new Select(driver.findElement(By.id("country_code")));
	boolean isMulti = select.isMultiple();
	if(isMulti) {
		System.out.println("multi slected ");
	}
	else {
		System.out.println("single selected");
	}
	**/
	Select s3 = new Select(driver.findElement(By.id("select5")));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 600)");
	js.executeScript("window.scrollBy(0, 600)");
	s3.selectByValue("Karnataka");
	
	
}
}