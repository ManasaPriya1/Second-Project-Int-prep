package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class OnlyChildWindowClosed {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
		driver.findElement(By.id("googleContainer")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		String pwd = driver.getWindowHandle();
		Set<String> s = driver.getWindowHandles();
		Iterator<String> i = s.iterator();
		while(i.hasNext()) {
			String w =i.next();
			driver.switchTo().window(w);
			if(!pwd.equals(w)) {
				driver.close();
			}
		}
		
		
		
		
	}
}