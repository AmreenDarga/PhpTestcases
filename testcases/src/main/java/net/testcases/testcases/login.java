package net.testcases.testcases;

import java.io.IOException;

import org.openqa.selenium.By;

public class login extends home{

	public login() throws IOException {
		super();
	}
		
       By Email=By.xpath("//input[@placeholder='Email']");
 
       
       By Password=By.xpath("//input[@placeholder='Password']");
       By Login=By.xpath("//button[@class='btn btn-action btn-lg btn-block loginbtn']");
       
        public void email()
        {
        	 driver.findElement(Email).sendKeys(p.getProperty("email"));
        	
        }
        
        
        public void Password()
        {
       	 driver.findElement(Password).sendKeys(p.getProperty("password"));
        }
        
	
        public void loginbutton()
        {
          	 driver.findElement(Login).click();
        }

public static void main(String[] args) throws IOException {
	login l=new login();
	l.launchbrowser();
	l.Login();
	l.email();
	l.Password();
	l.loginbutton();
	
}
	
}