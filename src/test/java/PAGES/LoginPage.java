package PAGES;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ReportingUtil.Reporters;

public class LoginPage {
    WebDriver driver;
    Reporters R1;
    public void LoginPage_Driver(WebDriver driver1,Reporters R2) {
    	this.driver=driver1;
    	this.R1=R2;
    }
    public void Login(String username,String password) throws InterruptedException, IOException {
    	driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(2000);
		R1.logger(driver, "Login page", "Login credentials");
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
    }
}
