import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\seemal\\git\\Seleniumframwork\\SeleniumFramework\\Drivers\\newlatestchromer\\chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://www.seleniumhq.org/");
		//driver.close();
		
		
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\seemal\\git\\Seleniumframwork\\SeleniumFramework\\Drivers\\geckodriver\\geckodriver.exe");
             WebDriver  driver = new FirefoxDriver();
             
             
             
             
             
             driver.get("https://www.seleniumhq.org/");
             
             
             
             
             
             
             
		  
		
		
		
		

	}

}
