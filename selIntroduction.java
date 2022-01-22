import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class selIntroduction {

	public static void main(String[] args) {


		//Invoking Browser
		//Chrome - ChromeDriver ->Methods close get
		//Firefox - FirefoxDriver ->Methods close get
		//Safari - SafariDriver ->Methods close get
		//Webdriver close get
		//WebDriver methods + ClassMethods
		
		//ChromeDriver.exe->ChromeBrowser
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Documents\\chromedriver_win32\\chromedriver.exe");
		//Microsoft edge
		System.setProperty("webdriver.edge.driver","C:\\Users\\ELCOT\\Documents\\edgedriver_win64\\msedgedriver.exe");
		
		//WebDriver.Chrome.driver->value of path
		//WebDriver driver = new ChromeDriver();
		
		//Webdriver.edge.driver->value of path
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://tpbproxypirate.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();

	}

}
