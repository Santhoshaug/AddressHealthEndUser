package login;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	@Test
	public static void verifySignin() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		LoginPage lp=new LoginPage(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://address-health-revamp-git-dev-zysktech.vercel.app/login");
		
		driver.manage().window().maximize();
		
		lp.setPhone("8971141959");
		lp.setPassword("test1234");
		lp.clickSignin();
		
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
