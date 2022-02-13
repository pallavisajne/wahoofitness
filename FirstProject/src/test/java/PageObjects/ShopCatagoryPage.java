package PageObjects;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ShopCatagoryPage {
	public ShopCatagoryPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//p[@class='product-name']")
	public List<WebElement> allProducts;  ;
	
	@FindBy(xpath = "//span[contains(text(),'Color')]")
	public WebElement colourLabel;
	
	@FindBy(xpath = "//select[@id='attribute92']")
	public WebElement colour;
	
	@FindBy(xpath = "//button[@id='product-addtocart-button']")
	public WebElement addToCartBtn;
	
	@FindBy(xpath = "//body/div[@id='product-view-wrapper']/div[1]/div[3]/form[1]/div[1]/div[1]/span[1]")
	public WebElement productName;
	
	@FindBy(xpath = "//a[contains(text(),)")
	public WebElement addedProduct;
	
	@FindBy(xpath = "//a[@id='btn-minicart-close']")
	public WebElement closeSideBarBtn;	
	
	@FindBy(xpath = "//i[@class='wf-cart']")
	public WebElement cartIcon;	
	
	@FindBy(xpath = "//span[contains(text(),'Remove')]")
	public WebElement removeProduct;	
	
	@FindBy(xpath = "//span[contains(text(),'Item was removed successfully')]")
	public WebElement removeProductMsg;	
	
	@FindBy(xpath = "//span[contains(text(),'View and Edit Cart')]")
	public WebElement viewEditCart;
	
	@FindBy(xpath = "//input[contains(@id,'cart']")
	public WebElement productQuantity;
	
	@FindBy(xpath = "//span[contains(text(),'Update Cart')]")
	public WebElement updateCartBtn;
	
	@FindBy(xpath = "//tbody/tr[1]/td[1]/span[1]")
	public WebElement subTotalPrice;
	
	@FindBy(xpath = "//body/div[4]/div[1]/main[1]/div[3]/div[1]/div[4]/div[1]/ul[1]/li[1]/button[1]")
	public WebElement checkoutBtn;
	
	@FindBy(xpath = "//button[@class='action primary checkout amasty']")
	public WebElement placeOrder;
	
	@FindBy(xpath = "//input[@id='s_method_amstrates_amstrates22']")
	public WebElement expressShipBtn;
	
	public WebElement getProducts(){
		Random rand = new Random();
		int sz= allProducts.size();
	    WebElement randomElement = allProducts.get(rand.nextInt(sz));
	     return randomElement;
	}
	public WebElement getColourLabel() {
		return colourLabel;
	}
	public WebElement getColour() {
		return colour;
	}
	public WebElement getAddToCartBtn() {
		return addToCartBtn ;
	}
	public WebElement getProductName() {
		return productName ;
	}
	public WebElement getAddedProductName() {
		return addedProduct ;
	}
	public WebElement getCloseSideBarBtn() {
		return closeSideBarBtn ;
	}
	public WebElement getCartIcon() {
		return cartIcon ;
	}
	public WebElement getRemoveProduct() {
		return removeProduct ;
	}
	public WebElement getRemoveProductMsg() {
		return removeProductMsg ;
	}
	public WebElement getViewEditcart() {
		return viewEditCart ;
	}
	public WebElement getProductQuantity() {
		return productQuantity ;
	}
	public WebElement getUpdateCartBtn() {
		return updateCartBtn ;
	}
	public WebElement getSubtotalPrice() {
		return subTotalPrice ;
	}
	public WebElement getCheckoutBtn() {
		return checkoutBtn ;
	}
	public WebElement getPlaceOrderBtn() {
		return placeOrder ;
	}
	public WebElement getExpressShipBtn() {
		return expressShipBtn ;
	}
}
