package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrderPage {
	public PlaceOrderPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//body/div[5]/div[1]/main[1]/div[1]/div[1]/div[3]/div[4]/div[1]/div[1]/li[1]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/input[1]")
	public WebElement email;
	
	@FindBy(xpath = "//input[@id='O5SPNEO']")
	public WebElement fName;
	
	@FindBy(xpath = "//input[@id='RC6OCAN']")
	public WebElement lName;
	
	@FindBy(xpath = "//input[@id='TSLLJAE']")
	public WebElement address;
	
	@FindBy(xpath = "//input[@id='HY9VNLR']")
	public WebElement city;
	
	@FindBy(xpath = "//input[@id='FU14DRG']")
	public WebElement PhoneNumber;
	
	@FindBy(xpath = "/html[1]/body[1]")
	public WebElement cardNumber;
	
	@FindBy(xpath = "//input[@id='HY9VNLR']")
	public WebElement errMsg;
	
	@FindBy(xpath = "//span[contains(text(),'This is a required field.')")
	public WebElement emptyFieldErrMsg;
	
	public WebElement getEmail() {
		return email ;
	}
	public WebElement getfName() {
		return fName ;
	}
	public WebElement getlName() {
		return lName ;
	}
	public WebElement getAddress() {
		return address ;
	}
	public WebElement getPhoneNumber() {
		return PhoneNumber ;
	}
	public WebElement getCreditCard() {
		return cardNumber ;
	}	
	public WebElement getErrMsg() {
		return errMsg ;
}
	public WebElement getEmptyFieldErrMsg() {
		return emptyFieldErrMsg ;
}
	
}
