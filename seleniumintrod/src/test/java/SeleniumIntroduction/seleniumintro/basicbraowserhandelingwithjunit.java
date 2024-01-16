package SeleniumIntroduction.seleniumintro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class basicbraowserhandelingwithjunit 
{
public void signuppage () throws InterruptedException
{
     ChromeDriver refvar=new ChromeDriver();
             refvar.get("https://www.facebook.com");
             Options op=refvar.manage();
 			Window w=op.window();
 			w.maximize();
 			WebElement creataccount=refvar.findElement(By.linkText("Create new account"));
 			creataccount.click();
 			Thread.sleep(3000);
 			WebElement Firstname=refvar.findElement(By.name("firstname"));
 			Firstname.sendKeys("Deepak");
 			WebElement Surname=refvar.findElement(By.name("lastname"));
 			Surname.sendKeys("Yadav");
 			WebElement emailid=refvar.findElement(By.name("reg_email__"));
 			emailid.sendKeys("7007015962");
 			//WebElement confirmemail=refvar.findElement(By.name("reg_email_confirmation"));
 			//confirmemail.sendKeys("dky31792@gmail");
 			WebElement passw=refvar.findElement(By.name("reg_passwd__"));
 			passw.sendKeys("Deepoo@31792");
 			 WebElement day=refvar.findElement(By.name("birthday_day"));
 		    Select t =new Select(day);
 		    t.selectByVisibleText("8");
 		    WebElement month=refvar.findElement(By.name("birthday_month"));
 		    Select m=new Select(month);
 		    m.selectByValue("8");
 		   WebElement year=refvar.findElement(By.name("birthday_year"));
 		   Select y=new Select(year);
 		   y.selectByValue("1995");
 		 //  WebElement gender=refvar.findElement(By.);
 		//   gender.click();
 		 //  WebElement signup=refvar.findElement(By.name("websubmit"));
 		 // signup.clear();
 		  
 		   
 		    	
}
	public static void main(String[] args) throws InterruptedException
	{
		basicbraowserhandelingwithjunit abc= new basicbraowserhandelingwithjunit();
		abc.signuppage();
	}

}
