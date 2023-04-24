package definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class cucum1 {
public static String url ="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
WebDriver driver;

@Given("open the browser and navigate to login page   #precondition")
public void open_the_browser_and_navigate_to_login_page_precondition() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
}

@When("enter the username {string}")
public void enter_the_username(String string) throws InterruptedException 
{
	Thread.sleep(6000);
	driver.findElement(By.name("username")).sendKeys(string);
}

@When("enter the password  {string}")
public void enter_the_password(String string) throws InterruptedException{
	Thread.sleep(6000);
	driver.findElement(By.name("password")).sendKeys(string);
}

@When("click on login")
public void click_on_login() throws InterruptedException {
	Thread.sleep(6000);
	driver.findElement(By.xpath("//*[@type='submit']")).click();
}

@Then("i should see the login   #outcome")
public void i_should_see_the_login_outcome() throws InterruptedException  {
	Thread.sleep(6000);
	String a = driver.getTitle();
    System.out.println(a);
    driver.close();
}
}

