package com.kg.definitions;
// import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.FluentWait;

@RunWith(Cucumber.class)
public class LoginDefinition {
    public static WebDriver driver;
    WebElement dateWidget;
    @Given("^I am at  google page$")
    public void i_am_at_google_page()  {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-notifications");
        options.addArguments("disable-infobars");
        System.setProperty("webdriver.chrome.driver", "D:\\seleniumdrivers\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        //driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);
        driver.get("http://www.assertselenium.com/webdriver/webdriver-wait-commands/");
        driver.manage().timeouts().implicitlyWait(320,TimeUnit.MINUTES);
        // driver.navigate().to("https://www.makemytrip.com/");
        
    }
    @When("^I fill in selenium automation$")
    public void i_fill_in_selenium_automation() throws InterruptedException  {
        driver.manage().timeouts().setScriptTimeout(120,TimeUnit.MINUTES);
        driver.findElement(By.id("hp-widget__sfrom")).click();
        driver.findElement(By.id("hp-widget__sfrom")).sendKeys("GOI");
        driver.findElement(By.id("hp-widget__sfrom")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("hp-widget__sTo")).sendKeys("DEL");
        driver.findElement(By.id("hp-widget__sTo")).sendKeys(Keys.ENTER);
        // WebElement departCal= driver.findElement(By.id("hp-widget__depart"));
        String year="2018";
		String currentYear= driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-year']")).getText();
       if(!currentYear.equals(year))
		{
			do{
				driver.findElement(By.xpath("(//span[text()='Next'])[1]")).click();
			}while(!driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-year']")).getText().equals(year));
			
        }
        String monthname="August";
		String currentMonth= driver.findElement(By.xpath("(//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month'])[1]")).getText();
		if(!currentMonth.equalsIgnoreCase(monthname))
		{
			do{
				driver.findElement(By.xpath("(//span[text()='Next'])[1]")).click();
			}while(!driver.findElement(By.xpath("(//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month'])[1]")).getText().trim().equalsIgnoreCase(monthname));
			
		}
        int day=3;
        driver.findElement(By.xpath("//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()='" + day + "']")).click();
        driver.findElement(By.id("searchBtn")).click();
    }
    @Then("^I press return key$")
    public void i_press_return_key()  {
        // driver.quit();
    }
}