package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingpage {
	
	public WebDriver driver;
	
	By signin=By.cssSelector("a[href*='sign_in']");
	By Title=By.xpath("//h2[contains(text(),'Featured Courses')]");
	//By.ByXPath("//div[@class='text-center']");
		By navigation=By.xpath("//ul[@class='nav navbar-nav navbar-right']");
	
	 
	
	public landingpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement login() {
		return driver.findElement(signin);
	}
	 public WebElement title()
		{return driver.findElement(Title);
		}
		public WebElement navig()
		{return driver.findElement(navigation);
}}
