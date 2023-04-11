
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginTest{
    WebDriver driver=null;
    @Given("browser is open")
    public void browser_is_open() {
     System.out.println("Inside step browser");
     System.out.printf("webdirver.gecko.marionette","D:\\Elli\\workspace\\0307\\src\\test\\resource\\driver\\geckodriver.exe");
    driver=new FirefoxDriver();
    }
    @And("user is on login page")
    public void user_is_on_login_page() throws Exception {

       // driver.navigate().to("https://alfard09.github.io/admtesting/");
        driver.navigate().to("file:///D:/Elli/page/index.html");


    }
    @When("user enter username and password")
    public void user_enter_username_and_password() throws Exception {
    	Thread.sleep(2000);
        driver.findElement(By.id("emailTest")).sendKeys("xyz@gmail.com");
        driver.findElement(By.id("passwordTest")).sendKeys("12345");
        Thread.sleep(2000);


    }
    @And("user clicks on login")
    public void user_clicks_on_login() throws Exception {
    			
          driver.findElement(By.id("submit")).click();
          Thread.sleep(2000);

    }
    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() throws Exception {

          driver.findElement(By.className("post-title")).isDisplayed();
          //driver.findElement(By.id("welText")).isDisplayed();
          Thread.sleep(2000);
          driver.close();
          driver.quit();

           }

}
