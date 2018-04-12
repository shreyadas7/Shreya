package task;



import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadLessBrowser {

	public static void main(String[] args) {
		/*System.setProperty("webdriver.chrome.driver", "C:\\Saubhik's Personal\\Shreya IMP\\BrowserDriver\\Selenium\\Web Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();*/
		
		WebDriver driver=new HtmlUnitDriver();
				
		driver.get("https://www.makemytrip.com");
		driver.findElement(By.id("header_tab_hotels")).click();
		
		//takeScreenshot(driver);
		
		List<WebElement> abc= driver.findElements(By.id("dealCardUL"));
		
		System.out.println(abc.size());
		
		for(WebElement el: abc)
		{
			System.out.println(el.getText());
		}
	}
		//takescreenshot
		
/*		public static void takeScreenshot(WebDriver driver)
		{
		
		String path="C:\\Users\\Saubhik\\Desktop\\ShreyaDoc\\Traing\\hello.jpg";
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try{
		FileUtils.copyFile(src, new File(path));
		}catch(IOException e){
			e.getMessage();
		}
	
		}*/
}
	

