package BootCamp.SeleniumBC;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class downloadReleaseNotes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();		
		options.addArguments("--disable-notifications");
			
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("cypress@testleaf.com");
		driver.findElementById("password").sendKeys("Bootcamp@123");
		driver.findElementById("Login").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//a[@title='Page 3']").click();
		driver.findElementByXPath("(//button[@title='Get Started'])[5]").click();
		Thread.sleep(3000);
		
		// Switch between browser tabs
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));			 
		System.out.println("2nd Tab title is : " + driver.getTitle());		  
		Thread.sleep(3000);
		
		driver.findElementByXPath("(//button[@class='btn btn-default dropdown-toggle'])[4]").click();
		driver.findElementByLinkText("Summer ’20").click();
		driver.findElementByXPath("(//div[@class='download-link']//a)[2]").click();
		Thread.sleep(3000);
		
		System.out.println("PDF is succussfully downloaded & you can save the file in your local drive");		  
		
		driver.quit();	
		

	}

}
