package net.testcases.testcases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Flight extends home{

	public Flight() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}


	
	By Source=By.xpath("//div[@id='s2id_origin']//span[@class='select2-chosen'][contains(text(),'Enter Location')]");
    By destination=By.xpath("//div[@id='s2id_destination']//span[@class='select2-chosen'][contains(text(),'Enter Location')]");
    By departure =By.xpath("//input[@id='departure']");
    By Return=By.xpath("//input[@id='arrival']");
    By No_of_guest=By.xpath("//div[@class='col-md-1 form-group go-right col-xs-12']//input[@placeholder='0']");
    By search=By.xpath("//button[@class='btn-primary btn btn-lg btn-block pfb0']");
    By Adult=By.xpath("//select[@id='madult']");
    By Child=By.xpath("//select[@id='mchildren']");
    By Infant=By.xpath("//select[@id='minfant']");
    By Done=By.xpath("//button[@id='sumManualPassenger']");
    By Search=By.xpath("//div[@class='bgfade col-md-3 col-xs-12 search-button']");
    
    
   
     public void Source_name() throws InterruptedException  
     {
    	 driver.findElement(By.xpath("//div[@id='s2id_origin']//a[@class='select2-choice select2-default']")).click();
     	 driver.findElement(By.xpath("//div[@id='s2id_origin']//a[@class='select2-choice select2-default']")).sendKeys(p.getProperty("source"));
     	 Thread.sleep(1000);
   	     driver.findElement(By.xpath("//div[@class='select2-result-label']")).click();
     }
     
     public void Destination_name() throws InterruptedException  
     {
    	 driver.findElement(By.xpath("//div[@id='s2id_destination']//a[@class='select2-choice select2-default']")).click();
     	 driver.findElement(By.xpath("//div[@id='s2id_destination']//a[@class='select2-choice select2-default']")).sendKeys(p.getProperty("destination"));
     	 Thread.sleep(1000);
   	     driver.findElement(By.xpath("//div[@class='select2-result-label']")).click();
     }
  

     public void Departure_date()
     {
    	 driver.findElement(By.xpath("//input[@id='departure']")).click();//check_in
    	 String s1=driver.findElement(By.xpath("//div[16]//div[1]//tr[1]//th[2]")).getText();//month
    	 while(!s1.equalsIgnoreCase(p.getProperty("departure")))
    	 {
    		 driver.findElement(By.xpath("//div[16]//div[1]//tr[1]//th[3]")).click();//next
    		 s1=driver.findElement(By.xpath("//div[16]//div[1]//tr[1]//th[2]")).getText();//month}
    		 
    	 }
    	 String s2;
    	 for(int i=1;i<=6;i++)
    	 {
    		 for(int j=1;j<=7;j++)
    		 {
    	 s2=driver.findElement(By.xpath("//div[16]//tr["+i+"]//td["+j+"]")).getText();
    			 if(s2.equals("1"))
    			 {
    				 for(int k=1;k<=6;k++)
    				 {
    					 for(int x=1;x<=7;x++)
    					 {
    						  s2=driver.findElement(By.xpath("//div[16]//tr["+k+"]//td["+x+"]")).getText();
    						 System.out.println(s2);
    						 if(s2.equals(p.getProperty("dest_date"))) 
    						 {
    							 driver.findElement(By.xpath("//div[16]//tr["+k+"]//td["+x+"]")).click();
    						 }
    					 }
    				 }
    			 }
    		 }
    	 }
    	
     }
     
     public void roundtrip()
     {
     	 driver.findElement(By.xpath("//label[contains(text(),'Round Trip')]")).click(); 
     }
      

  public void Return_date()
     {
    	 driver.findElement(By.xpath("//input[@id='arrival']")).click();//check_in
    	 String s1=driver.findElement(By.xpath("//div[17]//div[1]//tr[1]//th[2]")).getText();//month
    	 while(!s1.equalsIgnoreCase(p.getProperty("return")))
    	 {
    		 driver.findElement(By.xpath("//div[17]//div[1]//tr[1]//th[3]")).click();//next
    		 s1=driver.findElement(By.xpath("//div[17]//div[1]//tr[1]//th[2]")).getText();//month}
    		 
    	 }
    	 String s2;
    	 for(int i=1;i<=6;i++)
    	 {
    		 for(int j=1;j<=7;j++)
    		 {
    	 s2=driver.findElement(By.xpath("//div[17]//tr["+i+"]//td["+j+"]")).getText();
    			 if(s2.equals("1"))
    			 {
    				 for(int k=1;k<=6;k++)
    				 {
    					 for(int x=1;x<=7;x++)
    					 {
    						  s2=driver.findElement(By.xpath("//div[17]//tr["+k+"]//td["+x+"]")).getText();
    						 System.out.println(s2);
    						 if(s2.equals(p.getProperty("ret_date"))) 
    						 {
    							 driver.findElement(By.xpath("//div[17]//tr["+k+"]//td["+x+"]")).click();
    						 }
    					 }
    				 }
    			 }
    		 }
    	 }
    	
     }
      
  public void AdultOption()
  {
 	 driver.findElement(By.xpath("/html[1]/body[1]/div[6]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/form[1]/div[5]/div[1]/input[1]")).click();

 	 driver.findElement(Adult).click();
  	 driver.findElement(Adult).sendKeys(p.getProperty("Adult"));
  	
  	 driver.findElement(Child).click();
  	 driver.findElement(Child).sendKeys(p.getProperty("Child"));

  	driver.findElement(Infant).click();
  	driver.findElement(Infant).sendKeys(p.getProperty("Infant"));
  //	driver.findElement(Infant).click();
  	
    driver.findElement(By.xpath("//button[@id='sumManualPassenger']")).click();
   
  }
  	 
  	 
  
  
public static void main(String[] args) throws IOException {
try
{
	Flight f=new Flight();
	f.launchbrowser();
	f.Flight();
	 driver.findElement(By.xpath("//*[@id=\"cookyGotItBtn\"]")).click();
	f.Source_name();
	f.Destination_name();
	f.Departure_date();
	f.roundtrip();
	f.Return_date();
	f.AdultOption();
	Thread.sleep(1000);
	 driver.findElement(By.xpath("//button[@class='btn-primary btn btn-lg btn-block pfb0']")).click();
}

catch(InterruptedException e)
{
		

	}

}
}