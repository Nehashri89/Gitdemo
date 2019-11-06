package Acadmy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.landingpage;


public class ValodationTest extends base{
	public static Logger log =LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		 log.info("Driver is initialized");

	}
	@Test()
	public void pagenavigation() throws IOException {
		log.info("Successfully validated Text message");

	driver.get("http://www.qaclickacademy.com/");
	 System.out.println("Navigated to Home page");

landingpage l= new landingpage(driver);
Assert.assertEquals(l.title().getText() , "FEATURED COURSES");
	}
@AfterTest
public void teardown()
{
	
	driver.close();
	driver=null;
	
}



}
