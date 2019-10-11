package net.testcases.testcases;




import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class browser {
Properties p=new Properties();
	protected static WebDriver driver;
	


public browser() throws IOException
{
	FileInputStream f1=new FileInputStream("C:\\New folder\\testcases\\data.properties");
	p.load(f1);	
	
	
//    driver.quit();	
}
public void launchbrowser()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Online Test\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(p.getProperty("URL"));
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}

public static void main(String[]args) throws IOException
{
	browser b=new browser();
	b.launchbrowser();
	
	
}
}

