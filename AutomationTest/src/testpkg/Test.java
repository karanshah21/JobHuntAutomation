package testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation Test Selenium\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.linkedin.com");
		Thread.sleep(500);
		d.findElement(By.xpath("//*[@id=\"login-email\"]")).sendKeys("karanshah21june@gmail.com");
		d.findElement(By.xpath("//*[@id=\"login-password\"]")).sendKeys("masters_21");
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"login-submit\"]")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"jobs-tab-icon\"]")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[contains(@placeholder,'Search jobs by title, keyword or company')]")).sendKeys("Software Quality Assurance");
		d.findElement(By.xpath("//*[contains(@placeholder,'City, state, postal code or country')]")).sendKeys("United States");

		d.findElement(By.xpath("//*[contains(@class,'submit-button button-secondary-large')]")).click();
		
		

	}

}
