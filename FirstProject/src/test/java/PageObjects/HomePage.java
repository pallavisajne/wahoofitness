package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	By signIn = By.className("login");
	
	@FindBy(xpath = "//span[contains(text(),'SHOP')]")
	public WebElement shopCatagoryBtn;
	
	
	
public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	PageFactory.initElements(driver, this);
	}

public WebElement getShopCatagoryBtn(){
	return shopCatagoryBtn;
}
}