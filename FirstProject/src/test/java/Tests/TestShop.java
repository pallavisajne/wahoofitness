package Tests;

import static org.testng.Assert.*;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import PageObjects.HomePage;
import PageObjects.PlaceOrderPage;
import PageObjects.ShopCatagoryPage;
import Selenium_Framework.FirstProject.baseClass;


public class TestShop extends baseClass {
		public WebDriver driver;
		
			
		@BeforeTest
			public void loadPage() throws IOException
			{
				driver=initalizer();
			}
			@Test
			public void buyProducts() throws InterruptedException 
			{
				
			   driver.get("https://eu.wahoofitness.com/");
			   driver.manage().window().maximize();
			   
			   HomePage h =new HomePage(driver);
			   ShopCatagoryPage s= new ShopCatagoryPage(driver);
			   PlaceOrderPage po =new PlaceOrderPage(driver);
			   
			   for(int i=0;i<2;i++) {
			   h.getShopCatagoryBtn().click();
			   s.getProducts().click();
			   
			   if(driver.getPageSource().contains("This product is out of stock")) {
				   h.getShopCatagoryBtn().click();
				   s.getProducts().click(); 
			   }
			   else if(driver.getPageSource().contains("This product is out of stock")) {
				   h.getShopCatagoryBtn().click();
				   s.getProducts().click(); 
			   }
			 //  else if(s.getColourLabel().isDisplayed()){
			   else if(driver.getPageSource().contains("Color")) {
			     Select col = new Select(s.getColour());
			      col.selectByIndex(1);
			   }
			   else { 
				   
			   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			   wait.until(ExpectedConditions.elementToBeClickable(s.getAddToCartBtn()));
			   s.getAddToCartBtn().click();
			   assertEquals(s.getProductName().getText(),s.getAddedProductName().getText());
			   wait.until(ExpectedConditions.elementToBeClickable(s.getCloseSideBarBtn()));
			   s.getCloseSideBarBtn().click();
			   }
			}
			   WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
			   wait1.until(ExpectedConditions.elementToBeClickable(s.getCartIcon()));
			   s.getCartIcon().click();
			   s.getRemoveProduct().click();
			   String actualMsg=s.getRemoveProductMsg().getText();
			   String expectedMsg="Item was removed successfully";
			   assertEquals(actualMsg,expectedMsg);
			   wait1.until(ExpectedConditions.alertIsPresent());
			   driver.switchTo().alert().accept();
			    
			   JavascriptExecutor js = (JavascriptExecutor) driver;
			   js.executeScript("window.scrollBy(0,250)", "");
			    
			    WebElement priceBefore=s.getSubtotalPrice();
			    s.getViewEditcart().click();
			    s.getProductQuantity().clear();
			    s.getProductQuantity().sendKeys("3");
			    s.getUpdateCartBtn().click();
			    assertNotEquals(s.getSubtotalPrice().getText(),priceBefore.getText());
			    s.checkoutBtn.click();
			    s.getPlaceOrderBtn().click();
			    assertEquals(po.getEmptyFieldErrMsg().getText(),"This is a required field");
			    s.getExpressShipBtn().click();
			    
			    po.getEmail().sendKeys("someone@wpoocares.com");
			    po.getfName().sendKeys("Test");
			    po.getlName().sendKeys("Tester");
			    po.getAddress().sendKeys("Comandante Izarduy 67, Barcelona  08940");
			    po.getPhoneNumber().sendKeys("5555555555");
			    po.getCreditCard().sendKeys("41111111111111110824111");
			    s.getPlaceOrderBtn().click();
			    assertEquals(po.getErrMsg().getText(),"Payment is declined");
			}
			@AfterTest
			public void closePage() {
				driver.quit();
			}
	}



