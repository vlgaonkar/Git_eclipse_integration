package LearnJenkins;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffSearchTest {
	
	@Test
	public void searchTest(){
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.navigate().to("https://www.youtube.com/user/GlassBoxT");
		assertTrue(1 + 5 ==6);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		/*driver.findElement(By.xpath("//*[@id=' signin_info']/a[1]")).click();*/
	}

}
