package Stepdef;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;

public class laptops {
	WebDriver driver;
	
@Given("User must be on the homepage by clicking on Url {string}")
public void user_must_be_on_the_homepage_by_clicking_on_url(String string) {
	System.setProperty("WebDriver.gecko.driver","gecko.exe");
	driver= new FirefoxDriver ();
	driver.get(string);
    
}


@When("User clicks on signup")
public void user_clicks_on_signup() {
	driver.findElement(By.id("signin2")).click();
   
}

@When("Enter Username and Password")
public void enter_username_and_password() {
	driver.findElement(By.id("sign-username")).sendKeys("oowwwwwWwwwl");
	driver.findElement(By.id("sign-password")).sendKeys("jot"); 
    
}

@When("Click on signup")
public void click_on_signup() throws InterruptedException {
	driver.findElement(By.xpath("//button[contains(text(),'Sign up')]")).click();
	Thread.sleep(3000);
  
}

@Then("Click ok on signup is successful alert")
public void click_ok_on_signup_is_successful_alert() throws InterruptedException {
	Alert al= driver.switchTo().alert();
	al.accept();
	Thread.sleep(3000);
	driver.navigate().refresh();
}
  


@When("Click on Log in")
public void click_on_log_in() {
	driver.findElement(By.id("login2")).click();

}

@When("Enter a valid Username and Password")
public void enter_a_valid_username_and_password() {
	driver.findElement(By.id("loginusername")).sendKeys("piiiaiiiiiiiaaaaaaapppaa");
	driver.findElement(By.id("loginpassword")).sendKeys("jooooot");
   
}

@Then("Log in the website")
public void log_in_the_website() throws InterruptedException {
	driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
	Thread.sleep(3000);
    driver.navigate().refresh();
  
}

@Then ("Click on laptops option")
public void click_on_laptops_option() throws InterruptedException {
	driver.findElement(By.xpath("//a[contains(text(),'Laptops')]")).click();
	Thread.sleep(3000);
   
}

@Then("Click on any laptop name")
public void click_on_any_laptop_name() throws InterruptedException {
	driver.findElement(By.className("hrefch")).click(); 
	Thread.sleep(2000);
	//driver.navigate().refresh();
    
}

@Then("Click on Add to cart")
public void click_on_add_to_cart() throws InterruptedException { 
	driver.findElement(By.cssSelector("a.btn")).click();
	Thread.sleep(3000);
	
	}

@Then("Click ok on Product Added Alert")
public void Click_ok_on_Product_Added_Alert() { 
	Alert f= driver.switchTo().alert();
	f.accept(); 
	//Thread.sleep(3000); 
}

@Then("Go to cart option to check if product is added or not")
public void go_to_cart_option_to_check_if_product_is_added_or_not() throws InterruptedException {
	driver.findElement(By.id("cartur")).click();
	Thread.sleep(3000);
	boolean Display= driver.findElement(By.xpath("//td[contains(text(),'790')]")).isDisplayed();
		
		System.out.println("This is:"+Display);	
		Assert.assertEquals(Display, true);
}}
