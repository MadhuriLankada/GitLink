package SeleniumProject.SeleniumProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WindowPopup {
	
	 @Test
	  public void f() throws InterruptedException {
		 driver.findElement(By.xpath("/html/body/strong/div/a[1]/amp-img/img")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.id("popup_modal_dismiss_button")).click();
		 driver.switchTo().alert().accept();
		
	  }
	  WebDriver driver;
	  @BeforeClass
	  public void beforeClass() {
		  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://popuptest.com/goodpopups.html");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }

	  @AfterClass
	  public void afterClass() {
	//	  driver.close();
	  }
}
