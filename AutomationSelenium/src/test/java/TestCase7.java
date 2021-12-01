import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase7 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.testyou.in/Login.aspx");
		driver.findElement(By.xpath("//*[@id=\"notificationbar\"]/div/div/div/div/a/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ctl00_CPHContainer_btnLoginn\"]")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}
