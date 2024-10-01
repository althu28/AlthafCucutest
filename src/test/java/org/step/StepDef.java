package org.step;

import java.awt.AWTException;
import java.util.Set;

import org.base.BaseClass;
import org.pojopackage.AmazonPojo;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef extends BaseClass {
	
	public static AmazonPojo am;
	
	@When("User have to enter the product name and click the enter")
	public void user_have_to_enter_the_product_name_and_click_the_enter() throws AWTException {
		
		am=new AmazonPojo();
		acSendkeys(am.getSearchBar(),"iphone");
		
		robEnter();
	    
	}

	@When("user have to click the product and switch to next window")
	public void user_have_to_click_the_product_and_switch_to_next_window() {
		
		acMove(am.getFirstProduct());
		acClick(am.getFirstProduct());
		
		String parentId = driver.getWindowHandle();
		
		Set<String> allIds = driver.getWindowHandles();
		
		for (String stringId : allIds) {
			
			if (!stringId.equals(parentId)) {
				
				System.out.println(driver.switchTo().window(stringId));
				
			}
			
		}
	    
	}

	@Then("user have to get the product name and take screenshots")
	public void user_have_to_get_the_product_name_and_take_screenshots() {
		
		getText("Text", am.getProductName());
	    
	}

}
