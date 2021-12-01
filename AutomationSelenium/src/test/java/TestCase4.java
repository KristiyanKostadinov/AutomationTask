import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.testyou.in/Login.aspx");
		driver.manage().window().maximize();		
		driver.findElement(By.xpath("//*[@id=\"ctl00_CPHContainer_hprlnkForgetPassword\"]")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
