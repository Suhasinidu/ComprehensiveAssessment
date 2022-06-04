package com.mindtree.testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.mindtree.pageObject.Aboutus;
import com.mindtree.pageObject.Bedroom;
import com.mindtree.pageObject.DinningPage;
import com.mindtree.pageObject.FabricSofaPage;
import com.mindtree.pageObject.LoginPage;
import com.mindtree.pageObject.SearchPage;
import com.mindtree.pageObject.StudyPage;
import com.mindtree.pageObject.TopDeals;
import com.mindtree.pageObject.WishPage;
import com.mindtree.pageObject.orderPage;
import com.mindtree.utilities.HelperClass;

public class TestCases extends BaseClass {
    @Test(priority =  1)
	public void loginTest() throws InterruptedException
	{

		Test=report.createTest("Login Page ");
	LoginPage lp=new LoginPage(driver);
	Test.info("Navigating to Profile Page");
	lp.setLoginIcon();
	Thread.sleep(3000);
	lp.setprofile();
	Test.info("click on  Profile Icon");
	Thread.sleep(3000);
	lp.seteditbtn();
	Test.info("click on Edit Button ");
	Thread.sleep(3000);
	lp.set_mobile_update();;
	Test.info("Updating Mobile Number in profile Page");
	Thread.sleep(3000);
	HelperClass.captureScreenshots(driver);
	Test.info("Taken  a Screenshot ");
	lp.set_update_btn();
	Test.info("click on Update Button");
	Test.info("Successfully Completed");
	log.info("Successfully Login ");
	Test.log(Status.PASS, "Testcase-1  successfully Excuted");
	Thread.sleep(3000);
	driver.get(baseURL);
	report.flush();

	}
    
    @Test(priority =  2)
    public void StudyTest() throws InterruptedException
	{
		
		
		Test=report.createTest("Study Chair Page ");
		log.info("Test Case 2  Excuted Started ");
		Test.info("Test Case 2  Excuted Started");
		Thread.sleep(3000);
		StudyPage sp=new StudyPage(driver);
     sp.setstdydropdown();
	Test.info("Navigating to Study Drop down");
	Thread.sleep(3000);
    sp.setstudychair();
    Test.info("Selecting Study Chair");
    HelperClass.captureScreenshots(driver);
    Test.info("Taken a Screenshot ");
    log.info("Successfully navigated to Study Chair");
    Test.log(Status.PASS, "Successfully navigated to Study Chair");
    
    Test.log(Status.PASS, "Testcase-2  successfully Excuted");
	Thread.sleep(3000);
	log.info("Successfully excuted Test Cases 2 ");
	Test.info("Successfully excuted Test Cases 2 ");
	driver.get(baseURL);
	report.flush();
	
	
}
    
    @Test(priority =  3)
    public void SofaTest() throws InterruptedException
	{
		
		Test=report.createTest("Fabric Sofa Set ");
	
		FabricSofaPage fsp=new FabricSofaPage(driver);
		log.info("Test Case 3  Excuted Started ");
		Test.info("Test Case 3 Excuted Started");
		fsp.saledropdown();
		Test.info("Selecting Sofa Set from drop down ");
		Thread.sleep(3000);
		fsp.sofaheader();
		log.info("Successfully Navigating to Sofa Set" );
		Test.info("Successfully Navigating to Sofa Set" );
		log.info("Successfully excuted Test Cases 3 ");
		Test.log(Status.PASS, "Sucessfully navigated to sofe Set ");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1000)");
       HelperClass.captureScreenshots(driver);
	System.out.println(driver.getWindowHandles());
	Test.log(Status.PASS, "Testcase-3  successfully Excuted");
	driver.navigate().back();
	driver.get(baseURL);
	report.flush();

		
	}
    @Test(priority =  4)
    public void AbouTest() throws InterruptedException
	{
	
		Test=report.createTest("About Us ");
		log.info("Test Case 4  Excuted Started ");
		Test.info("Test Case 4  Excuted Started ");
		Thread.sleep(3000);
		 Aboutus abs=new  Aboutus(driver);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 //js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		  js.executeScript("window.scrollBy(0,1000)");
		 abs.setaboutus();
		 Test.log(Status.PASS, "Succesfully Navigated to Aboutus ");
		 HelperClass.captureScreenshots(driver);
		Thread.sleep(4000);
		log.info("Successfully excuted Test Cases 4");
		Test.log(Status.PASS, "Testcase-4  successfully Excuted");
		driver.get(baseURL);
		report.flush();
	
	}
    
    @Test(priority =  5)
public void BedTest() throws InterruptedException
	
	{
		
		Test=report.createTest("King Beds");
		log.info("Test Case 5 excution Started");
		Test.info("Test Case 5 excution Started");
		Bedroom bd=new Bedroom(driver);
		bd.beddrp();
        Thread.sleep(3000);
		bd.kingbed();
		log.info("Successfully Navigated to KingBeds");
		Test.info("Successfully Navigated to KingBeds");
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1000)");
		 HelperClass.captureScreenshots(driver);
		 log.info("Taken a screenshot");
		 Thread.sleep(4000);
		 driver.navigate().back();
		 log.info("Successfully Excuted Test Case 5 ");
		 log.info("Successfully Excuted Test Case 5");
		 Test.log(Status.PASS, "Testcase-5  successfully Excuted");
		 driver.get(baseURL);
		 report.flush();
		
	
	}
    
    @Test(priority =  6)
    public void TopdealTest() throws InterruptedException
	{

		
		Test=report.createTest("Top Deals Page");
		 log.info("Test Case 6  Excuted Started ");
		 Test.info("Test Case 6  Excuted Started ");
     TopDeals tp=new TopDeals(driver);
     tp.setTopdeal();
     Thread.sleep(3000);
     tp.setsTvunit();
     HelperClass.captureScreenshots(driver);
     Test.info("Taken a Screenshot ");
     Thread.sleep(5000);
     Test.info("Successfully excuted Test Cases 6 ");
     log.info("Successfully excuted Test Cases 6 ");
     Test.log(Status.PASS, "Testcase-6  successfully Excuted");
 	JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,1000)");
     System.out.println(driver.getWindowHandles());
     HelperClass.captureScreenshots(driver);
    driver.navigate().back();
    driver.get(baseURL);
     report.flush();
   
}
    
    @Test(priority =  7)
    public void DinningTest() throws InterruptedException
	{
		
		Test=report.createTest("Dininng Table");
		log.info("Test Case 2  Excuted Started ");
		Test.info("Test Case 2  Excuted Started ");
		Thread.sleep(3000);
		DinningPage Dp=new DinningPage(driver);
		Dp.setDinningdrp();
		Dp.setdinningchair();
		 log.info("Successfully navigated to Dinning Chair");
		 Test.log(Status.PASS, "Successfully navigated to Dinning Chair");
		 Thread.sleep(3000);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 //js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		  js.executeScript("window.scrollBy(0,1000)");
		  HelperClass.captureScreenshots(driver);
		  Test.log(Status.PASS, "Taken a screenshot for evidence ");
		 log.info("Successfully excuted Test Cases 7 ");
		 Test.log(Status.PASS, "Testcase-7 successfully Excuted");
		 driver.get(baseURL);
		report.flush();
	
		
	
	}
    @Test(priority =  8)
    public void SearchTest() throws InterruptedException
	{
	
		Test=report.createTest("Seach Page ");
		log.info("Test Case 8  Excuted Started ");
		Test.info("Test Case 8  Excuted Started ");
		Test.log(Status.PASS, "Testcase-8  Excution Start");
		Thread.sleep(3000);
		SearchPage SP=new SearchPage(driver);
		SP.setsearchele();
		Test.log(Status.PASS, "Searching for Blanket in the search box");
		HelperClass.captureScreenshots(driver);
		Test.log(Status.PASS,"Taken a Screenshot the Page for evidence");
		System.out.println(driver.getTitle());
		Test.log(Status.PASS, "Testcase-8  successfully Excuted");
	     driver.navigate().back();
	     driver.get(baseURL);
	     report.flush();
	   
	}
    
    @Test(priority =  9)
    public void orderTest() throws InterruptedException
	{
		
		Test=report.createTest("Order Test ");
		Test=report.createTest("Order Test Case ");
		log.info("Test Case 9  Excuted Started ");
		Test.info("Test Case 9  Excuted Started ");
		Thread.sleep(3000);
		orderPage op=new orderPage(driver);
		op.setordPg();
		Thread.sleep(3000);
		op.setordp();
		Thread.sleep(3000);
		HelperClass.captureScreenshots(driver);
		log.info("Taken a screenshot");
		Test.info("Successfully navigated to Bulk Order Page");
		log.info("Successfully navigated to Bulk Order Page");
		Test.log(Status.PASS, "Successfully navigated to Bulk Order Page");
		driver.get(baseURL);
		report.flush();
		
		 
	}
    @Test(priority =  10)
	public void WishlistTest() throws InterruptedException
	{
		
		Test=report.createTest("Wish List ");
		log.info("Test Case 10  Excuted Started ");
        WishPage wp=new WishPage(driver);
         wp.wishlist();
        Thread.sleep(3000);
        Test.info("Successfully navigated to Wish list Page");
		log.info("Successfully navigated to wish list  Page");
		Test.log(Status.PASS, "Successfully navigated to Bulk Order Page");
        driver.navigate().back();
        driver.get(baseURL);
        report.flush();
      

}
}
