package Acadmy;




import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base{

public static WebDriver driver;
public Properties prop;
public WebDriver initializeDriver() throws IOException
{
	Properties prop=new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\Vivaan umrikar\\eclipse-workspace neha\\complete\\src\\main\\java\\Acadmy\\data.properties");
	prop.load(fis);
	
	String browsername=prop.getProperty("Browser");
	System.out.println(browsername);
	if(browsername.equals("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vivaan umrikar\\chrome\\chromedriver.exe");
		
		driver= new ChromeDriver();
			
	}

	else if(browsername.equals("Firefox"))
	{
		driver= new FirefoxDriver();
}
	else if (browsername.equals("IE"))
	{ driver= new InternetExplorerDriver();
		}
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//return driver;
	return driver;
	
}
	public void getScreenshot(String result) throws IOException {
	
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyfile(src, new File("C://Test//screenshot.png"));
	
		
	}
	}

	