package defination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class step_definition {
public static String url ="https://demo.guru99.com/test/newtours/index.php";
WebDriver driver;
@Given("open the browser and navigate to the login page")
public void open_the_browser_and_navigate_to_the_login_page() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	Thread.sleep(3000);
}
@When("Enter the username {string}")
public void enter_the_username(String string) throws InterruptedException {
	driver.findElement(By.name("userName")).sendKeys(string);
	Thread.sleep(3000);
}
@When("Enter the password {string}")
public void enter_the_password(String string) throws InterruptedException {
	driver.findElement(By.name("password")).sendKeys(string);
	Thread.sleep(3000);
    }
@When("Click on login")
public void click_on_login() throws InterruptedException {
    driver.findElement(By.name("submit")).click();
    Thread.sleep(3000);
}
//@Then("I should see the login page as :mercury towers  #outcome")
//public void i_should_see_the_login_page_as_mercury_towers_outcome() throws InterruptedException {
//  String a= driver.getTitle();
//  Thread.sleep(3000);
//  System.out.println(a);
//	driver. close();
//}

@Then("Ishould not see the login page as :mercury towers")
public void ishould_not_see_the_login_page_as_mercury_towers() throws InterruptedException {
	String a= driver.getTitle();
  Thread.sleep(3000);
  System.out.println(a);
	driver. close();
}

}




