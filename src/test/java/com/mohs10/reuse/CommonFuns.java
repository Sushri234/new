package com.mohs10.reuse;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.interactions.Actions;

import com.mohs10.base.StartBrowser;
import com.mohs10.ActionDriver.Action;
import com.mohs10.or.HomePage;

	public class CommonFuns {
		
		public Action aDriver;
		public WebDriver driver;
		
		public CommonFuns()
		{
			aDriver = new Action();
			driver = StartBrowser.driver;
		}
		
						
		public void logIn(String username, String pwd) throws Exception
		  { StartBrowser.childTest =
		  StartBrowser.parentTest.createNode("Login to ohrm shop");
				aDriver.navigateToApplication("https://ohrm.softwaretestingboard.com/symfony/web/index.php/auth/login");
				  
				  aDriver.type(HomePage.username,username , "username text box");
				  aDriver.type(HomePage.pwd,  pwd, "password text box");
				  aDriver.click(HomePage.btnlogin, "Login button");
				  
		  }
				 
				 
						 		  
	}
				
				