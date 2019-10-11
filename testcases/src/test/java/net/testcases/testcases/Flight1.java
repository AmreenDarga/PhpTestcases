package net.testcases.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Flight1 extends browser{

	  public Flight1() throws IOException {
		
		}

	@BeforeTest
	  public void LaunchBrowser_Flight() throws IOException{
		  browser b= new browser();
		  
	  }
	  
	  @Test
	  public void run_Hotel() throws IOException, InterruptedException
	  {	
		  Flight f=new Flight();
		f.launchbrowser();
		 driver.findElement(By.xpath("//*[@id=\"cookyGotItBtn\"]")).click();
		f.Flight();
		f.Source_name();
		f.Destination_name();
		f.Departure_date();
		f.roundtrip();
		f.Return_date();
		f.AdultOption();
		Thread.sleep(1000);
		 driver.findElement(By.xpath("//button[@class='btn-primary btn btn-lg btn-block pfb0']")).click();
	  }
	}
