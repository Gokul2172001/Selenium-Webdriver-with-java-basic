import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.;  
  
public class First {  
  
    public static void main(String[] args) {  
        
    // declaration and instantiation of objects/variables  
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Documents\\edgedriver_win64\\msedgedriver.exe");  
    WebDriver driver=new ChromeDriver();  
      
// Launch website  
    driver.navigate().to("http://www.google.com/");  
          
    // Click on the search text box and send value  
    driver.findElement(By.id("lst-ib")).sendKeys("javatpoint tutorials");  
          
    // Click on the search button  
    driver.findElement(By.name("btnK")).click();  
      
    }  
  
}  