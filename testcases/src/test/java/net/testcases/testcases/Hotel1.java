package net.testcases.testcases;

import org.testng.annotations.Test;


import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Hotel1 extends browser{

		
		
	  public Hotel1() throws IOException {
		
		}

	@BeforeTest
	  public void LaunchBrowser_Hotel() throws IOException{
		  browser b = new browser();
		  
	  }
	  
	  @Test
	  public void run_Hotel() throws IOException, InterruptedException
	  {
			Hotel h=new Hotel();
			h.launchbrowser();
		    driver.findElement(By.xpath("//*[@id=\"cookyGotItBtn\"]")).click();
			h.Hotel_name();
			h.Check_in();
		    h.Check_out();
			driver.findElement(By.xpath("//input[@id='htravellersInput']")).click();
			h.AdultOption();
		
	  }
	}





