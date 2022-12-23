import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Documents\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Gokul. E");
		driver.findElement(By.name("email")).sendKeys("gokul.elumalai12@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("gokul1341919gokul");
		//driver.findElement(By.id("exampleFormControlSelect1")).click();
		Thread.sleep(2000);
		//driver.findElement(By.className("exampleFormControlSelect1[1]")).click();
		driver.findElement(By.cssSelector("label.form-check-label")).click();
		driver.findElement(By.name("bday")).sendKeys("21072001");
		//driver.findElement(By.className("btn-success")).click();
	}

}
