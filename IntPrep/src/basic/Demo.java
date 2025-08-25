package basic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	String actualTitle = driver.getTitle();
	String expectedTitle = "google";
	if(actualTitle.equalsIgnoreCase(expectedTitle)) {
		System.out.println("pass");
	}
	else {
		System.out.println("fail");
	}
	driver.close();
}
}
