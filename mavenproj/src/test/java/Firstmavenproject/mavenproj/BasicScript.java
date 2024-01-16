package Firstmavenproject.mavenproj;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicScript {

		public void browserhandle() throws InterruptedException
		{
			ChromeDriver refe=new ChromeDriver();
			refe.get("https://www.facebook.com");
			Options op=refe.manage();
			Window w=op.window();
			w.maximize();
			//WebElement username =refe.findElement(By.cssSelector("input#email"));
			//username.sendKeys("Deepak"); //Perform the action
			WebElement createAccount =refe.findElement(By.linkText("Create new account"));
			createAccount.click();
		    Thread.sleep(3000);
		    WebElement firstname=refe .findElement(By.name("firstname"));
		   // System.out.println("Please Enter The Name ");
		   // Scanner s=new Scanner(System.in);
		   // String firstnamee=s.next();
		    firstname.sendKeys("Deepak Yadav");
		    WebElement day=refe.findElement(By.name("birthday_day"));
		    Select t =new Select(day);
		    t.selectByVisibleText("8");
		    WebElement month=refe.findElement(By.name("birthday_month"));
		    Select m=new Select(month);
		    m.selectByValue("8");
		   WebElement year=refe.findElement(By.name("birthday_year"));
		   Select y=new Select(year);
		   y.selectByValue("1995");
		    
		    
		    
		    
		    
		}
	public static void main(String[] args) throws InterruptedException
	{
	BasicScript basic=new BasicScript();
	basic.browserhandle();
	}
	}
