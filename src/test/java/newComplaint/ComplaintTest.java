package newComplaint;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import login.LoginPage;

public class ComplaintTest {
	
	@Test
	public static void createComplaint() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		ComplaintPage lp=new ComplaintPage(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://address-health-revamp-git-dev-zysktech.vercel.app/login");
		
		driver.manage().window().maximize();
		
		lp.setPhone("8971141959");
		lp.setPassword("test1234");
		Thread.sleep(5000);
		lp.clickSignin();
		
		Thread.sleep(5000);
		
		lp.clickNewComplaint();
		Thread.sleep(5000);
		
		try {
//		lp.searchBox("satvik das");
//		Thread.sleep(5000);
//		lp.selectName();
		
		lp.selectComplaint("joint pain");
		lp.selectLocation("legs");
		lp.setOtherComplaint("cold");
		lp.setExamination("rr=15");
		lp.setDiagnosis("medical attension");
		lp.selectLocation("legs");
		lp.selectProcedure("walking exercise");
		Thread.sleep(5000);
		lp.clickAddProcedure();
		
		Thread.sleep(5000);
		lp.clickNext();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		Thread.sleep(5000);
		
	}

}
