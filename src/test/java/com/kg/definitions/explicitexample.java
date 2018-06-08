package com.kg.definitions;
// import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Sleeper;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.FluentWait;
import java.lang.Thread;

@RunWith(Cucumber.class)
public class explicitexample {
    public static WebDriver driver;
   

    @Given("^I am at home page$")
    public void i_am_at_home_page()  {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-notifications");
        options.addArguments("disable-infobars");
        System.setProperty("webdriver.chrome.driver", "D:\\seleniumdrivers\\chromedriver.exe");
        driver = new ChromeDriver(options);
        // driver.navigate().to("https://www.makemytrip.com/");
        
    }
    @When("^I fill $")
    public void i_fill()  {
        //sleep(java.time.Duration.ofMinutes(5));
        WebDriverWait wait=new WebDriverWait(driver,120);
         WebElement x=wait.until(ExpectedConditions.elementToBeClickable(By.id("hp-widget__sfrom")));
         x.clear();
        System.out.println(wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.id("hp-widget__sfrom"),0)));
        WebElement y =wait.until(ExpectedConditions.presenceOfElementLocated(By.id("hp-widget__sfrom")));
        boolean status=y.isEnabled();
        System.out.println("status"+status);
       // Wait<WebDriver> waitflue = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5,  TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
        Wait<WebDriver> waitfluent = new FluentWait<WebDriver>(driver).withTimeout(java.time.Duration.ofMinutes(5)).pollingEvery(java.time.Duration.ofMinutes(1)).ignoring(NoSuchElementException.class);
        WebElement z=waitfluent.until(ExpectedConditions.presenceOfElementLocated(By.id("hp-widget__sfrom")));
        boolean display=z.isDisplayed();
        System.out.println("status"+display);
        //assertTrue("not exist",driver.getPageSource().equalsIgnoreCase("goa to new delhi"));
        // driver.navigate().to("https://flights.makemytrip.com/makemytrip/search/O/O/E/1/0/0/S/V0/GOI_DEL_05-06-2018?contains=false&remove=");
        //assertTrue("not exist",driver.getPageSource().equalsIgnoreCase("goa to new delhi"));
    }
	@Then("^key$")
    public void key()  {
        driver.quit();
    }
}