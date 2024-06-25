package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage {

	// constructor
	public ShoppingCartPage(WebDriver driver) {
		super(driver);
	}

	// Elements
	@FindBy(xpath = "//div[@id='cart']")
	WebElement btnItems;

	@FindBy(xpath = "//strong[normalize-space()='View Cart']")
	WebElement lnkViewCart;

	@FindBy(xpath = "//*[@id='content']/div[2]/div/table//strong[text()='Total:']//following::td")
	WebElement lblTotalPrice; // $246.40

	@FindBy(xpath = "//a[text()='Checkout']")
	WebElement btnCheckout;

	// Actions
	public void clickItemsToNavigateToCart() {
		btnItems.click();
	}

	public void clickViewCart() {
		lnkViewCart.click();
	}

	public String getTotalPrice() {
		return lblTotalPrice.getText();
	}

	public void clickOnCheckout() {
		btnCheckout.click();
	}

}
