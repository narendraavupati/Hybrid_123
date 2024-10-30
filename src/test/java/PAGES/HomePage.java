package PAGES;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ReportingUtil.Reporters;

public class HomePage {
	WebDriver driver;
	Reporters R1;

	public void HomePage_Driver(WebDriver driver1,Reporters R2) {
		this.driver = driver1;
		this.R1 =R2;
	}

	public void LogOut() throws InterruptedException, IOException {
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/i")).click();
		Thread.sleep(1000);
		R1.logger(driver, "Logout page", "Logout successfully");
		driver.findElement(By.linkText("Logout")).click();
	}
}
