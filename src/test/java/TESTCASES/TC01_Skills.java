package TESTCASES;

import org.testng.annotations.Test;

import PAGES.HomePage;
import PAGES.LoginPage;
import PAGES.SkillsPage;
import ReportingUtil.Reporters;

import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TC01_Skills {
	WebDriver driver;
	Reporters R1;
 
  @BeforeClass
  public void setUp() throws InterruptedException, IOException {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  R1 = new Reporters();
	  R1.CreateHTMLReport("Tc01_Skills");
	  R1.logger(driver, "Launch URL", "Application URL launched");
  }
  
  @Test
  public void main() throws InterruptedException, IOException {
	  LoginPage L1 = new LoginPage();
	  L1.LoginPage_Driver(driver, R1);
	  L1.Login("Admin", "admin123");
	  
	  SkillsPage S1 = new SkillsPage();
	  S1.SkillsPage_Driver(driver, R1);
	  S1.AddSkills("Salesforcwe143", "Salesforcwe143 desc");
	  
	  HomePage H1 = new HomePage();
	  H1.HomePage_Driver(driver, R1);
	  H1.LogOut();
  }

  @AfterClass
  public void tearDown() {
//	  driver.close();
	  R1.closeReport();
  }

}
