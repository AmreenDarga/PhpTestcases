package net.testcases.testcases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Hotel extends home{

	public Hotel() throws IOException {
		super();
		
	}

	
	By Hotel_name=By.xpath("//span[contains(text(),'Search by Hotel or City Name')]");
    By Check_in=By.xpath("//div[@id='dpd1']//input[@placeholder='Check in']");
    By Check_out=By.xpath("//input[@placeholder='Check out']");
    By AdultsOption=By.xpath("//input[@id='htravellersInput']");
    By Adult=By.xpath("//input[@id='hadultInput']");
    By Child=By.xpath("//input[@id='hchildInput']");
    
    By search=By.xpath("//button[@class='btn btn-lg btn-block btn-primary pfb0 loader']");
    
    
     public void Hotel_name() throws InterruptedException  {
    	// driver.findElement(By.xpath("//li[@class='active text-center']//a[@class='text-center']")).click();
    	 driver.findElement(By.xpath("//div[@id='s2id_location']//a[@class='select2-choice select2-default']")).click();
     	 driver.findElement(By.xpath("//div[@id='s2id_location']//a[@class='select2-choice select2-default']")).sendKeys(p.getProperty("hotel_name"));
     	Thread.sleep(3000);
     	 driver.findElement(By.xpath("//div[contains(text(),'India')]")).click();
     	 
     	
     }
     
   //span[contains(text(),'Search by Hotel or City Name')]
     
    public void Check_in()
     {
    	 driver.findElement(By.xpath("//div[@id='dpd1']//input[@placeholder='Check in']")).click();//check_in
    	 String s1=driver.findElement(By.xpath("//div[14]//div[1]//tr[1]//th[2]")).getText();//month
    	 while(!s1.equalsIgnoreCase(p.getProperty("check_in")))
    	 {
    		 driver.findElement(By.xpath("//div[14]//div[1]//tr[1]//th[3]")).click();//next
    		 s1=driver.findElement(By.xpath("//div[14]//div[1]//tr[1]//th[2]")).getText();//month}
    		 
    	 }
    	 String s2;
    	 for(int i=1;i<=6;i++)
    	 {
    		 for(int j=1;j<=7;j++)
    		 {
    	 s2=driver.findElement(By.xpath("//div[14]//tr["+i+"]//td["+j+"]")).getText();
    			 if(s2.equals("1"))
    			 {
    				 for(int k=1;k<=6;k++)
    				 {
    					 for(int x=1;x<=7;x++)
    					 {
    						  s2=driver.findElement(By.xpath("//div[14]//tr["+k+"]//td["+x+"]")).getText();
    						 System.out.println(s2);
    						 if(s2.equals(p.getProperty("indate"))) 
    						 {
    							 driver.findElement(By.xpath("//div[14]//tr["+k+"]//td["+x+"]")).click();
    						 }
    					 }
    				 }
    			 }
    		 }
    	 }
    	
     }
     
   public void Check_out()
     {
    	 String s1=driver.findElement(By.xpath("//div[15]//div[1]//tr[1]//th[2]")).getText();//month
    	 while(!s1.equalsIgnoreCase(p.getProperty("check_out")))
    	 {
    		 driver.findElement(By.xpath("//div[15]//div[1]//tr[1]//th[3]")).click();//next
    		 s1=driver.findElement(By.xpath("//div[15]//div[1]//tr[1]//th[2]")).getText();//month}
    		 
    	 }
    	 String s2;
    	 for(int i=1;i<=6;i++)
    	 {
    		 for(int j=1;j<=7;j++)
    		 {
    		 s2=driver.findElement(By.xpath("//div[15]//tr["+i+"]//td["+j+"]")).getText();//day
    			 if(s2.equals("1"))
    			 {
    				 for(int k=1;k<=6;k++)
    				 {
    					 for(int x=1;x<=7;x++)
    					 {
    						 s2=driver.findElement(By.xpath("//div[15]//tr["+k+"]//td["+x+"]")).getText();
    						 System.out.println(s2);
    						 if(s2.equals(p.getProperty("outdate"))) 
    						 {
    							 driver.findElement(By.xpath("//div[15]//tr["+k+"]//td["+x+"]")).click();
    						 }
    					 }
    				 }
    			 }
    		 }
    	 }
    	
    	
     }
     public void AdultOption()
     {
    	 driver.findElement(By.xpath("//input[@id='htravellersInput']")).click();
    	 driver.findElement(Adult).clear();
     	 driver.findElement(Adult).sendKeys(p.getProperty("adults"));
     	 driver.findElement(Child).sendKeys(p.getProperty("child"));
     	 driver.findElement(search).click();
     }
     	 
     	 
     	 
     
    
public static void main(String[] args) throws IOException {
try
{
	Hotel h=new Hotel();
	h.launchbrowser();
	h.Hotel_name();
	h.Check_in();
h.Check_out();
	 driver.findElement(By.xpath("//input[@id='htravellersInput']")).click();
	h.AdultOption();
	//h.search();
}
catch(InterruptedException e)
{
		

	}

}
}