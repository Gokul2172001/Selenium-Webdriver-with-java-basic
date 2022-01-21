import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selIntroduction {

	public static void main(String[] args) {


		//Invoking Browser
		//Chrome - ChromeDriver ->Methods close get
		//Firefox - FirefoxDriver ->Methods close get
		//Safari - SafariDriver ->Methods close get
		//Webdriver close get
		//WebDriver methods + ClassMethods
		
		//ChromeDriver.exe->ChromeBrowser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Documents\\chromedriver_win32\\chromedriver.exe");
		
		//WebDriver.Chrome.driver->value of path
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();

	}

}
