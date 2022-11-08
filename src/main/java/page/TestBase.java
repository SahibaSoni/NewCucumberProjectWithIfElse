package page;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class TestBase {
	

	public static WebDriver driver;
	
	public static WebDriver initDriver()
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10,  TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}
	
	public int generateRandomNum(int num)
	{
		Random rn = new Random();
		int randomNum = rn.nextInt(num);
		return randomNum;
	}
	
	public void mouseHover(WebElement hoverElement , WebElement clickElement)
	{
	Actions action = new Actions(driver);
	action.moveToElement(hoverElement).perform();
	action.moveToElement(clickElement).click().perform();
	}
	
	public void takeScreenshot() 
	{
		TakesScreenshot tSS = (TakesScreenshot)driver;
		File sourceFile = tSS.getScreenshotAs(OutputType.FILE);
		String currentDirectory = System.getProperty("user.dir");
		SimpleDateFormat formatter = new SimpleDateFormat("MMDDYYYY-HHMMSS");
		Date date = new Date();
		String label = formatter.format(date);
		try {
			//FileUtils.copyFile(sourceFile, new File(currentDirectory + "/screenshot/"+System.currentTimeMillis() + ".png"));
			FileUtils.copyFile(sourceFile, new File(currentDirectory + "/screenshot/"+ label + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
