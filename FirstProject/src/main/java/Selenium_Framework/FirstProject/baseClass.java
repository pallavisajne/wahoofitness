package Selenium_Framework.FirstProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.netty.handler.timeout.TimeoutException;

public class baseClass {
	public WebDriver driver;
	public Properties prop;
		
	public WebDriver initalizer() throws IOException
	{
		 prop= new Properties();
		 FileInputStream fis =new FileInputStream("C:\\Users\\IBMADMIN\\FirstProject\\src\\main\\java\\Selenium_Framework\\FirstProject\\browserData.properties");
		 prop.load(fis);
		 String bName= prop.getProperty("browser");
	if(bName.equals("firefox"))
	  {
 		System.setProperty("webdriver.gecko.driver","C:\\Users\\IBMADMIN\\Documents\\Selenium\\geckodriver-v0.29.1-win64\\geckodriver.exe");
 		driver =new FirefoxDriver();
 	  }
	else if(bName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IBMADMIN\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
	}
 	else if(bName.equals("IE")) {
	//IE code
 	}
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
 return driver;
}
}
