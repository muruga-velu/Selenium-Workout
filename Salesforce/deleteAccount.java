package BootCamp.SeleniumBC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class deleteAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();		
		options.addArguments("--disable-notifications");
			
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("nupela@testleaf.com");
		driver.findElementById("password").sendKeys("Bootcamp@1234");
		driver.findElementById("Login").click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByClassName("slds-icon-waffle").click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByXPath("//button[text()='View All']").click();
		driver.findElementByXPath("(//div[@data-name='Sales']//div)[2]").click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		WebElement element = driver.findElementByXPath("//span[text()='Accounts']");
	    JavascriptExecutor executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click();", element);
	    
	    WebElement webelement = driver.findElementByXPath("(//input[@type='search'])[2]");
	    webelement.sendKeys("Muruganandam");
	    webelement.sendKeys(Keys.ENTER);
	    Thread.sleep(3000);
	    
	    WebElement element1 =driver.findElementByXPath("(//a[contains(@class,'slds-button slds-button--icon-x-small')])[1]");
	    element1.click();
		driver.findElementByXPath("//a[@title='Delete']").click();
		driver.findElementByXPath("//span[text()='Delete']").click();
		Thread.sleep(2000);
		
		String text = driver.findElementByXPath("//span[contains(@class,'toastMessage slds-text-heading--small')]").getText();
		System.out.println("Message: " +text);

	}

}
