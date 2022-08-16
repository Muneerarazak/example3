package Demopractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest 
{

	@Test
	
	public void demotest() throws Throwable
	{
	   WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  		  
	
  FileInputStream fis=new FileInputStream("./data/common.properties"); 
	Properties  p=new Properties();
	 p.load(fis);
	 System.out.println("LOGIN TO Application");
	 String Url=p.getProperty("url");
	 //String username=p.getProperty("un");
	 //String password=p.getProperty("pwd");
	 
	 driver.get(Url);
		
	System.out.println(Url);
	System.out.println("welcome to jenkins");
	System.out.println("Good Evening");
	System.out.println("Welcome");
	
	
	
	}

	
	
}
