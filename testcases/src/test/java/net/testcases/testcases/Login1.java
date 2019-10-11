package net.testcases.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login1 extends browser{
	
	
	
  public Login1() throws IOException {
	
	}

/*@BeforeTest
  public void LaunchBrowser_Login() throws IOException{
	  browser b= new browser();
	  
  }*/
  
  @Test
  public void run_Login() throws IOException
  {
	  login l=new login();
		l.launchbrowser();
	    driver.findElement(By.xpath("//*[@id=\"cookyGotItBtn\"]")).click();
		l.Login();
		l.email();
		l.Password();

		l.loginbutton();
		
  }
}
