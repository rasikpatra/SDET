package StepDefination;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utlities.hooks;



public class StepDefination {
	
    WebDriver driver=hooks.driver;
    @Given("load the home page")
	public void load_the_home_page()  {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBMADMIN\\Desktop\\Driver\\chromedriver.exe");
		
		//driver=new ChromeDriver();
		
		
	    driver.get("http://elearningm1.upskills.in/");
	    
	    
	    
	}

	@When("Go to singup page")
	public void go_to_singup_page() throws InterruptedException {
		driver.findElement(By.linkText("Sign up!")).click();
	    
	}

	@When("Provide first name {string}")
	public void provide_first_name(String string) {
	   driver.findElement(By.id("registration_firstname")).sendKeys(string);
	}

	@When("Provide last name  {string}")
	public void provide_last_name(String string) {
		driver.findElement(By.id("registration_lastname")).sendKeys(string);
	}

	@When("Provide email {string}")
	public void provide_email(String string) {
		driver.findElement(By.id("registration_email")).sendKeys(string); 
	}

	@When("Provide userid {string}")
	public void provide_userid(String string) {
		driver.findElement(By.id("username")).sendKeys(string);
	    
	}

	@When("Provide password {string}")
	public void provide_password(String string) {
		driver.findElement(By.id("pass1")).sendKeys(string);
	}

	@When("Provide confirm password {string}")
	public void provide_confirm_password(String string) {
		driver.findElement(By.id("pass2")).sendKeys(string);
	}

	@When("Enter the resister button")
	public void enter_the_resister_button() {
		driver.findElement(By.id("registration_submit")).click();
	}

	
	@Then("Verify the welcom message {string} & {string} &{string} &{string}")
	public void verify_the_welcom_message(String string, String string2, String string3, String string4) {
		 String p= string+" "+ string2+" "+string3+"," +"\n"+"\n"+string4;


		driver.findElement(By.cssSelector(".col-md-12 > p:nth-child(1)")).getText().equals(p);
	    
	
	}
	
	/*
	 * @Given("Click on profile") public void click_on_profile() {
	 * driver.findElement(By.cssSelector(".dropdown-toggle > img:nth-child(1)")).
	 * click(); }
	 */
	@When("After login {string} & {string}")
	public void after_login(String string, String string2) {
	    driver.findElement(By.id("login")).sendKeys(string);
	    driver.findElement(By.id("password")).sendKeys(string2);
	    driver.findElement(By.id("form-login_submitAuth")).click();
	   
	}
	
	
	@When("click on compose")
	public void click_on_compose() {
		
		 
		/*
		 * WebElement frame=driver.findElement(By.xpath(
		 * "/html/body/main/section/div/div[2]/div[2]/div/div[2]/div/div[2]/div/ul/li[2]/a"
		 * )); driver.switchTo().frame(frame);
		 */
    
      
	    driver.findElement(By.linkText("Compose")).click();
	}

	@When("Provide recipient name {string}")
	public void provide_recipient_name(String string) {
		driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/div/div[2]/div/div[2]/form/fieldset/div[1]/div[1]/span/span[1]/span/ul/li/input")).sendKeys(string);
	    
	}

	@When("Provide subject {string}")
	public void provide_subject(String string) {
	   driver.findElement(By.id("compose_message_title")).sendKeys(string);
	}

	@When("Provide details {string}")
	public void provide_details(String string) {
	    driver.findElement(By.xpath("/html")).sendKeys(string);
	}

	@When("Enter the send key")
	public void enter_the_send_key() {
		
		driver.findElement(By.id("compose_message_compose")).click();
	    
	}

	@Then("Verify the welcom message {string} & {string}")
	public void verify_the_welcom_message(String string, String string2) {
	    String s=string2+" "+string;
	    driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/div[1]")).getText().equals(s);
	}

	}