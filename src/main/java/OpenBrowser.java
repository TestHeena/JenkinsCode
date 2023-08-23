import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenBrowser {
	
	ChromeDriver driver;
	@BeforeMethod
	public void InitBrowser()
	{
		driver=new ChromeDriver();
		
	}
	
	@Test
	public void OpenBrowser() throws InterruptedException
	{
		driver.get("http://google.com/");
		driver.findElement(By.name("q")).sendKeys("Hello");
		driver.wait(2000);
	}
	
	@AfterMethod
	public void CloseBrowser()
	{
		driver.close();
	}

}
