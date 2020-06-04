package testCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pom.LoginPage;

public class TC_LoginTest_001 extends BaseTest
{

	@Test
	public void loginTest() throws IOException, InterruptedException 
	{
			
		logger.info("URL is opened");
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered username");
		
		lp.setPassword(password);
		logger.info("Entered password");
	
		lp.clickSubmit();
		
		Thread.sleep(4000);
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			System.out.println(driver.getTitle());
			logger.info("Login test passed-1");
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			logger.info("Login test failed");
			logger.info("Screenshot open");
			captureScreen(driver,"loginTest7");
			Assert.assertTrue(false);
		}
}
}