import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Documents\\chromedriver_win32\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitWait(Duration.ofSeconds(15));
	    driver.get("https://sso.teachable.com/secure/9521/identity/login");
	    driver.findElement(By.id("email")).sendKeys("gokul.elumalai12@gmail.com");
	    driver.findElement(By.name("password")).sendKeys("1341919");
		driver.findElement(By.className("SigninBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.LinkText("forget password")).click();
		driver.findElement(By.id("phone")).sendkeys("9566554241");
		driver.findElement(By.className("send otp")).click();
		driver.findElement(By.className("otp")).sendkeys("111111");
		

	}

}
