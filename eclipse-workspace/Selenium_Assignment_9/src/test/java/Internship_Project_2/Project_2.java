package Internship_Project_2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

public class Project_2 {
	
	WebDriver driver;
	  
	Project_2(WebDriver driver)
	  {
		  this.driver = driver;
	  }
	
	
      public void Testcase1()
		{
		
		//1.Launch browser
		
		WebDriver driver = new ChromeDriver();
		
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(18));
		
		driver.manage().window().maximize();
		
		//2. Navigate to url 'http://automationexercise.com'
		
		driver.navigate().to("http://automationexercise.com");
		
		//3. Verify that home page is visible successfully
		
		//isDisplayed() method returns boolean value either True or False
		Boolean Display = driver.findElement(By.xpath("//img[@alt='Website for automation practice']")).isDisplayed();
		//To print the value
		System.out.println("Homepage displayed is :"+Display);
		
		//4. Click on 'Signup / Login' button
		
		WebElement Click_on = driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']"));
		Click_on.click();
		
		//5. Verify 'New User Signup!' is visible
		
		//isDisplayed() method returns boolean value either True or False
		Boolean new_user = driver.findElement(By.xpath("//h2[normalize-space()='New User Signup!']")).isDisplayed();
		//To print the value
		System.out.println("Newuser displayed is :"+new_user);
		
		//6. Enter name and email address
		
		WebElement Name = driver.findElement(By.xpath("//input[@placeholder='Name']"));
		Name.sendKeys("QA Automation Engineer49");
		
		WebElement email_id = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
		email_id.sendKeys("qaautomation49@gmail.com");
		
		// 7. Click 'Signup' button
		
		WebElement signup_btn = driver.findElement(By.xpath("//button[normalize-space()='Signup']"));
		signup_btn.click();
		
		//8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
		
		//isDisplayed() method returns boolean value either True or False
		Boolean Account_info = driver.findElement(By.xpath("//b[normalize-space()='Enter Account Information']")).isDisplayed();
		//To print the value
		System.out.println("Account Information displayed is :"+Account_info);
		

		//9. Fill details: Title, Name, Email, Password, Date of birth
		
		WebElement title = driver.findElement(By.xpath("//label[@for='id_gender2']"));
		title.click();
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	    password.sendKeys("12345");
	    // Selecting DOB		
        Select date = new Select (driver.findElement(By.id("days")));							
        date.selectByVisibleText("17");
        Select month = new Select (driver.findElement(By.id("months")));							
        month.selectByIndex(1);
        Select year = new Select (driver.findElement(By.id("years")));							
        year.selectByVisibleText("1988");
        
        // 10. Select checkbox 'Sign up for our newsletter!'
        
        WebElement checkbox1 = driver.findElement(By.id("newsletter"));
        checkbox1.click();
        
        
        //11. Select checkbox 'Receive special offers from our partners!'
        
        WebElement checkbox2 = driver.findElement(By.id("optin"));
        checkbox2.click();
		
        // 12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        
        driver.findElement(By.id("first_name")).sendKeys("QA Engineer");
        
        driver.findElement(By.id("last_name")).sendKeys("SDET");
        
        driver.findElement(By.id("company")).sendKeys("ExcelR Solutions");
        
        driver.findElement(By.id("address1")).sendKeys("Madhapur,Hyderabad, Telangana, 500090");
        
        driver.findElement(By.id("address2")).sendKeys("India");
        
        Select Country = new Select (driver.findElement(By.id("country")));							
        Country.selectByVisibleText("India");
        
        driver.findElement(By.id("state")).sendKeys("Telangana");
        
        driver.findElement(By.id("city")).sendKeys("Hyderabad");
        
        driver.findElement(By.id("zipcode")).sendKeys("500090");
        
        driver.findElement(By.id("mobile_number")).sendKeys("9848012345");
        
        // 13. Click 'Create Account button'
        
         driver.findElement(By.xpath("//button[normalize-space()='Create Account']")).click();
         
         
         driver.navigate().refresh();          
             
        //14. Verify that 'ACCOUNT CREATED!' is visible
        
		//isDisplayed() method returns boolean value either True or False
		Boolean new_account = driver.findElement(By.xpath("//b[normalize-space()='Account Created!']")).isDisplayed();
		//To print the value
		System.out.println("New Account Created Successfully :"+new_account);
		
		driver.navigate().refresh(); 
		
								                
        //15. Click 'Continue' button
        
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		
		driver.navigate().refresh(); 
		
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		     
		
		 //16. Verify that 'Logged in as username' is visible
		
		 //isDisplayed() method returns boolean value either True or False
		Boolean account_name = driver.findElement(By.xpath("//i[@class='fa fa-user']")).isDisplayed();
		//To print the value
		System.out.println("Account user name displayed:"+account_name);
		        
        //17. Click 'Delete Account' button
        
		driver.findElement(By.xpath("//i[@class='fa fa-trash-o']")).click();
        
        //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button 
		
		Boolean account_del = driver.findElement(By.xpath("//b[normalize-space()='Account Deleted!']")).isDisplayed();
		//To print the value
		System.out.println("Account Deleted:"+account_del);
		
		
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		
		driver.quit();
		
		}
		
	public void Testcase2()
	{
		//Test Case 2: Login User with correct email and password
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.navigate().to("https://automationexercise.com/");
		driver.manage().window().maximize();
		
		//3. Verify that home page is visible successfully
		
		//isDisplayed() method returns boolean value either True or False
		Boolean Display = driver.findElement(By.xpath("//img[@alt='Website for automation practice']")).isDisplayed();
		//To print the value
		System.out.println("Homepage displayed is :"+Display);
		
		//4. Click on 'Signup / Login' button
		
		WebElement Click_on = driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']"));
		Click_on.click();
		
		//5. Verify 'Login user!' is visible
		
		//isDisplayed() method returns boolean value either True or False
		Boolean login_user = driver.findElement(By.xpath("//h2[normalize-space()='Login to your account']")).isDisplayed();
		//To print the value
		System.out.println("Login User displayed is :"+login_user);
		
		//6. Enter email and password
								
		WebElement email_id = driver.findElement(By.xpath("//input[@data-qa='login-email']"));
		email_id.sendKeys("qaautomation23@gmail.com");
		
		WebElement Password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		Password.sendKeys("12345");
		
		//7. Click 'login' button
		
		WebElement login_btn = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		login_btn.click();
		driver.navigate().refresh();
		
		//8. Verify that 'Logged in as username' is visible
		
		//isDisplayed() method returns boolean value either True or False
		Boolean login_name = driver.findElement(By.xpath("//li[10]//a[1]")).isDisplayed();
		//To print the value
		System.out.println("Loggedin user name displayed:"+login_name);
		
		
		//9. Click 'Delete Account' button
		            
		driver.findElement(By.xpath("//a[normalize-space()='Delete Account']")).click();
		
			
		//10. Verify that 'ACCOUNT DELETED!' is visible
				
		Boolean account_del = driver.findElement(By.xpath("//b[normalize-space()='Account Deleted!']")).isDisplayed();
		//To print the value
		System.out.println("Account Deleted:"+account_del);
		
	}
	
	public void Testcase3()
	{
         WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.navigate().to("https://automationexercise.com/");
		driver.manage().window().maximize();
		
		//3. Verify that home page is visible successfully
		
		//isDisplayed() method returns boolean value either True or False
		Boolean Display = driver.findElement(By.xpath("//img[@alt='Website for automation practice']")).isDisplayed();
		//To print the value
		System.out.println("Homepage displayed is :"+Display);
		
		//4. Click on 'Signup / Login' button
		
		WebElement Click_on = driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']"));
		Click_on.click();
		
	
		//6. Enter incorrect email and password
								
		WebElement email_id = driver.findElement(By.xpath("//input[@data-qa='login-email']"));
		email_id.sendKeys("qaautomation009@gmail.com");
		
		WebElement Password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		Password.sendKeys("12345");
		
		//7. Click 'login' button
		
		WebElement login_btn = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		login_btn.click();
		
		//8. Verify error 'Your email or password is incorrect!' is visible
		
		//isDisplayed() method returns boolean value either True or False
		Boolean incorrect = driver.findElement(By.xpath("//p[normalize-space()='Your email or password is incorrect!']")).isDisplayed();
		//To print the value
		System.out.println("Your email or password is incorrect :"+incorrect);
		
	}
	public void Testcase4()
	{
        WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.navigate().to("https://automationexercise.com/");
		driver.manage().window().maximize();
		
		//3. Verify that home page is visible successfully
		
		//isDisplayed() method returns boolean value either True or False
		Boolean Display = driver.findElement(By.xpath("//img[@alt='Website for automation practice']")).isDisplayed();
		//To print the value
		System.out.println("Homepage displayed is :"+Display);
		
		//4. Click on 'Sign_up / Login' button
		
		WebElement Click_on = driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']"));
		Click_on.click();
		
		//5. Verify 'Login user!' is visible
		
		//isDisplayed() method returns boolean value either True or False
		Boolean login_user = driver.findElement(By.xpath("//h2[normalize-space()='Login to your account']")).isDisplayed();
		//To print the value
		System.out.println("Login User displayed is :"+login_user);
		
		//6. Enter email and password
								
		WebElement email_id = driver.findElement(By.xpath("//input[@data-qa='login-email']"));
		email_id.sendKeys("qaautomation25@gmail.com");
		
		WebElement Password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		Password.sendKeys("12345");
		
		//7. Click 'login' button
		
		WebElement login_btn = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		login_btn.click();
		driver.navigate().refresh();
		
		//8. Verify that 'Logged in as username' is visible
		
		//isDisplayed() method returns boolean value either True or False
		Boolean login_name = driver.findElement(By.xpath("//li[10]//a[1]")).isDisplayed();
		//To print the value
		System.out.println("Loggedin user name displayed:"+login_name);
		
		// 9. Click 'Logout' button
		
		WebElement logout_btn = driver.findElement(By.xpath("//a[normalize-space()='Logout']"));
		logout_btn.click();
		
		//10. Verify that user is navigated to login page
		
		Boolean login_page = driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).isDisplayed();
		//To print the value
		System.out.println("user is navigated to login page:"+login_page);
		
	}
	
	public void Testcase5()
	{
        WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.navigate().to("https://automationexercise.com/");
		driver.manage().window().maximize();
		
		//3. Verify that home page is visible successfully
		
		//isDisplayed() method returns boolean value either True or False
		Boolean Display = driver.findElement(By.xpath("//img[@alt='Website for automation practice']")).isDisplayed();
		//To print the value
		System.out.println("Homepage displayed:"+Display);
		
		//4. Click on 'Sign_up / Login' button
		
		WebElement Click_on = driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']"));
		Click_on.click();
		
		//5. Verify 'New User Signup!' is visible
		
		//isDisplayed() method returns boolean value either True or False
		Boolean New_user = driver.findElement(By.xpath("//h2[normalize-space()='New User Signup!']")).isDisplayed();
		//To print the value
		System.out.println("New User Signup! :"+New_user);
		
		//6. Enter Name and Email
								
		WebElement Name = driver.findElement(By.xpath("//input[@placeholder='Name']"));
		Name.sendKeys("qaautomation25");
		
		WebElement Emailid = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
		Emailid.sendKeys("qaautomation25@gmail.com");
		
		//7. Click 'Sign_up' button
		
		WebElement signup_btn = driver.findElement(By.xpath("//button[normalize-space()='Signup']"));
		signup_btn.click();
		
		//8. Verify error 'Email Address already exist!' is visible
		
		//isDisplayed() method returns boolean value either True or False
		Boolean Exist_user = driver.findElement(By.xpath("//p[normalize-space()='Email Address already exist!']")).isDisplayed();
		//To print the value
		System.out.println("Email Address already exist! :"+Exist_user);
		
		
	}
	
	public void Testcase6()
	{
        
		//1. Launch browser
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		//2. Navigate to url 'http://automationexercise.com'
		
		driver.navigate().to("https://automationexercise.com/");
		driver.manage().window().maximize();
		
		//3. Verify that home page is visible successfully
		
		//isDisplayed() method returns boolean value either True or False
		Boolean Display = driver.findElement(By.xpath("//img[@alt='Website for automation practice']")).isDisplayed();
		//To print the value
		System.out.println("Homepage displayed:"+Display);
		
		//4. Click on 'Contact Us' button
		
		WebElement Contact_Us = driver.findElement(By.xpath("//a[normalize-space()='Contact us']"));
		Contact_Us.click();
		
		//5. Verify 'GET IN TOUCH' is visible
		
		//isDisplayed() method returns boolean value either True or False
		Boolean GET_IN_TOUCH = driver.findElement(By.xpath("//h2[normalize-space()='Get In Touch']")).isDisplayed();
		//To print the value
		System.out.println("GET_IN_TOUCH displayed:"+GET_IN_TOUCH);
		
		//6. Enter name, email, subject and message
		
		WebElement name = driver.findElement(By.xpath("//input[@placeholder='Name']"));
		name.sendKeys("qaautomation25");
		
		WebElement email = driver.findElement(By.xpath("//input[@placeholder='Email']"));
		email.sendKeys("qaautomation25@gmail.com");
		
		WebElement subject = driver.findElement(By.xpath("//input[@placeholder='Subject']"));
		subject.sendKeys("Updating the contact details");
		
		WebElement message = driver.findElement(By.xpath("//textarea[@id='message']"));
		message.sendKeys("Contact details are update here:");
		
				
		//7. Upload file
		
		WebElement upload = driver.findElement(By.xpath("//input[@name='upload_file']"));
		upload.sendKeys("D:\\Selenium\\Test.jpg");
		
		
		//8. Click 'Submit' button
		
		WebElement Submit = driver.findElement(By.xpath("//input[@name='submit']"));
		Submit.click();
		
		
		
		//9. Click OK button
		
		driver.switchTo().alert().accept();
		
		
		//10. Verify success message 'Success! Your details have been submitted successfully.' is visible
		
		//isDisplayed() method returns boolean value either True or False
		Boolean success_message = driver.findElement(By.xpath("//div[@class='status alert alert-success']")).isDisplayed();
		//To print the value
		System.out.println("Your details have been submitted successfully.:"+success_message);
		
		
		//11. Click 'Home' button and verify that landed to home page successfully
		
		WebElement Home = driver.findElement(By.xpath("//span[normalize-space()='Home']"));
		Home.click();
		
		
	}
	
	public void Testcase7()
	{
        
		//1. Launch browser
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		//2. Navigate to url 'http://automationexercise.com'
		
		driver.navigate().to("https://automationexercise.com/");
		driver.manage().window().maximize();
		
		//3. Verify that home page is visible successfully
		
		//isDisplayed() method returns boolean value either True or False
		Boolean Display = driver.findElement(By.xpath("//img[@alt='Website for automation practice']")).isDisplayed();
		//To print the value
		System.out.println("Homepage displayed:"+Display);
		
		//4. Click on 'Test Cases' button
		
		WebElement Testcases = driver.findElement(By.xpath("//a[normalize-space()='Test Cases']"));
		Testcases.click();
		
		//5. Verify user is navigated to test cases page successfully
		
		//isDisplayed() method returns boolean value either True or False
		Boolean TC = driver.findElement(By.xpath("//b[normalize-space()='Test Cases']")).isDisplayed();
		//To print the value
		System.out.println("User is navigated to test cases page successfully:" +TC);
	
	}
	
	public void Testcase8()
	{
		//1. Launch browser
		WebDriver driver = new ChromeDriver();
				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				
				
		//2. Navigate to url 'http://automationexercise.com'
				
		driver.navigate().to("https://automationexercise.com/");
		driver.manage().window().maximize();
				
		//3. Verify that home page is visible successfully
				
		//isDisplayed() method returns boolean value either True or False
		Boolean Display = driver.findElement(By.xpath("//img[@alt='Website for automation practice']")).isDisplayed();
		//To print the value
		System.out.println("Homepage displayed:"+Display);
		
		//4. Click on 'Products' button
		
		WebElement product = driver.findElement(By.xpath("//a[@href='/products']"));
		product.click();
		
		//5. Verify user is navigated to ALL PRODUCTS page successfully
		
		//isDisplayed() method returns boolean value either True or False
		Boolean product_page = driver.findElement(By.xpath("//h2[@class='title text-center']")).isDisplayed();
		//To print the value
		System.out.println("User Navigated to Products Page: "+product_page);
		
		//6. The products list is visible
		
		//isDisplayed() method returns boolean value either True or False
		Boolean product_list = driver.findElement(By.xpath("//h2[normalize-space()='Brands']")).isDisplayed();
		//To print the value
		System.out.println("User Navigated to Products_list Page: "+product_list);
		
		
		//7. Click on 'View Product' of first product
		
		WebElement first_product = driver.findElement(By.xpath("//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[2]//ul[1]//li[1]//a[1]"));
		first_product.click();
		
		
		//8. User is landed to product detail page
		
		//isDisplayed() method returns boolean value either True or False
		Boolean product_details = driver.findElement(By.xpath("//div[@class='view-product']//img[@alt='ecommerce website products']")).isDisplayed();
		//To print the value
		System.out.println("User Navigated to Products_details Page: "+product_details);
				
		
		
		//9. Verify that detail detail is visible: product name, category, price, availability, condition, brand
		
		//isDisplayed() method returns boolean value either True or False
		Boolean product_name = driver.findElement(By.xpath("//h2[normalize-space()='Blue Top']")).isDisplayed();
		//To print the value
		System.out.println("User getting Products_name: "+product_name);
		
		//isDisplayed() method returns boolean value either True or False
		Boolean category = driver.findElement(By.xpath("//p[normalize-space()='Category: Women > Tops']")).isDisplayed();
		//To print the value
		System.out.println("User getting category: "+category);
		
		//isDisplayed() method returns boolean value either True or False
		Boolean price = driver.findElement(By.xpath("//span[normalize-space()='Rs. 500']")).isDisplayed();
		//To print the value
		System.out.println("User getting price: "+price);
		
		//isDisplayed() method returns boolean value either True or False
		Boolean availability = driver.findElement(By.xpath("//b[normalize-space()='Availability:']")).isDisplayed();
		//To print the value
		System.out.println("User getting availability: "+availability);
		
		//isDisplayed() method returns boolean value either True or False
		Boolean condition = driver.findElement(By.xpath("//b[normalize-space()='Condition:']")).isDisplayed();
		//To print the value
		System.out.println("User getting Condition: "+condition);
		
		//isDisplayed() method returns boolean value either True or False
		Boolean brand = driver.findElement(By.xpath("//b[normalize-space()='Brand:']")).isDisplayed();
		//To print the value
		System.out.println("User getting Brand: "+brand);
		
	}
			
	public void Testcase9()
	{
		
		//1. Launch browser
		WebDriver driver = new ChromeDriver();
						
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
						
						
		//2. Navigate to url 'http://automationexercise.com'
						
		driver.navigate().to("https://automationexercise.com/");
		driver.manage().window().maximize();
						
		//3. Verify that home page is visible successfully
						
		//isDisplayed() method returns boolean value either True or False
		Boolean Display = driver.findElement(By.xpath("//img[@alt='Website for automation practice']")).isDisplayed();
		//To print the value
		System.out.println("Homepage displayed:"+Display);
				
		//4. Click on 'Products' button
				
		WebElement product = driver.findElement(By.xpath("//a[@href='/products']"));
		product.click();
				
		//5. Verify user is navigated to ALL PRODUCTS page successfully
				
		//isDisplayed() method returns boolean value either True or False
		Boolean product_page = driver.findElement(By.xpath("//h2[@class='title text-center']")).isDisplayed();
		//To print the value
		System.out.println("User Navigated to Products Page: "+product_page);
		
		//6. Enter product name in search input and click search button
		
		WebElement search_product = driver.findElement(By.xpath("//input[@id='search_product']"));
		search_product.sendKeys("Dress");
		
		WebElement search = driver.findElement(By.xpath("//button[@id='submit_search']"));
		search.click();
		
		//7. Verify 'SEARCHED PRODUCTS' is visible
		
		//isDisplayed() method returns boolean value either True or False
		Boolean SEARCHED_PRODUCTS = driver.findElement(By.xpath("//h2[@class='title text-center']")).isDisplayed();
		//To print the value
		System.out.println("User Navigated to Searched Product Page: "+SEARCHED_PRODUCTS);
				
		//8. Verify all the products related to search are visible
		
		//isDisplayed() method returns boolean value either True or False
		Boolean products_related = driver.findElement(By.xpath("//img[@id='sale_image']")).isDisplayed();
		//To print the value
		System.out.println("User Navigated to Product Related Page: "+products_related);
						
	}
	
	public void Testcase10()
	{
		
		//1. Launch browser
		WebDriver driver = new ChromeDriver();
						
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
						
						
		//2. Navigate to url 'http://automationexercise.com'
						
		driver.navigate().to("https://automationexercise.com/");
		driver.manage().window().maximize();
						
		//3. Verify that home page is visible successfully
						
		//isDisplayed() method returns boolean value either True or False
		Boolean Display = driver.findElement(By.xpath("//img[@alt='Website for automation practice']")).isDisplayed();
		//To print the value
		System.out.println("Homepage displayed:"+Display);
		
		//4. Scroll down to footer
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//Scroll down till the bottom of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

			
		//5. Verify text 'SUBSCRIPTION'
		
		//isDisplayed() method returns boolean value either True or False
		Boolean subscription = driver.findElement(By.xpath("//h2[normalize-space()='Subscription']")).isDisplayed();
		//To print the value
		System.out.println("Homepage displayed:"+subscription);
		
		
		//6. Enter email address in input and click arrow button
		
		WebElement email = driver.findElement(By.xpath("//input[@id='susbscribe_email']"));
		email.sendKeys("qaautomation27@gmail.com");
		
		driver.findElement(By.xpath("//i[@class='fa fa-arrow-circle-o-right']")).click();
		
		
		
		//7. Verify success message 'You have been successfully subscribed!' is visible
		
		//isDisplayed() method returns boolean value either True or False
		Boolean submessage = driver.findElement(By.xpath("//div[@class='alert-success alert']")).isDisplayed();
		//To print the value
		System.out.println("You have been successfully subscribed!:"+submessage);
		
	}
	
	public void Testcase11()
	{
		
		//1. Launch browser
		WebDriver driver = new ChromeDriver();
						
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
						
						
		//2. Navigate to url 'http://automationexercise.com'
						
		driver.navigate().to("https://automationexercise.com/");
		driver.manage().window().maximize();
						
		//3. Verify that home page is visible successfully
						
		//isDisplayed() method returns boolean value either True or False
		Boolean Display = driver.findElement(By.xpath("//img[@alt='Website for automation practice']")).isDisplayed();
		//To print the value
		System.out.println("Homepage displayed:"+Display);
		
		
		//4. Click 'Cart' button
		
		driver.findElement(By.xpath("//a[normalize-space()='Cart']")).click();
		
		
		//5. Scroll down to footer
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//Scroll down till the bottom of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		//6. Verify text 'SUBSCRIPTION'
		
		//isDisplayed() method returns boolean value either True or False
		Boolean subscription = driver.findElement(By.xpath("//h2[normalize-space()='Subscription']")).isDisplayed();
		//To print the value
		System.out.println("Homepage displayed:"+subscription);
				
				
		//7. Enter email address in input and click arrow button
				
		WebElement email = driver.findElement(By.xpath("//input[@id='susbscribe_email']"));
		email.sendKeys("qaautomation29@gmail.com");
				
		driver.findElement(By.xpath("//i[@class='fa fa-arrow-circle-o-right']")).click();
				
				
				
		//8. Verify success message 'You have been successfully subscribed!' is visible
				
    	//isDisplayed() method returns boolean value either True or False
		Boolean submessage = driver.findElement(By.xpath("//div[@class='alert-success alert']")).isDisplayed();
		//To print the value
		System.out.println("You have been successfully subscribed!:"+submessage);
				
	}
	
	public void Testcase12()
	{
		
		//1. Launch browser
		WebDriver driver = new ChromeDriver();
						
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
						
						
		//2. Navigate to burl 'http://automationexercise.com'
						
		driver.navigate().to("https://automationexercise.com/");
		driver.manage().window().maximize();
						
		//3. Verify that home page is visible successfully
						
		//isDisplayed() method returns boolean value either True or False
		Boolean Display = driver.findElement(By.xpath("//img[@alt='Website for automation practice']")).isDisplayed();
		//To print the value
		System.out.println("Homepage displayed:"+Display);
		
		//4. Click 'Product' button
				
		driver.findElement(By.xpath("//a[@href='/products']")).click();
		
		driver.navigate().refresh();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,700)");
				
	     //5. Hover over first product and click 'Add to cart'
				
		//WebElement product = driver.findElement(By.xpath("//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[1]//div[2]"));
	      WebElement product1 = driver.findElement(By.xpath("//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[1]//div[2]//div[1]//a[1]"));
						       
	  	//Actions actions = new Actions(driver);
	    
	   // product.click();
	     product1.click();
        
        //actions.moveToElement(product).moveToElement(product1).click().build().perform();
		
     
		
        //6. Click 'Continue Shopping' button
		
		driver.findElement(By.xpath("//button[@class='btn btn-success close-modal btn-block']")).click();
		
		
		 //7. Hover over second product and click 'Add to cart'
		
		driver.findElement(By.xpath("//div[3]//div[1]//div[1]//div[2]//div[1]//a[1]")).click();
		
		//8. Click 'View Cart' button
		
		driver.findElement(By.xpath("//u[normalize-space()='View Cart']")).click();
		
		//9. Verify both products are added to Cart
		
		//isDisplayed() method returns boolean value either True or False
		Boolean shopcart = driver.findElement(By.xpath("//li[@class='active']")).isDisplayed();
		//To print the value
		System.out.println("Both products are added to Cart:"+shopcart);
	
		//10. Verify their prices, quantity and total price
		
		//isDisplayed() method returns boolean value either True or False
		Boolean prices = driver.findElement(By.xpath("//td[@class='price']")).isDisplayed();
		//To print the value
		System.out.println("Shown Prices:"+prices);
				
		//isDisplayed() method returns boolean value either True or False
		Boolean quantity = driver.findElement(By.xpath("//td[@class='quantity']")).isDisplayed();
		//To print the value
		System.out.println("Shown Quantity:"+quantity);
				
		//isDisplayed() method returns boolean value either True or False
		Boolean total_price = driver.findElement(By.xpath("//td[@class='total']")).isDisplayed();
		//To print the value
		System.out.println("Shown Total Price:"+total_price);
		
		
	}
	
	public void Testcase13()
	{
		
		//1. Launch browser
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
					
		//2. Navigate to url 'http://automationexercise.com'
		driver.navigate().to("https://automationexercise.com/");
		driver.manage().window().maximize();
		
					
		//3. Verify that home page is visible successfully
		
		//isDisplayed() method returns boolean value either True or False
		Boolean Display = driver.findElement(By.xpath("//img[@alt='Website for automation practice']")).isDisplayed();
		//To print the value
		System.out.println("Homepage displayed:"+Display);
						
		
		//4. Click 'View Product' for any product on home page
		
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//div[3]//div[1]//div[2]//ul[1]//li[1]//a[1]")).click();
		
		//driver.navigate().refresh();
		
		//5. Verify product detail is opened
		
		//isDisplayed() method returns boolean value either True or False
		Boolean price = driver.findElement(By.xpath("//span[normalize-space()='Rs. 400']")).isDisplayed();
		//To print the value
		System.out.println("price is displayed:"+price);
		
		//isDisplayed() method returns boolean value either True or False
		Boolean availability = driver.findElement(By.xpath("//b[normalize-space()='Availability:']")).isDisplayed();
		//To print the value
		System.out.println("availabitity is displayed:"+availability);
		
		//isDisplayed() method returns boolean value either True or False
		Boolean condition = driver.findElement(By.xpath("//b[normalize-space()='Condition:']")).isDisplayed();
		//To print the value
		System.out.println("Condition is displayed:"+condition);
		
				
		//6. Increase quantity to 4
		
		driver.findElement(By.xpath("//input[@id='quantity']")).clear();
		
		driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys("4");
		
		//7. Click 'Add to cart' button
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		//8. Click 'View Cart' button
		
		driver.findElement(By.xpath("//u[normalize-space()='View Cart']")).click();
		
				
		//9. Verify that product is displayed in cart page with exact quantity
		
		//isDisplayed() method returns boolean value either True or False
		Boolean quantity = driver.findElement(By.xpath("//button[@class='disabled']")).isDisplayed();
		//To print the value
		System.out.println("Product quantity shown correct:"+quantity);
		
	}	
	
	public void Testcase14()
	{
		//1. Launch browser
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
		//2. Navigate to url 'http://automationexercise.com'
		driver.navigate().to("https://automationexercise.com/");
		driver.manage().window().maximize();
				
		//3. Verify that home page is visible successfully
		//isDisplayed() method returns boolean value either True or False
		Boolean Display = driver.findElement(By.xpath("//img[@alt='Website for automation practice']")).isDisplayed();
		//To print the value
		System.out.println("Homepage displayed:"+Display);
		
		//4. Add products to cart
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,1800)");
		
	    driver.findElement(By.xpath("//div[21]//div[1]//div[2]//ul[1]//li[1]//a[1]")).click();
	    
	    driver.navigate().refresh();
	    
	    driver.findElement(By.xpath("//button[@type='button']")).click();
	    
	      	    	
	   //5. Click 'Cart' button
	    
		driver.findElement(By.xpath("//u[normalize-space()='View Cart']")).click();
	    
	    driver.navigate().refresh();
	    
	  //6. Verify that cart page is displayed
	    
	  //isDisplayed() method returns boolean value either True or False
	  Boolean shoppingcart = driver.findElement(By.xpath("//li[@class='active']")).isDisplayed();
	  //To print the value
	  System.out.println("Homepage displayed:"+shoppingcart);
	    
	    
		//7. Click Proceed To Checkout
	   
	  driver.findElement(By.xpath("//a[@class='btn btn-default check_out']")).click();
	  
	  //8. Click 'Register / Login' button
	  
	  driver.findElement(By.xpath("//u[normalize-space()='Register / Login']")).click();
	  
	 //9. Fill all details in Sign_up and create account
	  
	        
	  	WebElement Name = driver.findElement(By.xpath("//input[@placeholder='Name']"));
		Name.sendKeys("QA Automation Engineer90");
		
		WebElement email_id = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
		email_id.sendKeys("qaautomation90@gmail.com");
		
		WebElement signup_btn = driver.findElement(By.xpath("//button[normalize-space()='Signup']"));
		signup_btn.click();
	  		
	  		
		
	  		WebElement title = driver.findElement(By.xpath("//label[@for='id_gender2']"));
			title.click();
			WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		    password.sendKeys("12345");
	        Select date = new Select (driver.findElement(By.id("days")));							
	        date.selectByVisibleText("17");
	        Select month = new Select (driver.findElement(By.id("months")));							
	        month.selectByIndex(1);
	        Select year = new Select (driver.findElement(By.id("years")));							
	        year.selectByVisibleText("1988");
	        	        
	        WebElement checkbox1 = driver.findElement(By.id("newsletter"));
	        checkbox1.click();
	        
	               
	        WebElement checkbox2 = driver.findElement(By.id("optin"));
	        checkbox2.click();
			 
	        driver.findElement(By.id("first_name")).sendKeys("QA Engineer");
	        
	        driver.findElement(By.id("last_name")).sendKeys("SDET");
	        
	        driver.findElement(By.id("company")).sendKeys("ExcelR Solutions");
	        
	        driver.findElement(By.id("address1")).sendKeys("Madhapur,Hyderabad, Telangana, 500090");
	        
	        driver.findElement(By.id("address2")).sendKeys("India");
	        
	        Select Country = new Select (driver.findElement(By.id("country")));							
	        Country.selectByVisibleText("India");
	        
	        driver.findElement(By.id("state")).sendKeys("Telangana");
	        
	        driver.findElement(By.id("city")).sendKeys("Hyderabad");
	        
	        driver.findElement(By.id("zipcode")).sendKeys("500090");
	        
	        driver.findElement(By.id("mobile_number")).sendKeys("9848012345");
	        
	    
	//10. Verify 'ACCOUNT CREATED!' and click 'Continue' button
      
  
      driver.findElement(By.xpath("//button[normalize-space()='Create Account']")).click();
      
      driver.navigate().refresh();          
								                
      driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		
	  
	  
      	//11. Verify ' Logged in as user_name' at top
		
	  //isDisplayed() method returns boolean value either True or False
	  Boolean username = driver.findElement(By.xpath("//li[10]//a[1]")).isDisplayed();
	  //To print the value
	  System.out.println("Logged username displayed:"+username);
	    
	  driver.navigate().refresh();
		
		//12.Click 'Cart' button
	  
	  driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")).click();
	  
		//13. Click 'Proceed To Checkout' button
	  
	  driver.findElement(By.xpath("//a[@class='btn btn-default check_out']")).click();
	  
		//14. Verify Address Details and Review Your Order
	  
	  //isDisplayed() method returns boolean value either True or False
	  Boolean  DELIVERY_ADDRESS = driver.findElement(By.xpath("//h3[normalize-space()='Your delivery address']")).isDisplayed();
	  //To print the value
	  System.out.println("Logged username displayed:"+DELIVERY_ADDRESS);
	  
	//isDisplayed() method returns boolean value either True or False
	  Boolean  BILLING_ADDRESS = driver.findElement(By.xpath("//h3[normalize-space()='Your billing address']")).isDisplayed();
	  //To print the value
	  System.out.println("Logged username displayed:"+BILLING_ADDRESS);
	  
	  js.executeScript("window.scrollBy(0,1200)");
	  
		//15. Enter description in comment text area and click 'Place Order'
	  
	  driver.navigate().refresh();
	  
	  driver.findElement(By.id("//textarea[@name='message']")).sendKeys("This is  comment about order, please write it more reviews");
	  
	  driver.findElement(By.xpath("//a[@class='btn btn-default check_out']")).click();
	  
	  
		//16. Enter payment details: Name on Card, Card Number, CVC, Expiration date
	   
	  driver.findElement(By.xpath("//input[@name='name_on_card']")).sendKeys("QA Engineer");
	  
	  driver.findElement(By.xpath("//input[@name='card_number']")).sendKeys("5412345667890123");
	  
	  driver.findElement(By.xpath("//input[@placeholder='ex. 311']")).sendKeys("123");
	  
	  driver.findElement(By.xpath("//input[@placeholder='MM']")).sendKeys("11");
	  
	  driver.findElement(By.xpath("//input[@placeholder='YYYY']")).sendKeys("2034");
	  
	    
		//17. Click 'Pay and Confirm Order' button
	  
	  driver.findElement(By.xpath("//button[@id='submit']")).click();
	  
		//18. Verify success message 'Your order has been placed successfully!'
	
	  //isDisplayed() method returns boolean value either True or False
	  Boolean  success_message = driver.findElement(By.xpath("//p[normalize-space()='Congratulations! Your order has been confirmed!']")).isDisplayed();
	  //To print the value
	  System.out.println("Successfull message displayed:"+success_message);
	  
	  	 //19. Click 'Delete Account' button
	  
	  	driver.findElement(By.xpath("//a[normalize-space()='Delete Account']")).click();
	  
		//20. Verify 'ACCOUNT DELETED!' and click 'Continue' button
	  	
	  		driver.findElement(By.xpath("//i[@class='fa fa-trash-o']")).click();
	          
	   		Boolean account_del = driver.findElement(By.xpath("//b[normalize-space()='Account Deleted!']")).isDisplayed();
	  		//To print the value
	  		System.out.println("Account Deleted:"+account_del);
	  		
	   		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
	  	
	  	
	}
	public void Testcase15()
	{
		//1. Launch browser
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
						
		//2. Navigate to url 'http://automationexercise.com'
			driver.navigate().to("https://automationexercise.com/");
			driver.manage().window().maximize();
						
		//3. Verify that home page is visible successfully
			//isDisplayed() method returns boolean value either True or False
			Boolean Display = driver.findElement(By.xpath("//img[@alt='Website for automation practice']")).isDisplayed();
			//To print the value
			System.out.println("Homepage displayed:"+Display);
		
		//4. Click 'Signup / Login' button
			
			WebElement Click_on = driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']"));
			Click_on.click();
						
		 //5. Fill all details in Sign_up and create account
			
			WebElement Name = driver.findElement(By.xpath("//input[@placeholder='Name']"));
			Name.sendKeys("QA Automation Engineer98");
			
			WebElement email_id = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
			email_id.sendKeys("qaautomation98@gmail.com");
			
			WebElement signup_btn = driver.findElement(By.xpath("//button[normalize-space()='Signup']"));
			signup_btn.click();
			
			
			WebElement title = driver.findElement(By.xpath("//label[@for='id_gender2']"));
			title.click();
			WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		    password.sendKeys("12345");
	        Select date = new Select (driver.findElement(By.id("days")));							
	        date.selectByVisibleText("17");
	        Select month = new Select (driver.findElement(By.id("months")));							
	        month.selectByIndex(1);
	        Select year = new Select (driver.findElement(By.id("years")));							
	        year.selectByVisibleText("1988");
	        	        
	        WebElement checkbox1 = driver.findElement(By.id("newsletter"));
	        checkbox1.click();
	        
	               
	        WebElement checkbox2 = driver.findElement(By.id("optin"));
	        checkbox2.click();
			 
	        driver.findElement(By.id("first_name")).sendKeys("QA Engineer");
	        
	        driver.findElement(By.id("last_name")).sendKeys("SDET");
	        
	        driver.findElement(By.id("company")).sendKeys("ExcelR Solutions");
	        
	        driver.findElement(By.id("address1")).sendKeys("Madhapur,Hyderabad, Telangana, 500090");
	        
	        driver.findElement(By.id("address2")).sendKeys("India");
	        
	        Select Country = new Select (driver.findElement(By.id("country")));							
	        Country.selectByVisibleText("India");
	        
	        driver.findElement(By.id("state")).sendKeys("Telangana");
	        
	        driver.findElement(By.id("city")).sendKeys("Hyderabad");
	        
	        driver.findElement(By.id("zipcode")).sendKeys("500090");
	        
	        driver.findElement(By.id("mobile_number")).sendKeys("9848012345");
	        
			
		//6. Verify 'ACCOUNT CREATED!' and click 'Continue' button
	        
	        driver.findElement(By.xpath("//button[normalize-space()='Create Account']")).click();
	        
	        driver.navigate().refresh();          
	  								                
	        driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
	        
	        
		//7. Verify ' Logged in as user_name' at top
	        
	      //isDisplayed() method returns boolean value either True or False
	  	  Boolean username = driver.findElement(By.xpath("//li[10]//a[1]")).isDisplayed();
	  	  //To print the value
	  	  System.out.println("Logged username displayed:"+username); 
	        
	        
		//8. Add products to cart
	  	  
	  	driver.findElement(By.xpath("//a[@href='/products']")).click();
		
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//div[3]//div[1]//div[2]//ul[1]//li[1]//a[1]")).click();
		
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
	  	  
		//9. Click 'Cart' button
	  	
		driver.findElement(By.xpath("//u[normalize-space()='View Cart']")).click();
		
		//10. Verify that cart page is displayed
		
		//isDisplayed() method returns boolean value either True or False
		Boolean cart_page = driver.findElement(By.xpath("//li[@class='active']")).isDisplayed();
		//To print the value
		System.out.println("Cart_page displayed:"+cart_page);
	  	  
		//11. Click Proceed To Checkout
		
		driver.findElement(By.xpath("//a[@class='btn btn-default check_out']")).click();
	  	  
		//12. Verify Address Details and Review Your Order
		
		//isDisplayed() method returns boolean value either True or False
		  Boolean  DELIVERY_ADDRESS = driver.findElement(By.xpath("//h3[normalize-space()='Your delivery address']")).isDisplayed();
		  //To print the value
		  System.out.println("Logged username displayed:"+DELIVERY_ADDRESS);
		  
		//isDisplayed() method returns boolean value either True or False
		  Boolean  BILLING_ADDRESS = driver.findElement(By.xpath("//h3[normalize-space()='Your billing address']")).isDisplayed();
		  //To print the value
		  System.out.println("Logged username displayed:"+BILLING_ADDRESS);
		  
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,1200)");
		
	  	  
		//13. Enter description in comment text area and click 'Place Order'
		  
		  driver.navigate().refresh();
		  
		  driver.findElement(By.id("//textarea[@name='message']")).sendKeys("This is  comment about order, please write it more reviews");
		  
		  driver.findElement(By.xpath("//a[@class='btn btn-default check_out']")).click();
	  	  
		//14. Enter payment details: Name on Card, Card Number, CVC, Expiration date
		  
		  driver.findElement(By.xpath("//input[@name='name_on_card']")).sendKeys("QA Engineer");
		  
		  driver.findElement(By.xpath("//input[@name='card_number']")).sendKeys("5412345667890123");
		  
		  driver.findElement(By.xpath("//input[@placeholder='ex. 311']")).sendKeys("123");
		  
		  driver.findElement(By.xpath("//input[@placeholder='MM']")).sendKeys("11");
		  
		  driver.findElement(By.xpath("//input[@placeholder='YYYY']")).sendKeys("2034");
	  	  
		//15. Click 'Pay and Confirm Order' button
		  
		  driver.findElement(By.xpath("//button[@id='submit']")).click();
	  	  
		//16. Verify success message 'Your order has been placed successfully!'
		  
		//isDisplayed() method returns boolean value either True or False
		  Boolean  success_message = driver.findElement(By.xpath("//p[normalize-space()='Congratulations! Your order has been confirmed!']")).isDisplayed();
		  //To print the value
		  System.out.println("Successfull message displayed:"+success_message);
		  		   
		//17. Click 'Delete Account' button
		  
		  driver.findElement(By.xpath("//i[@class='fa fa-trash-o']")).click();
	  	  
		//18. Verify 'ACCOUNT DELETED!' and click 'Continue' button 
		  
		 Boolean account_del = driver.findElement(By.xpath("//b[normalize-space()='Account Deleted!']")).isDisplayed();
	  	//To print the value
	  	System.out.println("Account Deleted:"+account_del);
		  
		  
	}
	public void Testcase16()
	{
		//1. Launch browser
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
					
	   //2. Navigate to url 'http://automationexercise.com'
		driver.navigate().to("https://automationexercise.com/");
		driver.manage().window().maximize();
					
	   //3. Verify that home page is visible successfully
		//isDisplayed() method returns boolean value either True or False
		Boolean Display = driver.findElement(By.xpath("//img[@alt='Website for automation practice']")).isDisplayed();
		//To print the value
		System.out.println("Homepage displayed:"+Display);
		
		//4. Click 'Signup / Login' button
		WebElement Click_on = driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']"));
		Click_on.click();
		
		//5. Fill email, password and click 'Login' button
		
		
		
		
		//6. Verify 'Logged in as username' at top
		//7. Add products to cart
		//8. Click 'Cart' button
		//9. Verify that cart page is displayed
		//10. Click Proceed To Checkout
		//11. Verify Address Details and Review Your Order
		//12. Enter description in comment text area and click 'Place Order'
		//13. Enter payment details: Name on Card, Card Number, CVC, Expiration date
		//14. Click 'Pay and Confirm Order' button
		//15. Verify success message 'Your order has been placed successfully!'
		//16. Click 'Delete Account' button
		//17. Verify 'ACCOUNT DELETED!' and click 'Continue' button
		
	}
	public void Testcase17()
	{
		
	//1. Launch browser
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
					
	//2. Navigate to url 'http://automationexercise.com'
		driver.navigate().to("https://automationexercise.com/");
		driver.manage().window().maximize();
					
	//3. Verify that home page is visible successfully
		//isDisplayed() method returns boolean value either True or False
		Boolean Display = driver.findElement(By.xpath("//img[@alt='Website for automation practice']")).isDisplayed();
		//To print the value
		System.out.println("Homepage displayed:"+Display);
		//4. Add products to cart
		
		driver.findElement(By.xpath("//a[@href='/products']")).click();
		
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//div[3]//div[1]//div[2]//ul[1]//li[1]//a[1]")).click();
		
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		
		//5. Click 'Cart' button
		
		driver.findElement(By.xpath("//u[normalize-space()='View Cart']")).click();
		
		
		//6. Verify that cart page is displayed
		
		//isDisplayed() method returns boolean value either True or False
		Boolean cart_page = driver.findElement(By.xpath("//li[@class='active']")).isDisplayed();
		//To print the value
		System.out.println("Cart_page displayed:"+cart_page);
		
			
		//7. Click 'X' button corresponding to particular product
		
		driver.findElement(By.xpath("//i[@class='fa fa-times']")).click();
		
		//8. Verify that product is removed from the cart
		
		//isDisplayed() method returns boolean value either True or False
		Boolean remove_item = driver.findElement(By.xpath("//b[normalize-space()='Cart is empty!']")).isDisplayed();
		//To print the value
		System.out.println("Cart_page displayed:"+remove_item);
		
	}
	public void Testcase18()
	{
		//1. Launch browser
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
							
		//2. Navigate to url 'http://automationexercise.com'
		driver.navigate().to("https://automationexercise.com/");
		driver.manage().window().maximize();
							
		//3. Verify that categories are visible on left side bar
		
		//isDisplayed() method returns boolean value either True or False
		Boolean categories = driver.findElement(By.xpath("//h2[normalize-space()='Category']")).isDisplayed();
		//To print the value
		System.out.println("Categories are displayed:"+categories);
				
		//4. Click on 'Women' category
		
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//a[normalize-space()='Women']//i[@class='fa fa-plus']")).click();
		
		//5. Click on any category link under 'Women' category, for example: Dress
		
		driver.findElement(By.xpath("//div[@id='Women']//a[contains(text(),'Dress')]")).click();
		
		driver.navigate().refresh();
				
		//6. Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'
		
		Boolean category_page = driver.findElement(By.xpath("//h2[@class='title text-center']")).isDisplayed();
		
		System.out.println("Women dresses are displayed:"+category_page);
		
		
		//7. On left side bar, click on any sub-category link of 'Men' category
		
		driver.findElement(By.xpath("//a[normalize-space()='Men']//i[@class='fa fa-plus']")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='Jeans']")).click();
		
		//8. Verify that user is navigated to that category page
		
        Boolean mcategory_page = driver.findElement(By.xpath("//h2[@class='title text-center']")).isDisplayed();
		
		System.out.println("men dresses are displayed:"+mcategory_page);
		
		
	}
	public void Testcase19()
	{
		//1. Launch browser
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//2. Navigate to url 'http://automationexercise.com'
		driver.navigate().to("https://automationexercise.com/");
		driver.manage().window().maximize();
		
		//3. Click on 'Products' button
		
		driver.findElement(By.xpath("//a[@href='/products']")).click();
				
		//4. Verify that Brands are visible on left side bar
			
		Boolean brands = driver.findElement(By.xpath("//h2[normalize-space()='Brands']")).isDisplayed();
		
		System.out.println("Brands are displayed:"+brands);
		
		//5. Click on any brand name
		
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//a[@href='/brand_products/Babyhug']")).click();
		
		//6. Verify that user is navigated to brand page and brand products are displayed
		
        Boolean brands_page = driver.findElement(By.xpath("//h2[@class='title text-center']")).isDisplayed();
		
		System.out.println("Brands_Page is displayed:"+brands_page);
		
		
		//7. On left side bar, click on any other brand link
		
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//a[@href='/brand_products/Biba']")).click();
		
		
		//8. Verify that user is navigated to that brand page and can see products
		
        Boolean obrands_page = driver.findElement(By.xpath("//h2[@class='title text-center']")).isDisplayed();
		
		System.out.println("Brands_Page is displayed:"+obrands_page);
		
	}
	public void Testcase20()
	{
		//1. Launch browser
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//2. Navigate to url 'http://automationexercise.com'
		driver.navigate().to("https://automationexercise.com/");
		driver.manage().window().maximize();
		//3. Click on 'Products' button
		//4. Verify user is navigated to ALL PRODUCTS page successfully
		//5. Enter product name in search input and click search button
		//6. Verify 'SEARCHED PRODUCTS' is visible
		//7. Verify all the products related to search are visible
		//8. Add those products to cart
		//9. Click 'Cart' button and verify that products are visible in cart
		//10. Click 'Signup / Login' button and submit login details
		//11. Again, go to Cart page
		//12. Verify that those products are visible in cart after login as well
	}
	public void Testcase21()
	{
		//1. Launch browser
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//2. Navigate to url 'http://automationexercise.com'
		driver.navigate().to("https://automationexercise.com/");
		driver.manage().window().maximize();
		//3. Click on 'Products' button
		driver.findElement(By.xpath("//a[@href='/products']")).click();
		//4. Verify user is navigated to ALL PRODUCTS page successfully
        Boolean all_page = driver.findElement(By.xpath("//h2[@class='title text-center']")).isDisplayed();
		System.out.println("All Products are displayed:"+all_page);
		
		//5. Click on 'View Product' button
		
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[2]//ul[1]//li[1]//a[1]")).click();
		
		//6. Verify 'Write Your Review' is visible
		Boolean review_page = driver.findElement(By.xpath("//textarea[@id='review']")).isDisplayed();
		System.out.println("review page displayed:"+review_page);
		
		
		//7. Enter name, email and review
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("qateam");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("qateam@gmail.com");
		
		driver.findElement(By.xpath("//textarea[@id='review']")).sendKeys("Quality and Colour is good");
		
		
		//8. Click 'Submit' button
		
		driver.findElement(By.xpath("//button[@id='button-review']")).click();
		
		//9. Verify success message 'Thank you for your review.'
		
		Boolean review_thanks = driver.findElement(By.xpath("//span[normalize-space()='Thank you for your review.']")).isDisplayed();
		System.out.println("review page displayed:"+review_thanks);
		
	}
	public void Testcase22()
	{
		//1. Launch browser
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				//2. Navigate to url 'http://automationexercise.com'
				driver.navigate().to("https://automationexercise.com/");
				driver.manage().window().maximize();

		//3. Scroll to bottom of page
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
				
		//4. Verify 'RECOMMENDED ITEMS' are visible
				Boolean r_items = driver.findElement(By.xpath("//h2[normalize-space()='recommended items']")).isDisplayed();
				System.out.println("recommanded items displayed:"+r_items);	
							
		//5. Click on 'Add To Cart' on Recommended product
				
			driver.findElement(By.xpath("//div[@class='item active']//div[3]//div[1]//div[1]//div[1]//a[1]")).click();	
				
		//6. Click on 'View Cart' button
				
			driver.findElement(By.xpath("//u[normalize-space()='View Cart']")).click();
			
		//7. Verify that product is displayed in cart page
			Boolean rc_product = driver.findElement(By.xpath("//li[@class='active']")).isDisplayed();
			System.out.println("recommanded items displayed:"+rc_product);	
			
	}
	public void Testcase23()
	{
		//1. Launch browser
		//2. Navigate to url 'http://automationexercise.com'
		//3. Verify that home page is visible successfully
		//4. Click 'Signup / Login' button
		//5. Fill all details in Signup and create account
		//6. Verify 'ACCOUNT CREATED!' and click 'Continue' button
		//7. Verify ' Logged in as username' at top
		//8. Add products to cart
		//9. Click 'Cart' button
		//10. Verify that cart page is displayed
		//11. Click Proceed To Checkout
		//12. Verify that the delivery address is same address filled at the time registration of account
		//13. Verify that the billing address is same address filled at the time registration of account
		//14. Click 'Delete Account' button
		//15. Verify 'ACCOUNT DELETED!' and click 'Continue' button
	}
	public void Testcase24()
	{
		//1. Launch browser
		//2. Navigate to url 'http://automationexercise.com'
		//3. Verify that home page is visible successfully
		//4. Add products to cart
		//5. Click 'Cart' button
		//6. Verify that cart page is displayed
		//7. Click Proceed To Checkout
		//8. Click 'Register / Login' button
		//9. Fill all details in Signup and create account
		//10. Verify 'ACCOUNT CREATED!' and click 'Continue' button
		//11. Verify ' Logged in as username' at top
		//12.Click 'Cart' button
		//13. Click 'Proceed To Checkout' button
		//14. Verify Address Details and Review Your Order
		//15. Enter description in comment text area and click 'Place Order'
		//16. Enter payment details: Name on Card, Card Number, CVC, Expiration date
		//17. Click 'Pay and Confirm Order' button
		//18. Verify success message 'Your order has been placed successfully!'
		//19. Click 'Download Invoice' button and verify invoice is downloaded successfully.
		//20. Click 'Continue' button
		//21. Click 'Delete Account' button
		//22. Verify 'ACCOUNT DELETED!' and click 'Continue' button
	}
	public void Testcase25()
	{
		//1. Launch browser
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//2. Navigate to url 'http://automationexercise.com'
		driver.navigate().to("https://automationexercise.com/");
		driver.manage().window().maximize();
		
		//3. Verify that home page is visible successfully
		
		//isDisplayed() method returns boolean value either True or False
		Boolean Display = driver.findElement(By.xpath("//img[@alt='Website for automation practice']")).isDisplayed();
		//To print the value
		System.out.println("Homepage displayed:"+Display);
		
		//4. Scroll down page to bottom
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
				
		//5. Verify 'SUBSCRIPTION' is visible
		
		//isDisplayed() method returns boolean value either True or False
		Boolean Subscription = driver.findElement(By.xpath("//h2[normalize-space()='Subscription']")).isDisplayed();
		//To print the value
		System.out.println("Subscription displayed:"+Subscription);
		
		
		//6. Click on arrow at bottom right side to move upward
		
		driver.findElement(By.xpath("//i[@class='fa fa-angle-up']")).click();
		
		//7. Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen
		
		//isDisplayed() method returns boolean value either True or False
		Boolean Text = driver.findElement(By.xpath("//div[@class='item active']//h2[contains(text(),'Full-Fledged practice website for Automation Engin')]")).isDisplayed();
		//To print the value
		System.out.println("Text displayed:"+Text);
		
		
	}
	public void Testcase26()
	{
		//1. Launch browser
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				//2. Navigate to url 'http://automationexercise.com'
				driver.navigate().to("https://automationexercise.com/");
				driver.manage().window().maximize();
				
				//3. Verify that home page is visible successfully
				
				//isDisplayed() method returns boolean value either True or False
				Boolean Display = driver.findElement(By.xpath("//img[@alt='Website for automation practice']")).isDisplayed();
				//To print the value
				System.out.println("Homepage displayed:"+Display);
				
				//4. Scroll down page to bottom
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
						
				//5. Verify 'SUBSCRIPTION' is visible
				
				//isDisplayed() method returns boolean value either True or False
				Boolean Subscription = driver.findElement(By.xpath("//h2[normalize-space()='Subscription']")).isDisplayed();
				//To print the value
				System.out.println("Subscription displayed:"+Subscription);
				
				
				 //6. Scroll up page to Top
				
				//JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,-9000)");
				
				
				//7. Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen
				
				//isDisplayed() method returns boolean value either True or False
				Boolean Text = driver.findElement(By.xpath("//div[@class='item active']//h2[contains(text(),'Full-Fledged practice website for Automation Engin')]")).isDisplayed();
				//To print the value
				System.out.println("Text displayed:"+Text); 
				
	}
}	
        

