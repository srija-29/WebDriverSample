package sampletests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
  @Test
  public void search() {
	  driver=new ChromeDriver();
	  driver.get("https://www.google.com/");
	  WebElement s=driver.findElement(By.id("input"));
	  s.sendKeys("Learn selenium");
	  driver.close();
  }
}
