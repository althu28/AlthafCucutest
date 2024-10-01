package org.pojopackage;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPojo extends BaseClass {
	
	public AmazonPojo() {
		
		PageFactory.initElements(driver, this); 
		
	}
	
	@FindBy(xpath = "//input[@id=\"twotabsearchtextbox\"]")
	public WebElement searchBar;
	
	@FindBy(xpath = "(//img[@class=\"s-image\"])[1]")
	public WebElement firstProduct;
	
	@FindBy(xpath = "//span[@id=\"productTitle\"]")
	public WebElement productName;

	public WebElement getSearchBar() {
		return searchBar;
	}

	public WebElement getFirstProduct() {
		return firstProduct;
	}

	public WebElement getProductName() {
		return productName;
	}
	
	

}
