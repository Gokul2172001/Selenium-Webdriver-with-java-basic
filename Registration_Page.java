import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Registration_Page {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstname="Gokul";
		String lastname="E";
		String email="gokul.elumalai12@gmail.com";
		String telephone="9566554241";
		String password="Gokul_21122001";
		String confirm="Gokul_21122001";
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\Documents\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register"); // URL in the browser
		//verify the elements
		if(driver.findElement(By.xpath("//input[@name='firstname']")).isDisplayed()) {
			if(driver.findElement(By.xpath("//input[@name='lastname']")).isDisplayed()) {
				if(driver.findElement(By.xpath("//input[@name='email']")).isDisplayed()) {
					if(driver.findElement(By.xpath("//input[@name='telephone']")).isDisplayed()) {
						if(driver.findElement(By.xpath("//input[@name='password']")).isDisplayed()) {
							if(driver.findElement(By.xpath("//input[@name='confirm']")).isDisplayed()) {
								if(driver.findElement(By.xpath("//a[@class='agree']")).isDisplayed()) {
									if(driver.findElement(By.xpath("//input[@type='submit']")).isDisplayed()) {
										System.out.println("Test Case 1 : Passed");
									}
								}
							}
						}
					}
				}
			}
		}
		//Assert.assertTrue(true);
		//driver.getPageSource().contains("firstname");
		String[] arrofstr=email.split("@",2);
		for(int i=0;i<arrofstr.length;i++) {
		    System.out.println(arrofstr[i]);
		}
		String s1=arrofstr[0];
		String s2=arrofstr[1];
	    //System.out.println(s1);
	    char[] c1=new char[s1.length()];
	    char[] c2=new char[s2.length()];
	    int count=0;
	    for(int i=0;i<s1.length();i++) {
	       c1[i]=s1.charAt(i);
	    }
	    for(int i=0;i<s2.length();i++) {
	       c2[i]=s2.charAt(i);
	    }
	    for(int i=0;i<c1.length;i++) {
	        if(c1[i] == '.') {
	            count+=1;
	        }
	    }
	    for(int i=0;i<c2.length;i++) {
	        if(c2[i] == '.') {
	            count+=1;
	        }
	    }
	    if(count>1) {
	        System.out.println("Test Case 2: Passed");
	    }
	    else {
	        System.out.println("Test Case 2: Failed");
	    }
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(telephone);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='confirm']")).sendKeys(confirm);
		driver.findElement(By.xpath("//a[@class='agree']")).click();
		driver.findElement(By.className("btn-primary")).click();
		driver.findElement(By.xpath("//div[@class='alert-danger']")).getText();
		Assert.assertEquals(s1, s2);
		driver.close();
	}
}