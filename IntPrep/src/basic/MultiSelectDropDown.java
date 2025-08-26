package basic;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebElement ele= driver.findElement(By.id("select-multiple-native"));
	Select s =  new Select(ele);
//	s.selectByIndex(0);
//	s.selectByValue("Mens Cotton Jacket");
//	s.selectByContainsVisibleText("Mens");
//    Thread.sleep(2000);
//    s.deSelectByContainsVisibleText("Mens");
//	//s.getFirstSelectedOption();

//List<WebElement> ele4= s.getOptions();
    List<WebElement> ele4= s.getAllSelectedOptions();

for(int i=0; i<ele4.size(); i++) {
	String text = ele4.get(i).getText();
	System.out.println(text);
	
}
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Add']")).click();
			
	//driver.quit();
}
}
