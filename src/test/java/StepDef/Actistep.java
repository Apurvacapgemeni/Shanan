package StepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Actistep{
	WebDriver d = null;
@Given("browser is open and user is on login page")
public void browserOpen() {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\ab\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    d = new ChromeDriver();
    d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    d.get("https://demo.actitime.com/login.do");
   
}

@When("user enter UN and PWD")
public void user_enter_un_and_pwd() {
   d.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
   d.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
   
}

@When("user click on login btn")
public void user_click_on_login_btn() {
    d.findElement(By.xpath("//div[text()='Login ']")).click();
    
}

@Then("user should navigate to home page")
public void user_should_navigate_to_home_page() {
   String expT=("Enter Time-Track");
   String actT=(d.findElement(By.xpath("//td[text()='Enter Time-Track']"))).getText();
   if (actT.equals(expT)){
	   System.out.println("user is on home page");
	   
   }
   else {
	   System.out.println("tc is failed");
   }
  
}
}