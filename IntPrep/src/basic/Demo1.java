package basic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	String pageSrc = driver.getPageSource();
	System.out.println(pageSrc);
	driver.manage().window().setSize(new Dimension(1024, 840));
	driver.navigate().to("https://www.softwaretestingmaterial.com/selenium-tutorial/");
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	driver.navigate().refresh();
	driver.quit();
}
}
