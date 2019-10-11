package net.testcases.testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Signup1 extends browser{
	public Signup1 () throws IOException {
		
	}
	
	
	
	@Test
	public void runsignup() throws IOException
	{
		signup s=new signup();
		s.launchbrowser();
		s.My_account();
		
		s.Sign_up();
		 driver.findElement(By.xpath("//*[@id=\"cookyGotItBtn\"]")).click();
		s.firstname();
		s.lastname();
		s.email();
		s.password();
		s.confirm_password();
	
		s.signupbutton();
					

}
}