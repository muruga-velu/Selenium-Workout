package BootCamp.SeleniumBC;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class editAccounts {

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
		driver.findElementByXPath("(//input[@type='search'])[3]").sendKeys("Accounts");
		driver.findElementByXPath("(//b[text()='Accounts'])[1]").click();
		String text1 = driver.findElementByXPath("//span[@data-aura-class='uiOutputPhone']").getText();
		driver.findElementByXPath("(//a[contains(@class,'slds-button slds-button--icon-x-small')])[1]").click();
		driver.findElementByXPath("//a[@title='Edit']").click();
		driver.findElementByXPath("(//a[@class='select'])[2]").click();
		driver.findElementByXPath("//a[@title='Technology Partner']").click();
		driver.findElementByXPath("(//div[@class='slds-form-element__control'])[13]").click();
		driver.findElementByXPath("//a[@title='Healthcare']").click();
		driver.findElementByXPath("(//textarea[contains(@class,'street compoundTLRadius')])[1]").sendKeys("testleaf");
		driver.findElementByXPath("(//textarea[contains(@class,'street compoundTLRadius')])[2]").sendKeys("testleaf");
		driver.findElementByXPath("(//div[@class='slds-form-element__control'])[19]").click();
		driver.findElementByXPath("//a[@title='Low']").click();
		driver.findElementByXPath("(//div[@class='slds-form-element__control'])[20]").click();
		driver.findElementByXPath("//a[@title='Silver']").click();
		driver.findElementByXPath("(//div[@class='slds-form-element__control'])[25]").click();
		driver.findElementByXPath("//a[@title='No']").click();
		driver.findElementByXPath("(//input[@type='tel'])[1]").clear();
		driver.findElementByXPath("(//input[@type='tel'])[1]").sendKeys("8301234567");
		driver.findElementByXPath("(//div[@class='slds-form-element__control'])[24]").click();
		driver.findElementByXPath("(//a[@title='No'])[2]").click();
		driver.findElementByXPath("(//span[text()='Save'])[2]").click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String text2 = driver.findElementByXPath("//span[@data-aura-class='uiOutputPhone']").getText();
		System.out.println("Existing Phone Number: " +text1);
		System.out.println("Updated Phone Number: " +text2);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
