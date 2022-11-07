package page;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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
	

}
