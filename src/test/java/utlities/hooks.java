package utlities;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;



public class hooks {
public static WebDriver driver;

@Before
public void beforeSenario() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBMADMIN\\Desktop\\Driver\\chromedriver.exe");
	System.out.println("Testing Start");
	driver=new ChromeDriver();
	
}

@After
public void afterSenario() {
	
	System.out.println("Test Complete");
	driver.quit();
	
	
}


}
