import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class tutorialsninja {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Documents\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		//driver.findElement(By.className("hidden-sm")).click();
		//driver.findElement(By.xpath("//a[@href='http://tutorialsninja.com/demo/index.php?route=account/register']")).click();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		driver.findElement(By.name("firstname")).sendKeys("Gokul");
		driver.findElement(By.name("lastname")).sendKeys("E");
		driver.findElement(By.name("email")).sendKeys("gokul.elumalai12@gmail.com");
		driver.findElement(By.name("telephone")).sendKeys("9566554241");
		driver.findElement(By.name("password")).sendKeys("gokul_21122001");
		driver.findElement(By.name("confirm")).sendKeys("gokul_21122001");
		//driver.findElement(By.name("agree")).click();
		driver.findElement(By.className("btn-primary")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close();
	}
}
