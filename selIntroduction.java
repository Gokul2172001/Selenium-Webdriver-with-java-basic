import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class selIntroduction {
	public static void main(String[] args) {
		//Invoking Browser
		//Chrome - ChromeDriver 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Documents\\chromedriver_win32\\chromedriver.exe");
		//WebDriver.Chrome.driver->value of path
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("gokul.elumalai12@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("gokul1341919");
		driver.findElement(By.name("login")).click();
		//System.out.println(driver.findElement(By.cssSelector("_9ay7")).getText());
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close();
	}
}
