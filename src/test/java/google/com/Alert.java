package google.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
	ChromeOptions options = new ChromeOptions();
	WebDriver driver = new ChromeDriver (options);
	driver.get("https://demoqa.com/alerts");
	Thread.sleep(5000);
	
	//driver.findElement(By.linkText("Alert with OK")).click();
	//driver.findElement(By.linkText("click the button to display an  alert box:")).click();   
	driver.findElement(By.id("promtButton")).click();
	
	org.openqa.selenium.Alert alert = driver.switchTo().alert();

	alert.sendKeys("testing");
	
	alert.accept();
	
	
	
	
	
	}

}
