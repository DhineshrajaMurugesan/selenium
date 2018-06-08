package com.kg.definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import javax.swing.text.Document;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

@RunWith(Cucumber.class)
public class myTrip {
    public static WebDriver driver;
    @Given("^I am at  mytrip page$")
public void i_am_at_mytrip_page()
  {
    ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-notifications");
        options.addArguments("disable-infobars");
        System.setProperty("webdriver.chrome.driver", "D:\\seleniumdrivers\\chromedriver.exe");
        driver = new ChromeDriver(options);
   
}

@Given("^fill the source$")
public void fill_the_source()  {
    driver.findElement(By.id("hp-widget__sfrom")).click();
   
}

@Given("^fill the destination$")
public void fill_the_destination()  {
    driver.findElement(By.id("hp-widget__sTo")).sendKeys("DEL");
}

@Given("^fill year '(.+)'$")
public void fill_year_(String year)  {
    driver.findElement(By.id("hp-widget__depart")).click();
        String currentYear= driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-year']")).getText();
        if(!currentYear.equals(year))
         {
             do{
                 driver.findElement(By.xpath("(//span[text()='Next'])[1]")).click();
             }while(!driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-year']")).getText().equals(year));
             
         }
   
}

@Given("^fill the return$")
public void fill_the_return()  
{
    ((JavascriptExecutor)driver).executeScript("document.getElementById('hp-widget__return').value='15 April,2018'");
   
}

@When("^I fill makemytrip$")
public void i_fill_makemytrip()  {
    driver.get("https://www.makemytrip.com/");
   
}

@When("^I fill the source$")
public void i_fill_the_source()  {
    driver.findElement(By.id("hp-widget__sfrom")).sendKeys("GOI");
   
}

@When("^I fill the destination$")
public void i_fill_the_destination()  
{
   
}

@When("^fill month '(.+)'$")
public void fill_month_(String month)  {
    String currentMonth= driver.findElement(By.xpath("(//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month'])[1]")).getText();
    if(!currentMonth.equalsIgnoreCase(month))
    {
        do{
            driver.findElement(By.xpath("(//span[text()='Next'])[1]")).click();
        }while(!driver.findElement(By.xpath("(//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month'])[1]")).getText().trim().equalsIgnoreCase(month));
        
    }
   
}

@When("^I fill the return$")
public void i_fill_the_return()  {
   
}

@Then("^I press the enter key$")
public void i_press_the_enter_key()  {
    driver.manage().window().maximize();
   
}

@Then("^I press enter key$")
public void i_press_enter_key()  {
    driver.findElement(By.id("hp-widget__sfrom")).sendKeys(Keys.ENTER);
   
}

@Then("^enter key for to element$")
public void enter_key_for_to_element()  {
    driver.findElement(By.id("hp-widget__sTo")).sendKeys(Keys.ENTER);

}

@Then("^click enter $")
public void click_enter()  {

   
}

@Then("^i click $")
public void i_click()  {
   
}

@And("^fill day '(.+)'$")
public void fill_day_(String day)  {
    driver.findElement(By.xpath("//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()='" + day + "']")).click();
   
}

}