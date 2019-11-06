package Acadmy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobject.landingpage;
import pageobject.loginpage;


public class homeTest extends base{
	public static Logger log =LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();

	}

	
	@Test(dataProvider="getdata")
	public void pagenavigation(String user,String password) throws IOException {
	
driver.get("http://www.qaclickacademy.com/");
landingpage l=new landingpage(driver);
l.login().click();
loginpage lp= new loginpage(driver);
lp.user().sendKeys(user);
lp.password().sendKeys(password);
lp.submit().click();
log.info("navigate log");
	}
	@AfterTest
	public void teardown()
	{
		
		driver.close();
		driver=null;
		
	}


@DataProvider
public Object[][] getdata()
{
Object[][]Data =new Object[2][2];
Data[0][0]="neha";
Data[0][1]="1234";
Data[1][0]="papi";
Data[1][1]="12324";
return Data;
}
}