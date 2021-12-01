import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.testyou.in/Login.aspx");
		driver.manage().window().maximize();		
		driver.findElement(By.xpath("//*[@id=\"ctl00_CPHHeader_HyperLink1\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ctl00_CPHContainer_gridTest_ctl02_hprlnktestdescription\"]/div")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
