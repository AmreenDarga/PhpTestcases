package net.testcases.testcases;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class home extends browser{

		public home() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

		By My_Account=By.xpath("/html[1]/body[1]/nav[1]/div[1]/div[2]/ul[2]/ul[1]/li[1]/a[1]");
        By Login=By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Login')]");
        By Sign_Up=By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Sign Up')]");
        By hotels=By.xpath("//li[@class='text-center']//a[@class='text-center']");
        By Flight=By.xpath("/html[1]/body[1]/div[6]/section[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]");
        By Tour=By.xpath("//li[@class='text-center active']//a[@class='text-center']");
       
	

        public void Sign_Up() throws InterruptedException
        {
        	Thread.sleep(1000);
        	driver.findElement(My_Account).click();
        	driver.findElement(Sign_Up).click();	
        }
        
        
        public void Login()
        {
        	driver.findElement(My_Account).click();
        	driver .findElement(Login).click();	
        }
        
        
        public void Hotels()
        {
        	
        	driver.findElement(hotels).click();	
        }
        
        public void Flight()
        {
        	
        	driver.findElement(Flight).click();	
        }
     
        public void Tour()
        {
        	driver.findElement(Tour).click();
        }

public static void main(String[]args) throws IOException{
	try {

	home h=new home();
	h.Sign_Up();
	h.Login();
	h.Hotels();
	h.Flight();
	h.Tour();
}
	catch(InterruptedException e)
	{
			

		}

}
}
