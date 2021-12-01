import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.testyou.in/Login.aspx");		
		driver.findElement(By.xpath("//*[@id=\"ctl00_CPHContainer_txtUserLogin\"]")).sendKeys("Sawwe");
		driver.findElement(By.xpath("//*[@id=\"ctl00_CPHContainer_txtPassword\"]")).sendKeys("113223");
		driver.findElement(By.xpath("//*[@id=\"ctl00_CPHContainer_txtPassword\"]")).sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);
		driver.quit();
	}

}
