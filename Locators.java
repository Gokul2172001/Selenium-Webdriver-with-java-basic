import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args)		
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
		driver.findElement(By.id("email")).sendkeys("gokul.elumalai12@gmail.com");
		System.out.println(driver.findElement(By.id("send code")).click());
		System.out.println(driver.out.println(driver.find Element(By.css("check the email for confirmation"));
		//driver.findElement(By.id("enter the code")).sendkeys("1111111");
		//driver.findElement(By.css("Enter your new password")).sendkeys("gokul114"):
		//driver.findElement(By.css("Re enter your new password")).sendkeys("gokul114"):
		//driver.findElement(By.css("change")).click():
		//System.out.println(driver(By.xpath("Your password has been changed"));
		//driver.findElement(driver(By.id("Login again").click();
		//driver.findElement(By.xpath("//input[@placeholder='name']"));
		close();

	}

}
