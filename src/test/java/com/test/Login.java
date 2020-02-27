package com.test;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;

public class Login {
	WebDriver driver;
	@Given("i enter the username")
	public void i_enter_the_username() {
		System.setProperty("webdriver.chrome.driver","C:\\selenium aishu\\CucumberTest\\src\\test\\resources\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://10.232.237.143/TestMeApp");
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.name("userName")).sendKeys("Lalitha");
	}	
   @Given("i enter the password")
	public void i_enter_the_password() {
		driver.findElement(By.name("password")).sendKeys("Password123");
	  
	}
   @When("i click on the login button")
	public void i_click_on_the_login_button() {
	    driver.findElement(By.name("Login")).click();
	}
   @Then("the Home page is displayed")
   public void the_Home_page_is_displayed() {
      System.out.println("Home page is displayed");
   }
   @When("i clcik on the All Category button")
   public void i_clcik_on_the_All_Category_button() {
	   driver.findElement(By.linkText("All Categories")).click();
   }



 @When("user search for a product in a search engine")
     public void user_search_for_a_product_in_a_search_engine() {
	   driver.findElement(By.linkText("Electronics")).click();
	    driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Head Phone")).click();
	    driver.findElement(By.linkText("Add to cart")).click();
	 
}

   @Then("user added to  cart")
public void user_added_to_cart() {
	   System.out.println("Product added to cart successfully");
}
}
