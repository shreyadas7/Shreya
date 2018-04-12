package launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Saubhik's Personal\\Shreya IMP\\BrowserDriver\\Selenium\\Web Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String url="18.221.49.211";
		driver.get(url);

	}

}
