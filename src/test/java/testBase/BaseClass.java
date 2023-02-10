package testBase;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class BaseClass {
	
	public static WebDriver driver;
	public  ResourceBundle rb;
	public Logger logger;
	
	@BeforeClass(groups = {"Master", "Regression", "Sanity"})
	@Parameters("browser")
	public void setUp(String br) {
		
		if(br.equals("chrome")) {
			driver = new ChromeDriver();
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("excludeSwitches", new String [] {"enable-automation"});
		}
		else if(br.equals("edge")) {
			driver = new EdgeDriver();
			EdgeOptions options = new EdgeOptions();
			options.setExperimentalOption("excludeSwitches", new String [] {"enable-automation"});
		}
		else {
			driver = new FirefoxDriver();
		}
		

		rb = ResourceBundle.getBundle("config");
		logger = LogManager.getLogger(this.getClass());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to(rb.getString("appURL"));
		driver.manage().window().maximize();
	}
	
	@AfterClass(groups = {"Master", "Regression", "Sanity"})
	public void tearDown() {
		driver.quit();
	}
	
	public String generateString(int length) {
		return RandomStringUtils.randomAlphabetic(length);
	}
	public String generateNumeric(int length) {
		return RandomStringUtils.randomNumeric(length);
	}
	public String generateAlphaNumeric(int length) {
		return RandomStringUtils.randomAlphanumeric(length);
	}

	public String generateEmail(String email) {

		return (email + "@gmail.com");
	}
	
	public String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
				
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\screenshots\\" + tname + "_" + timeStamp + ".png";

		try {
			FileUtils.copyFile(source, new File(destination));
		} catch (Exception e) {
			e.getMessage();
		}
		return destination;

	}
	

}
