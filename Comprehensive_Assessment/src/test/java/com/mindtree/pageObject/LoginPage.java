package com.mindtree.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
 WebDriver ldriver;
 
 public LoginPage(WebDriver rdriver)
 {
	 ldriver=rdriver;
	 PageFactory.initElements(rdriver,this);
	 
	 
 }

	@FindBy(xpath="//span[@class='header-icon-link user-profile-icon']")
	WebElement loginicon;
	
	
	@FindBy(xpath="//a[contains(text(),'Log In')]")
	WebElement loginbutton;
	
	@FindBy(xpath="//div[@id='password-credentials']//input[@id='spree_user_email']")
	WebElement Usrname;
	@FindBy(xpath="//*[@id=\"logout\"]")
	WebElement lgout;
	@FindBy(xpath="//*[@id=\"header\"]/div[1]/div/section[3]/ul/li[2]/span/ul/li[1]/a")
	WebElement profile;
	
	@FindBy(xpath="//div[@class='password']//input[@class='required input_authentication']")
	WebElement pwd;
	@FindBy(xpath="//input[@id='ul_site_login']")
	WebElement loginbtn;
	@FindBy(xpath="//*[@id=\"spree_user_email\"]")
	WebElement texticon;
	
	@FindBy(xpath="	//*[@id=\"edit\"]")
	WebElement editbtn;
	@FindBy(xpath="	//*[@id=\"user_mobile\"]")
	WebElement updt;
	
	@FindBy(xpath="//*[@id=\"account-edit_form\"]/div/input")
	WebElement updtbtn;

	public void setLoginIcon()
	{
		 loginicon.click();	
		//x1.click();
	}
	public void setUsername(String uname)
	{
		Usrname.sendKeys("suhasinidu123@gmail.com");
	}

	public void setPassword(String pwd1)
	{
		 pwd.sendKeys("Sushmitha@123");
	}

	public void setloginbutton()
	{
		loginbutton.click();
	}
	
	public void setclickbutton()
	{
		loginbtn.click();
	}
	public void texticon()
	{
		texticon.click();
	}
	public void setprofile()
	{
		profile.click();
	}
	public void seteditbtn()
	{
		editbtn.click();
	}
	public void set_mobile_update()
	{
		updt.sendKeys("9591354697");
	}
	public void set_update_btn()
	{
		updtbtn.click();
	}
	
	
}

