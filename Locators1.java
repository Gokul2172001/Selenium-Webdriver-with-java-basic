import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locators1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Documents\\chromedriver_win32\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitWait(Duration.ofSeconds(20);
	    driver.get("https:terv.pro/login");
	    driver.findElement(By.name("Login")).click();

	}

}
