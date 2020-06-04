package testCase;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class horse 
{
	
	public String randomString(int n)
	{
		String randomString_1 = RandomStringUtils.randomAlphabetic(n);
		return randomString_1;	
	}
	
	public String randomNum(int n)
	{
		String num = RandomStringUtils.randomNumeric(n);
		return num;
		
	}
	
	public static void main(String[] args)
/*	@Test
	public void monkey()
{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		System.out.println("hai");	
}*/
	
	{
		horse h = new horse();
		
		for(int i = 0; i<10; i++)
		{
			System.out.println(h.randomString(8) + "@gmail.com");	
		}
		
		for(int i = 0; i<10; i++)
		{
			System.out.println("96" + h.randomNum(8));	
		}
		
		
	}
	
}
