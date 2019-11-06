package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {
	
	public WebDriver driver;
	
	
	By userid=By.id("user_email");
	By pass=By.id("user_password");
	By submit=By.name("commit");
	
	public loginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement user() {
		return driver.findElement(userid);
	}
	public WebElement password() {
		return driver.findElement(pass);
	}
	public WebElement submit() {
		return driver.findElement(submit);
	}

}
