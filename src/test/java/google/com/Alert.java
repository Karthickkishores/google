package google.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert {

	public static void main(String[] args) {
	ChromeOptions options = new ChromeOptions();
	WebDriver driver = new ChromeDriver (options);
	driver.get("https://demo.automationtesting.in/Alerts.html");
	
	}

}
