package BootCamp.SeleniumBC;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class architectCertifications {

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
		Thread.sleep(5000);
		System.out.println("Home Page title is : " + driver.getTitle());
		driver.findElementByXPath("//span[text()='Learn More']").click();
		
		// Switch between browser tabs
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		 
	    System.out.println("2nd Tab title is : " + driver.getTitle());
	    
	    Thread.sleep(3000);		
	    
	    //Mouse hover and Click
		Actions actions = new Actions(driver);
		WebElement menu = driver.findElement(By.xpath("(//button[@class='nav-item-link child-menu']//span)[3]"));
		actions.moveToElement(menu).build().perform();

		WebElement subMenu = driver.findElement(By.xpath("//span[text()='Salesforce Certification ']"));
				  
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", subMenu);
		  
		ArrayList<String> tabs1 = new ArrayList<String> (driver.getWindowHandles());
				 
		driver.switchTo().window(tabs1.get(2));		
		 
		driver.findElementByXPath("//img[@alt='Salesforce Architect']").click();
		  
		System.out.println("Page tile after selecting Architect is : " + driver.getTitle());       		
	   
		
		List<WebElement> cnames = driver.findElements(By.xpath("//div[contains(@class,'Fz(16px) Lh(18px) Fw(b) Pv(5px)')]/a"));

        System.out.println(cnames.size());

        for (WebElement webElement : cnames) {
            String name = webElement.getText();
            System.out.println(name);
        }
	}

}
