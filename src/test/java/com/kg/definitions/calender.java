package com.kg.definitions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

@RunWith(Cucumber.class)
public class calender {
    public static WebDriver driver;
    @Given("^enter year '(.+)'$")
    public void enter_year_(String year)  {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-notifications");
        options.addArguments("disable-infobars");
        System.setProperty("webdriver.chrome.driver", "D:\\seleniumdrivers\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.navigate().to("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("hp-widget__depart")).click();
        String currentYear= driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-year']")).getText();
        if(!currentYear.equals(year))
         {
             do{
                 driver.findElement(By.xpath("(//span[text()='Next'])[1]")).click();
             }while(!driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-year']")).getText().equals(year));
             
         }
    }

    @When("^enter month '(.+)'$")
    public void enter_month_(String month)  {
        String currentMonth= driver.findElement(By.xpath("(//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month'])[1]")).getText();
		if(!currentMonth.equalsIgnoreCase(month))
		{
			do{
				driver.findElement(By.xpath("(//span[text()='Next'])[1]")).click();
			}while(!driver.findElement(By.xpath("(//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month'])[1]")).getText().trim().equalsIgnoreCase(month));
			
		}
    }

    @Then("^press enter $")
    public void press_enter()  {
       
    }

    @And("^enter day '(.+)'$")
    public void enter_day_(String day)  {
        driver.findElement(By.xpath("//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()='" + day + "']")).click();
        }

}