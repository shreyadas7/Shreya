package findName;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findname {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Saubhik's Personal\\Shreya IMP\\BrowserDriver\\Selenium\\Web Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//title findout of the search page from google
		/*driver.get("https://www.google.co.in");
		
		driver.findElement(By.id("lst-ib")).sendKeys("sachin tendulkar"+Keys.ENTER);
		driver.findElement(By.linkText("Sachin Tendulkar - Wikipedia")).click();*/
		/*    String expectedTitle = "HTML Tutorial";
	        String actualTitle = "";
	        
	        actualTitle = driver.getTitle();
	        
	        if(actualTitle.contentEquals(expectedTitle)){
	        	System.out.println("Pass");
	        }else{
	        	System.out.println("Fail");
	        }*/
		/*String url1=driver.getCurrentUrl();
		System.out.println(url1);*/
		
        driver.get("http://demo.guru99.com/selenium/deprecated.html");
        //driver.quit();
        
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("org.openqa.selenium.firefox")).click();
		
	}
	
	}
