package BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import ActionClass.Action;
import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseClass 
{
	public static Properties prop;
	public static  WebDriver driver;
	//Action act = new Action();
	@BeforeSuite(groups = { "Smoke", "Sanity", "Regression"})
	public void loadConfig()
	{
		try 
		{
			prop = new Properties();
			FileInputStream ip= new FileInputStream(System.getProperty("user.dir")+ "\\Configuration\\Config.properties");
			prop.load(ip);
			System.out.println("driver :" +driver);
		}catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	@Test
	public static void launchApp()
	{
		WebDriverManager.chromedriver().setup();
		String browserName = prop.getProperty("browser");
		if(browserName.contains("chrome"))
		{
			driver = new ChromeDriver();
		}else if (browserName.contains("FireFox"))
		{
			driver= new FirefoxDriver();
		}else if (browserName.contains("IE"))
		{
			driver= new InternetExplorerDriver();
		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}
}
