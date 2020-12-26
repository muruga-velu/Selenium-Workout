package BootCamp.SeleniumBC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class createAccount_SF {

	public static void main(String[] args) {
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
	    
		
		driver.findElementByXPath("//div[@title='New']").click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByXPath("//span[text()='*']/following::input").sendKeys("Muruganandam");
		driver.findElementByXPath("(//a[@class='select'])[3]").click();
		driver.findElementByXPath("(//a[@role='menuitemradio'])[2]").click();
		driver.findElementByXPath("(//span[text()='Save'])[2]").click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement element1 = driver.findElementByXPath("//span[text()='Accounts']");
	    JavascriptExecutor executor1 = (JavascriptExecutor)driver;
	    executor1.executeScript("arguments[0].click();", element1);
		
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String text = driver.findElementByXPath("(//a[@data-aura-class='forceOutputLookup'])[1]").getText();
		System.out.println("Account name is: " +text);
		driver.close();
		
		
		
		
		
		
		
		
		
		

	}

}
