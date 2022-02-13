import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Documents\\chromedriver_win32\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://sso.teachable.com/secure/9521/identity/login");
	    driver.findElement(By.id("email")).sendKeys("gokul.elumalai12@gmail.com");
	    driver.findElement(By.name("password")).sendKeys("1341919");
	    //driver.FindElement(By.className("btn-primary button p-v-2-xs p-h-5-xs m-v-3-xs col-12-xs")).click();
		css=input[id$='mail'] 
		WebElement Email = driver.findElement(By.cssSelector("input[id=email]"));
		Email.SendKeys("hello@sampleemail.com");
		driver.findElement(By.id("forgot password")).click();
		driver.findElement(By.id("sign up")).click();

	}

}
