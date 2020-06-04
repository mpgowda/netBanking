package testCase;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pom.AddCustomerPage;
import pom.LoginPage;


public class TC_AddCustomerTest_003 extends BaseTest
{

	@Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Passsword is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		AddCustomerPage addcust=new AddCustomerPage(driver);
		
		addcust.clickAddNewCustomer();
		
		logger.info("providing customer details....");
		
		
		addcust.custName("HakkaBukka");
		addcust.custgender("male");
		addcust.custdob("10","08","1985");
		Thread.sleep(5000);
		addcust.custaddress("INDIA");
		addcust.custcity("Bengaluru");
		addcust.custstate("Karnataka");
		addcust.custpinno("571401");
		addcust.custtelephoneno("987890091");
		
		String email=randomString(8)+"@gmail.com";
		addcust.custemailid(email);
		addcust.custpassword("abcdef");
		addcust.custsubmit();
		
		Thread.sleep(3000);
		
		logger.info("validation started....");
		
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("test case passed....");
			
		}
		else
		{
			logger.info("test case failed....");
			captureScreen(driver,"addNewCustomer4");
			Assert.assertTrue(false);
		}
			
	}
	
	
}
