package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	By Phone=By.id("phone_number");
	By Password=By.id("password");
	By signIn=By.xpath("//button[.='Sign in']");
	
	LoginPage(WebDriver d){
		
		driver=d;
	}
	
	public void setPhone(String ph) {
		driver.findElement(Phone).sendKeys(ph);
	}
	public void setPassword(String pwd) {
		driver.findElement(Password).sendKeys(pwd);
	}
	public void clickSignin() {
		driver.findElement(signIn).click();
	}

}
