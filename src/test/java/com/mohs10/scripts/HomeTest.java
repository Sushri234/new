package com.mohs10.scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mohs10.base.StartBrowser;
import com.mohs10.reuse.CommonFuns;

	public class HomeTest extends StartBrowser{
	
		@Test
		  public void LoginPageTestCase() throws Exception {
		CommonFuns hm2 = new CommonFuns();
			  hm2.logIn(" recruiter_one", "r1@123");
			  
			 //VALIDATE THE LOGIN PAGE
			/*  String actualUrl="https://ohrm.softwaretestingboard.com/symfony/web/index.php/auth/login";
			  String expectedUrl=driver.getCurrentUrl();
			  Assert.assertEquals(expectedUrl, actualUrl); */
			  
			  Thread.sleep(5000);
		  }
	}
		
