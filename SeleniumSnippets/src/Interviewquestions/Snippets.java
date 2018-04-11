package Interviewquestions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Snippets {

	WebDriver driver1;
	WebDriver driver2;

	@Test

	public void PT1() throws InterruptedException
	{
		driver1.get("https://uvcanautomate.in");
		System.out.println("This is first repo11");
		driver1.quit();


	}
}
