package newComplaint;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ComplaintPage {
	
WebDriver driver;
	
	By Phone=By.id("phone_number");
	By Password=By.id("password");
	By signIn=By.xpath("//button[.='Sign in']");
	
	public ComplaintPage(WebDriver d){
		
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
	
	
	By newComplaint=By.xpath("//span[.='New Complaint']");
	By search=By.xpath("//input[@placeholder='Search Name or AH Id']");
	By name=By.xpath("(//li[@class='text-sm text-gray-500'])[1]");
	By compalint=By.xpath("(//div[@class=' css-1d8n9bt'])[1]");
	By location=By.xpath("(//div[@class=' css-g2iskj-control'])[2]");
	By otherComplaint=By.id("other_complaint");
	By examination=By.id("examination_finding");
	By diagnosis=By.id("diagnosis");
	By procedure=By.xpath("(//div[@class=' css-g2iskj-control'])[3]");
	By addProcedure=By.xpath("//span[.='Add new procedure']");
	By next=By.xpath("//button[@type='submit']");
	
	
	public void clickNewComplaint() {
		driver.findElement(newComplaint).click();
	}
//	public void searchBox(String na) {
//		driver.findElement(search).sendKeys(na+Keys.ENTER);
//	}
//	public void selectName() {
//		driver.findElement(name).click();
//	}
	public void selectComplaint(String co) {
		driver.findElement(compalint).sendKeys(co + Keys.ENTER);
	}
	public void selectLocation(String lo) {
		driver.findElement(location).sendKeys(lo+ Keys.ENTER);
	}
	public void setOtherComplaint(String oc) {
		driver.findElement(location).sendKeys(oc);
	}
	public void setExamination(String ef) {
		driver.findElement(examination).sendKeys(ef);
	}
	public void setDiagnosis(String da) {
		driver.findElement(diagnosis).sendKeys(da);
	}
	public void selectProcedure(String pa) {
		driver.findElement(procedure).sendKeys(pa+Keys.ENTER);
	}
	public void clickAddProcedure() {
		driver.findElement(addProcedure).click();
	}
	public void clickNext() {
		driver.findElement(next).click();
	}
	

}
