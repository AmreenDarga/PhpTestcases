package net.testcases.testcases;





/*
		import java.io.FileInputStream;
		import java.io.FileNotFoundException;
		import java.io.IOException;
		import java.util.Properties;

		import org.openqa.selenium.By;
		import org.openqa.selenium.By.ByXPath;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		public class signup {
			
			

			/*public signup() throws IOException {
				super();
				// TODO Auto-generated constructor stub
			}*/

		/*	Properties p=new Properties();

					public static void main(String[] args) throws IOException {
					

						Properties p=new Properties();
							FileInputStream f1=new FileInputStream("C:\\New folder\\testcases\\data.properties");
							p.load(f1);	
						    System.setProperty("webdriver.chrome.driver","C:\\Users\\Online Test\\Downloads\\chromedriver_win32\\chromedriver.exe ");
						    WebDriver driver=new ChromeDriver();
						    driver.get(p.getProperty("URL"));
						    driver.manage().window().maximize();
					
						    driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//a[@class='dropdown-toggle go-text-right'][contains(text(),'My Account')]")).click();
						    driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Sign Up')]")).click();
						    driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(p.getProperty("first_name"));
						    driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(p.getProperty("last_name"));
						    driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys(p.getProperty("mobile"));
						    driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(p.getProperty("email"));
						    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(p.getProperty("password"));
						    driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys(p.getProperty("confirm_password"));
						    driver.findElement(By .xpath("//button[@class='signupbtn btn_full btn btn-action btn-block btn-lg']")).click();
                          ;
					
				
	}

}*/
		


		import java.io.IOException;

		import org.openqa.selenium.By;

		public class signup extends home{

			public signup() throws IOException {
				super();
			}
			
			By My_account=By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//a[@class='dropdown-toggle go-text-right'][contains(text(),'My Account')]");
			By Sign_up=By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Sign Up')]");
			By First_name=By.xpath("//input[@placeholder='First Name']");
			By Last_name=By.xpath("//input[@placeholder='Last Name']");
			By mobile=By.xpath("//input[@placeholder='Mobile Number']");
			By email=By.xpath("//input[@placeholder='Email']");
			By password=By.xpath("//input[@placeholder='Password']");
			By confirm_password=By.xpath("//input[@placeholder='Confirm Password']");
			By Signup=By.xpath("//button[@class='signupbtn btn_full btn btn-action btn-block btn-lg']");
			
			
		
			   
	        public void My_account()
	        {
	        	 driver.findElement(My_account).click();
	        	
	        }
	        
	        
	        public void Sign_up()
	        {
	        	 driver.findElement(Sign_up).click();
	        }
	        
		       
		        public void firstname()
		        {
		        	 driver.findElement(First_name).sendKeys(p.getProperty("first_name"));
		        	
		        }
		        
		        
		        public void lastname()
		        {
		       	 driver.findElement(Last_name).sendKeys(p.getProperty("last_name"));
		        }
		        
		        public void mobile()
		        {
		       	 driver.findElement(mobile).sendKeys(p.getProperty("Mobile"));
		        }
		        
		        
		        
		        public void email()
		        {
		       	 driver.findElement(email).sendKeys(p.getProperty("email"));
		        }
		        
		        
		        public void password()
		        {
		       	 driver.findElement(password).sendKeys(p.getProperty("password"));
		        }
		        
		        public void confirm_password()
		        {
		       	 driver.findElement(confirm_password).sendKeys(p.getProperty("confirm_password"));
		        }
		        
		        public void signupbutton()
		        {
		          	 driver.findElement(Signup).click();
		        }
		        

		public static void main(String[] args) throws IOException {
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
