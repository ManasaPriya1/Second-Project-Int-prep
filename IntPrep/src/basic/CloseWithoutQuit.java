package basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.Set;

public class CloseWithoutQuit {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
		driver.findElement(By.id("googleContainer")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		Set<String> allWid = driver.getWindowHandles();
		System.out.println(allWid);
		int c = allWid.size();
		System.out.println(c);
		for(String sid: allWid) {
			driver.switchTo().window(sid);
			String title= driver.getTitle();
			System.out.println(title);
			Thread.sleep(2000);
			driver.close();
		}
	}
}
