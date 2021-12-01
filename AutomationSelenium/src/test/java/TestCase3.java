import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		//Blank for LoginID
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.testyou.in/Login.aspx");
		driver.manage().window().maximize();		
		driver.findElement(By.xpath("//*[@id=\"ctl00_CPHContainer_txtUserLogin\"]")).sendKeys(" ");
		driver.findElement(By.xpath("//*[@id=\"ctl00_CPHContainer_txtPassword\"]")).sendKeys("113223");
		driver.findElement(By.xpath("//*[@id=\"ctl00_CPHContainer_btnLoginn\"]")).click();
		Thread.sleep(2000);
		driver.quit();

		/* Blank for Password
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.testyou.in/Login.aspx");
		driver.manage().window().maximize();		
		driver.findElement(By.xpath("//*[@id=\"ctl00_CPHContainer_txtUserLogin\"]")).sendKeys("Sawwe");
		driver.findElement(By.xpath("//*[@id=\"ctl00_CPHContainer_txtPassword\"]")).sendKeys(" ");
		driver.findElement(By.xpath("//*[@id=\"ctl00_CPHContainer_btnLoginn\"]")).click();
		Thread.sleep(2000);
		driver.quit();
		*/
		
	}

}
